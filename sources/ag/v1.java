package ag;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.at;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
import w7.b6;
public final class v1 extends org.telegram.ui.ActionBar.k2 implements vs {
    public l5 f748a;
    public v51 f749b;
    public x0 f750c;
    public final int[] d;
    public final String[] e;
    public boolean f751f;
    public int h;
    public TL_account.TL_businessGreetingMessage f752n;
    public boolean f753r;
    public boolean f754s;
    public int f755w;

    public v1() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.f755w = 7;
        this.e = new String[iArr.length];
        int i10 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i10 < iArr2.length) {
                this.e[i10] = dd.G(iArr2[i10], "DaysSchedule", new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void Z(v1 v1Var, ArrayList arrayList, q51 q51Var) {
        String L0 = dd.L0(2131752775, null);
        String L02 = dd.L0(2131752773, null);
        b51 b51Var = new b51(2);
        b51Var.f24643l = L0;
        b51Var.f24646o = L02;
        b51Var.f24644m = "RestrictedEmoji";
        b51Var.f24645n = "👋";
        arrayList.add(b51Var);
        b51 i10 = b51.i(1, dd.L0(2131752769, null));
        i10.L(v1Var.f753r);
        arrayList.add(i10);
        arrayList.add(b51.C(null));
        if (v1Var.f753r) {
            h3 d = i3.f(v1Var.currentAccount).d("hello");
            if (d != null) {
                b51 b51Var2 = new b51(17);
                b51Var2.G = d;
                arrayList.add(b51Var2);
            } else {
                b51 c10 = b51.c(2, 2131232021, dd.L0(2131752774, null));
                c10.f24648q = true;
                arrayList.add(c10);
            }
            arrayList.add(b51.C(null));
            arrayList.add(b51.u(dd.L0(2131752688, null)));
            b51 x10 = b51.x(3, dd.L0(2131752781, null));
            x10.L(v1Var.f754s);
            arrayList.add(x10);
            b51 x11 = b51.x(4, dd.L0(2131752776, null));
            x11.L(!v1Var.f754s);
            arrayList.add(x11);
            arrayList.add(b51.C(null));
            v1Var.f750c.a(arrayList, q51Var, true);
            arrayList.add(b51.C(dd.L0(2131752770, null)));
            arrayList.add(b51.u(dd.L0(2131752772, null)));
            int i11 = 0;
            while (true) {
                int[] iArr = v1Var.d;
                if (i11 < iArr.length) {
                    if (iArr[i11] == v1Var.f755w) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            String[] strArr = v1Var.e;
            l lVar = new l(v1Var, 3);
            b51 b51Var3 = new b51(14);
            b51Var3.f24647p = strArr;
            b51Var3.f24656z = i11;
            b51Var3.C = lVar;
            b51Var3.B = -1L;
            arrayList.add(b51Var3);
            arrayList.add(b51.C(dd.L0(2131752771, null)));
        }
    }

    public final void a0(boolean z10) {
        if (this.f748a == null) {
            return;
        }
        this.f748a.a(b0(), z10);
    }

    public final boolean b0() {
        boolean z10;
        x0 x0Var;
        if (this.f751f) {
            boolean z11 = this.f753r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f752n;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f755w || tL_businessGreetingMessage.recipients.exclude_selected != this.f754s || ((x0Var = this.f750c) != null && x0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        if (!this.f748a.f20548y.f7022f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            h3 d = i3.f(this.currentAccount).d("hello");
            boolean z10 = this.f753r;
            if (z10 && d == null) {
                org.telegram.messenger.t2.APP_ERROR.a();
                View B1 = this.f749b.B1(2);
                int i10 = -this.h;
                this.h = i10;
                org.telegram.messenger.i0.F3(i10, B1, null);
            } else if (z10 && !this.f750c.k(this.f749b)) {
            } else {
                this.f748a.b(true);
                TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f753r) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f551a;
                    tL_inputBusinessGreetingMessage.recipients = this.f750c.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f755w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (a2 != null) {
                        a2.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        a2.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f551a;
                        tL_businessGreetingMessage.recipients = this.f750c.f();
                        a2.business_greeting_message.no_activity_days = this.f755w;
                    }
                } else if (a2 != null) {
                    a2.flags2 &= -5;
                    a2.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new c(this, 3));
                getMessagesStorage().j2(a2, false);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(dd.L0(2131752775, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 3));
        this.f748a = this.simpleActionBar.n(dd.L0(2131745963, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        x0 x0Var = new x0(this, new a3.d(this, 7));
        this.f750c = x0Var;
        x0Var.f793n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f752n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        x0Var.j(tL_businessRecipients);
        v51 v51Var = new v51(this, new a(this, 4), new u1(this, 2), null);
        this.f749b = v51Var;
        v51Var.r1();
        this.f749b.setSectionsDrawBackground(true);
        v51 v51Var2 = this.f749b;
        v51Var2.f31183f3.f29638r = false;
        frameLayout.addView(v51Var2, b6.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z10;
        int i10;
        boolean z11;
        q51 q51Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f751f) {
            return;
        }
        TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().e());
        if (a2 == null) {
            getMessagesController().e3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = a2.business_greeting_message;
        this.f752n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f753r = z10;
        if (tL_businessGreetingMessage != null) {
            i10 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i10 = 7;
        }
        this.f755w = i10;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.f754s = z11;
        x0 x0Var = this.f750c;
        if (x0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            x0Var.j(tL_businessRecipients);
        }
        v51 v51Var = this.f749b;
        if (v51Var != null && (q51Var = v51Var.f31183f3) != null) {
            q51Var.O(true);
        }
        a0(true);
        this.f751f = true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        q51 q51Var;
        if (i10 == at.F1) {
            v51 v51Var = this.f749b;
            if (v51Var != null && (q51Var = v51Var.f31183f3) != null) {
                q51Var.O(true);
            }
            a0(true);
        } else if (i10 == at.E0) {
            d0();
        }
    }

    @Override
    public final uk0 getListViewForSimpleGlass() {
        return this.f749b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (b0()) {
            if (z10) {
                if (!this.f753r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = dd.L0(2131743860, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20135a;
                x1Var.R = L0;
                x1Var.T = dd.L0(2131752768, null);
                alertDialog$Builder.k(dd.L0(2131754216, null), new u1(this, 0));
                alertDialog$Builder.h(dd.L0(2131747596, null), new u1(this, 1));
                showDialog(x1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, at.F1);
        getNotificationCenter().c(this, at.E0);
        i3.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, at.F1);
        getNotificationCenter().n(this, at.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
