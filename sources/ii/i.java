package ii;

import android.content.Context;
import bi.h0;
import org.telegram.messenger.ob;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements Runnable {
    public final int f16322a = 1;
    public final int f16323b;
    public final Object f16324c;
    public final Object d;
    public final Object f16325e;
    public final Object f16326f;
    public final Object h;
    public final long f16327n;
    public final Object f16328r;

    public i(int i7, TLRPC.TL_error tL_error, q10 q10Var, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, Runnable runnable, g2 g2Var, long j3) {
        this.f16323b = i7;
        this.f16324c = tL_error;
        this.d = q10Var;
        this.f16328r = inputCheckPasswordSRP;
        this.f16325e = twoStepVerificationActivity;
        this.f16326f = runnable;
        this.h = g2Var;
        this.f16327n = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.i.run():void");
    }

    public i(ob obVar, int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f16324c = obVar;
        this.f16323b = i7;
        this.f16328r = str;
        this.f16325e = inputFile;
        this.h = inputEncryptedFile;
        this.d = bArr;
        this.f16326f = bArr2;
        this.f16327n = j3;
    }

    public i(TLObject tLObject, int i7, t1 t1Var, Context context, long j3, h6 h6Var, org.telegram.ui.web.q qVar, h0 h0Var) {
        this.f16328r = tLObject;
        this.f16323b = i7;
        this.f16324c = t1Var;
        this.f16325e = context;
        this.f16327n = j3;
        this.h = h6Var;
        this.d = qVar;
        this.f16326f = h0Var;
    }

    public i(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, q10 q10Var, Runnable runnable, int i7) {
        this.f16324c = tL_error;
        this.f16328r = tLObject;
        this.f16325e = twoStepVerificationActivity;
        this.h = g2Var;
        this.f16327n = j3;
        this.d = q10Var;
        this.f16326f = runnable;
        this.f16323b = i7;
    }

    public i(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.f16324c = launchActivity;
        this.f16328r = tLObject;
        this.f16323b = i7;
        this.f16325e = str;
        this.h = str2;
        this.d = user;
        this.f16326f = str3;
        this.f16327n = j3;
    }
}
