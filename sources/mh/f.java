package mh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.w21;
import org.telegram.ui.TwoStepVerificationActivity;
public final class f implements Runnable {
    public final int f14000a = 0;
    public final boolean f14001b;
    public final long f14002c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f14003e;
    public final Object f14004f;
    public final Object h;
    public final TLObject f14005n;

    public f(p pVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z4, long j10, TLObject tLObject) {
        this.d = pVar;
        this.f14003e = tL_error;
        this.f14004f = twoStepVerificationActivity;
        this.h = activity;
        this.f14001b = z4;
        this.f14002c = j10;
        this.f14005n = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f14000a) {
            case 0:
                p.Z((p) this.d, (TLRPC.TL_error) this.f14003e, (TwoStepVerificationActivity) this.f14004f, (Activity) this.h, this.f14001b, this.f14002c, this.f14005n);
                return;
            default:
                final w21 w21Var = (w21) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f14003e;
                final q70 q70Var = (q70) this.f14004f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f14005n;
                boolean z4 = this.f14001b;
                final boolean z10 = !z4;
                g1Var.setVisibility(0);
                if (!z4) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                g1Var.setText(LocaleController.getString(i10));
                final long j10 = this.f14002c;
                g1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        w21 w21Var2 = w21.this;
                        int i11 = w21Var2.f32620b;
                        q70Var.u();
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

    public f(w21 w21Var, boolean z4, org.telegram.ui.ActionBar.g1 g1Var, q70 q70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = w21Var;
        this.f14001b = z4;
        this.f14003e = g1Var;
        this.f14004f = q70Var;
        this.f14002c = j10;
        this.h = user;
        this.f14005n = chat;
    }
}
