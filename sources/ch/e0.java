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
import org.telegram.messenger.ou;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.ft;
public abstract class e0 extends ft implements z5 {
    public final e6 f5059e2;
    public final ou f5060f2;
    public Runnable f5061g2;
    public int f5062h2;

    public e0(int i7, Context context, e6 e6Var) {
        super(context, e6Var);
        this.f5059e2 = e6Var;
        this.f5060f2 = new ou(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        int i10 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.f5062h2 = i7;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(12.0f));
        q6.U(this, j6.Le, e6Var);
        q6.G(this, j6.Yc, e6Var);
        q6.C(this, j6.f29005lg, e6Var);
        int i11 = j6.Me;
        q6.l(this, 34, i11, e6Var);
        q6.D(this, i11, e6Var);
        q6.l(this, 30, j6.Ne, e6Var);
        q6.l(this, 36, j6.f29022mg, e6Var);
        if (i10 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new c0((l) this, 0));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    public final void J() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            b bVar = new b(this.f5059e2);
            ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f5010f, 255);
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
            c1.c cVar = new c1.c(6, this, bVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f5010f, 0);
                ofInt.addUpdateListener(new a(bVar, this, 1));
                ofInt.addListener(new ai.j0(cVar, 2));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                cVar.run();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((GestureDetector) this.f5060f2.f25806b).onTouchEvent(motionEvent) && !isLongClickable()) {
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
        menu.add(2131296494, 2131296494, 0, hd.M0(2131751598, null));
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        if (hasSelection() && ((b[]) getText().getSpans(i7, i10, b.class)).length != 0) {
            setSelection(i7, i10 - 1);
        }
    }

    public void setMaxLength(int i7) {
        if (this.f5062h2 != i7) {
            this.f5062h2 = i7;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.f5061g2 = runnable;
    }

    @Override
    public final void updateColors() {
        e6 e6Var = this.f5059e2;
        try {
            setHintColor(j6.w0(j6.Me, e6Var));
            setCursorColor(j6.w0(j6.Ne, e6Var));
            setHandlesColor(j6.w0(j6.f29022mg, e6Var));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
