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
public final class ju extends zt {
    public static Paint f25031e0;
    public final TL_iv.pageBlockMap X;
    public final ImageReceiver Y;
    public final int Z;
    public final int f25032a0;
    public final int f25033b0;
    public boolean f25034c0;
    public Drawable f25035d0;

    public ju(ev evVar, Rect rect, int i7, TL_iv.pageBlockMap pageblockmap) {
        super(evVar, rect, i7);
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Y = imageReceiver;
        this.X = pageblockmap;
        imageReceiver.A1 = true;
        int i10 = pageblockmap.f28717w;
        i10 = i10 <= 0 ? 100 : i10;
        int i11 = pageblockmap.h;
        int i12 = i11 > 0 ? i11 : 100;
        int i13 = this.f28443c;
        int max = (int) ((i13 / Math.max(1, i10)) * i12);
        Point point = g0.f24226q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i13 = (int) ((max2 / Math.max(1, i12)) * i10);
            max = max2;
        }
        this.Z = i13;
        this.f25032a0 = max;
        float f10 = i13;
        float f11 = max;
        imageReceiver.z0(0.0f, 0.0f, f10, f11);
        ev evVar2 = this.f28441a;
        if (pageblockmap.geo == null) {
            return;
        }
        int i14 = evVar2.f23872a;
        int i15 = mp.u1(i14).f25824p3;
        this.f25033b0 = i15;
        float f12 = g0.f24225p;
        int i16 = (int) (f10 / f12);
        int i17 = (int) (f11 / f12);
        int i18 = pageblockmap.zoom;
        int i19 = i18 <= 0 ? 15 : i18;
        if (i15 == 2) {
            imageReceiver.r0(fc.p(g20.b(pageblockmap.geo, i16, i17, i19, Math.min(2, (int) Math.ceil(f12)))), null, null, null, evVar2.f23873b, 0);
            return;
        }
        TLRPC.GeoPoint geoPoint = pageblockmap.geo;
        imageReceiver.p0(g0.e0(i14, geoPoint.lat, geoPoint._long, i16, i17, true, i19, -1), null, null, null, 0L);
    }

    @Override
    public final int I() {
        Rect rect = this.f28442b;
        return rect.top + this.f25032a0 + rect.bottom;
    }

    @Override
    public final int J() {
        return K();
    }

    @Override
    public final int K() {
        Rect rect = this.f28442b;
        return rect.left + this.Z + rect.right;
    }

    @Override
    public final void T() {
        View view = this.W;
        ImageReceiver imageReceiver = this.Y;
        imageReceiver.I0(view);
        imageReceiver.Q();
    }

    @Override
    public final void V() {
        this.Y.S();
    }

    @Override
    public final void W(Canvas canvas) {
        int i7;
        Canvas canvas2;
        Drawable drawable;
        View view;
        if (f25031e0 == null) {
            f25031e0 = new Paint(1);
        }
        Paint paint = f25031e0;
        int i10 = org.telegram.ui.ActionBar.n6.f29515gf;
        ev evVar = this.f28441a;
        paint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, evVar.D));
        boolean R = R();
        boolean D = evVar.D();
        int i11 = 0;
        if (!R && !D) {
            i7 = evVar.S;
        } else {
            i7 = 0;
        }
        if (!R && !D) {
            i11 = evVar.T;
        }
        ImageReceiver imageReceiver = this.Y;
        int i12 = this.f25032a0;
        int i13 = this.Z;
        if (D) {
            RectF rectF = g0.P;
            rectF.set(0.0f, 0.0f, i13, i12);
            canvas.drawRoundRect(rectF, g0.L(12.0f), g0.L(12.0f), f25031e0);
            imageReceiver.K0(g0.L(12.0f));
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.drawRect(-i7, 0.0f, i13 + i11, i12, f25031e0);
        }
        Drawable drawable2 = org.telegram.ui.ActionBar.n6.S4[evVar.E() ? 1 : 0];
        if (drawable2 != null) {
            int intrinsicWidth = drawable2.getIntrinsicWidth();
            int intrinsicHeight = drawable2.getIntrinsicHeight();
            int i14 = (i13 - intrinsicWidth) / 2;
            int i15 = (i12 - intrinsicHeight) / 2;
            drawable2.setBounds(i14, i15, intrinsicWidth + i14, intrinsicHeight + i15);
            drawable2.draw(canvas2);
        }
        imageReceiver.z0(-i7, 0.0f, i7 + i13 + i11, i12);
        imageReceiver.h(canvas2, null);
        if (this.f25033b0 == 2 && imageReceiver.M()) {
            if (this.f25035d0 == null && (view = this.W) != null) {
                this.f25035d0 = view.getContext().getDrawable(2131231650).mutate();
            }
            if (this.f25035d0 != null) {
                int intrinsicWidth2 = (int) (drawable.getIntrinsicWidth() * 0.8f);
                int intrinsicHeight2 = (int) (this.f25035d0.getIntrinsicHeight() * 0.8f);
                int i16 = (i13 - intrinsicWidth2) / 2;
                int i17 = (i12 / 2) - intrinsicHeight2;
                this.f25035d0.setAlpha((int) (imageReceiver.f22739i1 * 255.0f));
                this.f25035d0.setBounds(i16, i17, intrinsicWidth2 + i16, intrinsicHeight2 + i17);
                this.f25035d0.draw(canvas2);
            }
        }
    }

    @Override
    public final boolean Y(MotionEvent motionEvent) {
        boolean z10;
        View view;
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        Rect rect = this.f28442b;
        float f10 = x10 - rect.left;
        float y10 = motionEvent.getY() - rect.top;
        if (f10 >= 0.0f && f10 <= this.Z && y10 >= 0.0f && y10 <= this.f25032a0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (actionMasked == 0) {
            if (z10) {
                this.f25034c0 = true;
                return true;
            }
        } else if (actionMasked == 1) {
            if (this.f25034c0) {
                this.f25034c0 = false;
                if (z10) {
                    TL_iv.pageBlockMap pageblockmap = this.X;
                    if (pageblockmap.geo != null && (view = this.W) != null) {
                        view.playSoundEffect(0);
                        try {
                            TLRPC.GeoPoint geoPoint = pageblockmap.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            this.W.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
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
                this.f25034c0 = false;
            }
            return this.f25034c0;
        }
        return false;
    }
}
