package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Layout;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class yv extends FrameLayout implements fkb {
    public final ui5 a;
    public final ey b;
    public Drawable c;
    public bx d;
    public bx e;
    public final ImageReceiver f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public boolean w;
    public int x;
    public TL_iv.pageBlockMap y;

    public yv(Activity activity, ui5 ui5Var, ey eyVar) {
        super(activity);
        this.a = ui5Var;
        this.b = eyVar;
        setWillNotDraw(false);
        this.f = new ImageReceiver(this);
    }

    @Override
    public final void k(ArrayList arrayList) {
        bx bxVar = this.d;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
        bx bxVar2 = this.e;
        if (bxVar2 != null) {
            arrayList.add(bxVar2);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.d;
        if (bxVar != null) {
            bxVar.i(this);
        }
        bx bxVar2 = this.e;
        if (bxVar2 != null) {
            bxVar2.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.d;
        if (bxVar != null) {
            bxVar.f(this);
        }
        bx bxVar2 = this.e;
        if (bxVar2 != null) {
            bxVar2.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.y == null) {
            return;
        }
        Paint paint = cmb.R1;
        int i = cmb.ff;
        ui5 ui5Var = this.a;
        ((o) ui5Var).getClass();
        paint.setColor(cmb.u0(i));
        ImageReceiver imageReceiver = this.f;
        canvas.drawRect(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x(), cmb.R1);
        float r = imageReceiver.r();
        Drawable[] drawableArr = cmb.R4;
        int i2 = 0;
        int intrinsicWidth = (int) (r - (drawableArr[0].getIntrinsicWidth() / 2));
        int s = (int) (imageReceiver.s() - (drawableArr[0].getIntrinsicHeight() / 2));
        Drawable drawable = drawableArr[0];
        drawable.setBounds(intrinsicWidth, s, drawable.getIntrinsicWidth() + intrinsicWidth, drawableArr[0].getIntrinsicHeight() + s);
        drawableArr[0].draw(canvas);
        imageReceiver.h(canvas, null);
        if (this.x == 2 && imageReceiver.E()) {
            Drawable drawable2 = this.c;
            if (drawable2 == null) {
                drawable2 = getContext().getDrawable(2131231651).mutate();
                this.c = drawable2;
            }
            int intrinsicWidth2 = (int) (drawable2.getIntrinsicWidth() * 0.8f);
            int intrinsicHeight = (int) (this.c.getIntrinsicHeight() * 0.8f);
            int z = (int) aq1.z(imageReceiver.N0, intrinsicWidth2, 2.0f, imageReceiver.L0);
            int i3 = (int) (((imageReceiver.O0 / 2.0f) - intrinsicHeight) + imageReceiver.M0);
            this.c.setAlpha((int) (imageReceiver.i1 * 255.0f));
            this.c.setBounds(z, i3, intrinsicWidth2 + z, intrinsicHeight + i3);
            this.c.draw(canvas);
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.n, this.r);
            o.s(ui5Var, canvas, this, 0);
            this.d.d(canvas, this);
            canvas.restore();
            i2 = 1;
        }
        if (this.e != null) {
            canvas.save();
            canvas.translate(this.n, this.r + this.s);
            o.s(ui5Var, canvas, this, i2);
            this.e.d(canvas, this);
            canvas.restore();
        }
        o.r(canvas, ui5Var, this.y, getMeasuredHeight());
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb = new StringBuilder(jb6.M0(2131748447, null));
        if (this.d != null) {
            sb.append(", ");
            sb.append(this.d.d.getText());
        }
        accessibilityNodeInfo.setText(sb.toString());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int L;
        int i6;
        int i7;
        float f;
        Layout.Alignment alignment;
        TLRPC.WebPage webPage;
        int size = View.MeasureSpec.getSize(i);
        TL_iv.pageBlockMap pageblockmap = this.y;
        if (pageblockmap != null) {
            if (pageblockmap.level > 0) {
                i5 = gm.L(18.0f) + gm.L(i4 * 14);
                this.n = i5;
                i6 = wi8.B(18.0f, i5, size);
                L = i6;
            } else {
                this.n = gm.L(18.0f);
                i5 = 0;
                L = size - gm.L(36.0f);
                i6 = size;
            }
            TL_iv.pageBlockMap pageblockmap2 = this.y;
            int i8 = (int) ((i6 / pageblockmap2.w) * pageblockmap2.h);
            Point point = gm.q;
            int max = (int) ((Math.max(point.x, point.y) - gm.L(56.0f)) * 0.9f);
            if (i8 > max) {
                TL_iv.pageBlockMap pageblockmap3 = this.y;
                i6 = (int) ((max / pageblockmap3.h) * pageblockmap3.w);
                i5 += ((size - i5) - i6) / 2;
                i7 = max;
            } else {
                i7 = i8;
            }
            float f2 = i5;
            if (!this.h && this.y.level <= 0) {
                f = gm.L(8.0f);
            } else {
                f = 0.0f;
            }
            float f3 = i6;
            float f4 = i7;
            ImageReceiver imageReceiver = this.f;
            imageReceiver.i0(f2, f, f3, f4);
            int i9 = ((o) this.a).Y;
            TLRPC.GeoPoint geoPoint = this.y.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            float f5 = gm.p;
            String e0 = gm.e0(i9, d, d2, (int) (f3 / f5), (int) (f4 / f5), true, 15, -1);
            TLRPC.GeoPoint geoPoint2 = this.y.geo;
            float f6 = gm.p;
            vuc b = vuc.b(geoPoint2, (int) (f3 / f6), (int) (f4 / f6), 15, Math.min(2, (int) Math.ceil(f6)));
            int i10 = oc7.r1(i9).f3;
            this.x = i10;
            ey eyVar = this.b;
            if (i10 == 2) {
                gn5 p = gn5.p(b);
                if (eyVar != null) {
                    webPage = eyVar.F;
                } else {
                    webPage = null;
                }
                imageReceiver.d0(p, null, null, null, webPage, 0);
            } else {
                imageReceiver.e0(e0, null, null, null, 0L);
            }
            int L2 = (int) (imageReceiver.M0 + imageReceiver.O0 + gm.L(8.0f));
            this.r = L2;
            TL_iv.pageBlockMap pageblockmap4 = this.y;
            bx m = o.m(this.a, this, null, pageblockmap4.caption.text, L, L2, pageblockmap4, this.b);
            this.d = m;
            if (m != null) {
                int height = this.d.d.getHeight() + gm.L(4.0f);
                this.s = height;
                i7 = hg9.v(4.0f, height, i7);
                bx bxVar = this.d;
                bxVar.s = this.n;
                bxVar.w = this.r;
            }
            int i11 = i7;
            TL_iv.pageBlockMap pageblockmap5 = this.y;
            TL_iv.RichText richText = pageblockmap5.caption.credit;
            if (eyVar != null && eyVar.H) {
                alignment = oya.a();
            } else {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            bx n = o.n(this.a, this, null, richText, L, 0, pageblockmap5, alignment, 0, this.b);
            this.e = n;
            if (n != null) {
                i11 += this.e.d.getHeight() + gm.L(4.0f);
                bx bxVar2 = this.e;
                bxVar2.s = this.n;
                bxVar2.w = this.r + this.s;
            }
            if (!this.h && this.y.level <= 0) {
                i11 += gm.L(8.0f);
            }
            i3 = gm.L(8.0f) + i11;
        } else {
            i3 = 1;
        }
        setMeasuredDimension(size, i3);
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() == 0 && this.f.H(x, y)) {
            this.w = true;
        } else if (motionEvent.getAction() == 1 && this.w) {
            this.w = false;
            try {
                TLRPC.GeoPoint geoPoint = this.y.geo;
                double d = geoPoint.lat;
                double d2 = geoPoint._long;
                Context context = getContext();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } else if (motionEvent.getAction() == 3) {
            this.w = false;
        }
        if (!this.w) {
            if (!o.i(this.a, this.b, motionEvent, this, this.d, this.n, this.r)) {
                if (!o.i(this.a, this.b, motionEvent, this, this.e, this.n, this.r + this.s) && !super.onTouchEvent(motionEvent)) {
                    return false;
                }
            }
        }
        return true;
    }
}
