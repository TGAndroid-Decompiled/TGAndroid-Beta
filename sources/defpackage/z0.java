package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_aicompose;
public final class z0 extends FrameLayout {
    public final int a;
    public final wjb b;
    public final w0 c;
    public final FrameLayout d;
    public int e;
    public boolean f;
    public int h;
    public final lm n;
    public int r;
    public final lm s;
    public r w;

    public z0(Context context, int i, int i2, boolean z, wjb wjbVar) {
        super(context);
        this.r = -1;
        this.a = i;
        this.b = wjbVar;
        w0 w0Var = new w0(this, context, wjbVar);
        this.c = w0Var;
        w0Var.setOrientation(i2);
        s33 s33Var = s33.h;
        this.n = new lm(w0Var, 0L, 320L, s33Var);
        this.s = new lm(w0Var, 0L, 320L, s33Var);
        if (z) {
            if (i2 == 0) {
                HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                this.d = horizontalScrollView;
                horizontalScrollView.setFillViewport(true);
            } else {
                ScrollView scrollView = new ScrollView(context);
                this.d = scrollView;
                scrollView.setFillViewport(true);
            }
            this.d.addView(w0Var);
            addView(this.d, nme.e(-1, -1, 119));
            return;
        }
        this.d = null;
        addView(w0Var, nme.e(-1, -1, 119));
    }

    public final void a(int i, String str, p8c p8cVar) {
        int i2;
        w0 w0Var = this.c;
        int childCount = w0Var.getChildCount();
        y0 y0Var = new y0(this.a, this.b, getContext());
        y0Var.c = this.e;
        y0Var.updateColors();
        int i3 = 0;
        y0Var.f = false;
        y0Var.h.setImageResource(i);
        y0Var.n.setText(str);
        y0Var.setOnClickListener(new v0(p8cVar, childCount, (byte) 0));
        if (w0Var.getOrientation() == 0) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        if (w0Var.getOrientation() != 1) {
            i3 = -1;
        }
        w0Var.addView(y0Var, nme.p(i2, i3, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, p8c p8cVar) {
        int i;
        y0 y0Var = new y0(this.a, this.b, getContext());
        y0Var.e = aiComposeTone;
        y0Var.c = this.e;
        y0Var.updateColors();
        int i2 = 0;
        TextView textView = y0Var.n;
        be0 be0Var = y0Var.h;
        if (aiComposeTone == null) {
            y0Var.d = false;
            y0Var.updateColors();
            String M0 = k96.M0(2131754975, null);
            y0Var.f = false;
            be0Var.setImageResource(2131232787);
            textView.setText(M0);
        } else if (aiComposeTone instanceof t0) {
            y0Var.d = false;
            y0Var.updateColors();
            String M02 = k96.M0(2131754973, null);
            y0Var.f = false;
            be0Var.setImageResource(2131231582);
            textView.setText(M02);
        } else {
            y0Var.a(null, aiComposeTone.title, Long.valueOf(aiComposeTone.emoji_id));
        }
        y0Var.setOnClickListener(new t(p8cVar, aiComposeTone, (byte) 2));
        y0Var.setOnLongClickListener(new u0(this, y0Var, (byte) 0));
        w0 w0Var = this.c;
        if (w0Var.getOrientation() == 0) {
            i = 0;
        } else {
            i = -1;
        }
        if (w0Var.getOrientation() != 1) {
            i2 = -1;
        }
        w0Var.addView(y0Var, nme.p(i, i2, 1.0f, 119));
    }

    public final void c(int i, boolean z) {
        float f;
        int i2 = this.h;
        if (i2 == i) {
            return;
        }
        this.h = i;
        lm lmVar = this.n;
        lm lmVar2 = this.s;
        if (i >= 0) {
            if (i2 < 0 && lmVar2.c < 0.01f) {
                lmVar.e(true, i);
            }
            this.r = i;
        }
        if (!z) {
            int i3 = this.h;
            if (i3 < 0) {
                i3 = this.r;
            }
            lmVar.e(true, i3);
            if (this.h >= 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            lmVar2.e(true, f);
        }
        w0 w0Var = this.c;
        if (i >= 0 && i < w0Var.getChildCount()) {
            View childAt = w0Var.getChildAt(i);
            if (childAt instanceof y0) {
                be0 be0Var = ((y0) childAt).h;
                if (be0Var.getAnimatedEmojiDrawable() != null) {
                    ml mlVar = be0Var.getAnimatedEmojiDrawable().k;
                    if (mlVar != null) {
                        mlVar.w0(false);
                    }
                } else {
                    be0Var.getImageReceiver().w0(false);
                }
            }
        }
        w0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone, boolean z) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i = 0;
        while (true) {
            w0 w0Var = this.c;
            if (i < w0Var.getChildCount()) {
                View childAt = w0Var.getChildAt(i);
                if ((childAt instanceof y0) && (aiComposeTone2 = ((y0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
                    c(i, z);
                    return;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f) {
            Paint U0 = bkb.U0("paintDivider", this.b);
            if (U0 == null) {
                U0 = bkb.j0;
            }
            canvas.drawRect(gl.L(10.0f), getHeight() - 1, getWidth() - gl.L(10.0f), getHeight(), U0);
        }
    }

    public int getSelectedTab() {
        return this.h;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i = this.h;
        if (i >= 0) {
            w0 w0Var = this.c;
            if (i < w0Var.getChildCount()) {
                View childAt = w0Var.getChildAt(this.h);
                if (childAt instanceof y0) {
                    return ((y0) childAt).e;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
    }

    public void setDivider(boolean z) {
        this.f = z;
    }

    @Override
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.c.setPadding(i, i2, i3, i4);
    }

    public void setRoundRadius(int i) {
        this.e = i;
    }
}
