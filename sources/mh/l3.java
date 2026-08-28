package mh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Cells.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.LaunchActivity;
public final class l3 implements View.OnClickListener {
    public final int f17961a = 1;
    public final kh.d f17962b;
    public final long f17963c;
    public final TLRPC.User d;
    public final int f17964e;
    public final org.telegram.ui.ActionBar.f3 f17965f;
    public final boolean h;
    public final b6 f17966n;
    public final Object f17967r;
    public final Object f17968s;
    public final Object v;

    public l3(kh.d dVar, iz0 iz0Var, MessagesController messagesController, long j10, TLRPC.User user, String[] strArr, int i9, org.telegram.ui.ActionBar.f3 f3Var, boolean z10, b6 b6Var) {
        this.f17962b = dVar;
        this.f17967r = iz0Var;
        this.f17968s = messagesController;
        this.f17963c = j10;
        this.d = user;
        this.v = strArr;
        this.f17964e = i9;
        this.f17965f = f3Var;
        this.h = z10;
        this.f17966n = b6Var;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17961a) {
            case 0:
                long[] jArr = (long[]) this.f17967r;
                final TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) this.f17968s;
                final Context context = (Context) this.v;
                final kh.d dVar = this.f17962b;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    final long j10 = jArr[0];
                    TL_payments.connectStarRefBot connectstarrefbot = new TL_payments.connectStarRefBot();
                    final int i9 = this.f17964e;
                    connectstarrefbot.bot = MessagesController.getInstance(i9).getInputUser(starrefprogram.bot_id);
                    connectstarrefbot.peer = MessagesController.getInstance(i9).getInputPeer(j10);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i9);
                    final org.telegram.ui.ActionBar.f3 f3Var = this.f17965f;
                    final long j11 = this.f17963c;
                    final boolean z10 = this.h;
                    final b6 b6Var = this.f17966n;
                    final TLRPC.User user = this.d;
                    connectionsManager.sendRequest(connectstarrefbot, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            AndroidUtilities.runOnUIThread(new i3(kh.d.this, tLObject, i9, j10, f3Var, starrefprogram, j11, z10, context, b6Var, user, tL_error));
                        }
                    });
                    return;
                }
                return;
            default:
                iz0 iz0Var = (iz0) this.f17967r;
                c6 c6Var = iz0Var.h;
                final MessagesController messagesController = (MessagesController) this.f17968s;
                String[] strArr = (String[]) this.v;
                final kh.d dVar2 = this.f17962b;
                if (!dVar2.J) {
                    EditTextBoldCursor textView = c6Var.getTextView();
                    if (textView.getText().toString().trim().length() <= 16) {
                        dVar2.setLoading(true);
                        AndroidUtilities.hideKeyboard(c6Var);
                        final TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank = new TLRPC.TL_messages_editChatParticipantRank();
                        final long j12 = this.f17963c;
                        tL_messages_editChatParticipantRank.peer = messagesController.getInputPeer(j12);
                        final TLRPC.User user2 = this.d;
                        tL_messages_editChatParticipantRank.participant = MessagesController.getInputPeer(user2);
                        tL_messages_editChatParticipantRank.rank = strArr[0];
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(this.f17964e);
                        ?? obj = new Object();
                        final org.telegram.ui.ActionBar.f3 f3Var2 = this.f17965f;
                        final boolean z11 = this.h;
                        final b6 b6Var2 = this.f17966n;
                        connectionsManager2.sendRequestTyped(tL_messages_editChatParticipantRank, obj, new Utilities.Callback2() {
                            @Override
                            public final void run(Object obj2, Object obj3) {
                                int i10;
                                TLRPC.Updates updates = (TLRPC.Updates) obj2;
                                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj3;
                                org.telegram.ui.ActionBar.f3 f3Var3 = f3Var2;
                                if (updates != null) {
                                    long j13 = user2.f22527id;
                                    TLRPC.TL_messages_editChatParticipantRank tL_messages_editChatParticipantRank2 = tL_messages_editChatParticipantRank;
                                    String str = tL_messages_editChatParticipantRank2.rank;
                                    MessagesController messagesController2 = MessagesController.this;
                                    messagesController2.updateRank(-j12, j13, str);
                                    messagesController2.processUpdates(updates, false);
                                    f3Var3.dismiss();
                                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                                    if (!TextUtils.isEmpty(tL_messages_editChatParticipantRank2.rank) && U != null) {
                                        oc a02 = oc.a0(U);
                                        int i11 = R.raw.contact_check;
                                        if (z11) {
                                            i10 = R.string.TagAdded;
                                        } else {
                                            i10 = R.string.TagEdited;
                                        }
                                        gc M = a02.M(LocaleController.getString(i10), tL_messages_editChatParticipantRank2.rank, i11);
                                        lb lbVar = M.f28733e;
                                        if (lbVar.getLayoutParams() instanceof FrameLayout.LayoutParams) {
                                            ((FrameLayout.LayoutParams) lbVar.getLayoutParams()).width = -2;
                                            ((FrameLayout.LayoutParams) lbVar.getLayoutParams()).gravity |= 1;
                                        }
                                        M.j();
                                    }
                                } else if (tL_error != null) {
                                    org.telegram.ui.Cells.j2.s(f3Var3.topBulletinContainer, b6Var2, tL_error, false);
                                    dVar2.setLoading(false);
                                }
                            }
                        });
                        return;
                    }
                    float f10 = -iz0Var.f29558y;
                    iz0Var.f29558y = f10;
                    AndroidUtilities.shakeViewSpring(textView, f10);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                return;
        }
    }

    public l3(kh.d dVar, long[] jArr, int i9, TL_payments.starRefProgram starrefprogram, org.telegram.ui.ActionBar.f3 f3Var, long j10, boolean z10, Context context, b6 b6Var, TLRPC.User user) {
        this.f17962b = dVar;
        this.f17967r = jArr;
        this.f17964e = i9;
        this.f17968s = starrefprogram;
        this.f17965f = f3Var;
        this.f17963c = j10;
        this.h = z10;
        this.v = context;
        this.f17966n = b6Var;
        this.d = user;
    }
}
