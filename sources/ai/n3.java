package ai;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.i60;
public final class n3 implements Runnable {
    public final int f1455a;
    public final Object f1456b;
    public final Object f1457c;
    public final Object d;
    public final Object f1458e;
    public final Object f1459f;

    public n3(f6 f6Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, ci.da daVar) {
        this.f1455a = 1;
        this.f1457c = f6Var;
        this.f1456b = runnable;
        this.d = tL_error;
        this.f1458e = storyItem;
        this.f1459f = daVar;
    }

    private final void a() {
        i60.D((i60) this.f1457c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.f1458e, (TL_phone.exportGroupCallInvite) this.f1459f, (TLRPC.TL_error) this.f1456b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.n3.run():void");
    }

    public n3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1455a = i10;
        this.f1457c = obj;
        this.d = obj2;
        this.f1458e = obj3;
        this.f1459f = obj4;
        this.f1456b = obj5;
    }

    public n3(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f1455a = 11;
        this.f1457c = cameraController;
        this.d = cameraSession;
        this.f1456b = runnable;
        this.f1458e = surfaceTexture;
        this.f1459f = runnable2;
    }
}
