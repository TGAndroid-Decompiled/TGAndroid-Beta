package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f23860a;
    public String f23861b;
    public String f23862c;
    public boolean d;
    public final ArrayList f23863e = new ArrayList(4);
    public final ArrayList f23864f = new ArrayList(4);
    public final ArrayList f23865g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f23866i;
    public String f23867j;
    public boolean f23868k;
    public int f23869l;
    public TLRPC.User f23870m;

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
