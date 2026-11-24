package defpackage;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.d0;
public final class ut3 implements DialogInterface.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;

    public ut3(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                zt3 zt3Var = (zt3) ((lv6) obj).c;
                if (i == 0) {
                    zt3Var.e.remove(i2 - zt3Var.n);
                    zt3Var.d0();
                    yt3 yt3Var = zt3Var.f;
                    if (yt3Var != null) {
                        yt3Var.a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                ((NotificationsSettingsActivity) obj).B0(i2, i);
                return;
            default:
                ThemeActivity themeActivity = (ThemeActivity) obj;
                themeActivity.getClass();
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putInt("sortContactsBy", i);
                edit.commit();
                d0 d0Var = themeActivity.a;
                if (d0Var != null) {
                    d0Var.g(i2);
                    return;
                }
                return;
        }
    }
}
