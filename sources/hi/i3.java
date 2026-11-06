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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.LaunchActivity;
public final class i3 implements View.OnClickListener {
    public final int f14715a = 1;
    public final fi.d f14716b;
    public final long f14717c;
    public final TLRPC.User d;
    public final int f14718e;
    public final org.telegram.ui.ActionBar.v2 f14719f;
    public final boolean h;
    public final f6 f14720n;
    public final Object f14721r;
    public final Object f14722s;
    public final Object f14723w;

    public i3(fi.d dVar, dy0 dy0Var, qp qpVar, long j3, TLRPC.User user, String[] strArr, int i7, org.telegram.ui.ActionBar.v2 v2Var, boolean z9, f6 f6Var) {
        this.f14716b = dVar;
        this.f14721r = dy0Var;
        this.f14722s = qpVar;
        this.f14717c = j3;
        this.d = user;
        this.f14723w = strArr;
        this.f14718e = i7;
        this.f14719f = v2Var;
        this.h = z9;
        this.f14720n = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14715a) {
            case 0:
                long[] jArr = (long[]) this.f14721r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f14722s;
                final Context context = (Context) this.f14723w;
                final fi.d dVar = this.f14716b;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i7 = this.f14718e;
                    connectstarrefbot.bot = qp.s1(i7).o1(starrefprogram.bot_id);
                    connectstarrefbot.peer = qp.s1(i7).j1(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    final org.telegram.ui.ActionBar.v2 v2Var = this.f14719f;
                    final long j10 = this.f14717c;
                    final boolean z9 = this.h;
                    final f6 f6Var = this.f14720n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new g3(fi.d.this, tLObject, i7, j3, v2Var, starrefprogram, j10, z9, context, f6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                dy0 dy0Var = (dy0) this.f14721r;
                a6 a6Var = dy0Var.h;
                final qp qpVar = (qp) this.f14722s;
                String[] strArr = (String[]) this.f14723w;
                final fi.d dVar2 = this.f14716b;
                if (!dVar2.Q) {
                    EditTextBoldCursor textView = a6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(a6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.f14717c;
                        tL_messages_editChatParticipantRank.peer = qpVar.j1(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = qp.n1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f14718e);
                        d3.b bVar = new d3.b(1);
                        final org.telegram.ui.ActionBar.v2 v2Var2 = this.f14719f;
                        final boolean z10 = this.h;
                        final f6 f6Var2 = this.f14720n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new v10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.v2 v2Var3 = v2Var2;
                                if (updates != null) {
                                    long j12 = user2.f27101id;
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
                                            i10 = 2131744289;
                                        } else {
                                            i10 = 2131744288;
                                        }
                                        cc I = a02.I(2131623989, org.telegram.messenger.hd.M0(i10, null), tL_messages_editChatParticipantRank2.rank);
                                        gb gbVar = I.f32519e;
                                        if (gbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) gbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) gbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        I.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.f1.r(v2Var3.E, f6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f10 = -dy0Var.D;
                    dy0Var.D = f10;
                    org.telegram.messenger.g0.G3(f10, textView, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
                return;
        }
    }

    public i3(fi.d dVar, long[] jArr, int i7, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.v2 v2Var, long j3, boolean z9, Context context, f6 f6Var, TLRPC.User user) {
        this.f14716b = dVar;
        this.f14721r = jArr;
        this.f14718e = i7;
        this.f14722s = starrefprogram;
        this.f14719f = v2Var;
        this.f14717c = j3;
        this.h = z9;
        this.f14723w = context;
        this.f14720n = f6Var;
        this.d = user;
    }
}
