package defpackage;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.UserInfoActivity;
public final class b7c extends it3 {
    public final byte F;
    public final UserInfoActivity G;

    public b7c(UserInfoActivity userInfoActivity, Context context, String str, int i, wjb wjbVar) {
        super(context, str, true, false, i, wjbVar);
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

    public b7c(UserInfoActivity userInfoActivity, Context context, String str, wjb wjbVar, byte b) {
        super(context, str, false, false, -1, wjbVar);
        this.F = b;
        this.G = userInfoActivity;
    }
}
