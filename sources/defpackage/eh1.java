package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.LaunchActivity;
public final class eh1 implements View.OnClickListener {
    public final byte a = 1;
    public final b61 b;
    public final long c;
    public final TLRPC.User d;
    public final int e;
    public final my0 f;
    public final boolean h;
    public final ylb n;
    public final Object r;
    public final Object s;
    public final Object w;

    public eh1(b61 b61Var, xhb xhbVar, oc7 oc7Var, long j, TLRPC.User user, String[] strArr, int i, my0 my0Var, boolean z, ylb ylbVar) {
        this.b = b61Var;
        this.r = xhbVar;
        this.s = oc7Var;
        this.c = j;
        this.d = user;
        this.w = strArr;
        this.e = i;
        this.f = my0Var;
        this.h = z;
        this.n = ylbVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.w;
        Object obj2 = this.s;
        Object obj3 = this.r;
        switch (b) {
            case 0:
                long[] jArr = (long[]) obj3;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj2;
                final Context context = (Context) obj;
                final b61 b61Var = this.b;
                if (!b61Var.R) {
                    b61Var.setLoading(true);
                    final long j = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i = this.e;
                    connectstarrefbot.bot = oc7.r1(i).n1(starrefprogram.bot_id);
                    connectstarrefbot.peer = oc7.r1(i).i1(j);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                    final my0 my0Var = this.f;
                    final long j2 = this.c;
                    final boolean z = this.h;
                    final ylb ylbVar = this.n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            gm.c3(new bh1(b61.this, tLObject, i, j, my0Var, starrefprogram, j2, z, context, ylbVar, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                xhb xhbVar = (xhb) obj3;
                ng8 ng8Var = xhbVar.h;
                final oc7 oc7Var = (oc7) obj2;
                String[] strArr = (String[]) obj;
                final b61 b61Var2 = this.b;
                if (!b61Var2.R) {
                    EditTextBoldCursor textView = ng8Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        b61Var2.setLoading(true);
                        gm.t1(ng8Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j3 = this.c;
                        tL_messages_editChatParticipantRank.peer = oc7Var.i1(j3);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = oc7.m1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        kc kcVar = new kc((byte) 0);
                        final my0 my0Var2 = this.f;
                        final boolean z2 = this.h;
                        final ylb ylbVar2 = this.n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, kcVar, new jac() {
                            @Override
                            public final void a(Object obj4, Object obj5) {
                                int i2;
                                TLRPC.Updates updates = (TLRPC.Updates) obj4;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                my0 my0Var3 = my0Var2;
                                if (updates != null) {
                                    long j4 = user2.id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    oc7 oc7Var2 = oc7.this;
                                    oc7Var2.x5(-j3, str, j4);
                                    oc7Var2.T3(updates, false);
                                    my0Var3.dismiss();
                                    d S = LaunchActivity.S();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && S != null) {
                                        c41 b0 = c41.b0(S);
                                        if (z2) {
                                            i2 = 2131743973;
                                        } else {
                                            i2 = 2131743972;
                                        }
                                        u31 I = b0.I(2131623990, jb6.M0(i2, null), tL_messages_editChatParticipantRank2.rank);
                                        y21 y21Var = I.e;
                                        if (y21Var.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) y21Var.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) y21Var.getLayoutParams()).gravity |= 1;
                                        }
                                        I.j();
                                    }
                                } else if (tL_error != null) {
                                    wi8.u(my0Var3.F, ylbVar2, tL_error, false);
                                    b61Var2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f = -xhbVar.E;
                    xhbVar.E = f;
                    gm.A3(f, textView, null);
                    xx0.APP_ERROR.a();
                    return;
                }
                return;
        }
    }

    public eh1(b61 b61Var, long[] jArr, int i, TL_payments.starRefProgram starrefprogram, my0 my0Var, long j, boolean z, Context context, ylb ylbVar, TLRPC.User user) {
        this.b = b61Var;
        this.r = jArr;
        this.e = i;
        this.s = starrefprogram;
        this.f = my0Var;
        this.c = j;
        this.h = z;
        this.w = context;
        this.n = ylbVar;
        this.d = user;
    }
}
