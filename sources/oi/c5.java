package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import c8.ja;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.g9;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.s9;
public final class c5 extends x implements org.telegram.ui.ActionBar.z5, g9 {
    public final e6 f21613n;
    public final e1 f21614r;
    public a5 f21615s;
    public final ArrayList f21616w;
    public boolean f21617x;

    public c5(Context context, e6 e6Var) {
        super(context);
        this.f21616w = new ArrayList();
        this.f21613n = e6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e1 e1Var = new e1(context, e6Var);
        this.f21614r = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(8388659);
        e1Var.setTextSize(1, Math.max(8, gz.W0 - 2));
        e1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        e1Var.setTextColorKey(j6.Fi);
        e1Var.setAccentHint(true);
        e1Var.setHint(hd.M0(2131754020, null));
        e1Var.setListener(new gc.b(this, 24));
        e1Var.setDelegate(new ki.e(this, 23));
        addView(e1Var, ja.e(-1, -2, 51));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.Fi));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        h9 h9Var;
        a5 a5Var = this.f21615s;
        if (a5Var != null) {
            h9Var = ((x2) a5Var).f22119a.getTextSelectionHelper();
        } else {
            h9Var = null;
        }
        if (h9Var != null) {
            ArrayList arrayList = this.f21616w;
            arrayList.clear();
            k(arrayList);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                s9 s9Var = (s9) arrayList.get(i7);
                canvas.save();
                canvas.translate(s9Var.getX(), s9Var.getY());
                h9Var.Z(canvas, this, i7);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void g() {
        a aVar;
        a5 a5Var = this.f21615s;
        if (a5Var != null && (aVar = this.f22106a) != null) {
            long j3 = aVar.f21560t;
            TL_iv.RichText f10 = a6.f(this.f21614r.getText());
            q3 q3Var = ((x2) a5Var).f22119a;
            if (f10 != null && !(f10 instanceof TL_iv.textEmpty)) {
                q3Var.f21941u3.put(Long.valueOf(j3), f10);
            } else {
                q3Var.f21941u3.remove(Long.valueOf(j3));
            }
        }
    }

    public a getRow() {
        return this.f22106a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        e1 e1Var = this.f21614r;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new z4(layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop(), 0));
    }

    @Override
    public final void updateColors() {
        e1 e1Var = this.f21614r;
        e1Var.updateColors();
        int i7 = j6.Fi;
        e6 e6Var = this.f21613n;
        e1Var.setTextColor(j6.w0(i7, e6Var));
        e1Var.setHintTextColor(j6.r1(0.5f, j6.w0(i7, e6Var)));
    }
}
