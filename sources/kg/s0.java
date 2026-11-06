package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import fi.h9;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.ls;
import org.telegram.messenger.p2;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q41;
import org.telegram.ui.Components.x31;
public final class s0 extends f2 implements ls {
    public b5 f17520a;
    public q41 f17521b;
    public a0 f17522c;
    public final int[] d;
    public final String[] f17523e;
    public boolean f17524f;
    public int h;
    public TL_account.TL_businessGreetingMessage f17525n;
    public boolean f17526r;
    public boolean f17527s;
    public int f17528w;

    public s0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.f17528w = 7;
        this.f17523e = new String[iArr.length];
        int i7 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i7 < iArr2.length) {
                this.f17523e[i7] = hd.G(iArr2[i7], "DaysSchedule", new Object[0]);
                i7++;
            } else {
                return;
            }
        }
    }

    public static void Z(s0 s0Var, ArrayList arrayList, l41 l41Var) {
        String M0 = hd.M0(2131752775, null);
        String M02 = hd.M0(2131752773, null);
        x31 x31Var = new x31(2);
        x31Var.f40159l = M0;
        x31Var.f40162o = M02;
        x31Var.f40160m = "RestrictedEmoji";
        x31Var.f40161n = "👋";
        arrayList.add(x31Var);
        x31 i7 = x31.i(1, hd.M0(2131752769, null));
        i7.L(s0Var.f17526r);
        arrayList.add(i7);
        arrayList.add(x31.C(null));
        if (s0Var.f17526r) {
            s1 d = t1.f(s0Var.currentAccount).d("hello");
            if (d != null) {
                x31 x31Var2 = new x31(17);
                x31Var2.G = d;
                arrayList.add(x31Var2);
            } else {
                x31 c10 = x31.c(2, 2131232022, hd.M0(2131752774, null));
                c10.f40164q = true;
                arrayList.add(c10);
            }
            arrayList.add(x31.C(null));
            arrayList.add(x31.u(hd.M0(2131752688, null)));
            x31 x10 = x31.x(3, hd.M0(2131752781, null));
            x10.L(s0Var.f17527s);
            arrayList.add(x10);
            x31 x11 = x31.x(4, hd.M0(2131752776, null));
            x11.L(!s0Var.f17527s);
            arrayList.add(x11);
            arrayList.add(x31.C(null));
            s0Var.f17522c.a(arrayList, l41Var, true);
            arrayList.add(x31.C(hd.M0(2131752770, null)));
            arrayList.add(x31.u(hd.M0(2131752772, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = s0Var.d;
                if (i10 < iArr.length) {
                    if (iArr[i10] == s0Var.f17528w) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            String[] strArr = s0Var.f17523e;
            ii.c cVar = new ii.c(s0Var, 6);
            x31 x31Var3 = new x31(14);
            x31Var3.f40163p = strArr;
            x31Var3.f40172z = i10;
            x31Var3.C = cVar;
            x31Var3.B = -1L;
            arrayList.add(x31Var3);
            arrayList.add(x31.C(hd.M0(2131752771, null)));
        }
    }

    public final void a0(boolean z9) {
        if (this.f17520a == null) {
            return;
        }
        this.f17520a.a(b0(), z9);
    }

    public final boolean b0() {
        boolean z9;
        a0 a0Var;
        if (this.f17524f) {
            boolean z10 = this.f17526r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f17525n;
            if (tL_businessGreetingMessage != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z10 != z9 || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f17528w || tL_businessGreetingMessage.recipients.exclude_selected != this.f17527s || ((a0Var = this.f17522c) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        if (!this.f17520a.f27355y.f55395f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            s1 d = t1.f(this.currentAccount).d("hello");
            boolean z9 = this.f17526r;
            if (z9 && d == null) {
                p2.APP_ERROR.a();
                View B1 = this.f17521b.B1(2);
                int i7 = -this.h;
                this.h = i7;
                org.telegram.messenger.g0.G3(i7, B1, null);
            } else if (z9 && !this.f17522c.k(this.f17521b)) {
            } else {
                this.f17520a.b(true);
                TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f17526r) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f17529a;
                    tL_inputBusinessGreetingMessage.recipients = this.f17522c.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f17528w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (b22 != null) {
                        b22.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        b22.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f17529a;
                        tL_businessGreetingMessage.recipients = this.f17522c.f();
                        b22.business_greeting_message.no_activity_days = this.f17528w;
                    }
                } else if (b22 != null) {
                    b22.flags2 &= -5;
                    b22.business_greeting_message = null;
                }
                getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new bi.j0(this, 17));
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
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 14));
        this.f17520a = this.simpleActionBar.n(hd.M0(2131745947, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new h9(this, 26));
        this.f17522c = a0Var;
        a0Var.f17297n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f17525n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        q41 q41Var = new q41(this, new hi.u1(this, 9), new r0(this, 2), null);
        this.f17521b = q41Var;
        q41Var.r1();
        this.f17521b.setSectionsDrawBackground(true);
        q41 q41Var2 = this.f17521b;
        q41Var2.f37160f3.f35510r = false;
        frameLayout.addView(q41Var2, ha.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z9;
        int i7;
        boolean z10;
        l41 l41Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f17524f) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = b22.business_greeting_message;
        this.f17525n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f17526r = z9;
        if (tL_businessGreetingMessage != null) {
            i7 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i7 = 7;
        }
        this.f17528w = i7;
        if (tL_businessGreetingMessage != null) {
            z10 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z10 = true;
        }
        this.f17527s = z10;
        a0 a0Var = this.f17522c;
        if (a0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        q41 q41Var = this.f17521b;
        if (q41Var != null && (l41Var = q41Var.f37160f3) != null) {
            l41Var.O(true);
        }
        a0(true);
        this.f17524f = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        l41 l41Var;
        if (i7 == qs.F1) {
            q41 q41Var = this.f17521b;
            if (q41Var != null && (l41Var = q41Var.f37160f3) != null) {
                l41Var.O(true);
            }
            a0(true);
        } else if (i7 == qs.E0) {
            d0();
        }
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f17521b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (b0()) {
            if (z9) {
                if (!this.f17526r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = hd.M0(2131743836, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = M0;
                u1Var.T = hd.M0(2131752768, null);
                alertDialog$Builder.k(hd.M0(2131754216, null), new r0(this, 0));
                alertDialog$Builder.h(hd.M0(2131747579, null), new r0(this, 1));
                showDialog(u1Var);
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().c(this, qs.F1);
        getNotificationCenter().c(this, qs.E0);
        t1.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, qs.F1);
        getNotificationCenter().n(this, qs.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
