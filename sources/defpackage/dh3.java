package defpackage;

import android.text.SpannableStringBuilder;
public final class dh3 extends vu8 {
    public final byte f0 = 0;
    public final Object g0;

    public dh3(qvb qvbVar, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = qvbVar;
    }

    @Override
    public final float d() {
        byte b = this.f0;
        Object obj = this.g0;
        switch (b) {
            case 0:
                return ((bj3) obj).a.getViewOffset();
            default:
                return ((qvb) obj).O.m3;
        }
    }

    public dh3(String str, String str2, bj3 bj3Var) {
        super(str, str2);
        this.g0 = bj3Var;
    }
}
