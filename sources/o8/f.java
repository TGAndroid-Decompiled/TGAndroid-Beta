package o8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.q;
import java.util.ArrayList;
import java.util.List;
import w7.f0;
public final class f extends o6.a implements q {
    public static final Parcelable.Creator<f> CREATOR = new m8.h(21);
    public final List f17704a;
    public final String f17705b;

    public f(String str, ArrayList arrayList) {
        this.f17704a = arrayList;
        this.f17705b = str;
    }

    @Override
    public final Status h() {
        if (this.f17705b != null) {
            return Status.e;
        }
        return Status.f6344r;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = f0.q(parcel, 20293);
        f0.n(parcel, 1, this.f17704a);
        f0.l(parcel, 2, this.f17705b);
        f0.r(parcel, q6);
    }
}
