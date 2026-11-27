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
public class id extends Dialog implements Drawable.Callback, fn7 {
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
    public id L;
    public boolean L0;
    public int M;
    public final uc M0;
    public DialogInterface.OnClickListener N;
    public final uc N0;
    public DialogInterface.OnDismissListener O;
    public final ArrayList O0;
    public pcc P;
    public float P0;
    public CharSequence[] Q;
    public boolean Q0;
    public int[] R;
    public float R0;
    public CharSequence S;
    public final vnb S0;
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
    public ie0 a1;
    public View b;
    public short b0;
    public dd b1;
    public TextView c;
    public Drawable c0;
    public int c1;
    public uu3 d;
    public int d0;
    public int d1;
    public int e;
    public int e0;
    public int e1;
    public tpa f;
    public vnb f0;
    public int f1;
    public final byte g0;
    public int g1;
    public TextView h;
    public int h0;
    public boolean h1;
    public boolean i0;
    public boolean i1;
    public boolean j0;
    public final gd j1;
    public boolean k0;
    public e29 l0;
    public CharSequence m0;
    public uu3 n;
    public fd n0;
    public String o0;
    public fd p0;
    public String q0;
    public FrameLayout r;
    public xi9 r0;
    public FrameLayout s;
    public String s0;
    public fd t0;
    public ViewGroup u0;
    public n46 v0;
    public yc w;
    public TextView w0;
    public LinearLayout x;
    public g16 x0;
    public cd y;
    public final int[] y0;
    public boolean z0;

