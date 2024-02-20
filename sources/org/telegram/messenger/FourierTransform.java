package org.telegram.messenger;
public abstract class FourierTransform {
    protected static final int LINAVG = 1;
    protected static final int LOGAVG = 2;
    protected static final int NOAVG = 3;
    protected static final float TWO_PI = 6.2831855f;
    protected float[] averages;
    protected int avgPerOctave;
    protected float bandWidth;
    protected float[] imag;
    protected int octaves;
    protected float[] real;
    protected int sampleRate;
    protected float[] spectrum;
    protected int timeSize;
    protected int whichAverage;

    protected abstract void allocateArrays();

    public abstract void forward(float[] fArr);

    public abstract void inverse(float[] fArr);

    public abstract void scaleBand(int i, float f);

    public abstract void setBand(int i, float f);

    FourierTransform(int i, float f) {
        this.timeSize = i;
        int i2 = (int) f;
        this.sampleRate = i2;
        this.bandWidth = (2.0f / i) * (i2 / 2.0f);
        noAverages();
        allocateArrays();
    }

    protected void setComplex(float[] fArr, float[] fArr2) {
        float[] fArr3 = this.real;
        if (fArr3.length == fArr.length || this.imag.length == fArr2.length) {
            System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
            System.arraycopy(fArr2, 0, this.imag, 0, fArr2.length);
        }
    }

    protected void fillSpectrum() {
        float[] fArr;
        int i = 0;
        while (true) {
            fArr = this.spectrum;
            if (i >= fArr.length) {
                break;
            }
            float[] fArr2 = this.real;
            float f = fArr2[i] * fArr2[i];
            float[] fArr3 = this.imag;
            fArr[i] = (float) Math.sqrt(f + (fArr3[i] * fArr3[i]));
            i++;
        }
        int i2 = this.whichAverage;
        if (i2 == 1) {
            int length = fArr.length / this.averages.length;
            for (int i3 = 0; i3 < this.averages.length; i3++) {
                int i4 = 0;
                float f2 = 0.0f;
                while (i4 < length) {
                    int i5 = (i3 * length) + i4;
                    float[] fArr4 = this.spectrum;
                    if (i5 < fArr4.length) {
                        f2 += fArr4[i5];
                        i4++;
                    }
                }
                this.averages[i3] = f2 / (i4 + 1);
            }
        } else if (i2 == 2) {
            int i6 = 0;
            while (true) {
                int i7 = this.octaves;
                if (i6 >= i7) {
                    return;
                }
                float pow = i6 == 0 ? 0.0f : (this.sampleRate / 2) / ((float) Math.pow(2.0d, i7 - i6));
                float pow2 = (((this.sampleRate / 2) / ((float) Math.pow(2.0d, (this.octaves - i6) - 1))) - pow) / this.avgPerOctave;
                int i8 = 0;
                while (true) {
                    int i9 = this.avgPerOctave;
                    if (i8 < i9) {
                        float f3 = pow + pow2;
                        this.averages[(i9 * i6) + i8] = calcAvg(pow, f3);
                        i8++;
                        pow = f3;
                    }
                }
                i6++;
            }
        }
    }

    public void noAverages() {
        this.averages = new float[0];
        this.whichAverage = 3;
    }

    public void linAverages(int i) {
        if (i > this.spectrum.length / 2) {
            return;
        }
        this.averages = new float[i];
        this.whichAverage = 1;
    }

    public void logAverages(int i, int i2) {
        float f = this.sampleRate / 2.0f;
        this.octaves = 1;
        while (true) {
            f /= 2.0f;
            if (f > i) {
                this.octaves++;
            } else {
                this.avgPerOctave = i2;
                this.averages = new float[this.octaves * i2];
                this.whichAverage = 2;
                return;
            }
        }
    }

    public int timeSize() {
        return this.timeSize;
    }

    public int specSize() {
        return this.spectrum.length;
    }

