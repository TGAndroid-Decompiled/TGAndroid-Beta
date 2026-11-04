package org.telegram.messenger;

import java.util.HashMap;
public final class iz {
    public final HashMap f23616a = new HashMap();

    public iz(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.f23616a.put(split[0].trim(), split[1].trim());
            }
        }
    }
}
