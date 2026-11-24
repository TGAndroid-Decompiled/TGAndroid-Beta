package defpackage;

import android.text.SpannableStringBuilder;
public final class rn0 implements Runnable {
    public final byte a;
    public final SpannableStringBuilder b;

    public rn0(SpannableStringBuilder spannableStringBuilder, byte b) {
        this.a = b;
        this.b = spannableStringBuilder;
    }

    @Override
    public final void run() {
        byte b = this.a;
        SpannableStringBuilder spannableStringBuilder = this.b;
        switch (b) {
            case 0:
                c41 Y = c41.Y();
                if (Y != null) {
                    Y.Q(2131624029, 30, spannableStringBuilder).j();
                    return;
                }
                return;
            default:
                u31 I = yr7.h().I(2131623990, jb6.M0(2131749515, null), spannableStringBuilder);
                I.u = true;
                I.j();
                return;
        }
    }
}
