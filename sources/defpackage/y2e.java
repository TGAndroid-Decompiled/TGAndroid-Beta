package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
public final class y2e extends w3f {
    public final xab a = new xab((byte) 16);

    @Override
    public final void a(Exception exc) {
        exc.printStackTrace();
        xab xabVar = this.a;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) xabVar.b;
        ReferenceQueue referenceQueue = (ReferenceQueue) xabVar.c;
        for (Reference poll = referenceQueue.poll(); poll != null; poll = referenceQueue.poll()) {
            concurrentHashMap.remove(poll);
        }
        List<Throwable> list = (List) concurrentHashMap.get(new n2e(exc));
        if (list == null) {
            return;
        }
        synchronized (list) {
            for (Throwable th : list) {
                System.err.print("Suppressed: ");
                th.printStackTrace();
            }
        }
    }
}
