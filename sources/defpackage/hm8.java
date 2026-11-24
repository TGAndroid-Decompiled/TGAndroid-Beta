package defpackage;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;
public final class hm8 implements View.OnClickListener {
    public final byte a;
    public final ProfileActivity b;
    public final String c;

    public hm8(ProfileActivity profileActivity, String str, byte b) {
        this.a = b;
        this.b = profileActivity;
        this.c = str;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        String str = this.c;
        ProfileActivity profileActivity = this.b;
        switch (b) {
            case 0:
                RectF rectF = ProfileActivity.Z6;
                Activity parentActivity = profileActivity.getParentActivity();
                d01.t(parentActivity, "https://" + profileActivity.getMessagesController().N2 + "/nft/" + str);
                return;
            default:
                RectF rectF2 = ProfileActivity.Z6;
                Activity parentActivity2 = profileActivity.getParentActivity();
                d01.t(parentActivity2, "https://" + profileActivity.getMessagesController().N2 + "/nft/" + str);
                return;
        }
    }
}
