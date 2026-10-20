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
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.rd0;
import org.telegram.ui.Components.v30;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.de0;
import org.telegram.ui.dz;
import org.telegram.ui.hx;
import org.telegram.ui.p70;
import org.telegram.ui.qo;
import org.telegram.ui.r70;
import org.telegram.ui.s10;
import org.telegram.ui.wo;
public final class e2 extends EditTextBoldCursor {
    public final int f8949b;
    public final Object f8950c;

    public e2(Object obj, Context context, int i10) {
        super(context);
        this.f8949b = i10;
        this.f8950c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f8949b) {
            case 6:
                ((vn0) this.f8950c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f8949b) {
            case 10:
                s10 s10Var = (s10) this.f8950c;
                if (length() == 0) {
                    super.onDraw(canvas);
                    return;
                }
                canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(12.0f) + getScrollX(), getHeight());
                s10Var.b(canvas, rectF, 0, 1.0f);
                rectF.set((getWidth() + getScrollX()) - AndroidUtilities.dp(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                s10Var.b(canvas, rectF, 2, 1.0f);
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
        switch (this.f8949b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((h2) this.f8950c).d);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                rd0 rd0Var = (rd0) this.f8950c;
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
        switch (this.f8949b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                wo woVar = (wo) this.f8950c;
                qo qoVar = woVar.f42914f;
                if (qoVar != null && qoVar.getTextView() != null && !TextUtils.isEmpty(woVar.f42914f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(woVar.f42914f.getTextView().getText());
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
        switch (this.f8949b) {
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f8950c;
                if (i10 == 67 && u0Var.e.length() == 0 && ((u0Var.h.getVisibility() == 0 && u0Var.h.length() > 0) || u0Var.p())) {
                    if (u0Var.p()) {
                        hg.o0 o0Var = (hg.o0) i2.e.h(1, u0Var.f21740g0);
                        org.telegram.ui.ActionBar.g5 g5Var = u0Var.H;
                        if (g5Var != null) {
                            g5Var.o(o0Var);
                        }
                        u0Var.C(o0Var);
                        return true;
                    }
                    u0Var.f21753s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                k20 k20Var = (k20) this.f8950c;
                if (i10 == 67 && k20Var.f27726r.length() == 0 && k20Var.e()) {
                    if (!k20Var.e()) {
                        return true;
                    }
                    hg.o0 o0Var2 = (hg.o0) i2.e.h(1, k20Var.F);
                    j20 j20Var = k20Var.H;
                    if (j20Var != null) {
                        ((hx) j20Var).g(o0Var2);
                    }
                    k20Var.g(o0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                p70 p70Var = (p70) this.f8950c;
                r70 r70Var = p70Var.f40086f;
                if (i10 == 67 && p70Var.d.length() == 0 && !r70Var.G.isEmpty()) {
                    r70Var.f41077f.a((v30) i2.e.h(1, r70Var.G));
                    r70Var.f41076c.e(!r70Var.G.isEmpty(), true);
                    r70Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f8949b) {
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
        switch (this.f8949b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((de0) this.f8950c).f36353y = true;
                    postDelayed(new dz(this, 22), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f8949b) {
            case 0:
                e2 e2Var = ((h2) this.f8950c).d;
                if (!e2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    e2Var.requestFocus();
                    AndroidUtilities.showKeyboard(e2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                o9 o9Var = (o9) this.f8950c;
                v30 v30Var = o9Var.e;
                if (v30Var != null) {
                    v30Var.a();
                    o9Var.e = null;
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
                    ((vn0) this.f8950c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f8950c;
                v30 v30Var2 = usersSelectActivity.P;
                if (v30Var2 != null) {
                    v30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                yg.h hVar = (yg.h) this.f8950c;
                v30 v30Var3 = hVar.f50156f;
                if (v30Var3 != null) {
                    v30Var3.a();
                    hVar.f50156f = null;
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
        this.f8949b = 10;
        this.f8950c = new s10();
    }
}
