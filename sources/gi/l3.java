package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a11;
import org.telegram.ui.LaunchActivity;
public final class l3 implements View.OnClickListener {
    public final int f11345a = 1;
    public final ei.d f11346b;
    public final long f11347c;
    public final TLRPC.User d;
    public final int e;
    public final org.telegram.ui.ActionBar.h3 f11348f;
    public final boolean h;
    public final g6 f11349n;
    public final Object f11350r;
    public final Object f11351s;
    public final Object v;

    public l3(ei.d dVar, a11 a11Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.h3 h3Var, boolean z10, g6 g6Var) {
        this.f11346b = dVar;
        this.f11350r = a11Var;
        this.f11351s = messagesController;
        this.f11347c = j10;
        this.d = user;
        this.v = strArr;
        this.e = i10;
        this.f11348f = h3Var;
        this.h = z10;
        this.f11349n = g6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11345a) {
            case 0:
                long[] jArr = (long[]) this.f11350r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f11351s;
                final Context context = (Context) this.v;
                final ei.d dVar = this.f11346b;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    final long j10 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.e;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.h3 h3Var = this.f11348f;
                    final long j11 = this.f11347c;
                    final boolean z10 = this.h;
                    final g6 g6Var = this.f11349n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new j3(ei.d.this, tLObject, i10, j10, h3Var, starrefprogram, j11, z10, context, g6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                a11 a11Var = (a11) this.f11350r;
                d6 d6Var = a11Var.h;
                final MessagesController messagesController = (MessagesController) this.f11351s;
                String[] strArr = (String[]) this.v;
                final ei.d dVar2 = this.f11346b;
                if (!dVar2.Q) {
                    EditTextBoldCursor textView = d6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(d6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j12 = this.f11347c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j12);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.h3 h3Var2 = this.f11348f;
                        final boolean z11 = this.h;
                        final g6 g6Var2 = this.f11349n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i11;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.h3 h3Var3 = h3Var2;
                                if (updates != null) {
                                    long j13 = user2.f20490id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    MessagesController messagesController2 = MessagesController.this;
                                    messagesController2.updateRank(-j12, j13, str);
                                    messagesController2.lambda$processUpdates$377(updates, false);
                                    h3Var3.dismiss();
                                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && U != null) {
                                        xc a02 = xc.a0(U);
                                        int i12 = R.raw.contact_check;
                                        if (z11) {
                                            i11 = R.string.TagAdded;
                                        } else {
                                            i11 = R.string.TagEdited;
                                        }
                                        qc M = a02.M(LocaleController.getString(i11), tL_messages_editChatParticipantRank2.rank, i12);
                                        ub ubVar = M.e;
                                        if (ubVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) ubVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) ubVar.getLayoutParams()).gravity |= 1;
                                        }
                                        M.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.b1.s(h3Var3.topBulletinContainer, g6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f7 = -a11Var.f24603y;
                    a11Var.f24603y = f7;
                    AndroidUtilities.shakeViewSpring(textView, f7);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
        }
    }

    public l3(ei.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.h3 h3Var, long j10, boolean z10, Context context, g6 g6Var, TLRPC.User user) {
        this.f11346b = dVar;
        this.f11350r = jArr;
        this.e = i10;
        this.f11351s = starrefprogram;
        this.f11348f = h3Var;
        this.f11347c = j10;
        this.h = z10;
        this.v = context;
        this.f11349n = g6Var;
        this.d = user;
    }
}
