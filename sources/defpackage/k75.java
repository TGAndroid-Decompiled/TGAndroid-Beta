package defpackage;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class k75 implements p95 {
    public final g95 a;

    public k75(g95 g95Var) {
        this.a = g95Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z = Q instanceof ProfileActivity;
        g95 g95Var = this.a;
        if (z && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            g95Var.dismiss();
            return;
        }
        int F0 = g95Var.F0();
        Bundle bundle = new Bundle();
        long j = groupCallMessage.fromId;
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        boolean z2 = true;
        if (groupCallMessage.fromId == z8c.h(g95Var.n1.a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (F0 > 0 && F0 != Integer.MAX_VALUE) {
            z2 = false;
        }
        Q.presentFragment(profileActivity, false, z2);
        g95Var.dismiss();
    }
}
