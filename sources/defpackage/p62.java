package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.e;
public final class p62 implements k32 {
    public final pcc a;
    public final f41 b;
    public final e c;

    public p62(f41 f41Var, pcc pccVar, e eVar) {
        this.a = pccVar;
        this.b = f41Var;
        this.c = eVar;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            this.a.a(new ch8((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        if (!arrayList.isEmpty()) {
            this.a.a(new dh8((q7a) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override
    public final void z() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("*/*");
            this.c.getParentActivity().startActivityForResult(intent, 28);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void S() {
    }
}
