package e0;

import android.app.Notification;
import android.os.Parcel;
public final class h0 {
    public final String f8225a;
    public final int f8226b;
    public final String f8227c;
    public final Notification d;

    public h0(String str, int i10, String str2, Notification notification) {
        this.f8225a = str;
        this.f8226b = i10;
        this.f8227c = str2;
        this.d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f8225a;
        int i10 = this.f8226b;
        String str2 = this.f8227c;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f2032g);
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
            aVar.f2030a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f8225a);
        sb2.append(", id:");
        sb2.append(this.f8226b);
        sb2.append(", tag:");
        return a1.g.s(sb2, this.f8227c, "]");
    }
}
