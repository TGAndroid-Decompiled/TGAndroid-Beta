package defpackage;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class wx3 implements pw2 {
    public final ly3 a;

    public wx3(ly3 ly3Var) {
        this.a = ly3Var;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        if (yac.h(yac.t0).p() && r47.H2(document)) {
            return true;
        }
        return false;
    }

    @Override
    public final String E(boolean z) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(r47.U(document));
        valueOf.setSpan(new hm(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (hl.g(valueOf)) {
            ly3 ly3Var = this.a;
            new d31((FrameLayout) ly3Var.b, ly3Var.J0).i(ob6.M0(2131751149, null)).j();
        }
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
    public final boolean Q(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean S(TLRPC.Document document) {
        TLRPC.User f;
        boolean z;
        if (!yac.h(yac.t0).p() || !r47.H2(document) || (f = yac.h(yac.t0).f()) == null) {
            return null;
        }
        Long i = lbc.i(f);
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
        e eVar = this.a.m1;
        if (eVar instanceof zu1) {
            return ((zu1) eVar).X7();
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
        e eVar = this.a.m1;
        if ((eVar instanceof zu1) && ((zu1) eVar).N4()) {
            if (!yac.h(yac.t0).p()) {
                if (((zu1) eVar).h() != null && lbc.D(((zu1) eVar).h())) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void s(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f = yac.h(yac.t0).f();
        if (f == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f.emoji_status;
        }
        ly3 ly3Var = this.a;
        uc7.s1(ly3Var.a).v5(emojiStatus, null);
        vx3 vx3Var = new vx3(this, obj, (byte) 0);
        if (document == null) {
            n21 n21Var = new n21(ly3Var.getContext(), ly3Var.J0);
            n21Var.b.setText(ob6.M0(2131746014, null));
            n21Var.a.setImageResource(2131232367);
            t21 t21Var = new t21(ly3Var.J0, ly3Var.getContext(), true);
            t21Var.b = vx3Var;
            n21Var.setButton(t21Var);
            v21.f((FrameLayout) ly3Var.b, n21Var, 1500).j();
            return;
        }
        new d31((FrameLayout) ly3Var.b, ly3Var.J0).r(document, ob6.M0(2131745273, null), ob6.M0(2131743540, null), vx3Var).j();
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
    public final void z(TLRPC.Document document) {
        ly3 ly3Var = this.a;
        e eVar = ly3Var.m1;
        if (eVar instanceof zu1) {
            ((zu1) eVar).yb(document);
        }
        ly3Var.H0();
        ly3Var.dismiss();
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
    public final void D(TLRPC.Document document) {
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
    public final void w(String str) {
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

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
    }
}
