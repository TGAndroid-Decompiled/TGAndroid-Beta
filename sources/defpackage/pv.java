package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.k;
import org.telegram.ui.o;
public final class pv extends FrameLayout implements eib, tjb {
    public final o E;
    public int a;
    public final k b;
    public final nv c;
    public final ov d;
    public TL_iv.pageBlockSlideshow e;
    public bw f;
    public bw h;
    public final int n;
    public int r;
    public int s;
    public float w;
    public int x;
    public final dx y;

    public pv(o oVar, Activity activity, dx dxVar) {
        super(activity);
        this.E = oVar;
        this.n = gl.L(18.0f);
        this.y = dxVar;
        if (o.D1 == null) {
            Paint paint = new Paint(1);
            o.D1 = paint;
            paint.setColor(-1);
        }
        k kVar = new k(this, activity);
        this.b = kVar;
        kVar.b(new lv(this, (byte) 0));
        nv nvVar = new nv(this);
        this.c = nvVar;
        kVar.setAdapter(nvVar);
        int w0 = bkb.w0(null, bkb.c6, false);
        this.a = w0;
        gl.w3(kVar, w0);
        addView(kVar);
        ov ovVar = new ov(this, activity);
        this.d = ovVar;
        addView(ovVar);
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.f;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.h;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.f;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.h;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.f;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.h;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.e != null) {
            bw bwVar = this.f;
            o oVar = this.E;
            int i = this.n;
            int i2 = 0;
            if (bwVar != null) {
                canvas.save();
                canvas.translate(i, this.r);
                o.s(oVar, canvas, this, 0);
                this.f.d(canvas, this);
                canvas.restore();
                i2 = 1;
            }
            if (this.h != null) {
                canvas.save();
                canvas.translate(i, this.r + this.s);
                o.s(oVar, canvas, this, i2);
                this.h.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(k96.M0(2131754855, null));
        if (this.f != null) {
            sb.append(", ");
            sb.append(this.f.d.getText());
        }
        if (this.h != null) {
            sb.append(", ");
            sb.append(this.h.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int L = gl.L(8.0f);
        k kVar = this.b;
        kVar.layout(0, L, kVar.getMeasuredWidth(), kVar.getMeasuredHeight() + gl.L(8.0f));
        int bottom = kVar.getBottom() - gl.L(23.0f);
        ov ovVar = this.d;
        ovVar.layout(0, bottom, ovVar.getMeasuredWidth(), ovVar.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        pv pvVar;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        if (this.e != null) {
            int L = gl.L(310.0f);
            this.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
            this.e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(10.0f), 1073741824));
            int L2 = size - gl.L(36.0f);
            int L3 = gl.L(16.0f) + L;
            this.r = L3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = o.d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            o oVar = this.E;
            pvVar = this;
            bw n = o.n(oVar, pvVar, null, richText, L2, L3, pageblockslideshow, alignment, 0, this.y);
            pvVar.f = n;
            int i4 = pvVar.n;
            if (n != null) {
                int height = pvVar.f.d.getHeight() + gl.L(4.0f);
                pvVar.s = height;
                L = de9.w(4.0f, height, L);
                bw bwVar = pvVar.f;
                bwVar.s = i4;
                bwVar.w = pvVar.r;
            } else {
                pvVar.s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = pvVar.e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (pvVar.y.H) {
                alignment = lwa.a();
            }
            bw n2 = o.n(oVar, pvVar, null, richText2, L2, 0, pageblockslideshow2, alignment, 0, pvVar.y);
            pvVar.h = n2;
            if (n2 != null) {
                L += pvVar.h.d.getHeight() + gl.L(4.0f);
                bw bwVar2 = pvVar.h;
                bwVar2.s = i4;
                bwVar2.w = pvVar.r + pvVar.s;
            }
            i3 = gl.L(16.0f) + L;
        } else {
            pvVar = this;
            i3 = 1;
        }
        pvVar.setMeasuredDimension(size, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bw bwVar = this.f;
        int i = this.n;
        int i2 = this.r;
        o oVar = this.E;
        if (!o.i(oVar, this.y, motionEvent, this, bwVar, i, i2)) {
            if (!o.i(oVar, this.y, motionEvent, this, this.h, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final void updateColors() {
        k kVar = this.b;
        if (kVar != null) {
            try {
                int w0 = bkb.w0(null, bkb.c6, false);
                if (w0 != this.a) {
                    this.a = w0;
                    gl.w3(kVar, w0);
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }
}
