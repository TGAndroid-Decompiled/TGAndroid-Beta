package hg;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.mt;
public abstract class g0 extends mt {
    public final b6 f10603c;
    public final m5.c0 d;
    public Runnable f10604e;
    public int f10605f;

    public g0(Context context, int i9, b6 b6Var) {
        super(context, b6Var);
        this.f10603c = b6Var;
        this.d = new m5.c0(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        int i10 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.f10605f = i9;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i9)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
        setTextColor(f6.v0(f6.Ud, b6Var));
        setLinkTextColor(f6.v0(f6.f23079hc, b6Var));
        setHighlightColor(f6.v0(f6.f23312uf, b6Var));
        int i11 = f6.Vd;
        setHintColor(f6.v0(i11, b6Var));
        setHintTextColor(f6.v0(i11, b6Var));
        setCursorColor(f6.v0(f6.Wd, b6Var));
        setHandlesColor(f6.v0(f6.f23325vf, b6Var));
        if (i10 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new gh.j((p) this, 4));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((GestureDetector) this.d.f17378b).onTouchEvent(motionEvent) && !isLongClickable()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void extendActionMode(ActionMode actionMode, Menu menu) {
        menu.clear();
        int i9 = R.id.menu_delete;
        menu.add(i9, i9, 0, LocaleController.getString(R.string.Delete));
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
        if (((b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            b bVar = new b(this.f10603c);
            ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f10536f, 255);
            ofInt.addUpdateListener(new a(bVar, this, 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(bVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void n(boolean z10) {
        b[] bVarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (b bVar : (b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)) {
            h3.g0 g0Var = new h3.g0(5, this, bVar);
            if (z10) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f10536f, 0);
                ofInt.addUpdateListener(new a(bVar, this, 1));
                ofInt.addListener(new ag.e(g0Var, 6));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                g0Var.run();
            }
        }
    }

    @Override
    public final void onSelectionChanged(int i9, int i10) {
        super.onSelectionChanged(i9, i10);
        if (hasSelection() && ((b[]) getText().getSpans(i9, i10, b.class)).length != 0) {
            setSelection(i9, i10 - 1);
        }
    }

    public void setMaxLength(int i9) {
        if (this.f10605f != i9) {
            this.f10605f = i9;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i9)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.f10604e = runnable;
    }
}
