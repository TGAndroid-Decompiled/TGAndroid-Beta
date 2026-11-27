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
public final class hv extends FrameLayout implements zlb, ew {
    public final xi5 a;
    public final ex b;
    public cw c;
    public final fv d;
    public final gv e;
    public TL_iv.pageBlockPreformatted f;
    public CharSequence h;
    public boolean n;
    public int r;
    public final Paint s;

    public hv(Activity activity, xi5 xi5Var, ex exVar) {
        super(activity);
        this.s = new Paint();
        this.a = xi5Var;
        this.b = exVar;
        fv fvVar = new fv(this, activity, xi5Var);
        this.d = fvVar;
        fvVar.setPadding(0, hl.L(8.0f), 0, hl.L(8.0f));
        addView(fvVar, tre.c(-2.0f, -1));
        gv gvVar = new gv(this, activity, xi5Var, exVar);
        this.e = gvVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int L = hl.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        int L2 = hl.L(12.0f);
        layoutParams.bottomMargin = L2;
        layoutParams.topMargin = L2;
        jn7.i(gvVar);
        fvVar.addView(gvVar, layoutParams);
        fvVar.setOnScrollChangeListener(new ev(xi5Var, (byte) 0));
        setWillNotDraw(false);
    }

    private static void setDiffMarkerSpans(SpannableString spannableString) {
        int i = 0;
        while (i <= spannableString.length()) {
            int indexOf = TextUtils.indexOf((CharSequence) spannableString, '\n', i);
            if (indexOf < 0) {
                indexOf = spannableString.length();
            }
            int e = cl6.e(i, spannableString);
            if (e != 1) {
                if (e != 2) {
                    if (e == 3 && indexOf > i) {
                        spannableString.setSpan(new fk2(6), i, indexOf, 33);
                    }
                } else {
                    spannableString.setSpan(new fk2(20), i, i + 1, 33);
                }
            } else {
                spannableString.setSpan(new fk2(19), i, i + 1, 33);
            }
            i = indexOf + 1;
        }
    }

    public final SpannableString a(CharSequence charSequence, String str) {
        char c;
        SpannableString spannableString = new SpannableString(charSequence);
        setDiffMarkerSpans(spannableString);
        Pattern pattern = cl6.a;
        char[] cArr = new char[spannableString.length()];
        int i = 0;
        for (int i2 = 0; i2 <= spannableString.length(); i2++) {
            if (i2 >= spannableString.length() || spannableString.charAt(i2) == '\n') {
                int e = cl6.e(i, spannableString);
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
        ve2 ve2Var = new ve2(this, spannableString, (byte) 27);
        wm8 wm8Var = mk2.a;
        if (str2.length() == spannableString.length()) {
            String b = wm8.b(str);
            if (!b.isEmpty() && !str2.isEmpty()) {
                mk2.a.d(str2, b, new q72(spannableString, ve2Var, (byte) 7));
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
        int L = hl.L(16.0f);
        return ik8.h(this.a, 18.0f, this.c.k() + L);
    }

    @Override
    public int getBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int L = hl.L(16.0f);
        return ik8.C(this.a, 18.0f, this.c.l() + L);
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int L = hl.L(16.0f);
        return ik8.C(this.a, 18.0f, this.c.m() + L);
    }

    public int getMinWidth() {
        return ik8.a(this);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        cw cwVar = this.c;
        if (cwVar != null) {
            arrayList.add(cwVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cw cwVar = this.c;
        if (cwVar != null) {
            cwVar.f(this);
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
                cw cwVar = this.c;
                if (cwVar != null && (staticLayout = cwVar.d) != null) {
                    CharSequence text = staticLayout.getText();
                    int top = this.e.getTop() + this.d.getTop();
                    int lineCount = staticLayout.getLineCount();
                    for (int i3 = 0; i3 < lineCount; i3++) {
                        int e = cl6.e(staticLayout.getLineStart(i3), text);
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
                L = hl.L(8.0f);
            }
            float f = L;
            float measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!this.f.continuesNext) {
                i2 = hl.L(8.0f);
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
        cw cwVar = this.c;
        if (cwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754866, o.g(this.a, this.b, cwVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        fv fvVar = this.d;
        fvVar.measure(makeMeasureSpec, 0);
        setMeasuredDimension(size, fvVar.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        int i;
        int L;
        int L2;
        int L3;
        ex exVar;
        this.h = null;
        this.f = pageblockpreformatted;
        this.n = true;
        int i2 = 0;
        if (pageblockpreformatted.diff && (exVar = this.b) != null) {
            i = exVar.I;
        } else {
            i = 0;
        }
        fv fvVar = this.d;
        fvVar.setScrollX(i);
        this.n = false;
        fvVar.setHorizontalScrollBarEnabled(!pageblockpreformatted.diff);
        if (pageblockpreformatted.continuesPrev) {
            L = 0;
        } else {
            L = hl.L(8.0f);
        }
        if (pageblockpreformatted.continuesNext) {
            L2 = 0;
        } else {
            L2 = hl.L(8.0f);
        }
        fvVar.setPadding(0, L, 0, L2);
        gv gvVar = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) gvVar.getLayoutParams();
        if (pageblockpreformatted.continuesPrev) {
            L3 = 0;
        } else {
            L3 = hl.L(12.0f);
        }
        marginLayoutParams.topMargin = L3;
        if (!pageblockpreformatted.continuesNext) {
            i2 = hl.L(12.0f);
        }
        marginLayoutParams.bottomMargin = i2;
        gvVar.requestLayout();
    }
}
