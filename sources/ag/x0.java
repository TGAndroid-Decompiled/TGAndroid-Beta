package ag;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class x0 {
    public final Context f783a;
    public final int f784b;
    public final p6 f785c;
    public final org.telegram.ui.ActionBar.k2 d;
    public final Runnable e;
    public int f786f;
    public int f787g;
    public boolean h;
    public boolean f788i;
    public final ArrayList f789j;
    public final ArrayList f790k;
    public TL_account.TL_businessBotRecipients f791l;
    public int f792m;
    public boolean f793n;

    public x0(org.telegram.ui.ActionBar.k2 k2Var, Runnable runnable) {
        this.f789j = new ArrayList();
        this.f790k = new ArrayList();
        this.f792m = -4;
        this.f783a = k2Var.getContext();
        this.f784b = k2Var.getCurrentAccount();
        this.d = k2Var;
        this.e = runnable;
        this.f785c = k2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, q51 q51Var, boolean z10) {
        String str;
        String str2;
        q51Var.V();
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
                str = a1.g.m(null, 2131750777, a1.g.t(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = sc.e.A(str, ", ");
                }
                str = a1.g.m(null, 2131750728, a1.g.t(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = sc.e.A(str, ", ");
                }
                str = a1.g.m(null, 2131750792, a1.g.t(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = sc.e.A(str, ", ");
                }
                str = a1.g.m(null, 2131750721, a1.g.t(str));
            }
            ArrayList arrayList2 = this.f789j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder i10 = sc.e.i(str, " + ");
                    i10.append(arrayList2.size());
                    str = i10.toString();
                } else {
                    StringBuilder t10 = a1.g.t(str);
                    t10.append(dd.H(',', "Chats", arrayList2.size()));
                    str = t10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = dd.L0(2131752777, null);
            }
            b51 f7 = b51.f(dd.L0(2131752778, null), str, 101);
            f7.f24639g = z10;
            arrayList.add(f7);
        }
        boolean z11 = this.f788i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = a1.g.m(null, 2131750777, a1.g.t(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = sc.e.A(str3, ", ");
                    }
                    str3 = a1.g.m(null, 2131750728, a1.g.t(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = sc.e.A(str3, ", ");
                    }
                    str3 = a1.g.m(null, 2131750792, a1.g.t(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = sc.e.A(str3, ", ");
                    }
                    str3 = a1.g.m(null, 2131750721, a1.g.t(str3));
                }
            }
            ArrayList arrayList3 = this.f790k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder i11 = sc.e.i(str3, " + ");
                    i11.append(arrayList3.size());
                    str3 = i11.toString();
                } else {
                    StringBuilder t11 = a1.g.t(str3);
                    t11.append(dd.H(',', "Chats", arrayList3.size()));
                    str3 = t11.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = dd.L0(2131752779, null);
            }
            b51 f10 = b51.f(dd.L0(2131752780, null), str3, 103);
            f10.f24639g = z10;
            arrayList.add(f10);
        }
        q51Var.U();
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
        ArrayList arrayList2 = this.f790k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f789j;
        }
        if (!arrayList.isEmpty()) {
            wp r12 = wp.r1(e20.f15506s0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l4 = (Long) arrayList.get(i10);
                l4.getClass();
                tL_inputBusinessBotRecipients.users.add(r12.p1(r12.Z1(l4)));
            }
        }
        if (!this.h) {
            wp r13 = wp.r1(e20.f15506s0);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                Long l10 = (Long) arrayList2.get(i11);
                l10.getClass();
                tL_inputBusinessBotRecipients.exclude_users.add(r13.p1(r13.Z1(l10)));
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
        ArrayList arrayList2 = this.f790k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f789j;
        }
        if (!arrayList.isEmpty()) {
            wp r12 = wp.r1(e20.f15506s0);
            tL_businessBotRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l4 = (Long) arrayList.get(i10);
                l4.longValue();
                r12.p1(r12.Z1(l4));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i10));
            }
        }
        if (!this.h) {
            wp r13 = wp.r1(e20.f15506s0);
            tL_businessBotRecipients.flags |= 64;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                Long l10 = (Long) arrayList2.get(i11);
                l10.longValue();
                r13.p1(r13.Z1(l10));
                tL_businessBotRecipients.users.add((Long) arrayList2.get(i11));
            }
        }
        return tL_businessBotRecipients;
    }

    public final int d() {
        if (this.h) {
            return this.f787g;
        }
        return this.f786f;
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
            arrayList = this.f790k;
        } else {
            arrayList = this.f789j;
        }
        if (!arrayList.isEmpty()) {
            wp r12 = wp.r1(e20.f15506s0);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l4 = (Long) arrayList.get(i10);
                l4.getClass();
                tL_inputBusinessRecipients.users.add(r12.p1(r12.Z1(l4)));
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
            arrayList = this.f790k;
        } else {
            arrayList = this.f789j;
        }
        if (!arrayList.isEmpty()) {
            wp r12 = wp.r1(e20.f15506s0);
            tL_businessRecipients.flags |= 16;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Long l4 = (Long) arrayList.get(i10);
                l4.getClass();
                r12.p1(r12.Z1(l4));
                tL_businessRecipients.users.add((Long) arrayList.get(i10));
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f791l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f790k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f789j;
            }
            if (arrayList.size() == this.f791l.users.size()) {
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!this.f791l.users.contains(arrayList.get(i10))) {
                        return true;
                    }
                }
                if (this.f788i && !this.h) {
                    if (arrayList2.size() == this.f791l.exclude_users.size()) {
                        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                            if (!this.f791l.exclude_users.contains(arrayList2.get(i11))) {
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

    public final boolean h(b51 b51Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12 = b51Var.d;
        org.telegram.ui.ActionBar.k2 k2Var = this.d;
        if (i12 != 101 && i12 != 103) {
            Runnable runnable = this.e;
            if (i12 == 102) {
                runnable.run();
                return true;
            } else if (i12 == 104) {
                runnable.run();
                return true;
            } else if (b51Var.f7681a != 11) {
                return false;
            } else {
                boolean z13 = b51Var.f24653w;
                String A1 = wp.r1(this.f784b).A1(b51Var.f24654x, false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f783a, this.f785c);
                if (!z13) {
                    i10 = 2131752686;
                } else {
                    i10 = 2131752684;
                }
                String L0 = dd.L0(i10, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                if (!z13) {
                    i11 = 2131752687;
                } else {
                    i11 = 2131752685;
                }
                x1Var.T = dd.a0(null, null, i11, A1);
                alertDialog$Builder.k(dd.L0(2131746336, null), new v0(this, z13, b51Var, 0));
                alertDialog$Builder.h(dd.L0(2131752589, null), null);
                if (k2Var != null) {
                    k2Var.showDialog(x1Var);
                    return true;
                }
                x1Var.show();
                return true;
            }
        }
        if (i12 == 101) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f789j;
        } else {
            arrayList = this.f790k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f34162y = 2;
        usersSelectActivity.G = false;
        if (this.f788i && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.F = z11;
        usersSelectActivity.G = false;
        if (!z10 && this.f793n) {
            z12 = true;
        } else {
            z12 = false;
        }
        usersSelectActivity.H = z12;
        usersSelectActivity.f34157n = new w0(0, this, z10);
        if (k2Var != null) {
            k2Var.presentFragment(usersSelectActivity);
            return true;
        }
        org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
        if (T == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f20390a = true;
        T.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f788i = true;
        this.f791l = tL_businessBotRecipients;
        ArrayList arrayList = this.f789j;
        ArrayList arrayList2 = this.f790k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f787g = 0;
            this.f786f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f786f = 0;
            this.f787g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f791l.users);
            return;
        }
        this.f786f = tL_businessBotRecipients.flags & (-49);
        this.f787g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f791l.users);
        arrayList2.addAll(this.f791l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f788i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f791l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f791l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f791l;
        ArrayList arrayList = this.f789j;
        ArrayList arrayList2 = this.f790k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f787g = 0;
            this.f786f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f786f = 0;
            this.f787g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f791l.users);
            return;
        }
        this.f786f = tL_businessBotRecipients2.flags & (-49);
        this.f787g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f791l.users);
        arrayList2.addAll(this.f791l.exclude_users);
    }

    public final boolean k(v51 v51Var) {
        if (!this.h && this.f789j.isEmpty() && this.f786f == 0) {
            org.telegram.messenger.t2.APP_ERROR.a();
            View B1 = v51Var.B1(101);
            int i10 = -this.f792m;
            this.f792m = i10;
            org.telegram.messenger.i0.F3(i10, B1, null);
            v51Var.y0(v51Var.A1(101));
            return false;
        }
        return true;
    }

    public x0(Context context, int i10, a3.d dVar, p6 p6Var) {
        this.f789j = new ArrayList();
        this.f790k = new ArrayList();
        this.f792m = -4;
        this.f783a = context;
        this.f784b = i10;
        this.d = null;
        this.e = dVar;
        this.f785c = p6Var;
    }
}
