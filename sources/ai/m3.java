package ai;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.g60;
public final class m3 implements Runnable {
    public final int f1243a;
    public final Object f1244b;
    public final Object f1245c;
    public final Object d;
    public final Object e;
    public final Object f1246f;

    public m3(e6 e6Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, ci.ca caVar) {
        this.f1243a = 1;
        this.f1245c = e6Var;
        this.f1244b = runnable;
        this.d = tL_error;
        this.e = storyItem;
        this.f1246f = caVar;
    }

    private final void a() {
        g60.A((g60) this.f1245c, (org.telegram.ui.ActionBar.c2) this.d, (TLObject) this.e, (TL_phone.exportGroupCallInvite) this.f1246f, (TLRPC.TL_error) this.f1244b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.m3.run():void");
    }

    public m3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1243a = i10;
        this.f1245c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1246f = obj4;
        this.f1244b = obj5;
    }

    public m3(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f1243a = 11;
        this.f1245c = cameraController;
        this.d = cameraSession;
        this.f1244b = runnable;
        this.e = surfaceTexture;
        this.f1246f = runnable2;
    }
}
