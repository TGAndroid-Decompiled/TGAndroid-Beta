package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class om7 {
    public final IconCompat a;
    public final CharSequence b;
    public final PendingIntent c;
    public boolean d;
    public final Bundle e;
    public ArrayList f;
    public byte g;
    public boolean h;

    public om7(int i, PendingIntent pendingIntent, String str) {
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
        this.b = an7.c(str);
        this.c = pendingIntent;
        this.e = bundle;
        this.f = null;
        this.d = true;
        this.g = (byte) 0;
        this.h = true;
    }

    public final void a(i89 i89Var) {
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f = arrayList;
        }
        arrayList.add(i89Var);
    }

    public final pm7 b() {
        i89[] i89VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList3.get(i);
                i++;
                i89 i89Var = (i89) obj;
                i89Var.getClass();
                arrayList2.add(i89Var);
            }
        }
        if (!arrayList.isEmpty()) {
            i89[] i89VarArr2 = (i89[]) arrayList.toArray(new i89[arrayList.size()]);
        }
        if (arrayList2.isEmpty()) {
            i89VarArr = null;
        } else {
            i89VarArr = (i89[]) arrayList2.toArray(new i89[arrayList2.size()]);
        }
        return new pm7(this.a, this.b, this.c, this.e, i89VarArr, this.d, this.g, this.h);
    }
}
