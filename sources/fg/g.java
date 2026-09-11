package fg;

import b5.m;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
public final class g implements Runnable {
    public final int f9495a;
    public final k f9496b;

    public g(k kVar, int i10) {
        this.f9495a = i10;
        this.f9496b = kVar;
    }

    private final void a() {
        k kVar = this.f9496b;
        kVar.e();
        synchronized (kVar.f9505a) {
            try {
                if (kVar.f9518p) {
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
        switch (this.f9495a) {
            case 0:
                k kVar = this.f9496b;
                b5.h hVar2 = kVar.f9516n;
                if (hVar2 != null) {
                    try {
                        if (m.f2499c.b()) {
                            hVar2.f2493a.postMessage("{\"t\":\"close\"}");
                        } else {
                            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
                        }
                    } catch (Exception unused) {
                    }
                }
                kVar.e();
                return;
            case 1:
                k.a(this.f9496b);
                return;
            case 2:
                k.b(this.f9496b);
                return;
            case 3:
                a();
                return;
            default:
                k kVar2 = this.f9496b;
                while (true) {
                    synchronized (kVar2.f9505a) {
                        hVar = kVar2.f9516n;
                        if (!kVar2.f9518p && hVar != null && !kVar2.f9514l.isEmpty()) {
                            bArr = (byte[]) kVar2.f9514l.removeFirst();
                            kVar2.f9520r -= bArr.length;
                        }
                    }
                    try {
                        if (m.f2497a.b()) {
                            hVar.f2493a.postMessageWithPayload(new se.a(new b5.j(bArr)));
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
