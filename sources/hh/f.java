package hh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.d21;
import org.telegram.ui.TwoStepVerificationActivity;

public final class f implements Runnable {

    public final int f9233a = 0;

    public final boolean f9234b;

    public final long f9235c;
    public final NotificationCenter.NotificationCenterDelegate d;

    public final Object f9236e;

    public final Object f9237f;
    public final Object h;

    public final TLObject f9238n;

    public f(r rVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        this.d = rVar;
        this.f9236e = tL_error;
        this.f9237f = twoStepVerificationActivity;
        this.h = activity;
        this.f9234b = z10;
        this.f9235c = j10;
        this.f9238n = tLObject;
    }

    @Override
    public final void run() {
        switch (this.f9233a) {
            case 0:
                r.Z((r) this.d, (TLRPC.TL_error) this.f9236e, (TwoStepVerificationActivity) this.f9237f, (Activity) this.h, this.f9234b, this.f9235c, this.f9238n);
                break;
            default:
                final d21 d21Var = (d21) this.d;
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.f9236e;
                final b70 b70Var = (b70) this.f9237f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f9238n;
                boolean z10 = this.f9234b;
                final boolean z11 = !z10;
                f1Var.setVisibility(0);
                f1Var.setText(LocaleController.getString(!z10 ? R.string.UnbanUserMonoforum : R.string.BanUserMonoforum));
                final long j10 = this.f9235c;
                f1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        d21 d21Var2 = d21Var;
                        int i10 = d21Var2.f27625b;
                        b70Var.u();
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
                        ConnectionsManager.getInstance(i10).sendRequest(tL_channels_editBanned, new w1(d21Var2, 15));
                    }
                });
                break;
        }
    }

    public f(d21 d21Var, boolean z10, org.telegram.ui.ActionBar.f1 f1Var, b70 b70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = d21Var;
        this.f9234b = z10;
        this.f9236e = f1Var;
        this.f9237f = b70Var;
        this.f9235c = j10;
        this.h = user;
        this.f9238n = chat;
    }
}
