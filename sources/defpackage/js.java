package defpackage;

import android.animation.TypeEvaluator;
public final class js implements TypeEvaluator {
    public static final js a = new Object();

    @Override
    public final Object evaluate(float f, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f2 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        return Integer.valueOf((Math.round(qd4.A(((intValue2 >> 24) & 255) / 255.0f, f2, f, f2) * 255.0f) << 24) | (Math.round(((float) Math.pow(qd4.A(pow4, pow, f, pow), 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(((float) Math.pow(qd4.A((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f, pow2), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(qd4.A((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f, pow3), 0.45454545454545453d)) * 255.0f));
    }
}
