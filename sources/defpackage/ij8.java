package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
public final class ij8 extends e {
    public final long a;
    public bna b;
    public i56 c;
    public q9c d;
    public nla e;
    public final boolean f;
    public final long h;
    public boolean n;
    public long r;
    public a92 s;
    public boolean w;

    public ij8(long j) {
        super(null);
        TLRPC.Chat chat = null;
        boolean z = true;
        this.w = true;
        this.a = j;
        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j));
        if (M0 != null && M0.linked_monoforum_id != 0) {
            chat = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
        }
        long j2 = chat != null ? chat.send_paid_messages_stars : 0L;
        z = (M0 == null || !M0.broadcast_messages_allowed) ? false : false;
        this.f = z;
        long k = Utilities.k(z ? j2 : getMessagesController().k4.c.f(), getMessagesController().k4.P1.f(), 0L);
        this.h = k;
        this.n = z;
        this.r = k;
    }

    public final void Y(boolean z) {
        boolean a0;
        if (this.e == null || this.w == (a0 = a0())) {
            return;
        }
        this.w = a0;
        this.e.a(a0, z);
    }

    public final String Z() {
        int f = getMessagesController().k4.Q1.f();
        return ob6.a0(null, null, 2131746802, cc.J0(f), String.valueOf(((int) (((((float) this.r) * (f / 1000.0f)) / 1000.0d) * getMessagesController().k4.A3.i)) / 100.0d));
    }

    public final boolean a0() {
        if (this.r == this.h && this.n == this.f) {
            return false;
        }
        return true;
    }

    public final void b0(TLRPC.TL_error tL_error, TLObject tLObject, TL_stars.updatePaidMessagesPrice updatepaidmessagesprice) {
        long j;
        if (tL_error != null) {
            this.e.b(false);
            d31.e0(tL_error);
            return;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        getMessagesController().c4(updates.chats, false);
        getMessagesController().Y3(updates, false);
        if (!this.isFinished && !this.finishing) {
            a92 a92Var = this.s;
            if (a92Var != null) {
                if (updatepaidmessagesprice.suggestions_allowed) {
                    j = updatepaidmessagesprice.send_paid_messages_stars;
                } else {
                    j = -1;
                }
                a92Var.run(j);
            }
            finishFragment();
        }
    }

    public final void c0() {
        long j;
        long j2;
        if (!this.e.y.f) {
            if (!a0()) {
                finishFragment();
                return;
            }
            this.e.b(true);
            TL_stars.updatePaidMessagesPrice updatepaidmessagesprice = new TL_stars.updatePaidMessagesPrice();
            uc7 messagesController = getMessagesController();
            long j3 = this.a;
            updatepaidmessagesprice.channel = messagesController.h1(j3);
            boolean z = this.n;
            if (z) {
                j = this.r;
            } else {
                j = 0;
            }
            updatepaidmessagesprice.send_paid_messages_stars = j;
            updatepaidmessagesprice.suggestions_allowed = z;
            getConnectionsManager().sendRequest(updatepaidmessagesprice, new ol7(this, updatepaidmessagesprice, (byte) 9));
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j3));
            if (M0 != null) {
                boolean z2 = this.n;
                int i = M0.flags2;
                if (z2) {
                    M0.flags2 = i | 65536;
                    M0.broadcast_messages_allowed = true;
                } else {
                    M0.flags2 = i & (-65537);
                    M0.broadcast_messages_allowed = false;
                }
                getMessagesController().a4(M0, true);
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(M0.linked_monoforum_id));
                if (M02 != null) {
                    boolean z3 = this.n;
                    int i2 = M02.flags2;
                    if (z3) {
                        M02.flags2 = i2 | 16384;
                        M02.send_paid_messages_stars = this.r;
                    } else {
                        M02.flags2 = i2 & (-16385);
                        M02.send_paid_messages_stars = 0L;
                    }
                    getMessagesController().a4(M02, true);
                }
            }
            a92 a92Var = this.s;
            if (a92Var != null) {
                if (this.n) {
                    j2 = this.r;
                } else {
                    j2 = -1;
                }
                a92Var.run(j2);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.simpleActionBar.setBackButtonImage(2131231243);
        this.simpleActionBar.setTitle(ob6.M0(2131746823, null));
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 26));
        this.e = this.simpleActionBar.u(ob6.M0(2131745674, null));
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        yob.h(aob.a7, null, frameLayout);
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        bna bnaVar = new bna(context, this.resourceProvider);
        this.b = bnaVar;
        int i = aob.d6;
        yob.h(i, getResourceProvider(), bnaVar);
        i56 i56Var = new i56(context, this, null, true, true);
        this.c = i56Var;
        i56Var.setPadding(hl.L(16.0f), hl.L(12.0f), hl.L(16.0f), 0);
        yob.h(i, getResourceProvider(), this.c);
        this.c.b(true);
        this.c.d(0, null, false);
        q9c q9cVar = new q9c(context, this.currentAccount, this.classGuid, false, new hj8(this, (byte) 0), new gj8(this, (byte) 2), null, this.resourceProvider);
        this.d = q9cVar;
        q9cVar.s1();
        frameLayout2.addView(this.d, tre.e(-1, -1, 51));
        return this.fragmentView;
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.d;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !a0();
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (a0()) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = ob6.M0(2131743490, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131748224, null);
                alertDialog$Builder.j(ob6.M0(2131754209, null), new gj8(this, (byte) 0));
                alertDialog$Builder.g(ob6.M0(2131751371, null), new gj8(this, (byte) 1));
                showDialog(idVar);
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        l9c l9cVar;
        super.onFragmentCreate();
        q9c q9cVar = this.d;
        if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
            l9cVar.O(false);
            return true;
        }
        return true;
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
