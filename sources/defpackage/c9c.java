package defpackage;

import android.content.Context;
import android.text.Editable;
import org.telegram.ui.UserInfoActivity;
public final class c9c extends su3 {
    public final byte F;
    public final UserInfoActivity G;

    public c9c(UserInfoActivity userInfoActivity, Context context, String str, int i, ylb ylbVar) {
        super(context, str, true, false, i, ylbVar);
        this.F = (byte) 2;
        this.G = userInfoActivity;
    }

    @Override
    public final void b(Editable editable) {
        byte b = this.F;
        UserInfoActivity userInfoActivity = this.G;
        switch (b) {
            case 0:
                userInfoActivity.f0(true);
                return;
            case 1:
                userInfoActivity.f0(true);
                return;
            default:
                userInfoActivity.f0(true);
                userInfoActivity.j0();
                return;
        }
    }

    public c9c(UserInfoActivity userInfoActivity, Context context, String str, ylb ylbVar, byte b) {
        super(context, str, false, false, -1, ylbVar);
        this.F = b;
        this.G = userInfoActivity;
    }
}
