package defpackage;

import android.os.FileObserver;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public final class ug7 extends FileObserver {
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public final CopyOnWriteArrayList a;

    public ug7(String str) {
        super(str, 128);
        this.a = new CopyOnWriteArrayList();
    }

    @Override
    public final void onEvent(int i, String str) {
        for (qp4 qp4Var : this.a) {
            qp4Var.invoke(str);
        }
    }
}
