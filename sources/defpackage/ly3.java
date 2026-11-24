package defpackage;

import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ly3 implements fx2 {
    public final az3 a;

    public ly3(az3 az3Var) {
        this.a = az3Var;
    }

    @Override
    public final void A(TLRPC.Document document) {
        az3 az3Var = this.a;
        d dVar = az3Var.m1;
        if (dVar instanceof yv1) {
            ((yv1) dVar).xb(document);
        }
        az3Var.G0();
        az3Var.dismiss();
    }

    @Override
    public final boolean B() {
        return false;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        if (z8c.h(z8c.t0).p() && k47.H2(document)) {
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
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(k47.U(document));
        valueOf.setSpan(new gn(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (gm.g(valueOf)) {
            az3 az3Var = this.a;
            new c41((FrameLayout) az3Var.b, az3Var.J0).i(jb6.M0(2131751121, null)).j();
        }
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
    public final boolean Q(TLRPC.Document document) {
        return false;
    }

    @Override
    public final Boolean S(TLRPC.Document document) {
        TLRPC.User f;
        boolean z;
        if (!z8c.h(z8c.t0).p() || !k47.H2(document) || (f = z8c.h(z8c.t0).f()) == null) {
            return null;
        }
        Long i = m9c.i(f);
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
        d dVar = this.a.m1;
        if (dVar instanceof yv1) {
            return ((yv1) dVar).X7();
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
        d dVar = this.a.m1;
        if ((dVar instanceof yv1) && ((yv1) dVar).N4()) {
            if (!z8c.h(z8c.t0).p()) {
                if (((yv1) dVar).h() != null && m9c.D(((yv1) dVar).h())) {
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
    public final void r(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        if (document == null) {
            emojiStatus = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = document.id;
            emojiStatus = tL_emojiStatus;
        }
        TLRPC.User f = z8c.h(z8c.t0).f();
        if (f == null) {
            obj = new TLRPC.TL_emojiStatusEmpty();
        } else {
            obj = f.emoji_status;
        }
        az3 az3Var = this.a;
        oc7.r1(az3Var.a).p5(emojiStatus, null);
        pv3 pv3Var = new pv3(this, obj, (byte) 4);
        if (document == null) {
            m31 m31Var = new m31(az3Var.getContext(), az3Var.J0);
            m31Var.b.setText(jb6.M0(2131746020, null));
            m31Var.a.setImageResource(2131232368);
            s31 s31Var = new s31(az3Var.J0, az3Var.getContext(), true);
            s31Var.b = pv3Var;
            m31Var.setButton(s31Var);
            u31.f((FrameLayout) az3Var.b, m31Var, 1500).j();
            return;
        }
        new c41((FrameLayout) az3Var.b, az3Var.J0).r(document, jb6.M0(2131745279, null), jb6.M0(2131743572, null), pv3Var).j();
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final k47 x() {
        return null;
    }

    @Override
    public final boolean y() {
        return false;
    }

    @Override
    public final void D(TLRPC.Document document) {
    }

    @Override
    public final void J(t5a t5aVar) {
    }

    @Override
    public final void M() {
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
    public final void p() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void w(String str) {
    }

    @Override
    public final void K(Object obj, Object obj2) {
    }

    @Override
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
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
