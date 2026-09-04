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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a01;
import org.telegram.ui.LaunchActivity;
public final class v3 implements View.OnClickListener {
    public final int f10031a = 1;
    public final di.d f10032b;
    public final long f10033c;
    public final TLRPC.User d;
    public final int f10034e;
    public final org.telegram.ui.ActionBar.f3 f10035f;
    public final boolean h;
    public final f6 f10036n;
    public final Object f10037r;
    public final Object f10038s;
    public final Object v;

    public v3(di.d dVar, a01 a01Var, MessagesController messagesController, long j3, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, f6 f6Var) {
        this.f10032b = dVar;
        this.f10037r = a01Var;
        this.f10038s = messagesController;
        this.f10033c = j3;
        this.d = user;
        this.v = strArr;
        this.f10034e = i10;
        this.f10035f = f3Var;
        this.h = z10;
        this.f10036n = f6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f10031a) {
            case 0:
                long[] jArr = (long[]) this.f10037r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f10038s;
                final Context context = (Context) this.v;
                final di.d dVar = this.f10032b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.f10034e;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.f3 f3Var = this.f10035f;
                    final long j10 = this.f10033c;
                    final boolean z10 = this.h;
                    final f6 f6Var = this.f10036n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new t3(di.d.this, tLObject, i10, j3, f3Var, starrefprogram, j10, z10, context, f6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                a01 a01Var = (a01) this.f10037r;
                c6 c6Var = a01Var.h;
                final MessagesController messagesController = (MessagesController) this.f10038s;
                String[] strArr = (String[]) this.v;
                final di.d dVar2 = this.f10032b;
                if (!dVar2.N) {
                    EditTextBoldCursor textView = c6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(c6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.f10033c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f10034e);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.f3 f3Var2 = this.f10035f;
                        final boolean z11 = this.h;
                        final f6 f6Var2 = this.f10036n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i11;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.f3 f3Var3 = f3Var2;
                                if (updates != null) {
                                    long j12 = user2.f20016id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    MessagesController messagesController2 = MessagesController.this;
                                    messagesController2.updateRank(-j11, j12, str);
                                    messagesController2.processUpdates(updates, false);
                                    f3Var3.dismiss();
                                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && U != null) {
                                        yc a02 = yc.a0(U);
                                        int i12 = R.raw.contact_check;
                                        if (z11) {
                                            i11 = R.string.TagAdded;
                                        } else {
                                            i11 = R.string.TagEdited;
                                        }
                                        qc M = a02.M(LocaleController.getString(i11), tL_messages_editChatParticipantRank2.rank, i12);
                                        ub ubVar = M.f29675e;
                                        if (ubVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) ubVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) ubVar.getLayoutParams()).gravity |= 1;
                                        }
                                        M.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.p6.q(f3Var3.topBulletinContainer, f6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f7 = -a01Var.f24211y;
                    a01Var.f24211y = f7;
                    AndroidUtilities.shakeViewSpring(textView, f7);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
        }
    }

    public v3(di.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.f3 f3Var, long j3, boolean z10, Context context, f6 f6Var, TLRPC.User user) {
        this.f10032b = dVar;
        this.f10037r = jArr;
        this.f10034e = i10;
        this.f10038s = starrefprogram;
        this.f10035f = f3Var;
        this.f10033c = j3;
        this.h = z10;
        this.v = context;
        this.f10036n = f6Var;
        this.d = user;
    }
}
