package ai;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.g80;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.wy;
public final class a3 implements View.OnClickListener {
    public final int f510a;
    public final long f511b;
    public final Object f512c;

    public a3(Object obj, long j3, int i10) {
        this.f510a = i10;
        this.f512c = obj;
        this.f511b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f510a) {
            case 0:
                f6 f6Var = (f6) this.f512c;
                f6Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.f511b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                f6Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                g80.q((g80) this.f512c, this.f511b);
                return;
            case 2:
                wy wyVar = (wy) this.f512c;
                MessagesController messagesController = wyVar.getMessagesController();
                long j10 = this.f511b;
                boolean isDialogMuted = messagesController.isDialogMuted(j10, 0L);
                if (!isDialogMuted) {
                    wyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 3);
                } else {
                    wyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 4);
                }
                vc.A(wyVar, !isDialogMuted, null).j();
                wyVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((qh.p) this.f512c).f41821f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f511b));
                    return;
                }
                return;
            case 4:
                xh.m.P((xh.m) this.f512c, this.f511b);
                return;
            default:
                xh.q1 q1Var = (xh.q1) this.f512c;
                q1Var.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    q1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f511b));
                    return;
                }
                return;
        }
    }
}
