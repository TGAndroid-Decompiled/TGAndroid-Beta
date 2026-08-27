package o3;

import d5.g0;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import p8.l;
import p8.l0;
import p8.w;
import p8.x;
import p8.z;

public final class f implements a {

    public final z f19187a;

    public final int f19188b;

    public f(int i10, l0 l0Var) {
        this.f19188b = i10;
        this.f19187a = l0Var;
    }

    public static f b(int i10, d5.z zVar) {
        String str;
        a gVar;
        String str2;
        int i11 = 4;
        l.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i12 = zVar.f4860c;
        int i13 = 0;
        int i14 = -2;
        int i15 = 0;
        while (zVar.a() > 8) {
            int iG = zVar.g();
            int iG2 = zVar.f4859b + zVar.g();
            zVar.B(iG2);
            if (iG != 1414744396) {
                d dVar = null;
                switch (iG) {
                    case 1718776947:
                        if (i14 != 2) {
                            if (i14 == 1) {
                                int iK = zVar.k();
                                if (iK == 1) {
                                    str = "audio/raw";
                                } else if (iK == 85) {
                                    str = "audio/mpeg";
                                } else if (iK == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iK != 8192) {
                                    str = iK != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iK2 = zVar.k();
                                    int iG3 = zVar.g();
                                    zVar.D(6);
                                    int iU = g0.u(zVar.w());
                                    int iK3 = zVar.k();
                                    byte[] bArr = new byte[iK3];
                                    zVar.c(i13, iK3, bArr);
                                    s0 s0Var = new s0();
                                    s0Var.f8135o = str;
                                    s0Var.B = iK2;
                                    s0Var.C = iG3;
                                    if ("audio/raw".equals(str) && iU != 0) {
                                        s0Var.D = iU;
                                    }
                                    if ("audio/mp4a-latm".equals(str) && iK3 > 0) {
                                        s0Var.f8137q = z.y(bArr);
                                    }
                                    gVar = new g(new t0(s0Var));
                                } else {
                                    com.google.android.recaptcha.internal.a.s(iK, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                }
                            } else {
                                d5.a.K("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + g0.B(i14));
                            }
                            gVar = dVar;
                            break;
                        } else {
                            zVar.D(i11);
                            int iG4 = zVar.g();
                            int iG5 = zVar.g();
                            zVar.D(i11);
                            int iG6 = zVar.g();
                            switch (iG6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                s0 s0Var2 = new s0();
                                s0Var2.f8140t = iG4;
                                s0Var2.f8141u = iG5;
                                s0Var2.f8135o = str2;
                                gVar = new g(new t0(s0Var2));
                            } else {
                                com.google.android.recaptcha.internal.a.s(iG6, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int iG7 = zVar.g();
                        zVar.D(8);
                        int iG8 = zVar.g();
                        int iG9 = zVar.g();
                        zVar.D(i11);
                        zVar.g();
                        zVar.D(12);
                        gVar = new c(iG7, iG8, iG9);
                        break;
                    case 1752331379:
                        int iG10 = zVar.g();
                        zVar.D(12);
                        zVar.g();
                        int iG11 = zVar.g();
                        int iG12 = zVar.g();
                        zVar.D(i11);
                        int iG13 = zVar.g();
                        int iG14 = zVar.g();
                        zVar.D(8);
                        dVar = new d(iG10, iG11, iG12, iG13, iG14);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(zVar.p(zVar.a(), o8.d.f19363c));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            } else {
                gVar = b(zVar.g(), zVar);
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i16 = ((d) gVar).f19173a;
                    if (i16 == 1935960438) {
                        i14 = 2;
                    } else if (i16 == 1935963489) {
                        i14 = 1;
                    } else if (i16 != 1937012852) {
                        d5.a.K("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i16));
                        i14 = -1;
                    } else {
                        i14 = 3;
                    }
                }
                int i17 = i15 + 1;
                if (objArrCopyOf.length < i17) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, w.d(objArrCopyOf.length, i17));
                }
                objArrCopyOf[i15] = gVar;
                i15 = i17;
            }
            zVar.C(iG2);
            zVar.B(i12);
            i11 = 4;
            i13 = 0;
        }
        return new f(i10, z.s(i15, objArrCopyOf));
    }

    public final a a(Class cls) {
        x xVarListIterator = this.f19187a.listIterator(0);
        while (xVarListIterator.hasNext()) {
            a aVar = (a) xVarListIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override
    public final int getType() {
        return this.f19188b;
    }
}
