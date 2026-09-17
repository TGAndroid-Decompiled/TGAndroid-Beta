package ni;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f15270a;
    public final k f15271b;

    public g(k kVar, int i10) {
        this.f15270a = i10;
        this.f15271b = kVar;
    }

    private final void a() {
        k kVar = this.f15271b;
        kVar.e();
        synchronized (kVar.f15279a) {
            try {
                if (kVar.f15293r) {
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
        switch (this.f15270a) {
            case 0:
                k kVar = this.f15271b;
                b5.h hVar2 = kVar.f15291p;
                if (hVar2 != null) {
                    try {
                        if (m.f3426c.b()) {
                            hVar2.f3421a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                kVar.e();
                return;
            case 1:
                k.b(this.f15271b);
                return;
            case 2:
                k.a(this.f15271b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f15271b;
                while (true) {
                    synchronized (kVar2.f15279a) {
                        hVar = kVar2.f15291p;
                        if (!kVar2.f15293r && hVar != null && !kVar2.f15289n.isEmpty()) {
                            bArr = (byte[]) kVar2.f15289n.removeFirst();
                            kVar2.f15295t -= bArr.length;
                        }
                    }
                    try {
                        if (m.f3424a.b()) {
                            hVar.f3421a.postMessageWithPayload(new se.a(new b5.j(bArr)));
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
