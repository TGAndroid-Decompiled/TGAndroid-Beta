package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import b8.mf;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.s9;
public final class f5 extends y implements org.telegram.ui.ActionBar.z5, g9 {
    public final org.telegram.ui.ActionBar.e6 f19603n;
    public final h1 f19604r;
    public d5 f19605s;
    public final ArrayList f19606w;
    public boolean f19607x;

    public f5(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f19606w = new ArrayList();
        this.f19603n = e6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        h1 h1Var = new h1(context, e6Var);
        this.f19604r = h1Var;
        h1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        h1Var.setAllowNewlines(false);
        h1Var.setInputType(147457);
        h1Var.setGravity(8388659);
        h1Var.setTextSize(1, Math.max(8, az.W0 - 2));
        h1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        h1Var.setTextColorKey(k6.Ci);
        h1Var.setAccentHint(true);
        h1Var.setHint(bd.M0(2131754020, null));
        h1Var.setListener(new gi.v5(this, 17));
        h1Var.setDelegate(new l5.b(this, 12));
        addView(h1Var, mf.e(-1, -2, 51));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.Ci));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h9 h9Var;
        d5 d5Var = this.f19605s;
        if (d5Var != null) {
            h9Var = ((a3) d5Var).f19458a.getTextSelectionHelper();
        } else {
            h9Var = null;
        }
        if (h9Var != null) {
            ArrayList arrayList = this.f19606w;
            arrayList.clear();
            k(arrayList);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                s9 s9Var = (s9) arrayList.get(i3);
                canvas.save();
                canvas.translate(s9Var.getX(), s9Var.getY());
                h9Var.Z(canvas, this, i3);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void g() {
        a aVar;
        d5 d5Var = this.f19605s;
        if (d5Var != null && (aVar = this.f20029a) != null) {
            long j10 = aVar.f19447t;
            TL_iv.RichText f10 = d6.f(this.f19604r.getText());
            t3 t3Var = ((a3) d5Var).f19458a;
            if (f10 != null && !(f10 instanceof TL_iv.textEmpty)) {
                t3Var.f19926u3.put(Long.valueOf(j10), f10);
            } else {
                t3Var.f19926u3.remove(Long.valueOf(j10));
            }
        }
    }

    public a getRow() {
        return this.f20029a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        h1 h1Var = this.f19604r;
        Layout layout = h1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new c5(layout, h1Var.getPaddingLeft() + h1Var.getLeft(), h1Var.getPaddingTop() + h1Var.getTop(), 0));
    }

    @Override
    public final void updateColors() {
        h1 h1Var = this.f19604r;
        h1Var.updateColors();
        int i3 = k6.Ci;
        org.telegram.ui.ActionBar.e6 e6Var = this.f19603n;
        h1Var.setTextColor(k6.w0(i3, e6Var));
        h1Var.setHintTextColor(k6.r1(0.5f, k6.w0(i3, e6Var)));
    }
}
