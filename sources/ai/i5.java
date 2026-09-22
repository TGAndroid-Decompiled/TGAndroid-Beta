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
public final class i5 implements Runnable {
    public final int f978a;
    public final Object f979b;
    public final Object f980c;
    public final Object d;
    public final Object e;

    public i5(x8 x8Var, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f978a = 2;
        this.f979b = x8Var;
        this.f980c = tLObject;
        this.e = callback;
        this.d = tL_error;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.f979b;
        k2.o oVar = (k2.o) this.f980c;
        Handler handler = (Handler) this.d;
        k2.l lVar = (k2.l) this.e;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (oVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, oVar, lVar));
            }
            synchronized (k2.f0.f13251o0) {
                try {
                    int i10 = k2.f0.f13253q0 - 1;
                    k2.f0.f13253q0 = i10;
                    if (i10 == 0) {
                        k2.f0.f13252p0.shutdown();
                        k2.f0.f13252p0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (oVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, oVar, lVar));
            }
            synchronized (k2.f0.f13251o0) {
                try {
                    int i11 = k2.f0.f13253q0 - 1;
                    k2.f0.f13253q0 = i11;
                    if (i11 == 0) {
                        k2.f0.f13252p0.shutdown();
                        k2.f0.f13252p0 = null;
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
        oi.f fVar = (oi.f) this.f979b;
        ((ArrayDeque) fVar.f15763a).addLast(new oi.e((k2.v) this.f980c, (oi.b) this.d, (RequestTimeDelegate) this.e));
        fVar.K();
    }

    private final void f() {
        CameraController.lambda$openRound$9((CameraSession) this.f979b, (Runnable) this.f980c, (SurfaceTexture) this.d, (Runnable) this.e);
    }

    private final void g() {
        CameraController.lambda$close$5((Runnable) this.f979b, (CameraSession) this.f980c, (CountDownLatch) this.d, (Runnable) this.e);
    }

    private final void h() {
        ((VideoAds) this.f979b).lambda$show$14((Context) this.f980c, (TLRPC.TL_sponsoredMessage) this.d, (y70) this.e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.i5.run():void");
    }

    public i5(gg.c cVar, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f978a = 12;
        this.f979b = cVar;
        this.d = tL_error;
        this.e = str;
        this.f980c = tLObject;
    }

    public i5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f978a = i10;
        this.f979b = obj;
        this.f980c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public i5(Utilities.Callback callback, File file, String str, String[] strArr) {
        this.f978a = 29;
        this.e = callback;
        this.f979b = file;
        this.f980c = str;
        this.d = strArr;
    }

    public i5(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.r rVar, TLRPC.UserFull userFull) {
        this.f978a = 10;
        this.f980c = tLObject;
        this.f979b = zArr;
        this.d = rVar;
        this.e = userFull;
    }
}
