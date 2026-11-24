package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
public abstract class ws3 extends FrameLayout implements tjb {
    public boolean E;
    public boolean a;
    public final ts3 b;
    public final wjb c;
    public final int d;
    public boolean e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final kl w;
    public int x;
    public final gn y;

    public ws3(Context context, cja cjaVar, String str, boolean z, int i, wjb wjbVar) {
        super(context);
        int i2;
        this.f = -1;
        this.r = true;
        gn gnVar = new gn(false, true, true);
        this.y = gnVar;
        gnVar.n(0.2f, 160L, s33.h);
        gnVar.w(gl.L(15.33f));
        gnVar.b = 5;
        this.d = i;
        ts3 ts3Var = new ts3(this, context, cjaVar, wjbVar, z);
        this.b = ts3Var;
        gt3 editText = ts3Var.getEditText();
        editText.setDelegate(new tg2(this, editText, false, (byte) 24));
        ts3Var.setWillNotDraw(false);
        this.w = new kl(ts3Var);
        gnVar.setCallback(ts3Var);
        editText.setTextSize(1, 17.0f);
        zkb.D(editText, bkb.G6, wjbVar);
        int i3 = bkb.F6;
        zkb.X(editText, i3, wjbVar);
        editText.setBackground(null);
        if (z) {
            editText.setMaxLines(5);
            editText.setSingleLine(false);
        } else {
            editText.setMaxLines(1);
            editText.setSingleLine(true);
        }
        editText.setPadding(editText.getPaddingLeft(), editText.getPaddingTop(), gl.L(0.0f), editText.getPaddingBottom());
        editText.setGravity((k96.a0 ? 5 : 3) | 48);
        if (z) {
            i2 = 131072;
        } else {
            i2 = 0;
        }
        editText.setInputType(i2 | 573441);
        editText.setRawInputType(573441);
        editText.setHint(str);
        zkb.l(editText, 30, i3, wjbVar);
        this.c = wjbVar;
        editText.setCursorSize(gl.L(19.0f));
        editText.setCursorWidth(1.5f);
        editText.addTextChangedListener(new us3(this, i, editText, z));
        editText.setOnFocusChangeListener(new vs3(this, (byte) 0));
        addView(ts3Var, nme.e(-1, -1, 48));
        c();
    }

    public int a() {
        return vl.f();
    }

    public final void c() {
        int i;
        String valueOf;
        ts3 ts3Var = this.b;
        if (ts3Var != null && ts3Var.getEditText() != null) {
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
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(22.0f);
            }
            float f = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(22.0f);
            } else {
                i = 0;
            }
            canvas.drawLine(f, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, bkb.j0);
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
        ts3 ts3Var = this.b;
        ts3Var.setText(charSequence);
        ts3Var.setSelection(ts3Var.getText().length());
        this.a = false;
    }

    @Override
    public final void updateColors() {
        ts3 ts3Var = this.b;
        if (ts3Var != null) {
            try {
                if (ts3Var.getEditText() != null) {
                    ts3Var.getEditText().setCursorColor(bkb.v0(bkb.F6, this.c));
                }
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }
}
