package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.e7;
import java.util.ArrayList;
import org.telegram.messenger.fs;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.q2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class c extends h2 implements fs {
    public int E;
    public int F;
    public int G;
    public d5 f18257a;
    public e51 f18258b;
    public a0 f18259c;
    public boolean d;
    public boolean f18260e;
    public int f18261f;
    public TL_account.TL_businessAwayMessage h;
    public int f18262n;
    public boolean f18263r;
    public boolean f18264s;
    public boolean f18265w;
    public int f18266x;
    public int f18267y;

    public static void Z(c cVar, ArrayList arrayList, z41 z41Var) {
        boolean z10;
        boolean z11;
        String M0 = gd.M0(2131752827, null);
        String M02 = gd.M0(2131752824, null);
        l41 l41Var = new l41(2);
        l41Var.f37018m = M0;
        l41Var.f37021p = M02;
        l41Var.f37019n = "RestrictedEmoji";
        l41Var.f37020o = "💤";
        arrayList.add(l41Var);
        l41 i7 = l41.i(1, gd.M0(2131752810, null));
        i7.L(cVar.f18263r);
        arrayList.add(i7);
        arrayList.add(l41.C(null));
        if (cVar.f18263r) {
            v1 d = w1.f(cVar.currentAccount).d("away");
            if (d != null) {
                l41 l41Var2 = new l41(17);
                l41Var2.H = d;
                arrayList.add(l41Var2);
            } else {
                l41 c10 = l41.c(2, 2131232023, gd.M0(2131752826, null));
                c10.f37023r = true;
                arrayList.add(c10);
            }
            arrayList.add(l41.C(null));
            arrayList.add(l41.u(gd.M0(2131752819, null)));
            l41 x10 = l41.x(3, gd.M0(2131752818, null));
            boolean z12 = false;
            if (cVar.f18266x == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            x10.L(z10);
            arrayList.add(x10);
            if (cVar.d) {
                l41 x11 = l41.x(4, gd.M0(2131752811, null));
                if (cVar.f18266x == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                x11.L(z11);
                arrayList.add(x11);
            }
            l41 x12 = l41.x(5, gd.M0(2131752817, null));
            if (cVar.f18266x == 2) {
                z12 = true;
            }
            x12.L(z12);
            arrayList.add(x12);
            if (cVar.f18266x == 2) {
                arrayList.add(l41.C(null));
                arrayList.add(l41.u(gd.M0(2131752819, null)));
                arrayList.add(l41.f(gd.M0(2131752813, null), gd.Q(cVar.F), 8));
                arrayList.add(l41.f(gd.M0(2131752816, null), gd.Q(cVar.G), 9));
            }
            arrayList.add(l41.C(null));
            l41 i10 = l41.i(10, gd.M0(2131752821, null));
            i10.L(cVar.f18265w);
            arrayList.add(i10);
            arrayList.add(l41.C(gd.M0(2131752820, null)));
            arrayList.add(l41.u(gd.M0(2131752677, null)));
            l41 x13 = l41.x(6, gd.M0(2131752770, null));
            x13.L(cVar.f18264s);
            arrayList.add(x13);
            l41 x14 = l41.x(7, gd.M0(2131752765, null));
            x14.L(!cVar.f18264s);
            arrayList.add(x14);
            arrayList.add(l41.C(null));
            cVar.f18259c.a(arrayList, z41Var, true);
            arrayList.add(l41.C(null));
        }
    }

    public final void a0(boolean z10) {
        if (this.f18257a == null) {
            return;
        }
        this.f18257a.a(b0(), z10);
    }

    public final boolean b0() {
        boolean z10;
        a0 a0Var;
        if (this.f18260e) {
            boolean z11 = this.f18263r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (tL_businessAwayMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 == z10) {
                if (z11 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.f18264s && ((a0Var = this.f18259c) == null || !a0Var.g())) {
                        int i7 = this.f18262n;
                        int i10 = this.f18266x;
                        if (i7 == i10 && this.h.offline_only == this.f18265w && (i10 != 2 || (this.f18267y == this.F && this.E == this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void c0() {
        if (!this.f18257a.f28871y.f57658f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            v1 d = w1.f(this.currentAccount).d("away");
            boolean z10 = this.f18263r;
            if (z10 && d == null) {
                q2.APP_ERROR.a();
                View B1 = this.f18258b.B1(2);
                int i7 = -this.f18261f;
                this.f18261f = i7;
                org.telegram.messenger.g0.E3(i7, B1, null);
                e51 e51Var = this.f18258b;
                e51Var.y0(e51Var.A1(2));
            } else if (z10 && !this.f18259c.k(this.f18258b)) {
            } else {
                this.f18257a.b(true);
                TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
                TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
                if (this.f18263r) {
                    TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                    updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                    tL_inputBusinessAwayMessage.offline_only = this.f18265w;
                    tL_inputBusinessAwayMessage.shortcut_id = d.f18506a;
                    tL_inputBusinessAwayMessage.recipients = this.f18259c.e();
                    int i10 = this.f18266x;
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
                        tL_businessAwayMessage.offline_only = this.f18265w;
                        tL_businessAwayMessage.shortcut_id = d.f18506a;
                        tL_businessAwayMessage.recipients = this.f18259c.f();
                        d2.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                    }
                } else if (d2 != null) {
                    d2.flags2 &= -9;
                    d2.business_away_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessawaymessage, new ai.e1(this, 16));
                getMessagesStorage().j2(d2, false);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(gd.M0(2131752827, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 6));
        this.f18257a = this.simpleActionBar.s(gd.M0(2131745751, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new hi.k(this, 28));
        this.f18259c = a0Var;
        a0Var.h = this.f18264s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        e51 e51Var = new e51(this, new e7(this, 7), new a(this, 0), null);
        this.f18258b = e51Var;
        e51Var.r1();
        this.f18258b.setSectionsDrawBackground(true);
        e51 e51Var2 = this.f18258b;
        e51Var2.f34607g3.f42809r = false;
        frameLayout.addView(e51Var2, ma.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        e51 e51Var;
        z41 z41Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f18260e) {
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
        this.f18263r = z11;
        if (tL_businessAwayMessage != null) {
            z12 = tL_businessAwayMessage.recipients.exclude_selected;
        } else {
            z12 = true;
        }
        this.f18264s = z12;
        if (tL_businessAwayMessage != null) {
            z13 = tL_businessAwayMessage.offline_only;
        } else {
            z13 = true;
        }
        this.f18265w = z13;
        a0 a0Var = this.f18259c;
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
                this.f18262n = 2;
                this.f18266x = 2;
                TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = (TL_account.TL_businessAwayMessageScheduleCustom) businessAwayMessageSchedule;
                int i7 = tL_businessAwayMessageScheduleCustom.start_date;
                this.f18267y = i7;
                this.F = i7;
                int i10 = tL_businessAwayMessageScheduleCustom.end_date;
                this.E = i10;
                this.G = i10;
                e51Var = this.f18258b;
                if (e51Var != null && (z41Var = e51Var.f34607g3) != null) {
                    z41Var.O(true);
                }
                a0(true);
                this.f18260e = true;
            }
        }
        this.F = getConnectionsManager().getCurrentTime();
        this.G = getConnectionsManager().getCurrentTime() + 86400;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage3 = this.h;
        if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleAlways)) {
            this.f18262n = 0;
            this.f18266x = 0;
        } else if (tL_businessAwayMessage3 != null && (tL_businessAwayMessage3.schedule instanceof TL_account.TL_businessAwayMessageScheduleOutsideWorkHours)) {
            this.f18262n = 1;
            this.f18266x = 1;
        } else {
            this.f18262n = 0;
            this.f18266x = 0;
        }
        e51Var = this.f18258b;
        if (e51Var != null) {
            z41Var.O(true);
        }
        a0(true);
        this.f18260e = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z41 z41Var;
        if (i7 == ks.F1) {
            e51 e51Var = this.f18258b;
            if (e51Var != null && (z41Var = e51Var.f34607g3) != null) {
                z41Var.O(true);
            }
            a0(true);
        } else if (i7 == ks.E0) {
            d0();
        }
    }

    @Override
    public final ck0 getListViewForSimpleGlass() {
        return this.f18258b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (b0()) {
            if (z10) {
                if (!this.f18263r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = gd.M0(2131743598, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131752809, null);
                alertDialog$Builder.k(gd.M0(2131754214, null), new a(this, 1));
                alertDialog$Builder.h(gd.M0(2131747387, null), new a(this, 2));
                showDialog(u1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ks.F1);
        getNotificationCenter().c(this, ks.E0);
        w1.f(this.currentAccount).h();
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
