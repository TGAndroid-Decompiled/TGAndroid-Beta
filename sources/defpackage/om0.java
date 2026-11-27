package defpackage;

import android.text.SpannableStringBuilder;
public final class om0 implements Runnable {
    public final byte a;
    public final SpannableStringBuilder b;

    public om0(SpannableStringBuilder spannableStringBuilder, byte b) {
        this.a = b;
        this.b = spannableStringBuilder;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SpannableStringBuilder spannableStringBuilder = this.b;
        switch (b) {
            case 0:
                d31 Y = d31.Y();
                if (Y != null) {
                    Y.Q(2131624029, 30, spannableStringBuilder).j();
                    return;
                }
                return;
            default:
                v21 I = vs7.h().I(2131623990, ob6.M0(2131749527, null), spannableStringBuilder);
                I.u = true;
                I.j();
                return;
        }
    }
}
