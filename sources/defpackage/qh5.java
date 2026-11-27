package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
public final class qh5 {
    public final ph5 a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public qh5(ph5 ph5Var, String str, Uri uri, int i) {
        this.a = ph5Var;
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

    public final bp5 a() {
        return bp5.q(this.b.keySet());
    }

    public final Uri b() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
