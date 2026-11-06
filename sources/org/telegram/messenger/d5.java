package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d5 {
    public int f21956a;
    public String f21957b;
    public String f21958c;
    public boolean d;
    public final ArrayList f21959e = new ArrayList(4);
    public final ArrayList f21960f = new ArrayList(4);
    public final ArrayList f21961g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f21962i;
    public String f21963j;
    public boolean f21964k;
    public int f21965l;
    public TLRPC.User f21966m;

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
