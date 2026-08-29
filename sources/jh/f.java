package jh;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.m21;
import org.telegram.ui.TwoStepVerificationActivity;
public final class f implements Runnable {
    public final int f12037a = 0;
    public final boolean f12038b;
    public final long f12039c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f12040e;
    public final Object f12041f;
    public final Object h;
    public final TLObject f12042n;

    public f(q qVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        this.d = qVar;
        this.f12040e = tL_error;
        this.f12041f = twoStepVerificationActivity;
        this.h = activity;
        this.f12038b = z10;
        this.f12039c = j10;
        this.f12042n = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f12037a) {
            case 0:
                q.Z((q) this.d, (TLRPC.TL_error) this.f12040e, (TwoStepVerificationActivity) this.f12041f, (Activity) this.h, this.f12038b, this.f12039c, this.f12042n);
                return;
            default:
                final m21 m21Var = (m21) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.f12040e;
                final j70 j70Var = (j70) this.f12041f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f12042n;
                boolean z10 = this.f12038b;
                final boolean z11 = !z10;
                g1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                g1Var.setText(LocaleController.getString(i10));
                final long j10 = this.f12039c;
                g1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        m21 m21Var2 = m21.this;
                        int i11 = m21Var2.f30552b;
                        j70Var.u();
                        boolean z12 = z11;
                        TLRPC.User user2 = user;
                        if (!z12) {
                            MessagesController.getInstance(i11).deleteParticipantFromChat(j10, user2, (TLRPC.Chat) null, false, false);
                            return;
                        }
                        TLRPC.TL_channels_editBanned tL_channels_editBanned = new TLRPC.TL_channels_editBanned();
                        tL_channels_editBanned.participant = MessagesController.getInputPeer(user2);
                        tL_channels_editBanned.channel = MessagesController.getInputChannel(chat);
                        tL_channels_editBanned.banned_rights = new TLRPC.TL_chatBannedRights();
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new a2(m21Var2, 15));
                    }
                });
                return;
        }
    }

    public f(m21 m21Var, boolean z10, org.telegram.ui.ActionBar.g1 g1Var, j70 j70Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = m21Var;
        this.f12038b = z10;
        this.f12040e = g1Var;
        this.f12041f = j70Var;
        this.f12039c = j10;
        this.h = user;
        this.f12042n = chat;
    }
}