    public float getBand(int i) {
        if (i < 0) {
            i = 0;
        }
        float[] fArr = this.spectrum;
        if (i > fArr.length - 1) {
            i = fArr.length - 1;
        }
        return fArr[i];
    }

    public float getBandWidth() {
        return this.bandWidth;
    }

    public int freqToIndex(float f) {
        if (f < getBandWidth() / 2.0f) {
            return 0;
        }
        if (f > (this.sampleRate / 2) - (getBandWidth() / 2.0f)) {
            return this.spectrum.length - 1;
        }
        return Math.round(this.timeSize * (f / this.sampleRate));
    }

    public float indexToFreq(int i) {
        float bandWidth = getBandWidth();
        return i == 0 ? bandWidth * 0.25f : i == this.spectrum.length + (-1) ? ((this.sampleRate / 2) - (bandWidth / 2.0f)) + (bandWidth * 0.25f) : i * bandWidth;
    }

    public float calcAvg(float f, float f2) {
        int freqToIndex = freqToIndex(f);
        int freqToIndex2 = freqToIndex(f2);
        float f3 = 0.0f;
        for (int i = freqToIndex; i <= freqToIndex2; i++) {
            f3 += this.spectrum[i];
        }
        return f3 / ((freqToIndex2 - freqToIndex) + 1);
    }

    public float[] getSpectrumReal() {
        return this.real;
    }

    public float[] getSpectrumImaginary() {
        return this.imag;
    }

