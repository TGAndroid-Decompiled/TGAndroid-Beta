package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class gv1 implements fx2 {
    public final TLRPC.TL_messageMediaPoll a;
    public final TLRPC.PollAnswer b;
    public final rc2 c;
    public final iv1 d;

    public gv1(iv1 iv1Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, rc2 rc2Var) {
        this.d = iv1Var;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = rc2Var;
    }

    @Override
    public final boolean B() {
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
    public final bu5 I(ViewGroup viewGroup) {
        return null;
    }

    @Override
    public final boolean L() {
        return false;
    }

    @Override
    public final void M() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        a6a sendMessagesHelper = this.d.a.getSendMessagesHelper();
        rc2 rc2Var = this.c;
        sendMessagesHelper.v0(rc2Var.getMessageObject(), arrayList, null);
        rc2Var.a0(true);
    }

    @Override
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        yv1 yv1Var = this.d.a;
        if (inputStickerSet != null && yv1Var.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            x2b x2bVar = new x2b(yv1Var.getParentActivity(), yv1Var, tL_inputStickerSetID, null, yv1Var.a0, yv1Var.Ba);
            boolean Y7 = yv1Var.Y7();
            x2bVar.i0 = Y7;
            x2bVar.n = Y7;
            x2bVar.c2 = z;
            yv1Var.showDialog(x2bVar);
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
        a6a sendMessagesHelper = this.d.a.getSendMessagesHelper();
        rc2 rc2Var = this.c;
        sendMessagesHelper.v0(rc2Var.getMessageObject(), null, null);
        rc2Var.a0(true);
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final k47 x() {
        return this.c.getMessageObject();
    }

    @Override
    public final boolean y() {
        return false;
    }

    @Override
    public final void A(TLRPC.Document document) {
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void G(TLRPC.Document document) {
    }

    @Override
    public final void J(t5a t5aVar) {
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
    public final void m(TLRPC.Document document) {
    }

    @Override
    public final void o(TLRPC.Document document) {
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
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void z(CharSequence charSequence, String str, qy1 qy1Var) {
    }

    @Override
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
