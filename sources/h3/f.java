package h3;

import e2.s0;
import e2.t;
import e2.u;
import h2.m0;
import h2.x;
import h9.c0;
import h9.g0;
import h9.i0;
import h9.o;
import h9.t1;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class f implements a {
    public final i0 f14206a;
    public final int f14207b;

    public f(int i7, t1 t1Var) {
        this.f14207b = i7;
        this.f14206a = t1Var;
    }

    public static f b(int i7, x xVar) {
        String str;
        int i10;
        a gVar;
        String str2;
        int i11 = 4;
        o.g(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i12 = xVar.f14166c;
        int i13 = -2;
        int i14 = 0;
        while (xVar.a() > 8) {
            int o4 = xVar.o();
            int o10 = xVar.f14165b + xVar.o();
            xVar.M(o10);
            if (o4 == 1414744396) {
                gVar = b(xVar.o(), xVar);
            } else {
                d dVar = null;
                switch (o4) {
                    case 1718776947:
                        if (i13 == 2) {
                            xVar.O(i11);
                            int o11 = xVar.o();
                            int o12 = xVar.o();
                            xVar.O(i11);
                            int o13 = xVar.o();
                            switch (o13) {
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
                                com.google.android.recaptcha.internal.a.o(o13, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            } else {
                                t tVar = new t();
                                tVar.f10574y = o11;
                                tVar.f10575z = o12;
                                tVar.f10568r = s0.n(str2);
                                gVar = new g(new u(tVar));
                                break;
                            }
                        } else {
                            if (i13 == 1) {
                                int t6 = xVar.t();
                                if (t6 == 1) {
                                    str = "audio/raw";
                                } else if (t6 != 85) {
                                    if (t6 == 255) {
                                        str = "audio/mp4a-latm";
                                    } else if (t6 != 8192) {
                                        if (t6 != 8193) {
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
                                    com.google.android.recaptcha.internal.a.o(t6, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                } else {
                                    int t10 = xVar.t();
                                    int o14 = xVar.o();
                                    xVar.O(6);
                                    int t11 = xVar.t();
                                    String str3 = m0.f14114a;
                                    int D = m0.D(t11, ByteOrder.LITTLE_ENDIAN);
                                    if (xVar.a() > 0) {
                                        i10 = xVar.t();
                                    } else {
                                        i10 = 0;
                                    }
                                    t tVar2 = new t();
                                    tVar2.f10568r = s0.n(str);
                                    tVar2.J = t10;
                                    tVar2.K = o14;
                                    if (str.equals("audio/raw") && D != 0) {
                                        tVar2.L = D;
                                    }
                                    if (str.equals("audio/mp4a-latm") && i10 > 0) {
                                        byte[] bArr = new byte[i10];
                                        xVar.k(0, i10, bArr);
                                        tVar2.f10571u = i0.u(bArr);
                                    }
                                    gVar = new g(new u(tVar2));
                                    break;
                                }
                            } else {
                                h2.a.l("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + m0.I(i13));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int o15 = xVar.o();
                        xVar.O(8);
                        int o16 = xVar.o();
                        int o17 = xVar.o();
                        xVar.O(i11);
                        xVar.o();
                        xVar.O(12);
                        gVar = new c(o15, o16, o17);
                        break;
                    case 1752331379:
                        int o18 = xVar.o();
                        xVar.O(12);
                        xVar.o();
                        int o19 = xVar.o();
                        int o20 = xVar.o();
                        xVar.O(i11);
                        int o21 = xVar.o();
                        int o22 = xVar.o();
                        xVar.O(i11);
                        dVar = new d(o18, o19, o20, o21, o22, xVar.o());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(xVar.y(xVar.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        gVar = dVar;
                        break;
                }
            }
            if (gVar != null) {
                if (gVar.getType() == 1752331379) {
                    i13 = ((d) gVar).a();
                }
                int i15 = i14 + 1;
                int b10 = c0.b(objArr.length, i15);
                if (b10 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b10);
                }
                objArr[i14] = gVar;
                i14 = i15;
            }
            xVar.N(o10);
            xVar.M(i12);
            i11 = 4;
        }
        return new f(i7, i0.o(i14, objArr));
    }

    public final a a(Class cls) {
        g0 listIterator = this.f14206a.listIterator(0);
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
        return this.f14207b;
    }
}
