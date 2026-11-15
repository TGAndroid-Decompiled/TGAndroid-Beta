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
public final class ic extends View implements org.telegram.ui.ActionBar.z5 {
    public PorterDuffColorFilter f8820a;
    public int f8821b;
    public final boolean f8822c;
    public final ArrayList d;
    public final ArrayList f8823e;
    public final Paint f8824f;
    public final org.telegram.ui.Components.u5 h;
    public float f8825n;
    public hc f8826r;
    public z10 f8827s;
    public final jc f8828w;

    public ic(jc jcVar, Context context, boolean z10) {
        super(context);
        this.f8828w = jcVar;
        this.d = new ArrayList();
        this.f8823e = new ArrayList();
        Paint paint = new Paint(1);
        this.f8824f = paint;
        this.h = new org.telegram.ui.Components.u5(this, 0L, 320L, er.h);
        this.f8822c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, jcVar.f8874m1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.f8825n = this.h.e(false, arrayList.size());
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f8823e;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((hc) arrayList2.get(i7)).a(canvas);
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((hc) arrayList.get(i10)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                ((hc) arrayList.get(i7)).f8744k.P();
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
                ((hc) arrayList.get(i7)).f8744k.R();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        hc hcVar;
        z10 z10Var;
        if (motionEvent.getAction() == 0) {
            hc hcVar2 = this.f8826r;
            if (hcVar2 != null) {
                hcVar2.f8750q.c(false);
            }
            this.f8826r = null;
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((hc) arrayList.get(i7)).f8737b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f8826r = (hc) arrayList.get(i7);
                    break;
                } else {
                    i7++;
                }
            }
            hc hcVar3 = this.f8826r;
            if (hcVar3 != null) {
                hcVar3.f8750q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (hcVar = this.f8826r) != null && !hcVar.f8749p && hcVar.f8737b.contains(motionEvent.getX(), motionEvent.getY()) && (z10Var = this.f8827s) != null) {
                z10Var.a(Long.valueOf(this.f8826r.f8743j));
            }
            hc hcVar4 = this.f8826r;
            if (hcVar4 != null) {
                hcVar4.f8750q.c(false);
            }
            this.f8826r = null;
        }
        if (this.f8826r == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                hc hcVar = (hc) arrayList.get(i7);
                if (hcVar.f8742i) {
                    hcVar.b(j3);
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(z10 z10Var) {
        this.f8827s = z10Var;
    }

    public void setSenders(ArrayList<cc> arrayList) {
        ArrayList arrayList2;
        eq[] eqVarArr;
        ?? r72;
        ?? r82;
        hc hcVar;
        ?? r22;
        String t6;
        ArrayList<cc> arrayList3 = arrayList;
        int i7 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            eqVarArr = null;
            cc ccVar = null;
            r72 = this.f8823e;
            r82 = 1;
            if (i7 >= size) {
                break;
            }
            hc hcVar2 = (hc) arrayList2.get(i7);
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                cc ccVar2 = arrayList3.get(i10);
                boolean z10 = ccVar2.f8385b;
                if ((z10 && hcVar2.f8742i) || (!hcVar2.f8742i && !z10 && ccVar2.f8386c == hcVar2.f8743j)) {
                    ccVar = arrayList3.get(i10);
                    break;
                }
            }
            if (ccVar == null) {
                hcVar2.f8744k.R();
                arrayList2.remove(i7);
                i7--;
                hcVar2.f8736a = -1;
                r72.add(hcVar2);
            }
            i7++;
        }
        int i11 = 0;
        while (i11 < arrayList3.size()) {
            cc ccVar3 = arrayList3.get(i11);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                hc hcVar3 = (hc) arrayList2.get(i12);
                boolean z11 = hcVar3.f8742i;
                if ((z11 && ccVar3.f8385b) || (!z11 && !ccVar3.f8385b && hcVar3.f8743j == ccVar3.f8386c)) {
                    hcVar = (hc) arrayList2.get(i12);
                    break;
                }
            }
            hcVar = eqVarArr;
            if (hcVar == null) {
                for (int i13 = 0; i13 < r72.size(); i13++) {
                    hc hcVar4 = (hc) r72.get(i13);
                    boolean z12 = hcVar4.f8742i;
                    if ((z12 && ccVar3.f8385b) || (!z12 && !ccVar3.f8385b && hcVar4.f8743j == ccVar3.f8386c)) {
                        hcVar = (hc) r72.get(i13);
                        break;
                    }
                }
                if (hcVar != null) {
                    r72.remove(hcVar);
                    hcVar.f8744k.P();
                    arrayList2.add(hcVar);
                }
            }
            if (hcVar == null) {
                hcVar = new hc(this, ccVar3.f8385b, ccVar3.f8386c);
                hcVar.d.e(r82, 0.0f);
                arrayList2.add(hcVar);
                hcVar.f8738c.e(r82, (arrayList3.size() - r82) - i11);
            }
            ic icVar = hcVar.f8755w;
            jc jcVar = icVar.f8828w;
            hcVar.f8736a = (arrayList3.size() - r82) - i11;
            long j3 = ccVar3.d;
            Paint paint = hcVar.h;
            hcVar.f8748o = new oy0(mb.U0(i5.c.l(j3, ',', new StringBuilder("⭐️")), 0.85f, eqVarArr), 12.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
            boolean z13 = icVar.f8822c;
            int i14 = jcVar.n1;
            if (z13) {
                int i15 = (int) j3;
                hcVar.f8740f = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), new int[]{fi.t.b(i14, i15, 4), fi.t.b(i14, i15, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                hcVar.f8751r = i0.a.f(0.5f, fi.t.b(i14, i15, 4), fi.t.b(i14, i15, 3));
                paint.setShader(hcVar.f8740f);
            } else {
                paint.setShader(null);
                hcVar.f8751r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = hcVar.f8752s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(hcVar.f8751r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f8822c) {
                int i16 = i11 + 1;
                hcVar.v = i16;
                hcVar.f8754u = new oy0(i5.c.i(i16, ""), 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                if (i16 > 0 && hcVar.f8752s == null) {
                    Drawable mutate = icVar.getContext().getResources().getDrawable(2131231174).mutate();
                    hcVar.f8752s = mutate;
                    int i17 = hcVar.f8751r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i17, mode));
                    Drawable mutate2 = icVar.getContext().getResources().getDrawable(2131231175).mutate();
                    hcVar.f8753t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, jcVar.f8874m1), mode));
                }
            }
            if (ccVar3.f8385b) {
                hcVar.b(this.f8828w.f8886z1);
            } else {
                boolean z14 = ccVar3.f8384a;
                if (!hcVar.f8742i && hcVar.f8749p != z14) {
                    hcVar.f8749p = z14;
                    if (z14) {
                        r22 = null;
                        t6 = hd.M0(2131745048, null);
                    } else {
                        r22 = null;
                        t6 = org.telegram.messenger.m5.t(hcVar.f8743j);
                    }
                    hcVar.f8747n = new oy0(t6, 12.0f, r22);
                    icVar.invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: di.ic.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
