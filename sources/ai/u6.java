package ai;

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
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.d11;
public final class u6 extends br {
    public final float E;
    public zf.n F;
    public int G;
    public int H;
    public final Paint I;
    public int J;
    public int K;
    public final Path f2252c;
    public final RectF d;
    public final ce e;
    public final int f2253f;
    public final View h;
    public final ImageReceiver f2254n;
    public final org.telegram.ui.Components.p5 f2255r;
    public RadialGradient f2256s;
    public final Matrix v;
    public final d11 f2257w;
    public final d11 f2258x;
    public org.telegram.ui.Components.p6 f2259y;

    public u6(View view, TL_stars.StarGift starGift, int i10, float f7) {
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
        this.f2252c = new Path();
        this.d = new RectF();
        this.v = new Matrix();
        this.I = new Paint(1);
        this.J = AndroidUtilities.dp(16.0f);
        this.K = 0;
        this.h = view;
        this.E = f7;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f2254n = imageReceiver;
        if (i10 > 180) {
            f10 = 24.0f;
        } else {
            f10 = 18.0f;
        }
        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(view, AndroidUtilities.dp(f10), false);
        this.f2255r = p5Var;
        this.f2253f = i10;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f13 = i10;
            ld.a1(imageReceiver, starGift.sticker, (int) (0.75f * f13));
            String str = starGift.title;
            d11 d11Var = new d11(str == null ? "Gift" : str, 16.0f, AndroidUtilities.bold());
            this.f2257w = d11Var;
            d11Var.o(-1);
            float f14 = i10 - 30;
            d11Var.q(AndroidUtilities.dp(f14));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            d11Var.a();
            d11Var.n(1);
            if (starGift.sold_out) {
                formatPluralString = LocaleController.getString(R.string.Gift2SoldOutTitle);
            } else {
                formatPluralString = LocaleController.formatPluralString("Gift2SoldAuctionPreviewGifts", starGift.availability_total, new Object[0]);
            }
            d11 d11Var2 = new d11(formatPluralString, 13.0f, null);
            this.f2258x = d11Var2;
            d11Var2.q(AndroidUtilities.dp(f14));
            d11Var2.a();
            d11Var2.n(1);
            ce ceVar = new ce(1, 40);
            this.e = ceVar;
            float f15 = 0.45f * f13;
            ceVar.f(-AndroidUtilities.dp(f15), -AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), AndroidUtilities.dp(f13 * 0.25f));
            float dp = AndroidUtilities.dp(30.0f);
            RectF rectF = ceVar.f1114c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            PointF pointF = new PointF(AndroidUtilities.lerp(0, width, Utilities.fastRandom.nextFloat()), AndroidUtilities.lerp(0, height, Utilities.fastRandom.nextFloat()));
            int i16 = 1;
            int i17 = 0;
            float floor = (float) Math.floor(dp / Math.sqrt(2));
            int ceil = (int) Math.ceil(width / floor);
            int i18 = ceil + 1;
            int ceil2 = (int) Math.ceil(height / floor);
            int i19 = ceil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance(PointF.class, i18, i19);
            for (int i20 = 0; i20 < i18; i20++) {
                for (int i21 = 0; i21 < i19; i21++) {
                    pointFArr[i20][i21] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF.x / floor)][(int) Math.floor(pointF.y / floor)] = pointF;
            arrayList.add(pointF);
            arrayList2.add(pointF);
            while (!arrayList2.isEmpty()) {
                int i22 = i16;
                if (arrayList2.size() > i22) {
                    i11 = Utilities.fastRandom.nextInt(arrayList2.size() - i22);
                } else {
                    i11 = i17;
                }
                PointF pointF2 = (PointF) arrayList2.get(i11);
                int i23 = i17;
                while (true) {
                    if (i23 < 15) {
                        f11 = dp;
                        f12 = floor;
                        int i24 = i23;
                        double lerp = AndroidUtilities.lerp(1, 2, Utilities.fastRandom.nextFloat()) * f11;
                        double lerp2 = AndroidUtilities.lerp(i17, 360, Utilities.fastRandom.nextFloat());
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
                                    int i25 = min;
                                    int i26 = max2;
                                    while (i26 <= min2) {
                                        int i27 = i26;
                                        PointF pointF4 = pointFArr[max][i27];
                                        int i28 = max2;
                                        if (pointF4 != null) {
                                            i14 = ceil;
                                            i15 = width;
                                            if (v7.f7.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f11) {
                                                break;
                                            }
                                        } else {
                                            i14 = ceil;
                                            i15 = width;
                                        }
                                        i26 = i27 + 1;
                                        max2 = i28;
                                        ceil = i14;
                                        width = i15;
                                    }
                                    max++;
                                    min = i25;
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
                        i23 = i24 + 1;
                        floor = f12;
                        dp = f11;
                        ceil = i14;
                        width = i15;
                        i17 = 0;
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
                i16 = 1;
                i17 = 0;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = ceVar.f1113b;
            int size2 = size - arrayList3.size();
            for (int i29 = 0; i29 < size2; i29++) {
                arrayList3.add(new be(ceVar));
            }
            int size3 = arrayList.size();
            ceVar.f1118j = size3;
            if (ceVar.f1120l != null) {
                e0.f0 f0Var = new e0.f0(size3);
                ceVar.f1120l = f0Var;
                Bitmap bitmap = ceVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i30 = 0;
                while (i30 < f0Var.f8097b) {
                    int i31 = i30;
                    e0.f0.c((float[]) f0Var.d, i31, 0.0f, 0.0f, width2, height2);
                    i30 = i31 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i32 = 0; i32 < ceVar.f1118j; i32++) {
                be beVar = (be) arrayList3.get(i32);
                PointF pointF5 = (PointF) arrayList.get(i32);
                ceVar.c(beVar, currentTimeMillis, true);
                beVar.f1058a = pointF5.x + rectF.left;
                beVar.f1059b = pointF5.y + rectF.top;
                beVar.h = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
                beVar.e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) fa.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) fa.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) fa.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                p5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.f2256s = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i10) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                p5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                ld.a1(imageReceiver, stargiftattributemodel.document, (int) (i10 * 0.75f));
            }
        }
        ((Paint) this.f25027b).setShader(this.f2256s);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override
    public final void a() {
        this.f2255r.a();
        this.f2254n.onAttachedToWindow();
        if (this.F != null) {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            int i10 = this.H;
            if (currentTime >= i10) {
                i10 = this.G;
            }
            this.F.a(i10 - currentTime);
        }
    }

    @Override
    public final void b() {
        this.f2255r.b();
        this.f2254n.onDetachedFromWindow();
        zf.n nVar = this.F;
        if (nVar != null) {
            nVar.b();
        }
    }

    public final void c(int i10) {
        d11 d11Var = this.f2258x;
        if (d11Var != null) {
            d11Var.o(i10 | (-16777216));
        }
    }

    public final void d(int i10, int i11) {
        int i12;
        this.H = i10;
        this.G = i11;
        if (this.F == null) {
            this.F = new zf.n(new a1.c(this, 5));
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        if (currentTime < i10) {
            i12 = i10 - currentTime;
        } else {
            i12 = i11 - currentTime;
        }
        this.F.a(i12);
        if (this.f2259y == null) {
            org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false);
            this.f2259y = p6Var;
            p6Var.u(-1);
            this.f2259y.w(AndroidUtilities.dp(12.0f));
            this.f2259y.setCallback(new ah.f1(this, 1));
        }
        h();
    }

    @Override
    public final void draw(Canvas canvas) {
        d11 d11Var;
        Paint paint = (Paint) this.f25027b;
        Rect bounds = getBounds();
        RectF rectF = this.d;
        rectF.set(bounds);
        canvas.save();
        Path path = this.f2252c;
        path.rewind();
        float f7 = this.J;
        path.addRoundRect(rectF, f7, f7, Path.Direction.CW);
        canvas.clipPath(path);
        if (this.f2256s != null) {
            Matrix matrix = this.v;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.f2256s.setLocalMatrix(matrix);
            paint.setShader(this.f2256s);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        m1.a(canvas, this.K, this.f2255r, rectF.width(), rectF.height(), 1.0f, this.E);
        ce ceVar = this.e;
        if (ceVar != null) {
            ceVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        d11 d11Var2 = this.f2257w;
        ImageReceiver imageReceiver = this.f2254n;
        if (d11Var2 != null && (d11Var = this.f2258x) != null) {
            if (this.f2259y != null) {
                Paint paint2 = this.I;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + rectF.top, rectF.left + AndroidUtilities.dp(20.0f) + Math.max(this.f2259y.c(), AndroidUtilities.dp(3.0f)), rectF.top + AndroidUtilities.dp(23.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + AndroidUtilities.dp(13.0f), rectF.top + AndroidUtilities.dp(14.0f));
                this.f2259y.draw(canvas);
                canvas.restore();
            }
            float min = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.setImageCoords(rectF.centerX() - (min / 2.0f), (rectF.height() * 0.12f) + rectF.top, min, min);
            imageReceiver.draw(canvas);
            d11Var2.e(canvas, rectF.centerX() - (d11Var2.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(50.0f));
            d11Var.e(canvas, rectF.centerX() - (d11Var.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(30.0f));
        } else {
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f10 = min2 / 2.0f;
            imageReceiver.setImageCoords(rectF.centerX() - f10, rectF.centerY() - f10, min2, min2);
            imageReceiver.draw(canvas);
        }
        canvas.restore();
    }

    public final void e(int i10, int i11) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(this.f2253f) / 2.0f, new int[]{i10 | (-16777216), i11 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f2256s = radialGradient;
        ((Paint) this.f25027b).setShader(radialGradient);
    }

    public final void f() {
        this.K = 3;
    }

    public final void g(int i10) {
        this.J = i10;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.f2253f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f2253f);
    }

    public final void h() {
        d11 d11Var;
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        int i10 = this.G;
        if (currentTime > i10) {
            this.f2259y.t(LocaleController.getString(R.string.Gift2AuctionCountdownFinished), true, true);
        } else {
            int i11 = this.H;
            if (currentTime < i11) {
                this.f2259y.t(LocaleController.formatString(R.string.Gift2AuctionCountdownStartsIn, AndroidUtilities.formatDuration(i11 - currentTime, true)), true, true);
            } else {
                this.f2259y.t(AndroidUtilities.formatDuration(i10 - currentTime, true), true, true);
            }
        }
        if (currentTime > this.G && (d11Var = this.f2258x) != null) {
            d11Var.r(LocaleController.getString(R.string.Gift2SoldOutTitle));
        }
    }
}
