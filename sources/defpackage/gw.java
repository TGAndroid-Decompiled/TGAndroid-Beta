package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class gw extends FrameLayout implements fkb, dx {
    public final ui5 a;
    public final ey b;
    public bx c;
    public final ew d;
    public final fw e;
    public TL_iv.pageBlockPreformatted f;
    public CharSequence h;
    public boolean n;
    public int r;
    public final Paint s;

    public gw(Activity activity, final ui5 ui5Var, ey eyVar) {
        super(activity);
        this.s = new Paint();
        this.a = ui5Var;
        this.b = eyVar;
        ew ewVar = new ew(this, activity, ui5Var);
        this.d = ewVar;
        ewVar.setPadding(0, gm.L(8.0f), 0, gm.L(8.0f));
        addView(ewVar, qoe.c(-2.0f, -1));
        fw fwVar = new fw(this, activity, ui5Var, eyVar);
        this.e = fwVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int L = gm.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        int L2 = gm.L(12.0f);
        layoutParams.bottomMargin = L2;
        layoutParams.topMargin = L2;
        nm7.i(fwVar);
        ewVar.addView(fwVar, layoutParams);
        ewVar.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                gkb gkbVar = ((o) ui5.this).Q0;
                if (gkbVar != null && gkbVar.w()) {
                    gkbVar.v();
                }
            }
        });
        setWillNotDraw(false);
    }

    private static void setDiffMarkerSpans(SpannableString spannableString) {
        int i = 0;
        while (i <= spannableString.length()) {
            int indexOf = TextUtils.indexOf((CharSequence) spannableString, '\n', i);
            if (indexOf < 0) {
                indexOf = spannableString.length();
            }
            int e = al6.e(i, spannableString);
            if (e != 1) {
                if (e != 2) {
                    if (e == 3 && indexOf > i) {
                        spannableString.setSpan(new xk2(6), i, indexOf, 33);
                    }
                } else {
                    spannableString.setSpan(new xk2(20), i, i + 1, 33);
                }
            } else {
                spannableString.setSpan(new xk2(19), i, i + 1, 33);
            }
            i = indexOf + 1;
        }
    }

    public final SpannableString a(CharSequence charSequence, String str) {
        char c;
        SpannableString spannableString = new SpannableString(charSequence);
        setDiffMarkerSpans(spannableString);
        Pattern pattern = al6.a;
        char[] cArr = new char[spannableString.length()];
        int i = 0;
        for (int i2 = 0; i2 <= spannableString.length(); i2++) {
            if (i2 >= spannableString.length() || spannableString.charAt(i2) == '\n') {
                int e = al6.e(i, spannableString);
                for (int i3 = i; i3 < i2; i3++) {
                    if (e != 3 && i3 != i) {
                        c = spannableString.charAt(i3);
                    } else {
                        c = ' ';
                    }
                    cArr[i3] = c;
                }
                if (i2 < spannableString.length()) {
                    cArr[i2] = '\n';
                }
                i = i2 + 1;
            }
        }
        String str2 = new String(cArr);
        pf2 pf2Var = new pf2(this, spannableString, (byte) 28);
        ml8 ml8Var = el2.a;
        if (str2.length() == spannableString.length()) {
            String b = ml8.b(str);
            if (!b.isEmpty() && !str2.isEmpty()) {
                el2.a.d(str2, b, new x92(spannableString, pf2Var, (byte) 6));
            }
        }
        return spannableString;
    }

    public final void b(SpannableString spannableString) {
        setDiffMarkerSpans(spannableString);
        if (this.h == spannableString) {
            this.e.requestLayout();
            invalidate();
        }
    }

    @Override
    public int getBoundLeft() {
        if (this.c == null) {
            return -1;
        }
        int L = gm.L(16.0f);
        return wi8.h(this.a, 18.0f, this.c.k() + L);
    }

    @Override
    public int getBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int L = gm.L(16.0f);
        return wi8.C(this.a, 18.0f, this.c.l() + L);
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int L = gm.L(16.0f);
        return wi8.C(this.a, 18.0f, this.c.m() + L);
    }

    public int getMinWidth() {
        return wi8.a(this);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        bx bxVar = this.c;
        if (bxVar != null) {
            arrayList.add(bxVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bx bxVar = this.c;
        if (bxVar != null) {
            bxVar.f(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        StaticLayout staticLayout;
        int i;
        TL_iv.pageBlockPreformatted pageblockpreformatted = this.f;
        if (pageblockpreformatted != null) {
            int i2 = 0;
            if (pageblockpreformatted.diff) {
                bx bxVar = this.c;
                if (bxVar != null && (staticLayout = bxVar.d) != null) {
                    CharSequence text = staticLayout.getText();
                    int top = this.e.getTop() + this.d.getTop();
                    int lineCount = staticLayout.getLineCount();
                    for (int i3 = 0; i3 < lineCount; i3++) {
                        int e = al6.e(staticLayout.getLineStart(i3), text);
                        Paint paint = this.s;
                        if (e == 1) {
                            paint.setColor(640993113);
                        } else if (e == 2) {
                            paint.setColor(654261040);
                        }
                        float lineTop = staticLayout.getLineTop(i3) + top;
                        float measuredWidth = getMeasuredWidth();
                        int lineBottom = staticLayout.getLineBottom(i3) + top;
                        if (i3 == lineCount - 1) {
                            i = this.r;
                        } else {
                            i = 0;
                        }
                        canvas.drawRect(0.0f, lineTop, measuredWidth, lineBottom + i, paint);
                    }
                    return;
                }
                return;
            }
            if (pageblockpreformatted.continuesPrev) {
                L = 0.0f;
            } else {
                L = gm.L(8.0f);
            }
            float f = L;
            float measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!this.f.continuesNext) {
                i2 = gm.L(8.0f);
            }
            canvas.drawRect(0.0f, f, measuredWidth2, measuredHeight - i2, o.r1);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.TextView");
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setLongClickable(false);
        bx bxVar = this.c;
        if (bxVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754870, o.g(this.a, this.b, bxVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        ew ewVar = this.d;
        ewVar.measure(makeMeasureSpec, 0);
        setMeasuredDimension(size, ewVar.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        int i;
        int L;
        int L2;
        int L3;
        ey eyVar;
        this.h = null;
        this.f = pageblockpreformatted;
        this.n = true;
        int i2 = 0;
        if (pageblockpreformatted.diff && (eyVar = this.b) != null) {
            i = eyVar.I;
        } else {
            i = 0;
        }
        ew ewVar = this.d;
        ewVar.setScrollX(i);
        this.n = false;
        ewVar.setHorizontalScrollBarEnabled(!pageblockpreformatted.diff);
        if (pageblockpreformatted.continuesPrev) {
            L = 0;
        } else {
            L = gm.L(8.0f);
        }
        if (pageblockpreformatted.continuesNext) {
            L2 = 0;
        } else {
            L2 = gm.L(8.0f);
        }
        ewVar.setPadding(0, L, 0, L2);
        fw fwVar = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fwVar.getLayoutParams();
        if (pageblockpreformatted.continuesPrev) {
            L3 = 0;
        } else {
            L3 = gm.L(12.0f);
        }
        marginLayoutParams.topMargin = L3;
        if (!pageblockpreformatted.continuesNext) {
            i2 = gm.L(12.0f);
        }
        marginLayoutParams.bottomMargin = i2;
        fwVar.requestLayout();
    }
}
