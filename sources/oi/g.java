package oi;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f15747a;
    public final k f15748b;

    public g(k kVar, int i10) {
        this.f15747a = i10;
        this.f15748b = kVar;
    }

    private final void a() {
        k kVar = this.f15748b;
        kVar.e();
        synchronized (kVar.f15756a) {
            try {
                if (kVar.f15770r) {
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
        switch (this.f15747a) {
            case 0:
                k kVar = this.f15748b;
                b5.h hVar2 = kVar.f15768p;
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
                k.b(this.f15748b);
                return;
            case 2:
                k.a(this.f15748b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f15748b;
                while (true) {
                    synchronized (kVar2.f15756a) {
                        hVar = kVar2.f15768p;
                        if (!kVar2.f15770r && hVar != null && !kVar2.f15766n.isEmpty()) {
                            bArr = (byte[]) kVar2.f15766n.removeFirst();
                            kVar2.f15772t -= bArr.length;
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
