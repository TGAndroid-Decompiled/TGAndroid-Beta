package b7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
public final class n extends y5.a {
    public static final Parcelable.Creator<n> CREATOR = new o(0);
    public final int f1572a;
    public final IBinder f1573b;
    public final IBinder f1574c;
    public final PendingIntent d;
    public final String f1575e;
    public final String f1576f;

    public n(int i9, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f1572a = i9;
        this.f1573b = iBinder;
        this.f1574c = iBinder2;
        this.d = pendingIntent;
        this.f1575e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f1576f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 4);
        parcel.writeInt(this.f1572a);
        p8.f(parcel, 2, this.f1573b);
        p8.f(parcel, 3, this.f1574c);
        p8.k(parcel, 4, this.d, i9);
        p8.l(parcel, 5, this.f1575e);
        p8.l(parcel, 6, this.f1576f);
        p8.r(parcel, q10);
    }
}
