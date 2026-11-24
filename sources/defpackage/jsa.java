package defpackage;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class jsa extends jq2 {
    public ho E;
    public final float F;
    public ry2 G;
    public int H;
    public int I;
    public final Paint J;
    public int K;
    public byte L;
    public final Path c;
    public final RectF d;
    public final yxa e;
    public final short f;
    public final View h;
    public final ImageReceiver n;
    public final tm r;
    public RadialGradient s;
    public final Matrix w;
    public final uib x;
    public final uib y;

    public jsa(View view, TL_stars.StarGift starGift, int i, float f) {
        super(view);
        float f2;
        String G;
        int i2;
        float f3;
        int i3;
        float f4;
        z0d z0dVar;
        int i4;
        PointF pointF;
        this.c = new Path();
        this.d = new RectF();
        this.w = new Matrix();
        this.J = new Paint(1);
        this.K = gm.L(16.0f);
        this.L = (byte) 0;
        this.h = view;
        this.F = f;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.n = imageReceiver;
        if (i > 180) {
            f2 = 24.0f;
        } else {
            f2 = 18.0f;
        }
        tm tmVar = new tm(gm.L(f2), view, false);
        this.r = tmVar;
        this.f = i;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f5 = i;
            nxa.e1(imageReceiver, starGift.sticker, (int) (0.75f * f5));
            String str = starGift.title;
            uib uibVar = new uib(str == null ? "Gift" : str, 16.0f, gm.o());
            this.x = uibVar;
            uibVar.m(-1);
            float f6 = i - 30;
            uibVar.o(gm.L(f6));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            uibVar.a();
            uibVar.l(1);
            if (starGift.sold_out) {
                G = jb6.M0(2131749900, null);
            } else {
                G = jb6.G(starGift.availability_total, "Gift2SoldAuctionPreviewGifts", new Object[0]);
            }
            uib uibVar2 = new uib(G, 13.0f, null);
            this.y = uibVar2;
            uibVar2.o(gm.L(f6));
            uibVar2.a();
            uibVar2.l(1);
            yxa yxaVar = new yxa(1, 40);
            this.e = yxaVar;
            float f7 = 0.45f * f5;
            yxaVar.f(-gm.L(f7), -gm.L(f7), gm.L(f7), gm.L(f5 * 0.25f));
            float L = gm.L(30.0f);
            RectF rectF = yxaVar.c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            z0d z0dVar2 = Utilities.c;
            PointF pointF2 = new PointF(gm.U1(z0dVar2.nextFloat(), 0, width), gm.U1(z0dVar2.nextFloat(), 0, height));
            float floor = (float) Math.floor(L / 1.4142135623730951d);
            int i5 = 0;
            int ceil = (int) Math.ceil(width / floor);
            int i6 = ceil + 1;
            int ceil2 = (int) Math.ceil(height / floor);
            int i7 = ceil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance(PointF.class, i6, i7);
            for (int i8 = 0; i8 < i6; i8++) {
                for (int i9 = 0; i9 < i7; i9++) {
                    pointFArr[i8][i9] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF2.x / floor)][(int) Math.floor(pointF2.y / floor)] = pointF2;
            arrayList.add(pointF2);
            arrayList2.add(pointF2);
            while (!arrayList2.isEmpty()) {
                if (arrayList2.size() > 1) {
                    i2 = Utilities.c.nextInt(arrayList2.size() - 1);
                } else {
                    i2 = i5;
                }
                PointF pointF3 = (PointF) arrayList2.get(i2);
                int i10 = i5;
                while (true) {
                    if (i10 < 15) {
                        f4 = floor;
                        int i11 = i10;
                        double U1 = gm.U1(z0dVar.nextFloat(), 1, 2) * L;
                        double U12 = gm.U1(Utilities.c.nextFloat(), i5, 360);
                        PointF pointF4 = new PointF((float) ((Math.cos(Math.toRadians(U12)) * U1) + pointF3.x), (float) ((Math.sin(Math.toRadians(U12)) * U1) + pointF3.y));
                        int L2 = gm.L(15.0f) / 2;
                        float f8 = pointF4.x;
                        float f9 = L2;
                        if (f8 >= f9 && f8 < width - L2) {
                            float f10 = pointF4.y;
                            if (f10 >= f9 && f10 < height - L2) {
                                int floor2 = (int) Math.floor(f8 / f4);
                                int floor3 = (int) Math.floor(pointF4.y / f4);
                                int min = Math.min(floor2 + 1, ceil);
                                f3 = L;
                                int max = Math.max(floor3 - 1, 0);
                                int min2 = Math.min(floor3 + 1, ceil2);
                                for (int max2 = Math.max(floor2 - 1, 0); max2 <= min; max2++) {
                                    int i12 = max;
                                    while (i12 <= min2) {
                                        int i13 = min;
                                        PointF pointF5 = pointFArr[max2][i12];
                                        int i14 = max;
                                        if (pointF5 != null) {
                                            i4 = ceil;
                                            pointF = pointF3;
                                            if (oqe.a(pointF5.x, pointF5.y, pointF4.x, pointF4.y) < f3) {
                                                break;
                                            }
                                        } else {
                                            i4 = ceil;
                                            pointF = pointF3;
                                        }
                                        i12++;
                                        max = i14;
                                        min = i13;
                                        ceil = i4;
                                        pointF3 = pointF;
                                    }
                                }
                                i3 = ceil;
                                arrayList.add(pointF4);
                                pointFArr[(int) Math.floor(pointF4.x / f4)][(int) Math.floor(pointF4.y / f4)] = pointF4;
                                arrayList2.add(pointF4);
                                break;
                            }
                        }
                        f3 = L;
                        i4 = ceil;
                        pointF = pointF3;
                        i10 = i11 + 1;
                        floor = f4;
                        L = f3;
                        ceil = i4;
                        pointF3 = pointF;
                        i5 = 0;
                    } else {
                        f3 = L;
                        i3 = ceil;
                        f4 = floor;
                        arrayList2.remove(i2);
                        break;
                    }
                }
                floor = f4;
                L = f3;
                ceil = i3;
                i5 = 0;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = yxaVar.b;
            int size2 = size - arrayList3.size();
            for (int i15 = 0; i15 < size2; i15++) {
                arrayList3.add(new xxa(yxaVar));
            }
            int size3 = arrayList.size();
            yxaVar.j = size3;
            if (yxaVar.l != null) {
                e0c e0cVar = new e0c(size3);
                yxaVar.l = e0cVar;
                Bitmap bitmap = yxaVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i16 = 0;
                while (i16 < e0cVar.b) {
                    int i17 = i16;
                    e0c.d((float[]) e0cVar.d, i17, 0.0f, 0.0f, width2, height2);
                    i16 = i17 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i18 = 0; i18 < yxaVar.j; i18++) {
                xxa xxaVar = (xxa) arrayList3.get(i18);
                PointF pointF6 = (PointF) arrayList.get(i18);
                yxaVar.c(xxaVar, currentTimeMillis, true);
                xxaVar.a = pointF6.x + rectF.left;
                xxaVar.b = pointF6.y + rectF.top;
                xxaVar.h = gm.R1(0.4f, 1.0f, Utilities.c.nextFloat());
                xxaVar.e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) jva.i(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) jva.i(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) jva.i(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                tmVar.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.s = new RadialGradient(0.0f, 0.0f, gm.N(i) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                tmVar.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                nxa.e1(imageReceiver, stargiftattributemodel.document, (int) (i * 0.75f));
            }
        }
        ((Paint) this.b).setShader(this.s);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override
    public final void a() {
        this.r.a();
        this.n.I();
        if (this.G != null) {
            int currentTime = ConnectionsManager.getInstance(z8c.t0).getCurrentTime();
            int i = this.I;
            if (currentTime >= i) {
                i = this.H;
            }
            this.G.a(i - currentTime);
        }
    }

    @Override
    public final void b() {
        this.r.b();
        this.n.K();
        ry2 ry2Var = this.G;
        if (ry2Var != null) {
            ry2Var.b();
        }
    }

    public final void c(int i) {
        uib uibVar = this.y;
        if (uibVar != null) {
            uibVar.m(i | (-16777216));
        }
    }

    public final void d(int i, int i2) {
        int i3;
        this.I = i;
        this.H = i2;
        if (this.G == null) {
            this.G = new ry2(new yf9(this, (byte) 25));
        }
        int currentTime = ConnectionsManager.getInstance(z8c.t0).getCurrentTime();
        if (currentTime < i) {
            i3 = i - currentTime;
        } else {
            i3 = i2 - currentTime;
        }
        this.G.a(i3);
        if (this.E == null) {
            ho hoVar = new ho(false, false, false);
            this.E = hoVar;
            hoVar.u(-1);
            this.E.w(gm.L(12.0f));
            this.E.setCallback(new jo(this, (byte) 11));
        }
        f();
    }

    @Override
    public final void draw(Canvas canvas) {
        uib uibVar;
        Paint paint = (Paint) this.b;
        Rect bounds = getBounds();
        RectF rectF = this.d;
        rectF.set(bounds);
        canvas.save();
        Path path = this.c;
        path.rewind();
        float f = this.K;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        canvas.clipPath(path);
        if (this.s != null) {
            Matrix matrix = this.w;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.s.setLocalMatrix(matrix);
            paint.setShader(this.s);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        bpa.a(canvas, this.L, this.r, rectF.width(), rectF.height(), 1.0f, this.F);
        yxa yxaVar = this.e;
        if (yxaVar != null) {
            yxaVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        uib uibVar2 = this.x;
        ImageReceiver imageReceiver = this.n;
        if (uibVar2 != null && (uibVar = this.y) != null) {
            if (this.E != null) {
                Paint paint2 = this.J;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + gm.L(6.0f), gm.L(6.0f) + rectF.top, rectF.left + gm.L(20.0f) + Math.max(this.E.c(), gm.L(3.0f)), rectF.top + gm.L(23.0f), gm.L(8.5f), gm.L(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + gm.L(13.0f), rectF.top + gm.L(14.0f));
                this.E.draw(canvas);
                canvas.restore();
            }
            float min = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.i0(rectF.centerX() - (min / 2.0f), (rectF.height() * 0.12f) + rectF.top, min, min);
            imageReceiver.h(canvas, null);
            uibVar2.e(canvas, rectF.centerX() - (uibVar2.j() / 2.0f), rectF.bottom - gm.L(50.0f));
            uibVar.e(canvas, rectF.centerX() - (uibVar.j() / 2.0f), rectF.bottom - gm.L(30.0f));
        } else {
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f2 = min2 / 2.0f;
            imageReceiver.i0(rectF.centerX() - f2, rectF.centerY() - f2, min2, min2);
            imageReceiver.h(canvas, null);
        }
        canvas.restore();
    }

    public final void e(int i, int i2) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, gm.N(this.f) / 2.0f, new int[]{i | (-16777216), i2 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.s = radialGradient;
        ((Paint) this.b).setShader(radialGradient);
    }

    public final void f() {
        uib uibVar;
        int currentTime = ConnectionsManager.getInstance(z8c.t0).getCurrentTime();
        int i = this.H;
        if (currentTime > i) {
            this.E.t(jb6.M0(2131750299, null), true, true);
        } else {
            int i2 = this.I;
            ho hoVar = this.E;
            if (currentTime < i2) {
                hoVar.t(jb6.a0(null, null, 2131750298, gm.g0(i2 - currentTime, true, false)), true, true);
            } else {
                hoVar.t(gm.g0(i - currentTime, true, false), true, true);
            }
        }
        if (currentTime > this.H && (uibVar = this.y) != null) {
            uibVar.p(jb6.M0(2131749900, null));
        }
    }

    @Override
    public final int getIntrinsicHeight() {
        return gm.L(this.f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return gm.L(this.f);
    }
}
