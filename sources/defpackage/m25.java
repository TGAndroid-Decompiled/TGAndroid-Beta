package defpackage;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class m25 implements Runnable {
    public final byte a;
    public final int b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public m25(w78 w78Var, String str, int i, TLObject tLObject, boolean z, TLRPC.User user) {
        this.a = (byte) 1;
        this.d = w78Var;
        this.e = str;
        this.b = i;
        this.f = tLObject;
        this.c = z;
        this.h = user;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m25.run():void");
    }

    public m25(ch9 ch9Var, Uri uri, boolean z, String str, int i, ll0 ll0Var) {
        this.a = (byte) 2;
        this.d = ch9Var;
        this.e = uri;
        this.c = z;
        this.f = str;
        this.b = i;
        this.h = ll0Var;
    }

    public m25(Activity activity, int i, TLRPC.InputGroupCall inputGroupCall, boolean z, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.a = (byte) 5;
        this.d = activity;
        this.b = i;
        this.e = inputGroupCall;
        this.c = z;
        this.f = groupCall;
        this.h = hashSet;
    }

    public m25(Object obj, TLObject tLObject, int i, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.b = i;
        this.f = obj2;
        this.h = obj3;
        this.c = z;
    }

    public m25(c cVar, boolean z, y25 y25Var, TL_wallet.proofChallenge proofchallenge, int i, jac jacVar) {
        this.a = (byte) 0;
        this.d = cVar;
        this.c = z;
        this.e = y25Var;
        this.f = proofchallenge;
        this.b = i;
        this.h = jacVar;
    }
}
