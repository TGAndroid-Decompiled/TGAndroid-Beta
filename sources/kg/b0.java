package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.q2;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class b0 {
    public final Context f18278a;
    public final int f18279b;
    public final h6 f18280c;
    public final g2 d;
    public final Runnable f18281e;
    public int f18282f;
    public int f18283g;
    public boolean h;
    public boolean f18284i;
    public final ArrayList f18285j;
    public final ArrayList f18286k;
    public TL_account.TL_businessBotRecipients f18287l;
    public int f18288m;
    public boolean f18289n;

    public b0(g2 g2Var, Runnable runnable) {
        this.f18285j = new ArrayList();
        this.f18286k = new ArrayList();
        this.f18288m = -4;
        this.f18278a = g2Var.getContext();
        this.f18279b = g2Var.getCurrentAccount();
        this.d = g2Var;
        this.f18281e = runnable;
        this.f18280c = g2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, c51 c51Var, boolean z10) {
        String str;
        String str2;
        c51Var.V();
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
            ArrayList arrayList2 = this.f18285j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder n10 = p5.c.n(str, " + ");
                    n10.append(arrayList2.size());
                    str = n10.toString();
                } else {
                    StringBuilder m10 = e2.m(str);
                    m10.append(hd.H(',', "Chats", arrayList2.size()));
                    str = m10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = hd.N0(2131752765, null);
            }
            o41 f10 = o41.f(hd.N0(2131752766, null), str, 101);
            f10.f38086g = z10;
            arrayList.add(f10);
        }
        boolean z11 = this.f18284i;
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
            ArrayList arrayList3 = this.f18286k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder n11 = p5.c.n(str3, " + ");
                    n11.append(arrayList3.size());
                    str3 = n11.toString();
                } else {
                    StringBuilder m11 = e2.m(str3);
                    m11.append(hd.H(',', "Chats", arrayList3.size()));
                    str3 = m11.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = hd.N0(2131752767, null);
            }
            o41 f11 = o41.f(hd.N0(2131752768, null), str3, 103);
            f11.f38086g = z10;
            arrayList.add(f11);
        }
        c51Var.U();
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
        ArrayList arrayList2 = this.f18286k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f18285j;
        }
        if (!arrayList.isEmpty()) {
            np u12 = np.u1(k10.f24968t0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                tL_inputBusinessBotRecipients.users.add(u12.s1(u12.c2(l10)));
            }
        }
        if (!this.h) {
            np u13 = np.u1(k10.f24968t0);
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
        ArrayList arrayList2 = this.f18286k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f18285j;
        }
        if (!arrayList.isEmpty()) {
            np u12 = np.u1(k10.f24968t0);
            tL_businessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.longValue();
                u12.s1(u12.c2(l10));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i7));
            }
        }
        if (!this.h) {
            np u13 = np.u1(k10.f24968t0);
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
            return this.f18283g;
        }
        return this.f18282f;
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
            arrayList = this.f18286k;
        } else {
            arrayList = this.f18285j;
        }
        if (!arrayList.isEmpty()) {
            np u12 = np.u1(k10.f24968t0);
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
            arrayList = this.f18286k;
        } else {
            arrayList = this.f18285j;
        }
        if (!arrayList.isEmpty()) {
            np u12 = np.u1(k10.f24968t0);
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
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f18287l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f18286k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f18285j;
            }
            if (arrayList.size() == this.f18287l.users.size()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (!this.f18287l.users.contains(arrayList.get(i7))) {
                        return true;
                    }
                }
                if (this.f18284i && !this.h) {
                    if (arrayList2.size() == this.f18287l.exclude_users.size()) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            if (!this.f18287l.exclude_users.contains(arrayList2.get(i10))) {
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

    public final boolean h(o41 o41Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        int i7;
        int i10;
        int i11 = o41Var.d;
        g2 g2Var = this.d;
        boolean z12 = false;
        if (i11 != 101 && i11 != 103) {
            Runnable runnable = this.f18281e;
            if (i11 == 102) {
                runnable.run();
                return true;
            } else if (i11 == 104) {
                runnable.run();
                return true;
            } else if (o41Var.f56634a != 11) {
                return false;
            } else {
                boolean z13 = o41Var.f38101x;
                String D1 = np.u1(this.f18279b).D1(o41Var.f38102y, false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f18278a, this.f18280c);
                if (!z13) {
                    i7 = 2131752674;
                } else {
                    i7 = 2131752672;
                }
                String N0 = hd.N0(i7, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                t1Var.S = N0;
                if (!z13) {
                    i10 = 2131752675;
                } else {
                    i10 = 2131752673;
                }
                t1Var.U = hd.a0(null, null, i10, D1);
                alertDialog$Builder.k(hd.N0(2131746125, null), new ab.j(this, z13, o41Var, 2));
                alertDialog$Builder.h(hd.N0(2131752577, null), null);
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
            arrayList = this.f18285j;
        } else {
            arrayList = this.f18286k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f43949y = 2;
        usersSelectActivity.H = false;
        boolean z14 = this.f18284i;
        if (z14 && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.G = z11;
        usersSelectActivity.H = false;
        usersSelectActivity.I = z14;
        if (!z10 && this.f18289n) {
            z12 = true;
        }
        usersSelectActivity.J = z12;
        usersSelectActivity.f43944n = new ab.z(2, this, z10);
        if (g2Var != null) {
            g2Var.presentFragment(usersSelectActivity);
            return true;
        }
        g2 T = LaunchActivity.T();
        if (T == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f28905a = true;
        T.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f18284i = true;
        this.f18287l = tL_businessBotRecipients;
        ArrayList arrayList = this.f18285j;
        ArrayList arrayList2 = this.f18286k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f18283g = 0;
            this.f18282f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f18282f = 0;
            this.f18283g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f18287l.users);
            return;
        }
        this.f18282f = tL_businessBotRecipients.flags & (-49);
        this.f18283g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f18287l.users);
        arrayList2.addAll(this.f18287l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f18284i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f18287l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f18287l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f18287l;
        ArrayList arrayList = this.f18285j;
        ArrayList arrayList2 = this.f18286k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f18283g = 0;
            this.f18282f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f18282f = 0;
            this.f18283g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f18287l.users);
            return;
        }
        this.f18282f = tL_businessBotRecipients2.flags & (-49);
        this.f18283g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f18287l.users);
        arrayList2.addAll(this.f18287l.exclude_users);
    }

    public final boolean k(h51 h51Var) {
        if (!this.h && this.f18285j.isEmpty() && this.f18282f == 0) {
            q2.APP_ERROR.a();
            View B1 = h51Var.B1(101);
            int i7 = -this.f18288m;
            this.f18288m = i7;
            org.telegram.messenger.g0.E3(i7, B1, null);
            h51Var.y0(h51Var.A1(101));
            return false;
        }
        return true;
    }

    public b0(Context context, int i7, i0 i0Var, h6 h6Var) {
        this.f18285j = new ArrayList();
        this.f18286k = new ArrayList();
        this.f18288m = -4;
        this.f18278a = context;
        this.f18279b = i7;
        this.d = null;
        this.f18281e = i0Var;
        this.f18280c = h6Var;
    }
}
