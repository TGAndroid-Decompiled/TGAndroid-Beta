package e0;

import android.app.Notification;
import android.os.Parcel;
public final class i0 {
    public final String f4797a;
    public final int f4798b;
    public final Notification f4799c;

    public i0(String str, int i10, Notification notification) {
        this.f4797a = str;
        this.f4798b = i10;
        this.f4799c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f4797a;
        int i10 = this.f4798b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f1365g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(null);
            Notification notification = this.f4799c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f1363a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f4797a);
        sb.append(", id:");
        return android.support.v4.media.a.m(this.f4798b, ", tag:null]", sb);
    }
}
