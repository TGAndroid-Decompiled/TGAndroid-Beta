package di;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.vy0;
public final class lc extends View implements org.telegram.ui.ActionBar.c6 {
    public PorterDuffColorFilter f9274a;
    public int f9275b;
    public final boolean f9276c;
    public final ArrayList d;
    public final ArrayList f9277e;
    public final Paint f9278f;
    public final org.telegram.ui.Components.c6 h;
    public float f9279n;
    public kc f9280r;
    public x10 f9281s;
    public final mc f9282w;

    public lc(mc mcVar, Context context, boolean z10) {
        super(context);
        this.f9282w = mcVar;
        this.d = new ArrayList();
        this.f9277e = new ArrayList();
        Paint paint = new Paint(1);
        this.f9278f = paint;
        this.h = new org.telegram.ui.Components.c6(this, 0L, 320L, lr.h);
        this.f9276c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, mcVar.f9341m1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.f9279n = this.h.e(false, arrayList.size());
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f9277e;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((kc) arrayList2.get(i7)).a(canvas);
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((kc) arrayList.get(i10)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                ((kc) arrayList.get(i7)).f9219k.P();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                ((kc) arrayList.get(i7)).f9219k.R();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kc kcVar;
        x10 x10Var;
        if (motionEvent.getAction() == 0) {
            kc kcVar2 = this.f9280r;
            if (kcVar2 != null) {
                kcVar2.f9225q.c(false);
            }
            this.f9280r = null;
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((kc) arrayList.get(i7)).f9212b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f9280r = (kc) arrayList.get(i7);
                    break;
                } else {
                    i7++;
                }
            }
            kc kcVar3 = this.f9280r;
            if (kcVar3 != null) {
                kcVar3.f9225q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (kcVar = this.f9280r) != null && !kcVar.f9224p && kcVar.f9212b.contains(motionEvent.getX(), motionEvent.getY()) && (x10Var = this.f9281s) != null) {
                x10Var.a(Long.valueOf(this.f9280r.f9218j));
            }
            kc kcVar4 = this.f9280r;
            if (kcVar4 != null) {
                kcVar4.f9225q.c(false);
            }
            this.f9280r = null;
        }
        if (this.f9280r == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                kc kcVar = (kc) arrayList.get(i7);
                if (kcVar.f9217i) {
                    kcVar.b(j3);
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(x10 x10Var) {
        this.f9281s = x10Var;
    }

    public void setSenders(ArrayList<fc> arrayList) {
        ArrayList arrayList2;
        lq[] lqVarArr;
        ?? r72;
        ?? r82;
        kc kcVar;
        ?? r22;
        String t6;
        ArrayList<fc> arrayList3 = arrayList;
        int i7 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            lqVarArr = null;
            fc fcVar = null;
            r72 = this.f9277e;
            r82 = 1;
            if (i7 >= size) {
                break;
            }
            kc kcVar2 = (kc) arrayList2.get(i7);
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                fc fcVar2 = arrayList3.get(i10);
                boolean z10 = fcVar2.f8840b;
                if ((z10 && kcVar2.f9217i) || (!kcVar2.f9217i && !z10 && fcVar2.f8841c == kcVar2.f9218j)) {
                    fcVar = arrayList3.get(i10);
                    break;
                }
            }
            if (fcVar == null) {
                kcVar2.f9219k.R();
                arrayList2.remove(i7);
                i7--;
                kcVar2.f9211a = -1;
                r72.add(kcVar2);
            }
            i7++;
        }
        int i11 = 0;
        while (i11 < arrayList3.size()) {
            fc fcVar3 = arrayList3.get(i11);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                kc kcVar3 = (kc) arrayList2.get(i12);
                boolean z11 = kcVar3.f9217i;
                if ((z11 && fcVar3.f8840b) || (!z11 && !fcVar3.f8840b && kcVar3.f9218j == fcVar3.f8841c)) {
                    kcVar = (kc) arrayList2.get(i12);
                    break;
                }
            }
            kcVar = lqVarArr;
            if (kcVar == null) {
                for (int i13 = 0; i13 < r72.size(); i13++) {
                    kc kcVar4 = (kc) r72.get(i13);
                    boolean z12 = kcVar4.f9217i;
                    if ((z12 && fcVar3.f8840b) || (!z12 && !fcVar3.f8840b && kcVar4.f9218j == fcVar3.f8841c)) {
                        kcVar = (kc) r72.get(i13);
                        break;
                    }
                }
                if (kcVar != null) {
                    r72.remove(kcVar);
                    kcVar.f9219k.P();
                    arrayList2.add(kcVar);
                }
            }
            if (kcVar == null) {
                kcVar = new kc(this, fcVar3.f8840b, fcVar3.f8841c);
                kcVar.d.e(r82, 0.0f);
                arrayList2.add(kcVar);
                kcVar.f9213c.e(r82, (arrayList3.size() - r82) - i11);
            }
            lc lcVar = kcVar.f9230w;
            mc mcVar = lcVar.f9282w;
            kcVar.f9211a = (arrayList3.size() - r82) - i11;
            long j3 = fcVar3.d;
            Paint paint = kcVar.h;
            kcVar.f9223o = new vy0(pb.U0(i5.c.l(j3, ',', new StringBuilder("⭐️")), 0.85f, lqVarArr), 12.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
            boolean z13 = lcVar.f9276c;
            int i14 = mcVar.n1;
            if (z13) {
                int i15 = (int) j3;
                kcVar.f9215f = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), new int[]{fi.t.b(i14, i15, 4), fi.t.b(i14, i15, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                kcVar.f9226r = i0.a.f(0.5f, fi.t.b(i14, i15, 4), fi.t.b(i14, i15, 3));
                paint.setShader(kcVar.f9215f);
            } else {
                paint.setShader(null);
                kcVar.f9226r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = kcVar.f9227s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(kcVar.f9226r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f9276c) {
                int i16 = i11 + 1;
                kcVar.v = i16;
                kcVar.f9229u = new vy0(i5.c.i(i16, ""), 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                if (i16 > 0 && kcVar.f9227s == null) {
                    Drawable mutate = lcVar.getContext().getResources().getDrawable(2131231174).mutate();
                    kcVar.f9227s = mutate;
                    int i17 = kcVar.f9226r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i17, mode));
                    Drawable mutate2 = lcVar.getContext().getResources().getDrawable(2131231175).mutate();
                    kcVar.f9228t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29467h5, mcVar.f9341m1), mode));
                }
            }
            if (fcVar3.f8840b) {
                kcVar.b(this.f9282w.f9353z1);
            } else {
                boolean z14 = fcVar3.f8839a;
                if (!kcVar.f9217i && kcVar.f9224p != z14) {
                    kcVar.f9224p = z14;
                    if (z14) {
                        r22 = null;
                        t6 = gd.M0(2131744813, null);
                    } else {
                        r22 = null;
                        t6 = org.telegram.messenger.n5.t(kcVar.f9218j);
                    }
                    kcVar.f9222n = new vy0(t6, 12.0f, r22);
                    lcVar.invalidate();
                    i11++;
                    arrayList3 = arrayList;
                    lqVarArr = r22;
                    r82 = 1;
                }
            }
            r22 = null;
            i11++;
            arrayList3 = arrayList;
            lqVarArr = r22;
            r82 = 1;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: di.lc.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
