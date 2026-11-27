package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class kn7 {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public boolean d;
    public final Bundle e;
    public ArrayList f;
    public byte g;
    public boolean h;

    public kn7(int i, PendingIntent pendingIntent, String str) {
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
        this.b = wn7.c(str);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = (byte) 0;
        this.h = true;
    }

    public final void a(t99 t99Var) {
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f = arrayList;
        }
        arrayList.add(t99Var);
    }

    public final ln7 b() {
        t99[] t99VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                t99 t99Var = (t99) obj;
                t99Var.getClass();
                arrayList2.add(t99Var);
            }
        }
        if (!arrayList.isEmpty()) {
            t99[] t99VarArr2 = (t99[]) arrayList.toArray(new t99[arrayList.size()]);
        }
        if (arrayList2.isEmpty()) {
            t99VarArr = null;
        } else {
            t99VarArr = (t99[]) arrayList2.toArray(new t99[arrayList2.size()]);
        }
        return new ln7(this.a, this.b, this.c, this.e, t99VarArr, this.d, this.g, this.h);
    }
}
