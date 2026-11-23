package ii;

import android.content.Context;
import bi.h0;
import org.telegram.messenger.pb;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class i implements Runnable {
    public final int f16325a = 1;
    public final int f16326b;
    public final Object f16327c;
    public final Object d;
    public final Object f16328e;
    public final Object f16329f;
    public final Object h;
    public final long f16330n;
    public final Object f16331r;

    public i(int i7, TLRPC.TL_error tL_error, r10 r10Var, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, Runnable runnable, g2 g2Var, long j3) {
        this.f16326b = i7;
        this.f16327c = tL_error;
        this.d = r10Var;
        this.f16331r = inputCheckPasswordSRP;
        this.f16328e = twoStepVerificationActivity;
        this.f16329f = runnable;
        this.h = g2Var;
        this.f16330n = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.i.run():void");
    }

    public i(pb pbVar, int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f16327c = pbVar;
        this.f16326b = i7;
        this.f16331r = str;
        this.f16328e = inputFile;
        this.h = inputEncryptedFile;
        this.d = bArr;
        this.f16329f = bArr2;
        this.f16330n = j3;
    }

    public i(TLObject tLObject, int i7, t1 t1Var, Context context, long j3, h6 h6Var, org.telegram.ui.web.q qVar, h0 h0Var) {
        this.f16331r = tLObject;
        this.f16326b = i7;
        this.f16327c = t1Var;
        this.f16328e = context;
        this.f16330n = j3;
        this.h = h6Var;
        this.d = qVar;
        this.f16329f = h0Var;
    }

    public i(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, r10 r10Var, Runnable runnable, int i7) {
        this.f16327c = tL_error;
        this.f16331r = tLObject;
        this.f16328e = twoStepVerificationActivity;
        this.h = g2Var;
        this.f16330n = j3;
        this.d = r10Var;
        this.f16329f = runnable;
        this.f16326b = i7;
    }

    public i(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.f16327c = launchActivity;
        this.f16331r = tLObject;
        this.f16326b = i7;
        this.f16328e = str;
        this.h = str2;
        this.d = user;
        this.f16329f = str3;
        this.f16330n = j3;
    }
}
