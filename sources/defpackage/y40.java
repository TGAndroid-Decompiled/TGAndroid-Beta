package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
public final class y40 extends rg0 {
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
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;

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
        b10.q(13, hashMap2, "Main synthetic", 14, "Wavetable synthesis");
        b10.q(15, hashMap2, "General MIDI", 16, "Algorithmic Synthesis and Audio FX");
        b10.q(17, hashMap2, "ER AAC LC", 18, "(reserved)");
        b10.q(19, hashMap2, "ER AAC LTP", 20, "ER AAC Scalable");
        b10.q(21, hashMap2, "ER TwinVQ", 22, "ER BSAC");
        b10.q(23, hashMap2, "ER AAC LD", 24, "ER CELP");
        b10.q(25, hashMap2, "ER HVXC", 26, "ER HILN");
        b10.q(27, hashMap2, "ER Parametric", 28, "SSC");
        b10.q(29, hashMap2, "PS", 30, "MPEG Surround");
        b10.q(31, hashMap2, "(escape)", 32, "Layer-1");
        b10.q(33, hashMap2, "Layer-2", 34, "Layer-3");
        b10.q(35, hashMap2, "DST", 36, "ALS");
        b10.q(37, hashMap2, "SLS", 38, "SLS non-core");
        b10.q(39, hashMap2, "ER AAC ELD", 40, "SMR Simple");
        hashMap2.put(41, "SMR Main");
    }

    public static int c(lq7 lq7Var) {
        int a = lq7Var.a(5);
        if (a == 31) {
            return lq7Var.a(6) + 32;
        }
        return a;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i;
        int i2;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.b);
        byteBuffer.position(byteBuffer.position() + this.b);
        byte[] bArr = new byte[this.b];
        this.d = bArr;
        slice.get(bArr);
        slice.rewind();
        lq7 lq7Var = new lq7(slice, (byte) 1);
        this.e = c(lq7Var);
        int a = lq7Var.a(4);
        this.f = a;
        int i3 = 15;
        if (a == 15) {
            this.g = lq7Var.a(24);
        }
        this.h = lq7Var.a(4);
        int i4 = this.e;
        if (i4 != 5 && i4 != 29) {
            this.i = 0;
        } else {
            this.i = 5;
            this.j = true;
            if (i4 == 29) {
                this.k = true;
            }
            int a2 = lq7Var.a(4);
            this.l = a2;
            if (a2 == 15) {
                this.m = lq7Var.a(24);
            }
            int c = c(lq7Var);
            this.e = c;
            if (c == 22) {
                this.n = lq7Var.a(4);
            }
        }
        int i5 = this.e;
        switch (i5) {
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
                int i6 = this.h;
                this.t = lq7Var.a(1);
                int a3 = lq7Var.a(1);
                this.u = a3;
                if (a3 == 1) {
                    this.v = lq7Var.a(14);
                }
                this.w = lq7Var.a(1);
                if (i6 != 0) {
                    if (i5 == 6 || i5 == 20) {
                        this.x = lq7Var.a(3);
                    }
                    if (this.w == 1) {
                        if (i5 == 22) {
                            this.y = lq7Var.a(5);
                            this.z = lq7Var.a(11);
                        }
                        if (i5 == 17 || i5 == 19 || i5 == 20 || i5 == 23) {
                            this.A = lq7Var.b();
                            this.B = lq7Var.b();
                            this.C = lq7Var.b();
                        }
                        this.D = lq7Var.a(1);
                    }
                    this.E = true;
                    break;
                } else {
                    rjb.j("can't parse program_config_element yet");
                    return;
                }
                break;
            case 8:
                rjb.j("can't parse CelpSpecificConfig yet");
                return;
            case 9:
                rjb.j("can't parse HvxcSpecificConfig yet");
                return;
            case 12:
                rjb.j("can't parse TTSSpecificConfig yet");
                return;
            case 13:
            case 14:
            case 15:
            case 16:
                rjb.j("can't parse StructuredAudioSpecificConfig yet");
                return;
            case 24:
                rjb.j("can't parse ErrorResilientCelpSpecificConfig yet");
                return;
            case 25:
                rjb.j("can't parse ErrorResilientHvxcSpecificConfig yet");
                return;
            case 26:
            case 27:
                int a4 = lq7Var.a(1);
                this.F = a4;
                if (a4 == 1) {
                    int a5 = lq7Var.a(2);
                    this.G = a5;
                    if (a5 != 1) {
                        this.I = lq7Var.a(1);
                        this.J = lq7Var.a(2);
                        int a6 = lq7Var.a(1);
                        this.K = a6;
                        if (a6 == 1) {
                            this.L = lq7Var.a(1);
                        }
                    }
                    if (this.G != 0) {
                        this.M = lq7Var.a(1);
                        this.N = lq7Var.a(8);
                        this.O = lq7Var.a(4);
                        this.P = lq7Var.a(12);
                        this.Q = lq7Var.a(2);
                    }
                    this.H = lq7Var.a(1);
                    this.T = true;
                    break;
                } else {
                    int a7 = lq7Var.a(1);
                    this.R = a7;
                    if (a7 == 1) {
                        this.S = lq7Var.a(2);
                        break;
                    }
                }
                break;
            case 28:
                rjb.j("can't parse SSCSpecificConfig yet");
                return;
            case 30:
                this.o = lq7Var.a(1);
                rjb.j("can't parse SpatialSpecificConfig yet");
                return;
            case 32:
            case 33:
            case 34:
                rjb.j("can't parse MPEG_1_2_SpecificConfig yet");
                return;
            case 35:
                rjb.j("can't parse DSTSpecificConfig yet");
                return;
            case 36:
                this.p = lq7Var.a(5);
                rjb.j("can't parse ALSSpecificConfig yet");
                return;
            case 37:
            case 38:
                rjb.j("can't parse SLSSpecificConfig yet");
                return;
            case 39:
                int i7 = this.h;
                lq7Var.b();
                lq7Var.b();
                lq7Var.b();
                lq7Var.b();
                if (lq7Var.b()) {
                    lq7Var.b();
                    lq7Var.b();
                    switch (i7) {
                        case 1:
                        case 2:
                            i2 = 1;
                            break;
                        case 3:
                            i2 = 2;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i2 = 3;
                            break;
                        case 7:
                            i2 = 4;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    for (int i8 = 0; i8 < i2; i8++) {
                        lq7Var.b();
                        lq7Var.a(4);
                        lq7Var.a(4);
                        lq7Var.a(3);
                        lq7Var.a(2);
                        boolean b = lq7Var.b();
                        boolean b2 = lq7Var.b();
                        if (b) {
                            lq7Var.a(2);
                            lq7Var.b();
                            lq7Var.a(2);
                        }
                        if (b2) {
                            lq7Var.a(2);
                            lq7Var.a(2);
                            lq7Var.b();
                        }
                        lq7Var.b();
                    }
                }
                while (lq7Var.a(4) != 0) {
                    int a8 = lq7Var.a(4);
                    if (a8 == i3) {
                        i = lq7Var.a(8);
                        a8 += i;
                    } else {
                        i = 0;
                    }
                    if (i == 255) {
                        a8 += lq7Var.a(16);
                    }
                    for (int i9 = 0; i9 < a8; i9++) {
                        lq7Var.a(8);
                    }
                    i3 = 15;
                }
                break;
            case 40:
            case 41:
                rjb.j("can't parse SymbolicMusicSpecificConfig yet");
                return;
        }
        int i10 = this.e;
        if (i10 != 17 && i10 != 39) {
            switch (i10) {
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
                    if (this.i == 5 && (lq7Var.a.limit() << 3) - lq7Var.c >= 16) {
                        int a9 = lq7Var.a(11);
                        this.s = a9;
                        if (a9 == 695) {
                            int c2 = c(lq7Var);
                            this.i = c2;
                            if (c2 == 5) {
                                boolean b3 = lq7Var.b();
                                this.j = b3;
                                if (b3) {
                                    int a10 = lq7Var.a(4);
                                    this.l = a10;
                                    if (a10 == 15) {
                                        this.m = lq7Var.a(24);
                                    }
                                    if ((lq7Var.a.limit() << 3) - lq7Var.c >= 12) {
                                        int a11 = lq7Var.a(11);
                                        this.s = a11;
                                        if (a11 == 1352) {
                                            this.k = lq7Var.b();
                                        }
                                    }
                                }
                            }
                            if (this.i == 22) {
                                boolean b4 = lq7Var.b();
                                this.j = b4;
                                if (b4) {
                                    int a12 = lq7Var.a(4);
                                    this.l = a12;
                                    if (a12 == 15) {
                                        this.m = lq7Var.a(24);
                                    }
                                }
                                this.n = lq7Var.a(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
        int a13 = lq7Var.a(2);
        this.q = a13;
        if (a13 != 2 && a13 != 3) {
            if (a13 == 3) {
                int a14 = lq7Var.a(1);
                this.r = a14;
                if (a14 == 0) {
                    zo4.k("not implemented");
                    return;
                }
            }
            if (this.i == 5) {
                return;
            }
            return;
        }
        rjb.j("can't parse ErrorProtectionSpecificConfig yet");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y40.class == obj.getClass()) {
                y40 y40Var = (y40) obj;
                if (this.B == y40Var.B && this.A == y40Var.A && this.C == y40Var.C && this.e == y40Var.e && this.h == y40Var.h && this.v == y40Var.v && this.u == y40Var.u && this.r == y40Var.r && this.q == y40Var.q && this.K == y40Var.K && this.i == y40Var.i && this.n == y40Var.n && this.w == y40Var.w && this.D == y40Var.D && this.m == y40Var.m && this.l == y40Var.l && this.p == y40Var.p && this.t == y40Var.t && this.E == y40Var.E && this.Q == y40Var.Q && this.R == y40Var.R && this.S == y40Var.S && this.P == y40Var.P && this.N == y40Var.N && this.M == y40Var.M && this.O == y40Var.O && this.J == y40Var.J && this.I == y40Var.I && this.F == y40Var.F && this.x == y40Var.x && this.z == y40Var.z && this.y == y40Var.y && this.H == y40Var.H && this.G == y40Var.G && this.T == y40Var.T && this.k == y40Var.k && this.o == y40Var.o && this.g == y40Var.g && this.f == y40Var.f && this.j == y40Var.j && this.s == y40Var.s && this.L == y40Var.L && Arrays.equals(this.d, y40Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        byte[] bArr = this.d;
        if (bArr != null) {
            i = Arrays.hashCode(bArr);
        } else {
            i = 0;
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + (this.j ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o) * 31) + this.p) * 31) + this.q) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u) * 31) + this.v) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + (this.T ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb.append(gcd.a(0, this.d));
        sb.append(", audioObjectType=");
        sb.append(this.e);
        sb.append(" (");
        Integer valueOf = Integer.valueOf(this.e);
        HashMap hashMap = V;
        sb.append((String) hashMap.get(valueOf));
        sb.append("), samplingFrequencyIndex=");
        sb.append(this.f);
        sb.append(" (");
        Integer valueOf2 = Integer.valueOf(this.f);
        HashMap hashMap2 = U;
        sb.append(hashMap2.get(valueOf2));
        sb.append("), samplingFrequency=");
        sb.append(this.g);
        sb.append(", channelConfiguration=");
        sb.append(this.h);
        if (this.i > 0) {
            sb.append(", extensionAudioObjectType=");
            sb.append(this.i);
            sb.append(" (");
            sb.append((String) hashMap.get(Integer.valueOf(this.i)));
            sb.append("), sbrPresentFlag=");
            sb.append(this.j);
            sb.append(", psPresentFlag=");
            sb.append(this.k);
            sb.append(", extensionSamplingFrequencyIndex=");
            sb.append(this.l);
            sb.append(" (");
            sb.append(hashMap2.get(Integer.valueOf(this.l)));
            sb.append("), extensionSamplingFrequency=");
            sb.append(this.m);
            sb.append(", extensionChannelConfiguration=");
            sb.append(this.n);
        }
        sb.append(", syncExtensionType=");
        sb.append(this.s);
        if (this.E) {
            sb.append(", frameLengthFlag=");
            sb.append(this.t);
            sb.append(", dependsOnCoreCoder=");
            sb.append(this.u);
            sb.append(", coreCoderDelay=");
            sb.append(this.v);
            sb.append(", extensionFlag=");
            sb.append(this.w);
            sb.append(", layerNr=");
            sb.append(this.x);
            sb.append(", numOfSubFrame=");
            sb.append(this.y);
            sb.append(", layer_length=");
            sb.append(this.z);
            sb.append(", aacSectionDataResilienceFlag=");
            sb.append(this.A);
            sb.append(", aacScalefactorDataResilienceFlag=");
            sb.append(this.B);
            sb.append(", aacSpectralDataResilienceFlag=");
            sb.append(this.C);
            sb.append(", extensionFlag3=");
            sb.append(this.D);
        }
        if (this.T) {
            sb.append(", isBaseLayer=");
            sb.append(this.F);
            sb.append(", paraMode=");
            sb.append(this.G);
            sb.append(", paraExtensionFlag=");
            sb.append(this.H);
            sb.append(", hvxcVarMode=");
            sb.append(this.I);
            sb.append(", hvxcRateMode=");
            sb.append(this.J);
            sb.append(", erHvxcExtensionFlag=");
            sb.append(this.K);
            sb.append(", var_ScalableFlag=");
            sb.append(this.L);
            sb.append(", hilnQuantMode=");
            sb.append(this.M);
            sb.append(", hilnMaxNumLine=");
            sb.append(this.N);
            sb.append(", hilnSampleRateCode=");
            sb.append(this.O);
            sb.append(", hilnFrameLength=");
            sb.append(this.P);
            sb.append(", hilnContMode=");
            sb.append(this.Q);
            sb.append(", hilnEnhaLayer=");
            sb.append(this.R);
            sb.append(", hilnEnhaQuantMode=");
            sb.append(this.S);
        }
        sb.append('}');
        return sb.toString();
    }
}
