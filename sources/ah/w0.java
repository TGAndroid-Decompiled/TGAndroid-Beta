package ah;

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
import ji.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.nu;
public abstract class w0 extends nu {
    public final c6 f896c;
    public final h5 d;
    public Runnable e;
    public int f897f;

    public w0(Context context, int i10, c6 c6Var) {
        super(context, c6Var);
        this.f896c = c6Var;
        this.d = new h5(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        int i11 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.f897f = i10;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
        setTextColor(g6.w0(g6.Ud, c6Var));
        setLinkTextColor(g6.w0(g6.hc, c6Var));
        setHighlightColor(g6.w0(g6.f19924uf, c6Var));
        int i12 = g6.Vd;
        setHintColor(g6.w0(i12, c6Var));
        setHintTextColor(g6.w0(i12, c6Var));
        setCursorColor(g6.w0(g6.Wd, c6Var));
        setHandlesColor(g6.w0(g6.f19942vf, c6Var));
        if (i11 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new u0((w) this, 0));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((GestureDetector) this.d.f13315b).onTouchEvent(motionEvent) && !isLongClickable()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        menu.clear();
        int i10 = R.id.menu_delete;
        menu.add(i10, i10, 0, LocaleController.getString(R.string.Delete));
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

    public final void m() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            c cVar = new c(this.f896c);
            ValueAnimator ofInt = ValueAnimator.ofInt(cVar.f665f, 255);
            ofInt.addUpdateListener(new a(cVar, this, 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(cVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void n(boolean z10) {
        c[] cVarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (c cVar : (c[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), c.class)) {
            a1.f fVar = new a1.f(11, this, cVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(cVar.f665f, 0);
                ofInt.addUpdateListener(new a(cVar, this, 1));
                ofInt.addListener(new b(fVar, 0));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                fVar.run();
            }
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (hasSelection() && ((c[]) getText().getSpans(i10, i11, c.class)).length != 0) {
            setSelection(i10, i11 - 1);
        }
    }

    public void setMaxLength(int i10) {
        if (this.f897f != i10) {
            this.f897f = i10;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.e = runnable;
    }
}
