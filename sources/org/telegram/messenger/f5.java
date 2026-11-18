package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f23840a;
    public String f23841b;
    public String f23842c;
    public boolean d;
    public final ArrayList f23843e = new ArrayList(4);
    public final ArrayList f23844f = new ArrayList(4);
    public final ArrayList f23845g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f23846i;
    public String f23847j;
    public boolean f23848k;
    public int f23849l;
    public TLRPC.User f23850m;

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
