package org.telegram.messenger;

import java.util.HashMap;
public final class jz {
    public final HashMap f25055a = new HashMap();

    public jz(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.f25055a.put(split[0].trim(), split[1].trim());
            }
        }
    }
}
