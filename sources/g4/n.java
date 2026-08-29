package g4;

import android.os.Parcel;
import android.os.Parcelable;
import f5.d0;
import j3.g1;
import j7.l1;
import java.util.ArrayList;
import q8.l0;
import q8.z;
public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new d6.d(28);
    public final String f7015b;
    public final z f7016c;

    public n(String str, String str2, l0 l0Var) {
        super(str);
        f5.a.f(!l0Var.isEmpty());
        this.f7015b = str2;
        z u10 = z.u(l0Var);
        this.f7016c = u10;
        String str3 = (String) u10.get(0);
    }

    public static ArrayList a(String str) {
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (d0.a(this.f7006a, nVar.f7006a) && d0.a(this.f7015b, nVar.f7015b) && this.f7016c.equals(nVar.f7016c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int f9 = l1.f(527, 31, this.f7006a);
        String str = this.f7015b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f7016c.hashCode() + ((f9 + i10) * 31);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        char c3;
        Integer num;
        String str = this.f7006a;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c3 = '\b';
                    break;
                }
                c3 = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c3 = '\t';
                    break;
                }
                c3 = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c3 = '\n';
                    break;
                }
                c3 = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c3 = 11;
                    break;
                }
                c3 = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c3 = '\f';
                    break;
                }
                c3 = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c3 = '\r';
                    break;
                }
                c3 = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c3 = 14;
                    break;
                }
                c3 = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c3 = 15;
                    break;
                }
                c3 = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c3 = 16;
                    break;
                }
                c3 = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c3 = 17;
                    break;
                }
                c3 = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c3 = 18;
                    break;
                }
                c3 = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c3 = 19;
                    break;
                }
                c3 = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c3 = 20;
                    break;
                }
                c3 = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c3 = 21;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        z zVar = this.f7016c;
        try {
            switch (c3) {
                case 0:
                case '\n':
                    g1Var.f10450c = (CharSequence) zVar.get(0);
                    return;
                case 1:
                case 11:
                    g1Var.f10469y = (CharSequence) zVar.get(0);
                    return;
                case 2:
                case '\f':
                    String str2 = (String) zVar.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    g1Var.f10464s = Integer.valueOf(parseInt);
                    g1Var.f10465t = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 17:
                    g1Var.f10449b = (CharSequence) zVar.get(0);
                    return;
                case 4:
                case 18:
                    g1Var.d = (CharSequence) zVar.get(0);
                    return;
                case 5:
                case 19:
                    g1Var.f10470z = (CharSequence) zVar.get(0);
                    return;
                case 6:
                case 20:
                    int i10 = d0.f6579a;
                    String[] split = ((String) zVar.get(0)).split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    g1Var.f10458m = Integer.valueOf(parseInt3);
                    g1Var.f10459n = num;
                    return;
                case 7:
                case 16:
                    g1Var.f10448a = (CharSequence) zVar.get(0);
                    return;
                case '\b':
                case 15:
                    g1Var.f10468x = (CharSequence) zVar.get(0);
                    return;
                case '\t':
                case 21:
                    g1Var.f10463r = Integer.valueOf(Integer.parseInt((String) zVar.get(0)));
                    return;
                case '\r':
                    ArrayList a2 = a((String) zVar.get(0));
                    int size = a2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                g1Var.f10465t = (Integer) a2.get(2);
                            } else {
                                return;
                            }
                        }
                        g1Var.f10464s = (Integer) a2.get(1);
                    }
                    g1Var.f10463r = (Integer) a2.get(0);
                    return;
                case 14:
                    ArrayList a10 = a((String) zVar.get(0));
                    int size2 = a10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                g1Var.f10467w = (Integer) a10.get(2);
                            } else {
                                return;
                            }
                        }
                        g1Var.v = (Integer) a10.get(1);
                    }
                    g1Var.f10466u = (Integer) a10.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override
    public final String toString() {
        return this.f7006a + ": description=" + this.f7015b + ": values=" + this.f7016c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7006a);
        parcel.writeString(this.f7015b);
        parcel.writeStringArray((String[]) this.f7016c.toArray(new String[0]));
    }
}
