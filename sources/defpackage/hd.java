package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.RadialProgressView;
public class hd extends Dialog implements Drawable.Callback, gk7 {
    public static final int k1 = 0;
    public final Drawable A0;
    public final Rect B0;
    public final float C0;
    public Bitmap D0;
    public final BitmapDrawable[] E;
    public Matrix E0;
    public final boolean[] F;
    public BitmapShader F0;
    public final AnimatorSet[] G;
    public Paint G0;
    public byte H;
    public Paint H0;
    public boolean I;
    public boolean I0;
    public int J;
    public boolean J0;
    public DialogInterface.OnCancelListener K;
    public boolean K0;
    public hd L;
    public boolean L0;
    public int M;
    public final tc M0;
    public DialogInterface.OnClickListener N;
    public final tc N0;
    public DialogInterface.OnDismissListener O;
    public final ArrayList O0;
    public p8c P;
    public float P0;
    public CharSequence[] Q;
    public boolean Q0;
    public int[] R;
    public float R0;
    public CharSequence S;
    public final wjb S0;
    public String T;
    public boolean T0;
    public CharSequence U;
    public boolean U0;
    public int V;
    public int V0;
    public View W;
    public int W0;
    public boolean X;
    public long X0;
    public int Y;
    public boolean Y0;
    public byte Z;
    public FrameLayout Z0;
    public int a;
    public HashMap a0;
    public ge0 a1;
    public View b;
    public short b0;
    public cd b1;
    public TextView c;
    public Drawable c0;
    public int c1;
    public bu3 d;
    public int d0;
    public int d1;
    public int e;
    public int e0;
    public int e1;
    public wla f;
    public wjb f0;
    public int f1;
    public final byte g0;
    public int g1;
    public TextView h;
    public int h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public final fd j1;
    public boolean k0;
    public ry8 l0;
    public CharSequence m0;
    public bu3 n;
    public ed n0;
    public String o0;
    public ed p0;
    public String q0;
    public FrameLayout r;
    public gf9 r0;
    public FrameLayout s;
    public String s0;
    public ed t0;
    public ViewGroup u0;
    public j26 v0;
    public xc w;
    public TextView w0;
    public LinearLayout x;
    public px5 x0;
    public bd y;
    public final int[] y0;
    public boolean z0;

