package defpackage;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class yab implements vv2 {
    public final dbb a;

    public yab(dbb dbbVar) {
        this.a = dbbVar;
    }

    @Override
    public final boolean A(TLRPC.Document document) {
        if (this.a.E) {
            return false;
        }
        return y6c.h(y6c.t0).p();
    }

    @Override
    public final String C(boolean z) {
        return null;
    }

    @Override
    public final void E(TLRPC.Document document) {
        bbb bbbVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(k27.U(document));
        valueOf.setSpan(new gm(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (gl.g(valueOf) && (bbbVar = this.a.c) != null) {
            u21.b0(bbbVar.getParentFragment()).i(k96.M0(2131751172, null)).j();
        }
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
    public final boolean P(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean S(TLRPC.Document document) {
        TLRPC.User f;
        boolean z;
        if (this.a.F || !y6c.h(y6c.t0).p() || (f = y6c.h(y6c.t0).f()) == null) {
            return null;
        }
        Long i = l7c.i(f);
        if (document != null && (i == null || i.longValue() != document.id)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override
    public final boolean T() {
        return true;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean c() {
        bbb bbbVar = this.a.c;
        if (bbbVar != null) {
            d parentFragment = bbbVar.getParentFragment();
            if (parentFragment instanceof mu1) {
                return ((mu1) parentFragment).P7();
            }
            return false;
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
        bbb bbbVar = this.a.c;
        if (bbbVar != null) {
            d parentFragment = bbbVar.getParentFragment();
            if (parentFragment instanceof mu1) {
                mu1 mu1Var = (mu1) parentFragment;
                if (mu1Var.I4()) {
                    if (!y6c.h(y6c.t0).p()) {
                        if (mu1Var.h() != null && l7c.D(mu1Var.h())) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void r(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        d parentFragment;
        dbb dbbVar = this.a;
        wjb wjbVar = dbbVar.b;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f = y6c.h(y6c.t0).f();
        if (f == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f.emoji_status;
        }
        na7.q1(dbbVar.a).n5(emojiStatus, null);
        a5b a5bVar = new a5b(this, obj, (byte) 4);
        bbb bbbVar = dbbVar.c;
        if (bbbVar == null) {
            parentFragment = null;
        } else {
            parentFragment = bbbVar.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                e21 e21Var = new e21(dbbVar.getContext(), wjbVar);
                e21Var.b.setText(k96.M0(2131746094, null));
                e21Var.a.setImageResource(2131232367);
                k21 k21Var = new k21(wjbVar, dbbVar.getContext(), true);
                k21Var.b = a5bVar;
                e21Var.setButton(k21Var);
                m21.g(parentFragment, e21Var, 1500).j();
                return;
            }
            u21.b0(parentFragment).r(document, k96.M0(2131745353, null), k96.M0(2131743646, null), a5bVar).j();
        }
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
    public final void y(TLRPC.Document document) {
        dbb dbbVar = this.a;
        bbb bbbVar = dbbVar.c;
        if (bbbVar != null) {
            d parentFragment = bbbVar.getParentFragment();
            if (parentFragment instanceof mu1) {
                ((mu1) parentFragment).nb(document);
                dbbVar.c.setFieldText("");
            }
        }
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
    public final void v(String str) {
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

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
