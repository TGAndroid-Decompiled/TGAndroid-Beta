package bi;

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
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.my0;
public final class u6 extends a5.h {
    public org.telegram.ui.Components.i6 D;
    public final float E;
    public bg.q F;
    public int G;
    public int H;
    public final Paint I;
    public int J;
    public int K;
    public final Path f4811c;
    public final RectF d;
    public final ud f4812e;
    public final int f4813f;
    public final View h;
    public final ImageReceiver f4814n;
    public final org.telegram.ui.Components.g5 f4815r;
    public RadialGradient f4816s;
    public final Matrix f4817w;
    public final my0 f4818x;
    public final my0 f4819y;

    public u6(View view, TL_stars.StarGift starGift, int i7, float f10) {
        super(view);
        float f11;
        String G;
        int i10;
        float f12;
        float f13;
        int i11;
        int i12;
        int i13;
        int i14;
        this.f4811c = new Path();
        this.d = new RectF();
        this.f4817w = new Matrix();
        this.I = new Paint(1);
        this.J = org.telegram.messenger.g0.L(16.0f);
        this.K = 0;
        this.h = view;
        this.E = f10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f4814n = imageReceiver;
        if (i7 > 180) {
            f11 = 24.0f;
        } else {
            f11 = 18.0f;
        }
        org.telegram.ui.Components.g5 g5Var = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(f11), view, false);
        this.f4815r = g5Var;
        this.f4813f = i7;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f14 = i7;
            dd.c1(imageReceiver, starGift.sticker, (int) (0.75f * f14));
            String str = starGift.title;
            my0 my0Var = new my0(str == null ? "Gift" : str, 16.0f, org.telegram.messenger.g0.o());
            this.f4818x = my0Var;
            my0Var.n(-1);
            float f15 = i7 - 30;
            my0Var.p(org.telegram.messenger.g0.L(f15));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            my0Var.a();
            my0Var.m(1);
            if (starGift.sold_out) {
                G = org.telegram.messenger.id.M0(2131749968, null);
            } else {
                G = org.telegram.messenger.id.G(starGift.availability_total, "Gift2SoldAuctionPreviewGifts", new Object[0]);
            }
            my0 my0Var2 = new my0(G, 13.0f, null);
            this.f4819y = my0Var2;
            my0Var2.p(org.telegram.messenger.g0.L(f15));
            my0Var2.a();
            my0Var2.m(1);
            ud udVar = new ud(1, 40);
            this.f4812e = udVar;
            float f16 = 0.45f * f14;
            udVar.f(-org.telegram.messenger.g0.L(f16), -org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f14 * 0.25f));
            float L = org.telegram.messenger.g0.L(30.0f);
            RectF rectF = udVar.f4845c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            g5.a aVar = Utilities.f21335c;
            PointF pointF = new PointF(org.telegram.messenger.g0.W1(aVar.nextFloat(), 0, width), org.telegram.messenger.g0.W1(aVar.nextFloat(), 0, height));
            int i15 = 1;
            int i16 = 0;
            float floor = (float) Math.floor(L / Math.sqrt(2));
            int ceil = (int) Math.ceil(width / floor);
            int i17 = ceil + 1;
            int ceil2 = (int) Math.ceil(height / floor);
            int i18 = ceil2 + 1;
            PointF[][] pointFArr = (PointF[][]) Array.newInstance(PointF.class, i17, i18);
            for (int i19 = 0; i19 < i17; i19++) {
                for (int i20 = 0; i20 < i18; i20++) {
                    pointFArr[i19][i20] = null;
                }
            }
            pointFArr[(int) Math.floor(pointF.x / floor)][(int) Math.floor(pointF.y / floor)] = pointF;
            arrayList.add(pointF);
            arrayList2.add(pointF);
            while (!arrayList2.isEmpty()) {
                int i21 = i15;
                if (arrayList2.size() > i21) {
                    i10 = Utilities.f21335c.nextInt(arrayList2.size() - i21);
                } else {
                    i10 = i16;
                }
                PointF pointF2 = (PointF) arrayList2.get(i10);
                int i22 = i16;
                while (true) {
                    if (i22 < 15) {
                        g5.a aVar2 = Utilities.f21335c;
                        f12 = L;
                        f13 = floor;
                        int i23 = i22;
                        double W1 = org.telegram.messenger.g0.W1(aVar2.nextFloat(), 1, 2) * f12;
                        PointF pointF3 = new PointF((float) ((Math.cos(Math.toRadians(r13)) * W1) + pointF2.x), (float) ((Math.sin(Math.toRadians(r13)) * W1) + pointF2.y));
                        int L2 = org.telegram.messenger.g0.L(15.0f) / 2;
                        float f17 = pointF3.x;
                        float f18 = L2;
                        if (f17 >= f18 && f17 < width - L2) {
                            float f19 = pointF3.y;
                            if (f19 >= f18 && f19 < height - L2) {
                                int floor2 = (int) Math.floor(f17 / f13);
                                int floor3 = (int) Math.floor(pointF3.y / f13);
                                int max = Math.max(floor2 - 1, 0);
                                int min = Math.min(floor2 + 1, ceil);
                                int max2 = Math.max(floor3 - 1, 0);
                                int min2 = Math.min(floor3 + 1, ceil2);
                                while (max <= min) {
                                    int i24 = min;
                                    int i25 = max2;
                                    while (i25 <= min2) {
                                        int i26 = i25;
                                        PointF pointF4 = pointFArr[max][i26];
                                        int i27 = max2;
                                        if (pointF4 != null) {
                                            i13 = ceil;
                                            i14 = width;
                                            if (a8.r9.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f12) {
                                                break;
                                            }
                                        } else {
                                            i13 = ceil;
                                            i14 = width;
                                        }
                                        i25 = i26 + 1;
                                        max2 = i27;
                                        ceil = i13;
                                        width = i14;
                                    }
                                    max++;
                                    min = i24;
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
                        i22 = i23 + 1;
                        floor = f13;
                        L = f12;
                        ceil = i13;
                        width = i14;
                        i16 = 0;
                    } else {
                        f12 = L;
                        f13 = floor;
                        i11 = ceil;
                        i12 = width;
                        arrayList2.remove(i10);
                        break;
                    }
                }
                floor = f13;
                L = f12;
                ceil = i11;
                width = i12;
                i15 = 1;
                i16 = 0;
            }
            int size = arrayList.size();
            ArrayList arrayList3 = udVar.f4844b;
            int size2 = size - arrayList3.size();
            for (int i28 = 0; i28 < size2; i28++) {
                arrayList3.add(new td(udVar));
            }
            int size3 = arrayList.size();
            udVar.f4850j = size3;
            if (udVar.f4852l != null) {
                a4.k kVar = new a4.k(size3);
                udVar.f4852l = kVar;
                Bitmap bitmap = udVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i29 = 0;
                while (i29 < kVar.f191b) {
                    int i30 = i29;
                    a4.k.d((float[]) kVar.d, i30, 0.0f, 0.0f, width2, height2);
                    i29 = i30 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i31 = 0; i31 < udVar.f4850j; i31++) {
                td tdVar = (td) arrayList3.get(i31);
                PointF pointF5 = (PointF) arrayList.get(i31);
                udVar.c(tdVar, currentTimeMillis, true);
                tdVar.f4771a = pointF5.x + rectF.left;
                tdVar.f4772b = pointF5.y + rectF.top;
                tdVar.h = org.telegram.messenger.g0.T1(0.4f, 1.0f, Utilities.f21335c.nextFloat());
                tdVar.f4774e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) ea.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) ea.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) ea.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                g5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.f4816s = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.N(i7) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                g5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                dd.c1(imageReceiver, stargiftattributemodel.document, (int) (i7 * 0.75f));
            }
        }
        ((Paint) this.f220b).setShader(this.f4816s);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override
    public final void a() {
        this.f4815r.a();
        this.f4814n.P();
        if (this.F != null) {
            int currentTime = ConnectionsManager.getInstance(p10.f24470s0).getCurrentTime();
            int i7 = this.H;
            if (currentTime >= i7) {
                i7 = this.G;
            }
            this.F.a(i7 - currentTime);
        }
    }

    @Override
    public final void b() {
        this.f4815r.b();
        this.f4814n.R();
        bg.q qVar = this.F;
        if (qVar != null) {
            qVar.b();
        }
    }

    public final void c(int i7) {
        my0 my0Var = this.f4819y;
        if (my0Var != null) {
            my0Var.n(i7 | (-16777216));
        }
    }

    public final void d(int i7, int i10) {
        int i11;
        this.H = i7;
        this.G = i10;
        if (this.F == null) {
            this.F = new bg.q(new a1.c(this, 13));
        }
        int currentTime = ConnectionsManager.getInstance(p10.f24470s0).getCurrentTime();
        if (currentTime < i7) {
            i11 = i7 - currentTime;
        } else {
            i11 = i10 - currentTime;
        }
        this.F.a(i11);
        if (this.D == null) {
            org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false);
            this.D = i6Var;
            i6Var.u(-1);
            this.D.w(org.telegram.messenger.g0.L(12.0f));
            this.D.setCallback(new a5.b(this, 1));
        }
        h();
    }

    @Override
    public final void draw(Canvas canvas) {
        my0 my0Var;
        Paint paint = (Paint) this.f220b;
        Rect bounds = getBounds();
        RectF rectF = this.d;
        rectF.set(bounds);
        canvas.save();
        Path path = this.f4811c;
        path.rewind();
        float f10 = this.J;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        if (this.f4816s != null) {
            Matrix matrix = this.f4817w;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.f4816s.setLocalMatrix(matrix);
            paint.setShader(this.f4816s);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        i1.a(canvas, this.K, this.f4815r, rectF.width(), rectF.height(), 1.0f, this.E);
        ud udVar = this.f4812e;
        if (udVar != null) {
            udVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        my0 my0Var2 = this.f4818x;
        ImageReceiver imageReceiver = this.f4814n;
        if (my0Var2 != null && (my0Var = this.f4819y) != null) {
            if (this.D != null) {
                Paint paint2 = this.I;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f) + rectF.top, rectF.left + org.telegram.messenger.g0.L(20.0f) + Math.max(this.D.c(), org.telegram.messenger.g0.L(3.0f)), rectF.top + org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(8.5f), org.telegram.messenger.g0.L(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.top + org.telegram.messenger.g0.L(14.0f));
                this.D.draw(canvas);
                canvas.restore();
            }
            float min = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.y0(rectF.centerX() - (min / 2.0f), (rectF.height() * 0.12f) + rectF.top, min, min);
            imageReceiver.h(canvas, null);
            my0Var2.e(canvas, rectF.centerX() - (my0Var2.k() / 2.0f), rectF.bottom - org.telegram.messenger.g0.L(50.0f));
            my0Var.e(canvas, rectF.centerX() - (my0Var.k() / 2.0f), rectF.bottom - org.telegram.messenger.g0.L(30.0f));
        } else {
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f11 = min2 / 2.0f;
            imageReceiver.y0(rectF.centerX() - f11, rectF.centerY() - f11, min2, min2);
            imageReceiver.h(canvas, null);
        }
        canvas.restore();
    }

    public final void e(int i7, int i10) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.N(this.f4813f) / 2.0f, new int[]{i7 | (-16777216), i10 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f4816s = radialGradient;
        ((Paint) this.f220b).setShader(radialGradient);
    }

    public final void f() {
        this.K = 3;
    }

    public final void g(int i7) {
        this.J = i7;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(this.f4813f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(this.f4813f);
    }

    public final void h() {
        my0 my0Var;
        int currentTime = ConnectionsManager.getInstance(p10.f24470s0).getCurrentTime();
        int i7 = this.G;
        if (currentTime > i7) {
            this.D.t(org.telegram.messenger.id.M0(2131750367, null), true, true);
        } else {
            int i10 = this.H;
            if (currentTime < i10) {
                this.D.t(org.telegram.messenger.id.a0(null, null, 2131750366, org.telegram.messenger.g0.g0(i10 - currentTime, true, false)), true, true);
            } else {
                this.D.t(org.telegram.messenger.g0.g0(i7 - currentTime, true, false), true, true);
            }
        }
        if (currentTime > this.G && (my0Var = this.f4819y) != null) {
            my0Var.q(org.telegram.messenger.id.M0(2131749968, null));
        }
    }
}
