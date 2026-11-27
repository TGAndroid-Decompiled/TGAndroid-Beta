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
public final class ol2 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        boolean z2;
        float f;
        pl2 pl2Var = (pl2) view;
        boolean z3 = false;
        if (b8cVar.v == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        pl2Var.setGrid(z2);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b8cVar.H;
        TextView textView = pl2Var.d;
        TextView textView2 = pl2Var.c;
        de0 de0Var = pl2Var.b;
        jn5 jn5Var = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(ob6.M0(2131742827, null));
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nftitem.name);
            int indexOf = nftitem.name.indexOf(35);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new CharacterStyle(), indexOf, spannableStringBuilder.length(), 33);
            }
            textView2.setText(spannableStringBuilder);
        }
        String b2 = pl2.b(nftitem, "Model");
        String b3 = pl2.b(nftitem, "Backdrop");
        if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(b3)) {
            textView.setText(ob6.V(null, null, 2131742825, b2, b3));
        } else {
            textView.setText(nftitem.description);
        }
        jn5 c = pl2.c(nftitem, !pl2Var.f);
        int v0 = aob.v0(aob.y6, pl2Var.a);
        Drawable mutate = pl2Var.getContext().getResources().getDrawable(2131232860).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        if (pl2Var.f) {
            f = 11.0f;
        } else {
            f = 8.0f;
        }
        ShapeDrawable b0 = aob.b0(hl.L(f), aob.p1(0.1f, v0));
        zm2 zm2Var = new zm2(b0, mutate);
        pl2Var.h = mutate;
        pl2Var.n = b0;
        pl2Var.r = v0;
        if (c != null) {
            if (pl2Var.f) {
                if (nftitem.image_small != null && nftitem.image != null) {
                    jn5Var = pl2.c(nftitem, true);
                }
                de0Var.a.Z(c, "160_160", jn5Var, "100_100", zm2Var, 0L, null, nftitem, 0);
                de0Var.e();
            } else {
                de0Var.m(c, "46_46", zm2Var, nftitem);
            }
        } else {
            de0Var.setImageDrawable(zm2Var);
        }
        if (z && !pl2Var.f) {
            z3 = true;
        }
        pl2Var.e = z3;
        pl2Var.updateColors();
        pl2Var.invalidate();
    }

    @Override
    public final boolean c(b8c b8cVar, b8c b8cVar2) {
        if (e(b8cVar, b8cVar2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b8cVar.H;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) b8cVar2.H;
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
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new pl2(context, vnbVar);
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) b8cVar.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) b8cVar2.H;
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
