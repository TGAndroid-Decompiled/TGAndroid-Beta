package dh;

import ai.e1;
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
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.y00;
public abstract class c0 extends xs implements z5 {
    public final e6 Z1;
    public final y00 f8969a2;
    public Runnable f8970b2;
    public int c2;

    public c0(int i3, Context context, e6 e6Var) {
        super(context, e6Var);
        this.Z1 = e6Var;
        this.f8969a2 = new y00(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        int i10 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.c2 = i3;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i3)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(12.0f));
        r6.V(this, k6.Ie, e6Var);
        r6.H(this, k6.Vc, e6Var);
        r6.D(this, k6.ig, e6Var);
        int i11 = k6.Je;
        r6.m(this, 34, i11, e6Var);
        r6.E(this, i11, e6Var);
        r6.m(this, 30, k6.Ke, e6Var);
        r6.m(this, 36, k6.f27998jg, e6Var);
        if (i10 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new ci.m((l) this, 4));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    public final void I() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            b bVar = new b(this.Z1);
            ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f8958f, 255);
            ofInt.addUpdateListener(new a(bVar, this, 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(bVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void J(boolean z10) {
        b[] bVarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (b bVar : (b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)) {
            ci.e0 e0Var = new ci.e0(24, this, bVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f8958f, 0);
                ofInt.addUpdateListener(new a(bVar, this, 1));
                ofInt.addListener(new e1(e0Var, 3));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                e0Var.run();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((GestureDetector) this.f8969a2.f40562a).onTouchEvent(motionEvent) && !isLongClickable()) {
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
        menu.add(2131296494, 2131296494, 0, bd.M0(2131751599, null));
    }

    @Override
    public final void onSelectionChanged(int i3, int i10) {
        super.onSelectionChanged(i3, i10);
        if (hasSelection() && ((b[]) getText().getSpans(i3, i10, b.class)).length != 0) {
            setSelection(i3, i10 - 1);
        }
    }

    public void setMaxLength(int i3) {
        if (this.c2 != i3) {
            this.c2 = i3;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i3)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.f8970b2 = runnable;
    }

    @Override
    public final void updateColors() {
        e6 e6Var = this.Z1;
        try {
            setHintColor(k6.w0(k6.Je, e6Var));
            setCursorColor(k6.w0(k6.Ke, e6Var));
            setHandlesColor(k6.w0(k6.f27998jg, e6Var));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
