package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f15692a;
    public String f15693b;
    public String f15694c;
    public boolean d;
    public final ArrayList e = new ArrayList(4);
    public final ArrayList f15695f = new ArrayList(4);
    public final ArrayList f15696g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f15697i;
    public String f15698j;
    public boolean f15699k;
    public int f15700l;
    public TLRPC.User f15701m;

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
