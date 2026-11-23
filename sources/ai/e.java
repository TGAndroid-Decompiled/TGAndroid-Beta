package ai;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ay;
import org.telegram.ui.ml0;
import org.telegram.ui.ow;
public final class e implements Runnable {
    public final int f1169a;
    public final boolean f1170b;
    public final Object f1171c;
    public final Object d;
    public final Object f1172e;
    public final Object f1173f;

    public e(h2.c cVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f1169a = 8;
        this.d = cVar;
        this.f1171c = str;
        this.f1172e = bitmap;
        this.f1170b = z10;
        this.f1173f = bitmap2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.e.run():void");
    }

    public e(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f1169a = i7;
        this.d = obj;
        this.f1172e = obj2;
        this.f1171c = obj3;
        this.f1173f = obj4;
        this.f1170b = z10;
    }

    public e(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i7) {
        this.f1169a = i7;
        this.d = obj;
        this.f1172e = obj2;
        this.f1170b = z10;
        this.f1171c = obj3;
        this.f1173f = obj4;
    }

    public e(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i7) {
        this.f1169a = i7;
        this.d = obj;
        this.f1172e = tLObject;
        this.f1170b = z10;
        this.f1173f = tLObject2;
        this.f1171c = str;
    }

    public e(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1169a = i7;
        this.d = obj;
        this.f1170b = z10;
        this.f1172e = obj2;
        this.f1171c = obj3;
        this.f1173f = obj4;
    }

    public e(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        this.f1169a = 5;
        this.d = cameraController;
        this.f1172e = iCameraView;
        this.f1171c = file;
        this.f1170b = z10;
        this.f1173f = runnable;
    }

    public e(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f1169a = 16;
        this.d = payments_giveawayinfo;
        this.f1170b = z10;
        this.f1171c = str;
        this.f1172e = tL_messageMediaGiveaway;
        this.f1173f = g2Var;
    }

    public e(ay ayVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f1169a = 10;
        this.d = ayVar;
        this.f1171c = str;
        this.f1170b = z10;
        this.f1172e = str2;
        this.f1173f = tLObject;
    }

    public e(ow owVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.f1169a = 12;
        this.d = owVar;
        this.f1172e = tL_error;
        this.f1173f = tLObject;
        this.f1171c = str;
        this.f1170b = z10;
    }

    public e(ml0 ml0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f1169a = 13;
        this.d = ml0Var;
        this.f1170b = z10;
        this.f1171c = str;
        this.f1172e = str2;
        this.f1173f = updatepasswordsettings;
    }
}
