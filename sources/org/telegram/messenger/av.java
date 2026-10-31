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
public final class av extends qu {
    public static Paint f14669d0;
    public final TL_iv.pageBlockMap W;
    public final ImageReceiver X;
    public final int Y;
    public final int Z;
    public final int f14670a0;
    public boolean f14671b0;
    public Drawable f14672c0;

    public av(vv vvVar, Rect rect, int i10, TL_iv.pageBlockMap pageblockmap) {
        super(vvVar, rect, i10);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.X = imageReceiver;
        this.W = pageblockmap;
        imageReceiver.f14424z1 = true;
        int i11 = pageblockmap.f20017w;
        i11 = i11 <= 0 ? 100 : i11;
        int i12 = pageblockmap.h;
        int i13 = i12 > 0 ? i12 : 100;
        int i14 = this.f17623c;
        int max = (int) ((i14 / Math.max(1, i11)) * i13);
        Point point = i0.f16026q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i14 = (int) ((max2 / Math.max(1, i13)) * i11);
            max = max2;
        }
        this.Y = i14;
        this.Z = max;
        float f7 = i14;
        float f10 = max;
        imageReceiver.y0(0.0f, 0.0f, f7, f10);
        vv vvVar2 = this.f17621a;
        if (pageblockmap.geo == null) {
            return;
        }
        int i15 = vvVar2.f18986a;
        int i16 = vp.r1(i15).f18842m3;
        this.f14670a0 = i16;
        float f11 = i0.f16025p;
        int i17 = (int) (f7 / f11);
        int i18 = (int) (f10 / f11);
        int i19 = pageblockmap.zoom;
        int i20 = i19 <= 0 ? 15 : i19;
        if (i16 == 2) {
            imageReceiver.q0(ic.p(b30.b(pageblockmap.geo, i17, i18, i20, Math.min(2, (int) Math.ceil(f11)))), null, null, null, vvVar2.f18987b, 0);
            return;
        }
        TLRPC.GeoPoint geoPoint = pageblockmap.geo;
        imageReceiver.o0(i0.e0(i15, geoPoint.lat, geoPoint._long, i17, i18, true, i20, -1), null, null, null, 0L);
    }

    @Override
    public final int H() {
        Rect rect = this.f17622b;
        return rect.top + this.Z + rect.bottom;
    }

    @Override
    public final int I() {
        return J();
    }

    @Override
    public final int J() {
        Rect rect = this.f17622b;
        return rect.left + this.Y + rect.right;
    }

    @Override
    public final void S() {
        View view = this.V;
        ImageReceiver imageReceiver = this.X;
        imageReceiver.H0(view);
        imageReceiver.P();
    }

    @Override
    public final void U() {
        this.X.R();
    }

    @Override
    public final void V(Canvas canvas) {
        int i10;
        Canvas canvas2;
        Drawable drawable;
        View view;
        if (f14669d0 == null) {
            f14669d0 = new Paint(1);
        }
        Paint paint = f14669d0;
        int i11 = org.telegram.ui.ActionBar.t6.f20938df;
        vv vvVar = this.f17621a;
        paint.setColor(org.telegram.ui.ActionBar.t6.w0(i11, vvVar.D));
        boolean Q = Q();
        boolean D = vvVar.D();
        int i12 = 0;
        if (!Q && !D) {
            i10 = vvVar.S;
        } else {
            i10 = 0;
        }
        if (!Q && !D) {
            i12 = vvVar.T;
        }
        ImageReceiver imageReceiver = this.X;
        int i13 = this.Z;
        int i14 = this.Y;
        if (D) {
            RectF rectF = i0.P;
            rectF.set(0.0f, 0.0f, i14, i13);
            canvas.drawRoundRect(rectF, i0.L(12.0f), i0.L(12.0f), f14669d0);
            imageReceiver.J0(i0.L(12.0f));
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(-i10, 0.0f, i14 + i12, i13, f14669d0);
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.t6.S4[vvVar.E() ? 1 : 0];
        if (drawable2 != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int i15 = (i14 - intrinsicWidth) / 2;
            int i16 = (i13 - intrinsicHeight) / 2;
            drawable2.setBounds(i15, i16, intrinsicWidth + i15, intrinsicHeight + i16);
            drawable2.draw(canvas2);
        }
        imageReceiver.y0(-i10, 0.0f, i10 + i14 + i12, i13);
        imageReceiver.h(canvas2, null);
        if (this.f14670a0 == 2 && imageReceiver.L()) {
            if (this.f14672c0 == null && (view = this.V) != null) {
                this.f14672c0 = view.getContext().getDrawable(2131231645).mutate();
            }
            if (this.f14672c0 != null) {
                int intrinsicWidth2 = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight2 = (int) (this.f14672c0.getIntrinsicHeight() * 0.8f);
                int i17 = (i14 - intrinsicWidth2) / 2;
                int i18 = (i13 / 2) - intrinsicHeight2;
                this.f14672c0.setAlpha((int) (imageReceiver.f14384h1 * 255.0f));
                this.f14672c0.setBounds(i17, i18, intrinsicWidth2 + i17, intrinsicHeight2 + i18);
                this.f14672c0.draw(canvas2);
            }
        }
    }

    @Override
    public final boolean X(MotionEvent motionEvent) {
        boolean z10;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        Rect rect = this.f17622b;
        float f7 = x10 - rect.left;
        float y3 = motionEvent.getY() - rect.top;
        if (f7 >= 0.0f && f7 <= this.Y && y3 >= 0.0f && y3 <= this.Z) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (actionMasked == 0) {
            if (z10) {
                this.f14671b0 = true;
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.f14671b0) {
                this.f14671b0 = false;
                if (z10) {
                    TL_iv.pageBlockMap pageblockmap = this.W;
                    if (pageblockmap.geo != null && (view = this.V) != null) {
                        view.playSoundEffect(0);
                        try {
                            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
                            double d = geoPoint.lat;
                            double d10 = geoPoint._long;
                            this.V.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
                            return true;
                        } catch (Exception e) {
                            f8.g(e, true);
                            return true;
                        }
                    }
                }
            }
        } else {
            if (actionMasked == 3) {
                this.f14671b0 = false;
            }
            return this.f14671b0;
        }
        return false;
    }
}
