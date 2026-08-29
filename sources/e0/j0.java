package e0;

import android.app.Notification;
import android.os.Parcel;
public final class j0 {
    public final String f5687a;
    public final int f5688b;
    public final Notification f5689c;

    public j0(String str, int i10, Notification notification) {
        this.f5687a = str;
        this.f5688b = i10;
        this.f5689c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f5687a;
        int i10 = this.f5688b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f1874g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(null);
            Notification notification = this.f5689c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f1872a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f5687a);
        sb2.append(", id:");
        return a4.w.l(this.f5688b, ", tag:null]", sb2);
    }
}
