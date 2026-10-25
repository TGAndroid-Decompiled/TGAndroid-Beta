package di;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cy;
public final class a2 implements View.OnClickListener {
    public final int f8363a;
    public final long f8364b;
    public final Object f8365c;

    public a2(Object obj, long j10, int i10) {
        this.f8363a = i10;
        this.f8365c = obj;
        this.f8364b = j10;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f8363a) {
            case 0:
                q4 q4Var = (q4) this.f8365c;
                q4Var.getClass();
                Bundle bundle = new Bundle();
                long j10 = this.f8364b;
                if (j10 >= 0) {
                    bundle.putLong("user_id", j10);
                } else {
                    bundle.putLong("chat_id", -j10);
                }
                q4Var.f9047y0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                c90.q((c90) this.f8365c, this.f8364b);
                return;
            case 2:
                cy cyVar = (cy) this.f8365c;
                MessagesController messagesController = cyVar.getMessagesController();
                long j11 = this.f8364b;
                boolean isDialogMuted = messagesController.isDialogMuted(j11, 0L);
                if (!isDialogMuted) {
                    cyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 3);
                } else {
                    cyVar.getNotificationsController().setDialogNotificationsSettings(j11, 0L, 4);
                }
                wc.A(cyVar, !isDialogMuted, null).j();
                cyVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((sh.p) this.f8365c).f48662f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f8364b));
                    return;
                }
                return;
            case 4:
                zh.m.P((zh.m) this.f8365c, this.f8364b);
                return;
            default:
                zh.p1 p1Var = (zh.p1) this.f8365c;
                p1Var.getClass();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    p1Var.dismiss();
                    U.presentFragment(ProfileActivity.t4(this.f8364b));
                    return;
                }
                return;
        }
    }
}
