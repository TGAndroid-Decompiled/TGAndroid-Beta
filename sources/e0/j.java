package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class j {
    public final IconCompat f4983a;
    public final CharSequence f4984b;
    public final PendingIntent f4985c;
    public boolean d;
    public final Bundle e;
    public ArrayList f4986f;
    public int f4987g;
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
        this.f4983a = e;
        this.f4984b = t.d(str);
        this.f4985c = pendingIntent;
        this.e = bundle;
        this.f4986f = null;
        this.d = true;
        this.f4987g = 0;
        this.h = true;
    }

    public final void a(q0 q0Var) {
        if (this.f4986f == null) {
            this.f4986f = new ArrayList();
        }
        this.f4986f.add(q0Var);
    }

    public final k b() {
        q0[] q0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f4986f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                arrayList2.add(q0Var);
            }
        }
        q0[] q0VarArr2 = null;
        if (arrayList.isEmpty()) {
            q0VarArr = null;
        } else {
            q0VarArr = (q0[]) arrayList.toArray(new q0[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            q0VarArr2 = (q0[]) arrayList2.toArray(new q0[arrayList2.size()]);
        }
        return new k(this.f4983a, this.f4984b, this.f4985c, this.e, q0VarArr2, q0VarArr, this.d, this.f4987g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
