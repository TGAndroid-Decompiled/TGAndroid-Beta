package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.RippleDrawable;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class pz3 implements vv2 {
    public final t14 a;

    public pz3(t14 t14Var) {
        this.a = t14Var;
    }

    @Override
    public final boolean A(TLRPC.Document document) {
        return true;
    }

    @Override
    public final void B(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = hq6.c0(document, "").document;
        ConnectionsManager.getInstance(this.a.d1).sendRequest(tL_stickers_removeStickerFromSet, new tf(this, (byte) 23));
    }

    @Override
    public final String C(boolean z) {
        t14 t14Var = this.a;
        if (z) {
            w39 adapter = t14Var.i0.getAdapter();
            y04 y04Var = t14Var.k0;
            if (adapter == y04Var) {
                return y04Var.x;
            }
            return null;
        }
        w39 adapter2 = t14Var.Q.getAdapter();
        t04 t04Var = t14Var.T;
        if (adapter2 == t04Var) {
            return t04Var.w;
        }
        return null;
    }

    @Override
    public final void E(TLRPC.Document document) {
        u21 u21Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(k27.U(document));
        valueOf.setSpan(new gm(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (gl.g(valueOf)) {
            t14 t14Var = this.a;
            d dVar = t14Var.Z1;
            if (dVar != null) {
                u21Var = u21.b0(dVar);
            } else {
                u21Var = new u21(t14Var.r, t14Var.a2);
            }
            u21Var.i(k96.M0(2131751172, null)).j();
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
    public final void J(Object obj, Object obj2) {
        t14 t14Var = this.a;
        wy3 wy3Var = t14Var.i0;
        if (wy3Var.getAdapter() != t14Var.o0 && wy3Var.getAdapter() != t14Var.k0) {
            return;
        }
        t14Var.u1.e(obj, obj2);
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final void N() {
        this.a.X();
    }

    @Override
    public final void O(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.u1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean P(TLRPC.Document document) {
        if (document != null) {
            ArrayList arrayList = vu3.i;
            if (arrayList.contains("animated_" + document.id)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final Boolean S(TLRPC.Document document) {
        TLRPC.User f;
        boolean z;
        if (!y6c.h(y6c.t0).p() || (f = y6c.h(y6c.t0).f()) == null) {
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
        return this.a.u1.a();
    }

    @Override
    public final boolean b() {
        return this.a.u1.b();
    }

    @Override
    public final boolean c() {
        return this.a.u1.c();
    }

    @Override
    public final TLRPC.TL_messageMediaPoll d() {
        return null;
    }

    @Override
    public final boolean e(TLRPC.Document document) {
        return this.a.u1.k();
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
        t14 t14Var = this.a;
        if (t14Var.Z1 == null && t14Var.v0) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final boolean j(int i) {
        d dVar = this.a.Z1;
        if (i == 2) {
            if ((dVar instanceof mu1) && ((mu1) dVar).I4()) {
                if (!y6c.h(y6c.t0).p()) {
                    if (((mu1) dVar).h() == null || !l7c.D(((mu1) dVar).h())) {
                        return false;
                    }
                    return true;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final void k(TLRPC.Document document, String str, Object obj, boolean z, int i, int i2) {
        this.a.u1.x(null, document, str, obj, null, z, i);
    }

    @Override
    public final void m(TLRPC.Document document) {
        TLRPC.InputStickerSet inputStickerSet;
        int i = 0;
        while (true) {
            if (i < document.attributes.size()) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeSticker) && (inputStickerSet = documentAttribute.stickerset) != null) {
                    break;
                }
                i++;
            } else {
                inputStickerSet = null;
                break;
            }
        }
        t14 t14Var = this.a;
        u0b.G0(t14Var.Z1, hq6.d0(t14Var.d1).n0(inputStickerSet, true), document);
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void o(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.id;
            HashMap hashMap = vu3.h;
            hashMap.remove(str);
            ArrayList arrayList = vu3.i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                vu3.a(vu3.o[0]);
            }
            d04 d04Var = this.a.S;
            if (d04Var != null) {
                d04Var.F(false);
            }
        }
    }

    @Override
    public final void q() {
        g04 g04Var = this.a.Q;
        if (g04Var != null && g04Var.m3 != null) {
            while (g04Var.m3.size() > 0) {
                f04 f04Var = (f04) g04Var.m3.valueAt(0);
                g04Var.m3.removeAt(0);
                if (f04Var != null) {
                    if (f04Var.d.getBackground() instanceof RippleDrawable) {
                        f04Var.d.getBackground().setState(new int[0]);
                    }
                    f04Var.d.setPressed(false);
                }
            }
        }
    }

    @Override
    public final void r(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        u21 u21Var;
        t14 t14Var = this.a;
        FrameLayout frameLayout = t14Var.r;
        d dVar = t14Var.Z1;
        wjb wjbVar = t14Var.a2;
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
        na7.q1(t14Var.d1).n5(emojiStatus, null);
        eu3 eu3Var = new eu3(this, obj, (byte) 4);
        if (document == null) {
            e21 e21Var = new e21(t14Var.getContext(), wjbVar);
            e21Var.b.setText(k96.M0(2131746094, null));
            ImageView imageView = e21Var.a;
            imageView.setImageResource(2131232367);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            zkb.s(imageView, bkb.y9, wjbVar, PorterDuff.Mode.MULTIPLY);
            k21 k21Var = new k21(wjbVar, t14Var.getContext(), true);
            k21Var.b = eu3Var;
            e21Var.setButton(k21Var);
            if (dVar != null) {
                m21.g(dVar, e21Var, 1500).j();
                return;
            } else {
                m21.f(frameLayout, e21Var, 1500).j();
                return;
            }
        }
        if (dVar != null) {
            u21Var = u21.b0(dVar);
        } else {
            u21Var = new u21(frameLayout, wjbVar);
        }
        u21Var.r(document, k96.M0(2131745353, null), k96.M0(2131743646, null), eu3Var).j();
    }

    @Override
    public final boolean t() {
        return true;
    }

    @Override
    public final void u(Object obj, Object obj2, boolean z, int i, int i2) {
        t14 t14Var = this.a;
        wy3 wy3Var = t14Var.i0;
        if (wy3Var.getAdapter() == t14Var.o0) {
            t14Var.u1.u(null, obj, null, obj2, z, i, i2);
        } else if (wy3Var.getAdapter() == t14Var.k0) {
            t14Var.u1.u(null, obj, null, obj2, z, i, i2);
        }
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
        d dVar = this.a.Z1;
        if (dVar instanceof mu1) {
            ((mu1) dVar).nb(document);
        }
    }

    @Override
    public final boolean z() {
        return true;
    }

    @Override
    public final void L() {
    }

    @Override
    public final void p() {
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
    public final void v(String str) {
    }

    @Override
    public final void s(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void R(CharSequence charSequence, String str, pz1 pz1Var) {
    }
}
