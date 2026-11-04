package lg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import ci.l3;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.p2;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class b0 {
    public final Context f18226a;
    public final int f18227b;
    public final e6 f18228c;
    public final d2 d;
    public final Runnable f18229e;
    public int f18230f;
    public int f18231g;
    public boolean h;
    public boolean f18232i;
    public final ArrayList f18233j;
    public final ArrayList f18234k;
    public TL_account.TL_businessBotRecipients f18235l;
    public int f18236m;
    public boolean f18237n;

    public b0(d2 d2Var, Runnable runnable) {
        this.f18233j = new ArrayList();
        this.f18234k = new ArrayList();
        this.f18236m = -4;
        this.f18226a = d2Var.getContext();
        this.f18227b = d2Var.getCurrentAccount();
        this.d = d2Var;
        this.f18229e = runnable;
        this.f18228c = d2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, f41 f41Var, boolean z10) {
        String str;
        String str2;
        f41Var.V();
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
                str = k2.p1.k(2131750777, null, com.google.android.recaptcha.internal.a.l(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = t4.c.q(str, ", ");
                }
                str = k2.p1.k(2131750728, null, com.google.android.recaptcha.internal.a.l(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = t4.c.q(str, ", ");
                }
                str = k2.p1.k(2131750792, null, com.google.android.recaptcha.internal.a.l(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = t4.c.q(str, ", ");
                }
                str = k2.p1.k(2131750721, null, com.google.android.recaptcha.internal.a.l(str));
            }
            ArrayList arrayList2 = this.f18233j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder h = t4.c.h(str, " + ");
                    h.append(arrayList2.size());
                    str = h.toString();
                } else {
                    StringBuilder l10 = com.google.android.recaptcha.internal.a.l(str);
                    l10.append(bd.H(',', "Chats", arrayList2.size()));
                    str = l10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = bd.M0(2131752777, null);
            }
            r31 f10 = r31.f(bd.M0(2131752778, null), str, 101);
            f10.f37623g = z10;
            arrayList.add(f10);
        }
        boolean z11 = this.f18232i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = k2.p1.k(2131750777, null, com.google.android.recaptcha.internal.a.l(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = t4.c.q(str3, ", ");
                    }
                    str3 = k2.p1.k(2131750728, null, com.google.android.recaptcha.internal.a.l(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = t4.c.q(str3, ", ");
                    }
                    str3 = k2.p1.k(2131750792, null, com.google.android.recaptcha.internal.a.l(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = t4.c.q(str3, ", ");
                    }
                    str3 = k2.p1.k(2131750721, null, com.google.android.recaptcha.internal.a.l(str3));
                }
            }
            ArrayList arrayList3 = this.f18234k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder h7 = t4.c.h(str3, " + ");
                    h7.append(arrayList3.size());
                    str3 = h7.toString();
                } else {
                    StringBuilder l11 = com.google.android.recaptcha.internal.a.l(str3);
                    l11.append(bd.H(',', "Chats", arrayList3.size()));
                    str3 = l11.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = bd.M0(2131752779, null);
            }
            r31 f11 = r31.f(bd.M0(2131752780, null), str3, 103);
            f11.f37623g = z10;
            arrayList.add(f11);
        }
        f41Var.U();
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
        ArrayList arrayList2 = this.f18234k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f18233j;
        }
        if (!arrayList.isEmpty()) {
            hp s12 = hp.s1(h10.f22829t0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Long l10 = (Long) arrayList.get(i3);
                l10.getClass();
                tL_inputBusinessBotRecipients.users.add(s12.q1(s12.a2(l10)));
            }
        }
        if (!this.h) {
            hp s13 = hp.s1(h10.f22829t0);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l11 = (Long) arrayList2.get(i10);
                l11.getClass();
                tL_inputBusinessBotRecipients.exclude_users.add(s13.q1(s13.a2(l11)));
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
        ArrayList arrayList2 = this.f18234k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f18233j;
        }
        if (!arrayList.isEmpty()) {
            hp s12 = hp.s1(h10.f22829t0);
            tL_businessBotRecipients.flags |= 16;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Long l10 = (Long) arrayList.get(i3);
                l10.longValue();
                s12.q1(s12.a2(l10));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i3));
            }
        }
        if (!this.h) {
            hp s13 = hp.s1(h10.f22829t0);
            tL_businessBotRecipients.flags |= 64;
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                Long l11 = (Long) arrayList2.get(i10);
                l11.longValue();
                s13.q1(s13.a2(l11));
                tL_businessBotRecipients.users.add((Long) arrayList2.get(i10));
            }
        }
        return tL_businessBotRecipients;
    }

    public final int d() {
        if (this.h) {
            return this.f18231g;
        }
        return this.f18230f;
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
            arrayList = this.f18234k;
        } else {
            arrayList = this.f18233j;
        }
        if (!arrayList.isEmpty()) {
            hp s12 = hp.s1(h10.f22829t0);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Long l10 = (Long) arrayList.get(i3);
                l10.getClass();
                tL_inputBusinessRecipients.users.add(s12.q1(s12.a2(l10)));
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
            arrayList = this.f18234k;
        } else {
            arrayList = this.f18233j;
        }
        if (!arrayList.isEmpty()) {
            hp s12 = hp.s1(h10.f22829t0);
            tL_businessRecipients.flags |= 16;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Long l10 = (Long) arrayList.get(i3);
                l10.getClass();
                s12.q1(s12.a2(l10));
                tL_businessRecipients.users.add((Long) arrayList.get(i3));
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f18235l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f18234k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f18233j;
            }
            if (arrayList.size() == this.f18235l.users.size()) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (!this.f18235l.users.contains(arrayList.get(i3))) {
                        return true;
                    }
                }
                if (this.f18232i && !this.h) {
                    if (arrayList2.size() == this.f18235l.exclude_users.size()) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            if (!this.f18235l.exclude_users.contains(arrayList2.get(i10))) {
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

    public final boolean h(r31 r31Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        int i3;
        int i10;
        int i11 = r31Var.d;
        d2 d2Var = this.d;
        boolean z12 = false;
        if (i11 != 101 && i11 != 103) {
            Runnable runnable = this.f18229e;
            if (i11 == 102) {
                runnable.run();
                return true;
            } else if (i11 == 104) {
                runnable.run();
                return true;
            } else if (r31Var.f54715a != 11) {
                return false;
            } else {
                boolean z13 = r31Var.f37637w;
                String B1 = hp.s1(this.f18227b).B1(r31Var.f37638x, false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f18226a, this.f18228c);
                if (!z13) {
                    i3 = 2131752686;
                } else {
                    i3 = 2131752684;
                }
                String M0 = bd.M0(i3, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                if (!z13) {
                    i10 = 2131752687;
                } else {
                    i10 = 2131752685;
                }
                s1Var.U = bd.a0(null, null, i10, B1);
                alertDialog$Builder.k(bd.M0(2131746329, null), new l3(this, z13, r31Var, 1));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                if (d2Var != null) {
                    d2Var.showDialog(s1Var);
                    return true;
                }
                s1Var.show();
                return true;
            }
        }
        if (i11 == 101) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f18233j;
        } else {
            arrayList = this.f18234k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f42115y = 2;
        usersSelectActivity.H = false;
        boolean z14 = this.f18232i;
        if (z14 && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.G = z11;
        usersSelectActivity.H = false;
        usersSelectActivity.I = z14;
        if (!z10 && this.f18237n) {
            z12 = true;
        }
        usersSelectActivity.J = z12;
        usersSelectActivity.f42110n = new ei.f(1, this, z10);
        if (d2Var != null) {
            d2Var.presentFragment(usersSelectActivity);
            return true;
        }
        d2 T = LaunchActivity.T();
        if (T == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f27395a = true;
        T.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f18232i = true;
        this.f18235l = tL_businessBotRecipients;
        ArrayList arrayList = this.f18233j;
        ArrayList arrayList2 = this.f18234k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f18231g = 0;
            this.f18230f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f18230f = 0;
            this.f18231g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f18235l.users);
            return;
        }
        this.f18230f = tL_businessBotRecipients.flags & (-49);
        this.f18231g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f18235l.users);
        arrayList2.addAll(this.f18235l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f18232i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f18235l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f18235l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f18235l;
        ArrayList arrayList = this.f18233j;
        ArrayList arrayList2 = this.f18234k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f18231g = 0;
            this.f18230f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f18230f = 0;
            this.f18231g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f18235l.users);
            return;
        }
        this.f18230f = tL_businessBotRecipients2.flags & (-49);
        this.f18231g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f18235l.users);
        arrayList2.addAll(this.f18235l.exclude_users);
    }

    public final boolean k(l41 l41Var) {
        if (!this.h && this.f18233j.isEmpty() && this.f18230f == 0) {
            p2.APP_ERROR.a();
            View B1 = l41Var.B1(101);
            int i3 = -this.f18236m;
            this.f18236m = i3;
            org.telegram.messenger.g0.G3(i3, B1, null);
            l41Var.y0(l41Var.A1(101));
            return false;
        }
        return true;
    }

    public b0(Context context, int i3, n nVar, e6 e6Var) {
        this.f18233j = new ArrayList();
        this.f18234k = new ArrayList();
        this.f18236m = -4;
        this.f18226a = context;
        this.f18227b = i3;
        this.d = null;
        this.f18229e = nVar;
        this.f18228c = e6Var;
    }
}
