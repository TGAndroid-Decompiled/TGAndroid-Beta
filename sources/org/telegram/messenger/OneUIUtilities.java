package org.telegram.messenger;

import android.os.Build;
import java.lang.reflect.Field;

public class OneUIUtilities {
    public static final int ONE_UI_4_0 = 40000;
    private static Boolean isOneUI;
    private static int oneUIEncodedVersion;
    private static int oneUIMajorVersion;
    private static float oneUIMinorVersion;

    public static boolean isOneUI() {
        int intValue;
        Boolean bool = isOneUI;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Field declaredField = Build.VERSION.class.getDeclaredField("SEM_PLATFORM_INT");
            declaredField.setAccessible(true);
            intValue = ((Integer) declaredField.get(null)).intValue();
        } catch (Exception unused) {
            isOneUI = Boolean.FALSE;
        }
        if (intValue < 100000) {
            return false;
        }
        int i = intValue - 90000;
        oneUIEncodedVersion = i;
        oneUIMajorVersion = i / 10000;
        oneUIMinorVersion = (i % 10000) / 100.0f;
        isOneUI = Boolean.TRUE;
        return isOneUI.booleanValue();
    }

    public static boolean hasBuiltInClipboardToasts() {
        return isOneUI() && getOneUIEncodedVersion() == 40000;
    }

    public static int getOneUIMajorVersion() {
        if (isOneUI()) {
            return oneUIMajorVersion;
        }
        return 0;
    }

    public static int getOneUIEncodedVersion() {
        if (isOneUI()) {
            return oneUIEncodedVersion;
        }
        return 0;
    }

    public static float getOneUIMinorVersion() {
        if (isOneUI()) {
            return oneUIMinorVersion;
        }
        return 0.0f;
    }
}
