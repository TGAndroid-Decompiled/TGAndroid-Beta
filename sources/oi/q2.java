package oi;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.an0;
public final class q2 implements Runnable {
    public final int f22395a = 2;
    public final int f22396b;
    public final boolean f22397c;
    public final Object d;
    public final Object f22398e;
    public final Object f22399f;
    public final Object h;

    public q2(Activity activity, int i7, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.d = activity;
        this.f22396b = i7;
        this.f22398e = inputGroupCall;
        this.f22397c = z10;
        this.f22399f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: oi.q2.run():void");
    }

    public q2(t3 t3Var, Uri uri, boolean z10, String str, int i7, a aVar) {
        this.d = t3Var;
        this.f22398e = uri;
        this.f22397c = z10;
        this.f22399f = str;
        this.f22396b = i7;
        this.h = aVar;
    }

    public q2(ku0 ku0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, fj fjVar, org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        this.d = ku0Var;
        this.f22398e = tL_messages_stickerSet;
        this.f22396b = i7;
        this.f22399f = fjVar;
        this.h = r1Var;
        this.f22397c = z10;
    }

    public q2(an0 an0Var, String str, int i7, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.d = an0Var;
        this.f22399f = str;
        this.f22396b = i7;
        this.f22398e = tLObject;
        this.f22397c = z10;
        this.h = user;
    }

    public q2(org.telegram.ui.Wallet.v0 v0Var, boolean z10, org.telegram.ui.Wallet.s0 s0Var, TL_wallet.proofChallenge proofchallenge, int i7, p10 p10Var) {
        this.d = v0Var;
        this.f22397c = z10;
        this.f22398e = s0Var;
        this.f22399f = proofchallenge;
        this.f22396b = i7;
        this.h = p10Var;
    }
}
