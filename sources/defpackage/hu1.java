package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hu1 implements pw2 {
    public final TLRPC.TL_messageMediaPoll a;
    public final TLRPC.PollAnswer b;
    public final wb2 c;
    public final ju1 d;

    public hu1(ju1 ju1Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, wb2 wb2Var) {
        this.d = ju1Var;
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
        r7a sendMessagesHelper = this.d.a.getSendMessagesHelper();
        wb2 wb2Var = this.c;
        sendMessagesHelper.v0(wb2Var.getMessageObject(), arrayList, null);
        wb2Var.b0(true);
    }

    @Override
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        zu1 zu1Var = this.d.a;
        if (inputStickerSet != null && zu1Var.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            s4b s4bVar = new s4b(zu1Var.getParentActivity(), zu1Var, tL_inputStickerSetID, null, zu1Var.a0, zu1Var.Ba);
            boolean Y7 = zu1Var.Y7();
            s4bVar.i0 = Y7;
            s4bVar.n = Y7;
            s4bVar.c2 = z;
            zu1Var.showDialog(s4bVar);
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
        return this.d.a.l6;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        if (this.d.a.g4 == 1) {
            return true;
        }
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
        r7a sendMessagesHelper = this.d.a.getSendMessagesHelper();
        wb2 wb2Var = this.c;
        sendMessagesHelper.v0(wb2Var.getMessageObject(), null, null);
        wb2Var.b0(true);
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
