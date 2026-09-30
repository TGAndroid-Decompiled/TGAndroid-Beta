package oi;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f15763a;
    public final k f15764b;

    public g(k kVar, int i10) {
        this.f15763a = i10;
        this.f15764b = kVar;
    }

    private final void a() {
        k kVar = this.f15764b;
        kVar.e();
        synchronized (kVar.f15772a) {
            try {
                if (kVar.f15786r) {
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
        switch (this.f15763a) {
            case 0:
                k kVar = this.f15764b;
                b5.h hVar2 = kVar.f15784p;
                if (hVar2 != null) {
                    try {
                        if (m.f3418c.b()) {
                            hVar2.f3413a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                kVar.e();
                return;
            case 1:
                k.b(this.f15764b);
                return;
            case 2:
                k.a(this.f15764b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f15764b;
                while (true) {
                    synchronized (kVar2.f15772a) {
                        hVar = kVar2.f15784p;
                        if (!kVar2.f15786r && hVar != null && !kVar2.f15782n.isEmpty()) {
                            bArr = (byte[]) kVar2.f15782n.removeFirst();
                            kVar2.f15788t -= bArr.length;
                        }
                    }
                    try {
                        if (m.f3416a.b()) {
                            hVar.f3413a.postMessageWithPayload(new se.a(new b5.j(bArr)));
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
