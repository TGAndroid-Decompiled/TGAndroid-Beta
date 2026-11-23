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
    public final int f16291a = 1;
    public final int f16292b;
    public final Object f16293c;
    public final Object d;
    public final Object f16294e;
    public final Object f16295f;
    public final Object h;
    public final long f16296n;
    public final Object f16297r;

    public i(int i7, TLRPC.TL_error tL_error, r10 r10Var, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, Runnable runnable, g2 g2Var, long j3) {
        this.f16292b = i7;
        this.f16293c = tL_error;
        this.d = r10Var;
        this.f16297r = inputCheckPasswordSRP;
        this.f16294e = twoStepVerificationActivity;
        this.f16295f = runnable;
        this.h = g2Var;
        this.f16296n = j3;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ii.i.run():void");
    }

    public i(pb pbVar, int i7, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j3) {
        this.f16293c = pbVar;
        this.f16292b = i7;
        this.f16297r = str;
        this.f16294e = inputFile;
        this.h = inputEncryptedFile;
        this.d = bArr;
        this.f16295f = bArr2;
        this.f16296n = j3;
    }

    public i(TLObject tLObject, int i7, t1 t1Var, Context context, long j3, h6 h6Var, org.telegram.ui.web.q qVar, h0 h0Var) {
        this.f16297r = tLObject;
        this.f16292b = i7;
        this.f16293c = t1Var;
        this.f16294e = context;
        this.f16296n = j3;
        this.h = h6Var;
        this.d = qVar;
        this.f16295f = h0Var;
    }

    public i(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, g2 g2Var, long j3, r10 r10Var, Runnable runnable, int i7) {
        this.f16293c = tL_error;
        this.f16297r = tLObject;
        this.f16294e = twoStepVerificationActivity;
        this.h = g2Var;
        this.f16296n = j3;
        this.d = r10Var;
        this.f16295f = runnable;
        this.f16292b = i7;
    }

    public i(LaunchActivity launchActivity, TLObject tLObject, int i7, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.f16293c = launchActivity;
        this.f16297r = tLObject;
        this.f16292b = i7;
        this.f16294e = str;
        this.h = str2;
        this.d = user;
        this.f16295f = str3;
        this.f16296n = j3;
    }
}
