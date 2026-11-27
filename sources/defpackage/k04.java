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
import org.telegram.ui.ActionBar.e;
public final class k04 implements pw2 {
    public final o24 a;

    public k04(o24 o24Var) {
        this.a = o24Var;
    }

    @Override
    public final boolean A() {
        return true;
    }

    @Override
    public final boolean C(TLRPC.Document document) {
        return true;
    }

    @Override
    public final void D(TLRPC.Document document) {
        TLRPC.TL_stickers_removeStickerFromSet tL_stickers_removeStickerFromSet = new TLRPC.TL_stickers_removeStickerFromSet();
        tL_stickers_removeStickerFromSet.sticker = ls6.c0(document, "").document;
        ConnectionsManager.getInstance(this.a.d1).sendRequest(tL_stickers_removeStickerFromSet, new ye(this, (byte) 23));
    }

    @Override
    public final String E(boolean z) {
        o24 o24Var = this.a;
        if (z) {
            j79 adapter = o24Var.i0.getAdapter();
            t14 t14Var = o24Var.k0;
            if (adapter == t14Var) {
                return t14Var.x;
            }
            return null;
        }
        j79 adapter2 = o24Var.Q.getAdapter();
        o14 o14Var = o24Var.T;
        if (adapter2 == o14Var) {
            return o14Var.w;
        }
        return null;
    }

    @Override
    public final void G(TLRPC.Document document) {
        d31 d31Var;
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(r47.U(document));
        valueOf.setSpan(new hm(document, (Paint.FontMetricsInt) null), 0, valueOf.length(), 33);
        if (hl.g(valueOf)) {
            o24 o24Var = this.a;
            e eVar = o24Var.Z1;
            if (eVar != null) {
                d31Var = d31.b0(eVar);
            } else {
                d31Var = new d31(o24Var.r, o24Var.a2);
            }
            d31Var.i(ob6.M0(2131751149, null)).j();
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
    public final void L(Object obj, Object obj2) {
        o24 o24Var = this.a;
        rz3 rz3Var = o24Var.i0;
        if (rz3Var.getAdapter() != o24Var.o0 && rz3Var.getAdapter() != o24Var.k0) {
            return;
        }
        o24Var.u1.e(obj, obj2);
    }

    @Override
    public final boolean M() {
        return false;
    }

    @Override
    public final void O() {
        this.a.W();
    }

    @Override
    public final void P(TLRPC.InputStickerSet inputStickerSet, boolean z) {
        if (inputStickerSet == null) {
            return;
        }
        this.a.u1.d(null, inputStickerSet, false);
    }

    @Override
    public final boolean Q(TLRPC.Document document) {
        if (document != null) {
            ArrayList arrayList = pv3.i;
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
        if (!yac.h(yac.t0).p() || (f = yac.h(yac.t0).f()) == null) {
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
        o24 o24Var = this.a;
        if (o24Var.Z1 == null && o24Var.v0) {
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
        e eVar = this.a.Z1;
        if (i == 2) {
            if ((eVar instanceof zu1) && ((zu1) eVar).N4()) {
                if (!yac.h(yac.t0).p()) {
                    if (((zu1) eVar).h() == null || !lbc.D(((zu1) eVar).h())) {
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
        o24 o24Var = this.a;
        s4b.H0(o24Var.Z1, ls6.d0(o24Var.d1).n0(inputStickerSet, true), document);
    }

    @Override
    public final boolean n() {
        return false;
    }

    @Override
    public final void o(TLRPC.Document document) {
        if (document != null) {
            String str = "animated_" + document.id;
            HashMap hashMap = pv3.h;
            hashMap.remove(str);
            ArrayList arrayList = pv3.i;
            arrayList.remove(str);
            if (hashMap.isEmpty() || arrayList.isEmpty()) {
                pv3.a(pv3.o[0]);
            }
            y04 y04Var = this.a.S;
            if (y04Var != null) {
                y04Var.F(false);
            }
        }
    }

    @Override
    public final void r() {
        b14 b14Var = this.a.Q;
        if (b14Var != null && b14Var.m3 != null) {
            while (b14Var.m3.size() > 0) {
                a14 a14Var = (a14) b14Var.m3.valueAt(0);
                b14Var.m3.removeAt(0);
                if (a14Var != null) {
                    if (a14Var.d.getBackground() instanceof RippleDrawable) {
                        a14Var.d.getBackground().setState(new int[0]);
                    }
                    a14Var.d.setPressed(false);
                }
            }
        }
    }

    @Override
    public final void s(TLRPC.Document document) {
        TLRPC.EmojiStatus emojiStatus;
        Object obj;
        d31 d31Var;
        o24 o24Var = this.a;
        FrameLayout frameLayout = o24Var.r;
        e eVar = o24Var.Z1;
        vnb vnbVar = o24Var.a2;
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
        uc7.s1(o24Var.d1).v5(emojiStatus, null);
        vx3 vx3Var = new vx3(this, obj, (byte) 1);
        if (document == null) {
            n21 n21Var = new n21(o24Var.getContext(), vnbVar);
            n21Var.b.setText(ob6.M0(2131746014, null));
            ImageView imageView = n21Var.a;
            imageView.setImageResource(2131232367);
            imageView.setScaleX(0.8f);
            imageView.setScaleY(0.8f);
            yob.s(imageView, aob.z9, vnbVar, PorterDuff.Mode.MULTIPLY);
            t21 t21Var = new t21(vnbVar, o24Var.getContext(), true);
            t21Var.b = vx3Var;
            n21Var.setButton(t21Var);
            if (eVar != null) {
                v21.g(eVar, n21Var, 1500).j();
                return;
            } else {
                v21.f(frameLayout, n21Var, 1500).j();
                return;
            }
        }
        if (eVar != null) {
            d31Var = d31.b0(eVar);
        } else {
            d31Var = new d31(frameLayout, vnbVar);
        }
        d31Var.r(document, ob6.M0(2131745273, null), ob6.M0(2131743540, null), vx3Var).j();
    }

    @Override
    public final boolean u() {
        return true;
    }

    @Override
    public final void v(Object obj, Object obj2, boolean z, int i, int i2) {
        o24 o24Var = this.a;
        rz3 rz3Var = o24Var.i0;
        if (rz3Var.getAdapter() == o24Var.o0) {
            o24Var.u1.u(null, obj, null, obj2, z, i, i2);
        } else if (rz3Var.getAdapter() == o24Var.k0) {
            o24Var.u1.u(null, obj, null, obj2, z, i, i2);
        }
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
        e eVar = this.a.Z1;
        if (eVar instanceof zu1) {
            ((zu1) eVar).yb(document);
        }
    }

    @Override
    public final void N() {
    }

    @Override
    public final void p() {
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
    public final void w(String str) {
    }

    @Override
    public final void t(TLRPC.StickerSet stickerSet, String str) {
    }

    @Override
    public final void F(CharSequence charSequence, String str, rx1 rx1Var) {
    }
}
