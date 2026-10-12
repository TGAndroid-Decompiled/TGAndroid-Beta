package e3;

import b2.w;
import b2.w0;
import e2.m0;
import e2.x;
import e9.h0;
import e9.l0;
import e9.n0;
import e9.s;
import e9.x1;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class f implements a {
    public final n0 f8450a;
    public final int f8451b;

    public f(int i10, x1 x1Var) {
        this.f8451b = i10;
        this.f8450a = x1Var;
    }

    public static f b(int i10, x xVar) {
        String str;
        int i11;
        a gVar;
        String str2;
        int i12 = 4;
        s.f(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i13 = xVar.f8413c;
        int i14 = -2;
        int i15 = 0;
        while (xVar.a() > 8) {
            int o10 = xVar.o();
            int o11 = xVar.f8412b + xVar.o();
            xVar.M(o11);
            if (o10 == 1414744396) {
                gVar = b(xVar.o(), xVar);
            } else {
                d dVar = null;
                switch (o10) {
                    case 1718776947:
                        if (i14 == 2) {
                            xVar.O(i12);
                            int o12 = xVar.o();
                            int o13 = xVar.o();
                            xVar.O(i12);
                            int o14 = xVar.o();
                            switch (o14) {
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
                                a1.g.x(o14, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            } else {
                                w wVar = new w();
                                wVar.f2472y = o12;
                                wVar.f2473z = o13;
                                wVar.f2466r = w0.n(str2);
                                gVar = new g(new b2.x(wVar));
                                break;
                            }
                        } else {
                            if (i14 == 1) {
                                int t10 = xVar.t();
                                if (t10 == 1) {
                                    str = "audio/raw";
                                } else if (t10 != 85) {
                                    if (t10 == 255) {
                                        str = "audio/mp4a-latm";
                                    } else if (t10 != 8192) {
                                        if (t10 != 8193) {
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
                                    a1.g.x(t10, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                } else {
                                    int t11 = xVar.t();
                                    int o15 = xVar.o();
                                    xVar.O(6);
                                    int t12 = xVar.t();
                                    String str3 = m0.f8372a;
                                    int D = m0.D(t12, ByteOrder.LITTLE_ENDIAN);
                                    if (xVar.a() > 0) {
                                        i11 = xVar.t();
                                    } else {
                                        i11 = 0;
                                    }
                                    w wVar2 = new w();
                                    wVar2.f2466r = w0.n(str);
                                    wVar2.J = t11;
                                    wVar2.K = o15;
                                    if (str.equals("audio/raw") && D != 0) {
                                        wVar2.L = D;
                                    }
                                    if (str.equals("audio/mp4a-latm") && i11 > 0) {
                                        byte[] bArr = new byte[i11];
                                        xVar.k(0, i11, bArr);
                                        wVar2.f2469u = n0.y(bArr);
                                    }
                                    gVar = new g(new b2.x(wVar2));
                                    break;
                                }
                            } else {
                                e2.a.l("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + m0.I(i14));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int o16 = xVar.o();
                        xVar.O(8);
                        int o17 = xVar.o();
                        int o18 = xVar.o();
                        xVar.O(i12);
                        xVar.o();
                        xVar.O(12);
                        gVar = new c(o16, o17, o18);
                        break;
                    case 1752331379:
                        int o19 = xVar.o();
                        xVar.O(12);
                        xVar.o();
                        int o20 = xVar.o();
                        int o21 = xVar.o();
                        xVar.O(i12);
                        int o22 = xVar.o();
                        int o23 = xVar.o();
                        xVar.O(i12);
                        dVar = new d(o19, o20, o21, o22, o23, xVar.o());
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
                    i14 = ((d) gVar).a();
                }
                int i16 = i15 + 1;
                int b10 = h0.b(objArr.length, i16);
                if (b10 > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b10);
                }
                objArr[i15] = gVar;
                i15 = i16;
            }
            xVar.N(o11);
            xVar.M(i13);
            i12 = 4;
        }
        return new f(i10, n0.s(i15, objArr));
    }

    public final a a(Class cls) {
        l0 listIterator = this.f8450a.listIterator(0);
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
        return this.f8451b;
    }
}