    public id(int i, vnb vnbVar, Context context) {
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
        this.J = aob.H5;
        this.b0 = (short) 132;
        this.e0 = -1;
        this.i0 = true;
        this.j0 = true;
        this.k0 = true;
        this.y0 = new int[2];
        this.z0 = true;
        this.M0 = new uc(this, (byte) 0);
        this.N0 = new uc(this, (byte) 1);
        this.O0 = new ArrayList();
        this.Q0 = true;
        this.R0 = 0.5f;
        this.T0 = true;
        this.c1 = -1;
        this.j1 = new gd(this, (byte) 0);
        this.S0 = vnbVar;
        this.g0 = i;
        int i2 = aob.h5;
        this.c1 = i2;
        int e = e(i2);
        this.V0 = e;
        if (hl.B(e) < 0.721f) {
            z = true;
        } else {
            z = false;
        }
        if (xea.o() >= 2 && i86.e(256) && z) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.U0 = z2;
        Rect rect = new Rect();
        this.B0 = rect;
        if (i != 3 || this.U0) {
            Drawable e2 = c00.e(context, 2131232583);
            this.A0 = e2;
            if (i == 3) {
                f = 0.55f;
            } else if (z) {
                f = 0.8f;
            } else {
                f = 0.985f;
            }
            this.C0 = f;
            e2.setColorFilter(new PorterDuffColorFilter(this.V0, PorterDuff.Mode.MULTIPLY));
            e2.getPadding(rect);
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
            hl.d3(new uc(this, (byte) 0), currentTimeMillis - j);
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
        int L2 = (hl.q.x - hl.L(48.0f)) - (this.W0 << 1);
        if (hl.O1()) {
            if (hl.N1()) {
                L = hl.L(446.0f);
            } else {
                L = hl.L(496.0f);
            }
        } else {
            L = hl.L(356.0f);
        }
        int min = Math.min(L, L2);
        Rect rect = this.B0;
        return min + rect.left + rect.right;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        uu3 uu3Var;
        if (i == jn7.l4 && (uu3Var = this.n) != null) {
            uu3Var.invalidate();
        }
    }

    @Override
    public void dismiss() {
        Bitmap bitmap;
        pcc pccVar = this.P;
        if (pccVar != null) {
            this.P = null;
            pccVar.a(new uc(this, (byte) 0));
        } else if (!this.i1) {
            this.i1 = true;
            jn7.e().n(this, jn7.l4);
            DialogInterface.OnDismissListener onDismissListener = this.O;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
            id idVar = this.L;
            if (idVar != null) {
                idVar.dismiss();
            }
            try {
                super.dismiss();
            } catch (Throwable unused) {
            }
            hl.r(this.N0);
            if (this.F0 != null && (bitmap = this.D0) != null) {
                bitmap.recycle();
                this.F0 = null;
                this.G0 = null;
                this.D0 = null;
            }
        }
    }

    public int e(int i) {
        return aob.v0(i, this.S0);
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
        dd ddVar = new dd(this, getContext());
        this.b1 = ddVar;
        ddVar.setOrientation(1);
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
            dd ddVar2 = this.b1;
            yi yiVar = yhc.a;
            ddVar2.setOutlineProvider(new whc(hl.L(8.0f), hl.L(20.0f)));
            this.b1.setClipToOutline(true);
        }
        ViewGroup viewGroup = this.b1;
        boolean z3 = this.Y0;
        vnb vnbVar = this.S0;
        if (z3) {
            if (this.Z0 == null) {
                FrameLayout frameLayout = new FrameLayout(getContext());
                this.Z0 = frameLayout;
                frameLayout.setOnClickListener(new View.OnClickListener(this) {
                    public final id b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b3 = r2;
                        id idVar = this.b;
                        switch (b3) {
                            case 0:
                                idVar.dismiss();
                                return;
                            case 1:
                                new eza(idVar.getContext(), idVar.S0).show();
                                return;
                            default:
                                DialogInterface.OnClickListener onClickListener = idVar.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(idVar, ((Integer) view.getTag()).intValue());
                                }
                                idVar.dismiss();
                                return;
                        }
                    }
                });
            }
            if (this.a1 == null) {
                ie0 ie0Var = new ie0(yac.t0, vnbVar, getContext());
                this.a1 = ie0Var;
                iye.a(ie0Var);
                this.a1.setOnClickListener(new View.OnClickListener(this) {
                    public final id b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        byte b3 = r2;
                        id idVar = this.b;
                        switch (b3) {
                            case 0:
                                idVar.dismiss();
                                return;
                            case 1:
                                new eza(idVar.getContext(), idVar.S0).show();
                                return;
                            default:
                                DialogInterface.OnClickListener onClickListener = idVar.N;
                                if (onClickListener != null) {
                                    onClickListener.onClick(idVar, ((Integer) view.getTag()).intValue());
                                }
                                idVar.dismiss();
                                return;
                        }
                    }
                });
            }
            hl.B2(this.b1);
            hl.B2(this.a1);
            this.Z0.addView(this.b1, tre.e(-2, -2, 17));
            this.Z0.addView(this.a1, tre.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
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
                this.b1.addView(this.W, tre.t(-1, this.b0, 51, 0, 0, 0, 0));
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
                if (drawable2 instanceof zx) {
                    zx zxVar = (zx) drawable2;
                    this.l0.addOnAttachStateChangeListener(new xc(zxVar, (byte) 0));
                    zxVar.a(this.l0);
                }
            } else {
                int i17 = this.V;
                if (i17 != 0) {
                    imageView.setImageResource(i17);
                } else {
                    imageView.setAutoRepeat(this.T0);
                    e29 e29Var = this.l0;
                    int i18 = this.Y;
                    byte b3 = this.Z;
                    e29Var.f(i18, b3, b3, null);
                    if (this.a0 != null) {
                        b29 animatedDrawable = this.l0.getAnimatedDrawable();
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
                this.l0.setBackground(new hd(this.l0, this.d0, hl.L(52.0f) + this.Z, this.e0, this.f0));
                this.b0 = (short) 92;
            } else {
                int i19 = this.e0;
                e29 e29Var2 = this.l0;
                if (i19 >= 0) {
                    yob.B(e29Var2, aob.c0(hl.L(10.0f), 0, this.d0), yob.M(this.e0), this.f0);
                } else {
                    e29Var2.setBackground(aob.c0(hl.L(10.0f), 0, this.d0));
                }
            }
            boolean z4 = this.X;
            e29 e29Var3 = this.l0;
            if (z4) {
                e29Var3.setTranslationY(hl.L(16.0f));
            } else {
                e29Var3.setTranslationY(0.0f);
            }
            this.l0.setPadding(0, 0, 0, 0);
            this.b1.addView(this.l0, tre.t(-1, this.b0, 51, 0, 0, 0, 0));
        }
        if (this.S != null) {
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            this.s = frameLayout2;
            f2 = 4.0f;
            this.b1.addView(frameLayout2, tre.t(-2, -2, this.X ? 1 : 0, 24, 0, 24, 0));
            tpa tpaVar = new tpa(null, getContext(), false);
            this.f = tpaVar;
            jn7.i(tpaVar);
            tpa tpaVar2 = this.f;
            tpaVar2.s = (byte) 3;
            tpaVar2.setText(this.S);
            tpa tpaVar3 = this.f;
            int e = e(aob.j5);
            this.f1 = e;
            tpaVar3.setTextColor(e);
            this.f.setTextSize(1, 20.0f);
            this.f.setTypeface(hl.o());
            tpa tpaVar4 = this.f;
            if (this.X) {
                i14 = 1;
            } else if (ob6.a0) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            tpaVar4.setGravity(i14 | 48);
            FrameLayout frameLayout3 = this.s;
            tpa tpaVar5 = this.f;
            boolean z5 = this.X;
            if (z5) {
                i15 = 1;
            } else if (ob6.a0) {
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
            frameLayout3.addView(tpaVar5, tre.d(-2, -2.0f, i20, 0.0f, 19.0f, 0.0f, f8));
        } else {
            f2 = 4.0f;
        }
        String str = this.T;
        gd gdVar = this.j1;
        if (str != null) {
            TextView textView = new TextView(getContext());
            this.h = textView;
            textView.setText(this.T);
            yob.X(this.h, aob.J5, gdVar);
            this.h.setTextSize(1, 14.0f);
            TextView textView2 = this.h;
            if (ob6.a0) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            textView2.setGravity(i11 | 48);
            dd ddVar3 = this.b1;
            TextView textView3 = this.h;
            if (ob6.a0) {
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
            ddVar3.addView(textView3, tre.t(-2, -2, i21, 24, 0, 24, i13));
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
            yc ycVar = new yc(this, getContext(), (byte) 0);
            this.w = ycVar;
            ycVar.setVerticalScrollBarEnabled(false);
            hl.u3(this.w, e(aob.A5));
            this.b1.addView(this.w, tre.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.x = linearLayout;
            linearLayout.setOrientation(1);
            f4 = 0.0f;
            this.w.addView(this.x, new FrameLayout.LayoutParams(-1, -2));
        } else {
            f4 = 0.0f;
        }
        uu3 uu3Var = new uu3(getContext());
        this.n = uu3Var;
        jn7.i(uu3Var);
        uu3 uu3Var2 = this.n;
        if (this.X) {
            i = aob.y6;
        } else {
            i = aob.j5;
        }
        int e2 = e(i);
        this.g1 = e2;
        uu3Var2.setTextColor(e2);
        this.n.setTextSize(1, f);
        this.n.setMovementMethod(new dl((byte) 0));
        yob.G(this.n, aob.k5, gdVar);
        if (!this.i0) {
            this.n.setClickable(false);
            this.n.setEnabled(false);
        }
        uu3 uu3Var3 = this.n;
        if (this.X) {
            i2 = 1;
        } else if (ob6.a0) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        uu3Var3.setGravity(i2 | 48);
        if (b2 == 2) {
            dd ddVar4 = this.b1;
            uu3 uu3Var4 = this.n;
            if (ob6.a0) {
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
            ddVar4.addView(uu3Var4, tre.t(-2, -2, i22, 24, i8, 24, 20));
            n46 n46Var = new n46(getContext());
            this.v0 = n46Var;
            n46Var.a(false, this.h0 / 100.0f);
            this.v0.setProgressColor(e(aob.F5));
            this.v0.setBackColor(e(aob.G5));
            this.b1.addView(this.v0, tre.t(-1, 4, 19, 24, 0, 24, 0));
            TextView textView4 = new TextView(getContext());
            this.w0 = textView4;
            textView4.setTypeface(hl.o());
            TextView textView5 = this.w0;
            if (ob6.a0) {
                i9 = 5;
            } else {
                i9 = 3;
            }
            textView5.setGravity(i9 | 48);
            yob.X(this.w0, aob.q5, gdVar);
            this.w0.setTextSize(1, 14.0f);
            dd ddVar5 = this.b1;
            TextView textView6 = this.w0;
            if (ob6.a0) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            ddVar5.addView(textView6, tre.t(-2, -2, i10 | 48, 23, 4, 23, 24));
            this.w0.setText(String.format("%d%%", Integer.valueOf(this.h0)));
        } else if (b2 == 3) {
            super.setCanceledOnTouchOutside(false);
            setCancelable(false);
            this.r = new FrameLayout(getContext());
            int i23 = aob.M5;
            this.c1 = i23;
            this.V0 = e(i23);
            if (!this.U0) {
                this.r.setBackgroundDrawable(aob.b0(hl.L(18.0f), this.V0));
            }
            this.b1.addView(this.r, tre.r(86, 86, 17));
            RadialProgressView radialProgressView = new RadialProgressView(getContext(), vnbVar);
            radialProgressView.setSize(hl.L(32.0f));
            radialProgressView.setProgressColor(e(aob.N5));
            this.r.addView(radialProgressView, tre.e(86, 86, 17));
        } else {
            uu3 uu3Var5 = this.d;
            if (uu3Var5 != null) {
                this.x.addView(uu3Var5, tre.k(22.0f, 4.0f, 22.0f, 12.0f, -1, -2));
            }
            LinearLayout linearLayout2 = this.x;
            uu3 uu3Var6 = this.n;
            if (this.X) {
                i3 = 1;
            } else if (ob6.a0) {
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
            linearLayout2.addView(uu3Var6, tre.t(-2, -2, i24, 24, 0, 24, b));
            TextView textView7 = this.c;
            if (textView7 != null) {
                this.x.addView(textView7, tre.k(22.0f, 12.0f, 22.0f, 0.0f, -1, -2));
            }
        }
        boolean isEmpty = TextUtils.isEmpty(this.U);
        uu3 uu3Var7 = this.n;
        if (!isEmpty) {
            uu3Var7.setText(this.U);
            this.n.setVisibility(0);
        } else {
            uu3Var7.setVisibility(8);
        }
        if (this.Q != null) {
            int i25 = 0;
            while (true) {
                CharSequence[] charSequenceArr = this.Q;
                if (i25 >= charSequenceArr.length) {
                    break;
                }
                if (charSequenceArr[i25] != null) {
                    bd bdVar = new bd(getContext(), vnbVar);
                    CharSequence charSequence = this.Q[i25];
                    int[] iArr = this.R;
                    if (iArr != null) {
                        i6 = iArr[i25];
                    } else {
                        i6 = 0;
                    }
                    bdVar.a(i6, charSequence);
                    bdVar.setTag(Integer.valueOf(i25));
                    this.O0.add(bdVar);
                    this.x.addView(bdVar, tre.o(-1, 50));
                    bdVar.setOnClickListener(new View.OnClickListener(this) {
                        public final id b;

                        {
                            this.b = this;
                        }

                        @Override
                        public final void onClick(View view2) {
                            byte b32 = r2;
                            id idVar = this.b;
                            switch (b32) {
                                case 0:
                                    idVar.dismiss();
                                    return;
                                case 1:
                                    new eza(idVar.getContext(), idVar.S0).show();
                                    return;
                                default:
                                    DialogInterface.OnClickListener onClickListener = idVar.N;
                                    if (onClickListener != null) {
                                        onClickListener.onClick(idVar, ((Integer) view2.getTag()).intValue());
                                    }
                                    idVar.dismiss();
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
            this.x.addView(this.b, tre.o(-1, this.e));
        }
        if (objArr != null) {
            if (!this.J0) {
                TextPaint textPaint = new TextPaint();
                uh9.p(textPaint, hl.L(16.0f));
                CharSequence charSequence2 = this.m0;
                if (charSequence2 != null) {
                    i5 = (int) (textPaint.measureText(charSequence2, 0, charSequence2.length()) + hl.L(24.0f) + f4);
                } else {
                    i5 = 0;
                }
                if (this.o0 != null) {
                    if (i5 > 0) {
                        i5 += hl.L(8.0f);
                    }
                    String str2 = this.o0;
                    i5 = (int) (textPaint.measureText((CharSequence) str2, 0, str2.length()) + hl.L(24.0f) + i5);
                }
                if (this.q0 != null) {
                    if (i5 > 0) {
                        i5 += hl.L(8.0f);
                    }
                    String str3 = this.q0;
                    i5 = (int) (textPaint.measureText((CharSequence) str3, 0, str3.length()) + hl.L(24.0f) + i5);
                }
                if (this.s0 != null) {
                    if (i5 > 0) {
                        i5 += hl.L(8.0f);
                    }
                    String str4 = this.s0;
                    i5 = (int) (textPaint.measureText((CharSequence) str4, 0, str4.length()) + hl.L(24.0f) + i5);
                }
                if (i5 > hl.q.x - hl.L(64.0f)) {
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
                this.u0 = new zc((byte) 0, getContext(), this);
            }
            TextView textView8 = this.c;
            ViewGroup viewGroup2 = this.u0;
            if (textView8 != null) {
                viewGroup2.setPadding(hl.L(16.0f), 0, hl.L(16.0f), hl.L(f2));
                this.u0.setTranslationY(-hl.L(6.0f));
            } else {
                viewGroup2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
            }
            dd ddVar6 = this.b1;
            ViewGroup viewGroup3 = this.u0;
            if (this.L0) {
                i4 = 96;
            } else {
                i4 = 52;
            }
            ddVar6.addView(viewGroup3, tre.o(-1, i4));
            if (this.X) {
                this.u0.setTranslationY(-hl.L(8.0f));
            }
            if (this.m0 != null) {
                f5 = 64.0f;
                ad adVar = new ad(getContext(), (byte) 0);
                adVar.setMinWidth(hl.L(64.0f));
                adVar.setTag(-1);
                adVar.setTextSize(1, 16.0f);
                yob.X(adVar, this.J, gdVar);
                adVar.setGravity(17);
                adVar.setTypeface(hl.o());
                adVar.setText(this.m0);
                f6 = 6.0f;
                adVar.setBackground(aob.H0(hl.L(f3), e(this.J)));
                adVar.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
                boolean z6 = this.J0;
                ViewGroup viewGroup4 = this.u0;
                f7 = 12.0f;
                if (z6) {
                    viewGroup4.addView(adVar, tre.r(-1, 40, 7));
                } else {
                    viewGroup4.addView(adVar, tre.e(-2, 40, 53));
                }
                adVar.setOnClickListener(new t(this, adVar, (byte) 8));
            } else {
                f5 = 64.0f;
                f6 = 6.0f;
                f7 = 12.0f;
            }
            if (this.o0 != null) {
                ad adVar2 = new ad(getContext(), (byte) 1);
                adVar2.setMinWidth(hl.L(f5));
                adVar2.setTag(-2);
                adVar2.setTextSize(1, 16.0f);
                yob.X(adVar2, this.J, gdVar);
                adVar2.setGravity(17);
                adVar2.setTypeface(hl.o());
                adVar2.setEllipsize(TextUtils.TruncateAt.END);
                adVar2.setSingleLine(true);
                adVar2.setText(this.o0.toString());
                adVar2.setBackground(aob.H0(hl.L(f3), e(this.J)));
                adVar2.setPadding(hl.L(f7), 0, hl.L(f7), 0);
                boolean z7 = this.J0;
                ViewGroup viewGroup5 = this.u0;
                if (z7) {
                    viewGroup5.addView(adVar2, 0, tre.r(-1, 40, 7));
                } else {
                    viewGroup5.addView(adVar2, tre.e(-2, 40, 53));
                }
                adVar2.setOnClickListener(new t(this, adVar2, (byte) 9));
            }
            if (this.s0 != null) {
                ad adVar3 = new ad(getContext(), (byte) 2);
                adVar3.setMinWidth(hl.L(f5));
                adVar3.setTag(-3);
                adVar3.setTextSize(1, 16.0f);
                yob.X(adVar3, this.J, gdVar);
                adVar3.setGravity(17);
                adVar3.setTypeface(hl.o());
                adVar3.setEllipsize(TextUtils.TruncateAt.END);
                adVar3.setSingleLine(true);
                adVar3.setText(this.s0.toString());
                adVar3.setBackground(aob.H0(hl.L(f3), e(this.J)));
                adVar3.setPadding(hl.L(f7), 0, hl.L(f7), 0);
                boolean z8 = this.J0;
                ViewGroup viewGroup6 = this.u0;
                if (z8) {
                    viewGroup6.addView(adVar3, 1, tre.r(-1, 40, 7));
                } else {
                    viewGroup6.addView(adVar3, tre.e(-2, 40, 51));
                }
                adVar3.setOnClickListener(new t(this, adVar3, (byte) 10));
            }
            if (this.q0 != null) {
                ad adVar4 = new ad(getContext(), (byte) 3);
                adVar4.setMinWidth(hl.L(f5));
                adVar4.setTag(-4);
                adVar4.setTextSize(1, 16.0f);
                yob.X(adVar4, this.J, gdVar);
                adVar4.setGravity(17);
                adVar4.setTypeface(hl.o());
                adVar4.setEllipsize(TextUtils.TruncateAt.END);
                adVar4.setSingleLine(true);
                adVar4.setText(this.q0.toString());
                adVar4.setBackground(aob.H0(hl.L(f3), e(this.J)));
                adVar4.setPadding(hl.L(f7), 0, hl.L(f7), 0);
                boolean z9 = this.J0;
                ViewGroup viewGroup7 = this.u0;
                if (z9) {
                    viewGroup7.addView(adVar4, 0, tre.r(-1, 40, 7));
                } else {
                    viewGroup7.addView(adVar4, tre.e(-2, 40, 53));
                }
                adVar4.setOnClickListener(new t(this, adVar4, (byte) 11));
            }
            if (this.J0) {
                for (int i26 = 1; i26 < this.u0.getChildCount(); i26++) {
                    ((ViewGroup.MarginLayoutParams) this.u0.getChildAt(i26).getLayoutParams()).topMargin = hl.L(f6);
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
            this.M = hl.q.x;
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
            this.M = hl.q.x;
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
            hl.j2(new te2(this, (byte) 2), 8.0f);
        }
        window.setAttributes(layoutParams3);
        return viewGroup;
    }

    public final l01 g(int i, boolean z, boolean z2) {
        View c = c(i);
        if (z2) {
            this.k0 = false;
        }
        vc vcVar = new vc(c, (byte) 0);
        ds6 ds6Var = new ds6(this, c, z, (byte) 5);
        ?? obj = new Object();
        obj.a = vcVar;
        obj.c = ds6Var;
        return obj;
    }

    public final void h() {
        TextView textView = (TextView) c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, this.j1);
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
        animatorSetArr[i].addListener(new z7(this, i, (byte) 1));
        try {
            animatorSetArr[i].start();
        } catch (Exception e) {
            cc4.g(e, true);
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
                bd bdVar = (bd) arrayList.get(i);
                bdVar.a.setTextColor(i2);
                bdVar.b.setColorFilter(new PorterDuffColorFilter(i3, PorterDuff.Mode.MULTIPLY));
            }
        }
    }

    public final void m(String str) {
        this.U = str;
        if (this.n != null) {
            boolean isEmpty = TextUtils.isEmpty(str);
            uu3 uu3Var = this.n;
            if (!isEmpty) {
                uu3Var.setText(this.U);
                this.n.setVisibility(0);
                return;
            }
            uu3Var.setVisibility(8);
        }
    }

    public final void n(int i) {
        this.h0 = i;
        n46 n46Var = this.v0;
        if (n46Var != null) {
            n46Var.a(true, i / 100.0f);
            this.w0.setText(String.format("%d%%", Integer.valueOf(this.h0)));
        }
    }

    public final void o(int i) {
        this.h1 = true;
        tpa tpaVar = this.f;
        if (tpaVar != null) {
            tpaVar.setTextColor(i);
        }
        uu3 uu3Var = this.n;
        if (uu3Var != null) {
            uu3Var.setTextColor(i);
        }
    }

    @Override
    public final void onBackPressed() {
        super.onBackPressed();
        g16 g16Var = this.x0;
        if (g16Var != null) {
            g16Var.w(this, -2);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f(true);
        jn7.e().b(this, jn7.l4);
    }

    public final void p() {
        if (this.j0 && this.L == null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.S0, getContext());
            String M0 = ob6.M0(2131744489, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131744490, null);
            alertDialog$Builder.j(ob6.M0(2131742865, null), null);
            alertDialog$Builder.g(ob6.M0(2131744498, null), new m0(this, (byte) 8));
            alertDialog$Builder.i(new o1(this, (byte) 1));
            try {
                this.L = alertDialog$Builder.o();
            } catch (Exception unused) {
            }
        }
    }

    public void q(long j) {
        uc ucVar = this.N0;
        hl.r(ucVar);
        hl.d3(ucVar, j);
    }

    public final void r() {
        e29 e29Var;
        int v0;
        if (this.e0 >= 0 && this.a0 != null && (e29Var = this.l0) != null && e29Var.getAnimatedDrawable() != null && (v0 = aob.v0(this.e0, this.f0)) != this.d1) {
            b29 animatedDrawable = this.l0.getAnimatedDrawable();
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
        yc ycVar = this.w;
        if (ycVar != null) {
            ycVar.postDelayed(runnable, j);
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
        tpa tpaVar = this.f;
        if (tpaVar != null) {
            tpaVar.setText(charSequence);
        }
    }

    @Override
    public void show() {
        if (!hl.K1(getContext())) {
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
        yc ycVar = this.w;
        if (ycVar != null) {
            ycVar.removeCallbacks(runnable);
        }
    }

    public id(Context context) {
        this(3, null, context);
    }
}
