package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f23837a;
    public String f23838b;
    public String f23839c;
    public boolean d;
    public final ArrayList f23840e = new ArrayList(4);
    public final ArrayList f23841f = new ArrayList(4);
    public final ArrayList f23842g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f23843i;
    public String f23844j;
    public boolean f23845k;
    public int f23846l;
    public TLRPC.User f23847m;

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
