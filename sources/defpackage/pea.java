package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class pea implements vv2 {
    public final TLRPC.TL_messageMediaPoll a;
    public final TLRPC.PollAnswer b;
    public final gb2 c;
    public final uea d;

    public pea(uea ueaVar, TLRPC.TL_messageMediaPoll tL_messageMediaPoll, TLRPC.PollAnswer pollAnswer, gb2 gb2Var) {
        this.d = ueaVar;
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
    public final boolean F() {
        return false;
    }

    @Override
    public final cs5 G(ViewGroup viewGroup) {
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
        z3a.B(this.d.a).v0(this.c.getMessageObject(), arrayList, null);
    }

    @Override
    public final void O(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        uea ueaVar = this.d;
        wea weaVar = ueaVar.c;
        if (inputStickerSet != null && weaVar.s.getContext() != null) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
            tL_inputStickerSetID.id = inputStickerSet.id;
            u0b u0bVar = new u0b(weaVar.s.getContext(), weaVar.s.y1, tL_inputStickerSetID, null, null, ueaVar.b);
            u0bVar.i0 = true;
            u0bVar.n = true;
            u0bVar.c2 = z;
            u0bVar.show();
        }
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
        z3a.B(this.d.a).v0(this.c.getMessageObject(), null, null);
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
    public final void N() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void B(TLRPC.Document document) {
    }

    @Override
    public final void E(TLRPC.Document document) {
    }

    @Override
    public final void I(s3a s3aVar) {
    }

    @Override
    public final void Q(String str) {
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
    public final void J(Object obj, Object obj2) {
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

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
