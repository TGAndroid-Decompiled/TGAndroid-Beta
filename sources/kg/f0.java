package kg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.f8;
import org.telegram.messenger.s5;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z4;
import org.telegram.ui.Components.dr;
import org.telegram.ui.Components.g20;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Wallet.c6;
import org.telegram.ui.Wallet.g6;
import org.telegram.ui.Wallet.v7;
import org.telegram.ui.az;
import org.telegram.ui.b60;
import org.telegram.ui.fz;
import org.telegram.ui.g31;
import org.telegram.ui.h8;
import org.telegram.ui.id;
import org.telegram.ui.k91;
import org.telegram.ui.kd;
import org.telegram.ui.ns;
import org.telegram.ui.oo;
import org.telegram.ui.rc1;
import org.telegram.ui.sn;
import org.telegram.ui.un;
import org.telegram.ui.vd0;
import org.telegram.ui.x20;
public final class f0 extends View implements fe.e {
    public final int f11063a;
    public Object f11064b;
    public final Object f11065c;

    public f0(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f11063a = i10;
        this.f11065c = obj;
        this.f11064b = obj2;
    }

    public boolean a() {
        q9 q9Var = (q9) this.f11064b;
        if (q9Var.f29697t) {
            if ((q9Var.f29690m == 1.0f || !q9Var.f29693p) && q9Var.f29691n && q9Var.d.getAlpha() == 1.0f && getVisibility() == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f11063a) {
            case 3:
                RectF rectF = (RectF) this.f11064b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                int measuredWidth = getMeasuredWidth();
                un unVar = (un) this.f11065c;
                int backgroundSizeY = unVar.l1.getBackgroundSizeY();
                float x10 = getX();
                float g92 = unVar.g9(this);
                sn snVar = unVar.f42288xa;
                if (snVar != null) {
                    snVar.b(x10, g92, measuredWidth, backgroundSizeY);
                } else {
                    t6.r(x10, g92, measuredWidth, backgroundSizeY);
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), unVar.getThemedPaint("paintChatActionBackground"));
                sn snVar2 = unVar.f42288xa;
                if (snVar2 == null ? t6.d1() : snVar2.g()) {
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), unVar.getThemedPaint("paintChatActionBackgroundDarken"));
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                x20 x20Var = (x20) this.f11065c;
                dr drVar = x20Var.f31795c0;
                float measuredWidth2 = (1.0f - drVar.f25580g) * x20Var.f31796d0.getMeasuredWidth();
                canvas.save();
                org.telegram.ui.Cells.y yVar = (org.telegram.ui.Cells.y) this.f11064b;
                yVar.setBounds(0, 0, org.telegram.messenger.i0.L(50.0f) + ((int) ((x20Var.f31797e0.getMeasuredWidth() * drVar.f25580g) + measuredWidth2)), getMeasuredHeight());
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 12:
                super.dispatchDraw(canvas);
                ((ActionBarLayout) ((z4) this.f11064b)).q(canvas, 0);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void drawableStateChanged() {
        switch (this.f11063a) {
            case 8:
                super.drawableStateChanged();
                ((org.telegram.ui.Cells.y) this.f11064b).setState(getDrawableState());
                return;
            default:
                super.drawableStateChanged();
                return;
        }
    }

    @Override
    public void jumpDrawablesToCurrentState() {
        switch (this.f11063a) {
            case 8:
                super.jumpDrawablesToCurrentState();
                ((org.telegram.ui.Cells.y) this.f11064b).jumpToCurrentState();
                return;
            default:
                super.jumpDrawablesToCurrentState();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        float f7;
        Bitmap[] bitmapArr;
        float f10;
        ?? r16;
        ?? r15;
        int themedColor;
        int i10;
        switch (this.f11063a) {
            case 0:
                float measuredWidth = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                canvas.drawCircle(measuredWidth, measuredHeight, getMeasuredWidth() / 2.0f, (Paint) this.f11064b);
                ea.f.d().f(-org.telegram.messenger.i0.L(10.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                canvas.drawCircle(measuredWidth, measuredHeight, (getMeasuredWidth() / 2.0f) - org.telegram.messenger.i0.L(2.0f), ea.f.d().e());
                float L = org.telegram.messenger.i0.L(18.0f) / 2.0f;
                Drawable drawable = (Drawable) this.f11065c;
                drawable.setBounds((int) (measuredWidth - L), (int) (measuredHeight - L), (int) (measuredWidth + L), (int) (measuredHeight + L));
                drawable.draw(canvas);
                return;
            case 1:
                super.onDraw(canvas);
                int paddingLeft = getPaddingLeft();
                float width = ((getWidth() - paddingLeft) - getPaddingRight()) / 7.0f;
                for (int i11 = 0; i11 < 7; i11++) {
                    String str = ((String[]) this.f11064b)[i11];
                    canvas.drawText(str, (width / 2.0f) + (i11 * width) + paddingLeft, ((getMeasuredHeight() - org.telegram.messenger.i0.L(2.0f)) / 2.0f) + org.telegram.messenger.i0.L(5.0f), ((h8) this.f11065c).f37731f);
                }
                return;
            case 2:
                Paint paint = (Paint) this.f11064b;
                kd kdVar = (kd) this.f11065c;
                ag.d2 d2Var = kdVar.f38814f;
                if (d2Var != null && d2Var.getImageReceiver().L()) {
                    paint.setAlpha((int) (kdVar.f38829s.getAlpha() * kdVar.f38814f.getImageReceiver().f14385h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                    return;
                }
                return;
            case 3:
            case 8:
            case 12:
            default:
                super.onDraw(canvas);
                return;
            case 4:
                q9 q9Var = (q9) this.f11064b;
                Paint paint2 = q9Var.f29700x;
                p6 p6Var = q9Var.f29701y;
                Paint paint3 = q9Var.f29699w;
                int i12 = q9Var.f29682b;
                View view = q9Var.f29683c;
                f0 f0Var = q9Var.d;
                if (f0Var != null) {
                    if (f0Var.getMeasuredHeight() != 0 || f0Var.getMeasuredWidth() != 0) {
                        if (i12 == 1 && !q9Var.f29697t && !q9Var.f29693p) {
                            q9Var.a();
                            q9Var.f29689l = false;
                        }
                        Bitmap[] bitmapArr2 = q9Var.f29685g;
                        if ((bitmapArr2 != null || q9Var.f29692o) && q9Var.f29693p) {
                            boolean z10 = q9Var.f29691n;
                            if (z10) {
                                float f11 = q9Var.f29690m;
                                if (f11 != 1.0f) {
                                    float f12 = f11 + 0.09f;
                                    q9Var.f29690m = f12;
                                    if (f12 > 1.0f) {
                                        q9Var.f29690m = 1.0f;
                                    }
                                    f0Var.invalidate();
                                }
                            }
                            if (!z10) {
                                float f13 = q9Var.f29690m;
                                if (f13 != 0.0f) {
                                    float f14 = f13 - 0.09f;
                                    q9Var.f29690m = f14;
                                    if (f14 < 0.0f) {
                                        q9Var.f29690m = 0.0f;
                                    }
                                    f0Var.invalidate();
                                }
                            }
                        }
                        if (q9Var.f29693p) {
                            f7 = q9Var.f29690m;
                        } else {
                            f7 = 1.0f;
                        }
                        if (bitmapArr2 == null && q9Var.f29692o) {
                            paint2.setAlpha((int) (50.0f * f7));
                            canvas.drawPaint(paint2);
                            return;
                        }
                        if (f7 == 1.0f) {
                            canvas.save();
                            bitmapArr = bitmapArr2;
                            f10 = 0.0f;
                            r16 = 0;
                            r15 = 1;
                        } else {
                            bitmapArr = bitmapArr2;
                            f10 = 0.0f;
                            r16 = 0;
                            r15 = 1;
                            canvas.saveLayerAlpha(0.0f, 0.0f, f0Var.getMeasuredWidth(), f0Var.getMeasuredHeight(), (int) (f7 * 255.0f), 31);
                        }
                        if (bitmapArr != null) {
                            paint3.setAlpha((int) (f7 * 255.0f));
                            if (i12 == r15) {
                                canvas.translate(f10, q9Var.f29698u);
                            }
                            canvas.save();
                            canvas.scale(f0Var.getMeasuredWidth() / bitmapArr[r15].getWidth(), f0Var.getMeasuredHeight() / bitmapArr[r15].getHeight());
                            canvas.drawBitmap(bitmapArr[r15], f10, f10, paint3);
                            canvas.restore();
                            canvas.save();
                            if (i12 == 0) {
                                canvas.translate(f10, q9Var.f29698u);
                            }
                            canvas.scale(f0Var.getMeasuredWidth() / bitmapArr[r16].getWidth(), q9Var.f29696s / bitmapArr[r16].getHeight());
                            canvas.drawBitmap(bitmapArr[r16], f10, f10, paint3);
                            canvas.restore();
                            q9Var.f29697t = r15;
                            canvas.drawColor(436207616);
                        }
                        canvas.restore();
                        if (q9Var.f29691n && !q9Var.f29688k) {
                            if (q9Var.f29685g == null || q9Var.f29689l) {
                                q9Var.f29688k = r15;
                                q9Var.f29689l = r16;
                                if (q9Var.e == null) {
                                    q9Var.e = new Bitmap[2];
                                    q9Var.f29687j = new Canvas[2];
                                }
                                for (int i13 = 0; i13 < 2; i13++) {
                                    if (q9Var.e[i13] != null && f0Var.getMeasuredWidth() == q9Var.f29695r && f0Var.getMeasuredHeight() == q9Var.f29694q) {
                                        q9Var.e[i13].eraseColor(0);
                                    } else {
                                        int measuredHeight2 = f0Var.getMeasuredHeight();
                                        int measuredWidth2 = f0Var.getMeasuredWidth();
                                        int L2 = org.telegram.messenger.i0.L(200.0f) + org.telegram.messenger.i0.f16166m;
                                        q9Var.f29696s = L2;
                                        if (i13 == 0) {
                                            measuredHeight2 = L2;
                                        }
                                        try {
                                            q9Var.e[i13] = Bitmap.createBitmap((int) (measuredWidth2 / 15.0f), (int) (measuredHeight2 / 15.0f), Bitmap.Config.ARGB_8888);
                                            q9Var.f29687j[i13] = new Canvas(q9Var.e[i13]);
                                        } catch (Exception e) {
                                            f8.g(e, r15);
                                            org.telegram.messenger.i0.g3(new tf(q9Var, 12));
                                            return;
                                        }
                                    }
                                    if (i13 == r15) {
                                        q9Var.e[i13].eraseColor(t6.w0(t6.f20930d6, p6Var));
                                    }
                                    q9Var.f29687j[i13].save();
                                    q9Var.f29687j[i13].scale(0.06666667f, 0.06666667f, f10, f10);
                                    Drawable background = view.getBackground();
                                    if (background == null) {
                                        if (p6Var instanceof sn) {
                                            background = ((sn) p6Var).m();
                                        } else {
                                            background = t6.t0();
                                        }
                                    }
                                    view.setTag(67108867, Integer.valueOf(i13));
                                    if (i13 == 0) {
                                        q9Var.f29687j[i13].translate(f10, -q9Var.f29698u);
                                        view.draw(q9Var.f29687j[i13]);
                                    }
                                    if (background != null && i13 == r15) {
                                        Rect bounds = background.getBounds();
                                        background.setBounds(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
                                        background.draw(q9Var.f29687j[i13]);
                                        background.setBounds(bounds);
                                        view.draw(q9Var.f29687j[i13]);
                                    }
                                    view.setTag(67108867, null);
                                    q9Var.f29687j[i13].restore();
                                }
                                q9Var.f29694q = f0Var.getMeasuredHeight();
                                q9Var.f29695r = f0Var.getMeasuredWidth();
                                q9Var.v.f29386b = f0Var.getMeasuredWidth();
                                q9Var.v.f29387c = f0Var.getMeasuredHeight();
                                p9 p9Var = q9Var.v;
                                if (p9Var.f29386b != 0 && p9Var.f29387c != 0) {
                                    if (q9Var.f29681a == null) {
                                        q9Var.f29681a = new s5("blur_thread_" + q9Var, (boolean) r15);
                                    }
                                    q9Var.f29681a.postRunnable(q9Var.v);
                                    return;
                                }
                                q9Var.f29688k = false;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                Paint paint4 = (Paint) this.f11064b;
                oo ooVar = (oo) this.f11065c;
                ag.d2 d2Var2 = ooVar.e;
                if (d2Var2 != null && d2Var2.getImageReceiver().L()) {
                    paint4.setAlpha((int) (ooVar.e.getImageReceiver().f14385h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint4);
                    return;
                }
                return;
            case 6:
                Paint paint5 = (Paint) this.f11064b;
                g20 g20Var = (g20) this.f11065c;
                boolean z11 = g20Var.D;
                if (z11) {
                    float f15 = g20Var.E;
                    if (f15 != 1.0f) {
                        float f16 = f15 + 0.064f;
                        g20Var.E = f16;
                        if (f16 > 1.0f) {
                            g20Var.E = 1.0f;
                        }
                        invalidate();
                        paint5.setColor(i0.b.f(g20Var.E, 1711607061, 1714752530));
                        canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(25.0f), (org.telegram.messenger.i0.L(5.0f) * g20Var.E) + org.telegram.messenger.i0.L(35.0f), paint5);
                        return;
                    }
                }
                if (!z11) {
                    float f17 = g20Var.E;
                    if (f17 != 0.0f) {
                        float f18 = f17 - 0.064f;
                        g20Var.E = f18;
                        if (f18 < 0.0f) {
                            g20Var.E = 0.0f;
                        }
                        invalidate();
                    }
                }
                paint5.setColor(i0.b.f(g20Var.E, 1711607061, 1714752530));
                canvas.drawCircle(getMeasuredWidth() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.i0.L(25.0f), (org.telegram.messenger.i0.L(5.0f) * g20Var.E) + org.telegram.messenger.i0.L(35.0f), paint5);
                return;
            case 7:
                canvas.drawColor(855638016);
                j80 j80Var = (j80) this.f11065c;
                FrameLayout frameLayout = j80Var.f27305n;
                float[] fArr = j80Var.I;
                j80.a(frameLayout, (FrameLayout) this.f11064b, fArr);
                canvas.save();
                float y3 = frameLayout.getY() + ((View) frameLayout.getParent()).getY();
                if (y3 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr[1] - y3) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr[0], fArr[1]);
                frameLayout.draw(canvas);
                canvas.restore();
                return;
            case 9:
                Paint paint6 = (Paint) this.f11064b;
                ns nsVar = (ns) this.f11065c;
                g9 g9Var = nsVar.e;
                if (g9Var != null && g9Var.getImageReceiver().L()) {
                    paint6.setAlpha((int) (nsVar.e.getImageReceiver().f14385h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint6);
                    return;
                }
                return;
            case 10:
                canvas.drawColor(855638016);
                fz fzVar = (fz) this.f11065c;
                FrameLayout frameLayout2 = fzVar.f35860a;
                float[] fArr2 = fzVar.D;
                az.a(frameLayout2, (FrameLayout) this.f11064b, fArr2);
                canvas.save();
                float y10 = frameLayout2.getY() + ((View) frameLayout2.getParent()).getY();
                if (y10 < 1.0f) {
                    canvas.clipRect(0.0f, (fArr2[1] - y10) + 1.0f, getMeasuredWidth(), getMeasuredHeight());
                }
                canvas.translate(fArr2[0], fArr2[1]);
                frameLayout2.draw(canvas);
                canvas.restore();
                return;
            case 11:
                Paint paint7 = (Paint) this.f11064b;
                b60 b60Var = (b60) this.f11065c;
                if (b60Var.d != null && b60Var.f35957n.getVisibility() == 0 && b60Var.d.getImageReceiver().L()) {
                    paint7.setAlpha((int) (b60Var.f35957n.getAlpha() * b60Var.d.getImageReceiver().f14385h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint7);
                    return;
                }
                return;
            case 13:
                Paint paint8 = (Paint) this.f11064b;
                vd0 vd0Var = (vd0) this.f11065c;
                id idVar = vd0Var.f42498r;
                ag.d2 d2Var3 = vd0Var.e;
                if (d2Var3 != null && idVar.getVisibility() == 0) {
                    paint8.setAlpha((int) (idVar.getAlpha() * d2Var3.getImageReceiver().f14385h1 * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint8);
                    return;
                }
                return;
            case 14:
                if (!((g31) this.f11065c).Q0) {
                    dispatchDraw(canvas);
                    return;
                } else {
                    canvas.drawColor(t6.w0(t6.G8, (p6) this.f11064b));
                    return;
                }
            case 15:
                k91 k91Var = (k91) this.f11065c;
                int currentItem = k91Var.f38745k0.getCurrentItem();
                Paint paint9 = (Paint) this.f11064b;
                int i14 = t6.f21161pf;
                if (k91Var.d) {
                    themedColor = t6.F0(i14);
                } else {
                    themedColor = k91Var.getThemedColor(i14);
                }
                paint9.setColor(themedColor);
                for (int i15 = 0; i15 < 2; i15++) {
                    if (i15 == currentItem) {
                        i10 = 255;
                    } else {
                        i10 = 127;
                    }
                    paint9.setAlpha(i10);
                    canvas.drawCircle(org.telegram.messenger.i0.L((i15 * 15) + 3), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(3.0f), paint9);
                }
                return;
            case 16:
                Paint paint10 = (Paint) this.f11064b;
                paint10.setColor(t6.x0(null, t6.f20930d6, false));
                int measuredHeight3 = getMeasuredHeight() - org.telegram.messenger.i0.L(3.0f);
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight3, paint10);
                ((ActionBarLayout) rc1.x0((rc1) this.f11065c)).q(canvas, measuredHeight3);
                return;
            case 17:
                super.onDraw(canvas);
                int save = canvas.save();
                canvas.scale(getWidth() / 336.0f, getHeight() / 205.0f);
                c6 c6Var = ((g6) this.f11065c).f34560b;
                if (c6Var != null) {
                    c6Var.e(canvas, (float[]) this.f11064b);
                } else {
                    canvas.drawColor(v7.a(-16216082, (float[]) this.f11064b));
                }
                canvas.restoreToCount(save);
                return;
            case 18:
                Paint paint11 = (Paint) this.f11064b;
                paint11.setStrokeWidth(org.telegram.messenger.i0.N(1.66f));
                canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, org.telegram.messenger.i0.L(10.0f), paint11);
                kf0 kf0Var = (kf0) this.f11065c;
                kf0Var.setBounds(0, 0, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f));
                canvas.save();
                canvas.translate((getWidth() - org.telegram.messenger.i0.L(10.0f)) / 2.0f, (getHeight() - org.telegram.messenger.i0.L(10.0f)) / 2.0f);
                kf0Var.draw(canvas);
                canvas.restore();
                return;
            case 19:
                Paint paint12 = (Paint) this.f11064b;
                yh.l lVar = (yh.l) this.f11065c;
                g9 g9Var2 = lVar.f54510x;
                if (g9Var2 != null && g9Var2.getImageReceiver().L()) {
                    paint12.setColor(1426063360);
                    paint12.setAlpha((int) (lVar.f54510x.getImageReceiver().f14385h1 * 85.0f));
                    canvas.drawRoundRect(0.0f, 0.0f, getWidth(), getHeight(), org.telegram.messenger.i0.L(20.0f), org.telegram.messenger.i0.L(20.0f), paint12);
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f11063a) {
            case 18:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(56.0f), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f11063a) {
            case 4:
                super.onSizeChanged(i10, i11, i12, i13);
                q9 q9Var = (q9) this.f11064b;
                f0 f0Var = q9Var.d;
                if (q9Var.f29685g != null && f0Var.getMeasuredHeight() != 0 && f0Var.getMeasuredWidth() != 0) {
                    q9Var.a();
                    q9Var.f29694q = f0Var.getMeasuredHeight();
                    q9Var.f29695r = f0Var.getMeasuredWidth();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f11063a) {
            case 4:
                super.setAlpha(f7);
                View view = ((un) this.f11065c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 5:
            default:
                super.setAlpha(f7);
                return;
            case 6:
                super.setAlpha(f7);
                ((g20) this.f11065c).d.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setScaleX(float f7) {
        switch (this.f11063a) {
            case 6:
                super.setScaleX(f7);
                ((g20) this.f11065c).d.setScaleX(f7);
                return;
            default:
                super.setScaleX(f7);
                return;
        }
    }

    @Override
    public void setScaleY(float f7) {
        switch (this.f11063a) {
            case 6:
                super.setScaleY(f7);
                ((g20) this.f11065c).d.setScaleY(f7);
                return;
            default:
                super.setScaleY(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f11063a) {
            case 6:
                super.setTranslationY(f7);
                ((g20) this.f11065c).d.setTranslationY(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f11063a) {
            case 4:
                super.setVisibility(i10);
                View view = ((un) this.f11065c).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    @Override
    public void v(int i10, float f7, float f10, fe.f fVar) {
        int i11;
        if (f7 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        setVisibility(i11);
        setAlpha(f7);
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f11063a) {
            case 8:
                if (((org.telegram.ui.Cells.y) this.f11064b) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 18:
                if (drawable != ((kf0) this.f11065c) && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public f0(Context context, z4 z4Var) {
        super(context);
        this.f11063a = 12;
        this.f11065c = new fe.b(0, this, gr.h, 380L, true);
        this.f11064b = z4Var;
    }

    public f0(Activity activity) {
        super(activity);
        this.f11063a = 18;
        Paint paint = new Paint(1);
        this.f11064b = paint;
        kf0 kf0Var = new kf0(10);
        this.f11065c = kf0Var;
        paint.setColor(-1);
        paint.setShadowLayer(1.0f, 0.0f, 0.0f, 419430400);
        paint.setStyle(Paint.Style.STROKE);
        kf0Var.setCallback(this);
        kf0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
    }

    public f0(yh.l lVar, Context context) {
        super(context);
        this.f11063a = 19;
        this.f11065c = lVar;
        this.f11064b = new Paint(1);
    }

    public f0(g20 g20Var, Context context) {
        super(context);
        this.f11063a = 6;
        this.f11065c = g20Var;
        this.f11064b = new Paint(1);
    }

    public f0(Context context, Paint paint, Drawable drawable) {
        super(context);
        this.f11063a = 0;
        this.f11064b = paint;
        this.f11065c = drawable;
    }

    public f0(g6 g6Var, Context context) {
        super(context);
        this.f11063a = 17;
        this.f11065c = g6Var;
    }

    public f0(rc1 rc1Var, Context context) {
        super(context);
        this.f11063a = 16;
        this.f11065c = rc1Var;
        this.f11064b = new Paint();
    }

    public f0(Context context, k91 k91Var) {
        super(context);
        this.f11063a = 15;
        this.f11065c = k91Var;
        this.f11064b = new Paint(1);
    }

    public f0(un unVar, Context context) {
        super(context);
        this.f11063a = 3;
        this.f11065c = unVar;
        this.f11064b = new RectF();
    }

    public f0(un unVar, Context context, View view, p6 p6Var) {
        super(context);
        this.f11063a = 4;
        this.f11065c = unVar;
        q9 q9Var = new q9(view, this, p6Var);
        this.f11064b = q9Var;
        q9Var.f29693p = false;
        q9Var.f29691n = true;
    }

    @Override
    public void E(float f7, int i10) {
    }
}