    public hd(int i, wjb wjbVar, Context context) {
        super(context, 2131755352);
        boolean z;
        boolean z2;
        float f;
        this.a = -1;
        this.e = -2;
        this.E = new BitmapDrawable[2];
        this.F = new boolean[2];
        this.G = new AnimatorSet[2];
        this.H = (byte) 12;
        this.J = bkb.G5;
        this.b0 = (short) 132;
        this.e0 = -1;
        this.i0 = true;
        this.j0 = true;
        this.k0 = true;
        this.y0 = new int[2];
        this.z0 = true;
        this.M0 = new tc(this, (byte) 0);
        this.N0 = new tc(this, (byte) 1);
        this.O0 = new ArrayList();
        this.Q0 = true;
        this.R0 = 0.5f;
        this.T0 = true;
        this.c1 = -1;
        this.j1 = new fd(this, (byte) 0);
        this.S0 = wjbVar;
        this.g0 = i;
        int i2 = bkb.g5;
        this.c1 = i2;
        int e = e(i2);
        this.V0 = e;
        if (gl.B(e) < 0.721f) {
            z = true;
        } else {
            z = false;
        }
        if (gba.o() >= 2 && e66.e(256) && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.U0 = z2;
        Rect rect = new Rect();
        this.B0 = rect;
        if (i != 3 || this.U0) {
            Drawable d = b00.d(context, 2131232572);
            this.A0 = d;
            if (i == 3) {
                f = 0.55f;
            } else if (z) {
                f = 0.8f;
            } else {
                f = 0.985f;
            }
            this.C0 = f;
            d.setColorFilter(new PorterDuffColorFilter(this.V0, PorterDuff.Mode.MULTIPLY));
            d.getPadding(rect);
        }
        this.I = i == 3;
    }

    public static boolean a(View view) {
        if (!view.onCheckIsTextEditor()) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                while (childCount > 0) {
                    childCount--;
                    if (a(viewGroup.getChildAt(childCount))) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void b(long j) {
        long currentTimeMillis = System.currentTimeMillis() - this.X0;
        if (currentTimeMillis < j) {
            gl.e3(new tc(this, (byte) 0), currentTimeMillis - j);
        } else {
            dismiss();
        }
    }

    public final View c(int i) {
        ViewGroup viewGroup = this.u0;
        if (viewGroup != null) {
            return viewGroup.findViewWithTag(Integer.valueOf(i));
        }
        return null;
    }

    public final int d() {
        int L;
        int L2 = (gl.q.x - gl.L(48.0f)) - (this.W0 << 1);
        if (gl.O1()) {
            if (gl.N1()) {
                L = gl.L(446.0f);
            } else {
                L = gl.L(496.0f);
            }
        } else {
            L = gl.L(356.0f);
        }
        int min = Math.min(L, L2);
        Rect rect = this.B0;
        return min + rect.left + rect.right;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        bu3 bu3Var;
        if (i == kk7.k4 && (bu3Var = this.n) != null) {
            bu3Var.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        p8c p8cVar = this.P;
        if (p8cVar != null) {
            this.P = null;
            p8cVar.a(new tc(this, (byte) 0));
        } else if (!this.i1) {
            this.i1 = true;
            kk7.e().n(this, kk7.k4);
            DialogInterface.OnDismissListener onDismissListener = this.O;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            hd hdVar = this.L;
            if (hdVar != null) {
                hdVar.dismiss();
            }
            try {
                super.dismiss();
            } catch (Throwable unused) {
            }
            gl.r(this.N0);
            if (this.F0 != null && (bitmap = this.D0) != null) {
                bitmap.recycle();
                this.F0 = null;
                this.G0 = null;
                this.D0 = null;
            }
        }
    }

    public int e(int i) {
        return bkb.v0(i, this.S0);
    }

    public final ViewGroup f(boolean z) {
        Object[] objArr;
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        float f5;
        float f6;
        float f7;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f8;
        cd cdVar = new cd(this, getContext());
        this.b1 = cdVar;
        cdVar.setOrientation(1);
        boolean z2 = this.U0;
        byte b2 = this.g0;
        if ((z2 || b2 == 3) && b2 != 2) {
            this.b1.setBackground(null);
            this.b1.setPadding(0, 0, 0, 0);
            if (this.U0) {
                this.b1.setWillNotDraw(false);
            }
        } else {
            this.b1.setBackground(null);
            this.b1.setPadding(0, 0, 0, 0);
            this.b1.setBackground(this.A0);
            cd cdVar2 = this.b1;
            xi xiVar = zdc.a;
            cdVar2.setOutlineProvider(new xdc(gl.L(8.0f), gl.L(20.0f)));
            this.b1.setClipToOutline(true);
        }
        ViewGroup viewGroup = this.b1;
        boolean z3 = this.Y0;
        wjb wjbVar = this.S0;
        if (z3) {
            if (this.Z0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.Z0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final hd b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b3 = r2;
                        hd hdVar = this.b;
                        switch (b3) {
                            case 0:
                                hdVar.dismiss();
                                return;
                            case 1:
                                new ava(hdVar.getContext(), hdVar.S0).show();
                                return;
                            default:
                                DialogInterface.OnClickListener onClickListener = hdVar.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(hdVar, ((Integer) view.getTag()).intValue());
                                }
                                hdVar.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.a1 == null) {
                ge0 ge0Var = new ge0(y6c.t0, wjbVar, getContext());
                this.a1 = ge0Var;
                ote.a(ge0Var);
                this.a1.setOnClickListener(new View.OnClickListener(this) {
                    public final hd b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b3 = r2;
                        hd hdVar = this.b;
                        switch (b3) {
                            case 0:
                                hdVar.dismiss();
                                return;
                            case 1:
                                new ava(hdVar.getContext(), hdVar.S0).show();
                                return;
                            default:
                                DialogInterface.OnClickListener onClickListener = hdVar.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(hdVar, ((Integer) view.getTag()).intValue());
                                }
                                hdVar.dismiss();
                                return;
                        }
                    }
                });
            }
            gl.B2(this.b1);
            gl.B2(this.a1);
            this.Z0.addView(this.b1, nme.e(-2, -2, 17));
            this.Z0.addView(this.a1, nme.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
            viewGroup = this.Z0;
        }
        if (z) {
            if (this.Y0) {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 119;
                setContentView(viewGroup, layoutParams);
            } else if (this.a > 0) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams2.gravity = 17;
                setContentView(viewGroup, layoutParams2);
            } else {
                setContentView(viewGroup);
            }
        }
        if (this.m0 == null && this.o0 == null && this.q0 == null && this.s0 == null) {
            objArr = null;
        } else {
            objArr = 1;
        }
        if (this.V == 0 && this.Y == 0 && this.c0 == null) {
            View view = this.W;
            if (view != null) {
                view.setPadding(0, 0, 0, 0);
                f = 16.0f;
                this.b1.addView(this.W, nme.t(-1, this.b0, 51, 0, 0, 0, 0));
            } else {
                f = 16.0f;
            }
        } else {
            f = 16.0f;
            ?? imageView = new ImageView(getContext());
            this.l0 = imageView;
            Drawable drawable = this.c0;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                Drawable drawable2 = this.c0;
                if (drawable2 instanceof yx) {
                    yx yxVar = (yx) drawable2;
                    this.l0.addOnAttachStateChangeListener(new wc(yxVar, (byte) 0));
                    yxVar.a(this.l0);
                }
            } else {
                int i17 = this.V;
                if (i17 != 0) {
                    imageView.setImageResource(i17);
                } else {
                    imageView.setAutoRepeat(this.T0);
                    ry8 ry8Var = this.l0;
                    int i18 = this.Y;
                    byte b3 = this.Z;
                    ry8Var.f(i18, b3, b3, null);
                    if (this.a0 != null) {
                        oy8 animatedDrawable = this.l0.getAnimatedDrawable();
                        for (Map.Entry entry : this.a0.entrySet()) {
                            Integer num = (Integer) entry.getValue();
                            num.getClass();
                            animatedDrawable.s.put((String) entry.getKey(), num);
                            animatedDrawable.B();
                        }
                        this.d1 = this.d0;
                    }
                    this.l0.d();
                }
            }
            this.l0.setScaleType(ImageView.ScaleType.CENTER);
            if (this.X) {
                this.l0.setBackground(new gd(this.l0, this.d0, gl.L(52.0f) + this.Z, this.e0, this.f0));
                this.b0 = (short) 92;
            } else {
                int i19 = this.e0;
                ry8 ry8Var2 = this.l0;
                if (i19 >= 0) {
                    zkb.B(ry8Var2, bkb.c0(gl.L(10.0f), 0, this.d0), zkb.M(this.e0), this.f0);
                } else {
                    ry8Var2.setBackground(bkb.c0(gl.L(10.0f), 0, this.d0));
                }
            }
            boolean z4 = this.X;
            ry8 ry8Var3 = this.l0;
            if (z4) {
                ry8Var3.setTranslationY(gl.L(16.0f));
            } else {
                ry8Var3.setTranslationY(0.0f);
            }
            this.l0.setPadding(0, 0, 0, 0);
            this.b1.addView(this.l0, nme.t(-1, this.b0, 51, 0, 0, 0, 0));
        }
        if (this.S != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            f2 = 4.0f;
            this.b1.addView(frameLayout2, nme.t(-2, -2, this.X ? 1 : 0, 24, 0, 24, 0));
            wla wlaVar = new wla(null, getContext(), false);
            this.f = wlaVar;
            kk7.i(wlaVar);
            wla wlaVar2 = this.f;
            wlaVar2.s = (byte) 3;
            wlaVar2.setText(this.S);
            wla wlaVar3 = this.f;
            int e = e(bkb.i5);
            this.f1 = e;
            wlaVar3.setTextColor(e);
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(gl.o());
            wla wlaVar4 = this.f;
            if (this.X) {
                i14 = 1;
            } else if (k96.a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            wlaVar4.setGravity(i14 | 48);
            FrameLayout frameLayout3 = this.s;
            wla wlaVar5 = this.f;
            boolean z5 = this.X;
            if (z5) {
                i15 = 1;
            } else if (k96.a0) {
                i15 = 5;
            } else {
                i15 = 3;
            }
            int i20 = i15 | 48;
            if (z5) {
                f8 = 4.0f;
            } else {
                if (this.T != null) {
                    i16 = 2;
                } else if (this.Q != null) {
                    i16 = 14;
                } else {
                    i16 = 10;
                }
                f8 = i16;
            }
            frameLayout3.addView(wlaVar5, nme.d(-2, -2.0f, i20, 0.0f, 19.0f, 0.0f, f8));
        } else {
            f2 = 4.0f;
        }
        String str = this.T;
        fd fdVar = this.j1;
        if (str != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.T);
            zkb.X(this.h, bkb.I5, fdVar);
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (k96.a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            cd cdVar3 = this.b1;
            TextView textView3 = this.h;
            if (k96.a0) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            int i21 = i12 | 48;
            f3 = 20.0f;
            if (this.Q != null) {
                i13 = 14;
            } else {
                i13 = 10;
            }
            cdVar3.addView(textView3, nme.t(-2, -2, i21, 24, 0, 24, i13));
        } else {
            f3 = 20.0f;
        }
        if (b2 == 0) {
            BitmapDrawable[] bitmapDrawableArr = this.E;
            bitmapDrawableArr[0] = (BitmapDrawable) getContext().getResources().getDrawable(2131231240).mutate();
            bitmapDrawableArr[1] = (BitmapDrawable) getContext().getResources().getDrawable(2131231241).mutate();
            bitmapDrawableArr[0].setAlpha(0);
            bitmapDrawableArr[1].setAlpha(0);
            bitmapDrawableArr[0].setCallback(this);
            bitmapDrawableArr[1].setCallback(this);
            xc xcVar = new xc(this, getContext(), (byte) 0);
            this.w = xcVar;
            xcVar.setVerticalScrollBarEnabled(false);
            gl.v3(this.w, e(bkb.z5));
            this.b1.addView(this.w, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.x = linearLayout;
            linearLayout.setOrientation(1);
            f4 = 0.0f;
            this.w.addView(this.x, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f4 = 0.0f;
        }
        bu3 bu3Var = new bu3(getContext());
        this.n = bu3Var;
        kk7.i(bu3Var);
        bu3 bu3Var2 = this.n;
        if (this.X) {
            i = bkb.x6;
        } else {
            i = bkb.i5;
        }
        int e2 = e(i);
        this.g1 = e2;
        bu3Var2.setTextColor(e2);
        this.n.setTextSize(1, f);
        this.n.setMovementMethod(new cl((byte) 0));
        zkb.G(this.n, bkb.j5, fdVar);
        if (!this.i0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        bu3 bu3Var3 = this.n;
        if (this.X) {
            i2 = 1;
        } else if (k96.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        bu3Var3.setGravity(i2 | 48);
        if (b2 == 2) {
            cd cdVar4 = this.b1;
            bu3 bu3Var4 = this.n;
            if (k96.a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            int i22 = i7 | 48;
            if (this.S == null) {
                i8 = 19;
            } else {
                i8 = 0;
            }
            cdVar4.addView(bu3Var4, nme.t(-2, -2, i22, 24, i8, 24, 20));
            j26 j26Var = new j26(getContext());
            this.v0 = j26Var;
            j26Var.a(false, this.h0 / 100.0f);
            this.v0.setProgressColor(e(bkb.E5));
            this.v0.setBackColor(e(bkb.F5));
            this.b1.addView(this.v0, nme.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.w0 = textView4;
            textView4.setTypeface(gl.o());
            TextView textView5 = this.w0;
            if (k96.a0) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            textView5.setGravity(i9 | 48);
            zkb.X(this.w0, bkb.p5, fdVar);
            this.w0.setTextSize(1, 14.0f);
            cd cdVar5 = this.b1;
            TextView textView6 = this.w0;
            if (k96.a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            cdVar5.addView(textView6, nme.t(-2, -2, i10 | 48, 23, 4, 23, 24));
            this.w0.setText(String.format("%d%%", Integer.valueOf(this.h0)));
        } else if (b2 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            int i23 = bkb.L5;
            this.c1 = i23;
            this.V0 = e(i23);
            if (!this.U0) {
                this.r.setBackgroundDrawable(bkb.b0(gl.L(18.0f), this.V0));
            }
            this.b1.addView(this.r, nme.r(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), wjbVar);
            radialProgressView.setSize(gl.L(32.0f));
            radialProgressView.setProgressColor(e(bkb.M5));
            this.r.addView(radialProgressView, nme.e(86, 86, 17));
        } else {
            bu3 bu3Var5 = this.d;
            if (bu3Var5 != null) {
                this.x.addView(bu3Var5, nme.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.x;
            bu3 bu3Var6 = this.n;
            if (this.X) {
                i3 = 1;
            } else if (k96.a0) {
                i3 = 5;
            } else {
                i3 = 3;
            }
            int i24 = i3 | 48;
            if (this.b == null && this.Q == null) {
                b = 0;
            } else {
                b = this.H;
            }
            linearLayout2.addView(bu3Var6, nme.t(-2, -2, i24, 24, 0, 24, b));
            TextView textView7 = this.c;
            if (textView7 != null) {
                this.x.addView(textView7, nme.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        boolean isEmpty = TextUtils.isEmpty(this.U);
        bu3 bu3Var7 = this.n;
        if (!isEmpty) {
            bu3Var7.setText(this.U);
            this.n.setVisibility(0);
        } else {
            bu3Var7.setVisibility(8);
        }
        if (this.Q != null) {
            int i25 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.Q;
                if (i25 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i25] != null) {
                    ad adVar = new ad(getContext(), wjbVar);
                    CharSequence charSequence = this.Q[i25];
                    int[] iArr = this.R;
                    if (iArr != null) {
                        i6 = iArr[i25];
                    } else {
                        i6 = 0;
                    }
                    adVar.a(i6, charSequence);
                    adVar.setTag(Integer.valueOf(i25));
                    this.O0.add(adVar);
                    this.x.addView(adVar, nme.o(-1, 50));
                    adVar.setOnClickListener(new View.OnClickListener(this) {
                        public final hd b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            byte b32 = r2;
                            hd hdVar = this.b;
                            switch (b32) {
                                case 0:
                                    hdVar.dismiss();
                                    return;
                                case 1:
                                    new ava(hdVar.getContext(), hdVar.S0).show();
                                    return;
                                default:
                                    DialogInterface.OnClickListener onClickListener = hdVar.N;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(hdVar, ((Integer) view2.getTag()).intValue());
                                    }
                                    hdVar.dismiss();
                                    return;
                            }
                        }
                    });
                }
                i25++;
            }
        }
        View view2 = this.b;
        if (view2 != null) {
            if (view2.getParent() != null) {
                ((ViewGroup) this.b.getParent()).removeView(this.b);
            }
            this.x.addView(this.b, nme.o(-1, this.e));
        }
        if (objArr != null) {
            if (!this.J0) {
                TextPaint textPaint = new TextPaint();
                de9.p(textPaint, gl.L(16.0f));
                CharSequence charSequence2 = this.m0;
                if (charSequence2 != null) {
                    i5 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + gl.L(24.0f) + f4);
                } else {
                    i5 = 0;
                }
                if (this.o0 != null) {
                    if (i5 > 0) {
                        i5 += gl.L(8.0f);
                    }
                    String str2 = this.o0;
                    i5 = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + gl.L(24.0f) + i5);
                }
                if (this.q0 != null) {
                    if (i5 > 0) {
                        i5 += gl.L(8.0f);
                    }
                    String str3 = this.q0;
                    i5 = (int) (textPaint.measureText((CharSequence) str3, 0, str3.length()) + gl.L(24.0f) + i5);
                }
                if (this.s0 != null) {
                    if (i5 > 0) {
                        i5 += gl.L(8.0f);
                    }
                    String str4 = this.s0;
                    i5 = (int) (textPaint.measureText((CharSequence) str4, 0, str4.length()) + gl.L(24.0f) + i5);
                }
                if (i5 > gl.q.x - gl.L(64.0f)) {
                    if (this.K0 && this.m0 != null && this.o0 != null && this.q0 != null && this.s0 != null) {
                        this.L0 = true;
                    } else {
                        this.J0 = true;
                    }
                }
            }
            if (this.J0) {
                LinearLayout linearLayout3 = new LinearLayout(getContext());
                linearLayout3.setOrientation(1);
                this.u0 = linearLayout3;
            } else {
                this.u0 = new yc((byte) 0, getContext(), this);
            }
            TextView textView8 = this.c;
            ViewGroup viewGroup2 = this.u0;
            if (textView8 != null) {
                viewGroup2.setPadding(gl.L(16.0f), 0, gl.L(16.0f), gl.L(f2));
                this.u0.setTranslationY(-gl.L(6.0f));
            } else {
                viewGroup2.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
            }
            cd cdVar6 = this.b1;
            ViewGroup viewGroup3 = this.u0;
            if (this.L0) {
                i4 = 96;
            } else {
                i4 = 52;
            }
            cdVar6.addView(viewGroup3, nme.o(-1, i4));
            if (this.X) {
                this.u0.setTranslationY(-gl.L(8.0f));
            }
            if (this.m0 != null) {
                f5 = 64.0f;
                zc zcVar = new zc(getContext(), (byte) 0);
                zcVar.setMinWidth(gl.L(64.0f));
                zcVar.setTag(-1);
                zcVar.setTextSize(1, 16.0f);
                zkb.X(zcVar, this.J, fdVar);
                zcVar.setGravity(17);
                zcVar.setTypeface(gl.o());
                zcVar.setText(this.m0);
                f6 = 6.0f;
                zcVar.setBackground(bkb.H0(gl.L(f3), e(this.J)));
                zcVar.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
                boolean z6 = this.J0;
                ViewGroup viewGroup4 = this.u0;
                f7 = 12.0f;
                if (z6) {
                    viewGroup4.addView(zcVar, nme.r(-1, 40, 7));
                } else {
                    viewGroup4.addView(zcVar, nme.e(-2, 40, 53));
                }
                zcVar.setOnClickListener(new t(this, zcVar, (byte) 8));
            } else {
                f5 = 64.0f;
                f6 = 6.0f;
                f7 = 12.0f;
            }
            if (this.o0 != null) {
                zc zcVar2 = new zc(getContext(), (byte) 1);
                zcVar2.setMinWidth(gl.L(f5));
                zcVar2.setTag(-2);
                zcVar2.setTextSize(1, 16.0f);
                zkb.X(zcVar2, this.J, fdVar);
                zcVar2.setGravity(17);
                zcVar2.setTypeface(gl.o());
                zcVar2.setEllipsize(TextUtils.TruncateAt.END);
                zcVar2.setSingleLine(true);
                zcVar2.setText(this.o0.toString());
                zcVar2.setBackground(bkb.H0(gl.L(f3), e(this.J)));
                zcVar2.setPadding(gl.L(f7), 0, gl.L(f7), 0);
                boolean z7 = this.J0;
                ViewGroup viewGroup5 = this.u0;
                if (z7) {
                    viewGroup5.addView(zcVar2, 0, nme.r(-1, 40, 7));
                } else {
                    viewGroup5.addView(zcVar2, nme.e(-2, 40, 53));
                }
                zcVar2.setOnClickListener(new t(this, zcVar2, (byte) 9));
            }
            if (this.s0 != null) {
                zc zcVar3 = new zc(getContext(), (byte) 2);
                zcVar3.setMinWidth(gl.L(f5));
                zcVar3.setTag(-3);
                zcVar3.setTextSize(1, 16.0f);
                zkb.X(zcVar3, this.J, fdVar);
                zcVar3.setGravity(17);
                zcVar3.setTypeface(gl.o());
                zcVar3.setEllipsize(TextUtils.TruncateAt.END);
                zcVar3.setSingleLine(true);
                zcVar3.setText(this.s0.toString());
                zcVar3.setBackground(bkb.H0(gl.L(f3), e(this.J)));
                zcVar3.setPadding(gl.L(f7), 0, gl.L(f7), 0);
                boolean z8 = this.J0;
                ViewGroup viewGroup6 = this.u0;
                if (z8) {
                    viewGroup6.addView(zcVar3, 1, nme.r(-1, 40, 7));
                } else {
                    viewGroup6.addView(zcVar3, nme.e(-2, 40, 51));
                }
                zcVar3.setOnClickListener(new t(this, zcVar3, (byte) 10));
            }
            if (this.q0 != null) {
                zc zcVar4 = new zc(getContext(), (byte) 3);
                zcVar4.setMinWidth(gl.L(f5));
                zcVar4.setTag(-4);
                zcVar4.setTextSize(1, 16.0f);
                zkb.X(zcVar4, this.J, fdVar);
                zcVar4.setGravity(17);
                zcVar4.setTypeface(gl.o());
                zcVar4.setEllipsize(TextUtils.TruncateAt.END);
                zcVar4.setSingleLine(true);
                zcVar4.setText(this.q0.toString());
                zcVar4.setBackground(bkb.H0(gl.L(f3), e(this.J)));
                zcVar4.setPadding(gl.L(f7), 0, gl.L(f7), 0);
                boolean z9 = this.J0;
                ViewGroup viewGroup7 = this.u0;
                if (z9) {
                    viewGroup7.addView(zcVar4, 0, nme.r(-1, 40, 7));
                } else {
                    viewGroup7.addView(zcVar4, nme.e(-2, 40, 53));
                }
                zcVar4.setOnClickListener(new t(this, zcVar4, (byte) 11));
            }
            if (this.J0) {
                for (int i26 = 1; i26 < this.u0.getChildCount(); i26++) {
                    ((ViewGroup.MarginLayoutParams) this.u0.getChildAt(i26).getLayoutParams()).topMargin = gl.L(f6);
                }
            }
        }
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams();
        layoutParams3.copyFrom(window.getAttributes());
        if (this.Y0) {
            layoutParams3.width = -1;
            layoutParams3.height = -1;
            layoutParams3.flags |= 1024;
            this.M = gl.q.x;
            this.b1.getLayoutParams().width = d();
            window.setWindowAnimations(2131755178);
        } else if (b2 == 3) {
            layoutParams3.width = -1;
        } else {
            if (this.Q0) {
                layoutParams3.dimAmount = this.R0;
                layoutParams3.flags |= 2;
            } else {
                layoutParams3.dimAmount = f4;
                layoutParams3.flags ^= 2;
            }
            this.M = gl.q.x;
            layoutParams3.width = d();
        }
        View view3 = this.b;
        if (view3 != null && this.z0 && a(view3)) {
            layoutParams3.flags &= -131073;
            layoutParams3.softInputMode = 16;
        } else {
            layoutParams3.flags |= 131072;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            layoutParams3.layoutInDisplayCutoutMode = 0;
        }
        if (this.U0) {
            gl.j2(new be2(this, (byte) 2), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final c01 g(int i, boolean z, boolean z2) {
        View c = c(i);
        if (z2) {
            this.k0 = false;
        }
        uc ucVar = new uc(c, (byte) 0);
        mn6 mn6Var = new mn6(this, c, z, (byte) 5);
        ?? obj = new Object();
        obj.a = ucVar;
        obj.c = mn6Var;
        return obj;
    }

    public final void h() {
        TextView textView = (TextView) c(-1);
        if (textView != null) {
            zkb.X(textView, bkb.p7, this.j1);
        }
    }

    public final void i(int i, boolean z) {
        int i2;
        boolean[] zArr = this.F;
        if (z) {
            if (zArr[i]) {
                return;
            }
        } else if (!zArr[i]) {
            return;
        }
        zArr[i] = z;
        AnimatorSet[] animatorSetArr = this.G;
        AnimatorSet animatorSet = animatorSetArr[i];
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSetArr[i] = animatorSet2;
        BitmapDrawable bitmapDrawable = this.E[i];
        if (bitmapDrawable != null) {
            if (z) {
                i2 = 255;
            } else {
                i2 = 0;
            }
            animatorSet2.playTogether(ObjectAnimator.ofInt(bitmapDrawable, "alpha", i2));
        }
        animatorSetArr[i].setDuration(150L);
        animatorSetArr[i].addListener(new y7(this, i, (byte) 1));
        try {
            animatorSetArr[i].start();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        this.w.invalidate();
        this.x.invalidate();
    }

    public final void j(int i) {
        this.c1 = -1;
        this.V0 = i;
        Drawable drawable = this.A0;
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(this.V0, PorterDuff.Mode.MULTIPLY));
        }
    }

    public final void k(boolean z) {
        if (this.I0) {
            return;
        }
        this.I0 = true;
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (this.I0) {
            attributes.softInputMode = 16;
            attributes.flags &= -131073;
        } else {
            attributes.softInputMode = 48;
            attributes.flags |= 131072;
        }
        window.setAttributes(attributes);
    }

    public final void l(int i, int i2, int i3) {
        if (i >= 0) {
            ArrayList arrayList = this.O0;
            if (i < arrayList.size()) {
                ad adVar = (ad) arrayList.get(i);
                adVar.a.setTextColor(i2);
                adVar.b.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void m(String str) {
        this.U = str;
        if (this.n != null) {
            boolean isEmpty = TextUtils.isEmpty(str);
            bu3 bu3Var = this.n;
            if (!isEmpty) {
                bu3Var.setText(this.U);
                this.n.setVisibility(0);
                return;
            }
            bu3Var.setVisibility(8);
        }
    }

    public final void n(int i) {
        this.h0 = i;
        j26 j26Var = this.v0;
        if (j26Var != null) {
            j26Var.a(true, i / 100.0f);
            this.w0.setText(String.format("%d%%", Integer.valueOf(this.h0)));
        }
    }

    public final void o(int i) {
        this.h1 = true;
        wla wlaVar = this.f;
        if (wlaVar != null) {
            wlaVar.setTextColor(i);
        }
        bu3 bu3Var = this.n;
        if (bu3Var != null) {
            bu3Var.setTextColor(i);
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        px5 px5Var = this.x0;
        if (px5Var != null) {
            px5Var.u(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        kk7.e().b(this, kk7.k4);
    }

    public final void p() {
        if (this.j0 && this.L == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.S0, getContext());
            String M0 = k96.M0(2131744595, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131744596, null);
            alertDialog$Builder.j(k96.M0(2131742971, null), null);
            alertDialog$Builder.g(k96.M0(2131744604, null), new l0(this, (byte) 8));
            alertDialog$Builder.i(new n1(this, (byte) 1));
            try {
                this.L = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j) {
        tc tcVar = this.N0;
        gl.r(tcVar);
        gl.e3(tcVar, j);
    }

    public final void r() {
        ry8 ry8Var;
        int v0;
        if (this.e0 >= 0 && this.a0 != null && (ry8Var = this.l0) != null && ry8Var.getAnimatedDrawable() != null && (v0 = bkb.v0(this.e0, this.f0)) != this.d1) {
            oy8 animatedDrawable = this.l0.getAnimatedDrawable();
            for (Map.Entry entry : this.a0.entrySet()) {
                if (entry.getValue() != null && ((Integer) entry.getValue()).intValue() == this.d1) {
                    entry.setValue(Integer.valueOf(v0));
                    animatedDrawable.L(v0, (String) entry.getKey());
                }
            }
            this.d1 = v0;
        }
    }

    @Override
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        xc xcVar = this.w;
        if (xcVar != null) {
            xcVar.postDelayed(runnable, j);
        }
    }

    @Override
    public final void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.K = onCancelListener;
        super.setOnCancelListener(onCancelListener);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.S = charSequence;
        wla wlaVar = this.f;
        if (wlaVar != null) {
            wlaVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!gl.K1(getContext())) {
            return;
        }
        this.i1 = false;
        super.show();
        FrameLayout frameLayout = this.r;
        if (frameLayout != null && this.g0 == 3) {
            frameLayout.setScaleX(0.0f);
            this.r.setScaleY(0.0f);
            this.r.animate().scaleX(1.0f).scaleY(1.0f).setInterpolator(new OvershootInterpolator(1.3f)).setDuration(190L).start();
        }
        this.X0 = System.currentTimeMillis();
    }

    @Override
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        xc xcVar = this.w;
        if (xcVar != null) {
            xcVar.removeCallbacks(runnable);
        }
    }

    public hd(Context context) {
        this(3, null, context);
    }
}
