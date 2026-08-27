package nh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.LaunchActivity;

public final class j3 implements View.OnClickListener {

    public final int f18775a = 1;

    public final lh.d f18776b;

    public final long f18777c;
    public final TLRPC.User d;

    public final int f18778e;

    public final org.telegram.ui.ActionBar.e3 f18779f;
    public final boolean h;

    public final c6 f18780n;

    public final Object f18781r;

    public final Object f18782s;
    public final Object v;

    public j3(lh.d dVar, kz0 kz0Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, c6 c6Var) {
        this.f18776b = dVar;
        this.f18781r = kz0Var;
        this.f18782s = messagesController;
        this.f18777c = j10;
        this.d = user;
        this.v = strArr;
        this.f18778e = i10;
        this.f18779f = e3Var;
        this.h = z10;
        this.f18780n = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f18775a) {
            case 0:
                long[] jArr = (long[]) this.f18781r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f18782s;
                final Context context = (Context) this.v;
                final lh.d dVar = this.f18776b;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    final long j10 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.f18778e;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.e3 e3Var = this.f18779f;
                    final long j11 = this.f18777c;
                    final boolean z10 = this.h;
                    final c6 c6Var = this.f18780n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new h3(dVar, tLObject, i10, j10, e3Var, starrefprogram, j11, z10, context, c6Var, user, tL_error));
                        }
                    });
                    break;
                }
                break;
            default:
                kz0 kz0Var = (kz0) this.f18781r;
                z5 z5Var = kz0Var.h;
                final MessagesController messagesController = (MessagesController) this.f18782s;
                String[] strArr = (String[]) this.v;
                final lh.d dVar2 = this.f18776b;
                if (!dVar2.J) {
                    EditTextBoldCursor textView = z5Var.getTextView();
                    if (textView.getText().toString().trim().length() > 16) {
                        float f10 = -kz0Var.f30237y;
                        kz0Var.f30237y = f10;
                        AndroidUtilities.shakeViewSpring(textView, f10);
                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    } else {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(z5Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j12 = this.f18777c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j12);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f18778e);
                        org.telegram.messenger.a aVar = new org.telegram.messenger.a();
                        final org.telegram.ui.ActionBar.e3 e3Var2 = this.f18779f;
                        final boolean z11 = this.h;
                        final c6 c6Var2 = this.f18780n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, aVar, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj, Object obj2) {
                                TLRPC.Updates updates = (TLRPC.Updates) obj;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                org.telegram.ui.ActionBar.e3 e3Var3 = e3Var2;
                                if (updates == null) {
                                    if (tL_error != null) {
                                        org.telegram.ui.Cells.pa.t(e3Var3.topBulletinContainer, c6Var2, tL_error, false);
                                        dVar2.setLoading(false);
                                        return;
                                    }
                                    return;
                                }
                                long j13 = -j12;
                                long j14 = user2.f22527id;
                                TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                String str = tL_messages_editChatParticipantRank2.rank;
                                MessagesController messagesController2 = messagesController;
                                messagesController2.updateRank(j13, j14, str);
                                messagesController2.processUpdates(updates, false);
                                e3Var3.dismiss();
                                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                                if (TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) || n2VarU == null) {
                                    return;
                                }
                                ec ecVarM = mc.a0(n2VarU).M(LocaleController.getString(z11 ? R.string.TagAdded : R.string.TagEdited), tL_messages_editChatParticipantRank2.rank, R.raw.contact_check);
                                jb jbVar = ecVarM.f28016e;
                                if (jbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                    ((FrameLayout.LayoutParams) jbVar.getLayoutParams()).width = -2;
                                    ((FrameLayout.LayoutParams) jbVar.getLayoutParams()).gravity |= 1;
                                }
                                ecVarM.j();
                            }
                        });
                    }
                    break;
                }
                break;
        }
    }

    public j3(lh.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.e3 e3Var, long j10, boolean z10, Context context, c6 c6Var, TLRPC.User user) {
        this.f18776b = dVar;
        this.f18781r = jArr;
        this.f18778e = i10;
        this.f18782s = starrefprogram;
        this.f18779f = e3Var;
        this.f18777c = j10;
        this.h = z10;
        this.v = context;
        this.f18780n = c6Var;
        this.d = user;
    }
}
