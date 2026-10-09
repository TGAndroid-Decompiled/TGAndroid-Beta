package e0;

import android.app.Notification;
import android.os.Parcel;
public final class h0 {
    public final String f8422a;
    public final int f8423b;
    public final String f8424c;
    public final Notification d;

    public h0(String str, int i10, String str2, Notification notification) {
        this.f8422a = str;
        this.f8423b = i10;
        this.f8424c = str2;
        this.d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f8422a;
        int i10 = this.f8423b;
        String str2 = this.f8424c;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f3185g);
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
            aVar.f3183a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f8422a);
        sb2.append(", id:");
        sb2.append(this.f8423b);
        sb2.append(", tag:");
        return a1.g.t(sb2, this.f8424c, "]");
    }
}
