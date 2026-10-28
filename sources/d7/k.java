package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
public final class k extends l {
    public static final Parcelable.Creator<k> CREATOR = new r0(18);
    public final r f8197a;
    public final String f8198b;
    public final int f8199c;

    public k(int i10, int i11, String str) {
        try {
            this.f8197a = r.a(i10);
            this.f8198b = str;
            this.f8199c = i11;
        } catch (q e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!o6.l.l(this.f8197a, kVar.f8197a) || !o6.l.l(this.f8198b, kVar.f8198b) || !o6.l.l(Integer.valueOf(this.f8199c), Integer.valueOf(kVar.f8199c))) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8197a, this.f8198b, Integer.valueOf(this.f8199c)});
    }

    public final String toString() {
        k6.c cVar = new k6.c(getClass().getSimpleName());
        String valueOf = String.valueOf(this.f8197a.f8227a);
        k6.c cVar2 = new k6.c(13, false);
        ((k6.c) cVar.d).d = cVar2;
        cVar.d = cVar2;
        cVar2.f16405b = valueOf;
        cVar2.f16406c = "errorCode";
        String str = this.f8198b;
        if (str != null) {
            cVar.K(str, "errorMessage");
        }
        return cVar.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        int i11 = this.f8197a.f8227a;
        df.s(parcel, 2, 4);
        parcel.writeInt(i11);
        df.l(parcel, 3, this.f8198b);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.f8199c);
        df.r(parcel, q5);
    }
}
