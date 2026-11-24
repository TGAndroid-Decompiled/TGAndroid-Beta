package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class ka3 implements m74 {
    public static final int[] e = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14, 17, 18, 19, 20, 21};
    public static final tg2 f = new tg2(new k93((byte) 4));
    public static final tg2 h = new tg2(new k93((byte) 5));
    public w59 a;
    public eef b = new eef((byte) 17);
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
                arrayList.add(new pj(1));
                return;
            case 4:
                j74 I = f.I(0);
                if (I != null) {
                    arrayList.add(I);
                    return;
                } else {
                    arrayList.add(new ai4());
                    return;
                }
            case 5:
                arrayList.add(new cl4());
                return;
            case 6:
                arrayList.add(new qj6(this.b, 0));
                return;
            case 7:
                arrayList.add(new hf7(1));
                return;
            case 8:
                eef eefVar = this.b;
                int g = 512 | dp4.g(3);
                km5 km5Var = mm5.b;
                arrayList.add(new dp4(eefVar, g, null, w59.e, null));
                arrayList.add(new pf7(this.b, 160));
                return;
            case 9:
                arrayList.add(new Object());
                return;
            case 10:
                arrayList.add(new iu8());
                return;
            case 11:
                if (this.a == null) {
                    km5 km5Var2 = mm5.b;
                    this.a = w59.e;
                }
                arrayList.add(new j2c(1, 0, this.b, new uob(0L), new dd(0, this.a, (byte) 6)));
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
                arrayList.add(new wd5(this.c ? 1 : 0, (byte) 1));
                return;
            case 15:
                j74 I2 = h.I(new Object[0]);
                if (I2 != null) {
                    arrayList.add(I2);
                    return;
                }
                return;
            case 16:
                arrayList.add(new qc0(0, this.b));
                return;
            case 17:
                arrayList.add(new yl0((byte) 1));
                return;
            case 18:
                arrayList.add(new tc0((byte) 1));
                return;
            case 19:
                arrayList.add(new yl0((byte) 0));
                return;
            case 20:
                arrayList.add(new wd5(this.d ? 1 : 0, (byte) 0));
                return;
            case 21:
                arrayList.add(new tc0((byte) 0));
                return;
        }
    }

    @Override
    public final synchronized j74[] f(Uri uri, Map map) {
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
        int a = ege.a(str);
        if (a != -1) {
            a(a, arrayList);
        }
        int b = ege.b(uri);
        if (b != -1 && b != a) {
            a(b, arrayList);
        }
        for (int i = 0; i < 21; i++) {
            int i2 = iArr[i];
            if (i2 != a && i2 != b) {
                a(i2, arrayList);
            }
        }
        return (j74[]) arrayList.toArray(new j74[0]);
    }
}
