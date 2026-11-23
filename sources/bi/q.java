package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.p10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.r70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cx;
public final class q implements View.OnClickListener {
    public final int f4018a;
    public final long f4019b;
    public final Object f4020c;

    public q(Object obj, long j3, int i7) {
        this.f4018a = i7;
        this.f4020c = obj;
        this.f4019b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4018a) {
            case 0:
                y yVar = (y) this.f4020c;
                yVar.getClass();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.f4019b;
                    if (!p10.B(j3)) {
                        Bundle bundle = new Bundle();
                        if (j3 > 0) {
                            bundle.putLong("user_id", j3);
                            if (j3 == k10.i(yVar.f30173a).e()) {
                                bundle.putBoolean("my_profile", true);
                            }
                        } else {
                            bundle.putLong("chat_id", -j3);
                        }
                        bundle.putBoolean("open_gifts", true);
                        T.presentFragment(new ProfileActivity(bundle, null));
                    } else {
                        return;
                    }
                }
                Runnable runnable = yVar.f4286j2;
                if (runnable != null) {
                    runnable.run();
                }
                yVar.dismiss();
                return;
            case 1:
                n3 n3Var = (n3) this.f4020c;
                n3Var.getClass();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    n3Var.dismiss();
                    T2.presentFragment(ProfileActivity.D4(this.f4019b));
                    return;
                }
                return;
            case 2:
                fi.z3 z3Var = (fi.z3) this.f4020c;
                z3Var.getClass();
                Bundle bundle2 = new Bundle();
                long j10 = this.f4019b;
                if (j10 >= 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                z3Var.f12916t0.N(new ProfileActivity(bundle2, null));
                return;
            case 3:
                r70 r70Var = (r70) this.f4020c;
                r70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = r70Var.n1;
                ConnectionsManager.getInstance(r70Var.f30173a).sendRequestTyped(tL_messages_importChatInvite, null, new e8(r70Var, this.f4019b, tL_messages_importChatInvite), 2);
                return;
            case 4:
                cx cxVar = (cx) this.f4020c;
                np messagesController = cxVar.getMessagesController();
                long j11 = this.f4019b;
                boolean u22 = messagesController.u2(j11, 0L, null);
                if (!u22) {
                    cxVar.getNotificationsController().T(j11, 3, 0L);
                } else {
                    cxVar.getNotificationsController().T(j11, 4, 0L);
                }
                lc.A(cxVar, !u22, null).j();
                cxVar.finishPreviewFragment();
                return;
            default:
                y10 y10Var = ((sh.m) this.f4020c).f57511f;
                if (y10Var != null) {
                    y10Var.a(Long.valueOf(this.f4019b));
                    return;
                }
                return;
        }
    }
}
