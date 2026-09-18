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
    public final int f1242a;
    public final Object f1243b;
    public final Object f1244c;
    public final Object d;
    public final Object e;
    public final Object f1245f;

    public m3(f6 f6Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, ci.ga gaVar) {
        this.f1242a = 1;
        this.f1244c = f6Var;
        this.f1243b = runnable;
        this.d = tL_error;
        this.e = storyItem;
        this.f1245f = gaVar;
    }

    private final void a() {
        i60.A((i60) this.f1244c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.e, (TL_phone.exportGroupCallInvite) this.f1245f, (TLRPC.TL_error) this.f1243b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.m3.run():void");
    }

    public m3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1242a = i10;
        this.f1244c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1245f = obj4;
        this.f1243b = obj5;
    }

    public m3(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f1242a = 11;
        this.f1244c = cameraController;
        this.d = cameraSession;
        this.f1243b = runnable;
        this.e = surfaceTexture;
        this.f1245f = runnable2;
    }
}
