package e0;

import android.app.Notification;
import android.os.Parcel;
public final class j0 {
    public final String f8663a;
    public final int f8664b;
    public final Notification f8665c;

    public j0(String str, int i10, Notification notification) {
        this.f8663a = str;
        this.f8664b = i10;
        this.f8665c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f8663a;
        int i10 = this.f8664b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f1939g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(null);
            Notification notification = this.f8665c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f1937a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f8663a);
        sb2.append(", id:");
        return a4.a.n(this.f8664b, ", tag:null]", sb2);
    }
}
