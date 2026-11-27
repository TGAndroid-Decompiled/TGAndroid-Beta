package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.view.View;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;
public final class cw implements kmb, ti7, rib {
    public SpannableStringBuilder E;
    public int F = -1;
    public int G = -1;
    public int H = -1;
    public dm I;
    public ArrayList J;
    public Stack K;
    public AtomicReference L;
    public View M;
    public final xi5 a;
    public View b;
    public boolean c;
    public StaticLayout d;
    public f66 e;
    public f66 f;
    public f66 h;
    public TL_iv.PageBlock n;
    public TL_iv.RichText r;
    public int s;
    public int w;
    public int x;
    public CharSequence y;

    public cw(xi5 xi5Var) {
        this.a = xi5Var;
    }

    @Override
    public final Layout a() {
        return this.d;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final Rect c() {
        return null;
    }

    @Override
    public final void d(Canvas canvas, View view) {
        float width;
        Object obj;
        TL_iv.RichText richText;
        this.c = true;
        this.b = view;
        xi5 xi5Var = this.a;
        float f = 0.0f;
        if (!xi5Var.F.isEmpty()) {
            pw pwVar = (pw) xi5Var.F.get(xi5Var.H);
            if (pwVar.c == this.n && ((obj = pwVar.b) == (richText = this.r) || ((obj instanceof String) && richText == null))) {
                if (-1 != pwVar.a) {
                    f66 f66Var = new f66(0);
                    this.h = f66Var;
                    f66Var.n = false;
                    f66Var.d(this.d, pwVar.a, 0.0f);
                    this.h.o = 0;
                    StaticLayout staticLayout = this.d;
                    int i = pwVar.a;
                    staticLayout.getSelectionPath(i, xi5Var.G.length() + i, this.h);
                    this.h.n = true;
                }
            } else {
                this.h = null;
            }
        } else {
            this.h = null;
        }
        f66 f66Var2 = this.h;
        if (f66Var2 != null) {
            canvas.drawPath(f66Var2, o.A1);
        }
        f66 f66Var3 = this.e;
        if (f66Var3 != null) {
            canvas.drawPath(f66Var3, o.z1);
        }
        f66 f66Var4 = this.f;
        if (f66Var4 != null) {
            canvas.drawPath(f66Var4, o.B1);
        }
        if (xi5Var.c.h(canvas, this)) {
            view.invalidate();
        }
        if (xi5Var.d == this && xi5Var.b == null && xi5Var.h) {
            int lineCount = this.d.getLineCount();
            StaticLayout staticLayout2 = this.d;
            if (lineCount == 1) {
                width = staticLayout2.getLineWidth(0);
                f = this.d.getLineLeft(0);
            } else {
                width = staticLayout2.getWidth();
            }
            canvas.drawRect((-hl.L(2.0f)) + f, 0.0f, f + width + hl.L(2.0f), this.d.getHeight(), o.y1);
        }
        ArrayList arrayList = this.J;
        if (arrayList != null && !arrayList.isEmpty()) {
            npa.g(view, false, this.d.getPaint().getColor(), 0, this.L, 0, this.d, this.J, canvas, false);
        } else {
            this.d.draw(canvas);
        }
        this.c = false;
    }

    @Override
    public final View e() {
        View view = this.M;
        if (view != null) {
            return view;
        }
        return this.b;
    }

    @Override
    public final void f(View view) {
        if (view == null) {
            view = this.M;
        }
        hm.release(view, this.I);
        this.M = null;
    }

    @Override
    public final void g(int i) {
        this.x = i;
    }

    @Override
    public final CharSequence getPrefix() {
        return this.y;
    }

    @Override
    public final int getRow() {
        return this.x;
    }

    @Override
    public final CharSequence getText() {
        return this.d.getText();
    }

    @Override
    public final int getX() {
        return this.s;
    }

    @Override
    public final int getY() {
        return this.w;
    }

    @Override
    public final void h(int i) {
        this.w = i;
    }

    @Override
    public final void i(View view) {
        this.M = view;
        StaticLayout staticLayout = this.d;
        if (staticLayout != null) {
            this.I = hm.update(0, view, false, this.I, staticLayout);
        }
    }

    @Override
    public final void j(int i) {
        this.s = i;
    }

    public final int k() {
        int i = this.F;
        if (i != -1) {
            return i;
        }
        this.F = this.d.getWidth();
        int i2 = 0;
        while (true) {
            int lineCount = this.d.getLineCount();
            int i3 = this.F;
            if (i2 < lineCount) {
                this.F = Math.min(i3, (int) this.d.getLineLeft(i2));
                i2++;
            } else {
                return i3;
            }
        }
    }

    public final int l() {
        int i = this.G;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        this.G = 0;
        while (true) {
            int lineCount = this.d.getLineCount();
            int i3 = this.G;
            if (i2 < lineCount) {
                this.G = Math.max(i3, (int) this.d.getLineRight(i2));
                i2++;
            } else {
                return i3;
            }
        }
    }

    public final int m() {
        int i = this.H;
        if (i != -1) {
            return i;
        }
        this.H = 0;
        if (this.d.getLineCount() > 0) {
            int i2 = this.H;
            StaticLayout staticLayout = this.d;
            this.H = Math.max(i2, (int) staticLayout.getLineRight(staticLayout.getLineCount() - 1));
        }
        return this.H;
    }
}
