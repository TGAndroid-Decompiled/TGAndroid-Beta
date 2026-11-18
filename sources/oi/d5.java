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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.t9;
public final class d5 extends x implements org.telegram.ui.ActionBar.c6, h9 {
    public final i6 f21994n;
    public final e1 f21995r;
    public b5 f21996s;
    public final ArrayList f21997w;
    public boolean f21998x;

    public d5(Context context, i6 i6Var) {
        super(context);
        this.f21997w = new ArrayList();
        this.f21994n = i6Var;
        f(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(8.0f));
        e1 e1Var = new e1(context, i6Var);
        this.f21995r = e1Var;
        e1Var.setPadding(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(1.0f));
        e1Var.setAllowNewlines(false);
        e1Var.setInputType(147457);
        e1Var.setGravity(8388659);
        e1Var.setTextSize(1, Math.max(8, bz.W0 - 2));
        e1Var.setTypeface(org.telegram.messenger.g0.o1("fonts/rmedium.ttf"));
        e1Var.setTextColorKey(n6.Fi);
        e1Var.setAccentHint(true);
        e1Var.setHint(gd.M0(2131754018, null));
        e1Var.setListener(new hi.w4(this, 19));
        e1Var.setDelegate(new ki.e(this, 24));
        addView(e1Var, ma.e(-1, -2, 51));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(n6.Fi));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        i9 i9Var;
        b5 b5Var = this.f21996s;
        if (b5Var != null) {
            i9Var = ((z2) b5Var).f22551a.getTextSelectionHelper();
        } else {
            i9Var = null;
        }
        if (i9Var != null) {
            ArrayList arrayList = this.f21997w;
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
        b5 b5Var = this.f21996s;
        if (b5Var != null && (aVar = this.f22442a) != null) {
            long j3 = aVar.f21926t;
            TL_iv.RichText f10 = b6.f(this.f21995r.getText());
            s3 s3Var = ((z2) b5Var).f22551a;
            if (f10 != null && !(f10 instanceof TL_iv.textEmpty)) {
                s3Var.f22347u3.put(Long.valueOf(j3), f10);
            } else {
                s3Var.f22347u3.remove(Long.valueOf(j3));
            }
        }
    }

    public a getRow() {
        return this.f22442a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        e1 e1Var = this.f21995r;
        Layout layout = e1Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new a5(layout, e1Var.getPaddingLeft() + e1Var.getLeft(), e1Var.getPaddingTop() + e1Var.getTop(), 0));
    }

    @Override
    public final void updateColors() {
        e1 e1Var = this.f21995r;
        e1Var.updateColors();
        int i7 = n6.Fi;
        i6 i6Var = this.f21994n;
        e1Var.setTextColor(n6.w0(i7, i6Var));
        e1Var.setHintTextColor(n6.r1(0.5f, n6.w0(i7, i6Var)));
    }
}
