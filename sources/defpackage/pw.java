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
public final class pw extends FrameLayout implements fkb, vlb {
    public final o E;
    public int a;
    public final k b;
    public final nw c;
    public final ow d;
    public TL_iv.pageBlockSlideshow e;
    public bx f;
    public bx h;
    public final int n;
    public int r;
    public int s;
    public float w;
    public int x;
    public final ey y;

    public pw(o oVar, Activity activity, ey eyVar) {
        super(activity);
        this.E = oVar;
        this.n = gm.L(18.0f);
        this.y = eyVar;
        if (o.D1 == null) {
            Paint paint = new Paint(1);
            o.D1 = paint;
            paint.setColor(-1);
        }
        k kVar = new k(this, activity);
        this.b = kVar;
        kVar.b(new lw(this, (byte) 0));
        nw nwVar = new nw(this);
        this.c = nwVar;
        kVar.setAdapter(nwVar);
        int w0 = cmb.w0(null, cmb.c6, false);
        this.a = w0;
        gm.w3(kVar, w0);
        addView(kVar);
        ow owVar = new ow(this, activity);
        this.d = owVar;
        addView(owVar);
        setWillNotDraw(false);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.c6));
    }

    @Override
    public final void k(ArrayList arrayList) {
        bx bxVar = this.f;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        bx bxVar2 = this.h;
        if (bxVar2 != null) {
            arrayList.add(bxVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.f;
        if (bxVar != null) {
            bxVar.i(this);
        }
        bx bxVar2 = this.h;
        if (bxVar2 != null) {
            bxVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.f;
        if (bxVar != null) {
            bxVar.f(this);
        }
        bx bxVar2 = this.h;
        if (bxVar2 != null) {
            bxVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.e != null) {
            bx bxVar = this.f;
            o oVar = this.E;
            int i = this.n;
            int i2 = 0;
            if (bxVar != null) {
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
        StringBuilder sb = new StringBuilder(jb6.M0(2131754855, null));
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
        int L = gm.L(8.0f);
        k kVar = this.b;
        kVar.layout(0, L, kVar.getMeasuredWidth(), kVar.getMeasuredHeight() + gm.L(8.0f));
        int bottom = kVar.getBottom() - gm.L(23.0f);
        ow owVar = this.d;
        owVar.layout(0, bottom, owVar.getMeasuredWidth(), owVar.getMeasuredHeight() + bottom);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        pw pwVar;
        int i3;
        int size = View.MeasureSpec.getSize(i);
        if (this.e != null) {
            int L = gm.L(310.0f);
            this.b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(L, 1073741824));
            this.e.items.size();
            this.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(10.0f), 1073741824));
            int L2 = size - gm.L(36.0f);
            int L3 = gm.L(16.0f) + L;
            this.r = L3;
            TL_iv.pageBlockSlideshow pageblockslideshow = this.e;
            TL_iv.RichText richText = pageblockslideshow.caption.text;
            HashSet hashSet = o.d1;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            o oVar = this.E;
            pwVar = this;
            bx n = o.n(oVar, pwVar, null, richText, L2, L3, pageblockslideshow, alignment, 0, this.y);
            pwVar.f = n;
            int i4 = pwVar.n;
            if (n != null) {
                int height = pwVar.f.d.getHeight() + gm.L(4.0f);
                pwVar.s = height;
                L = hg9.v(4.0f, height, L);
                bx bxVar = pwVar.f;
                bxVar.s = i4;
                bxVar.w = pwVar.r;
            } else {
                pwVar.s = 0;
            }
            TL_iv.pageBlockSlideshow pageblockslideshow2 = pwVar.e;
            TL_iv.RichText richText2 = pageblockslideshow2.caption.credit;
            if (pwVar.y.H) {
                alignment = oya.a();
            }
            bx n2 = o.n(oVar, pwVar, null, richText2, L2, 0, pageblockslideshow2, alignment, 0, pwVar.y);
            pwVar.h = n2;
            if (n2 != null) {
                L += pwVar.h.d.getHeight() + gm.L(4.0f);
                bx bxVar2 = pwVar.h;
                bxVar2.s = i4;
                bxVar2.w = pwVar.r + pwVar.s;
            }
            i3 = gm.L(16.0f) + L;
        } else {
            pwVar = this;
            i3 = 1;
        }
        pwVar.setMeasuredDimension(size, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        bx bxVar = this.f;
        int i = this.n;
        int i2 = this.r;
        o oVar = this.E;
        if (!o.i(oVar, this.y, motionEvent, this, bxVar, i, i2)) {
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
                int w0 = cmb.w0(null, cmb.c6, false);
                if (w0 != this.a) {
                    this.a = w0;
                    gm.w3(kVar, w0);
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }
}
