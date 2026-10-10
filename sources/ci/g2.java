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
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.s20;
import org.telegram.ui.Components.t20;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.cp;
import org.telegram.ui.ip;
import org.telegram.ui.j20;
import org.telegram.ui.j80;
import org.telegram.ui.l80;
import org.telegram.ui.uz;
import org.telegram.ui.we0;
import org.telegram.ui.yx;
public final class g2 extends EditTextBoldCursor {
    public final int f5115b;
    public final Object f5116c;

    public g2(Object obj, Context context, int i10) {
        super(context);
        this.f5115b = i10;
        this.f5116c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f5115b) {
            case 6:
                ((do0) this.f5116c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f5115b) {
            case 10:
                j20 j20Var = (j20) this.f5116c;
                if (length() == 0) {
                    super.onDraw(canvas);
                    return;
                }
                canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(12.0f) + getScrollX(), getHeight());
                j20Var.b(canvas, rectF, 0, 1.0f);
                rectF.set((getWidth() + getScrollX()) - AndroidUtilities.dp(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                j20Var.b(canvas, rectF, 2, 1.0f);
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
        switch (this.f5115b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((k2) this.f5116c).d);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                zd0 zd0Var = (zd0) this.f5116c;
                if (!z10 && !isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                zd0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f5115b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                ip ipVar = (ip) this.f5116c;
                cp cpVar = ipVar.f38761f;
                if (cpVar != null && cpVar.getTextView() != null && !TextUtils.isEmpty(ipVar.f38761f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(ipVar.f38761f.getTextView().getText());
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
        switch (this.f5115b) {
            case 2:
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.f5116c;
                if (i10 == 67 && v0Var.f21588e.length() == 0 && ((v0Var.h.getVisibility() == 0 && v0Var.h.length() > 0) || v0Var.p())) {
                    if (v0Var.p()) {
                        gg.p0 p0Var = (gg.p0) hg.c.g(1, v0Var.f21592g0);
                        org.telegram.ui.ActionBar.g5 g5Var = v0Var.H;
                        if (g5Var != null) {
                            g5Var.o(p0Var);
                        }
                        v0Var.C(p0Var);
                        return true;
                    }
                    v0Var.f21605s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                t20 t20Var = (t20) this.f5116c;
                if (i10 == 67 && t20Var.f30958r.length() == 0 && t20Var.d()) {
                    if (!t20Var.d()) {
                        return true;
                    }
                    gg.p0 p0Var2 = (gg.p0) hg.c.g(1, t20Var.F);
                    s20 s20Var = t20Var.H;
                    if (s20Var != null) {
                        ((yx) s20Var).d(p0Var2);
                    }
                    t20Var.g(p0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                j80 j80Var = (j80) this.f5116c;
                l80 l80Var = j80Var.f38905f;
                if (i10 == 67 && j80Var.d.length() == 0 && !l80Var.G.isEmpty()) {
                    l80Var.f39510f.a((e40) hg.c.g(1, l80Var.G));
                    l80Var.f39508c.e(!l80Var.G.isEmpty(), true);
                    l80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f5115b) {
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
        switch (this.f5115b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((we0) this.f5116c).f43254y = true;
                    postDelayed(new uz(this, 22), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f5115b) {
            case 0:
                g2 g2Var = ((k2) this.f5116c).d;
                if (!g2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    g2Var.requestFocus();
                    AndroidUtilities.showKeyboard(g2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                ca caVar = (ca) this.f5116c;
                e40 e40Var = caVar.f4848e;
                if (e40Var != null) {
                    e40Var.a();
                    caVar.f4848e = null;
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
                    ((do0) this.f5116c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f5116c;
                e40 e40Var2 = usersSelectActivity.P;
                if (e40Var2 != null) {
                    e40Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                xg.i iVar = (xg.i) this.f5116c;
                e40 e40Var3 = iVar.f51191f;
                if (e40Var3 != null) {
                    e40Var3.a();
                    iVar.f51191f = null;
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
        this.f5115b = 10;
        this.f5116c = new j20();
    }
}
