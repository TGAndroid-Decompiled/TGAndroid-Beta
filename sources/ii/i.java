package ii;

import android.content.Context;
import bi.h0;
import org.telegram.messenger.ob;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements Runnable {
    public final int f16300a = 1;
    public final int f16301b;
    public final Object f16302c;
    public final Object d;
    public final Object f16303e;
    public final Object f16304f;
    public final Object h;
    public final long f16305n;
    public final Object f16306r;

    public i(int i7, TLRPC.TL_error tL_error, q10 q10Var, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, Runnable runnable, h2 h2Var, long j3) {
        this.f16301b = i7;
        this.f16302c = tL_error;
        this.d = q10Var;
        this.f16306r = inputCheckPasswordSRP;
        this.f16303e = twoStepVerificationActivity;
        this.f16304f = runnable;
        this.h = h2Var;
        this.f16305n = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.i.run():void");
    }

    public i(ob obVar, int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f16302c = obVar;
        this.f16301b = i7;
        this.f16306r = str;
        this.f16303e = inputFile;
        this.h = inputEncryptedFile;
        this.d = bArr;
        this.f16304f = bArr2;
        this.f16305n = j3;
    }

    public i(TLObject tLObject, int i7, u1 u1Var, Context context, long j3, i6 i6Var, org.telegram.ui.web.q qVar, h0 h0Var) {
        this.f16306r = tLObject;
        this.f16301b = i7;
        this.f16302c = u1Var;
        this.f16303e = context;
        this.f16305n = j3;
        this.h = i6Var;
        this.d = qVar;
        this.f16304f = h0Var;
    }

    public i(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, h2 h2Var, long j3, q10 q10Var, Runnable runnable, int i7) {
        this.f16302c = tL_error;
        this.f16306r = tLObject;
        this.f16303e = twoStepVerificationActivity;
        this.h = h2Var;
        this.f16305n = j3;
        this.d = q10Var;
        this.f16304f = runnable;
        this.f16301b = i7;
    }

    public i(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.f16302c = launchActivity;
        this.f16306r = tLObject;
        this.f16301b = i7;
        this.f16303e = str;
        this.h = str2;
        this.d = user;
        this.f16304f = str3;
        this.f16305n = j3;
    }
}
