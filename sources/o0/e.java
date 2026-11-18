package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class e implements Callable {
    public final int f21570a;
    public final String f21571b;
    public final Context f21572c;
    public final int d;
    public final Object f21573e;

    public e(String str, Context context, Object obj, int i7, int i10) {
        this.f21570a = i10;
        this.f21571b = str;
        this.f21572c = context;
        this.f21573e = obj;
        this.d = i7;
    }

    @Override
    public final Object call() {
        int i7 = this.f21570a;
        int i10 = this.d;
        Object obj = this.f21573e;
        Context context = this.f21572c;
        String str = this.f21571b;
        switch (i7) {
            case 0:
                Object[] objArr = {(d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return g.b(str, context, DesugarCollections.unmodifiableList(arrayList), i10);
            default:
                try {
                    return g.b(str, context, (List) obj, i10);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
