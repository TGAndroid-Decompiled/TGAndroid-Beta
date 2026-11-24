package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ut1 implements vv2 {
    public final TLRPC.TL_messageMediaPoll a;
    public final TLRPC.PollAnswer b;
    public final gb2 c;
    public final wt1 d;

    public ut1(wt1 wt1Var, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, gb2 gb2Var) {
        this.d = wt1Var;
        this.a = tL_messageMediaPoll;
        this.b = pollAnswer;
        this.c = gb2Var;
    }

    @Override
    public final boolean A(TLRPC.Document document) {
        return false;
    }

    @Override
    public final String C(boolean z) {
        return null;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final cs5 F(ViewGroup viewGroup) {
        return null;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final void L() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.b);
        z3a sendMessagesHelper = this.d.a.getSendMessagesHelper();
        gb2 gb2Var = this.c;
        sendMessagesHelper.v0(gb2Var.getMessageObject(), arrayList, null);
        gb2Var.c0(true);
    }

    @Override
    public final void N(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        mu1 mu1Var = this.d.a;
        if (inputStickerSet != null && mu1Var.getParentActivity() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            u0b u0bVar = new u0b(mu1Var.getParentActivity(), mu1Var, tL_inputStickerSetID, null, mu1Var.a0, mu1Var.Ba);
            boolean O7 = mu1Var.O7();
            u0bVar.i0 = O7;
            u0bVar.n = O7;
            u0bVar.c2 = z;
            mu1Var.showDialog(u0bVar);
        }
    }

    @Override
    public final boolean O(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean R(TLRPC.Document document) {
        return null;
    }

    @Override
    public final boolean S() {
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
        z3a sendMessagesHelper = this.d.a.getSendMessagesHelper();
        gb2 gb2Var = this.c;
        sendMessagesHelper.v0(gb2Var.getMessageObject(), null, null);
        gb2Var.c0(true);
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final k27 w() {
        return this.c.getMessageObject();
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final boolean z() {
        return false;
    }

    @Override
    public final void M() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void H(s3a s3aVar) {
    }

    @Override
    public final void P(String str) {
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
    public final void r(TLRPC.Document document) {
    }

    @Override
    public final void v(String str) {
    }

    @Override
    public final void y(TLRPC.Document document) {
    }

    @Override
    public final void I(Object obj, Object obj2) {
    }

    @Override
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void Q(CharSequence charSequence, String str, pz1 pz1Var) {
    }

    @Override
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
    }

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
