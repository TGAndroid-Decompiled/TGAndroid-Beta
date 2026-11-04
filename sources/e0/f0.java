package e0;

import android.app.Notification;
import android.os.Parcel;
public final class f0 {
    public final String f9230a;
    public final int f9231b;
    public final String f9232c;
    public final Notification d;

    public f0(String str, int i3, String str2, Notification notification) {
        this.f9230a = str;
        this.f9231b = i3;
        this.f9232c = str2;
        this.d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f9230a;
        int i3 = this.f9231b;
        String str2 = this.f9232c;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f2319g);
            obtain.writeString(str);
            obtain.writeInt(i3);
            obtain.writeString(str2);
            Notification notification = this.d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f2317a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f9230a);
        sb2.append(", id:");
        sb2.append(this.f9231b);
        sb2.append(", tag:");
        return a1.g.s(sb2, this.f9232c, "]");
    }
}
