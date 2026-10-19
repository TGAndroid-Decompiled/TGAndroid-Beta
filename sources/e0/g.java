package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
public final class g {
    public final IconCompat f8098a;
    public final CharSequence f8099b;
    public final PendingIntent f8100c;
    public boolean d;
    public final Bundle e;
    public ArrayList f8101f;
    public int f8102g;
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
        this.f8098a = e;
        this.f8099b = q.d(str);
        this.f8100c = pendingIntent;
        this.e = bundle;
        this.f8101f = null;
        this.d = true;
        this.f8102g = 0;
        this.h = true;
    }

    public final void a(o0 o0Var) {
        if (this.f8101f == null) {
            this.f8101f = new ArrayList();
        }
        this.f8101f.add(o0Var);
    }

    public final h b() {
        o0[] o0VarArr;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f8101f;
        if (arrayList3 != null) {
            int size = arrayList3.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList3.get(i10);
                i10++;
                o0 o0Var = (o0) obj;
                o0Var.getClass();
                arrayList2.add(o0Var);
            }
        }
        o0[] o0VarArr2 = null;
        if (arrayList.isEmpty()) {
            o0VarArr = null;
        } else {
            o0VarArr = (o0[]) arrayList.toArray(new o0[arrayList.size()]);
        }
        if (!arrayList2.isEmpty()) {
            o0VarArr2 = (o0[]) arrayList2.toArray(new o0[arrayList2.size()]);
        }
        return new h(this.f8098a, this.f8099b, this.f8100c, this.e, o0VarArr2, o0VarArr, this.d, this.f8102g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
