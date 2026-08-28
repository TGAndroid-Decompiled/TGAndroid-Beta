package o3;

import d5.f0;
import d5.y;
import h3.s0;
import h3.t0;
import java.util.Arrays;
import o8.l;
import o8.l0;
import o8.w;
import o8.x;
import o8.z;
public final class f implements a {
    public final z f18840a;
    public final int f18841b;

    public f(int i9, l0 l0Var) {
        this.f18841b = i9;
        this.f18840a = l0Var;
    }

    public static f b(int i9, y yVar) {
        String str;
        a gVar;
        String str2;
        int i10 = 4;
        l.a(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i11 = yVar.f4412c;
        int i12 = 0;
        int i13 = -2;
        int i14 = 0;
        while (yVar.a() > 8) {
            int g10 = yVar.g();
            int g11 = yVar.f4411b + yVar.g();
            yVar.B(g11);
            if (g10 == 1414744396) {
                gVar = b(yVar.g(), yVar);
            } else {
                d dVar = null;
                switch (g10) {
                    case 1718776947:
                        if (i13 == 2) {
                            yVar.D(i10);
                            int g12 = yVar.g();
                            int g13 = yVar.g();
                            yVar.D(i10);
                            int g14 = yVar.g();
                            switch (g14) {
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
                            if (str2 == null) {
                                e2.c.t(g14, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            } else {
                                s0 s0Var = new s0();
                                s0Var.f9710t = g12;
                                s0Var.f9711u = g13;
                                s0Var.f9705o = str2;
                                gVar = new g(new t0(s0Var));
                                break;
                            }
                        } else {
                            if (i13 == 1) {
                                int k10 = yVar.k();
                                if (k10 == 1) {
                                    str = "audio/raw";
                                } else if (k10 != 85) {
                                    if (k10 == 255) {
                                        str = "audio/mp4a-latm";
                                    } else if (k10 != 8192) {
                                        if (k10 != 8193) {
                                            str = null;
                                        } else {
                                            str = "audio/vnd.dts";
                                        }
                                    } else {
                                        str = "audio/ac3";
                                    }
                                } else {
                                    str = "audio/mpeg";
                                }
                                if (str == null) {
                                    e2.c.t(k10, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                } else {
                                    int k11 = yVar.k();
                                    int g15 = yVar.g();
                                    yVar.D(6);
                                    int u10 = f0.u(yVar.w());
                                    int k12 = yVar.k();
                                    byte[] bArr = new byte[k12];
                                    yVar.c(i12, k12, bArr);
                                    s0 s0Var2 = new s0();
                                    s0Var2.f9705o = str;
                                    s0Var2.B = k11;
                                    s0Var2.C = g15;
                                    if ("audio/raw".equals(str) && u10 != 0) {
                                        s0Var2.D = u10;
                                    }
                                    if ("audio/mp4a-latm".equals(str) && k12 > 0) {
                                        s0Var2.f9707q = z.y(bArr);
                                    }
                                    gVar = new g(new t0(s0Var2));
                                    break;
                                }
                            } else {
                                d5.a.K("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + f0.B(i13));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int g16 = yVar.g();
                        yVar.D(8);
                        int g17 = yVar.g();
                        int g18 = yVar.g();
                        yVar.D(i10);
                        yVar.g();
                        yVar.D(12);
                        gVar = new c(g16, g17, g18);
                        break;
                    case 1752331379:
                        int g19 = yVar.g();
                        yVar.D(12);
                        yVar.g();
                        int g20 = yVar.g();
                        int g21 = yVar.g();
                        yVar.D(i10);
                        int g22 = yVar.g();
                        int g23 = yVar.g();
                        yVar.D(8);
                        dVar = new d(g19, g20, g21, g22, g23);
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(yVar.p(yVar.a(), n8.d.f18513c));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    int i15 = ((d) gVar).f18826a;
                    if (i15 != 1935960438) {
                        if (i15 != 1935963489) {
                            if (i15 != 1937012852) {
                                d5.a.K("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i15));
                                i13 = -1;
                            } else {
                                i13 = 3;
                            }
                        } else {
                            i13 = 1;
                        }
                    } else {
                        i13 = 2;
                    }
                }
                int i16 = i14 + 1;
                if (objArr.length < i16) {
                    objArr = Arrays.copyOf(objArr, w.d(objArr.length, i16));
                }
                objArr[i14] = gVar;
                i14 = i16;
            }
            yVar.C(g11);
            yVar.B(i11);
            i10 = 4;
            i12 = 0;
        }
        return new f(i9, z.s(i14, objArr));
    }

    public final a a(Class cls) {
        x listIterator = this.f18840a.listIterator(0);
        while (listIterator.hasNext()) {
            a aVar = (a) listIterator.next();
            if (aVar.getClass() == cls) {
                return aVar;
            }
        }
        return null;
    }

    @Override
    public final int getType() {
        return this.f18841b;
    }
}
