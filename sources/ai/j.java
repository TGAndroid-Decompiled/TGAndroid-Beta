package ai;

import android.graphics.Bitmap;
import java.io.File;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.tx;
import org.telegram.ui.jl0;
import org.telegram.ui.lw;
public final class j implements Runnable {
    public final int f1259a;
    public final Object f1260b;
    public final Object f1261c;
    public final Object d;
    public final boolean f1262e;
    public final Object f1263f;

    public j(h2.c cVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f1259a = 9;
        this.f1261c = cVar;
        this.f1260b = str;
        this.d = bitmap;
        this.f1262e = z10;
        this.f1263f = bitmap2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.j.run():void");
    }

    public j(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i7) {
        this.f1259a = i7;
        this.f1261c = obj;
        this.d = obj2;
        this.f1260b = obj3;
        this.f1263f = obj4;
        this.f1262e = z10;
    }

    public j(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i7) {
        this.f1259a = i7;
        this.f1261c = obj;
        this.d = obj2;
        this.f1262e = z10;
        this.f1260b = obj3;
        this.f1263f = obj4;
    }

    public j(Object obj, TLObject tLObject, boolean z10, TLObject tLObject2, String str, int i7) {
        this.f1259a = i7;
        this.f1261c = obj;
        this.d = tLObject;
        this.f1262e = z10;
        this.f1263f = tLObject2;
        this.f1260b = str;
    }

    public j(Object obj, boolean z10, Object obj2, Object obj3, Object obj4, int i7) {
        this.f1259a = i7;
        this.f1261c = obj;
        this.f1262e = z10;
        this.d = obj2;
        this.f1260b = obj3;
        this.f1263f = obj4;
    }

    public j(String str, boolean[] zArr, ki.r1 r1Var, boolean z10, android.support.v4.media.session.a0 a0Var) {
        this.f1259a = 1;
        this.f1260b = str;
        this.f1261c = zArr;
        this.d = r1Var;
        this.f1262e = z10;
        this.f1263f = a0Var;
    }

    public j(CameraController cameraController, CameraController.ICameraView iCameraView, File file, boolean z10, Runnable runnable) {
        this.f1259a = 6;
        this.f1261c = cameraController;
        this.d = iCameraView;
        this.f1260b = file;
        this.f1262e = z10;
        this.f1263f = runnable;
    }

    public j(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.e2 e2Var) {
        this.f1259a = 17;
        this.f1261c = payments_giveawayinfo;
        this.f1262e = z10;
        this.f1260b = str;
        this.d = tL_messageMediaGiveaway;
        this.f1263f = e2Var;
    }

    public j(tx txVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f1259a = 11;
        this.f1261c = txVar;
        this.f1260b = str;
        this.f1262e = z10;
        this.d = str2;
        this.f1263f = tLObject;
    }

    public j(lw lwVar, TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z10) {
        this.f1259a = 13;
        this.f1261c = lwVar;
        this.d = tL_error;
        this.f1263f = tLObject;
        this.f1260b = str;
        this.f1262e = z10;
    }

    public j(jl0 jl0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f1259a = 14;
        this.f1261c = jl0Var;
        this.f1262e = z10;
        this.f1260b = str;
        this.d = str2;
        this.f1263f = updatepasswordsettings;
    }
}
