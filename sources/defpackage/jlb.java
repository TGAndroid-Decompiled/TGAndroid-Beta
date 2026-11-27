package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
public final class jlb extends wl5 {
    public final String b;
    public final po5 c;

    public jlb(String str, String str2, j99 j99Var) {
        super(str);
        yve.f(!j99Var.isEmpty());
        this.b = str2;
        po5 q = po5.q(j99Var);
        this.c = q;
        String str3 = (String) q.get(0);
    }

    public static ArrayList d(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            } else {
                if (str.length() >= 4) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                }
                return arrayList;
            }
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    @Override
    public final void b(lt6 lt6Var) {
        char c;
        String str = this.a;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569358:
                if (str.equals("TCON")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2581856:
                if (str.equals("TPOS")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 2584864:
                if (str.equals("TSST")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 24;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        Integer num = null;
        po5 po5Var = this.c;
        try {
            switch (c) {
                case 0:
                case '\n':
                    lt6Var.c = (CharSequence) po5Var.get(0);
                    return;
                case 1:
                case 11:
                    lt6Var.A = (CharSequence) po5Var.get(0);
                    return;
                case 2:
                case '\r':
                    String str2 = (String) po5Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    lt6Var.u = Integer.valueOf(parseInt);
                    lt6Var.v = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 18:
                    lt6Var.b = (CharSequence) po5Var.get(0);
                    return;
                case 4:
                case 19:
                    lt6Var.d = (CharSequence) po5Var.get(0);
                    return;
                case 5:
                case 20:
                    lt6Var.B = (CharSequence) po5Var.get(0);
                    return;
                case 6:
                case 22:
                    String str3 = gcc.a;
                    String[] split = ((String) po5Var.get(0)).split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    }
                    lt6Var.o = Integer.valueOf(parseInt3);
                    lt6Var.p = num;
                    return;
                case 7:
                case 17:
                    lt6Var.a = (CharSequence) po5Var.get(0);
                    return;
                case '\b':
                case 16:
                    lt6Var.z = (CharSequence) po5Var.get(0);
                    return;
                case '\t':
                case 24:
                    lt6Var.t = Integer.valueOf(Integer.parseInt((String) po5Var.get(0)));
                    return;
                case '\f':
                    Integer f = ype.f((String) po5Var.get(0));
                    if (f == null) {
                        lt6Var.F = (CharSequence) po5Var.get(0);
                        return;
                    }
                    String a = xl5.a(f.intValue());
                    if (a != null) {
                        lt6Var.F = a;
                        return;
                    }
                    return;
                case 14:
                    ArrayList d = d((String) po5Var.get(0));
                    int size = d.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                lt6Var.v = (Integer) d.get(2);
                            } else {
                                return;
                            }
                        }
                        lt6Var.u = (Integer) d.get(1);
                    }
                    lt6Var.t = (Integer) d.get(0);
                    return;
                case 15:
                    ArrayList d2 = d((String) po5Var.get(0));
                    int size2 = d2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                lt6Var.y = (Integer) d2.get(2);
                            } else {
                                return;
                            }
                        }
                        lt6Var.x = (Integer) d2.get(1);
                    }
                    lt6Var.w = (Integer) d2.get(0);
                    return;
                case 21:
                    String str4 = gcc.a;
                    String[] split2 = ((String) po5Var.get(0)).split("/", -1);
                    int parseInt4 = Integer.parseInt(split2[0]);
                    if (split2.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split2[1]));
                    }
                    lt6Var.D = Integer.valueOf(parseInt4);
                    lt6Var.E = num;
                    return;
                case 23:
                    lt6Var.C = (CharSequence) po5Var.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && jlb.class == obj.getClass()) {
                jlb jlbVar = (jlb) obj;
                if (this.a.equals(jlbVar.a) && Objects.equals(this.b, jlbVar.b) && this.c.equals(jlbVar.c)) {
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
        int j = bs2.j(527, 31, this.a);
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((j + i) * 31);
    }

    @Override
    public final String toString() {
        return this.a + ": description=" + this.b + ": values=" + this.c;
    }
}
