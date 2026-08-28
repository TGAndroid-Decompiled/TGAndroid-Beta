package f7;

import android.content.Context;
import java.util.ArrayList;
public final class a9 implements b9 {
    public final ArrayList f5604a;

    public a9(Context context, z8 z8Var) {
        ArrayList arrayList = new ArrayList();
        this.f5604a = arrayList;
        z8Var.getClass();
        arrayList.add(new f9(context, z8Var));
    }

    @Override
    public final void a(a6.a aVar) {
        ArrayList arrayList = this.f5604a;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            ((b9) obj).a(aVar);
        }
    }
}
