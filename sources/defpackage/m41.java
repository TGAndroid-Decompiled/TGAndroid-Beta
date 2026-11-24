package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.UsersSelectActivity;
public final class m41 {
    public final Context a;
    public final int b;
    public final wjb c;
    public final d d;
    public final Runnable e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public final ArrayList j;
    public final ArrayList k;
    public TL_account.TL_businessBotRecipients l;
    public int m;
    public boolean n;

    public m41(d dVar, Runnable runnable) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = dVar.getContext();
        this.b = dVar.getCurrentAccount();
        this.d = dVar;
        this.e = runnable;
        this.c = dVar.getResourceProvider();
    }

    public final void a(java.util.ArrayList r18, defpackage.l5c r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m41.a(java.util.ArrayList, l5c, boolean):void");
    }

    public final TL_account.TL_inputBusinessBotRecipients b() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        TL_account.TL_inputBusinessBotRecipients tL_inputBusinessBotRecipients = new TL_account.TL_inputBusinessBotRecipients();
        int d = d();
        tL_inputBusinessBotRecipients.flags = d & (-49);
        boolean z4 = true;
        if ((d & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        tL_inputBusinessBotRecipients.existing_chats = z;
        if ((d & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        tL_inputBusinessBotRecipients.new_chats = z2;
        if ((d & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        tL_inputBusinessBotRecipients.contacts = z3;
        if ((d & 8) == 0) {
            z4 = false;
        }
        tL_inputBusinessBotRecipients.non_contacts = z4;
        boolean z5 = this.h;
        tL_inputBusinessBotRecipients.exclude_selected = z5;
        ArrayList arrayList2 = this.k;
        if (z5) {
            arrayList = arrayList2;
        } else {
            arrayList = this.j;
        }
        if (!arrayList.isEmpty()) {
            na7 q1 = na7.q1(y6c.t0);
            tL_inputBusinessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = (Long) arrayList.get(i);
                l.getClass();
                tL_inputBusinessBotRecipients.users.add(q1.o1(q1.V1(l)));
            }
        }
        if (!this.h) {
            na7 q12 = na7.q1(y6c.t0);
            tL_inputBusinessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                Long l2 = (Long) arrayList2.get(i2);
                l2.getClass();
                tL_inputBusinessBotRecipients.exclude_users.add(q12.o1(q12.V1(l2)));
            }
        }
        return tL_inputBusinessBotRecipients;
    }

    public final TL_account.TL_businessBotRecipients c() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
        int d = d();
        tL_businessBotRecipients.flags = d & (-49);
        boolean z4 = true;
        if ((d & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        tL_businessBotRecipients.existing_chats = z;
        if ((d & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        tL_businessBotRecipients.new_chats = z2;
        if ((d & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        tL_businessBotRecipients.contacts = z3;
        if ((d & 8) == 0) {
            z4 = false;
        }
        tL_businessBotRecipients.non_contacts = z4;
        boolean z5 = this.h;
        tL_businessBotRecipients.exclude_selected = z5;
        ArrayList arrayList2 = this.k;
        if (z5) {
            arrayList = arrayList2;
        } else {
            arrayList = this.j;
        }
        if (!arrayList.isEmpty()) {
            na7 q1 = na7.q1(y6c.t0);
            tL_businessBotRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = (Long) arrayList.get(i);
                l.getClass();
                q1.o1(q1.V1(l));
                tL_businessBotRecipients.users.add((Long) arrayList.get(i));
            }
        }
        if (!this.h) {
            na7 q12 = na7.q1(y6c.t0);
            tL_businessBotRecipients.flags |= 64;
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                Long l2 = (Long) arrayList2.get(i2);
                l2.getClass();
                q12.o1(q12.V1(l2));
                tL_businessBotRecipients.users.add((Long) arrayList2.get(i2));
            }
        }
        return tL_businessBotRecipients;
    }

    public final int d() {
        if (this.h) {
            return this.g;
        }
        return this.f;
    }

    public final TL_account.TL_inputBusinessRecipients e() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        TL_account.TL_inputBusinessRecipients tL_inputBusinessRecipients = new TL_account.TL_inputBusinessRecipients();
        int d = d();
        tL_inputBusinessRecipients.flags = d & (-49);
        boolean z4 = true;
        if ((d & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        tL_inputBusinessRecipients.existing_chats = z;
        if ((d & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        tL_inputBusinessRecipients.new_chats = z2;
        if ((d & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        tL_inputBusinessRecipients.contacts = z3;
        if ((d & 8) == 0) {
            z4 = false;
        }
        tL_inputBusinessRecipients.non_contacts = z4;
        boolean z5 = this.h;
        tL_inputBusinessRecipients.exclude_selected = z5;
        if (z5) {
            arrayList = this.k;
        } else {
            arrayList = this.j;
        }
        if (!arrayList.isEmpty()) {
            na7 q1 = na7.q1(y6c.t0);
            tL_inputBusinessRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = (Long) arrayList.get(i);
                l.getClass();
                tL_inputBusinessRecipients.users.add(q1.o1(q1.V1(l)));
            }
        }
        return tL_inputBusinessRecipients;
    }

    public final TL_account.TL_businessRecipients f() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        TL_account.TL_businessRecipients tL_businessRecipients = new TL_account.TL_businessRecipients();
        int d = d();
        tL_businessRecipients.flags = d & (-49);
        boolean z4 = true;
        if ((d & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        tL_businessRecipients.existing_chats = z;
        if ((d & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        tL_businessRecipients.new_chats = z2;
        if ((d & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        tL_businessRecipients.contacts = z3;
        if ((d & 8) == 0) {
            z4 = false;
        }
        tL_businessRecipients.non_contacts = z4;
        boolean z5 = this.h;
        tL_businessRecipients.exclude_selected = z5;
        if (z5) {
            arrayList = this.k;
        } else {
            arrayList = this.j;
        }
        if (!arrayList.isEmpty()) {
            na7 q1 = na7.q1(y6c.t0);
            tL_businessRecipients.flags |= 16;
            for (int i = 0; i < arrayList.size(); i++) {
                Long l = (Long) arrayList.get(i);
                l.getClass();
                q1.o1(q1.V1(l));
                tL_businessRecipients.users.add((Long) arrayList.get(i));
            }
        }
        return tL_businessRecipients;
    }

    public final boolean g() {
        ArrayList arrayList;
        TL_account.TL_businessBotRecipients tL_businessBotRecipients = this.l;
        if (tL_businessBotRecipients != null && tL_businessBotRecipients.exclude_selected == this.h && (tL_businessBotRecipients.flags & (-49)) == d()) {
            boolean z = this.h;
            ArrayList arrayList2 = this.k;
            if (z) {
                arrayList = arrayList2;
            } else {
                arrayList = this.j;
            }
            if (arrayList.size() == this.l.users.size()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (!this.l.users.contains(arrayList.get(i))) {
                        return true;
                    }
                }
                if (this.i && !this.h) {
                    if (arrayList2.size() == this.l.exclude_users.size()) {
                        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                            if (!this.l.exclude_users.contains(arrayList2.get(i2))) {
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

    public final boolean h(c4c c4cVar) {
        boolean z;
        ArrayList arrayList;
        boolean z2;
        boolean z3;
        int i;
        int i2;
        int i3 = c4cVar.d;
        d dVar = this.d;
        if (i3 != 101) {
            if (i3 == 103) {
                z = false;
            } else {
                Runnable runnable = this.e;
                if (i3 == 102) {
                    runnable.run();
                    return true;
                } else if (i3 == 104) {
                    runnable.run();
                    return true;
                } else if (c4cVar.a != 11) {
                    return false;
                } else {
                    boolean z4 = c4cVar.x;
                    String y1 = na7.q1(this.b).y1(c4cVar.y, false);
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.c, this.a);
                    if (!z4) {
                        i = 2131752674;
                    } else {
                        i = 2131752672;
                    }
                    String M0 = k96.M0(i, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.S = M0;
                    if (!z4) {
                        i2 = 2131752675;
                    } else {
                        i2 = 2131752673;
                    }
                    hdVar.U = k96.a0(null, null, i2, y1);
                    alertDialog$Builder.j(k96.M0(2131746128, null), new ch(this, z4, c4cVar, (byte) 1));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    if (dVar != null) {
                        dVar.showDialog(hdVar);
                        return true;
                    }
                    hdVar.show();
                    return true;
                }
            }
        } else {
            z = true;
        }
        if (z) {
            arrayList = this.j;
        } else {
            arrayList = this.k;
        }
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(d(), arrayList, z);
        usersSelectActivity.y = (byte) 2;
        usersSelectActivity.H = false;
        boolean z5 = this.i;
        if (z5 && !this.h && !z) {
            z2 = true;
        } else {
            z2 = false;
        }
        usersSelectActivity.G = z2;
        usersSelectActivity.H = false;
        usersSelectActivity.I = z5;
        if (!z && this.n) {
            z3 = true;
        } else {
            z3 = false;
        }
        usersSelectActivity.J = z3;
        usersSelectActivity.n = new l41((byte) 0, this, z);
        if (dVar != null) {
            dVar.presentFragment(usersSelectActivity);
            return true;
        }
        d S = LaunchActivity.S();
        if (S == 0) {
            return true;
        }
        ?? obj = new Object();
        obj.a = true;
        S.showAsSheet(usersSelectActivity, obj);
        return true;
    }

    public final void i(TL_account.TL_businessBotRecipients tL_businessBotRecipients) {
        this.i = true;
        this.l = tL_businessBotRecipients;
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.g = 0;
            this.f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z = tL_businessBotRecipients.exclude_selected;
        this.h = z;
        if (z) {
            this.f = 0;
            this.g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.l.users);
            return;
        }
        this.f = tL_businessBotRecipients.flags & (-49);
        this.g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.l.users);
        arrayList2.addAll(this.l.exclude_users);
    }

    public final void j(TL_account.TL_businessRecipients tL_businessRecipients) {
        TL_account.TL_businessBotRecipients tL_businessBotRecipients;
        this.i = false;
        if (tL_businessRecipients != null) {
            tL_businessBotRecipients = new TL_account.TL_businessBotRecipients();
            this.l = tL_businessBotRecipients;
            tL_businessBotRecipients.flags = tL_businessRecipients.flags;
            tL_businessBotRecipients.existing_chats = tL_businessRecipients.existing_chats;
            tL_businessBotRecipients.new_chats = tL_businessRecipients.new_chats;
            tL_businessBotRecipients.contacts = tL_businessRecipients.contacts;
            tL_businessBotRecipients.non_contacts = tL_businessRecipients.non_contacts;
            tL_businessBotRecipients.exclude_selected = tL_businessRecipients.exclude_selected;
            tL_businessBotRecipients.users = tL_businessRecipients.users;
        } else {
            tL_businessBotRecipients = null;
            this.l = null;
        }
        ArrayList arrayList = this.j;
        ArrayList arrayList2 = this.k;
        if (tL_businessBotRecipients == null) {
            this.h = true;
            this.g = 0;
            this.f = 0;
            arrayList.clear();
            arrayList2.clear();
            return;
        }
        boolean z = tL_businessBotRecipients.exclude_selected;
        this.h = z;
        if (z) {
            this.f = 0;
            this.g = tL_businessBotRecipients.flags & (-49);
            arrayList.clear();
            arrayList2.clear();
            arrayList2.addAll(this.l.users);
            return;
        }
        this.f = tL_businessBotRecipients.flags & (-49);
        this.g = 0;
        arrayList.clear();
        arrayList2.clear();
        arrayList.addAll(this.l.users);
        arrayList2.addAll(this.l.exclude_users);
    }

    public final boolean k(q5c q5cVar) {
        if (!this.h && this.j.isEmpty() && this.f == 0) {
            pw0.APP_ERROR.a();
            View B1 = q5cVar.B1(101);
            int i = -this.m;
            this.m = i;
            gl.B3(i, B1, null);
            q5cVar.z0(q5cVar.A1(101));
            return false;
        }
        return true;
    }

    public m41(Activity activity, int i, hq1 hq1Var, wjb wjbVar) {
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.m = -4;
        this.a = activity;
        this.b = i;
        this.d = null;
        this.e = hq1Var;
        this.c = wjbVar;
    }
}
