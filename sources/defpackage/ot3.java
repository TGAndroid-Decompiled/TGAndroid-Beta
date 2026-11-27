package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public abstract class ot3 extends FrameLayout implements snb {
    public boolean E;
    public boolean a;
    public final lt3 b;
    public final vnb c;
    public final int d;
    public boolean e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final ll w;
    public int x;
    public final hn y;

    public ot3(Context context, wma wmaVar, String str, boolean z, int i, vnb vnbVar) {
        super(context);
        int i2;
        this.f = -1;
        this.r = true;
        hn hnVar = new hn(false, true, true);
        this.y = hnVar;
        hnVar.n(0.2f, 160L, k43.h);
        hnVar.w(hl.L(15.33f));
        hnVar.b = 5;
        this.d = i;
        lt3 lt3Var = new lt3(this, context, wmaVar, vnbVar, z);
        this.b = lt3Var;
        xt3 editText = lt3Var.getEditText();
        editText.setDelegate(new lh2(this, editText, false, (byte) 24));
        lt3Var.setWillNotDraw(false);
        this.w = new ll(lt3Var);
        hnVar.setCallback(lt3Var);
        editText.setTextSize(1, 17.0f);
        yob.D(editText, aob.H6, vnbVar);
        int i3 = aob.G6;
        yob.X(editText, i3, vnbVar);
        editText.setBackground(null);
        if (z) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), hl.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((ob6.a0 ? 5 : 3) | 48);
        if (z) {
            i2 = 131072;
        } else {
            i2 = 0;
        }
        editText.setInputType(i2 | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        yob.l(editText, 30, i3, vnbVar);
        this.c = vnbVar;
        editText.setCursorSize(hl.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new mt3(this, i, editText, z));
        editText.setOnFocusChangeListener(new nt3(this, (byte) 0));
        addView(lt3Var, tre.e(-1, -1, 48));
        c();
    }

    public int a() {
        return wl.f();
    }

    public final void c() {
        int i;
        String valueOf;
        lt3 lt3Var = this.b;
        if (lt3Var != null && lt3Var.getEditText() != null) {
            this.x = this.d - getText().length();
            if ((TextUtils.isEmpty(getText()) && !this.e) || ((this.h && !this.n) || ((i = this.f) != -1 && this.x > i))) {
                valueOf = "";
            } else {
                valueOf = String.valueOf(this.x);
            }
            this.y.t(valueOf, true, true);
        }
    }

    public CharSequence getText() {
        return this.b.getText();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i;
        super.onDraw(canvas);
        if (this.E) {
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(22.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(22.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, aob.j0);
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setDivider(boolean z) {
        this.E = z;
        setWillNotDraw(!z);
    }

    public void setEmojiViewCacheType(int i) {
        this.b.setEmojiViewCacheType(i);
    }

    public void setShowLimitOnFocus(boolean z) {
        this.h = z;
    }

    public void setShowLimitWhenEmpty(boolean z) {
        this.e = z;
        if (z) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i) {
        this.f = i;
        c();
    }

    public void setText(CharSequence charSequence) {
        this.a = true;
        lt3 lt3Var = this.b;
        lt3Var.setText(charSequence);
        lt3Var.setSelection(lt3Var.getText().length());
        this.a = false;
    }

    @Override
    public final void updateColors() {
        lt3 lt3Var = this.b;
        if (lt3Var != null) {
            try {
                if (lt3Var.getEditText() != null) {
                    lt3Var.getEditText().setCursorColor(aob.v0(aob.G6, this.c));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
