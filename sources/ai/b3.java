package ai;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.j90;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sy;
public final class b3 implements View.OnClickListener {
    public final int f697a;
    public final long f698b;
    public final Object f699c;

    public b3(Object obj, long j3, int i10) {
        this.f697a = i10;
        this.f699c = obj;
        this.f698b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f697a) {
            case 0:
                f6 f6Var = (f6) this.f699c;
                f6Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.f698b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                f6Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                j90.s((j90) this.f699c, this.f698b);
                return;
            case 2:
                sy syVar = (sy) this.f699c;
                MessagesController messagesController = syVar.getMessagesController();
                long j10 = this.f698b;
                boolean isDialogMuted = messagesController.isDialogMuted(j10, 0L);
                if (!isDialogMuted) {
                    syVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 3);
                } else {
                    syVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 4);
                }
                ad.A(syVar, !isDialogMuted, null).j();
                syVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((qh.p) this.f699c).f46789f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f698b));
                    return;
                }
                return;
            case 4:
                xh.o.Q((xh.o) this.f699c, this.f698b);
                return;
            default:
                xh.r1 r1Var = (xh.r1) this.f699c;
                r1Var.getClass();
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    r1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f698b));
                    return;
                }
                return;
        }
    }
}
