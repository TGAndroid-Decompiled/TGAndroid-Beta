package ag;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import w7.b6;
public final class f extends org.telegram.ui.ActionBar.k2 implements us {
    public int D;
    public int E;
    public int F;
    public l5 f503a;
    public u51 f504b;
    public x0 f505c;
    public boolean d;
    public boolean e;
    public int f506f;
    public TL_account.TL_businessAwayMessage h;
    public int f507n;
    public boolean f508r;
    public boolean f509s;
    public boolean f510w;
    public int f511x;
    public int f512y;

    public static void Y(f fVar, ArrayList arrayList, p51 p51Var) {
        boolean z10;
        boolean z11;
        String L0 = cd.L0(2131752838, null);
        String L02 = cd.L0(2131752835, null);
        a51 a51Var = new a51(2);
        a51Var.f24292l = L0;
        a51Var.f24295o = L02;
        a51Var.f24293m = "RestrictedEmoji";
        a51Var.f24294n = "💤";
        arrayList.add(a51Var);
        a51 i10 = a51.i(1, cd.L0(2131752821, null));
        i10.L(fVar.f508r);
        arrayList.add(i10);
        arrayList.add(a51.C(null));
        if (fVar.f508r) {
            h3 d = i3.f(fVar.currentAccount).d("away");
            if (d != null) {
                a51 a51Var2 = new a51(17);
                a51Var2.G = d;
                arrayList.add(a51Var2);
            } else {
                a51 c10 = a51.c(2, 2131232021, cd.L0(2131752837, null));
                c10.f24297q = true;
                arrayList.add(c10);
            }
            arrayList.add(a51.C(null));
            arrayList.add(a51.u(cd.L0(2131752830, null)));
            a51 x10 = a51.x(3, cd.L0(2131752829, null));
            boolean z12 = false;
            if (fVar.f511x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            x10.L(z10);
            arrayList.add(x10);
            if (fVar.d) {
                a51 x11 = a51.x(4, cd.L0(2131752822, null));
                if (fVar.f511x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x11.L(z11);
                arrayList.add(x11);
            }
            a51 x12 = a51.x(5, cd.L0(2131752828, null));
            if (fVar.f511x == 2) {
                z12 = true;
            }
            x12.L(z12);
            arrayList.add(x12);
            if (fVar.f511x == 2) {
                arrayList.add(a51.C(null));
                arrayList.add(a51.u(cd.L0(2131752830, null)));
                arrayList.add(a51.f(cd.L0(2131752824, null), cd.Q(fVar.E), 8));
                arrayList.add(a51.f(cd.L0(2131752827, null), cd.Q(fVar.F), 9));
            }
            arrayList.add(a51.C(null));
            a51 i11 = a51.i(10, cd.L0(2131752832, null));
            i11.L(fVar.f510w);
            arrayList.add(i11);
            arrayList.add(a51.C(cd.L0(2131752831, null)));
            arrayList.add(a51.u(cd.L0(2131752688, null)));
            a51 x13 = a51.x(6, cd.L0(2131752781, null));
            x13.L(fVar.f509s);
            arrayList.add(x13);
            a51 x14 = a51.x(7, cd.L0(2131752776, null));
            x14.L(!fVar.f509s);
            arrayList.add(x14);
            arrayList.add(a51.C(null));
            fVar.f505c.a(arrayList, p51Var, true);
            arrayList.add(a51.C(null));
        }
    }

    public final void Z(boolean z10) {
        if (this.f503a == null) {
            return;
        }
        this.f503a.a(a0(), z10);
    }

    public final boolean a0() {
        boolean z10;
        x0 x0Var;
        if (this.e) {
            boolean z11 = this.f508r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.f509s && ((x0Var = this.f505c) == null || !x0Var.g())) {
                        int i10 = this.f507n;
                        int i11 = this.f511x;
                        if (i10 == i11 && this.h.offline_only == this.f510w && (i11 != 2 || (this.f512y == this.E && this.D == this.F))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void b0() {
        if (!this.f503a.f20547y.f7021f) {
            if (!a0()) {
                finishFragment();
                return;
            }
            h3 d = i3.f(this.currentAccount).d("away");
            boolean z10 = this.f508r;
            if (z10 && d == null) {
                org.telegram.messenger.t2.APP_ERROR.a();
                View B1 = this.f504b.B1(2);
                int i10 = -this.f506f;
                this.f506f = i10;
                org.telegram.messenger.i0.F3(i10, B1, null);
                u51 u51Var = this.f504b;
                u51Var.y0(u51Var.A1(2));
            } else if (z10 && !this.f505c.k(this.f504b)) {
            } else {
                this.f503a.b(true);
                TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f508r) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f510w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f551a;
                    tL_inputBusinessAwayMessage.recipients = this.f505c.e();
                    int i11 = this.f511x;
                    if (i11 == 0) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                    } else if (i11 == 1) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                    } else if (i11 == 2) {
                        TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                        tL_businessAwayMessageScheduleCustom.start_date = this.E;
                        tL_businessAwayMessageScheduleCustom.end_date = this.F;
                        updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                    }
                    updatebusinessawaymessage.flags |= 1;
                    if (a2 != null) {
                        a2.flags2 |= 8;
                        TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                        a2.business_away_message = tL_businessAwayMessage;
                        tL_businessAwayMessage.offline_only = this.f510w;
                        tL_businessAwayMessage.shortcut_id = d.f551a;
                        tL_businessAwayMessage.recipients = this.f505c.f();
                        a2.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (a2 != null) {
                    a2.flags2 &= -9;
                    a2.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new c(this, 0));
                getMessagesStorage().j2(a2, false);
            }
        }
    }

    public final void c0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        u51 u51Var;
        p51 p51Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.e) {
            return;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        if (a2 == null) {
            getMessagesController().e3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = a2.business_away_message;
        this.h = tL_businessAwayMessage;
        if (a2.business_work_hours != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        if (tL_businessAwayMessage != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f508r = z11;
        if (tL_businessAwayMessage != null) {
            z12 = tL_businessAwayMessage.recipients.exclude_selected;
        } else {
            z12 = true;
        }
        this.f509s = z12;
        if (tL_businessAwayMessage != null) {
            z13 = tL_businessAwayMessage.offline_only;
        } else {
            z13 = true;
        }
        this.f510w = z13;
        x0 x0Var = this.f505c;
        if (x0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            x0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.h;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f507n = 2;
                this.f511x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i10 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f512y = i10;
                this.E = i10;
                int i11 = tL_businessAwayMessageScheduleCustom.end_date;
                this.D = i11;
                this.F = i11;
                u51Var = this.f504b;
                if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
                    p51Var.O(true);
                }
                Z(true);
                this.e = true;
            }
        }
        this.E = getConnectionsManager().getCurrentTime();
        this.F = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.h;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f507n = 0;
            this.f511x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f507n = 1;
            this.f511x = 1;
        } else {
            this.f507n = 0;
            this.f511x = 0;
        }
        u51Var = this.f504b;
        if (u51Var != null) {
            p51Var.O(true);
        }
        Z(true);
        this.e = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(cd.L0(2131752838, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 0));
        this.f503a = this.simpleActionBar.n(cd.L0(2131745963, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        x0 x0Var = new x0(this, new a3.d(this, 3));
        this.f505c = x0Var;
        x0Var.h = this.f509s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        x0Var.j(tL_businessRecipients);
        u51 u51Var = new u51(this, new a(this, 0), new b(this, 0), null);
        this.f504b = u51Var;
        u51Var.r1();
        this.f504b.setSectionsDrawBackground(true);
        u51 u51Var2 = this.f504b;
        u51Var2.f30819f3.f29295r = false;
        frameLayout.addView(u51Var2, b6.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p51 p51Var;
        if (i10 == zs.F1) {
            u51 u51Var = this.f504b;
            if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
                p51Var.O(true);
            }
            Z(true);
        } else if (i10 == zs.E0) {
            c0();
        }
    }

    @Override
    public final tk0 getListViewForSimpleGlass() {
        return this.f504b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (a0()) {
            if (z10) {
                if (!this.f508r) {
                    b0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = cd.L0(2131743860, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131752820, null);
                alertDialog$Builder.k(cd.L0(2131754216, null), new b(this, 1));
                alertDialog$Builder.h(cd.L0(2131747596, null), new b(this, 2));
                showDialog(x1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, zs.F1);
        getNotificationCenter().c(this, zs.E0);
        i3.f(this.currentAccount).h();
        c0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, zs.F1);
        getNotificationCenter().n(this, zs.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
