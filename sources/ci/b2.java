package ci;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ey;
public final class b2 implements View.OnClickListener {
    public final int f5242a;
    public final long f5243b;
    public final Object f5244c;

    public b2(Object obj, long j10, int i10) {
        this.f5242a = i10;
        this.f5244c = obj;
        this.f5243b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5242a) {
            case 0:
                q4 q4Var = (q4) this.f5244c;
                q4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f5243b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                q4Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                a90.r((a90) this.f5244c, this.f5243b);
                return;
            case 2:
                ey eyVar = (ey) this.f5244c;
                MessagesController messagesController = eyVar.getMessagesController();
                long j11 = this.f5243b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (!isDialogMuted) {
                    eyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                } else {
                    eyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                }
                xc.A(eyVar, !isDialogMuted, null).j();
                eyVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((rh.p) this.f5244c).f45827f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f5243b));
                    return;
                }
                return;
            case 4:
                yh.n.Q((yh.n) this.f5244c, this.f5243b);
                return;
            default:
                yh.p1 p1Var = (yh.p1) this.f5244c;
                p1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f5243b));
                    return;
                }
                return;
        }
    }
}
