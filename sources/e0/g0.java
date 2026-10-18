package e0;

import android.app.Notification;
import android.os.Parcel;
public final class g0 {
    public final String f8104a;
    public final int f8105b;
    public final String f8106c;
    public final Notification d;

    public g0(String str, int i10, String str2, Notification notification) {
        this.f8104a = str;
        this.f8105b = i10;
        this.f8106c = str2;
        this.d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f8104a;
        int i10 = this.f8105b;
        String str2 = this.f8106c;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f3650g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(str2);
            Notification notification = this.d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f3648a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f8104a);
        sb2.append(", id:");
        sb2.append(this.f8105b);
        sb2.append(", tag:");
        return a1.g.s(sb2, this.f8106c, "]");
    }
}
