package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class s12 implements f42 {
    public final i22 a;

    public s12(i22 i22Var) {
        this.a = i22Var;
    }

    @Override
    public final void S() {
        this.a.k1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        i22 i22Var = this.a;
        f42 f42Var = i22Var.R1;
        if (f42Var != null) {
            f42Var.k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
            return;
        }
        d dVar = i22Var.Z1;
        if (dVar instanceof f42) {
            ((f42) dVar).k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
        } else if (dVar instanceof xz7) {
            xz7 xz7Var = (xz7) dVar;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ?? obj = new Object();
                obj.c = (String) arrayList.get(i2);
                arrayList4.add(obj);
            }
            xz7Var.J1(arrayList4);
        }
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        i22 i22Var = this.a;
        f42 f42Var = i22Var.R1;
        if (f42Var != null) {
            f42Var.m(arrayList, z, i, j);
            return;
        }
        d dVar = i22Var.Z1;
        if (dVar instanceof yv1) {
            ((yv1) dVar).m(arrayList, z, i, j);
        } else if (dVar instanceof xz7) {
            ((xz7) dVar).J1(arrayList);
        }
    }

    @Override
    public final void y() {
        i22 i22Var = this.a;
        f42 f42Var = i22Var.R1;
        if (f42Var != null) {
            f42Var.y();
            return;
        }
        d dVar = i22Var.Z1;
        if (dVar instanceof f42) {
            ((f42) dVar).y();
        } else if (dVar instanceof xz7) {
            xz7 xz7Var = (xz7) dVar;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                xz7Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
