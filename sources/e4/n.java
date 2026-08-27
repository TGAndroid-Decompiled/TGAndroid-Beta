package e4;

import android.os.Parcel;
import android.os.Parcelable;
import d5.g0;
import h3.g1;
import java.util.ArrayList;
import p8.l0;
import p8.z;

public final class n extends j {
    public static final Parcelable.Creator<n> CREATOR = new c8.o(23);

    public final String f5218b;

    public final z f5219c;

    public n(String str, String str2, l0 l0Var) {
        super(str);
        d5.a.f(!l0Var.isEmpty());
        this.f5218b = str2;
        z zVarU = z.u(l0Var);
        this.f5219c = zVarU;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
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
            if (g0.a(this.f5209a, nVar.f5209a) && g0.a(this.f5218b, nVar.f5218b) && this.f5219c.equals(nVar.f5219c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iG = i0.a.g(527, 31, this.f5209a);
        String str = this.f5218b;
        return this.f5219c.hashCode() + ((iG + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override
    public final void populateMediaMetadata(g1 g1Var) {
        byte b10;
        String str = this.f5209a;
        str.getClass();
        switch (str) {
            case "TAL":
                b10 = 0;
                break;
            case "TCM":
                b10 = 1;
                break;
            case "TDA":
                b10 = 2;
                break;
            case "TP1":
                b10 = 3;
                break;
            case "TP2":
                b10 = 4;
                break;
            case "TP3":
                b10 = 5;
                break;
            case "TRK":
                b10 = 6;
                break;
            case "TT2":
                b10 = 7;
                break;
            case "TXT":
                b10 = 8;
                break;
            case "TYE":
                b10 = 9;
                break;
            case "TALB":
                b10 = 10;
                break;
            case "TCOM":
                b10 = 11;
                break;
            case "TDAT":
                b10 = 12;
                break;
            case "TDRC":
                b10 = 13;
                break;
            case "TDRL":
                b10 = 14;
                break;
            case "TEXT":
                b10 = 15;
                break;
            case "TIT2":
                b10 = 16;
                break;
            case "TPE1":
                b10 = 17;
                break;
            case "TPE2":
                b10 = 18;
                break;
            case "TPE3":
                b10 = 19;
                break;
            case "TRCK":
                b10 = 20;
                break;
            case "TYER":
                b10 = 21;
                break;
            default:
                b10 = -1;
                break;
        }
        z zVar = this.f5219c;
        try {
            switch (b10) {
                case 0:
                case 10:
                    g1Var.f7843c = (CharSequence) zVar.get(0);
                    break;
                case 1:
                case 11:
                    g1Var.f7862y = (CharSequence) zVar.get(0);
                    break;
                case 2:
                case 12:
                    String str2 = (String) zVar.get(0);
                    int i10 = Integer.parseInt(str2.substring(2, 4));
                    int i11 = Integer.parseInt(str2.substring(0, 2));
                    g1Var.f7857s = Integer.valueOf(i10);
                    g1Var.f7858t = Integer.valueOf(i11);
                    break;
                case 3:
                case 17:
                    g1Var.f7842b = (CharSequence) zVar.get(0);
                    break;
                case 4:
                case 18:
                    g1Var.d = (CharSequence) zVar.get(0);
                    break;
                case 5:
                case 19:
                    g1Var.f7863z = (CharSequence) zVar.get(0);
                    break;
                case 6:
                case 20:
                    String str3 = (String) zVar.get(0);
                    int i12 = g0.f4795a;
                    String[] strArrSplit = str3.split("/", -1);
                    int i13 = Integer.parseInt(strArrSplit[0]);
                    Integer numValueOf = strArrSplit.length > 1 ? Integer.valueOf(Integer.parseInt(strArrSplit[1])) : null;
                    g1Var.f7851m = Integer.valueOf(i13);
                    g1Var.f7852n = numValueOf;
                    break;
                case 7:
                case 16:
                    g1Var.f7841a = (CharSequence) zVar.get(0);
                    break;
                case 8:
                case 15:
                    g1Var.f7861x = (CharSequence) zVar.get(0);
                    break;
                case 9:
                case 21:
                    g1Var.f7856r = Integer.valueOf(Integer.parseInt((String) zVar.get(0)));
                    break;
                case 13:
                    ArrayList arrayListA = a((String) zVar.get(0));
                    int size = arrayListA.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                g1Var.f7858t = (Integer) arrayListA.get(2);
                            }
                        }
                        g1Var.f7857s = (Integer) arrayListA.get(1);
                    }
                    g1Var.f7856r = (Integer) arrayListA.get(0);
                    break;
                case 14:
                    ArrayList arrayListA2 = a((String) zVar.get(0));
                    int size2 = arrayListA2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                g1Var.f7860w = (Integer) arrayListA2.get(2);
                            }
                        }
                        g1Var.v = (Integer) arrayListA2.get(1);
                    }
                    g1Var.f7859u = (Integer) arrayListA2.get(0);
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override
    public final String toString() {
        return this.f5209a + ": description=" + this.f5218b + ": values=" + this.f5219c;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f5209a);
        parcel.writeString(this.f5218b);
        parcel.writeStringArray((String[]) this.f5219c.toArray(new String[0]));
    }
}
