package d7;

import android.app.PendingIntent;
import android.os.Build;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
public final class l extends a6.a {
    public static final Parcelable.Creator<l> CREATOR = new m(0);
    public final int f5447a;
    public final IBinder f5448b;
    public final IBinder f5449c;
    public final PendingIntent d;
    public final String f5450e;
    public final String f5451f;

    public l(int i10, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str, String str2) {
        this.f5447a = i10;
        this.f5448b = iBinder;
        this.f5449c = iBinder2;
        this.d = pendingIntent;
        this.f5450e = Build.VERSION.SDK_INT >= 30 ? null : str;
        this.f5451f = str2;
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 4);
        parcel.writeInt(this.f5447a);
        com.google.android.gms.internal.cast.o.f(parcel, 2, this.f5448b);
        com.google.android.gms.internal.cast.o.f(parcel, 3, this.f5449c);
        com.google.android.gms.internal.cast.o.k(parcel, 4, this.d, i10);
        com.google.android.gms.internal.cast.o.l(parcel, 5, this.f5450e);
        com.google.android.gms.internal.cast.o.l(parcel, 6, this.f5451f);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
