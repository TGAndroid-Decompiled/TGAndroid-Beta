package e0;

import android.app.Notification;
import android.os.Parcel;
public final class j0 {
    public final String f7097a;
    public final int f7098b;
    public final Notification f7099c;

    public j0(String str, int i10, Notification notification) {
        this.f7097a = str;
        this.f7098b = i10;
        this.f7099c = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f7097a;
        int i10 = this.f7098b;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f1575g);
            obtain.writeString(str);
            obtain.writeInt(i10);
            obtain.writeString(null);
            Notification notification = this.f7099c;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            aVar.f1573a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f7097a);
        sb2.append(", id:");
        return a4.a.n(this.f7098b, ", tag:null]", sb2);
    }
}
