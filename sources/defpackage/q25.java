package defpackage;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Wallet.c;
public final class q25 implements Runnable {
    public final byte a;
    public final int b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public q25(pi9 pi9Var, Uri uri, boolean z, String str, int i, mk0 mk0Var) {
        this.a = (byte) 3;
        this.d = pi9Var;
        this.e = uri;
        this.c = z;
        this.f = str;
        this.b = i;
        this.h = mk0Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q25.run():void");
    }

    public q25(Activity activity, int i, TLRPC.InputGroupCall inputGroupCall, boolean z, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.a = (byte) 6;
        this.d = activity;
        this.b = i;
        this.e = inputGroupCall;
        this.c = z;
        this.f = groupCall;
        this.h = hashSet;
    }

    public q25(Object obj, TLObject tLObject, int i, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.b = i;
        this.f = obj2;
        this.h = obj3;
        this.c = z;
    }

    public q25(e eVar, Object obj, int i, Object obj2, boolean z, TLObject tLObject, byte b) {
        this.a = b;
        this.d = eVar;
        this.e = obj;
        this.b = i;
        this.f = obj2;
        this.c = z;
        this.h = tLObject;
    }

    public q25(c cVar, boolean z, c35 c35Var, TL_wallet.proofChallenge proofchallenge, int i, icc iccVar) {
        this.a = (byte) 0;
        this.d = cVar;
        this.c = z;
        this.e = c35Var;
        this.f = proofchallenge;
        this.b = i;
        this.h = iccVar;
    }
}
