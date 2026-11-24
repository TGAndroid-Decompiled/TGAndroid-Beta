package defpackage;

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;
public final class zp8 implements View.OnClickListener {
    public final byte a;
    public final lq8 b;

    public zp8(lq8 lq8Var, byte b) {
        this.a = b;
        this.b = lq8Var;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        lq8 lq8Var = this.b;
        switch (b) {
            case 0:
                ProfileActivity profileActivity = lq8Var.e;
                RectF rectF = ProfileActivity.e7;
                profileActivity.c3();
                return;
            case 1:
                ProfileActivity profileActivity2 = lq8Var.e;
                profileActivity2.X4 = !profileActivity2.X4;
                if (!profileActivity2.W4) {
                    profileActivity2.W4 = true;
                }
                profileActivity2.m3();
                view.requestLayout();
                profileActivity2.d.g(profileActivity2.P3);
                int i = profileActivity2.w6;
                if (i >= 0) {
                    profileActivity2.c.g1(i, profileActivity2.x6 - profileActivity2.a.getPaddingTop());
                    return;
                }
                return;
            default:
                ProfileActivity profileActivity3 = lq8Var.e;
                profileActivity3.getMessagesController().B3(profileActivity3, profileActivity3.getMessagesController().W1(Long.valueOf(profileActivity3.e1)), null, profileActivity3.getClassGuid(), null, false, false);
                return;
        }
    }
}
