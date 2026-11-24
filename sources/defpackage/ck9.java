package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class ck9 extends jd9 implements vlb, fkb {
    public final ylb n;
    public final ne9 r;
    public ak9 s;
    public final ArrayList w;
    public boolean x;

    public ck9(Context context, ylb ylbVar) {
        super(context);
        this.w = new ArrayList();
        this.n = ylbVar;
        f(gm.L(16.0f), gm.L(1.0f), gm.L(16.0f), gm.L(8.0f));
        ne9 ne9Var = new ne9(context, ylbVar);
        this.r = ne9Var;
        ne9Var.setPadding(gm.L(2.0f), gm.L(1.0f), gm.L(2.0f), gm.L(1.0f));
        ne9Var.setAllowNewlines(false);
        ne9Var.setInputType(147457);
        ne9Var.setGravity(8388659);
        ne9Var.setTextSize(1, Math.max(8, gda.S0 - 2));
        ne9Var.setTypeface(gm.n1("fonts/rmedium.ttf"));
        ne9Var.setTextColorKey(cmb.Ei);
        ne9Var.setAccentHint(true);
        ne9Var.setHint(jb6.M0(2131753985, null));
        ne9Var.setListener(new x59(this, (byte) 6));
        ne9Var.setDelegate(new yf9(this, (byte) 4));
        addView(ne9Var, qoe.e(-1, -2, 51));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Ei));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        gkb gkbVar;
        ak9 ak9Var = this.s;
        if (ak9Var != null) {
            gkbVar = ((jg9) ak9Var).a.getTextSelectionHelper();
        } else {
            gkbVar = null;
        }
        if (gkbVar != null) {
            ArrayList arrayList = this.w;
            arrayList.clear();
            k(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                qkb qkbVar = (qkb) arrayList.get(i);
                canvas.save();
                canvas.translate(qkbVar.getX(), qkbVar.getY());
                gkbVar.Y(canvas, this, i);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void g() {
        ll0 ll0Var;
        ak9 ak9Var = this.s;
        if (ak9Var != null && (ll0Var = this.a) != null) {
            long j = ll0Var.t;
            TL_iv.RichText f = zk9.f(this.r.getText());
            HashMap hashMap = ((jg9) ak9Var).a.u3;
            if (f != null && !(f instanceof TL_iv.textEmpty)) {
                hashMap.put(Long.valueOf(j), f);
            } else {
                hashMap.remove(Long.valueOf(j));
            }
        }
    }

    public ll0 getRow() {
        return this.a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        ne9 ne9Var = this.r;
        Layout layout = ne9Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new zj9(layout, ne9Var.getPaddingLeft() + ne9Var.getLeft(), ne9Var.getPaddingTop() + ne9Var.getTop(), (byte) 0));
    }

    @Override
    public final void updateColors() {
        ne9 ne9Var = this.r;
        ne9Var.updateColors();
        int i = cmb.Ei;
        ylb ylbVar = this.n;
        ne9Var.setTextColor(cmb.v0(i, ylbVar));
        ne9Var.setHintTextColor(cmb.p1(0.5f, cmb.v0(i, ylbVar)));
    }
}
