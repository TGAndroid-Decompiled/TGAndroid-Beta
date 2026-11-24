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
public final class mv extends FrameLayout implements fkb {
    public final fv a;
    public final jv b;
    public bx c;
    public bx d;
    public int e;
    public int f;
    public int h;
    public int n;
    public boolean r;
    public TL_iv.pageBlockCollage s;
    public final lv w;
    public final ey x;
    public final o y;

    public mv(o oVar, Activity activity, ey eyVar) {
        super(activity);
        this.y = oVar;
        this.w = new lv(this);
        this.x = eyVar;
        fv fvVar = new fv((byte) 0, activity, this);
        this.a = fvVar;
        fvVar.i(new gv(this));
        hv hvVar = new hv(this);
        hvVar.O = new iv(this);
        fvVar.setLayoutManager(hvVar);
        jv jvVar = new jv(this);
        this.b = jvVar;
        fvVar.setAdapter(jvVar);
        addView(fvVar, qoe.c(-2.0f, -1));
        setWillNotDraw(false);
    }

    @Override
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            arrayList.add(bxVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
        bx bxVar2 = this.d;
        if (bxVar2 != null) {
            bxVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.s != null) {
            bx bxVar = this.c;
            o oVar = this.y;
            int i = 0;
            if (bxVar != null) {
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
        StringBuilder sb = new StringBuilder(jb6.M0(2131754895, null));
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
        int L = gm.L(8.0f);
        int i6 = this.e;
        fv fvVar = this.a;
        fvVar.layout(i5, L, fvVar.getMeasuredWidth() + i6, gm.L(8.0f) + fvVar.getMeasuredHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        mv mvVar;
        int L;
        int i3;
        int i4 = 1;
        this.r = true;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockCollage pageblockcollage = this.s;
        if (pageblockcollage != null) {
            int i5 = pageblockcollage.level;
            if (i5 > 0) {
                int L2 = gm.L(18.0f) + gm.L(i5 * 14);
                this.e = L2;
                this.f = L2;
                i3 = wi8.B(18.0f, L2, size);
                L = i3;
            } else {
                this.e = 0;
                this.f = gm.L(18.0f);
                L = size - gm.L(36.0f);
                i3 = size;
            }
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
            fv fvVar = this.a;
            fvVar.measure(makeMeasureSpec, 0);
            int measuredHeight = fvVar.getMeasuredHeight();
            int L3 = gm.L(8.0f) + measuredHeight;
            this.h = L3;
            TL_iv.pageBlockCollage pageblockcollage2 = this.s;
            TL_iv.RichText richText = pageblockcollage2.caption.text;
            HashSet hashSet = o.d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            o oVar = this.y;
            mvVar = this;
            bx n = o.n(oVar, mvVar, null, richText, L, L3, pageblockcollage2, alignment, 0, this.x);
            mvVar.c = n;
            if (n != null) {
                int height = mvVar.c.d.getHeight() + gm.L(4.0f);
                mvVar.n = height;
                measuredHeight = hg9.v(4.0f, height, measuredHeight);
                bx bxVar = mvVar.c;
                bxVar.s = mvVar.f;
                bxVar.w = mvVar.h;
            } else {
                mvVar.n = 0;
            }
            TL_iv.pageBlockCollage pageblockcollage3 = mvVar.s;
            TL_iv.RichText richText2 = pageblockcollage3.caption.credit;
            if (mvVar.x.H) {
                alignment = oya.a();
            }
            bx n2 = o.n(oVar, mvVar, null, richText2, L, 0, pageblockcollage3, alignment, 0, mvVar.x);
            mvVar.d = n2;
            if (n2 != null) {
                measuredHeight += mvVar.d.d.getHeight() + gm.L(4.0f);
                bx bxVar2 = mvVar.d;
                bxVar2.s = mvVar.f;
                bxVar2.w = mvVar.h + mvVar.n;
            }
            int L4 = gm.L(16.0f) + measuredHeight;
            TL_iv.pageBlockCollage pageblockcollage4 = mvVar.s;
            if (pageblockcollage4.level > 0 && !pageblockcollage4.bottom) {
                i4 = gm.L(8.0f) + L4;
            } else {
                i4 = L4;
            }
        } else {
            mvVar = this;
        }
        mvVar.setMeasuredDimension(size, i4);
        mvVar.r = false;
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bx bxVar = this.c;
        int i = this.f;
        int i2 = this.h;
        o oVar = this.y;
        if (!o.i(oVar, this.x, motionEvent, this, bxVar, i, i2)) {
            if (!o.i(oVar, this.x, motionEvent, this, this.d, this.f, this.h + this.n) && !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
        return true;
    }
}
