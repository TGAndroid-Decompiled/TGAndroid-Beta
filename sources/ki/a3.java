package ki;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.mp;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.a6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.LaunchActivity;
public final class a3 implements View.OnClickListener {
    public final int f18665a = 1;
    public final hi.e f18666b;
    public final long f18667c;
    public final TLRPC.User d;
    public final int f18668e;
    public final org.telegram.ui.ActionBar.w2 f18669f;
    public final boolean h;
    public final i6 f18670n;
    public final Object f18671r;
    public final Object f18672s;
    public final Object f18673w;

    public a3(hi.e eVar, oy0 oy0Var, mp mpVar, long j3, TLRPC.User user, String[] strArr, int i7, org.telegram.ui.ActionBar.w2 w2Var, boolean z10, i6 i6Var) {
        this.f18666b = eVar;
        this.f18671r = oy0Var;
        this.f18672s = mpVar;
        this.f18667c = j3;
        this.d = user;
        this.f18673w = strArr;
        this.f18668e = i7;
        this.f18669f = w2Var;
        this.h = z10;
        this.f18670n = i6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18665a) {
            case 0:
                long[] jArr = (long[]) this.f18671r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f18672s;
                final Context context = (Context) this.f18673w;
                final hi.e eVar = this.f18666b;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i7 = this.f18668e;
                    connectstarrefbot.bot = mp.u1(i7).q1(starrefprogram.bot_id);
                    connectstarrefbot.peer = mp.u1(i7).l1(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i7);
                    final org.telegram.ui.ActionBar.w2 w2Var = this.f18669f;
                    final long j10 = this.f18667c;
                    final boolean z10 = this.h;
                    final i6 i6Var = this.f18670n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.g3(new y2(hi.e.this, tLObject, i7, j3, w2Var, starrefprogram, j10, z10, context, i6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                oy0 oy0Var = (oy0) this.f18671r;
                a6 a6Var = oy0Var.h;
                final mp mpVar = (mp) this.f18672s;
                String[] strArr = (String[]) this.f18673w;
                final hi.e eVar2 = this.f18666b;
                if (!eVar2.R) {
                    EditTextBoldCursor textView = a6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        eVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(a6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.f18667c;
                        tL_messages_editChatParticipantRank.peer = mpVar.l1(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = mp.p1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f18668e);
                        d3.b bVar = new d3.b(1);
                        final org.telegram.ui.ActionBar.w2 w2Var2 = this.f18669f;
                        final boolean z11 = this.h;
                        final i6 i6Var2 = this.f18670n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new p10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.w2 w2Var3 = w2Var2;
                                if (updates != null) {
                                    long j12 = user2.f28641id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    org.telegram.messenger.mp mpVar2 = org.telegram.messenger.mp.this;
                                    mpVar2.B5(-j11, str, j12);
                                    mpVar2.V3(updates, false);
                                    w2Var3.dismiss();
                                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && T != null) {
                                        kc b02 = kc.b0(T);
                                        if (z11) {
                                            i10 = 2131744043;
                                        } else {
                                            i10 = 2131744042;
                                        }
                                        fc I = b02.I(2131623990, org.telegram.messenger.gd.N0(i10, null), tL_messages_editChatParticipantRank2.rank);
                                        kb kbVar = I.f35087e;
                                        if (kbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) kbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) kbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        I.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.c0.t(w2Var3.F, i6Var2, tL_error, false);
                                    eVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f10 = -oy0Var.E;
                    oy0Var.E = f10;
                    org.telegram.messenger.g0.E3(f10, textView, null);
                    org.telegram.messenger.q2.APP_ERROR.a();
                    return;
                }
                return;
        }
    }

    public a3(hi.e eVar, long[] jArr, int i7, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.w2 w2Var, long j3, boolean z10, Context context, i6 i6Var, TLRPC.User user) {
        this.f18666b = eVar;
        this.f18671r = jArr;
        this.f18668e = i7;
        this.f18672s = starrefprogram;
        this.f18669f = w2Var;
        this.f18667c = j3;
        this.h = z10;
        this.f18673w = context;
        this.f18670n = i6Var;
        this.d = user;
    }
}
