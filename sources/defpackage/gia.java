package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gia implements pw2 {
    public final TLRPC.TL_messageMediaPoll a;
    public final TLRPC.PollAnswer b;
    public final wb2 c;
    public final lia d;

    public gia(lia liaVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, wb2 wb2Var) {
        this.d = liaVar;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = wb2Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String E(boolean z) {
        return null;
    }

    @Override
    public final boolean H() {
        return false;
    }

    @Override
    public final fu5 J(ViewGroup viewGroup) {
        return null;
    }

    @Override
    public final boolean M() {
        return false;
    }

    @Override
    public final void N() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        r7a.B(this.d.a).v0(this.c.getMessageObject(), arrayList, null);
    }

    @Override
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        lia liaVar = this.d;
        nia niaVar = liaVar.c;
        if (inputStickerSet != null && niaVar.s.getContext() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            s4b s4bVar = new s4b(niaVar.s.getContext(), niaVar.s.y1, tL_inputStickerSetID, null, null, liaVar.b);
            s4bVar.i0 = true;
            s4bVar.n = true;
            s4bVar.c2 = z;
            s4bVar.show();
        }
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
        return true;
    }

    @Override
    public final long a() {
        return this.d.c.s.m1;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return this.a;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return false;
    }

    @Override
    public final boolean f() {
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return this.b;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final boolean j(int i) {
        return false;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void p() {
        r7a.B(this.d.a).v0(this.c.getMessageObject(), null, null);
    }

    @Override
    public final boolean u() {
        return true;
    }

    @Override
    public final r47 x() {
        return this.c.getMessageObject();
    }

    @Override
    public final boolean y() {
        return false;
    }

    @Override
    public final void O() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void K(k7a k7aVar) {
    }

    @Override
    public final void R(String str) {
    }

    @Override
    public final void l(String str) {
    }

    @Override
    public final void m(TLRPC.Document document) {
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
    public final void t(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void F(CharSequence charSequence, String str, rx1 rx1Var) {
    }

    @Override
    public final void v(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