    public void forward(float[] fArr, int i) {
        int length = fArr.length - i;
        int i2 = this.timeSize;
        if (length < i2) {
            return;
        }
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, i, fArr2, 0, i2);
        forward(fArr2);
    }

    public void inverse(float[] fArr, float[] fArr2, float[] fArr3) {
        setComplex(fArr, fArr2);
        inverse(fArr3);
    }

    public static class FFT extends FourierTransform {
        private float[] coslookup;
        private int[] reverse;
        private float[] sinlookup;

        public FFT(int i, float f) {
            super(i, f);
            if ((i & (i - 1)) != 0) {
                throw new IllegalArgumentException("FFT: timeSize must be a power of two.");
            }
            buildReverseTable();
            buildTrigTables();
        }

        @Override
        protected void allocateArrays() {
            int i = this.timeSize;
            this.spectrum = new float[(i / 2) + 1];
            this.real = new float[i];
            this.imag = new float[i];
        }

        @Override
        public void scaleBand(int i, float f) {
            if (f < 0.0f) {
                return;
            }
            float[] fArr = this.real;
            fArr[i] = fArr[i] * f;
            float[] fArr2 = this.imag;
            fArr2[i] = fArr2[i] * f;
            float[] fArr3 = this.spectrum;
            fArr3[i] = fArr3[i] * f;
            if (i != 0) {
                int i2 = this.timeSize;
                if (i != i2 / 2) {
                    fArr[i2 - i] = fArr[i];
                    fArr2[i2 - i] = -fArr2[i];
                }
            }
        }

        @Override
        public void setBand(int i, float f) {
            if (f < 0.0f) {
                return;
            }
            float[] fArr = this.real;
            if (fArr[i] == 0.0f && this.imag[i] == 0.0f) {
                fArr[i] = f;
                this.spectrum[i] = f;
            } else {
                float f2 = fArr[i];
                float[] fArr2 = this.spectrum;
                fArr[i] = f2 / fArr2[i];
                float[] fArr3 = this.imag;
                fArr3[i] = fArr3[i] / fArr2[i];
                fArr2[i] = f;
                fArr[i] = fArr[i] * fArr2[i];
                fArr3[i] = fArr3[i] * fArr2[i];
            }
            if (i != 0) {
                int i2 = this.timeSize;
                if (i != i2 / 2) {
                    fArr[i2 - i] = fArr[i];
                    float[] fArr4 = this.imag;
                    fArr4[i2 - i] = -fArr4[i];
                }
            }
        }

        private void fft() {
            for (int i = 1; i < this.real.length; i *= 2) {
                float cos = cos(i);
                float sin = sin(i);
                float f = 1.0f;
                float f2 = 0.0f;
                int i2 = 0;
                while (i2 < i) {
                    int i3 = i2;
                    while (true) {
                        float[] fArr = this.real;
                        if (i3 < fArr.length) {
                            int i4 = i3 + i;
                            float[] fArr2 = this.imag;
                            float f3 = (fArr[i4] * f) - (fArr2[i4] * f2);
                            float f4 = (fArr2[i4] * f) + (fArr[i4] * f2);
                            fArr[i4] = fArr[i3] - f3;
                            fArr2[i4] = fArr2[i3] - f4;
                            fArr[i3] = fArr[i3] + f3;
                            fArr2[i3] = fArr2[i3] + f4;
                            i3 += i * 2;
                        }
                    }
                    f2 = (f2 * cos) + (f * sin);
                    i2++;
                    f = (f * cos) - (f2 * sin);
                }
            }
        }

        @Override
        public void forward(float[] fArr) {
            if (fArr.length != this.timeSize) {
                return;
            }
            bitReverseSamples(fArr, 0);
            fft();
            fillSpectrum();
        }

        @Override
        public void forward(float[] fArr, int i) {
            if (fArr.length - i < this.timeSize) {
                return;
            }
            bitReverseSamples(fArr, i);
            fft();
            fillSpectrum();
        }

        public void forward(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int i = this.timeSize;
            if (length == i && fArr2.length == i) {
                setComplex(fArr, fArr2);
                bitReverseComplex();
                fft();
                fillSpectrum();
            }
        }

        @Override
        public void inverse(float[] fArr) {
            if (fArr.length > this.real.length) {
                return;
            }
            for (int i = 0; i < this.timeSize; i++) {
                float[] fArr2 = this.imag;
                fArr2[i] = fArr2[i] * (-1.0f);
            }
            bitReverseComplex();
            fft();
            for (int i2 = 0; i2 < fArr.length; i2++) {
                float[] fArr3 = this.real;
                fArr[i2] = fArr3[i2] / fArr3.length;
            }
        }

        private void buildReverseTable() {
            int i = this.timeSize;
            int[] iArr = new int[i];
            this.reverse = iArr;
            iArr[0] = 0;
            int i2 = i / 2;
            int i3 = 1;
            while (i3 < i) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int[] iArr2 = this.reverse;
                    iArr2[i4 + i3] = iArr2[i4] + i2;
                }
                i3 <<= 1;
                i2 >>= 1;
            }
        }

        private void bitReverseSamples(float[] fArr, int i) {
            for (int i2 = 0; i2 < this.timeSize; i2++) {
                this.real[i2] = fArr[this.reverse[i2] + i];
                this.imag[i2] = 0.0f;
            }
        }

        private void bitReverseComplex() {
            float[] fArr = new float[this.real.length];
            float[] fArr2 = new float[this.imag.length];
            int i = 0;
            while (true) {
                float[] fArr3 = this.real;
                if (i < fArr3.length) {
                    int[] iArr = this.reverse;
                    fArr[i] = fArr3[iArr[i]];
                    fArr2[i] = this.imag[iArr[i]];
                    i++;
                } else {
                    this.real = fArr;
                    this.imag = fArr2;
                    return;
                }
            }
        }

        private float sin(int i) {
            return this.sinlookup[i];
        }

        private float cos(int i) {
            return this.coslookup[i];
        }

        private void buildTrigTables() {
            int i = this.timeSize;
            this.sinlookup = new float[i];
            this.coslookup = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                double d = (-3.1415927f) / i2;
                this.sinlookup[i2] = (float) Math.sin(d);
                this.coslookup[i2] = (float) Math.cos(d);
            }
        }
    }
}
