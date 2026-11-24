package defpackage;

import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class tq1 implements vv2 {
    public final mu1 a;

    public tq1(mu1 mu1Var) {
        this.a = mu1Var;
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
    public final void O(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        if (inputStickerSet != null) {
            mu1 mu1Var = this.a;
            if (mu1Var.getParentActivity() != null) {
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_inputStickerSetID.access_hash = inputStickerSet.access_hash;
                tL_inputStickerSetID.id = inputStickerSet.id;
                u0b u0bVar = new u0b(mu1Var.getParentActivity(), mu1Var, tL_inputStickerSetID, null, mu1Var.a0, mu1Var.Ba);
                boolean Q7 = mu1Var.Q7();
                u0bVar.i0 = Q7;
                u0bVar.n = Q7;
                u0bVar.c2 = z;
                mu1Var.showDialog(u0bVar);
            }
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
        return this.a.l6;
    }

    @Override
    public final boolean b() {
        return this.a.H4();
    }

    @Override
    public final boolean c() {
        if (this.a.g4 == 1) {
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
        return false;
    }

    @Override
    public final TLRPC.PollAnswer g() {
        return null;
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
        return true;
    }

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
        this.a.a0.e(document, str, obj, null, true, z, i, i2);
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
        return false;
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
}
