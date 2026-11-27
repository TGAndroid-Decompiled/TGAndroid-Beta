package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.ShapeDrawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class g14 extends FrameLayout implements snb, fn7 {
    public Paint E;
    public byte F;
    public AnimatorSet G;
    public final o24 H;
    public int a;
    public int b;
    public final e29 c;
    public final ema d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public final TextView n;
    public final ok8 r;
    public TLRPC.TL_inputStickerSetID s;
    public TLRPC.TL_inputStickerSetID w;
    public c14 x;
    public boolean y;

    public g14(o24 o24Var, Context context) {
        super(context);
        this.H = o24Var;
        xob xobVar = yob.a;
        ?? imageView = new ImageView(context);
        this.c = imageView;
        imageView.f(2131624310, 24, 24, null);
        int i = aob.Lf;
        vnb vnbVar = o24Var.a2;
        yob.s(imageView, i, vnbVar, PorterDuff.Mode.SRC_ATOP);
        addView((View) imageView, tre.i(20.0f, 20.0f, 8388611, 10.0f, 15.0f, 0.0f, 0.0f));
        ema emaVar = new ema(context);
        this.d = emaVar;
        emaVar.setTextSize(15);
        yob.W(emaVar, i, vnbVar);
        emaVar.setTypeface(hl.o());
        emaVar.setOnClickListener(new f14(this, (byte) 0));
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 11.0f);
        yob.X(textView, i, vnbVar);
        textView.setTypeface(hl.o());
        int L = hl.L(8.0f);
        int i2 = aob.Ef;
        ShapeDrawable b0 = aob.b0(L, aob.p1(0.12f, o24Var.y(i2)));
        uob K = yob.K(0.12f, i2);
        textView.setBackground(b0);
        yob.j(textView, b0, K, null, vnbVar);
        textView.setPadding(hl.L(6.0f), hl.L(1.5f), hl.L(6.0f), hl.L(1.5f));
        textView.setText(ob6.M0(2131749198, null));
        emaVar.setEllipsizeByGradient(true);
        addView(emaVar, tre.i(-2.0f, -1.0f, 8388611, 15.0f, 15.0f, 0.0f, 0.0f));
        addView(textView, tre.i(-2.0f, -2.0f, 8388611, 15.0f, 10.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f = frameLayout;
        frameLayout.setPadding(hl.L(11.0f), hl.L(11.0f), hl.L(11.0f), 0);
        frameLayout.setClipToPadding(false);
        frameLayout.setOnClickListener(new f14(this, (byte) 1));
        addView(frameLayout, tre.h(-2.0f, -1.0f, 8388725));
        TextView textView2 = new TextView(context);
        this.h = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(hl.o());
        textView2.setText(ob6.M0(2131754479, null));
        yob.X(textView2, aob.Ji, vnbVar);
        int i3 = aob.Fi;
        textView2.setBackground(rnb.d(o24Var.y(i3), o24Var.y(aob.Hi), 16.0f));
        textView2.setPadding(hl.L(14.0f), 0, hl.L(14.0f), 0);
        textView2.setGravity(17);
        textView2.setOnClickListener(new f14(this, (byte) 2));
        frameLayout.addView(textView2, tre.h(-2.0f, 26.0f, 8388661));
        TextView textView3 = new TextView(context);
        this.n = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(hl.o());
        textView3.setText(ob6.M0(2131744512, null));
        yob.X(textView3, aob.Ii, vnbVar);
        textView3.setBackground(rnb.d(0, o24Var.y(i3) & 452984831, 16.0f));
        textView3.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        textView3.setGravity(17);
        textView3.setTranslationX(hl.L(4.0f));
        textView3.setOnClickListener(new f14(this, (byte) 3));
        frameLayout.addView(textView3, tre.h(-2.0f, 26.0f, 8388661));
        ok8 ok8Var = new ok8(hl.L(16.0f), vnbVar, context, false);
        this.r = ok8Var;
        ok8Var.setIcon(2131624310);
        ok8Var.b(ob6.M0(2131743531, null), new f14(this, (byte) 4), false);
        try {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ok8Var.getIconView().getLayoutParams();
            marginLayoutParams.leftMargin = hl.L(1.0f);
            marginLayoutParams.topMargin = hl.L(1.0f);
            int L2 = hl.L(20.0f);
            marginLayoutParams.height = L2;
            marginLayoutParams.width = L2;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) ok8Var.getTextView().getLayoutParams();
            marginLayoutParams2.leftMargin = hl.L(5.0f);
            marginLayoutParams2.topMargin = hl.L(-0.5f);
            ok8Var.getChildAt(0).setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
        } catch (Exception unused) {
        }
        this.f.addView(this.r, tre.h(-2.0f, 26.0f, 8388661));
        setWillNotDraw(false);
    }

    public final void a(boolean z) {
        boolean z2;
        byte b;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        float f7;
        float f8;
        float f9;
        int i2;
        float f10;
        float f11;
        float f12;
        int i3;
        char c;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        c14 c14Var = this.x;
        if (c14Var == null) {
            return;
        }
        boolean z8 = c14Var.f;
        o24 o24Var = this.H;
        if (!z8 && !o24Var.q1.contains(Long.valueOf(c14Var.b.id))) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!this.x.e && !yac.h(o24Var.d1).p() && !o24Var.V0) {
            b = 1;
        } else if (this.x.g) {
            if (z2) {
                b = 3;
            } else {
                b = 2;
            }
        } else {
            b = 0;
        }
        if (b == 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (this.F == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 != z4) {
            requestLayout();
        }
        this.F = b;
        AnimatorSet animatorSet = this.G;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.G = null;
        }
        if (b == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        ok8 ok8Var = this.r;
        ok8Var.setEnabled(z5);
        if (b == 2) {
            z6 = true;
        } else {
            z6 = false;
        }
        TextView textView = this.h;
        textView.setEnabled(z6);
        if (b == 3) {
            z7 = true;
        } else {
            z7 = false;
        }
        TextView textView2 = this.n;
        textView2.setEnabled(z7);
        ema emaVar = this.d;
        e29 e29Var = this.c;
        if (z) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.G = animatorSet2;
            if (b == 1) {
                f13 = 0.0f;
                c = 0;
            } else {
                c = 0;
                f13 = -hl.L(16.0f);
            }
            float[] fArr = new float[1];
            fArr[c] = f13;
            Property property = FrameLayout.TRANSLATION_X;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e29Var, property, fArr);
            if (b == 1) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            float[] fArr2 = new float[1];
            fArr2[c] = f14;
            Property property2 = FrameLayout.ALPHA;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(e29Var, property2, fArr2);
            if (b == 1) {
                f15 = hl.L(16.0f);
            } else {
                f15 = 0.0f;
            }
            float[] fArr3 = new float[1];
            fArr3[c] = f15;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(emaVar, property, fArr3);
            if (b == 1) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            float[] fArr4 = new float[1];
            fArr4[c] = f16;
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(ok8Var, property2, fArr4);
            if (b == 1) {
                f17 = 1.0f;
            } else {
                f17 = 0.6f;
            }
            float[] fArr5 = new float[1];
            fArr5[c] = f17;
            Property property3 = FrameLayout.SCALE_X;
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(ok8Var, property3, fArr5);
            if (b == 1) {
                f18 = 1.0f;
            } else {
                f18 = 0.6f;
            }
            float[] fArr6 = new float[1];
            fArr6[c] = f18;
            Property property4 = FrameLayout.SCALE_Y;
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(ok8Var, property4, fArr6);
            if (b == 2) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            float[] fArr7 = new float[1];
            fArr7[c] = f19;
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(textView, property2, fArr7);
            if (b == 2) {
                f20 = 1.0f;
            } else {
                f20 = 0.6f;
            }
            float[] fArr8 = new float[1];
            fArr8[c] = f20;
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(textView, property3, fArr8);
            if (b == 2) {
                f21 = 1.0f;
            } else {
                f21 = 0.6f;
            }
            float[] fArr9 = new float[1];
            fArr9[c] = f21;
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(textView, property4, fArr9);
            if (b == 3) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            float[] fArr10 = new float[1];
            fArr10[c] = f22;
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(textView2, property2, fArr10);
            if (b == 3) {
                f23 = 1.0f;
            } else {
                f23 = 0.6f;
            }
            float[] fArr11 = new float[1];
            fArr11[c] = f23;
            ObjectAnimator ofFloat11 = ObjectAnimator.ofFloat(textView2, property3, fArr11);
            if (b == 3) {
                f24 = 1.0f;
            } else {
                f24 = 0.6f;
            }
            float[] fArr12 = new float[1];
            fArr12[c] = f24;
            ObjectAnimator ofFloat12 = ObjectAnimator.ofFloat(textView2, property4, fArr12);
            Animator[] animatorArr = new Animator[12];
            animatorArr[c] = ofFloat;
            animatorArr[1] = ofFloat2;
            animatorArr[2] = ofFloat3;
            animatorArr[3] = ofFloat4;
            animatorArr[4] = ofFloat5;
            animatorArr[5] = ofFloat6;
            animatorArr[6] = ofFloat7;
            animatorArr[7] = ofFloat8;
            animatorArr[8] = ofFloat9;
            animatorArr[9] = ofFloat10;
            animatorArr[10] = ofFloat11;
            animatorArr[11] = ofFloat12;
            animatorSet2.playTogether(animatorArr);
            this.G.addListener(new ry1(this, b, (byte) 1));
            this.G.setDuration(250L);
            this.G.setInterpolator(new OvershootInterpolator(1.02f));
            this.G.start();
            return;
        }
        if (b == 1) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        e29Var.setAlpha(f);
        if (b == 1) {
            f2 = 0.0f;
        } else {
            f2 = -hl.L(16.0f);
        }
        e29Var.setTranslationX(f2);
        if (b == 1) {
            f3 = hl.L(16.0f);
        } else {
            f3 = 0.0f;
        }
        emaVar.setTranslationX(f3);
        if (b == 1) {
            f4 = 1.0f;
        } else {
            f4 = 0.0f;
        }
        ok8Var.setAlpha(f4);
        if (b == 1) {
            f5 = 1.0f;
        } else {
            f5 = 0.6f;
        }
        ok8Var.setScaleX(f5);
        if (b == 1) {
            f6 = 1.0f;
        } else {
            f6 = 0.6f;
        }
        ok8Var.setScaleY(f6);
        if (b == 1) {
            i = 0;
        } else {
            i = 8;
        }
        ok8Var.setVisibility(i);
        if (b == 2) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        textView.setAlpha(f7);
        if (b == 2) {
            f8 = 1.0f;
        } else {
            f8 = 0.6f;
        }
        textView.setScaleX(f8);
        if (b == 2) {
            f9 = 1.0f;
        } else {
            f9 = 0.6f;
        }
        textView.setScaleY(f9);
        if (b == 2) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        textView.setVisibility(i2);
        if (b == 3) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        textView2.setAlpha(f10);
        if (b == 3) {
            f11 = 1.0f;
        } else {
            f11 = 0.6f;
        }
        textView2.setScaleX(f11);
        if (b == 3) {
            f12 = 1.0f;
        } else {
            f12 = 0.6f;
        }
        textView2.setScaleY(f12);
        if (b == 3) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView2.setVisibility(i3);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.TL_messages_stickerSet p0;
        TLRPC.TL_messages_stickerSet p02;
        o24 o24Var = this.H;
        int i3 = o24Var.d1;
        if (i == jn7.B0) {
            if (this.s != null && (p02 = ls6.d0(i3).p0(this.s.id)) != null && p02.set != null) {
                e eVar = o24Var.Z1;
                if (eVar == null) {
                    eVar = new qu0(this, (byte) 5);
                }
                ly3.F0(eVar, p02, true, null, new lw3(this, (byte) 6));
                this.s = null;
            }
            if (this.w != null && (p0 = ls6.d0(i3).p0(this.w.id)) != null && p0.set != null) {
                e eVar2 = o24Var.Z1;
                if (eVar2 == null) {
                    eVar2 = new qu0(this, (byte) 5);
                }
                e eVar3 = eVar2;
                vx3 vx3Var = new vx3(this, p0, (byte) 3);
                Pattern pattern = ly3.P1;
                if (eVar3.getFragmentView() != null) {
                    ls6.d0(eVar3.getCurrentAccount()).i2(eVar3.getFragmentView().getContext(), p0, null, 0, eVar3, null, true, true, vx3Var, false);
                }
                this.w = null;
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.H.d1).n(this, jn7.B0);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.y) {
            if (this.E == null) {
                Paint paint = new Paint(1);
                this.E = paint;
                paint.setStrokeWidth(1.0f);
                this.E.setColor(this.H.y(aob.d7));
            }
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, this.E);
        } else {
            canvas2 = canvas;
        }
        super.onDraw(canvas2);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int L = hl.L(11.0f) + this.f.getWidth();
        TextView textView = this.e;
        if (textView.getVisibility() == 0) {
            i5 = textView.getMeasuredWidth();
        } else {
            i5 = 0;
        }
        int i6 = L + i5;
        ema emaVar = this.d;
        emaVar.setRightPadding(i6);
        if (textView.getVisibility() == 0) {
            textView.setTranslationX(hl.L(4.0f) + emaVar.getTextWidth());
            float L2 = hl.L(4.0f) + (emaVar.getMaxTextWidth() - i6);
            if (textView.getTranslationX() > L2) {
                textView.setTranslationX(L2);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.d.getLayoutParams();
        if (this.F == 0) {
            f = 10.0f;
        } else {
            f = 15.0f;
        }
        marginLayoutParams.topMargin = hl.L(f);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
        if (this.F == 0) {
            f2 = 32.0f;
        } else {
            f2 = 42.0f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(hl.L(f2), 1073741824));
    }

    @Override
    public final void updateColors() {
        o24 o24Var = this.H;
        try {
            int y = o24Var.y(aob.Fi);
            int y2 = o24Var.y(aob.Hi);
            if (y != this.a || y2 != this.b) {
                this.a = y;
                this.b = y2;
                TextView textView = this.h;
                if (textView != null) {
                    aob.F1(textView.getBackground(), y, false);
                    aob.F1(textView.getBackground(), y2, true);
                    textView.invalidate();
                }
                TextView textView2 = this.n;
                if (textView2 != null) {
                    aob.F1(textView2.getBackground(), y & 452984831, true);
                    textView2.invalidate();
                }
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
