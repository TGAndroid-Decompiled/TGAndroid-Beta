package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d5 {
    public int f22147a;
    public String f22148b;
    public String f22149c;
    public boolean d;
    public final ArrayList f22150e = new ArrayList(4);
    public final ArrayList f22151f = new ArrayList(4);
    public final ArrayList f22152g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f22153i;
    public String f22154j;
    public boolean f22155k;
    public int f22156l;
    public TLRPC.User f22157m;

    public static String a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            return str.substring(0, 1);
        }
        if (!TextUtils.isEmpty(str2)) {
            return str2.substring(0, 1);
        }
        return "#";
    }
}
