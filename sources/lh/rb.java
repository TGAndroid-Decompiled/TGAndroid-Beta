package lh;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.TextureView;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zu0;

public final class rb extends zu0 {
    public final sb A0;

    public final n1.d f16680s0;

    public final ScaleGestureDetector f16681t0;

    public boolean f16682u0;

    public boolean f16683v0;

    public boolean f16684w0;

    public float f16685x0;

    public float f16686y0;

    public float f16687z0;

    public rb(sb sbVar, Activity activity) {
        super(activity, null);
        this.A0 = sbVar;
        this.f16684w0 = false;
        this.f16680s0 = new n1.d(activity, new pb(this));
        this.f16681t0 = new ScaleGestureDetector(activity, new qb(this));
    }

    public final void Z(Bitmap bitmap, float f10) {
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(-16777216);
        float width = bitmap.getWidth();
        sb sbVar = this.A0;
        float width2 = width / sbVar.f16783n.getWidth();
        canvas.scale(width2, width2);
        TextureView textureView = sbVar.T0.getTextureView();
        if (textureView == null) {
            textureView = sbVar.T0.f16580r;
        }
        if (textureView != null) {
            canvas.save();
            canvas.translate(sbVar.f16753d0.getX() + sbVar.f16796r.getX(), sbVar.f16753d0.getY() + sbVar.f16796r.getY());
            try {
                Bitmap bitmap2 = textureView.getBitmap((int) (textureView.getWidth() / f10), (int) (textureView.getHeight() / f10));
                float f11 = 1.0f / width2;
                canvas.scale(f11, f11);
                canvas.drawBitmap(bitmap2, 0.0f, 0.0f, new Paint(2));
                bitmap2.recycle();
            } catch (Exception unused) {
            }
            canvas.restore();
        }
        canvas.save();
        canvas.translate(sbVar.f16796r.getX(), sbVar.f16796r.getY());
        for (int i10 = 0; i10 < sbVar.f16796r.getChildCount(); i10++) {
            View childAt = sbVar.f16796r.getChildAt(i10);
            canvas.save();
            canvas.translate(childAt.getX(), childAt.getY());
            if (childAt.getVisibility() == 0) {
                if (childAt == sbVar.f16753d0) {
                    for (int i11 = 0; i11 < sbVar.f16753d0.getChildCount(); i11++) {
                        View childAt2 = sbVar.f16753d0.getChildAt(i11);
                        if (childAt2 != sbVar.T0 && childAt2 != sbVar.f16818x0 && childAt2.getVisibility() == 0) {
                            canvas.save();
                            canvas.translate(childAt2.getX(), childAt2.getY());
                            childAt2.draw(canvas);
                            canvas.restore();
                        }
                    }
                } else {
                    childAt.draw(canvas);
                }
                canvas.restore();
            }
        }
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        boolean z10;
        boolean z11;
        ?? r11;
        va vaVar;
        float f10;
        float fClamp;
        nb nbVar;
        ImageReceiver imageReceiver;
        org.telegram.ui.Cells.a7 a7Var;
        zf.b2 b2Var;
        sb sbVar = this.A0;
        RectF rectF = sbVar.D;
        Path path = sbVar.f16743a0;
        RectF rectF2 = sbVar.Z;
        RectF rectF3 = sbVar.Y;
        Float f11 = sbVar.H;
        float fFloatValue = f11 != null ? f11.floatValue() : sbVar.G;
        if (sbVar.F == 0) {
            canvas.drawColor(i0.b.k(-16777216, (int) ((1.0f - fFloatValue) * sbVar.E * 255.0f)));
        }
        float fLerp = AndroidUtilities.lerp(sbVar.C, 0.0f, sbVar.E);
        if (sbVar.E != 1.0f) {
            int i10 = sbVar.F;
            if (i10 == 0) {
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                rectF2.offset(sbVar.f16796r.getTranslationX(), sbVar.f16796r.getTranslationY());
                AndroidUtilities.lerp(rectF, rectF2, sbVar.E, rectF3);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF3, fLerp, fLerp, Path.Direction.CW);
                canvas.clipPath(path);
                r11 = 0;
                canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (Utilities.clamp(sbVar.E * 3.0f, 1.0f, 0.0f) * 255.0f), 31);
                canvas.translate(rectF3.left, rectF3.top - (sbVar.f16796r.getTranslationY() * sbVar.E));
                float fMax = Math.max(rectF3.width() / getWidth(), rectF3.height() / getHeight());
                canvas.scale(fMax, fMax);
                z11 = true;
            } else {
                z10 = false;
                z10 = false;
                if (i10 == 1) {
                    sbVar.k();
                }
            }
            vaVar = sbVar.f16798r1;
            if (vaVar != null) {
                rb rbVar = vaVar.I1;
                float[] fArr = vaVar.f15968f2;
                if (vaVar.Z1) {
                    vaVar.Z1 = r11;
                    if (vaVar.V1 != null || (b2Var = vaVar.W1) == null) {
                        f10 = 1.0f;
                    } else {
                        fArr[r11] = b2Var.getMeasuredWidth() / 2.0f;
                        fArr[1] = vaVar.W1.getMeasuredHeight() / 2.0f;
                        vaVar.W1.getMatrix().mapPoints(fArr);
                        f10 = 1.0f;
                        float scaleX = fArr[1] - (vaVar.W1.getScaleX() * (vaVar.W1.getMeasuredHeight() / 2.0f));
                        float scaleX2 = (vaVar.W1.getScaleX() * (vaVar.W1.getMeasuredHeight() / 2.0f)) + fArr[1];
                        if (scaleX < AndroidUtilities.dp(120.0f) && scaleX2 > rbVar.getMeasuredHeight() - AndroidUtilities.dp(200.0f)) {
                            vaVar.V1.setTop((boolean) r11);
                            vaVar.V1.setTranslationY(AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(120.0f) - vaVar.V1.getMeasuredHeight()));
                        } else if (scaleX < AndroidUtilities.dp(120.0f)) {
                            vaVar.V1.setTop(true);
                            vaVar.V1.setTranslationY((vaVar.W1.getScaleX() * (vaVar.W1.getMeasuredHeight() / 2.0f)) + fArr[1]);
                        } else {
                            vaVar.V1.setTop((boolean) r11);
                            wj0 wj0Var = vaVar.V1;
                            wj0Var.setTranslationY((scaleX - wj0Var.getMeasuredHeight()) + AndroidUtilities.dp(16.0f));
                        }
                        if (fArr[r11] < vaVar.getMeasuredWidth() / 2.0f) {
                            vaVar.V1.setMirrorX(true);
                            float measuredWidth = ((vaVar.V1.getMeasuredWidth() / 2.0f) + vaVar.V1.getX()) - (fArr[r11] - (vaVar.W1.getMeasuredHeight() / 2.0f));
                            if (measuredWidth > 0.0f) {
                                wj0 wj0Var2 = vaVar.V1;
                                wj0Var2.setBubbleOffset(((wj0Var2.getMeasuredWidth() / 2.0f) - measuredWidth) / 2.0f);
                            }
                        } else {
                            float measuredWidth2 = ((vaVar.V1.getMeasuredWidth() / 2.0f) + vaVar.V1.getX()) - ((vaVar.W1.getMeasuredHeight() / 2.0f) + fArr[r11]);
                            if (measuredWidth2 < 0.0f) {
                                wj0 wj0Var3 = vaVar.V1;
                                wj0Var3.setBubbleOffset((-((wj0Var3.getMeasuredWidth() / 2.0f) + measuredWidth2)) / 2.0f);
                            }
                            vaVar.V1.setMirrorX(r11);
                        }
                        vaVar.V1.setTranslationX((rbVar.getMeasuredWidth() - vaVar.V1.getMeasuredWidth()) / 2.0f);
                    }
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 1.0f;
            }
            super.dispatchDraw(canvas);
            if (z11) {
                canvas.restore();
                canvas.restore();
                if (sbVar.B != null) {
                    fClamp = Utilities.clamp(f10 - (sbVar.E * 1.5f), 1.0f, 0.0f);
                    rectF3.centerX();
                    rectF3.centerY();
                    Math.min(rectF3.width(), rectF3.height());
                    nbVar = sbVar.B;
                    imageReceiver = nbVar.f16457e;
                    if (imageReceiver != null) {
                        imageReceiver.setImageCoords(rectF3);
                        int i11 = sbVar.B.f16457e.getRoundRadius()[r11];
                        sbVar.B.f16457e.setRoundRadius((int) fLerp);
                        sbVar.B.f16457e.setAlpha(fClamp);
                        sbVar.B.f16457e.draw(canvas);
                        sbVar.B.f16457e.setRoundRadius(i11);
                    } else {
                        a7Var = nbVar.d;
                        if (a7Var != null) {
                            a7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                            org.telegram.ui.Cells.a7 a7Var2 = sbVar.B.d;
                            a7Var2.d = (int) com.google.android.recaptcha.internal.a.C(fClamp, 255.0f, fClamp, fClamp);
                            a7Var2.draw(canvas);
                        }
                    }
                    sbVar.B.getClass();
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    sbVar.B.a(canvas, fClamp);
                    canvas.restore();
                }
            }
        }
        z10 = false;
        z11 = false;
        r11 = z10;
        vaVar = sbVar.f16798r1;
        if (vaVar != null) {
            rb rbVar2 = vaVar.I1;
            float[] fArr2 = vaVar.f15968f2;
            if (vaVar.Z1) {
                vaVar.Z1 = r11;
                if (vaVar.V1 != null) {
                    f10 = 1.0f;
                } else {
                    f10 = 1.0f;
                }
            } else {
                f10 = 1.0f;
            }
        } else {
            f10 = 1.0f;
        }
        super.dispatchDraw(canvas);
        if (z11) {
            canvas.restore();
            canvas.restore();
            if (sbVar.B != null) {
                fClamp = Utilities.clamp(f10 - (sbVar.E * 1.5f), 1.0f, 0.0f);
                rectF3.centerX();
                rectF3.centerY();
                Math.min(rectF3.width(), rectF3.height());
                nbVar = sbVar.B;
                imageReceiver = nbVar.f16457e;
                if (imageReceiver != null) {
                    imageReceiver.setImageCoords(rectF3);
                    int i12 = sbVar.B.f16457e.getRoundRadius()[r11];
                    sbVar.B.f16457e.setRoundRadius((int) fLerp);
                    sbVar.B.f16457e.setAlpha(fClamp);
                    sbVar.B.f16457e.draw(canvas);
                    sbVar.B.f16457e.setRoundRadius(i12);
                } else {
                    a7Var = nbVar.d;
                    if (a7Var != null) {
                        a7Var.setBounds((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
                        org.telegram.ui.Cells.a7 a7Var3 = sbVar.B.d;
                        a7Var3.d = (int) com.google.android.recaptcha.internal.a.C(fClamp, 255.0f, fClamp, fClamp);
                        a7Var3.draw(canvas);
                    }
                }
                sbVar.B.getClass();
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                sbVar.B.a(canvas, fClamp);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        if (keyEvent == null || keyEvent.getKeyCode() != 4 || keyEvent.getAction() != 1) {
            return super.dispatchKeyEventPreIme(keyEvent);
        }
        this.A0.M();
        return true;
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10 = false;
        this.f16682u0 = false;
        sb sbVar = this.A0;
        z zVar = sbVar.E0;
        if (zVar != null && zVar.f17137e) {
            float y10 = sbVar.E0.getY() + sbVar.f16757e0.getY() + sbVar.f16796r.getY();
            if ((motionEvent.getY() >= y10 && motionEvent.getY() <= y10 + sbVar.E0.getHeight()) || this.f16683v0) {
                if (motionEvent.getAction() != 1 && motionEvent.getAction() != 3) {
                    z10 = true;
                }
                this.f16683v0 = z10;
                return super.dispatchTouchEvent(motionEvent);
            }
            sbVar.E0.a(false, true);
            sbVar.m0(true);
        }
        if (this.f16683v0 && (motionEvent.getAction() == 1 || motionEvent.getAction() == 3)) {
            this.f16683v0 = false;
        }
        this.f16681t0.onTouchEvent(motionEvent);
        this.f16680s0.P(motionEvent);
        if (motionEvent.getAction() == 1 && !this.f16682u0) {
            if (sbVar.f16796r.getTranslationY() <= 0.0f) {
                sa saVar = sbVar.I0;
                if (saVar != null && saVar.getTranslationY() > 0.0f && !sbVar.H0) {
                    sbVar.f(!sbVar.M1 && sbVar.I0.getTranslationY() < ((float) sbVar.I0.getPadding()));
                }
            } else if (sbVar.G > 0.4f) {
                sbVar.q(true);
            } else {
                sb.c(sbVar);
            }
            sbVar.H0 = false;
            sbVar.S = false;
            sbVar.T = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public int getBottomPadding() {
        int height = getHeight();
        sb sbVar = this.A0;
        return (height - sbVar.f16796r.getBottom()) + sbVar.Q;
    }

    public int getBottomPadding2() {
        return getHeight() - this.A0.f16796r.getBottom();
    }

    @Override
    public int[] getColorKeys() {
        return null;
    }

    public int getPaddingUnderContainer() {
        int height = getHeight();
        sb sbVar = this.A0;
        return (height - sbVar.X) - sbVar.f16796r.getBottom();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        yy emojiView;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        sb sbVar = this.A0;
        int i15 = sbVar.V;
        int measuredHeight2 = sbVar.f16770i0.getMeasuredHeight();
        if (sbVar.R) {
            i15 = 0;
        }
        int i16 = sbVar.O;
        int iB = h7.n.b((measuredWidth - i16) / 2, sbVar.U, (measuredWidth - sbVar.W) - i16);
        int i17 = sbVar.O + iB;
        if (sbVar.R) {
            i14 = sbVar.P;
        } else {
            int i18 = sbVar.X;
            int i19 = sbVar.P;
            int i20 = (((((measuredHeight - i15) - i18) - i19) - measuredHeight2) / 2) + i15;
            if (sbVar.F == 1) {
                float f10 = sbVar.D.top;
                if (i19 + f10 + measuredHeight2 < measuredHeight - i18) {
                    i15 = (int) f10;
                } else if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                    i15 = i20;
                }
            } else if (i20 - i15 >= AndroidUtilities.dp(40.0f)) {
                i15 = i20;
            }
            i14 = sbVar.P;
        }
        sbVar.f16796r.layout(iB, i15, i17, i14 + i15 + measuredHeight2);
        sbVar.f16800s.f16627b.layout(0, 0, measuredWidth, measuredHeight);
        bb bbVar = sbVar.f16824y2;
        if (bbVar != null) {
            bbVar.layout(0, 0, measuredWidth, measuredHeight);
        }
        sa saVar = sbVar.I0;
        if (saVar != null) {
            saVar.layout((measuredWidth - saVar.getMeasuredWidth()) / 2, 0, (sbVar.I0.getMeasuredWidth() + measuredWidth) / 2, measuredHeight);
        }
        ib ibVar = sbVar.Y0;
        if (ibVar != null && (emojiView = ibVar.f16338f.getEmojiView()) != null) {
            emojiView.layout(sbVar.U, (measuredHeight - sbVar.X) - emojiView.getMeasuredHeight(), measuredWidth - sbVar.W, measuredHeight - sbVar.X);
        }
        va vaVar = sbVar.f16798r1;
        if (vaVar != null) {
            yy yyVar = vaVar.f15979l2;
            if (yyVar != null) {
                yyVar.layout(sbVar.U, (measuredHeight - sbVar.X) - yyVar.getMeasuredHeight(), measuredWidth - sbVar.W, measuredHeight - sbVar.X);
            }
            wj0 wj0Var = sbVar.f16798r1.V1;
            if (wj0Var != null) {
                int i21 = sbVar.U;
                wj0Var.layout(i21, sbVar.V, wj0Var.getMeasuredWidth() + i21, sbVar.f16798r1.V1.getMeasuredHeight() + sbVar.V);
                ag.y1 y1Var = sbVar.f16798r1.V1.getReactionsWindow() != null ? sbVar.f16798r1.V1.getReactionsWindow().f11270c : null;
                if (y1Var != null) {
                    int i22 = sbVar.U;
                    y1Var.layout(i22, sbVar.V, y1Var.getMeasuredWidth() + i22, y1Var.getMeasuredHeight() + sbVar.V);
                }
            }
        }
        db dbVar = sbVar.f16785n1;
        if (dbVar != null) {
            dbVar.f16152e.setPadding(0, sbVar.V, 0, sbVar.X);
            sbVar.f16785n1.layout(0, 0, measuredWidth, measuredHeight);
            sbVar.f16785n1.d.layout(0, 0, measuredWidth, measuredHeight);
        }
        eb ebVar = sbVar.f16788o1;
        if (ebVar != null) {
            ebVar.f16369f.setPadding(0, sbVar.V, 0, sbVar.X);
            sbVar.f16788o1.layout(0, 0, measuredWidth, measuredHeight);
            sbVar.f16788o1.f16368e.layout(0, 0, measuredWidth, measuredHeight);
        }
        for (int i23 = 0; i23 < getChildCount(); i23++) {
            View childAt = getChildAt(i23);
            if (childAt instanceof t0) {
                childAt.layout(0, 0, measuredWidth, measuredHeight);
            } else if (childAt instanceof org.telegram.ui.Components.xa) {
                childAt.layout(0, i15, childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + i15);
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        sb sbVar = this.A0;
        int i12 = (size - sbVar.U) - sbVar.W;
        int i13 = sbVar.V;
        int i14 = sbVar.X;
        int iCeil = (int) Math.ceil((i12 / 9.0f) * 16.0f);
        int iDp = AndroidUtilities.dp(48.0f);
        sbVar.Q = iDp;
        int i15 = iCeil + iDp;
        int i16 = size2 - i14;
        if (i15 <= i16) {
            sbVar.O = i12;
            sbVar.P = iCeil;
            sbVar.R = i15 > i16 - i13;
        } else {
            sbVar.R = false;
            int i17 = ((size2 - iDp) - i14) - i13;
            sbVar.P = i17;
            sbVar.O = (int) Math.ceil((i17 * 9.0f) / 16.0f);
        }
        sbVar.Q = Utilities.clamp((size2 - sbVar.P) - (sbVar.R ? 0 : i13), AndroidUtilities.dp(68.0f), AndroidUtilities.dp(48.0f));
        int systemUiVisibility = getSystemUiVisibility();
        setSystemUiVisibility(sbVar.R ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        sbVar.f16796r.measure(View.MeasureSpec.makeMeasureSpec(sbVar.O, 1073741824), View.MeasureSpec.makeMeasureSpec(sbVar.P + sbVar.Q, 1073741824));
        sbVar.f16800s.f16627b.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        bb bbVar = sbVar.f16824y2;
        if (bbVar != null) {
            bbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        sa saVar = sbVar.I0;
        if (saVar != null) {
            saVar.measure(View.MeasureSpec.makeMeasureSpec(sbVar.O, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        ib ibVar = sbVar.Y0;
        if (ibVar != null) {
            yy emojiView = ibVar.f16338f.getEmojiView();
            R();
            AndroidUtilities.dp(20.0f);
            if (emojiView != null) {
                emojiView.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(emojiView.getLayoutParams().height, 1073741824));
            }
        }
        va vaVar = sbVar.f16798r1;
        if (vaVar != null) {
            yy yyVar = vaVar.f15979l2;
            if (yyVar != null) {
                yyVar.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(sbVar.f16798r1.f15979l2.getLayoutParams().height, 1073741824));
            }
            wj0 wj0Var = sbVar.f16798r1.V1;
            if (wj0Var != null) {
                measureChild(wj0Var, i10, i11);
                if (sbVar.f16798r1.V1.getReactionsWindow() != null) {
                    measureChild(sbVar.f16798r1.V1.getReactionsWindow().f11270c, i10, i11);
                }
            }
        }
        for (int i18 = 0; i18 < getChildCount(); i18++) {
            View childAt = getChildAt(i18);
            if (childAt instanceof t0) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof org.telegram.ui.Components.xa) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(340.0f), size2 - (sbVar.R ? 0 : i13)), 1073741824));
            }
        }
        db dbVar = sbVar.f16785n1;
        if (dbVar != null) {
            dbVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            sbVar.f16785n1.d.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        eb ebVar = sbVar.f16788o1;
        if (ebVar != null) {
            ebVar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            sbVar.f16788o1.f16368e.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
        }
        setMeasuredDimension(size, size2);
    }
}
