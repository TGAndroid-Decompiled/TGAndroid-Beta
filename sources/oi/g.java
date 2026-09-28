package oi;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f15762a;
    public final k f15763b;

    public g(k kVar, int i10) {
        this.f15762a = i10;
        this.f15763b = kVar;
    }

    private final void a() {
        k kVar = this.f15763b;
        kVar.e();
        synchronized (kVar.f15771a) {
            try {
                if (kVar.f15785r) {
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
        switch (this.f15762a) {
            case 0:
                k kVar = this.f15763b;
                b5.h hVar2 = kVar.f15783p;
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
                k.b(this.f15763b);
                return;
            case 2:
                k.a(this.f15763b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f15763b;
                while (true) {
                    synchronized (kVar2.f15771a) {
                        hVar = kVar2.f15783p;
                        if (!kVar2.f15785r && hVar != null && !kVar2.f15781n.isEmpty()) {
                            bArr = (byte[]) kVar2.f15781n.removeFirst();
                            kVar2.f15787t -= bArr.length;
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
