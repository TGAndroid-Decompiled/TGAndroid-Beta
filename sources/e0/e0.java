package e0;

import a8.p0;
import android.app.Notification;
import android.os.Parcel;
public final class e0 {
    public final String f10196a;
    public final int f10197b;
    public final String f10198c;
    public final Notification d;

    public e0(String str, int i7, String str2, Notification notification) {
        this.f10196a = str;
        this.f10197b = i7;
        this.f10198c = str2;
        this.d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f10196a;
        int i7 = this.f10197b;
        String str2 = this.f10198c;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f2836g);
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
            aVar.f2834a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f10196a);
        sb2.append(", id:");
        sb2.append(this.f10197b);
        sb2.append(", tag:");
        return p0.s(sb2, this.f10198c, "]");
    }
}
