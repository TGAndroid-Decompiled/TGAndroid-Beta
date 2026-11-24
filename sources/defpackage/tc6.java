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
public final class tc6 extends FrameLayout {
    public static tk4 y;
    public final io a;
    public final io b;
    public final bf0 c;
    public final ShapeDrawable d;
    public boolean e;
    public final ylb f;
    public boolean h;
    public CharSequence n;
    public String r;
    public String s;
    public float w;
    public ValueAnimator x;

    public tc6(Context context, ylb ylbVar) {
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
        this.f = ylbVar;
        bf0 bf0Var = new bf0(context);
        this.c = bf0Var;
        ShapeDrawable K = cmb.K(gm.L(42.0f), -1);
        this.d = K;
        bf0Var.setBackground(K);
        bf0Var.t(gm.L(30.0f), gm.L(30.0f));
        boolean z = jb6.a0;
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
        addView(bf0Var, qoe.d(42, 42.0f, i8, f, 11.0f, f2, 0.0f));
        io ioVar = new io(context, true, true, true);
        this.a = ioVar;
        d53 d53Var = d53.h;
        ioVar.b(0.4f, 350L, d53Var);
        ioVar.setScaleProperty(0.6f);
        ioVar.setTextSize(gm.L(16.0f));
        ioVar.setEllipsizeByGradient(true);
        anb.U(ioVar, cmb.F6, ylbVar);
        ioVar.setTypeface(gm.o());
        if (jb6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        ioVar.setGravity(i2);
        ioVar.getDrawable().N = gm.q.x;
        nm7.i(ioVar);
        boolean z2 = jb6.a0;
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
        addView(ioVar, qoe.d(-1, 22.0f, i9, f3, 10.0f, i5, 0.0f));
        io ioVar2 = new io(context, true, true, true);
        this.b = ioVar2;
        ioVar2.setScaleProperty(0.6f);
        ioVar2.b(0.4f, 350L, d53Var);
        ioVar2.setTextSize(gm.L(14.0f));
        ioVar2.setEllipsizeByGradient(true);
        anb.U(ioVar2, cmb.z6, ylbVar);
        if (jb6.a0) {
            i6 = 5;
        } else {
            i6 = 3;
        }
        ioVar2.setGravity(i6);
        boolean z3 = jb6.a0;
        int i10 = (z3 ? 5 : 3) | 48;
        if (z3) {
            i7 = 16;
        } else {
            i7 = 73;
        }
        addView(ioVar2, qoe.d(-1, 20.0f, i10, i7, 35.0f, z3 ? 73 : 16, 0.0f));
        bf0Var.setAlpha(this.w);
        ioVar.setAlpha(this.w);
        ioVar2.setAlpha(this.w);
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
        io ioVar = this.a;
        if (tL_messageMediaVenue != null) {
            if (TextUtils.equals(this.r, tL_messageMediaVenue.emoji) && TextUtils.equals(this.s, tL_messageMediaVenue.title)) {
                charSequence = this.n;
            } else {
                charSequence = tL_messageMediaVenue.title;
                if (!TextUtils.isEmpty(tL_messageMediaVenue.emoji)) {
                    charSequence = gw3.m(tL_messageMediaVenue.emoji + " " + ((Object) charSequence), ioVar.getPaint().getFontMetricsInt(), false, null, 0);
                }
                this.r = tL_messageMediaVenue.emoji;
                this.s = tL_messageMediaVenue.title;
                this.n = charSequence;
            }
            if (this.h && !jb6.a0 && z2) {
                z6 = true;
            } else {
                z6 = false;
            }
            ioVar.c(charSequence, z6, true);
        }
        io ioVar2 = this.b;
        if (tL_messageMediaVenue != null) {
            String str4 = tL_messageMediaVenue.address;
            if (this.h && !jb6.a0 && z2) {
                z5 = true;
            } else {
                z5 = false;
            }
            ioVar2.c(str4, z5, true);
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
        bf0 bf0Var = this.c;
        if (tL_messageMediaVenue != null && (str3 = tL_messageMediaVenue.icon) != null) {
            if (!"pin".equals(str3) && !"city".equals(tL_messageMediaVenue.icon) && !"country".equals(tL_messageMediaVenue.icon) && !tL_messageMediaVenue.icon.startsWith("emoji")) {
                bf0Var.o(tL_messageMediaVenue.icon, null, null);
            } else {
                if ("city".equals(tL_messageMediaVenue.icon)) {
                    i3 = 2131231643;
                } else if ("country".equals(tL_messageMediaVenue.icon)) {
                    i3 = 2131231644;
                } else {
                    i3 = 2131232556;
                }
                Drawable mutate = getResources().getDrawable(i3).mutate();
                anb.x(this, mutate, cmb.dj, this.f, PorterDuff.Mode.MULTIPLY);
                sn2 sn2Var = new sn2(cmb.K(gm.L(42.0f), 0), mutate);
                int L = gm.L(42.0f);
                int L2 = gm.L(42.0f);
                sn2Var.h = L;
                sn2Var.n = L2;
                int L3 = gm.L(24.0f);
                int L4 = gm.L(24.0f);
                sn2Var.e = L3;
                sn2Var.f = L4;
                bf0Var.setImageDrawable(sn2Var);
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
                float R1 = gm.R1(f2, f3, f4);
                tc6 tc6Var = tc6.this;
                tc6Var.w = R1;
                tc6Var.c.setAlpha(R1);
                tc6Var.a.setAlpha(tc6Var.w);
                tc6Var.b.setAlpha(tc6Var.w);
                tc6Var.invalidate();
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
        bf0Var.setAlpha(f2);
        ioVar.setAlpha(f2);
        ioVar2.setAlpha(f2);
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

    public bf0 getImageView() {
        return this.c;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        Paint d;
        float L;
        float width;
        tk4 tk4Var = y;
        ylb ylbVar = this.f;
        if (tk4Var == null) {
            tk4 tk4Var2 = new tk4(getContext(), ylbVar);
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
        int L2 = gm.L(56.0f);
        tk4Var3.P = measuredWidth;
        tk4Var3.Q = measuredHeight;
        tk4Var3.R = L2 * (-i);
        y.setViewType(4);
        y.updateColors();
        y.f();
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.w) * 255.0f), 31);
        canvas.translate(gm.L(2.0f), wi8.D(56.0f, getMeasuredHeight(), 2));
        y.draw(canvas);
        canvas.restore();
        super.onDraw(canvas);
        if (this.e) {
            if (ylbVar == null) {
                d = null;
            } else {
                d = ylbVar.d("paintDivider");
            }
            if (d == null) {
                d = cmb.j0;
            }
            Paint paint = d;
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(72.0f);
            }
            float height = getHeight() - 1;
            if (jb6.a0) {
                width = getWidth() - gm.L(72.0f);
            } else {
                width = getWidth();
            }
            canvas.drawLine(L, height, width, getHeight() - 1, paint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(64.0f) + (this.e ? 1 : 0), 1073741824));
    }

    public void setAllowTextAnimation(boolean z) {
        this.h = z;
    }
}
