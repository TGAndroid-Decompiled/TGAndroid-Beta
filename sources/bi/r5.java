package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.dd;
import org.telegram.messenger.uz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.u9;
public final class r5 extends c0 implements org.telegram.ui.ActionBar.k6, j9 {
    public final org.telegram.ui.ActionBar.p6 f3325n;
    public final n1 f3326r;
    public p5 f3327s;
    public final ArrayList f3328w;
    public boolean f3329x;

    public r5(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        this.f3328w = new ArrayList();
        this.f3325n = p6Var;
        f(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(8.0f));
        n1 n1Var = new n1(context, p6Var);
        this.f3326r = n1Var;
        n1Var.setPadding(org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(1.0f));
        n1Var.setAllowNewlines(false);
        n1Var.setInputType(147457);
        n1Var.setGravity(8388659);
        n1Var.setTextSize(1, Math.max(8, uz.W0 - 2));
        n1Var.setTypeface(org.telegram.messenger.i0.o1("fonts/rmedium.ttf"));
        n1Var.setTextColorKey(org.telegram.ui.ActionBar.t6.Ci);
        n1Var.setAccentHint(true);
        n1Var.setHint(dd.L0(2131754020, null));
        n1Var.setListener(new a4.l(this, 8));
        n1Var.setDelegate(new a1.c(this, 13));
        addView(n1Var, w7.b6.e(-1, -2, 51));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ci));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        k9 k9Var;
        p5 p5Var = this.f3327s;
        if (p5Var != null) {
            k9Var = ((j3) p5Var).f3119a.getTextSelectionHelper();
        } else {
            k9Var = null;
        }
        if (k9Var != null) {
            ArrayList arrayList = this.f3328w;
            arrayList.clear();
            h(arrayList);
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                u9 u9Var = (u9) arrayList.get(i10);
                canvas.save();
                canvas.translate(u9Var.getX(), u9Var.getY());
                k9Var.Z(canvas, this, i10);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void g() {
        a aVar;
        p5 p5Var = this.f3327s;
        if (p5Var != null && (aVar = this.f2881a) != null) {
            long j10 = aVar.f2833t;
            TL_iv.RichText f7 = s6.f(this.f3326r.getText());
            d4 d4Var = ((j3) p5Var).f3119a;
            if (f7 != null && !(f7 instanceof TL_iv.textEmpty)) {
                d4Var.f2948t3.put(Long.valueOf(j10), f7);
            } else {
                d4Var.f2948t3.remove(Long.valueOf(j10));
            }
        }
    }

    public a getRow() {
        return this.f2881a;
    }

    @Override
    public final void h(ArrayList arrayList) {
        n1 n1Var = this.f3326r;
        Layout layout = n1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new o5(layout, n1Var.getPaddingLeft() + n1Var.getLeft(), n1Var.getPaddingTop() + n1Var.getTop(), 0));
    }

    @Override
    public final void updateColors() {
        n1 n1Var = this.f3326r;
        n1Var.updateColors();
        int i10 = org.telegram.ui.ActionBar.t6.Ci;
        org.telegram.ui.ActionBar.p6 p6Var = this.f3325n;
        n1Var.setTextColor(org.telegram.ui.ActionBar.t6.w0(i10, p6Var));
        n1Var.setHintTextColor(org.telegram.ui.ActionBar.t6.r1(0.5f, org.telegram.ui.ActionBar.t6.w0(i10, p6Var)));
    }
}
