package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class f5 {
    public int f23865a;
    public String f23866b;
    public String f23867c;
    public boolean d;
    public final ArrayList f23868e = new ArrayList(4);
    public final ArrayList f23869f = new ArrayList(4);
    public final ArrayList f23870g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String f23871i;
    public String f23872j;
    public boolean f23873k;
    public int f23874l;
    public TLRPC.User f23875m;

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
