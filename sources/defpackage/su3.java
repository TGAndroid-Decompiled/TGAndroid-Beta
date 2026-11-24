package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public class su3 extends FrameLayout implements vlb {
    public boolean E;
    public final ylb a;
    public int b;
    public boolean c;
    public final ru3 d;
    public final int e;
    public boolean f;
    public int h;
    public boolean n;
    public boolean r;
    public boolean s;
    public final km w;
    public int x;
    public final ho y;

    public su3(Context context, String str, boolean z, boolean z2, int i, ylb ylbVar) {
        super(context);
        int i2;
        int i3;
        this.h = -1;
        this.w = new km(this);
        ho hoVar = new ho(false, true, true);
        this.y = hoVar;
        hoVar.n(0.2f, 160L, d53.h);
        hoVar.w(gm.L(15.33f));
        hoVar.b = 5;
        this.e = i;
        ru3 ru3Var = new ru3(this, context, ylbVar, i, ylbVar, z2);
        this.d = ru3Var;
        hoVar.setCallback(ru3Var);
        ru3Var.setTextSize(1, 17.0f);
        anb.D(ru3Var, cmb.G6, ylbVar);
        int i4 = cmb.F6;
        anb.X(ru3Var, i4, ylbVar);
        ru3Var.setBackground(null);
        if (z) {
            ru3Var.setMaxLines(5);
            ru3Var.setSingleLine(false);
        } else {
            ru3Var.setMaxLines(1);
            ru3Var.setSingleLine(true);
        }
        int L = gm.L(21.0f);
        int L2 = gm.L(15.0f);
        if (i > 0) {
            i2 = 42;
        } else {
            i2 = 0;
        }
        ru3Var.setPadding(L, L2, gm.L(i2 + 21), gm.L(15.0f));
        ru3Var.setGravity((jb6.a0 ? 5 : 3) | 48);
        if (z) {
            i3 = 131072;
        } else {
            i3 = 0;
        }
        ru3Var.setInputType(i3 | 573441);
        ru3Var.setRawInputType((z ? 131072 : 0) | 573441);
        ru3Var.setHint(str);
        this.a = ylbVar;
        int v0 = cmb.v0(i4, ylbVar);
        this.b = v0;
        ru3Var.setCursorColor(v0);
        ru3Var.setCursorSize(gm.L(19.0f));
        ru3Var.setCursorWidth(1.5f);
        ru3Var.addTextChangedListener(new fj(this, i, z));
        ru3Var.setOnFocusChangeListener(new fu3(this, (byte) 1));
        addView(ru3Var, qoe.e(-1, -1, 48));
        c();
    }

    public final void c() {
        int i;
        String valueOf;
        if (this.d == null) {
            return;
        }
        this.x = this.e - getText().length();
        if ((TextUtils.isEmpty(getText()) && !this.f) || ((this.n && (!this.s || this.r)) || ((i = this.h) != -1 && this.x > i))) {
            valueOf = "";
        } else {
            valueOf = String.valueOf(this.x);
        }
        this.y.t(valueOf, true, true);
    }

    public final void d(Runnable runnable) {
        ru3 ru3Var = this.d;
        ru3Var.setImeOptions(6);
        ru3Var.setOnEditorActionListener(new uy1(runnable, (byte) 2));
    }

    public CharSequence getText() {
        return this.d.getText();
    }

    public TLRPC.TL_textWithEntities getTextWithEntities() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        CharSequence[] charSequenceArr = {getText()};
        tL_textWithEntities.entities = hs6.d0(z8c.t0).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        return tL_textWithEntities;
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

    public void setDivider(boolean z) {
        this.E = z;
        setWillNotDraw(!z);
    }

    public void setShowLimitOnFocus(boolean z) {
        this.n = z;
    }

    public void setShowLimitWhenEmpty(boolean z) {
        this.f = z;
        if (z) {
            c();
        }
    }

    public void setShowLimitWhenNear(int i) {
        this.h = i;
        c();
    }

    public void setText(TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.c = true;
        CharSequence h0 = k47.h0(tL_textWithEntities, false);
        ru3 ru3Var = this.d;
        ru3Var.setText(h0);
        ru3Var.setSelection(ru3Var.getText().length());
        this.c = false;
    }

    @Override
    public final void updateColors() {
        ru3 ru3Var = this.d;
        if (ru3Var != null) {
            try {
                int v0 = cmb.v0(cmb.F6, this.a);
                if (v0 != this.b) {
                    this.b = v0;
                    ru3Var.setCursorColor(v0);
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public void a(boolean z) {
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void b(Editable editable) {
    }

    public void setText(CharSequence charSequence) {
        this.c = true;
        ru3 ru3Var = this.d;
        ru3Var.setText(charSequence);
        ru3Var.setSelection(ru3Var.getText().length());
        this.c = false;
    }
}
