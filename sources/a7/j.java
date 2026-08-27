package a7;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import h7.r8;
import java.util.ArrayList;

public final class j extends z5.a implements q {
    public static final Parcelable.Creator<j> CREATOR = new w.a(6);

    public Status f119a;

    public ArrayList f120b;

    public String[] f121c;

    @Override
    public final Status i() {
        return this.f119a;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 1, this.f119a, i10);
        r8.p(parcel, 2, this.f120b);
        r8.m(parcel, 3, this.f121c);
        r8.r(parcel, iQ);
    }
}
