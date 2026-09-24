package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import java.io.File;
import java.util.ArrayDeque;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y70;
public final class h5 implements Runnable {
    public final int f942a;
    public final Object f943b;
    public final Object f944c;
    public final Object d;
    public final Object e;

    public h5(x8 x8Var, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f942a = 2;
        this.f943b = x8Var;
        this.f944c = tLObject;
        this.e = callback;
        this.d = tL_error;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.f943b;
        k2.n nVar = (k2.n) this.f944c;
        Handler handler = (Handler) this.d;
        k2.k kVar = (k2.k) this.e;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, nVar, kVar));
            }
            synchronized (k2.e0.f13234o0) {
                try {
                    int i10 = k2.e0.f13236q0 - 1;
                    k2.e0.f13236q0 = i10;
                    if (i10 == 0) {
                        k2.e0.f13235p0.shutdown();
                        k2.e0.f13235p0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, nVar, kVar));
            }
            synchronized (k2.e0.f13234o0) {
                try {
                    int i11 = k2.e0.f13236q0 - 1;
                    k2.e0.f13236q0 = i11;
                    if (i11 == 0) {
                        k2.e0.f13235p0.shutdown();
                        k2.e0.f13235p0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h5.b():void");
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h5.c():void");
    }

    private final void e() {
        oi.f fVar = (oi.f) this.f943b;
        ((ArrayDeque) fVar.f15744a).addLast(new oi.e((le.b) this.f944c, (oi.b) this.d, (RequestTimeDelegate) this.e));
        fVar.K();
    }

    private final void f() {
        CameraController.lambda$openRound$9((CameraSession) this.f943b, (Runnable) this.f944c, (SurfaceTexture) this.d, (Runnable) this.e);
    }

    private final void g() {
        CameraController.lambda$close$5((Runnable) this.f943b, (CameraSession) this.f944c, (CountDownLatch) this.d, (Runnable) this.e);
    }

    private final void h() {
        ((VideoAds) this.f943b).lambda$show$14((Context) this.f944c, (TLRPC.TL_sponsoredMessage) this.d, (y70) this.e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h5.run():void");
    }

    public h5(gg.c cVar, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f942a = 12;
        this.f943b = cVar;
        this.d = tL_error;
        this.e = str;
        this.f944c = tLObject;
    }

    public h5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f942a = i10;
        this.f943b = obj;
        this.f944c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public h5(Utilities.Callback callback, File file, String str, String[] strArr) {
        this.f942a = 29;
        this.e = callback;
        this.f943b = file;
        this.f944c = str;
        this.d = strArr;
    }

    public h5(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.q qVar, TLRPC.UserFull userFull) {
        this.f942a = 10;
        this.f944c = tLObject;
        this.f943b = zArr;
        this.d = qVar;
        this.e = userFull;
    }
}
