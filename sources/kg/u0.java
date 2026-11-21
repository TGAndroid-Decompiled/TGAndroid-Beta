package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.d7;
import hi.s6;
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
public final class u0 extends g2 implements fs {
    public c5 f18521a;
    public h51 f18522b;
    public b0 f18523c;
    public final int[] d;
    public final String[] f18524e;
    public boolean f18525f;
    public int h;
    public TL_account.TL_businessGreetingMessage f18526n;
    public boolean f18527r;
    public boolean f18528s;
    public int f18529w;

    public u0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.f18529w = 7;
        this.f18524e = new String[iArr.length];
        int i7 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i7 < iArr2.length) {
                this.f18524e[i7] = gd.G(iArr2[i7], "DaysSchedule", new Object[0]);
                i7++;
            } else {
                return;
            }
        }
    }

    public static void Z(u0 u0Var, ArrayList arrayList, c51 c51Var) {
        String N0 = gd.N0(2131752763, null);
        String N02 = gd.N0(2131752761, null);
        o41 o41Var = new o41(2);
        o41Var.f38098m = N0;
        o41Var.f38101p = N02;
        o41Var.f38099n = "RestrictedEmoji";
        o41Var.f38100o = "👋";
        arrayList.add(o41Var);
        o41 i7 = o41.i(1, gd.N0(2131752757, null));
        i7.L(u0Var.f18527r);
        arrayList.add(i7);
        arrayList.add(o41.C(null));
        if (u0Var.f18527r) {
            u1 d = v1.f(u0Var.currentAccount).d("hello");
            if (d != null) {
                o41 o41Var2 = new o41(17);
                o41Var2.H = d;
                arrayList.add(o41Var2);
            } else {
                o41 c10 = o41.c(2, 2131232023, gd.N0(2131752762, null));
                c10.f38103r = true;
                arrayList.add(c10);
            }
            arrayList.add(o41.C(null));
            arrayList.add(o41.u(gd.N0(2131752676, null)));
            o41 x10 = o41.x(3, gd.N0(2131752769, null));
            x10.L(u0Var.f18528s);
            arrayList.add(x10);
            o41 x11 = o41.x(4, gd.N0(2131752764, null));
            x11.L(!u0Var.f18528s);
            arrayList.add(x11);
            arrayList.add(o41.C(null));
            u0Var.f18523c.a(arrayList, c51Var, true);
            arrayList.add(o41.C(gd.N0(2131752758, null)));
            arrayList.add(o41.u(gd.N0(2131752760, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = u0Var.d;
                if (i10 < iArr.length) {
                    if (iArr[i10] == u0Var.f18529w) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            String[] strArr = u0Var.f18524e;
            s6 s6Var = new s6(u0Var, 10);
            o41 o41Var3 = new o41(14);
            o41Var3.f38102q = strArr;
            o41Var3.A = i10;
            o41Var3.D = s6Var;
            o41Var3.C = -1L;
            arrayList.add(o41Var3);
            arrayList.add(o41.C(gd.N0(2131752759, null)));
        }
    }

    public final void a0(boolean z10) {
        if (this.f18521a == null) {
            return;
        }
        this.f18521a.a(b0(), z10);
    }

    public final boolean b0() {
        boolean z10;
        b0 b0Var;
        if (this.f18525f) {
            boolean z11 = this.f18527r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f18526n;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f18529w || tL_businessGreetingMessage.recipients.exclude_selected != this.f18528s || ((b0Var = this.f18523c) != null && b0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        if (!this.f18521a.f28856y.f57697f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            u1 d = v1.f(this.currentAccount).d("hello");
            boolean z10 = this.f18527r;
            if (z10 && d == null) {
                q2.APP_ERROR.a();
                View B1 = this.f18522b.B1(2);
                int i7 = -this.h;
                this.h = i7;
                org.telegram.messenger.g0.E3(i7, B1, null);
            } else if (z10 && !this.f18523c.k(this.f18522b)) {
            } else {
                this.f18521a.b(true);
                TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f18527r) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f18530a;
                    tL_inputBusinessGreetingMessage.recipients = this.f18523c.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f18529w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (d2 != null) {
                        d2.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        d2.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f18530a;
                        tL_businessGreetingMessage.recipients = this.f18523c.f();
                        d2.business_greeting_message.no_activity_days = this.f18529w;
                    }
                } else if (d2 != null) {
                    d2.flags2 &= -5;
                    d2.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ai.g1(this, 19));
                getMessagesStorage().j2(d2, false);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(gd.N0(2131752763, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.v1(this, 9));
        this.f18521a = this.simpleActionBar.s(gd.N0(2131745750, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new i0(this, 2));
        this.f18523c = b0Var;
        b0Var.f18286n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f18526n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        h51 h51Var = new h51(this, new d7(this, 11), new t0(this, 2), null);
        this.f18522b = h51Var;
        h51Var.r1();
        this.f18522b.setSectionsDrawBackground(true);
        h51 h51Var2 = this.f18522b;
        h51Var2.f35796g3.f34068r = false;
        frameLayout.addView(h51Var2, ma.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z10;
        int i7;
        boolean z11;
        c51 c51Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f18525f) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = d2.business_greeting_message;
        this.f18526n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18527r = z10;
        if (tL_businessGreetingMessage != null) {
            i7 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i7 = 7;
        }
        this.f18529w = i7;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.f18528s = z11;
        b0 b0Var = this.f18523c;
        if (b0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            b0Var.j(tL_businessRecipients);
        }
        h51 h51Var = this.f18522b;
        if (h51Var != null && (c51Var = h51Var.f35796g3) != null) {
            c51Var.O(true);
        }
        a0(true);
        this.f18525f = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        c51 c51Var;
        if (i7 == ks.F1) {
            h51 h51Var = this.f18522b;
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
        return this.f18522b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (b0()) {
            if (z10) {
                if (!this.f18527r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = gd.N0(2131743592, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
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
