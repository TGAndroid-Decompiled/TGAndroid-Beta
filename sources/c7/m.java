package c7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

public final class m extends z5.a {
    public static final Parcelable.Creator<m> CREATOR = new n(0);

    public final int f2478a;

    public final IBinder f2479b;

    public final IBinder f2480c;
    public final PendingIntent d;

    public final String f2481e;

    public final String f2482f;

    public m(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f2478a = i10;
        this.f2479b = iBinder;
        this.f2480c = iBinder2;
        this.d = pendingIntent;
        this.f2481e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f2482f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.s(parcel, 1, 4);
        parcel.writeInt(this.f2478a);
        r8.f(parcel, 2, this.f2479b);
        r8.f(parcel, 3, this.f2480c);
        r8.k(parcel, 4, this.d, i10);
        r8.l(parcel, 5, this.f2481e);
        r8.l(parcel, 6, this.f2482f);
        r8.r(parcel, iQ);
    }
}
