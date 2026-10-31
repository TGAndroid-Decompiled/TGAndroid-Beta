package org.telegram.messenger;

import java.util.HashMap;
public final class b00 {
    public final HashMap f14701a = new HashMap();

    public b00(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.f14701a.put(split[0].trim(), split[1].trim());
            }
        }
    }
}
