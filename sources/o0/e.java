package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class e implements Callable {
    public final int f16645a;
    public final String f16646b;
    public final Context f16647c;
    public final int d;
    public final Object f16648e;

    public e(String str, Context context, Object obj, int i10, int i11) {
        this.f16645a = i11;
        this.f16646b = str;
        this.f16647c = context;
        this.f16648e = obj;
        this.d = i10;
    }

    @Override
    public final Object call() {
        int i10 = this.f16645a;
        int i11 = this.d;
        Object obj = this.f16648e;
        Context context = this.f16647c;
        String str = this.f16646b;
        switch (i10) {
            case 0:
                Object[] objArr = {(d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return g.b(str, context, DesugarCollections.unmodifiableList(arrayList), i11);
            default:
                try {
                    return g.b(str, context, (List) obj, i11);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
