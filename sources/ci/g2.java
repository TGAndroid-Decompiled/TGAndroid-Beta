package ci;

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
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.g40;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.Components.v20;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.ay;
import org.telegram.ui.fp;
import org.telegram.ui.l20;
import org.telegram.ui.l80;
import org.telegram.ui.lp;
import org.telegram.ui.n80;
import org.telegram.ui.wz;
import org.telegram.ui.xe0;
public final class g2 extends EditTextBoldCursor {
    public final int f5113b;
    public final Object f5114c;

    public g2(Object obj, Context context, int i10) {
        super(context);
        this.f5113b = i10;
        this.f5114c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f5113b) {
            case 6:
                ((io0) this.f5114c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f5113b) {
            case 10:
                l20 l20Var = (l20) this.f5114c;
                if (length() == 0) {
                    super.onDraw(canvas);
                    return;
                }
                canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(12.0f) + getScrollX(), getHeight());
                l20Var.b(canvas, rectF, 0, 1.0f);
                rectF.set((getWidth() + getScrollX()) - AndroidUtilities.dp(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                l20Var.b(canvas, rectF, 2, 1.0f);
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
        switch (this.f5113b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((k2) this.f5114c).d);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                ce0 ce0Var = (ce0) this.f5114c;
                if (!z10 && !isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                ce0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f5113b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                lp lpVar = (lp) this.f5114c;
                fp fpVar = lpVar.f39809f;
                if (fpVar != null && fpVar.getTextView() != null && !TextUtils.isEmpty(lpVar.f39809f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(lpVar.f39809f.getTextView().getText());
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
        switch (this.f5113b) {
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f5114c;
                if (i10 == 67 && u0Var.f21315e.length() == 0 && ((u0Var.h.getVisibility() == 0 && u0Var.h.length() > 0) || u0Var.p())) {
                    if (u0Var.p()) {
                        gg.p0 p0Var = (gg.p0) hg.c.h(1, u0Var.f21319g0);
                        org.telegram.ui.ActionBar.e5 e5Var = u0Var.H;
                        if (e5Var != null) {
                            e5Var.o(p0Var);
                        }
                        u0Var.C(p0Var);
                        return true;
                    }
                    u0Var.f21332s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                v20 v20Var = (v20) this.f5114c;
                if (i10 == 67 && v20Var.f31362r.length() == 0 && v20Var.d()) {
                    if (!v20Var.d()) {
                        return true;
                    }
                    gg.p0 p0Var2 = (gg.p0) hg.c.h(1, v20Var.F);
                    u20 u20Var = v20Var.H;
                    if (u20Var != null) {
                        ((ay) u20Var).d(p0Var2);
                    }
                    v20Var.g(p0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                l80 l80Var = (l80) this.f5114c;
                n80 n80Var = l80Var.f39661f;
                if (i10 == 67 && l80Var.d.length() == 0 && !n80Var.G.isEmpty()) {
                    n80Var.f40322f.a((g40) hg.c.h(1, n80Var.G));
                    n80Var.f40320c.e(!n80Var.G.isEmpty(), true);
                    n80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5113b) {
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
        switch (this.f5113b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((xe0) this.f5114c).f43923y = true;
                    postDelayed(new wz(this, 22), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f5113b) {
            case 0:
                g2 g2Var = ((k2) this.f5114c).d;
                if (!g2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    g2Var.requestFocus();
                    AndroidUtilities.showKeyboard(g2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                ca caVar = (ca) this.f5114c;
                g40 g40Var = caVar.f4846e;
                if (g40Var != null) {
                    g40Var.a();
                    caVar.f4846e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    caVar.fullScroll(130);
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
                    ((io0) this.f5114c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f5114c;
                g40 g40Var2 = usersSelectActivity.P;
                if (g40Var2 != null) {
                    g40Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                xg.i iVar = (xg.i) this.f5114c;
                g40 g40Var3 = iVar.f51383f;
                if (g40Var3 != null) {
                    g40Var3.a();
                    iVar.f51383f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    iVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    public g2(Context context) {
        super(context);
        this.f5113b = 10;
        this.f5114c = new l20();
    }
}
