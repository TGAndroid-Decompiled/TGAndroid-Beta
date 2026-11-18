package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.e7;
import hi.t6;
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
public final class v0 extends h2 implements fs {
    public d5 f18497a;
    public e51 f18498b;
    public a0 f18499c;
    public final int[] d;
    public final String[] f18500e;
    public boolean f18501f;
    public int h;
    public TL_account.TL_businessGreetingMessage f18502n;
    public boolean f18503r;
    public boolean f18504s;
    public int f18505w;

    public v0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.f18505w = 7;
        this.f18500e = new String[iArr.length];
        int i7 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i7 < iArr2.length) {
                this.f18500e[i7] = gd.G(iArr2[i7], "DaysSchedule", new Object[0]);
                i7++;
            } else {
                return;
            }
        }
    }

    public static void Z(v0 v0Var, ArrayList arrayList, z41 z41Var) {
        String M0 = gd.M0(2131752764, null);
        String M02 = gd.M0(2131752762, null);
        l41 l41Var = new l41(2);
        l41Var.f37018m = M0;
        l41Var.f37021p = M02;
        l41Var.f37019n = "RestrictedEmoji";
        l41Var.f37020o = "👋";
        arrayList.add(l41Var);
        l41 i7 = l41.i(1, gd.M0(2131752758, null));
        i7.L(v0Var.f18503r);
        arrayList.add(i7);
        arrayList.add(l41.C(null));
        if (v0Var.f18503r) {
            v1 d = w1.f(v0Var.currentAccount).d("hello");
            if (d != null) {
                l41 l41Var2 = new l41(17);
                l41Var2.H = d;
                arrayList.add(l41Var2);
            } else {
                l41 c10 = l41.c(2, 2131232023, gd.M0(2131752763, null));
                c10.f37023r = true;
                arrayList.add(c10);
            }
            arrayList.add(l41.C(null));
            arrayList.add(l41.u(gd.M0(2131752677, null)));
            l41 x10 = l41.x(3, gd.M0(2131752770, null));
            x10.L(v0Var.f18504s);
            arrayList.add(x10);
            l41 x11 = l41.x(4, gd.M0(2131752765, null));
            x11.L(!v0Var.f18504s);
            arrayList.add(x11);
            arrayList.add(l41.C(null));
            v0Var.f18499c.a(arrayList, z41Var, true);
            arrayList.add(l41.C(gd.M0(2131752759, null)));
            arrayList.add(l41.u(gd.M0(2131752761, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = v0Var.d;
                if (i10 < iArr.length) {
                    if (iArr[i10] == v0Var.f18505w) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            String[] strArr = v0Var.f18500e;
            t6 t6Var = new t6(v0Var, 10);
            l41 l41Var3 = new l41(14);
            l41Var3.f37022q = strArr;
            l41Var3.A = i10;
            l41Var3.D = t6Var;
            l41Var3.C = -1L;
            arrayList.add(l41Var3);
            arrayList.add(l41.C(gd.M0(2131752760, null)));
        }
    }

    public final void a0(boolean z10) {
        if (this.f18497a == null) {
            return;
        }
        this.f18497a.a(b0(), z10);
    }

    public final boolean b0() {
        boolean z10;
        a0 a0Var;
        if (this.f18501f) {
            boolean z11 = this.f18503r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f18502n;
            if (tL_businessGreetingMessage != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z11 != z10 || (z11 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f18505w || tL_businessGreetingMessage.recipients.exclude_selected != this.f18504s || ((a0Var = this.f18499c) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        if (!this.f18497a.f28871y.f57658f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            v1 d = w1.f(this.currentAccount).d("hello");
            boolean z10 = this.f18503r;
            if (z10 && d == null) {
                q2.APP_ERROR.a();
                View B1 = this.f18498b.B1(2);
                int i7 = -this.h;
                this.h = i7;
                org.telegram.messenger.g0.E3(i7, B1, null);
            } else if (z10 && !this.f18499c.k(this.f18498b)) {
            } else {
                this.f18497a.b(true);
                TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f18503r) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f18506a;
                    tL_inputBusinessGreetingMessage.recipients = this.f18499c.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f18505w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (d2 != null) {
                        d2.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        d2.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f18506a;
                        tL_businessGreetingMessage.recipients = this.f18499c.f();
                        d2.business_greeting_message.no_activity_days = this.f18505w;
                    }
                } else if (d2 != null) {
                    d2.flags2 &= -5;
                    d2.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new ai.e1(this, 19));
                getMessagesStorage().j2(d2, false);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231240);
        this.simpleActionBar.setTitle(gd.M0(2131752764, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.r1(this, 9));
        this.f18497a = this.simpleActionBar.s(gd.M0(2131745751, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new j0(this, 2));
        this.f18499c = a0Var;
        a0Var.f18251n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f18502n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        e51 e51Var = new e51(this, new e7(this, 11), new u0(this, 2), null);
        this.f18498b = e51Var;
        e51Var.r1();
        this.f18498b.setSectionsDrawBackground(true);
        e51 e51Var2 = this.f18498b;
        e51Var2.f34607g3.f42809r = false;
        frameLayout.addView(e51Var2, ma.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z10;
        int i7;
        boolean z11;
        z41 z41Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f18501f) {
            return;
        }
        TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().e());
        if (d2 == null) {
            getMessagesController().n3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = d2.business_greeting_message;
        this.f18502n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18503r = z10;
        if (tL_businessGreetingMessage != null) {
            i7 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i7 = 7;
        }
        this.f18505w = i7;
        if (tL_businessGreetingMessage != null) {
            z11 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z11 = true;
        }
        this.f18504s = z11;
        a0 a0Var = this.f18499c;
        if (a0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        e51 e51Var = this.f18498b;
        if (e51Var != null && (z41Var = e51Var.f34607g3) != null) {
            z41Var.O(true);
        }
        a0(true);
        this.f18501f = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        z41 z41Var;
        if (i7 == ks.F1) {
            e51 e51Var = this.f18498b;
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
        return this.f18498b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        if (b0()) {
            if (z10) {
                if (!this.f18503r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = gd.M0(2131743598, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28744a;
                u1Var.S = M0;
                u1Var.U = gd.M0(2131752757, null);
                alertDialog$Builder.k(gd.M0(2131754214, null), new u0(this, 0));
                alertDialog$Builder.h(gd.M0(2131747387, null), new u0(this, 1));
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
