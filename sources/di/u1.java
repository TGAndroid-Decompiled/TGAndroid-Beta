package di;

import android.os.Bundle;
import android.view.View;
import bi.mc;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.gc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.zw;
public final class u1 implements View.OnClickListener {
    public final int f9824a;
    public final long f9825b;
    public final Object f9826c;

    public u1(Object obj, long j3, int i7) {
        this.f9824a = i7;
        this.f9826c = obj;
        this.f9825b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9824a) {
            case 0:
                j4 j4Var = (j4) this.f9826c;
                j4Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.f9825b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                j4Var.f9229s0.N(new ProfileActivity(bundle, null));
                return;
            case 1:
                b70 b70Var = (b70) this.f9826c;
                b70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = b70Var.f32132m1;
                ConnectionsManager.getInstance(b70Var.f28669a).sendRequestTyped(tL_messages_importChatInvite, null, new mc(b70Var, this.f9825b, tL_messages_importChatInvite), 2);
                return;
            case 2:
                zw zwVar = (zw) this.f9826c;
                qp messagesController = zwVar.getMessagesController();
                long j10 = this.f9825b;
                boolean r22 = messagesController.r2(j10, 0L, null);
                if (!r22) {
                    zwVar.getNotificationsController().T(j10, 3, 0L);
                } else {
                    zwVar.getNotificationsController().T(j10, 4, 0L);
                }
                gc.A(zwVar, !r22, null).j();
                zwVar.finishPreviewFragment();
                return;
            case 3:
                c20 c20Var = ((sh.n) this.f9826c).f55339f;
                if (c20Var != null) {
                    c20Var.a(Long.valueOf(this.f9825b));
                    return;
                }
                return;
            case 4:
                zh.l lVar = (zh.l) this.f9826c;
                lVar.getClass();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    long j11 = this.f9825b;
                    if (!t10.A(j11)) {
                        Bundle bundle2 = new Bundle();
                        if (j11 > 0) {
                            bundle2.putLong("user_id", j11);
                            if (j11 == p10.i(lVar.f28669a).e()) {
                                bundle2.putBoolean("my_profile", true);
                            }
                        } else {
                            bundle2.putLong("chat_id", -j11);
                        }
                        bundle2.putBoolean("open_gifts", true);
                        T.presentFragment(new ProfileActivity(bundle2, null));
                    } else {
                        return;
                    }
                }
                Runnable runnable = lVar.f60440i2;
                if (runnable != null) {
                    runnable.run();
                }
                lVar.dismiss();
                return;
            default:
                zh.g1 g1Var = (zh.g1) this.f9826c;
                g1Var.getClass();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    g1Var.dismiss();
                    T2.presentFragment(ProfileActivity.D4(this.f9825b));
                    return;
                }
                return;
        }
    }
}
