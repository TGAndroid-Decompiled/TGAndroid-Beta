package ki;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.np;
import org.telegram.messenger.r10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.b6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.py0;
import org.telegram.ui.LaunchActivity;
public final class z2 implements View.OnClickListener {
    public final int f19129a = 1;
    public final hi.e f19130b;
    public final long f19131c;
    public final TLRPC.User d;
    public final int f19132e;
    public final org.telegram.ui.ActionBar.w2 f19133f;
    public final boolean h;
    public final h6 f19134n;
    public final Object f19135r;
    public final Object f19136s;
    public final Object f19137w;

    public z2(hi.e eVar, py0 py0Var, np npVar, long j3, TLRPC.User user, String[] strArr, int i7, org.telegram.ui.ActionBar.w2 w2Var, boolean z10, h6 h6Var) {
        this.f19130b = eVar;
        this.f19135r = py0Var;
        this.f19136s = npVar;
        this.f19131c = j3;
        this.d = user;
        this.f19137w = strArr;
        this.f19132e = i7;
        this.f19133f = w2Var;
        this.h = z10;
        this.f19134n = h6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f19129a) {
            case 0:
                long[] jArr = (long[]) this.f19135r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f19136s;
                final Context context = (Context) this.f19137w;
                final hi.e eVar = this.f19130b;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i7 = this.f19132e;
                    connectstarrefbot.bot = np.u1(i7).q1(starrefprogram.bot_id);
                    connectstarrefbot.peer = np.u1(i7).l1(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    final org.telegram.ui.ActionBar.w2 w2Var = this.f19133f;
                    final long j10 = this.f19131c;
                    final boolean z10 = this.h;
                    final h6 h6Var = this.f19134n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.g3(new x2(hi.e.this, tLObject, i7, j3, w2Var, starrefprogram, j10, z10, context, h6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                py0 py0Var = (py0) this.f19135r;
                b6 b6Var = py0Var.h;
                final np npVar = (np) this.f19136s;
                String[] strArr = (String[]) this.f19137w;
                final hi.e eVar2 = this.f19130b;
                if (!eVar2.R) {
                    EditTextBoldCursor textView = b6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        eVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(b6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.f19131c;
                        tL_messages_editChatParticipantRank.peer = npVar.l1(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = np.p1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f19132e);
                        d3.b bVar = new d3.b(1);
                        final org.telegram.ui.ActionBar.w2 w2Var2 = this.f19133f;
                        final boolean z11 = this.h;
                        final h6 h6Var2 = this.f19134n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new r10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.w2 w2Var3 = w2Var2;
                                if (updates != null) {
                                    long j12 = user2.f28583id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    org.telegram.messenger.np npVar2 = org.telegram.messenger.np.this;
                                    npVar2.B5(-j11, str, j12);
                                    npVar2.V3(updates, false);
                                    w2Var3.dismiss();
                                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && T != null) {
                                        lc b02 = lc.b0(T);
                                        if (z11) {
                                            i10 = 2131744045;
                                        } else {
                                            i10 = 2131744044;
                                        }
                                        gc I = b02.I(2131623990, org.telegram.messenger.hd.N0(i10, null), tL_messages_editChatParticipantRank2.rank);
                                        lb lbVar = I.f35523e;
                                        if (lbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) lbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) lbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        I.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.c0.t(w2Var3.F, h6Var2, tL_error, false);
                                    eVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f10 = -py0Var.E;
                    py0Var.E = f10;
                    org.telegram.messenger.g0.E3(f10, textView, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    return;
                }
                return;
        }
    }

    public z2(hi.e eVar, long[] jArr, int i7, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.w2 w2Var, long j3, boolean z10, Context context, h6 h6Var, TLRPC.User user) {
        this.f19130b = eVar;
        this.f19135r = jArr;
        this.f19132e = i7;
        this.f19136s = starrefprogram;
        this.f19133f = w2Var;
        this.f19131c = j3;
        this.h = z10;
        this.f19137w = context;
        this.f19134n = h6Var;
        this.d = user;
    }
}
