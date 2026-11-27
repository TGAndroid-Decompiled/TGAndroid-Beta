package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class pl9 extends ze9 implements snb, zlb {
    public final vnb n;
    public final dg9 r;
    public nl9 s;
    public final ArrayList w;
    public boolean x;

    public pl9(Context context, vnb vnbVar) {
        super(context);
        this.w = new ArrayList();
        this.n = vnbVar;
        f(hl.L(16.0f), hl.L(1.0f), hl.L(16.0f), hl.L(8.0f));
        dg9 dg9Var = new dg9(context, vnbVar);
        this.r = dg9Var;
        dg9Var.setPadding(hl.L(2.0f), hl.L(1.0f), hl.L(2.0f), hl.L(1.0f));
        dg9Var.setAllowNewlines(false);
        dg9Var.setInputType(147457);
        dg9Var.setGravity(8388659);
        dg9Var.setTextSize(1, Math.max(8, xea.S0 - 2));
        dg9Var.setTypeface(hl.n1("fonts/rmedium.ttf"));
        dg9Var.setTextColorKey(aob.Fi);
        dg9Var.setAccentHint(true);
        dg9Var.setHint(ob6.M0(2131754013, null));
        dg9Var.setListener(new ve9(this, (byte) 3));
        dg9Var.setDelegate(new ye9(this, (byte) 7));
        addView(dg9Var, tre.e(-1, -2, 51));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.Fi));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        amb ambVar;
        nl9 nl9Var = this.s;
        if (nl9Var != null) {
            ambVar = ((wh9) nl9Var).a.getTextSelectionHelper();
        } else {
            ambVar = null;
        }
        if (ambVar != null) {
            ArrayList arrayList = this.w;
            arrayList.clear();
            k(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                kmb kmbVar = (kmb) arrayList.get(i);
                canvas.save();
                canvas.translate(kmbVar.getX(), kmbVar.getY());
                ambVar.Y(canvas, this, i);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void g() {
        mk0 mk0Var;
        nl9 nl9Var = this.s;
        if (nl9Var != null && (mk0Var = this.a) != null) {
            long j = mk0Var.t;
            TL_iv.RichText f = mm9.f(this.r.getText());
            HashMap hashMap = ((wh9) nl9Var).a.u3;
            if (f != null && !(f instanceof TL_iv.textEmpty)) {
                hashMap.put(Long.valueOf(j), f);
            } else {
                hashMap.remove(Long.valueOf(j));
            }
        }
    }

    public mk0 getRow() {
        return this.a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        dg9 dg9Var = this.r;
        Layout layout = dg9Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new ml9(layout, dg9Var.getPaddingLeft() + dg9Var.getLeft(), dg9Var.getPaddingTop() + dg9Var.getTop(), (byte) 0));
    }

    @Override
    public final void updateColors() {
        dg9 dg9Var = this.r;
        dg9Var.updateColors();
        int i = aob.Fi;
        vnb vnbVar = this.n;
        dg9Var.setTextColor(aob.v0(i, vnbVar));
        dg9Var.setHintTextColor(aob.p1(0.5f, aob.v0(i, vnbVar)));
    }
}
