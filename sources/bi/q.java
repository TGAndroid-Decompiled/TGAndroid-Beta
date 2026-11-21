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
import org.telegram.ui.Components.r70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cx;
public final class q implements View.OnClickListener {
    public final int f4010a;
    public final long f4011b;
    public final Object f4012c;

    public q(Object obj, long j3, int i7) {
        this.f4010a = i7;
        this.f4012c = obj;
        this.f4011b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4010a) {
            case 0:
                y yVar = (y) this.f4012c;
                yVar.getClass();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.f4011b;
                    if (!o10.B(j3)) {
                        Bundle bundle = new Bundle();
                        if (j3 > 0) {
                            bundle.putLong("user_id", j3);
                            if (j3 == j10.i(yVar.f30170a).e()) {
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
                Runnable runnable = yVar.f4265j2;
                if (runnable != null) {
                    runnable.run();
                }
                yVar.dismiss();
                return;
            case 1:
                n3 n3Var = (n3) this.f4012c;
                n3Var.getClass();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    n3Var.dismiss();
                    T2.presentFragment(ProfileActivity.D4(this.f4011b));
                    return;
                }
                return;
            case 2:
                fi.z3 z3Var = (fi.z3) this.f4012c;
                z3Var.getClass();
                Bundle bundle2 = new Bundle();
                long j10 = this.f4011b;
                if (j10 >= 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                z3Var.f12913t0.N(new ProfileActivity(bundle2, null));
                return;
            case 3:
                r70 r70Var = (r70) this.f4012c;
                r70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = r70Var.n1;
                ConnectionsManager.getInstance(r70Var.f30170a).sendRequestTyped(tL_messages_importChatInvite, null, new f8(r70Var, this.f4011b, tL_messages_importChatInvite), 2);
                return;
            case 4:
                cx cxVar = (cx) this.f4012c;
                mp messagesController = cxVar.getMessagesController();
                long j11 = this.f4011b;
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
                x10 x10Var = ((sh.m) this.f4012c).f57507f;
                if (x10Var != null) {
                    x10Var.a(Long.valueOf(this.f4011b));
                    return;
                }
                return;
        }
    }
}
