package ai;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.r31;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j implements Runnable {
    public final int f1529a = 0;
    public final boolean f1530b;
    public final long f1531c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f1532f;
    public final Object h;
    public final TLObject f1533n;

    public j(x xVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        this.d = xVar;
        this.e = tL_error;
        this.f1532f = twoStepVerificationActivity;
        this.h = activity;
        this.f1530b = z10;
        this.f1531c = j10;
        this.f1533n = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f1529a) {
            case 0:
                x.Z((x) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f1532f, (Activity) this.h, this.f1530b, this.f1531c, this.f1533n);
                return;
            default:
                final r31 r31Var = (r31) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                final i80 i80Var = (i80) this.f1532f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f1533n;
                boolean z10 = this.f1530b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                e1Var.setText(LocaleController.getString(i10));
                final long j10 = this.f1531c;
                e1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        r31 r31Var2 = r31.this;
                        int i11 = r31Var2.f29816b;
                        i80Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new y1(r31Var2, 15));
                    }
                });
                return;
        }
    }

    public j(r31 r31Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, i80 i80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = r31Var;
        this.f1530b = z10;
        this.e = e1Var;
        this.f1532f = i80Var;
        this.f1531c = j10;
        this.h = user;
        this.f1533n = chat;
    }
}
