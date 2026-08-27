package g7;

import android.content.Context;
import java.util.ArrayList;

public final class z8 implements a9 {

    public final ArrayList f6711a;

    public z8(Context context, y8 y8Var) {
        ArrayList arrayList = new ArrayList();
        this.f6711a = arrayList;
        y8Var.getClass();
        arrayList.add(new e9(context, y8Var));
    }

    @Override
    public final void a(b6.a aVar) {
        ArrayList arrayList = this.f6711a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((a9) obj).a(aVar);
        }
    }
}
