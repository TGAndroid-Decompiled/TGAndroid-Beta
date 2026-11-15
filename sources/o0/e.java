package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class e implements Callable {
    public final int f21203a;
    public final String f21204b;
    public final Context f21205c;
    public final int d;
    public final Object f21206e;

    public e(String str, Context context, Object obj, int i7, int i10) {
        this.f21203a = i10;
        this.f21204b = str;
        this.f21205c = context;
        this.f21206e = obj;
        this.d = i7;
    }

    @Override
    public final Object call() {
        int i7 = this.f21203a;
        int i10 = this.d;
        Object obj = this.f21206e;
        Context context = this.f21205c;
        String str = this.f21204b;
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
