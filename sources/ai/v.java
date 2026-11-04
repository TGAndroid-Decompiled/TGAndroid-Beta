package ai;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uw;
public final class v implements View.OnClickListener {
    public final int f1027a;
    public final long f1028b;
    public final Object f1029c;

    public v(Object obj, long j10, int i3) {
        this.f1027a = i3;
        this.f1029c = obj;
        this.f1028b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1027a) {
            case 0:
                e0 e0Var = (e0) this.f1029c;
                e0Var.getClass();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    long j10 = this.f1028b;
                    if (!l10.A(j10)) {
                        Bundle bundle = new Bundle();
                        if (j10 > 0) {
                            bundle.putLong("user_id", j10);
                            if (j10 == h10.i(e0Var.f28583a).e()) {
                                bundle.putBoolean("my_profile", true);
                            }
                        } else {
                            bundle.putLong("chat_id", -j10);
                        }
                        bundle.putBoolean("open_gifts", true);
                        T.presentFragment(new ProfileActivity(bundle, null));
                    } else {
                        return;
                    }
                }
                Runnable runnable = e0Var.f601g2;
                if (runnable != null) {
                    runnable.run();
                }
                e0Var.dismiss();
                return;
            case 1:
                b3 b3Var = (b3) this.f1029c;
                b3Var.getClass();
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    b3Var.dismiss();
                    T2.presentFragment(ProfileActivity.A4(this.f1028b));
                    return;
                }
                return;
            case 2:
                ei.j4 j4Var = (ei.j4) this.f1029c;
                j4Var.getClass();
                Bundle bundle2 = new Bundle();
                long j11 = this.f1028b;
                if (j11 >= 0) {
                    bundle2.putLong("user_id", j11);
                } else {
                    bundle2.putLong("chat_id", -j11);
                }
                j4Var.f10506t0.V(new ProfileActivity(bundle2, null));
                return;
            case 3:
                x60 x60Var = (x60) this.f1029c;
                x60Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = x60Var.k1;
                ConnectionsManager.getInstance(x60Var.f28583a).sendRequestTyped(tL_messages_importChatInvite, null, new d6(x60Var, this.f1028b, tL_messages_importChatInvite), 2);
                return;
            case 4:
                uw uwVar = (uw) this.f1029c;
                hp messagesController = uwVar.getMessagesController();
                long j12 = this.f1028b;
                boolean r22 = messagesController.r2(j12, 0L, null);
                if (!r22) {
                    uwVar.getNotificationsController().T(j12, 3, 0L);
                } else {
                    uwVar.getNotificationsController().T(j12, 4, 0L);
                }
                fc.A(uwVar, !r22, null).j();
                uwVar.finishPreviewFragment();
                return;
            default:
                u10 u10Var = ((th.m) this.f1029c).f55433f;
                if (u10Var != null) {
                    u10Var.a(Long.valueOf(this.f1028b));
                    return;
                }
                return;
        }
    }
}
