package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f15508a;
    public String f15509b;
    public String f15510c;
    public boolean d;
    public final ArrayList e = new ArrayList(4);
    public final ArrayList f15511f = new ArrayList(4);
    public final ArrayList f15512g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f15513i;
    public String f15514j;
    public boolean f15515k;
    public int f15516l;
    public TLRPC.User f15517m;

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
