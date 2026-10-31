package ag;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.us;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import w7.b6;
public final class v1 extends org.telegram.ui.ActionBar.k2 implements us {
    public l5 f748a;
    public u51 f749b;
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
                this.e[i10] = cd.G(iArr2[i10], "DaysSchedule", new Object[0]);
                i10++;
            } else {
                return;
            }
        }
    }

    public static void Y(v1 v1Var, ArrayList arrayList, p51 p51Var) {
        String L0 = cd.L0(2131752775, null);
        String L02 = cd.L0(2131752773, null);
        a51 a51Var = new a51(2);
        a51Var.f24292l = L0;
        a51Var.f24295o = L02;
        a51Var.f24293m = "RestrictedEmoji";
        a51Var.f24294n = "👋";
        arrayList.add(a51Var);
        a51 i10 = a51.i(1, cd.L0(2131752769, null));
        i10.L(v1Var.f753r);
        arrayList.add(i10);
        arrayList.add(a51.C(null));
        if (v1Var.f753r) {
            h3 d = i3.f(v1Var.currentAccount).d("hello");
            if (d != null) {
                a51 a51Var2 = new a51(17);
                a51Var2.G = d;
                arrayList.add(a51Var2);
            } else {
                a51 c10 = a51.c(2, 2131232021, cd.L0(2131752774, null));
                c10.f24297q = true;
                arrayList.add(c10);
            }
            arrayList.add(a51.C(null));
            arrayList.add(a51.u(cd.L0(2131752688, null)));
            a51 x10 = a51.x(3, cd.L0(2131752781, null));
            x10.L(v1Var.f754s);
            arrayList.add(x10);
            a51 x11 = a51.x(4, cd.L0(2131752776, null));
            x11.L(!v1Var.f754s);
            arrayList.add(x11);
            arrayList.add(a51.C(null));
            v1Var.f750c.a(arrayList, p51Var, true);
            arrayList.add(a51.C(cd.L0(2131752770, null)));
            arrayList.add(a51.u(cd.L0(2131752772, null)));
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
            a51 a51Var3 = new a51(14);
            a51Var3.f24296p = strArr;
            a51Var3.f24305z = i11;
            a51Var3.C = lVar;
            a51Var3.B = -1L;
            arrayList.add(a51Var3);
            arrayList.add(a51.C(cd.L0(2131752771, null)));
        }
    }

    public final void Z(boolean z10) {
        if (this.f748a == null) {
            return;
        }
        this.f748a.a(a0(), z10);
    }

    public final boolean a0() {
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

    public final void b0() {
        if (!this.f748a.f20547y.f7021f) {
            if (!a0()) {
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

    public final void c0() {
        boolean z10;
        int i10;
        boolean z11;
        p51 p51Var;
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
        u51 u51Var = this.f749b;
        if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
            p51Var.O(true);
        }
        Z(true);
        this.f751f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231241);
        this.simpleActionBar.setTitle(cd.L0(2131752775, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new e(this, 3));
        this.f748a = this.simpleActionBar.n(cd.L0(2131745963, null));
        Z(false);
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
        u51 u51Var = new u51(this, new a(this, 4), new u1(this, 2), null);
        this.f749b = u51Var;
        u51Var.r1();
        this.f749b.setSectionsDrawBackground(true);
        u51 u51Var2 = this.f749b;
        u51Var2.f30819f3.f29295r = false;
        frameLayout.addView(u51Var2, b6.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p51 p51Var;
        if (i10 == zs.F1) {
            u51 u51Var = this.f749b;
            if (u51Var != null && (p51Var = u51Var.f30819f3) != null) {
                p51Var.O(true);
            }
            Z(true);
        } else if (i10 == zs.E0) {
            c0();
        }
    }

    @Override
    public final tk0 getListViewForSimpleGlass() {
        return this.f749b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (a0()) {
            if (z10) {
                if (!this.f753r) {
                    b0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = cd.L0(2131743860, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = cd.L0(2131752768, null);
                alertDialog$Builder.k(cd.L0(2131754216, null), new u1(this, 0));
                alertDialog$Builder.h(cd.L0(2131747596, null), new u1(this, 1));
                showDialog(x1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, zs.F1);
        getNotificationCenter().c(this, zs.E0);
        i3.f(this.currentAccount).h();
        c0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, zs.F1);
        getNotificationCenter().n(this, zs.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
