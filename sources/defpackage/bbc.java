package defpackage;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.UserInfoActivity;
public final class bbc extends zt3 {
    public final byte F;
    public final UserInfoActivity G;

    public bbc(UserInfoActivity userInfoActivity, Context context, String str, int i, vnb vnbVar) {
        super(context, str, true, false, i, vnbVar);
        this.F = (byte) 2;
        this.G = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        byte b = this.F;
        UserInfoActivity userInfoActivity = this.G;
        switch (b) {
            case 0:
                userInfoActivity.e0(true);
                return;
            case 1:
                userInfoActivity.e0(true);
                return;
            default:
                userInfoActivity.e0(true);
                userInfoActivity.i0();
                return;
        }
    }

    public bbc(UserInfoActivity userInfoActivity, Context context, String str, vnb vnbVar, byte b) {
        super(context, str, false, false, -1, vnbVar);
        this.F = b;
        this.G = userInfoActivity;
    }
}
