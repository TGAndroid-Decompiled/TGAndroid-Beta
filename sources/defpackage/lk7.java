package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class lk7 {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public boolean d;
    public final Bundle e;
    public ArrayList f;
    public byte g;
    public boolean h;

    public lk7(int i, PendingIntent pendingIntent, String str) {
        IconCompat e;
        if (i == 0) {
            e = null;
        } else {
            e = IconCompat.e(null, "", i);
        }
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.a = e;
        this.b = xk7.c(str);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = (byte) 0;
        this.h = true;
    }

    public final void a(g69 g69Var) {
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f = arrayList;
        }
        arrayList.add(g69Var);
    }

    public final mk7 b() {
        g69[] g69VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                g69 g69Var = (g69) obj;
                g69Var.getClass();
                arrayList2.add(g69Var);
            }
        }
        if (!arrayList.isEmpty()) {
            g69[] g69VarArr2 = (g69[]) arrayList.toArray(new g69[arrayList.size()]);
        }
        if (arrayList2.isEmpty()) {
            g69VarArr = null;
        } else {
            g69VarArr = (g69[]) arrayList2.toArray(new g69[arrayList2.size()]);
        }
        return new mk7(this.a, this.b, this.c, this.e, g69VarArr, this.d, this.g, this.h);
    }
}
