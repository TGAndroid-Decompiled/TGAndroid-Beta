package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.d7;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.q2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
public final class c extends g2 implements fs {
    public int E;
    public int F;
    public int G;
    public c5 f18289a;
    public h51 f18290b;
    public b0 f18291c;
    public boolean d;
    public boolean f18292e;
    public int f18293f;
    public TL_account.TL_businessAwayMessage h;
    public int f18294n;
    public boolean f18295r;
    public boolean f18296s;
    public boolean f18297w;
    public int f18298x;
    public int f18299y;

    public static void Z(c cVar, ArrayList arrayList, c51 c51Var) {
        boolean z10;
        boolean z11;
        String N0 = gd.N0(2131752826, null);
        String N02 = gd.N0(2131752823, null);
        o41 o41Var = new o41(2);
        o41Var.f38098m = N0;
        o41Var.f38101p = N02;
        o41Var.f38099n = "RestrictedEmoji";
        o41Var.f38100o = "💤";
        arrayList.add(o41Var);
        o41 i7 = o41.i(1, gd.N0(2131752809, null));
        i7.L(cVar.f18295r);
        arrayList.add(i7);
        arrayList.add(o41.C(null));
        if (cVar.f18295r) {
            u1 d = v1.f(cVar.currentAccount).d("away");
            if (d != null) {
                o41 o41Var2 = new o41(17);
                o41Var2.H = d;
                arrayList.add(o41Var2);
            } else {
                o41 c10 = o41.c(2, 2131232023, gd.N0(2131752825, null));
                c10.f38103r = true;
                arrayList.add(c10);
            }
            arrayList.add(o41.C(null));
            arrayList.add(o41.u(gd.N0(2131752818, null)));
            o41 x10 = o41.x(3, gd.N0(2131752817, null));
            boolean z12 = false;
            if (cVar.f18298x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            x10.L(z10);
            arrayList.add(x10);
            if (cVar.d) {
                o41 x11 = o41.x(4, gd.N0(2131752810, null));
                if (cVar.f18298x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x11.L(z11);
                arrayList.add(x11);
            }
            o41 x12 = o41.x(5, gd.N0(2131752816, null));
            if (cVar.f18298x == 2) {
                z12 = true;
            }
            x12.L(z12);
            arrayList.add(x12);
            if (cVar.f18298x == 2) {
                arrayList.add(o41.C(null));
                arrayList.add(o41.u(gd.N0(2131752818, null)));
                arrayList.add(o41.f(gd.N0(2131752812, null), gd.Q(cVar.F), 8));
                arrayList.add(o41.f(gd.N0(2131752815, null), gd.Q(cVar.G), 9));
            }
            arrayList.add(o41.C(null));
            o41 i10 = o41.i(10, gd.N0(2131752820, null));
            i10.L(cVar.f18297w);
            arrayList.add(i10);
            arrayList.add(o41.C(gd.N0(2131752819, null)));
            arrayList.add(o41.u(gd.N0(2131752676, null)));
            o41 x13 = o41.x(6, gd.N0(2131752769, null));
            x13.L(cVar.f18296s);
            arrayList.add(x13);
            o41 x14 = o41.x(7, gd.N0(2131752764, null));
            x14.L(!cVar.f18296s);
            arrayList.add(x14);
            arrayList.add(o41.C(null));
            cVar.f18291c.a(arrayList, c51Var, true);
            arrayList.add(o41.C(null));
        }
    }

    public final void a0(boolean z10) {
        if (this.f18289a == null) {
            return;
        }
        this.f18289a.a(b0(), z10);
    }

    public final boolean b0() {
        boolean z10;
        b0 b0Var;
        if (this.f18292e) {
            boolean z11 = this.f18295r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.f18296s && ((b0Var = this.f18291c) == null || !b0Var.g())) {
                        int i7 = this.f18294n;
                        int i10 = this.f18298x;
                        if (i7 == i10 && this.h.offline_only == this.f18297w && (i10 != 2 || (this.f18299y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void c0() {
        if (!this.f18289a.f28856y.f57697f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            u1 d = v1.f(this.currentAccount).d("away");
            boolean z10 = this.f18295r;
            if (z10 && d == null) {
                q2.APP_ERROR.a();
                View B1 = this.f18290b.B1(2);
                int i7 = -this.f18293f;
                this.f18293f = i7;
                org.telegram.messenger.g0.E3(i7, B1, null);
                h51 h51Var = this.f18290b;
                h51Var.y0(h51Var.A1(2));
            } else if (z10 && !this.f18291c.k(this.f18290b)) {
            } else {
                this.f18289a.b(true);
                TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f18295r) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f18297w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f18530a;
                    tL_inputBusinessAwayMessage.recipients = this.f18291c.e();
                    int i10 = this.f18298x;
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
                    if (d2 != null) {
                        d2.flags2 |= 8;
                        TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                        d2.business_away_message = tL_businessAwayMessage;
                        tL_businessAwayMessage.offline_only = this.f18297w;
                        tL_businessAwayMessage.shortcut_id = d.f18530a;
                        tL_businessAwayMessage.recipients = this.f18291c.f();
                        d2.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (d2 != null) {
                    d2.flags2 &= -9;
                    d2.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new ai.g1(this, 16));
                getMessagesStorage().j2(d2, false);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(gd.N0(2131752826, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 6));
        this.f18289a = this.simpleActionBar.s(gd.N0(2131745750, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new hi.l(this, 28));
        this.f18291c = b0Var;
        b0Var.h = this.f18296s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        h51 h51Var = new h51(this, new d7(this, 7), new a(this, 0), null);
        this.f18290b = h51Var;
        h51Var.r1();
        this.f18290b.setSectionsDrawBackground(true);
        h51 h51Var2 = this.f18290b;
        h51Var2.f35796g3.f34068r = false;
        frameLayout.addView(h51Var2, ma.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        h51 h51Var;
        c51 c51Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f18292e) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = d2.business_away_message;
        this.h = tL_businessAwayMessage;
        if (d2.business_work_hours != null) {
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
        this.f18295r = z11;
        if (tL_businessAwayMessage != null) {
            z12 = tL_businessAwayMessage.recipients.exclude_selected;
        } else {
            z12 = true;
        }
        this.f18296s = z12;
        if (tL_businessAwayMessage != null) {
            z13 = tL_businessAwayMessage.offline_only;
        } else {
            z13 = true;
        }
        this.f18297w = z13;
        b0 b0Var = this.f18291c;
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
                this.f18294n = 2;
                this.f18298x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i7 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f18299y = i7;
                this.F = i7;
                int i10 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i10;
                this.G = i10;
                h51Var = this.f18290b;
                if (h51Var != null && (c51Var = h51Var.f35796g3) != null) {
                    c51Var.O(true);
                }
                a0(true);
                this.f18292e = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.h;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f18294n = 0;
            this.f18298x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f18294n = 1;
            this.f18298x = 1;
        } else {
            this.f18294n = 0;
            this.f18298x = 0;
        }
        h51Var = this.f18290b;
        if (h51Var != null) {
            c51Var.O(true);
        }
        a0(true);
        this.f18292e = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c51 c51Var;
        if (i7 == ks.F1) {
            h51 h51Var = this.f18290b;
            if (h51Var != null && (c51Var = h51Var.f35796g3) != null) {
                c51Var.O(true);
            }
            a0(true);
        } else if (i7 == ks.E0) {
            d0();
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18290b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (b0()) {
            if (z10) {
                if (!this.f18295r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = gd.N0(2131743592, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131752808, null);
                alertDialog$Builder.k(gd.N0(2131754213, null), new a(this, 1));
                alertDialog$Builder.h(gd.N0(2131747386, null), new a(this, 2));
                showDialog(t1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.F1);
        getNotificationCenter().c(this, ks.E0);
        v1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ks.F1);
        getNotificationCenter().n(this, ks.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
