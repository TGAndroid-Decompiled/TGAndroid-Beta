package ai;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.xx;
import org.telegram.ui.kl0;
import org.telegram.ui.nw;
public final class e implements Runnable {
    public final int f1172a;
    public final boolean f1173b;
    public final Object f1174c;
    public final Object d;
    public final Object f1175e;
    public final Object f1176f;

    public e(h2.c cVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f1172a = 8;
        this.d = cVar;
        this.f1174c = str;
        this.f1175e = bitmap;
        this.f1173b = z10;
        this.f1176f = bitmap2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.e.run():void");
    }

    public e(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f1172a = i7;
        this.d = obj;
        this.f1175e = obj2;
        this.f1174c = obj3;
        this.f1176f = obj4;
        this.f1173b = z10;
    }

    public e(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i7) {
        this.f1172a = i7;
        this.d = obj;
        this.f1175e = obj2;
        this.f1173b = z10;
        this.f1174c = obj3;
        this.f1176f = obj4;
    }

    public e(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i7) {
        this.f1172a = i7;
        this.d = obj;
        this.f1175e = tLObject;
        this.f1173b = z10;
        this.f1176f = tLObject2;
        this.f1174c = str;
    }

    public e(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1172a = i7;
        this.d = obj;
        this.f1173b = z10;
        this.f1175e = obj2;
        this.f1174c = obj3;
        this.f1176f = obj4;
    }

    public e(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        this.f1172a = 5;
        this.d = cameraController;
        this.f1175e = iCameraView;
        this.f1174c = file;
        this.f1173b = z10;
        this.f1176f = runnable;
    }

    public e(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f1172a = 16;
        this.d = payments_giveawayinfo;
        this.f1173b = z10;
        this.f1174c = str;
        this.f1175e = tL_messageMediaGiveaway;
        this.f1176f = g2Var;
    }

    public e(xx xxVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f1172a = 10;
        this.d = xxVar;
        this.f1174c = str;
        this.f1173b = z10;
        this.f1175e = str2;
        this.f1176f = tLObject;
    }

    public e(nw nwVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.f1172a = 12;
        this.d = nwVar;
        this.f1175e = tL_error;
        this.f1176f = tLObject;
        this.f1174c = str;
        this.f1173b = z10;
    }

    public e(kl0 kl0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f1172a = 13;
        this.d = kl0Var;
        this.f1173b = z10;
        this.f1174c = str;
        this.f1175e = str2;
        this.f1176f = updatepasswordsettings;
    }
}
