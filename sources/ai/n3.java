package ai;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.g60;
public final class n3 implements Runnable {
    public final int f1457a;
    public final Object f1458b;
    public final Object f1459c;
    public final Object d;
    public final Object f1460e;
    public final Object f1461f;

    public n3(f6 f6Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, ci.da daVar) {
        this.f1457a = 1;
        this.f1459c = f6Var;
        this.f1458b = runnable;
        this.d = tL_error;
        this.f1460e = storyItem;
        this.f1461f = daVar;
    }

    private final void a() {
        g60.D((g60) this.f1459c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.f1460e, (TL_phone.exportGroupCallInvite) this.f1461f, (TLRPC.TL_error) this.f1458b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.n3.run():void");
    }

    public n3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1457a = i10;
        this.f1459c = obj;
        this.d = obj2;
        this.f1460e = obj3;
        this.f1461f = obj4;
        this.f1458b = obj5;
    }

    public n3(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f1457a = 11;
        this.f1459c = cameraController;
        this.d = cameraSession;
        this.f1458b = runnable;
        this.f1460e = surfaceTexture;
        this.f1461f = runnable2;
    }
}
