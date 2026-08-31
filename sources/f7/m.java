package f7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import j7.g5;
public final class m extends c6.a {
    public static final Parcelable.Creator<m> CREATOR = new n(0);
    public final int f6139a;
    public final IBinder f6140b;
    public final IBinder f6141c;
    public final PendingIntent d;
    public final String f6142e;
    public final String f6143f;

    public m(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f6139a = i10;
        this.f6140b = iBinder;
        this.f6141c = iBinder2;
        this.d = pendingIntent;
        this.f6142e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f6143f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.s(parcel, 1, 4);
        parcel.writeInt(this.f6139a);
        g5.f(parcel, 2, this.f6140b);
        g5.f(parcel, 3, this.f6141c);
        g5.k(parcel, 4, this.d, i10);
        g5.l(parcel, 5, this.f6142e);
        g5.l(parcel, 6, this.f6143f);
        g5.r(parcel, q10);
    }
}
