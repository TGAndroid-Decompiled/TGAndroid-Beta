package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class dd0 extends e implements fn7 {
    public int E;
    public int F;
    public int G;
    public nla a;
    public q9c b;
    public u41 c;
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

    public final void Y(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.a(a0(), z);
    }

    public final void Z(ArrayList arrayList, l9c l9cVar) {
        boolean z;
        boolean z2;
        String M0 = ob6.M0(2131752819, null);
        String M02 = ob6.M0(2131752816, null);
        b8c b8cVar = new b8c(2);
        b8cVar.m = M0;
        b8cVar.p = M02;
        b8cVar.n = "RestrictedEmoji";
        b8cVar.o = "💤";
        arrayList.add(b8cVar);
        b8c i = b8c.i(1, ob6.M0(2131752802, null));
        i.L(this.r);
        arrayList.add(i);
        arrayList.add(b8c.C(null));
        if (this.r) {
            a19 d = b19.f(this.currentAccount).d("away");
            if (d != null) {
                b8c b8cVar2 = new b8c(17);
                b8cVar2.H = d;
                arrayList.add(b8cVar2);
            } else {
                b8c c = b8c.c(2, 2131232026, ob6.M0(2131752818, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(b8c.C(null));
            arrayList.add(b8c.u(ob6.M0(2131752811, null)));
            b8c x = b8c.x(3, ob6.M0(2131752810, null));
            boolean z3 = false;
            if (this.x == 0) {
                z = true;
            } else {
                z = false;
            }
            x.L(z);
            arrayList.add(x);
            if (this.d) {
                b8c x2 = b8c.x(4, ob6.M0(2131752803, null));
                if (this.x == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                x2.L(z2);
                arrayList.add(x2);
            }
            b8c x3 = b8c.x(5, ob6.M0(2131752809, null));
            if (this.x == 2) {
                z3 = true;
            }
            x3.L(z3);
            arrayList.add(x3);
            if (this.x == 2) {
                arrayList.add(b8c.C(null));
                arrayList.add(b8c.u(ob6.M0(2131752811, null)));
                arrayList.add(b8c.f(ob6.M0(2131752805, null), ob6.Q(this.F), 8));
                arrayList.add(b8c.f(ob6.M0(2131752808, null), ob6.Q(this.G), 9));
            }
            arrayList.add(b8c.C(null));
            b8c i2 = b8c.i(10, ob6.M0(2131752813, null));
            i2.L(this.w);
            arrayList.add(i2);
            arrayList.add(b8c.C(ob6.M0(2131752812, null)));
            arrayList.add(b8c.u(ob6.M0(2131752669, null)));
            b8c x4 = b8c.x(6, ob6.M0(2131752762, null));
            x4.L(this.s);
            arrayList.add(x4);
            b8c x5 = b8c.x(7, ob6.M0(2131752757, null));
            x5.L(!this.s);
            arrayList.add(x5);
            arrayList.add(b8c.C(null));
            this.c.a(arrayList, l9cVar, true);
            arrayList.add(b8c.C(null));
        }
    }

    public final boolean a0() {
        boolean z;
        u41 u41Var;
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
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.s && ((u41Var = this.c) == null || !u41Var.g())) {
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

    public final void b0() {
        if (!this.a.y.f) {
            if (!a0()) {
                finishFragment();
                return;
            }
            a19 d = b19.f(this.currentAccount).d("away");
            if (this.r) {
                if (d == null) {
                    yw0.APP_ERROR.a();
                    View C1 = this.b.C1(2);
                    int i = -this.f;
                    this.f = i;
                    hl.A3(i, C1, null);
                    q9c q9cVar = this.b;
                    q9cVar.A0(q9cVar.B1(2));
                    return;
                } else if (!this.c.k(this.b)) {
                    return;
                }
            }
            this.a.b(true);
            TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
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
                if (Y1 != null) {
                    Y1.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    Y1.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.w;
                    tL_businessAwayMessage.shortcut_id = d.a;
                    tL_businessAwayMessage.recipients = this.c.f();
                    Y1.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (Y1 != null) {
                Y1.flags2 &= -9;
                Y1.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new ye(this, (byte) 2));
            getMessagesStorage().l2(Y1, false);
        }
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd0.c0():void");
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131752819, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 6));
        this.a = this.simpleActionBar.u(ob6.M0(2131745674, null));
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        u41 u41Var = new u41(this, new pz(this, (byte) 6));
        this.c = u41Var;
        u41Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        u41Var.j(tL_businessRecipients);
        q9c q9cVar = new q9c(this, new c(this, (byte) 14), new bd0(this, (byte) 0), null);
        this.b = q9cVar;
        q9cVar.s1();
        this.b.setSectionsDrawBackground(true);
        q9c q9cVar2 = this.b;
        q9cVar2.g3.r = false;
        frameLayout.addView(q9cVar2, tre.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l9c l9cVar;
        if (i == jn7.F1) {
            q9c q9cVar = this.b;
            if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
                l9cVar.O(true);
            }
            Y(true);
        } else if (i == jn7.E0) {
            c0();
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (a0()) {
            if (z) {
                if (!this.r) {
                    b0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131743490, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131752801, null);
                alertDialog$Builder.j(ob6.M0(2131754209, null), new bd0(this, (byte) 1));
                alertDialog$Builder.g(ob6.M0(2131747307, null), new bd0(this, (byte) 2));
                showDialog(idVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.F1);
        getNotificationCenter().b(this, jn7.E0);
        b19.f(this.currentAccount).h();
        c0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.F1);
        getNotificationCenter().n(this, jn7.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
