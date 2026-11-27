package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public final class x02 implements k32 {
    public final n12 a;

    public x02(n12 n12Var) {
        this.a = n12Var;
    }

    @Override
    public final void S() {
        this.a.l1(true);
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        n12 n12Var = this.a;
        k32 k32Var = n12Var.R1;
        if (k32Var != null) {
            k32Var.k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
            return;
        }
        e eVar = n12Var.Z1;
        if (eVar instanceof k32) {
            ((k32) eVar).k(arrayList, str, arrayList2, arrayList3, z, i, j, z2, j2);
        } else if (eVar instanceof b18) {
            b18 b18Var = (b18) eVar;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ?? obj = new Object();
                obj.c = (String) arrayList.get(i2);
                arrayList4.add(obj);
            }
            b18Var.J1(arrayList4);
        }
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        n12 n12Var = this.a;
        k32 k32Var = n12Var.R1;
        if (k32Var != null) {
            k32Var.m(arrayList, z, i, j);
            return;
        }
        e eVar = n12Var.Z1;
        if (eVar instanceof zu1) {
            ((zu1) eVar).m(arrayList, z, i, j);
        } else if (eVar instanceof b18) {
            ((b18) eVar).J1(arrayList);
        }
    }

    @Override
    public final void z() {
        n12 n12Var = this.a;
        k32 k32Var = n12Var.R1;
        if (k32Var != null) {
            k32Var.z();
            return;
        }
        e eVar = n12Var.Z1;
        if (eVar instanceof k32) {
            ((k32) eVar).z();
        } else if (eVar instanceof b18) {
            b18 b18Var = (b18) eVar;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                b18Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
