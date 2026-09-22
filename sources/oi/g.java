package oi;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f15766a;
    public final k f15767b;

    public g(k kVar, int i10) {
        this.f15766a = i10;
        this.f15767b = kVar;
    }

    private final void a() {
        k kVar = this.f15767b;
        kVar.e();
        synchronized (kVar.f15775a) {
            try {
                if (kVar.f15789r) {
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
        switch (this.f15766a) {
            case 0:
                k kVar = this.f15767b;
                b5.h hVar2 = kVar.f15787p;
                if (hVar2 != null) {
                    try {
                        if (m.f3425c.b()) {
                            hVar2.f3420a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                kVar.e();
                return;
            case 1:
                k.b(this.f15767b);
                return;
            case 2:
                k.a(this.f15767b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f15767b;
                while (true) {
                    synchronized (kVar2.f15775a) {
                        hVar = kVar2.f15787p;
                        if (!kVar2.f15789r && hVar != null && !kVar2.f15785n.isEmpty()) {
                            bArr = (byte[]) kVar2.f15785n.removeFirst();
                            kVar2.f15791t -= bArr.length;
                        }
                    }
                    try {
                        if (m.f3423a.b()) {
                            hVar.f3420a.postMessageWithPayload(new se.a(new b5.j(bArr)));
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
