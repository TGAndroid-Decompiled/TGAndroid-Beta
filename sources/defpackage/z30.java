package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
public final class z30 extends tf0 {
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
        c00.r(13, hashMap2, "Main synthetic", 14, "Wavetable synthesis");
        c00.r(15, hashMap2, "General MIDI", 16, "Algorithmic Synthesis and Audio FX");
        c00.r(17, hashMap2, "ER AAC LC", 18, "(reserved)");
        c00.r(19, hashMap2, "ER AAC LTP", 20, "ER AAC Scalable");
        c00.r(21, hashMap2, "ER TwinVQ", 22, "ER BSAC");
        c00.r(23, hashMap2, "ER AAC LD", 24, "ER CELP");
        c00.r(25, hashMap2, "ER HVXC", 26, "ER HILN");
        c00.r(27, hashMap2, "ER Parametric", 28, "SSC");
        c00.r(29, hashMap2, "PS", 30, "MPEG Surround");
        c00.r(31, hashMap2, "(escape)", 32, "Layer-1");
        c00.r(33, hashMap2, "Layer-2", 34, "Layer-3");
        c00.r(35, hashMap2, "DST", 36, "ALS");
        c00.r(37, hashMap2, "SLS", 38, "SLS non-core");
        c00.r(39, hashMap2, "ER AAC ELD", 40, "SMR Simple");
        hashMap2.put(41, "SMR Main");
    }

    public static int c(ir7 ir7Var) {
        int a = ir7Var.a(5);
        if (a == 31) {
            return ir7Var.a(6) + 32;
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
        ir7 ir7Var = new ir7(slice, (byte) 1);
        this.e = c(ir7Var);
        int a = ir7Var.a(4);
        this.f = a;
        int i3 = 15;
        if (a == 15) {
            this.g = ir7Var.a(24);
        }
        this.h = ir7Var.a(4);
        int i4 = this.e;
        if (i4 != 5 && i4 != 29) {
            this.i = 0;
        } else {
            this.i = 5;
            this.j = true;
            if (i4 == 29) {
                this.k = true;
            }
            int a2 = ir7Var.a(4);
            this.l = a2;
            if (a2 == 15) {
                this.m = ir7Var.a(24);
            }
            int c = c(ir7Var);
            this.e = c;
            if (c == 22) {
                this.n = ir7Var.a(4);
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
                this.t = ir7Var.a(1);
                int a3 = ir7Var.a(1);
                this.u = a3;
                if (a3 == 1) {
                    this.v = ir7Var.a(14);
                }
                this.w = ir7Var.a(1);
                if (i6 != 0) {
                    if (i5 == 6 || i5 == 20) {
                        this.x = ir7Var.a(3);
                    }
                    if (this.w == 1) {
                        if (i5 == 22) {
                            this.y = ir7Var.a(5);
                            this.z = ir7Var.a(11);
                        }
                        if (i5 == 17 || i5 == 19 || i5 == 20 || i5 == 23) {
                            this.A = ir7Var.b();
                            this.B = ir7Var.b();
                            this.C = ir7Var.b();
                        }
                        this.D = ir7Var.a(1);
                    }
                    this.E = true;
                    break;
                } else {
                    qyc.c("can't parse program_config_element yet");
                    return;
                }
                break;
            case 8:
                qyc.c("can't parse CelpSpecificConfig yet");
                return;
            case 9:
                qyc.c("can't parse HvxcSpecificConfig yet");
                return;
            case 12:
                qyc.c("can't parse TTSSpecificConfig yet");
                return;
            case 13:
            case 14:
            case 15:
            case 16:
                qyc.c("can't parse StructuredAudioSpecificConfig yet");
                return;
            case 24:
                qyc.c("can't parse ErrorResilientCelpSpecificConfig yet");
                return;
            case 25:
                qyc.c("can't parse ErrorResilientHvxcSpecificConfig yet");
                return;
            case 26:
            case 27:
                int a4 = ir7Var.a(1);
                this.F = a4;
                if (a4 == 1) {
                    int a5 = ir7Var.a(2);
                    this.G = a5;
                    if (a5 != 1) {
                        this.I = ir7Var.a(1);
                        this.J = ir7Var.a(2);
                        int a6 = ir7Var.a(1);
                        this.K = a6;
                        if (a6 == 1) {
                            this.L = ir7Var.a(1);
                        }
                    }
                    if (this.G != 0) {
                        this.M = ir7Var.a(1);
                        this.N = ir7Var.a(8);
                        this.O = ir7Var.a(4);
                        this.P = ir7Var.a(12);
                        this.Q = ir7Var.a(2);
                    }
                    this.H = ir7Var.a(1);
                    this.T = true;
                    break;
                } else {
                    int a7 = ir7Var.a(1);
                    this.R = a7;
                    if (a7 == 1) {
                        this.S = ir7Var.a(2);
                        break;
                    }
                }
                break;
            case 28:
                qyc.c("can't parse SSCSpecificConfig yet");
                return;
            case 30:
                this.o = ir7Var.a(1);
                qyc.c("can't parse SpatialSpecificConfig yet");
                return;
            case 32:
            case 33:
            case 34:
                qyc.c("can't parse MPEG_1_2_SpecificConfig yet");
                return;
            case 35:
                qyc.c("can't parse DSTSpecificConfig yet");
                return;
            case 36:
                this.p = ir7Var.a(5);
                qyc.c("can't parse ALSSpecificConfig yet");
                return;
            case 37:
            case 38:
                qyc.c("can't parse SLSSpecificConfig yet");
                return;
            case 39:
                int i7 = this.h;
                ir7Var.b();
                ir7Var.b();
                ir7Var.b();
                ir7Var.b();
                if (ir7Var.b()) {
                    ir7Var.b();
                    ir7Var.b();
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
                        ir7Var.b();
                        ir7Var.a(4);
                        ir7Var.a(4);
                        ir7Var.a(3);
                        ir7Var.a(2);
                        boolean b = ir7Var.b();
                        boolean b2 = ir7Var.b();
                        if (b) {
                            ir7Var.a(2);
                            ir7Var.b();
                            ir7Var.a(2);
                        }
                        if (b2) {
                            ir7Var.a(2);
                            ir7Var.a(2);
                            ir7Var.b();
                        }
                        ir7Var.b();
                    }
                }
                while (ir7Var.a(4) != 0) {
                    int a8 = ir7Var.a(4);
                    if (a8 == i3) {
                        i = ir7Var.a(8);
                        a8 += i;
                    } else {
                        i = 0;
                    }
                    if (i == 255) {
                        a8 += ir7Var.a(16);
                    }
                    for (int i9 = 0; i9 < a8; i9++) {
                        ir7Var.a(8);
                    }
                    i3 = 15;
                }
                break;
            case 40:
            case 41:
                qyc.c("can't parse SymbolicMusicSpecificConfig yet");
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
                    if (this.i == 5 && (ir7Var.a.limit() << 3) - ir7Var.c >= 16) {
                        int a9 = ir7Var.a(11);
                        this.s = a9;
                        if (a9 == 695) {
                            int c2 = c(ir7Var);
                            this.i = c2;
                            if (c2 == 5) {
                                boolean b3 = ir7Var.b();
                                this.j = b3;
                                if (b3) {
                                    int a10 = ir7Var.a(4);
                                    this.l = a10;
                                    if (a10 == 15) {
                                        this.m = ir7Var.a(24);
                                    }
                                    if ((ir7Var.a.limit() << 3) - ir7Var.c >= 12) {
                                        int a11 = ir7Var.a(11);
                                        this.s = a11;
                                        if (a11 == 1352) {
                                            this.k = ir7Var.b();
                                        }
                                    }
                                }
                            }
                            if (this.i == 22) {
                                boolean b4 = ir7Var.b();
                                this.j = b4;
                                if (b4) {
                                    int a12 = ir7Var.a(4);
                                    this.l = a12;
                                    if (a12 == 15) {
                                        this.m = ir7Var.a(24);
                                    }
                                }
                                this.n = ir7Var.a(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
        int a13 = ir7Var.a(2);
        this.q = a13;
        if (a13 != 2 && a13 != 3) {
            if (a13 == 3) {
                int a14 = ir7Var.a(1);
                this.r = a14;
                if (a14 == 0) {
                    xi4.l("not implemented");
                    return;
                }
            }
            if (this.i == 5) {
                return;
            }
            return;
        }
        qyc.c("can't parse ErrorProtectionSpecificConfig yet");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && z30.class == obj.getClass()) {
                z30 z30Var = (z30) obj;
                if (this.B == z30Var.B && this.A == z30Var.A && this.C == z30Var.C && this.e == z30Var.e && this.h == z30Var.h && this.v == z30Var.v && this.u == z30Var.u && this.r == z30Var.r && this.q == z30Var.q && this.K == z30Var.K && this.i == z30Var.i && this.n == z30Var.n && this.w == z30Var.w && this.D == z30Var.D && this.m == z30Var.m && this.l == z30Var.l && this.p == z30Var.p && this.t == z30Var.t && this.E == z30Var.E && this.Q == z30Var.Q && this.R == z30Var.R && this.S == z30Var.S && this.P == z30Var.P && this.N == z30Var.N && this.M == z30Var.M && this.O == z30Var.O && this.J == z30Var.J && this.I == z30Var.I && this.F == z30Var.F && this.x == z30Var.x && this.z == z30Var.z && this.y == z30Var.y && this.H == z30Var.H && this.G == z30Var.G && this.T == z30Var.T && this.k == z30Var.k && this.o == z30Var.o && this.g == z30Var.g && this.f == z30Var.f && this.j == z30Var.j && this.s == z30Var.s && this.L == z30Var.L && Arrays.equals(this.d, z30Var.d)) {
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
        sb.append(xed.a(0, this.d));
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
