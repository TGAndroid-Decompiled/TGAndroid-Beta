package k2;

import android.animation.TypeEvaluator;
public final class f implements TypeEvaluator {
    public static final f f10354a = new Object();

    @Override
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f11 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float w10 = e2.c.w(((intValue2 >> 24) & 255) / 255.0f, f11, f10, f11);
        float w11 = e2.c.w(pow4, pow, f10, pow);
        float w12 = e2.c.w((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f10, pow2);
        float w13 = e2.c.w((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f10, pow3);
        int round = Math.round(((float) Math.pow(w11, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(w13, 0.45454545454545453d)) * 255.0f) | round | (Math.round(w10 * 255.0f) << 24) | (Math.round(((float) Math.pow(w12, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
