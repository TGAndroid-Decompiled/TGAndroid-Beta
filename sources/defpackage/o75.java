package defpackage;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class o75 implements s95 {
    public final j95 a;

    public o75(j95 j95Var) {
        this.a = j95Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        e Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z = Q instanceof ProfileActivity;
        j95 j95Var = this.a;
        if (z && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            j95Var.dismiss();
            return;
        }
        int G0 = j95Var.G0();
        Bundle bundle = new Bundle();
        long j = groupCallMessage.fromId;
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        boolean z2 = true;
        if (groupCallMessage.fromId == yac.h(j95Var.n1.a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (G0 > 0 && G0 != Integer.MAX_VALUE) {
            z2 = false;
        }
        Q.presentFragment(profileActivity, false, z2);
        j95Var.dismiss();
    }
}
