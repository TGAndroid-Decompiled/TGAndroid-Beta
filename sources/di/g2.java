package di;

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
import org.telegram.ui.Components.n20;
import org.telegram.ui.Components.o20;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.yn0;
import org.telegram.ui.Components.z30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.bf0;
import org.telegram.ui.ey;
import org.telegram.ui.hp;
import org.telegram.ui.n80;
import org.telegram.ui.np;
import org.telegram.ui.p20;
import org.telegram.ui.p80;
import org.telegram.ui.zz;
public final class g2 extends EditTextBoldCursor {
    public final int f6969b;
    public final Object f6970c;

    public g2(Object obj, Context context, int i10) {
        super(context);
        this.f6969b = i10;
        this.f6970c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f6969b) {
            case 6:
                ((yn0) this.f6970c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f6969b) {
            case 10:
                p20 p20Var = (p20) this.f6970c;
                if (length() == 0) {
                    super.onDraw(canvas);
                    return;
                }
                canvas.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
                super.onDraw(canvas);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(12.0f) + getScrollX(), getHeight());
                p20Var.b(canvas, rectF, 0, 1.0f);
                rectF.set((getWidth() + getScrollX()) - AndroidUtilities.dp(12.0f), 0.0f, getWidth() + getScrollX(), getHeight());
                p20Var.b(canvas, rectF, 2, 1.0f);
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
        switch (this.f6969b) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                if (!z10) {
                    AndroidUtilities.hideKeyboard(((k2) this.f6970c).d);
                    return;
                }
                return;
            case 5:
                super.onFocusChanged(z10, i10, rect);
                xd0 xd0Var = (xd0) this.f6970c;
                if (!z10 && !isFocused()) {
                    f7 = 0.0f;
                } else {
                    f7 = 1.0f;
                }
                xd0Var.b(f7, f7, true);
                return;
            default:
                super.onFocusChanged(z10, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f6969b) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) getText());
                np npVar = (np) this.f6970c;
                hp hpVar = npVar.f38440f;
                if (hpVar != null && hpVar.getTextView() != null && !TextUtils.isEmpty(npVar.f38440f.getTextView().getText())) {
                    sb2.append("\n");
                    sb2.append(npVar.f38440f.getTextView().getText());
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
        switch (this.f6969b) {
            case 2:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.f6970c;
                if (i10 == 67 && u0Var.e.length() == 0 && ((u0Var.h.getVisibility() == 0 && u0Var.h.length() > 0) || u0Var.p())) {
                    if (u0Var.p()) {
                        hg.p0 p0Var = (hg.p0) i2.d.h(1, u0Var.f20383g0);
                        org.telegram.ui.ActionBar.e5 e5Var = u0Var.H;
                        if (e5Var != null) {
                            e5Var.o(p0Var);
                        }
                        u0Var.C(p0Var);
                        return true;
                    }
                    u0Var.f20396s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 4:
                o20 o20Var = (o20) this.f6970c;
                if (i10 == 67 && o20Var.f27510r.length() == 0 && o20Var.e()) {
                    if (!o20Var.e()) {
                        return true;
                    }
                    hg.p0 p0Var2 = (hg.p0) i2.d.h(1, o20Var.F);
                    n20 n20Var = o20Var.H;
                    if (n20Var != null) {
                        ((ey) n20Var).c(p0Var2);
                    }
                    o20Var.g(p0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 7:
                n80 n80Var = (n80) this.f6970c;
                p80 p80Var = n80Var.f38285f;
                if (i10 == 67 && n80Var.d.length() == 0 && !p80Var.G.isEmpty()) {
                    p80Var.f38839f.a((z30) i2.d.h(1, p80Var.G));
                    p80Var.f38838c.e(!p80Var.G.isEmpty(), true);
                    p80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f6969b) {
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
        switch (this.f6969b) {
            case 8:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((bf0) this.f6970c).f34321y = true;
                    postDelayed(new zz(this, 22), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f6969b) {
            case 0:
                g2 g2Var = ((k2) this.f6970c).d;
                if (!g2Var.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    g2Var.requestFocus();
                    AndroidUtilities.showKeyboard(g2Var);
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                ba baVar = (ba) this.f6970c;
                z30 z30Var = baVar.e;
                if (z30Var != null) {
                    z30Var.a();
                    baVar.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    baVar.fullScroll(130);
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
                    ((yn0) this.f6970c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f6970c;
                z30 z30Var2 = usersSelectActivity.P;
                if (z30Var2 != null) {
                    z30Var2.a();
                    usersSelectActivity.P = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 11:
                yg.i iVar = (yg.i) this.f6970c;
                z30 z30Var3 = iVar.f48769f;
                if (z30Var3 != null) {
                    z30Var3.a();
                    iVar.f48769f = null;
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
        this.f6969b = 10;
        this.f6970c = new p20();
    }
}
