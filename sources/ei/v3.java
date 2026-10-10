package ei;

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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Cells.d6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.e11;
import org.telegram.ui.LaunchActivity;
public final class v3 implements View.OnClickListener {
    public final int f9431a = 1;
    public final ci.d f9432b;
    public final long f9433c;
    public final TLRPC.User d;
    public final int f9434e;
    public final org.telegram.ui.ActionBar.f3 f9435f;
    public final boolean h;
    public final e6 f9436n;
    public final Object f9437r;
    public final Object f9438s;
    public final Object v;

    public v3(ci.d dVar, e11 e11Var, MessagesController messagesController, long j3, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, e6 e6Var) {
        this.f9432b = dVar;
        this.f9437r = e11Var;
        this.f9438s = messagesController;
        this.f9433c = j3;
        this.d = user;
        this.v = strArr;
        this.f9434e = i10;
        this.f9435f = f3Var;
        this.h = z10;
        this.f9436n = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9431a) {
            case 0:
                long[] jArr = (long[]) this.f9437r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f9438s;
                final Context context = (Context) this.v;
                final ci.d dVar = this.f9432b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.f9434e;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.f3 f3Var = this.f9435f;
                    final long j10 = this.f9433c;
                    final boolean z10 = this.h;
                    final e6 e6Var = this.f9436n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new t3(ci.d.this, tLObject, i10, j3, f3Var, starrefprogram, j10, z10, context, e6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                e11 e11Var = (e11) this.f9437r;
                d6 d6Var = e11Var.h;
                final MessagesController messagesController = (MessagesController) this.f9438s;
                String[] strArr = (String[]) this.v;
                final ci.d dVar2 = this.f9432b;
                if (!dVar2.N) {
                    EditTextBoldCursor textView = d6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(d6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.f9433c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f9434e);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.f3 f3Var2 = this.f9435f;
                        final boolean z11 = this.h;
                        final e6 e6Var2 = this.f9436n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i11;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.f3 f3Var3 = f3Var2;
                                if (updates != null) {
                                    long j12 = user2.f20189id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    MessagesController messagesController2 = MessagesController.this;
                                    messagesController2.updateRank(-j11, j12, str);
                                    messagesController2.lambda$processUpdates$377(updates, false);
                                    f3Var3.dismiss();
                                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && U != null) {
                                        ad a02 = ad.a0(U);
                                        int i12 = R.raw.contact_check;
                                        if (z11) {
                                            i11 = R.string.TagAdded;
                                        } else {
                                            i11 = R.string.TagEdited;
                                        }
                                        tc M = a02.M(LocaleController.getString(i11), tL_messages_editChatParticipantRank2.rank, i12);
                                        xb xbVar = M.f31092e;
                                        if (xbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) xbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) xbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        M.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.c1.p(f3Var3.topBulletinContainer, e6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f7 = -e11Var.f25867y;
                    e11Var.f25867y = f7;
                    AndroidUtilities.shakeViewSpring(textView, f7);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
        }
    }

    public v3(ci.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.f3 f3Var, long j3, boolean z10, Context context, e6 e6Var, TLRPC.User user) {
        this.f9432b = dVar;
        this.f9437r = jArr;
        this.f9434e = i10;
        this.f9438s = starrefprogram;
        this.f9435f = f3Var;
        this.f9433c = j3;
        this.h = z10;
        this.v = context;
        this.f9436n = e6Var;
        this.d = user;
    }
}
