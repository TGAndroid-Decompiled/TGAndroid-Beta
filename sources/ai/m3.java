package ai;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.i60;
public final class m3 implements Runnable {
    public final int f1239a;
    public final Object f1240b;
    public final Object f1241c;
    public final Object d;
    public final Object e;
    public final Object f1242f;

    public m3(f6 f6Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, ci.ga gaVar) {
        this.f1239a = 1;
        this.f1241c = f6Var;
        this.f1240b = runnable;
        this.d = tL_error;
        this.e = storyItem;
        this.f1242f = gaVar;
    }

    private final void a() {
        i60.A((i60) this.f1241c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.e, (TL_phone.exportGroupCallInvite) this.f1242f, (TLRPC.TL_error) this.f1240b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.m3.run():void");
    }

    public m3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1239a = i10;
        this.f1241c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1242f = obj4;
        this.f1240b = obj5;
    }

    public m3(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f1239a = 11;
        this.f1241c = cameraController;
        this.d = cameraSession;
        this.f1240b = runnable;
        this.e = surfaceTexture;
        this.f1242f = runnable2;
    }
}
