package j4;

import android.os.Parcel;
import android.os.Parcelable;
import h5.d0;
import j3.d1;
import java.util.ArrayList;
import kf.k0;
import s8.i0;
import s8.v;
public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new f8.o(21);
    public final String f8914b;
    public final v f8915c;

    public n(String str, String str2, i0 i0Var) {
        super(str);
        h5.a.f(!i0Var.isEmpty());
        this.f8914b = str2;
        v t6 = v.t(i0Var);
        this.f8915c = t6;
        String str3 = (String) t6.get(0);
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

    @Override
    public final void c(d1 d1Var) {
        char c3;
        Integer num;
        String str = this.f8906a;
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
        v vVar = this.f8915c;
        try {
            switch (c3) {
                case 0:
                case '\n':
                    d1Var.f8449c = (CharSequence) vVar.get(0);
                    return;
                case 1:
                case 11:
                    d1Var.f8467y = (CharSequence) vVar.get(0);
                    return;
                case 2:
                case '\f':
                    String str2 = (String) vVar.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    d1Var.f8462s = Integer.valueOf(parseInt);
                    d1Var.f8463t = Integer.valueOf(parseInt2);
                    return;
                case 3:
                case 17:
                    d1Var.f8448b = (CharSequence) vVar.get(0);
                    return;
                case 4:
                case 18:
                    d1Var.d = (CharSequence) vVar.get(0);
                    return;
                case 5:
                case 19:
                    d1Var.f8468z = (CharSequence) vVar.get(0);
                    return;
                case 6:
                case 20:
                    int i10 = d0.f6924a;
                    String[] split = ((String) vVar.get(0)).split("/", -1);
                    int parseInt3 = Integer.parseInt(split[0]);
                    if (split.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(split[1]));
                    } else {
                        num = null;
                    }
                    d1Var.f8456m = Integer.valueOf(parseInt3);
                    d1Var.f8457n = num;
                    return;
                case 7:
                case 16:
                    d1Var.f8447a = (CharSequence) vVar.get(0);
                    return;
                case '\b':
                case 15:
                    d1Var.f8466x = (CharSequence) vVar.get(0);
                    return;
                case '\t':
                case 21:
                    d1Var.f8461r = Integer.valueOf(Integer.parseInt((String) vVar.get(0)));
                    return;
                case '\r':
                    ArrayList a2 = a((String) vVar.get(0));
                    int size = a2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                d1Var.f8463t = (Integer) a2.get(2);
                            } else {
                                return;
                            }
                        }
                        d1Var.f8462s = (Integer) a2.get(1);
                    }
                    d1Var.f8461r = (Integer) a2.get(0);
                    return;
                case 14:
                    ArrayList a10 = a((String) vVar.get(0));
                    int size2 = a10.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                d1Var.f8465w = (Integer) a10.get(2);
                            } else {
                                return;
                            }
                        }
                        d1Var.v = (Integer) a10.get(1);
                    }
                    d1Var.f8464u = (Integer) a10.get(0);
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n.class == obj.getClass()) {
            n nVar = (n) obj;
            if (d0.a(this.f8906a, nVar.f8906a) && d0.a(this.f8914b, nVar.f8914b) && this.f8915c.equals(nVar.f8915c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int e = k0.e(527, 31, this.f8906a);
        String str = this.f8914b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return this.f8915c.hashCode() + ((e + i10) * 31);
    }

    @Override
    public final String toString() {
        return this.f8906a + ": description=" + this.f8914b + ": values=" + this.f8915c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f8906a);
        parcel.writeString(this.f8914b);
        parcel.writeStringArray((String[]) this.f8915c.toArray(new String[0]));
    }
}
