package defpackage;

import android.app.Notification;
import android.os.Parcel;
public final class ll7 {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public ll7(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final void a(xi5 xi5Var) {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        vi5 vi5Var = (vi5) xi5Var;
        vi5Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(xi5.g);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString(str2);
            Notification notification = this.d;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            vi5Var.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        sb.append(this.b);
        sb.append(", tag:");
        return b00.j(sb, this.c, "]");
    }
}
