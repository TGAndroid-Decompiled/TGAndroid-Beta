package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class h {
    public final IconCompat f8415a;
    public final CharSequence f8416b;
    public final PendingIntent f8417c;
    public boolean d;
    public final Bundle f8418e;
    public ArrayList f8419f;
    public int f8420g;
    public boolean h;

    public h(int i10, String str, PendingIntent pendingIntent) {
        IconCompat e7;
        if (i10 == 0) {
            e7 = null;
        } else {
            e7 = IconCompat.e(null, "", i10);
        }
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.f8415a = e7;
        this.f8416b = r.d(str);
        this.f8417c = pendingIntent;
        this.f8418e = bundle;
        this.f8419f = null;
        this.d = true;
        this.f8420g = 0;
        this.h = true;
    }

    public final void a(p0 p0Var) {
        if (this.f8419f == null) {
            this.f8419f = new ArrayList();
        }
        this.f8419f.add(p0Var);
    }

    public final i b() {
        p0[] p0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f8419f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                p0 p0Var = (p0) obj;
                p0Var.getClass();
                arrayList2.add(p0Var);
            }
        }
        p0[] p0VarArr2 = null;
        if (arrayList.isEmpty()) {
            p0VarArr = null;
        } else {
            p0VarArr = (p0[]) arrayList.toArray(new p0[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            p0VarArr2 = (p0[]) arrayList2.toArray(new p0[arrayList2.size()]);
        }
        return new i(this.f8415a, this.f8416b, this.f8417c, this.f8418e, p0VarArr2, p0VarArr, this.d, this.f8420g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
