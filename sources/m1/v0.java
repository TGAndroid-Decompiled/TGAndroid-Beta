package m1;

import android.os.FileObserver;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public final class v0 extends FileObserver {
    public static final Object f19491b = new Object();
    public static final LinkedHashMap f19492c = new LinkedHashMap();
    public final CopyOnWriteArrayList f19493a;

    public v0(String str) {
        super(str, 128);
        this.f19493a = new CopyOnWriteArrayList();
    }

    @Override
    public final void onEvent(int i7, String str) {
        for (rd.l lVar : this.f19493a) {
            lVar.invoke(str);
        }
    }
}
