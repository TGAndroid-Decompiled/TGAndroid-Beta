package lg;

import ai.g5;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import gi.j8;
import gi.q4;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.hs;
import org.telegram.messenger.p2;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class t0 extends d2 implements cs {
    public b5 f18464a;
    public l41 f18465b;
    public b0 f18466c;
    public final int[] d;
    public final String[] f18467e;
    public boolean f18468f;
    public int h;
    public TL_account.TL_businessGreetingMessage f18469n;
    public boolean f18470r;
    public boolean f18471s;
    public int f18472w;

    public t0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.f18472w = 7;
        this.f18467e = new String[iArr.length];
        int i3 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i3 < iArr2.length) {
                this.f18467e[i3] = bd.G(iArr2[i3], "DaysSchedule", new Object[0]);
                i3++;
            } else {
                return;
            }
        }
    }

    public static void Z(t0 t0Var, ArrayList arrayList, f41 f41Var) {
        String M0 = bd.M0(2131752775, null);
        String M02 = bd.M0(2131752773, null);
        r31 r31Var = new r31(2);
        r31Var.f37627l = M0;
        r31Var.f37630o = M02;
        r31Var.f37628m = "RestrictedEmoji";
        r31Var.f37629n = "👋";
        arrayList.add(r31Var);
        r31 i3 = r31.i(1, bd.M0(2131752769, null));
        i3.L(t0Var.f18470r);
        arrayList.add(i3);
        arrayList.add(r31.C(null));
        if (t0Var.f18470r) {
            t1 d = u1.f(t0Var.currentAccount).d("hello");
            if (d != null) {
                r31 r31Var2 = new r31(17);
                r31Var2.G = d;
                arrayList.add(r31Var2);
            } else {
                r31 c2 = r31.c(2, 2131232022, bd.M0(2131752774, null));
                c2.f37632q = true;
                arrayList.add(c2);
            }
            arrayList.add(r31.C(null));
            arrayList.add(r31.u(bd.M0(2131752688, null)));
            r31 x10 = r31.x(3, bd.M0(2131752781, null));
            x10.L(t0Var.f18471s);
            arrayList.add(x10);
            r31 x11 = r31.x(4, bd.M0(2131752776, null));
            x11.L(!t0Var.f18471s);
            arrayList.add(x11);
            arrayList.add(r31.C(null));
            t0Var.f18466c.a(arrayList, f41Var, true);
            arrayList.add(r31.C(bd.M0(2131752770, null)));
            arrayList.add(r31.u(bd.M0(2131752772, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = t0Var.d;
                if (i10 < iArr.length) {
                    if (iArr[i10] == t0Var.f18472w) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            String[] strArr = t0Var.f18467e;
            j8 j8Var = new j8(t0Var, 9);
            r31 r31Var3 = new r31(14);
            r31Var3.f37631p = strArr;
            r31Var3.f37640z = i10;
            r31Var3.C = j8Var;
            r31Var3.B = -1L;
            arrayList.add(r31Var3);
            arrayList.add(r31.C(bd.M0(2131752771, null)));
        }
    }

    public final void a0(boolean z10) {
        if (this.f18464a == null) {
            return;
        }
        this.f18464a.a(b0(), z10);
    }

    public final boolean b0() {
        boolean z10;
        b0 b0Var;
        if (this.f18468f) {
            boolean z11 = this.f18470r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f18469n;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f18472w || tL_businessGreetingMessage.recipients.exclude_selected != this.f18471s || ((b0Var = this.f18466c) != null && b0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        if (!this.f18464a.f27421y.f53841f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            t1 d = u1.f(this.currentAccount).d("hello");
            boolean z10 = this.f18470r;
            if (z10 && d == null) {
                p2.APP_ERROR.a();
                View B1 = this.f18465b.B1(2);
                int i3 = -this.h;
                this.h = i3;
                org.telegram.messenger.g0.G3(i3, B1, null);
            } else if (z10 && !this.f18466c.k(this.f18465b)) {
            } else {
                this.f18464a.b(true);
                TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f18470r) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f18473a;
                    tL_inputBusinessGreetingMessage.recipients = this.f18466c.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f18472w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (b22 != null) {
                        b22.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        b22.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f18473a;
                        tL_businessGreetingMessage.recipients = this.f18466c.f();
                        b22.business_greeting_message.no_activity_days = this.f18472w;
                    }
                } else if (b22 != null) {
                    b22.flags2 &= -5;
                    b22.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ci.d0(this, 17));
                getMessagesStorage().j2(b22, false);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(bd.M0(2131752775, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new g5(this, 15));
        this.f18464a = this.simpleActionBar.n(bd.M0(2131745956, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        b0 b0Var = new b0(this, new n(this, 3));
        this.f18466c = b0Var;
        b0Var.f18237n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f18469n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        b0Var.j(tL_businessRecipients);
        l41 l41Var = new l41(this, new q4(this, 19), new s0(this, 2), null);
        this.f18465b = l41Var;
        l41Var.r1();
        this.f18465b.setSectionsDrawBackground(true);
        l41 l41Var2 = this.f18465b;
        l41Var2.f35594g3.f33698r = false;
        frameLayout.addView(l41Var2, mf.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z10;
        int i3;
        boolean z11;
        f41 f41Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f18468f) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = b22.business_greeting_message;
        this.f18469n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18470r = z10;
        if (tL_businessGreetingMessage != null) {
            i3 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i3 = 7;
        }
        this.f18472w = i3;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.f18471s = z11;
        b0 b0Var = this.f18466c;
        if (b0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            b0Var.j(tL_businessRecipients);
        }
        l41 l41Var = this.f18465b;
        if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
            f41Var.O(true);
        }
        a0(true);
        this.f18468f = true;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        f41 f41Var;
        if (i3 == hs.F1) {
            l41 l41Var = this.f18465b;
            if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
                f41Var.O(true);
            }
            a0(true);
        } else if (i3 == hs.E0) {
            d0();
        }
    }

    @Override
    public final tj0 getListViewForSimpleGlass() {
        return this.f18465b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (b0()) {
            if (z10) {
                if (!this.f18470r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = bd.M0(2131743845, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131752768, null);
                alertDialog$Builder.k(bd.M0(2131754216, null), new s0(this, 0));
                alertDialog$Builder.h(bd.M0(2131747588, null), new s0(this, 1));
                showDialog(s1Var);
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, hs.F1);
        getNotificationCenter().c(this, hs.E0);
        u1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, hs.F1);
        getNotificationCenter().n(this, hs.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
