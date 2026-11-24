package defpackage;

import android.app.Notification;
import android.os.Parcel;
public final class on7 {
    public final String a;
    public final int b;
    public final String c;
    public final Notification d;

    public on7(String str, int i, String str2, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = notification;
    }

    public final void a(wk5 wk5Var) {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        uk5 uk5Var = (uk5) wk5Var;
        uk5Var.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(wk5.g);
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
            uk5Var.a.transact(1, obtain, null, 1);
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
        return b10.j(sb, this.c, "]");
    }
}
