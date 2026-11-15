package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class d5 {
    public int f23031a;
    public String f23032b;
    public String f23033c;
    public boolean d;
    public final ArrayList f23034e = new ArrayList(4);
    public final ArrayList f23035f = new ArrayList(4);
    public final ArrayList f23036g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f23037i;
    public String f23038j;
    public boolean f23039k;
    public int f23040l;
    public TLRPC.User f23041m;

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
