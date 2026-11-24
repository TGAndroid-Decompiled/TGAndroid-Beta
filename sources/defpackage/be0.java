package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class be0 extends d implements jm7 {
    public int E;
    public int F;
    public int G;
    public uja a;
    public q7c b;
    public t51 c;
    public boolean d;
    public boolean e;
    public int f;
    public TL_account.TL_businessAwayMessage h;
    public byte n;
    public boolean r;
    public boolean s;
    public boolean w;
    public byte x;
    public int y;

    public final void Z(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.a(b0(), z);
    }

    public final void a0(ArrayList arrayList, l7c l7cVar) {
        boolean z;
        boolean z2;
        String M0 = jb6.M0(2131752791, null);
        String M02 = jb6.M0(2131752788, null);
        c6c c6cVar = new c6c(2);
        c6cVar.m = M0;
        c6cVar.p = M02;
        c6cVar.n = "RestrictedEmoji";
        c6cVar.o = "💤";
        arrayList.add(c6cVar);
        c6c i = c6c.i(1, jb6.M0(2131752774, null));
        i.L(this.r);
        arrayList.add(i);
        arrayList.add(c6c.C(null));
        if (this.r) {
            oz8 d = pz8.f(this.currentAccount).d("away");
            if (d != null) {
                c6c c6cVar2 = new c6c(17);
                c6cVar2.H = d;
                arrayList.add(c6cVar2);
            } else {
                c6c c = c6c.c(2, 2131232027, jb6.M0(2131752790, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(c6c.C(null));
            arrayList.add(c6c.u(jb6.M0(2131752783, null)));
            c6c x = c6c.x(3, jb6.M0(2131752782, null));
            boolean z3 = false;
            if (this.x == 0) {
                z = true;
            } else {
                z = false;
            }
            x.L(z);
            arrayList.add(x);
            if (this.d) {
                c6c x2 = c6c.x(4, jb6.M0(2131752775, null));
                if (this.x == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                x2.L(z2);
                arrayList.add(x2);
            }
            c6c x3 = c6c.x(5, jb6.M0(2131752781, null));
            if (this.x == 2) {
                z3 = true;
            }
            x3.L(z3);
            arrayList.add(x3);
            if (this.x == 2) {
                arrayList.add(c6c.C(null));
                arrayList.add(c6c.u(jb6.M0(2131752783, null)));
                arrayList.add(c6c.f(jb6.M0(2131752777, null), jb6.Q(this.F), 8));
                arrayList.add(c6c.f(jb6.M0(2131752780, null), jb6.Q(this.G), 9));
            }
            arrayList.add(c6c.C(null));
            c6c i2 = c6c.i(10, jb6.M0(2131752785, null));
            i2.L(this.w);
            arrayList.add(i2);
            arrayList.add(c6c.C(jb6.M0(2131752784, null)));
            arrayList.add(c6c.u(jb6.M0(2131752641, null)));
            c6c x4 = c6c.x(6, jb6.M0(2131752734, null));
            x4.L(this.s);
            arrayList.add(x4);
            c6c x5 = c6c.x(7, jb6.M0(2131752729, null));
            x5.L(!this.s);
            arrayList.add(x5);
            arrayList.add(c6c.C(null));
            this.c.a(arrayList, l7cVar, true);
            arrayList.add(c6c.C(null));
        }
    }

    public final boolean b0() {
        boolean z;
        t51 t51Var;
        if (this.e) {
            boolean z2 = this.r;
            TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
            if (tL_businessAwayMessage != null) {
                z = true;
            } else {
                z = false;
            }
            if (z2 == z) {
                if (z2 && tL_businessAwayMessage != null) {
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.s && ((t51Var = this.c) == null || !t51Var.g())) {
                        byte b = this.n;
                        byte b2 = this.x;
                        if (b != b2 || this.h.offline_only != this.w || (b2 == 2 && (this.y != this.F || this.E != this.G))) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final void c0() {
        if (!this.a.y.f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            oz8 d = pz8.f(this.currentAccount).d("away");
            if (this.r) {
                if (d == null) {
                    xx0.APP_ERROR.a();
                    View B1 = this.b.B1(2);
                    int i = -this.f;
                    this.f = i;
                    gm.A3(i, B1, null);
                    q7c q7cVar = this.b;
                    q7cVar.z0(q7cVar.A1(2));
                    return;
                } else if (!this.c.k(this.b)) {
                    return;
                }
            }
            this.a.b(true);
            TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
            TL_account.updateBusinessAwayMessage updatebusinessawaymessage = new TL_account.updateBusinessAwayMessage();
            if (this.r) {
                TL_account.TL_inputBusinessAwayMessage tL_inputBusinessAwayMessage = new TL_account.TL_inputBusinessAwayMessage();
                updatebusinessawaymessage.message = tL_inputBusinessAwayMessage;
                tL_inputBusinessAwayMessage.offline_only = this.w;
                tL_inputBusinessAwayMessage.shortcut_id = d.a;
                tL_inputBusinessAwayMessage.recipients = this.c.e();
                byte b = this.x;
                if (b == 0) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleAlways();
                } else if (b == 1) {
                    updatebusinessawaymessage.message.schedule = new TL_account.TL_businessAwayMessageScheduleOutsideWorkHours();
                } else if (b == 2) {
                    TL_account.TL_businessAwayMessageScheduleCustom tL_businessAwayMessageScheduleCustom = new TL_account.TL_businessAwayMessageScheduleCustom();
                    tL_businessAwayMessageScheduleCustom.start_date = this.F;
                    tL_businessAwayMessageScheduleCustom.end_date = this.G;
                    updatebusinessawaymessage.message.schedule = tL_businessAwayMessageScheduleCustom;
                }
                updatebusinessawaymessage.flags |= 1;
                if (X1 != null) {
                    X1.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    X1.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.w;
                    tL_businessAwayMessage.shortcut_id = d.a;
                    tL_businessAwayMessage.recipients = this.c.f();
                    X1.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (X1 != null) {
                X1.flags2 &= -9;
                X1.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new tg(this, (byte) 2));
            getMessagesStorage().g2(X1, false);
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131752791, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 6));
        this.a = this.simpleActionBar.s(jb6.M0(2131745680, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        t51 t51Var = new t51(this, new f00(this, (byte) 8));
        this.c = t51Var;
        t51Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        t51Var.j(tL_businessRecipients);
        q7c q7cVar = new q7c(this, new f(this, (byte) 14), new zd0(this, (byte) 0), null);
        this.b = q7cVar;
        q7cVar.r1();
        this.b.setSectionsDrawBackground(true);
        q7c q7cVar2 = this.b;
        q7cVar2.g3.r = false;
        frameLayout.addView(q7cVar2, qoe.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.be0.d0():void");
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l7c l7cVar;
        if (i == nm7.F1) {
            q7c q7cVar = this.b;
            if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
                l7cVar.O(true);
            }
            Z(true);
        } else if (i == nm7.E0) {
            d0();
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (b0()) {
            if (z) {
                if (!this.r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131743522, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131752773, null);
                alertDialog$Builder.j(jb6.M0(2131754181, null), new zd0(this, (byte) 1));
                alertDialog$Builder.g(jb6.M0(2131747313, null), new zd0(this, (byte) 2));
                showDialog(heVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.F1);
        getNotificationCenter().b(this, nm7.E0);
        pz8.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.F1);
        getNotificationCenter().n(this, nm7.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
