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
public final class qv extends FrameLayout implements zlb, snb {
    public final o E;
    public int a;
    public final k b;
    public final ov c;
    public final pv d;
    public TL_iv.pageBlockSlideshow e;
    public cw f;
    public cw h;
    public final int n;
    public int r;
    public int s;
    public float w;
    public int x;
    public final ex y;

    public qv(o oVar, Activity activity, ex exVar) {
        super(activity);
        this.E = oVar;
        this.n = hl.L(18.0f);
        this.y = exVar;
        if (o.D1 == null) {
            Paint paint = new Paint(1);
            o.D1 = paint;
            paint.setColor(-1);
        }
        k kVar = new k(this, activity);
        this.b = kVar;
        kVar.b(new mv(this, (byte) 0));
        ov ovVar = new ov(this);
        this.c = ovVar;
        kVar.setAdapter(ovVar);
        int w0 = aob.w0(null, aob.d6, false);
        this.a = w0;
        hl.w3(kVar, w0);
        addView(kVar);
        pv pvVar = new pv(this, activity);
        this.d = pvVar;
        addView(pvVar);
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.d6));
    }

    @Override
    public final void k(ArrayList arrayList) {
        cw cwVar = this.f;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
        cw cwVar2 = this.h;
        if (cwVar2 != null) {
            arrayList.add(cwVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.f;
        if (cwVar != null) {
            cwVar.i(this);
        }
        cw cwVar2 = this.h;
        if (cwVar2 != null) {
            cwVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.f;
        if (cwVar != null) {
            cwVar.f(this);
        }
        cw cwVar2 = this.h;
        if (cwVar2 != null) {
            cwVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.e != null) {
            cw cwVar = this.f;
            o oVar = this.E;
            int i = this.n;
            int i2 = 0;
            if (cwVar != null) {
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
        StringBuilder sb = new StringBuilder(ob6.M0(2131754851, null));
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
        int L = hl.L(8.0f);
        k kVar = this.b;
        kVar.layout(0, L, kVar.getMeasuredWidth(), kVar.getMeasuredHeight() + hl.L(8.0f));
        int bottom = kVar.getBottom() - hl.L(23.0f);
        pv pvVar = this.d;
        pvVar.layout(0, bottom, pvVar.getMeasuredWidth(), pvVar.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        qv qvVar;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        if (this.e != null) {
            int L = hl.L(310.0f);
            this.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
            this.e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(10.0f), 1073741824));
            int L2 = size - hl.L(36.0f);
            int L3 = hl.L(16.0f) + L;
            this.r = L3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = o.d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            o oVar = this.E;
            qvVar = this;
            cw n = o.n(oVar, qvVar, null, richText, L2, L3, pageblockslideshow, alignment, 0, this.y);
            qvVar.f = n;
            int i4 = qvVar.n;
            if (n != null) {
                int height = qvVar.f.d.getHeight() + hl.L(4.0f);
                qvVar.s = height;
                L = uh9.w(4.0f, height, L);
                cw cwVar = qvVar.f;
                cwVar.s = i4;
                cwVar.w = qvVar.r;
            } else {
                qvVar.s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = qvVar.e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (qvVar.y.H) {
                alignment = o0b.a();
            }
            cw n2 = o.n(oVar, qvVar, null, richText2, L2, 0, pageblockslideshow2, alignment, 0, qvVar.y);
            qvVar.h = n2;
            if (n2 != null) {
                L += qvVar.h.d.getHeight() + hl.L(4.0f);
                cw cwVar2 = qvVar.h;
                cwVar2.s = i4;
                cwVar2.w = qvVar.r + qvVar.s;
            }
            i3 = hl.L(16.0f) + L;
        } else {
            qvVar = this;
            i3 = 1;
        }
        qvVar.setMeasuredDimension(size, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        cw cwVar = this.f;
        int i = this.n;
        int i2 = this.r;
        o oVar = this.E;
        if (!o.i(oVar, this.y, motionEvent, this, cwVar, i, i2)) {
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
                int w0 = aob.w0(null, aob.d6, false);
                if (w0 != this.a) {
                    this.a = w0;
                    hl.w3(kVar, w0);
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }
}
