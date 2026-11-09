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
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.y31;
public final class s0 extends f2 implements ls {
    public b5 f17523a;
    public r41 f17524b;
    public a0 f17525c;
    public final int[] d;
    public final String[] f17526e;
    public boolean f17527f;
    public int h;
    public TL_account.TL_businessGreetingMessage f17528n;
    public boolean f17529r;
    public boolean f17530s;
    public int f17531w;

    public s0() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.f17531w = 7;
        this.f17526e = new String[iArr.length];
        int i7 = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i7 < iArr2.length) {
                this.f17526e[i7] = id.G(iArr2[i7], "DaysSchedule", new Object[0]);
                i7++;
            } else {
                return;
            }
        }
    }

    public static void Z(s0 s0Var, ArrayList arrayList, m41 m41Var) {
        String M0 = id.M0(2131752775, null);
        String M02 = id.M0(2131752773, null);
        y31 y31Var = new y31(2);
        y31Var.f40568l = M0;
        y31Var.f40571o = M02;
        y31Var.f40569m = "RestrictedEmoji";
        y31Var.f40570n = "👋";
        arrayList.add(y31Var);
        y31 i7 = y31.i(1, id.M0(2131752769, null));
        i7.L(s0Var.f17529r);
        arrayList.add(i7);
        arrayList.add(y31.C(null));
        if (s0Var.f17529r) {
            s1 d = t1.f(s0Var.currentAccount).d("hello");
            if (d != null) {
                y31 y31Var2 = new y31(17);
                y31Var2.G = d;
                arrayList.add(y31Var2);
            } else {
                y31 c10 = y31.c(2, 2131232022, id.M0(2131752774, null));
                c10.f40573q = true;
                arrayList.add(c10);
            }
            arrayList.add(y31.C(null));
            arrayList.add(y31.u(id.M0(2131752688, null)));
            y31 x10 = y31.x(3, id.M0(2131752781, null));
            x10.L(s0Var.f17530s);
            arrayList.add(x10);
            y31 x11 = y31.x(4, id.M0(2131752776, null));
            x11.L(!s0Var.f17530s);
            arrayList.add(x11);
            arrayList.add(y31.C(null));
            s0Var.f17525c.a(arrayList, m41Var, true);
            arrayList.add(y31.C(id.M0(2131752770, null)));
            arrayList.add(y31.u(id.M0(2131752772, null)));
            int i10 = 0;
            while (true) {
                int[] iArr = s0Var.d;
                if (i10 < iArr.length) {
                    if (iArr[i10] == s0Var.f17531w) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            String[] strArr = s0Var.f17526e;
            ii.c cVar = new ii.c(s0Var, 6);
            y31 y31Var3 = new y31(14);
            y31Var3.f40572p = strArr;
            y31Var3.f40581z = i10;
            y31Var3.C = cVar;
            y31Var3.B = -1L;
            arrayList.add(y31Var3);
            arrayList.add(y31.C(id.M0(2131752771, null)));
        }
    }

    public final void a0(boolean z9) {
        if (this.f17523a == null) {
            return;
        }
        this.f17523a.a(b0(), z9);
    }

    public final boolean b0() {
        boolean z9;
        a0 a0Var;
        if (this.f17527f) {
            boolean z10 = this.f17529r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f17528n;
            if (tL_businessGreetingMessage != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z10 != z9 || (z10 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.f17531w || tL_businessGreetingMessage.recipients.exclude_selected != this.f17530s || ((a0Var = this.f17525c) != null && a0Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        if (!this.f17523a.f27360y.f55500f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            s1 d = t1.f(this.currentAccount).d("hello");
            boolean z9 = this.f17529r;
            if (z9 && d == null) {
                p2.APP_ERROR.a();
                View B1 = this.f17524b.B1(2);
                int i7 = -this.h;
                this.h = i7;
                org.telegram.messenger.g0.G3(i7, B1, null);
            } else if (z9 && !this.f17525c.k(this.f17524b)) {
            } else {
                this.f17523a.b(true);
                TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
                TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
                if (this.f17529r) {
                    TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                    updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                    tL_inputBusinessGreetingMessage.shortcut_id = d.f17532a;
                    tL_inputBusinessGreetingMessage.recipients = this.f17525c.e();
                    updatebusinessgreetingmessage.message.no_activity_days = this.f17531w;
                    updatebusinessgreetingmessage.flags |= 1;
                    if (b22 != null) {
                        b22.flags2 |= 4;
                        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                        b22.business_greeting_message = tL_businessGreetingMessage;
                        tL_businessGreetingMessage.shortcut_id = d.f17532a;
                        tL_businessGreetingMessage.recipients = this.f17525c.f();
                        b22.business_greeting_message.no_activity_days = this.f17531w;
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
        this.f17523a = this.simpleActionBar.o(id.M0(2131745946, null));
        a0(false);
        FrameLayout frameLayout = new FrameLayout(context);
        a0 a0Var = new a0(this, new v9(this, 25));
        this.f17525c = a0Var;
        a0Var.f17300n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.f17528n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        a0Var.j(tL_businessRecipients);
        r41 r41Var = new r41(this, new hi.u1(this, 9), new r0(this, 2), null);
        this.f17524b = r41Var;
        r41Var.r1();
        this.f17524b.setSectionsDrawBackground(true);
        r41 r41Var2 = this.f17524b;
        r41Var2.f37556f3.f35945r = false;
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
        if (this.f17527f) {
            return;
        }
        TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().e());
        if (b22 == null) {
            getMessagesController().g3(getUserConfig().f(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = b22.business_greeting_message;
        this.f17528n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f17529r = z9;
        if (tL_businessGreetingMessage != null) {
            i7 = tL_businessGreetingMessage.no_activity_days;
        } else {
            i7 = 7;
        }
        this.f17531w = i7;
        if (tL_businessGreetingMessage != null) {
            z10 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z10 = true;
        }
        this.f17530s = z10;
        a0 a0Var = this.f17525c;
        if (a0Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            a0Var.j(tL_businessRecipients);
        }
        r41 r41Var = this.f17524b;
        if (r41Var != null && (m41Var = r41Var.f37556f3) != null) {
            m41Var.O(true);
        }
        a0(true);
        this.f17527f = true;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        m41 m41Var;
        if (i7 == qs.F1) {
            r41 r41Var = this.f17524b;
            if (r41Var != null && (m41Var = r41Var.f37556f3) != null) {
                m41Var.O(true);
            }
            a0(true);
        } else if (i7 == qs.E0) {
            d0();
        }
    }

    @Override
    public final qj0 getListViewForSimpleGlass() {
        return this.f17524b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        if (b0()) {
            if (z9) {
                if (!this.f17529r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = id.M0(2131743835, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27296a;
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
