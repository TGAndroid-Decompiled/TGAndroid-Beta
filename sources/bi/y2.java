package bi;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.messenger.j20;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.lo0;
public final class y2 implements Runnable {
    public final int f3461a = 2;
    public final int f3462b;
    public final boolean f3463c;
    public final Object d;
    public final Object e;
    public final Object f3464f;
    public final Object h;

    public y2(Activity activity, int i10, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.d = activity;
        this.f3462b = i10;
        this.e = inputGroupCall;
        this.f3463c = z10;
        this.f3464f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.y2.run():void");
    }

    public y2(d4 d4Var, Uri uri, boolean z10, String str, int i10, a aVar) {
        this.d = d4Var;
        this.e = uri;
        this.f3463c = z10;
        this.f3464f = str;
        this.f3462b = i10;
        this.h = aVar;
    }

    public y2(cv0 cv0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i10, jj jjVar, org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        this.d = cv0Var;
        this.e = tL_messages_stickerSet;
        this.f3462b = i10;
        this.f3464f = jjVar;
        this.h = q1Var;
        this.f3463c = z10;
    }

    public y2(lo0 lo0Var, String str, int i10, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.d = lo0Var;
        this.f3464f = str;
        this.f3462b = i10;
        this.e = tLObject;
        this.f3463c = z10;
        this.h = user;
    }

    public y2(org.telegram.ui.Wallet.k0 k0Var, boolean z10, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.proofChallenge proofchallenge, int i10, j20 j20Var) {
        this.d = k0Var;
        this.f3463c = z10;
        this.e = h0Var;
        this.f3464f = proofchallenge;
        this.f3462b = i10;
        this.h = j20Var;
    }
}
