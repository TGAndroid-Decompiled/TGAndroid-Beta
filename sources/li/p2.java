package li;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.messenger.ij;
import org.telegram.messenger.v10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.au0;
import org.telegram.ui.an0;
public final class p2 implements Runnable {
    public final int f18773a = 2;
    public final int f18774b;
    public final boolean f18775c;
    public final Object d;
    public final Object f18776e;
    public final Object f18777f;
    public final Object h;

    public p2(Activity activity, int i7, TLRPC.InputGroupCall inputGroupCall, boolean z9, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.d = activity;
        this.f18774b = i7;
        this.f18776e = inputGroupCall;
        this.f18775c = z9;
        this.f18777f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: li.p2.run():void");
    }

    public p2(t3 t3Var, Uri uri, boolean z9, String str, int i7, a aVar) {
        this.d = t3Var;
        this.f18776e = uri;
        this.f18775c = z9;
        this.f18777f = str;
        this.f18774b = i7;
        this.h = aVar;
    }

    public p2(au0 au0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i7, ij ijVar, org.telegram.ui.Cells.q1 q1Var, boolean z9) {
        this.d = au0Var;
        this.f18776e = tL_messages_stickerSet;
        this.f18774b = i7;
        this.f18777f = ijVar;
        this.h = q1Var;
        this.f18775c = z9;
    }

    public p2(an0 an0Var, String str, int i7, TLObject tLObject, boolean z9, TLRPC.User user) {
        this.d = an0Var;
        this.f18777f = str;
        this.f18774b = i7;
        this.f18776e = tLObject;
        this.f18775c = z9;
        this.h = user;
    }

    public p2(org.telegram.ui.Wallet.l0 l0Var, boolean z9, org.telegram.ui.Wallet.i0 i0Var, TL_wallet.proofChallenge proofchallenge, int i7, v10 v10Var) {
        this.d = l0Var;
        this.f18775c = z9;
        this.f18776e = i0Var;
        this.f18777f = proofchallenge;
        this.f18774b = i7;
        this.h = v10Var;
    }
}
