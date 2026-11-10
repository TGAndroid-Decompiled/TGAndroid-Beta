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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.LaunchActivity;
public final class i3 implements View.OnClickListener {
    public final int f14720a = 1;
    public final fi.d f14721b;
    public final long f14722c;
    public final TLRPC.User d;
    public final int f14723e;
    public final org.telegram.ui.ActionBar.w2 f14724f;
    public final boolean h;
    public final h6 f14725n;
    public final Object f14726r;
    public final Object f14727s;
    public final Object f14728w;

    public i3(fi.d dVar, ey0 ey0Var, qp qpVar, long j3, TLRPC.User user, String[] strArr, int i7, org.telegram.ui.ActionBar.w2 w2Var, boolean z9, h6 h6Var) {
        this.f14721b = dVar;
        this.f14726r = ey0Var;
        this.f14727s = qpVar;
        this.f14722c = j3;
        this.d = user;
        this.f14728w = strArr;
        this.f14723e = i7;
        this.f14724f = w2Var;
        this.h = z9;
        this.f14725n = h6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f14720a) {
            case 0:
                long[] jArr = (long[]) this.f14726r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f14727s;
                final Context context = (Context) this.f14728w;
                final fi.d dVar = this.f14721b;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i7 = this.f14723e;
                    connectstarrefbot.bot = qp.s1(i7).o1(starrefprogram.bot_id);
                    connectstarrefbot.peer = qp.s1(i7).j1(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    final org.telegram.ui.ActionBar.w2 w2Var = this.f14724f;
                    final long j10 = this.f14722c;
                    final boolean z9 = this.h;
                    final h6 h6Var = this.f14725n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new g3(fi.d.this, tLObject, i7, j3, w2Var, starrefprogram, j10, z9, context, h6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                ey0 ey0Var = (ey0) this.f14726r;
                a6 a6Var = ey0Var.h;
                final qp qpVar = (qp) this.f14727s;
                String[] strArr = (String[]) this.f14728w;
                final fi.d dVar2 = this.f14721b;
                if (!dVar2.Q) {
                    EditTextBoldCursor textView = a6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(a6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.f14722c;
                        tL_messages_editChatParticipantRank.peer = qpVar.j1(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = qp.n1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f14723e);
                        d3.b bVar = new d3.b(1);
                        final org.telegram.ui.ActionBar.w2 w2Var2 = this.f14724f;
                        final boolean z10 = this.h;
                        final h6 h6Var2 = this.f14725n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new v10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.w2 w2Var3 = w2Var2;
                                if (updates != null) {
                                    long j12 = user2.f27109id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    org.telegram.messenger.qp qpVar2 = org.telegram.messenger.qp.this;
                                    qpVar2.p5(-j11, str, j12);
                                    qpVar2.O3(updates, false);
                                    w2Var3.dismiss();
                                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && T != null) {
                                        gc a02 = gc.a0(T);
                                        if (z10) {
                                            i10 = 2131744288;
                                        } else {
                                            i10 = 2131744287;
                                        }
                                        bc I = a02.I(2131623989, org.telegram.messenger.id.M0(i10, null), tL_messages_editChatParticipantRank2.rank);
                                        fb fbVar = I.f32199e;
                                        if (fbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) fbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) fbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        I.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.f1.r(w2Var3.E, h6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f10 = -ey0Var.D;
                    ey0Var.D = f10;
                    org.telegram.messenger.g0.G3(f10, textView, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
                return;
        }
    }

    public i3(fi.d dVar, long[] jArr, int i7, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.w2 w2Var, long j3, boolean z9, Context context, h6 h6Var, TLRPC.User user) {
        this.f14721b = dVar;
        this.f14726r = jArr;
        this.f14723e = i7;
        this.f14727s = starrefprogram;
        this.f14724f = w2Var;
        this.f14722c = j3;
        this.h = z9;
        this.f14728w = context;
        this.f14725n = h6Var;
        this.d = user;
    }
}
