package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ij3 extends zde {
    public final byte a;
    public final ArrayList b;
    public final Object c;

    public ij3(Object obj, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = obj;
        this.b = arrayList;
    }

    @Override
    public final boolean a(int i, int i2) {
        switch (this.a) {
            case 0:
                if (((mj3) ((oj3) this.c).O.get(i)).a != ((mj3) this.b.get(i2)).a) {
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
                mj3 mj3Var = (mj3) ((oj3) obj).O.get(i);
                mj3 mj3Var2 = (mj3) arrayList.get(i2);
                TLRPC.Dialog dialog = mj3Var.c;
                int i3 = mj3Var.a;
                int i4 = mj3Var2.a;
                TLRPC.Dialog dialog2 = mj3Var2.c;
                if (i3 == i4) {
                    if (i3 == 0) {
                        if (dialog != null && dialog2 != null && dialog.id == dialog2.id && mj3Var.h == mj3Var2.h && mj3Var.f == mj3Var2.f && mj3Var.g == mj3Var2.g) {
                            return true;
                        }
                    } else if (i3 == 14) {
                        if (dialog != null && dialog2 != null && dialog.id == dialog2.id && dialog.isFolder == dialog2.isFolder) {
                            return true;
                        }
                    } else if (i3 == 4) {
                        TLRPC.RecentMeUrl recentMeUrl = mj3Var.d;
                        if (recentMeUrl != null && mj3Var2.d != null && (str = recentMeUrl.url) != null && str.equals(str)) {
                            return true;
                        }
                    } else if (i3 == 6) {
                        TLRPC.TL_contact tL_contact2 = mj3Var.e;
                        if (tL_contact2 != null && (tL_contact = mj3Var2.e) != null && tL_contact2.user_id == tL_contact.user_id) {
                            return true;
                        }
                    } else if (i3 == 5) {
                        if (mj3Var.j == mj3Var2.j) {
                            return true;
                        }
                    } else if (i3 != 10) {
                        return true;
                    }
                }
                return false;
            case 1:
                return ((Integer) arrayList.get(i)).equals(((d04) obj).n.get(i2));
            case 2:
                r95 r95Var = (r95) obj;
                if (i >= arrayList.size() || i2 >= r95Var.e.size()) {
                    return false;
                }
                return ((gc2) arrayList.get(i)).equals(r95Var.e.get(i2));
            case 3:
                return Objects.equals(arrayList.get(i), ((j39) obj).n.get(i2));
            case 4:
                return ((Long) arrayList.get(i)).equals(((tx9) obj).w0.get(i2));
            default:
                if (((hwb) arrayList.get(i)).a() == ((hwb) ((gwb) obj).c.get(i2)).a()) {
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
                return ((d04) obj).n.size();
            case 2:
                return ((r95) obj).e.size();
            case 3:
                return ((j39) obj).n.size();
            case 4:
                return ((tx9) obj).w0.size();
            default:
                return ((gwb) obj).c.size();
        }
    }

    @Override
    public final int d() {
        byte b = this.a;
        ArrayList arrayList = this.b;
        switch (b) {
            case 0:
                return ((oj3) this.c).O.size();
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
