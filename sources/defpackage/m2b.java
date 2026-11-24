package defpackage;

import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class m2b implements fx2 {
    public final x2b a;

    public m2b(x2b x2bVar) {
        this.a = x2bVar;
    }

    @Override
    public final boolean B() {
        return true;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void D(TLRPC.Document document) {
        x2b x2bVar = this.a;
        x2bVar.M1.documents.remove(document);
        boolean isEmpty = x2bVar.M1.documents.isEmpty();
        if (isEmpty) {
            x2bVar.dismiss();
        }
        x2bVar.n1.f();
        he heVar = new he(3, x2bVar.J0, x2bVar.getContext());
        heVar.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = hs6.c0(document, "").document;
        ConnectionsManager.getInstance(x2bVar.a).sendRequest(tL_stickers_removeStickerFromSet, new vj1(this, isEmpty, heVar, (byte) 13));
    }

    @Override
    public final String E(boolean z) {
        return null;
    }

    @Override
    public final boolean H() {
        return true;
    }

    @Override
    public final bu5 I(ViewGroup viewGroup) {
        return null;
    }

    @Override
    public final void J(t5a t5aVar) {
        this.a.M0(t5aVar);
    }

    @Override
    public final boolean L() {
        return false;
    }

    @Override
    public final boolean Q(TLRPC.Document document) {
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
        if (dVar instanceof yv1) {
            return ((yv1) dVar).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        u2b u2bVar = this.a.V1;
        if (u2bVar != null && u2bVar.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        u2b u2bVar = this.a.V1;
        if (u2bVar != null && u2bVar.c()) {
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
        x2b x2bVar = this.a;
        u2b u2bVar = x2bVar.V1;
        if (u2bVar == null) {
            return;
        }
        u2bVar.e(document, str, obj, null, x2bVar.c2, z, i, 0);
        x2bVar.dismiss();
    }

    @Override
    public final void m(TLRPC.Document document) {
        x2b x2bVar = this.a;
        x2b.G0(x2bVar.F1, x2bVar.M1, document);
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
    public final k47 x() {
        return null;
    }

    @Override
    public final boolean y() {
        return false;
    }

    @Override
    public final void A(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void M() {
    }

    @Override
    public final void O() {
    }

    @Override
    public final void R(String str) {
    }

    @Override
    public final void l(String str) {
    }

    @Override
    public final void o(TLRPC.Document document) {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void w(String str) {
    }

    @Override
    public final void K(Object obj, Object obj2) {
    }

    @Override
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void z(CharSequence charSequence, String str, qy1 qy1Var) {
    }

    @Override
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }
}
