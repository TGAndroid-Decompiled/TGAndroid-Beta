package bi;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.n60;
public final class c3 implements Runnable {
    public final int f2893a;
    public final Object f2894b;
    public final Object f2895c;
    public final Object d;
    public final Object e;
    public final Object f2896f;

    public c3(q5 q5Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, di.ca caVar) {
        this.f2893a = 1;
        this.f2895c = q5Var;
        this.f2894b = runnable;
        this.d = tL_error;
        this.e = storyItem;
        this.f2896f = caVar;
    }

    private final void a() {
        n60.D((n60) this.f2895c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.e, (TL_phone.exportGroupCallInvite) this.f2896f, (TLRPC.TL_error) this.f2894b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.c3.run():void");
    }

    public c3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f2893a = i10;
        this.f2895c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f2896f = obj4;
        this.f2894b = obj5;
    }

    public c3(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f2893a = 11;
        this.f2895c = cameraController;
        this.d = cameraSession;
        this.f2894b = runnable;
        this.e = surfaceTexture;
        this.f2896f = runnable2;
    }
}
