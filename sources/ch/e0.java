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
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.hn;
import org.telegram.ui.Components.mt;
public abstract class e0 extends mt implements c6 {
    public final i6 f5342e2;
    public final hn f5343f2;
    public Runnable f5344g2;
    public int f5345h2;

    public e0(int i7, Context context, i6 i6Var) {
        super(context, i6Var);
        this.f5342e2 = i6Var;
        this.f5343f2 = new hn(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        int i10 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.f5345h2 = i7;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(12.0f));
        u6.U(this, n6.Le, i6Var);
        u6.G(this, n6.Yc, i6Var);
        u6.C(this, n6.f29550lg, i6Var);
        int i11 = n6.Me;
        u6.l(this, 34, i11, i6Var);
        u6.D(this, i11, i6Var);
        u6.l(this, 30, n6.Ne, i6Var);
        u6.l(this, 36, n6.f29567mg, i6Var);
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
            b bVar = new b(this.f5342e2);
            ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f5293f, 255);
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
            c1.c cVar = new c1.c(5, this, bVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f5293f, 0);
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
        if (((GestureDetector) this.f5343f2.f35933b).onTouchEvent(motionEvent) && !isLongClickable()) {
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
        menu.add(2131296494, 2131296494, 0, gd.M0(2131751587, null));
    }

    @Override
    public final void onSelectionChanged(int i7, int i10) {
        super.onSelectionChanged(i7, i10);
        if (hasSelection() && ((b[]) getText().getSpans(i7, i10, b.class)).length != 0) {
            setSelection(i7, i10 - 1);
        }
    }

    public void setMaxLength(int i7) {
        if (this.f5345h2 != i7) {
            this.f5345h2 = i7;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i7)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.f5344g2 = runnable;
    }

    @Override
    public final void updateColors() {
        i6 i6Var = this.f5342e2;
        try {
            setHintColor(n6.w0(n6.Me, i6Var));
            setCursorColor(n6.w0(n6.Ne, i6Var));
            setHandlesColor(n6.w0(n6.f29567mg, i6Var));
            invalidate();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
