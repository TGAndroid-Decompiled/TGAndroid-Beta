package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class tn4 implements Callable {
    public final byte a;
    public final String b;
    public final Context c;
    public final int d;
    public final Object e;

    public tn4(String str, Context context, Object obj, int i, byte b) {
        this.a = b;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i;
    }

    @Override
    public final Object call() {
        byte b = this.a;
        int i = this.d;
        Object obj = this.e;
        Context context = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                Object[] objArr = {(pn4) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return wn4.b(str, context, DesugarCollections.unmodifiableList(arrayList), i);
            default:
                try {
                    return wn4.b(str, context, (List) obj, i);
                } catch (Throwable unused) {
                    return new vn4(-3);
                }
        }
    }
}
