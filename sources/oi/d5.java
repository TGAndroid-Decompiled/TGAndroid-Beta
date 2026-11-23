package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import c8.na;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.u9;
public final class d5 extends x implements org.telegram.ui.ActionBar.b6, i9 {
    public final h6 f22020n;
    public final e1 f22021r;
    public b5 f22022s;
    public final ArrayList f22023w;
    public boolean f22024x;

    public d5(Context context, h6 h6Var) {
        super(context);
        this.f22023w = new ArrayList();
        this.f22020n = h6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e1 e1Var = new e1(context, h6Var);
        this.f22021r = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(8388659);
        e1Var.setTextSize(1, Math.max(8, cz.W0 - 2));
        e1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        e1Var.setTextColorKey(m6.Fi);
        e1Var.setAccentHint(true);
        e1Var.setHint(hd.N0(2131754017, null));
        e1Var.setListener(new hi.x4(this, 19));
        e1Var.setDelegate(new kg.y1(this, 25));
        addView(e1Var, na.e(-1, -2, 51));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Fi));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j9 j9Var;
        b5 b5Var = this.f22022s;
        if (b5Var != null) {
            j9Var = ((z2) b5Var).f22543a.getTextSelectionHelper();
        } else {
            j9Var = null;
        }
        if (j9Var != null) {
            ArrayList arrayList = this.f22023w;
            arrayList.clear();
            k(arrayList);
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                u9 u9Var = (u9) arrayList.get(i7);
                canvas.save();
                canvas.translate(u9Var.getX(), u9Var.getY());
                j9Var.Z(canvas, this, i7);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void g() {
        a aVar;
        b5 b5Var = this.f22022s;
        if (b5Var != null && (aVar = this.f22468a) != null) {
            long j3 = aVar.f21917t;
            TL_iv.RichText f10 = b6.f(this.f22021r.getText());
            s3 s3Var = ((z2) b5Var).f22543a;
            if (f10 != null && !(f10 instanceof TL_iv.textEmpty)) {
                s3Var.f22375u3.put(Long.valueOf(j3), f10);
            } else {
                s3Var.f22375u3.remove(Long.valueOf(j3));
            }
        }
    }

    public a getRow() {
        return this.f22468a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        e1 e1Var = this.f22021r;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new a5(layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop(), 0));
    }

    @Override
    public final void updateColors() {
        e1 e1Var = this.f22021r;
        e1Var.updateColors();
        int i7 = m6.Fi;
        h6 h6Var = this.f22020n;
        e1Var.setTextColor(m6.w0(i7, h6Var));
        e1Var.setHintTextColor(m6.r1(0.5f, m6.w0(i7, h6Var)));
    }
}
