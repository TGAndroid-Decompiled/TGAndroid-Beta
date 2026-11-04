package g3;

import d2.u;
import d2.u0;
import d2.v;
import g2.n0;
import g2.y;
import g9.c0;
import g9.g0;
import g9.i0;
import g9.o;
import g9.s1;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class f implements a {
    public final i0 f11963a;
    public final int f11964b;

    public f(int i3, s1 s1Var) {
        this.f11964b = i3;
        this.f11963a = s1Var;
    }

    public static f b(int i3, y yVar) {
        String str;
        int i10;
        a gVar;
        String str2;
        int i11 = 4;
        o.g(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i12 = yVar.f11925c;
        int i13 = -2;
        int i14 = 0;
        while (yVar.a() > 8) {
            int o10 = yVar.o();
            int o11 = yVar.f11924b + yVar.o();
            yVar.M(o11);
            if (o10 == 1414744396) {
                gVar = b(yVar.o(), yVar);
            } else {
                d dVar = null;
                switch (o10) {
                    case 1718776947:
                        if (i13 == 2) {
                            yVar.O(i11);
                            int o12 = yVar.o();
                            int o13 = yVar.o();
                            yVar.O(i11);
                            int o14 = yVar.o();
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
                                com.google.android.recaptcha.internal.a.o(o14, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                gVar = dVar;
                                break;
                            } else {
                                u uVar = new u();
                                uVar.f8437y = o12;
                                uVar.f8438z = o13;
                                uVar.f8431r = u0.n(str2);
                                gVar = new g(new v(uVar));
                                break;
                            }
                        } else {
                            if (i13 == 1) {
                                int t10 = yVar.t();
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
                                    com.google.android.recaptcha.internal.a.o(t10, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                } else {
                                    int t11 = yVar.t();
                                    int o15 = yVar.o();
                                    yVar.O(6);
                                    int t12 = yVar.t();
                                    String str3 = n0.f11873a;
                                    int D = n0.D(t12, ByteOrder.LITTLE_ENDIAN);
                                    if (yVar.a() > 0) {
                                        i10 = yVar.t();
                                    } else {
                                        i10 = 0;
                                    }
                                    u uVar2 = new u();
                                    uVar2.f8431r = u0.n(str);
                                    uVar2.J = t11;
                                    uVar2.K = o15;
                                    if (str.equals("audio/raw") && D != 0) {
                                        uVar2.L = D;
                                    }
                                    if (str.equals("audio/mp4a-latm") && i10 > 0) {
                                        byte[] bArr = new byte[i10];
                                        yVar.k(0, i10, bArr);
                                        uVar2.f8434u = i0.u(bArr);
                                    }
                                    gVar = new g(new v(uVar2));
                                    break;
                                }
                            } else {
                                g2.a.l("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + n0.I(i13));
                            }
                            gVar = dVar;
                        }
                    case 1751742049:
                        int o16 = yVar.o();
                        yVar.O(8);
                        int o17 = yVar.o();
                        int o18 = yVar.o();
                        yVar.O(i11);
                        yVar.o();
                        yVar.O(12);
                        gVar = new c(o16, o17, o18);
                        break;
                    case 1752331379:
                        int o19 = yVar.o();
                        yVar.O(12);
                        yVar.o();
                        int o20 = yVar.o();
                        int o21 = yVar.o();
                        yVar.O(i11);
                        int o22 = yVar.o();
                        int o23 = yVar.o();
                        yVar.O(i11);
                        dVar = new d(o19, o20, o21, o22, o23, yVar.o());
                        gVar = dVar;
                        break;
                    case 1852994675:
                        gVar = new h(yVar.y(yVar.a(), StandardCharsets.UTF_8));
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
            yVar.N(o11);
            yVar.M(i12);
            i11 = 4;
        }
        return new f(i3, i0.o(i14, objArr));
    }

    public final a a(Class cls) {
        g0 listIterator = this.f11963a.listIterator(0);
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
        return this.f11964b;
    }
}
