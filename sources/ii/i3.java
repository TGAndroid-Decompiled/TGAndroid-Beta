package ii;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.hp;
import org.telegram.messenger.n10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.LaunchActivity;
public final class i3 implements View.OnClickListener {
    public final int f15007a = 1;
    public final gi.d f15008b;
    public final long f15009c;
    public final TLRPC.User d;
    public final int f15010e;
    public final org.telegram.ui.ActionBar.t2 f15011f;
    public final boolean h;
    public final e6 f15012n;
    public final Object f15013r;
    public final Object f15014s;
    public final Object f15015w;

    public i3(gi.d dVar, dy0 dy0Var, hp hpVar, long j10, TLRPC.User user, String[] strArr, int i3, org.telegram.ui.ActionBar.t2 t2Var, boolean z10, e6 e6Var) {
        this.f15008b = dVar;
        this.f15013r = dy0Var;
        this.f15014s = hpVar;
        this.f15009c = j10;
        this.d = user;
        this.f15015w = strArr;
        this.f15010e = i3;
        this.f15011f = t2Var;
        this.h = z10;
        this.f15012n = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f15007a) {
            case 0:
                long[] jArr = (long[]) this.f15013r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f15014s;
                final Context context = (Context) this.f15015w;
                final gi.d dVar = this.f15008b;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    final long j10 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i3 = this.f15010e;
                    connectstarrefbot.bot = hp.s1(i3).o1(starrefprogram.bot_id);
                    connectstarrefbot.peer = hp.s1(i3).j1(j10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i3);
                    final org.telegram.ui.ActionBar.t2 t2Var = this.f15011f;
                    final long j11 = this.f15009c;
                    final boolean z10 = this.h;
                    final e6 e6Var = this.f15012n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            org.telegram.messenger.g0.h3(new g3(gi.d.this, tLObject, i3, j10, t2Var, starrefprogram, j11, z10, context, e6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                dy0 dy0Var = (dy0) this.f15013r;
                z5 z5Var = dy0Var.h;
                final hp hpVar = (hp) this.f15014s;
                String[] strArr = (String[]) this.f15015w;
                final gi.d dVar2 = this.f15008b;
                if (!dVar2.R) {
                    EditTextBoldCursor textView = z5Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        org.telegram.messenger.g0.v1(z5Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j12 = this.f15009c;
                        tL_messages_editChatParticipantRank.peer = hpVar.j1(j12);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = hp.n1(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f15010e);
                        c3.b bVar = new c3.b(1);
                        final org.telegram.ui.ActionBar.t2 t2Var2 = this.f15011f;
                        final boolean z11 = this.h;
                        final e6 e6Var2 = this.f15012n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, bVar, new n10() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.t2 t2Var3 = t2Var2;
                                if (updates != null) {
                                    long j13 = user2.f27150id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    org.telegram.messenger.hp hpVar2 = org.telegram.messenger.hp.this;
                                    hpVar2.p5(-j12, str, j13);
                                    hpVar2.O3(updates, false);
                                    t2Var3.dismiss();
                                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && T != null) {
                                        fc a02 = fc.a0(T);
                                        if (z11) {
                                            i10 = 2131744298;
                                        } else {
                                            i10 = 2131744297;
                                        }
                                        ac I = a02.I(2131623989, org.telegram.messenger.bd.M0(i10, null), tL_messages_editChatParticipantRank2.rank);
                                        fb fbVar = I.f31788e;
                                        if (fbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) fbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) fbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        I.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.f1.v(t2Var3.F, e6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f10 = -dy0Var.E;
                    dy0Var.E = f10;
                    org.telegram.messenger.g0.G3(f10, textView, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                }
                return;
        }
    }

    public i3(gi.d dVar, long[] jArr, int i3, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.t2 t2Var, long j10, boolean z10, Context context, e6 e6Var, TLRPC.User user) {
        this.f15008b = dVar;
        this.f15013r = jArr;
        this.f15010e = i3;
        this.f15014s = starrefprogram;
        this.f15011f = t2Var;
        this.f15009c = j10;
        this.h = z10;
        this.f15015w = context;
        this.f15012n = e6Var;
        this.d = user;
    }
}
