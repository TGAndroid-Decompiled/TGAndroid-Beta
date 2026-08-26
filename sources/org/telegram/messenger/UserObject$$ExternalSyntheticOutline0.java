package org.telegram.messenger;

import org.telegram.PhoneFormat.PhoneFormat;

public abstract class UserObject$$ExternalSyntheticOutline0 {
    public static String m(StringBuilder sb, String str, PhoneFormat phoneFormat) {
        sb.append(str);
        return phoneFormat.format(sb.toString());
    }
}
