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
public final class j30 extends FrameLayout implements cr3, vlb {
    public final int E;
    public final int F;
    public byte G;
    public int H;
    public final RadialProgress2 I;
    public final int J;
    public final SpannableStringBuilder K;
    public final ylb L;
    public boolean a;
    public byte b;
    public int c;
    public int d;
    public final int e;
    public cn f;
    public StaticLayout h;
    public final int n;
    public cn r;
    public StaticLayout s;
    public final ImageView w;
    public k47 x;
    public boolean y;

    public j30(int i, ylb ylbVar, Activity activity) {
        super(activity);
        int i2;
        this.e = gm.L(9.0f);
        this.n = gm.L(29.0f);
        int i3 = z8c.t0;
        this.E = i3;
        setWillNotDraw(false);
        this.L = ylbVar;
        this.J = i;
        ImageView imageView = new ImageView(activity);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231248);
        anb.s(imageView, cmb.l6, ylbVar, PorterDuff.Mode.SRC_IN);
        int i4 = cmb.h6;
        fg0 f0 = cmb.f0(cmb.v0(i4, ylbVar), 1, -1);
        wmb M = anb.M(i4);
        imageView.setBackground(f0);
        anb.j(imageView, f0, null, M, ylbVar);
        if (jb6.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        addView(imageView, qoe.d(42, 42.0f, i2 | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new x10((byte) 1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, ylbVar);
        this.I = radialProgress2;
        radialProgress2.g(cmb.Ye, cmb.Ze, cmb.kd, cmb.ld);
        this.F = er3.q(i3).k();
        setFocusable(true);
        if (i == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.K = spannableStringBuilder;
            spannableStringBuilder.setSpan(new gq3(), 0, 1, 0);
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
    public final void A(boolean z) {
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
                bc4.G(i).X(this.x.F0(), this.x, 1, 0);
            }
            MediaController w = MediaController.w();
            k47 k47Var = this.x;
            int indexOf = w.S0.indexOf(k47Var);
            if (indexOf == -1) {
                z = w.R(k47Var);
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
            bc4.G(i).X(this.x.F0(), this.x, 1, 0);
            this.G = (byte) 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (b == 4) {
            bc4.G(i).f(this.x.F0());
            this.G = (byte) 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j30.b(boolean, boolean):void");
    }

    public k47 getMessageObject() {
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
        this.f = gn.update(0, this, this.f, this.h);
        this.r = gn.update(0, this, this.r, this.s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.f();
        er3.q(this.E).v(this);
        gn.release(this, this.f);
        gn.release(this, this.r);
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
            if (jb6.a0) {
                f = 16.0f;
            } else {
                f = gm.C;
            }
            int L = gm.L(f);
            if (jb6.a0 && imageView.getVisibility() == 0) {
                i = gm.L(32.0f);
            } else {
                i = 0;
            }
            canvas.translate(L + i, this.e);
            this.h.draw(canvas);
            gn.drawAnimatedEmojis(canvas, this.h, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.s;
        ylb ylbVar = this.L;
        if (staticLayout2 != null) {
            cmb.f3.setColor(cmb.v0(cmb.y6, ylbVar));
            canvas.save();
            if (!jb6.a0) {
                f2 = gm.C;
            }
            int L2 = gm.L(f2);
            if (jb6.a0 && imageView.getVisibility() == 0) {
                i2 = gm.L(32.0f);
            }
            canvas.translate(L2 + i2, this.n);
            this.s.draw(canvas);
            gn.drawAnimatedEmojis(canvas, this.s, this.r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int v0 = cmb.v0(cmb.Yd, ylbVar);
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.d = v0;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.y && (U0 = cmb.U0("paintDivider", ylbVar)) != null) {
            if (jb6.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - gm.L(gm.C), getHeight(), U0);
            } else {
                canvas.drawRect(gm.L(gm.C), getHeight() - 1, getWidth(), getHeight(), U0);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.x.I3()) {
            accessibilityNodeInfo.setText(jb6.a0("AccDescrMusicInfo", null, 2131754831, this.x.w1(true), this.x.y1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.s.getText()));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        CharSequence charSequence;
        CharSequence charSequence2;
        ylb ylbVar = this.L;
        this.s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i) - gm.L(gm.C)) - gm.L(48.0f);
        try {
            String y1 = this.x.y1(true);
            CharSequence ellipsize = TextUtils.ellipsize(y1.replace('\n', ' '), cmb.e3, Math.min((int) Math.ceil(cmb.e3.measureText(y1)), size), TextUtils.TruncateAt.END);
            CharSequence v1 = gm.v1(ellipsize, this.x.a2, ylbVar);
            if (v1 == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = v1;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, cmb.e3, size + gm.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f = gn.update(0, this, this.f, staticLayout);
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            CharSequence replace = this.x.w1(true).replace('\n', ' ');
            if (this.J == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.K).append(' ').append(ch4.c(this.x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, cmb.f3, size, TextUtils.TruncateAt.END);
            CharSequence v12 = gm.v1(ellipsize2, this.x.a2, ylbVar);
            if (v12 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = v12;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, cmb.f3, size + gm.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout2;
            this.r = gn.update(0, this, this.r, staticLayout2);
        } catch (Exception e2) {
            fc4.g(e2, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(56.0f), 1073741824));
        int L2 = gm.L(52.0f);
        if (jb6.a0) {
            L = kt6.y(8.0f, View.MeasureSpec.getSize(i), L2);
        } else {
            L = gm.L(8.0f);
        }
        int L3 = gm.L(4.0f) + L;
        this.c = L3;
        int L4 = gm.L(6.0f);
        this.d = L4;
        this.I.p(L3, L4, gm.L(48.0f) + L, gm.L(50.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j30.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        k47 k47Var;
        int i;
        try {
            RadialProgress2 radialProgress2 = this.I;
            if (radialProgress2 != null && (k47Var = this.x) != null && this.b != 0) {
                if (k47Var.O3()) {
                    i = cmb.Dc;
                } else {
                    i = cmb.Ye;
                }
                radialProgress2.l(cmb.v0(i, this.L));
                invalidate();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
