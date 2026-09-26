package ai;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qy;
public final class a3 implements View.OnClickListener {
    public final int f507a;
    public final long f508b;
    public final Object f509c;

    public a3(Object obj, long j3, int i10) {
        this.f507a = i10;
        this.f509c = obj;
        this.f508b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f507a) {
            case 0:
                e6 e6Var = (e6) this.f509c;
                e6Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.f508b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                e6Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                r80.q((r80) this.f509c, this.f508b);
                return;
            case 2:
                qy qyVar = (qy) this.f509c;
                MessagesController messagesController = qyVar.getMessagesController();
                long j10 = this.f508b;
                boolean isDialogMuted = messagesController.isDialogMuted(j10, 0L);
                if (!isDialogMuted) {
                    qyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 3);
                } else {
                    qyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 4);
                }
                xc.A(qyVar, !isDialogMuted, null).j();
                qyVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((qh.p) this.f509c).f42084f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f508b));
                    return;
                }
                return;
            case 4:
                xh.m.P((xh.m) this.f509c, this.f508b);
                return;
            default:
                xh.r1 r1Var = (xh.r1) this.f509c;
                r1Var.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    r1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f508b));
                    return;
                }
                return;
        }
    }
}
