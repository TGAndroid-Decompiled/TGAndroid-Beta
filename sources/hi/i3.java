package hi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.qp;
import org.telegram.messenger.v10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.LaunchActivity;
public final class i3 implements View.OnClickListener {
    public final int f14718a = 1;
    public final fi.d f14719b;
    public final long f14720c;
    public final TLRPC.User d;
    public final int f14721e;
    public final org.telegram.ui.ActionBar.v2 f14722f;
    public final boolean h;
    public final g6 f14723n;
    public final Object f14724r;
    public final Object f14725s;
    public final Object f14726w;

    public i3(fi.d dVar, fy0 fy0Var, qp qpVar, long j3, TLRPC.User user, String[] strArr, int i7, org.telegram.ui.ActionBar.v2 v2Var, boolean z9, g6 g6Var) {
        this.f14719b = dVar;
        this.f14724r = fy0Var;
        this.f14725s = qpVar;
        this.f14720c = j3;
        this.d = user;
        this.f14726w = strArr;
        this.f14721e = i7;
        this.f14722f = v2Var;
        this.h = z9;
        this.f14723n = g6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14718a) {
            case 0:
                long[] jArr = (long[]) this.f14724r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f14725s;
                final Context context = (Context) this.f14726w;
                final fi.d dVar = this.f14719b;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i7 = this.f14721e;
                    connectstarrefbot.bot = qp.s1(i7).o1(starrefprogram.bot_id);
                    connectstarrefbot.peer = qp.s1(i7).j1(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    final org.telegram.ui.ActionBar.v2 v2Var = this.f14722f;
                    final long j10 = this.f14720c;
                    final boolean z9 = this.h;
                    final g6 g6Var = this.f14723n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new g3(fi.d.this, tLObject, i7, j3, v2Var, starrefprogram, j10, z9, context, g6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                fy0 fy0Var = (fy0) this.f14724r;
                a6 a6Var = fy0Var.h;
                final qp qpVar = (qp) this.f14725s;
                String[] strArr = (String[]) this.f14726w;
                final fi.d dVar2 = this.f14719b;
                if (!dVar2.Q) {
                    EditTextBoldCursor textView = a6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(a6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.f14720c;
                        tL_messages_editChatParticipantRank.peer = qpVar.j1(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = qp.n1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f14721e);
                        d3.b bVar = new d3.b(1);
                        final org.telegram.ui.ActionBar.v2 v2Var2 = this.f14722f;
                        final boolean z10 = this.h;
                        final g6 g6Var2 = this.f14723n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new v10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.v2 v2Var3 = v2Var2;
                                if (updates != null) {
                                    long j12 = user2.f27105id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    org.telegram.messenger.qp qpVar2 = org.telegram.messenger.qp.this;
                                    qpVar2.p5(-j11, str, j12);
                                    qpVar2.O3(updates, false);
                                    v2Var3.dismiss();
                                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && T != null) {
                                        hc a02 = hc.a0(T);
                                        if (z10) {
                                            i10 = 2131744288;
                                        } else {
                                            i10 = 2131744287;
                                        }
                                        cc I = a02.I(2131623989, org.telegram.messenger.id.M0(i10, null), tL_messages_editChatParticipantRank2.rank);
                                        gb gbVar = I.f32623e;
                                        if (gbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) gbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) gbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        I.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.f1.r(v2Var3.E, g6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f10 = -fy0Var.D;
                    fy0Var.D = f10;
                    org.telegram.messenger.g0.G3(f10, textView, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
                return;
        }
    }

    public i3(fi.d dVar, long[] jArr, int i7, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.v2 v2Var, long j3, boolean z9, Context context, g6 g6Var, TLRPC.User user) {
        this.f14719b = dVar;
        this.f14724r = jArr;
        this.f14721e = i7;
        this.f14725s = starrefprogram;
        this.f14722f = v2Var;
        this.f14720c = j3;
        this.h = z9;
        this.f14726w = context;
        this.f14723n = g6Var;
        this.d = user;
    }
}
