package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import c8.ma;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Cells.u9;
public final class e5 extends y implements org.telegram.ui.ActionBar.b6, i9 {
    public final h6 f22080n;
    public final f1 f22081r;
    public c5 f22082s;
    public final ArrayList f22083w;
    public boolean f22084x;

    public e5(Context context, h6 h6Var) {
        super(context);
        this.f22083w = new ArrayList();
        this.f22080n = h6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        f1 f1Var = new f1(context, h6Var);
        this.f22081r = f1Var;
        f1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        f1Var.setAllowNewlines(false);
        f1Var.setInputType(147457);
        f1Var.setGravity(8388659);
        f1Var.setTextSize(1, Math.max(8, bz.W0 - 2));
        f1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        f1Var.setTextColorKey(m6.Fi);
        f1Var.setAccentHint(true);
        f1Var.setHint(gd.N0(2131754017, null));
        f1Var.setListener(new hi.w4(this, 19));
        f1Var.setDelegate(new kg.x1(this, 25));
        addView(f1Var, ma.e(-1, -2, 51));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(m6.Fi));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        j9 j9Var;
        c5 c5Var = this.f22082s;
        if (c5Var != null) {
            j9Var = ((a3) c5Var).f21958a.getTextSelectionHelper();
        } else {
            j9Var = null;
        }
        if (j9Var != null) {
            ArrayList arrayList = this.f22083w;
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
        c5 c5Var = this.f22082s;
        if (c5Var != null && (aVar = this.f22528a) != null) {
            long j3 = aVar.f21948t;
            TL_iv.RichText f10 = c6.f(this.f22081r.getText());
            t3 t3Var = ((a3) c5Var).f21958a;
            if (f10 != null && !(f10 instanceof TL_iv.textEmpty)) {
                t3Var.f22435u3.put(Long.valueOf(j3), f10);
            } else {
                t3Var.f22435u3.remove(Long.valueOf(j3));
            }
        }
    }

    public a getRow() {
        return this.f22528a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        f1 f1Var = this.f22081r;
        Layout layout = f1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new b5(layout, f1Var.getPaddingLeft() + f1Var.getLeft(), f1Var.getPaddingTop() + f1Var.getTop(), 0));
    }

    @Override
    public final void updateColors() {
        f1 f1Var = this.f22081r;
        f1Var.updateColors();
        int i7 = m6.Fi;
        h6 h6Var = this.f22080n;
        f1Var.setTextColor(m6.w0(i7, h6Var));
        f1Var.setHintTextColor(m6.r1(0.5f, m6.w0(i7, h6Var)));
    }
}
