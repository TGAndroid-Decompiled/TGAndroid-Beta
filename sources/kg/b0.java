package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q2;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class b0 {
    public final Context f18340a;
    public final int f18341b;
    public final i6 f18342c;
    public final g2 d;
    public final Runnable f18343e;
    public int f18344f;
    public int f18345g;
    public boolean h;
    public boolean f18346i;
    public final ArrayList f18347j;
    public final ArrayList f18348k;
    public TL_account.TL_businessBotRecipients f18349l;
    public int f18350m;
    public boolean f18351n;

    public b0(g2 g2Var, Runnable runnable) {
        this.f18347j = new ArrayList();
        this.f18348k = new ArrayList();
        this.f18350m = -4;
        this.f18340a = g2Var.getContext();
        this.f18341b = g2Var.getCurrentAccount();
        this.d = g2Var;
        this.f18343e = runnable;
        this.f18342c = g2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, b51 b51Var, boolean z10) {
        String str;
        String str2;
        b51Var.V();
        int d = d();
        String str3 = "";
        if (!this.h) {
            if ((d & 1) == 0) {
                str = "";
            } else {
                if (TextUtils.isEmpty("")) {
                    str2 = "";
                } else {
                    str2 = ", ";
                }
                str = i5.c.k(2131750764, null, e2.m(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = p5.c.v(str, ", ");
                }
                str = i5.c.k(2131750715, null, e2.m(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = p5.c.v(str, ", ");
                }
                str = i5.c.k(2131750779, null, e2.m(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = p5.c.v(str, ", ");
                }
                str = i5.c.k(2131750706, null, e2.m(str));
            }
            ArrayList arrayList2 = this.f18347j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder n10 = p5.c.n(str, " + ");
                    n10.append(arrayList2.size());
                    str = n10.toString();
                } else {
                    StringBuilder m10 = e2.m(str);
                    m10.append(gd.H(',', "Chats", arrayList2.size()));
                    str = m10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = gd.N0(2131752765, null);
            }
            n41 f10 = n41.f(gd.N0(2131752766, null), str, 101);
            f10.f37650g = z10;
            arrayList.add(f10);
        }
        boolean z11 = this.f18346i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = i5.c.k(2131750764, null, e2.m(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = p5.c.v(str3, ", ");
                    }
                    str3 = i5.c.k(2131750715, null, e2.m(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = p5.c.v(str3, ", ");
                    }
                    str3 = i5.c.k(2131750779, null, e2.m(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = p5.c.v(str3, ", ");
                    }
                    str3 = i5.c.k(2131750706, null, e2.m(str3));
                }
            }
            ArrayList arrayList3 = this.f18348k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder n11 = p5.c.n(str3, " + ");
                    n11.append(arrayList3.size());
                    str3 = n11.toString();
                } else {
                    StringBuilder m11 = e2.m(str3);
                    m11.append(gd.H(',', "Chats", arrayList3.size()));
                    str3 = m11.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = gd.N0(2131752767, null);
            }
            n41 f11 = n41.f(gd.N0(2131752768, null), str3, 103);
            f11.f37650g = z10;
            arrayList.add(f11);
        }
        b51Var.U();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_inputBusinessBotRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_inputBusinessBotRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_inputBusinessBotRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_inputBusinessBotRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z14;
        ArrayList arrayList2 = this.f18348k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f18347j;
        }
        if (!arrayList.isEmpty()) {
            mp u12 = mp.u1(i10.f24637t0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                tL_inputBusinessBotRecipients.users.add(u12.s1(u12.c2(l10)));
            }
        }
        if (!this.h) {
            mp u13 = mp.u1(i10.f24637t0);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l11 = (Long) arrayList2.get(i10);
                l11.getClass();
                tL_inputBusinessBotRecipients.exclude_users.add(u13.s1(u13.c2(l11)));
            }
        }
        return tL_inputBusinessBotRecipients;
    }

    public final TL_account.TL_businessBotRecipients c() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
        int d = d();
        tL_businessBotRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_businessBotRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_businessBotRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_businessBotRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_businessBotRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_businessBotRecipients.exclude_selected = z14;
        ArrayList arrayList2 = this.f18348k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f18347j;
        }
        if (!arrayList.isEmpty()) {
            mp u12 = mp.u1(i10.f24637t0);
            tL_businessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.longValue();
                u12.s1(u12.c2(l10));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i7));
            }
        }
        if (!this.h) {
            mp u13 = mp.u1(i10.f24637t0);
            tL_businessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l11 = (Long) arrayList2.get(i10);
                l11.longValue();
                u13.s1(u13.c2(l11));
                tL_businessBotRecipients.users.add((Long) arrayList2.get(i10));
            }
        }
        return tL_businessBotRecipients;
    }

    public final int d() {
        if (this.h) {
            return this.f18345g;
        }
        return this.f18344f;
    }

    public final TL_account.TL_inputBusinessRecipients e() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_inputBusinessRecipients tL_inputBusinessRecipients = new TL_account.TL_inputBusinessRecipients();
        int d = d();
        tL_inputBusinessRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_inputBusinessRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_inputBusinessRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_inputBusinessRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_inputBusinessRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_inputBusinessRecipients.exclude_selected = z14;
        if (z14) {
            arrayList = this.f18348k;
        } else {
            arrayList = this.f18347j;
        }
        if (!arrayList.isEmpty()) {
            mp u12 = mp.u1(i10.f24637t0);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                tL_inputBusinessRecipients.users.add(u12.s1(u12.c2(l10)));
            }
        }
        return tL_inputBusinessRecipients;
    }

    public final TL_account.TL_businessRecipients f() {
        boolean z10;
        boolean z11;
        boolean z12;
        ArrayList arrayList;
        TL_account.TL_businessRecipients tL_businessRecipients = new TL_account.TL_businessRecipients();
        int d = d();
        tL_businessRecipients.flags = d & (-49);
        boolean z13 = true;
        if ((d & 1) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_businessRecipients.existing_chats = z10;
        if ((d & 2) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_businessRecipients.new_chats = z11;
        if ((d & 4) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        tL_businessRecipients.contacts = z12;
        if ((d & 8) == 0) {
            z13 = false;
        }
        tL_businessRecipients.non_contacts = z13;
        boolean z14 = this.h;
        tL_businessRecipients.exclude_selected = z14;
        if (z14) {
            arrayList = this.f18348k;
        } else {
            arrayList = this.f18347j;
        }
        if (!arrayList.isEmpty()) {
            mp u12 = mp.u1(i10.f24637t0);
            tL_businessRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                u12.s1(u12.c2(l10));
                tL_businessRecipients.users.add((Long) arrayList.get(i7));
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f18349l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f18348k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f18347j;
            }
            if (arrayList.size() == this.f18349l.users.size()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (!this.f18349l.users.contains(arrayList.get(i7))) {
                        return true;
                    }
                }
                if (this.f18346i && !this.h) {
                    if (arrayList2.size() == this.f18349l.exclude_users.size()) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            if (!this.f18349l.exclude_users.contains(arrayList2.get(i10))) {
                                return true;
                            }
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean h(n41 n41Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        int i7;
        int i10;
        int i11 = n41Var.d;
        g2 g2Var = this.d;
        boolean z12 = false;
        if (i11 != 101 && i11 != 103) {
            Runnable runnable = this.f18343e;
            if (i11 == 102) {
                runnable.run();
                return true;
            } else if (i11 == 104) {
                runnable.run();
                return true;
            } else if (n41Var.f56712a != 11) {
                return false;
            } else {
                boolean z13 = n41Var.f37665x;
                String D1 = mp.u1(this.f18341b).D1(n41Var.f37666y, false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f18340a, this.f18342c);
                if (!z13) {
                    i7 = 2131752674;
                } else {
                    i7 = 2131752672;
                }
                String N0 = gd.N0(i7, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                if (!z13) {
                    i10 = 2131752675;
                } else {
                    i10 = 2131752673;
                }
                t1Var.U = gd.a0(null, null, i10, D1);
                alertDialog$Builder.k(gd.N0(2131746125, null), new ab.j(this, z13, n41Var, 2));
                alertDialog$Builder.h(gd.N0(2131752577, null), null);
                if (g2Var != null) {
                    g2Var.showDialog(t1Var);
                    return true;
                }
                t1Var.show();
                return true;
            }
        }
        if (i11 == 101) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f18347j;
        } else {
            arrayList = this.f18348k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f44030y = 2;
        usersSelectActivity.H = false;
        boolean z14 = this.f18346i;
        if (z14 && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.G = z11;
        usersSelectActivity.H = false;
        usersSelectActivity.I = z14;
        if (!z10 && this.f18351n) {
            z12 = true;
        }
        usersSelectActivity.J = z12;
        usersSelectActivity.f44025n = new ab.z(2, this, z10);
        if (g2Var != null) {
            g2Var.presentFragment(usersSelectActivity);
            return true;
        }
        g2 T = LaunchActivity.T();
        if (T == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f28948a = true;
        T.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f18346i = true;
        this.f18349l = tL_businessBotRecipients;
        ArrayList arrayList = this.f18347j;
        ArrayList arrayList2 = this.f18348k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f18345g = 0;
            this.f18344f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f18344f = 0;
            this.f18345g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f18349l.users);
            return;
        }
        this.f18344f = tL_businessBotRecipients.flags & (-49);
        this.f18345g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f18349l.users);
        arrayList2.addAll(this.f18349l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f18346i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f18349l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f18349l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f18349l;
        ArrayList arrayList = this.f18347j;
        ArrayList arrayList2 = this.f18348k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f18345g = 0;
            this.f18344f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f18344f = 0;
            this.f18345g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f18349l.users);
            return;
        }
        this.f18344f = tL_businessBotRecipients2.flags & (-49);
        this.f18345g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f18349l.users);
        arrayList2.addAll(this.f18349l.exclude_users);
    }

    public final boolean k(g51 g51Var) {
        if (!this.h && this.f18347j.isEmpty() && this.f18344f == 0) {
            q2.APP_ERROR.a();
            View B1 = g51Var.B1(101);
            int i7 = -this.f18350m;
            this.f18350m = i7;
            org.telegram.messenger.g0.E3(i7, B1, null);
            g51Var.y0(g51Var.A1(101));
            return false;
        }
        return true;
    }

    public b0(Context context, int i7, i0 i0Var, i6 i6Var) {
        this.f18347j = new ArrayList();
        this.f18348k = new ArrayList();
        this.f18350m = -4;
        this.f18340a = context;
        this.f18341b = i7;
        this.d = null;
        this.f18343e = i0Var;
        this.f18342c = i6Var;
    }
}
