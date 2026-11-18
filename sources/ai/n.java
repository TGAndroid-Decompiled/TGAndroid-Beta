package ai;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.yx;
import org.telegram.ui.ml0;
import org.telegram.ui.ow;
public final class n implements Runnable {
    public final int f1350a;
    public final boolean f1351b;
    public final Object f1352c;
    public final Object d;
    public final Object f1353e;
    public final Object f1354f;

    public n(h2.c cVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f1350a = 8;
        this.d = cVar;
        this.f1352c = str;
        this.f1353e = bitmap;
        this.f1351b = z10;
        this.f1354f = bitmap2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.n.run():void");
    }

    public n(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f1350a = i7;
        this.d = obj;
        this.f1353e = obj2;
        this.f1352c = obj3;
        this.f1354f = obj4;
        this.f1351b = z10;
    }

    public n(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i7) {
        this.f1350a = i7;
        this.d = obj;
        this.f1353e = obj2;
        this.f1351b = z10;
        this.f1352c = obj3;
        this.f1354f = obj4;
    }

    public n(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i7) {
        this.f1350a = i7;
        this.d = obj;
        this.f1353e = tLObject;
        this.f1351b = z10;
        this.f1354f = tLObject2;
        this.f1352c = str;
    }

    public n(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1350a = i7;
        this.d = obj;
        this.f1351b = z10;
        this.f1353e = obj2;
        this.f1352c = obj3;
        this.f1354f = obj4;
    }

    public n(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        this.f1350a = 5;
        this.d = cameraController;
        this.f1353e = iCameraView;
        this.f1352c = file;
        this.f1351b = z10;
        this.f1354f = runnable;
    }

    public n(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.h2 h2Var) {
        this.f1350a = 16;
        this.d = payments_giveawayinfo;
        this.f1351b = z10;
        this.f1352c = str;
        this.f1353e = tL_messageMediaGiveaway;
        this.f1354f = h2Var;
    }

    public n(yx yxVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f1350a = 10;
        this.d = yxVar;
        this.f1352c = str;
        this.f1351b = z10;
        this.f1353e = str2;
        this.f1354f = tLObject;
    }

    public n(ow owVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.f1350a = 12;
        this.d = owVar;
        this.f1353e = tL_error;
        this.f1354f = tLObject;
        this.f1352c = str;
        this.f1351b = z10;
    }

    public n(ml0 ml0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f1350a = 13;
        this.d = ml0Var;
        this.f1351b = z10;
        this.f1352c = str;
        this.f1353e = str2;
        this.f1354f = updatepasswordsettings;
    }
}
