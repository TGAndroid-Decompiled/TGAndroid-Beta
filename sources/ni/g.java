package ni;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f15258a;
    public final k f15259b;

    public g(k kVar, int i10) {
        this.f15258a = i10;
        this.f15259b = kVar;
    }

    private final void a() {
        k kVar = this.f15259b;
        kVar.e();
        synchronized (kVar.f15267a) {
            try {
                if (kVar.f15281r) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(kVar, 2), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        b5.h hVar;
        byte[] bArr;
        switch (this.f15258a) {
            case 0:
                k kVar = this.f15259b;
                b5.h hVar2 = kVar.f15279p;
                if (hVar2 != null) {
                    try {
                        if (m.f3423c.b()) {
                            hVar2.f3418a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                kVar.e();
                return;
            case 1:
                k.b(this.f15259b);
                return;
            case 2:
                k.a(this.f15259b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f15259b;
                while (true) {
                    synchronized (kVar2.f15267a) {
                        hVar = kVar2.f15279p;
                        if (!kVar2.f15281r && hVar != null && !kVar2.f15277n.isEmpty()) {
                            bArr = (byte[]) kVar2.f15277n.removeFirst();
                            kVar2.f15283t -= bArr.length;
                        }
                    }
                    try {
                        if (m.f3421a.b()) {
                            hVar.f3418a.postMessageWithPayload(new se.a(new b5.j(bArr)));
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        kVar2.f();
                        return;
                    }
                }
                return;
        }
    }
}
