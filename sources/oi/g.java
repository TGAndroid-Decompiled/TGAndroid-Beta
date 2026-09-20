package oi;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f15751a;
    public final k f15752b;

    public g(k kVar, int i10) {
        this.f15751a = i10;
        this.f15752b = kVar;
    }

    private final void a() {
        k kVar = this.f15752b;
        kVar.e();
        synchronized (kVar.f15760a) {
            try {
                if (kVar.f15774r) {
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
        switch (this.f15751a) {
            case 0:
                k kVar = this.f15752b;
                b5.h hVar2 = kVar.f15772p;
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
                k.b(this.f15752b);
                return;
            case 2:
                k.a(this.f15752b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f15752b;
                while (true) {
                    synchronized (kVar2.f15760a) {
                        hVar = kVar2.f15772p;
                        if (!kVar2.f15774r && hVar != null && !kVar2.f15770n.isEmpty()) {
                            bArr = (byte[]) kVar2.f15770n.removeFirst();
                            kVar2.f15776t -= bArr.length;
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
