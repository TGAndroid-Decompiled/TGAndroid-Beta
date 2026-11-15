package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.x4;
import c8.ja;
import hi.q4;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class c extends e2 implements is {
    public int E;
    public int F;
    public int G;
    public z4 f17877a;
    public u41 f17878b;
    public a0 f17879c;
    public boolean d;
    public boolean f17880e;
    public int f17881f;
    public TL_account.TL_businessAwayMessage h;
    public int f17882n;
    public boolean f17883r;
    public boolean f17884s;
    public boolean f17885w;
    public int f17886x;
    public int f17887y;

    public static void Z(c cVar, ArrayList arrayList, p41 p41Var) {
        boolean z10;
        boolean z11;
        String M0 = hd.M0(2131752838, null);
        String M02 = hd.M0(2131752835, null);
        b41 b41Var = new b41(2);
        b41Var.f33181l = M0;
        b41Var.f33184o = M02;
        b41Var.f33182m = "RestrictedEmoji";
        b41Var.f33183n = "💤";
        arrayList.add(b41Var);
        b41 i7 = b41.i(1, hd.M0(2131752821, null));
        i7.L(cVar.f17883r);
        arrayList.add(i7);
        arrayList.add(b41.C(null));
        if (cVar.f17883r) {
            u1 d = v1.f(cVar.currentAccount).d("away");
            if (d != null) {
                b41 b41Var2 = new b41(17);
                b41Var2.G = d;
                arrayList.add(b41Var2);
            } else {
                b41 c10 = b41.c(2, 2131232022, hd.M0(2131752837, null));
                c10.f33186q = true;
                arrayList.add(c10);
            }
            arrayList.add(b41.C(null));
            arrayList.add(b41.u(hd.M0(2131752830, null)));
            b41 x10 = b41.x(3, hd.M0(2131752829, null));
            boolean z12 = false;
            if (cVar.f17886x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            x10.L(z10);
            arrayList.add(x10);
            if (cVar.d) {
                b41 x11 = b41.x(4, hd.M0(2131752822, null));
                if (cVar.f17886x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x11.L(z11);
                arrayList.add(x11);
            }
            b41 x12 = b41.x(5, hd.M0(2131752828, null));
            if (cVar.f17886x == 2) {
                z12 = true;
            }
            x12.L(z12);
            arrayList.add(x12);
            if (cVar.f17886x == 2) {
                arrayList.add(b41.C(null));
                arrayList.add(b41.u(hd.M0(2131752830, null)));
                arrayList.add(b41.f(hd.M0(2131752824, null), hd.Q(cVar.F), 8));
                arrayList.add(b41.f(hd.M0(2131752827, null), hd.Q(cVar.G), 9));
            }
            arrayList.add(b41.C(null));
            b41 i10 = b41.i(10, hd.M0(2131752832, null));
            i10.L(cVar.f17885w);
            arrayList.add(i10);
            arrayList.add(b41.C(hd.M0(2131752831, null)));
            arrayList.add(b41.u(hd.M0(2131752688, null)));
            b41 x13 = b41.x(6, hd.M0(2131752781, null));
            x13.L(cVar.f17884s);
            arrayList.add(x13);
            b41 x14 = b41.x(7, hd.M0(2131752776, null));
            x14.L(!cVar.f17884s);
            arrayList.add(x14);
            arrayList.add(b41.C(null));
            cVar.f17879c.a(arrayList, p41Var, true);
            arrayList.add(b41.C(null));
        }
    }

    public final void a0(boolean z10) {
        if (this.f17877a == null) {
            return;
        }
        this.f17877a.a(b0(), z10);
    }

    public final boolean b0() {
        boolean z10;
        a0 a0Var;
        if (this.f17880e) {
            boolean z11 = this.f17883r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.f17884s && ((a0Var = this.f17879c) == null || !a0Var.g())) {
                        int i7 = this.f17882n;
                        int i10 = this.f17886x;
                        if (i7 == i10 && this.h.offline_only == this.f17885w && (i10 != 2 || (this.f17887y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void c0() {
        if (!this.f17877a.f29950y.f57082f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            u1 d = v1.f(this.currentAccount).d("away");
            boolean z10 = this.f17883r;
            if (z10 && d == null) {
                p2.APP_ERROR.a();
                View B1 = this.f17878b.B1(2);
                int i7 = -this.f17881f;
                this.f17881f = i7;
                org.telegram.messenger.g0.F3(i7, B1, null);
                u41 u41Var = this.f17878b;
                u41Var.y0(u41Var.A1(2));
            } else if (z10 && !this.f17879c.k(this.f17878b)) {
            } else {
                this.f17877a.b(true);
                TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f17883r) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f17885w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f18113a;
                    tL_inputBusinessAwayMessage.recipients = this.f17879c.e();
                    int i10 = this.f17886x;
                    if (i10 == 0) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                    } else if (i10 == 1) {
                        updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                    } else if (i10 == 2) {
                        TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                        tL_businessAwayMessageScheduleCustom.start_date = this.F;
                        tL_businessAwayMessageScheduleCustom.end_date = this.G;
                        updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                    }
                    updatebusinessawaymessage.flags |= 1;
                    if (b22 != null) {
                        b22.flags2 |= 8;
                        TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                        b22.business_away_message = tL_businessAwayMessage;
                        tL_businessAwayMessage.offline_only = this.f17885w;
                        tL_businessAwayMessage.shortcut_id = d.f18113a;
                        tL_businessAwayMessage.recipients = this.f17879c.f();
                        b22.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (b22 != null) {
                    b22.flags2 &= -9;
                    b22.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new ai.d1(this, 14));
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 4));
        this.f17877a = this.simpleActionBar.q(hd.M0(2131745946, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new hi.e1(this, 24));
        this.f17879c = a0Var;
        a0Var.h = this.f17884s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        u41 u41Var = new u41(this, new q4(this, 7), new a(this, 0), null);
        this.f17878b = u41Var;
        u41Var.r1();
        this.f17878b.setSectionsDrawBackground(true);
        u41 u41Var2 = this.f17878b;
        u41Var2.f39895g3.f38201r = false;
        frameLayout.addView(u41Var2, ja.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        u41 u41Var;
        p41 p41Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f17880e) {
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
        this.f17883r = z11;
        if (tL_businessAwayMessage != null) {
            z12 = tL_businessAwayMessage.recipients.exclude_selected;
        } else {
            z12 = true;
        }
        this.f17884s = z12;
        if (tL_businessAwayMessage != null) {
            z13 = tL_businessAwayMessage.offline_only;
        } else {
            z13 = true;
        }
        this.f17885w = z13;
        a0 a0Var = this.f17879c;
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
                this.f17882n = 2;
                this.f17886x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i7 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f17887y = i7;
                this.F = i7;
                int i10 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i10;
                this.G = i10;
                u41Var = this.f17878b;
                if (u41Var != null && (p41Var = u41Var.f39895g3) != null) {
                    p41Var.O(true);
                }
                a0(true);
                this.f17880e = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.h;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f17882n = 0;
            this.f17886x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f17882n = 1;
            this.f17886x = 1;
        } else {
            this.f17882n = 0;
            this.f17886x = 0;
        }
        u41Var = this.f17878b;
        if (u41Var != null) {
            p41Var.O(true);
        }
        a0(true);
        this.f17880e = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        if (i7 == ns.F1) {
            u41 u41Var = this.f17878b;
            if (u41Var != null && (p41Var = u41Var.f39895g3) != null) {
                p41Var.O(true);
            }
            a0(true);
        } else if (i7 == ns.E0) {
            d0();
        }
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f17878b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (b0()) {
            if (z10) {
                if (!this.f17883r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = hd.M0(2131743835, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131752820, null);
                alertDialog$Builder.k(hd.M0(2131754216, null), new a(this, 1));
                alertDialog$Builder.h(hd.M0(2131747580, null), new a(this, 2));
                showDialog(t1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.F1);
        getNotificationCenter().c(this, ns.E0);
        v1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.F1);
        getNotificationCenter().n(this, ns.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
