package ci;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.z80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ey;
public final class a2 implements View.OnClickListener {
    public final int f5140a;
    public final long f5141b;
    public final Object f5142c;

    public a2(Object obj, long j10, int i10) {
        this.f5140a = i10;
        this.f5142c = obj;
        this.f5141b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5140a) {
            case 0:
                p4 p4Var = (p4) this.f5142c;
                p4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f5141b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                p4Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                z80.r((z80) this.f5142c, this.f5141b);
                return;
            case 2:
                ey eyVar = (ey) this.f5142c;
                MessagesController messagesController = eyVar.getMessagesController();
                long j11 = this.f5141b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (!isDialogMuted) {
                    eyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                } else {
                    eyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                }
                vc.A(eyVar, !isDialogMuted, null).j();
                eyVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((rh.p) this.f5142c).f46213f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f5141b));
                    return;
                }
                return;
            case 4:
                yh.m.P((yh.m) this.f5142c, this.f5141b);
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.f5142c;
                o1Var.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    o1Var.dismiss();
                    U.presentFragment(ProfileActivity.o4(this.f5141b));
                    return;
                }
                return;
        }
    }
}
