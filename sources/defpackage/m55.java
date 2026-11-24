package defpackage;

import android.os.Bundle;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class m55 implements q75 {
    public final h75 a;

    public m55(h75 h75Var) {
        this.a = h75Var;
    }

    public final void a(GroupCallMessage groupCallMessage) {
        d Q = LaunchActivity.Q();
        if (Q == null) {
            return;
        }
        boolean z = Q instanceof ProfileActivity;
        h75 h75Var = this.a;
        if (z && ((ProfileActivity) Q).a() == groupCallMessage.fromId) {
            h75Var.dismiss();
            return;
        }
        int F0 = h75Var.F0();
        Bundle bundle = new Bundle();
        long j = groupCallMessage.fromId;
        if (j > 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        boolean z2 = true;
        if (groupCallMessage.fromId == y6c.h(h75Var.n1.a).e()) {
            bundle.putBoolean("my_profile", true);
        }
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        if (F0 > 0 && F0 != Integer.MAX_VALUE) {
            z2 = false;
        }
        Q.presentFragment(profileActivity, false, z2);
        h75Var.dismiss();
    }
}
