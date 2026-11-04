package gi;

import android.graphics.Bitmap;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.xs;
import org.telegram.ui.dl0;
import org.telegram.ui.ra1;
public final class q1 implements Runnable {
    public final int f13416a;
    public final boolean f13417b;
    public final Object f13418c;
    public final Object d;
    public final Object f13419e;
    public final Object f13420f;

    public q1(g2.d dVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f13416a = 7;
        this.f13418c = dVar;
        this.f13420f = str;
        this.d = bitmap;
        this.f13417b = z10;
        this.f13419e = bitmap2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: gi.q1.run():void");
    }

    public q1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i3) {
        this.f13416a = i3;
        this.f13418c = obj;
        this.d = obj2;
        this.f13419e = obj3;
        this.f13420f = obj4;
        this.f13417b = z10;
    }

    public q1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i3) {
        this.f13416a = i3;
        this.f13418c = obj;
        this.f13419e = obj2;
        this.d = tLObject;
        this.f13420f = obj3;
        this.f13417b = z10;
    }

    public q1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i3) {
        this.f13416a = i3;
        this.f13418c = obj;
        this.d = obj2;
        this.f13417b = z10;
        this.f13419e = obj3;
        this.f13420f = obj4;
    }

    public q1(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        this.f13416a = 4;
        this.f13418c = cameraController;
        this.d = iCameraView;
        this.f13419e = file;
        this.f13417b = z10;
        this.f13420f = runnable;
    }

    public q1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.d2 d2Var) {
        this.f13416a = 16;
        this.f13418c = payments_giveawayinfo;
        this.f13417b = z10;
        this.f13420f = str;
        this.d = tL_messageMediaGiveaway;
        this.f13419e = d2Var;
    }

    public q1(xs xsVar, boolean z10, ci.s sVar, String str, TextView textView) {
        this.f13416a = 8;
        this.f13418c = xsVar;
        this.f13417b = z10;
        this.d = sVar;
        this.f13420f = str;
        this.f13419e = textView;
    }

    public q1(mx mxVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f13416a = 9;
        this.f13418c = mxVar;
        this.f13420f = str;
        this.f13417b = z10;
        this.f13419e = str2;
        this.d = tLObject;
    }

    public q1(dl0 dl0Var, TLRPC.TL_error tL_error, boolean z10, TLObject tLObject, String str) {
        this.f13416a = 13;
        this.f13418c = dl0Var;
        this.f13419e = tL_error;
        this.f13417b = z10;
        this.d = tLObject;
        this.f13420f = str;
    }

    public q1(dl0 dl0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f13416a = 12;
        this.f13418c = dl0Var;
        this.f13417b = z10;
        this.f13420f = str;
        this.d = str2;
        this.f13419e = updatepasswordsettings;
    }

    public q1(ra1 ra1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f13416a = 14;
        this.f13418c = ra1Var;
        this.d = tLObject;
        this.f13417b = z10;
        this.f13420f = str;
        this.f13419e = passwordinputsettings;
    }

    public q1(wi.t0 t0Var, boolean z10, wi.w wVar, wi.p0 p0Var, File file) {
        this.f13416a = 15;
        this.f13418c = t0Var;
        this.f13417b = z10;
        this.d = wVar;
        this.f13419e = p0Var;
        this.f13420f = file;
    }
}
