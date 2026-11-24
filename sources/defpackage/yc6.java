package defpackage;

import android.content.Context;
import org.telegram.ui.PasscodeActivity;
public final class yc6 extends fj2 {
    public final byte h;
    public final Object n;

    public yc6(byte b, Context context, Object obj) {
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
                ((ad6) obj).h(null);
                return;
            case 1:
                ((td6) obj).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (!passcodeActivity.F) {
                    postDelayed(new oq7(this, (byte) 4), 260L);
                    return;
                } else {
                    passcodeActivity.t0();
                    return;
                }
            default:
                ((p3c) obj).G0();
                return;
        }
    }
}
