package org.telegram.messenger;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pu extends fu {
    public static Paint f24622d0;
    public final TL_iv.pageBlockMap W;
    public final ImageReceiver X;
    public final int Y;
    public final int Z;
    public final int f24623a0;
    public boolean f24624b0;
    public Drawable f24625c0;

    public pu(kv kvVar, Rect rect, int i7, TL_iv.pageBlockMap pageblockmap) {
        super(kvVar, rect, i7);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        this.W = pageblockmap;
        imageReceiver.f21236z1 = true;
        int i10 = pageblockmap.f27181w;
        i10 = i10 <= 0 ? 100 : i10;
        int i11 = pageblockmap.h;
        int i12 = i11 > 0 ? i11 : 100;
        int i13 = this.f22471c;
        int max = (int) ((i13 / Math.max(1, i10)) * i12);
        Point point = g0.f22563q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i12)) * i10);
            max = max2;
        }
        this.Y = i13;
        this.Z = max;
        float f10 = i13;
        float f11 = max;
        imageReceiver.y0(0.0f, 0.0f, f10, f11);
        kv kvVar2 = this.f22469a;
        if (pageblockmap.geo == null) {
            return;
        }
        int i14 = kvVar2.f23763a;
        int i15 = qp.s1(i14).f24838m3;
        this.f24623a0 = i15;
        float f12 = g0.f22562p;
        int i16 = (int) (f10 / f12);
        int i17 = (int) (f11 / f12);
        int i18 = pageblockmap.zoom;
        int i19 = i18 <= 0 ? 15 : i18;
        if (i15 == 2) {
            imageReceiver.q0(hc.p(m20.b(pageblockmap.geo, i16, i17, i19, Math.min(2, (int) Math.ceil(f12)))), null, null, null, kvVar2.f23764b, 0);
            return;
        }
        TLRPC.GeoPoint geoPoint = pageblockmap.geo;
        imageReceiver.o0(g0.e0(i14, geoPoint.lat, geoPoint._long, i16, i17, true, i19, -1), null, null, null, 0L);
    }

    @Override
    public final int I() {
        Rect rect = this.f22470b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f22470b;
        return rect.left + this.Y + rect.right;
    }

    @Override
    public final void T() {
        View view = this.V;
        ImageReceiver imageReceiver = this.X;
        imageReceiver.H0(view);
        imageReceiver.P();
    }

    @Override
    public final void V() {
        this.X.R();
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        Canvas canvas2;
        Drawable drawable;
        View view;
        if (f24622d0 == null) {
            f24622d0 = new Paint(1);
        }
        Paint paint = f24622d0;
        int i10 = org.telegram.ui.ActionBar.l6.f27873df;
        kv kvVar = this.f22469a;
        paint.setColor(org.telegram.ui.ActionBar.l6.w0(i10, kvVar.D));
        boolean R = R();
        boolean D = kvVar.D();
        int i11 = 0;
        if (!R && !D) {
            i7 = kvVar.S;
        } else {
            i7 = 0;
        }
        if (!R && !D) {
            i11 = kvVar.T;
        }
        ImageReceiver imageReceiver = this.X;
        int i12 = this.Z;
        int i13 = this.Y;
        if (D) {
            RectF rectF = g0.P;
            rectF.set(0.0f, 0.0f, i13, i12);
            canvas.drawRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), f24622d0);
            imageReceiver.J0(g0.L(12.0f));
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(-i7, 0.0f, i13 + i11, i12, f24622d0);
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.l6.S4[kvVar.E() ? 1 : 0];
        if (drawable2 != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int i14 = (i13 - intrinsicWidth) / 2;
            int i15 = (i12 - intrinsicHeight) / 2;
            drawable2.setBounds(i14, i15, intrinsicWidth + i14, intrinsicHeight + i15);
            drawable2.draw(canvas2);
        }
        imageReceiver.y0(-i7, 0.0f, i7 + i13 + i11, i12);
        imageReceiver.h(canvas2, null);
        if (this.f24623a0 == 2 && imageReceiver.L()) {
            if (this.f24625c0 == null && (view = this.V) != null) {
                this.f24625c0 = view.getContext().getDrawable(2131231646).mutate();
            }
            if (this.f24625c0 != null) {
                int intrinsicWidth2 = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight2 = (int) (this.f24625c0.getIntrinsicHeight() * 0.8f);
                int i16 = (i13 - intrinsicWidth2) / 2;
                int i17 = (i12 / 2) - intrinsicHeight2;
                this.f24625c0.setAlpha((int) (imageReceiver.f21197h1 * 255.0f));
                this.f24625c0.setBounds(i16, i17, intrinsicWidth2 + i16, intrinsicHeight2 + i17);
                this.f24625c0.draw(canvas2);
            }
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        boolean z9;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        Rect rect = this.f22470b;
        float f10 = x10 - rect.left;
        float y10 = motionEvent.getY() - rect.top;
        if (f10 >= 0.0f && f10 <= this.Y && y10 >= 0.0f && y10 <= this.Z) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (actionMasked == 0) {
            if (z9) {
                this.f24624b0 = true;
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.f24624b0) {
                this.f24624b0 = false;
                if (z9) {
                    TL_iv.pageBlockMap pageblockmap = this.W;
                    if (pageblockmap.geo != null && (view = this.V) != null) {
                        view.playSoundEffect(0);
                        try {
                            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            this.V.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            return true;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            return true;
                        }
                    }
                }
            }
        } else {
            if (actionMasked == 3) {
                this.f24624b0 = false;
            }
            return this.f24624b0;
        }
        return false;
    }
}
