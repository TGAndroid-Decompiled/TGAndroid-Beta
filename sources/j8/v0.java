package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.ArrayList;
import java.util.List;

public final class v0 extends z5.a {
    public static final Parcelable.Creator<v0> CREATOR = new o0(7);

    public final int f12845a;

    public final long f12846b;

    public final List f12847c;

    public v0(int i10, long j10, ArrayList arrayList) {
        this.f12845a = i10;
        this.f12846b = j10;
        this.f12847c = arrayList;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 2, 4);
        parcel.writeInt(this.f12845a);
        r8.s(parcel, 3, 8);
        parcel.writeLong(this.f12846b);
        r8.p(parcel, 4, this.f12847c);
        r8.r(parcel, iQ);
    }
}
