package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.RadioButton;
public final class c98 extends FrameLayout implements tf4, nbb {
    public final ImageView A0;
    public final ImageView B0;
    public final ImageView C0;
    public final Bitmap D0;
    public final int E;
    public final Bitmap E0;
    public final int F;
    public final Rect F0;
    public final int G;
    public final Matrix G0;
    public float H;
    public final Paint H0;
    public float I;
    public final int I0;
    public float J;
    public final vnb J0;
    public float K;
    public int K0;
    public float L;
    public int L0;
    public float M;
    public float N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public int U;
    public float V;
    public boolean W;
    public boolean a;
    public final lo a0;
    public final boolean b;
    public float b0;
    public final int c;
    public PointF c0;
    public final int d;
    public float d0;
    public final int e;
    public float e0;
    public final int f;
    public po6 f0;
    public final FrameLayout g0;
    public final int h;
    public final TextView h0;
    public final TextView i0;
    public final TextureView j0;
    public final boolean k0;
    public final boolean l0;
    public rf4 m0;
    public final int n;
    public final n02 n0;
    public final FrameLayout o0;
    public final t88 p0;
    public final v88 q0;
    public final int r;
    public final TextView r0;
    public final int s;
    public final TextView s0;
    public final TextView t0;
    public final FrameLayout u0;
    public final RadioButton[] v0;
    public final int w;
    public final qx7 w0;
    public final int x;
    public final boolean x0;
    public final int y;
    public final boolean y0;
    public byte z0;

