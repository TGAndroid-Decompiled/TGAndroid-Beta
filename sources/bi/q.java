package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cx;
public final class q implements View.OnClickListener {
    public final int f3980a;
    public final long f3981b;
    public final Object f3982c;

    public q(Object obj, long j3, int i7) {
        this.f3980a = i7;
        this.f3982c = obj;
        this.f3981b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3980a) {
            case 0:
                y yVar = (y) this.f3982c;
                yVar.getClass();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.f3981b;
                    if (!o10.B(j3)) {
                        Bundle bundle = new Bundle();
                        if (j3 > 0) {
                            bundle.putLong("user_id", j3);
                            if (j3 == j10.i(yVar.f30189a).e()) {
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
                Runnable runnable = yVar.f4233j2;
                if (runnable != null) {
                    runnable.run();
                }
                yVar.dismiss();
                return;
            case 1:
                j3 j3Var = (j3) this.f3982c;
                j3Var.getClass();
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    j3Var.dismiss();
                    T2.presentFragment(ProfileActivity.D4(this.f3981b));
                    return;
                }
                return;
            case 2:
                fi.z3 z3Var = (fi.z3) this.f3982c;
                z3Var.getClass();
                Bundle bundle2 = new Bundle();
                long j10 = this.f3981b;
                if (j10 >= 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                z3Var.f12875t0.N(new ProfileActivity(bundle2, null));
                return;
            case 3:
                p70 p70Var = (p70) this.f3982c;
                p70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = p70Var.n1;
                ConnectionsManager.getInstance(p70Var.f30189a).sendRequestTyped(tL_messages_importChatInvite, null, new c8(p70Var, this.f3981b, tL_messages_importChatInvite), 2);
                return;
            case 4:
                cx cxVar = (cx) this.f3982c;
                mp messagesController = cxVar.getMessagesController();
                long j11 = this.f3981b;
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
                x10 x10Var = ((sh.n) this.f3982c).f57468f;
                if (x10Var != null) {
                    x10Var.a(Long.valueOf(this.f3981b));
                    return;
                }
                return;
        }
    }
}
