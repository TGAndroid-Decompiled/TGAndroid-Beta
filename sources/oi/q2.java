package oi;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.lu0;
import org.telegram.ui.cn0;
public final class q2 implements Runnable {
    public final int f22327a = 2;
    public final int f22328b;
    public final boolean f22329c;
    public final Object d;
    public final Object f22330e;
    public final Object f22331f;
    public final Object h;

    public q2(Activity activity, int i7, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.d = activity;
        this.f22328b = i7;
        this.f22330e = inputGroupCall;
        this.f22329c = z10;
        this.f22331f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: oi.q2.run():void");
    }

    public q2(t3 t3Var, Uri uri, boolean z10, String str, int i7, a aVar) {
        this.d = t3Var;
        this.f22330e = uri;
        this.f22329c = z10;
        this.f22331f = str;
        this.f22328b = i7;
        this.h = aVar;
    }

    public q2(lu0 lu0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, fj fjVar, org.telegram.ui.Cells.r1 r1Var, boolean z10) {
        this.d = lu0Var;
        this.f22330e = tL_messages_stickerSet;
        this.f22328b = i7;
        this.f22331f = fjVar;
        this.h = r1Var;
        this.f22329c = z10;
    }

    public q2(cn0 cn0Var, String str, int i7, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.d = cn0Var;
        this.f22331f = str;
        this.f22328b = i7;
        this.f22330e = tLObject;
        this.f22329c = z10;
        this.h = user;
    }

    public q2(org.telegram.ui.Wallet.u0 u0Var, boolean z10, org.telegram.ui.Wallet.r0 r0Var, TL_wallet.proofChallenge proofchallenge, int i7, q10 q10Var) {
        this.d = u0Var;
        this.f22329c = z10;
        this.f22330e = r0Var;
        this.f22331f = proofchallenge;
        this.f22328b = i7;
        this.h = q10Var;
    }
}
