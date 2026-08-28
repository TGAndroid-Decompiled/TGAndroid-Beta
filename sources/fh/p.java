package fh;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.p70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dy;
public final class p implements View.OnClickListener {
    public final int f6673a;
    public final long f6674b;
    public final Object f6675c;

    public p(Object obj, long j10, int i9) {
        this.f6673a = i9;
        this.f6675c = obj;
        this.f6674b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f6673a) {
            case 0:
                x.O((x) this.f6675c, this.f6674b);
                return;
            case 1:
                p2 p2Var = (p2) this.f6675c;
                p2Var.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    p2Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f6674b));
                    return;
                }
                return;
            case 2:
                ih.i4 i4Var = (ih.i4) this.f6675c;
                i4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f6674b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                i4Var.F0.H(new ProfileActivity(bundle, null));
                return;
            case 3:
                p70.q((p70) this.f6675c, this.f6674b);
                return;
            case 4:
                dy dyVar = (dy) this.f6675c;
                MessagesController messagesController = dyVar.getMessagesController();
                long j11 = this.f6674b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (!isDialogMuted) {
                    dyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                } else {
                    dyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                }
                oc.A(dyVar, !isDialogMuted, null).j();
                dyVar.finishPreviewFragment();
                return;
            default:
                Utilities.Callback callback = ((yg.p) this.f6675c).f50255f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f6674b));
                    return;
                }
                return;
        }
    }
}
