package defpackage;

import android.text.SpannableStringBuilder;
public final class xh3 extends ey8 {
    public final byte f0 = 0;
    public final Object g0;

    public xh3(tzb tzbVar, SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2) {
        super(spannableStringBuilder, spannableStringBuilder2);
        this.g0 = tzbVar;
    }

    @Override
    public final float d() {
        byte b = this.f0;
        Object obj = this.g0;
        switch (b) {
            case 0:
                return ((tj3) obj).a.getViewOffset();
            default:
                return ((tzb) obj).O.m3;
        }
    }

    public xh3(String str, String str2, tj3 tj3Var) {
        super(str, str2);
        this.g0 = tj3Var;
    }
}
