package eh;

import android.os.Bundle;
import android.view.View;
import lh.g2;
import oh.f4;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.py;
public final class t implements View.OnClickListener {
    public final int f5668a;
    public final long f5669b;
    public final Object f5670c;

    public t(Object obj, long j10, int i10) {
        this.f5668a = i10;
        this.f5670c = obj;
        this.f5669b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5668a) {
            case 0:
                Utilities.Callback callback = ((u) this.f5670c).f5675f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f5669b));
                    return;
                }
                return;
            case 1:
                lh.s.P((lh.s) this.f5670c, this.f5669b);
                return;
            case 2:
                g2 g2Var = (g2) this.f5670c;
                g2Var.getClass();
                p2 U = LaunchActivity.U();
                if (U != null) {
                    g2Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f5669b));
                    return;
                }
                return;
            case 3:
                f4 f4Var = (f4) this.f5670c;
                f4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f5669b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                f4Var.G0.H(new ProfileActivity(bundle, null));
                return;
            case 4:
                j80.q((j80) this.f5670c, this.f5669b);
                return;
            default:
                py pyVar = (py) this.f5670c;
                MessagesController messagesController = pyVar.getMessagesController();
                long j11 = this.f5669b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (!isDialogMuted) {
                    pyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                } else {
                    pyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                }
                qc.A(pyVar, !isDialogMuted, null).j();
                pyVar.finishPreviewFragment();
                return;
        }
    }
}
