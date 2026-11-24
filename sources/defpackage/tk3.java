package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class tk3 extends age {
    public final byte a;
    public final ArrayList b;
    public final Object c;

    public tk3(Object obj, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = obj;
        this.b = arrayList;
    }

    @Override
    public final boolean a(int i, int i2) {
        switch (this.a) {
            case 0:
                if (((xk3) ((zk3) this.c).O.get(i)).a != ((xk3) this.b.get(i2)).a) {
                    return false;
                }
                return true;
            case 1:
            case 2:
                return true;
            case 3:
                return b(i, i2);
            case 4:
                return true;
            default:
                return false;
        }
    }

    @Override
    public final boolean b(int i, int i2) {
        TLRPC.TL_contact tL_contact;
        String str;
        byte b = this.a;
        Object obj = this.c;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                xk3 xk3Var = (xk3) ((zk3) obj).O.get(i);
                xk3 xk3Var2 = (xk3) arrayList.get(i2);
                TLRPC.Dialog dialog = xk3Var.c;
                int i3 = xk3Var.a;
                int i4 = xk3Var2.a;
                TLRPC.Dialog dialog2 = xk3Var2.c;
                if (i3 == i4) {
                    if (i3 == 0) {
                        if (dialog != null && dialog2 != null && dialog.id == dialog2.id && xk3Var.h == xk3Var2.h && xk3Var.f == xk3Var2.f && xk3Var.g == xk3Var2.g) {
                            return true;
                        }
                    } else if (i3 == 14) {
                        if (dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder) {
                            return true;
                        }
                    } else if (i3 == 4) {
                        TLRPC.RecentMeUrl recentMeUrl = xk3Var.d;
                        if (recentMeUrl != null && xk3Var2.d != null && (str = recentMeUrl.url) != null && str.equals(str)) {
                            return true;
                        }
                    } else if (i3 == 6) {
                        TLRPC.TL_contact tL_contact2 = xk3Var.e;
                        if (tL_contact2 != null && (tL_contact = xk3Var2.e) != null && tL_contact2.user_id == tL_contact.user_id) {
                            return true;
                        }
                    } else if (i3 == 5) {
                        if (xk3Var.j == xk3Var2.j) {
                            return true;
                        }
                    } else if (i3 != 10) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((Integer) arrayList.get(i)).equals(((o14) obj).n.get(i2));
            case 2:
                pb5 pb5Var = (pb5) obj;
                if (i >= arrayList.size() || i2 >= pb5Var.e.size()) {
                    return false;
                }
                return ((rd2) arrayList.get(i)).equals(pb5Var.e.get(i2));
            case 3:
                return Objects.equals(arrayList.get(i), ((m59) obj).n.get(i2));
            case 4:
                return ((Long) arrayList.get(i)).equals(((vz9) obj).w0.get(i2));
            default:
                if (((kyb) arrayList.get(i)).a() == ((kyb) ((jyb) obj).c.get(i2)).a()) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final int c() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                return this.b.size();
            case 1:
                return ((o14) obj).n.size();
            case 2:
                return ((pb5) obj).e.size();
            case 3:
                return ((m59) obj).n.size();
            case 4:
                return ((vz9) obj).w0.size();
            default:
                return ((jyb) obj).c.size();
        }
    }

    @Override
    public final int d() {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                return ((zk3) this.c).O.size();
            case 1:
                return arrayList.size();
            case 2:
                return arrayList.size();
            case 3:
                return arrayList.size();
            case 4:
                return arrayList.size();
            default:
                return arrayList.size();
        }
    }
}
