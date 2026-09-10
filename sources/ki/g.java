package ki;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f12541a;
    public final k f12542b;

    public g(k kVar, int i10) {
        this.f12541a = i10;
        this.f12542b = kVar;
    }

    private final void a() {
        k kVar = this.f12542b;
        kVar.e();
        synchronized (kVar.f12550a) {
            try {
                if (kVar.f12562p) {
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
        switch (this.f12541a) {
            case 0:
                k kVar = this.f12542b;
                b5.h hVar2 = kVar.f12560n;
                if (hVar2 != null) {
                    try {
                        if (m.f2119c.b()) {
                            hVar2.f2114a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                kVar.e();
                return;
            case 1:
                k.b(this.f12542b);
                return;
            case 2:
                k.a(this.f12542b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f12542b;
                while (true) {
                    synchronized (kVar2.f12550a) {
                        hVar = kVar2.f12560n;
                        if (!kVar2.f12562p && hVar != null && !kVar2.f12558l.isEmpty()) {
                            bArr = (byte[]) kVar2.f12558l.removeFirst();
                            kVar2.f12564r -= bArr.length;
                        }
                    }
                    try {
                        if (m.f2117a.b()) {
                            hVar.f2114a.postMessageWithPayload(new se.a(new b5.j(bArr)));
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
