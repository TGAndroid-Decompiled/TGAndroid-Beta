package e0;

import android.app.Notification;
import android.os.Parcel;
public final class j0 {
    public final String f4717a;
    public final int f4718b;
    public final Notification f4719c;

    public j0(String str, int i9, Notification notification) {
        this.f4717a = str;
        this.f4718b = i9;
        this.f4719c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f4717a;
        int i9 = this.f4718b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f1384g);
            obtain.writeString(str);
            obtain.writeInt(i9);
            obtain.writeString(null);
            Notification notification = this.f4719c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f1382a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f4717a);
        sb2.append(", id:");
        return aa.d.l(this.f4718b, ", tag:null]", sb2);
    }
}
