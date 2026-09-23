package ai;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.f60;
public final class m3 implements Runnable {
    public final int f1241a;
    public final Object f1242b;
    public final Object f1243c;
    public final Object d;
    public final Object e;
    public final Object f1244f;

    public m3(e6 e6Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, ci.da daVar) {
        this.f1241a = 1;
        this.f1243c = e6Var;
        this.f1242b = runnable;
        this.d = tL_error;
        this.e = storyItem;
        this.f1244f = daVar;
    }

    private final void a() {
        f60.A((f60) this.f1243c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.e, (TL_phone.exportGroupCallInvite) this.f1244f, (TLRPC.TL_error) this.f1242b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.m3.run():void");
    }

    public m3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1241a = i10;
        this.f1243c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1244f = obj4;
        this.f1242b = obj5;
    }

    public m3(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f1241a = 11;
        this.f1243c = cameraController;
        this.d = cameraSession;
        this.f1242b = runnable;
        this.e = surfaceTexture;
        this.f1244f = runnable2;
    }
}
