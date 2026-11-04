package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.Cells.f1;
public final class x extends q6.a {
    public static final Parcelable.Creator<x> CREATOR = new r0(1);
    public final a0 f9902a;
    public final o f9903b;

    public x(String str, int i3) {
        p6.m.g(str);
        try {
            this.f9902a = a0.a(str);
            try {
                this.f9903b = o.a(i3);
            } catch (n e10) {
                throw new IllegalArgumentException(e10);
            }
        } catch (z e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (!this.f9902a.equals(xVar.f9902a) || !this.f9903b.equals(xVar.f9903b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9902a, this.f9903b});
    }

    public final String toString() {
        return f1.q("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f9902a), ", \n algorithm=", String.valueOf(this.f9903b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        this.f9902a.getClass();
        j8.a.m(parcel, 2, "public-key");
        j8.a.j(parcel, 3, Integer.valueOf(this.f9903b.f9851a.a()));
        j8.a.t(parcel, s6);
    }
}
