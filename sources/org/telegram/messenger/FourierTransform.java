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

    public FourierTransform(int i9, float f10) {
        this.timeSize = i9;
        int i10 = (int) f10;
        this.sampleRate = i10;
        this.bandWidth = (i10 / 2.0f) * (2.0f / i9);
        noAverages();
        allocateArrays();
    }

    public abstract void allocateArrays();

    public float calcAvg(float f10, float f11) {
        int freqToIndex = freqToIndex(f10);
        int freqToIndex2 = freqToIndex(f11);
        float f12 = 0.0f;
        for (int i9 = freqToIndex; i9 <= freqToIndex2; i9++) {
            f12 += this.spectrum[i9];
        }
        return f12 / ((freqToIndex2 - freqToIndex) + 1);
    }

    public void fillSpectrum() {
        float[] fArr;
        float pow;
        int i9 = 0;
        while (true) {
            fArr = this.spectrum;
            if (i9 >= fArr.length) {
                break;
            }
            float f10 = this.real[i9];
            float f11 = this.imag[i9];
            fArr[i9] = (float) Math.sqrt((f11 * f11) + (f10 * f10));
            i9++;
        }
        int i10 = this.whichAverage;
        if (i10 == 1) {
            int length = fArr.length / this.averages.length;
            for (int i11 = 0; i11 < this.averages.length; i11++) {
                int i12 = 0;
                float f12 = 0.0f;
                while (i12 < length) {
                    int i13 = (i11 * length) + i12;
                    float[] fArr2 = this.spectrum;
                    if (i13 < fArr2.length) {
                        f12 += fArr2[i13];
                        i12++;
                    }
                }
                this.averages[i11] = f12 / (i12 + 1);
            }
        } else if (i10 == 2) {
            int i14 = 0;
            while (true) {
                int i15 = this.octaves;
                if (i14 < i15) {
                    if (i14 == 0) {
                        pow = 0.0f;
                    } else {
                        pow = (this.sampleRate / 2) / ((float) Math.pow(2.0d, i15 - i14));
                    }
                    float pow2 = (((this.sampleRate / 2) / ((float) Math.pow(2.0d, (this.octaves - i14) - 1))) - pow) / this.avgPerOctave;
                    int i16 = 0;
                    while (true) {
                        int i17 = this.avgPerOctave;
                        if (i16 < i17) {
                            float f13 = pow + pow2;
                            this.averages[(i17 * i14) + i16] = calcAvg(pow, f13);
                            i16++;
                            pow = f13;
                        }
                    }
                    i14++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void forward(float[] fArr);

    public void forward(float[] fArr, int i9) {
        int length = fArr.length - i9;
        int i10 = this.timeSize;
        if (length < i10) {
            return;
        }
        float[] fArr2 = new float[i10];
        System.arraycopy(fArr, i9, fArr2, 0, i10);
        forward(fArr2);
    }

    public int freqToIndex(float f10) {
        if (f10 < getBandWidth() / 2.0f) {
            return 0;
        }
        if (f10 > (this.sampleRate / 2) - (getBandWidth() / 2.0f)) {
            return this.spectrum.length - 1;
        }
        return Math.round(this.timeSize * (f10 / this.sampleRate));
    }

    public float getBand(int i9) {
        if (i9 < 0) {
            i9 = 0;
        }
        float[] fArr = this.spectrum;
        if (i9 > fArr.length - 1) {
            i9 = fArr.length - 1;
        }
        return fArr[i9];
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

    public float indexToFreq(int i9) {
        float bandWidth = getBandWidth();
        if (i9 == 0) {
            return bandWidth * 0.25f;
        }
        if (i9 == this.spectrum.length - 1) {
            return (bandWidth * 0.25f) + ((this.sampleRate / 2) - (bandWidth / 2.0f));
        }
        return i9 * bandWidth;
    }

    public abstract void inverse(float[] fArr);

    public void inverse(float[] fArr, float[] fArr2, float[] fArr3) {
        setComplex(fArr, fArr2);
        inverse(fArr3);
    }

    public void linAverages(int i9) {
        if (i9 > this.spectrum.length / 2) {
            return;
        }
        this.averages = new float[i9];
        this.whichAverage = 1;
    }

    public void logAverages(int i9, int i10) {
        float f10 = this.sampleRate / 2.0f;
        this.octaves = 1;
        while (true) {
            f10 /= 2.0f;
            if (f10 > i9) {
                this.octaves++;
            } else {
                this.avgPerOctave = i10;
                this.averages = new float[this.octaves * i10];
                this.whichAverage = 2;
                return;
            }
        }
    }

    public void noAverages() {
        this.averages = new float[0];
        this.whichAverage = 3;
    }

    public abstract void scaleBand(int i9, float f10);

    public abstract void setBand(int i9, float f10);

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

        public FFT(int i9, float f10) {
            super(i9, f10);
            if ((i9 & (i9 - 1)) == 0) {
                buildReverseTable();
                buildTrigTables();
                return;
            }
            throw new IllegalArgumentException("FFT: timeSize must be a power of two.");
        }

        private void bitReverseComplex() {
            float[] fArr = new float[this.real.length];
            float[] fArr2 = new float[this.imag.length];
            int i9 = 0;
            while (true) {
                float[] fArr3 = this.real;
                if (i9 < fArr3.length) {
                    int i10 = this.reverse[i9];
                    fArr[i9] = fArr3[i10];
                    fArr2[i9] = this.imag[i10];
                    i9++;
                } else {
                    this.real = fArr;
                    this.imag = fArr2;
                    return;
                }
            }
        }

        private void bitReverseSamples(float[] fArr, int i9) {
            for (int i10 = 0; i10 < this.timeSize; i10++) {
                this.real[i10] = fArr[this.reverse[i10] + i9];
                this.imag[i10] = 0.0f;
            }
        }

        private void buildReverseTable() {
            int i9 = this.timeSize;
            int[] iArr = new int[i9];
            this.reverse = iArr;
            iArr[0] = 0;
            int i10 = i9 / 2;
            int i11 = 1;
            while (i11 < i9) {
                for (int i12 = 0; i12 < i11; i12++) {
                    int[] iArr2 = this.reverse;
                    iArr2[i12 + i11] = iArr2[i12] + i10;
                }
                i11 <<= 1;
                i10 >>= 1;
            }
        }

        private void buildTrigTables() {
            int i9 = this.timeSize;
            this.sinlookup = new float[i9];
            this.coslookup = new float[i9];
            for (int i10 = 0; i10 < i9; i10++) {
                double d = (-3.1415927f) / i10;
                this.sinlookup[i10] = (float) Math.sin(d);
                this.coslookup[i10] = (float) Math.cos(d);
            }
        }

        private float cos(int i9) {
            return this.coslookup[i9];
        }

        private void fft() {
            for (int i9 = 1; i9 < this.real.length; i9 *= 2) {
                float cos = cos(i9);
                float sin = sin(i9);
                float f10 = 1.0f;
                float f11 = 0.0f;
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i10;
                    while (true) {
                        float[] fArr = this.real;
                        if (i11 < fArr.length) {
                            int i12 = i11 + i9;
                            float f12 = fArr[i12];
                            float[] fArr2 = this.imag;
                            float f13 = fArr2[i12];
                            float f14 = (f10 * f12) - (f11 * f13);
                            float f15 = (f12 * f11) + (f13 * f10);
                            fArr[i12] = fArr[i11] - f14;
                            fArr2[i12] = fArr2[i11] - f15;
                            fArr[i11] = fArr[i11] + f14;
                            fArr2[i11] = fArr2[i11] + f15;
                            i11 += i9 * 2;
                        }
                    }
                    f11 = (f11 * cos) + (f10 * sin);
                    i10++;
                    f10 = (f10 * cos) - (f11 * sin);
                }
            }
        }

        private float sin(int i9) {
            return this.sinlookup[i9];
        }

        @Override
        public void allocateArrays() {
            int i9 = this.timeSize;
            this.spectrum = new float[(i9 / 2) + 1];
            this.real = new float[i9];
            this.imag = new float[i9];
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
                for (int i9 = 0; i9 < this.timeSize; i9++) {
                    float[] fArr2 = this.imag;
                    fArr2[i9] = fArr2[i9] * (-1.0f);
                }
                bitReverseComplex();
                fft();
                for (int i10 = 0; i10 < fArr.length; i10++) {
                    float[] fArr3 = this.real;
                    fArr[i10] = fArr3[i10] / fArr3.length;
                }
            }
        }

        @Override
        public void scaleBand(int i9, float f10) {
            if (f10 >= 0.0f) {
                float[] fArr = this.real;
                fArr[i9] = fArr[i9] * f10;
                float[] fArr2 = this.imag;
                fArr2[i9] = fArr2[i9] * f10;
                float[] fArr3 = this.spectrum;
                fArr3[i9] = fArr3[i9] * f10;
                if (i9 != 0) {
                    int i10 = this.timeSize;
                    if (i9 != i10 / 2) {
                        fArr[i10 - i9] = fArr[i9];
                        fArr2[i10 - i9] = -fArr2[i9];
                    }
                }
            }
        }

        @Override
        public void setBand(int i9, float f10) {
            if (f10 >= 0.0f) {
                float[] fArr = this.real;
                float f11 = fArr[i9];
                if (f11 == 0.0f && this.imag[i9] == 0.0f) {
                    fArr[i9] = f10;
                    this.spectrum[i9] = f10;
                } else {
                    float[] fArr2 = this.spectrum;
                    fArr[i9] = f11 / fArr2[i9];
                    float[] fArr3 = this.imag;
                    fArr3[i9] = fArr3[i9] / fArr2[i9];
                    fArr2[i9] = f10;
                    fArr[i9] = fArr[i9] * f10;
                    fArr3[i9] = fArr3[i9] * fArr2[i9];
                }
                if (i9 != 0) {
                    int i10 = this.timeSize;
                    if (i9 != i10 / 2) {
                        fArr[i10 - i9] = fArr[i9];
                        float[] fArr4 = this.imag;
                        fArr4[i10 - i9] = -fArr4[i9];
                    }
                }
            }
        }

        @Override
        public void forward(float[] fArr, int i9) {
            if (fArr.length - i9 < this.timeSize) {
                return;
            }
            bitReverseSamples(fArr, i9);
            fft();
            fillSpectrum();
        }

        public void forward(float[] fArr, float[] fArr2) {
            int length = fArr.length;
            int i9 = this.timeSize;
            if (length == i9 && fArr2.length == i9) {
                setComplex(fArr, fArr2);
                bitReverseComplex();
                fft();
                fillSpectrum();
            }
        }
    }
}
