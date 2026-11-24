package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class sr0 implements Runnable {
    public final byte a = 2;
    public final Object b;
    public final long c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public sr0(int i, TLRPC.TL_error tL_error, is0 is0Var, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, wy wyVar, d dVar, long j) {
        this.d = i;
        this.b = tL_error;
        this.e = is0Var;
        this.f = tL_inputCheckPasswordSRP;
        this.h = twoStepVerificationActivity;
        this.n = wyVar;
        this.r = dVar;
        this.c = j;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sr0.run():void");
    }

    public sr0(pk5 pk5Var, int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
        this.b = pk5Var;
        this.d = i;
        this.e = str;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.c = j;
    }

    public sr0(TLObject tLObject, int i, hd hdVar, Context context, long j, wjb wjbVar, st0 st0Var, p pVar) {
        this.b = tLObject;
        this.d = i;
        this.e = hdVar;
        this.f = context;
        this.c = j;
        this.h = wjbVar;
        this.n = st0Var;
        this.r = pVar;
    }

    public sr0(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, d dVar, long j, is0 is0Var, wy wyVar, int i) {
        this.e = tL_error;
        this.b = tLObject;
        this.f = twoStepVerificationActivity;
        this.h = dVar;
        this.c = j;
        this.n = is0Var;
        this.r = wyVar;
        this.d = i;
    }

    public sr0(LaunchActivity launchActivity, TLObject tLObject, int i, String str, String str2, TLRPC.User user, String str3, long j) {
        this.e = launchActivity;
        this.b = tLObject;
        this.d = i;
        this.f = str;
        this.h = str2;
        this.n = user;
        this.r = str3;
        this.c = j;
    }
}
