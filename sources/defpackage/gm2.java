package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.view.View;
import android.widget.TextView;
import j$.util.Objects;
import org.telegram.tgnet.tl.TL_wallet;
public final class gm2 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        boolean z2;
        float f;
        hm2 hm2Var = (hm2) view;
        boolean z3 = false;
        if (c6cVar.v == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        hm2Var.setGrid(z2);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) c6cVar.H;
        TextView textView = hm2Var.d;
        TextView textView2 = hm2Var.c;
        bf0 bf0Var = hm2Var.b;
        gn5 gn5Var = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(jb6.M0(2131742859, null));
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nftitem.name);
            int indexOf = nftitem.name.indexOf(35);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new CharacterStyle(), indexOf, spannableStringBuilder.length(), 33);
            }
            textView2.setText(spannableStringBuilder);
        }
        String b2 = hm2.b(nftitem, "Model");
        String b3 = hm2.b(nftitem, "Backdrop");
        if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(b3)) {
            textView.setText(jb6.V(null, null, 2131742857, b2, b3));
        } else {
            textView.setText(nftitem.description);
        }
        gn5 c = hm2.c(nftitem, !hm2Var.f);
        int v0 = cmb.v0(cmb.x6, hm2Var.a);
        Drawable mutate = hm2Var.getContext().getResources().getDrawable(2131232854).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        if (hm2Var.f) {
            f = 11.0f;
        } else {
            f = 8.0f;
        }
        ShapeDrawable b0 = cmb.b0(gm.L(f), cmb.p1(0.1f, v0));
        sn2 sn2Var = new sn2(b0, mutate);
        hm2Var.h = mutate;
        hm2Var.n = b0;
        hm2Var.r = v0;
        if (c != null) {
            if (hm2Var.f) {
                if (nftitem.image_small != null && nftitem.image != null) {
                    gn5Var = hm2.c(nftitem, true);
                }
                bf0Var.a.Z(c, "160_160", gn5Var, "100_100", sn2Var, 0L, null, nftitem, 0);
                bf0Var.e();
            } else {
                bf0Var.m(c, "46_46", sn2Var, nftitem);
            }
        } else {
            bf0Var.setImageDrawable(sn2Var);
        }
        if (z && !hm2Var.f) {
            z3 = true;
        }
        hm2Var.e = z3;
        hm2Var.updateColors();
        hm2Var.invalidate();
    }

    @Override
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        if (e(c6cVar, c6cVar2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) c6cVar.H;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) c6cVar2.H;
            if (nftitem != nftitem2) {
                if (nftitem == null || nftitem2 == null || !Objects.equals(nftitem.name, nftitem2.name) || !Objects.equals(nftitem.image, nftitem2.image) || !Objects.equals(nftitem.image_small, nftitem2.image_small) || !Objects.equals(nftitem.description, nftitem2.description) || !Objects.equals(nftitem.attributes, nftitem2.attributes) || !Objects.equals(nftitem.extra, nftitem2.extra)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    @Override
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new hm2(context, ylbVar);
    }

    @Override
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) c6cVar.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) c6cVar2.H;
        if (nftitem != null && nftitem2 != null) {
            return TextUtils.equals(nftitem.address, nftitem2.address);
        }
        if (nftitem == nftitem2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f() {
        return true;
    }
}
