package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yy;
public final class p2 implements View.OnClickListener {
    public final int f3460a;
    public final long f3461b;
    public final Object f3462c;

    public p2(Object obj, long j10, int i10) {
        this.f3460a = i10;
        this.f3462c = obj;
        this.f3461b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3460a) {
            case 0:
                q5 q5Var = (q5) this.f3462c;
                q5Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f3461b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                q5Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                f90.s((f90) this.f3462c, this.f3461b);
                return;
            case 2:
                yy yyVar = (yy) this.f3462c;
                MessagesController messagesController = yyVar.getMessagesController();
                long j11 = this.f3461b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (!isDialogMuted) {
                    yyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                } else {
                    yyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                }
                zc.A(yyVar, !isDialogMuted, null).j();
                yyVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((rh.p) this.f3462c).f44458f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f3461b));
                    return;
                }
                return;
            case 4:
                yh.n.Q((yh.n) this.f3462c, this.f3461b);
                return;
            default:
                yh.p1 p1Var = (yh.p1) this.f3462c;
                p1Var.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f3461b));
                    return;
                }
                return;
        }
    }
}
