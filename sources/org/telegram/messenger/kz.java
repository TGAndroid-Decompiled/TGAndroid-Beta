package org.telegram.messenger;

import java.util.HashMap;
public final class kz {
    public final HashMap f25330a = new HashMap();

    public kz(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.f25330a.put(split[0].trim(), split[1].trim());
            }
        }
    }
}
