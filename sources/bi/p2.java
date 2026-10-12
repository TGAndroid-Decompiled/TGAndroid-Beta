package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.yy;
public final class p2 implements View.OnClickListener {
    public final int f3456a;
    public final long f3457b;
    public final Object f3458c;

    public p2(Object obj, long j10, int i10) {
        this.f3456a = i10;
        this.f3458c = obj;
        this.f3457b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3456a) {
            case 0:
                q5 q5Var = (q5) this.f3458c;
                q5Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f3457b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                q5Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                g90.s((g90) this.f3458c, this.f3457b);
                return;
            case 2:
                yy yyVar = (yy) this.f3458c;
                MessagesController messagesController = yyVar.getMessagesController();
                long j11 = this.f3457b;
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
                Utilities.Callback callback = ((rh.q) this.f3458c).f44701f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f3457b));
                    return;
                }
                return;
            case 4:
                yh.n.Q((yh.n) this.f3458c, this.f3457b);
                return;
            default:
                yh.p1 p1Var = (yh.p1) this.f3458c;
                p1Var.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f3457b));
                    return;
                }
                return;
        }
    }
}
