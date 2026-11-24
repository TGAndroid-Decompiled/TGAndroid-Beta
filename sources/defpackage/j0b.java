package defpackage;

import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class j0b implements vv2 {
    public final u0b a;

    public j0b(u0b u0bVar) {
        this.a = u0bVar;
    }

    @Override
    public final boolean A(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void B(TLRPC.Document document) {
        u0b u0bVar = this.a;
        u0bVar.M1.documents.remove(document);
        boolean isEmpty = u0bVar.M1.documents.isEmpty();
        if (isEmpty) {
            u0bVar.dismiss();
        }
        u0bVar.n1.f();
        hd hdVar = new hd(3, u0bVar.J0, u0bVar.getContext());
        hdVar.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = hq6.c0(document, "").document;
        ConnectionsManager.getInstance(u0bVar.a).sendRequest(tL_stickers_removeStickerFromSet, new mi1(this, isEmpty, hdVar, (byte) 13));
    }

    @Override
    public final String C(boolean z) {
        return null;
    }

    @Override
    public final boolean F() {
        return true;
    }

    @Override
    public final cs5 G(ViewGroup viewGroup) {
        return null;
    }

    @Override
    public final void I(s3a s3aVar) {
        this.a.M0(s3aVar);
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean P(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean S(TLRPC.Document document) {
        return null;
    }

    @Override
    public final boolean T() {
        return false;
    }

    @Override
    public final long a() {
        d dVar = this.a.F1;
        if (dVar instanceof mu1) {
            return ((mu1) dVar).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        r0b r0bVar = this.a.V1;
        if (r0bVar != null && r0bVar.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        r0b r0bVar = this.a.V1;
        if (r0bVar != null && r0bVar.c()) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean f() {
        if (this.a.R1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
    }

    @Override
    public final boolean h() {
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.a.M1;
        if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.emojis) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final boolean j(int i) {
        if (this.a.V1 != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
        u0b u0bVar = this.a;
        r0b r0bVar = u0bVar.V1;
        if (r0bVar == null) {
            return;
        }
        r0bVar.e(document, str, obj, null, u0bVar.c2, z, i, 0);
        u0bVar.dismiss();
    }

    @Override
    public final void m(TLRPC.Document document) {
        u0b u0bVar = this.a;
        u0b.G0(u0bVar.F1, u0bVar.M1, document);
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final k27 w() {
        return null;
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final boolean z() {
        return true;
    }

    @Override
    public final void L() {
    }

    @Override
    public final void N() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void E(TLRPC.Document document) {
    }

    @Override
    public final void Q(String str) {
    }

    @Override
    public final void l(String str) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void v(String str) {
    }

    @Override
    public final void y(TLRPC.Document document) {
    }

    @Override
    public final void J(Object obj, Object obj2) {
    }

    @Override
    public final void O(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void R(CharSequence charSequence, String str, pz1 pz1Var) {
    }

    @Override
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }
}
