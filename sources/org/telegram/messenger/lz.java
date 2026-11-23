package org.telegram.messenger;

import java.util.HashMap;
public final class lz {
    public final HashMap f25496a = new HashMap();

    public lz(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.f25496a.put(split[0].trim(), split[1].trim());
            }
        }
    }
}
