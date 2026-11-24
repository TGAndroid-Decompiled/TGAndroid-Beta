package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
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
public final class dya extends View implements vlb {
    public PorterDuffColorFilter a;
    public int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f;
    public final ln h;
    public float n;
    public cya r;
    public qac s;
    public final eya w;

    public dya(eya eyaVar, Context context, boolean z) {
        super(context);
        this.w = eyaVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new ln(this, 0L, 320L, d53.h);
        this.c = z;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(gm.L(3.0f));
        paint.setColor(cmb.v0(cmb.g5, eyaVar.l1));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        ArrayList arrayList = this.d;
        this.n = this.h.e(false, arrayList.size());
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.e;
            if (i >= arrayList2.size()) {
                break;
            }
            ((cya) arrayList2.get(i)).a(canvas);
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((cya) arrayList.get(i2)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i < arrayList.size()) {
                ((cya) arrayList.get(i)).k.I();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i < arrayList.size()) {
                ((cya) arrayList.get(i)).k.K();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cya cyaVar;
        qac qacVar;
        if (motionEvent.getAction() == 0) {
            cya cyaVar2 = this.r;
            if (cyaVar2 != null) {
                cyaVar2.q.c(false);
            }
            this.r = null;
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    break;
                } else if (((cya) arrayList.get(i)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.r = (cya) arrayList.get(i);
                    break;
                } else {
                    i++;
                }
            }
            cya cyaVar3 = this.r;
            if (cyaVar3 != null) {
                cyaVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (cyaVar = this.r) != null && !cyaVar.p && cyaVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (qacVar = this.s) != null) {
                qacVar.a(Long.valueOf(this.r.j));
            }
            cya cyaVar4 = this.r;
            if (cyaVar4 != null) {
                cyaVar4.q.c(false);
            }
            this.r = null;
        }
        if (this.r == null) {
            return false;
        }
        return true;
    }

