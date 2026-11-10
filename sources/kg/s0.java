package kg;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import fi.v9;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.p2;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
public final class s0 extends f2 implements ls {
    public c5 f17526a;
    public r41 f17527b;
    public a0 f17528c;
    public final int[] d;
    public final String[] f17529e;
    public boolean f17530f;
    public int h;
    public TL_account.TL_businessGreetingMessage f17531n;
    public boolean f17532r;
    public boolean f17533s;
    public int f17534w;

    public s0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.f17534w = 7;
        this.f17529e = new String[iArr.length];
        int i7 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i7 < iArr2.length) {
                this.f17529e[i7] = id.G(iArr2[i7], "DaysSchedule", new Object[0]);
                i7++;
            } else {
                return;
            }
        }
    }

    public static void Z(s0 s0Var, ArrayList arrayList, m41 m41Var) {
        String M0 = id.M0(2131752775, null);
        String M02 = id.M0(2131752773, null);
        x31 x31Var = new x31(2);
        x31Var.f40156l = M0;
        x31Var.f40159o = M02;
        x31Var.f40157m = "RestrictedEmoji";
        x31Var.f40158n = "👋";
        arrayList.add(x31Var);
        x31 i7 = x31.i(1, id.M0(2131752769, null));
        i7.L(s0Var.f17532r);
        arrayList.add(i7);
        arrayList.add(x31.C(null));
        if (s0Var.f17532r) {
            s1 d = t1.f(s0Var.currentAccount).d("hello");
            if (d != null) {
                x31 x31Var2 = new x31(17);
                x31Var2.G = d;
                arrayList.add(x31Var2);
            } else {
                x31 c10 = x31.c(2, 2131232022, id.M0(2131752774, null));
                c10.f40161q = true;
                arrayList.add(c10);
            }
            arrayList.add(x31.C(null));
            arrayList.add(x31.u(id.M0(2131752688, null)));
            x31 x10 = x31.x(3, id.M0(2131752781, null));
            x10.L(s0Var.f17533s);
            arrayList.add(x10);
            x31 x11 = x31.x(4, id.M0(2131752776, null));
            x11.L(!s0Var.f17533s);
            arrayList.add(x11);
            arrayList.add(x31.C(null));
            s0Var.f17528c.a(arrayList, m41Var, true);
            arrayList.add(x31.C(id.M0(2131752770, null)));
            arrayList.add(x31.u(id.M0(2131752772, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = s0Var.d;
                if (i10 < iArr.length) {
                    if (iArr[i10] == s0Var.f17534w) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            String[] strArr = s0Var.f17529e;
            ii.c cVar = new ii.c(s0Var, 6);
            x31 x31Var3 = new x31(14);
            x31Var3.f40160p = strArr;
            x31Var3.f40169z = i10;
            x31Var3.C = cVar;
            x31Var3.B = -1L;
            arrayList.add(x31Var3);
            arrayList.add(x31.C(id.M0(2131752771, null)));
        }
    }

    public final void a0(boolean z9) {
        if (this.f17526a == null) {
            return;
        }
        this.f17526a.a(b0(), z9);
    }

    public final boolean b0() {
        boolean z9;
        a0 a0Var;
        if (this.f17530f) {
            boolean z10 = this.f17532r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f17531n;
            if (tL_businessGreetingMessage != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z10 != z9 || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f17534w || tL_businessGreetingMessage.recipients.exclude_selected != this.f17533s || ((a0Var = this.f17528c) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        if (!this.f17526a.f27380y.f55499f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            s1 d = t1.f(this.currentAccount).d("hello");
            boolean z9 = this.f17532r;
            if (z9 && d == null) {
                p2.APP_ERROR.a();
                View B1 = this.f17527b.B1(2);
                int i7 = -this.h;
                this.h = i7;
                org.telegram.messenger.g0.G3(i7, B1, null);
            } else if (z9 && !this.f17528c.k(this.f17527b)) {
            } else {
                this.f17526a.b(true);
                TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f17532r) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f17535a;
                    tL_inputBusinessGreetingMessage.recipients = this.f17528c.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f17534w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (b22 != null) {
                        b22.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        b22.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f17535a;
                        tL_businessGreetingMessage.recipients = this.f17528c.f();
                        b22.business_greeting_message.no_activity_days = this.f17534w;
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
        this.simpleActionBar.setTitle(id.M0(2131752775, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bi.s(this, 14));
        this.f17526a = this.simpleActionBar.p(id.M0(2131745946, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new v9(this, 25));
        this.f17528c = a0Var;
        a0Var.f17300n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f17531n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        r41 r41Var = new r41(this, new hi.u1(this, 9), new r0(this, 2), null);
        this.f17527b = r41Var;
        r41Var.r1();
        this.f17527b.setSectionsDrawBackground(true);
        r41 r41Var2 = this.f17527b;
        r41Var2.f37496f3.f35845r = false;
        frameLayout.addView(r41Var2, ha.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z9;
        int i7;
        boolean z10;
        m41 m41Var;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f17530f) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = b22.business_greeting_message;
        this.f17531n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f17532r = z9;
        if (tL_businessGreetingMessage != null) {
            i7 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i7 = 7;
        }
        this.f17534w = i7;
        if (tL_businessGreetingMessage != null) {
            z10 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z10 = true;
        }
        this.f17533s = z10;
        a0 a0Var = this.f17528c;
        if (a0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        r41 r41Var = this.f17527b;
        if (r41Var != null && (m41Var = r41Var.f37496f3) != null) {
            m41Var.O(true);
        }
        a0(true);
        this.f17530f = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if (i7 == qs.F1) {
            r41 r41Var = this.f17527b;
            if (r41Var != null && (m41Var = r41Var.f37496f3) != null) {
                m41Var.O(true);
            }
            a0(true);
        } else if (i7 == qs.E0) {
            d0();
        }
    }

    @Override
    public final pj0 getListViewForSimpleGlass() {
        return this.f17527b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (b0()) {
            if (z9) {
                if (!this.f17532r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = id.M0(2131743835, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                u1Var.R = M0;
                u1Var.T = id.M0(2131752768, null);
                alertDialog$Builder.k(id.M0(2131754216, null), new r0(this, 0));
                alertDialog$Builder.h(id.M0(2131747580, null), new r0(this, 1));
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
