package e0;

import android.app.Notification;
import android.os.Parcel;
public final class g0 {
    public final String f6016a;
    public final int f6017b;
    public final String f6018c;
    public final Notification d;

    public g0(String str, int i10, String str2, Notification notification) {
        this.f6016a = str;
        this.f6017b = i10;
        this.f6018c = str2;
        this.d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f6016a;
        int i10 = this.f6017b;
        String str2 = this.f6018c;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f1937g);
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
            aVar.f1935a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f6016a);
        sb2.append(", id:");
        sb2.append(this.f6017b);
        sb2.append(", tag:");
        return a1.g.r(sb2, this.f6018c, "]");
    }
}
