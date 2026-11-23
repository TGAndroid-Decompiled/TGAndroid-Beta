package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import hi.c7;
import hi.y7;
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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;
public final class u0 extends g2 implements fs {
    public c5 f18585a;
    public g51 f18586b;
    public b0 f18587c;
    public final int[] d;
    public final String[] f18588e;
    public boolean f18589f;
    public int h;
    public TL_account.TL_businessGreetingMessage f18590n;
    public boolean f18591r;
    public boolean f18592s;
    public int f18593w;

    public u0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.f18593w = 7;
        this.f18588e = new String[iArr.length];
        int i7 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i7 < iArr2.length) {
                this.f18588e[i7] = gd.G(iArr2[i7], "DaysSchedule", new Object[0]);
                i7++;
            } else {
                return;
            }
        }
    }

    public static void Z(u0 u0Var, ArrayList arrayList, b51 b51Var) {
        String N0 = gd.N0(2131752763, null);
        String N02 = gd.N0(2131752761, null);
        n41 n41Var = new n41(2);
        n41Var.f37655m = N0;
        n41Var.f37658p = N02;
        n41Var.f37656n = "RestrictedEmoji";
        n41Var.f37657o = "👋";
        arrayList.add(n41Var);
        n41 i7 = n41.i(1, gd.N0(2131752757, null));
        i7.L(u0Var.f18591r);
        arrayList.add(i7);
        arrayList.add(n41.C(null));
        if (u0Var.f18591r) {
            v1 d = w1.f(u0Var.currentAccount).d("hello");
            if (d != null) {
                n41 n41Var2 = new n41(17);
                n41Var2.H = d;
                arrayList.add(n41Var2);
            } else {
                n41 c10 = n41.c(2, 2131232026, gd.N0(2131752762, null));
                c10.f37660r = true;
                arrayList.add(c10);
            }
            arrayList.add(n41.C(null));
            arrayList.add(n41.u(gd.N0(2131752676, null)));
            n41 x10 = n41.x(3, gd.N0(2131752769, null));
            x10.L(u0Var.f18592s);
            arrayList.add(x10);
            n41 x11 = n41.x(4, gd.N0(2131752764, null));
            x11.L(!u0Var.f18592s);
            arrayList.add(x11);
            arrayList.add(n41.C(null));
            u0Var.f18587c.a(arrayList, b51Var, true);
            arrayList.add(n41.C(gd.N0(2131752758, null)));
            arrayList.add(n41.u(gd.N0(2131752760, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = u0Var.d;
                if (i10 < iArr.length) {
                    if (iArr[i10] == u0Var.f18593w) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            String[] strArr = u0Var.f18588e;
            c7 c7Var = new c7(u0Var, 10);
            n41 n41Var3 = new n41(14);
            n41Var3.f37659q = strArr;
            n41Var3.A = i10;
            n41Var3.D = c7Var;
            n41Var3.C = -1L;
            arrayList.add(n41Var3);
            arrayList.add(n41.C(gd.N0(2131752759, null)));
        }
    }

    public final void a0(boolean z10) {
        if (this.f18585a == null) {
            return;
        }
        this.f18585a.a(b0(), z10);
    }

    public final boolean b0() {
        boolean z10;
        b0 b0Var;
        if (this.f18589f) {
            boolean z11 = this.f18591r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f18590n;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f18593w || tL_businessGreetingMessage.recipients.exclude_selected != this.f18592s || ((b0Var = this.f18587c) != null && b0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        if (!this.f18585a.f28920y.f57780f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            v1 d = w1.f(this.currentAccount).d("hello");
            boolean z10 = this.f18591r;
            if (z10 && d == null) {
                q2.APP_ERROR.a();
                View B1 = this.f18586b.B1(2);
                int i7 = -this.h;
                this.h = i7;
                org.telegram.messenger.g0.E3(i7, B1, null);
            } else if (z10 && !this.f18587c.k(this.f18586b)) {
            } else {
                this.f18585a.b(true);
                TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f18591r) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f18601a;
                    tL_inputBusinessGreetingMessage.recipients = this.f18587c.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f18593w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (d2 != null) {
                        d2.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        d2.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f18601a;
                        tL_businessGreetingMessage.recipients = this.f18587c.f();
                        d2.business_greeting_message.no_activity_days = this.f18593w;
                    }
                } else if (d2 != null) {
                    d2.flags2 &= -5;
                    d2.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ai.b1(this, 19));
                getMessagesStorage().j2(d2, false);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(gd.N0(2131752763, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.w1(this, 9));
        this.f18585a = this.simpleActionBar.s(gd.N0(2131745750, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new i0(this, 2));
        this.f18587c = b0Var;
        b0Var.f18351n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f18590n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        g51 g51Var = new g51(this, new y7(this, 11), new t0(this, 2), null);
        this.f18586b = g51Var;
        g51Var.r1();
        this.f18586b.setSectionsDrawBackground(true);
        g51 g51Var2 = this.f18586b;
        g51Var2.f35323g3.f33631r = false;
        frameLayout.addView(g51Var2, na.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z10;
        int i7;
        boolean z11;
        b51 b51Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f18589f) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = d2.business_greeting_message;
        this.f18590n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18591r = z10;
        if (tL_businessGreetingMessage != null) {
            i7 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i7 = 7;
        }
        this.f18593w = i7;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.f18592s = z11;
        b0 b0Var = this.f18587c;
        if (b0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            b0Var.j(tL_businessRecipients);
        }
        g51 g51Var = this.f18586b;
        if (g51Var != null && (b51Var = g51Var.f35323g3) != null) {
            b51Var.O(true);
        }
        a0(true);
        this.f18589f = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        b51 b51Var;
        if (i7 == ks.F1) {
            g51 g51Var = this.f18586b;
            if (g51Var != null && (b51Var = g51Var.f35323g3) != null) {
                b51Var.O(true);
            }
            a0(true);
        } else if (i7 == ks.E0) {
            d0();
        }
    }

    @Override
    public final ek0 getListViewForSimpleGlass() {
        return this.f18586b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (b0()) {
            if (z10) {
                if (!this.f18591r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = gd.N0(2131743588, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                t1Var.S = N0;
                t1Var.U = gd.N0(2131752756, null);
                alertDialog$Builder.k(gd.N0(2131754213, null), new t0(this, 0));
                alertDialog$Builder.h(gd.N0(2131747386, null), new t0(this, 1));
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
