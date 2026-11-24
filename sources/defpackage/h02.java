package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class h02 implements t22 {
    public final x02 a;

    public h02(x02 x02Var) {
        this.a = x02Var;
    }

    @Override
    public final void S() {
        this.a.k1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        x02 x02Var = this.a;
        t22 t22Var = x02Var.R1;
        if (t22Var != null) {
            t22Var.k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
            return;
        }
        d dVar = x02Var.Z1;
        if (dVar instanceof t22) {
            ((t22) dVar).k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
        } else if (dVar instanceof vx7) {
            vx7 vx7Var = (vx7) dVar;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ?? obj = new Object();
                obj.c = (String) arrayList.get(i2);
                arrayList4.add(obj);
            }
            vx7Var.I1(arrayList4);
        }
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        x02 x02Var = this.a;
        t22 t22Var = x02Var.R1;
        if (t22Var != null) {
            t22Var.m(arrayList, z, i, j);
            return;
        }
        d dVar = x02Var.Z1;
        if (dVar instanceof mu1) {
            ((mu1) dVar).m(arrayList, z, i, j);
        } else if (dVar instanceof vx7) {
            ((vx7) dVar).I1(arrayList);
        }
    }

    @Override
    public final void z() {
        x02 x02Var = this.a;
        t22 t22Var = x02Var.R1;
        if (t22Var != null) {
            t22Var.z();
            return;
        }
        d dVar = x02Var.Z1;
        if (dVar instanceof t22) {
            ((t22) dVar).z();
        } else if (dVar instanceof vx7) {
            vx7 vx7Var = (vx7) dVar;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                vx7Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
