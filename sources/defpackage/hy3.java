package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class hy3 extends FrameLayout {
    public final p66 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ok8 e;
    public final s7 f;
    public final boolean h;
    public final qu0 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float w;
    public ValueAnimator x;
    public final ly3 y;

    public hy3(ly3 ly3Var, Context context, boolean z) {
        super(context);
        float f;
        float f2;
        float f3;
        this.y = ly3Var;
        this.n = new qu0(this, (byte) 4);
        this.s = false;
        this.w = 0.0f;
        this.h = z;
        if (!z) {
            Pattern pattern = ly3.P1;
            float f4 = 8.0f;
            if (!yac.h(ly3Var.a).p()) {
                f3 = 16.0f;
                f2 = 28.0f;
                ok8 ok8Var = new ok8(hl.L(4.0f), ly3Var.J0, context, false);
                this.e = ok8Var;
                ok8Var.b(ob6.M0(2131743531, null), new View.OnClickListener(this) {
                    public final hy3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        hy3 hy3Var = this.b;
                        switch (b) {
                            case 0:
                                ly3 ly3Var2 = hy3Var.y;
                                ly3Var2.K1 = SystemClock.elapsedRealtime();
                                ly3Var2.I0();
                                return;
                            case 1:
                                ly3.F0(hy3Var.n, hy3Var.r, true, null, null);
                                hy3Var.a(true, true);
                                return;
                            case 2:
                                qu0 qu0Var = hy3Var.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy3Var.r;
                                lw3 lw3Var = new lw3(hy3Var, (byte) 3);
                                Pattern pattern2 = ly3.P1;
                                if (qu0Var != null && tL_messages_stickerSet != null && qu0Var.getFragmentView() != null) {
                                    ls6.d0(qu0Var.getCurrentAccount()).i2(qu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qu0Var, null, true, true, lw3Var, true);
                                }
                                hy3Var.a(false, true);
                                return;
                            default:
                                hy3Var.f.U(null, null);
                                return;
                        }
                    }
                }, false);
                ok8Var.setIcon(2131624310);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ok8Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = hl.L(1.0f);
                marginLayoutParams.topMargin = hl.L(1.0f);
                int L = hl.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) ok8Var.getTextView().getLayoutParams()).leftMargin = hl.L(3.0f);
                ok8Var.getChildAt(0).setPadding(hl.L(8.0f), 0, hl.L(8.0f), 0);
                addView(ok8Var, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                ok8Var.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(hl.L(28.0f), 1073741824));
                f4 = (hl.L(16.0f) + ok8Var.getMeasuredWidth()) / hl.p;
            } else {
                f2 = 28.0f;
                f3 = 16.0f;
            }
            float f5 = f4;
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(hl.o());
            yob.X(textView, aob.Ji, ly3Var.J0);
            int i = aob.Fi;
            hf0 e = rnb.e(aob.v0(i, ly3Var.J0), 14.0f);
            uob M = yob.M(i);
            uob e2 = yob.e(i);
            vnb vnbVar = ly3Var.J0;
            textView.setBackground(e);
            yob.j(textView, e, M, e2, vnbVar);
            textView.setText(ob6.M0(2131754479, null));
            textView.setPadding(hl.L(18.0f), 0, hl.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final hy3 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    hy3 hy3Var = this.b;
                    switch (b) {
                        case 0:
                            ly3 ly3Var2 = hy3Var.y;
                            ly3Var2.K1 = SystemClock.elapsedRealtime();
                            ly3Var2.I0();
                            return;
                        case 1:
                            ly3.F0(hy3Var.n, hy3Var.r, true, null, null);
                            hy3Var.a(true, true);
                            return;
                        case 2:
                            qu0 qu0Var = hy3Var.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy3Var.r;
                            lw3 lw3Var = new lw3(hy3Var, (byte) 3);
                            Pattern pattern2 = ly3.P1;
                            if (qu0Var != null && tL_messages_stickerSet != null && qu0Var.getFragmentView() != null) {
                                ls6.d0(qu0Var.getCurrentAccount()).i2(qu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qu0Var, null, true, true, lw3Var, true);
                            }
                            hy3Var.a(false, true);
                            return;
                        default:
                            hy3Var.f.U(null, null);
                            return;
                    }
                }
            });
            addView(textView, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(hl.L(f2), 1073741824));
            float max = Math.max(f5, (hl.L(f3) + textView.getMeasuredWidth()) / hl.p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(hl.o());
            yob.X(textView2, i, ly3Var.J0);
            hf0 Y = aob.Y(aob.v0(i, ly3Var.J0) & 268435455, 4, 4);
            uob g = yob.g(i, 15);
            vnb vnbVar2 = ly3Var.J0;
            textView2.setBackground(Y);
            yob.j(textView2, Y, null, g, vnbVar2);
            textView2.setText(ob6.M0(2131744512, null));
            textView2.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final hy3 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    hy3 hy3Var = this.b;
                    switch (b) {
                        case 0:
                            ly3 ly3Var2 = hy3Var.y;
                            ly3Var2.K1 = SystemClock.elapsedRealtime();
                            ly3Var2.I0();
                            return;
                        case 1:
                            ly3.F0(hy3Var.n, hy3Var.r, true, null, null);
                            hy3Var.a(true, true);
                            return;
                        case 2:
                            qu0 qu0Var = hy3Var.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy3Var.r;
                            lw3 lw3Var = new lw3(hy3Var, (byte) 3);
                            Pattern pattern2 = ly3.P1;
                            if (qu0Var != null && tL_messages_stickerSet != null && qu0Var.getFragmentView() != null) {
                                ls6.d0(qu0Var.getCurrentAccount()).i2(qu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qu0Var, null, true, true, lw3Var, true);
                            }
                            hy3Var.a(false, true);
                            return;
                        default:
                            hy3Var.f.U(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, tre.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(hl.L(f2), 1073741824));
            f = Math.max(max, (hl.L(f3) + textView2.getMeasuredWidth()) / hl.p);
        } else {
            f = 32.0f;
        }
        float f6 = f;
        Pattern pattern2 = ly3.P1;
        p66 p66Var = new p66(context, ly3Var.J0);
        this.a = p66Var;
        p66Var.setPadding(hl.L(2.0f), 0, hl.L(2.0f), 0);
        p66Var.setTypeface(hl.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        p66Var.setEllipsize(truncateAt);
        p66Var.setSingleLine(true);
        p66Var.setLines(1);
        yob.G(p66Var, aob.J6, ly3Var.J0);
        yob.X(p66Var, aob.j5, ly3Var.J0);
        if (z) {
            p66Var.setTextSize(1, 20.0f);
            addView(p66Var, tre.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f6, 0.0f));
            s7 s7Var = new s7(context, null, 0, aob.v0(aob.Aj, ly3Var.J0), false, ly3Var.J0);
            this.f = s7Var;
            s7Var.setLongClickEnabled(false);
            s7Var.setSubMenuOpenSide(2);
            s7Var.setIcon(2131231247);
            int i2 = aob.Ej;
            hf0 f0 = aob.f0(aob.v0(i2, ly3Var.J0), 1, -1);
            uob M2 = yob.M(i2);
            vnb vnbVar3 = ly3Var.J0;
            s7Var.setBackground(f0);
            yob.j(s7Var, f0, null, M2, vnbVar3);
            addView(s7Var, tre.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (ly3Var.u0 / hl.p), 0.0f));
            s7Var.e(1, 2131232368, ob6.M0(2131744503, null));
            s7Var.e(2, 2131232208, ob6.M0(2131751727, null));
            s7Var.setOnClickListener(new View.OnClickListener(this) {
                public final hy3 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    hy3 hy3Var = this.b;
                    switch (b) {
                        case 0:
                            ly3 ly3Var2 = hy3Var.y;
                            ly3Var2.K1 = SystemClock.elapsedRealtime();
                            ly3Var2.I0();
                            return;
                        case 1:
                            ly3.F0(hy3Var.n, hy3Var.r, true, null, null);
                            hy3Var.a(true, true);
                            return;
                        case 2:
                            qu0 qu0Var = hy3Var.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = hy3Var.r;
                            lw3 lw3Var = new lw3(hy3Var, (byte) 3);
                            Pattern pattern22 = ly3.P1;
                            if (qu0Var != null && tL_messages_stickerSet != null && qu0Var.getFragmentView() != null) {
                                ls6.d0(qu0Var.getCurrentAccount()).i2(qu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, qu0Var, null, true, true, lw3Var, true);
                            }
                            hy3Var.a(false, true);
                            return;
                        default:
                            hy3Var.f.U(null, null);
                            return;
                    }
                }
            });
            s7Var.setDelegate(new lu3(ly3Var, (byte) 2));
            s7Var.setContentDescription(ob6.M0(2131754834, null));
            return;
        }
        p66Var.setTextSize(1, 17.0f);
        addView(p66Var, tre.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f6, 0.0f));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        textView3.setTextSize(1, 13.0f);
        yob.X(textView3, aob.q5, ly3Var.J0);
        textView3.setEllipsize(truncateAt);
        textView3.setSingleLine(true);
        textView3.setLines(1);
        addView(textView3, tre.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f6, 0.0f));
    }

    public final void a(boolean z, boolean z2) {
        TextView textView;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        if (this.s != z) {
            this.s = z;
            ValueAnimator valueAnimator = this.x;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.x = null;
            }
            TextView textView2 = this.c;
            if (textView2 != null && (textView = this.d) != null) {
                textView2.setClickable(!z);
                textView.setClickable(z);
                float f7 = 0.0f;
                if (z2) {
                    float f8 = this.w;
                    if (z) {
                        f7 = 1.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f8, f7);
                    this.x = ofFloat;
                    ofFloat.addUpdateListener(new az1(this, (byte) 21));
                    this.x.setInterpolator(k43.h);
                    this.x.setDuration(250L);
                    this.x.start();
                    return;
                }
                if (z) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                this.w = f;
                if (z) {
                    f2 = 0.0f;
                } else {
                    f2 = 1.0f;
                }
                textView2.setScaleX(f2);
                if (z) {
                    f3 = 0.0f;
                } else {
                    f3 = 1.0f;
                }
                textView2.setScaleY(f3);
                if (z) {
                    f4 = 0.0f;
                } else {
                    f4 = 1.0f;
                }
                textView2.setAlpha(f4);
                if (z) {
                    f5 = 1.0f;
                } else {
                    f5 = 0.0f;
                }
                textView.setScaleX(f5);
                if (z) {
                    f6 = 1.0f;
                } else {
                    f6 = 0.0f;
                }
                textView.setScaleY(f6);
                if (z) {
                    f7 = 1.0f;
                }
                textView.setAlpha(f7);
            }
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        if (this.h) {
            f = 42.0f;
        } else {
            f = 56.0f;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(f), 1073741824));
    }
}
