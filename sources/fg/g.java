package fg;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f9523a;
    public final k f9524b;

    public g(k kVar, int i10) {
        this.f9523a = i10;
        this.f9524b = kVar;
    }

    private final void a() {
        k kVar = this.f9524b;
        kVar.e();
        synchronized (kVar.f9533a) {
            try {
                if (kVar.f9546p) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new g(kVar, 1), 1000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        b5.h hVar;
        byte[] bArr;
        switch (this.f9523a) {
            case 0:
                k kVar = this.f9524b;
                b5.h hVar2 = kVar.f9544n;
                if (hVar2 != null) {
                    try {
                        if (m.f2526c.b()) {
                            hVar2.f2520a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                kVar.e();
                return;
            case 1:
                k.a(this.f9524b);
                return;
            case 2:
                k.b(this.f9524b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f9524b;
                while (true) {
                    synchronized (kVar2.f9533a) {
                        hVar = kVar2.f9544n;
                        if (!kVar2.f9546p && hVar != null && !kVar2.f9542l.isEmpty()) {
                            bArr = (byte[]) kVar2.f9542l.removeFirst();
                            kVar2.f9548r -= bArr.length;
                        }
                    }
                    try {
                        if (m.f2524a.b()) {
                            hVar.f2520a.postMessageWithPayload(new se.a(new b5.j(bArr)));
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        kVar2.f();
                        return;
                    }
                }
                return;
        }
    }
}
