package defpackage;

import android.os.FileObserver;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public final class xi7 extends FileObserver {
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public final CopyOnWriteArrayList a;

    public xi7(String str) {
        super(str, 128);
        this.a = new CopyOnWriteArrayList();
    }

    @Override
    public final void onEvent(int i, String str) {
        for (rr4 rr4Var : this.a) {
            rr4Var.invoke(str);
        }
    }
}
