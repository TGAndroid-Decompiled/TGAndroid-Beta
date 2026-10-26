package bi;

import android.app.Activity;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e41;
import org.telegram.ui.Components.k80;
import org.telegram.ui.TwoStepVerificationActivity;
public final class l implements Runnable {
    public final int f4997a = 0;
    public final boolean f4998b;
    public final long f4999c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f5000f;
    public final Object h;
    public final TLObject f5001n;

    public l(y yVar, TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, Activity activity, boolean z10, long j10, TLObject tLObject) {
        this.d = yVar;
        this.e = tL_error;
        this.f5000f = twoStepVerificationActivity;
        this.h = activity;
        this.f4998b = z10;
        this.f4999c = j10;
        this.f5001n = tLObject;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f4997a) {
            case 0:
                y.Z((y) this.d, (TLRPC.TL_error) this.e, (TwoStepVerificationActivity) this.f5000f, (Activity) this.h, this.f4998b, this.f4999c, this.f5001n);
                return;
            default:
                final e41 e41Var = (e41) this.d;
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.e;
                final k80 k80Var = (k80) this.f5000f;
                final TLRPC.User user = (TLRPC.User) this.h;
                final TLRPC.Chat chat = (TLRPC.Chat) this.f5001n;
                boolean z10 = this.f4998b;
                final boolean z11 = !z10;
                g1Var.setVisibility(0);
                if (!z10) {
                    i10 = R.string.UnbanUserMonoforum;
                } else {
                    i10 = R.string.BanUserMonoforum;
                }
                g1Var.setText(LocaleController.getString(i10));
                final long j10 = this.f4999c;
                g1Var.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        e41 e41Var2 = e41.this;
                        int i11 = e41Var2.f27727b;
                        k80Var.u();
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
                        ConnectionsManager.getInstance(i11).sendRequest(tL_channels_editBanned, new b2(e41Var2, 15));
                    }
                });
                return;
        }
    }

    public l(e41 e41Var, boolean z10, org.telegram.ui.ActionBar.g1 g1Var, k80 k80Var, long j10, TLRPC.User user, TLRPC.Chat chat) {
        this.d = e41Var;
        this.f4998b = z10;
        this.e = g1Var;
        this.f5000f = k80Var;
        this.f4999c = j10;
        this.h = user;
        this.f5001n = chat;
    }
}
