package ci;

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
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.yp;
public final class w5 extends yp {
    public org.telegram.ui.Components.g6 E;
    public final float F;
    public cg.p G;
    public int H;
    public int I;
    public final Paint J;
    public int K;
    public int L;
    public final Path f6247c;
    public final RectF d;
    public final lc f6248e;
    public final int f6249f;
    public final View h;
    public final ImageReceiver f6250n;
    public final org.telegram.ui.Components.e5 f6251r;
    public RadialGradient f6252s;
    public final Matrix f6253w;
    public final ly0 f6254x;
    public final ly0 f6255y;

    public w5(View view, TL_stars.StarGift starGift, int i3, float f10) {
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
        this.f6247c = new Path();
        this.d = new RectF();
        this.f6253w = new Matrix();
        this.J = new Paint(1);
        this.K = org.telegram.messenger.g0.L(16.0f);
        this.L = 0;
        this.h = view;
        this.F = f10;
        ImageReceiver imageReceiver = new ImageReceiver(view);
        this.f6250n = imageReceiver;
        if (i3 > 180) {
            f11 = 24.0f;
        } else {
            f11 = 18.0f;
        }
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(f11), view, false);
        this.f6251r = e5Var;
        this.f6249f = i3;
        if (starGift instanceof TL_stars.TL_starGift) {
            float f14 = i3;
            wb.c1(imageReceiver, starGift.sticker, (int) (0.75f * f14));
            String str = starGift.title;
            ly0 ly0Var = new ly0(str == null ? "Gift" : str, 16.0f, org.telegram.messenger.g0.o());
            this.f6254x = ly0Var;
            ly0Var.n(-1);
            float f15 = i3 - 30;
            ly0Var.p(org.telegram.messenger.g0.L(f15));
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            ly0Var.a();
            ly0Var.m(1);
            if (starGift.sold_out) {
                G = bd.M0(2131749975, null);
            } else {
                G = bd.G(starGift.availability_total, "Gift2SoldAuctionPreviewGifts", new Object[0]);
            }
            ly0 ly0Var2 = new ly0(G, 13.0f, null);
            this.f6255y = ly0Var2;
            ly0Var2.p(org.telegram.messenger.g0.L(f15));
            ly0Var2.a();
            ly0Var2.m(1);
            lc lcVar = new lc(1, 40);
            this.f6248e = lcVar;
            float f16 = 0.45f * f14;
            lcVar.f(-org.telegram.messenger.g0.L(f16), -org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f16), org.telegram.messenger.g0.L(f14 * 0.25f));
            float L = org.telegram.messenger.g0.L(30.0f);
            RectF rectF = lcVar.f5515c;
            int width = (int) rectF.width();
            int height = (int) rectF.height();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            f5.a aVar = Utilities.f21386c;
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
                    i10 = Utilities.f21386c.nextInt(arrayList2.size() - i21);
                } else {
                    i10 = i16;
                }
                PointF pointF2 = (PointF) arrayList2.get(i10);
                int i22 = i16;
                while (true) {
                    if (i22 < 15) {
                        f5.a aVar2 = Utilities.f21386c;
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
                                            if (a7.h.a(pointF4.x, pointF4.y, pointF3.x, pointF3.y) < f12) {
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
            ArrayList arrayList3 = lcVar.f5514b;
            int size2 = size - arrayList3.size();
            for (int i28 = 0; i28 < size2; i28++) {
                arrayList3.add(new kc(lcVar));
            }
            int size3 = arrayList.size();
            lcVar.f5520j = size3;
            if (lcVar.f5522l != null) {
                e0.e0 e0Var = new e0.e0(size3);
                lcVar.f5522l = e0Var;
                Bitmap bitmap = lcVar.d;
                float width2 = bitmap.getWidth();
                float height2 = bitmap.getHeight();
                int i29 = 0;
                while (i29 < e0Var.f9225b) {
                    int i30 = i29;
                    e0.e0.d((float[]) e0Var.d, i30, 0.0f, 0.0f, width2, height2);
                    i29 = i30 + 1;
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (int i31 = 0; i31 < lcVar.f5520j; i31++) {
                kc kcVar = (kc) arrayList3.get(i31);
                PointF pointF5 = (PointF) arrayList.get(i31);
                lcVar.c(kcVar, currentTimeMillis, true);
                kcVar.f5415a = pointF5.x + rectF.left;
                kcVar.f5416b = pointF5.y + rectF.top;
                kcVar.h = org.telegram.messenger.g0.T1(0.4f, 1.0f, Utilities.f21386c.nextFloat());
                kcVar.f5418e *= 1.25f;
            }
        } else if (starGift != null) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e9.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class);
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) e9.l(starGift.attributes, TL_stars.starGiftAttributePattern.class);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) e9.l(starGift.attributes, TL_stars.starGiftAttributeModel.class);
            if (stargiftattributepattern != null) {
                e5Var.i(stargiftattributepattern.document, false);
            }
            if (stargiftattributebackdrop != null) {
                this.f6252s = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.N(i3) / 2.0f, new int[]{stargiftattributebackdrop.center_color | (-16777216), stargiftattributebackdrop.edge_color | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                e5Var.k(Integer.valueOf(stargiftattributebackdrop.pattern_color | (-16777216)));
            }
            if (stargiftattributemodel != null) {
                wb.c1(imageReceiver, stargiftattributemodel.document, (int) (i3 * 0.75f));
            }
        }
        ((Paint) this.f40801b).setShader(this.f6252s);
        if (view.isAttachedToWindow()) {
            a();
        }
    }

    @Override
    public final void a() {
        this.f6251r.a();
        this.f6250n.P();
        if (this.G != null) {
            int currentTime = ConnectionsManager.getInstance(h10.f22829t0).getCurrentTime();
            int i3 = this.I;
            if (currentTime >= i3) {
                i3 = this.H;
            }
            this.G.a(i3 - currentTime);
        }
    }

    @Override
    public final void b() {
        this.f6251r.b();
        this.f6250n.R();
        cg.p pVar = this.G;
        if (pVar != null) {
            pVar.b();
        }
    }

    public final void c(int i3) {
        ly0 ly0Var = this.f6255y;
        if (ly0Var != null) {
            ly0Var.n(i3 | (-16777216));
        }
    }

    public final void d(int i3, int i10) {
        int i11;
        this.I = i3;
        this.H = i10;
        if (this.G == null) {
            this.G = new cg.p(new a1.c(this, 14));
        }
        int currentTime = ConnectionsManager.getInstance(h10.f22829t0).getCurrentTime();
        if (currentTime < i3) {
            i11 = i3 - currentTime;
        } else {
            i11 = i10 - currentTime;
        }
        this.G.a(i11);
        if (this.E == null) {
            org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, false, false);
            this.E = g6Var;
            g6Var.u(-1);
            this.E.w(org.telegram.messenger.g0.L(12.0f));
            this.E.setCallback(new ah.a(this, 2));
        }
        h();
    }

    @Override
    public final void draw(Canvas canvas) {
        ly0 ly0Var;
        Paint paint = (Paint) this.f40801b;
        Rect bounds = getBounds();
        RectF rectF = this.d;
        rectF.set(bounds);
        canvas.save();
        Path path = this.f6247c;
        path.rewind();
        float f10 = this.K;
        path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
        canvas.clipPath(path);
        if (this.f6252s != null) {
            Matrix matrix = this.f6253w;
            matrix.reset();
            matrix.postTranslate(rectF.centerX(), rectF.centerY());
            this.f6252s.setLocalMatrix(matrix);
            paint.setShader(this.f6252s);
        }
        canvas.drawPaint(paint);
        canvas.save();
        canvas.translate(rectF.centerX(), rectF.centerY());
        b1.a(canvas, this.L, this.f6251r, rectF.width(), rectF.height(), 1.0f, this.F);
        lc lcVar = this.f6248e;
        if (lcVar != null) {
            lcVar.b(canvas, -1, 1.0f);
        }
        canvas.restore();
        ly0 ly0Var2 = this.f6254x;
        ImageReceiver imageReceiver = this.f6250n;
        if (ly0Var2 != null && (ly0Var = this.f6255y) != null) {
            if (this.E != null) {
                Paint paint2 = this.J;
                paint2.setColor(1342177280);
                canvas.drawRoundRect(rectF.left + org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f) + rectF.top, rectF.left + org.telegram.messenger.g0.L(20.0f) + Math.max(this.E.c(), org.telegram.messenger.g0.L(3.0f)), rectF.top + org.telegram.messenger.g0.L(23.0f), org.telegram.messenger.g0.L(8.5f), org.telegram.messenger.g0.L(8.5f), paint2);
                canvas.save();
                canvas.translate(rectF.left + org.telegram.messenger.g0.L(13.0f), rectF.top + org.telegram.messenger.g0.L(14.0f));
                this.E.draw(canvas);
                canvas.restore();
            }
            float min = Math.min(rectF.width(), rectF.height()) * 0.6f;
            imageReceiver.y0(rectF.centerX() - (min / 2.0f), (rectF.height() * 0.12f) + rectF.top, min, min);
            imageReceiver.h(canvas, null);
            ly0Var2.e(canvas, rectF.centerX() - (ly0Var2.k() / 2.0f), rectF.bottom - org.telegram.messenger.g0.L(50.0f));
            ly0Var.e(canvas, rectF.centerX() - (ly0Var.k() / 2.0f), rectF.bottom - org.telegram.messenger.g0.L(30.0f));
        } else {
            float min2 = Math.min(rectF.width(), rectF.height()) * 0.75f;
            float f11 = min2 / 2.0f;
            imageReceiver.y0(rectF.centerX() - f11, rectF.centerY() - f11, min2, min2);
            imageReceiver.h(canvas, null);
        }
        canvas.restore();
    }

    public final void e(int i3, int i10) {
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, org.telegram.messenger.g0.N(this.f6249f) / 2.0f, new int[]{i3 | (-16777216), i10 | (-16777216)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f6252s = radialGradient;
        ((Paint) this.f40801b).setShader(radialGradient);
    }

    public final void f() {
        this.L = 3;
    }

    public final void g(int i3) {
        this.K = i3;
    }

    @Override
    public final int getIntrinsicHeight() {
        return org.telegram.messenger.g0.L(this.f6249f);
    }

    @Override
    public final int getIntrinsicWidth() {
        return org.telegram.messenger.g0.L(this.f6249f);
    }

    public final void h() {
        ly0 ly0Var;
        int currentTime = ConnectionsManager.getInstance(h10.f22829t0).getCurrentTime();
        int i3 = this.H;
        if (currentTime > i3) {
            this.E.t(bd.M0(2131750374, null), true, true);
        } else {
            int i10 = this.I;
            if (currentTime < i10) {
                this.E.t(bd.a0(null, null, 2131750373, org.telegram.messenger.g0.g0(i10 - currentTime, true, false)), true, true);
            } else {
                this.E.t(org.telegram.messenger.g0.g0(i3 - currentTime, true, false), true, true);
            }
        }
        if (currentTime > this.H && (ly0Var = this.f6255y) != null) {
            ly0Var.q(bd.M0(2131749975, null));
        }
    }
}
