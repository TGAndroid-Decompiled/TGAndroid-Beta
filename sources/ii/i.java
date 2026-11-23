package ii;

import android.content.Context;
import bi.h0;
import org.telegram.messenger.ob;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements Runnable {
    public final int f16388a = 1;
    public final int f16389b;
    public final Object f16390c;
    public final Object d;
    public final Object f16391e;
    public final Object f16392f;
    public final Object h;
    public final long f16393n;
    public final Object f16394r;

    public i(int i7, TLRPC.TL_error tL_error, p10 p10Var, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, Runnable runnable, g2 g2Var, long j3) {
        this.f16389b = i7;
        this.f16390c = tL_error;
        this.d = p10Var;
        this.f16394r = inputCheckPasswordSRP;
        this.f16391e = twoStepVerificationActivity;
        this.f16392f = runnable;
        this.h = g2Var;
        this.f16393n = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.i.run():void");
    }

    public i(ob obVar, int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f16390c = obVar;
        this.f16389b = i7;
        this.f16394r = str;
        this.f16391e = inputFile;
        this.h = inputEncryptedFile;
        this.d = bArr;
        this.f16392f = bArr2;
        this.f16393n = j3;
    }

    public i(TLObject tLObject, int i7, t1 t1Var, Context context, long j3, i6 i6Var, org.telegram.ui.web.q qVar, h0 h0Var) {
        this.f16394r = tLObject;
        this.f16389b = i7;
        this.f16390c = t1Var;
        this.f16391e = context;
        this.f16393n = j3;
        this.h = i6Var;
        this.d = qVar;
        this.f16392f = h0Var;
    }

    public i(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, p10 p10Var, Runnable runnable, int i7) {
        this.f16390c = tL_error;
        this.f16394r = tLObject;
        this.f16391e = twoStepVerificationActivity;
        this.h = g2Var;
        this.f16393n = j3;
        this.d = p10Var;
        this.f16392f = runnable;
        this.f16389b = i7;
    }

    public i(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.f16390c = launchActivity;
        this.f16394r = tLObject;
        this.f16389b = i7;
        this.f16391e = str;
        this.h = str2;
        this.d = user;
        this.f16392f = str3;
        this.f16393n = j3;
    }
}
