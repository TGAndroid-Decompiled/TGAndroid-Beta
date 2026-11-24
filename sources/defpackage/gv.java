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
public final class gv extends FrameLayout implements eib, dw {
    public final vg5 a;
    public final dx b;
    public bw c;
    public final ev d;
    public final fv e;
    public TL_iv.pageBlockPreformatted f;
    public CharSequence h;
    public boolean n;
    public int r;
    public final Paint s;

    public gv(Activity activity, final vg5 vg5Var, dx dxVar) {
        super(activity);
        this.s = new Paint();
        this.a = vg5Var;
        this.b = dxVar;
        ev evVar = new ev(this, activity, vg5Var);
        this.d = evVar;
        evVar.setPadding(0, gl.L(8.0f), 0, gl.L(8.0f));
        addView(evVar, nme.c(-2.0f, -1));
        fv fvVar = new fv(this, activity, vg5Var, dxVar);
        this.e = fvVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        int L = gl.L(16.0f);
        layoutParams.rightMargin = L;
        layoutParams.leftMargin = L;
        int L2 = gl.L(12.0f);
        layoutParams.bottomMargin = L2;
        layoutParams.topMargin = L2;
        kk7.i(fvVar);
        evVar.addView(fvVar, layoutParams);
        evVar.setOnScrollChangeListener(new View.OnScrollChangeListener() {
            @Override
            public final void onScrollChange(View view, int i, int i2, int i3, int i4) {
                fib fibVar = ((o) vg5.this).Q0;
                if (fibVar != null && fibVar.w()) {
                    fibVar.v();
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
            int e = xi6.e(i, spannableString);
            if (e != 1) {
                if (e != 2) {
                    if (e == 3 && indexOf > i) {
                        spannableString.setSpan(new jj2(6), i, indexOf, 33);
                    }
                } else {
                    spannableString.setSpan(new jj2(20), i, i + 1, 33);
                }
            } else {
                spannableString.setSpan(new jj2(19), i, i + 1, 33);
            }
            i = indexOf + 1;
        }
    }

    public final SpannableString a(CharSequence charSequence, String str) {
        char c;
        SpannableString spannableString = new SpannableString(charSequence);
        setDiffMarkerSpans(spannableString);
        Pattern pattern = xi6.a;
        char[] cArr = new char[spannableString.length()];
        int i = 0;
        for (int i2 = 0; i2 <= spannableString.length(); i2++) {
            if (i2 >= spannableString.length() || spannableString.charAt(i2) == '\n') {
                int e = xi6.e(i, spannableString);
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
        ee2 ee2Var = new ee2(this, spannableString, (byte) 27);
        jj8 jj8Var = qj2.a;
        if (str2.length() == spannableString.length()) {
            String b = jj8.b(str);
            if (!b.isEmpty() && !str2.isEmpty()) {
                qj2.a.d(str2, b, new v82(spannableString, ee2Var, (byte) 5));
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
        int L = gl.L(16.0f);
        return ug8.h(this.a, 18.0f, this.c.k() + L);
    }

    @Override
    public int getBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int L = gl.L(16.0f);
        return ug8.C(this.a, 18.0f, this.c.l() + L);
    }

    @Override
    public int getLastLineBoundRight() {
        if (this.c == null) {
            return -1;
        }
        int L = gl.L(16.0f);
        return ug8.C(this.a, 18.0f, this.c.m() + L);
    }

    public int getMinWidth() {
        return ug8.a(this);
    }

    @Override
    public final void invalidate() {
        this.e.invalidate();
        super.invalidate();
    }

    @Override
    public final void k(ArrayList arrayList) {
        bw bwVar = this.c;
        if (bwVar != null) {
            arrayList.add(bwVar);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.i(this);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bw bwVar = this.c;
        if (bwVar != null) {
            bwVar.f(this);
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
                bw bwVar = this.c;
                if (bwVar != null && (staticLayout = bwVar.d) != null) {
                    CharSequence text = staticLayout.getText();
                    int top = this.e.getTop() + this.d.getTop();
                    int lineCount = staticLayout.getLineCount();
                    for (int i3 = 0; i3 < lineCount; i3++) {
                        int e = xi6.e(staticLayout.getLineStart(i3), text);
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
                L = gl.L(8.0f);
            }
            float f = L;
            float measuredWidth2 = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            if (!this.f.continuesNext) {
                i2 = gl.L(8.0f);
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
        bw bwVar = this.c;
        if (bwVar == null) {
            return;
        }
        accessibilityNodeInfo.setText(o.f(2131754870, o.g(this.a, this.b, bwVar)));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        ev evVar = this.d;
        evVar.measure(makeMeasureSpec, 0);
        setMeasuredDimension(size, evVar.getMeasuredHeight());
    }

    public void setBlock(TL_iv.pageBlockPreformatted pageblockpreformatted) {
        int i;
        int L;
        int L2;
        int L3;
        dx dxVar;
        this.h = null;
        this.f = pageblockpreformatted;
        this.n = true;
        int i2 = 0;
        if (pageblockpreformatted.diff && (dxVar = this.b) != null) {
            i = dxVar.I;
        } else {
            i = 0;
        }
        ev evVar = this.d;
        evVar.setScrollX(i);
        this.n = false;
        evVar.setHorizontalScrollBarEnabled(!pageblockpreformatted.diff);
        if (pageblockpreformatted.continuesPrev) {
            L = 0;
        } else {
            L = gl.L(8.0f);
        }
        if (pageblockpreformatted.continuesNext) {
            L2 = 0;
        } else {
            L2 = gl.L(8.0f);
        }
        evVar.setPadding(0, L, 0, L2);
        fv fvVar = this.e;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) fvVar.getLayoutParams();
        if (pageblockpreformatted.continuesPrev) {
            L3 = 0;
        } else {
            L3 = gl.L(12.0f);
        }
        marginLayoutParams.topMargin = L3;
        if (!pageblockpreformatted.continuesNext) {
            i2 = gl.L(12.0f);
        }
        marginLayoutParams.bottomMargin = i2;
        fvVar.requestLayout();
    }
}
