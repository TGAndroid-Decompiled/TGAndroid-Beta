package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class b56 implements nc0 {
    public final w59 a;
    public final int b;

    public b56(int i, w59 w59Var) {
        this.b = i;
        this.a = w59Var;
    }

    public static b56 b(int i, xu7 xu7Var) {
        String str;
        int i2;
        nc0 s8bVar;
        String str2;
        int i3 = 4;
        krd.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = xu7Var.c;
        int i5 = -2;
        int i6 = 0;
        while (xu7Var.a() > 8) {
            int o = xu7Var.o();
            int o2 = xu7Var.b + xu7Var.o();
            xu7Var.M(o2);
            if (o == 1414744396) {
                s8bVar = b(xu7Var.o(), xu7Var);
            } else {
                sc0 sc0Var = null;
                switch (o) {
                    case 1718776947:
                        if (i5 == 2) {
                            xu7Var.O(i3);
                            int o3 = xu7Var.o();
                            int o4 = xu7Var.o();
                            xu7Var.O(i3);
                            int o5 = xu7Var.o();
                            switch (o5) {
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
                                b00.o(o5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                s8bVar = sc0Var;
                                break;
                            } else {
                                em4 em4Var = new em4();
                                em4Var.z = o3;
                                em4Var.A = o4;
                                em4Var.s = ud7.n(str2);
                                s8bVar = new s8b(new fm4(em4Var));
                                break;
                            }
                        } else {
                            if (i5 == 1) {
                                int t = xu7Var.t();
                                if (t == 1) {
                                    str = "audio/raw";
                                } else if (t != 85) {
                                    if (t == 255) {
                                        str = "audio/mp4a-latm";
                                    } else if (t != 8192) {
                                        if (t != 8193) {
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
                                    b00.o(t, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                } else {
                                    int t2 = xu7Var.t();
                                    int o6 = xu7Var.o();
                                    xu7Var.O(6);
                                    int t3 = xu7Var.t();
                                    String str3 = g8c.a;
                                    int F = g8c.F(t3, ByteOrder.LITTLE_ENDIAN);
                                    if (xu7Var.a() > 0) {
                                        i2 = xu7Var.t();
                                    } else {
                                        i2 = 0;
                                    }
                                    em4 em4Var2 = new em4();
                                    em4Var2.s = ud7.n(str);
                                    em4Var2.M = t2;
                                    em4Var2.O = o6;
                                    if (str.equals("audio/raw") && F != 0) {
                                        em4Var2.P = F;
                                    }
                                    if (str.equals("audio/mp4a-latm") && i2 > 0) {
                                        byte[] bArr = new byte[i2];
                                        xu7Var.k(0, i2, bArr);
                                        em4Var2.v = mm5.u(bArr);
                                    }
                                    s8bVar = new s8b(new fm4(em4Var2));
                                    break;
                                }
                            } else {
                                lad.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(g8c.K(i5)));
                            }
                            s8bVar = sc0Var;
                        }
                    case 1751742049:
                        int o7 = xu7Var.o();
                        xu7Var.O(8);
                        int o8 = xu7Var.o();
                        int o9 = xu7Var.o();
                        xu7Var.O(i3);
                        xu7Var.o();
                        xu7Var.O(12);
                        s8bVar = new rc0(o7, o8, o9);
                        break;
                    case 1752331379:
                        int o10 = xu7Var.o();
                        xu7Var.O(12);
                        xu7Var.o();
                        int o11 = xu7Var.o();
                        int o12 = xu7Var.o();
                        xu7Var.O(i3);
                        int o13 = xu7Var.o();
                        int o14 = xu7Var.o();
                        xu7Var.O(i3);
                        sc0Var = new sc0(o10, o11, o12, o13, o14, xu7Var.o());
                        s8bVar = sc0Var;
                        break;
                    case 1852994675:
                        s8bVar = new u8b(xu7Var.y(xu7Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        s8bVar = sc0Var;
                        break;
                }
            }
            if (s8bVar != null) {
                if (s8bVar.getType() == 1752331379) {
                    i5 = ((sc0) s8bVar).a();
                }
                int i7 = i6 + 1;
                int b = fm5.b(objArr.length, i7);
                if (b > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b);
                }
                objArr[i6] = s8bVar;
                i6 = i7;
            }
            xu7Var.N(o2);
            xu7Var.M(i4);
            i3 = 4;
        }
        return new b56(i, mm5.o(i6, objArr));
    }

    public final nc0 a(Class cls) {
        km5 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            nc0 nc0Var = (nc0) listIterator.next();
            if (nc0Var.getClass() == cls) {
                return nc0Var;
            }
        }
        return null;
    }

    @Override
    public final int getType() {
        return this.b;
    }
}
