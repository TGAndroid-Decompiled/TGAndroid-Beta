package org.telegram.messenger;

import java.util.HashMap;
public final class qz {
    public final HashMap f25186a = new HashMap();

    public qz(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.f25186a.put(split[0].trim(), split[1].trim());
            }
        }
    }
}
