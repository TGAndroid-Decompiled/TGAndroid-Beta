package oi;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.r10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.cn0;
public final class o2 implements Runnable {
    public final int f22245a = 2;
    public final int f22246b;
    public final boolean f22247c;
    public final Object d;
    public final Object f22248e;
    public final Object f22249f;
    public final Object h;

    public o2(Activity activity, int i7, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.d = activity;
        this.f22246b = i7;
        this.f22248e = inputGroupCall;
        this.f22247c = z10;
        this.f22249f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: oi.o2.run():void");
    }

    public o2(s3 s3Var, Uri uri, boolean z10, String str, int i7, a aVar) {
        this.d = s3Var;
        this.f22248e = uri;
        this.f22247c = z10;
        this.f22249f = str;
        this.f22246b = i7;
        this.h = aVar;
    }

    public o2(lu0 lu0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, gj gjVar, org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        this.d = lu0Var;
        this.f22248e = tL_messages_stickerSet;
        this.f22246b = i7;
        this.f22249f = gjVar;
        this.h = r1Var;
        this.f22247c = z10;
    }

    public o2(cn0 cn0Var, String str, int i7, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.d = cn0Var;
        this.f22249f = str;
        this.f22246b = i7;
        this.f22248e = tLObject;
        this.f22247c = z10;
        this.h = user;
    }

    public o2(org.telegram.ui.Wallet.u0 u0Var, boolean z10, org.telegram.ui.Wallet.r0 r0Var, TL_wallet.proofChallenge proofchallenge, int i7, r10 r10Var) {
        this.d = u0Var;
        this.f22247c = z10;
        this.f22248e = r0Var;
        this.f22249f = proofchallenge;
        this.f22246b = i7;
        this.h = r10Var;
    }
}
