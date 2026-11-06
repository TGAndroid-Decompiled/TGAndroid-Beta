package kg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import fi.h9;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.w31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class a0 {
    public final Context f17286a;
    public final int f17287b;
    public final f6 f17288c;
    public final f2 d;
    public final Runnable f17289e;
    public int f17290f;
    public int f17291g;
    public boolean h;
    public boolean f17292i;
    public final ArrayList f17293j;
    public final ArrayList f17294k;
    public TL_account.TL_businessBotRecipients f17295l;
    public int f17296m;
    public boolean f17297n;

    public a0(f2 f2Var, Runnable runnable) {
        this.f17293j = new ArrayList();
        this.f17294k = new ArrayList();
        this.f17296m = -4;
        this.f17286a = f2Var.getContext();
        this.f17287b = f2Var.getCurrentAccount();
        this.d = f2Var;
        this.f17289e = runnable;
        this.f17288c = f2Var.getResourceProvider();
    }

    public final void a(ArrayList arrayList, k41 k41Var, boolean z9) {
        String str;
        String str2;
        k41Var.V();
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
                str = jg.g.l(2131750777, null, com.google.android.recaptcha.internal.a.m(str2));
            }
            if ((d & 2) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = rf.b.q(str, ", ");
                }
                str = jg.g.l(2131750728, null, com.google.android.recaptcha.internal.a.m(str));
            }
            if ((d & 4) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = rf.b.q(str, ", ");
                }
                str = jg.g.l(2131750792, null, com.google.android.recaptcha.internal.a.m(str));
            }
            if ((d & 8) != 0) {
                if (!TextUtils.isEmpty(str)) {
                    str = rf.b.q(str, ", ");
                }
                str = jg.g.l(2131750721, null, com.google.android.recaptcha.internal.a.m(str));
            }
            ArrayList arrayList2 = this.f17293j;
            if (!arrayList2.isEmpty()) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder j3 = rf.b.j(str, " + ");
                    j3.append(arrayList2.size());
                    str = j3.toString();
                } else {
                    StringBuilder m10 = com.google.android.recaptcha.internal.a.m(str);
                    m10.append(hd.H(',', "Chats", arrayList2.size()));
                    str = m10.toString();
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = hd.M0(2131752777, null);
            }
            w31 f10 = w31.f(hd.M0(2131752778, null), str, 101);
            f10.f39826g = z9;
            arrayList.add(f10);
        }
        boolean z10 = this.f17292i;
        if (z10 || this.h) {
            if (!z10 || this.h) {
                if ((d & 1) != 0) {
                    if (!TextUtils.isEmpty("")) {
                        str3 = ", ";
                    }
                    str3 = jg.g.l(2131750777, null, com.google.android.recaptcha.internal.a.m(str3));
                }
                if ((d & 2) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = rf.b.q(str3, ", ");
                    }
                    str3 = jg.g.l(2131750728, null, com.google.android.recaptcha.internal.a.m(str3));
                }
                if ((d & 4) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = rf.b.q(str3, ", ");
                    }
                    str3 = jg.g.l(2131750792, null, com.google.android.recaptcha.internal.a.m(str3));
                }
                if ((d & 8) != 0) {
                    if (!TextUtils.isEmpty(str3)) {
                        str3 = rf.b.q(str3, ", ");
                    }
                    str3 = jg.g.l(2131750721, null, com.google.android.recaptcha.internal.a.m(str3));
                }
            }
            ArrayList arrayList3 = this.f17294k;
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(str3)) {
                    StringBuilder j10 = rf.b.j(str3, " + ");
                    j10.append(arrayList3.size());
                    str3 = j10.toString();
                } else {
                    StringBuilder m11 = com.google.android.recaptcha.internal.a.m(str3);
                    m11.append(hd.H(',', "Chats", arrayList3.size()));
                    str3 = m11.toString();
                }
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = hd.M0(2131752779, null);
            }
            w31 f11 = w31.f(hd.M0(2131752780, null), str3, 103);
            f11.f39826g = z9;
            arrayList.add(f11);
        }
        k41Var.U();
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        boolean z9;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        boolean z12 = true;
        if ((d & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        tL_inputBusinessBotRecipients.existing_chats = z9;
        if ((d & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_inputBusinessBotRecipients.new_chats = z10;
        if ((d & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_inputBusinessBotRecipients.contacts = z11;
        if ((d & 8) == 0) {
            z12 = false;
        }
        tL_inputBusinessBotRecipients.non_contacts = z12;
        boolean z13 = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z13;
        ArrayList arrayList2 = this.f17294k;
        if (z13) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f17293j;
        }
        if (!arrayList.isEmpty()) {
            qp s12 = qp.s1(p10.f24459s0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.getClass();
                tL_inputBusinessBotRecipients.users.add(s12.q1(s12.a2(l10)));
            }
        }
        if (!this.h) {
            qp s13 = qp.s1(p10.f24459s0);
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
        boolean z9;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
        int d = d();
        tL_businessBotRecipients.flags = d & (-49);
        boolean z12 = true;
        if ((d & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        tL_businessBotRecipients.existing_chats = z9;
        if ((d & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_businessBotRecipients.new_chats = z10;
        if ((d & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_businessBotRecipients.contacts = z11;
        if ((d & 8) == 0) {
            z12 = false;
        }
        tL_businessBotRecipients.non_contacts = z12;
        boolean z13 = this.h;
        tL_businessBotRecipients.exclude_selected = z13;
        ArrayList arrayList2 = this.f17294k;
        if (z13) {
            arrayList = arrayList2;
        } else {
            arrayList = this.f17293j;
        }
        if (!arrayList.isEmpty()) {
            qp s12 = qp.s1(p10.f24459s0);
            tL_businessBotRecipients.flags |= 16;
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                Long l10 = (Long) arrayList.get(i7);
                l10.longValue();
                s12.q1(s12.a2(l10));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i7));
            }
        }
        if (!this.h) {
            qp s13 = qp.s1(p10.f24459s0);
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
            return this.f17291g;
        }
        return this.f17290f;
    }

    public final TL_account.TL_inputBusinessRecipients e() {
        boolean z9;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        TL_account.TL_inputBusinessRecipients tL_inputBusinessRecipients = new TL_account.TL_inputBusinessRecipients();
        int d = d();
        tL_inputBusinessRecipients.flags = d & (-49);
        boolean z12 = true;
        if ((d & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        tL_inputBusinessRecipients.existing_chats = z9;
        if ((d & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_inputBusinessRecipients.new_chats = z10;
        if ((d & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_inputBusinessRecipients.contacts = z11;
        if ((d & 8) == 0) {
            z12 = false;
        }
        tL_inputBusinessRecipients.non_contacts = z12;
        boolean z13 = this.h;
        tL_inputBusinessRecipients.exclude_selected = z13;
        if (z13) {
            arrayList = this.f17294k;
        } else {
            arrayList = this.f17293j;
        }
        if (!arrayList.isEmpty()) {
            qp s12 = qp.s1(p10.f24459s0);
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
        boolean z9;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        TL_account.TL_businessRecipients tL_businessRecipients = new TL_account.TL_businessRecipients();
        int d = d();
        tL_businessRecipients.flags = d & (-49);
        boolean z12 = true;
        if ((d & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        tL_businessRecipients.existing_chats = z9;
        if ((d & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        tL_businessRecipients.new_chats = z10;
        if ((d & 4) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        tL_businessRecipients.contacts = z11;
        if ((d & 8) == 0) {
            z12 = false;
        }
        tL_businessRecipients.non_contacts = z12;
        boolean z13 = this.h;
        tL_businessRecipients.exclude_selected = z13;
        if (z13) {
            arrayList = this.f17294k;
        } else {
            arrayList = this.f17293j;
        }
        if (!arrayList.isEmpty()) {
            qp s12 = qp.s1(p10.f24459s0);
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
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.f17295l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z9 = this.h;
            ArrayList arrayList2 = this.f17294k;
            if (z9) {
                arrayList = arrayList2;
            } else {
                arrayList = this.f17293j;
            }
            if (arrayList.size() == this.f17295l.users.size()) {
                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                    if (!this.f17295l.users.contains(arrayList.get(i7))) {
                        return true;
                    }
                }
                if (this.f17292i && !this.h) {
                    if (arrayList2.size() == this.f17295l.exclude_users.size()) {
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            if (!this.f17295l.exclude_users.contains(arrayList2.get(i10))) {
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

    public final boolean h(w31 w31Var) {
        boolean z9;
        ArrayList arrayList;
        boolean z10;
        int i7;
        int i10;
        int i11 = w31Var.d;
        f2 f2Var = this.d;
        boolean z11 = false;
        if (i11 != 101 && i11 != 103) {
            Runnable runnable = this.f17289e;
            if (i11 == 102) {
                runnable.run();
                return true;
            } else if (i11 == 104) {
                runnable.run();
                return true;
            } else if (w31Var.f54440a != 11) {
                return false;
            } else {
                boolean z12 = w31Var.f39840w;
                String B1 = qp.s1(this.f17287b).B1(w31Var.f39841x, false);
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f17286a, this.f17288c);
                if (!z12) {
                    i7 = 2131752686;
                } else {
                    i7 = 2131752684;
                }
                String M0 = hd.M0(i7, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                if (!z12) {
                    i10 = 2131752687;
                } else {
                    i10 = 2131752685;
                }
                u1Var.T = hd.a0(null, null, i10, B1);
                alertDialog$Builder.k(hd.M0(2131746320, null), new ab.j(this, z12, w31Var, 2));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                if (f2Var != null) {
                    f2Var.showDialog(u1Var);
                    return true;
                }
                u1Var.show();
                return true;
            }
        }
        if (i11 == 101) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            arrayList = this.f17293j;
        } else {
            arrayList = this.f17294k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z9);
        usersSelectActivity.f42081y = 2;
        usersSelectActivity.G = false;
        boolean z13 = this.f17292i;
        if (z13 && !this.h && !z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        usersSelectActivity.F = z10;
        usersSelectActivity.G = false;
        usersSelectActivity.H = z13;
        if (!z9 && this.f17297n) {
            z11 = true;
        }
        usersSelectActivity.I = z11;
        usersSelectActivity.f42076n = new ab.y(2, this, z9);
        if (f2Var != null) {
            f2Var.presentFragment(usersSelectActivity);
            return true;
        }
        f2 T = LaunchActivity.T();
        if (T == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.f27420a = true;
        T.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.f17292i = true;
        this.f17295l = tL_businessBotRecipients;
        ArrayList arrayList = this.f17293j;
        ArrayList arrayList2 = this.f17294k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.f17291g = 0;
            this.f17290f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z9 = tL_businessBotRecipients.exclude_selected;
        this.h = z9;
        if (z9) {
            this.f17290f = 0;
            this.f17291g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f17295l.users);
            return;
        }
        this.f17290f = tL_businessBotRecipients.flags & (-49);
        this.f17291g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f17295l.users);
        arrayList2.addAll(this.f17295l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        this.f17292i = false;
        if (tL_businessRecipients != null) {
            TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.f17295l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            this.f17295l = null;
        }
        TL_account.TL_businessBotRecipients tL_businessBotRecipients2 = this.f17295l;
        ArrayList arrayList = this.f17293j;
        ArrayList arrayList2 = this.f17294k;
        if (tL_businessBotRecipients2 == null) {
            this.h = true;
            this.f17291g = 0;
            this.f17290f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z9 = tL_businessBotRecipients2.exclude_selected;
        this.h = z9;
        if (z9) {
            this.f17290f = 0;
            this.f17291g = tL_businessBotRecipients2.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.f17295l.users);
            return;
        }
        this.f17290f = tL_businessBotRecipients2.flags & (-49);
        this.f17291g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.f17295l.users);
        arrayList2.addAll(this.f17295l.exclude_users);
    }

    public final boolean k(p41 p41Var) {
        if (!this.h && this.f17293j.isEmpty() && this.f17290f == 0) {
            p2.APP_ERROR.a();
            View B1 = p41Var.B1(101);
            int i7 = -this.f17296m;
            this.f17296m = i7;
            org.telegram.messenger.g0.G3(i7, B1, null);
            p41Var.y0(p41Var.A1(101));
            return false;
        }
        return true;
    }

    public a0(Context context, int i7, h9 h9Var, f6 f6Var) {
        this.f17293j = new ArrayList();
        this.f17294k = new ArrayList();
        this.f17296m = -4;
        this.f17286a = context;
        this.f17287b = i7;
        this.d = null;
        this.f17289e = h9Var;
        this.f17288c = f6Var;
    }
}
