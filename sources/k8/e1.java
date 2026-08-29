package k8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.e9;
import java.util.Arrays;
import org.telegram.ui.th;
public final class e1 extends a6.a {
    public static final Parcelable.Creator<e1> CREATOR = new p0(10);
    public final String f13497a;
    public final String f13498b;
    public final c1 f13499c;
    public final String d;
    public final String f13500e;
    public final Float f13501f;
    public final g1 h;

    public e1(String str, String str2, c1 c1Var, String str3, String str4, Float f9, g1 g1Var) {
        this.f13497a = str;
        this.f13498b = str2;
        this.f13499c = c1Var;
        this.d = str3;
        this.f13500e = str4;
        this.f13501f = f9;
        this.h = g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e1.class == obj.getClass()) {
            e1 e1Var = (e1) obj;
            if (e9.b(this.f13497a, e1Var.f13497a) && e9.b(this.f13498b, e1Var.f13498b) && e9.b(this.f13499c, e1Var.f13499c) && e9.b(this.d, e1Var.d) && e9.b(this.f13500e, e1Var.f13500e) && e9.b(this.f13501f, e1Var.f13501f) && e9.b(this.h, e1Var.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13497a, this.f13498b, this.f13499c, this.d, this.f13500e, this.f13501f, this.h});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.h);
        String valueOf2 = String.valueOf(this.f13499c);
        StringBuilder k9 = th.k("AppParcelable{title='", this.f13498b, "', developerName='", this.d, "', formattedPrice='");
        k9.append(this.f13500e);
        k9.append("', starRating=");
        k9.append(this.f13501f);
        k9.append(", wearDetails=");
        th.w(k9, valueOf, ", deepLinkUri='", this.f13497a, "', icon=");
        return a4.w.q(k9, valueOf2, "}");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.l(parcel, 1, this.f13497a);
        com.google.android.gms.internal.cast.o.l(parcel, 2, this.f13498b);
        com.google.android.gms.internal.cast.o.k(parcel, 3, this.f13499c, i10);
        com.google.android.gms.internal.cast.o.l(parcel, 4, this.d);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.f13500e);
        com.google.android.gms.internal.cast.o.e(parcel, 6, this.f13501f);
        com.google.android.gms.internal.cast.o.k(parcel, 7, this.h, i10);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
