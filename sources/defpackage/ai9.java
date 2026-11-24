package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
public final class ai9 extends jb9 implements tjb, eib {
    public final wjb n;
    public final mc9 r;
    public yh9 s;
    public final ArrayList w;
    public boolean x;

    public ai9(Context context, wjb wjbVar) {
        super(context);
        this.w = new ArrayList();
        this.n = wjbVar;
        f(gl.L(16.0f), gl.L(1.0f), gl.L(16.0f), gl.L(8.0f));
        mc9 mc9Var = new mc9(context, wjbVar);
        this.r = mc9Var;
        mc9Var.setPadding(gl.L(2.0f), gl.L(1.0f), gl.L(2.0f), gl.L(1.0f));
        mc9Var.setAllowNewlines(false);
        mc9Var.setInputType(147457);
        mc9Var.setGravity(8388659);
        mc9Var.setTextSize(1, Math.max(8, gba.T0 - 2));
        mc9Var.setTypeface(gl.n1("fonts/rmedium.ttf"));
        mc9Var.setTextColorKey(bkb.Ei);
        mc9Var.setAccentHint(true);
        mc9Var.setHint(k96.M0(2131754017, null));
        mc9Var.setListener(new u39(this, (byte) 6));
        mc9Var.setDelegate(new wh9(this, (byte) 0));
        addView(mc9Var, nme.e(-1, -2, 51));
        updateColors();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ei));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        fib fibVar;
        yh9 yh9Var = this.s;
        if (yh9Var != null) {
            fibVar = ((fe9) yh9Var).a.getTextSelectionHelper();
        } else {
            fibVar = null;
        }
        if (fibVar != null) {
            ArrayList arrayList = this.w;
            arrayList.clear();
            k(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                pib pibVar = (pib) arrayList.get(i);
                canvas.save();
                canvas.translate(pibVar.getX(), pibVar.getY());
                fibVar.Y(canvas, this, i);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void g() {
        lk0 lk0Var;
        yh9 yh9Var = this.s;
        if (yh9Var != null && (lk0Var = this.a) != null) {
            long j = lk0Var.t;
            TL_iv.RichText f = yi9.f(this.r.getText());
            HashMap hashMap = ((fe9) yh9Var).a.u3;
            if (f != null && !(f instanceof TL_iv.textEmpty)) {
                hashMap.put(Long.valueOf(j), f);
            } else {
                hashMap.remove(Long.valueOf(j));
            }
        }
    }

    public lk0 getRow() {
        return this.a;
    }

    @Override
    public final void k(ArrayList arrayList) {
        mc9 mc9Var = this.r;
        Layout layout = mc9Var.getLayout();
        if (layout == null) {
            return;
        }
        arrayList.add(new xh9(layout, mc9Var.getPaddingLeft() + mc9Var.getLeft(), mc9Var.getPaddingTop() + mc9Var.getTop(), (byte) 0));
    }

    @Override
    public final void updateColors() {
        mc9 mc9Var = this.r;
        mc9Var.updateColors();
        int i = bkb.Ei;
        wjb wjbVar = this.n;
        mc9Var.setTextColor(bkb.v0(i, wjbVar));
        mc9Var.setHintTextColor(bkb.p1(0.5f, bkb.v0(i, wjbVar)));
    }
}
