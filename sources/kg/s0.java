package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import bi.x4;
import c8.ja;
import hi.g7;
import hi.q4;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.ns;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
public final class s0 extends e2 implements is {
    public z4 f18086a;
    public u41 f18087b;
    public a0 f18088c;
    public final int[] d;
    public final String[] f18089e;
    public boolean f18090f;
    public int h;
    public TL_account.TL_businessGreetingMessage f18091n;
    public boolean f18092r;
    public boolean f18093s;
    public int f18094w;

    public s0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.f18094w = 7;
        this.f18089e = new String[iArr.length];
        int i7 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i7 < iArr2.length) {
                this.f18089e[i7] = hd.G(iArr2[i7], "DaysSchedule", new Object[0]);
                i7++;
            } else {
                return;
            }
        }
    }

    public static void Z(s0 s0Var, ArrayList arrayList, p41 p41Var) {
        String M0 = hd.M0(2131752775, null);
        String M02 = hd.M0(2131752773, null);
        b41 b41Var = new b41(2);
        b41Var.f33181l = M0;
        b41Var.f33184o = M02;
        b41Var.f33182m = "RestrictedEmoji";
        b41Var.f33183n = "👋";
        arrayList.add(b41Var);
        b41 i7 = b41.i(1, hd.M0(2131752769, null));
        i7.L(s0Var.f18092r);
        arrayList.add(i7);
        arrayList.add(b41.C(null));
        if (s0Var.f18092r) {
            u1 d = v1.f(s0Var.currentAccount).d("hello");
            if (d != null) {
                b41 b41Var2 = new b41(17);
                b41Var2.G = d;
                arrayList.add(b41Var2);
            } else {
                b41 c10 = b41.c(2, 2131232022, hd.M0(2131752774, null));
                c10.f33186q = true;
                arrayList.add(c10);
            }
            arrayList.add(b41.C(null));
            arrayList.add(b41.u(hd.M0(2131752688, null)));
            b41 x10 = b41.x(3, hd.M0(2131752781, null));
            x10.L(s0Var.f18093s);
            arrayList.add(x10);
            b41 x11 = b41.x(4, hd.M0(2131752776, null));
            x11.L(!s0Var.f18093s);
            arrayList.add(x11);
            arrayList.add(b41.C(null));
            s0Var.f18088c.a(arrayList, p41Var, true);
            arrayList.add(b41.C(hd.M0(2131752770, null)));
            arrayList.add(b41.u(hd.M0(2131752772, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = s0Var.d;
                if (i10 < iArr.length) {
                    if (iArr[i10] == s0Var.f18094w) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            String[] strArr = s0Var.f18089e;
            g7 g7Var = new g7(s0Var, 9);
            b41 b41Var3 = new b41(14);
            b41Var3.f33185p = strArr;
            b41Var3.f33194z = i10;
            b41Var3.C = g7Var;
            b41Var3.B = -1L;
            arrayList.add(b41Var3);
            arrayList.add(b41.C(hd.M0(2131752771, null)));
        }
    }

    public final void a0(boolean z10) {
        if (this.f18086a == null) {
            return;
        }
        this.f18086a.a(b0(), z10);
    }

    public final boolean b0() {
        boolean z10;
        a0 a0Var;
        if (this.f18090f) {
            boolean z11 = this.f18092r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f18091n;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f18094w || tL_businessGreetingMessage.recipients.exclude_selected != this.f18093s || ((a0Var = this.f18088c) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        if (!this.f18086a.f29950y.f57082f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            u1 d = v1.f(this.currentAccount).d("hello");
            boolean z10 = this.f18092r;
            if (z10 && d == null) {
                p2.APP_ERROR.a();
                View B1 = this.f18087b.B1(2);
                int i7 = -this.h;
                this.h = i7;
                org.telegram.messenger.g0.F3(i7, B1, null);
            } else if (z10 && !this.f18088c.k(this.f18087b)) {
            } else {
                this.f18086a.b(true);
                TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f18092r) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f18113a;
                    tL_inputBusinessGreetingMessage.recipients = this.f18088c.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f18094w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (b22 != null) {
                        b22.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        b22.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f18113a;
                        tL_businessGreetingMessage.recipients = this.f18088c.f();
                        b22.business_greeting_message.no_activity_days = this.f18094w;
                    }
                } else if (b22 != null) {
                    b22.flags2 &= -5;
                    b22.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ai.d1(this, 17));
                getMessagesStorage().j2(b22, false);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(hd.M0(2131752775, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new x4(this, 7));
        this.f18086a = this.simpleActionBar.q(hd.M0(2131745946, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new hi.e1(this, 28));
        this.f18088c = a0Var;
        a0Var.f17859n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f18091n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        u41 u41Var = new u41(this, new q4(this, 11), new r0(this, 2), null);
        this.f18087b = u41Var;
        u41Var.r1();
        this.f18087b.setSectionsDrawBackground(true);
        u41 u41Var2 = this.f18087b;
        u41Var2.f39895g3.f38201r = false;
        frameLayout.addView(u41Var2, ja.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z10;
        int i7;
        boolean z11;
        p41 p41Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f18090f) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = b22.business_greeting_message;
        this.f18091n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18092r = z10;
        if (tL_businessGreetingMessage != null) {
            i7 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i7 = 7;
        }
        this.f18094w = i7;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.f18093s = z11;
        a0 a0Var = this.f18088c;
        if (a0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        u41 u41Var = this.f18087b;
        if (u41Var != null && (p41Var = u41Var.f39895g3) != null) {
            p41Var.O(true);
        }
        a0(true);
        this.f18090f = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        p41 p41Var;
        if (i7 == ns.F1) {
            u41 u41Var = this.f18087b;
            if (u41Var != null && (p41Var = u41Var.f39895g3) != null) {
                p41Var.O(true);
            }
            a0(true);
        } else if (i7 == ns.E0) {
            d0();
        }
    }

    @Override
    public final uj0 getListViewForSimpleGlass() {
        return this.f18087b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (b0()) {
            if (z10) {
                if (!this.f18092r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = hd.M0(2131743835, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131752768, null);
                alertDialog$Builder.k(hd.M0(2131754216, null), new r0(this, 0));
                alertDialog$Builder.h(hd.M0(2131747580, null), new r0(this, 1));
                showDialog(t1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, ns.F1);
        getNotificationCenter().c(this, ns.E0);
        v1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, ns.F1);
        getNotificationCenter().n(this, ns.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
