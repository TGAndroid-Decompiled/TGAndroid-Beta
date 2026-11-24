package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
public final class nh5 {
    public final mh5 a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public nh5(mh5 mh5Var, String str, Uri uri, int i) {
        this.a = mh5Var;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public final yo5 a() {
        return yo5.q(this.b.keySet());
    }

    public final Uri b() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
