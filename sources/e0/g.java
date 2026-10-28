package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class g {
    public final IconCompat f9535a;
    public final CharSequence f9536b;
    public final PendingIntent f9537c;
    public boolean d;
    public final Bundle e;
    public ArrayList f9538f;
    public int f9539g;
    public boolean h;

    public g(int i10, String str, PendingIntent pendingIntent) {
        IconCompat e;
        if (i10 == 0) {
            e = null;
        } else {
            e = IconCompat.e(null, "", i10);
        }
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.f9535a = e;
        this.f9536b = q.d(str);
        this.f9537c = pendingIntent;
        this.e = bundle;
        this.f9538f = null;
        this.d = true;
        this.f9539g = 0;
        this.h = true;
    }

    public final void a(n0 n0Var) {
        if (this.f9538f == null) {
            this.f9538f = new ArrayList();
        }
        this.f9538f.add(n0Var);
    }

    public final h b() {
        n0[] n0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f9538f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                n0 n0Var = (n0) obj;
                n0Var.getClass();
                arrayList2.add(n0Var);
            }
        }
        n0[] n0VarArr2 = null;
        if (arrayList.isEmpty()) {
            n0VarArr = null;
        } else {
            n0VarArr = (n0[]) arrayList.toArray(new n0[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            n0VarArr2 = (n0[]) arrayList2.toArray(new n0[arrayList2.size()]);
        }
        return new h(this.f9535a, this.f9536b, this.f9537c, this.e, n0VarArr2, n0VarArr, this.d, this.f9539g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
