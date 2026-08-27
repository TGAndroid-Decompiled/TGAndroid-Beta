package ig;

import ag.k2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import jh.y2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.j51;
import org.telegram.ui.x41;
import org.telegram.ui.y51;

public final class c0 extends FrameLayout {

    public final Drawable f11248a;

    public final Rect f11249b;

    public final Paint f11250c;
    public final int[] d;

    public final HashMap f11251e;

    public float f11252f;
    public float h;

    public float f11253n;

    public float f11254r;

    public float f11255s;
    public final Path v;

    public final d0 f11256w;

    public c0(d0 d0Var, Context context) {
        super(context);
        this.f11256w = d0Var;
        Rect rect = new Rect();
        this.f11249b = rect;
        Paint paint = new Paint(1);
        this.f11250c = paint;
        this.d = new int[4];
        this.f11251e = new HashMap();
        this.f11252f = 0.0f;
        this.h = 0.0f;
        this.f11253n = 1.0f;
        this.f11254r = 0.0f;
        this.f11255s = 0.0f;
        this.v = new Path();
        Drawable drawableMutate = context.getDrawable(R.drawable.reactions_bubble_shadow).mutate();
        this.f11248a = drawableMutate;
        int iDp = AndroidUtilities.dp(7.0f);
        rect.bottom = iDp;
        rect.right = iDp;
        rect.top = iDp;
        rect.left = iDp;
        int i10 = g6.Td;
        c6 c6Var = d0Var.f11284s;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(g6.v0(i10, c6Var), PorterDuff.Mode.MULTIPLY));
        if (d0Var.f11289y == 2) {
            paint.setColor(i0.b.d(0.13f, -16777216, -1));
        } else {
            paint.setColor(g6.v0(g6.G8, c6Var));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        HashMap map;
        int i10;
        float f11;
        float f12;
        int i11;
        wj0 wj0Var;
        wj0 wj0Var2;
        int i12;
        float f13;
        y2 y2Var;
        RectF rectF;
        wj0 wj0Var3;
        RectF rectF2;
        RectF rectF3;
        float f14;
        float f15;
        float f16;
        float f17;
        float fLerp;
        y2 y2Var2;
        int[] iArr;
        y2 y2Var3;
        float y10;
        int i13;
        float fDp;
        float f18;
        float f19;
        float fDp2;
        float f20;
        float f21;
        float f22;
        float fDp3;
        q0 q0Var;
        float f23;
        Canvas canvas2 = canvas;
        d0 d0Var = this.f11256w;
        RectF rectF4 = d0Var.f11272f;
        int i14 = d0Var.f11289y;
        RectF rectF5 = d0Var.f11274i;
        z zVar = d0Var.f11278m;
        wj0 wj0Var4 = d0Var.f11279n;
        if (d0Var.f11277l) {
            float fClamp = Utilities.clamp(d0Var.f11275j, 1.0f, 0.0f);
            RectF rectF6 = AndroidUtilities.rectTmp;
            rectF6.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
            if (i14 == 4) {
                rectF4.set(wj0Var4.f34268w);
                rectF4.offset(d0Var.f11273g, d0Var.h);
            }
            AndroidUtilities.lerp(rectF4, rectF6, d0Var.f11275j, rectF5);
            float fLerp2 = AndroidUtilities.lerp(d0Var.f11271e, AndroidUtilities.dp(i14 == 5 ? 20.0f : 8.0f), d0Var.f11275j);
            HashMap map2 = this.f11251e;
            map2.clear();
            if (i14 == 1 || (wj0Var4.getDelegate() != null && wj0Var4.getDelegate().t())) {
                f10 = 1.0f;
                vj0 delegate = wj0Var4.getDelegate();
                float x8 = getX();
                c0 c0Var = d0Var.f11268a;
                map = map2;
                i10 = 4;
                f11 = 255.0f;
                delegate.r(canvas, rectF5, fLerp2, x8, i14 == 1 ? c0Var.getY() - AndroidUtilities.statusBarHeight : c0Var.getY() + d0Var.f11270c.getY(), 255, true);
                canvas2 = canvas;
            } else {
                int iClamp = (int) (Utilities.clamp(fClamp / 0.05f, 1.0f, 0.0f) * 255.0f);
                Drawable drawable = this.f11248a;
                drawable.setAlpha(iClamp);
                int i15 = (int) rectF5.left;
                Rect rect = this.f11249b;
                f10 = 1.0f;
                drawable.setBounds(i15 - rect.left, ((int) rectF5.top) - rect.top, ((int) rectF5.right) + rect.right, ((int) rectF5.bottom) + rect.bottom);
                lg.d dVar = d0Var.f11290z;
                Paint paint = this.f11250c;
                if (dVar != null) {
                    rectF6.set(rectF5);
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rectF6.round(rect2);
                    rect2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                    d0Var.f11290z.setBounds(rect2);
                    d0Var.f11290z.setAlpha(paint.getAlpha());
                    d0Var.f11290z.p(fLerp2);
                    d0Var.f11290z.draw(canvas2);
                } else {
                    drawable.draw(canvas2);
                    canvas2.drawRoundRect(rectF5, fLerp2, fLerp2, paint);
                }
                map = map2;
                i10 = 4;
                f11 = 255.0f;
            }
            if (wj0Var4.N0 != null) {
                canvas2.save();
                float f24 = rectF5.left;
                float y11 = wj0Var4.N0.getY() + rectF5.top;
                if (i14 != 3 && i14 != i10) {
                    if (i14 != 5) {
                        f23 = 0.0f;
                    }
                    canvas2.translate(f24, y11 - f23);
                    f12 = fLerp2;
                    i11 = 5;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, wj0Var4.N0.getMeasuredWidth(), wj0Var4.N0.getMeasuredHeight(), (int) ((f10 - d0Var.f11275j) * wj0Var4.N0.getAlpha() * f11), 31);
                    wj0Var4.N0.draw(canvas2);
                    canvas2.restore();
                    canvas2.restore();
                }
                f23 = wj0Var4.f34268w.top;
                canvas2.translate(f24, y11 - f23);
                f12 = fLerp2;
                i11 = 5;
                canvas2.saveLayerAlpha(0.0f, 0.0f, wj0Var4.N0.getMeasuredWidth(), wj0Var4.N0.getMeasuredHeight(), (int) ((f10 - d0Var.f11275j) * wj0Var4.N0.getAlpha() * f11), 31);
                wj0Var4.N0.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
            } else {
                f12 = fLerp2;
                i11 = 5;
            }
            float fWidth = (rectF5.width() - wj0Var4.f34268w.width()) + (rectF5.left - wj0Var4.f34268w.left);
            if (d0Var.f11275j > 0.05f || i14 == i11) {
                canvas2.save();
                canvas2.translate(fWidth, (rectF5.height() - wj0Var4.f34268w.height()) + (rectF5.top - wj0Var4.f34268w.top));
                float fMax = (Math.max(0.25f, Math.min(wj0Var4.v, 1.0f)) - 0.25f) / 0.75f;
                Canvas canvas3 = canvas2;
                wj0Var4.f(wj0Var4.A * fMax, fMax, wj0Var4.B * fMax, wj0Var4.I0 == i11 ? 255 : (int) y1.z(1.0f, wj0Var4.f34264s0, Utilities.clamp(wj0Var4.f34264s0 / 0.2f, 1.0f, 0.0f), 255.0f), canvas3);
                wj0Var = wj0Var4;
                canvas2 = canvas3;
                canvas2.restore();
            } else {
                wj0Var = wj0Var4;
            }
            if (i14 == 5) {
                Path path = this.v;
                path.rewind();
                path.addRoundRect(rectF5, f12, f12, Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(path);
            }
            this.f11252f = 0.0f;
            this.h = 0.0f;
            this.f11253n = 1.0f;
            this.f11254r = 0.0f;
            this.f11255s = 0.0f;
            if (wj0Var != null) {
                for (int childCount = zVar.f36392d0.getChildCount() - 1; childCount >= 0; childCount--) {
                    if (zVar.f36392d0.getChildAt(childCount) instanceof j51) {
                        j51 j51Var = (j51) zVar.f36392d0.getChildAt(childCount);
                        if (j51Var.f39266y && (q0Var = j51Var.f39265x) != null) {
                            map.put(q0Var, j51Var);
                        }
                    }
                }
                int iSave = canvas2.save();
                canvas2.translate(rectF5.left, com.google.android.recaptcha.internal.a.z(1.0f, d0Var.f11275j, wj0Var.g() + wj0Var.getTopOffset(), rectF5.top));
                float fMax2 = Math.max(1.0f - (zVar.f36395e0.getVisibility() == 0 ? zVar.f36395e0.getAlpha() : 0.0f), 1.0f - d0Var.f11275j);
                if (fMax2 != 1.0f) {
                    canvas2.saveLayerAlpha(0.0f, 0.0f, rectF5.width(), rectF5.height(), (int) (fMax2 * 255.0f), 31);
                }
                int x10 = (int) (zVar.f36392d0.getX() + zVar.getX());
                int y12 = (int) (zVar.f36392d0.getY() + zVar.getY());
                boolean z10 = zVar.W.getParent() != null;
                if (i14 != 5) {
                    float f25 = y12;
                    if (z10) {
                        f13 = 2.0f;
                        fDp3 = x10 + (AndroidUtilities.dp(36.0f) * d0Var.f11275j);
                    } else {
                        f13 = 2.0f;
                        fDp3 = 0.0f;
                    }
                    canvas2.clipRect(f25, fDp3, zVar.f36392d0.getMeasuredWidth() + y12, zVar.f36392d0.getMeasuredHeight() + x10);
                } else {
                    f13 = 2.0f;
                }
                int i16 = -1;
                int i17 = -1;
                while (i17 < wj0Var.f34236b.getChildCount()) {
                    View childAt = i17 == i16 ? wj0Var.f34267v0 : wj0Var.f34236b.getChildAt(i17);
                    if (childAt.getLeft() < 0 || childAt.getVisibility() == 8) {
                        i17 = i17;
                        rectF = rectF5;
                        wj0Var3 = wj0Var;
                        i14 = i14;
                        iSave = iSave;
                        map = map;
                        rectF2 = rectF4;
                    } else {
                        canvas2.save();
                        if (childAt instanceof uj0) {
                            uj0 uj0Var = (uj0) childAt;
                            tj0 tj0Var = uj0Var.f33099a;
                            tj0 tj0Var2 = uj0Var.f33100b;
                            k2 k2Var = uj0Var.f33103f;
                            if (k2Var != null) {
                                k2Var.setAlpha(1.0f - d0Var.f11275j);
                            }
                            j51 j51Var2 = (j51) map.get(uj0Var.f33102e);
                            if (j51Var2 != null) {
                                float x11 = childAt.getX();
                                float y13 = childAt.getY();
                                if (i17 == -1) {
                                    x11 -= wj0Var.f34236b.getX();
                                    y10 = y13 - wj0Var.f34236b.getY();
                                } else {
                                    y10 = y13;
                                }
                                float x12 = ((zVar.f36392d0.getX() + (zVar.getX() + j51Var2.getX())) - tj0Var2.getX()) - AndroidUtilities.dp(1.0f);
                                float y14 = (zVar.f36392d0.getY() + (zVar.f36390c0.getY() + (zVar.getY() + j51Var2.getY()))) - tj0Var2.getY();
                                float measuredWidth = j51Var2.getMeasuredWidth();
                                if (j51Var2.H) {
                                    i13 = 4;
                                } else {
                                    i13 = 4;
                                    if (i14 != 4) {
                                        f19 = x12;
                                    }
                                    float f26 = y14;
                                    float fLerp3 = AndroidUtilities.lerp(x11, f19, d0Var.f11275j);
                                    float f27 = x11;
                                    float fLerp4 = AndroidUtilities.lerp(y10, f26, d0Var.f11275j);
                                    float f28 = y10;
                                    float measuredWidth2 = measuredWidth / tj0Var2.getMeasuredWidth();
                                    fLerp = AndroidUtilities.lerp(1.0f, measuredWidth2, d0Var.f11275j);
                                    if (uj0Var.f33109y == 0) {
                                        fDp2 = AndroidUtilities.dp(6.0f);
                                        f21 = fDp2;
                                        f20 = 0.0f;
                                    } else {
                                        if (uj0Var.f33107w) {
                                            fDp2 = AndroidUtilities.dp(6.0f);
                                            f20 = fDp2;
                                            f21 = f20;
                                            f22 = f21;
                                        } else {
                                            fDp2 = 0.0f;
                                            f20 = 0.0f;
                                            f21 = 0.0f;
                                        }
                                        canvas2.translate(fLerp3, fLerp4);
                                        canvas2.scale(fLerp, fLerp);
                                        if (this.f11252f == 0.0f || this.h != 0.0f) {
                                            rectF3 = rectF4;
                                        } else {
                                            rectF3 = rectF4;
                                            this.f11252f = AndroidUtilities.lerp((rectF3.left + f27) - f19, 0.0f, d0Var.f11275j);
                                            this.h = AndroidUtilities.lerp((rectF3.top + f28) - f26, 0.0f, d0Var.f11275j);
                                            this.f11253n = AndroidUtilities.lerp(1.0f / measuredWidth2, 1.0f, d0Var.f11275j);
                                            this.f11254r = f19;
                                            this.f11255s = f26;
                                        }
                                        f15 = fDp2;
                                        f16 = f20;
                                        f14 = f21;
                                        f17 = f22;
                                    }
                                    f22 = 0.0f;
                                    canvas2.translate(fLerp3, fLerp4);
                                    canvas2.scale(fLerp, fLerp);
                                    if (this.f11252f == 0.0f) {
                                        rectF3 = rectF4;
                                    } else {
                                        rectF3 = rectF4;
                                    }
                                    f15 = fDp2;
                                    f16 = f20;
                                    f14 = f21;
                                    f17 = f22;
                                }
                                if (i14 == i13) {
                                    fDp = x12 - AndroidUtilities.dp(0.33f);
                                    y14 -= AndroidUtilities.dp(1.33f);
                                    f18 = 0.87f * measuredWidth;
                                } else {
                                    fDp = x12;
                                    f18 = measuredWidth;
                                }
                                float f29 = j51Var2.H ? 0.95f * f18 : f18;
                                float f30 = (measuredWidth - f29) / f13;
                                measuredWidth = f29;
                                f19 = fDp + f30;
                                y14 += f30;
                                float f210 = y14;
                                float fLerp5 = AndroidUtilities.lerp(x11, f19, d0Var.f11275j);
                                float f211 = x11;
                                float fLerp6 = AndroidUtilities.lerp(y10, f210, d0Var.f11275j);
                                float f212 = y10;
                                float measuredWidth3 = measuredWidth / tj0Var2.getMeasuredWidth();
                                fLerp = AndroidUtilities.lerp(1.0f, measuredWidth3, d0Var.f11275j);
                                if (uj0Var.f33109y == 0) {
                                    fDp2 = AndroidUtilities.dp(6.0f);
                                    f21 = fDp2;
                                    f20 = 0.0f;
                                } else {
                                    if (uj0Var.f33107w) {
                                        fDp2 = AndroidUtilities.dp(6.0f);
                                        f20 = fDp2;
                                        f21 = f20;
                                        f22 = f21;
                                    } else {
                                        fDp2 = 0.0f;
                                        f20 = 0.0f;
                                        f21 = 0.0f;
                                    }
                                    canvas2.translate(fLerp5, fLerp6);
                                    canvas2.scale(fLerp, fLerp);
                                    if (this.f11252f == 0.0f) {
                                        rectF3 = rectF4;
                                    } else {
                                        rectF3 = rectF4;
                                    }
                                    f15 = fDp2;
                                    f16 = f20;
                                    f14 = f21;
                                    f17 = f22;
                                }
                                f22 = 0.0f;
                                canvas2.translate(fLerp5, fLerp6);
                                canvas2.scale(fLerp, fLerp);
                                if (this.f11252f == 0.0f) {
                                    rectF3 = rectF4;
                                } else {
                                    rectF3 = rectF4;
                                }
                                f15 = fDp2;
                                f16 = f20;
                                f14 = f21;
                                f17 = f22;
                            } else {
                                rectF3 = rectF4;
                                canvas2.translate(tj0Var2.getX() + childAt.getX(), tj0Var2.getY() + childAt.getY());
                                f14 = 0.0f;
                                f15 = 0.0f;
                                f16 = 0.0f;
                                f17 = 0.0f;
                                fLerp = 1.0f;
                            }
                            if (j51Var2 != null) {
                                if (j51Var2.H) {
                                    float measuredWidth4 = uj0Var.getMeasuredWidth() / f13;
                                    float measuredHeight = uj0Var.getMeasuredHeight() / f13;
                                    float measuredWidth5 = uj0Var.getMeasuredWidth() - AndroidUtilities.dp(f13);
                                    float fLerp7 = AndroidUtilities.lerp(measuredWidth5, (j51Var2.getMeasuredWidth() - AndroidUtilities.dp(f13)) / fLerp, d0Var.f11275j);
                                    RectF rectF7 = AndroidUtilities.rectTmp;
                                    float f31 = fLerp7 / f13;
                                    rectF7.set(measuredWidth4 - f31, measuredHeight - f31, measuredWidth4 + f31, measuredHeight + f31);
                                    float fLerp8 = AndroidUtilities.lerp(measuredWidth5 / f13, AndroidUtilities.dp(4.0f), d0Var.f11275j);
                                    canvas2.drawRoundRect(rectF7, fLerp8, fLerp8, zVar.H);
                                }
                                uj0Var.f33108x = false;
                                if (f14 == 0.0f) {
                                    uj0Var.draw(canvas2);
                                } else {
                                    ImageReceiver imageReceiver = tj0Var2.getImageReceiver();
                                    uj0Var.b();
                                    k5 k5Var = tj0Var2.f30901e;
                                    if (k5Var != null && (y2Var3 = k5Var.f29961k) != null) {
                                        imageReceiver = y2Var3;
                                    }
                                    int[] roundRadius = imageReceiver.getRoundRadius();
                                    int i18 = 0;
                                    while (true) {
                                        iArr = this.d;
                                        if (i18 >= 4) {
                                            break;
                                        }
                                        iArr[i18] = roundRadius[i18];
                                        i18++;
                                    }
                                    imageReceiver.setRoundRadius((int) AndroidUtilities.lerp(f15, 0.0f, d0Var.f11275j), (int) AndroidUtilities.lerp(f16, 0.0f, d0Var.f11275j), (int) AndroidUtilities.lerp(f17, 0.0f, d0Var.f11275j), (int) AndroidUtilities.lerp(f14, 0.0f, d0Var.f11275j));
                                    uj0Var.draw(canvas2);
                                    imageReceiver.setRoundRadius(iArr);
                                }
                                uj0Var.f33108x = true;
                                if (!j51Var2.f39257b) {
                                    j51Var2.f39257b = true;
                                    j51Var2.invalidate();
                                }
                            } else {
                                wj0Var = wj0Var;
                                rectF3 = rectF3;
                                if (uj0Var.f33105r && tj0Var2.getImageReceiver().getLottieAnimation() == null) {
                                    float alpha = tj0Var.getImageReceiver().getAlpha();
                                    tj0Var.getImageReceiver().setAlpha((1.0f - fClamp) * alpha);
                                    tj0Var.draw(canvas2);
                                    tj0Var.getImageReceiver().setAlpha(alpha);
                                } else {
                                    uj0Var.b();
                                    ImageReceiver imageReceiver2 = tj0Var2.getImageReceiver();
                                    k5 k5Var2 = tj0Var2.f30901e;
                                    if (k5Var2 != null && (y2Var2 = k5Var2.f29961k) != null) {
                                        imageReceiver2 = y2Var2;
                                    }
                                    float alpha2 = imageReceiver2.getAlpha();
                                    imageReceiver2.setAlpha((1.0f - fClamp) * alpha2);
                                    tj0Var2.draw(canvas2);
                                    imageReceiver2.setAlpha(alpha2);
                                }
                            }
                            if (tj0Var2.getVisibility() != 0) {
                                invalidate();
                            }
                            wj0Var3 = wj0Var;
                            rectF = rectF5;
                            rectF2 = rectF3;
                        } else {
                            i17 = i17;
                            RectF rectF8 = rectF5;
                            i14 = i14;
                            iSave = iSave;
                            map = map;
                            wj0Var3 = wj0Var;
                            rectF2 = rectF4;
                            rectF = rectF8;
                            canvas2.translate((rectF8.width() + childAt.getX()) - wj0Var3.f34268w.width(), (childAt.getY() + rectF2.top) - rectF.top);
                            View view = childAt;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), (int) ((1.0f - fClamp) * 255.0f), 31);
                            float f32 = 1.0f - d0Var.f11275j;
                            canvas2.scale(f32, f32, view.getMeasuredWidth() >> 1, view.getMeasuredHeight() >> 1);
                            view.draw(canvas2);
                            canvas2.restore();
                        }
                        canvas2.restore();
                    }
                    i17++;
                    wj0Var = wj0Var3;
                    rectF4 = rectF2;
                    rectF5 = rectF;
                    map = map;
                    i14 = i14;
                    iSave = iSave;
                    i16 = -1;
                }
                wj0Var2 = wj0Var;
                i12 = i14;
                canvas2.restoreToCount(iSave);
            } else {
                wj0Var2 = wj0Var;
                i12 = i14;
                f13 = 2.0f;
            }
            super.dispatchDraw(canvas);
            int i19 = d0Var.F;
            if (i19 < 5) {
                if (i19 == 3) {
                    wj0Var2.setSkipDraw(true);
                }
                d0Var.F++;
            }
            Paint paint2 = zVar.T1;
            x41 x41Var = zVar.f36392d0;
            ImageReceiver imageReceiver3 = zVar.R0;
            if (zVar.O0 != null) {
                imageReceiver3.setParentView(this);
                j51 j51Var3 = zVar.O0;
                if (j51Var3 != null) {
                    float f33 = zVar.Q0;
                    if (f33 != 1.0f && !zVar.P0 && zVar.f36393d1) {
                        float f34 = f33 + 0.010666667f;
                        zVar.Q0 = f34;
                        if (f34 >= 1.0f) {
                            zVar.Q0 = 1.0f;
                            y51 y51Var = zVar.D;
                            if (y51Var != null) {
                                wj0 wj0Var5 = (wj0) ((k5.i) y51Var).f14480b;
                                if (j51Var3.f39263s) {
                                    wj0Var5.l(j51Var3, j51Var3.f39265x, true);
                                } else {
                                    long j10 = j51Var3.f39259e.documentId;
                                    q0 q0Var2 = new q0();
                                    q0Var2.f11413g = j10;
                                    q0Var2.h = j10;
                                    wj0Var5.l(j51Var3, q0Var2, true);
                                }
                            }
                        }
                        zVar.O0.C = zVar.Q0;
                    }
                    float f35 = (zVar.Q0 * f13) + 1.0f;
                    canvas2.save();
                    canvas2.translate(zVar.O0.getX() + x41Var.getX(), zVar.O0.getY() + x41Var.getY() + zVar.f36390c0.getY());
                    paint2.setColor(g6.v0(g6.G8, zVar.V0));
                    canvas2.drawRect(0.0f, 0.0f, zVar.O0.getMeasuredWidth(), zVar.O0.getMeasuredHeight(), paint2);
                    canvas2.scale(f35, f35, zVar.O0.getMeasuredWidth() / f13, zVar.O0.getMeasuredHeight());
                    j51 j51Var4 = zVar.O0;
                    if (!j51Var4.f39263s) {
                        imageReceiver3 = j51Var4.f39262r;
                    }
                    k5 k5Var3 = zVar.S0;
                    if (k5Var3 != null && (y2Var = k5Var3.f29961k) != null && y2Var.hasBitmapImage()) {
                        imageReceiver3 = zVar.S0.f29961k;
                    }
                    if (imageReceiver3 != null) {
                        imageReceiver3.setImageCoords(0.0f, 0.0f, zVar.O0.getMeasuredWidth(), zVar.O0.getMeasuredHeight());
                        imageReceiver3.draw(canvas2);
                    }
                    canvas2.restore();
                    invalidate();
                }
            }
            if (i12 == 5) {
                canvas2.restore();
            }
            if (d0Var.f11288x != null) {
                invalidate();
            }
            Runnable runnable = g0.f11304c;
            if (runnable != null) {
                runnable.run();
                g0.f11304c = null;
            }
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        d0 d0Var = this.f11256w;
        wj0 wj0Var = d0Var.f11279n;
        if (d0Var.f11289y == 1 || !(wj0Var == null || wj0Var.getDelegate() == null || !wj0Var.getDelegate().t())) {
            d0Var.f11278m.f36387b0.invalidate();
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int measuredWidth;
        int iDp;
        int iDp2;
        int iDp3;
        d0 d0Var = this.f11256w;
        int i12 = d0Var.f11289y;
        if (i12 == 1 || i12 == 2 || i12 == 4) {
            measuredWidth = d0Var.f11279n.getMeasuredWidth();
        } else if (i12 == 5) {
            measuredWidth = AndroidUtilities.dp(12.0f) + (AndroidUtilities.dp(36.0f) * 8);
        } else {
            measuredWidth = Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
            int iDp4 = (AndroidUtilities.dp(36.0f) * 8) + AndroidUtilities.dp(12.0f);
            if (iDp4 < measuredWidth) {
                measuredWidth = iDp4;
            }
        }
        if (d0Var.f11289y != 4) {
            if (d0Var.f11279n.B0) {
                int iCeil = (int) Math.ceil(d0Var.f11280o.size() / 8.0f);
                if (iCeil <= 8) {
                    iDp = AndroidUtilities.dp(8.0f) + (AndroidUtilities.dp(36.0f) * iCeil);
                } else {
                    iDp2 = AndroidUtilities.dp(36.0f) * 8;
                    iDp3 = AndroidUtilities.dp(8.0f);
                }
            } else {
                iDp = measuredWidth;
            }
            if (d0Var.f11289y == 5) {
                iDp = Math.min(AndroidUtilities.dp(254.0f), iDp);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
        }
        iDp2 = AndroidUtilities.dp(36.0f) * 8;
        iDp3 = AndroidUtilities.dp(8.0f);
        iDp = iDp2 - iDp3;
        if (d0Var.f11289y == 5) {
            iDp = Math.min(AndroidUtilities.dp(254.0f), iDp);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
    }
}
