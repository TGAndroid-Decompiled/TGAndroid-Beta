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
public final class a1 extends FrameLayout {
    public final int a;
    public final vnb b;
    public final x0 c;
    public final FrameLayout d;
    public int e;
    public boolean f;
    public int h;
    public final mm n;
    public int r;
    public final mm s;
    public r w;

    public a1(Context context, int i, int i2, boolean z, vnb vnbVar) {
        super(context);
        this.r = -1;
        this.a = i;
        this.b = vnbVar;
        x0 x0Var = new x0(this, context, vnbVar);
        this.c = x0Var;
        x0Var.setOrientation(i2);
        k43 k43Var = k43.h;
        this.n = new mm(x0Var, 0L, 320L, k43Var);
        this.s = new mm(x0Var, 0L, 320L, k43Var);
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
            this.d.addView(x0Var);
            addView(this.d, tre.e(-1, -1, 119));
            return;
        }
        this.d = null;
        addView(x0Var, tre.e(-1, -1, 119));
    }

    public final void a(int i, String str, pcc pccVar) {
        int i2;
        x0 x0Var = this.c;
        int childCount = x0Var.getChildCount();
        z0 z0Var = new z0(this.a, this.b, getContext());
        z0Var.c = this.e;
        z0Var.updateColors();
        int i3 = 0;
        z0Var.f = false;
        z0Var.h.setImageResource(i);
        z0Var.n.setText(str);
        z0Var.setOnClickListener(new w0(pccVar, childCount, (byte) 0));
        if (x0Var.getOrientation() == 0) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        if (x0Var.getOrientation() != 1) {
            i3 = -1;
        }
        x0Var.addView(z0Var, tre.p(i2, i3, 1.0f, 119));
    }

    public final void b(TL_aicompose.AiComposeTone aiComposeTone, pcc pccVar) {
        int i;
        z0 z0Var = new z0(this.a, this.b, getContext());
        z0Var.e = aiComposeTone;
        z0Var.c = this.e;
        z0Var.updateColors();
        int i2 = 0;
        TextView textView = z0Var.n;
        de0 de0Var = z0Var.h;
        if (aiComposeTone == null) {
            z0Var.d = false;
            z0Var.updateColors();
            String M0 = ob6.M0(2131754972, null);
            z0Var.f = false;
            de0Var.setImageResource(2131232806);
            textView.setText(M0);
        } else if (aiComposeTone instanceof u0) {
            z0Var.d = false;
            z0Var.updateColors();
            String M02 = ob6.M0(2131754970, null);
            z0Var.f = false;
            de0Var.setImageResource(2131231582);
            textView.setText(M02);
        } else {
            z0Var.a(null, aiComposeTone.title, Long.valueOf(aiComposeTone.emoji_id));
        }
        z0Var.setOnClickListener(new t(pccVar, aiComposeTone, (byte) 2));
        z0Var.setOnLongClickListener(new v0(this, z0Var, (byte) 0));
        x0 x0Var = this.c;
        if (x0Var.getOrientation() == 0) {
            i = 0;
        } else {
            i = -1;
        }
        if (x0Var.getOrientation() != 1) {
            i2 = -1;
        }
        x0Var.addView(z0Var, tre.p(i, i2, 1.0f, 119));
    }

    public final void c(int i, boolean z) {
        float f;
        int i2 = this.h;
        if (i2 == i) {
            return;
        }
        this.h = i;
        mm mmVar = this.n;
        mm mmVar2 = this.s;
        if (i >= 0) {
            if (i2 < 0 && mmVar2.c < 0.01f) {
                mmVar.e(true, i);
            }
            this.r = i;
        }
        if (!z) {
            int i3 = this.h;
            if (i3 < 0) {
                i3 = this.r;
            }
            mmVar.e(true, i3);
            if (this.h >= 0) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            mmVar2.e(true, f);
        }
        x0 x0Var = this.c;
        if (i >= 0 && i < x0Var.getChildCount()) {
            View childAt = x0Var.getChildAt(i);
            if (childAt instanceof z0) {
                de0 de0Var = ((z0) childAt).h;
                if (de0Var.getAnimatedEmojiDrawable() != null) {
                    nl nlVar = de0Var.getAnimatedEmojiDrawable().k;
                    if (nlVar != null) {
                        nlVar.w0(false);
                    }
                } else {
                    de0Var.getImageReceiver().w0(false);
                }
            }
        }
        x0Var.invalidate();
    }

    public final void d(TL_aicompose.AiComposeTone aiComposeTone, boolean z) {
        TL_aicompose.AiComposeTone aiComposeTone2;
        int i = 0;
        while (true) {
            x0 x0Var = this.c;
            if (i < x0Var.getChildCount()) {
                View childAt = x0Var.getChildAt(i);
                if ((childAt instanceof z0) && (aiComposeTone2 = ((z0) childAt).e) != null && aiComposeTone2 == aiComposeTone) {
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
            Paint U0 = aob.U0("paintDivider", this.b);
            if (U0 == null) {
                U0 = aob.j0;
            }
            canvas.drawRect(hl.L(10.0f), getHeight() - 1, getWidth() - hl.L(10.0f), getHeight(), U0);
        }
    }

    public int getSelectedTab() {
        return this.h;
    }

    public TL_aicompose.AiComposeTone getSelectedTone() {
        int i = this.h;
        if (i >= 0) {
            x0 x0Var = this.c;
            if (i < x0Var.getChildCount()) {
                View childAt = x0Var.getChildAt(this.h);
                if (childAt instanceof z0) {
                    return ((z0) childAt).e;
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
