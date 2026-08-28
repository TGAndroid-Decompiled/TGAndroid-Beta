package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class j {
    public final IconCompat f4711a;
    public final CharSequence f4712b;
    public final PendingIntent f4713c;
    public boolean d;
    public final Bundle f4714e;
    public ArrayList f4715f;
    public int f4716g;
    public boolean h;

    public j(int i9, String str, PendingIntent pendingIntent) {
        IconCompat e10;
        if (i9 == 0) {
            e10 = null;
        } else {
            e10 = IconCompat.e(null, "", i9);
        }
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.f4711a = e10;
        this.f4712b = t.d(str);
        this.f4713c = pendingIntent;
        this.f4714e = bundle;
        this.f4715f = null;
        this.d = true;
        this.f4716g = 0;
        this.h = true;
    }

    public final void a(r0 r0Var) {
        if (this.f4715f == null) {
            this.f4715f = new ArrayList();
        }
        this.f4715f.add(r0Var);
    }

    public final k b() {
        r0[] r0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f4715f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList3.get(i9);
                i9++;
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
        return new k(this.f4711a, this.f4712b, this.f4713c, this.f4714e, r0VarArr2, r0VarArr, this.d, this.f4716g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
