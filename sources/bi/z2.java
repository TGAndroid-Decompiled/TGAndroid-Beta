package bi;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.j60;
public final class z2 implements Runnable {
    public final int f4044a;
    public final Object f4045b;
    public final Object f4046c;
    public final Object d;
    public final Object f4047e;
    public final Object f4048f;

    public z2(o5 o5Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, di.ga gaVar) {
        this.f4044a = 1;
        this.f4046c = o5Var;
        this.f4045b = runnable;
        this.d = tL_error;
        this.f4047e = storyItem;
        this.f4048f = gaVar;
    }

    private final void a() {
        j60.B((j60) this.f4046c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.f4047e, (TL_phone.exportGroupCallInvite) this.f4048f, (TLRPC.TL_error) this.f4045b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.z2.run():void");
    }

    public z2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f4044a = i10;
        this.f4046c = obj;
        this.d = obj2;
        this.f4047e = obj3;
        this.f4048f = obj4;
        this.f4045b = obj5;
    }

    public z2(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f4044a = 11;
        this.f4046c = cameraController;
        this.d = cameraSession;
        this.f4045b = runnable;
        this.f4047e = surfaceTexture;
        this.f4048f = runnable2;
    }
}
