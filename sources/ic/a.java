package ic;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
public final class a extends b {
    public static final HashMap U;
    public static final HashMap V;
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public byte[] d;
    public int f14717e;
    public int f14718f;
    public int f14719g;
    public int h;
    public int f14720i;
    public boolean f14721j;
    public boolean f14722k;
    public int f14723l;
    public int f14724m;
    public int f14725n;
    public int f14726o;
    public int f14727p;
    public int f14728q;
    public int f14729r;
    public int f14730s;
    public int f14731t;
    public int f14732u;
    public int v;
    public int f14733w;
    public int f14734x;
    public int f14735y;
    public int f14736z;

    static {
        HashMap hashMap = new HashMap();
        U = hashMap;
        HashMap hashMap2 = new HashMap();
        V = hashMap2;
        hashMap.put(0, 96000);
        hashMap.put(1, 88200);
        hashMap.put(2, 64000);
        hashMap.put(3, 48000);
        hashMap.put(4, 44100);
        hashMap.put(5, 32000);
        hashMap.put(6, 24000);
        hashMap.put(7, 22050);
        hashMap.put(8, 16000);
        hashMap.put(9, 12000);
        hashMap.put(10, 11025);
        hashMap.put(11, 8000);
        hashMap2.put(1, "AAC main");
        hashMap2.put(2, "AAC LC");
        hashMap2.put(3, "AAC SSR");
        hashMap2.put(4, "AAC LTP");
        hashMap2.put(5, "SBR");
        hashMap2.put(6, "AAC Scalable");
        hashMap2.put(7, "TwinVQ");
        hashMap2.put(8, "CELP");
        hashMap2.put(9, "HVXC");
        hashMap2.put(10, "(reserved)");
        hashMap2.put(11, "(reserved)");
        hashMap2.put(12, "TTSI");
        com.google.android.recaptcha.internal.a.w(13, hashMap2, "Main synthetic", 14, "Wavetable synthesis");
        com.google.android.recaptcha.internal.a.w(15, hashMap2, "General MIDI", 16, "Algorithmic Synthesis and Audio FX");
        com.google.android.recaptcha.internal.a.w(17, hashMap2, "ER AAC LC", 18, "(reserved)");
        com.google.android.recaptcha.internal.a.w(19, hashMap2, "ER AAC LTP", 20, "ER AAC Scalable");
        com.google.android.recaptcha.internal.a.w(21, hashMap2, "ER TwinVQ", 22, "ER BSAC");
        com.google.android.recaptcha.internal.a.w(23, hashMap2, "ER AAC LD", 24, "ER CELP");
        com.google.android.recaptcha.internal.a.w(25, hashMap2, "ER HVXC", 26, "ER HILN");
        com.google.android.recaptcha.internal.a.w(27, hashMap2, "ER Parametric", 28, "SSC");
        com.google.android.recaptcha.internal.a.w(29, hashMap2, "PS", 30, "MPEG Surround");
        com.google.android.recaptcha.internal.a.w(31, hashMap2, "(escape)", 32, "Layer-1");
        com.google.android.recaptcha.internal.a.w(33, hashMap2, "Layer-2", 34, "Layer-3");
        com.google.android.recaptcha.internal.a.w(35, hashMap2, "DST", 36, "ALS");
        com.google.android.recaptcha.internal.a.w(37, hashMap2, "SLS", 38, "SLS non-core");
        com.google.android.recaptcha.internal.a.w(39, hashMap2, "ER AAC ELD", 40, "SMR Simple");
        hashMap2.put(41, "SMR Main");
    }

