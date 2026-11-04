package l1;

import android.os.FileObserver;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
public final class w0 extends FileObserver {
    public static final Object f17661b = new Object();
    public static final LinkedHashMap f17662c = new LinkedHashMap();
    public final CopyOnWriteArrayList f17663a;

    public w0(String str) {
        super(str, 128);
        this.f17663a = new CopyOnWriteArrayList();
    }

    @Override
    public final void onEvent(int i3, String str) {
        for (od.l lVar : this.f17663a) {
            lVar.invoke(str);
        }
    }
}
