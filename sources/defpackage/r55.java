package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class r55 extends e implements fn7 {
    public nla a;
    public q9c b;
    public u41 c;
    public final int[] d;
    public final String[] e;
    public boolean f;
    public int h;
    public TL_account.TL_businessGreetingMessage n;
    public boolean r;
    public boolean s;
    public int w;

    public r55() {
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
                this.e[i] = ob6.G(iArr2[i], "DaysSchedule", new Object[0]);
                i++;
            } else {
                return;
            }
        }
    }

    public final void Y(boolean z) {
        if (this.a == null) {
            return;
        }
        this.a.a(a0(), z);
    }

    public final void Z(ArrayList arrayList, l9c l9cVar) {
        String M0 = ob6.M0(2131752756, null);
        String M02 = ob6.M0(2131752754, null);
        b8c b8cVar = new b8c(2);
        b8cVar.m = M0;
        b8cVar.p = M02;
        b8cVar.n = "RestrictedEmoji";
        b8cVar.o = "👋";
        arrayList.add(b8cVar);
        b8c i = b8c.i(1, ob6.M0(2131752750, null));
        i.L(this.r);
        arrayList.add(i);
        arrayList.add(b8c.C(null));
        if (this.r) {
            a19 d = b19.f(this.currentAccount).d("hello");
            if (d != null) {
                b8c b8cVar2 = new b8c(17);
                b8cVar2.H = d;
                arrayList.add(b8cVar2);
            } else {
                b8c c = b8c.c(2, 2131232026, ob6.M0(2131752755, null));
                c.r = true;
                arrayList.add(c);
            }
            arrayList.add(b8c.C(null));
            arrayList.add(b8c.u(ob6.M0(2131752669, null)));
            b8c x = b8c.x(3, ob6.M0(2131752762, null));
            x.L(this.s);
            arrayList.add(x);
            b8c x2 = b8c.x(4, ob6.M0(2131752757, null));
            x2.L(!this.s);
            arrayList.add(x2);
            arrayList.add(b8c.C(null));
            this.c.a(arrayList, l9cVar, true);
            arrayList.add(b8c.C(ob6.M0(2131752751, null)));
            arrayList.add(b8c.u(ob6.M0(2131752753, null)));
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
            zj3 zj3Var = new zj3(this, (byte) 15);
            b8c b8cVar3 = new b8c(14);
            b8cVar3.q = this.e;
            b8cVar3.A = i2;
            b8cVar3.D = zj3Var;
            b8cVar3.C = -1L;
            arrayList.add(b8cVar3);
            arrayList.add(b8c.C(ob6.M0(2131752752, null)));
        }
    }

    public final boolean a0() {
        boolean z;
        u41 u41Var;
        if (this.f) {
            boolean z2 = this.r;
            TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
            if (tL_businessGreetingMessage != null) {
                z = true;
            } else {
                z = false;
            }
            if (z2 != z || (z2 && tL_businessGreetingMessage != null && (tL_businessGreetingMessage.no_activity_days != this.w || tL_businessGreetingMessage.recipients.exclude_selected != this.s || ((u41Var = this.c) != null && u41Var.g())))) {
                return true;
            }
        }
        return false;
    }

    public final void b0() {
        if (!this.a.y.f) {
            if (!a0()) {
                finishFragment();
                return;
            }
            a19 d = b19.f(this.currentAccount).d("hello");
            if (this.r) {
                if (d == null) {
                    yw0.APP_ERROR.a();
                    View C1 = this.b.C1(2);
                    int i = -this.h;
                    this.h = i;
                    hl.A3(i, C1, null);
                    return;
                } else if (!this.c.k(this.b)) {
                    return;
                }
            }
            this.a.b(true);
            TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
            TL_account.updateBusinessGreetingMessage updatebusinessgreetingmessage = new TL_account.updateBusinessGreetingMessage();
            if (this.r) {
                TL_account.TL_inputBusinessGreetingMessage tL_inputBusinessGreetingMessage = new TL_account.TL_inputBusinessGreetingMessage();
                updatebusinessgreetingmessage.message = tL_inputBusinessGreetingMessage;
                tL_inputBusinessGreetingMessage.shortcut_id = d.a;
                tL_inputBusinessGreetingMessage.recipients = this.c.e();
                updatebusinessgreetingmessage.message.no_activity_days = this.w;
                updatebusinessgreetingmessage.flags |= 1;
                if (Y1 != null) {
                    Y1.flags2 |= 4;
                    TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = new TL_account.TL_businessGreetingMessage();
                    Y1.business_greeting_message = tL_businessGreetingMessage;
                    tL_businessGreetingMessage.shortcut_id = d.a;
                    tL_businessGreetingMessage.recipients = this.c.f();
                    Y1.business_greeting_message.no_activity_days = this.w;
                }
            } else if (Y1 != null) {
                Y1.flags2 &= -5;
                Y1.business_greeting_message = null;
            }
            getConnectionsManager().sendRequest(updatebusinessgreetingmessage, new w15(this, (byte) 1));
            getMessagesStorage().g2(Y1, false);
        }
    }

    public final void c0() {
        boolean z;
        int i;
        boolean z2;
        l9c l9cVar;
        TL_account.TL_businessRecipients tL_businessRecipients;
        if (this.f) {
            return;
        }
        TLRPC.UserFull Y1 = getMessagesController().Y1(getUserConfig().e());
        if (Y1 == null) {
            getMessagesController().o3(getClassGuid(), getUserConfig().f(), true);
            return;
        }
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = Y1.business_greeting_message;
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
        u41 u41Var = this.c;
        if (u41Var != null) {
            if (tL_businessGreetingMessage == null) {
                tL_businessRecipients = null;
            } else {
                tL_businessRecipients = tL_businessGreetingMessage.recipients;
            }
            u41Var.j(tL_businessRecipients);
        }
        q9c q9cVar = this.b;
        if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
            l9cVar.O(true);
        }
        Y(true);
        this.f = true;
    }

    @Override
    public final View createView(Context context) {
        TL_account.TL_businessRecipients tL_businessRecipients;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131752756, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, (byte) 23));
        this.a = this.simpleActionBar.u(ob6.M0(2131745674, null));
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        u41 u41Var = new u41(this, new rj4(this, (byte) 25));
        this.c = u41Var;
        u41Var.n = true;
        TL_account.TL_businessGreetingMessage tL_businessGreetingMessage = this.n;
        if (tL_businessGreetingMessage == null) {
            tL_businessRecipients = null;
        } else {
            tL_businessRecipients = tL_businessGreetingMessage.recipients;
        }
        u41Var.j(tL_businessRecipients);
        q9c q9cVar = new q9c(this, new yt4(this, (byte) 8), new q55(this, (byte) 2), null);
        this.b = q9cVar;
        q9cVar.s1();
        this.b.setSectionsDrawBackground(true);
        q9c q9cVar2 = this.b;
        q9cVar2.g3.r = false;
        frameLayout.addView(q9cVar2, tre.c(-1.0f, -1));
        c0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        l9c l9cVar;
        if (i == jn7.F1) {
            q9c q9cVar = this.b;
            if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
                l9cVar.O(true);
            }
            Y(true);
        } else if (i == jn7.E0) {
            c0();
        }
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.b;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (a0()) {
            if (z) {
                if (!this.r) {
                    b0();
                    return false;
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131743490, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131752749, null);
                alertDialog$Builder.j(ob6.M0(2131754209, null), new q55(this, (byte) 0));
                alertDialog$Builder.g(ob6.M0(2131747307, null), new q55(this, (byte) 1));
                showDialog(idVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        getNotificationCenter().b(this, jn7.F1);
        getNotificationCenter().b(this, jn7.E0);
        b19.f(this.currentAccount).h();
        c0();
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().n(this, jn7.F1);
        getNotificationCenter().n(this, jn7.E0);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
