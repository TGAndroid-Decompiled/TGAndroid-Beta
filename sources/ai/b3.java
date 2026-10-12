package ai;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.vy;
public final class b3 implements View.OnClickListener {
    public final int f699a;
    public final long f700b;
    public final Object f701c;

    public b3(Object obj, long j3, int i10) {
        this.f699a = i10;
        this.f701c = obj;
        this.f700b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f699a) {
            case 0:
                f6 f6Var = (f6) this.f701c;
                f6Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.f700b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                f6Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                m90.s((m90) this.f701c, this.f700b);
                return;
            case 2:
                vy vyVar = (vy) this.f701c;
                MessagesController messagesController = vyVar.getMessagesController();
                long j10 = this.f700b;
                boolean isDialogMuted = messagesController.isDialogMuted(j10, 0L);
                if (!isDialogMuted) {
                    vyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 3);
                } else {
                    vyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 4);
                }
                zc.A(vyVar, !isDialogMuted, null).j();
                vyVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((qh.p) this.f701c).f46659f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f700b));
                    return;
                }
                return;
            case 4:
                xh.o.Q((xh.o) this.f701c, this.f700b);
                return;
            default:
                xh.q1 q1Var = (xh.q1) this.f701c;
                q1Var.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    q1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f700b));
                    return;
                }
                return;
        }
    }
}
