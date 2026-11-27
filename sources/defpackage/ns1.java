package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.ui.ProfileActivity;
public final class ns1 extends ema {
    public final byte N0;
    public final Object O0;

    public ns1(Context context, AtomicReference atomicReference) {
        super(context);
        this.N0 = (byte) 1;
        this.O0 = atomicReference;
    }

    @Override
    public final boolean k(CharSequence charSequence) {
        ema emaVar;
        switch (this.N0) {
            case 1:
                AtomicReference atomicReference = (AtomicReference) this.O0;
                if (atomicReference != null && (emaVar = (ema) atomicReference.get()) != null) {
                    emaVar.k(charSequence);
                }
                return l(charSequence, false);
            default:
                return super.k(charSequence);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        switch (this.N0) {
            case 2:
                super.onAttachedToWindow();
                ((f48) this.O0).s.a();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        switch (this.N0) {
            case 2:
                super.onDetachedFromWindow();
                ((f48) this.O0).s.b();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        switch (this.N0) {
            case 3:
                int rightDrawableX = getRightDrawableX();
                super.onDraw(canvas);
                if (rightDrawableX != getRightDrawableX()) {
                    ((ProfileActivity) this.O0).K3();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.N0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.O0;
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (isFocusable()) {
                    if (profileActivity.h != null || profileActivity.n != null) {
                        StringBuilder sb = new StringBuilder(getText());
                        if (profileActivity.n != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(profileActivity.n);
                        }
                        if (profileActivity.h != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append(profileActivity.h);
                        }
                        accessibilityNodeInfo.setText(sb);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public final void setTextColor(int i) {
        switch (this.N0) {
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.O0;
                profileActivity.J5 = i;
                super.setTextColor(vm2.f(profileActivity.G5, i, aob.v0(aob.G6, profileActivity.A0)));
                return;
            default:
                super.setTextColor(i);
                return;
        }
    }

    @Override
    public final void setTranslationY(float f) {
        ema emaVar;
        byte b = this.N0;
        Object obj = this.O0;
        switch (b) {
            case 0:
                super.setTranslationY(f);
                zu1 zu1Var = (zu1) obj;
                if (this == zu1Var.S2[0] && zu1Var.W2[1] != null) {
                    if (zu1Var.c5 && f < 0.0f) {
                        zu1Var.O2.setTranslationY(f / 2.0f);
                        return;
                    } else {
                        zu1Var.O2.setTranslationY(0.0f);
                        return;
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference = (AtomicReference) obj;
                if (atomicReference != null && (emaVar = (ema) atomicReference.get()) != null) {
                    emaVar.setTranslationY(f);
                }
                super.setTranslationY(f);
                return;
            default:
                super.setTranslationY(f);
                return;
        }
    }

    public ns1(byte b, Context context, Object obj) {
        super(context);
        this.N0 = b;
        this.O0 = obj;
    }
}
