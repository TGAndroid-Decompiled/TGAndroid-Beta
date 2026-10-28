package e0;

import android.app.Notification;
import android.os.Parcel;
public final class f0 {
    public final String f9532a;
    public final int f9533b;
    public final String f9534c;
    public final Notification d;

    public f0(String str, int i10, String str2, Notification notification) {
        this.f9532a = str;
        this.f9533b = i10;
        this.f9534c = str2;
        this.d = notification;
    }

    public final void a(b.c cVar) {
        String str = this.f9532a;
        int i10 = this.f9533b;
        String str2 = this.f9534c;
        b.a aVar = (b.a) cVar;
        aVar.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(b.c.f3099g);
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
            aVar.f3097a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.f9532a);
        sb2.append(", id:");
        sb2.append(this.f9533b);
        sb2.append(", tag:");
        return a1.g.s(sb2, this.f9534c, "]");
    }
}
