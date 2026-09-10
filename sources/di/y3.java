package di;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.e6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.n01;
import org.telegram.ui.LaunchActivity;
public final class y3 implements View.OnClickListener {
    public final int f7032a = 1;
    public final bi.d f7033b;
    public final long f7034c;
    public final TLRPC.User d;
    public final int e;
    public final org.telegram.ui.ActionBar.h3 f7035f;
    public final boolean h;
    public final f6 f7036n;
    public final Object f7037r;
    public final Object f7038s;
    public final Object v;

    public y3(bi.d dVar, n01 n01Var, MessagesController messagesController, long j3, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.h3 h3Var, boolean z10, f6 f6Var) {
        this.f7033b = dVar;
        this.f7037r = n01Var;
        this.f7038s = messagesController;
        this.f7034c = j3;
        this.d = user;
        this.v = strArr;
        this.e = i10;
        this.f7035f = h3Var;
        this.h = z10;
        this.f7036n = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7032a) {
            case 0:
                long[] jArr = (long[]) this.f7037r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f7038s;
                final Context context = (Context) this.v;
                final bi.d dVar = this.f7033b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.e;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.h3 h3Var = this.f7035f;
                    final long j10 = this.f7034c;
                    final boolean z10 = this.h;
                    final f6 f6Var = this.f7036n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new w3(bi.d.this, tLObject, i10, j3, h3Var, starrefprogram, j10, z10, context, f6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                n01 n01Var = (n01) this.f7037r;
                e6 e6Var = n01Var.h;
                final MessagesController messagesController = (MessagesController) this.f7038s;
                String[] strArr = (String[]) this.v;
                final bi.d dVar2 = this.f7033b;
                if (!dVar2.N) {
                    EditTextBoldCursor textView = e6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(e6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.f7034c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.h3 h3Var2 = this.f7035f;
                        final boolean z11 = this.h;
                        final f6 f6Var2 = this.f7036n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i11;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.h3 h3Var3 = h3Var2;
                                if (updates != null) {
                                    long j12 = user2.f17342id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    MessagesController messagesController2 = MessagesController.this;
                                    messagesController2.updateRank(-j11, j12, str);
                                    messagesController2.processUpdates(updates, false);
                                    h3Var3.dismiss();
                                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && U != null) {
                                        wc a02 = wc.a0(U);
                                        int i12 = R.raw.contact_check;
                                        if (z11) {
                                            i11 = R.string.TagAdded;
                                        } else {
                                            i11 = R.string.TagEdited;
                                        }
                                        pc M = a02.M(LocaleController.getString(i11), tL_messages_editChatParticipantRank2.rank, i12);
                                        tb tbVar = M.e;
                                        if (tbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) tbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) tbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        M.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.r6.q(h3Var3.topBulletinContainer, f6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f7 = -n01Var.f25363y;
                    n01Var.f25363y = f7;
                    AndroidUtilities.shakeViewSpring(textView, f7);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
        }
    }

    public y3(bi.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.h3 h3Var, long j3, boolean z10, Context context, f6 f6Var, TLRPC.User user) {
        this.f7033b = dVar;
        this.f7037r = jArr;
        this.e = i10;
        this.f7038s = starrefprogram;
        this.f7035f = h3Var;
        this.f7034c = j3;
        this.h = z10;
        this.v = context;
        this.f7036n = f6Var;
        this.d = user;
    }
}
