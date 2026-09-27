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
import org.telegram.ui.Components.n01;
import org.telegram.ui.LaunchActivity;
public final class v3 implements View.OnClickListener {
    public final int f8665a = 1;
    public final ci.d f8666b;
    public final long f8667c;
    public final TLRPC.User d;
    public final int e;
    public final org.telegram.ui.ActionBar.g3 f8668f;
    public final boolean h;
    public final e6 f8669n;
    public final Object f8670r;
    public final Object f8671s;
    public final Object v;

    public v3(ci.d dVar, n01 n01Var, MessagesController messagesController, long j3, TLRPC.User user, String[] strArr, int i10, org.telegram.ui.ActionBar.g3 g3Var, boolean z10, e6 e6Var) {
        this.f8666b = dVar;
        this.f8670r = n01Var;
        this.f8671s = messagesController;
        this.f8667c = j3;
        this.d = user;
        this.v = strArr;
        this.e = i10;
        this.f8668f = g3Var;
        this.h = z10;
        this.f8669n = e6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8665a) {
            case 0:
                long[] jArr = (long[]) this.f8670r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f8671s;
                final Context context = (Context) this.v;
                final ci.d dVar = this.f8666b;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    final long j3 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i10 = this.e;
                    connectstarrefbot.bot = MessagesController.getInstance(i10).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i10).getInputPeer(j3);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
                    final org.telegram.ui.ActionBar.g3 g3Var = this.f8668f;
                    final long j10 = this.f8667c;
                    final boolean z10 = this.h;
                    final e6 e6Var = this.f8669n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new t3(ci.d.this, tLObject, i10, j3, g3Var, starrefprogram, j10, z10, context, e6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                n01 n01Var = (n01) this.f8670r;
                d6 d6Var = n01Var.h;
                final MessagesController messagesController = (MessagesController) this.f8671s;
                String[] strArr = (String[]) this.v;
                final ci.d dVar2 = this.f8666b;
                if (!dVar2.N) {
                    EditTextBoldCursor textView = d6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(d6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j11 = this.f8667c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j11);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.e);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.g3 g3Var2 = this.f8668f;
                        final boolean z11 = this.h;
                        final e6 e6Var2 = this.f8669n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i11;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.g3 g3Var3 = g3Var2;
                                if (updates != null) {
                                    long j12 = user2.f18476id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    MessagesController messagesController2 = MessagesController.this;
                                    messagesController2.updateRank(-j11, j12, str);
                                    messagesController2.processUpdates(updates, false);
                                    g3Var3.dismiss();
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
                                    org.telegram.ui.Cells.c1.s(g3Var3.topBulletinContainer, e6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f7 = -n01Var.f26687y;
                    n01Var.f26687y = f7;
                    AndroidUtilities.shakeViewSpring(textView, f7);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
        }
    }

    public v3(ci.d dVar, long[] jArr, int i10, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.g3 g3Var, long j3, boolean z10, Context context, e6 e6Var, TLRPC.User user) {
        this.f8666b = dVar;
        this.f8670r = jArr;
        this.e = i10;
        this.f8671s = starrefprogram;
        this.f8668f = g3Var;
        this.f8667c = j3;
        this.h = z10;
        this.v = context;
        this.f8669n = e6Var;
        this.d = user;
    }
}
