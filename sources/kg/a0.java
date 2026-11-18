package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q2;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class a0 {
    public final Context f18243a;
    public final int f18244b;
    public final i6 f18245c;
    public final h2 d;
    public final Runnable f18246e;
    public int f18247f;
    public int f18248g;
    public boolean h;
    public boolean f18249i;
    public final ArrayList f18250j;
    public final ArrayList f18251k;
    public TL_account.TL_businessBotRecipients f18252l;
    public int f18253m;
    public boolean f18254n;

    public a0(h2 h2Var, Runnable runnable) {
        this.f18250j = new ArrayList();
        this.f18251k = new ArrayList();
        this.f18253m = -4;
        this.f18243a = h2Var.getContext();
        this.f18244b = h2Var.getCurrentAccount();
        this.d = h2Var;
        this.f18246e = runnable;
        this.f18245c = h2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, z41 z41Var, boolean z10) {
        String str;
        String str2;
        z41Var.V();
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
                str = i5.c.k(2131750765, null, e2.m(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = p5.c.v(str, ", ");
                }
                str = i5.c.k(2131750716, null, e2.m(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = p5.c.v(str, ", ");
                }
                str = i5.c.k(2131750780, null, e2.m(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = p5.c.v(str, ", ");
                }
                str = i5.c.k(2131750707, null, e2.m(str));
            }
            ArrayList arrayList2 = this.f18250j;
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
                str = gd.M0(2131752766, null);
            }
            l41 f10 = l41.f(gd.M0(2131752767, null), str, 101);
            f10.f37013g = z10;
            arrayList.add(f10);
        }
        boolean z11 = this.f18249i;
        if (z11 || this.h) {
            if (!z11 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = i5.c.k(2131750765, null, e2.m(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = p5.c.v(str3, ", ");
                    }
                    str3 = i5.c.k(2131750716, null, e2.m(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = p5.c.v(str3, ", ");
                    }
                    str3 = i5.c.k(2131750780, null, e2.m(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = p5.c.v(str3, ", ");
                    }
                    str3 = i5.c.k(2131750707, null, e2.m(str3));
                }
            }
            ArrayList arrayList3 = this.f18251k;
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
                str3 = gd.M0(2131752768, null);
            }
            l41 f11 = l41.f(gd.M0(2131752769, null), str3, 103);
            f11.f37013g = z10;
            arrayList.add(f11);
        }
        z41Var.U();
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
        ArrayList arrayList2 = this.f18251k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f18250j;
        }
        if (!arrayList.isEmpty()) {
            mp u12 = mp.u1(j10.f24773t0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                tL_inputBusinessBotRecipients.users.add(u12.s1(u12.c2(l10)));
            }
        }
        if (!this.h) {
            mp u13 = mp.u1(j10.f24773t0);
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
        ArrayList arrayList2 = this.f18251k;
        if (z14) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f18250j;
        }
        if (!arrayList.isEmpty()) {
            mp u12 = mp.u1(j10.f24773t0);
            tL_businessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.longValue();
                u12.s1(u12.c2(l10));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i7));
            }
        }
        if (!this.h) {
            mp u13 = mp.u1(j10.f24773t0);
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
            return this.f18248g;
        }
        return this.f18247f;
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
            arrayList = this.f18251k;
        } else {
            arrayList = this.f18250j;
        }
        if (!arrayList.isEmpty()) {
            mp u12 = mp.u1(j10.f24773t0);
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
            arrayList = this.f18251k;
        } else {
            arrayList = this.f18250j;
        }
        if (!arrayList.isEmpty()) {
            mp u12 = mp.u1(j10.f24773t0);
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
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f18252l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z10 = this.h;
            ArrayList arrayList2 = this.f18251k;
            if (z10) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f18250j;
            }
            if (arrayList.size() == this.f18252l.users.size()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (!this.f18252l.users.contains(arrayList.get(i7))) {
                        return true;
                    }
                }
                if (this.f18249i && !this.h) {
                    if (arrayList2.size() == this.f18252l.exclude_users.size()) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            if (!this.f18252l.exclude_users.contains(arrayList2.get(i10))) {
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

    public final boolean h(l41 l41Var) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        int i7;
        int i10;
        int i11 = l41Var.d;
        h2 h2Var = this.d;
        boolean z12 = false;
        if (i11 != 101 && i11 != 103) {
            Runnable runnable = this.f18246e;
            if (i11 == 102) {
                runnable.run();
                return true;
            } else if (i11 == 104) {
                runnable.run();
                return true;
            } else if (l41Var.f56589a != 11) {
                return false;
            } else {
                boolean z13 = l41Var.f37028x;
                String D1 = mp.u1(this.f18244b).D1(l41Var.f37029y, false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f18243a, this.f18245c);
                if (!z13) {
                    i7 = 2131752675;
                } else {
                    i7 = 2131752673;
                }
                String M0 = gd.M0(i7, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
                u1Var.S = M0;
                if (!z13) {
                    i10 = 2131752676;
                } else {
                    i10 = 2131752674;
                }
                u1Var.U = gd.a0(null, null, i10, D1);
                alertDialog$Builder.k(gd.M0(2131746126, null), new ab.j(this, z13, l41Var, 2));
                alertDialog$Builder.h(gd.M0(2131752578, null), null);
                if (h2Var != null) {
                    h2Var.showDialog(u1Var);
                    return true;
                }
                u1Var.show();
                return true;
            }
        }
        if (i11 == 101) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f18250j;
        } else {
            arrayList = this.f18251k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z10);
        usersSelectActivity.f43904y = 2;
        usersSelectActivity.H = false;
        boolean z14 = this.f18249i;
        if (z14 && !this.h && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        usersSelectActivity.G = z11;
        usersSelectActivity.H = false;
        usersSelectActivity.I = z14;
        if (!z10 && this.f18254n) {
            z12 = true;
        }
        usersSelectActivity.J = z12;
        usersSelectActivity.f43899n = new ab.z(2, this, z10);
        if (h2Var != null) {
            h2Var.presentFragment(usersSelectActivity);
            return true;
        }
        h2 T = LaunchActivity.T();
        if (T == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f28923a = true;
        T.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f18249i = true;
        this.f18252l = tL_businessBotRecipients;
        ArrayList arrayList = this.f18250j;
        ArrayList arrayList2 = this.f18251k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f18248g = 0;
            this.f18247f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f18247f = 0;
            this.f18248g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f18252l.users);
            return;
        }
        this.f18247f = tL_businessBotRecipients.flags & (-49);
        this.f18248g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f18252l.users);
        arrayList2.addAll(this.f18252l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f18249i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f18252l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f18252l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f18252l;
        ArrayList arrayList = this.f18250j;
        ArrayList arrayList2 = this.f18251k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f18248g = 0;
            this.f18247f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z10 = tL_businessBotRecipients2.exclude_selected;
        this.h = z10;
        if (z10) {
            this.f18247f = 0;
            this.f18248g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f18252l.users);
            return;
        }
        this.f18247f = tL_businessBotRecipients2.flags & (-49);
        this.f18248g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f18252l.users);
        arrayList2.addAll(this.f18252l.exclude_users);
    }

    public final boolean k(e51 e51Var) {
        if (!this.h && this.f18250j.isEmpty() && this.f18247f == 0) {
            q2.APP_ERROR.a();
            View B1 = e51Var.B1(101);
            int i7 = -this.f18253m;
            this.f18253m = i7;
            org.telegram.messenger.g0.E3(i7, B1, null);
            e51Var.y0(e51Var.A1(101));
            return false;
        }
        return true;
    }

    public a0(Context context, int i7, j0 j0Var, i6 i6Var) {
        this.f18250j = new ArrayList();
        this.f18251k = new ArrayList();
        this.f18253m = -4;
        this.f18243a = context;
        this.f18244b = i7;
        this.d = null;
        this.f18246e = j0Var;
        this.f18245c = i6Var;
    }
}
