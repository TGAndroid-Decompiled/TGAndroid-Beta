package k2;

import android.animation.TypeEvaluator;
public final class f implements TypeEvaluator {
    public static final f f13344a = new Object();

    @Override
    public final Object evaluate(float f9, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f10 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float z10 = com.google.android.recaptcha.internal.a.z(((intValue2 >> 24) & 255) / 255.0f, f10, f9, f10);
        float z11 = com.google.android.recaptcha.internal.a.z(pow4, pow, f9, pow);
        float z12 = com.google.android.recaptcha.internal.a.z((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f9, pow2);
        float z13 = com.google.android.recaptcha.internal.a.z((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f9, pow3);
        int round = Math.round(((float) Math.pow(z11, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(z13, 0.45454545454545453d)) * 255.0f) | round | (Math.round(z10 * 255.0f) << 24) | (Math.round(((float) Math.pow(z12, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
