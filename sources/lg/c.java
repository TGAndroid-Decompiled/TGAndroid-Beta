package lg;

import ai.g5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import gi.f6;
import gi.q4;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class c extends d2 implements cs {
    public int E;
    public int F;
    public int G;
    public b5 f18249a;
    public l41 f18250b;
    public b0 f18251c;
    public boolean d;
    public boolean f18252e;
    public int f18253f;
    public TL_account.TL_businessAwayMessage h;
    public int f18254n;
    public boolean f18255r;
    public boolean f18256s;
    public boolean f18257w;
    public int f18258x;
    public int f18259y;

    public static void Z(c cVar, ArrayList arrayList, f41 f41Var) {
        boolean z10;
        boolean z11;
        String M0 = bd.M0(2131752838, null);
        String M02 = bd.M0(2131752835, null);
        r31 r31Var = new r31(2);
        r31Var.f37627l = M0;
        r31Var.f37630o = M02;
        r31Var.f37628m = "RestrictedEmoji";
        r31Var.f37629n = "💤";
        arrayList.add(r31Var);
        r31 i3 = r31.i(1, bd.M0(2131752821, null));
        i3.L(cVar.f18255r);
        arrayList.add(i3);
        arrayList.add(r31.C(null));
        if (cVar.f18255r) {
            t1 d = u1.f(cVar.currentAccount).d("away");
            if (d != null) {
                r31 r31Var2 = new r31(17);
                r31Var2.G = d;
                arrayList.add(r31Var2);
            } else {
                r31 c2 = r31.c(2, 2131232022, bd.M0(2131752837, null));
                c2.f37632q = true;
                arrayList.add(c2);
            }
            arrayList.add(r31.C(null));
            arrayList.add(r31.u(bd.M0(2131752830, null)));
            r31 x10 = r31.x(3, bd.M0(2131752829, null));
            boolean z12 = false;
            if (cVar.f18258x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            x10.L(z10);
            arrayList.add(x10);
            if (cVar.d) {
                r31 x11 = r31.x(4, bd.M0(2131752822, null));
                if (cVar.f18258x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x11.L(z11);
                arrayList.add(x11);
            }
            r31 x12 = r31.x(5, bd.M0(2131752828, null));
            if (cVar.f18258x == 2) {
                z12 = true;
            }
            x12.L(z12);
            arrayList.add(x12);
            if (cVar.f18258x == 2) {
                arrayList.add(r31.C(null));
                arrayList.add(r31.u(bd.M0(2131752830, null)));
                arrayList.add(r31.f(bd.M0(2131752824, null), bd.Q(cVar.F), 8));
                arrayList.add(r31.f(bd.M0(2131752827, null), bd.Q(cVar.G), 9));
            }
            arrayList.add(r31.C(null));
            r31 i10 = r31.i(10, bd.M0(2131752832, null));
            i10.L(cVar.f18257w);
            arrayList.add(i10);
            arrayList.add(r31.C(bd.M0(2131752831, null)));
            arrayList.add(r31.u(bd.M0(2131752688, null)));
            r31 x13 = r31.x(6, bd.M0(2131752781, null));
            x13.L(cVar.f18256s);
            arrayList.add(x13);
            r31 x14 = r31.x(7, bd.M0(2131752776, null));
            x14.L(!cVar.f18256s);
            arrayList.add(x14);
            arrayList.add(r31.C(null));
            cVar.f18251c.a(arrayList, f41Var, true);
            arrayList.add(r31.C(null));
        }
    }

    public final void a0(boolean z10) {
        if (this.f18249a == null) {
            return;
        }
        this.f18249a.a(b0(), z10);
    }

    public final boolean b0() {
        boolean z10;
        b0 b0Var;
        if (this.f18252e) {
            boolean z11 = this.f18255r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.f18256s && ((b0Var = this.f18251c) == null || !b0Var.g())) {
                        int i3 = this.f18254n;
                        int i10 = this.f18258x;
                        if (i3 == i10 && this.h.offline_only == this.f18257w && (i10 != 2 || (this.f18259y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void c0() {
        if (!this.f18249a.f27421y.f53841f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            t1 d = u1.f(this.currentAccount).d("away");
            boolean z10 = this.f18255r;
            if (z10 && d == null) {
                p2.APP_ERROR.a();
                View B1 = this.f18250b.B1(2);
                int i3 = -this.f18253f;
                this.f18253f = i3;
                org.telegram.messenger.g0.G3(i3, B1, null);
                l41 l41Var = this.f18250b;
                l41Var.y0(l41Var.A1(2));
            } else if (z10 && !this.f18251c.k(this.f18250b)) {
            } else {
                this.f18249a.b(true);
                TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f18255r) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f18257w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f18473a;
                    tL_inputBusinessAwayMessage.recipients = this.f18251c.e();
                    int i10 = this.f18258x;
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
                        tL_businessAwayMessage.offline_only = this.f18257w;
                        tL_businessAwayMessage.shortcut_id = d.f18473a;
                        tL_businessAwayMessage.recipients = this.f18251c.f();
                        b22.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (b22 != null) {
                    b22.flags2 &= -9;
                    b22.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new ci.d0(this, 14));
                getMessagesStorage().j2(b22, false);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(bd.M0(2131752838, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 12));
        this.f18249a = this.simpleActionBar.n(bd.M0(2131745956, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new f6(this, 29));
        this.f18251c = b0Var;
        b0Var.h = this.f18256s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        l41 l41Var = new l41(this, new q4(this, 15), new a(this, 0), null);
        this.f18250b = l41Var;
        l41Var.r1();
        this.f18250b.setSectionsDrawBackground(true);
        l41 l41Var2 = this.f18250b;
        l41Var2.f35594g3.f33698r = false;
        frameLayout.addView(l41Var2, mf.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        l41 l41Var;
        f41 f41Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f18252e) {
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
        this.f18255r = z11;
        if (tL_businessAwayMessage != null) {
            z12 = tL_businessAwayMessage.recipients.exclude_selected;
        } else {
            z12 = true;
        }
        this.f18256s = z12;
        if (tL_businessAwayMessage != null) {
            z13 = tL_businessAwayMessage.offline_only;
        } else {
            z13 = true;
        }
        this.f18257w = z13;
        b0 b0Var = this.f18251c;
        if (b0Var != null) {
            if (tL_businessAwayMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessAwayMessage.recipients;
            }
            b0Var.j(tL_businessRecipients);
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage2 = this.h;
        if (tL_businessAwayMessage2 != null) {
            TL_account.BusinessAwayMessageSchedule businessAwayMessageSchedule = tL_businessAwayMessage2.schedule;
            if (businessAwayMessageSchedule instanceof TL_account.TL_businessAwayMessageScheduleCustom) {
                this.f18254n = 2;
                this.f18258x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i3 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f18259y = i3;
                this.F = i3;
                int i10 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i10;
                this.G = i10;
                l41Var = this.f18250b;
                if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
                    f41Var.O(true);
                }
                a0(true);
                this.f18252e = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.h;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f18254n = 0;
            this.f18258x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f18254n = 1;
            this.f18258x = 1;
        } else {
            this.f18254n = 0;
            this.f18258x = 0;
        }
        l41Var = this.f18250b;
        if (l41Var != null) {
            f41Var.O(true);
        }
        a0(true);
        this.f18252e = true;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if (i3 == hs.F1) {
            l41 l41Var = this.f18250b;
            if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
                f41Var.O(true);
            }
            a0(true);
        } else if (i3 == hs.E0) {
            d0();
        }
    }

    @Override
    public final tj0 getListViewForSimpleGlass() {
        return this.f18250b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (b0()) {
            if (z10) {
                if (!this.f18255r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = bd.M0(2131743845, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131752820, null);
                alertDialog$Builder.k(bd.M0(2131754216, null), new a(this, 1));
                alertDialog$Builder.h(bd.M0(2131747588, null), new a(this, 2));
                showDialog(s1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.F1);
        getNotificationCenter().c(this, hs.E0);
        u1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.F1);
        getNotificationCenter().n(this, hs.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
