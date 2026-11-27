package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
public final class fb2 extends AccessibilityNodeProvider {
    public final wb2 a;
    public final Path b = new Path();
    public final RectF c = new RectF();
    public final Rect d = new Rect();

    public fb2(wb2 wb2Var) {
        this.a = wb2Var;
    }

    public final ClickableSpan a(int i, boolean z) {
        if (i != 5000) {
            wb2 wb2Var = this.a;
            if (z) {
                int i2 = i - 3000;
                CharSequence charSequence = wb2Var.Q5.z;
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
            CharSequence charSequence2 = wb2Var.Q5.v;
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

    public final dk9 b(int[] iArr, int i) {
        hl9 hl9Var;
        int i2;
        r47 r47Var = this.a.Q5;
        if (r47Var != null && (hl9Var = r47Var.y2) != null) {
            ArrayList arrayList = hl9Var.g;
            int i3 = i - 6000;
            if (i3 >= 0) {
                int i4 = 0;
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    dk9 dk9Var = (dk9) arrayList.get(i5);
                    if (dk9Var.R()) {
                        if (dk9Var.r == null) {
                            i2 = 0;
                        } else {
                            i2 = 1;
                        }
                        int A = dk9Var.A() + i2 + i4;
                        if (i3 < A) {
                            iArr[0] = i3 - i4;
                            return dk9Var;
                        }
                        i4 = A;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb2.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override
    public final boolean performAction(int r10, int r11, android.os.Bundle r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fb2.performAction(int, int, android.os.Bundle):boolean");
    }
}
