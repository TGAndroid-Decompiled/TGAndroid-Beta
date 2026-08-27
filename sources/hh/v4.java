package hh;

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
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.pz0;

public final class v4 extends fq {

    public final Path f10211b;

    public final RectF f10212c;
    public final bb d;

    public final int f10213e;

    public final View f10214f;

    public final ImageReceiver f10215g;
    public final org.telegram.ui.Components.i5 h;

    public RadialGradient f10216i;

    public final Matrix f10217j;

    public final pz0 f10218k;

    public final pz0 f10219l;

    public org.telegram.ui.Components.i6 f10220m;

    public final float f10221n;

    public gf.q f10222o;

    public int f10223p;

    public int f10224q;

    public final Paint f10225r;

    public int f10226s;

    public int f10227t;

    public v4(View view, TL_stars.StarGift starGift, int i10, float f10) {
        float f11;
        float f12;
        int i11;
        int i12;
        int i13;
        int i14;
        super(view);
        this.f10211b = new Path();
        this.f10212c = new RectF();
        this.f10217j = new Matrix();
        this.f10225r = new Paint(1);
        this.f10226s = AndroidUtilities.dp(16.0f);
        this.f10227t = 0;
        this.f10214f = view;
        this.f10221n = f10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f10215g = imageReceiver;
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(view, AndroidUtilities.dp(i10 > 180 ? 24.0f : 18.0f), false);
        this.h = i5Var;
        this.f10213e = i10;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f13 = i10;
            oa.Z0(imageReceiver, starGift.sticker, (int) (0.75f * f13));
            String str = starGift.title;
            pz0 pz0Var = new pz0(str == null ? "Gift" : str, 16.0f, AndroidUtilities.bold());
            this.f10218k = pz0Var;
            pz0Var.o(-1);
            float f14 = i10 - 30;
            pz0Var.q(AndroidUtilities.dp(f14));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            pz0Var.a();
            pz0Var.n(1);
            pz0 pz0Var2 = new pz0(starGift.sold_out ? LocaleController.getString(R.string.Gift2SoldOutTitle) : LocaleController.formatPluralString("Gift2SoldAuctionPreviewGifts", starGift.availability_total, new Object[0]), 13.0f, null);
            this.f10219l = pz0Var2;
            pz0Var2.q(AndroidUtilities.dp(f14));
            pz0Var2.a();
            pz0Var2.n(1);
            bb bbVar = new bb(1, 40);
            this.d = bbVar;
            float f15 = 0.45f * f13;
            bbVar.f(-AndroidUtilities.dp(f15), -AndroidUtilities.dp(f15), AndroidUtilities.dp(f15), AndroidUtilities.dp(f13 * 0.25f));
            float fDp = AndroidUtilities.dp(30.0f);
            RectF rectF = bbVar.f9034c;
            int iWidth = (int) rectF.width();
            int iHeight = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            PointF pointF = new PointF(AndroidUtilities.lerp(0, iWidth, Utilities.fastRandom.nextFloat()), AndroidUtilities.lerp(0, iHeight, Utilities.fastRandom.nextFloat()));
            float fFloor = (float) Math.floor(((double) fDp) / Math.sqrt(2));
            int iCeil = (int) Math.ceil(iWidth / fFloor);
            int i15 = iCeil + 1;
            int iCeil2 = (int) Math.ceil(iHeight / fFloor);
            int i16 = iCeil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance((Class<?>) PointF.class, i15, i16);
            for (int i17 = 0; i17 < i15; i17++) {
                for (int i18 = 0; i18 < i16; i18++) {
                    pointFArr[i17][i18] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF.x / fFloor)][(int) Math.floor(pointF.y / fFloor)] = pointF;
            arrayList.add(pointF);
            arrayList2.add(pointF);
            while (!arrayList2.isEmpty()) {
                int iNextInt = arrayList2.size() > 1 ? Utilities.fastRandom.nextInt(arrayList2.size() - 1) : 0;
                PointF pointF2 = (PointF) arrayList2.get(iNextInt);
                int i19 = 0;
                while (true) {
                    if (i19 >= 15) {
                        f11 = fDp;
                        f12 = fFloor;
                        i11 = iCeil;
                        i12 = iWidth;
                        arrayList2.remove(iNextInt);
                        break;
                    }
                    f11 = fDp;
                    float fLerp = AndroidUtilities.lerp(0, 360, Utilities.fastRandom.nextFloat());
                    f12 = fFloor;
                    int i20 = i19;
                    double dLerp = AndroidUtilities.lerp(1, 2, Utilities.fastRandom.nextFloat()) * f11;
                    double d = fLerp;
                    PointF pointF3 = new PointF((float) ((Math.cos(Math.toRadians(d)) * dLerp) + ((double) pointF2.x)), (float) ((Math.sin(Math.toRadians(d)) * dLerp) + ((double) pointF2.y)));
                    int iDp = AndroidUtilities.dp(15.0f) / 2;
                    float f16 = pointF3.x;
                    float f17 = iDp;
                    if (f16 >= f17 && f16 < iWidth - iDp) {
                        float f18 = pointF3.y;
                        if (f18 >= f17 && f18 < iHeight - iDp) {
                            int iFloor = (int) Math.floor(f16 / f12);
                            int iFloor2 = (int) Math.floor(pointF3.y / f12);
                            int iMax = Math.max(iFloor - 1, 0);
                            int iMin = Math.min(iFloor + 1, iCeil);
                            int iMax2 = Math.max(iFloor2 - 1, 0);
                            int iMin2 = Math.min(iFloor2 + 1, iCeil2);
                            while (true) {
                                if (iMax > iMin) {
                                    i11 = iCeil;
                                    i12 = iWidth;
                                    arrayList.add(pointF3);
                                    pointFArr[(int) Math.floor(pointF3.x / f12)][(int) Math.floor(pointF3.y / f12)] = pointF3;
                                    arrayList2.add(pointF3);
                                    break;
                                }
                                int i21 = iMin;
                                int i22 = iMax2;
                                while (i22 <= iMin2) {
                                    int i23 = i22;
                                    PointF pointF4 = pointFArr[iMax][i23];
                                    int i24 = iMax2;
                                    if (pointF4 != null) {
                                        i13 = iCeil;
                                        i14 = iWidth;
                                        if (h7.y.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f11) {
                                            break;
                                        }
                                    } else {
                                        i13 = iCeil;
                                        i14 = iWidth;
                                    }
                                    i22 = i23 + 1;
                                    iMax2 = i24;
                                    iCeil = i13;
                                    iWidth = i14;
                                }
                                iMax++;
                                iMin = i21;
                            }
                        } else {
                            i13 = iCeil;
                            i14 = iWidth;
                        }
                    } else {
                        i13 = iCeil;
                        i14 = iWidth;
                    }
                    i19 = i20 + 1;
                    fFloor = f12;
                    fDp = f11;
                    iCeil = i13;
                    iWidth = i14;
                }
                fFloor = f12;
                fDp = f11;
                iCeil = i11;
                iWidth = i12;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = bbVar.f9033b;
            int size2 = size - arrayList3.size();
            for (int i25 = 0; i25 < size2; i25++) {
                arrayList3.add(new ab(bbVar));
            }
            int size3 = arrayList.size();
            bbVar.f9039j = size3;
            if (bbVar.f9041l != null) {
                e0.i0 i0Var = new e0.i0(size3);
                bbVar.f9041l = i0Var;
                Bitmap bitmap = bbVar.d;
                float width = bitmap.getWidth();
                float height = bitmap.getHeight();
                int i26 = 0;
                while (i26 < i0Var.f5064a) {
                    int i27 = i26;
                    e0.i0.c((float[]) i0Var.f5066c, i27, 0.0f, 0.0f, width, height);
                    i26 = i27 + 1;
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (int i28 = 0; i28 < bbVar.f9039j; i28++) {
                ab abVar = (ab) arrayList3.get(i28);
                PointF pointF5 = (PointF) arrayList.get(i28);
                bbVar.c(abVar, jCurrentTimeMillis, true);
                abVar.f8970a = pointF5.x + rectF.left;
                abVar.f8971b = pointF5.y + rectF.top;
                abVar.h = AndroidUtilities.lerp(0.4f, 1.0f, Utilities.fastRandom.nextFloat());
                abVar.f8973e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u7.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u7.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) u7.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                i5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.f10216i = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(i10) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                i5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                oa.Z0(imageReceiver, stargiftattributemodel.document, (int) (i10 * 0.75f));
            }
        }
        this.f28431a.setShader(this.f10216i);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override
    public final void a() {
        this.h.a();
        this.f10215g.onAttachedToWindow();
        if (this.f10222o != null) {
            int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
            int i10 = this.f10224q;
            if (currentTime >= i10) {
                i10 = this.f10223p;
            }
            this.f10222o.a(i10 - currentTime);
        }
    }

    @Override
    public final void b() {
        this.h.b();
        this.f10215g.onDetachedFromWindow();
        gf.q qVar = this.f10222o;
        if (qVar != null) {
            qVar.b();
        }
    }

    public final void c(int i10) {
        pz0 pz0Var = this.f10219l;
        if (pz0Var != null) {
            pz0Var.o(i10 | (-16777216));
        }
    }

    public final void d(int i10, int i11) {
        this.f10224q = i10;
        this.f10223p = i11;
        if (this.f10222o == null) {
            this.f10222o = new gf.q(new h3.x(this, 7));
        }
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        this.f10222o.a(currentTime < i10 ? i10 - currentTime : i11 - currentTime);
        if (this.f10220m == null) {
            org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
            this.f10220m = i6Var;
            i6Var.r(-1);
            this.f10220m.t(AndroidUtilities.dp(12.0f));
            this.f10220m.setCallback(new fg.a(this, 2));
        }
        h();
    }

    @Override
    public final void draw(Canvas canvas) {
        pz0 pz0Var;
        Rect bounds = getBounds();
        RectF rectF = this.f10212c;
        rectF.set(bounds);
        canvas.save();
        Path path = this.f10211b;
        path.rewind();
        float f10 = this.f10226s;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        RadialGradient radialGradient = this.f10216i;
        Paint paint = this.f28431a;
        if (radialGradient != null) {
            Matrix matrix = this.f10217j;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.f10216i.setLocalMatrix(matrix);
            paint.setShader(this.f10216i);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        y0.a(canvas, this.f10227t, this.h, rectF.width(), rectF.height(), 1.0f, this.f10221n);
        bb bbVar = this.d;
        if (bbVar != null) {
            bbVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        pz0 pz0Var2 = this.f10218k;
        ImageReceiver imageReceiver = this.f10215g;
        if (pz0Var2 == null || (pz0Var = this.f10219l) == null) {
            float fMin = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f11 = fMin / 2.0f;
            imageReceiver.setImageCoords(rectF.centerX() - f11, rectF.centerY() - f11, fMin, fMin);
            imageReceiver.draw(canvas);
        } else {
            if (this.f10220m != null) {
                Paint paint2 = this.f10225r;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f) + rectF.top, rectF.left + AndroidUtilities.dp(20.0f) + Math.max(this.f10220m.d(), AndroidUtilities.dp(3.0f)), rectF.top + AndroidUtilities.dp(23.0f), AndroidUtilities.dp(8.5f), AndroidUtilities.dp(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + AndroidUtilities.dp(13.0f), rectF.top + AndroidUtilities.dp(14.0f));
                this.f10220m.draw(canvas);
                canvas.restore();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.setImageCoords(rectF.centerX() - (fMin2 / 2.0f), (rectF.height() * 0.12f) + rectF.top, fMin2, fMin2);
            imageReceiver.draw(canvas);
            pz0Var2.e(canvas, rectF.centerX() - (pz0Var2.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(50.0f));
            pz0Var.e(canvas, rectF.centerX() - (pz0Var.l() / 2.0f), rectF.bottom - AndroidUtilities.dp(30.0f));
        }
        canvas.restore();
    }

    public final void e(int i10, int i11) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, AndroidUtilities.dpf2(this.f10213e) / 2.0f, new int[]{i10 | (-16777216), i11 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f10216i = radialGradient;
        this.f28431a.setShader(radialGradient);
    }

    public final void f() {
        this.f10227t = 3;
    }

    public final void g(int i10) {
        this.f10226s = i10;
    }

    @Override
    public final int getIntrinsicHeight() {
        return AndroidUtilities.dp(this.f10213e);
    }

    @Override
    public final int getIntrinsicWidth() {
        return AndroidUtilities.dp(this.f10213e);
    }

    public final void h() {
        pz0 pz0Var;
        int currentTime = ConnectionsManager.getInstance(UserConfig.selectedAccount).getCurrentTime();
        int i10 = this.f10223p;
        if (currentTime > i10) {
            this.f10220m.q(LocaleController.getString(R.string.Gift2AuctionCountdownFinished), true, true);
        } else {
            int i11 = this.f10224q;
            if (currentTime < i11) {
                this.f10220m.q(LocaleController.formatString(R.string.Gift2AuctionCountdownStartsIn, AndroidUtilities.formatDuration(i11 - currentTime, true)), true, true);
            } else {
                this.f10220m.q(AndroidUtilities.formatDuration(i10 - currentTime, true), true, true);
            }
        }
        if (currentTime <= this.f10223p || (pz0Var = this.f10219l) == null) {
            return;
        }
        pz0Var.r(LocaleController.getString(R.string.Gift2SoldOutTitle));
    }
}