    public static int c(c cVar) {
        int a10 = cVar.a(5);
        if (a10 == 31) {
            return cVar.a(6) + 32;
        }
        return a10;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i3;
        int i10;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f14738b);
        byteBuffer.position(byteBuffer.position() + this.f14738b);
        byte[] bArr = new byte[this.f14738b];
        this.d = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(0, slice);
        this.f14717e = c(cVar);
        int a10 = cVar.a(4);
        this.f14718f = a10;
        int i11 = 15;
        if (a10 == 15) {
            this.f14719g = cVar.a(24);
        }
        this.h = cVar.a(4);
        int i12 = this.f14717e;
        if (i12 != 5 && i12 != 29) {
            this.f14720i = 0;
        } else {
            this.f14720i = 5;
            this.f14721j = true;
            if (i12 == 29) {
                this.f14722k = true;
            }
            int a11 = cVar.a(4);
            this.f14723l = a11;
            if (a11 == 15) {
                this.f14724m = cVar.a(24);
            }
            int c2 = c(cVar);
            this.f14717e = c2;
            if (c2 == 22) {
                this.f14725n = cVar.a(4);
            }
        }
        int i13 = this.f14717e;
        switch (i13) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 17:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                int i14 = this.h;
                this.f14731t = cVar.a(1);
                int a12 = cVar.a(1);
                this.f14732u = a12;
                if (a12 == 1) {
                    this.v = cVar.a(14);
                }
                this.f14733w = cVar.a(1);
                if (i14 != 0) {
                    if (i13 == 6 || i13 == 20) {
                        this.f14734x = cVar.a(3);
                    }
                    if (this.f14733w == 1) {
                        if (i13 == 22) {
                            this.f14735y = cVar.a(5);
                            this.f14736z = cVar.a(11);
                        }
                        if (i13 == 17 || i13 == 19 || i13 == 20 || i13 == 23) {
                            this.A = cVar.b();
                            this.B = cVar.b();
                            this.C = cVar.b();
                        }
                        this.D = cVar.a(1);
                    }
                    this.E = true;
                    break;
                } else {
                    throw new UnsupportedOperationException("can't parse program_config_element yet");
                }
                break;
            case 8:
                throw new UnsupportedOperationException("can't parse CelpSpecificConfig yet");
            case 9:
                throw new UnsupportedOperationException("can't parse HvxcSpecificConfig yet");
            case 12:
                throw new UnsupportedOperationException("can't parse TTSSpecificConfig yet");
            case 13:
            case 14:
            case 15:
            case 16:
                throw new UnsupportedOperationException("can't parse StructuredAudioSpecificConfig yet");
            case 24:
                throw new UnsupportedOperationException("can't parse ErrorResilientCelpSpecificConfig yet");
            case 25:
                throw new UnsupportedOperationException("can't parse ErrorResilientHvxcSpecificConfig yet");
            case 26:
            case 27:
                int a13 = cVar.a(1);
                this.F = a13;
                if (a13 == 1) {
                    int a14 = cVar.a(2);
                    this.G = a14;
                    if (a14 != 1) {
                        this.I = cVar.a(1);
                        this.J = cVar.a(2);
                        int a15 = cVar.a(1);
                        this.K = a15;
                        if (a15 == 1) {
                            this.L = cVar.a(1);
                        }
                    }
                    if (this.G != 0) {
                        this.M = cVar.a(1);
                        this.N = cVar.a(8);
                        this.O = cVar.a(4);
                        this.P = cVar.a(12);
                        this.Q = cVar.a(2);
                    }
                    this.H = cVar.a(1);
                    this.T = true;
                    break;
                } else {
                    int a16 = cVar.a(1);
                    this.R = a16;
                    if (a16 == 1) {
                        this.S = cVar.a(2);
                        break;
                    }
                }
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f14726o = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f14727p = cVar.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                int i15 = this.h;
                cVar.b();
                cVar.b();
                cVar.b();
                cVar.b();
                if (cVar.b()) {
                    cVar.b();
                    cVar.b();
                    switch (i15) {
                        case 1:
                        case 2:
                            i10 = 1;
                            break;
                        case 3:
                            i10 = 2;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i10 = 3;
                            break;
                        case 7:
                            i10 = 4;
                            break;
                        default:
                            i10 = 0;
                            break;
                    }
                    for (int i16 = 0; i16 < i10; i16++) {
                        cVar.b();
                        cVar.a(4);
                        cVar.a(4);
                        cVar.a(3);
                        cVar.a(2);
                        boolean b10 = cVar.b();
                        boolean b11 = cVar.b();
                        if (b10) {
                            cVar.a(2);
                            cVar.b();
                            cVar.a(2);
                        }
                        if (b11) {
                            cVar.a(2);
                            cVar.a(2);
                            cVar.b();
                        }
                        cVar.b();
                    }
                }
                while (cVar.a(4) != 0) {
                    int a17 = cVar.a(4);
                    if (a17 == i11) {
                        i3 = cVar.a(8);
                        a17 += i3;
                    } else {
                        i3 = 0;
                    }
                    if (i3 == 255) {
                        a17 += cVar.a(16);
                    }
                    for (int i17 = 0; i17 < a17; i17++) {
                        cVar.a(8);
                    }
                    i11 = 15;
                }
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i18 = this.f14717e;
        if (i18 != 17 && i18 != 39) {
            switch (i18) {
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    if (this.f14720i == 5 && (cVar.f14740a.limit() * 8) - cVar.f14742c >= 16) {
                        int a18 = cVar.a(11);
                        this.f14730s = a18;
                        if (a18 == 695) {
                            int c10 = c(cVar);
                            this.f14720i = c10;
                            if (c10 == 5) {
                                boolean b12 = cVar.b();
                                this.f14721j = b12;
                                if (b12) {
                                    int a19 = cVar.a(4);
                                    this.f14723l = a19;
                                    if (a19 == 15) {
                                        this.f14724m = cVar.a(24);
                                    }
                                    if ((cVar.f14740a.limit() * 8) - cVar.f14742c >= 12) {
                                        int a20 = cVar.a(11);
                                        this.f14730s = a20;
                                        if (a20 == 1352) {
                                            this.f14722k = cVar.b();
                                        }
                                    }
                                }
                            }
                            if (this.f14720i == 22) {
                                boolean b13 = cVar.b();
                                this.f14721j = b13;
                                if (b13) {
                                    int a21 = cVar.a(4);
                                    this.f14723l = a21;
                                    if (a21 == 15) {
                                        this.f14724m = cVar.a(24);
                                    }
                                }
                                this.f14725n = cVar.a(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
        int a22 = cVar.a(2);
        this.f14728q = a22;
        if (a22 != 2 && a22 != 3) {
            if (a22 == 3) {
                int a23 = cVar.a(1);
                this.f14729r = a23;
                if (a23 == 0) {
                    throw new RuntimeException("not implemented");
                }
            }
            if (this.f14720i == 5) {
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("can't parse ErrorProtectionSpecificConfig yet");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.B == aVar.B && this.A == aVar.A && this.C == aVar.C && this.f14717e == aVar.f14717e && this.h == aVar.h && this.v == aVar.v && this.f14732u == aVar.f14732u && this.f14729r == aVar.f14729r && this.f14728q == aVar.f14728q && this.K == aVar.K && this.f14720i == aVar.f14720i && this.f14725n == aVar.f14725n && this.f14733w == aVar.f14733w && this.D == aVar.D && this.f14724m == aVar.f14724m && this.f14723l == aVar.f14723l && this.f14727p == aVar.f14727p && this.f14731t == aVar.f14731t && this.E == aVar.E && this.Q == aVar.Q && this.R == aVar.R && this.S == aVar.S && this.P == aVar.P && this.N == aVar.N && this.M == aVar.M && this.O == aVar.O && this.J == aVar.J && this.I == aVar.I && this.F == aVar.F && this.f14734x == aVar.f14734x && this.f14736z == aVar.f14736z && this.f14735y == aVar.f14735y && this.H == aVar.H && this.G == aVar.G && this.T == aVar.T && this.f14722k == aVar.f14722k && this.f14726o == aVar.f14726o && this.f14719g == aVar.f14719g && this.f14718f == aVar.f14718f && this.f14721j == aVar.f14721j && this.f14730s == aVar.f14730s && this.L == aVar.L && Arrays.equals(this.d, aVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i3;
        byte[] bArr = this.d;
        if (bArr != null) {
            i3 = Arrays.hashCode(bArr);
        } else {
            i3 = 0;
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i3 * 31) + this.f14717e) * 31) + this.f14718f) * 31) + this.f14719g) * 31) + this.h) * 31) + this.f14720i) * 31) + (this.f14721j ? 1 : 0)) * 31) + (this.f14722k ? 1 : 0)) * 31) + this.f14723l) * 31) + this.f14724m) * 31) + this.f14725n) * 31) + this.f14726o) * 31) + this.f14727p) * 31) + this.f14728q) * 31) + this.f14729r) * 31) + this.f14730s) * 31) + this.f14731t) * 31) + this.f14732u) * 31) + this.v) * 31) + this.f14733w) * 31) + this.f14734x) * 31) + this.f14735y) * 31) + this.f14736z) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + (this.T ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb2.append(g5.b.c(0, this.d));
        sb2.append(", audioObjectType=");
        sb2.append(this.f14717e);
        sb2.append(" (");
        Integer valueOf = Integer.valueOf(this.f14717e);
        HashMap hashMap = V;
        sb2.append((String) hashMap.get(valueOf));
        sb2.append("), samplingFrequencyIndex=");
        sb2.append(this.f14718f);
        sb2.append(" (");
        Integer valueOf2 = Integer.valueOf(this.f14718f);
        HashMap hashMap2 = U;
        sb2.append(hashMap2.get(valueOf2));
        sb2.append("), samplingFrequency=");
        sb2.append(this.f14719g);
        sb2.append(", channelConfiguration=");
        sb2.append(this.h);
        if (this.f14720i > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f14720i);
            sb2.append(" (");
            sb2.append((String) hashMap.get(Integer.valueOf(this.f14720i)));
            sb2.append("), sbrPresentFlag=");
            sb2.append(this.f14721j);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f14722k);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f14723l);
            sb2.append(" (");
            sb2.append(hashMap2.get(Integer.valueOf(this.f14723l)));
            sb2.append("), extensionSamplingFrequency=");
            sb2.append(this.f14724m);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f14725n);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f14730s);
        if (this.E) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f14731t);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f14732u);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.v);
            sb2.append(", extensionFlag=");
            sb2.append(this.f14733w);
            sb2.append(", layerNr=");
            sb2.append(this.f14734x);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f14735y);
            sb2.append(", layer_length=");
            sb2.append(this.f14736z);
            sb2.append(", aacSectionDataResilienceFlag=");
            sb2.append(this.A);
            sb2.append(", aacScalefactorDataResilienceFlag=");
            sb2.append(this.B);
            sb2.append(", aacSpectralDataResilienceFlag=");
            sb2.append(this.C);
            sb2.append(", extensionFlag3=");
            sb2.append(this.D);
        }
        if (this.T) {
            sb2.append(", isBaseLayer=");
            sb2.append(this.F);
            sb2.append(", paraMode=");
            sb2.append(this.G);
            sb2.append(", paraExtensionFlag=");
            sb2.append(this.H);
            sb2.append(", hvxcVarMode=");
            sb2.append(this.I);
            sb2.append(", hvxcRateMode=");
            sb2.append(this.J);
            sb2.append(", erHvxcExtensionFlag=");
            sb2.append(this.K);
            sb2.append(", var_ScalableFlag=");
            sb2.append(this.L);
            sb2.append(", hilnQuantMode=");
            sb2.append(this.M);
            sb2.append(", hilnMaxNumLine=");
            sb2.append(this.N);
            sb2.append(", hilnSampleRateCode=");
            sb2.append(this.O);
            sb2.append(", hilnFrameLength=");
            sb2.append(this.P);
            sb2.append(", hilnContMode=");
            sb2.append(this.Q);
            sb2.append(", hilnEnhaLayer=");
            sb2.append(this.R);
            sb2.append(", hilnEnhaQuantMode=");
            sb2.append(this.S);
        }
        sb2.append('}');
        return sb2.toString();
    }
}
