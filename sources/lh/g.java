package lh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.w21;
import org.telegram.ui.TwoStepVerificationActivity;
public final class g implements Runnable {
    public final int f12448a = 0;
    public final boolean f12449b;
    public final long f12450c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f12451f;
    public final Object h;
    public final TLObject f12452n;

    public g(q qVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z4, long j10, TLObject tLObject) {
        this.d = qVar;
        this.e = tL_error;
        this.f12451f = twoStepVerificationActivity;
        this.h = activity;
        this.f12449b = z4;
        this.f12450c = j10;
        this.f12452n = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f12448a) {
            case 0:
                q.Z((q) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f12451f, (Activity) this.h, this.f12449b, this.f12450c, this.f12452n);
                return;
            default:
                final w21 w21Var = (w21) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                final o70 o70Var = (o70) this.f12451f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f12452n;
                boolean z4 = this.f12449b;
                final boolean z10 = !z4;
                g1Var.setVisibility(0);
                if (!z4) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                g1Var.setText(LocaleController.getString(i10));
                final long j10 = this.f12450c;
                g1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        w21 w21Var2 = w21.this;
                        int i11 = w21Var2.f30174b;
                        o70Var.u();
                        boolean z11 = z10;
                        TLRPC.User user2 = user;
                        if (!z11) {
                            MessagesController.getInstance(i11).deleteParticipantFromChat(j10, user2, (TLRPC.Chat) null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = MessagesController.getInputPeer(user2);
                        tL_channels_editBanned.channel = MessagesController.getInputChannel(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(w21Var2, 15));
                    }
                });
                return;
        }
    }

    public g(w21 w21Var, boolean z4, org.telegram.ui.ActionBar.g1 g1Var, o70 o70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = w21Var;
        this.f12449b = z4;
        this.e = g1Var;
        this.f12451f = o70Var;
        this.f12450c = j10;
        this.h = user;
        this.f12452n = chat;
    }
}
