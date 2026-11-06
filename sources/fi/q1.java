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
import org.telegram.ui.hl0;
import org.telegram.ui.ya1;
public final class q1 implements Runnable {
    public final int f12642a;
    public final boolean f12643b;
    public final Object f12644c;
    public final Object d;
    public final Object f12645e;
    public final Object f12646f;

    public q1(h2.c cVar, String str, Bitmap bitmap, boolean z9, Bitmap bitmap2) {
        this.f12642a = 7;
        this.f12644c = cVar;
        this.f12646f = str;
        this.d = bitmap;
        this.f12643b = z9;
        this.f12645e = bitmap2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: fi.q1.run():void");
    }

    public q1(Object obj, Object obj2, Object obj3, Object obj4, boolean z9, int i7) {
        this.f12642a = i7;
        this.f12644c = obj;
        this.d = obj2;
        this.f12645e = obj3;
        this.f12646f = obj4;
        this.f12643b = z9;
    }

    public q1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z9, int i7) {
        this.f12642a = i7;
        this.f12644c = obj;
        this.f12645e = obj2;
        this.d = tLObject;
        this.f12646f = obj3;
        this.f12643b = z9;
    }

    public q1(Object obj, Object obj2, boolean z9, Object obj3, Object obj4, int i7) {
        this.f12642a = i7;
        this.f12644c = obj;
        this.d = obj2;
        this.f12643b = z9;
        this.f12645e = obj3;
        this.f12646f = obj4;
    }

    public q1(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z9, Runnable runnable) {
        this.f12642a = 4;
        this.f12644c = cameraController;
        this.d = iCameraView;
        this.f12645e = file;
        this.f12643b = z9;
        this.f12646f = runnable;
    }

    public q1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z9, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f12642a = 15;
        this.f12644c = payments_giveawayinfo;
        this.f12643b = z9;
        this.f12646f = str;
        this.d = tL_messageMediaGiveaway;
        this.f12645e = f2Var;
    }

    public q1(ys ysVar, boolean z9, bi.v vVar, String str, TextView textView) {
        this.f12642a = 8;
        this.f12644c = ysVar;
        this.f12643b = z9;
        this.d = vVar;
        this.f12646f = str;
        this.f12645e = textView;
    }

    public q1(ox oxVar, String str, boolean z9, String str2, TLObject tLObject) {
        this.f12642a = 9;
        this.f12644c = oxVar;
        this.f12646f = str;
        this.f12643b = z9;
        this.f12645e = str2;
        this.d = tLObject;
    }

    public q1(hl0 hl0Var, TLRPC.TL_error tL_error, boolean z9, TLObject tLObject, String str) {
        this.f12642a = 13;
        this.f12644c = hl0Var;
        this.f12645e = tL_error;
        this.f12643b = z9;
        this.d = tLObject;
        this.f12646f = str;
    }

    public q1(hl0 hl0Var, boolean z9, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f12642a = 12;
        this.f12644c = hl0Var;
        this.f12643b = z9;
        this.f12646f = str;
        this.d = str2;
        this.f12645e = updatepasswordsettings;
    }

    public q1(ya1 ya1Var, TLObject tLObject, boolean z9, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f12642a = 14;
        this.f12644c = ya1Var;
        this.d = tLObject;
        this.f12643b = z9;
        this.f12646f = str;
        this.f12645e = passwordinputsettings;
    }

    public q1(wi.t0 t0Var, boolean z9, wi.x xVar, wi.p0 p0Var, File file) {
        this.f12642a = 16;
        this.f12644c = t0Var;
        this.f12643b = z9;
        this.d = xVar;
        this.f12645e = p0Var;
        this.f12646f = file;
    }
}
