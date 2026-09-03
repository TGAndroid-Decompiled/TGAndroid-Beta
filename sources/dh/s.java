package dh;

import android.os.Bundle;
import android.view.View;
import kh.g2;
import nh.d4;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qy;
public final class s implements View.OnClickListener {
    public final int f4937a;
    public final long f4938b;
    public final Object f4939c;

    public s(Object obj, long j10, int i10) {
        this.f4937a = i10;
        this.f4939c = obj;
        this.f4938b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4937a) {
            case 0:
                Utilities.Callback callback = ((t) this.f4939c).f4943f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f4938b));
                    return;
                }
                return;
            case 1:
                kh.s.P((kh.s) this.f4939c, this.f4938b);
                return;
            case 2:
                g2 g2Var = (g2) this.f4939c;
                g2Var.getClass();
                p2 U = LaunchActivity.U();
                if (U != null) {
                    g2Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f4938b));
                    return;
                }
                return;
            case 3:
                d4 d4Var = (d4) this.f4939c;
                d4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f4938b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                d4Var.G0.H(new ProfileActivity(bundle, null));
                return;
            case 4:
                i80.q((i80) this.f4939c, this.f4938b);
                return;
            default:
                qy qyVar = (qy) this.f4939c;
                MessagesController messagesController = qyVar.getMessagesController();
                long j11 = this.f4938b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (!isDialogMuted) {
                    qyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                } else {
                    qyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                }
                qc.A(qyVar, !isDialogMuted, null).j();
                qyVar.finishPreviewFragment();
                return;
        }
    }
}
