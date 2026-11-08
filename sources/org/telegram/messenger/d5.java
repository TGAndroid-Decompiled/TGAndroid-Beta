package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d5 {
    public int f21986a;
    public String f21987b;
    public String f21988c;
    public boolean d;
    public final ArrayList f21989e = new ArrayList(4);
    public final ArrayList f21990f = new ArrayList(4);
    public final ArrayList f21991g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f21992i;
    public String f21993j;
    public boolean f21994k;
    public int f21995l;
    public TLRPC.User f21996m;

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
