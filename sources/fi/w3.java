package fi;

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
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.z01;
import org.telegram.ui.LaunchActivity;
public final class w3 implements View.OnClickListener {
    public final int f9639a = 1;
    public final di.d f9640b;
    public final long f9641c;
    public final TLRPC.User d;
    public final int e;
    public final org.telegram.ui.ActionBar.e3 f9642f;
    public final boolean h;
    public final c6 f9643n;
    public final Object f9644r;
    public final Object f9645s;
    public final Object v;

    public w3(di.d dVar, z01 z01Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.e3 e3Var, boolean z10, c6 c6Var) {
        this.f9640b = dVar;
        this.f9644r = z01Var;
        this.f9645s = messagesController;
        this.f9641c = j10;
        this.d = user;
        this.v = strArr;
        this.e = i10;
        this.f9642f = e3Var;
        this.h = z10;
        this.f9643n = c6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9639a) {
            case 0:
                long[] jArr = (long[]) this.f9644r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f9645s;
                final Context context = (Context) this.v;
                final di.d dVar = this.f9640b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    final long j10 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.e;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.e3 e3Var = this.f9642f;
                    final long j11 = this.f9641c;
                    final boolean z10 = this.h;
                    final c6 c6Var = this.f9643n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new u3(di.d.this, tLObject, i10, j10, e3Var, starrefprogram, j11, z10, context, c6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                z01 z01Var = (z01) this.f9644r;
                d6 d6Var = z01Var.h;
                final MessagesController messagesController = (MessagesController) this.f9645s;
                String[] strArr = (String[]) this.v;
                final di.d dVar2 = this.f9640b;
                if (!dVar2.N) {
                    EditTextBoldCursor textView = d6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(d6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j12 = this.f9641c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j12);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.e3 e3Var2 = this.f9642f;
                        final boolean z11 = this.h;
                        final c6 c6Var2 = this.f9643n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i11;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.e3 e3Var3 = e3Var2;
                                if (updates != null) {
                                    long j13 = user2.f19363id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    MessagesController messagesController2 = MessagesController.this;
                                    messagesController2.updateRank(-j12, j13, str);
                                    messagesController2.lambda$processUpdates$377(updates, false);
                                    e3Var3.dismiss();
                                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && U != null) {
                                        zc a02 = zc.a0(U);
                                        int i12 = R.raw.contact_check;
                                        if (z11) {
                                            i11 = R.string.TagAdded;
                                        } else {
                                            i11 = R.string.TagEdited;
                                        }
                                        sc M = a02.M(LocaleController.getString(i11), tL_messages_editChatParticipantRank2.rank, i12);
                                        wb wbVar = M.e;
                                        if (wbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) wbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) wbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        M.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.d0.r(e3Var3.topBulletinContainer, c6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f7 = -z01Var.f31727y;
                    z01Var.f31727y = f7;
                    AndroidUtilities.shakeViewSpring(textView, f7);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
        }
    }

    public w3(di.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.e3 e3Var, long j10, boolean z10, Context context, c6 c6Var, TLRPC.User user) {
        this.f9640b = dVar;
        this.f9644r = jArr;
        this.e = i10;
        this.f9645s = starrefprogram;
        this.f9642f = e3Var;
        this.f9641c = j10;
        this.h = z10;
        this.v = context;
        this.f9643n = c6Var;
        this.d = user;
    }
}
