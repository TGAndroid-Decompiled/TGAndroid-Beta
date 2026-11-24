package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.RadialProgress2;
public final class j20 extends FrameLayout implements sp3, tjb {
    public final int E;
    public final int F;
    public byte G;
    public int H;
    public final RadialProgress2 I;
    public final int J;
    public final SpannableStringBuilder K;
    public final wjb L;
    public boolean a;
    public byte b;
    public int c;
    public int d;
    public final int e;
    public cm f;
    public StaticLayout h;
    public final int n;
    public cm r;
    public StaticLayout s;
    public final ImageView w;
    public k27 x;
    public boolean y;

    public j20(int i, wjb wjbVar, Activity activity) {
        super(activity);
        int i2;
        this.e = gl.L(9.0f);
        this.n = gl.L(29.0f);
        int i3 = y6c.t0;
        this.E = i3;
        setWillNotDraw(false);
        this.L = wjbVar;
        this.J = i;
        ImageView imageView = new ImageView(activity);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231247);
        zkb.s(imageView, bkb.l6, wjbVar, PorterDuff.Mode.SRC_IN);
        int i4 = bkb.h6;
        ff0 f0 = bkb.f0(bkb.v0(i4, wjbVar), 1, -1);
        vkb M = zkb.M(i4);
        imageView.setBackground(f0);
        zkb.j(imageView, f0, null, M, wjbVar);
        if (k96.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        addView(imageView, nme.d(42, 42.0f, i2 | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new x00((byte) 1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, wjbVar);
        this.I = radialProgress2;
        radialProgress2.g(bkb.Ye, bkb.Ze, bkb.kd, bkb.ld);
        this.F = up3.q(i3).k();
        setFocusable(true);
        if (i == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.K = spannableStringBuilder;
            spannableStringBuilder.setSpan(new wo3(), 0, 1, 0);
        }
    }

    private int getIconForCurrentState() {
        byte b = this.G;
        if (b == 1) {
            return 1;
        }
        if (b == 2) {
            return 2;
        }
        if (b == 4) {
            return 3;
        }
        return 0;
    }

    private int getMiniIconForCurrentState() {
        int i = this.H;
        if (i < 0) {
            return 4;
        }
        if (i == 0) {
            return 2;
        }
        return 3;
    }

    @Override
    public final void B(boolean z) {
        b(true, z);
    }

    @Override
    public final void N(String str) {
        this.I.o(true, 1.0f);
        b(false, true);
    }

    public final void a() {
        boolean z;
        byte b = this.G;
        int i = this.E;
        RadialProgress2 radialProgress2 = this.I;
        if (b == 0) {
            if (this.H == 0) {
                ba4.G(i).X(this.x.F0(), this.x, 1, 0);
            }
            MediaController w = MediaController.w();
            k27 k27Var = this.x;
            int indexOf = w.S0.indexOf(k27Var);
            if (indexOf == -1) {
                z = w.R(k27Var);
            } else {
                w.S(indexOf);
                z = true;
            }
            if (z) {
                if (this.b == 2 && this.H != 1) {
                    this.H = 1;
                    radialProgress2.o(false, 0.0f);
                    radialProgress2.k(getMiniIconForCurrentState(), false, true);
                }
                this.G = (byte) 1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (b == 1) {
            if (MediaController.w().Q(this.x, true)) {
                this.G = (byte) 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (b == 2) {
            radialProgress2.o(false, 0.0f);
            ba4.G(i).X(this.x.F0(), this.x, 1, 0);
            this.G = (byte) 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (b == 4) {
            ba4.G(i).f(this.x.F0());
            this.G = (byte) 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j20.b(boolean, boolean):void");
    }

    public k27 getMessageObject() {
        return this.x;
    }

    @Override
    public int getObserverTag() {
        return this.F;
    }

    @Override
    public final void i(long j, long j2) {
        this.I.o(true, Math.min(1.0f, ((float) j) / ((float) j2)));
        if (this.b != 0) {
            if (this.H != 1) {
                b(false, true);
            }
        } else if (this.G != 4) {
            b(false, true);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.I.e();
        this.f = gm.update(0, this, this.f, this.h);
        this.r = gm.update(0, this, this.r, this.s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.f();
        up3.q(this.E).v(this);
        gm.release(this, this.f);
        gm.release(this, this.r);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint U0;
        float f;
        int i;
        StaticLayout staticLayout = this.h;
        int i2 = 0;
        ImageView imageView = this.w;
        float f2 = 16.0f;
        if (staticLayout != null) {
            canvas.save();
            if (k96.a0) {
                f = 16.0f;
            } else {
                f = gl.C;
            }
            int L = gl.L(f);
            if (k96.a0 && imageView.getVisibility() == 0) {
                i = gl.L(32.0f);
            } else {
                i = 0;
            }
            canvas.translate(L + i, this.e);
            this.h.draw(canvas);
            gm.drawAnimatedEmojis(canvas, this.h, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.s;
        wjb wjbVar = this.L;
        if (staticLayout2 != null) {
            bkb.f3.setColor(bkb.v0(bkb.y6, wjbVar));
            canvas.save();
            if (!k96.a0) {
                f2 = gl.C;
            }
            int L2 = gl.L(f2);
            if (k96.a0 && imageView.getVisibility() == 0) {
                i2 = gl.L(32.0f);
            }
            canvas.translate(L2 + i2, this.n);
            this.s.draw(canvas);
            gm.drawAnimatedEmojis(canvas, this.s, this.r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int v0 = bkb.v0(bkb.Yd, wjbVar);
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.d = v0;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.y && (U0 = bkb.U0("paintDivider", wjbVar)) != null) {
            if (k96.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - gl.L(gl.C), getHeight(), U0);
            } else {
                canvas.drawRect(gl.L(gl.C), getHeight() - 1, getWidth(), getHeight(), U0);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.x.I3()) {
            accessibilityNodeInfo.setText(k96.a0("AccDescrMusicInfo", null, 2131754831, this.x.w1(true), this.x.y1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.s.getText()));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        CharSequence charSequence;
        CharSequence charSequence2;
        wjb wjbVar = this.L;
        this.s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i) - gl.L(gl.C)) - gl.L(48.0f);
        try {
            String y1 = this.x.y1(true);
            CharSequence ellipsize = TextUtils.ellipsize(y1.replace('\n', ' '), bkb.e3, Math.min((int) Math.ceil(bkb.e3.measureText(y1)), size), TextUtils.TruncateAt.END);
            CharSequence v1 = gl.v1(ellipsize, this.x.a2, wjbVar);
            if (v1 == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = v1;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, bkb.e3, size + gl.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f = gm.update(0, this, this.f, staticLayout);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            CharSequence replace = this.x.w1(true).replace('\n', ' ');
            if (this.J == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.K).append(' ').append(af4.c(this.x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, bkb.f3, size, TextUtils.TruncateAt.END);
            CharSequence v12 = gl.v1(ellipsize2, this.x.a2, wjbVar);
            if (v12 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = v12;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, bkb.f3, size + gl.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout2;
            this.r = gm.update(0, this, this.r, staticLayout2);
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(56.0f), 1073741824));
        int L2 = gl.L(52.0f);
        if (k96.a0) {
            L = ls6.x(8.0f, View.MeasureSpec.getSize(i), L2);
        } else {
            L = gl.L(8.0f);
        }
        int L3 = gl.L(4.0f) + L;
        this.c = L3;
        int L4 = gl.L(6.0f);
        this.d = L4;
        this.I.p(L3, L4, gl.L(48.0f) + L, gl.L(50.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j20.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        k27 k27Var;
        int i;
        try {
            RadialProgress2 radialProgress2 = this.I;
            if (radialProgress2 != null && (k27Var = this.x) != null && this.b != 0) {
                if (k27Var.O3()) {
                    i = bkb.Dc;
                } else {
                    i = bkb.Ye;
                }
                radialProgress2.l(bkb.v0(i, this.L));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
