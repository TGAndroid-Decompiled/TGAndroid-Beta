package e0;

import android.app.Notification;
import android.os.Parcel;
public final class j0 {
    public final String f8435a;
    public final int f8436b;
    public final Notification f8437c;

    public j0(String str, int i10, Notification notification) {
        this.f8435a = str;
        this.f8436b = i10;
        this.f8437c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f8435a;
        int i10 = this.f8436b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f3106g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(null);
            Notification notification = this.f8437c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f3104a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f8435a);
        sb2.append(", id:");
        return a4.a.n(this.f8436b, ", tag:null]", sb2);
    }
}
