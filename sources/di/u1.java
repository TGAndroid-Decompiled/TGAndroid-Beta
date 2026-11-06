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
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ww;
public final class u1 implements View.OnClickListener {
    public final int f9827a;
    public final long f9828b;
    public final Object f9829c;

    public u1(Object obj, long j3, int i7) {
        this.f9827a = i7;
        this.f9829c = obj;
        this.f9828b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f9827a) {
            case 0:
                i4 i4Var = (i4) this.f9829c;
                i4Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.f9828b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                i4Var.f9192s0.N(new ProfileActivity(bundle, null));
                return;
            case 1:
                b70 b70Var = (b70) this.f9829c;
                b70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = b70Var.f32052j1;
                ConnectionsManager.getInstance(b70Var.f28613a).sendRequestTyped(tL_messages_importChatInvite, null, new mc(b70Var, this.f9828b, tL_messages_importChatInvite), 2);
                return;
            case 2:
                ww wwVar = (ww) this.f9829c;
                qp messagesController = wwVar.getMessagesController();
                long j10 = this.f9828b;
                boolean r22 = messagesController.r2(j10, 0L, null);
                if (!r22) {
                    wwVar.getNotificationsController().T(j10, 3, 0L);
                } else {
                    wwVar.getNotificationsController().T(j10, 4, 0L);
                }
                hc.A(wwVar, !r22, null).j();
                wwVar.finishPreviewFragment();
                return;
            case 3:
                c20 c20Var = ((sh.m) this.f9829c).f55235f;
                if (c20Var != null) {
                    c20Var.a(Long.valueOf(this.f9828b));
                    return;
                }
                return;
            case 4:
                zh.m mVar = (zh.m) this.f9829c;
                mVar.getClass();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    long j11 = this.f9828b;
                    if (!t10.A(j11)) {
                        Bundle bundle2 = new Bundle();
                        if (j11 > 0) {
                            bundle2.putLong("user_id", j11);
                            if (j11 == p10.i(mVar.f28613a).e()) {
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
                Runnable runnable = mVar.f60346f2;
                if (runnable != null) {
                    runnable.run();
                }
                mVar.dismiss();
                return;
            default:
                zh.h1 h1Var = (zh.h1) this.f9829c;
                h1Var.getClass();
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    h1Var.dismiss();
                    T2.presentFragment(ProfileActivity.A4(this.f9828b));
                    return;
                }
                return;
        }
    }
}
