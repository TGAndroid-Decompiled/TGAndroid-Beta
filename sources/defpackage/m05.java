package defpackage;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class m05 implements Runnable {
    public final byte a;
    public final int b;
    public final boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public m05(u58 u58Var, String str, int i, TLObject tLObject, boolean z, TLRPC.User user) {
        this.a = (byte) 1;
        this.d = u58Var;
        this.e = str;
        this.b = i;
        this.f = tLObject;
        this.c = z;
        this.h = user;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m05.run():void");
    }

    public m05(ye9 ye9Var, Uri uri, boolean z, String str, int i, lk0 lk0Var) {
        this.a = (byte) 2;
        this.d = ye9Var;
        this.e = uri;
        this.c = z;
        this.f = str;
        this.b = i;
        this.h = lk0Var;
    }

    public m05(Activity activity, int i, TLRPC.InputGroupCall inputGroupCall, boolean z, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.a = (byte) 5;
        this.d = activity;
        this.b = i;
        this.e = inputGroupCall;
        this.c = z;
        this.f = groupCall;
        this.h = hashSet;
    }

    public m05(Object obj, TLObject tLObject, int i, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.d = obj;
        this.e = tLObject;
        this.b = i;
        this.f = obj2;
        this.h = obj3;
        this.c = z;
    }

    public m05(c cVar, boolean z, y05 y05Var, TL_wallet.proofChallenge proofchallenge, int i, i8c i8cVar) {
        this.a = (byte) 0;
        this.d = cVar;
        this.c = z;
        this.e = y05Var;
        this.f = proofchallenge;
        this.b = i;
        this.h = i8cVar;
    }
}
