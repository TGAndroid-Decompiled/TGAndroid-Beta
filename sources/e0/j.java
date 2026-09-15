package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class j {
    public final IconCompat f7787a;
    public final CharSequence f7788b;
    public final PendingIntent f7789c;
    public boolean d;
    public final Bundle e;
    public ArrayList f7790f;
    public int f7791g;
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
        this.f7787a = e;
        this.f7788b = t.d(str);
        this.f7789c = pendingIntent;
        this.e = bundle;
        this.f7790f = null;
        this.d = true;
        this.f7791g = 0;
        this.h = true;
    }

    public final void a(r0 r0Var) {
        if (this.f7790f == null) {
            this.f7790f = new ArrayList();
        }
        this.f7790f.add(r0Var);
    }

    public final k b() {
        r0[] r0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f7790f;
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
        return new k(this.f7787a, this.f7788b, this.f7789c, this.e, r0VarArr2, r0VarArr, this.d, this.f7791g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
