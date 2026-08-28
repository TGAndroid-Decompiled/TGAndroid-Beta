package gh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Layout;
import android.view.View;
import java.lang.reflect.Array;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hq;
import org.telegram.ui.Components.nz0;
public final class x4 extends hq {
    public final Path f9149b;
    public final RectF f9150c;
    public final bb d;
    public final int f9151e;
    public final View f9152f;
    public final ImageReceiver f9153g;
    public final org.telegram.ui.Components.i5 h;
    public RadialGradient f9154i;
    public final Matrix f9155j;
    public final nz0 f9156k;
    public final nz0 f9157l;
    public org.telegram.ui.Components.i6 f9158m;
    public final float f9159n;
    public ff.q f9160o;
    public int f9161p;
    public int f9162q;
    public final Paint f9163r;
    public int f9164s;
    public int f9165t;

    public x4(View view, TL_stars.StarGift starGift, int i9, float f10) {
        super(view);
        float f11;
        String formatPluralString;
        int i10;
        float f12;
        float f13;
        int i11;
        int i12;
        int i13;
        int i14;
        this.f9149b = new Path();
        this.f9150c = new RectF();
        this.f9155j = new Matrix();
        this.f9163r = new Paint(1);
        this.f9164s = AndroidUtilities.dp(16.0f);
        this.f9165t = 0;
        this.f9152f = view;
        this.f9159n = f10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f9153g = imageReceiver;
        if (i9 > 180) {
            f11 = 24.0f;
        } else {
            f11 = 18.0f;
        }
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(view, AndroidUtilities.dp(f11), false);
        this.h = i5Var;
        this.f9151e = i9;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f14 = i9;
            oa.Z0(imageReceiver, starGift.sticker, (int) (0.75f * f14));
            String str = starGift.title;
            nz0 nz0Var = new nz0(str == null ? "Gift" : str, 16.0f, AndroidUtilities.bold());
            this.f9156k = nz0Var;
            nz0Var.o(-1);
            float f15 = i9 - 30;
            nz0Var.q(AndroidUtilities.dp(f15));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            nz0Var.a();
            nz0Var.n(1);
            if (starGift.sold_out) {
                formatPluralString = LocaleController.getString(R.string.Gift2SoldOutTitle);
            } else {
                formatPluralString = LocaleController.formatPluralString("Gift2SoldAuctionPreviewGifts", starGift.availability_total, new Object[0]);
            }
            nz0 nz0Var2 = new nz0(formatPluralString, 13.0f, null);
            this.f9157l = nz0Var2;
            nz0Var2.q(AndroidUtilities.dp(f15));
            nz0Var2.a();
            nz0Var2.n(1);
            bb bbVar = new bb(1, 40);
            this.d = bbVar;
            float f16 = 0.45f * f14;
            bbVar.f(-AndroidUtilities.dp(f16), -AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), AndroidUtilities.dp(f14 * 0.25f));
            float dp = AndroidUtilities.dp(30.0f);
            RectF rectF = bbVar.f7879c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            PointF pointF = new PointF(AndroidUtilities.lerp(0, width, Utilities.fastRandom.nextFloat()), AndroidUtilities.lerp(0, height, Utilities.fastRandom.nextFloat()));
            float floor = (float) Math.floor(dp / Math.sqrt(2));
            int ceil = (int) Math.ceil(width / floor);
            int i15 = ceil + 1;
            int ceil2 = (int) Math.ceil(height / floor);
            int i16 = ceil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance(PointF.class, i15, i16);
            for (int i17 = 0; i17 < i15; i17++) {
                for (int i18 = 0; i18 < i16; i18++) {
                    pointFArr[i17][i18] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF.x / floor)][(int) Math.floor(pointF.y / floor)] = pointF;
            arrayList.add(pointF);
            arrayList2.add(pointF);
            while (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    i10 = Utilities.fastRandom.nextInt(arrayList2.size() - 1);
                } else {
                    i10 = 0;
                }
                PointF pointF2 = (PointF) arrayList2.get(i10);
                int i19 = 0;
                while (true) {
                    if (i19 < 15) {
                        f12 = dp;
                        f13 = floor;
                        int i20 = i19;
                        double lerp = AndroidUtilities.lerp(1, 2, Utilities.fastRandom.nextFloat()) * f12;
                        double lerp2 = AndroidUtilities.lerp(0, 360, Utilities.fastRandom.nextFloat());
                        PointF pointF3 = new PointF((float) ((Math.cos(Math.toRadians(lerp2)) * lerp) + pointF2.x), (float) ((Math.sin(Math.toRadians(lerp2)) * lerp) + pointF2.y));
                        int dp2 = AndroidUtilities.dp(15.0f) / 2;
                        float f17 = pointF3.x;
                        float f18 = dp2;
                        if (f17 >= f18 && f17 < width - dp2) {
                            float f19 = pointF3.y;
                            if (f19 >= f18 && f19 < height - dp2) {
                                int floor2 = (int) Math.floor(f17 / f13);
                                int floor3 = (int) Math.floor(pointF3.y / f13);
                                int max = Math.max(floor2 - 1, 0);
                                int min = Math.min(floor2 + 1, ceil);
                                int max2 = Math.max(floor3 - 1, 0);
                                int min2 = Math.min(floor3 + 1, ceil2);
                                while (max <= min) {
                                    int i21 = min;
                                    int i22 = max2;
                                    while (i22 <= min2) {
                                        int i23 = i22;
                                        PointF pointF4 = pointFArr[max][i23];
                                        int i24 = max2;
                                        if (pointF4 != null) {
                                            i13 = ceil;
                                            i14 = width;
                                            if (g7.w.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f12) {
                                                break;
                                            }
                                        } else {
                                            i13 = ceil;
                                            i14 = width;
                                        }
                                        i22 = i23 + 1;
                                        max2 = i24;
                                        ceil = i13;
                                        width = i14;
                                    }
                                    max++;
                                    min = i21;
                                }
                                i11 = ceil;
                                i12 = width;
                                arrayList.add(pointF3);
                                pointFArr[(int) Math.floor(pointF3.x / f13)][(int) Math.floor(pointF3.y / f13)] = pointF3;
                                arrayList2.add(pointF3);
                                break;
                            }
                        }
                        i13 = ceil;
                        i14 = width;
                        i19 = i20 + 1;
                        floor = f13;
                        dp = f12;
                        ceil = i13;
                        width = i14;
                    } else {
                        f12 = dp;
                        f13 = floor;
                        i11 = ceil;
                        i12 = width;
                        arrayList2.remove(i10);
                        break;
                    }
                }
                floor = f13;
                dp = f12;
                ceil = i11;
                width = i12;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = bbVar.f7878b;
            int size2 = size - arrayList3.size();
            for (int i25 = 0; i25 < size2; i25++) {
                arrayList3.add(new ab(bbVar));
            }
            int size3 = arrayList.size();
            bbVar.f7884j = size3;
            if (bbVar.f7886l != null) {
                e0.i0 i0Var = new e0.i0(size3);
                bbVar.f7886l = i0Var;
                Bitmap bitmap = bbVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i26 = 0;
                while (i26 < i0Var.f4707a) {
                    int i27 = i26;
                    e0.i0.a((float[]) i0Var.f4709c, i27, 0.0f, 0.0f, width2, height2);
                    i26 = i27 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i28 = 0; i28 < bbVar.f7884j; i28++) {
                ab abVar = (ab) arrayList3.get(i28);
                PointF pointF5 = (PointF) arrayList.get(i28);
                bbVar.c(abVar, currentTimeMillis, true);
                abVar.f7812a = pointF5.x + rectF.left;
                abVar.f7813b = pointF5.y + rectF.top;
                abVar.h = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
                abVar.f7815e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) v7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) v7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) v7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                i5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.f9154i = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i9) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                i5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                oa.Z0(imageReceiver, stargiftattributemodel.document, (int) (i9 * 0.75f));
            }
        }
        this.f29171a.setShader(this.f9154i);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override
    public final void a() {
        this.h.a();
        this.f9153g.onAttachedToWindow();
        if (this.f9160o != null) {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            int i9 = this.f9162q;
            if (currentTime >= i9) {
                i9 = this.f9161p;
            }
            this.f9160o.a(i9 - currentTime);
        }
    }

    @Override
    public final void b() {
        this.h.b();
        this.f9153g.onDetachedFromWindow();
        ff.q qVar = this.f9160o;
        if (qVar != null) {
            qVar.b();
        }
    }

    public final void c(int i9) {
        nz0 nz0Var = this.f9157l;
        if (nz0Var != null) {
            nz0Var.o(i9 | (-16777216));
        }
    }

    public final void d(int i9, int i10) {
        int i11;
        this.f9162q = i9;
        this.f9161p = i10;
        if (this.f9160o == null) {
            this.f9160o = new ff.q(new i3(this, 1));
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (currentTime < i9) {
            i11 = i9 - currentTime;
        } else {
            i11 = i10 - currentTime;
        }
        this.f9160o.a(i11);
        if (this.f9158m == null) {
            org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
            this.f9158m = i6Var;
            i6Var.r(-1);
            this.f9158m.t(AndroidUtilities.dp(12.0f));
            this.f9158m.setCallback(new eg.a(this, 2));
        }
        h();
    }

    @Override
    public final void draw(Canvas canvas) {
        nz0 nz0Var;
        Rect bounds = getBounds();
        RectF rectF = this.f9150c;
        rectF.set(bounds);
        canvas.save();
        Path path = this.f9149b;
        path.rewind();
        float f10 = this.f9164s;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        RadialGradient radialGradient = this.f9154i;
        Paint paint = this.f29171a;
        if (radialGradient != null) {
            Matrix matrix = this.f9155j;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.f9154i.setLocalMatrix(matrix);
            paint.setShader(this.f9154i);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        y0.a(canvas, this.f9165t, this.h, rectF.width(), rectF.height(), 1.0f, this.f9159n);
        bb bbVar = this.d;
        if (bbVar != null) {
            bbVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        nz0 nz0Var2 = this.f9156k;
        ImageReceiver imageReceiver = this.f9153g;
        if (nz0Var2 != null && (nz0Var = this.f9157l) != null) {
            if (this.f9158m != null) {
                Paint paint2 = this.f9163r;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + rectF.top, rectF.left + AndroidUtilities.dp(20.0f) + Math.max(this.f9158m.d(), AndroidUtilities.dp(3.0f)), rectF.top + AndroidUtilities.dp(23.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + AndroidUtilities.dp(13.0f), rectF.top + AndroidUtilities.dp(14.0f));
                this.f9158m.draw(canvas);
                canvas.restore();
            }
            float min = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.setImageCoords(rectF.centerX() - (min / 2.0f), (rectF.height() * 0.12f) + rectF.top, min, min);
            imageReceiver.draw(canvas);
            nz0Var2.e(canvas, rectF.centerX() - (nz0Var2.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(50.0f));
            nz0Var.e(canvas, rectF.centerX() - (nz0Var.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(30.0f));
        } else {
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f11 = min2 / 2.0f;
            imageReceiver.setImageCoords(rectF.centerX() - f11, rectF.centerY() - f11, min2, min2);
            imageReceiver.draw(canvas);
        }
        canvas.restore();
    }

    public final void e(int i9, int i10) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(this.f9151e) / 2.0f, new int[]{i9 | (-16777216), i10 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f9154i = radialGradient;
        this.f29171a.setShader(radialGradient);
    }

    public final void f() {
        this.f9165t = 3;
    }

    public final void g(int i9) {
        this.f9164s = i9;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.f9151e);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f9151e);
    }

    public final void h() {
        nz0 nz0Var;
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        int i9 = this.f9161p;
        if (currentTime > i9) {
            this.f9158m.q(LocaleController.getString(R.string.Gift2AuctionCountdownFinished), true, true);
        } else {
            int i10 = this.f9162q;
            if (currentTime < i10) {
                this.f9158m.q(LocaleController.formatString(R.string.Gift2AuctionCountdownStartsIn, AndroidUtilities.formatDuration(i10 - currentTime, true)), true, true);
            } else {
                this.f9158m.q(AndroidUtilities.formatDuration(i9 - currentTime, true), true, true);
            }
        }
        if (currentTime > this.f9161p && (nz0Var = this.f9157l) != null) {
            nz0Var.r(LocaleController.getString(R.string.Gift2SoldOutTitle));
        }
    }
}
