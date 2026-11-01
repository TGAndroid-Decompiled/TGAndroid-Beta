package org.telegram.messenger;

import java.util.HashMap;
public final class c00 {
    public final HashMap f15047a = new HashMap();

    public c00(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.f15047a.put(split[0].trim(), split[1].trim());
            }
        }
    }
}
