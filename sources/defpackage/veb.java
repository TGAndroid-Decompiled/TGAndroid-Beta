package defpackage;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class veb implements pw2 {
    public final zeb a;

    public veb(zeb zebVar) {
        this.a = zebVar;
    }

    @Override
    public final boolean A() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        if (this.a.E) {
            return false;
        }
        return yac.h(yac.t0).p();
    }

    @Override
    public final String E(boolean z) {
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        xeb xebVar;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(r47.U(document));
        valueOf.setSpan(new hm(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (hl.g(valueOf) && (xebVar = this.a.c) != null) {
            d31.b0(xebVar.getParentFragment()).i(ob6.M0(2131751149, null)).j();
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
        if (this.a.F || !yac.h(yac.t0).p() || (f = yac.h(yac.t0).f()) == null) {
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
        xeb xebVar = this.a.c;
        if (xebVar != null) {
            e parentFragment = xebVar.getParentFragment();
            if (parentFragment instanceof zu1) {
                return ((zu1) parentFragment).X7();
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
        xeb xebVar = this.a.c;
        if (xebVar != null) {
            e parentFragment = xebVar.getParentFragment();
            if (parentFragment instanceof zu1) {
                zu1 zu1Var = (zu1) parentFragment;
                if (zu1Var.N4()) {
                    if (!yac.h(yac.t0).p()) {
                        if (zu1Var.h() != null && lbc.D(zu1Var.h())) {
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
    public final void s(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        e parentFragment;
        zeb zebVar = this.a;
        vnb vnbVar = zebVar.b;
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
        uc7.s1(zebVar.a).v5(emojiStatus, null);
        hab habVar = new hab(this, obj, (byte) 2);
        xeb xebVar = zebVar.c;
        if (xebVar == null) {
            parentFragment = null;
        } else {
            parentFragment = xebVar.getParentFragment();
        }
        if (parentFragment != null) {
            if (document == null) {
                n21 n21Var = new n21(zebVar.getContext(), vnbVar);
                n21Var.b.setText(ob6.M0(2131746014, null));
                n21Var.a.setImageResource(2131232367);
                t21 t21Var = new t21(vnbVar, zebVar.getContext(), true);
                t21Var.b = habVar;
                n21Var.setButton(t21Var);
                v21.g(parentFragment, n21Var, 1500).j();
                return;
            }
            d31.b0(parentFragment).r(document, ob6.M0(2131745273, null), ob6.M0(2131743540, null), habVar).j();
        }
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
        zeb zebVar = this.a;
        xeb xebVar = zebVar.c;
        if (xebVar != null) {
            e parentFragment = xebVar.getParentFragment();
            if (parentFragment instanceof zu1) {
                ((zu1) parentFragment).yb(document);
                zebVar.c.setFieldText("");
            }
        }
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
