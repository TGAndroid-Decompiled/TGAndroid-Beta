package bh;

import android.os.Bundle;
import android.view.View;
import ih.h2;
import lh.d4;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fy;
public final class s implements View.OnClickListener {
    public final int f2697a;
    public final long f2698b;
    public final Object f2699c;

    public s(Object obj, long j10, int i10) {
        this.f2697a = i10;
        this.f2699c = obj;
        this.f2698b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2697a) {
            case 0:
                Utilities.Callback callback = ((t) this.f2699c).f2704f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f2698b));
                    return;
                }
                return;
            case 1:
                ih.t.P((ih.t) this.f2699c, this.f2698b);
                return;
            case 2:
                h2 h2Var = (h2) this.f2699c;
                h2Var.getClass();
                o2 U = LaunchActivity.U();
                if (U != null) {
                    h2Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f2698b));
                    return;
                }
                return;
            case 3:
                d4 d4Var = (d4) this.f2699c;
                d4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f2698b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                d4Var.F0.H(new ProfileActivity(bundle, null));
                return;
            case 4:
                c80.q((c80) this.f2699c, this.f2698b);
                return;
            default:
                fy fyVar = (fy) this.f2699c;
                MessagesController messagesController = fyVar.getMessagesController();
                long j11 = this.f2698b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (!isDialogMuted) {
                    fyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                } else {
                    fyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                }
                tc.A(fyVar, !isDialogMuted, null).j();
                fyVar.finishPreviewFragment();
                return;
        }
    }
}
