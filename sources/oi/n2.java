package oi;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.messenger.gj;
import org.telegram.messenger.s10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.au0;
import org.telegram.ui.zm0;
public final class n2 implements Runnable {
    public final int f21834a = 2;
    public final int f21835b;
    public final boolean f21836c;
    public final Object d;
    public final Object f21837e;
    public final Object f21838f;
    public final Object h;

    public n2(Activity activity, int i7, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.d = activity;
        this.f21835b = i7;
        this.f21837e = inputGroupCall;
        this.f21836c = z10;
        this.f21838f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: oi.n2.run():void");
    }

    public n2(q3 q3Var, Uri uri, boolean z10, String str, int i7, a aVar) {
        this.d = q3Var;
        this.f21837e = uri;
        this.f21836c = z10;
        this.f21838f = str;
        this.f21835b = i7;
        this.h = aVar;
    }

    public n2(au0 au0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, gj gjVar, org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        this.d = au0Var;
        this.f21837e = tL_messages_stickerSet;
        this.f21835b = i7;
        this.f21838f = gjVar;
        this.h = q1Var;
        this.f21836c = z10;
    }

    public n2(zm0 zm0Var, String str, int i7, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.d = zm0Var;
        this.f21838f = str;
        this.f21835b = i7;
        this.f21837e = tLObject;
        this.f21836c = z10;
        this.h = user;
    }

    public n2(org.telegram.ui.Wallet.l0 l0Var, boolean z10, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.proofChallenge proofchallenge, int i7, s10 s10Var) {
        this.d = l0Var;
        this.f21836c = z10;
        this.f21837e = i0Var;
        this.f21838f = proofchallenge;
        this.f21835b = i7;
        this.h = s10Var;
    }
}
