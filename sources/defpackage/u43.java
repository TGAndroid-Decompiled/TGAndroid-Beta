package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.ActionMode;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MotionEvent;
import java.util.HashSet;
public abstract class u43 extends gt3 implements tjb {
    public final wjb e2;
    public final gi3 f2;
    public Runnable g2;
    public int h2;

    public u43(int i, wjb wjbVar, Context context) {
        super(context, wjbVar);
        this.e2 = wjbVar;
        this.f2 = new gi3(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.h2 = i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(gl.L(18.0f), gl.L(4.0f), gl.L(18.0f), gl.L(12.0f));
        zkb.X(this, bkb.Ke, wjbVar);
        zkb.G(this, bkb.Xc, wjbVar);
        zkb.C(this, bkb.kg, wjbVar);
        int i2 = bkb.Le;
        zkb.l(this, 34, i2, wjbVar);
        zkb.D(this, i2, wjbVar);
        zkb.l(this, 30, bkb.Me, wjbVar);
        zkb.l(this, 36, bkb.lg, wjbVar);
        if (Build.VERSION.SDK_INT >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new ls0((z72) this, (byte) 4));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    public final void J() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((pa[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pa.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            pa paVar = new pa(this.e2);
            ValueAnimator ofInt = ValueAnimator.ofInt(paVar.f, 255);
            ofInt.addUpdateListener(new oa(paVar, this, (byte) 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(paVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void K(boolean z) {
        pa[] paVarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (pa paVar : (pa[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), pa.class)) {
            gu2 gu2Var = new gu2(this, paVar, (byte) 24);
            if (z) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(paVar.f, 0);
                ofInt.addUpdateListener(new oa(paVar, this, (byte) 1));
                ofInt.addListener(new g0(gu2Var, (byte) 4));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                gu2Var.run();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((GestureDetector) this.f2.a).onTouchEvent(motionEvent) && !isLongClickable()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public int getEditTextSelectionEnd() {
        int selectionEnd = getSelectionEnd();
        if (selectionEnd < 0) {
            return 0;
        }
        return selectionEnd;
    }

    public int getEditTextSelectionStart() {
        int selectionStart = getSelectionStart();
        if (selectionStart < 0) {
            return 0;
        }
        return selectionStart;
    }

    public Paint.FontMetricsInt getFontMetricsInt() {
        return getPaint().getFontMetricsInt();
    }

    @Override
    public final void o(ActionMode actionMode, Menu menu) {
        menu.clear();
        menu.add(2131296496, 2131296496, 0, k96.M0(2131751586, null));
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (hasSelection() && ((pa[]) getText().getSpans(i, i2, pa.class)).length != 0) {
            setSelection(i, i2 - 1);
        }
    }

    public void setMaxLength(int i) {
        if (this.h2 != i) {
            this.h2 = i;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.g2 = runnable;
    }

    @Override
    public final void updateColors() {
        wjb wjbVar = this.e2;
        try {
            setHintColor(bkb.v0(bkb.Le, wjbVar));
            setCursorColor(bkb.v0(bkb.Me, wjbVar));
            setHandlesColor(bkb.v0(bkb.lg, wjbVar));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
