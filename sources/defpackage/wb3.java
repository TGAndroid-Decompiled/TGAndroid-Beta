package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class wb3 implements v84 {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final lx6 f = new lx6(new wa3((byte) 5));
    public static final lx6 h = new lx6(new wa3((byte) 6));
    public y79 a;
    public fgf b = new fgf((byte) 17);
    public boolean c;
    public boolean d;

    public final void a(int i, ArrayList arrayList) {
        switch (i) {
            case 0:
                arrayList.add(new e4());
                return;
            case 1:
                arrayList.add(new g4());
                return;
            case 2:
                arrayList.add(new kb(1));
                return;
            case 3:
                arrayList.add(new pk(1));
                return;
            case 4:
                s84 s = f.s(0);
                if (s != null) {
                    arrayList.add(s);
                    return;
                } else {
                    arrayList.add(new ek4());
                    return;
                }
            case 5:
                arrayList.add(new cn4());
                return;
            case 6:
                arrayList.add(new tl6(this.b, 0));
                return;
            case 7:
                arrayList.add(new kh7(1));
                return;
            case 8:
                fgf fgfVar = this.b;
                int g = 512 | er4.g(3);
                ko5 ko5Var = mo5.b;
                arrayList.add(new er4(fgfVar, g, null, y79.e, null));
                arrayList.add(new sh7(this.b, 160));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new jw8());
                return;
            case 11:
                if (this.a == null) {
                    ko5 ko5Var2 = mo5.b;
                    this.a = y79.e;
                }
                arrayList.add(new j4c(1, 0, this.b, new vqb(0L), new de(0, this.a, (byte) 6)));
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
                arrayList.add(new uf5(this.c ? 1 : 0, (byte) 1));
                return;
            case 15:
                s84 s2 = h.s(new Object[0]);
                if (s2 != null) {
                    arrayList.add(s2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new qd0(0, this.b));
                return;
            case 17:
                arrayList.add(new ym0((byte) 1));
                return;
            case 18:
                arrayList.add(new td0((byte) 1));
                return;
            case 19:
                arrayList.add(new ym0((byte) 0));
                return;
            case 20:
                arrayList.add(new uf5(this.d ? 1 : 0, (byte) 0));
                return;
            case 21:
                arrayList.add(new td0((byte) 0));
                return;
        }
    }

    @Override
    public final synchronized s84[] e(Uri uri, Map map) {
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
        int a = fie.a(str);
        if (a != -1) {
            a(a, arrayList);
        }
        int b = fie.b(uri);
        if (b != -1 && b != a) {
            a(b, arrayList);
        }
        for (int i = 0; i < 21; i++) {
            int i2 = iArr[i];
            if (i2 != a && i2 != b) {
                a(i2, arrayList);
            }
        }
        return (s84[]) arrayList.toArray(new s84[0]);
    }
}
