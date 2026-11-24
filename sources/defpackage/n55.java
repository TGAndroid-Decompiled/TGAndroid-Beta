package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
public final class n55 extends d implements jm7 {
    public uja a;
    public q7c b;
    public t51 c;
    public final int[] d;
    public final String[] e;
    public boolean f;
    public int h;
    public TL_account.TL_businessGreetingMessage n;
    public boolean r;
    public boolean s;
    public int w;

    public n55() {
        super(null);
        int[] iArr = {7, 14, 21, 28};
        this.d = iArr;
        this.h = -4;
        this.w = 7;
        this.e = new String[iArr.length];
        int i = 0;
        while (true) {
            int[] iArr2 = this.d;
            if (i < iArr2.length) {
                this.e[i] = jb6.G(iArr2[i], "DaysSchedule", new Object[0]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void Z(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.a(b0(), z);
    }

    public final void a0(ArrayList arrayList, l7c l7cVar) {
        String M0 = jb6.M0(2131752728, null);
        String M02 = jb6.M0(2131752726, null);
        c6c c6cVar = new c6c(2);
        c6cVar.m = M0;
        c6cVar.p = M02;
        c6cVar.n = "RestrictedEmoji";
        c6cVar.o = "👋";
        arrayList.add(c6cVar);
        c6c i = c6c.i(1, jb6.M0(2131752722, null));
        i.L(this.r);
        arrayList.add(i);
        arrayList.add(c6c.C(null));
        if (this.r) {
            oz8 d = pz8.f(this.currentAccount).d("hello");
            if (d != null) {
                c6c c6cVar2 = new c6c(17);
                c6cVar2.H = d;
                arrayList.add(c6cVar2);
            } else {
                c6c c = c6c.c(2, 2131232027, jb6.M0(2131752727, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(c6c.C(null));
            arrayList.add(c6c.u(jb6.M0(2131752641, null)));
            c6c x = c6c.x(3, jb6.M0(2131752734, null));
            x.L(this.s);
            arrayList.add(x);
            c6c x2 = c6c.x(4, jb6.M0(2131752729, null));
            x2.L(!this.s);
            arrayList.add(x2);
            arrayList.add(c6c.C(null));
            this.c.a(arrayList, l7cVar, true);
            arrayList.add(c6c.C(jb6.M0(2131752723, null)));
            arrayList.add(c6c.u(jb6.M0(2131752725, null)));
            int i2 = 0;
            while (true) {
                int[] iArr = this.d;
                if (i2 < iArr.length) {
                    if (iArr[i2] == this.w) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            sk3 sk3Var = new sk3(this, (byte) 15);
            c6c c6cVar3 = new c6c(14);
            c6cVar3.q = this.e;
            c6cVar3.A = i2;
            c6cVar3.D = sk3Var;
            c6cVar3.C = -1L;
            arrayList.add(c6cVar3);
            arrayList.add(c6c.C(jb6.M0(2131752724, null)));
        }
    }

    public final boolean b0() {
        boolean z;
        t51 t51Var;
        if (this.f) {
            boolean z2 = this.r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
            if (tL_businessGreetingMessage != null) {
                z = true;
            } else {
                z = false;
            }
            if (z2 != z || (z2 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.w || tL_businessGreetingMessage.recipients.exclude_selected != this.s || ((t51Var = this.c) != null && t51Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void c0() {
        if (!this.a.y.f) {
            if (!b0()) {
                finishFragment();
                return;
            }
            oz8 d = pz8.f(this.currentAccount).d("hello");
            if (this.r) {
                if (d == null) {
                    xx0.APP_ERROR.a();
                    View B1 = this.b.B1(2);
                    int i = -this.h;
                    this.h = i;
                    gm.A3(i, B1, null);
                    return;
                } else if (!this.c.k(this.b)) {
                    return;
                }
            }
            this.a.b(true);
            TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
            TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
            if (this.r) {
                TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                tL_inputBusinessGreetingMessage.shortcut_id = d.a;
                tL_inputBusinessGreetingMessage.recipients = this.c.e();
                updatebusinessgreetingmessage.message.no_activity_days = this.w;
                updatebusinessgreetingmessage.flags |= 1;
                if (X1 != null) {
                    X1.flags2 |= 4;
                    TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                    X1.business_greeting_message = tL_businessGreetingMessage;
                    tL_businessGreetingMessage.shortcut_id = d.a;
                    tL_businessGreetingMessage.recipients = this.c.f();
                    X1.business_greeting_message.no_activity_days = this.w;
                }
            } else if (X1 != null) {
                X1.flags2 &= -5;
                X1.business_greeting_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new r15(this, (byte) 1));
            getMessagesStorage().g2(X1, false);
        }
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231244);
        this.simpleActionBar.setTitle(jb6.M0(2131752728, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new fh2(this, (byte) 23));
        this.a = this.simpleActionBar.s(jb6.M0(2131745680, null));
        Z(false);
        FrameLayout frameLayout = new FrameLayout(context);
        t51 t51Var = new t51(this, new qn4(this, (byte) 18));
        this.c = t51Var;
        t51Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        t51Var.j(tL_businessRecipients);
        q7c q7cVar = new q7c(this, new vt4(this, (byte) 8), new m55(this, (byte) 2), null);
        this.b = q7cVar;
        q7cVar.r1();
        this.b.setSectionsDrawBackground(true);
        q7c q7cVar2 = this.b;
        q7cVar2.g3.r = false;
        frameLayout.addView(q7cVar2, qoe.c(-1.0f, -1));
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        boolean z;
        int i;
        boolean z2;
        l7c l7cVar;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f) {
            return;
        }
        TLRPC.UserFull X1 = getMessagesController().X1(getUserConfig().e());
        if (X1 == null) {
            getMessagesController().k3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = X1.business_greeting_message;
        this.n = tL_businessGreetingMessage;
        if (tL_businessGreetingMessage != null) {
            z = true;
        } else {
            z = false;
        }
        this.r = z;
        if (tL_businessGreetingMessage != null) {
            i = tL_businessGreetingMessage.no_activity_days;
        } else {
            i = 7;
        }
        this.w = i;
        if (tL_businessGreetingMessage != null) {
            z2 = tL_businessGreetingMessage.recipients.exclude_selected;
        } else {
            z2 = true;
        }
        this.s = z2;
        t51 t51Var = this.c;
        if (t51Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            t51Var.j(tL_businessRecipients);
        }
        q7c q7cVar = this.b;
        if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
            l7cVar.O(true);
        }
        Z(true);
        this.f = true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l7c l7cVar;
        if (i == nm7.F1) {
            q7c q7cVar = this.b;
            if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
                l7cVar.O(true);
            }
            Z(true);
        } else if (i == nm7.E0) {
            d0();
        }
    }

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (b0()) {
            if (z) {
                if (!this.r) {
                    c0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = jb6.M0(2131743522, null);
                he heVar = alertDialog$Builder.a;
                heVar.S = M0;
                heVar.U = jb6.M0(2131752721, null);
                alertDialog$Builder.j(jb6.M0(2131754181, null), new m55(this, (byte) 0));
                alertDialog$Builder.g(jb6.M0(2131747313, null), new m55(this, (byte) 1));
                showDialog(heVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, nm7.F1);
        getNotificationCenter().b(this, nm7.E0);
        pz8.f(this.currentAccount).h();
        d0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, nm7.F1);
        getNotificationCenter().n(this, nm7.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
