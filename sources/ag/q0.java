package ag;

import android.graphics.SurfaceTexture;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.s6;
public final class q0 implements Runnable {
    public final int f682a;
    public final Object f683b;
    public final Object f684c;
    public final Object d;
    public final Object e;

    public q0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f682a = i10;
        this.f683b = obj;
        this.f684c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        xa.n nVar = (xa.n) this.f683b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.f684c;
        m4.i iVar = (m4.i) this.d;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
        synchronized (nVar.f53572a) {
            try {
                if (!atomicBoolean.get()) {
                    nVar.t(iVar);
                } else {
                    atomicBoolean2.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ag.q0.b():void");
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ag.q0.run():void");
    }

    public q0(Object obj, Object obj2, TLObject tLObject, Object obj3, int i10) {
        this.f682a = i10;
        this.f683b = obj;
        this.d = obj2;
        this.f684c = tLObject;
        this.e = obj3;
    }

    public q0(Runnable runnable, CameraSession cameraSession, CountDownLatch countDownLatch, Runnable runnable2) {
        this.f682a = 16;
        this.e = runnable;
        this.f683b = cameraSession;
        this.f684c = countDownLatch;
        this.d = runnable2;
    }

    public q0(CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f682a = 15;
        this.f683b = cameraSession;
        this.e = runnable;
        this.f684c = surfaceTexture;
        this.d = runnable2;
    }

    public q0(TLObject tLObject, r6 r6Var, s6 s6Var, TLRPC.TL_theme tL_theme) {
        this.f682a = 18;
        this.f684c = tLObject;
        this.f683b = r6Var;
        this.d = s6Var;
        this.e = tL_theme;
    }
}
