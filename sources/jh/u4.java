package jh;

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
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.zz0;
public final class u4 extends lq {
    public final Path f12894b;
    public final RectF f12895c;
    public final va d;
    public final int f12896e;
    public final View f12897f;
    public final ImageReceiver f12898g;
    public final org.telegram.ui.Components.n5 h;
    public RadialGradient f12899i;
    public final Matrix f12900j;
    public final zz0 f12901k;
    public final zz0 f12902l;
    public org.telegram.ui.Components.n6 f12903m;
    public final float f12904n;
    public jf.p f12905o;
    public int f12906p;
    public int f12907q;
    public final Paint f12908r;
    public int f12909s;
    public int f12910t;

    public u4(View view, TL_stars.StarGift starGift, int i10, float f9) {
        super(view);
        float f10;
        String formatPluralString;
        int i11;
        float f11;
        float f12;
        int i12;
        int i13;
        int i14;
        int i15;
        this.f12894b = new Path();
        this.f12895c = new RectF();
        this.f12900j = new Matrix();
        this.f12908r = new Paint(1);
        this.f12909s = AndroidUtilities.dp(16.0f);
        this.f12910t = 0;
        this.f12897f = view;
        this.f12904n = f9;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f12898g = imageReceiver;
        if (i10 > 180) {
            f10 = 24.0f;
        } else {
            f10 = 18.0f;
        }
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(view, AndroidUtilities.dp(f10), false);
        this.h = n5Var;
        this.f12896e = i10;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f13 = i10;
            ia.Z0(imageReceiver, starGift.sticker, (int) (0.75f * f13));
            String str = starGift.title;
            zz0 zz0Var = new zz0(str == null ? "Gift" : str, 16.0f, AndroidUtilities.bold());
            this.f12901k = zz0Var;
            zz0Var.o(-1);
            float f14 = i10 - 30;
            zz0Var.q(AndroidUtilities.dp(f14));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            zz0Var.a();
            zz0Var.n(1);
            if (starGift.sold_out) {
                formatPluralString = LocaleController.getString(R.string.Gift2SoldOutTitle);
            } else {
                formatPluralString = LocaleController.formatPluralString("Gift2SoldAuctionPreviewGifts", starGift.availability_total, new Object[0]);
            }
            zz0 zz0Var2 = new zz0(formatPluralString, 13.0f, null);
            this.f12902l = zz0Var2;
            zz0Var2.q(AndroidUtilities.dp(f14));
            zz0Var2.a();
            zz0Var2.n(1);
            va vaVar = new va(1, 40);
            this.d = vaVar;
            float f15 = 0.45f * f13;
            vaVar.f(-AndroidUtilities.dp(f15), -AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), AndroidUtilities.dp(f13 * 0.25f));
            float dp = AndroidUtilities.dp(30.0f);
            RectF rectF = vaVar.f12988c;
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
                        f11 = dp;
                        f12 = floor;
                        int i21 = i20;
                        double lerp = AndroidUtilities.lerp(1, 2, Utilities.fastRandom.nextFloat()) * f11;
                        double lerp2 = AndroidUtilities.lerp(0, 360, Utilities.fastRandom.nextFloat());
                        PointF pointF3 = new PointF((float) ((Math.cos(Math.toRadians(lerp2)) * lerp) + pointF2.x), (float) ((Math.sin(Math.toRadians(lerp2)) * lerp) + pointF2.y));
                        int dp2 = AndroidUtilities.dp(15.0f) / 2;
                        float f16 = pointF3.x;
                        float f17 = dp2;
                        if (f16 >= f17 && f16 < width - dp2) {
                            float f18 = pointF3.y;
                            if (f18 >= f17 && f18 < height - dp2) {
                                int floor2 = (int) Math.floor(f16 / f12);
                                int floor3 = (int) Math.floor(pointF3.y / f12);
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
                                            if (i7.z5.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f11) {
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
                                pointFArr[(int) Math.floor(pointF3.x / f12)][(int) Math.floor(pointF3.y / f12)] = pointF3;
                                arrayList2.add(pointF3);
                                break;
                            }
                        }
                        i14 = ceil;
                        i15 = width;
                        i20 = i21 + 1;
                        floor = f12;
                        dp = f11;
                        ceil = i14;
                        width = i15;
                    } else {
                        f11 = dp;
                        f12 = floor;
                        i12 = ceil;
                        i13 = width;
                        arrayList2.remove(i11);
                        break;
                    }
                }
                floor = f12;
                dp = f11;
                ceil = i12;
                width = i13;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = vaVar.f12987b;
            int size2 = size - arrayList3.size();
            for (int i26 = 0; i26 < size2; i26++) {
                arrayList3.add(new ua(vaVar));
            }
            int size3 = arrayList.size();
            vaVar.f12993j = size3;
            if (vaVar.f12995l != null) {
                e0.i0 i0Var = new e0.i0(size3);
                vaVar.f12995l = i0Var;
                Bitmap bitmap = vaVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i27 = 0;
                while (i27 < i0Var.f5677a) {
                    int i28 = i27;
                    e0.i0.a((float[]) i0Var.f5679c, i28, 0.0f, 0.0f, width2, height2);
                    i27 = i28 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i29 = 0; i29 < vaVar.f12993j; i29++) {
                ua uaVar = (ua) arrayList3.get(i29);
                PointF pointF5 = (PointF) arrayList.get(i29);
                vaVar.c(uaVar, currentTimeMillis, true);
                uaVar.f12928a = pointF5.x + rectF.left;
                uaVar.f12929b = pointF5.y + rectF.top;
                uaVar.h = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
                uaVar.f12931e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) s7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) s7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) s7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                n5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.f12899i = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i10) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                n5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                ia.Z0(imageReceiver, stargiftattributemodel.document, (int) (i10 * 0.75f));
            }
        }
        this.f30413a.setShader(this.f12899i);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override
    public final void a() {
        this.h.a();
        this.f12898g.onAttachedToWindow();
        if (this.f12905o != null) {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            int i10 = this.f12907q;
            if (currentTime >= i10) {
                i10 = this.f12906p;
            }
            this.f12905o.a(i10 - currentTime);
        }
    }

    @Override
    public final void b() {
        this.h.b();
        this.f12898g.onDetachedFromWindow();
        jf.p pVar = this.f12905o;
        if (pVar != null) {
            pVar.b();
        }
    }

    public final void c(int i10) {
        zz0 zz0Var = this.f12902l;
        if (zz0Var != null) {
            zz0Var.o(i10 | (-16777216));
        }
    }

    public final void d(int i10, int i11) {
        int i12;
        this.f12907q = i10;
        this.f12906p = i11;
        if (this.f12905o == null) {
            this.f12905o = new jf.p(new eg.n(this, 20));
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (currentTime < i10) {
            i12 = i10 - currentTime;
        } else {
            i12 = i11 - currentTime;
        }
        this.f12905o.a(i12);
        if (this.f12903m == null) {
            org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
            this.f12903m = n6Var;
            n6Var.r(-1);
            this.f12903m.t(AndroidUtilities.dp(12.0f));
            this.f12903m.setCallback(new hg.a(this, 3));
        }
        h();
    }

    @Override
    public final void draw(Canvas canvas) {
        zz0 zz0Var;
        Rect bounds = getBounds();
        RectF rectF = this.f12895c;
        rectF.set(bounds);
        canvas.save();
        Path path = this.f12894b;
        path.rewind();
        float f9 = this.f12909s;
        path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
        canvas.clipPath(path);
        RadialGradient radialGradient = this.f12899i;
        Paint paint = this.f30413a;
        if (radialGradient != null) {
            Matrix matrix = this.f12900j;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.f12899i.setLocalMatrix(matrix);
            paint.setShader(this.f12899i);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        x0.a(canvas, this.f12910t, this.h, rectF.width(), rectF.height(), 1.0f, this.f12904n);
        va vaVar = this.d;
        if (vaVar != null) {
            vaVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        zz0 zz0Var2 = this.f12901k;
        ImageReceiver imageReceiver = this.f12898g;
        if (zz0Var2 != null && (zz0Var = this.f12902l) != null) {
            if (this.f12903m != null) {
                Paint paint2 = this.f12908r;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + rectF.top, rectF.left + AndroidUtilities.dp(20.0f) + Math.max(this.f12903m.d(), AndroidUtilities.dp(3.0f)), rectF.top + AndroidUtilities.dp(23.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + AndroidUtilities.dp(13.0f), rectF.top + AndroidUtilities.dp(14.0f));
                this.f12903m.draw(canvas);
                canvas.restore();
            }
            float min = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.setImageCoords(rectF.centerX() - (min / 2.0f), (rectF.height() * 0.12f) + rectF.top, min, min);
            imageReceiver.draw(canvas);
            zz0Var2.e(canvas, rectF.centerX() - (zz0Var2.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(50.0f));
            zz0Var.e(canvas, rectF.centerX() - (zz0Var.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(30.0f));
        } else {
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f10 = min2 / 2.0f;
            imageReceiver.setImageCoords(rectF.centerX() - f10, rectF.centerY() - f10, min2, min2);
            imageReceiver.draw(canvas);
        }
        canvas.restore();
    }

    public final void e(int i10, int i11) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(this.f12896e) / 2.0f, new int[]{i10 | (-16777216), i11 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f12899i = radialGradient;
        this.f30413a.setShader(radialGradient);
    }

    public final void f() {
        this.f12910t = 3;
    }

    public final void g(int i10) {
        this.f12909s = i10;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.f12896e);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f12896e);
    }

    public final void h() {
        zz0 zz0Var;
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        int i10 = this.f12906p;
        if (currentTime > i10) {
            this.f12903m.q(LocaleController.getString(R.string.Gift2AuctionCountdownFinished), true, true);
        } else {
            int i11 = this.f12907q;
            if (currentTime < i11) {
                this.f12903m.q(LocaleController.formatString(R.string.Gift2AuctionCountdownStartsIn, AndroidUtilities.formatDuration(i11 - currentTime, true)), true, true);
            } else {
                this.f12903m.q(AndroidUtilities.formatDuration(i10 - currentTime, true), true, true);
            }
        }
        if (currentTime > this.f12906p && (zz0Var = this.f12902l) != null) {
            zz0Var.r(LocaleController.getString(R.string.Gift2SoldOutTitle));
        }
    }
}
