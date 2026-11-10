package li;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import c8.ha;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.id;
import org.telegram.messenger.iz;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.t9;
public final class e5 extends y implements org.telegram.ui.ActionBar.c6, h9 {
    public final h6 f18541n;
    public final g1 f18542r;
    public c5 f18543s;
    public final ArrayList f18544w;
    public boolean f18545x;

    public e5(Context context, h6 h6Var) {
        super(context);
        this.f18544w = new ArrayList();
        this.f18541n = h6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        g1 g1Var = new g1(context, h6Var);
        this.f18542r = g1Var;
        g1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        g1Var.setAllowNewlines(false);
        g1Var.setInputType(147457);
        g1Var.setGravity(8388659);
        g1Var.setTextSize(1, Math.max(8, iz.W0 - 2));
        g1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        g1Var.setTextColorKey(m6.Ci);
        g1Var.setAccentHint(true);
        g1Var.setHint(id.M0(2131754020, null));
        g1Var.setListener(new h9.f1(this, 11));
        g1Var.setDelegate(new l2.x(this, 10));
        addView(g1Var, ha.e(-1, -2, 51));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Ci));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i9 i9Var;
        c5 c5Var = this.f18543s;
        if (c5Var != null) {
            i9Var = ((z2) c5Var).f19051a.getTextSelectionHelper();
        } else {
            i9Var = null;
        }
        if (i9Var != null) {
            ArrayList arrayList = this.f18544w;
            arrayList.clear();
            k(arrayList);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                t9 t9Var = (t9) arrayList.get(i7);
                canvas.save();
                canvas.translate(t9Var.getX(), t9Var.getY());
                i9Var.Z(canvas, this, i7);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void g() {
        a aVar;
        c5 c5Var = this.f18543s;
        if (c5Var != null && (aVar = this.f18994a) != null) {
            long j3 = aVar.f18411t;
            TL_iv.RichText f10 = c6.f(this.f18542r.getText());
            t3 t3Var = ((z2) c5Var).f19051a;
            if (f10 != null && !(f10 instanceof TL_iv.textEmpty)) {
                t3Var.f18902t3.put(Long.valueOf(j3), f10);
            } else {
                t3Var.f18902t3.remove(Long.valueOf(j3));
            }
        }
    }

    public a getRow() {
        return this.f18994a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        g1 g1Var = this.f18542r;
        Layout layout = g1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new b5(layout, g1Var.getPaddingLeft() + g1Var.getLeft(), g1Var.getPaddingTop() + g1Var.getTop(), 0));
    }

    @Override
    public final void updateColors() {
        g1 g1Var = this.f18542r;
        g1Var.updateColors();
        int i7 = m6.Ci;
        h6 h6Var = this.f18541n;
        g1Var.setTextColor(m6.w0(i7, h6Var));
        g1Var.setHintTextColor(m6.r1(0.5f, m6.w0(i7, h6Var)));
    }
}
