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
public final class a2 implements View.OnClickListener {
    public final int f5138a;
    public final long f5139b;
    public final Object f5140c;

    public a2(Object obj, long j10, int i10) {
        this.f5138a = i10;
        this.f5140c = obj;
        this.f5139b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5138a) {
            case 0:
                p4 p4Var = (p4) this.f5140c;
                p4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f5139b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                p4Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                a90.r((a90) this.f5140c, this.f5139b);
                return;
            case 2:
                ey eyVar = (ey) this.f5140c;
                MessagesController messagesController = eyVar.getMessagesController();
                long j11 = this.f5139b;
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
                Utilities.Callback callback = ((rh.p) this.f5140c).f45779f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f5139b));
                    return;
                }
                return;
            case 4:
                yh.m.Q((yh.m) this.f5140c, this.f5139b);
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.f5140c;
                o1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    o1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f5139b));
                    return;
                }
                return;
        }
    }
}
