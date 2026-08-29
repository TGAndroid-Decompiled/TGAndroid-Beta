package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.th;
public final class x extends a6.a {
    public static final Parcelable.Creator<x> CREATOR = new n0(9);
    public final a0 f19458a;
    public final o f19459b;

    public x(String str, int i10) {
        z5.l.h(str);
        try {
            this.f19458a = a0.a(str);
            try {
                this.f19459b = o.a(i10);
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
        if (!this.f19458a.equals(xVar.f19458a) || !this.f19459b.equals(xVar.f19459b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19458a, this.f19459b});
    }

    public final String toString() {
        return th.j("PublicKeyCredentialParameters{\n type=", String.valueOf(this.f19458a), ", \n algorithm=", String.valueOf(this.f19459b), "\n }");
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        this.f19458a.getClass();
        com.google.android.gms.internal.cast.o.l(parcel, 2, "public-key");
        com.google.android.gms.internal.cast.o.i(parcel, 3, Integer.valueOf(this.f19459b.f19410a.a()));
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
