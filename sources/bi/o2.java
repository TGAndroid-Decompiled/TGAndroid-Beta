package bi;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uy;
public final class o2 implements View.OnClickListener {
    public final int f3422a;
    public final long f3423b;
    public final Object f3424c;

    public o2(Object obj, long j3, int i10) {
        this.f3422a = i10;
        this.f3424c = obj;
        this.f3423b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3422a) {
            case 0:
                o5 o5Var = (o5) this.f3424c;
                o5Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.f3423b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                o5Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                g80.q((g80) this.f3424c, this.f3423b);
                return;
            case 2:
                uy uyVar = (uy) this.f3424c;
                MessagesController messagesController = uyVar.getMessagesController();
                long j10 = this.f3423b;
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
                Utilities.Callback callback = ((rh.p) this.f3424c).f45682f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f3423b));
                    return;
                }
                return;
            case 4:
                yh.m.P((yh.m) this.f3424c, this.f3423b);
                return;
            default:
                yh.p1 p1Var = (yh.p1) this.f3424c;
                p1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f3423b));
                    return;
                }
                return;
        }
    }
}
