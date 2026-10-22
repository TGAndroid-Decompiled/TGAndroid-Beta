package ci;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.a90;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
public final class b2 implements View.OnClickListener {
    public final int f5239a;
    public final long f5240b;
    public final Object f5241c;

    public b2(Object obj, long j10, int i10) {
        this.f5239a = i10;
        this.f5241c = obj;
        this.f5240b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5239a) {
            case 0:
                q4 q4Var = (q4) this.f5241c;
                q4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f5240b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                q4Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                a90.s((a90) this.f5241c, this.f5240b);
                return;
            case 2:
                cy cyVar = (cy) this.f5241c;
                MessagesController messagesController = cyVar.getMessagesController();
                long j11 = this.f5240b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (!isDialogMuted) {
                    cyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                } else {
                    cyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                }
                xc.A(cyVar, !isDialogMuted, null).j();
                cyVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((rh.p) this.f5241c).f45792f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f5240b));
                    return;
                }
                return;
            case 4:
                yh.m.Q((yh.m) this.f5241c, this.f5240b);
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.f5241c;
                o1Var.getClass();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    o1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f5240b));
                    return;
                }
                return;
        }
    }
}
