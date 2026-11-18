package oi;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.messenger.fj;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.cn0;
public final class o2 implements Runnable {
    public final int f22218a = 2;
    public final int f22219b;
    public final boolean f22220c;
    public final Object d;
    public final Object f22221e;
    public final Object f22222f;
    public final Object h;

    public o2(Activity activity, int i7, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.d = activity;
        this.f22219b = i7;
        this.f22221e = inputGroupCall;
        this.f22220c = z10;
        this.f22222f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: oi.o2.run():void");
    }

    public o2(s3 s3Var, Uri uri, boolean z10, String str, int i7, a aVar) {
        this.d = s3Var;
        this.f22221e = uri;
        this.f22220c = z10;
        this.f22222f = str;
        this.f22219b = i7;
        this.h = aVar;
    }

    public o2(iu0 iu0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, fj fjVar, org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        this.d = iu0Var;
        this.f22221e = tL_messages_stickerSet;
        this.f22219b = i7;
        this.f22222f = fjVar;
        this.h = q1Var;
        this.f22220c = z10;
    }

    public o2(cn0 cn0Var, String str, int i7, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.d = cn0Var;
        this.f22222f = str;
        this.f22219b = i7;
        this.f22221e = tLObject;
        this.f22220c = z10;
        this.h = user;
    }

    public o2(org.telegram.ui.Wallet.u0 u0Var, boolean z10, org.telegram.ui.Wallet.r0 r0Var, TL_wallet.proofChallenge proofchallenge, int i7, q10 q10Var) {
        this.d = u0Var;
        this.f22220c = z10;
        this.f22221e = r0Var;
        this.f22222f = proofchallenge;
        this.f22219b = i7;
        this.h = q10Var;
    }
}
