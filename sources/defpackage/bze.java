package defpackage;

import android.content.Context;
import java.util.ArrayList;
public final class bze implements qze {
    public final ArrayList a;

    public bze(Context context, jye jyeVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        jyeVar.getClass();
        arrayList.add(new v0f(context, jyeVar));
    }

    @Override
    public final void a(ry ryVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((qze) obj).a(ryVar);
        }
    }
}
