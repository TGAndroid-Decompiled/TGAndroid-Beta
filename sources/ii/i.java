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
    public final int f16297a = 1;
    public final int f16298b;
    public final Object f16299c;
    public final Object d;
    public final Object f16300e;
    public final Object f16301f;
    public final Object h;
    public final long f16302n;
    public final Object f16303r;

    public i(int i7, TLRPC.TL_error tL_error, q10 q10Var, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, Runnable runnable, h2 h2Var, long j3) {
        this.f16298b = i7;
        this.f16299c = tL_error;
        this.d = q10Var;
        this.f16303r = inputCheckPasswordSRP;
        this.f16300e = twoStepVerificationActivity;
        this.f16301f = runnable;
        this.h = h2Var;
        this.f16302n = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.i.run():void");
    }

    public i(ob obVar, int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f16299c = obVar;
        this.f16298b = i7;
        this.f16303r = str;
        this.f16300e = inputFile;
        this.h = inputEncryptedFile;
        this.d = bArr;
        this.f16301f = bArr2;
        this.f16302n = j3;
    }

    public i(TLObject tLObject, int i7, u1 u1Var, Context context, long j3, i6 i6Var, org.telegram.ui.web.q qVar, h0 h0Var) {
        this.f16303r = tLObject;
        this.f16298b = i7;
        this.f16299c = u1Var;
        this.f16300e = context;
        this.f16302n = j3;
        this.h = i6Var;
        this.d = qVar;
        this.f16301f = h0Var;
    }

    public i(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, h2 h2Var, long j3, q10 q10Var, Runnable runnable, int i7) {
        this.f16299c = tL_error;
        this.f16303r = tLObject;
        this.f16300e = twoStepVerificationActivity;
        this.h = h2Var;
        this.f16302n = j3;
        this.d = q10Var;
        this.f16301f = runnable;
        this.f16298b = i7;
    }

    public i(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.f16299c = launchActivity;
        this.f16303r = tLObject;
        this.f16298b = i7;
        this.f16300e = str;
        this.h = str2;
        this.d = user;
        this.f16301f = str3;
        this.f16302n = j3;
    }
}
