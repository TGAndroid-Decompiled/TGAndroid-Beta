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
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.v31;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j implements Runnable {
    public final int f1516a = 0;
    public final boolean f1517b;
    public final long f1518c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f1519f;
    public final Object h;
    public final TLObject f1520n;

    public j(x xVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        this.d = xVar;
        this.e = tL_error;
        this.f1519f = twoStepVerificationActivity;
        this.h = activity;
        this.f1517b = z10;
        this.f1518c = j10;
        this.f1520n = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f1516a) {
            case 0:
                x.Z((x) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f1519f, (Activity) this.h, this.f1517b, this.f1518c, this.f1520n);
                return;
            default:
                final v31 v31Var = (v31) this.d;
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.e;
                final h80 h80Var = (h80) this.f1519f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f1520n;
                boolean z10 = this.f1517b;
                final boolean z11 = !z10;
                e1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                e1Var.setText(LocaleController.getString(i10));
                final long j10 = this.f1518c;
                e1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        v31 v31Var2 = v31.this;
                        int i11 = v31Var2.f31298b;
                        h80Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new x1(v31Var2, 15));
                    }
                });
                return;
        }
    }

    public j(v31 v31Var, boolean z10, org.telegram.ui.ActionBar.e1 e1Var, h80 h80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = v31Var;
        this.f1517b = z10;
        this.e = e1Var;
        this.f1519f = h80Var;
        this.f1518c = j10;
        this.h = user;
        this.f1520n = chat;
    }
}