    public c98(Context context, kec kecVar, Bitmap bitmap, Bitmap bitmap2, int i, po6 po6Var, qx7 qx7Var, int i2, boolean z, boolean z2, tl0 tl0Var, final vnb vnbVar) {
        super(context);
        ?? r13;
        lo loVar;
        this.v0 = new RadioButton[4];
        this.F0 = new Rect();
        this.G0 = new Matrix();
        this.H0 = new Paint(2);
        this.l0 = z2;
        this.J0 = vnbVar;
        boolean z3 = context instanceof BubbleActivity;
        this.y0 = z3;
        this.w0 = qx7Var;
        this.x0 = z;
        this.G = 0;
        if (i2 == 1) {
            this.G = 1;
            this.n = 0;
            r13 = 1;
        } else {
            if (i2 == 0) {
                this.n = -1;
            }
            r13 = 0;
        }
        this.b = r13;
        this.c = r13 + 1;
        this.d = r13 + 2;
        this.e = r13 + 3;
        this.f = r13 + 4;
        this.h = r13 + 5;
        this.r = r13 + 6;
        this.s = r13 + 7;
        int i3 = r13 + 9;
        this.G = i3;
        this.w = r13 + 8;
        if (i2 == 2) {
            int i4 = r13 + 10;
            this.G = i4;
            this.n = i3;
            i3 = i4;
        }
        if (kecVar == null) {
            int i5 = i3 + 1;
            this.G = i5;
            this.x = i3;
            i3 = i5;
        } else {
            this.x = -1;
        }
        this.y = i3;
        this.E = i3 + 1;
        this.G = i3 + 3;
        this.F = i3 + 2;
        if (po6Var != null) {
            this.H = po6Var.a;
            this.N = po6Var.b;
            this.I = po6Var.c;
            this.J = po6Var.d;
            this.K = po6Var.e;
            this.L = po6Var.f;
            this.M = po6Var.g;
            this.O = po6Var.h;
            this.P = po6Var.i;
            this.Q = po6Var.j;
            this.R = po6Var.k;
            this.S = po6Var.l;
            this.T = po6Var.m;
            this.U = po6Var.n;
            this.V = po6Var.o;
            loVar = po6Var.p;
            this.a0 = loVar;
            this.b0 = po6Var.q;
            this.c0 = po6Var.r;
            this.d0 = po6Var.s;
            this.W = po6Var.a();
            this.e0 = po6Var.t;
            this.f0 = po6Var;
        } else {
            loVar = new lo();
            this.a0 = loVar;
            this.b0 = 0.35f;
            this.c0 = new PointF(0.5f, 0.5f);
            this.d0 = 0.15f;
            this.e0 = 1.5707964f;
            this.W = true;
        }
        this.D0 = bitmap;
        this.E0 = bitmap2;
        this.I0 = i;
        if (kecVar != null) {
            this.j0 = kecVar;
            kecVar.setDelegate(new w88(this));
        } else {
            this.k0 = true;
            uq5 uq5Var = new uq5((byte) 1, context, this);
            this.j0 = uq5Var;
            if (z2) {
                addView(uq5Var, tre.e(-1, -1, 51));
            }
            uq5Var.setVisibility(4);
            uq5Var.setSurfaceTextureListener(new z88(this, z2, tl0Var));
        }
        ?? frameLayout = new FrameLayout(context);
        frameLayout.a = new PointF();
        frameLayout.d = new Object();
        frameLayout.e = new PointF(0.5f, 0.5f);
        frameLayout.f = 0.15f;
        frameLayout.h = 0.35f;
        frameLayout.r = new RectF();
        frameLayout.y = 1.0f;
        frameLayout.G = true;
        Paint paint = new Paint(1);
        frameLayout.J = paint;
        Paint paint2 = new Paint(1);
        frameLayout.K = paint2;
        frameLayout.setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(hl.L(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        frameLayout.L = z3;
        this.p0 = frameLayout;
        frameLayout.setVisibility(4);
        if (z2) {
            addView((View) frameLayout, tre.e(-1, -1, 51));
        }
        frameLayout.setDelegate(new w88(this));
        ?? view = new View(context);
        view.a = 0;
        view.c = true;
        view.e = new Object();
        Paint paint3 = new Paint(1);
        view.f = paint3;
        Paint paint4 = new Paint(1);
        view.h = paint4;
        Paint paint5 = new Paint(1);
        view.n = paint5;
        TextPaint textPaint = new TextPaint(1);
        view.r = textPaint;
        view.s = new Path();
        view.setWillNotDraw(false);
        view.x = loVar;
        paint3.setColor(-1711276033);
        paint3.setStrokeWidth(hl.L(1.0f));
        paint3.setStyle(style);
        paint4.setColor(-1711276033);
        paint4.setStrokeWidth(hl.L(2.0f));
        paint4.setStyle(style);
        paint5.setColor(-1);
        paint5.setStrokeWidth(hl.L(2.0f));
        paint5.setStyle(style);
        textPaint.setColor(-4210753);
        textPaint.setTextSize(hl.L(13.0f));
        this.q0 = view;
        view.setDelegate(new w88(this));
        view.setVisibility(4);
        if (z2) {
            addView((View) view, tre.e(-1, -1, 51));
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.g0 = frameLayout2;
        addView(frameLayout2, tre.e(-1, (!z2 ? 40 : 0) + 186, 83));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackgroundColor(-16777216);
        frameLayout2.addView(frameLayout3, tre.e(-1, 48, 83));
        TextView textView = new TextView(context);
        this.i0 = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setBackgroundDrawable(aob.f0(-12763843, 0, -1));
        textView.setPadding(hl.L(20.0f), 0, hl.L(20.0f), 0);
        textView.setText(ob6.M0(2131752570, null).toUpperCase());
        textView.setTypeface(hl.o());
        frameLayout3.addView(textView, tre.e(-2, -1, 51));
        TextView textView2 = new TextView(context);
        this.h0 = textView2;
        textView2.setTextSize(1, 14.0f);
        int i6 = aob.qg;
        yob.X(textView2, i6, vnbVar);
        textView2.setGravity(17);
        textView2.setBackgroundDrawable(aob.f0(-12763843, 0, -1));
        textView2.setPadding(hl.L(20.0f), 0, hl.L(20.0f), 0);
        textView2.setText(ob6.M0(2131751319, null).toUpperCase());
        textView2.setTypeface(hl.o());
        frameLayout3.addView(textView2, tre.e(-2, -1, 53));
        LinearLayout linearLayout = new LinearLayout(context);
        frameLayout3.addView(linearLayout, tre.e(-2, -1, 1));
        ImageView imageView = new ImageView(context);
        this.A0 = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131232288);
        yob.s(imageView, i6, vnbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setBackgroundDrawable(aob.f0(1090519039, 1, -1));
        linearLayout.addView(imageView, tre.o(56, 48));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final c98 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r3;
                vnb vnbVar2 = vnbVar;
                c98 c98Var = this.b;
                switch (b) {
                    case 0:
                        c98Var.z0 = (byte) 0;
                        yob.s(c98Var.A0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        return;
                    case 1:
                        c98Var.z0 = (byte) 1;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.B0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        return;
                    default:
                        c98Var.z0 = (byte) 2;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.C0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.d();
                        return;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.B0 = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232283);
        imageView2.setBackgroundDrawable(aob.f0(1090519039, 1, -1));
        linearLayout.addView(imageView2, tre.o(56, 48));
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final c98 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r3;
                vnb vnbVar2 = vnbVar;
                c98 c98Var = this.b;
                switch (b) {
                    case 0:
                        c98Var.z0 = (byte) 0;
                        yob.s(c98Var.A0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        return;
                    case 1:
                        c98Var.z0 = (byte) 1;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.B0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        return;
                    default:
                        c98Var.z0 = (byte) 2;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.C0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.d();
                        return;
                }
            }
        });
        if (kecVar != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = new ImageView(context);
        this.C0 = imageView3;
        imageView3.setScaleType(scaleType);
        imageView3.setImageResource(2131232285);
        imageView3.setBackgroundDrawable(aob.f0(1090519039, 1, -1));
        linearLayout.addView(imageView3, tre.o(56, 48));
        imageView3.setOnClickListener(new View.OnClickListener(this) {
            public final c98 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                byte b = r3;
                vnb vnbVar2 = vnbVar;
                c98 c98Var = this.b;
                switch (b) {
                    case 0:
                        c98Var.z0 = (byte) 0;
                        yob.s(c98Var.A0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        return;
                    case 1:
                        c98Var.z0 = (byte) 1;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.B0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.C0.setColorFilter((ColorFilter) null);
                        c98Var.d();
                        return;
                    default:
                        c98Var.z0 = (byte) 2;
                        c98Var.A0.setColorFilter((ColorFilter) null);
                        c98Var.B0.setColorFilter((ColorFilter) null);
                        yob.s(c98Var.C0, aob.qg, vnbVar2, PorterDuff.Mode.MULTIPLY);
                        c98Var.d();
                        return;
                }
            }
        });
        n02 n02Var = new n02(context, (byte) 1);
        this.n0 = n02Var;
        x46 x46Var = new x46();
        x46Var.i1(1);
        n02Var.setLayoutManager(x46Var);
        n02Var.setClipToPadding(false);
        n02Var.setOverScrollMode(2);
        n02Var.setAdapter(new t20(this, context, (byte) 11));
        frameLayout2.addView(n02Var, tre.e(-1, (!z2 ? 60 : 0) + 120, 51));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.u0 = frameLayout4;
        frameLayout4.setVisibility(4);
        frameLayout2.addView(frameLayout4, tre.d(-1, 78.0f, 1, 0.0f, (!z2 ? 40 : 0) + 40, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        frameLayout4.addView(linearLayout2, tre.e(-2, -2, 1));
        int i7 = 0;
        while (i7 < 4) {
            FrameLayout frameLayout5 = new FrameLayout(context);
            frameLayout5.setTag(Integer.valueOf(i7));
            this.v0[i7] = new RadioButton(context);
            this.v0[i7].setSize(hl.L(20.0f));
            frameLayout5.addView(this.v0[i7], tre.e(30, 30, 49));
            TextView textView3 = new TextView(context);
            textView3.setTextSize(1, 12.0f);
            textView3.setGravity(16);
            if (i7 == 0) {
                String M0 = ob6.M0(2131751657, null);
                textView3.setText(M0.substring(0, 1).toUpperCase() + M0.substring(1).toLowerCase());
                textView3.setTextColor(-1);
                this.v0[i7].b(-1, -1);
            } else if (i7 == 1) {
                String M02 = ob6.M0(2131751654, null);
                textView3.setText(M02.substring(0, 1).toUpperCase() + M02.substring(1).toLowerCase());
                textView3.setTextColor(-1684147);
                this.v0[i7].b(-1684147, -1684147);
            } else if (i7 == 2) {
                String M03 = ob6.M0(2131751655, null);
                textView3.setText(M03.substring(0, 1).toUpperCase() + M03.substring(1).toLowerCase());
                textView3.setTextColor(-10831009);
                this.v0[i7].b(-10831009, -10831009);
            } else if (i7 == 3) {
                String M04 = ob6.M0(2131751656, null);
                textView3.setText(M04.substring(0, 1).toUpperCase() + M04.substring(1).toLowerCase());
                textView3.setTextColor(-12734994);
                this.v0[i7].b(-12734994, -12734994);
            }
            frameLayout5.addView(textView3, tre.d(-2, -2.0f, 49, 0.0f, 38.0f, 0.0f, 0.0f));
            linearLayout2.addView(frameLayout5, tre.k(i7 == 0 ? 0.0f : 30.0f, 0.0f, 0.0f, 0.0f, -2, -2));
            frameLayout5.setOnClickListener(new View.OnClickListener(this) {
                public final c98 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view2) {
                    boolean z4;
                    byte b = r2;
                    c98 c98Var = this.b;
                    switch (b) {
                        case 0:
                            int intValue = ((Integer) view2.getTag()).intValue();
                            c98Var.a0.a = intValue;
                            for (int i8 = 0; i8 < 4; i8++) {
                                RadioButton radioButton = c98Var.v0[i8];
                                if (i8 == intValue) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                radioButton.a(z4, true);
                            }
                            c98Var.q0.invalidate();
                            return;
                        case 1:
                            c98Var.U = 0;
                            c98Var.f();
                            c98Var.p0.setVisibility(4);
                            rf4 rf4Var = c98Var.m0;
                            if (rf4Var != null) {
                                rf4Var.b(false, false, false);
                                return;
                            }
                            return;
                        case 2:
                            c98Var.U = 1;
                            c98Var.f();
                            t88 t88Var = c98Var.p0;
                            t88Var.setVisibility(0);
                            t88Var.setType(1);
                            rf4 rf4Var2 = c98Var.m0;
                            if (rf4Var2 != null) {
                                rf4Var2.b(false, false, false);
                                return;
                            }
                            return;
                        default:
                            c98Var.U = 2;
                            c98Var.f();
                            t88 t88Var2 = c98Var.p0;
                            t88Var2.setVisibility(0);
                            t88Var2.setType(0);
                            rf4 rf4Var3 = c98Var.m0;
                            if (rf4Var3 != null) {
                                rf4Var3.b(false, false, false);
                                return;
                            }
                            return;
                    }
                }
            });
            i7++;
        }
        FrameLayout frameLayout6 = new FrameLayout(context);
        this.o0 = frameLayout6;
        frameLayout6.setVisibility(4);
        this.g0.addView(frameLayout6, tre.d(280, 60.0f, 1, 0.0f, (!z2 ? 40 : 0) + 40, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.r0 = textView4;
        textView4.setCompoundDrawablePadding(hl.L(2.0f));
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(1);
        textView4.setText(ob6.M0(2131753666, null));
        frameLayout6.addView(textView4, tre.c(60.0f, 80));
        textView4.setOnClickListener(new View.OnClickListener(this) {
            public final c98 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z4;
                byte b = r2;
                c98 c98Var = this.b;
                switch (b) {
                    case 0:
                        int intValue = ((Integer) view2.getTag()).intValue();
                        c98Var.a0.a = intValue;
                        for (int i8 = 0; i8 < 4; i8++) {
                            RadioButton radioButton = c98Var.v0[i8];
                            if (i8 == intValue) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            radioButton.a(z4, true);
                        }
                        c98Var.q0.invalidate();
                        return;
                    case 1:
                        c98Var.U = 0;
                        c98Var.f();
                        c98Var.p0.setVisibility(4);
                        rf4 rf4Var = c98Var.m0;
                        if (rf4Var != null) {
                            rf4Var.b(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        c98Var.U = 1;
                        c98Var.f();
                        t88 t88Var = c98Var.p0;
                        t88Var.setVisibility(0);
                        t88Var.setType(1);
                        rf4 rf4Var2 = c98Var.m0;
                        if (rf4Var2 != null) {
                            rf4Var2.b(false, false, false);
                            return;
                        }
                        return;
                    default:
                        c98Var.U = 2;
                        c98Var.f();
                        t88 t88Var2 = c98Var.p0;
                        t88Var2.setVisibility(0);
                        t88Var2.setType(0);
                        rf4 rf4Var3 = c98Var.m0;
                        if (rf4Var3 != null) {
                            rf4Var3.b(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView5 = new TextView(context);
        this.s0 = textView5;
        textView5.setCompoundDrawablePadding(hl.L(2.0f));
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(1);
        textView5.setText(ob6.M0(2131753665, null));
        frameLayout6.addView(textView5, tre.d(80, 80.0f, 51, 100.0f, 0.0f, 0.0f, 0.0f));
        textView5.setOnClickListener(new View.OnClickListener(this) {
            public final c98 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z4;
                byte b = r2;
                c98 c98Var = this.b;
                switch (b) {
                    case 0:
                        int intValue = ((Integer) view2.getTag()).intValue();
                        c98Var.a0.a = intValue;
                        for (int i8 = 0; i8 < 4; i8++) {
                            RadioButton radioButton = c98Var.v0[i8];
                            if (i8 == intValue) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            radioButton.a(z4, true);
                        }
                        c98Var.q0.invalidate();
                        return;
                    case 1:
                        c98Var.U = 0;
                        c98Var.f();
                        c98Var.p0.setVisibility(4);
                        rf4 rf4Var = c98Var.m0;
                        if (rf4Var != null) {
                            rf4Var.b(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        c98Var.U = 1;
                        c98Var.f();
                        t88 t88Var = c98Var.p0;
                        t88Var.setVisibility(0);
                        t88Var.setType(1);
                        rf4 rf4Var2 = c98Var.m0;
                        if (rf4Var2 != null) {
                            rf4Var2.b(false, false, false);
                            return;
                        }
                        return;
                    default:
                        c98Var.U = 2;
                        c98Var.f();
                        t88 t88Var2 = c98Var.p0;
                        t88Var2.setVisibility(0);
                        t88Var2.setType(0);
                        rf4 rf4Var3 = c98Var.m0;
                        if (rf4Var3 != null) {
                            rf4Var3.b(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        TextView textView6 = new TextView(context);
        this.t0 = textView6;
        textView6.setCompoundDrawablePadding(hl.L(2.0f));
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(1);
        textView6.setText(ob6.M0(2131753667, null));
        frameLayout6.addView(textView6, tre.d(80, 80.0f, 51, 200.0f, 0.0f, 0.0f, 0.0f));
        textView6.setOnClickListener(new View.OnClickListener(this) {
            public final c98 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view2) {
                boolean z4;
                byte b = r2;
                c98 c98Var = this.b;
                switch (b) {
                    case 0:
                        int intValue = ((Integer) view2.getTag()).intValue();
                        c98Var.a0.a = intValue;
                        for (int i8 = 0; i8 < 4; i8++) {
                            RadioButton radioButton = c98Var.v0[i8];
                            if (i8 == intValue) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            radioButton.a(z4, true);
                        }
                        c98Var.q0.invalidate();
                        return;
                    case 1:
                        c98Var.U = 0;
                        c98Var.f();
                        c98Var.p0.setVisibility(4);
                        rf4 rf4Var = c98Var.m0;
                        if (rf4Var != null) {
                            rf4Var.b(false, false, false);
                            return;
                        }
                        return;
                    case 2:
                        c98Var.U = 1;
                        c98Var.f();
                        t88 t88Var = c98Var.p0;
                        t88Var.setVisibility(0);
                        t88Var.setType(1);
                        rf4 rf4Var2 = c98Var.m0;
                        if (rf4Var2 != null) {
                            rf4Var2.b(false, false, false);
                            return;
                        }
                        return;
                    default:
                        c98Var.U = 2;
                        c98Var.f();
                        t88 t88Var2 = c98Var.p0;
                        t88Var2.setVisibility(0);
                        t88Var2.setType(0);
                        rf4 rf4Var3 = c98Var.m0;
                        if (rf4Var3 != null) {
                            rf4Var3.b(false, false, false);
                            return;
                        }
                        return;
                }
            }
        });
        f();
        if (this.y0 || !z2) {
            return;
        }
        if (this.k0) {
            ((FrameLayout.LayoutParams) this.j0.getLayoutParams()).topMargin = hl.m;
        }
        ((FrameLayout.LayoutParams) this.q0.getLayoutParams()).topMargin = hl.m;
    }

    private void setShowOriginal(boolean z) {
        if (this.a != z) {
            this.a = z;
            rf4 rf4Var = this.m0;
            if (rf4Var != null) {
                rf4Var.b(false, false, false);
            }
        }
    }

    @Override
    public final ByteBuffer a() {
        lo loVar = this.a0;
        loVar.c();
        return (ByteBuffer) loVar.f;
    }

    public final boolean b() {
        po6 po6Var = this.f0;
        float f = this.H;
        lo loVar = this.a0;
        if (po6Var != null) {
            if (f == po6Var.a && this.J == po6Var.d && this.Q == po6Var.j && this.I == po6Var.c && this.K == po6Var.e && this.L == po6Var.f && this.S == po6Var.l && this.R == po6Var.k && this.T == po6Var.m && this.V == po6Var.o && this.M == po6Var.g && this.N == po6Var.b && this.P == po6Var.i && this.O == po6Var.h && loVar.o()) {
                return false;
            }
            return true;
        } else if (f == 0.0f && this.J == 0.0f && this.Q == 0.0f && this.I == 0.0f && this.K == 0.0f && this.L == 0.0f && this.S == 0.0f && this.R == 0.0f && this.T == 0.0f && this.V == 0.0f && this.M == 0.0f && this.N == 0.0f && this.P == 0 && this.O == 0 && loVar.o()) {
            return false;
        } else {
            return true;
        }
    }

    public final void c() {
        boolean z = this.k0;
        TextureView textureView = this.j0;
        if (z) {
            rf4 rf4Var = this.m0;
            if (rf4Var != null) {
                rf4Var.postRunnable(new pf4(rf4Var, (byte) 0));
                this.m0 = null;
            }
            textureView.setVisibility(8);
        } else if (textureView instanceof kec) {
            kec kecVar = (kec) textureView;
            po6 po6Var = this.f0;
            if (po6Var == null) {
                kecVar.setDelegate(null);
                return;
            }
            rf4 rf4Var2 = this.m0;
            if (rf4Var2 != null) {
                rf4Var2.c(new ri6(po6Var, (byte) 29));
            }
        }
    }

    public final void d() {
        boolean z;
        byte b = this.z0;
        n02 n02Var = this.n0;
        v88 v88Var = this.q0;
        FrameLayout frameLayout = this.u0;
        FrameLayout frameLayout2 = this.o0;
        t88 t88Var = this.p0;
        if (b == 0) {
            t88Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            frameLayout.setVisibility(4);
            v88Var.setVisibility(4);
            n02Var.setVisibility(0);
        } else if (b == 1) {
            n02Var.setVisibility(4);
            frameLayout.setVisibility(4);
            v88Var.setVisibility(4);
            frameLayout2.setVisibility(0);
            if (this.U != 0) {
                t88Var.setVisibility(0);
            }
            f();
        } else if (b == 2) {
            n02Var.setVisibility(4);
            frameLayout2.setVisibility(4);
            t88Var.setVisibility(4);
            frameLayout.setVisibility(0);
            v88Var.setVisibility(0);
            this.a0.a = 0;
            for (int i = 0; i < 4; i++) {
                RadioButton radioButton = this.v0[i];
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                radioButton.a(z, false);
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        TextureView textureView;
        boolean drawChild = super.drawChild(canvas, view, j);
        qx7 qx7Var = this.w0;
        if (qx7Var != null && view == (textureView = this.j0)) {
            canvas.save();
            canvas.translate(textureView.getLeft(), textureView.getTop());
            Bitmap bitmap = this.E0;
            if (bitmap != null && textureView.getVisibility() == 0) {
                int measuredWidth = textureView.getMeasuredWidth();
                int measuredHeight = textureView.getMeasuredHeight();
                Rect rect = this.F0;
                rect.set(0, 0, measuredWidth, measuredHeight);
                Paint paint = this.H0;
                int i = this.I0;
                if (i != 0) {
                    Matrix matrix = this.G0;
                    matrix.reset();
                    matrix.postRotate(i, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    float height = (bitmap.getHeight() - bitmap.getWidth()) / 2.0f;
                    matrix.postTranslate(height, -height);
                    matrix.postScale(rect.width() / bitmap.getHeight(), rect.height() / bitmap.getWidth());
                    canvas.drawBitmap(bitmap, matrix, paint);
                } else {
                    canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                }
            }
            float measuredWidth2 = textureView.getMeasuredWidth() / qx7Var.getMeasuredWidth();
            canvas.scale(measuredWidth2, measuredWidth2);
            qx7Var.draw(canvas);
            canvas.restore();
        }
        return drawChild;
    }

    public final void e() {
        boolean z;
        if (Math.abs(this.H) < 0.1f && Math.abs(this.N) < 0.1f && Math.abs(this.I) < 0.1f && Math.abs(this.J) < 0.1f && Math.abs(this.K) < 0.1f && Math.abs(this.L) < 0.1f && Math.abs(this.M) < 0.1f && this.O == 0 && this.P == 0 && Math.abs(this.Q) < 0.1f && Math.abs(this.R) < 0.1f && Math.abs(this.S) < 0.1f && Math.abs(this.T) < 0.1f && this.U == 0 && Math.abs(this.V) < 0.1f && this.a0.o()) {
            z = true;
        } else {
            z = false;
        }
        this.W = z;
    }

    public final void f() {
        int i = this.U;
        TextView textView = this.t0;
        TextView textView2 = this.s0;
        vnb vnbVar = this.J0;
        TextView textView3 = this.r0;
        if (i == 0) {
            Drawable mutate = textView3.getContext().getResources().getDrawable(2131232075).mutate();
            int i2 = aob.qg;
            yob.x(this, mutate, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
            textView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate, (Drawable) null, (Drawable) null);
            textView3.setTextColor(aob.v0(i2, vnbVar));
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232076, 0, 0);
            textView2.setTextColor(-1);
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232074, 0, 0);
            textView.setTextColor(-1);
        } else if (i == 1) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232075, 0, 0);
            textView3.setTextColor(-1);
            Drawable mutate2 = textView3.getContext().getResources().getDrawable(2131232076).mutate();
            int i3 = aob.qg;
            yob.x(this, mutate2, i3, vnbVar, PorterDuff.Mode.MULTIPLY);
            textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate2, (Drawable) null, (Drawable) null);
            textView2.setTextColor(aob.v0(i3, vnbVar));
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 2131232074, 0, 0);
            textView.setTextColor(-1);
        } else if (i == 2) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 2131232075, 0, 0);
            textView3.setTextColor(-1);
            textView2.setCompoundDrawablesWithIntrinsicBounds(0, 2131232076, 0, 0);
            textView2.setTextColor(-1);
            Drawable mutate3 = textView3.getContext().getResources().getDrawable(2131232074).mutate();
            int i4 = aob.qg;
            yob.x(this, mutate3, i4, vnbVar, PorterDuff.Mode.MULTIPLY);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, mutate3, (Drawable) null, (Drawable) null);
            textView.setTextColor(aob.v0(i4, vnbVar));
        }
        e();
    }

    @Override
    public final boolean g() {
        if (!this.a && !this.W) {
            return false;
        }
        return true;
    }

    public Bitmap getBitmap() {
        rf4 rf4Var = this.m0;
        if (rf4Var != null && rf4Var.f && rf4Var.isAlive()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            Bitmap[] bitmapArr = new Bitmap[1];
            try {
                if (rf4Var.postRunnable(new re4(rf4Var, bitmapArr, countDownLatch, (byte) 3))) {
                    countDownLatch.await();
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
            return bitmapArr[0];
        }
        return null;
    }

    @Override
    public float getBlurAngle() {
        return this.e0;
    }

    public t88 getBlurControl() {
        return this.p0;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return this.d0;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return this.c0;
    }

    @Override
    public float getBlurExcludeSize() {
        return this.b0;
    }

    @Override
    public int getBlurType() {
        return this.U;
    }

    public TextView getCancelTextView() {
        return this.i0;
    }

    @Override
    public float getContrastValue() {
        return c00.B(this.J, 100.0f, 0.3f, 1.0f);
    }

    public v88 getCurveControl() {
        return this.q0;
    }

    public TextView getDoneTextView() {
        return this.h0;
    }

    @Override
    public float getEnhanceValue() {
        return this.H / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return this.I / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return this.M / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (this.T / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return c00.z(this.Q, 0.75f, 100.0f, 100.0f);
    }

    public TextureView getMyTextureView() {
        if (this.k0 && !this.l0) {
            return this.j0;
        }
        return null;
    }

    @Override
    public float getSaturationValue() {
        float f = this.L / 100.0f;
        if (f > 0.0f) {
            f *= 1.05f;
        }
        return f + 1.0f;
    }

    public po6 getSavedFilterState() {
        po6 po6Var = new po6();
        po6Var.a = this.H;
        po6Var.c = this.I;
        po6Var.d = this.J;
        po6Var.e = this.K;
        po6Var.f = this.L;
        po6Var.g = this.M;
        po6Var.b = this.N;
        po6Var.h = this.O;
        po6Var.i = this.P;
        po6Var.j = this.Q;
        po6Var.k = this.R;
        po6Var.l = this.S;
        po6Var.m = this.T;
        po6Var.n = this.U;
        po6Var.o = this.V;
        po6Var.p = this.a0;
        po6Var.q = this.b0;
        po6Var.r = this.c0;
        po6Var.s = this.d0;
        po6Var.t = this.e0;
        this.f0 = po6Var;
        return po6Var;
    }

    @Override
    public float getShadowsValue() {
        return c00.z(this.R, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return c00.B(this.V, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return this.N / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return this.P;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (this.P == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return this.O;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (this.O == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    public FrameLayout getToolsView() {
        return this.g0;
    }

    public Bitmap getUiBlurBitmap() {
        yl0 yl0Var;
        rf4 rf4Var = this.m0;
        if (rf4Var == null || (yl0Var = rf4Var.J) == null) {
            return null;
        }
        synchronized (yl0Var.n) {
            if (!yl0Var.q) {
                return null;
            }
            return yl0Var.p;
        }
    }

    @Override
    public float getVignetteValue() {
        return this.S / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return this.K / 100.0f;
    }

    @Override
    public final boolean h(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0 && motionEvent.getActionMasked() != 5) {
            if (motionEvent.getActionMasked() == 1 || motionEvent.getActionMasked() == 6) {
                setShowOriginal(false);
            }
        } else {
            TextureView textureView = this.j0;
            if (textureView instanceof kec) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                a69 a69Var = ((kec) textureView).c;
                float f = a69Var.a;
                if (x >= f && x <= f + a69Var.c) {
                    float f2 = a69Var.b;
                    if (y >= f2 && y <= f2 + a69Var.d) {
                        setShowOriginal(true);
                    }
                }
            } else if (motionEvent.getX() >= textureView.getX() && motionEvent.getY() >= textureView.getY() && motionEvent.getX() <= textureView.getX() + textureView.getWidth() && motionEvent.getY() <= textureView.getY() + textureView.getHeight()) {
                setShowOriginal(true);
            }
        }
        return true;
    }

    @Override
    public final boolean i() {
        return !this.a0.o();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        float width;
        int height;
        float f;
        float f2;
        float f3;
        float ceil;
        float f4;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (this.l0) {
            int L = size - hl.L(28.0f);
            int L2 = hl.L(214.0f);
            boolean z = this.y0;
            if (!z) {
                i3 = hl.m;
            } else {
                i3 = 0;
            }
            int i6 = size2 - (L2 + i3);
            TextureView textureView = this.j0;
            Bitmap bitmap = this.D0;
            if (bitmap != null) {
                int i7 = this.I0 % 360;
                if (i7 != 90 && i7 != 270) {
                    width = bitmap.getWidth();
                    height = bitmap.getHeight();
                } else {
                    width = bitmap.getHeight();
                    height = bitmap.getWidth();
                }
            } else {
                width = textureView.getWidth();
                height = textureView.getHeight();
            }
            float f5 = L;
            float f6 = i6;
            if (f5 / width > f6 / height) {
                f4 = (int) Math.ceil(width * f3);
                ceil = f6;
            } else {
                ceil = (int) Math.ceil(f * f2);
                f4 = f5;
            }
            int ceil2 = (int) Math.ceil(((f5 - f4) / 2.0f) + hl.L(14.0f));
            float L3 = ((f6 - ceil) / 2.0f) + hl.L(14.0f);
            if (!z) {
                i4 = hl.m;
            } else {
                i4 = 0;
            }
            int ceil3 = (int) Math.ceil(L3 + i4);
            int i8 = (int) f4;
            int i9 = (int) ceil;
            if (this.k0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textureView.getLayoutParams();
                layoutParams.leftMargin = ceil2;
                layoutParams.topMargin = ceil3;
                layoutParams.width = i8;
                layoutParams.height = i9;
            }
            float f7 = ceil2;
            if (!z) {
                i5 = hl.m;
            } else {
                i5 = 0;
            }
            float f8 = ceil3 - i5;
            float f9 = i8;
            float f10 = i9;
            v88 v88Var = this.q0;
            a69 a69Var = v88Var.e;
            a69Var.a = f7;
            a69Var.b = f8;
            a69Var.c = f9;
            a69Var.d = f10;
            t88 t88Var = this.p0;
            qma qmaVar = t88Var.d;
            qmaVar.a = f9;
            qmaVar.b = f10;
            ((FrameLayout.LayoutParams) t88Var.getLayoutParams()).height = hl.L(38.0f) + i6;
            ((FrameLayout.LayoutParams) v88Var.getLayoutParams()).height = hl.L(28.0f) + i6;
            if (hl.O1()) {
                int L4 = hl.L(86.0f) * 10;
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.n0.getLayoutParams();
                if (L4 < L) {
                    layoutParams2.width = L4;
                    layoutParams2.leftMargin = (L - L4) / 2;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.leftMargin = 0;
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public void setEnhanceValue(float f) {
        this.H = f * 100.0f;
        e();
        int i = 0;
        while (true) {
            n02 n02Var = this.n0;
            if (i >= n02Var.getChildCount()) {
                break;
            }
            View childAt = n02Var.getChildAt(i);
            if ((childAt instanceof o88) && RecyclerView.S(childAt) == this.b) {
                ((o88) childAt).a(ob6.M0(2131751091, null), 0, this.H);
                break;
            }
            i++;
        }
        rf4 rf4Var = this.m0;
        if (rf4Var != null) {
            rf4Var.b(true, false, false);
        }
    }
}
