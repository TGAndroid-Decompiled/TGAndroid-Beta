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
import org.telegram.ui.Components.s80;
public final class i5 implements Runnable {
    public final int f1134a;
    public final Object f1135b;
    public final Object f1136c;
    public final Object d;
    public final Object f1137e;

    public i5(y8 y8Var, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f1134a = 2;
        this.f1135b = y8Var;
        this.f1136c = tLObject;
        this.f1137e = callback;
        this.d = tL_error;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.f1135b;
        k2.n nVar = (k2.n) this.f1136c;
        Handler handler = (Handler) this.d;
        k2.k kVar = (k2.k) this.f1137e;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.w1(26, nVar, kVar));
            }
            synchronized (k2.d0.f14418n0) {
                try {
                    int i10 = k2.d0.f14420p0 - 1;
                    k2.d0.f14420p0 = i10;
                    if (i10 == 0) {
                        k2.d0.f14419o0.shutdown();
                        k2.d0.f14419o0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.w1(26, nVar, kVar));
            }
            synchronized (k2.d0.f14418n0) {
                try {
                    int i11 = k2.d0.f14420p0 - 1;
                    k2.d0.f14420p0 = i11;
                    if (i11 == 0) {
                        k2.d0.f14419o0.shutdown();
                        k2.d0.f14419o0 = null;
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
        oi.f fVar = (oi.f) this.f1135b;
        ((ArrayDeque) fVar.f16927a).addLast(new oi.e((m4.x) this.f1136c, (oi.b) this.d, (RequestTimeDelegate) this.f1137e));
        fVar.K();
    }

    private final void f() {
        CameraController.lambda$openRound$9((CameraSession) this.f1135b, (Runnable) this.f1136c, (SurfaceTexture) this.d, (Runnable) this.f1137e);
    }

    private final void g() {
        CameraController.lambda$close$5((Runnable) this.f1135b, (CameraSession) this.f1136c, (CountDownLatch) this.d, (Runnable) this.f1137e);
    }

    private final void h() {
        ((VideoAds) this.f1135b).lambda$show$14((Context) this.f1136c, (TLRPC.TL_sponsoredMessage) this.d, (s80) this.f1137e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.i5.run():void");
    }

    public i5(gg.c cVar, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f1134a = 12;
        this.f1135b = cVar;
        this.d = tL_error;
        this.f1137e = str;
        this.f1136c = tLObject;
    }

    public i5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1134a = i10;
        this.f1135b = obj;
        this.f1136c = obj2;
        this.d = obj3;
        this.f1137e = obj4;
    }

    public i5(Utilities.Callback callback, File file, String str, String[] strArr) {
        this.f1134a = 29;
        this.f1137e = callback;
        this.f1135b = file;
        this.f1136c = str;
        this.d = strArr;
    }

    public i5(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.q qVar, TLRPC.UserFull userFull) {
        this.f1134a = 10;
        this.f1136c = tLObject;
        this.f1135b = zArr;
        this.d = qVar;
        this.f1137e = userFull;
    }
}
