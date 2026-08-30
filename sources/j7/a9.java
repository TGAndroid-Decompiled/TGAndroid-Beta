package j7;

import android.content.Context;
import java.util.ArrayList;
public final class a9 implements b9 {
    public final ArrayList f8947a;

    public a9(Context context, z8 z8Var) {
        ArrayList arrayList = new ArrayList();
        this.f8947a = arrayList;
        z8Var.getClass();
        arrayList.add(new f9(context, z8Var));
    }

    @Override
    public final void a(b4.e0 e0Var) {
        ArrayList arrayList = this.f8947a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((b9) obj).a(e0Var);
        }
    }
}
