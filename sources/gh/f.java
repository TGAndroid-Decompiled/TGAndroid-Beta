package gh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b21;
import org.telegram.ui.Components.x60;
import org.telegram.ui.TwoStepVerificationActivity;
public final class f implements Runnable {
    public final int f8042a = 0;
    public final boolean f8043b;
    public final long f8044c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f8045e;
    public final Object f8046f;
    public final Object h;
    public final TLObject f8047n;

    public f(r rVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        this.d = rVar;
        this.f8045e = tL_error;
        this.f8046f = twoStepVerificationActivity;
        this.h = activity;
        this.f8043b = z10;
        this.f8044c = j10;
        this.f8047n = tLObject;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f8042a) {
            case 0:
                r.Y((r) this.d, (TLRPC.TL_error) this.f8045e, (TwoStepVerificationActivity) this.f8046f, (Activity) this.h, this.f8043b, this.f8044c, this.f8047n);
                return;
            default:
                final b21 b21Var = (b21) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f8045e;
                final x60 x60Var = (x60) this.f8046f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f8047n;
                boolean z10 = this.f8043b;
                final boolean z11 = !z10;
                g1Var.setVisibility(0);
                if (!z10) {
                    i9 = R.string.UnbanUserMonoforum;
                } else {
                    i9 = R.string.BanUserMonoforum;
                }
                g1Var.setText(LocaleController.getString(i9));
                final long j10 = this.f8044c;
                g1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        b21 b21Var2 = b21.this;
                        int i10 = b21Var2.f27001b;
                        x60Var.u();
                        boolean z12 = z11;
                        TLRPC.User user2 = user;
                        if (!z12) {
                            MessagesController.getInstance(i10).deleteParticipantFromChat(j10, user2, (TLRPC.Chat) null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = MessagesController.getInputPeer(user2);
                        tL_channels_editBanned.channel = MessagesController.getInputChannel(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_editBanned, new w1(b21Var2, 15));
                    }
                });
                return;
        }
    }

    public f(b21 b21Var, boolean z10, org.telegram.ui.ActionBar.g1 g1Var, x60 x60Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = b21Var;
        this.f8043b = z10;
        this.f8045e = g1Var;
        this.f8046f = x60Var;
        this.f8044c = j10;
        this.h = user;
        this.f8047n = chat;
    }
}
