package hi;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.i11;
import org.telegram.ui.LaunchActivity;
public final class u3 implements View.OnClickListener {
    public final int f13317a = 1;
    public final fi.d f13318b;
    public final long f13319c;
    public final TLRPC.User d;
    public final int e;
    public final org.telegram.ui.ActionBar.k3 f13320f;
    public final boolean h;
    public final u6 f13321n;
    public final Object f13322r;
    public final Object f13323s;
    public final Object v;

    public u3(fi.d dVar, i11 i11Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.k3 k3Var, boolean z10, u6 u6Var) {
        this.f13318b = dVar;
        this.f13322r = i11Var;
        this.f13323s = messagesController;
        this.f13319c = j10;
        this.d = user;
        this.v = strArr;
        this.e = i10;
        this.f13320f = k3Var;
        this.h = z10;
        this.f13321n = u6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f13317a) {
            case 0:
                long[] jArr = (long[]) this.f13322r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f13323s;
                final Context context = (Context) this.v;
                final fi.d dVar = this.f13318b;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    final long j10 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.e;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.k3 k3Var = this.f13320f;
                    final long j11 = this.f13319c;
                    final boolean z10 = this.h;
                    final u6 u6Var = this.f13321n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new s3(fi.d.this, tLObject, i10, j10, k3Var, starrefprogram, j11, z10, context, u6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                i11 i11Var = (i11) this.f13322r;
                h6 h6Var = i11Var.h;
                final MessagesController messagesController = (MessagesController) this.f13323s;
                String[] strArr = (String[]) this.v;
                final fi.d dVar2 = this.f13318b;
                if (!dVar2.Q) {
                    EditTextBoldCursor textView = h6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(h6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j12 = this.f13319c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j12);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.k3 k3Var2 = this.f13320f;
                        final boolean z11 = this.h;
                        final u6 u6Var2 = this.f13321n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i11;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.k3 k3Var3 = k3Var2;
                                if (updates != null) {
                                    long j13 = user2.f22174id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    MessagesController messagesController2 = MessagesController.this;
                                    messagesController2.updateRank(-j12, j13, str);
                                    messagesController2.lambda$processUpdates$379(updates, false);
                                    k3Var3.dismiss();
                                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && U != null) {
                                        wc b02 = wc.b0(U);
                                        int i12 = R.raw.contact_check;
                                        if (z11) {
                                            i11 = R.string.TagAdded;
                                        } else {
                                            i11 = R.string.TagEdited;
                                        }
                                        qc M = b02.M(LocaleController.getString(i11), tL_messages_editChatParticipantRank2.rank, i12);
                                        ub ubVar = M.e;
                                        if (ubVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) ubVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) ubVar.getLayoutParams()).gravity |= 1;
                                        }
                                        M.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.d3.t(k3Var3.topBulletinContainer, u6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f7 = -i11Var.f29149y;
                    i11Var.f29149y = f7;
                    AndroidUtilities.shakeViewSpring(textView, f7);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
        }
    }

    public u3(fi.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.k3 k3Var, long j10, boolean z10, Context context, u6 u6Var, TLRPC.User user) {
        this.f13318b = dVar;
        this.f13322r = jArr;
        this.e = i10;
        this.f13323s = starrefprogram;
        this.f13320f = k3Var;
        this.f13319c = j10;
        this.h = z10;
        this.v = context;
        this.f13321n = u6Var;
        this.d = user;
    }
}
