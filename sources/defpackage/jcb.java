package defpackage;

import java.util.HashMap;
public final class jcb {
    public final HashMap a = new HashMap();

    public jcb(String str) {
        for (String str2 : str.split(";")) {
            String[] split = str2.split(":");
            if (split.length == 2) {
                this.a.put(split[0].trim(), split[1].trim());
            }
        }
    }
}
