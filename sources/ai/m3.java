package ai;

import android.graphics.SurfaceTexture;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.h60;
public final class m3 implements Runnable {
    public final int f1342a;
    public final Object f1343b;
    public final Object f1344c;
    public final Object d;
    public final Object f1345e;
    public final Object f1346f;

    public m3(e6 e6Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, ci.ca caVar) {
        this.f1342a = 1;
        this.f1344c = e6Var;
        this.f1343b = runnable;
        this.d = tL_error;
        this.f1345e = storyItem;
        this.f1346f = caVar;
    }

    private final void a() {
        h60.A((h60) this.f1344c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.f1345e, (TL_phone.exportGroupCallInvite) this.f1346f, (TLRPC.TL_error) this.f1343b);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.m3.run():void");
    }

    public m3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f1342a = i10;
        this.f1344c = obj;
        this.d = obj2;
        this.f1345e = obj3;
        this.f1346f = obj4;
        this.f1343b = obj5;
    }

    public m3(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.f1342a = 11;
        this.f1344c = cameraController;
        this.d = cameraSession;
        this.f1343b = runnable;
        this.f1345e = surfaceTexture;
        this.f1346f = runnable2;
    }
}
