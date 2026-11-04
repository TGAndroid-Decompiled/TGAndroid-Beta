package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class sc extends View implements org.telegram.ui.ActionBar.z5 {
    public PorterDuffColorFilter f5983a;
    public int f5984b;
    public final boolean f5985c;
    public final ArrayList d;
    public final ArrayList f5986e;
    public final Paint f5987f;
    public final org.telegram.ui.Components.u5 h;
    public float f5988n;
    public rc f5989r;
    public u10 f5990s;
    public final tc f5991w;

    public sc(tc tcVar, Context context, boolean z10) {
        super(context);
        this.f5991w = tcVar;
        this.d = new ArrayList();
        this.f5986e = new ArrayList();
        Paint paint = new Paint(1);
        this.f5987f = paint;
        this.h = new org.telegram.ui.Components.u5(this, 0L, 320L, xq.h);
        this.f5985c = z10;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, tcVar.f6054j1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.f5988n = this.h.e(false, arrayList.size());
        int i3 = 0;
        while (true) {
            ArrayList arrayList2 = this.f5986e;
            if (i3 >= arrayList2.size()) {
                break;
            }
            ((rc) arrayList2.get(i3)).a(canvas);
            i3++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((rc) arrayList.get(i10)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 < arrayList.size()) {
                ((rc) arrayList.get(i3)).f5932k.P();
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 < arrayList.size()) {
                ((rc) arrayList.get(i3)).f5932k.R();
                i3++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        rc rcVar;
        u10 u10Var;
        if (motionEvent.getAction() == 0) {
            rc rcVar2 = this.f5989r;
            if (rcVar2 != null) {
                rcVar2.f5938q.c(false);
            }
            this.f5989r = null;
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i3 >= arrayList.size()) {
                    break;
                } else if (((rc) arrayList.get(i3)).f5925b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f5989r = (rc) arrayList.get(i3);
                    break;
                } else {
                    i3++;
                }
            }
            rc rcVar3 = this.f5989r;
            if (rcVar3 != null) {
                rcVar3.f5938q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (rcVar = this.f5989r) != null && !rcVar.f5937p && rcVar.f5925b.contains(motionEvent.getX(), motionEvent.getY()) && (u10Var = this.f5990s) != null) {
                u10Var.a(Long.valueOf(this.f5989r.f5931j));
            }
            rc rcVar4 = this.f5989r;
            if (rcVar4 != null) {
                rcVar4.f5938q.c(false);
            }
            this.f5989r = null;
        }
        if (this.f5989r == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j10) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i3 < arrayList.size()) {
                rc rcVar = (rc) arrayList.get(i3);
                if (rcVar.f5930i) {
                    rcVar.b(j10);
                    return;
                }
                i3++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(u10 u10Var) {
        this.f5990s = u10Var;
    }

    public void setSenders(ArrayList<mc> arrayList) {
        ArrayList arrayList2;
        wp[] wpVarArr;
        ?? r72;
        ?? r82;
        rc rcVar;
        ?? r22;
        String t10;
        ArrayList<mc> arrayList3 = arrayList;
        int i3 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            wpVarArr = null;
            mc mcVar = null;
            r72 = this.f5986e;
            r82 = 1;
            if (i3 >= size) {
                break;
            }
            rc rcVar2 = (rc) arrayList2.get(i3);
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                mc mcVar2 = arrayList3.get(i10);
                boolean z10 = mcVar2.f5565b;
                if ((z10 && rcVar2.f5930i) || (!rcVar2.f5930i && !z10 && mcVar2.f5566c == rcVar2.f5931j)) {
                    mcVar = arrayList3.get(i10);
                    break;
                }
            }
            if (mcVar == null) {
                rcVar2.f5932k.R();
                arrayList2.remove(i3);
                i3--;
                rcVar2.f5924a = -1;
                r72.add(rcVar2);
            }
            i3++;
        }
        int i11 = 0;
        while (i11 < arrayList3.size()) {
            mc mcVar3 = arrayList3.get(i11);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                rc rcVar3 = (rc) arrayList2.get(i12);
                boolean z11 = rcVar3.f5930i;
                if ((z11 && mcVar3.f5565b) || (!z11 && !mcVar3.f5565b && rcVar3.f5931j == mcVar3.f5566c)) {
                    rcVar = (rc) arrayList2.get(i12);
                    break;
                }
            }
            rcVar = wpVarArr;
            if (rcVar == null) {
                for (int i13 = 0; i13 < r72.size(); i13++) {
                    rc rcVar4 = (rc) r72.get(i13);
                    boolean z12 = rcVar4.f5930i;
                    if ((z12 && mcVar3.f5565b) || (!z12 && !mcVar3.f5565b && rcVar4.f5931j == mcVar3.f5566c)) {
                        rcVar = (rc) r72.get(i13);
                        break;
                    }
                }
                if (rcVar != null) {
                    r72.remove(rcVar);
                    rcVar.f5932k.P();
                    arrayList2.add(rcVar);
                }
            }
            if (rcVar == null) {
                rcVar = new rc(this, mcVar3.f5565b, mcVar3.f5566c);
                rcVar.d.e(r82, 0.0f);
                arrayList2.add(rcVar);
                rcVar.f5926c.e(r82, (arrayList3.size() - r82) - i11);
            }
            sc scVar = rcVar.f5943w;
            tc tcVar = scVar.f5991w;
            rcVar.f5924a = (arrayList3.size() - r82) - i11;
            long j10 = mcVar3.d;
            Paint paint = rcVar.h;
            rcVar.f5936o = new ly0(wb.U0(k2.p1.l(j10, ',', new StringBuilder("⭐️")), 0.85f, wpVarArr), 12.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
            boolean z13 = scVar.f5985c;
            int i14 = tcVar.k1;
            if (z13) {
                int i15 = (int) j10;
                rcVar.f5928f = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), new int[]{ei.u.b(i14, i15, 4), ei.u.b(i14, i15, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                rcVar.f5939r = i0.a.f(0.5f, ei.u.b(i14, i15, 4), ei.u.b(i14, i15, 3));
                paint.setShader(rcVar.f5928f);
            } else {
                paint.setShader(null);
                rcVar.f5939r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = rcVar.f5940s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(rcVar.f5939r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f5985c) {
                int i16 = i11 + 1;
                rcVar.v = i16;
                rcVar.f5942u = new ly0(k2.p1.i(i16, ""), 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                if (i16 > 0 && rcVar.f5940s == null) {
                    Drawable mutate = scVar.getContext().getResources().getDrawable(2131231174).mutate();
                    rcVar.f5940s = mutate;
                    int i17 = rcVar.f5939r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i17, mode));
                    Drawable mutate2 = scVar.getContext().getResources().getDrawable(2131231175).mutate();
                    rcVar.f5941t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, tcVar.f6054j1), mode));
                }
            }
            if (mcVar3.f5565b) {
                rcVar.b(this.f5991w.f6065w1);
            } else {
                boolean z14 = mcVar3.f5564a;
                if (!rcVar.f5930i && rcVar.f5937p != z14) {
                    rcVar.f5937p = z14;
                    if (z14) {
                        r22 = null;
                        t10 = bd.M0(2131745058, null);
                    } else {
                        r22 = null;
                        t10 = org.telegram.messenger.m5.t(rcVar.f5931j);
                    }
                    rcVar.f5935n = new ly0(t10, 12.0f, r22);
                    scVar.invalidate();
                    i11++;
                    arrayList3 = arrayList;
                    wpVarArr = r22;
                    r82 = 1;
                }
            }
            r22 = null;
            i11++;
            arrayList3 = arrayList;
            wpVarArr = r22;
            r82 = 1;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        throw new UnsupportedOperationException("Method not decompiled: ci.sc.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
