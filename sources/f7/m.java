package f7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j7.f5;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new n(0);
    public final int f6030a;
    public final IBinder f6031b;
    public final IBinder f6032c;
    public final PendingIntent d;
    public final String e;
    public final String f6033f;

    public m(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f6030a = i10;
        this.f6031b = iBinder;
        this.f6032c = iBinder2;
        this.d = pendingIntent;
        this.e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f6033f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = f5.q(parcel, 20293);
        f5.s(parcel, 1, 4);
        parcel.writeInt(this.f6030a);
        f5.f(parcel, 2, this.f6031b);
        f5.f(parcel, 3, this.f6032c);
        f5.k(parcel, 4, this.d, i10);
        f5.l(parcel, 5, this.e);
        f5.l(parcel, 6, this.f6033f);
        f5.r(parcel, q10);
    }
}
