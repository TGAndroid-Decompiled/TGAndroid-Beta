package ai;

import android.os.Bundle;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.t80;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ty;
public final class a3 implements View.OnClickListener {
    public final int f510a;
    public final long f511b;
    public final Object f512c;

    public a3(Object obj, long j3, int i10) {
        this.f510a = i10;
        this.f512c = obj;
        this.f511b = j3;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f510a) {
            case 0:
                e6 e6Var = (e6) this.f512c;
                e6Var.getClass();
                Bundle bundle = new Bundle();
                long j3 = this.f511b;
                if (j3 >= 0) {
                    bundle.putLong("user_id", j3);
                } else {
                    bundle.putLong("chat_id", -j3);
                }
                e6Var.J0.H(new ProfileActivity(bundle, null));
                return;
            case 1:
                t80.q((t80) this.f512c, this.f511b);
                return;
            case 2:
                ty tyVar = (ty) this.f512c;
                MessagesController messagesController = tyVar.getMessagesController();
                long j10 = this.f511b;
                boolean isDialogMuted = messagesController.isDialogMuted(j10, 0L);
                if (!isDialogMuted) {
                    tyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 3);
                } else {
                    tyVar.getNotificationsController().setDialogNotificationsSettings(j10, 0L, 4);
                }
                xc.A(tyVar, !isDialogMuted, null).j();
                tyVar.finishPreviewFragment();
                return;
            case 3:
                Utilities.Callback callback = ((qh.p) this.f512c).f42114f;
                if (callback != null) {
                    callback.run(Long.valueOf(this.f511b));
                    return;
                }
                return;
            case 4:
                xh.m.P((xh.m) this.f512c, this.f511b);
                return;
            default:
                xh.r1 r1Var = (xh.r1) this.f512c;
                r1Var.getClass();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    r1Var.dismiss();
                    U.presentFragment(ProfileActivity.m4(this.f511b));
                    return;
                }
                return;
        }
    }
}
