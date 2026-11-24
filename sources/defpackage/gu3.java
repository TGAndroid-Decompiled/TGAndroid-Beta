package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public abstract class gu3 extends FrameLayout implements vlb {
    public boolean E;
    public boolean a;
    public final du3 b;
    public final ylb c;
    public final int d;
    public boolean e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final km w;
    public int x;
    public final ho y;

    public gu3(Context context, ela elaVar, String str, boolean z, int i, ylb ylbVar) {
        super(context);
        int i2;
        this.f = -1;
        this.r = true;
        ho hoVar = new ho(false, true, true);
        this.y = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.b = 5;
        this.d = i;
        du3 du3Var = new du3(this, context, elaVar, ylbVar, z);
        this.b = du3Var;
        qu3 editText = du3Var.getEditText();
        editText.setDelegate(new lx6(this, editText, false, (byte) 23));
        du3Var.setWillNotDraw(false);
        this.w = new km(du3Var);
        hoVar.setCallback(du3Var);
        editText.setTextSize(1, 17.0f);
        anb.D(editText, cmb.G6, ylbVar);
        int i3 = cmb.F6;
        anb.X(editText, i3, ylbVar);
        editText.setBackground(null);
        if (z) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), gm.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((jb6.a0 ? 5 : 3) | 48);
        if (z) {
            i2 = 131072;
        } else {
            i2 = 0;
        }
        editText.setInputType(i2 | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        anb.l(editText, 30, i3, ylbVar);
        this.c = ylbVar;
        editText.setCursorSize(gm.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new eu3(this, i, editText, z));
        editText.setOnFocusChangeListener(new fu3(this, (byte) 0));
        addView(du3Var, qoe.e(-1, -1, 48));
        c();
    }

    public int a() {
        return vm.f();
    }

    public final void c() {
        int i;
        String valueOf;
        du3 du3Var = this.b;
        if (du3Var != null && du3Var.getEditText() != null) {
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
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(22.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(22.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, cmb.j0);
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
        du3 du3Var = this.b;
        du3Var.setText(charSequence);
        du3Var.setSelection(du3Var.getText().length());
        this.a = false;
    }

    @Override
    public final void updateColors() {
        du3 du3Var = this.b;
        if (du3Var != null) {
            try {
                if (du3Var.getEditText() != null) {
                    du3Var.getEditText().setCursorColor(cmb.v0(cmb.F6, this.c));
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
