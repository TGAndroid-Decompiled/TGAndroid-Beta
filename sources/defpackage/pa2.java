package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
public final class pa2 extends AccessibilityNodeProvider {
    public final gb2 a;
    public final Path b = new Path();
    public final RectF c = new RectF();
    public final Rect d = new Rect();

    public pa2(gb2 gb2Var) {
        this.a = gb2Var;
    }

    public final ClickableSpan a(int i, boolean z) {
        if (i != 5000) {
            gb2 gb2Var = this.a;
            if (z) {
                int i2 = i - 3000;
                CharSequence charSequence = gb2Var.Q5.z;
                if ((charSequence instanceof Spannable) && i2 >= 0) {
                    Spannable spannable = (Spannable) charSequence;
                    ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannable.getSpans(0, spannable.length(), ClickableSpan.class);
                    if (clickableSpanArr.length > i2) {
                        return clickableSpanArr[i2];
                    }
                    return null;
                }
                return null;
            }
            int i3 = i - 2000;
            CharSequence charSequence2 = gb2Var.Q5.v;
            if ((charSequence2 instanceof Spannable) && i3 >= 0) {
                Spannable spannable2 = (Spannable) charSequence2;
                ClickableSpan[] clickableSpanArr2 = (ClickableSpan[]) spannable2.getSpans(0, spannable2.length(), ClickableSpan.class);
                if (clickableSpanArr2.length > i3) {
                    return clickableSpanArr2[i3];
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final mg9 b(int[] iArr, int i) {
        rh9 rh9Var;
        int i2;
        k27 k27Var = this.a.Q5;
        if (k27Var != null && (rh9Var = k27Var.y2) != null) {
            ArrayList arrayList = rh9Var.g;
            int i3 = i - 6000;
            if (i3 >= 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    mg9 mg9Var = (mg9) arrayList.get(i5);
                    if (mg9Var.S()) {
                        if (mg9Var.r == null) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        int C = mg9Var.C() + i2 + i4;
                        if (i3 < C) {
                            iArr[0] = i3 - i4;
                            return mg9Var;
                        }
                        i4 = C;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa2.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override
    public final boolean performAction(int r10, int r11, android.os.Bundle r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa2.performAction(int, int, android.os.Bundle):boolean");
    }
}
