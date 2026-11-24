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
public final class awa extends View implements tjb {
    public PorterDuffColorFilter a;
    public int b;
    public final boolean c;
    public final ArrayList d;
    public final ArrayList e;
    public final Paint f;
    public final lm h;
    public float n;
    public zva r;
    public p8c s;
    public final bwa w;

    public awa(bwa bwaVar, Context context, boolean z) {
        super(context);
        this.w = bwaVar;
        this.d = new ArrayList();
        this.e = new ArrayList();
        Paint paint = new Paint(1);
        this.f = paint;
        this.h = new lm(this, 0L, 320L, s33.h);
        this.c = z;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(gl.L(3.0f));
        paint.setColor(bkb.v0(bkb.g5, bwaVar.l1));
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
            ((zva) arrayList2.get(i)).a(canvas);
            i++;
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((zva) arrayList.get(i2)).a(canvas);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i < arrayList.size()) {
                ((zva) arrayList.get(i)).k.I();
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
                ((zva) arrayList.get(i)).k.K();
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        zva zvaVar;
        p8c p8cVar;
        if (motionEvent.getAction() == 0) {
            zva zvaVar2 = this.r;
            if (zvaVar2 != null) {
                zvaVar2.q.c(false);
            }
            this.r = null;
            int i = 0;
            while (true) {
                ArrayList arrayList = this.d;
                if (i >= arrayList.size()) {
                    break;
                } else if (((zva) arrayList.get(i)).b.contains(motionEvent.getX(), motionEvent.getY())) {
                    this.r = (zva) arrayList.get(i);
                    break;
                } else {
                    i++;
                }
            }
            zva zvaVar3 = this.r;
            if (zvaVar3 != null) {
                zvaVar3.q.c(true);
            }
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (motionEvent.getAction() == 1 && (zvaVar = this.r) != null && !zvaVar.p && zvaVar.b.contains(motionEvent.getX(), motionEvent.getY()) && (p8cVar = this.s) != null) {
                p8cVar.a(Long.valueOf(this.r.j));
            }
            zva zvaVar4 = this.r;
            if (zvaVar4 != null) {
                zvaVar4.q.c(false);
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
                zva zvaVar = (zva) arrayList.get(i);
                if (zvaVar.i) {
                    zvaVar.b(j);
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public void setOnSenderClickListener(p8c p8cVar) {
        this.s = p8cVar;
    }

    public void setSenders(ArrayList<wva> arrayList) {
        ArrayList arrayList2;
        cm2[] cm2VarArr;
        ?? r7;
        ?? r8;
        zva zvaVar;
        ?? r2;
        String s;
        ArrayList<wva> arrayList3 = arrayList;
        int i = 0;
        while (true) {
            arrayList2 = this.d;
            int size = arrayList2.size();
            cm2VarArr = null;
            wva wvaVar = null;
            r7 = this.e;
            r8 = 1;
            if (i >= size) {
                break;
            }
            zva zvaVar2 = (zva) arrayList2.get(i);
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                wva wvaVar2 = arrayList3.get(i2);
                boolean z = wvaVar2.b;
                if ((z && zvaVar2.i) || (!zvaVar2.i && !z && wvaVar2.c == zvaVar2.j)) {
                    wvaVar = arrayList3.get(i2);
                    break;
                }
            }
            if (wvaVar == null) {
                zvaVar2.k.K();
                arrayList2.remove(i);
                i--;
                zvaVar2.a = -1;
                r7.add(zvaVar2);
            }
            i++;
        }
        int i3 = 0;
        while (i3 < arrayList3.size()) {
            wva wvaVar3 = arrayList3.get(i3);
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                zva zvaVar3 = (zva) arrayList2.get(i4);
                if (zvaVar3.i) {
                    if (wvaVar3.b) {
                        zvaVar = (zva) arrayList2.get(i4);
                        break;
                    }
                } else {
                    if (!wvaVar3.b && zvaVar3.j == wvaVar3.c) {
                        zvaVar = (zva) arrayList2.get(i4);
                        break;
                    }
                }
            }
            zvaVar = cm2VarArr;
            if (zvaVar == null) {
                for (int i5 = 0; i5 < r7.size(); i5++) {
                    zva zvaVar4 = (zva) r7.get(i5);
                    if (zvaVar4.i) {
                        if (wvaVar3.b) {
                            zvaVar = (zva) r7.get(i5);
                            break;
                        }
                    } else {
                        if (!wvaVar3.b && zvaVar4.j == wvaVar3.c) {
                            zvaVar = (zva) r7.get(i5);
                            break;
                        }
                    }
                }
                if (zvaVar != null) {
                    r7.remove(zvaVar);
                    zvaVar.k.I();
                    arrayList2.add(zvaVar);
                }
            }
            if (zvaVar == null) {
                zvaVar = new zva(this, wvaVar3.b, wvaVar3.c);
                zvaVar.d.e(r8, 0.0f);
                arrayList2.add(zvaVar);
                zvaVar.c.e(r8, (arrayList3.size() - r8) - i3);
            }
            awa awaVar = zvaVar.w;
            bwa bwaVar = awaVar.w;
            zvaVar.a = (arrayList3.size() - r8) - i3;
            long j = wvaVar3.d;
            Paint paint = zvaVar.h;
            zvaVar.o = new tgb(jva.T0("⭐️".concat(k96.E(j, ',')), 0.85f, cm2VarArr), 12.0f, gl.n1("fonts/num.otf"));
            boolean z2 = awaVar.c;
            int i6 = bwaVar.m1;
            if (z2) {
                int i7 = (int) j;
                zvaVar.f = new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(16.0f), new int[]{de5.b(i6, i7, 4), de5.b(i6, i7, 3)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                zvaVar.r = bm2.f(0.5f, de5.b(i6, i7, 4), de5.b(i6, i7, 3));
                paint.setShader(zvaVar.f);
            } else {
                paint.setShader(null);
                zvaVar.r = -1002750;
                paint.setColor(-1002750);
            }
            Drawable drawable = zvaVar.s;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(zvaVar.r, PorterDuff.Mode.SRC_IN));
            }
            if (this.c) {
                int i8 = i3 + 1;
                zvaVar.v = i8;
                zvaVar.u = new tgb(String.valueOf(i8), 10.0f, gl.n1("fonts/num.otf"));
                if (i8 > 0 && zvaVar.s == null) {
                    Drawable mutate = awaVar.getContext().getResources().getDrawable(2131231176).mutate();
                    zvaVar.s = mutate;
                    int i9 = zvaVar.r;
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    mutate.setColorFilter(new PorterDuffColorFilter(i9, mode));
                    Drawable mutate2 = awaVar.getContext().getResources().getDrawable(2131231177).mutate();
                    zvaVar.t = mutate2;
                    mutate2.setColorFilter(new PorterDuffColorFilter(bkb.v0(bkb.g5, bwaVar.l1), mode));
                }
            }
            if (wvaVar3.b) {
                zvaVar.b(this.w.y1);
            } else {
                boolean z3 = wvaVar3.a;
                if (!zvaVar.i && zvaVar.p != z3) {
                    zvaVar.p = z3;
                    if (z3) {
                        r2 = null;
                        s = k96.M0(2131744811, null);
                    } else {
                        r2 = null;
                        s = cf3.s(zvaVar.j);
                    }
                    zvaVar.n = new tgb(s, 12.0f, r2);
                    awaVar.invalidate();
                    i3++;
                    arrayList3 = arrayList;
                    cm2VarArr = r2;
                    r8 = 1;
                }
            }
            r2 = null;
            i3++;
            arrayList3 = arrayList;
            cm2VarArr = r2;
            r8 = 1;
        }
        invalidate();
    }

    @Override
    public final void updateColors() {
        Drawable drawable;
        ArrayList arrayList = this.d;
        try {
            int v0 = bkb.v0(bkb.g5, this.w.l1);
            this.f.setColor(v0);
            if (this.a == null || v0 != this.b) {
                this.b = v0;
                this.a = new PorterDuffColorFilter(v0, PorterDuff.Mode.SRC_IN);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                zva zvaVar = (zva) arrayList.get(i);
                if (zvaVar != null && (drawable = zvaVar.t) != null) {
                    ColorFilter colorFilter = drawable.getColorFilter();
                    PorterDuffColorFilter porterDuffColorFilter = this.a;
                    if (colorFilter != porterDuffColorFilter) {
                        zvaVar.t.setColorFilter(porterDuffColorFilter);
                    }
                }
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
