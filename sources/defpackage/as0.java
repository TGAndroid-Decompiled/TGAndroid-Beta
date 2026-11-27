package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class as0 implements Runnable {
    public final byte a = 2;
    public final Object b;
    public final long c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Object h;
    public final Object n;
    public final Object r;

    public as0(int i, TLRPC.TL_error tL_error, qs0 qs0Var, TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, wy wyVar, e eVar, long j) {
        this.d = i;
        this.b = tL_error;
        this.e = qs0Var;
        this.f = tL_inputCheckPasswordSRP;
        this.h = twoStepVerificationActivity;
        this.n = wyVar;
        this.r = eVar;
        this.c = j;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.as0.run():void");
    }

    public as0(sm5 sm5Var, int i, String str, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2, long j) {
        this.b = sm5Var;
        this.d = i;
        this.e = str;
        this.f = inputFile;
        this.h = inputEncryptedFile;
        this.n = bArr;
        this.r = bArr2;
        this.c = j;
    }

    public as0(TLObject tLObject, int i, id idVar, Context context, long j, vnb vnbVar, bu0 bu0Var, p pVar) {
        this.b = tLObject;
        this.d = i;
        this.e = idVar;
        this.f = context;
        this.c = j;
        this.h = vnbVar;
        this.n = bu0Var;
        this.r = pVar;
    }

    public as0(TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, e eVar, long j, qs0 qs0Var, wy wyVar, int i) {
        this.e = tL_error;
        this.b = tLObject;
        this.f = twoStepVerificationActivity;
        this.h = eVar;
        this.c = j;
        this.n = qs0Var;
        this.r = wyVar;
        this.d = i;
    }

    public as0(LaunchActivity launchActivity, TLObject tLObject, int i, String str, String str2, TLRPC.User user, String str3, long j) {
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
