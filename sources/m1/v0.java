package m1;

import android.os.FileObserver;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public final class v0 extends FileObserver {
    public static final Object f20542b = new Object();
    public static final LinkedHashMap f20543c = new LinkedHashMap();
    public final CopyOnWriteArrayList f20544a;

    public v0(String str) {
        super(str, 128);
        this.f20544a = new CopyOnWriteArrayList();
    }

    @Override
    public final void onEvent(int i7, String str) {
        for (rd.l lVar : this.f20544a) {
            lVar.invoke(str);
        }
    }
}
