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
public final class wf1 implements View.OnClickListener {
    public final byte a = 1;
    public final u41 b;
    public final long c;
    public final TLRPC.User d;
    public final int e;
    public final fx0 f;
    public final boolean h;
    public final wjb n;
    public final Object r;
    public final Object s;
    public final Object w;

    public wf1(u41 u41Var, wfb wfbVar, na7 na7Var, long j, TLRPC.User user, String[] strArr, int i, fx0 fx0Var, boolean z, wjb wjbVar) {
        this.b = u41Var;
        this.r = wfbVar;
        this.s = na7Var;
        this.c = j;
        this.d = user;
        this.w = strArr;
        this.e = i;
        this.f = fx0Var;
        this.h = z;
        this.n = wjbVar;
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
                final u41 u41Var = this.b;
                if (!u41Var.R) {
                    u41Var.setLoading(true);
                    final long j = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i = this.e;
                    connectstarrefbot.bot = na7.q1(i).m1(starrefprogram.bot_id);
                    connectstarrefbot.peer = na7.q1(i).h1(j);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
                    final fx0 fx0Var = this.f;
                    final long j2 = this.c;
                    final boolean z = this.h;
                    final wjb wjbVar = this.n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            gl.c3(new tf1(u41.this, tLObject, i, j, fx0Var, starrefprogram, j2, z, context, wjbVar, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                wfb wfbVar = (wfb) obj3;
                le8 le8Var = wfbVar.h;
                final na7 na7Var = (na7) obj2;
                String[] strArr = (String[]) obj;
                final u41 u41Var2 = this.b;
                if (!u41Var2.R) {
                    EditTextBoldCursor textView = le8Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        u41Var2.setLoading(true);
                        gl.t1(le8Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j3 = this.c;
                        tL_messages_editChatParticipantRank.peer = na7Var.h1(j3);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = na7.l1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        hc hcVar = new hc((byte) 0);
                        final fx0 fx0Var2 = this.f;
                        final boolean z2 = this.h;
                        final wjb wjbVar2 = this.n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, hcVar, new i8c() {
                            @Override
                            public final void a(Object obj4, Object obj5) {
                                int i2;
                                TLRPC.Updates updates = (TLRPC.Updates) obj4;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj5;
                                fx0 fx0Var3 = fx0Var2;
                                if (updates != null) {
                                    long j4 = user2.id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    na7 na7Var2 = na7.this;
                                    na7Var2.v5(-j3, str, j4);
                                    na7Var2.R3(updates, false);
                                    fx0Var3.dismiss();
                                    d S = LaunchActivity.S();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && S != null) {
                                        u21 b0 = u21.b0(S);
                                        if (z2) {
                                            i2 = 2131744047;
                                        } else {
                                            i2 = 2131744046;
                                        }
                                        m21 I = b0.I(2131623990, k96.M0(i2, null), tL_messages_editChatParticipantRank2.rank);
                                        q11 q11Var = I.e;
                                        if (q11Var.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) q11Var.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) q11Var.getLayoutParams()).gravity |= 1;
                                        }
                                        I.j();
                                    }
                                } else if (tL_error != null) {
                                    ug8.u(fx0Var3.F, wjbVar2, tL_error, false);
                                    u41Var2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f = -wfbVar.E;
                    wfbVar.E = f;
                    gl.A3(f, textView, null);
                    pw0.APP_ERROR.a();
                    return;
                }
                return;
        }
    }

    public wf1(u41 u41Var, long[] jArr, int i, TL_payments.starRefProgram starrefprogram, fx0 fx0Var, long j, boolean z, Context context, wjb wjbVar, TLRPC.User user) {
        this.b = u41Var;
        this.r = jArr;
        this.e = i;
        this.s = starrefprogram;
        this.f = fx0Var;
        this.c = j;
        this.h = z;
        this.w = context;
        this.n = wjbVar;
        this.d = user;
    }
}
