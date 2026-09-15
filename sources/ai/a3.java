package ai;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uy;
public final class a3 implements View.OnClickListener {
    public final int f505a;
    public final long f506b;
    public final Object f507c;

    public a3(Object obj, long j3, int i10) {
        this.f505a = i10;
        this.f507c = obj;
        this.f506b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f505a) {
            case 0:
                f6 f6Var = (f6) this.f507c;
                f6Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.f506b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                f6Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                g80.q((g80) this.f507c, this.f506b);
                return;
            case 2:
                uy uyVar = (uy) this.f507c;
                MessagesController messagesController = uyVar.getMessagesController();
                long j10 = this.f506b;
                boolean isDialogMuted = messagesController.isDialogMuted(j10, 0L);
                if (!isDialogMuted) {
                    uyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 3);
                } else {
                    uyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 4);
                }
                vc.A(uyVar, !isDialogMuted, null).j();
                uyVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((qh.p) this.f507c).f41799f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f506b));
                    return;
                }
                return;
            case 4:
                xh.m.P((xh.m) this.f507c, this.f506b);
                return;
            default:
                xh.q1 q1Var = (xh.q1) this.f507c;
                q1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    q1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f506b));
                    return;
                }
                return;
        }
    }
}
