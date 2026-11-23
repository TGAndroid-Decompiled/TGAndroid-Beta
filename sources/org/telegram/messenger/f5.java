package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f23948a;
    public String f23949b;
    public String f23950c;
    public boolean d;
    public final ArrayList f23951e = new ArrayList(4);
    public final ArrayList f23952f = new ArrayList(4);
    public final ArrayList f23953g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f23954i;
    public String f23955j;
    public boolean f23956k;
    public int f23957l;
    public TLRPC.User f23958m;

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
