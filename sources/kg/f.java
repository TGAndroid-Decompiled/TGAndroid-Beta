package kg;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import kf.k0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.d20;
import org.telegram.ui.Components.dn0;
import org.telegram.ui.Components.o30;
import org.telegram.ui.UsersSelectActivity;
import org.telegram.ui.c80;
import org.telegram.ui.d10;
import org.telegram.ui.e80;
import org.telegram.ui.fp;
import org.telegram.ui.re0;
import org.telegram.ui.vx;
import org.telegram.ui.zo;
import ph.b8;
import ph.r1;
import tf.e0;
public final class f extends EditTextBoldCursor {
    public final int f10531b;
    public final Object f10532c;

    public f(Object obj, Context context, int i10) {
        super(context);
        this.f10531b = i10;
        this.f10532c = obj;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f10531b) {
            case 5:
                ((dn0) this.f10532c).getClass();
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void onFocusChanged(boolean z4, int i10, Rect rect) {
        float f10;
        switch (this.f10531b) {
            case 4:
                super.onFocusChanged(z4, i10, rect);
                ad0 ad0Var = (ad0) this.f10532c;
                if (!z4 && !isFocused()) {
                    f10 = 0.0f;
                } else {
                    f10 = 1.0f;
                }
                ad0Var.b(f10, f10, true);
                return;
            case 9:
                super.onFocusChanged(z4, i10, rect);
                if (!z4) {
                    AndroidUtilities.hideKeyboard(((r1) this.f10532c).d);
                    return;
                }
                return;
            default:
                super.onFocusChanged(z4, i10, rect);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.f10531b) {
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) getText());
                fp fpVar = (fp) this.f10532c;
                zo zoVar = fpVar.f34185f;
                if (zoVar != null && zoVar.getTextView() != null && !TextUtils.isEmpty(fpVar.f34185f.getTextView().getText())) {
                    sb.append("\n");
                    sb.append(fpVar.f34185f.getTextView().getText());
                }
                accessibilityNodeInfo.setText(sb);
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.f10531b) {
            case 1:
                w0 w0Var = (w0) this.f10532c;
                if (i10 == 67 && w0Var.e.length() == 0 && ((w0Var.h.getVisibility() == 0 && w0Var.h.length() > 0) || w0Var.p())) {
                    if (w0Var.p()) {
                        e0 e0Var = (e0) k0.i(1, w0Var.f20628d0);
                        h5 h5Var = w0Var.E;
                        if (h5Var != null) {
                            h5Var.o(e0Var);
                        }
                        w0Var.C(e0Var);
                        return true;
                    }
                    w0Var.f20645s.callOnClick();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 3:
                d20 d20Var = (d20) this.f10532c;
                if (i10 == 67 && d20Var.f24117r.length() == 0 && d20Var.d()) {
                    if (!d20Var.d()) {
                        return true;
                    }
                    e0 e0Var2 = (e0) k0.i(1, d20Var.C);
                    c20 c20Var = d20Var.E;
                    if (c20Var != null) {
                        ((vx) c20Var).d(e0Var2);
                    }
                    d20Var.g(e0Var2);
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            case 6:
                c80 c80Var = (c80) this.f10532c;
                e80 e80Var = c80Var.f33042f;
                if (i10 == 67 && c80Var.d.length() == 0 && !e80Var.D.isEmpty()) {
                    e80Var.f33736f.a((o30) k0.i(1, e80Var.D));
                    e80Var.f33735c.e(!e80Var.D.isEmpty(), true);
                    e80Var.c0();
                    return true;
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f10531b) {
            case 1:
                super.onMeasure(i10, i11);
                setMeasuredDimension(AndroidUtilities.dp(3.0f) + Math.max(View.MeasureSpec.getSize(i10), getMeasuredWidth()), getMeasuredHeight());
                return;
            case 2:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, i11);
                setPivotX(getPaddingLeft());
                setPivotY(getMeasuredHeight() / 2.0f);
                return;
        }
    }

    @Override
    public boolean onTextContextMenuItem(int i10) {
        switch (this.f10531b) {
            case 7:
                if (i10 == 16908322 || i10 == 16908337) {
                    ((re0) this.f10532c).f37818y = true;
                    postDelayed(new d10(this, 21), 1000L);
                }
                return super.onTextContextMenuItem(i10);
            default:
                return super.onTextContextMenuItem(i10);
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f10531b) {
            case 0:
                k kVar = (k) this.f10532c;
                o30 o30Var = kVar.f10548f;
                if (o30Var != null) {
                    o30Var.a();
                    kVar.f10548f = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    kVar.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 1:
                boolean onTouchEvent = super.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return onTouchEvent;
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            default:
                return super.onTouchEvent(motionEvent);
            case 5:
                if (!isEnabled()) {
                    return false;
                }
                if (motionEvent.getAction() == 1) {
                    ((dn0) this.f10532c).getClass();
                }
                return super.onTouchEvent(motionEvent);
            case 8:
                UsersSelectActivity usersSelectActivity = (UsersSelectActivity) this.f10532c;
                o30 o30Var2 = usersSelectActivity.M;
                if (o30Var2 != null) {
                    o30Var2.a();
                    usersSelectActivity.M = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
            case 9:
                f fVar = ((r1) this.f10532c).d;
                if (!fVar.isEnabled()) {
                    return super.onTouchEvent(motionEvent);
                }
                if (motionEvent.getAction() == 0) {
                    fVar.requestFocus();
                    AndroidUtilities.showKeyboard(fVar);
                }
                return super.onTouchEvent(motionEvent);
            case 10:
                b8 b8Var = (b8) this.f10532c;
                o30 o30Var3 = b8Var.e;
                if (o30Var3 != null) {
                    o30Var3.a();
                    b8Var.e = null;
                }
                if (motionEvent.getAction() == 0 && !AndroidUtilities.showKeyboard(this)) {
                    b8Var.fullScroll(130);
                    clearFocus();
                    requestFocus();
                }
                return super.onTouchEvent(motionEvent);
        }
    }
}
