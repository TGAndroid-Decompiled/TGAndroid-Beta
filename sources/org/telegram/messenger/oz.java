package org.telegram.messenger;

import java.util.HashMap;
public final class oz {
    public final HashMap f25834a = new HashMap();

    public oz(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.f25834a.put(split[0].trim(), split[1].trim());
            }
        }
    }
}
