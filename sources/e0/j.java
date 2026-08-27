package e0;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

public final class j {

    public final IconCompat f5068a;

    public final CharSequence f5069b;

    public final PendingIntent f5070c;
    public boolean d;

    public final Bundle f5071e;

    public ArrayList f5072f;

    public int f5073g;
    public boolean h;

    public j(int i10, String str, PendingIntent pendingIntent) {
        IconCompat iconCompatE = i10 == 0 ? null : IconCompat.e(null, "", i10);
        Bundle bundle = new Bundle();
        this.d = true;
        this.h = true;
        this.f5068a = iconCompatE;
        this.f5069b = t.d(str);
        this.f5070c = pendingIntent;
        this.f5071e = bundle;
        this.f5072f = null;
        this.d = true;
        this.f5073g = 0;
        this.h = true;
    }

    public final void a(r0 r0Var) {
        if (this.f5072f == null) {
            this.f5072f = new ArrayList();
        }
        this.f5072f.add(r0Var);
    }

    public final k b() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f5072f;
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
        return new k(this.f5068a, this.f5069b, this.f5070c, this.f5071e, arrayList2.isEmpty() ? null : (r0[]) arrayList2.toArray(new r0[arrayList2.size()]), arrayList.isEmpty() ? null : (r0[]) arrayList.toArray(new r0[arrayList.size()]), this.d, this.f5073g, this.h);
    }

    public final void c() {
        this.d = true;
    }
}
