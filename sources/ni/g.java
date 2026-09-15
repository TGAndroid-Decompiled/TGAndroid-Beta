package ni;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f15260a;
    public final k f15261b;

    public g(k kVar, int i10) {
        this.f15260a = i10;
        this.f15261b = kVar;
    }

    private final void a() {
        k kVar = this.f15261b;
        kVar.e();
        synchronized (kVar.f15269a) {
            try {
                if (kVar.f15283r) {
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
        switch (this.f15260a) {
            case 0:
                k kVar = this.f15261b;
                b5.h hVar2 = kVar.f15281p;
                if (hVar2 != null) {
                    try {
                        if (m.f3421c.b()) {
                            hVar2.f3416a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                kVar.e();
                return;
            case 1:
                k.b(this.f15261b);
                return;
            case 2:
                k.a(this.f15261b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f15261b;
                while (true) {
                    synchronized (kVar2.f15269a) {
                        hVar = kVar2.f15281p;
                        if (!kVar2.f15283r && hVar != null && !kVar2.f15279n.isEmpty()) {
                            bArr = (byte[]) kVar2.f15279n.removeFirst();
                            kVar2.f15285t -= bArr.length;
                        }
                    }
                    try {
                        if (m.f3419a.b()) {
                            hVar.f3416a.postMessageWithPayload(new se.a(new b5.j(bArr)));
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
