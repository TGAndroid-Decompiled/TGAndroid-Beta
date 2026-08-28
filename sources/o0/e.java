package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class e implements Callable {
    public final int f18754a;
    public final String f18755b;
    public final Context f18756c;
    public final int d;
    public final Object f18757e;

    public e(String str, Context context, Object obj, int i9, int i10) {
        this.f18754a = i10;
        this.f18755b = str;
        this.f18756c = context;
        this.f18757e = obj;
        this.d = i9;
    }

    @Override
    public final Object call() {
        int i9 = this.f18754a;
        int i10 = this.d;
        Object obj = this.f18757e;
        Context context = this.f18756c;
        String str = this.f18755b;
        switch (i9) {
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
