package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yw;
public final class q implements View.OnClickListener {
    public final int f3793a;
    public final long f3794b;
    public final Object f3795c;

    public q(Object obj, long j3, int i7) {
        this.f3793a = i7;
        this.f3795c = obj;
        this.f3794b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3793a) {
            case 0:
                y yVar = (y) this.f3795c;
                yVar.getClass();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.f3794b;
                    if (!q10.A(j3)) {
                        Bundle bundle = new Bundle();
                        if (j3 > 0) {
                            bundle.putLong("user_id", j3);
                            if (j3 == m10.i(yVar.f29679a).e()) {
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
                Runnable runnable = yVar.f3993j2;
                if (runnable != null) {
                    runnable.run();
                }
                yVar.dismiss();
                return;
            case 1:
                s2 s2Var = (s2) this.f3795c;
                s2Var.getClass();
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    s2Var.dismiss();
                    T2.presentFragment(ProfileActivity.C4(this.f3794b));
                    return;
                }
                return;
            case 2:
                fi.b4 b4Var = (fi.b4) this.f3795c;
                b4Var.getClass();
                Bundle bundle2 = new Bundle();
                long j10 = this.f3794b;
                if (j10 >= 0) {
                    bundle2.putLong("user_id", j10);
                } else {
                    bundle2.putLong("chat_id", -j10);
                }
                b4Var.f11522t0.N(new ProfileActivity(bundle2, null));
                return;
            case 3:
                e70 e70Var = (e70) this.f3795c;
                e70Var.dismiss();
                TLRPC.TL_messages_importChatInvite tL_messages_importChatInvite = new TLRPC.TL_messages_importChatInvite();
                tL_messages_importChatInvite.hash = e70Var.n1;
                ConnectionsManager.getInstance(e70Var.f29679a).sendRequestTyped(tL_messages_importChatInvite, null, new v5(e70Var, this.f3794b, tL_messages_importChatInvite), 2);
                return;
            case 4:
                yw ywVar = (yw) this.f3795c;
                np messagesController = ywVar.getMessagesController();
                long j11 = this.f3794b;
                boolean r22 = messagesController.r2(j11, 0L, null);
                if (!r22) {
                    ywVar.getNotificationsController().T(j11, 3, 0L);
                } else {
                    ywVar.getNotificationsController().T(j11, 4, 0L);
                }
                cc.A(ywVar, !r22, null).j();
                ywVar.finishPreviewFragment();
                return;
            default:
                z10 z10Var = ((sh.m) this.f3795c).f56892f;
                if (z10Var != null) {
                    z10Var.a(Long.valueOf(this.f3794b));
                    return;
                }
                return;
        }
    }
}
