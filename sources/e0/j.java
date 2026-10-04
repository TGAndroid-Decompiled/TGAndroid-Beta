package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class j {
    public final IconCompat f8429a;
    public final CharSequence f8430b;
    public final PendingIntent f8431c;
    public boolean d;
    public final Bundle f8432e;
    public ArrayList f8433f;
    public int f8434g;
    public boolean h;

    public j(int i10, String str, PendingIntent pendingIntent) {
        IconCompat e7;
        if (i10 == 0) {
            e7 = null;
        } else {
            e7 = IconCompat.e(null, "", i10);
        }
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.f8429a = e7;
        this.f8430b = t.d(str);
        this.f8431c = pendingIntent;
        this.f8432e = bundle;
        this.f8433f = null;
        this.d = true;
        this.f8434g = 0;
        this.h = true;
    }

    public final void a(r0 r0Var) {
        if (this.f8433f == null) {
            this.f8433f = new ArrayList();
        }
        this.f8433f.add(r0Var);
    }

    public final k b() {
        r0[] r0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f8433f;
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
        return new k(this.f8429a, this.f8430b, this.f8431c, this.f8432e, r0VarArr2, r0VarArr, this.d, this.f8434g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
