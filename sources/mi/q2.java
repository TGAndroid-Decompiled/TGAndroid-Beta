package mi;

import android.app.Activity;
import android.net.Uri;
import java.util.HashSet;
import org.telegram.messenger.n10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Components.yt0;
import org.telegram.ui.sm0;
public final class q2 implements Runnable {
    public final int f19832a = 2;
    public final int f19833b;
    public final boolean f19834c;
    public final Object d;
    public final Object f19835e;
    public final Object f19836f;
    public final Object h;

    public q2(Activity activity, int i3, TLRPC.InputGroupCall inputGroupCall, boolean z10, TLRPC.GroupCall groupCall, HashSet hashSet) {
        this.d = activity;
        this.f19833b = i3;
        this.f19835e = inputGroupCall;
        this.f19834c = z10;
        this.f19836f = groupCall;
        this.h = hashSet;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: mi.q2.run():void");
    }

    public q2(t3 t3Var, Uri uri, boolean z10, String str, int i3, a aVar) {
        this.d = t3Var;
        this.f19835e = uri;
        this.f19834c = z10;
        this.f19836f = str;
        this.f19833b = i3;
        this.h = aVar;
    }

    public q2(yt0 yt0Var, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i3, zi ziVar, org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        this.d = yt0Var;
        this.f19835e = tL_messages_stickerSet;
        this.f19833b = i3;
        this.f19836f = ziVar;
        this.h = q1Var;
        this.f19834c = z10;
    }

    public q2(sm0 sm0Var, String str, int i3, TLObject tLObject, boolean z10, TLRPC.User user) {
        this.d = sm0Var;
        this.f19836f = str;
        this.f19833b = i3;
        this.f19835e = tLObject;
        this.f19834c = z10;
        this.h = user;
    }

    public q2(org.telegram.ui.Wallet.k0 k0Var, boolean z10, org.telegram.ui.Wallet.h0 h0Var, TL_wallet.proofChallenge proofchallenge, int i3, n10 n10Var) {
        this.d = k0Var;
        this.f19834c = z10;
        this.f19835e = h0Var;
        this.f19836f = proofchallenge;
        this.f19833b = i3;
        this.h = n10Var;
    }
}
