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

    public FourierTransform(int i10, float f9) {
        this.timeSize = i10;
        int i11 = (int) f9;
        this.sampleRate = i11;
        this.bandWidth = (i11 / 2.0f) * (2.0f / i10);
        noAverages();
        allocateArrays();
    }

    public abstract void allocateArrays();

    public float calcAvg(float f9, float f10) {
        int freqToIndex = freqToIndex(f9);
        int freqToIndex2 = freqToIndex(f10);
        float f11 = 0.0f;
        for (int i10 = freqToIndex; i10 <= freqToIndex2; i10++) {
            f11 += this.spectrum[i10];
        }
        return f11 / ((freqToIndex2 - freqToIndex) + 1);
    }

    public void fillSpectrum() {
        float[] fArr;
        float pow;
        int i10 = 0;
        while (true) {
            fArr = this.spectrum;
            if (i10 >= fArr.length) {
                break;
            }
            float f9 = this.real[i10];
            float f10 = this.imag[i10];
            fArr[i10] = (float) Math.sqrt((f10 * f10) + (f9 * f9));
            i10++;
        }
        int i11 = this.whichAverage;
        if (i11 == 1) {
            int length = fArr.length / this.averages.length;
            for (int i12 = 0; i12 < this.averages.length; i12++) {
                int i13 = 0;
                float f11 = 0.0f;
                while (i13 < length) {
                    int i14 = (i12 * length) + i13;
                    float[] fArr2 = this.spectrum;
                    if (i14 < fArr2.length) {
                        f11 += fArr2[i14];
                        i13++;
                    }
                }
                this.averages[i12] = f11 / (i13 + 1);
            }
        } else if (i11 == 2) {
            int i15 = 0;
            while (true) {
                int i16 = this.octaves;
                if (i15 < i16) {
                    if (i15 == 0) {
                        pow = 0.0f;
                    } else {
                        pow = (this.sampleRate / 2) / ((float) Math.pow(2.0d, i16 - i15));
                    }
                    float pow2 = (((this.sampleRate / 2) / ((float) Math.pow(2.0d, (this.octaves - i15) - 1))) - pow) / this.avgPerOctave;
                    int i17 = 0;
                    while (true) {
                        int i18 = this.avgPerOctave;
                        if (i17 < i18) {
                            float f12 = pow + pow2;
                            this.averages[(i18 * i15) + i17] = calcAvg(pow, f12);
                            i17++;
                            pow = f12;
                        }
                    }
                    i15++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void forward(float[] fArr);

    public void forward(float[] fArr, int i10) {
        int length = fArr.length - i10;
        int i11 = this.timeSize;
        if (length < i11) {
            return;
        }
        float[] fArr2 = new float[i11];
        System.arraycopy(fArr, i10, fArr2, 0, i11);
        forward(fArr2);
    }

    public int freqToIndex(float f9) {
        if (f9 < getBandWidth() / 2.0f) {
            return 0;
        }
        if (f9 > (this.sampleRate / 2) - (getBandWidth() / 2.0f)) {
            return this.spectrum.length - 1;
        }
        return Math.round(this.timeSize * (f9 / this.sampleRate));
    }

    public float getBand(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        float[] fArr = this.spectrum;
        if (i10 > fArr.length - 1) {
            i10 = fArr.length - 1;
        }
        return fArr[i10];
    }

    public float getBandWidth() {
        return this.bandWidth;
    }

    public float[] getSpectrumImaginary() {
        return this.imag;
    }

    public float[] getSpectrumReal() {
        return this.real;
    }

    public float indexToFreq(int i10) {
        float bandWidth = getBandWidth();
        if (i10 == 0) {
            return bandWidth * 0.25f;
        }
        if (i10 == this.spectrum.length - 1) {
            return (bandWidth * 0.25f) + ((this.sampleRate / 2) - (bandWidth / 2.0f));
        }
        return i10 * bandWidth;
    }

    public abstract void inverse(float[] fArr);

    public void inverse(float[] fArr, float[] fArr2, float[] fArr3) {
        setComplex(fArr, fArr2);
        inverse(fArr3);
    }

    public void linAverages(int i10) {
        if (i10 > this.spectrum.length / 2) {
            return;
        }
        this.averages = new float[i10];
        this.whichAverage = 1;
    }

    public void logAverages(int i10, int i11) {
        float f9 = this.sampleRate / 2.0f;
        this.octaves = 1;
        while (true) {
            f9 /= 2.0f;
            if (f9 > i10) {
                this.octaves++;
            } else {
                this.avgPerOctave = i11;
                this.averages = new float[this.octaves * i11];
                this.whichAverage = 2;
                return;
            }
        }
    }

    public void noAverages() {
        this.averages = new float[0];
        this.whichAverage = 3;
    }

    public abstract void scaleBand(int i10, float f9);

    public abstract void setBand(int i10, float f9);

    public void setComplex(float[] fArr, float[] fArr2) {
        float[] fArr3 = this.real;
        if (fArr3.length != fArr.length && this.imag.length != fArr2.length) {
            return;
        }
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, this.imag, 0, fArr2.length);
    }

    public int specSize() {
        return this.spectrum.length;
    }

    public int timeSize() {
        return this.timeSize;
    }

    public static class FFT extends FourierTransform {
        private float[] coslookup;
        private int[] reverse;
        private float[] sinlookup;

        public FFT(int i10, float f9) {
            super(i10, f9);
            if ((i10 & (i10 - 1)) == 0) {
                buildReverseTable();
                buildTrigTables();
                return;
            }
            throw new IllegalArgumentException("FFT: timeSize must be a power of two.");
        }

        private void bitReverseComplex() {
            float[] fArr = new float[this.real.length];
            float[] fArr2 = new float[this.imag.length];
            int i10 = 0;
            while (true) {
                float[] fArr3 = this.real;
                if (i10 < fArr3.length) {
                    int i11 = this.reverse[i10];
                    fArr[i10] = fArr3[i11];
                    fArr2[i10] = this.imag[i11];
                    i10++;
                } else {
                    this.real = fArr;
                    this.imag = fArr2;
                    return;
                }
            }
        }

        private void bitReverseSamples(float[] fArr, int i10) {
            for (int i11 = 0; i11 < this.timeSize; i11++) {
                this.real[i11] = fArr[this.reverse[i11] + i10];
                this.imag[i11] = 0.0f;
            }
        }

        private void buildReverseTable() {
            int i10 = this.timeSize;
            int[] iArr = new int[i10];
            this.reverse = iArr;
            iArr[0] = 0;
            int i11 = i10 / 2;
            int i12 = 1;
            while (i12 < i10) {
                for (int i13 = 0; i13 < i12; i13++) {
                    int[] iArr2 = this.reverse;
                    iArr2[i13 + i12] = iArr2[i13] + i11;
                }
                i12 <<= 1;
                i11 >>= 1;
            }
        }

        private void buildTrigTables() {
            int i10 = this.timeSize;
            this.sinlookup = new float[i10];
            this.coslookup = new float[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                double d = (-3.1415927f) / i11;
                this.sinlookup[i11] = (float) Math.sin(d);
                this.coslookup[i11] = (float) Math.cos(d);
            }
        }

        private float cos(int i10) {
            return this.coslookup[i10];
        }

        private void fft() {
            for (int i10 = 1; i10 < this.real.length; i10 *= 2) {
                float cos = cos(i10);
                float sin = sin(i10);
                float f9 = 1.0f;
                float f10 = 0.0f;
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i11;
                    while (true) {
                        float[] fArr = this.real;
                        if (i12 < fArr.length) {
                            int i13 = i12 + i10;
                            float f11 = fArr[i13];
                            float[] fArr2 = this.imag;
                            float f12 = fArr2[i13];
                            float f13 = (f9 * f11) - (f10 * f12);
                            float f14 = (f11 * f10) + (f12 * f9);
                            fArr[i13] = fArr[i12] - f13;
                            fArr2[i13] = fArr2[i12] - f14;
                            fArr[i12] = fArr[i12] + f13;
                            fArr2[i12] = fArr2[i12] + f14;
                            i12 += i10 * 2;
                        }
                    }
                    f10 = (f10 * cos) + (f9 * sin);
                    i11++;
                    f9 = (f9 * cos) - (f10 * sin);
                }
            }
        }

        private float sin(int i10) {
            return this.sinlookup[i10];
        }

        @Override
        public void allocateArrays() {
            int i10 = this.timeSize;
            this.spectrum = new float[(i10 / 2) + 1];
            this.real = new float[i10];
            this.imag = new float[i10];
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
        public void inverse(float[] fArr) {
            if (fArr.length <= this.real.length) {
                for (int i10 = 0; i10 < this.timeSize; i10++) {
                    float[] fArr2 = this.imag;
                    fArr2[i10] = fArr2[i10] * (-1.0f);
                }
                bitReverseComplex();
                fft();
                for (int i11 = 0; i11 < fArr.length; i11++) {
                    float[] fArr3 = this.real;
                    fArr[i11] = fArr3[i11] / fArr3.length;
                }
            }
        }

        @Override
        public void scaleBand(int i10, float f9) {
            if (f9 >= 0.0f) {
                float[] fArr = this.real;
                fArr[i10] = fArr[i10] * f9;
                float[] fArr2 = this.imag;
                fArr2[i10] = fArr2[i10] * f9;
                float[] fArr3 = this.spectrum;
                fArr3[i10] = fArr3[i10] * f9;
                if (i10 != 0) {
                    int i11 = this.timeSize;
                    if (i10 != i11 / 2) {
                        fArr[i11 - i10] = fArr[i10];
                        fArr2[i11 - i10] = -fArr2[i10];
                    }
                }
            }
        }

        @Override
        public void setBand(int i10, float f9) {
            if (f9 >= 0.0f) {
                float[] fArr = this.real;
                float f10 = fArr[i10];
                if (f10 == 0.0f && this.imag[i10] == 0.0f) {
                    fArr[i10] = f9;
                    this.spectrum[i10] = f9;
                } else {
                    float[] fArr2 = this.spectrum;
                    fArr[i10] = f10 / fArr2[i10];
                    float[] fArr3 = this.imag;
                    fArr3[i10] = fArr3[i10] / fArr2[i10];
                    fArr2[i10] = f9;
                    fArr[i10] = fArr[i10] * f9;
                    fArr3[i10] = fArr3[i10] * fArr2[i10];
                }
                if (i10 != 0) {
                    int i11 = this.timeSize;
                    if (i10 != i11 / 2) {
                        fArr[i11 - i10] = fArr[i10];
                        float[] fArr4 = this.imag;
                        fArr4[i11 - i10] = -fArr4[i10];
                    }
                }
            }
        }

        @Override
        public void forward(float[] fArr, int i10) {
            if (fArr.length - i10 < this.timeSize) {
                return;
            }
            bitReverseSamples(fArr, i10);
            fft();
            fillSpectrum();
        }

        public void forward(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int i10 = this.timeSize;
            if (length == i10 && fArr2.length == i10) {
                setComplex(fArr, fArr2);
                bitReverseComplex();
                fft();
                fillSpectrum();
            }
        }
    }
}
