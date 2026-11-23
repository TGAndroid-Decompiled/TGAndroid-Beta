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
import org.telegram.messenger.hd;
import org.telegram.messenger.y10;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.xy0;
public final class lc extends View implements org.telegram.ui.ActionBar.b6 {
    public PorterDuffColorFilter f9307a;
    public int f9308b;
    public final boolean f9309c;
    public final ArrayList d;
    public final ArrayList f9310e;
    public final Paint f9311f;
    public final org.telegram.ui.Components.d6 h;
    public float f9312n;
    public kc f9313r;
    public y10 f9314s;
    public final mc f9315w;

    public lc(mc mcVar, Context context, boolean z10) {
        super(context);
        this.f9315w = mcVar;
        this.d = new ArrayList();
        this.f9310e = new ArrayList();
        Paint paint = new Paint(1);
        this.f9311f = paint;
        this.h = new org.telegram.ui.Components.d6(this, 0L, 320L, nr.h);
        this.f9309c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, mcVar.f9368m1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.f9312n = this.h.e(false, arrayList.size());
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f9310e;
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
                ((kc) arrayList.get(i7)).f9253k.P();
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
                ((kc) arrayList.get(i7)).f9253k.R();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        kc kcVar;
        y10 y10Var;
        if (motionEvent.getAction() == 0) {
            kc kcVar2 = this.f9313r;
            if (kcVar2 != null) {
                kcVar2.f9259q.c(false);
            }
            this.f9313r = null;
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((kc) arrayList.get(i7)).f9246b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f9313r = (kc) arrayList.get(i7);
                    break;
                } else {
                    i7++;
                }
            }
            kc kcVar3 = this.f9313r;
            if (kcVar3 != null) {
                kcVar3.f9259q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (kcVar = this.f9313r) != null && !kcVar.f9258p && kcVar.f9246b.contains(motionEvent.getX(), motionEvent.getY()) && (y10Var = this.f9314s) != null) {
                y10Var.a(Long.valueOf(this.f9313r.f9252j));
            }
            kc kcVar4 = this.f9313r;
            if (kcVar4 != null) {
                kcVar4.f9259q.c(false);
            }
            this.f9313r = null;
        }
        if (this.f9313r == null) {
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
                if (kcVar.f9251i) {
                    kcVar.b(j3);
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(y10 y10Var) {
        this.f9314s = y10Var;
    }

    public void setSenders(ArrayList<fc> arrayList) {
        ArrayList arrayList2;
        nq[] nqVarArr;
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
            nqVarArr = null;
            fc fcVar = null;
            r72 = this.f9310e;
            r82 = 1;
            if (i7 >= size) {
                break;
            }
            kc kcVar2 = (kc) arrayList2.get(i7);
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                fc fcVar2 = arrayList3.get(i10);
                boolean z10 = fcVar2.f8876b;
                if ((z10 && kcVar2.f9251i) || (!kcVar2.f9251i && !z10 && fcVar2.f8877c == kcVar2.f9252j)) {
                    fcVar = arrayList3.get(i10);
                    break;
                }
            }
            if (fcVar == null) {
                kcVar2.f9253k.R();
                arrayList2.remove(i7);
                i7--;
                kcVar2.f9245a = -1;
                r72.add(kcVar2);
            }
            i7++;
        }
        int i11 = 0;
        while (i11 < arrayList3.size()) {
            fc fcVar3 = arrayList3.get(i11);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                kc kcVar3 = (kc) arrayList2.get(i12);
                boolean z11 = kcVar3.f9251i;
                if ((z11 && fcVar3.f8876b) || (!z11 && !fcVar3.f8876b && kcVar3.f9252j == fcVar3.f8877c)) {
                    kcVar = (kc) arrayList2.get(i12);
                    break;
                }
            }
            kcVar = nqVarArr;
            if (kcVar == null) {
                for (int i13 = 0; i13 < r72.size(); i13++) {
                    kc kcVar4 = (kc) r72.get(i13);
                    boolean z12 = kcVar4.f9251i;
                    if ((z12 && fcVar3.f8876b) || (!z12 && !fcVar3.f8876b && kcVar4.f9252j == fcVar3.f8877c)) {
                        kcVar = (kc) r72.get(i13);
                        break;
                    }
                }
                if (kcVar != null) {
                    r72.remove(kcVar);
                    kcVar.f9253k.P();
                    arrayList2.add(kcVar);
                }
            }
            if (kcVar == null) {
                kcVar = new kc(this, fcVar3.f8876b, fcVar3.f8877c);
                kcVar.d.e(r82, 0.0f);
                arrayList2.add(kcVar);
                kcVar.f9247c.e(r82, (arrayList3.size() - r82) - i11);
            }
            lc lcVar = kcVar.f9264w;
            mc mcVar = lcVar.f9315w;
            kcVar.f9245a = (arrayList3.size() - r82) - i11;
            long j3 = fcVar3.d;
            Paint paint = kcVar.h;
            kcVar.f9257o = new xy0(pb.U0(i5.c.l(j3, ',', new StringBuilder("⭐️")), 0.85f, nqVarArr), 12.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
            boolean z13 = lcVar.f9309c;
            int i14 = mcVar.n1;
            if (z13) {
                int i15 = (int) j3;
                kcVar.f9249f = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), new int[]{fi.t.b(i14, i15, 4), fi.t.b(i14, i15, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                kcVar.f9260r = i0.a.f(0.5f, fi.t.b(i14, i15, 4), fi.t.b(i14, i15, 3));
                paint.setShader(kcVar.f9249f);
            } else {
                paint.setShader(null);
                kcVar.f9260r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = kcVar.f9261s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(kcVar.f9260r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f9309c) {
                int i16 = i11 + 1;
                kcVar.v = i16;
                kcVar.f9263u = new xy0(i5.c.i(i16, ""), 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                if (i16 > 0 && kcVar.f9261s == null) {
                    Drawable mutate = lcVar.getContext().getResources().getDrawable(2131231174).mutate();
                    kcVar.f9261s = mutate;
                    int i17 = kcVar.f9260r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i17, mode));
                    Drawable mutate2 = lcVar.getContext().getResources().getDrawable(2131231175).mutate();
                    kcVar.f9262t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29454h5, mcVar.f9368m1), mode));
                }
            }
            if (fcVar3.f8876b) {
                kcVar.b(this.f9315w.f9380z1);
            } else {
                boolean z14 = fcVar3.f8875a;
                if (!kcVar.f9251i && kcVar.f9258p != z14) {
                    kcVar.f9258p = z14;
                    if (z14) {
                        r22 = null;
                        t6 = hd.N0(2131744805, null);
                    } else {
                        r22 = null;
                        t6 = org.telegram.messenger.n5.t(kcVar.f9252j);
                    }
                    kcVar.f9256n = new xy0(t6, 12.0f, r22);
                    lcVar.invalidate();
                    i11++;
                    arrayList3 = arrayList;
                    nqVarArr = r22;
                    r82 = 1;
                }
            }
            r22 = null;
            i11++;
            arrayList3 = arrayList;
            nqVarArr = r22;
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
