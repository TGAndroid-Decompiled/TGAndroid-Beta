package gh;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.t70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gy;

public final class o implements View.OnClickListener {

    public final int f7473a;

    public final long f7474b;

    public final Object f7475c;

    public o(Object obj, long j10, int i10) {
        this.f7473a = i10;
        this.f7475c = obj;
        this.f7474b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f7473a) {
            case 0:
                v.P((v) this.f7475c, this.f7474b);
                break;
            case 1:
                k2 k2Var = (k2) this.f7475c;
                k2Var.getClass();
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    k2Var.dismiss();
                    n2VarU.presentFragment(ProfileActivity.m4(this.f7474b));
                    break;
                }
                break;
            case 2:
                jh.e4 e4Var = (jh.e4) this.f7475c;
                e4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f7474b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                e4Var.F0.H(new ProfileActivity(bundle, null));
                break;
            case 3:
                t70.r((t70) this.f7475c, this.f7474b);
                break;
            case 4:
                gy gyVar = (gy) this.f7475c;
                MessagesController messagesController = gyVar.getMessagesController();
                long j11 = this.f7474b;
                boolean zIsDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (zIsDialogMuted) {
                    gyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                } else {
                    gyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                }
                mc.A(gyVar, !zIsDialogMuted, null).j();
                gyVar.finishPreviewFragment();
                break;
            default:
                Utilities.Callback callback = ((zg.q) this.f7475c).f50853f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f7474b));
                }
                break;
        }
    }
}
