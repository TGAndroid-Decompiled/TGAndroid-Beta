package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import fi.h9;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p2;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r31;
public final class c extends f2 implements ls {
    public int D;
    public int E;
    public int F;
    public b5 f17315a;
    public k41 f17316b;
    public a0 f17317c;
    public boolean d;
    public boolean f17318e;
    public int f17319f;
    public TL_account.TL_businessAwayMessage h;
    public int f17320n;
    public boolean f17321r;
    public boolean f17322s;
    public boolean f17323w;
    public int f17324x;
    public int f17325y;

    public static void Z(c cVar, ArrayList arrayList, f41 f41Var) {
        boolean z9;
        boolean z10;
        String M0 = hd.M0(2131752838, null);
        String M02 = hd.M0(2131752835, null);
        r31 r31Var = new r31(2);
        r31Var.f37598l = M0;
        r31Var.f37601o = M02;
        r31Var.f37599m = "RestrictedEmoji";
        r31Var.f37600n = "💤";
        arrayList.add(r31Var);
        r31 i7 = r31.i(1, hd.M0(2131752821, null));
        i7.L(cVar.f17321r);
        arrayList.add(i7);
        arrayList.add(r31.C(null));
        if (cVar.f17321r) {
            s1 d = t1.f(cVar.currentAccount).d("away");
            if (d != null) {
                r31 r31Var2 = new r31(17);
                r31Var2.G = d;
                arrayList.add(r31Var2);
            } else {
                r31 c10 = r31.c(2, 2131232022, hd.M0(2131752837, null));
                c10.f37603q = true;
                arrayList.add(c10);
            }
            arrayList.add(r31.C(null));
            arrayList.add(r31.u(hd.M0(2131752830, null)));
            r31 x10 = r31.x(3, hd.M0(2131752829, null));
            boolean z11 = false;
            if (cVar.f17324x == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            x10.L(z9);
            arrayList.add(x10);
            if (cVar.d) {
                r31 x11 = r31.x(4, hd.M0(2131752822, null));
                if (cVar.f17324x == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                x11.L(z10);
                arrayList.add(x11);
            }
            r31 x12 = r31.x(5, hd.M0(2131752828, null));
            if (cVar.f17324x == 2) {
                z11 = true;
            }
            x12.L(z11);
            arrayList.add(x12);
            if (cVar.f17324x == 2) {
                arrayList.add(r31.C(null));
                arrayList.add(r31.u(hd.M0(2131752830, null)));
                arrayList.add(r31.f(hd.M0(2131752824, null), hd.Q(cVar.E), 8));
                arrayList.add(r31.f(hd.M0(2131752827, null), hd.Q(cVar.F), 9));
            }
            arrayList.add(r31.C(null));
            r31 i10 = r31.i(10, hd.M0(2131752832, null));
            i10.L(cVar.f17323w);
            arrayList.add(i10);
            arrayList.add(r31.C(hd.M0(2131752831, null)));
            arrayList.add(r31.u(hd.M0(2131752688, null)));
            r31 x13 = r31.x(6, hd.M0(2131752781, null));
            x13.L(cVar.f17322s);
            arrayList.add(x13);
            r31 x14 = r31.x(7, hd.M0(2131752776, null));
            x14.L(!cVar.f17322s);
            arrayList.add(x14);
            arrayList.add(r31.C(null));
            cVar.f17317c.a(arrayList, f41Var, true);
            arrayList.add(r31.C(null));
        }
    }

    public final void a0(boolean z9) {
        if (this.f17315a == null) {
            return;
        }
        this.f17315a.a(b0(), z9);
    }

    public final boolean b0() {
        boolean z9;
        a0 a0Var;
        if (this.f17318e) {
            boolean z10 = this.f17321r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (tL_businessAwayMessage != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z10 == z9) {
                if (z10 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.f17322s && ((a0Var = this.f17317c) == null || !a0Var.g())) {
                        int i7 = this.f17320n;
                        int i10 = this.f17324x;
                        if (i7 == i10 && this.h.offline_only == this.f17323w && (i10 != 2 || (this.f17325y == this.E && this.D == this.F))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void c0() {
        if (!this.f17315a.f27354y.f55371f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            s1 d = t1.f(this.currentAccount).d("away");
            boolean z9 = this.f17321r;
            if (z9 && d == null) {
                p2.APP_ERROR.a();
                View B1 = this.f17316b.B1(2);
                int i7 = -this.f17319f;
                this.f17319f = i7;
                org.telegram.messenger.g0.G3(i7, B1, null);
                k41 k41Var = this.f17316b;
                k41Var.y0(k41Var.A1(2));
            } else if (z9 && !this.f17317c.k(this.f17316b)) {
            } else {
                this.f17315a.b(true);
                TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f17321r) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f17323w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f17529a;
                    tL_inputBusinessAwayMessage.recipients = this.f17317c.e();
                    int i10 = this.f17324x;
                    if (i10 == 0) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                    } else if (i10 == 1) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                    } else if (i10 == 2) {
                        TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                        tL_businessAwayMessageScheduleCustom.start_date = this.E;
                        tL_businessAwayMessageScheduleCustom.end_date = this.F;
                        updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                    }
                    updatebusinessawaymessage.flags |= 1;
                    if (b22 != null) {
                        b22.flags2 |= 8;
                        TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                        b22.business_away_message = tL_businessAwayMessage;
                        tL_businessAwayMessage.offline_only = this.f17323w;
                        tL_businessAwayMessage.shortcut_id = d.f17529a;
                        tL_businessAwayMessage.recipients = this.f17317c.f();
                        b22.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (b22 != null) {
                    b22.flags2 &= -9;
                    b22.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new bi.j0(this, 14));
                getMessagesStorage().j2(b22, false);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(hd.M0(2131752838, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 11));
        this.f17315a = this.simpleActionBar.n(hd.M0(2131745947, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new h9(this, 22));
        this.f17317c = a0Var;
        a0Var.h = this.f17322s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        k41 k41Var = new k41(this, new hi.u1(this, 5), new a(this, 0), null);
        this.f17316b = k41Var;
        k41Var.r1();
        this.f17316b.setSectionsDrawBackground(true);
        k41 k41Var2 = this.f17316b;
        k41Var2.f35167f3.f33473r = false;
        frameLayout.addView(k41Var2, ha.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        k41 k41Var;
        f41 f41Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f17318e) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = b22.business_away_message;
        this.h = tL_businessAwayMessage;
        if (b22.business_work_hours != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.d = z9;
        if (tL_businessAwayMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f17321r = z10;
        if (tL_businessAwayMessage != null) {
            z11 = tL_businessAwayMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.f17322s = z11;
        if (tL_businessAwayMessage != null) {
            z12 = tL_businessAwayMessage.offline_only;
        } else {
            z12 = true;
        }
        this.f17323w = z12;
        a0 a0Var = this.f17317c;
        if (a0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.h;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f17320n = 2;
                this.f17324x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i7 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f17325y = i7;
                this.E = i7;
                int i10 = tL_businessAwayMessageScheduleCustom.end_date;
                this.D = i10;
                this.F = i10;
                k41Var = this.f17316b;
                if (k41Var != null && (f41Var = k41Var.f35167f3) != null) {
                    f41Var.O(true);
                }
                a0(true);
                this.f17318e = true;
            }
        }
        this.E = getConnectionsManager().getCurrentTime();
        this.F = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.h;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f17320n = 0;
            this.f17324x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f17320n = 1;
            this.f17324x = 1;
        } else {
            this.f17320n = 0;
            this.f17324x = 0;
        }
        k41Var = this.f17316b;
        if (k41Var != null) {
            f41Var.O(true);
        }
        a0(true);
        this.f17318e = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        f41 f41Var;
        if (i7 == qs.F1) {
            k41 k41Var = this.f17316b;
            if (k41Var != null && (f41Var = k41Var.f35167f3) != null) {
                f41Var.O(true);
            }
            a0(true);
        } else if (i7 == qs.E0) {
            d0();
        }
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f17316b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (b0()) {
            if (z9) {
                if (!this.f17321r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = hd.M0(2131743836, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27292a;
                u1Var.R = M0;
                u1Var.T = hd.M0(2131752820, null);
                alertDialog$Builder.k(hd.M0(2131754216, null), new a(this, 1));
                alertDialog$Builder.h(hd.M0(2131747579, null), new a(this, 2));
                showDialog(u1Var);
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.F1);
        getNotificationCenter().c(this, qs.E0);
        t1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.F1);
        getNotificationCenter().n(this, qs.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
