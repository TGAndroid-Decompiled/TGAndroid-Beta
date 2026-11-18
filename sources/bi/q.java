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
    public final int f3956a;
    public final long f3957b;
    public final Object f3958c;

    public q(Object obj, long j3, int i7) {
        this.f3956a = i7;
        this.f3958c = obj;
        this.f3957b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3956a) {
            case 0:
                y yVar = (y) this.f3958c;
                yVar.getClass();
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.f3957b;
                    if (!o10.B(j3)) {
                        Bundle bundle = new Bundle();
                        if (j3 > 0) {
                            bundle.putLong("user_id", j3);
                            if (j3 == j10.i(yVar.f30187a).e()) {
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
                Runnable runnable = yVar.f4201j2;
                if (runnable != null) {
                    runnable.run();
                }
                yVar.dismiss();
                return;
            case 1:
                j3 j3Var = (j3) this.f3958c;
                j3Var.getClass();
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    j3Var.dismiss();
                    T2.presentFragment(ProfileActivity.D4(this.f3957b));
                    return;
                }
                return;
            case 2:
                fi.z3 z3Var = (fi.z3) this.f3958c;
                z3Var.getClass();
                Bundle bundle2 = new Bundle();
                long j10 = this.f3957b;
                if (j10 >= 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                z3Var.f12872t0.N(new ProfileActivity(bundle2, null));
                return;
            case 3:
                p70 p70Var = (p70) this.f3958c;
                p70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = p70Var.n1;
                ConnectionsManager.getInstance(p70Var.f30187a).sendRequestTyped(tL_messages_importChatInvite, null, new b8(p70Var, this.f3957b, tL_messages_importChatInvite), 2);
                return;
            case 4:
                cx cxVar = (cx) this.f3958c;
                mp messagesController = cxVar.getMessagesController();
                long j11 = this.f3957b;
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
                x10 x10Var = ((sh.n) this.f3958c).f57468f;
                if (x10Var != null) {
                    x10Var.a(Long.valueOf(this.f3957b));
                    return;
                }
                return;
        }
    }
}
