package org.scilab.forge.jlatexmath;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public abstract class ParseOption {
    public static final Map parseMap(String str) {
        HashMap map = new HashMap();
        if (str != null && str.length() != 0) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, ",");
            while (stringTokenizer.hasMoreTokens()) {
                String[] strArrSplit = stringTokenizer.nextToken().trim().split("=");
                if (strArrSplit != null) {
                    if (strArrSplit.length == 2) {
                        map.put(strArrSplit[0].trim(), strArrSplit[1].trim());
                    } else if (strArrSplit.length == 1) {
                        map.put(strArrSplit[0].trim(), null);
                    }
                }
            }
        }
        return map;
    }
}
