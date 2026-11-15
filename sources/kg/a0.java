package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.p2;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class a0 {
    public final Context f17848a;
    public final int f17849b;
    public final e6 f17850c;
    public final e2 d;
    public final Runnable f17851e;
    public int f17852f;
    public int f17853g;
    public boolean h;
    public boolean f17854i;
    public final ArrayList f17855j;
    public final ArrayList f17856k;
    public TL_account.TL_businessBotRecipients f17857l;
    public int f17858m;
    public boolean f17859n;

    public a0(e2 e2Var, Runnable runnable) {
        this.f17855j = new ArrayList();
        this.f17856k = new ArrayList();
        this.f17858m = -4;
        this.f17848a = e2Var.getContext();
        this.f17849b = e2Var.getCurrentAccount();
        this.d = e2Var;
        this.f17851e = runnable;
        this.f17850c = e2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, p41 p41Var, boolean z10) {
        String str;
        String str2;
        p41Var.V();
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
                str = i5.c.k(2131750776, null, com.google.android.gms.internal.vision.e2.m(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = r.b.v(str, ", ");
                }
                str = i5.c.k(2131750727, null, com.google.android.gms.internal.vision.e2.m(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = r.b.v(str, ", ");
                }
                str = i5.c.k(2131750791, null, com.google.android.gms.internal.vision.e2.m(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = r.b.v(str, ", ");
                }
                str = i5.c.k(2131750720, null, com.google.android.gms.internal.vision.e2.m(str));
            }
            ArrayList arrayList2 = this.f17855j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder m10 = r.b.m(str, " + ");
                    m10.append(arrayList2.size());
                    str = m10.toString();
                } else {
                    StringBuilder m11 = com.google.android.gms.internal.vision.e2.m(str);
                    m11.append(hd.H(',', "Chats", arrayList2.size()));
                    str = m11.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = hd.M0(2131752777, null);
            }
            b41 f10 = b41.f(hd.M0(2131752778, null), str, 101);
            f10.f33180g = z10;
            arrayList.add(f10);
        }
        boolean z11 = this.f17854i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = i5.c.k(2131750776, null, com.google.android.gms.internal.vision.e2.m(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = r.b.v(str3, ", ");
                    }
                    str3 = i5.c.k(2131750727, null, com.google.android.gms.internal.vision.e2.m(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = r.b.v(str3, ", ");
                    }
                    str3 = i5.c.k(2131750791, null, com.google.android.gms.internal.vision.e2.m(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = r.b.v(str3, ", ");
                    }
                    str3 = i5.c.k(2131750720, null, com.google.android.gms.internal.vision.e2.m(str3));
                }
            }
            ArrayList arrayList3 = this.f17856k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder m12 = r.b.m(str3, " + ");
                    m12.append(arrayList3.size());
                    str3 = m12.toString();
                } else {
                    StringBuilder m13 = com.google.android.gms.internal.vision.e2.m(str3);
                    m13.append(hd.H(',', "Chats", arrayList3.size()));
                    str3 = m13.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = hd.M0(2131752779, null);
            }
            b41 f11 = b41.f(hd.M0(2131752780, null), str3, 103);
            f11.f33180g = z10;
            arrayList.add(f11);
        }
        p41Var.U();
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
        ArrayList arrayList2 = this.f17856k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f17855j;
        }
        if (!arrayList.isEmpty()) {
            np s12 = np.s1(m10.f24940t0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                tL_inputBusinessBotRecipients.users.add(s12.q1(s12.a2(l10)));
            }
        }
        if (!this.h) {
            np s13 = np.s1(m10.f24940t0);
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
        ArrayList arrayList2 = this.f17856k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f17855j;
        }
        if (!arrayList.isEmpty()) {
            np s12 = np.s1(m10.f24940t0);
            tL_businessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.longValue();
                s12.q1(s12.a2(l10));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i7));
            }
        }
        if (!this.h) {
            np s13 = np.s1(m10.f24940t0);
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
            return this.f17853g;
        }
        return this.f17852f;
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
            arrayList = this.f17856k;
        } else {
            arrayList = this.f17855j;
        }
        if (!arrayList.isEmpty()) {
            np s12 = np.s1(m10.f24940t0);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
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
            arrayList = this.f17856k;
        } else {
            arrayList = this.f17855j;
        }
        if (!arrayList.isEmpty()) {
            np s12 = np.s1(m10.f24940t0);
            tL_businessRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                s12.q1(s12.a2(l10));
                tL_businessRecipients.users.add((Long) arrayList.get(i7));
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f17857l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f17856k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f17855j;
            }
            if (arrayList.size() == this.f17857l.users.size()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (!this.f17857l.users.contains(arrayList.get(i7))) {
                        return true;
                    }
                }
                if (this.f17854i && !this.h) {
                    if (arrayList2.size() == this.f17857l.exclude_users.size()) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            if (!this.f17857l.exclude_users.contains(arrayList2.get(i10))) {
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

    public final boolean h(b41 b41Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        int i7;
        int i10;
        int i11 = b41Var.d;
        e2 e2Var = this.d;
        boolean z12 = false;
        if (i11 != 101 && i11 != 103) {
            Runnable runnable = this.f17851e;
            if (i11 == 102) {
                runnable.run();
                return true;
            } else if (i11 == 104) {
                runnable.run();
                return true;
            } else if (b41Var.f56015a != 11) {
                return false;
            } else {
                boolean z13 = b41Var.f33194w;
                String B1 = np.s1(this.f17849b).B1(b41Var.f33195x, false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f17848a, this.f17850c);
                if (!z13) {
                    i7 = 2131752686;
                } else {
                    i7 = 2131752684;
                }
                String M0 = hd.M0(i7, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                if (!z13) {
                    i10 = 2131752687;
                } else {
                    i10 = 2131752685;
                }
                t1Var.U = hd.a0(null, null, i10, B1);
                alertDialog$Builder.k(hd.M0(2131746321, null), new ab.j(this, z13, b41Var, 2));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                if (e2Var != null) {
                    e2Var.showDialog(t1Var);
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
            arrayList = this.f17855j;
        } else {
            arrayList = this.f17856k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f43458y = 2;
        usersSelectActivity.H = false;
        boolean z14 = this.f17854i;
        if (z14 && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.G = z11;
        usersSelectActivity.H = false;
        usersSelectActivity.I = z14;
        if (!z10 && this.f17859n) {
            z12 = true;
        }
        usersSelectActivity.J = z12;
        usersSelectActivity.f43453n = new ab.z(2, this, z10);
        if (e2Var != null) {
            e2Var.presentFragment(usersSelectActivity);
            return true;
        }
        e2 T = LaunchActivity.T();
        if (T == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f28476a = true;
        T.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f17854i = true;
        this.f17857l = tL_businessBotRecipients;
        ArrayList arrayList = this.f17855j;
        ArrayList arrayList2 = this.f17856k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f17853g = 0;
            this.f17852f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f17852f = 0;
            this.f17853g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f17857l.users);
            return;
        }
        this.f17852f = tL_businessBotRecipients.flags & (-49);
        this.f17853g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f17857l.users);
        arrayList2.addAll(this.f17857l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f17854i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f17857l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f17857l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f17857l;
        ArrayList arrayList = this.f17855j;
        ArrayList arrayList2 = this.f17856k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f17853g = 0;
            this.f17852f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f17852f = 0;
            this.f17853g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f17857l.users);
            return;
        }
        this.f17852f = tL_businessBotRecipients2.flags & (-49);
        this.f17853g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f17857l.users);
        arrayList2.addAll(this.f17857l.exclude_users);
    }

    public final boolean k(u41 u41Var) {
        if (!this.h && this.f17855j.isEmpty() && this.f17852f == 0) {
            p2.APP_ERROR.a();
            View B1 = u41Var.B1(101);
            int i7 = -this.f17858m;
            this.f17858m = i7;
            org.telegram.messenger.g0.F3(i7, B1, null);
            u41Var.y0(u41Var.A1(101));
            return false;
        }
        return true;
    }

    public a0(Context context, int i7, hi.e1 e1Var, e6 e6Var) {
        this.f17855j = new ArrayList();
        this.f17856k = new ArrayList();
        this.f17858m = -4;
        this.f17848a = context;
        this.f17849b = i7;
        this.d = null;
        this.f17851e = e1Var;
        this.f17850c = e6Var;
    }
}
