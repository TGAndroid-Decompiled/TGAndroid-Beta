package ei;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.h20;
import org.telegram.ui.Components.i20;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.fz;
import org.telegram.ui.ie0;
import org.telegram.ui.jx;
import org.telegram.ui.so;
import org.telegram.ui.u70;
import org.telegram.ui.w10;
import org.telegram.ui.x70;
import org.telegram.ui.yo;
public final class e2 extends EditTextBoldCursor {
    public final int f8960b;
    public final Object f8961c;

    public e2(Object obj, Context context, int i10) {
        super(context);
        this.f8960b = i10;
        this.f8961c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f8960b) {
            case 6:
                ((xn0) this.f8961c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f8960b) {
            case 10:
                w10 w10Var = (w10) this.f8961c;
                if (length() == 0) {
                    super.onDraw(canvas);
                    return;
                }
                canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(12.0f) + getScrollX(), getHeight());
                w10Var.b(canvas, rectF, 0, 1.0f);
                rectF.set((getWidth() + getScrollX()) - AndroidUtilities.dp(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                w10Var.b(canvas, rectF, 2, 1.0f);
                canvas.restore();
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        float f7;
        switch (this.f8960b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((h2) this.f8961c).e);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                rd0 rd0Var = (rd0) this.f8961c;
                if (!z10 && !isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                rd0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f8960b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                yo yoVar = (yo) this.f8961c;
                so soVar = yoVar.f43907f;
                if (soVar != null && soVar.getTextView() != null && !TextUtils.isEmpty(yoVar.f43907f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(yoVar.f43907f.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb2);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.f8960b) {
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f8961c;
                if (i10 == 67 && u0Var.e.length() == 0 && ((u0Var.h.getVisibility() == 0 && u0Var.h.length() > 0) || u0Var.p())) {
                    if (u0Var.p()) {
                        hg.o0 o0Var = (hg.o0) i2.o1.i(1, u0Var.f21883g0);
                        org.telegram.ui.ActionBar.k5 k5Var = u0Var.H;
                        if (k5Var != null) {
                            k5Var.o(o0Var);
                        }
                        u0Var.C(o0Var);
                        return true;
                    }
                    u0Var.f21896s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                i20 i20Var = (i20) this.f8961c;
                if (i10 == 67 && i20Var.f27258r.length() == 0 && i20Var.d()) {
                    if (!i20Var.d()) {
                        return true;
                    }
                    hg.o0 o0Var2 = (hg.o0) i2.o1.i(1, i20Var.F);
                    h20 h20Var = i20Var.H;
                    if (h20Var != null) {
                        ((jx) h20Var).f(o0Var2);
                    }
                    i20Var.f(o0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                u70 u70Var = (u70) this.f8961c;
                x70 x70Var = u70Var.f42341f;
                if (i10 == 67 && u70Var.d.length() == 0 && !x70Var.G.isEmpty()) {
                    x70Var.f43490f.a((t30) i2.o1.i(1, x70Var.G));
                    x70Var.f43489c.e(!x70Var.G.isEmpty(), true);
                    x70Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f8960b) {
            case 2:
                super.onMeasure(i10, i11);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                return;
            case 3:
            default:
                super.onMeasure(i10, i11);
                return;
            case 4:
                super.onMeasure(i10, i11);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        switch (this.f8960b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((ie0) this.f8961c).f38275y = true;
                    postDelayed(new fz(this, 23), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f8960b) {
            case 0:
                e2 e2Var = ((h2) this.f8961c).e;
                if (!e2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    e2Var.requestFocus();
                    AndroidUtilities.showKeyboard(e2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                o9 o9Var = (o9) this.f8961c;
                t30 t30Var = o9Var.f9575f;
                if (t30Var != null) {
                    t30Var.a();
                    o9Var.f9575f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    o9Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 2:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return onTouchEvent;
            case 6:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((xn0) this.f8961c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f8961c;
                t30 t30Var2 = usersSelectActivity.P;
                if (t30Var2 != null) {
                    t30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                yg.h hVar = (yg.h) this.f8961c;
                t30 t30Var3 = hVar.f50598f;
                if (t30Var3 != null) {
                    t30Var3.a();
                    hVar.f50598f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    hVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public e2(Context context) {
        super(context);
        this.f8960b = 10;
        this.f8961c = new w10();
    }
}
