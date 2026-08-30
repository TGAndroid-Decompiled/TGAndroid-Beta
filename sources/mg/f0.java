package mg;

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
import lh.n2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.vt;
public abstract class f0 extends vt {
    public final f6 f13999c;
    public final f1 d;
    public Runnable e;
    public int f14000f;

    public f0(Context context, int i10, f6 f6Var) {
        super(context, f6Var);
        this.f13999c = f6Var;
        this.d = new f1(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        int i11 = Build.VERSION.SDK_INT;
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.f14000f = i10;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(12.0f));
        setTextColor(j6.v0(j6.Ud, f6Var));
        setLinkTextColor(j6.v0(j6.f19983hc, f6Var));
        setHighlightColor(j6.v0(j6.f20216uf, f6Var));
        int i12 = j6.Vd;
        setHintColor(j6.v0(i12, f6Var));
        setHintTextColor(j6.v0(i12, f6Var));
        setCursorColor(j6.v0(j6.Wd, f6Var));
        setHandlesColor(j6.v0(j6.f20234vf, f6Var));
        if (i11 >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new cg.z((p) this, 6));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((GestureDetector) this.d.f21045b).onTouchEvent(motionEvent) && !isLongClickable()) {
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
        if (((b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            b bVar = new b(this.f13999c);
            ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f13942f, 255);
            ofInt.addUpdateListener(new a(bVar, this, 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(bVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void n(boolean z4) {
        b[] bVarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (b bVar : (b[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), b.class)) {
            n2 n2Var = new n2(20, this, bVar);
            if (z4) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(bVar.f13942f, 0);
                ofInt.addUpdateListener(new a(bVar, this, 1));
                ofInt.addListener(new cg.l0(n2Var, 12));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                n2Var.run();
            }
        }
    }

    @Override
    public final void onSelectionChanged(int i10, int i11) {
        super.onSelectionChanged(i10, i11);
        if (hasSelection() && ((b[]) getText().getSpans(i10, i11, b.class)).length != 0) {
            setSelection(i10, i11 - 1);
        }
    }

    public void setMaxLength(int i10) {
        if (this.f14000f != i10) {
            this.f14000f = i10;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.e = runnable;
    }
}
