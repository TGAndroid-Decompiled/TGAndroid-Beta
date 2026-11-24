package defpackage;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class aj9 extends qi9 {
    public static Paint e0;
    public final TL_iv.pageBlockMap X;
    public final ImageReceiver Y;
    public final int Z;
    public final int a0;
    public final int b0;
    public boolean c0;
    public Drawable d0;

    public aj9(uj9 uj9Var, Rect rect, int i, TL_iv.pageBlockMap pageblockmap) {
        super(uj9Var, rect, i);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        this.X = pageblockmap;
        imageReceiver.A1 = true;
        int i2 = pageblockmap.w;
        i2 = i2 <= 0 ? 100 : i2;
        int i3 = pageblockmap.h;
        int i4 = i3 > 0 ? i3 : 100;
        int i5 = this.c;
        int max = (int) ((i5 / Math.max(1, i2)) * i4);
        Point point = gm.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i5 = (int) ((max2 / Math.max(1, i4)) * i2);
            max = max2;
        }
        this.Z = i5;
        this.a0 = max;
        float f = i5;
        float f2 = max;
        imageReceiver.i0(0.0f, 0.0f, f, f2);
        uj9 uj9Var2 = this.a;
        if (pageblockmap.geo == null) {
            return;
        }
        int i6 = uj9Var2.a;
        int i7 = oc7.r1(i6).f3;
        this.b0 = i7;
        float f3 = gm.p;
        int i8 = (int) (f / f3);
        int i9 = (int) (f2 / f3);
        int i10 = pageblockmap.zoom;
        int i11 = i10 <= 0 ? 15 : i10;
        TLRPC.GeoPoint geoPoint = pageblockmap.geo;
        if (i7 == 2) {
            imageReceiver.d0(gn5.p(vuc.b(geoPoint, i8, i9, i11, Math.min(2, (int) Math.ceil(f3)))), null, null, null, uj9Var2.b, 0);
        } else {
            imageReceiver.e0(gm.e0(i6, geoPoint.lat, geoPoint._long, i8, i9, true, i11, -1), null, null, null, 0L);
        }
    }

    @Override
    public final int H() {
        Rect rect = this.b;
        return rect.top + this.a0 + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.b;
        return rect.left + this.Z + rect.right;
    }

    @Override
    public final void S() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Y;
        imageReceiver.p0(view);
        imageReceiver.I();
    }

    @Override
    public final void U() {
        this.Y.K();
    }

    @Override
    public final void V(Canvas canvas) {
        int i;
        Canvas canvas2;
        View view;
        Paint paint = e0;
        if (paint == null) {
            paint = new Paint(1);
            e0 = paint;
        }
        int i2 = cmb.ff;
        uj9 uj9Var = this.a;
        paint.setColor(cmb.v0(i2, uj9Var.D));
        boolean Q = Q();
        boolean C = uj9Var.C();
        int i3 = 0;
        if (!Q && !C) {
            i = uj9Var.S;
        } else {
            i = 0;
        }
        if (!Q && !C) {
            i3 = uj9Var.T;
        }
        ImageReceiver imageReceiver = this.Y;
        int i4 = this.a0;
        int i5 = this.Z;
        if (C) {
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, i5, i4);
            canvas.drawRoundRect(rectF, gm.L(12.0f), gm.L(12.0f), e0);
            imageReceiver.q0(gm.L(12.0f));
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(-i, 0.0f, i5 + i3, i4, e0);
        }
        Drawable drawable = cmb.R4[uj9Var.D() ? 1 : 0];
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i6 = (i5 - intrinsicWidth) / 2;
            int i7 = (i4 - intrinsicHeight) / 2;
            drawable.setBounds(i6, i7, intrinsicWidth + i6, intrinsicHeight + i7);
            drawable.draw(canvas2);
        }
        imageReceiver.i0(-i, 0.0f, i + i5 + i3, i4);
        imageReceiver.h(canvas2, null);
        if (this.b0 == 2 && imageReceiver.E()) {
            Drawable drawable2 = this.d0;
            if (drawable2 == null && (view = this.W) != null) {
                drawable2 = view.getContext().getDrawable(2131231651).mutate();
                this.d0 = drawable2;
            }
            if (drawable2 != null) {
                int intrinsicWidth2 = (int) (drawable2.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight2 = (int) (this.d0.getIntrinsicHeight() * 0.8f);
                int i8 = (i5 - intrinsicWidth2) / 2;
                int i9 = (i4 / 2) - intrinsicHeight2;
                this.d0.setAlpha((int) (imageReceiver.i1 * 255.0f));
                this.d0.setBounds(i8, i9, intrinsicWidth2 + i8, intrinsicHeight2 + i9);
                this.d0.draw(canvas2);
            }
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        boolean z;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        Rect rect = this.b;
        float f = x - rect.left;
        float y = motionEvent.getY() - rect.top;
        if (f >= 0.0f && f <= this.Z && y >= 0.0f && y <= this.a0) {
            z = true;
        } else {
            z = false;
        }
        if (actionMasked == 0) {
            if (z) {
                this.c0 = true;
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.c0) {
                this.c0 = false;
                if (z) {
                    TL_iv.pageBlockMap pageblockmap = this.X;
                    if (pageblockmap.geo != null && (view = this.W) != null) {
                        view.playSoundEffect(0);
                        try {
                            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            this.W.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                            return true;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return true;
                        }
                    }
                }
            }
        } else {
            if (actionMasked == 3) {
                this.c0 = false;
            }
            return this.c0;
        }
        return false;
    }
}
