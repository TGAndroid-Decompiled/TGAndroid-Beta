package mh;

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
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.rq;
public final class t4 extends rq {
    public final Path f14797b;
    public final RectF f14798c;
    public final wa d;
    public final int f14799e;
    public final View f14800f;
    public final ImageReceiver f14801g;
    public final org.telegram.ui.Components.j5 h;
    public RadialGradient f14802i;
    public final Matrix f14803j;
    public final l01 f14804k;
    public final l01 f14805l;
    public org.telegram.ui.Components.j6 f14806m;
    public final float f14807n;
    public lf.p f14808o;
    public int f14809p;
    public int f14810q;
    public final Paint f14811r;
    public int f14812s;
    public int f14813t;

    public t4(View view, TL_stars.StarGift starGift, int i10, float f10) {
        super(view);
        float f11;
        String formatPluralString;
        int i11;
        float f12;
        float f13;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f14797b = new Path();
        this.f14798c = new RectF();
        this.f14803j = new Matrix();
        this.f14811r = new Paint(1);
        this.f14812s = AndroidUtilities.dp(16.0f);
        this.f14813t = 0;
        this.f14800f = view;
        this.f14807n = f10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f14801g = imageReceiver;
        if (i10 > 180) {
            f11 = 24.0f;
        } else {
            f11 = 18.0f;
        }
        org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(view, AndroidUtilities.dp(f11), false);
        this.h = j5Var;
        this.f14799e = i10;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f14 = i10;
            ja.Z0(imageReceiver, starGift.sticker, (int) (0.75f * f14));
            String str = starGift.title;
            l01 l01Var = new l01(str == null ? "Gift" : str, 16.0f, AndroidUtilities.bold());
            this.f14804k = l01Var;
            l01Var.o(-1);
            float f15 = i10 - 30;
            l01Var.q(AndroidUtilities.dp(f15));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            l01Var.a();
            l01Var.n(1);
            if (starGift.sold_out) {
                formatPluralString = LocaleController.getString(R.string.Gift2SoldOutTitle);
            } else {
                formatPluralString = LocaleController.formatPluralString("Gift2SoldAuctionPreviewGifts", starGift.availability_total, new Object[0]);
            }
            l01 l01Var2 = new l01(formatPluralString, 13.0f, null);
            this.f14805l = l01Var2;
            l01Var2.q(AndroidUtilities.dp(f15));
            l01Var2.a();
            l01Var2.n(1);
            wa waVar = new wa(1, 40);
            this.d = waVar;
            float f16 = 0.45f * f14;
            waVar.f(-AndroidUtilities.dp(f16), -AndroidUtilities.dp(f16), AndroidUtilities.dp(f16), AndroidUtilities.dp(f14 * 0.25f));
            float dp = AndroidUtilities.dp(30.0f);
            RectF rectF = waVar.f15007c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            PointF pointF = new PointF(AndroidUtilities.lerp(0, width, Utilities.fastRandom.nextFloat()), AndroidUtilities.lerp(0, height, Utilities.fastRandom.nextFloat()));
            float floor = (float) Math.floor(dp / Math.sqrt(2));
            int ceil = (int) Math.ceil(width / floor);
            int i16 = ceil + 1;
            int ceil2 = (int) Math.ceil(height / floor);
            int i17 = ceil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance(PointF.class, i16, i17);
            for (int i18 = 0; i18 < i16; i18++) {
                for (int i19 = 0; i19 < i17; i19++) {
                    pointFArr[i18][i19] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF.x / floor)][(int) Math.floor(pointF.y / floor)] = pointF;
            arrayList.add(pointF);
            arrayList2.add(pointF);
            while (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    i11 = Utilities.fastRandom.nextInt(arrayList2.size() - 1);
                } else {
                    i11 = 0;
                }
                PointF pointF2 = (PointF) arrayList2.get(i11);
                int i20 = 0;
                while (true) {
                    if (i20 < 15) {
                        f12 = dp;
                        f13 = floor;
                        int i21 = i20;
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
                                    int i22 = min;
                                    int i23 = max2;
                                    while (i23 <= min2) {
                                        int i24 = i23;
                                        PointF pointF4 = pointFArr[max][i24];
                                        int i25 = max2;
                                        if (pointF4 != null) {
                                            i14 = ceil;
                                            i15 = width;
                                            if (k7.o6.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f12) {
                                                break;
                                            }
                                        } else {
                                            i14 = ceil;
                                            i15 = width;
                                        }
                                        i23 = i24 + 1;
                                        max2 = i25;
                                        ceil = i14;
                                        width = i15;
                                    }
                                    max++;
                                    min = i22;
                                }
                                i12 = ceil;
                                i13 = width;
                                arrayList.add(pointF3);
                                pointFArr[(int) Math.floor(pointF3.x / f13)][(int) Math.floor(pointF3.y / f13)] = pointF3;
                                arrayList2.add(pointF3);
                                break;
                            }
                        }
                        i14 = ceil;
                        i15 = width;
                        i20 = i21 + 1;
                        floor = f13;
                        dp = f12;
                        ceil = i14;
                        width = i15;
                    } else {
                        f12 = dp;
                        f13 = floor;
                        i12 = ceil;
                        i13 = width;
                        arrayList2.remove(i11);
                        break;
                    }
                }
                floor = f13;
                dp = f12;
                ceil = i12;
                width = i13;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = waVar.f15006b;
            int size2 = size - arrayList3.size();
            for (int i26 = 0; i26 < size2; i26++) {
                arrayList3.add(new va(waVar));
            }
            int size3 = arrayList.size();
            waVar.f15012j = size3;
            if (waVar.f15014l != null) {
                a4.k kVar = new a4.k(size3);
                waVar.f15014l = kVar;
                Bitmap bitmap = waVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i27 = 0;
                while (i27 < kVar.f92a) {
                    int i28 = i27;
                    a4.k.b((float[]) kVar.f94c, i28, 0.0f, 0.0f, width2, height2);
                    i27 = i28 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i29 = 0; i29 < waVar.f15012j; i29++) {
                va vaVar = (va) arrayList3.get(i29);
                PointF pointF5 = (PointF) arrayList.get(i29);
                waVar.c(vaVar, currentTimeMillis, true);
                vaVar.f14950a = pointF5.x + rectF.left;
                vaVar.f14951b = pointF5.y + rectF.top;
                vaVar.h = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
                vaVar.f14953e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) t7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) t7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) t7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                j5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.f14802i = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i10) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                j5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                ja.Z0(imageReceiver, stargiftattributemodel.document, (int) (i10 * 0.75f));
            }
        }
        this.f30818a.setShader(this.f14802i);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override
    public final void a() {
        this.h.a();
        this.f14801g.onAttachedToWindow();
        if (this.f14808o != null) {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            int i10 = this.f14810q;
            if (currentTime >= i10) {
                i10 = this.f14809p;
            }
            this.f14808o.a(i10 - currentTime);
        }
    }

    @Override
    public final void b() {
        this.h.b();
        this.f14801g.onDetachedFromWindow();
        lf.p pVar = this.f14808o;
        if (pVar != null) {
            pVar.b();
        }
    }

    public final void c(int i10) {
        l01 l01Var = this.f14805l;
        if (l01Var != null) {
            l01Var.o(i10 | (-16777216));
        }
    }

    public final void d(int i10, int i11) {
        int i12;
        this.f14810q = i10;
        this.f14809p = i11;
        if (this.f14808o == null) {
            this.f14808o = new lf.p(new hg.f(this, 28));
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (currentTime < i10) {
            i12 = i10 - currentTime;
        } else {
            i12 = i11 - currentTime;
        }
        this.f14808o.a(i12);
        if (this.f14806m == null) {
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
            this.f14806m = j6Var;
            j6Var.r(-1);
            this.f14806m.t(AndroidUtilities.dp(12.0f));
            this.f14806m.setCallback(new i.f(this, 4));
        }
        h();
    }

    @Override
    public final void draw(Canvas canvas) {
        l01 l01Var;
        Rect bounds = getBounds();
        RectF rectF = this.f14798c;
        rectF.set(bounds);
        canvas.save();
        Path path = this.f14797b;
        path.rewind();
        float f10 = this.f14812s;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        RadialGradient radialGradient = this.f14802i;
        Paint paint = this.f30818a;
        if (radialGradient != null) {
            Matrix matrix = this.f14803j;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.f14802i.setLocalMatrix(matrix);
            paint.setShader(this.f14802i);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        w0.a(canvas, this.f14813t, this.h, rectF.width(), rectF.height(), 1.0f, this.f14807n);
        wa waVar = this.d;
        if (waVar != null) {
            waVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        l01 l01Var2 = this.f14804k;
        ImageReceiver imageReceiver = this.f14801g;
        if (l01Var2 != null && (l01Var = this.f14805l) != null) {
            if (this.f14806m != null) {
                Paint paint2 = this.f14811r;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + rectF.top, rectF.left + AndroidUtilities.dp(20.0f) + Math.max(this.f14806m.d(), AndroidUtilities.dp(3.0f)), rectF.top + AndroidUtilities.dp(23.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + AndroidUtilities.dp(13.0f), rectF.top + AndroidUtilities.dp(14.0f));
                this.f14806m.draw(canvas);
                canvas.restore();
            }
            float min = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.setImageCoords(rectF.centerX() - (min / 2.0f), (rectF.height() * 0.12f) + rectF.top, min, min);
            imageReceiver.draw(canvas);
            l01Var2.e(canvas, rectF.centerX() - (l01Var2.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(50.0f));
            l01Var.e(canvas, rectF.centerX() - (l01Var.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(30.0f));
        } else {
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f11 = min2 / 2.0f;
            imageReceiver.setImageCoords(rectF.centerX() - f11, rectF.centerY() - f11, min2, min2);
            imageReceiver.draw(canvas);
        }
        canvas.restore();
    }

    public final void e(int i10, int i11) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(this.f14799e) / 2.0f, new int[]{i10 | (-16777216), i11 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f14802i = radialGradient;
        this.f30818a.setShader(radialGradient);
    }

    public final void f() {
        this.f14813t = 3;
    }

    public final void g(int i10) {
        this.f14812s = i10;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.f14799e);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f14799e);
    }

    public final void h() {
        l01 l01Var;
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        int i10 = this.f14809p;
        if (currentTime > i10) {
            this.f14806m.q(LocaleController.getString(R.string.Gift2AuctionCountdownFinished), true, true);
        } else {
            int i11 = this.f14810q;
            if (currentTime < i11) {
                this.f14806m.q(LocaleController.formatString(R.string.Gift2AuctionCountdownStartsIn, AndroidUtilities.formatDuration(i11 - currentTime, true)), true, true);
            } else {
                this.f14806m.q(AndroidUtilities.formatDuration(i10 - currentTime, true), true, true);
            }
        }
        if (currentTime > this.f14809p && (l01Var = this.f14805l) != null) {
            l01Var.r(LocaleController.getString(R.string.Gift2SoldOutTitle));
        }
    }
}
