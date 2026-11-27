package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class db3 implements h84 {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final lh2 f = new lh2(new da3((byte) 10));
    public static final lh2 h = new lh2(new da3((byte) 11));
    public j99 a;
    public uif b = new uif((byte) 17);
    public boolean c;
    public boolean d;

    public final void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new f4());
                return;
            case 1:
                arrayList.add(new h4());
                return;
            case 2:
                arrayList.add(new lb(1));
                return;
            case 3:
                arrayList.add(new qj(1));
                return;
            case 4:
                e84 s = f.s(0);
                if (s != null) {
                    arrayList.add(s);
                    return;
                } else {
                    arrayList.add(new ek4());
                    return;
                }
            case 5:
                arrayList.add(new hn4());
                return;
            case 6:
                arrayList.add(new vl6(this.b, 0));
                return;
            case 7:
                arrayList.add(new rh7(1));
                return;
            case 8:
                uif uifVar = this.b;
                int g = 512 | hr4.g(3);
                no5 no5Var = po5.b;
                arrayList.add(new hr4(uifVar, g, null, j99.e, null));
                arrayList.add(new zh7(this.b, 160));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new rx8());
                return;
            case 11:
                if (this.a == null) {
                    no5 no5Var2 = po5.b;
                    this.a = j99.e;
                }
                arrayList.add(new j6c(1, 0, this.b, new usb(0L), new ed(0, this.a, (byte) 6)));
                return;
            case 12:
                ?? obj = new Object();
                obj.c = (byte) 0;
                obj.d = -1L;
                obj.f = -1;
                obj.g = -1L;
                arrayList.add(obj);
                return;
            case 13:
            default:
                return;
            case 14:
                arrayList.add(new xf5(this.c ? 1 : 0, (byte) 1));
                return;
            case 15:
                e84 s2 = h.s(new Object[0]);
                if (s2 != null) {
                    arrayList.add(s2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new sc0(0, this.b));
                return;
            case 17:
                arrayList.add(new zl0((byte) 1));
                return;
            case 18:
                arrayList.add(new vc0((byte) 1));
                return;
            case 19:
                arrayList.add(new zl0((byte) 0));
                return;
            case 20:
                arrayList.add(new xf5(this.d ? 1 : 0, (byte) 0));
                return;
            case 21:
                arrayList.add(new vc0((byte) 0));
                return;
        }
    }

    @Override
    public final synchronized e84[] b(Uri uri, Map map) {
        ArrayList arrayList;
        String str;
        int[] iArr = e;
        arrayList = new ArrayList(21);
        List list = (List) map.get("Content-Type");
        if (list != null && !list.isEmpty()) {
            str = (String) list.get(0);
        } else {
            str = null;
        }
        int a = zke.a(str);
        if (a != -1) {
            a(a, arrayList);
        }
        int b = zke.b(uri);
        if (b != -1 && b != a) {
            a(b, arrayList);
        }
        for (int i = 0; i < 21; i++) {
            int i2 = iArr[i];
            if (i2 != a && i2 != b) {
                a(i2, arrayList);
            }
        }
        return (e84[]) arrayList.toArray(new e84[0]);
    }
}
