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
import org.telegram.ui.Components.n70;
public final class i5 implements Runnable {
    public final int f976a;
    public final Object f977b;
    public final Object f978c;
    public final Object d;
    public final Object e;

    public i5(x8 x8Var, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f976a = 2;
        this.f977b = x8Var;
        this.f978c = tLObject;
        this.e = callback;
        this.d = tL_error;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.f977b;
        k2.n nVar = (k2.n) this.f978c;
        Handler handler = (Handler) this.d;
        k2.k kVar = (k2.k) this.e;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, nVar, kVar));
            }
            synchronized (k2.g0.f13253o0) {
                try {
                    int i10 = k2.g0.f13255q0 - 1;
                    k2.g0.f13255q0 = i10;
                    if (i10 == 0) {
                        k2.g0.f13254p0.shutdown();
                        k2.g0.f13254p0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, nVar, kVar));
            }
            synchronized (k2.g0.f13253o0) {
                try {
                    int i11 = k2.g0.f13255q0 - 1;
                    k2.g0.f13255q0 = i11;
                    if (i11 == 0) {
                        k2.g0.f13254p0.shutdown();
                        k2.g0.f13254p0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    private final void b() {
        throw new UnsupportedOperationException("Method not decompiled: ai.i5.b():void");
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: ai.i5.c():void");
    }

    private final void e() {
        ni.f fVar = (ni.f) this.f977b;
        ((ArrayDeque) fVar.f15257a).addLast(new ni.e((k2.v) this.f978c, (ni.b) this.d, (RequestTimeDelegate) this.e));
        fVar.K();
    }

    private final void f() {
        CameraController.lambda$openRound$9((CameraSession) this.f977b, (Runnable) this.f978c, (SurfaceTexture) this.d, (Runnable) this.e);
    }

    private final void g() {
        CameraController.lambda$close$5((Runnable) this.f977b, (CameraSession) this.f978c, (CountDownLatch) this.d, (Runnable) this.e);
    }

    private final void h() {
        ((VideoAds) this.f977b).lambda$show$14((Context) this.f978c, (TLRPC.TL_sponsoredMessage) this.d, (n70) this.e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.i5.run():void");
    }

    public i5(gg.c cVar, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f976a = 12;
        this.f977b = cVar;
        this.d = tL_error;
        this.e = str;
        this.f978c = tLObject;
    }

    public i5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f976a = i10;
        this.f977b = obj;
        this.f978c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public i5(Utilities.Callback callback, File file, String str, String[] strArr) {
        this.f976a = 29;
        this.e = callback;
        this.f977b = file;
        this.f978c = str;
        this.d = strArr;
    }

    public i5(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.r rVar, TLRPC.UserFull userFull) {
        this.f976a = 10;
        this.f978c = tLObject;
        this.f977b = zArr;
        this.d = rVar;
        this.e = userFull;
    }
}
