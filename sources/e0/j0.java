package e0;

import android.app.Notification;
import android.os.Parcel;
public final class j0 {
    public final String f7797a;
    public final int f7798b;
    public final Notification f7799c;

    public j0(String str, int i10, Notification notification) {
        this.f7797a = str;
        this.f7798b = i10;
        this.f7799c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f7797a;
        int i10 = this.f7798b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f2883g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(null);
            Notification notification = this.f7799c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f2881a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f7797a);
        sb2.append(", id:");
        return a4.a.n(this.f7798b, ", tag:null]", sb2);
    }
}