    public void setMyPrivacy(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i < arrayList.size()) {
                cya cyaVar = (cya) arrayList.get(i);
                if (cyaVar.i) {
                    cyaVar.b(j);
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(qac qacVar) {
        this.s = qacVar;
    }

    public void setSenders(ArrayList<zxa> arrayList) {
        ArrayList arrayList2;
        pn2[] pn2VarArr;
        ?? r7;
        ?? r8;
        cya cyaVar;
        ?? r2;
        String s;
        ArrayList<zxa> arrayList3 = arrayList;
        int i = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            pn2VarArr = null;
            zxa zxaVar = null;
            r7 = this.e;
            r8 = 1;
            if (i >= size) {
                break;
            }
            cya cyaVar2 = (cya) arrayList2.get(i);
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                zxa zxaVar2 = arrayList3.get(i2);
                boolean z = zxaVar2.b;
                if ((z && cyaVar2.i) || (!cyaVar2.i && !z && zxaVar2.c == cyaVar2.j)) {
                    zxaVar = arrayList3.get(i2);
                    break;
                }
            }
            if (zxaVar == null) {
                cyaVar2.k.K();
                arrayList2.remove(i);
                i--;
                cyaVar2.a = -1;
                r7.add(cyaVar2);
            }
            i++;
        }
        int i3 = 0;
        while (i3 < arrayList3.size()) {
            zxa zxaVar3 = arrayList3.get(i3);
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                cya cyaVar3 = (cya) arrayList2.get(i4);
                if (cyaVar3.i) {
                    if (zxaVar3.b) {
                        cyaVar = (cya) arrayList2.get(i4);
                        break;
                    }
                } else {
                    if (!zxaVar3.b && cyaVar3.j == zxaVar3.c) {
                        cyaVar = (cya) arrayList2.get(i4);
                        break;
                    }
                }
            }
            cyaVar = pn2VarArr;
            if (cyaVar == null) {
                for (int i5 = 0; i5 < r7.size(); i5++) {
                    cya cyaVar4 = (cya) r7.get(i5);
                    if (cyaVar4.i) {
                        if (zxaVar3.b) {
                            cyaVar = (cya) r7.get(i5);
                            break;
                        }
                    } else {
                        if (!zxaVar3.b && cyaVar4.j == zxaVar3.c) {
                            cyaVar = (cya) r7.get(i5);
                            break;
                        }
                    }
                }
                if (cyaVar != null) {
                    r7.remove(cyaVar);
                    cyaVar.k.I();
                    arrayList2.add(cyaVar);
                }
            }
            if (cyaVar == null) {
                cyaVar = new cya(this, zxaVar3.b, zxaVar3.c);
                cyaVar.d.e(r8, 0.0f);
                arrayList2.add(cyaVar);
                cyaVar.c.e(r8, (arrayList3.size() - r8) - i3);
            }
            dya dyaVar = cyaVar.w;
            eya eyaVar = dyaVar.w;
            cyaVar.a = (arrayList3.size() - r8) - i3;
            long j = zxaVar3.d;
            Paint paint = cyaVar.h;
            cyaVar.o = new uib(nxa.U0("⭐️".concat(jb6.E(j, ',')), 0.85f, pn2VarArr), 12.0f, gm.n1("fonts/num.otf"));
            boolean z2 = dyaVar.c;
            int i6 = eyaVar.m1;
            if (z2) {
                int i7 = (int) j;
                cyaVar.f = new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(16.0f), new int[]{bg5.b(i6, i7, 4), bg5.b(i6, i7, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                cyaVar.r = on2.f(0.5f, bg5.b(i6, i7, 4), bg5.b(i6, i7, 3));
                paint.setShader(cyaVar.f);
            } else {
                paint.setShader(null);
                cyaVar.r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = cyaVar.s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(cyaVar.r, PorterDuff.Mode.SRC_IN));
            }
            if (this.c) {
                int i8 = i3 + 1;
                cyaVar.v = i8;
                cyaVar.u = new uib(String.valueOf(i8), 10.0f, gm.n1("fonts/num.otf"));
                if (i8 > 0 && cyaVar.s == null) {
                    Drawable mutate = dyaVar.getContext().getResources().getDrawable(2131231177).mutate();
                    cyaVar.s = mutate;
                    int i9 = cyaVar.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i9, mode));
                    Drawable mutate2 = dyaVar.getContext().getResources().getDrawable(2131231178).mutate();
                    cyaVar.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(cmb.v0(cmb.g5, eyaVar.l1), mode));
                }
            }
            if (zxaVar3.b) {
                cyaVar.b(this.w.y1);
            } else {
                boolean z3 = zxaVar3.a;
                if (!cyaVar.i && cyaVar.p != z3) {
                    cyaVar.p = z3;
                    if (z3) {
                        r2 = null;
                        s = jb6.M0(2131744737, null);
                    } else {
                        r2 = null;
                        s = pg3.s(cyaVar.j);
                    }
                    cyaVar.n = new uib(s, 12.0f, r2);
                    dyaVar.invalidate();
                    i3++;
                    arrayList3 = arrayList;
                    pn2VarArr = r2;
                    r8 = 1;
                }
            }
            r2 = null;
            i3++;
            arrayList3 = arrayList;
            pn2VarArr = r2;
            r8 = 1;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        Drawable drawable;
        ArrayList arrayList = this.d;
        try {
            int v0 = cmb.v0(cmb.g5, this.w.l1);
            this.f.setColor(v0);
            if (this.a == null || v0 != this.b) {
                this.b = v0;
                this.a = new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                cya cyaVar = (cya) arrayList.get(i);
                if (cyaVar != null && (drawable = cyaVar.t) != null) {
                    ColorFilter colorFilter = drawable.getColorFilter();
                    PorterDuffColorFilter porterDuffColorFilter = this.a;
                    if (colorFilter != porterDuffColorFilter) {
                        cyaVar.t.setColorFilter(porterDuffColorFilter);
                    }
                }
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
