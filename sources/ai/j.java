package ai;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.tx;
import org.telegram.ui.kl0;
import org.telegram.ui.lw;
public final class j implements Runnable {
    public final int f1253a;
    public final boolean f1254b;
    public final Object f1255c;
    public final Object d;
    public final Object f1256e;
    public final Object f1257f;

    public j(h2.c cVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f1253a = 8;
        this.d = cVar;
        this.f1255c = str;
        this.f1256e = bitmap;
        this.f1254b = z10;
        this.f1257f = bitmap2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.j.run():void");
    }

    public j(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f1253a = i7;
        this.d = obj;
        this.f1256e = obj2;
        this.f1255c = obj3;
        this.f1257f = obj4;
        this.f1254b = z10;
    }

    public j(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i7) {
        this.f1253a = i7;
        this.d = obj;
        this.f1256e = obj2;
        this.f1254b = z10;
        this.f1255c = obj3;
        this.f1257f = obj4;
    }

    public j(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i7) {
        this.f1253a = i7;
        this.d = obj;
        this.f1256e = tLObject;
        this.f1254b = z10;
        this.f1257f = tLObject2;
        this.f1255c = str;
    }

    public j(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1253a = i7;
        this.d = obj;
        this.f1254b = z10;
        this.f1256e = obj2;
        this.f1255c = obj3;
        this.f1257f = obj4;
    }

    public j(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        this.f1253a = 5;
        this.d = cameraController;
        this.f1256e = iCameraView;
        this.f1255c = file;
        this.f1254b = z10;
        this.f1257f = runnable;
    }

    public j(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f1253a = 16;
        this.d = payments_giveawayinfo;
        this.f1254b = z10;
        this.f1255c = str;
        this.f1256e = tL_messageMediaGiveaway;
        this.f1257f = e2Var;
    }

    public j(tx txVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f1253a = 10;
        this.d = txVar;
        this.f1255c = str;
        this.f1254b = z10;
        this.f1256e = str2;
        this.f1257f = tLObject;
    }

    public j(lw lwVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.f1253a = 12;
        this.d = lwVar;
        this.f1256e = tL_error;
        this.f1257f = tLObject;
        this.f1255c = str;
        this.f1254b = z10;
    }

    public j(kl0 kl0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f1253a = 13;
        this.d = kl0Var;
        this.f1254b = z10;
        this.f1255c = str;
        this.f1256e = str2;
        this.f1257f = updatepasswordsettings;
    }
}
