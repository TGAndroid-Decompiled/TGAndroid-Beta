package defpackage;

import android.content.Intent;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.d;
public final class z52 implements t22 {
    public final p8c a;
    public final x31 b;
    public final d c;

    public z52(x31 x31Var, p8c p8cVar, d dVar) {
        this.a = p8cVar;
        this.b = x31Var;
        this.c = dVar;
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z, int i, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            this.a.a(new od8((String) arrayList.get(0)));
        }
        this.b.a(true);
    }

    @Override
    public final void m(ArrayList arrayList, boolean z, int i, long j) {
        if (!arrayList.isEmpty()) {
            this.a.a(new pd8((y3a) arrayList.get(0)));
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
            fa4.g(e, true);
        }
    }

    @Override
    public final void S() {
    }
}
