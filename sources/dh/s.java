package dh;

import android.os.Bundle;
import android.view.View;
import kh.h2;
import nh.d4;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.oy;
public final class s implements View.OnClickListener {
    public final int f4931a;
    public final long f4932b;
    public final Object f4933c;

    public s(Object obj, long j10, int i10) {
        this.f4931a = i10;
        this.f4933c = obj;
        this.f4932b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f4931a) {
            case 0:
                Utilities.Callback callback = ((t) this.f4933c).f4937f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f4932b));
                    return;
                }
                return;
            case 1:
                kh.s.P((kh.s) this.f4933c, this.f4932b);
                return;
            case 2:
                h2 h2Var = (h2) this.f4933c;
                h2Var.getClass();
                p2 U = LaunchActivity.U();
                if (U != null) {
                    h2Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f4932b));
                    return;
                }
                return;
            case 3:
                d4 d4Var = (d4) this.f4933c;
                d4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f4932b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                d4Var.G0.H(new ProfileActivity(bundle, null));
                return;
            case 4:
                h80.q((h80) this.f4933c, this.f4932b);
                return;
            default:
                oy oyVar = (oy) this.f4933c;
                MessagesController messagesController = oyVar.getMessagesController();
                long j11 = this.f4932b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (!isDialogMuted) {
                    oyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                } else {
                    oyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                }
                qc.A(oyVar, !isDialogMuted, null).j();
                oyVar.finishPreviewFragment();
                return;
        }
    }
}
