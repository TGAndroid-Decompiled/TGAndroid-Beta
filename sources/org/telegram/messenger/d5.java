package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d5 {
    public int f21990a;
    public String f21991b;
    public String f21992c;
    public boolean d;
    public final ArrayList f21993e = new ArrayList(4);
    public final ArrayList f21994f = new ArrayList(4);
    public final ArrayList f21995g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f21996i;
    public String f21997j;
    public boolean f21998k;
    public int f21999l;
    public TLRPC.User f22000m;

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
