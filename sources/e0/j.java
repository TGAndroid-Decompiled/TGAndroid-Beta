package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class j {
    public final IconCompat f4800a;
    public final CharSequence f4801b;
    public final PendingIntent f4802c;
    public boolean d;
    public final Bundle f4803e;
    public ArrayList f4804f;
    public int f4805g;
    public boolean h;

    public j(int i10, String str, PendingIntent pendingIntent) {
        IconCompat e6;
        if (i10 == 0) {
            e6 = null;
        } else {
            e6 = IconCompat.e(null, "", i10);
        }
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.f4800a = e6;
        this.f4801b = t.d(str);
        this.f4802c = pendingIntent;
        this.f4803e = bundle;
        this.f4804f = null;
        this.d = true;
        this.f4805g = 0;
        this.h = true;
    }

    public final void a(q0 q0Var) {
        if (this.f4804f == null) {
            this.f4804f = new ArrayList();
        }
        this.f4804f.add(q0Var);
    }

    public final k b() {
        q0[] q0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f4804f;
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
        return new k(this.f4800a, this.f4801b, this.f4802c, this.f4803e, q0VarArr2, q0VarArr, this.d, this.f4805g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
