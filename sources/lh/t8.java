package lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.zk0;

public final class t8 extends FrameLayout {

    public final int f16872a = 2;

    public Object f16873b;

    public float f16874c;
    public Path d;

    public Object f16875e;

    public t8(Context context) {
        super(context);
    }

    public void a(float f10, float f11) {
        float[] fArr = (float[]) this.f16875e;
        fArr[7] = f10;
        fArr[6] = f10;
        fArr[1] = f10;
        fArr[0] = f10;
        fArr[5] = f11;
        fArr[4] = f11;
        fArr[3] = f11;
        fArr[2] = f11;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        View[] viewArr;
        float y10;
        float paddingTop;
        switch (this.f16872a) {
            case 0:
                Path path = this.d;
                q9 q9Var = (q9) this.f16875e;
                View[] viewPages = q9Var.f16593b.getViewPages();
                float f10 = 0.0f;
                this.f16874c = 0.0f;
                int i10 = 0;
                while (i10 < viewPages.length) {
                    View view = viewPages[i10];
                    if (view == null) {
                        viewArr = viewPages;
                    } else {
                        k9 k9Var = (k9) view;
                        float fClamp = Utilities.clamp(1.0f - Math.abs(k9Var.getTranslationX() / k9Var.getMeasuredWidth()), 1.0f, f10);
                        float f11 = this.f16874c;
                        zk0 zk0Var = k9Var.f16253f;
                        FrameLayout frameLayout = k9Var.f16252e;
                        f2.k0 k0Var = k9Var.h;
                        float fMin = (k0Var.f5725t || k9Var.f16249a == 0) ? AndroidUtilities.displaySize.y : 0.0f;
                        int i11 = 0;
                        while (true) {
                            if (i11 < zk0Var.getChildCount()) {
                                View childAt = zk0Var.getChildAt(i11);
                                if (k0Var.f5725t) {
                                    float y11 = childAt.getY() + frameLayout.getPaddingTop();
                                    float alpha = childAt.getAlpha();
                                    if (y11 < fMin) {
                                        fMin = AndroidUtilities.lerp(fMin, y11, alpha);
                                    }
                                } else {
                                    if (k9Var.f16249a != 0) {
                                        if (childAt.getTag() instanceof Integer) {
                                            viewArr = viewPages;
                                            if (((Integer) childAt.getTag()).intValue() == 33) {
                                                paddingTop = childAt.getBottom() + frameLayout.getPaddingTop();
                                                y10 = childAt.getTranslationY();
                                            }
                                            fMin = y10 + paddingTop;
                                        } else {
                                            viewArr = viewPages;
                                        }
                                        if ((childAt.getTag() instanceof Integer) && ((Integer) childAt.getTag()).intValue() == 35) {
                                            paddingTop = frameLayout.getPaddingTop();
                                            y10 = childAt.getY();
                                            fMin = y10 + paddingTop;
                                        }
                                    } else if (!(childAt instanceof j9)) {
                                        viewArr = viewPages;
                                        fMin = Math.min(childAt.getY() + frameLayout.getPaddingTop(), fMin);
                                    }
                                    i11++;
                                    viewPages = viewArr;
                                }
                                viewArr = viewPages;
                                i11++;
                                viewPages = viewArr;
                            } else {
                                viewArr = viewPages;
                            }
                        }
                        this.f16874c = (fMin * fClamp) + f11;
                        if (((org.telegram.ui.ActionBar.e3) q9Var).keyboardVisible) {
                            int i12 = k9Var.f16249a;
                        }
                        if (k9Var.getVisibility() == 0) {
                            k9Var.j();
                        }
                    }
                    i10++;
                    viewPages = viewArr;
                    f10 = 0.0f;
                }
                float fD = ((org.telegram.ui.Components.y5) this.f16873b).d(this.f16874c <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.f16874c = Math.max(AndroidUtilities.statusBarHeight, this.f16874c) - (AndroidUtilities.statusBarHeight * fD);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(((org.telegram.ui.ActionBar.e3) q9Var).backgroundPaddingLeft, this.f16874c, getWidth() - ((org.telegram.ui.ActionBar.e3) q9Var).backgroundPaddingLeft, AndroidUtilities.dp(8.0f) + getHeight());
                float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, fD);
                canvas.drawRoundRect(rectF, fLerp, fLerp, q9Var.N);
                canvas.save();
                path.rewind();
                path.addRoundRect(rectF, fLerp, fLerp, Path.Direction.CW);
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            case 1:
                Path path2 = this.d;
                oh.j0 j0Var = (oh.j0) this.f16875e;
                View[] viewPages2 = j0Var.d.getViewPages();
                this.f16874c = 0.0f;
                for (View view2 : viewPages2) {
                    if (view2 != null) {
                        oh.g0 g0Var = (oh.g0) view2;
                        this.f16874c = (g0Var.b() * Utilities.clamp(1.0f - Math.abs(g0Var.getTranslationX() / g0Var.getMeasuredWidth()), 1.0f, 0.0f)) + this.f16874c;
                        if (g0Var.getVisibility() == 0) {
                            g0Var.c();
                        }
                    }
                }
                float fD2 = ((org.telegram.ui.Components.y5) this.f16873b).d(this.f16874c <= ((float) AndroidUtilities.statusBarHeight) ? 1.0f : 0.0f, false);
                this.f16874c = (Math.max(AndroidUtilities.statusBarHeight, this.f16874c) - (AndroidUtilities.statusBarHeight * fD2)) - (AndroidUtilities.dp(10.0f) * Math.max(j0Var.f19498b.f48497e, j0Var.f19499c.f48497e));
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(((org.telegram.ui.ActionBar.e3) j0Var).backgroundPaddingLeft, this.f16874c, getWidth() - ((org.telegram.ui.ActionBar.e3) j0Var).backgroundPaddingLeft, AndroidUtilities.dp(8.0f) + getHeight());
                float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), 0, fD2);
                canvas.drawRoundRect(rectF2, fLerp2, fLerp2, j0Var.L);
                canvas.save();
                path2.rewind();
                path2.addRoundRect(rectF2, fLerp2, fLerp2, Path.Direction.CW);
                canvas.clipPath(path2);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f16872a) {
            case 0:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.f16874c) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                ((q9) this.f16875e).dismiss();
                return true;
            case 1:
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= this.f16874c) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                ((oh.j0) this.f16875e).dismiss();
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f16872a) {
            case 2:
                super.onDraw(canvas);
                float measuredWidth = getMeasuredWidth() / 2.0f;
                Path path = this.d;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, measuredWidth - AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.f16874c), getMeasuredHeight());
                a(AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.f16874c));
                float[] fArr = (float[]) this.f16875e;
                Path.Direction direction = Path.Direction.CW;
                path.addRoundRect(rectF, fArr, direction);
                Paint paint = (Paint) this.f16873b;
                canvas.drawPath(path, paint);
                path.rewind();
                rectF.set(measuredWidth + AndroidUtilities.lerp(0, AndroidUtilities.dp(4.0f), this.f16874c), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                a(AndroidUtilities.lerp(0, AndroidUtilities.dp(8.0f), this.f16874c), AndroidUtilities.dp(8.0f));
                path.addRoundRect(rectF, fArr, direction);
                canvas.drawPath(path, paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f16872a) {
            case 0:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                break;
            case 1:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    public t8(oh.j0 j0Var, Context context) {
        super(context);
        this.f16875e = j0Var;
        this.f16873b = new org.telegram.ui.Components.y5(this, 250L, er.h);
        this.d = new Path();
    }

    public t8(q9 q9Var, Context context) {
        super(context);
        this.f16875e = q9Var;
        this.f16873b = new org.telegram.ui.Components.y5(this, 250L, er.h);
        this.d = new Path();
    }
}
