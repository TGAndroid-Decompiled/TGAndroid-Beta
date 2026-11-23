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
public final class i implements Runnable {
    public final int f1229a;
    public final boolean f1230b;
    public final Object f1231c;
    public final Object d;
    public final Object f1232e;
    public final Object f1233f;

    public i(h2.c cVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f1229a = 8;
        this.d = cVar;
        this.f1231c = str;
        this.f1232e = bitmap;
        this.f1230b = z10;
        this.f1233f = bitmap2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.i.run():void");
    }

    public i(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f1229a = i7;
        this.d = obj;
        this.f1232e = obj2;
        this.f1231c = obj3;
        this.f1233f = obj4;
        this.f1230b = z10;
    }

    public i(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i7) {
        this.f1229a = i7;
        this.d = obj;
        this.f1232e = obj2;
        this.f1230b = z10;
        this.f1231c = obj3;
        this.f1233f = obj4;
    }

    public i(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i7) {
        this.f1229a = i7;
        this.d = obj;
        this.f1232e = tLObject;
        this.f1230b = z10;
        this.f1233f = tLObject2;
        this.f1231c = str;
    }

    public i(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1229a = i7;
        this.d = obj;
        this.f1230b = z10;
        this.f1232e = obj2;
        this.f1231c = obj3;
        this.f1233f = obj4;
    }

    public i(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        this.f1229a = 5;
        this.d = cameraController;
        this.f1232e = iCameraView;
        this.f1231c = file;
        this.f1230b = z10;
        this.f1233f = runnable;
    }

    public i(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.g2 g2Var) {
        this.f1229a = 16;
        this.d = payments_giveawayinfo;
        this.f1230b = z10;
        this.f1231c = str;
        this.f1232e = tL_messageMediaGiveaway;
        this.f1233f = g2Var;
    }

    public i(ay ayVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f1229a = 10;
        this.d = ayVar;
        this.f1231c = str;
        this.f1230b = z10;
        this.f1232e = str2;
        this.f1233f = tLObject;
    }

    public i(ow owVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.f1229a = 12;
        this.d = owVar;
        this.f1232e = tL_error;
        this.f1233f = tLObject;
        this.f1231c = str;
        this.f1230b = z10;
    }

    public i(ml0 ml0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f1229a = 13;
        this.d = ml0Var;
        this.f1230b = z10;
        this.f1231c = str;
        this.f1232e = str2;
        this.f1233f = updatepasswordsettings;
    }
}
