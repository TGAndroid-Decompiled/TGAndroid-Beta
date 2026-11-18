package ki;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.mp;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.LaunchActivity;
public final class a3 implements View.OnClickListener {
    public final int f18577a = 1;
    public final hi.d f18578b;
    public final long f18579c;
    public final TLRPC.User d;
    public final int f18580e;
    public final org.telegram.ui.ActionBar.x2 f18581f;
    public final boolean h;
    public final i6 f18582n;
    public final Object f18583r;
    public final Object f18584s;
    public final Object f18585w;

    public a3(hi.d dVar, ny0 ny0Var, mp mpVar, long j3, TLRPC.User user, String[] strArr, int i7, org.telegram.ui.ActionBar.x2 x2Var, boolean z10, i6 i6Var) {
        this.f18578b = dVar;
        this.f18583r = ny0Var;
        this.f18584s = mpVar;
        this.f18579c = j3;
        this.d = user;
        this.f18585w = strArr;
        this.f18580e = i7;
        this.f18581f = x2Var;
        this.h = z10;
        this.f18582n = i6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18577a) {
            case 0:
                long[] jArr = (long[]) this.f18583r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f18584s;
                final Context context = (Context) this.f18585w;
                final hi.d dVar = this.f18578b;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i7 = this.f18580e;
                    connectstarrefbot.bot = mp.u1(i7).q1(starrefprogram.bot_id);
                    connectstarrefbot.peer = mp.u1(i7).l1(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    final org.telegram.ui.ActionBar.x2 x2Var = this.f18581f;
                    final long j10 = this.f18579c;
                    final boolean z10 = this.h;
                    final i6 i6Var = this.f18582n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.g3(new y2(hi.d.this, tLObject, i7, j3, x2Var, starrefprogram, j10, z10, context, i6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                ny0 ny0Var = (ny0) this.f18583r;
                a6 a6Var = ny0Var.h;
                final mp mpVar = (mp) this.f18584s;
                String[] strArr = (String[]) this.f18585w;
                final hi.d dVar2 = this.f18578b;
                if (!dVar2.R) {
                    EditTextBoldCursor textView = a6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(a6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.f18579c;
                        tL_messages_editChatParticipantRank.peer = mpVar.l1(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = mp.p1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f18580e);
                        d3.b bVar = new d3.b(1);
                        final org.telegram.ui.ActionBar.x2 x2Var2 = this.f18581f;
                        final boolean z11 = this.h;
                        final i6 i6Var2 = this.f18582n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new q10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.x2 x2Var3 = x2Var2;
                                if (updates != null) {
                                    long j12 = user2.f28554id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    org.telegram.messenger.mp mpVar2 = org.telegram.messenger.mp.this;
                                    mpVar2.B5(-j11, str, j12);
                                    mpVar2.V3(updates, false);
                                    x2Var3.dismiss();
                                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && T != null) {
                                        lc b02 = lc.b0(T);
                                        if (z11) {
                                            i10 = 2131744053;
                                        } else {
                                            i10 = 2131744052;
                                        }
                                        gc I = b02.I(2131623990, org.telegram.messenger.gd.M0(i10, null), tL_messages_editChatParticipantRank2.rank);
                                        lb lbVar = I.f35457e;
                                        if (lbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) lbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) lbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        I.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.c0.t(x2Var3.F, i6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f10 = -ny0Var.E;
                    ny0Var.E = f10;
                    org.telegram.messenger.g0.E3(f10, textView, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    return;
                }
                return;
        }
    }

    public a3(hi.d dVar, long[] jArr, int i7, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.x2 x2Var, long j3, boolean z10, Context context, i6 i6Var, TLRPC.User user) {
        this.f18578b = dVar;
        this.f18583r = jArr;
        this.f18580e = i7;
        this.f18584s = starrefprogram;
        this.f18581f = x2Var;
        this.f18579c = j3;
        this.h = z10;
        this.f18585w = context;
        this.f18582n = i6Var;
        this.d = user;
    }
}
