package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Components.b10;
public final class x extends p6.a {
    public static final Parcelable.Creator<x> CREATOR = new w.a(28);
    public final a0 f8256a;
    public final o f8257b;

    public x(String str, int i10) {
        o6.l.h(str);
        try {
            this.f8256a = a0.a(str);
            try {
                this.f8257b = o.a(i10);
            } catch (n e) {
                throw new IllegalArgumentException(e);
            }
        } catch (z e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f8256a.equals(xVar.f8256a) || !this.f8257b.equals(xVar.f8257b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f8256a, this.f8257b});
    }

    public final String toString() {
        return b10.k("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f8256a), ", \n algorithm=", String.valueOf(this.f8257b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        this.f8256a.getClass();
        df.l(parcel, 2, "public-key");
        df.i(parcel, 3, Integer.valueOf(this.f8257b.f8209a.a()));
        df.r(parcel, q5);
    }
}
