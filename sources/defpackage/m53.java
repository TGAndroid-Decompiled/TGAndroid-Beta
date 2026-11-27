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
public abstract class m53 extends xt3 implements snb {
    public final vnb f2;
    public final kj4 g2;
    public Runnable h2;
    public int i2;

    public m53(int i, vnb vnbVar, Context context) {
        super(context, vnbVar);
        this.f2 = vnbVar;
        this.g2 = new kj4(getContext(), new GestureDetector.SimpleOnGestureListener());
        setBackground(null);
        setIncludeFontPadding(true);
        setShowSoftInputOnFocus(false);
        setSingleLine(false);
        setMaxLines(50);
        this.i2 = i;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        setTextSize(1, 22.0f);
        setGravity(80);
        setPadding(hl.L(18.0f), hl.L(4.0f), hl.L(18.0f), hl.L(12.0f));
        yob.X(this, aob.Le, vnbVar);
        yob.G(this, aob.Yc, vnbVar);
        yob.C(this, aob.lg, vnbVar);
        int i2 = aob.Me;
        yob.l(this, 34, i2, vnbVar);
        yob.D(this, i2, vnbVar);
        yob.l(this, 30, aob.Ne, vnbVar);
        yob.l(this, 36, aob.mg, vnbVar);
        if (Build.VERSION.SDK_INT >= 28) {
            setFallbackLineSpacing(false);
        }
        setOnFocusChangeListener(new ts0((q82) this, (byte) 4));
        setTextIsSelectable(true);
        setLongClickable(false);
        setFocusableInTouchMode(false);
    }

    public final void J() {
        setLongClickable(false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        if (((qa[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), qa.class)).length == 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("x");
            qa qaVar = new qa(this.f2);
            ValueAnimator ofInt = ValueAnimator.ofInt(qaVar.f, 255);
            ofInt.addUpdateListener(new pa(qaVar, this, (byte) 0));
            ofInt.setDuration(200L);
            ofInt.start();
            spannableStringBuilder2.setSpan(qaVar, 0, spannableStringBuilder2.length(), 33);
            setText(getText().append((CharSequence) spannableStringBuilder2));
        }
    }

    public final void K(boolean z) {
        qa[] qaVarArr;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getText());
        for (qa qaVar : (qa[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), qa.class)) {
            bv2 bv2Var = new bv2(this, qaVar, (byte) 23);
            if (z) {
                setCursorVisible(false);
                ValueAnimator ofInt = ValueAnimator.ofInt(qaVar.f, 0);
                ofInt.addUpdateListener(new pa(qaVar, this, (byte) 1));
                ofInt.addListener(new h0(bv2Var, (byte) 4));
                ofInt.setDuration(200L);
                ofInt.start();
            } else {
                bv2Var.run();
            }
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((GestureDetector) this.g2.b).onTouchEvent(motionEvent) && !isLongClickable()) {
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
        menu.add(2131296496, 2131296496, 0, ob6.M0(2131751563, null));
    }

    @Override
    public final void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (hasSelection() && ((qa[]) getText().getSpans(i, i2, qa.class)).length != 0) {
            setSelection(i, i2 - 1);
        }
    }

    public void setMaxLength(int i) {
        if (this.i2 != i) {
            this.i2 = i;
            setFilters(new InputFilter[]{new InputFilter.LengthFilter(i)});
        }
    }

    public void setOnFocused(Runnable runnable) {
        this.h2 = runnable;
    }

    @Override
    public final void updateColors() {
        vnb vnbVar = this.f2;
        try {
            setHintColor(aob.v0(aob.Me, vnbVar));
            setCursorColor(aob.v0(aob.Ne, vnbVar));
            setHandlesColor(aob.v0(aob.mg, vnbVar));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
