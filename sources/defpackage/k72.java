package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class k72 implements f42 {
    public final qac a;
    public final e51 b;
    public final d c;

    public k72(e51 e51Var, qac qacVar, d dVar) {
        this.a = qacVar;
        this.b = e51Var;
        this.c = dVar;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            this.a.a(new qf8((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        if (!arrayList.isEmpty()) {
            this.a.a(new rf8((z5a) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void S() {
    }
}
