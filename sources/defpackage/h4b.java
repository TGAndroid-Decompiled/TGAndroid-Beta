package defpackage;

import android.view.ViewGroup;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class h4b implements pw2 {
    public final s4b a;

    public h4b(s4b s4bVar) {
        this.a = s4bVar;
    }

    @Override
    public final boolean A() {
        return true;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public final void D(TLRPC.Document document) {
        s4b s4bVar = this.a;
        s4bVar.M1.documents.remove(document);
        boolean isEmpty = s4bVar.M1.documents.isEmpty();
        if (isEmpty) {
            s4bVar.dismiss();
        }
        s4bVar.n1.f();
        id idVar = new id(3, s4bVar.J0, s4bVar.getContext());
        idVar.q(350L);
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = ls6.c0(document, "").document;
        ConnectionsManager.getInstance(s4bVar.a).sendRequest(tL_stickers_removeStickerFromSet, new vi1(this, isEmpty, idVar, (byte) 13));
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
    public final fu5 J(ViewGroup viewGroup) {
        return null;
    }

    @Override
    public final void K(k7a k7aVar) {
        this.a.N0(k7aVar);
    }

    @Override
    public final boolean M() {
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
        e eVar = this.a.F1;
        if (eVar instanceof zu1) {
            return ((zu1) eVar).a();
        }
        return 0L;
    }

    @Override
    public final boolean b() {
        p4b p4bVar = this.a.V1;
        if (p4bVar != null && p4bVar.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean c() {
        p4b p4bVar = this.a.V1;
        if (p4bVar != null && p4bVar.c()) {
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
        s4b s4bVar = this.a;
        p4b p4bVar = s4bVar.V1;
        if (p4bVar == null) {
            return;
        }
        p4bVar.e(document, str, obj, null, s4bVar.c2, z, i, 0);
        s4bVar.dismiss();
    }

    @Override
    public final void m(TLRPC.Document document) {
        s4b s4bVar = this.a;
        s4b.H0(s4bVar.F1, s4bVar.M1, document);
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final boolean u() {
        return true;
    }

    @Override
    public final r47 x() {
        return null;
    }

    @Override
    public final boolean y() {
        return false;
    }

    @Override
    public final void N() {
    }

    @Override
    public final void O() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void G(TLRPC.Document document) {
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
    public final void s(TLRPC.Document document) {
    }

    @Override
    public final void w(String str) {
    }

    @Override
    public final void z(TLRPC.Document document) {
    }

    @Override
    public final void L(Object obj, Object obj2) {
    }

    @Override
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
    }

    @Override
    public final void t(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void F(CharSequence charSequence, String str, rx1 rx1Var) {
    }

    @Override
    public final void v(Object obj, Object obj2, boolean z, int i, int i2) {
    }
}
