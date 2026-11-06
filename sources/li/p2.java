package li;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.messenger.ij;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.xm0;
public final class p2 implements Runnable {
    public final int f18767a = 2;
    public final int f18768b;
    public final boolean f18769c;
    public final Object d;
    public final Object f18770e;
    public final Object f18771f;
    public final Object h;

    public p2(Activity activity, int i7, TLRPC.InputGroupCall inputGroupCall, boolean z9, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.d = activity;
        this.f18768b = i7;
        this.f18770e = inputGroupCall;
        this.f18769c = z9;
        this.f18771f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: li.p2.run():void");
    }

    public p2(t3 t3Var, Uri uri, boolean z9, String str, int i7, a aVar) {
        this.d = t3Var;
        this.f18770e = uri;
        this.f18769c = z9;
        this.f18771f = str;
        this.f18768b = i7;
        this.h = aVar;
    }

    public p2(zt0 zt0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, ij ijVar, org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        this.d = zt0Var;
        this.f18770e = tL_messages_stickerSet;
        this.f18768b = i7;
        this.f18771f = ijVar;
        this.h = q1Var;
        this.f18769c = z9;
    }

    public p2(xm0 xm0Var, String str, int i7, TLObject tLObject, boolean z9, TLRPC.User user) {
        this.d = xm0Var;
        this.f18771f = str;
        this.f18768b = i7;
        this.f18770e = tLObject;
        this.f18769c = z9;
        this.h = user;
    }

    public p2(org.telegram.ui.Wallet.n0 n0Var, boolean z9, org.telegram.ui.Wallet.k0 k0Var, TL_wallet.proofChallenge proofchallenge, int i7, v10 v10Var) {
        this.d = n0Var;
        this.f18769c = z9;
        this.f18770e = k0Var;
        this.f18771f = proofchallenge;
        this.f18768b = i7;
        this.h = v10Var;
    }
}
