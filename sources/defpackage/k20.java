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
public final class k20 extends FrameLayout implements jq3, snb {
    public final int E;
    public final int F;
    public byte G;
    public int H;
    public final RadialProgress2 I;
    public final int J;
    public final SpannableStringBuilder K;
    public final vnb L;
    public boolean a;
    public byte b;
    public int c;
    public int d;
    public final int e;
    public dm f;
    public StaticLayout h;
    public final int n;
    public dm r;
    public StaticLayout s;
    public final ImageView w;
    public r47 x;
    public boolean y;

    public k20(int i, vnb vnbVar, Activity activity) {
        super(activity);
        int i2;
        this.e = hl.L(9.0f);
        this.n = hl.L(29.0f);
        int i3 = yac.t0;
        this.E = i3;
        setWillNotDraw(false);
        this.L = vnbVar;
        this.J = i;
        ImageView imageView = new ImageView(activity);
        this.w = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231247);
        yob.s(imageView, aob.m6, vnbVar, PorterDuff.Mode.SRC_IN);
        int i4 = aob.i6;
        hf0 f0 = aob.f0(aob.v0(i4, vnbVar), 1, -1);
        uob M = yob.M(i4);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, vnbVar);
        if (ob6.a0) {
            i2 = 3;
        } else {
            i2 = 5;
        }
        addView(imageView, tre.d(42, 42.0f, i2 | 16, 5.0f, 0.0f, 5.0f, 0.0f));
        imageView.setOnClickListener(new y00((byte) 1));
        RadialProgress2 radialProgress2 = new RadialProgress2(this, vnbVar);
        this.I = radialProgress2;
        radialProgress2.g(aob.Ze, aob.af, aob.ld, aob.md);
        this.F = lq3.q(i3).k();
        setFocusable(true);
        if (i == 1) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(".");
            this.K = spannableStringBuilder;
            spannableStringBuilder.setSpan(new np3(), 0, 1, 0);
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
                xb4.G(i).X(this.x.F0(), this.x, 1, 0);
            }
            MediaController z2 = MediaController.z();
            r47 r47Var = this.x;
            int indexOf = z2.S0.indexOf(r47Var);
            if (indexOf == -1) {
                z = z2.V(r47Var);
            } else {
                z2.W(indexOf);
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
            if (MediaController.z().U(this.x, true)) {
                this.G = (byte) 0;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                invalidate();
            }
        } else if (b == 2) {
            radialProgress2.o(false, 0.0f);
            xb4.G(i).X(this.x.F0(), this.x, 1, 0);
            this.G = (byte) 4;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        } else if (b == 4) {
            xb4.G(i).f(this.x.F0());
            this.G = (byte) 2;
            radialProgress2.setIcon(getIconForCurrentState(), false, true);
            invalidate();
        }
    }

    public final void b(boolean r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k20.b(boolean, boolean):void");
    }

    public r47 getMessageObject() {
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
        this.f = hm.update(0, this, this.f, this.h);
        this.r = hm.update(0, this, this.r, this.s);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.I.f();
        lq3.q(this.E).v(this);
        hm.release(this, this.f);
        hm.release(this, this.r);
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
            if (ob6.a0) {
                f = 16.0f;
            } else {
                f = hl.C;
            }
            int L = hl.L(f);
            if (ob6.a0 && imageView.getVisibility() == 0) {
                i = hl.L(32.0f);
            } else {
                i = 0;
            }
            canvas.translate(L + i, this.e);
            this.h.draw(canvas);
            hm.drawAnimatedEmojis(canvas, this.h, this.f, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        StaticLayout staticLayout2 = this.s;
        vnb vnbVar = this.L;
        if (staticLayout2 != null) {
            aob.g3.setColor(aob.v0(aob.z6, vnbVar));
            canvas.save();
            if (!ob6.a0) {
                f2 = hl.C;
            }
            int L2 = hl.L(f2);
            if (ob6.a0 && imageView.getVisibility() == 0) {
                i2 = hl.L(32.0f);
            }
            canvas.translate(L2 + i2, this.n);
            this.s.draw(canvas);
            hm.drawAnimatedEmojis(canvas, this.s, this.r, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            canvas.restore();
        }
        int v0 = aob.v0(aob.Zd, vnbVar);
        RadialProgress2 radialProgress2 = this.I;
        radialProgress2.d = v0;
        radialProgress2.draw(canvas);
        super.onDraw(canvas);
        if (this.y && (U0 = aob.U0("paintDivider", vnbVar)) != null) {
            if (ob6.a0) {
                canvas.drawRect(0.0f, getHeight() - 1, getWidth() - hl.L(hl.C), getHeight(), U0);
            } else {
                canvas.drawRect(hl.L(hl.C), getHeight() - 1, getWidth(), getHeight(), U0);
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (this.x.I3()) {
            accessibilityNodeInfo.setText(ob6.a0("AccDescrMusicInfo", null, 2131754827, this.x.w1(true), this.x.y1(true)));
            return;
        }
        accessibilityNodeInfo.setText(((Object) this.h.getText()) + ", " + ((Object) this.s.getText()));
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int L;
        CharSequence charSequence;
        CharSequence charSequence2;
        vnb vnbVar = this.L;
        this.s = null;
        this.h = null;
        int size = (View.MeasureSpec.getSize(i) - hl.L(hl.C)) - hl.L(48.0f);
        try {
            String y1 = this.x.y1(true);
            CharSequence ellipsize = TextUtils.ellipsize(y1.replace('\n', ' '), aob.f3, Math.min((int) Math.ceil(aob.f3.measureText(y1)), size), TextUtils.TruncateAt.END);
            CharSequence v1 = hl.v1(ellipsize, this.x.a2, vnbVar);
            if (v1 == null) {
                charSequence2 = ellipsize;
            } else {
                charSequence2 = v1;
            }
            StaticLayout staticLayout = new StaticLayout(charSequence2, aob.f3, size + hl.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.h = staticLayout;
            this.f = hm.update(0, this, this.f, staticLayout);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            CharSequence replace = this.x.w1(true).replace('\n', ' ');
            if (this.J == 1) {
                replace = new SpannableStringBuilder(replace).append(' ').append((CharSequence) this.K).append(' ').append(yg4.c(this.x, true, 2, null));
            }
            CharSequence ellipsize2 = TextUtils.ellipsize(replace, aob.g3, size, TextUtils.TruncateAt.END);
            CharSequence v12 = hl.v1(ellipsize2, this.x.a2, vnbVar);
            if (v12 == null) {
                charSequence = ellipsize2;
            } else {
                charSequence = v12;
            }
            StaticLayout staticLayout2 = new StaticLayout(charSequence, aob.g3, size + hl.L(4.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.s = staticLayout2;
            this.r = hm.update(0, this, this.r, staticLayout2);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(56.0f), 1073741824));
        int L2 = hl.L(52.0f);
        if (ob6.a0) {
            L = qu6.x(8.0f, View.MeasureSpec.getSize(i), L2);
        } else {
            L = hl.L(8.0f);
        }
        int L3 = hl.L(4.0f) + L;
        this.c = L3;
        int L4 = hl.L(6.0f);
        this.d = L4;
        this.I.p(L3, L4, hl.L(48.0f) + L, hl.L(50.0f));
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k20.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public final void updateColors() {
        r47 r47Var;
        int i;
        try {
            RadialProgress2 radialProgress2 = this.I;
            if (radialProgress2 != null && (r47Var = this.x) != null && this.b != 0) {
                if (r47Var.O3()) {
                    i = aob.Ec;
                } else {
                    i = aob.Ze;
                }
                radialProgress2.l(aob.v0(i, this.L));
                invalidate();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    @Override
    public final void l(long j, long j2) {
    }
}
