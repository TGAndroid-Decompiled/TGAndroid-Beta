package org.telegram.messenger.utils.tlutils;

public abstract class TlUtils {
    public static boolean isInstance(Object obj, Class... clsArr) {
        if (obj != null && clsArr != null) {
            for (Class cls : clsArr) {
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }
}
