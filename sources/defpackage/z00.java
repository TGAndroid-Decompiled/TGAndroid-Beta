package defpackage;

import android.os.Bundle;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
public final class z00 implements Runnable {
    public final byte a;
    public final j20 b;
    public final r47 c;

    public z00(j20 j20Var, r47 r47Var, byte b) {
        this.a = b;
        this.b = j20Var;
        this.c = r47Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        r47 r47Var = this.c;
        j20 j20Var = this.b;
        switch (b) {
            case 0:
                pc7 pc7Var = j20Var.p2;
                if (pc7Var != null) {
                    TLRPC.Document a = pc7Var.a();
                    pc7Var.c.remove(r47Var);
                    if (pc7Var.a() != a) {
                        pc7Var.e();
                    }
                    if (j20Var.p2.c.isEmpty()) {
                        MediaController.z().k();
                        j20Var.dismiss();
                        return;
                    }
                    jn7.f(j20Var.a).k(248, j20Var.p2);
                    return;
                }
                return;
            default:
                LaunchActivity launchActivity = j20Var.z2;
                int i = yac.t0;
                int i2 = j20Var.a;
                if (i != i2) {
                    launchActivity.N0(i2);
                }
                Bundle bundle = new Bundle();
                long B0 = r47.B0(r47Var.k);
                if (wf3.B(B0)) {
                    bundle.putInt("enc_id", (int) (B0 & 4294967295L));
                } else if (wf3.D(B0)) {
                    bundle.putLong("user_id", B0);
                } else {
                    TLRPC.Chat M0 = uc7.s1(j20Var.a).M0(Long.valueOf(-B0));
                    if (M0 != null && M0.migrated_to != null) {
                        bundle.putLong("migrated_to", B0);
                        B0 = -M0.migrated_to.channel_id;
                    }
                    bundle.putLong("chat_id", -B0);
                }
                bundle.putInt("message_id", r47Var.e1());
                jn7.f(j20Var.a).k(4, new Object[0]);
                launchActivity.u0(new zu1(bundle), false, false);
                j20Var.dismiss();
                return;
        }
    }
}
