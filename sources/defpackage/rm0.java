package defpackage;

import android.text.SpannableStringBuilder;
public final class rm0 implements Runnable {
    public final byte a;
    public final SpannableStringBuilder b;

    public rm0(SpannableStringBuilder spannableStringBuilder, byte b) {
        this.a = b;
        this.b = spannableStringBuilder;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SpannableStringBuilder spannableStringBuilder = this.b;
        switch (b) {
            case 0:
                u21 Y = u21.Y();
                if (Y != null) {
                    Y.Q(2131624029, 30, spannableStringBuilder).j();
                    return;
                }
                return;
            default:
                m21 I = vp7.h().I(2131623990, k96.M0(2131749566, null), spannableStringBuilder);
                I.t = true;
                I.j();
                return;
        }
    }
}
