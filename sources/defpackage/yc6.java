package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class yc6 extends FrameLayout {
    public static tk4 y;
    public final in a;
    public final in b;
    public final de0 c;
    public final ShapeDrawable d;
    public boolean e;
    public final vnb f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float w;
    public ValueAnimator x;

    public yc6(Context context, vnb vnbVar) {
        super(context);
        int i;
        float f;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        this.w = 0.0f;
        this.f = vnbVar;
        de0 de0Var = new de0(context);
        this.c = de0Var;
        ShapeDrawable K = aob.K(hl.L(42.0f), -1);
        this.d = K;
        de0Var.setBackground(K);
        de0Var.t(hl.L(30.0f), hl.L(30.0f));
        boolean z = ob6.a0;
        if (z) {
            i = 5;
        } else {
            i = 3;
        }
        int i8 = i | 48;
        if (z) {
            f = 0.0f;
        } else {
            f = 15.0f;
        }
        if (z) {
            f2 = 15.0f;
        } else {
            f2 = 0.0f;
        }
        addView(de0Var, tre.d(42, 42.0f, i8, f, 11.0f, f2, 0.0f));
        in inVar = new in(context, true, true, true);
        this.a = inVar;
        k43 k43Var = k43.h;
        inVar.b(0.4f, 350L, k43Var);
        inVar.setScaleProperty(0.6f);
        inVar.setTextSize(hl.L(16.0f));
        inVar.setEllipsizeByGradient(true);
        yob.U(inVar, aob.G6, vnbVar);
        inVar.setTypeface(hl.o());
        if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        inVar.setGravity(i2);
        inVar.getDrawable().N = hl.q.x;
        jn7.i(inVar);
        boolean z2 = ob6.a0;
        if (z2) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        int i9 = i3 | 48;
        if (z2) {
            i4 = 16;
        } else {
            i4 = 73;
        }
        float f3 = i4;
        if (z2) {
            i5 = 73;
        } else {
            i5 = 16;
        }
        addView(inVar, tre.d(-1, 22.0f, i9, f3, 10.0f, i5, 0.0f));
        in inVar2 = new in(context, true, true, true);
        this.b = inVar2;
        inVar2.setScaleProperty(0.6f);
        inVar2.b(0.4f, 350L, k43Var);
        inVar2.setTextSize(hl.L(14.0f));
        inVar2.setEllipsizeByGradient(true);
        yob.U(inVar2, aob.A6, vnbVar);
        if (ob6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        inVar2.setGravity(i6);
        boolean z3 = ob6.a0;
        int i10 = (z3 ? 5 : 3) | 48;
        if (z3) {
            i7 = 16;
        } else {
            i7 = 73;
        }
        addView(inVar2, tre.d(-1, 20.0f, i10, i7, 35.0f, z3 ? 73 : 16, 0.0f));
        de0Var.setAlpha(this.w);
        inVar.setAlpha(this.w);
        inVar2.setAlpha(this.w);
    }

    public final void a(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, int i, boolean z, boolean z2) {
        int i2;
        boolean z3;
        boolean z4;
        float f;
        long j;
        String str;
        String str2;
        String str3;
        int i3;
        boolean z5;
        CharSequence charSequence;
        boolean z6;
        this.e = z;
        in inVar = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = pv3.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), inVar.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            if (this.h && !ob6.a0 && z2) {
                z6 = true;
            } else {
                z6 = false;
            }
            inVar.c(charSequence, z6, true);
        }
        in inVar2 = this.b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !ob6.a0 && z2) {
                z5 = true;
            } else {
                z5 = false;
            }
            inVar2.c(str4, z5, true);
        }
        int i4 = i % 7;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                i2 = -1285237;
                            } else {
                                i2 = -12338729;
                            }
                        } else {
                            i2 = -7900675;
                        }
                    } else {
                        i2 = -13187226;
                    }
                } else {
                    i2 = -12214795;
                }
            } else {
                i2 = -868277;
            }
        } else {
            i2 = -1351584;
        }
        de0 de0Var = this.c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !"city".equals(tL_messageMediaVenue.icon) && !"country".equals(tL_messageMediaVenue.icon) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                de0Var.o(tL_messageMediaVenue.icon, null, null);
            } else {
                if ("city".equals(tL_messageMediaVenue.icon)) {
                    i3 = 2131231642;
                } else if ("country".equals(tL_messageMediaVenue.icon)) {
                    i3 = 2131231643;
                } else {
                    i3 = 2131232555;
                }
                Drawable mutate = getResources().getDrawable(i3).mutate();
                yob.x(this, mutate, aob.ej, this.f, PorterDuff.Mode.MULTIPLY);
                zm2 zm2Var = new zm2(aob.K(hl.L(42.0f), 0), mutate);
                int L = hl.L(42.0f);
                int L2 = hl.L(42.0f);
                zm2Var.h = L;
                zm2Var.n = L2;
                int L3 = hl.L(24.0f);
                int L4 = hl.L(24.0f);
                zm2Var.e = L3;
                zm2Var.f = L4;
                de0Var.setImageDrawable(zm2Var);
            }
        }
        this.d.getPaint().setColor(i2);
        setWillNotDraw(false);
        if (tL_messageMediaVenue == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        setClickable(z3);
        ValueAnimator valueAnimator = this.x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (tL_messageMediaVenue == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        final float f2 = this.w;
        if (z4) {
            f = 0.0f;
        } else {
            f = 1.0f;
        }
        final float f3 = f;
        final long abs = Math.abs(f2 - f3) * 150.0f;
        this.x = ValueAnimator.ofFloat(f2, f3);
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        this.x.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                float elapsedRealtime2 = (float) (SystemClock.elapsedRealtime() - elapsedRealtime);
                long j2 = abs;
                float f4 = 1.0f;
                float min = Math.min(Math.max(elapsedRealtime2 / ((float) j2), 0.0f), 1.0f);
                if (j2 > 0) {
                    f4 = min;
                }
                float R1 = hl.R1(f2, f3, f4);
                yc6 yc6Var = yc6.this;
                yc6Var.w = R1;
                yc6Var.c.setAlpha(R1);
                yc6Var.a.setAlpha(yc6Var.w);
                yc6Var.b.setAlpha(yc6Var.w);
                yc6Var.invalidate();
            }
        });
        ValueAnimator valueAnimator2 = this.x;
        if (z4) {
            j = Long.MAX_VALUE;
        } else {
            j = abs;
        }
        valueAnimator2.setDuration(j);
        this.x.start();
        de0Var.setAlpha(f2);
        inVar.setAlpha(f2);
        inVar2.setAlpha(f2);
        try {
            try {
                if (tL_messageMediaVenue == null) {
                    setContentDescription(null);
                } else {
                    StringBuilder sb = new StringBuilder();
                    if (tL_messageMediaVenue != null && !TextUtils.isEmpty(tL_messageMediaVenue.title)) {
                        sb.append(tL_messageMediaVenue.title);
                    }
                    if (tL_messageMediaVenue != null) {
                        str = tL_messageMediaVenue.address;
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        if (sb.length() > 0) {
                            sb.append(", ");
                        }
                        sb.append((CharSequence) str);
                    }
                    if (sb.length() > 0) {
                        str2 = sb.toString();
                    } else {
                        str2 = null;
                    }
                    setContentDescription(str2);
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            setContentDescription(null);
        }
        invalidate();
    }

    public de0 getImageView() {
        return this.c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        Paint d;
        float L;
        float width;
        tk4 tk4Var = y;
        vnb vnbVar = this.f;
        if (tk4Var == null) {
            tk4 tk4Var2 = new tk4(getContext(), vnbVar);
            y = tk4Var2;
            tk4Var2.setIsSingleCell(true);
        }
        if (getParent() instanceof ViewGroup) {
            i = ((ViewGroup) getParent()).indexOfChild(this);
        } else {
            i = 0;
        }
        tk4 tk4Var3 = y;
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int L2 = hl.L(56.0f);
        tk4Var3.P = measuredWidth;
        tk4Var3.Q = measuredHeight;
        tk4Var3.R = L2 * (-i);
        y.setViewType(4);
        y.updateColors();
        y.f();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.w) * 255.0f), 31);
        canvas.translate(hl.L(2.0f), ik8.D(56.0f, getMeasuredHeight(), 2));
        y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            if (vnbVar == null) {
                d = null;
            } else {
                d = vnbVar.d("paintDivider");
            }
            if (d == null) {
                d = aob.j0;
            }
            Paint paint = d;
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(72.0f);
            }
            float height = getHeight() - 1;
            if (ob6.a0) {
                width = getWidth() - hl.L(72.0f);
            } else {
                width = getWidth();
            }
            canvas.drawLine(L, height, width, getHeight() - 1, paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(64.0f) + (this.e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z) {
        this.h = z;
    }
}
