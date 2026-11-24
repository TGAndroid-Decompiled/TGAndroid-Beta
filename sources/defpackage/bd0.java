package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class bd0 extends d implements gk7 {
    public int E;
    public int F;
    public int G;
    public sha a;
    public q5c b;
    public m41 c;
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

    public final void Z(ArrayList arrayList, l5c l5cVar) {
        boolean z;
        boolean z2;
        String M0 = k96.M0(2131752826, null);
        String M02 = k96.M0(2131752823, null);
        c4c c4cVar = new c4c(2);
        c4cVar.m = M0;
        c4cVar.p = M02;
        c4cVar.n = "RestrictedEmoji";
        c4cVar.o = "💤";
        arrayList.add(c4cVar);
        c4c i = c4c.i(1, k96.M0(2131752809, null));
        i.L(this.r);
        arrayList.add(i);
        arrayList.add(c4c.C(null));
        if (this.r) {
            nx8 d = ox8.f(this.currentAccount).d("away");
            if (d != null) {
                c4c c4cVar2 = new c4c(17);
                c4cVar2.H = d;
                arrayList.add(c4cVar2);
            } else {
                c4c c = c4c.c(2, 2131232026, k96.M0(2131752825, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(c4c.C(null));
            arrayList.add(c4c.u(k96.M0(2131752818, null)));
            c4c x = c4c.x(3, k96.M0(2131752817, null));
            boolean z3 = false;
            if (this.x == 0) {
                z = true;
            } else {
                z = false;
            }
            x.L(z);
            arrayList.add(x);
            if (this.d) {
                c4c x2 = c4c.x(4, k96.M0(2131752810, null));
                if (this.x == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                x2.L(z2);
                arrayList.add(x2);
            }
            c4c x3 = c4c.x(5, k96.M0(2131752816, null));
            if (this.x == 2) {
                z3 = true;
            }
            x3.L(z3);
            arrayList.add(x3);
            if (this.x == 2) {
                arrayList.add(c4c.C(null));
                arrayList.add(c4c.u(k96.M0(2131752818, null)));
                arrayList.add(c4c.f(k96.M0(2131752812, null), k96.Q(this.F), 8));
                arrayList.add(c4c.f(k96.M0(2131752815, null), k96.Q(this.G), 9));
            }
            arrayList.add(c4c.C(null));
            c4c i2 = c4c.i(10, k96.M0(2131752820, null));
            i2.L(this.w);
            arrayList.add(i2);
            arrayList.add(c4c.C(k96.M0(2131752819, null)));
            arrayList.add(c4c.u(k96.M0(2131752676, null)));
            c4c x4 = c4c.x(6, k96.M0(2131752769, null));
            x4.L(this.s);
            arrayList.add(x4);
            c4c x5 = c4c.x(7, k96.M0(2131752764, null));
            x5.L(!this.s);
            arrayList.add(x5);
            arrayList.add(c4c.C(null));
            this.c.a(arrayList, l5cVar, true);
            arrayList.add(c4c.C(null));
        }
    }

    public final boolean a0() {
        boolean z;
        m41 m41Var;
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
                    if (tL_businessAwayMessage.recipients.exclude_selected == this.s && ((m41Var = this.c) == null || !m41Var.g())) {
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
            nx8 d = ox8.f(this.currentAccount).d("away");
            if (this.r) {
                if (d == null) {
                    pw0.APP_ERROR.a();
                    View B1 = this.b.B1(2);
                    int i = -this.f;
                    this.f = i;
                    gl.B3(i, B1, null);
                    q5c q5cVar = this.b;
                    q5cVar.z0(q5cVar.A1(2));
                    return;
                } else if (!this.c.k(this.b)) {
                    return;
                }
            }
            this.a.b(true);
            TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().e());
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
                if (W1 != null) {
                    W1.flags2 |= 8;
                    TL_account.TL_businessAwayMessage tL_businessAwayMessage = new TL_account.TL_businessAwayMessage();
                    W1.business_away_message = tL_businessAwayMessage;
                    tL_businessAwayMessage.offline_only = this.w;
                    tL_businessAwayMessage.shortcut_id = d.a;
                    tL_businessAwayMessage.recipients = this.c.f();
                    W1.business_away_message.schedule = updatebusinessawaymessage.message.schedule;
                }
            } else if (W1 != null) {
                W1.flags2 &= -9;
                W1.business_away_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessawaymessage, new uf(this, (byte) 2));
            getMessagesStorage().g2(W1, false);
        }
    }

    public final void c0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bd0.c0():void");
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(k96.M0(2131752826, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 6));
        this.a = this.simpleActionBar.s(k96.M0(2131745754, null));
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        m41 m41Var = new m41(this, new oz(this, (byte) 6));
        this.c = m41Var;
        m41Var.h = this.s;
        TL_account.TL_businessAwayMessage tL_businessAwayMessage = this.h;
        if (tL_businessAwayMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessAwayMessage.recipients;
        }
        m41Var.j(tL_businessRecipients);
        q5c q5cVar = new q5c(this, new f(this, (byte) 14), new zc0(this, (byte) 0), null);
        this.b = q5cVar;
        q5cVar.r1();
        this.b.setSectionsDrawBackground(true);
        q5c q5cVar2 = this.b;
        q5cVar2.g3.r = false;
        frameLayout.addView(q5cVar2, nme.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l5c l5cVar;
        if (i == kk7.E1) {
            q5c q5cVar = this.b;
            if (q5cVar != null && (l5cVar = q5cVar.g3) != null) {
                l5cVar.O(true);
            }
            Y(true);
        } else if (i == kk7.D0) {
            c0();
        }
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
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
                String M0 = k96.M0(2131743596, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131752808, null);
                alertDialog$Builder.j(k96.M0(2131754213, null), new zc0(this, (byte) 1));
                alertDialog$Builder.g(k96.M0(2131747387, null), new zc0(this, (byte) 2));
                showDialog(hdVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, kk7.E1);
        getNotificationCenter().b(this, kk7.D0);
        ox8.f(this.currentAccount).h();
        c0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, kk7.E1);
        getNotificationCenter().n(this, kk7.D0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
