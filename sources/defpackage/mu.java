package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class mu extends FrameLayout implements eib {
    public final fu a;
    public final ju b;
    public bw c;
    public bw d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockCollage s;
    public final lu w;
    public final dx x;
    public final o y;

    public mu(o oVar, Activity activity, dx dxVar) {
        super(activity);
        this.y = oVar;
        this.w = new lu(this);
        this.x = dxVar;
        fu fuVar = new fu((byte) 0, activity, this);
        this.a = fuVar;
        fuVar.i(new gu(this));
        hu huVar = new hu(this);
        huVar.O = new iu(this);
        fuVar.setLayoutManager(huVar);
        ju juVar = new ju(this);
        this.b = juVar;
        fuVar.setAdapter(juVar);
        addView(fuVar, nme.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            arrayList.add(bwVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
        }
        bw bwVar2 = this.d;
        if (bwVar2 != null) {
            bwVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.s != null) {
            bw bwVar = this.c;
            o oVar = this.y;
            int i = 0;
            if (bwVar != null) {
                canvas.save();
                canvas.translate(this.f, this.h);
                o.s(oVar, canvas, this, 0);
                this.c.d(canvas, this);
                canvas.restore();
                i = 1;
            }
            if (this.d != null) {
                canvas.save();
                canvas.translate(this.f, this.h + this.n);
                o.s(oVar, canvas, this, i);
                this.d.d(canvas, this);
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(k96.M0(2131754895, null));
        if (this.c != null) {
            sb.append(", ");
            sb.append(this.c.d.getText());
        }
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.e;
        int L = gl.L(8.0f);
        int i6 = this.e;
        fu fuVar = this.a;
        fuVar.layout(i5, L, fuVar.getMeasuredWidth() + i6, gl.L(8.0f) + fuVar.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        mu muVar;
        int L;
        int i3;
        int i4 = 1;
        this.r = true;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockCollage pageblockcollage = this.s;
        if (pageblockcollage != null) {
            int i5 = pageblockcollage.level;
            if (i5 > 0) {
                int L2 = gl.L(18.0f) + gl.L(i5 * 14);
                this.e = L2;
                this.f = L2;
                i3 = ug8.B(18.0f, L2, size);
                L = i3;
            } else {
                this.e = 0;
                this.f = gl.L(18.0f);
                L = size - gl.L(36.0f);
                i3 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            fu fuVar = this.a;
            fuVar.measure(makeMeasureSpec, 0);
            int measuredHeight = fuVar.getMeasuredHeight();
            int L3 = gl.L(8.0f) + measuredHeight;
            this.h = L3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = o.d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            o oVar = this.y;
            muVar = this;
            bw n = o.n(oVar, muVar, null, richText, L, L3, pageblockcollage2, alignment, 0, this.x);
            muVar.c = n;
            if (n != null) {
                int height = muVar.c.d.getHeight() + gl.L(4.0f);
                muVar.n = height;
                measuredHeight = de9.w(4.0f, height, measuredHeight);
                bw bwVar = muVar.c;
                bwVar.s = muVar.f;
                bwVar.w = muVar.h;
            } else {
                muVar.n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = muVar.s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (muVar.x.H) {
                alignment = lwa.a();
            }
            bw n2 = o.n(oVar, muVar, null, richText2, L, 0, pageblockcollage3, alignment, 0, muVar.x);
            muVar.d = n2;
            if (n2 != null) {
                measuredHeight += muVar.d.d.getHeight() + gl.L(4.0f);
                bw bwVar2 = muVar.d;
                bwVar2.s = muVar.f;
                bwVar2.w = muVar.h + muVar.n;
            }
            int L4 = gl.L(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = muVar.s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i4 = gl.L(8.0f) + L4;
            } else {
                i4 = L4;
            }
        } else {
            muVar = this;
        }
        muVar.setMeasuredDimension(size, i4);
        muVar.r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bw bwVar = this.c;
        int i = this.f;
        int i2 = this.h;
        o oVar = this.y;
        if (!o.i(oVar, this.x, motionEvent, this, bwVar, i, i2)) {
            if (!o.i(oVar, this.x, motionEvent, this, this.d, this.f, this.h + this.n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
