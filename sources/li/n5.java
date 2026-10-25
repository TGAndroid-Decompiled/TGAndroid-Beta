package li;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import j$.util.Objects;
import java.util.LinkedHashSet;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class n5 extends s61 {
    public static final int f17382a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        boolean z11;
        p5 p5Var = (p5) view;
        a aVar = (a) t61Var.G;
        b3 b3Var = (b3) t61Var.H;
        r5 r5Var = p5Var.v;
        boolean z12 = true;
        if (p5Var.f17653a != aVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        p5Var.f17653a = aVar;
        p5Var.E = b3Var;
        p5Var.f17416y = LocaleController.isRTL;
        p5Var.c(aVar);
        TL_iv.PageBlock pageBlock = aVar.f17054b;
        if (!(pageBlock instanceof TL_iv.pageBlockTable)) {
            return;
        }
        h6 h6Var = new h6((TL_iv.pageBlockTable) pageBlock);
        p5Var.F = h6Var;
        r5Var.setModel(h6Var);
        LinkedHashSet linkedHashSet = p5Var.H;
        Objects.requireNonNull(linkedHashSet);
        r5Var.setSelectionProvider(new jg.e1(linkedHashSet, 14));
        p5Var.x();
        g1 g1Var = p5Var.f17412r;
        a aVar2 = p5Var.f17653a;
        if (aVar2 != null) {
            TL_iv.PageBlock pageBlock2 = aVar2.f17054b;
            if (pageBlock2 instanceof TL_iv.pageBlockTable) {
                TL_iv.pageBlockTable pageblocktable = (TL_iv.pageBlockTable) pageBlock2;
                if (pageblocktable.title == null) {
                    pageblocktable.title = new TL_iv.textEmpty();
                }
                String l4 = f6.l(pageblocktable.title);
                SpannableStringBuilder r6 = f6.r(pageblocktable.title, null, true);
                a aVar3 = p5Var.f17653a;
                if (!aVar3.f17068s) {
                    aVar3.f17068s = true;
                    if (r6.length() != 0 && (f6.q(0, r6.length(), r6) & 1) == 0) {
                        z12 = false;
                    }
                    aVar3.f17067r = z12;
                }
                g1Var.setAutoBold(p5Var.f17653a.f17067r);
                if (z11 || !String.valueOf(g1Var.getText()).equals(l4)) {
                    g1Var.setTextSilently(Emoji.replaceEmoji(r6, g1Var.getPaint().getFontMetricsInt(), false));
                    g1Var.invalidateEffects();
                }
            }
        }
        p5Var.updateColors();
        p5Var.f17414w.requestLayout();
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        p5 p5Var = new p5(context, u6Var);
        p5Var.setBackground(new y1(y6.w0(y6.f23354d6, u6Var)));
        return p5Var;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
