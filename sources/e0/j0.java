package e0;

import android.app.Notification;
import android.os.Parcel;
public final class j0 {
    public final String f7796a;
    public final int f7797b;
    public final Notification f7798c;

    public j0(String str, int i10, Notification notification) {
        this.f7796a = str;
        this.f7797b = i10;
        this.f7798c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f7796a;
        int i10 = this.f7797b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f2883g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(null);
            Notification notification = this.f7798c;
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
        sb2.append(this.f7796a);
        sb2.append(", id:");
        return a4.a.n(this.f7797b, ", tag:null]", sb2);
    }
}
