package ki;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.LaunchActivity;
public final class f3 implements View.OnClickListener {
    public final int f18301a = 1;
    public final hi.d f18302b;
    public final long f18303c;
    public final TLRPC.User d;
    public final int f18304e;
    public final org.telegram.ui.ActionBar.u2 f18305f;
    public final boolean h;
    public final e6 f18306n;
    public final Object f18307r;
    public final Object f18308s;
    public final Object f18309w;

    public f3(hi.d dVar, gy0 gy0Var, np npVar, long j3, TLRPC.User user, String[] strArr, int i7, org.telegram.ui.ActionBar.u2 u2Var, boolean z10, e6 e6Var) {
        this.f18302b = dVar;
        this.f18307r = gy0Var;
        this.f18308s = npVar;
        this.f18303c = j3;
        this.d = user;
        this.f18309w = strArr;
        this.f18304e = i7;
        this.f18305f = u2Var;
        this.h = z10;
        this.f18306n = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18301a) {
            case 0:
                long[] jArr = (long[]) this.f18307r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f18308s;
                final Context context = (Context) this.f18309w;
                final hi.d dVar = this.f18302b;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i7 = this.f18304e;
                    connectstarrefbot.bot = np.s1(i7).o1(starrefprogram.bot_id);
                    connectstarrefbot.peer = np.s1(i7).j1(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    final org.telegram.ui.ActionBar.u2 u2Var = this.f18305f;
                    final long j10 = this.f18303c;
                    final boolean z10 = this.h;
                    final e6 e6Var = this.f18306n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new d3(hi.d.this, tLObject, i7, j3, u2Var, starrefprogram, j10, z10, context, e6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                gy0 gy0Var = (gy0) this.f18307r;
                z5 z5Var = gy0Var.h;
                final np npVar = (np) this.f18308s;
                String[] strArr = (String[]) this.f18309w;
                final hi.d dVar2 = this.f18302b;
                if (!dVar2.R) {
                    EditTextBoldCursor textView = z5Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(z5Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.f18303c;
                        tL_messages_editChatParticipantRank.peer = npVar.j1(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = np.n1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f18304e);
                        d3.b bVar = new d3.b(1);
                        final org.telegram.ui.ActionBar.u2 u2Var2 = this.f18305f;
                        final boolean z11 = this.h;
                        final e6 e6Var2 = this.f18306n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new s10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.u2 u2Var3 = u2Var2;
                                if (updates != null) {
                                    long j12 = user2.f28200id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    org.telegram.messenger.np npVar2 = org.telegram.messenger.np.this;
                                    npVar2.q5(-j11, str, j12);
                                    npVar2.O3(updates, false);
                                    u2Var3.dismiss();
                                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && T != null) {
                                        cc a02 = cc.a0(T);
                                        if (z11) {
                                            i10 = 2131744288;
                                        } else {
                                            i10 = 2131744287;
                                        }
                                        xb I = a02.I(2131623990, org.telegram.messenger.hd.M0(i10, null), tL_messages_editChatParticipantRank2.rank);
                                        cb cbVar = I.f41639e;
                                        if (cbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) cbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) cbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        I.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.y0.q(u2Var3.F, e6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f10 = -gy0Var.E;
                    gy0Var.E = f10;
                    org.telegram.messenger.g0.F3(f10, textView, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
                return;
        }
    }

    public f3(hi.d dVar, long[] jArr, int i7, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.u2 u2Var, long j3, boolean z10, Context context, e6 e6Var, TLRPC.User user) {
        this.f18302b = dVar;
        this.f18307r = jArr;
        this.f18304e = i7;
        this.f18308s = starrefprogram;
        this.f18305f = u2Var;
        this.f18303c = j3;
        this.h = z10;
        this.f18309w = context;
        this.f18306n = e6Var;
        this.d = user;
    }
}
