package defpackage;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
public final class b76 implements nd0 {
    public final y79 a;
    public final int b;

    public b76(int i, y79 y79Var) {
        this.b = i;
        this.a = y79Var;
    }

    public static b76 b(int i, yw7 yw7Var) {
        String str;
        int i2;
        nd0 uabVar;
        String str2;
        int i3 = 4;
        ntd.b(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i4 = yw7Var.c;
        int i5 = -2;
        int i6 = 0;
        while (yw7Var.a() > 8) {
            int o = yw7Var.o();
            int o2 = yw7Var.b + yw7Var.o();
            yw7Var.M(o2);
            if (o == 1414744396) {
                uabVar = b(yw7Var.o(), yw7Var);
            } else {
                sd0 sd0Var = null;
                switch (o) {
                    case 1718776947:
                        if (i5 == 2) {
                            yw7Var.O(i3);
                            int o3 = yw7Var.o();
                            int o4 = yw7Var.o();
                            yw7Var.O(i3);
                            int o5 = yw7Var.o();
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
                                b10.o(o5, "Ignoring track with unsupported compression ", "StreamFormatChunk");
                                uabVar = sd0Var;
                                break;
                            } else {
                                fo4 fo4Var = new fo4();
                                fo4Var.z = o3;
                                fo4Var.A = o4;
                                fo4Var.s = wf7.n(str2);
                                uabVar = new uab(new go4(fo4Var));
                                break;
                            }
                        } else {
                            if (i5 == 1) {
                                int t = yw7Var.t();
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
                                    b10.o(t, "Ignoring track with unsupported format tag ", "StreamFormatChunk");
                                } else {
                                    int t2 = yw7Var.t();
                                    int o6 = yw7Var.o();
                                    yw7Var.O(6);
                                    int t3 = yw7Var.t();
                                    String str3 = hac.a;
                                    int F = hac.F(t3, ByteOrder.LITTLE_ENDIAN);
                                    if (yw7Var.a() > 0) {
                                        i2 = yw7Var.t();
                                    } else {
                                        i2 = 0;
                                    }
                                    fo4 fo4Var2 = new fo4();
                                    fo4Var2.s = wf7.n(str);
                                    fo4Var2.M = t2;
                                    fo4Var2.O = o6;
                                    if (str.equals("audio/raw") && F != 0) {
                                        fo4Var2.P = F;
                                    }
                                    if (str.equals("audio/mp4a-latm") && i2 > 0) {
                                        byte[] bArr = new byte[i2];
                                        yw7Var.k(0, i2, bArr);
                                        fo4Var2.v = mo5.u(bArr);
                                    }
                                    uabVar = new uab(new go4(fo4Var2));
                                    break;
                                }
                            } else {
                                ncd.f("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(hac.K(i5)));
                            }
                            uabVar = sd0Var;
                        }
                    case 1751742049:
                        int o7 = yw7Var.o();
                        yw7Var.O(8);
                        int o8 = yw7Var.o();
                        int o9 = yw7Var.o();
                        yw7Var.O(i3);
                        yw7Var.o();
                        yw7Var.O(12);
                        uabVar = new rd0(o7, o8, o9);
                        break;
                    case 1752331379:
                        int o10 = yw7Var.o();
                        yw7Var.O(12);
                        yw7Var.o();
                        int o11 = yw7Var.o();
                        int o12 = yw7Var.o();
                        yw7Var.O(i3);
                        int o13 = yw7Var.o();
                        int o14 = yw7Var.o();
                        yw7Var.O(i3);
                        sd0Var = new sd0(o10, o11, o12, o13, o14, yw7Var.o());
                        uabVar = sd0Var;
                        break;
                    case 1852994675:
                        uabVar = new wab(yw7Var.y(yw7Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        uabVar = sd0Var;
                        break;
                }
            }
            if (uabVar != null) {
                if (uabVar.getType() == 1752331379) {
                    i5 = ((sd0) uabVar).a();
                }
                int i7 = i6 + 1;
                int b = fo5.b(objArr.length, i7);
                if (b > objArr.length) {
                    objArr = Arrays.copyOf(objArr, b);
                }
                objArr[i6] = uabVar;
                i6 = i7;
            }
            yw7Var.N(o2);
            yw7Var.M(i4);
            i3 = 4;
        }
        return new b76(i, mo5.o(i6, objArr));
    }

    public final nd0 a(Class cls) {
        ko5 listIterator = this.a.listIterator(0);
        while (listIterator.hasNext()) {
            nd0 nd0Var = (nd0) listIterator.next();
            if (nd0Var.getClass() == cls) {
                return nd0Var;
            }
        }
        return null;
    }

    @Override
    public final int getType() {
        return this.b;
    }
}
