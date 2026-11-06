package bi;

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
import org.telegram.messenger.c20;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.xq;
public final class be extends View implements org.telegram.ui.ActionBar.a6 {
    public PorterDuffColorFilter f3535a;
    public int f3536b;
    public final boolean f3537c;
    public final ArrayList d;
    public final ArrayList f3538e;
    public final Paint f3539f;
    public final org.telegram.ui.Components.w5 h;
    public float f3540n;
    public ae f3541r;
    public c20 f3542s;
    public final ce f3543w;

    public be(ce ceVar, Context context, boolean z9) {
        super(context);
        this.f3543w = ceVar;
        this.d = new ArrayList();
        this.f3538e = new ArrayList();
        Paint paint = new Paint(1);
        this.f3539f = paint;
        this.h = new org.telegram.ui.Components.w5(this, 0L, 320L, xq.h);
        this.f3537c = z9;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(3.0f));
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, ceVar.f3614i1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.f3540n = this.h.e(false, arrayList.size());
        int i7 = 0;
        while (true) {
            ArrayList arrayList2 = this.f3538e;
            if (i7 >= arrayList2.size()) {
                break;
            }
            ((ae) arrayList2.get(i7)).a(canvas);
            i7++;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((ae) arrayList.get(i10)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                ((ae) arrayList.get(i7)).f3481k.P();
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
                ((ae) arrayList.get(i7)).f3481k.R();
                i7++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ae aeVar;
        c20 c20Var;
        if (motionEvent.getAction() == 0) {
            ae aeVar2 = this.f3541r;
            if (aeVar2 != null) {
                aeVar2.f3487q.c(false);
            }
            this.f3541r = null;
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i7 >= arrayList.size()) {
                    break;
                } else if (((ae) arrayList.get(i7)).f3474b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.f3541r = (ae) arrayList.get(i7);
                    break;
                } else {
                    i7++;
                }
            }
            ae aeVar3 = this.f3541r;
            if (aeVar3 != null) {
                aeVar3.f3487q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (aeVar = this.f3541r) != null && !aeVar.f3486p && aeVar.f3474b.contains(motionEvent.getX(), motionEvent.getY()) && (c20Var = this.f3542s) != null) {
                c20Var.a(Long.valueOf(this.f3541r.f3480j));
            }
            ae aeVar4 = this.f3541r;
            if (aeVar4 != null) {
                aeVar4.f3487q.c(false);
            }
            this.f3541r = null;
        }
        if (this.f3541r == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j3) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i7 < arrayList.size()) {
                ae aeVar = (ae) arrayList.get(i7);
                if (aeVar.f3479i) {
                    aeVar.b(j3);
                    return;
                }
                i7++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(c20 c20Var) {
        this.f3542s = c20Var;
    }

    public void setSenders(ArrayList<vd> arrayList) {
        ArrayList arrayList2;
        wp[] wpVarArr;
        ?? r72;
        ?? r82;
        ae aeVar;
        ?? r22;
        String t6;
        ArrayList<vd> arrayList3 = arrayList;
        int i7 = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            wpVarArr = null;
            vd vdVar = null;
            r72 = this.f3538e;
            r82 = 1;
            if (i7 >= size) {
                break;
            }
            ae aeVar2 = (ae) arrayList2.get(i7);
            for (int i10 = 0; i10 < arrayList3.size(); i10++) {
                vd vdVar2 = arrayList3.get(i10);
                boolean z9 = vdVar2.f4929b;
                if ((z9 && aeVar2.f3479i) || (!aeVar2.f3479i && !z9 && vdVar2.f4930c == aeVar2.f3480j)) {
                    vdVar = arrayList3.get(i10);
                    break;
                }
            }
            if (vdVar == null) {
                aeVar2.f3481k.R();
                arrayList2.remove(i7);
                i7--;
                aeVar2.f3473a = -1;
                r72.add(aeVar2);
            }
            i7++;
        }
        int i11 = 0;
        while (i11 < arrayList3.size()) {
            vd vdVar3 = arrayList3.get(i11);
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                ae aeVar3 = (ae) arrayList2.get(i12);
                boolean z10 = aeVar3.f3479i;
                if ((z10 && vdVar3.f4929b) || (!z10 && !vdVar3.f4929b && aeVar3.f3480j == vdVar3.f4930c)) {
                    aeVar = (ae) arrayList2.get(i12);
                    break;
                }
            }
            aeVar = wpVarArr;
            if (aeVar == null) {
                for (int i13 = 0; i13 < r72.size(); i13++) {
                    ae aeVar4 = (ae) r72.get(i13);
                    boolean z11 = aeVar4.f3479i;
                    if ((z11 && vdVar3.f4929b) || (!z11 && !vdVar3.f4929b && aeVar4.f3480j == vdVar3.f4930c)) {
                        aeVar = (ae) r72.get(i13);
                        break;
                    }
                }
                if (aeVar != null) {
                    r72.remove(aeVar);
                    aeVar.f3481k.P();
                    arrayList2.add(aeVar);
                }
            }
            if (aeVar == null) {
                aeVar = new ae(this, vdVar3.f4929b, vdVar3.f4930c);
                aeVar.d.e(r82, 0.0f);
                arrayList2.add(aeVar);
                aeVar.f3475c.e(r82, (arrayList3.size() - r82) - i11);
            }
            be beVar = aeVar.f3492w;
            ce ceVar = beVar.f3543w;
            aeVar.f3473a = (arrayList3.size() - r82) - i11;
            long j3 = vdVar3.d;
            Paint paint = aeVar.h;
            aeVar.f3485o = new ly0(dd.U0(jg.g.m(j3, ',', new StringBuilder("⭐️")), 0.85f, wpVarArr), 12.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
            boolean z12 = beVar.f3537c;
            int i14 = ceVar.f3615j1;
            if (z12) {
                int i15 = (int) j3;
                aeVar.f3477f = new LinearGradient(0.0f, 0.0f, 0.0f, org.telegram.messenger.g0.L(16.0f), new int[]{di.t.b(i14, i15, 4), di.t.b(i14, i15, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                aeVar.f3488r = i0.a.f(0.5f, di.t.b(i14, i15, 4), di.t.b(i14, i15, 3));
                paint.setShader(aeVar.f3477f);
            } else {
                paint.setShader(null);
                aeVar.f3488r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = aeVar.f3489s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(aeVar.f3488r, PorterDuff.Mode.SRC_IN));
            }
            if (this.f3537c) {
                int i16 = i11 + 1;
                aeVar.v = i16;
                aeVar.f3491u = new ly0(jg.g.j(i16, ""), 10.0f, org.telegram.messenger.g0.o1("fonts/num.otf"));
                if (i16 > 0 && aeVar.f3489s == null) {
                    Drawable mutate = beVar.getContext().getResources().getDrawable(2131231174).mutate();
                    aeVar.f3489s = mutate;
                    int i17 = aeVar.f3488r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i17, mode));
                    Drawable mutate2 = beVar.getContext().getResources().getDrawable(2131231175).mutate();
                    aeVar.f3490t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, ceVar.f3614i1), mode));
                }
            }
            if (vdVar3.f4929b) {
                aeVar.b(this.f3543w.f3625v1);
            } else {
                boolean z13 = vdVar3.f4928a;
                if (!aeVar.f3479i && aeVar.f3486p != z13) {
                    aeVar.f3486p = z13;
                    if (z13) {
                        r22 = null;
                        t6 = org.telegram.messenger.hd.M0(2131745049, null);
                    } else {
                        r22 = null;
                        t6 = org.telegram.messenger.m5.t(aeVar.f3480j);
                    }
                    aeVar.f3484n = new ly0(t6, 12.0f, r22);
                    beVar.invalidate();
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
        throw new UnsupportedOperationException("Method not decompiled: bi.be.updateColors():void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
