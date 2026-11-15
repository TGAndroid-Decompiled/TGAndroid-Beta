package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d5 {
    public int f23039a;
    public String f23040b;
    public String f23041c;
    public boolean d;
    public final ArrayList f23042e = new ArrayList(4);
    public final ArrayList f23043f = new ArrayList(4);
    public final ArrayList f23044g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f23045i;
    public String f23046j;
    public boolean f23047k;
    public int f23048l;
    public TLRPC.User f23049m;

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
