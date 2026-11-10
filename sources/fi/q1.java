package fi;

import android.graphics.Bitmap;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.ys;
import org.telegram.ui.cb1;
import org.telegram.ui.kl0;
public final class q1 implements Runnable {
    public final int f12646a;
    public final boolean f12647b;
    public final Object f12648c;
    public final Object d;
    public final Object f12649e;
    public final Object f12650f;

    public q1(h2.c cVar, String str, Bitmap bitmap, boolean z9, Bitmap bitmap2) {
        this.f12646a = 7;
        this.f12648c = cVar;
        this.f12650f = str;
        this.d = bitmap;
        this.f12647b = z9;
        this.f12649e = bitmap2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.q1.run():void");
    }

    public q1(Object obj, Object obj2, Object obj3, Object obj4, boolean z9, int i7) {
        this.f12646a = i7;
        this.f12648c = obj;
        this.d = obj2;
        this.f12649e = obj3;
        this.f12650f = obj4;
        this.f12647b = z9;
    }

    public q1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z9, int i7) {
        this.f12646a = i7;
        this.f12648c = obj;
        this.f12649e = obj2;
        this.d = tLObject;
        this.f12650f = obj3;
        this.f12647b = z9;
    }

    public q1(Object obj, Object obj2, boolean z9, Object obj3, Object obj4, int i7) {
        this.f12646a = i7;
        this.f12648c = obj;
        this.d = obj2;
        this.f12647b = z9;
        this.f12649e = obj3;
        this.f12650f = obj4;
    }

    public q1(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z9, Runnable runnable) {
        this.f12646a = 4;
        this.f12648c = cameraController;
        this.d = iCameraView;
        this.f12649e = file;
        this.f12647b = z9;
        this.f12650f = runnable;
    }

    public q1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z9, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f12646a = 15;
        this.f12648c = payments_giveawayinfo;
        this.f12647b = z9;
        this.f12650f = str;
        this.d = tL_messageMediaGiveaway;
        this.f12649e = f2Var;
    }

    public q1(ys ysVar, boolean z9, bi.v vVar, String str, TextView textView) {
        this.f12646a = 8;
        this.f12648c = ysVar;
        this.f12647b = z9;
        this.d = vVar;
        this.f12650f = str;
        this.f12649e = textView;
    }

    public q1(ox oxVar, String str, boolean z9, String str2, TLObject tLObject) {
        this.f12646a = 9;
        this.f12648c = oxVar;
        this.f12650f = str;
        this.f12647b = z9;
        this.f12649e = str2;
        this.d = tLObject;
    }

    public q1(kl0 kl0Var, TLRPC.TL_error tL_error, boolean z9, TLObject tLObject, String str) {
        this.f12646a = 13;
        this.f12648c = kl0Var;
        this.f12649e = tL_error;
        this.f12647b = z9;
        this.d = tLObject;
        this.f12650f = str;
    }

    public q1(kl0 kl0Var, boolean z9, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f12646a = 12;
        this.f12648c = kl0Var;
        this.f12647b = z9;
        this.f12650f = str;
        this.d = str2;
        this.f12649e = updatepasswordsettings;
    }

    public q1(cb1 cb1Var, TLObject tLObject, boolean z9, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f12646a = 14;
        this.f12648c = cb1Var;
        this.d = tLObject;
        this.f12647b = z9;
        this.f12650f = str;
        this.f12649e = passwordinputsettings;
    }

    public q1(wi.t0 t0Var, boolean z9, wi.x xVar, wi.p0 p0Var, File file) {
        this.f12646a = 16;
        this.f12648c = t0Var;
        this.f12647b = z9;
        this.d = xVar;
        this.f12649e = p0Var;
        this.f12650f = file;
    }
}
