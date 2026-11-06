package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d5 {
    public int f21963a;
    public String f21964b;
    public String f21965c;
    public boolean d;
    public final ArrayList f21966e = new ArrayList(4);
    public final ArrayList f21967f = new ArrayList(4);
    public final ArrayList f21968g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f21969i;
    public String f21970j;
    public boolean f21971k;
    public int f21972l;
    public TLRPC.User f21973m;

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
