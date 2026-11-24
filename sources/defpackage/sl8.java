package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.graphics.RectF;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class sl8 implements Runnable {
    public final byte a;
    public final ProfileActivity b;
    public final TLRPC.User c;

    public sl8(ProfileActivity profileActivity, TLRPC.User user, byte b) {
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
                RectF rectF = ProfileActivity.Z6;
                profileActivity.presentFragment(mu1.W9(user.id));
                return;
            case 1:
                ProfileActivity profileActivity2 = this.b;
                TLRPC.User user2 = this.c;
                RectF rectF2 = ProfileActivity.Z6;
                if (profileActivity2.getParentActivity() != null) {
                    TLRPC.UserFull userFull = profileActivity2.w2;
                    if (userFull != null && userFull.video_calls_available) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rgc.m(user2, false, z, profileActivity2.getParentActivity(), profileActivity2.w2, profileActivity2.getAccountInstance());
                    return;
                }
                return;
            case 2:
                ProfileActivity profileActivity3 = this.b;
                TLRPC.User user3 = this.c;
                RectF rectF3 = ProfileActivity.Z6;
                if (profileActivity3.getParentActivity() != null) {
                    TLRPC.UserFull userFull2 = profileActivity3.w2;
                    if (userFull2 != null && userFull2.video_calls_available) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rgc.m(user3, true, z2, profileActivity3.getParentActivity(), profileActivity3.w2, profileActivity3.getAccountInstance());
                    return;
                }
                return;
            case 3:
                ProfileActivity profileActivity4 = this.b;
                TLRPC.User user4 = this.c;
                RectF rectF4 = ProfileActivity.Z6;
                try {
                    Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+" + user4.phone));
                    intent.addFlags(268435456);
                    profileActivity4.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                ProfileActivity profileActivity5 = this.b;
                TLRPC.User user5 = this.c;
                RectF rectF5 = ProfileActivity.Z6;
                try {
                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", "+" + user5.phone));
                    if (gl.C3()) {
                        u21.b0(profileActivity5).i(k96.M0(2131747102, null)).j();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }
}
