package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class j {
    public final IconCompat f5681a;
    public final CharSequence f5682b;
    public final PendingIntent f5683c;
    public boolean d;
    public final Bundle f5684e;
    public ArrayList f5685f;
    public int f5686g;
    public boolean h;

    public j(int i10, String str, PendingIntent pendingIntent) {
        IconCompat e10;
        if (i10 == 0) {
            e10 = null;
        } else {
            e10 = IconCompat.e(null, "", i10);
        }
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.f5681a = e10;
        this.f5682b = t.d(str);
        this.f5683c = pendingIntent;
        this.f5684e = bundle;
        this.f5685f = null;
        this.d = true;
        this.f5686g = 0;
        this.h = true;
    }

    public final void a(r0 r0Var) {
        if (this.f5685f == null) {
            this.f5685f = new ArrayList();
        }
        this.f5685f.add(r0Var);
    }

    public final k b() {
        r0[] r0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f5685f;
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
        return new k(this.f5681a, this.f5682b, this.f5683c, this.f5684e, r0VarArr2, r0VarArr, this.d, this.f5686g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
