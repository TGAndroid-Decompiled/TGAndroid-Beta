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
import org.telegram.ui.Components.c70;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yw;
public final class u1 implements View.OnClickListener {
    public final int f9819a;
    public final long f9820b;
    public final Object f9821c;

    public u1(Object obj, long j3, int i7) {
        this.f9819a = i7;
        this.f9821c = obj;
        this.f9820b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9819a) {
            case 0:
                j4 j4Var = (j4) this.f9821c;
                j4Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.f9820b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                j4Var.f9224s0.N(new ProfileActivity(bundle, null));
                return;
            case 1:
                c70 c70Var = (c70) this.f9821c;
                c70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = c70Var.f32557j1;
                ConnectionsManager.getInstance(c70Var.f28621a).sendRequestTyped(tL_messages_importChatInvite, null, new mc(c70Var, this.f9820b, tL_messages_importChatInvite), 2);
                return;
            case 2:
                yw ywVar = (yw) this.f9821c;
                qp messagesController = ywVar.getMessagesController();
                long j10 = this.f9820b;
                boolean r22 = messagesController.r2(j10, 0L, null);
                if (!r22) {
                    ywVar.getNotificationsController().T(j10, 3, 0L);
                } else {
                    ywVar.getNotificationsController().T(j10, 4, 0L);
                }
                hc.A(ywVar, !r22, null).j();
                ywVar.finishPreviewFragment();
                return;
            case 3:
                c20 c20Var = ((sh.n) this.f9821c).f55340f;
                if (c20Var != null) {
                    c20Var.a(Long.valueOf(this.f9820b));
                    return;
                }
                return;
            case 4:
                zh.l lVar = (zh.l) this.f9821c;
                lVar.getClass();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    long j11 = this.f9820b;
                    if (!t10.A(j11)) {
                        Bundle bundle2 = new Bundle();
                        if (j11 > 0) {
                            bundle2.putLong("user_id", j11);
                            if (j11 == p10.i(lVar.f28621a).e()) {
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
                Runnable runnable = lVar.f60435f2;
                if (runnable != null) {
                    runnable.run();
                }
                lVar.dismiss();
                return;
            default:
                zh.g1 g1Var = (zh.g1) this.f9821c;
                g1Var.getClass();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    g1Var.dismiss();
                    T2.presentFragment(ProfileActivity.D4(this.f9820b));
                    return;
                }
                return;
        }
    }
}
