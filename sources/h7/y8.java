package h7;

import android.content.Context;
import java.util.ArrayList;
public final class y8 implements z8 {
    public final ArrayList f7853a;

    public y8(Context context, x8 x8Var) {
        ArrayList arrayList = new ArrayList();
        this.f7853a = arrayList;
        x8Var.getClass();
        arrayList.add(new d9(context, x8Var));
    }

    @Override
    public final void a(ag.j2 j2Var) {
        ArrayList arrayList = this.f7853a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((z8) obj).a(j2Var);
        }
    }
}
