package defpackage;

import android.content.Context;
import org.telegram.ui.PasscodeActivity;
public final class bf6 extends bk2 {
    public final byte h;
    public final Object n;

    public bf6(byte b, Context context, Object obj) {
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
                ((df6) obj).h(null);
                return;
            case 1:
                ((vf6) obj).h(null);
                return;
            case 2:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                if (!passcodeActivity.F) {
                    postDelayed(new fe7(this, (byte) 19), 260L);
                    return;
                } else {
                    passcodeActivity.t0();
                    return;
                }
            default:
                ((o7c) obj).H0();
                return;
        }
    }
}
