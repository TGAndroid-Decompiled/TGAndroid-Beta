package mc;

import hg.k0;
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
    public int e;
    public int f14935f;
    public int f14936g;
    public int h;
    public int f14937i;
    public boolean f14938j;
    public boolean f14939k;
    public int f14940l;
    public int f14941m;
    public int f14942n;
    public int f14943o;
    public int f14944p;
    public int f14945q;
    public int f14946r;
    public int f14947s;
    public int f14948t;
    public int f14949u;
    public int v;
    public int f14950w;
    public int f14951x;
    public int f14952y;
    public int f14953z;

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
        k0.n(13, hashMap2, "Main synthetic", 14, "Wavetable synthesis");
        k0.n(15, hashMap2, "General MIDI", 16, "Algorithmic Synthesis and Audio FX");
        k0.n(17, hashMap2, "ER AAC LC", 18, "(reserved)");
        k0.n(19, hashMap2, "ER AAC LTP", 20, "ER AAC Scalable");
        k0.n(21, hashMap2, "ER TwinVQ", 22, "ER BSAC");
        k0.n(23, hashMap2, "ER AAC LD", 24, "ER CELP");
        k0.n(25, hashMap2, "ER HVXC", 26, "ER HILN");
        k0.n(27, hashMap2, "ER Parametric", 28, "SSC");
        k0.n(29, hashMap2, "PS", 30, "MPEG Surround");
        k0.n(31, hashMap2, "(escape)", 32, "Layer-1");
        k0.n(33, hashMap2, "Layer-2", 34, "Layer-3");
        k0.n(35, hashMap2, "DST", 36, "ALS");
        k0.n(37, hashMap2, "SLS", 38, "SLS non-core");
        k0.n(39, hashMap2, "ER AAC ELD", 40, "SMR Simple");
        hashMap2.put(41, "SMR Main");
    }

    public static int c(c cVar) {
        int a2 = cVar.a(5);
        if (a2 == 31) {
            return cVar.a(6) + 32;
        }
        return a2;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        int i10;
        int i11;
        ByteBuffer slice = byteBuffer.slice();
        slice.limit(this.f14955b);
        byteBuffer.position(byteBuffer.position() + this.f14955b);
        byte[] bArr = new byte[this.f14955b];
        this.d = bArr;
        slice.get(bArr);
        slice.rewind();
        c cVar = new c(0, slice);
        this.e = c(cVar);
        int a2 = cVar.a(4);
        this.f14935f = a2;
        int i12 = 15;
        if (a2 == 15) {
            this.f14936g = cVar.a(24);
        }
        this.h = cVar.a(4);
        int i13 = this.e;
        if (i13 != 5 && i13 != 29) {
            this.f14937i = 0;
        } else {
            this.f14937i = 5;
            this.f14938j = true;
            if (i13 == 29) {
                this.f14939k = true;
            }
            int a10 = cVar.a(4);
            this.f14940l = a10;
            if (a10 == 15) {
                this.f14941m = cVar.a(24);
            }
            int c10 = c(cVar);
            this.e = c10;
            if (c10 == 22) {
                this.f14942n = cVar.a(4);
            }
        }
        int i14 = this.e;
        switch (i14) {
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
                int i15 = this.h;
                this.f14948t = cVar.a(1);
                int a11 = cVar.a(1);
                this.f14949u = a11;
                if (a11 == 1) {
                    this.v = cVar.a(14);
                }
                this.f14950w = cVar.a(1);
                if (i15 != 0) {
                    if (i14 == 6 || i14 == 20) {
                        this.f14951x = cVar.a(3);
                    }
                    if (this.f14950w == 1) {
                        if (i14 == 22) {
                            this.f14952y = cVar.a(5);
                            this.f14953z = cVar.a(11);
                        }
                        if (i14 == 17 || i14 == 19 || i14 == 20 || i14 == 23) {
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
                int a12 = cVar.a(1);
                this.F = a12;
                if (a12 == 1) {
                    int a13 = cVar.a(2);
                    this.G = a13;
                    if (a13 != 1) {
                        this.I = cVar.a(1);
                        this.J = cVar.a(2);
                        int a14 = cVar.a(1);
                        this.K = a14;
                        if (a14 == 1) {
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
                    int a15 = cVar.a(1);
                    this.R = a15;
                    if (a15 == 1) {
                        this.S = cVar.a(2);
                        break;
                    }
                }
                break;
            case 28:
                throw new UnsupportedOperationException("can't parse SSCSpecificConfig yet");
            case 30:
                this.f14943o = cVar.a(1);
                throw new UnsupportedOperationException("can't parse SpatialSpecificConfig yet");
            case 32:
            case 33:
            case 34:
                throw new UnsupportedOperationException("can't parse MPEG_1_2_SpecificConfig yet");
            case 35:
                throw new UnsupportedOperationException("can't parse DSTSpecificConfig yet");
            case 36:
                this.f14944p = cVar.a(5);
                throw new UnsupportedOperationException("can't parse ALSSpecificConfig yet");
            case 37:
            case 38:
                throw new UnsupportedOperationException("can't parse SLSSpecificConfig yet");
            case 39:
                int i16 = this.h;
                cVar.b();
                cVar.b();
                cVar.b();
                cVar.b();
                if (cVar.b()) {
                    cVar.b();
                    cVar.b();
                    switch (i16) {
                        case 1:
                        case 2:
                            i11 = 1;
                            break;
                        case 3:
                            i11 = 2;
                            break;
                        case 4:
                        case 5:
                        case 6:
                            i11 = 3;
                            break;
                        case 7:
                            i11 = 4;
                            break;
                        default:
                            i11 = 0;
                            break;
                    }
                    for (int i17 = 0; i17 < i11; i17++) {
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
                    int a16 = cVar.a(4);
                    if (a16 == i12) {
                        i10 = cVar.a(8);
                        a16 += i10;
                    } else {
                        i10 = 0;
                    }
                    if (i10 == 255) {
                        a16 += cVar.a(16);
                    }
                    for (int i18 = 0; i18 < a16; i18++) {
                        cVar.a(8);
                    }
                    i12 = 15;
                }
                break;
            case 40:
            case 41:
                throw new UnsupportedOperationException("can't parse SymbolicMusicSpecificConfig yet");
        }
        int i19 = this.e;
        if (i19 != 17 && i19 != 39) {
            switch (i19) {
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
                    if (this.f14937i == 5 && (cVar.f14957a.limit() * 8) - cVar.f14959c >= 16) {
                        int a17 = cVar.a(11);
                        this.f14947s = a17;
                        if (a17 == 695) {
                            int c11 = c(cVar);
                            this.f14937i = c11;
                            if (c11 == 5) {
                                boolean b12 = cVar.b();
                                this.f14938j = b12;
                                if (b12) {
                                    int a18 = cVar.a(4);
                                    this.f14940l = a18;
                                    if (a18 == 15) {
                                        this.f14941m = cVar.a(24);
                                    }
                                    if ((cVar.f14957a.limit() * 8) - cVar.f14959c >= 12) {
                                        int a19 = cVar.a(11);
                                        this.f14947s = a19;
                                        if (a19 == 1352) {
                                            this.f14939k = cVar.b();
                                        }
                                    }
                                }
                            }
                            if (this.f14937i == 22) {
                                boolean b13 = cVar.b();
                                this.f14938j = b13;
                                if (b13) {
                                    int a20 = cVar.a(4);
                                    this.f14940l = a20;
                                    if (a20 == 15) {
                                        this.f14941m = cVar.a(24);
                                    }
                                }
                                this.f14942n = cVar.a(4);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
            }
        }
        int a21 = cVar.a(2);
        this.f14945q = a21;
        if (a21 != 2 && a21 != 3) {
            if (a21 == 3) {
                int a22 = cVar.a(1);
                this.f14946r = a22;
                if (a22 == 0) {
                    throw new RuntimeException("not implemented");
                }
            }
            if (this.f14937i == 5) {
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
                if (this.B == aVar.B && this.A == aVar.A && this.C == aVar.C && this.e == aVar.e && this.h == aVar.h && this.v == aVar.v && this.f14949u == aVar.f14949u && this.f14946r == aVar.f14946r && this.f14945q == aVar.f14945q && this.K == aVar.K && this.f14937i == aVar.f14937i && this.f14942n == aVar.f14942n && this.f14950w == aVar.f14950w && this.D == aVar.D && this.f14941m == aVar.f14941m && this.f14940l == aVar.f14940l && this.f14944p == aVar.f14944p && this.f14948t == aVar.f14948t && this.E == aVar.E && this.Q == aVar.Q && this.R == aVar.R && this.S == aVar.S && this.P == aVar.P && this.N == aVar.N && this.M == aVar.M && this.O == aVar.O && this.J == aVar.J && this.I == aVar.I && this.F == aVar.F && this.f14951x == aVar.f14951x && this.f14953z == aVar.f14953z && this.f14952y == aVar.f14952y && this.H == aVar.H && this.G == aVar.G && this.T == aVar.T && this.f14939k == aVar.f14939k && this.f14943o == aVar.f14943o && this.f14936g == aVar.f14936g && this.f14935f == aVar.f14935f && this.f14938j == aVar.f14938j && this.f14947s == aVar.f14947s && this.L == aVar.L && Arrays.equals(this.d, aVar.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        byte[] bArr = this.d;
        if (bArr != null) {
            i10 = Arrays.hashCode(bArr);
        } else {
            i10 = 0;
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((i10 * 31) + this.e) * 31) + this.f14935f) * 31) + this.f14936g) * 31) + this.h) * 31) + this.f14937i) * 31) + (this.f14938j ? 1 : 0)) * 31) + (this.f14939k ? 1 : 0)) * 31) + this.f14940l) * 31) + this.f14941m) * 31) + this.f14942n) * 31) + this.f14943o) * 31) + this.f14944p) * 31) + this.f14945q) * 31) + this.f14946r) * 31) + this.f14947s) * 31) + this.f14948t) * 31) + this.f14949u) * 31) + this.v) * 31) + this.f14950w) * 31) + this.f14951x) * 31) + this.f14952y) * 31) + this.f14953z) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + this.D) * 31) + (this.E ? 1 : 0)) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.I) * 31) + this.J) * 31) + this.K) * 31) + this.L) * 31) + this.M) * 31) + this.N) * 31) + this.O) * 31) + this.P) * 31) + this.Q) * 31) + this.R) * 31) + this.S) * 31) + (this.T ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioSpecificConfig{configBytes=");
        sb2.append(e5.b.c(0, this.d));
        sb2.append(", audioObjectType=");
        sb2.append(this.e);
        sb2.append(" (");
        Integer valueOf = Integer.valueOf(this.e);
        HashMap hashMap = V;
        sb2.append((String) hashMap.get(valueOf));
        sb2.append("), samplingFrequencyIndex=");
        sb2.append(this.f14935f);
        sb2.append(" (");
        Integer valueOf2 = Integer.valueOf(this.f14935f);
        HashMap hashMap2 = U;
        sb2.append(hashMap2.get(valueOf2));
        sb2.append("), samplingFrequency=");
        sb2.append(this.f14936g);
        sb2.append(", channelConfiguration=");
        sb2.append(this.h);
        if (this.f14937i > 0) {
            sb2.append(", extensionAudioObjectType=");
            sb2.append(this.f14937i);
            sb2.append(" (");
            sb2.append((String) hashMap.get(Integer.valueOf(this.f14937i)));
            sb2.append("), sbrPresentFlag=");
            sb2.append(this.f14938j);
            sb2.append(", psPresentFlag=");
            sb2.append(this.f14939k);
            sb2.append(", extensionSamplingFrequencyIndex=");
            sb2.append(this.f14940l);
            sb2.append(" (");
            sb2.append(hashMap2.get(Integer.valueOf(this.f14940l)));
            sb2.append("), extensionSamplingFrequency=");
            sb2.append(this.f14941m);
            sb2.append(", extensionChannelConfiguration=");
            sb2.append(this.f14942n);
        }
        sb2.append(", syncExtensionType=");
        sb2.append(this.f14947s);
        if (this.E) {
            sb2.append(", frameLengthFlag=");
            sb2.append(this.f14948t);
            sb2.append(", dependsOnCoreCoder=");
            sb2.append(this.f14949u);
            sb2.append(", coreCoderDelay=");
            sb2.append(this.v);
            sb2.append(", extensionFlag=");
            sb2.append(this.f14950w);
            sb2.append(", layerNr=");
            sb2.append(this.f14951x);
            sb2.append(", numOfSubFrame=");
            sb2.append(this.f14952y);
            sb2.append(", layer_length=");
            sb2.append(this.f14953z);
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
