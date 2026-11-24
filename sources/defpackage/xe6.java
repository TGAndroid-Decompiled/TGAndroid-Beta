package defpackage;

import android.content.Context;
import org.telegram.ui.PasscodeActivity;
public final class xe6 extends tk2 {
    public final byte h;
    public final Object n;

    public xe6(byte b, Context context, Object obj) {
        super(context);
        this.h = b;
        this.n = obj;
    }

    @Override
    public final void a() {
        byte b = this.h;
        Object obj = this.n;
        switch (b) {
            case 0:
                ((ze6) obj).h(null);
                return;
            case 1:
                ((sf6) obj).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (!passcodeActivity.F) {
                    postDelayed(new kl7(this, (byte) 11), 260L);
                    return;
                } else {
                    passcodeActivity.u0();
                    return;
                }
            default:
                ((p5c) obj).H0();
                return;
        }
    }
}
