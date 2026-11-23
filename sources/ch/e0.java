package ch;

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
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.ot;
public abstract class e0 extends ot implements b6 {
    public final h6 f5374e2;
    public final jn f5375f2;
    public Runnable f5376g2;
    public int f5377h2;

    public e0(int i7, Context context, h6 h6Var) {
        super(context, h6Var);
        this.f5374e2 = h6Var;
        this.f5375f2 = new jn(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        int i10 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.f5377h2 = i7;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(12.0f));
        t6.U(this, m6.Le, h6Var);
        t6.G(this, m6.Yc, h6Var);
        t6.C(this, m6.f29537lg, h6Var);
        int i11 = m6.Me;
        t6.l(this, 34, i11, h6Var);
        t6.D(this, i11, h6Var);
        t6.l(this, 30, m6.Ne, h6Var);
        t6.l(this, 36, m6.f29554mg, h6Var);
        if (i10 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new c0((m) this, 0));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    public final void J() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            b bVar = new b(this.f5374e2);
            ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f5325f, 255);
            ofInt.addUpdateListener(new a(bVar, this, 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(bVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void K(boolean z10) {
        b[] bVarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (b bVar : (b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)) {
            c1.a aVar = new c1.a(7, this, bVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f5325f, 0);
                ofInt.addUpdateListener(new a(bVar, this, 1));
                ofInt.addListener(new ai.k0(aVar, 2));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                aVar.run();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((GestureDetector) this.f5375f2.f36567b).onTouchEvent(motionEvent) && !isLongClickable()) {
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
        menu.add(2131296496, 2131296496, 0, hd.N0(2131751586, null));
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        if (hasSelection() && ((b[]) getText().getSpans(i7, i10, b.class)).length != 0) {
            setSelection(i7, i10 - 1);
        }
    }

    public void setMaxLength(int i7) {
        if (this.f5377h2 != i7) {
            this.f5377h2 = i7;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.f5376g2 = runnable;
    }

    @Override
    public final void updateColors() {
        h6 h6Var = this.f5374e2;
        try {
            setHintColor(m6.w0(m6.Me, h6Var));
            setCursorColor(m6.w0(m6.Ne, h6Var));
            setHandlesColor(m6.w0(m6.f29554mg, h6Var));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
