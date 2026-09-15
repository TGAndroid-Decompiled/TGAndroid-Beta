package e0;

import android.app.Notification;
import android.os.Parcel;
public final class j0 {
    public final String f7792a;
    public final int f7793b;
    public final Notification f7794c;

    public j0(String str, int i10, Notification notification) {
        this.f7792a = str;
        this.f7793b = i10;
        this.f7794c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f7792a;
        int i10 = this.f7793b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f2878g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(null);
            Notification notification = this.f7794c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f2876a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f7792a);
        sb2.append(", id:");
        return a4.a.n(this.f7793b, ", tag:null]", sb2);
    }
}
