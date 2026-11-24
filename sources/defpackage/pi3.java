package defpackage;

import android.text.SpannableStringBuilder;
public final class pi3 extends ww8 {
    public final byte f0 = 0;
    public final Object g0;

    public pi3(sxb sxbVar, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = sxbVar;
    }

    @Override
    public final float d() {
        byte b = this.f0;
        Object obj = this.g0;
        switch (b) {
            case 0:
                return ((mk3) obj).a.getViewOffset();
            default:
                return ((sxb) obj).O.m3;
        }
    }

    public pi3(String str, String str2, mk3 mk3Var) {
        super(str, str2);
        this.g0 = mk3Var;
    }
}
