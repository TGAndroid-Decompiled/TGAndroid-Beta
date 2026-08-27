package k2;

import android.animation.TypeEvaluator;

public final class f implements TypeEvaluator {

    public static final f f14353a = new f();

    @Override
    public final Object evaluate(float f10, Object obj, Object obj2) {
        int iIntValue = ((Integer) obj).intValue();
        float f11 = ((iIntValue >> 24) & 255) / 255.0f;
        int iIntValue2 = ((Integer) obj2).intValue();
        float f12 = ((iIntValue2 >> 24) & 255) / 255.0f;
        float fPow = (float) Math.pow(((iIntValue >> 16) & 255) / 255.0f, 2.2d);
        float fPow2 = (float) Math.pow(((iIntValue >> 8) & 255) / 255.0f, 2.2d);
        float fPow3 = (float) Math.pow((iIntValue & 255) / 255.0f, 2.2d);
        float fPow4 = (float) Math.pow(((iIntValue2 >> 16) & 255) / 255.0f, 2.2d);
        float fPow5 = (float) Math.pow(((iIntValue2 >> 8) & 255) / 255.0f, 2.2d);
        float fPow6 = (float) Math.pow((iIntValue2 & 255) / 255.0f, 2.2d);
        float fZ = com.google.android.recaptcha.internal.a.z(f12, f11, f10, f11);
        float fZ2 = com.google.android.recaptcha.internal.a.z(fPow4, fPow, f10, fPow);
        float fZ3 = com.google.android.recaptcha.internal.a.z(fPow5, fPow2, f10, fPow2);
        float fZ4 = com.google.android.recaptcha.internal.a.z(fPow6, fPow3, f10, fPow3);
        float fPow7 = ((float) Math.pow(fZ2, 0.45454545454545453d)) * 255.0f;
        float fPow8 = ((float) Math.pow(fZ3, 0.45454545454545453d)) * 255.0f;
        return Integer.valueOf(Math.round(((float) Math.pow(fZ4, 0.45454545454545453d)) * 255.0f) | (Math.round(fPow7) << 16) | (Math.round(fZ * 255.0f) << 24) | (Math.round(fPow8) << 8));
    }
}
