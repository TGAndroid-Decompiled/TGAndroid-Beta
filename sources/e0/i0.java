package e0;

import android.app.Notification;
import android.os.Parcel;
public final class i0 {
    public final String f4980a;
    public final int f4981b;
    public final Notification f4982c;

    public i0(String str, int i10, Notification notification) {
        this.f4980a = str;
        this.f4981b = i10;
        this.f4982c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f4980a;
        int i10 = this.f4981b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f1276g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(null);
            Notification notification = this.f4982c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f1274a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.f4980a);
        sb.append(", id:");
        return android.support.v4.media.a.m(this.f4981b, ", tag:null]", sb);
    }
}
