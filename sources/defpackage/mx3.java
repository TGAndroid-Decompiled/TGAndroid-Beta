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
public final class mx3 extends FrameLayout {
    public final l46 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ah8 e;
    public final r7 f;
    public final boolean h;
    public final hu0 n;
    public TLRPC.TL_messages_stickerSet r;
    public boolean s;
    public float w;
    public ValueAnimator x;
    public final qx3 y;

    public mx3(qx3 qx3Var, Context context, boolean z) {
        super(context);
        float f;
        float f2;
        float f3;
        this.y = qx3Var;
        this.n = new hu0(this, (byte) 4);
        this.s = false;
        this.w = 0.0f;
        this.h = z;
        if (!z) {
            Pattern pattern = qx3.P1;
            float f4 = 8.0f;
            if (!y6c.h(qx3Var.a).p()) {
                f3 = 16.0f;
                f2 = 28.0f;
                ah8 ah8Var = new ah8(gl.L(4.0f), qx3Var.J0, context, false);
                this.e = ah8Var;
                ah8Var.b(k96.M0(2131743637, null), new View.OnClickListener(this) {
                    public final mx3 b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b = r2;
                        mx3 mx3Var = this.b;
                        switch (b) {
                            case 0:
                                qx3 qx3Var2 = mx3Var.y;
                                qx3Var2.K1 = SystemClock.elapsedRealtime();
                                qx3Var2.H0();
                                return;
                            case 1:
                                qx3.E0(mx3Var.n, mx3Var.r, true, null, null);
                                mx3Var.a(true, true);
                                return;
                            case 2:
                                hu0 hu0Var = mx3Var.n;
                                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mx3Var.r;
                                li3 li3Var = new li3(mx3Var, (byte) 24);
                                Pattern pattern2 = qx3.P1;
                                if (hu0Var != null && tL_messages_stickerSet != null && hu0Var.getFragmentView() != null) {
                                    hq6.d0(hu0Var.getCurrentAccount()).i2(hu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, hu0Var, null, true, true, li3Var, true);
                                }
                                mx3Var.a(false, true);
                                return;
                            default:
                                mx3Var.f.U(null, null);
                                return;
                        }
                    }
                }, false);
                ah8Var.setIcon(2131624309);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) ah8Var.getIconView().getLayoutParams();
                marginLayoutParams.leftMargin = gl.L(1.0f);
                marginLayoutParams.topMargin = gl.L(1.0f);
                int L = gl.L(20.0f);
                marginLayoutParams.height = L;
                marginLayoutParams.width = L;
                ((ViewGroup.MarginLayoutParams) ah8Var.getTextView().getLayoutParams()).leftMargin = gl.L(3.0f);
                ah8Var.getChildAt(0).setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
                addView(ah8Var, nme.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
                ah8Var.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(gl.L(28.0f), 1073741824));
                f4 = (gl.L(16.0f) + ah8Var.getMeasuredWidth()) / gl.p;
            } else {
                f2 = 28.0f;
                f3 = 16.0f;
            }
            float f5 = f4;
            TextView textView = new TextView(context);
            this.c = textView;
            textView.setTypeface(gl.o());
            zkb.X(textView, bkb.Ii, qx3Var.J0);
            int i = bkb.Ei;
            ff0 e = sjb.e(bkb.v0(i, qx3Var.J0), 14.0f);
            vkb M = zkb.M(i);
            vkb e2 = zkb.e(i);
            wjb wjbVar = qx3Var.J0;
            textView.setBackground(e);
            zkb.j(textView, e, M, e2, wjbVar);
            textView.setText(k96.M0(2131754483, null));
            textView.setPadding(gl.L(18.0f), 0, gl.L(18.0f), 0);
            textView.setGravity(17);
            textView.setOnClickListener(new View.OnClickListener(this) {
                public final mx3 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    mx3 mx3Var = this.b;
                    switch (b) {
                        case 0:
                            qx3 qx3Var2 = mx3Var.y;
                            qx3Var2.K1 = SystemClock.elapsedRealtime();
                            qx3Var2.H0();
                            return;
                        case 1:
                            qx3.E0(mx3Var.n, mx3Var.r, true, null, null);
                            mx3Var.a(true, true);
                            return;
                        case 2:
                            hu0 hu0Var = mx3Var.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mx3Var.r;
                            li3 li3Var = new li3(mx3Var, (byte) 24);
                            Pattern pattern2 = qx3.P1;
                            if (hu0Var != null && tL_messages_stickerSet != null && hu0Var.getFragmentView() != null) {
                                hq6.d0(hu0Var.getCurrentAccount()).i2(hu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, hu0Var, null, true, true, li3Var, true);
                            }
                            mx3Var.a(false, true);
                            return;
                        default:
                            mx3Var.f.U(null, null);
                            return;
                    }
                }
            });
            addView(textView, nme.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(gl.L(f2), 1073741824));
            float max = Math.max(f5, (gl.L(f3) + textView.getMeasuredWidth()) / gl.p);
            TextView textView2 = new TextView(context);
            this.d = textView2;
            textView2.setTypeface(gl.o());
            zkb.X(textView2, i, qx3Var.J0);
            ff0 Y = bkb.Y(bkb.v0(i, qx3Var.J0) & 268435455, 4, 4);
            vkb g = zkb.g(i, 15);
            wjb wjbVar2 = qx3Var.J0;
            textView2.setBackground(Y);
            zkb.j(textView2, Y, null, g, wjbVar2);
            textView2.setText(k96.M0(2131744618, null));
            textView2.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
            textView2.setGravity(17);
            textView2.setOnClickListener(new View.OnClickListener(this) {
                public final mx3 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    mx3 mx3Var = this.b;
                    switch (b) {
                        case 0:
                            qx3 qx3Var2 = mx3Var.y;
                            qx3Var2.K1 = SystemClock.elapsedRealtime();
                            qx3Var2.H0();
                            return;
                        case 1:
                            qx3.E0(mx3Var.n, mx3Var.r, true, null, null);
                            mx3Var.a(true, true);
                            return;
                        case 2:
                            hu0 hu0Var = mx3Var.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mx3Var.r;
                            li3 li3Var = new li3(mx3Var, (byte) 24);
                            Pattern pattern2 = qx3.P1;
                            if (hu0Var != null && tL_messages_stickerSet != null && hu0Var.getFragmentView() != null) {
                                hq6.d0(hu0Var.getCurrentAccount()).i2(hu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, hu0Var, null, true, true, li3Var, true);
                            }
                            mx3Var.a(false, true);
                            return;
                        default:
                            mx3Var.f.U(null, null);
                            return;
                    }
                }
            });
            textView2.setClickable(false);
            addView(textView2, nme.i(-2.0f, 28.0f, 8388661, 0.0f, 15.66f, 5.66f, 0.0f));
            textView2.setScaleX(0.0f);
            textView2.setScaleY(0.0f);
            textView2.setAlpha(0.0f);
            textView2.measure(-2147383649, View.MeasureSpec.makeMeasureSpec(gl.L(f2), 1073741824));
            f = Math.max(max, (gl.L(f3) + textView2.getMeasuredWidth()) / gl.p);
        } else {
            f = 32.0f;
        }
        float f6 = f;
        Pattern pattern2 = qx3.P1;
        l46 l46Var = new l46(context, qx3Var.J0);
        this.a = l46Var;
        l46Var.setPadding(gl.L(2.0f), 0, gl.L(2.0f), 0);
        l46Var.setTypeface(gl.o());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        l46Var.setEllipsize(truncateAt);
        l46Var.setSingleLine(true);
        l46Var.setLines(1);
        zkb.G(l46Var, bkb.I6, qx3Var.J0);
        zkb.X(l46Var, bkb.i5, qx3Var.J0);
        if (z) {
            l46Var.setTextSize(1, 20.0f);
            addView(l46Var, nme.i(-1.0f, -2.0f, 8388659, 12.0f, 11.0f, f6, 0.0f));
            r7 r7Var = new r7(context, null, 0, bkb.v0(bkb.zj, qx3Var.J0), false, qx3Var.J0);
            this.f = r7Var;
            r7Var.setLongClickEnabled(false);
            r7Var.setSubMenuOpenSide(2);
            r7Var.setIcon(2131231247);
            int i2 = bkb.Dj;
            ff0 f0 = bkb.f0(bkb.v0(i2, qx3Var.J0), 1, -1);
            vkb M2 = zkb.M(i2);
            wjb wjbVar3 = qx3Var.J0;
            r7Var.setBackground(f0);
            zkb.j(r7Var, f0, null, M2, wjbVar3);
            addView(r7Var, nme.d(40, 40.0f, 53, 0.0f, 5.0f, 5.0f - (qx3Var.u0 / gl.p), 0.0f));
            r7Var.e(1, 2131232368, k96.M0(2131744609, null));
            r7Var.e(2, 2131232208, k96.M0(2131751750, null));
            r7Var.setOnClickListener(new View.OnClickListener(this) {
                public final mx3 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    byte b = r2;
                    mx3 mx3Var = this.b;
                    switch (b) {
                        case 0:
                            qx3 qx3Var2 = mx3Var.y;
                            qx3Var2.K1 = SystemClock.elapsedRealtime();
                            qx3Var2.H0();
                            return;
                        case 1:
                            qx3.E0(mx3Var.n, mx3Var.r, true, null, null);
                            mx3Var.a(true, true);
                            return;
                        case 2:
                            hu0 hu0Var = mx3Var.n;
                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = mx3Var.r;
                            li3 li3Var = new li3(mx3Var, (byte) 24);
                            Pattern pattern22 = qx3.P1;
                            if (hu0Var != null && tL_messages_stickerSet != null && hu0Var.getFragmentView() != null) {
                                hq6.d0(hu0Var.getCurrentAccount()).i2(hu0Var.getFragmentView().getContext(), tL_messages_stickerSet, null, 0, hu0Var, null, true, true, li3Var, true);
                            }
                            mx3Var.a(false, true);
                            return;
                        default:
                            mx3Var.f.U(null, null);
                            return;
                    }
                }
            });
            r7Var.setDelegate(new kx3(qx3Var, (byte) 0));
            r7Var.setContentDescription(k96.M0(2131754838, null));
            return;
        }
        l46Var.setTextSize(1, 17.0f);
        addView(l46Var, nme.i(-1.0f, -2.0f, 8388659, 6.0f, 10.0f, f6, 0.0f));
        TextView textView3 = new TextView(context);
        this.b = textView3;
        textView3.setTextSize(1, 13.0f);
        zkb.X(textView3, bkb.p5, qx3Var.J0);
        textView3.setEllipsize(truncateAt);
        textView3.setSingleLine(true);
        textView3.setLines(1);
        addView(textView3, nme.i(-1.0f, -2.0f, 8388659, 8.0f, 31.66f, f6, 0.0f));
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
                    ofFloat.addUpdateListener(new uz1(this, (byte) 20));
                    this.x.setInterpolator(s33.h);
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
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(f), 1073741824));
    }
}
