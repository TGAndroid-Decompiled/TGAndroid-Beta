package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f23824a;
    public String f23825b;
    public String f23826c;
    public boolean d;
    public final ArrayList f23827e = new ArrayList(4);
    public final ArrayList f23828f = new ArrayList(4);
    public final ArrayList f23829g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f23830i;
    public String f23831j;
    public boolean f23832k;
    public int f23833l;
    public TLRPC.User f23834m;

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
