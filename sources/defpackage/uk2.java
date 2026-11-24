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
public final class uk2 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        boolean z2;
        float f;
        vk2 vk2Var = (vk2) view;
        boolean z3 = false;
        if (c4cVar.v == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        vk2Var.setGrid(z2);
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) c4cVar.H;
        TextView textView = vk2Var.d;
        TextView textView2 = vk2Var.c;
        be0 be0Var = vk2Var.b;
        gl5 gl5Var = null;
        if (TextUtils.isEmpty(nftitem.name)) {
            textView2.setText(k96.M0(2131742933, null));
        } else {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(nftitem.name);
            int indexOf = nftitem.name.indexOf(35);
            if (indexOf >= 0) {
                spannableStringBuilder.setSpan(new CharacterStyle(), indexOf, spannableStringBuilder.length(), 33);
            }
            textView2.setText(spannableStringBuilder);
        }
        String b2 = vk2.b(nftitem, "Model");
        String b3 = vk2.b(nftitem, "Backdrop");
        if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(b3)) {
            textView.setText(k96.V(null, null, 2131742931, b2, b3));
        } else {
            textView.setText(nftitem.description);
        }
        gl5 c = vk2.c(nftitem, !vk2Var.f);
        int v0 = bkb.v0(bkb.x6, vk2Var.a);
        Drawable mutate = vk2Var.getContext().getResources().getDrawable(2131232841).mutate();
        mutate.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN));
        if (vk2Var.f) {
            f = 11.0f;
        } else {
            f = 8.0f;
        }
        ShapeDrawable b0 = bkb.b0(gl.L(f), bkb.p1(0.1f, v0));
        fm2 fm2Var = new fm2(b0, mutate);
        vk2Var.h = mutate;
        vk2Var.n = b0;
        vk2Var.r = v0;
        if (c != null) {
            if (vk2Var.f) {
                if (nftitem.image_small != null && nftitem.image != null) {
                    gl5Var = vk2.c(nftitem, true);
                }
                be0Var.a.Z(c, "160_160", gl5Var, "100_100", fm2Var, 0L, null, nftitem, 0);
                be0Var.e();
            } else {
                be0Var.m(c, "46_46", fm2Var, nftitem);
            }
        } else {
            be0Var.setImageDrawable(fm2Var);
        }
        if (z && !vk2Var.f) {
            z3 = true;
        }
        vk2Var.e = z3;
        vk2Var.updateColors();
        vk2Var.invalidate();
    }

    @Override
    public final boolean c(c4c c4cVar, c4c c4cVar2) {
        if (e(c4cVar, c4cVar2)) {
            TL_wallet.nftItem nftitem = (TL_wallet.nftItem) c4cVar.H;
            TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) c4cVar2.H;
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
    public final View d(Context context, o39 o39Var, int i, wjb wjbVar) {
        return new vk2(context, wjbVar);
    }

    @Override
    public final boolean e(c4c c4cVar, c4c c4cVar2) {
        TL_wallet.nftItem nftitem = (TL_wallet.nftItem) c4cVar.H;
        TL_wallet.nftItem nftitem2 = (TL_wallet.nftItem) c4cVar2.H;
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
