package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class rn8 implements Runnable {
    public final byte a;
    public final ProfileActivity b;
    public final TLRPC.User c;

    public rn8(ProfileActivity profileActivity, TLRPC.User user, byte b) {
        this.a = b;
        this.b = profileActivity;
        this.c = user;
    }

    @Override
    public final void run() {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                ProfileActivity profileActivity = this.b;
                TLRPC.User user = this.c;
                RectF rectF = ProfileActivity.e7;
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user.phone));
                    if (gm.C3()) {
                        c41.b0(profileActivity).i(jb6.M0(2131747028, null)).j();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                ProfileActivity profileActivity2 = this.b;
                TLRPC.User user2 = this.c;
                RectF rectF2 = ProfileActivity.e7;
                profileActivity2.presentFragment(yv1.ga(user2.id));
                return;
            case 2:
                ProfileActivity profileActivity3 = this.b;
                TLRPC.User user3 = this.c;
                RectF rectF3 = ProfileActivity.e7;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity3.w2;
                    if (userFull != null && userFull.video_calls_available) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sic.m(user3, false, z, profileActivity3.getParentActivity(), profileActivity3.w2, profileActivity3.getAccountInstance());
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity4 = this.b;
                TLRPC.User user4 = this.c;
                RectF rectF4 = ProfileActivity.e7;
                if (profileActivity4.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity4.w2;
                    if (userFull2 != null && userFull2.video_calls_available) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sic.m(user4, true, z2, profileActivity4.getParentActivity(), profileActivity4.w2, profileActivity4.getAccountInstance());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity5 = this.b;
                TLRPC.User user5 = this.c;
                RectF rectF5 = ProfileActivity.e7;
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user5.phone));
                    intent.addFlags(268435456);
                    profileActivity5.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }
}
