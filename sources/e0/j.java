package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class j {
    public final IconCompat f7776a;
    public final CharSequence f7777b;
    public final PendingIntent f7778c;
    public boolean d;
    public final Bundle e;
    public ArrayList f7779f;
    public int f7780g;
    public boolean h;

    public j(int i10, String str, PendingIntent pendingIntent) {
        IconCompat e;
        if (i10 == 0) {
            e = null;
        } else {
            e = IconCompat.e(null, "", i10);
        }
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.f7776a = e;
        this.f7777b = t.d(str);
        this.f7778c = pendingIntent;
        this.e = bundle;
        this.f7779f = null;
        this.d = true;
        this.f7780g = 0;
        this.h = true;
    }

    public final void a(r0 r0Var) {
        if (this.f7779f == null) {
            this.f7779f = new ArrayList();
        }
        this.f7779f.add(r0Var);
    }

    public final k b() {
        r0[] r0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f7779f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                r0 r0Var = (r0) obj;
                r0Var.getClass();
                arrayList2.add(r0Var);
            }
        }
        r0[] r0VarArr2 = null;
        if (arrayList.isEmpty()) {
            r0VarArr = null;
        } else {
            r0VarArr = (r0[]) arrayList.toArray(new r0[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            r0VarArr2 = (r0[]) arrayList2.toArray(new r0[arrayList2.size()]);
        }
        return new k(this.f7776a, this.f7777b, this.f7778c, this.e, r0VarArr2, r0VarArr, this.d, this.f7780g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
