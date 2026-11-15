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
import org.telegram.messenger.z10;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oy0;
public final class hc extends View implements org.telegram.ui.ActionBar.z5 {
    public PorterDuffColorFilter f8745a;
    public int f8746b;
    public final boolean f8747c;
    public final ArrayList d;
    public final ArrayList f8748e;
    public final Paint f8749f;
    public final org.telegram.ui.Components.u5 h;
    public float f8750n;
    public gc f8751r;
    public z10 f8752s;
    public final ic f8753w;

    public hc(ic icVar, Context context, boolean z10) {
        super(context);
        this.f8753w = icVar;
        this.d = new ArrayList();
        this.f8748e = new ArrayList();
        Paint paint = new Paint(1);
        this.f8749f = paint;
        this.h = new org.telegram.ui.Components.u5(this, 0L, 320L, er.h);
        this.f8747c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, icVar.f8821m1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.f8750n = this.h.e(false, arrayList.size());
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f8748e;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((gc) arrayList2.get(i7)).a(canvas);
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((gc) arrayList.get(i10)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                ((gc) arrayList.get(i7)).f8662k.P();
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
                ((gc) arrayList.get(i7)).f8662k.R();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        gc gcVar;
        z10 z10Var;
        if (motionEvent.getAction() == 0) {
            gc gcVar2 = this.f8751r;
            if (gcVar2 != null) {
                gcVar2.f8668q.c(false);
            }
            this.f8751r = null;
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((gc) arrayList.get(i7)).f8655b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f8751r = (gc) arrayList.get(i7);
                    break;
                } else {
                    i7++;
                }
            }
            gc gcVar3 = this.f8751r;
            if (gcVar3 != null) {
                gcVar3.f8668q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (gcVar = this.f8751r) != null && !gcVar.f8667p && gcVar.f8655b.contains(motionEvent.getX(), motionEvent.getY()) && (z10Var = this.f8752s) != null) {
                z10Var.a(Long.valueOf(this.f8751r.f8661j));
            }
            gc gcVar4 = this.f8751r;
            if (gcVar4 != null) {
                gcVar4.f8668q.c(false);
            }
            this.f8751r = null;
        }
        if (this.f8751r == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                gc gcVar = (gc) arrayList.get(i7);
                if (gcVar.f8660i) {
                    gcVar.b(j3);
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(z10 z10Var) {
        this.f8752s = z10Var;
    }

    public void setSenders(ArrayList<bc> arrayList) {
        ArrayList arrayList2;
        eq[] eqVarArr;
        ?? r72;
        ?? r82;
        gc gcVar;
        ?? r22;
        String t6;
        ArrayList<bc> arrayList3 = arrayList;
        int i7 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            eqVarArr = null;
            bc bcVar = null;
            r72 = this.f8748e;
            r82 = 1;
            if (i7 >= size) {
                break;
            }
            gc gcVar2 = (gc) arrayList2.get(i7);
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                bc bcVar2 = arrayList3.get(i10);
                boolean z10 = bcVar2.f8278b;
                if ((z10 && gcVar2.f8660i) || (!gcVar2.f8660i && !z10 && bcVar2.f8279c == gcVar2.f8661j)) {
                    bcVar = arrayList3.get(i10);
                    break;
                }
            }
            if (bcVar == null) {
                gcVar2.f8662k.R();
                arrayList2.remove(i7);
                i7--;
                gcVar2.f8654a = -1;
                r72.add(gcVar2);
            }
            i7++;
        }
        int i11 = 0;
        while (i11 < arrayList3.size()) {
            bc bcVar3 = arrayList3.get(i11);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                gc gcVar3 = (gc) arrayList2.get(i12);
                boolean z11 = gcVar3.f8660i;
                if ((z11 && bcVar3.f8278b) || (!z11 && !bcVar3.f8278b && gcVar3.f8661j == bcVar3.f8279c)) {
                    gcVar = (gc) arrayList2.get(i12);
                    break;
                }
            }
            gcVar = eqVarArr;
            if (gcVar == null) {
                for (int i13 = 0; i13 < r72.size(); i13++) {
                    gc gcVar4 = (gc) r72.get(i13);
                    boolean z12 = gcVar4.f8660i;
                    if ((z12 && bcVar3.f8278b) || (!z12 && !bcVar3.f8278b && gcVar4.f8661j == bcVar3.f8279c)) {
                        gcVar = (gc) r72.get(i13);
                        break;
                    }
                }
                if (gcVar != null) {
                    r72.remove(gcVar);
                    gcVar.f8662k.P();
                    arrayList2.add(gcVar);
                }
            }
            if (gcVar == null) {
                gcVar = new gc(this, bcVar3.f8278b, bcVar3.f8279c);
                gcVar.d.e(r82, 0.0f);
                arrayList2.add(gcVar);
                gcVar.f8656c.e(r82, (arrayList3.size() - r82) - i11);
            }
            hc hcVar = gcVar.f8673w;
            ic icVar = hcVar.f8753w;
            gcVar.f8654a = (arrayList3.size() - r82) - i11;
            long j3 = bcVar3.d;
            Paint paint = gcVar.h;
            gcVar.f8666o = new oy0(lb.U0(i5.c.l(j3, ',', new StringBuilder("⭐️")), 0.85f, eqVarArr), 12.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
            boolean z13 = hcVar.f8747c;
            int i14 = icVar.n1;
            if (z13) {
                int i15 = (int) j3;
                gcVar.f8658f = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), new int[]{fi.t.b(i14, i15, 4), fi.t.b(i14, i15, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                gcVar.f8669r = i0.a.f(0.5f, fi.t.b(i14, i15, 4), fi.t.b(i14, i15, 3));
                paint.setShader(gcVar.f8658f);
            } else {
                paint.setShader(null);
                gcVar.f8669r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = gcVar.f8670s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(gcVar.f8669r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f8747c) {
                int i16 = i11 + 1;
                gcVar.v = i16;
                gcVar.f8672u = new oy0(i5.c.i(i16, ""), 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                if (i16 > 0 && gcVar.f8670s == null) {
                    Drawable mutate = hcVar.getContext().getResources().getDrawable(2131231174).mutate();
                    gcVar.f8670s = mutate;
                    int i17 = gcVar.f8669r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i17, mode));
                    Drawable mutate2 = hcVar.getContext().getResources().getDrawable(2131231175).mutate();
                    gcVar.f8671t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, icVar.f8821m1), mode));
                }
            }
            if (bcVar3.f8278b) {
                gcVar.b(this.f8753w.f8833z1);
            } else {
                boolean z14 = bcVar3.f8277a;
                if (!gcVar.f8660i && gcVar.f8667p != z14) {
                    gcVar.f8667p = z14;
                    if (z14) {
                        r22 = null;
                        t6 = hd.M0(2131745048, null);
                    } else {
                        r22 = null;
                        t6 = org.telegram.messenger.m5.t(gcVar.f8661j);
                    }
                    gcVar.f8665n = new oy0(t6, 12.0f, r22);
                    hcVar.invalidate();
                    i11++;
                    arrayList3 = arrayList;
                    eqVarArr = r22;
                    r82 = 1;
                }
            }
            r22 = null;
            i11++;
            arrayList3 = arrayList;
            eqVarArr = r22;
            r82 = 1;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: di.hc.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
