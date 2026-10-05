package ai;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uy;
public final class a3 implements View.OnClickListener {
    public final int f554a;
    public final long f555b;
    public final Object f556c;

    public a3(Object obj, long j3, int i10) {
        this.f554a = i10;
        this.f556c = obj;
        this.f555b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f554a) {
            case 0:
                e6 e6Var = (e6) this.f556c;
                e6Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.f555b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                e6Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                u80.q((u80) this.f556c, this.f555b);
                return;
            case 2:
                uy uyVar = (uy) this.f556c;
                MessagesController messagesController = uyVar.getMessagesController();
                long j10 = this.f555b;
                boolean isDialogMuted = messagesController.isDialogMuted(j10, 0L);
                if (!isDialogMuted) {
                    uyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 3);
                } else {
                    uyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 4);
                }
                yc.A(uyVar, !isDialogMuted, null).j();
                uyVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((qh.p) this.f556c).f45510f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f555b));
                    return;
                }
                return;
            case 4:
                xh.m.N((xh.m) this.f556c, this.f555b);
                return;
            default:
                xh.q1 q1Var = (xh.q1) this.f556c;
                q1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    q1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f555b));
                    return;
                }
                return;
        }
    }
}
