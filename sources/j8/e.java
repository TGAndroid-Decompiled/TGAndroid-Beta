package j8;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
public final class e extends r6.a implements q {
    public static final Parcelable.Creator<e> CREATOR = new j7.b(18);
    public final Status f16585a;
    public final f f16586b;

    public e(Status status, f fVar) {
        this.f16585a = status;
        this.f16586b = fVar;
    }

    @Override
    public final Status a() {
        return this.f16585a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        wb.k(parcel, 1, this.f16585a, i7);
        wb.k(parcel, 2, this.f16586b, i7);
        wb.s(parcel, r10);
    }
}
