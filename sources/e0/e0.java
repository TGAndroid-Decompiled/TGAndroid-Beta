package e0;

import a8.p0;
import android.app.Notification;
import android.os.Parcel;
public final class e0 {
    public final String f10199a;
    public final int f10200b;
    public final String f10201c;
    public final Notification d;

    public e0(String str, int i7, String str2, Notification notification) {
        this.f10199a = str;
        this.f10200b = i7;
        this.f10201c = str2;
        this.d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f10199a;
        int i7 = this.f10200b;
        String str2 = this.f10201c;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f2835g);
            obtain.writeString(str);
            obtain.writeInt(i7);
            obtain.writeString(str2);
            Notification notification = this.d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f2833a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f10199a);
        sb2.append(", id:");
        sb2.append(this.f10200b);
        sb2.append(", tag:");
        return p0.s(sb2, this.f10201c, "]");
    }
}
