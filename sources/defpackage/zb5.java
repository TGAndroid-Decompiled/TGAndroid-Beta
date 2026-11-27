package defpackage;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public class zb5 extends FrameLayout implements snb {
    public final rb0 E;
    public vc2 F;
    public TLRPC.GroupCallParticipant G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public final Paint J;
    public boolean K;
    public boolean L;
    public int M;
    public k5 N;
    public boolean O;
    public boolean P;
    public byte Q;
    public long R;
    public final ub5 S;
    public final ub5 T;
    public int U;
    public final ub5 V;
    public final ub5 W;
    public final yb5 a;
    public boolean a0;
    public final de0 b;
    public boolean b0;
    public final ema c;
    public boolean c0;
    public final ema[] d;
    public final Drawable d0;
    public final ema e;
    public AnimatorSet e0;
    public final e29 f;
    public float f0;
    public int g0;
    public final b29 h;
    public final b29 n;
    public final ul r;
    public final ul s;
    public g6 w;
    public Drawable x;
    public final vb5 y;

    public zb5(Context context) {
        super(context);
        int i;
        float f;
        float f2;
        int i2;
        float f3;
        float f4;
        int i3;
        int i4;
        float f5;
        float f6;
        int i5;
        int i6;
        int i7;
        int i8;
        float f7;
        float f8;
        int i9;
        float f9;
        float f10;
        this.d = new ema[5];
        this.S = new Runnable(this) {
            public final zb5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i10 = 0;
                zb5 zb5Var = this.b;
                switch (b) {
                    case 0:
                        zb5Var.n.N(0, null);
                        b29 b29Var = zb5Var.h;
                        b29Var.N(0, null);
                        zb5Var.f.setAnimation(b29Var);
                        return;
                    case 1:
                        e29 e29Var = zb5Var.f;
                        b29 b29Var2 = zb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i11 = 120;
                        if (nextInt >= 32) {
                            int i12 = 240;
                            if (nextInt >= 64) {
                                i11 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt != 98) {
                                        i11 = 720;
                                    }
                                }
                                i10 = i12;
                            }
                            i10 = i11;
                            i11 = i12;
                        }
                        b29Var2.K(i11);
                        b29Var2.N(i11 - 1, zb5Var.S);
                        e29Var.setAnimation(b29Var2);
                        b29Var2.H(i10);
                        e29Var.d();
                        return;
                    case 2:
                        zb5Var.a(true, true);
                        return;
                    case 3:
                        zb5Var.b0 = false;
                        zb5Var.a(true, true);
                        zb5Var.a.c(0.0d);
                        zb5Var.a0 = false;
                        return;
                    default:
                        zb5Var.a(true, true);
                        return;
                }
            }
        };
        this.T = new Runnable(this) {
            public final zb5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i10 = 0;
                zb5 zb5Var = this.b;
                switch (b) {
                    case 0:
                        zb5Var.n.N(0, null);
                        b29 b29Var = zb5Var.h;
                        b29Var.N(0, null);
                        zb5Var.f.setAnimation(b29Var);
                        return;
                    case 1:
                        e29 e29Var = zb5Var.f;
                        b29 b29Var2 = zb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i11 = 120;
                        if (nextInt >= 32) {
                            int i12 = 240;
                            if (nextInt >= 64) {
                                i11 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt != 98) {
                                        i11 = 720;
                                    }
                                }
                                i10 = i12;
                            }
                            i10 = i11;
                            i11 = i12;
                        }
                        b29Var2.K(i11);
                        b29Var2.N(i11 - 1, zb5Var.S);
                        e29Var.setAnimation(b29Var2);
                        b29Var2.H(i10);
                        e29Var.d();
                        return;
                    case 2:
                        zb5Var.a(true, true);
                        return;
                    case 3:
                        zb5Var.b0 = false;
                        zb5Var.a(true, true);
                        zb5Var.a.c(0.0d);
                        zb5Var.a0 = false;
                        return;
                    default:
                        zb5Var.a(true, true);
                        return;
                }
            }
        };
        this.U = aob.ih;
        this.V = new Runnable(this) {
            public final zb5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i10 = 0;
                zb5 zb5Var = this.b;
                switch (b) {
                    case 0:
                        zb5Var.n.N(0, null);
                        b29 b29Var = zb5Var.h;
                        b29Var.N(0, null);
                        zb5Var.f.setAnimation(b29Var);
                        return;
                    case 1:
                        e29 e29Var = zb5Var.f;
                        b29 b29Var2 = zb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i11 = 120;
                        if (nextInt >= 32) {
                            int i12 = 240;
                            if (nextInt >= 64) {
                                i11 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt != 98) {
                                        i11 = 720;
                                    }
                                }
                                i10 = i12;
                            }
                            i10 = i11;
                            i11 = i12;
                        }
                        b29Var2.K(i11);
                        b29Var2.N(i11 - 1, zb5Var.S);
                        e29Var.setAnimation(b29Var2);
                        b29Var2.H(i10);
                        e29Var.d();
                        return;
                    case 2:
                        zb5Var.a(true, true);
                        return;
                    case 3:
                        zb5Var.b0 = false;
                        zb5Var.a(true, true);
                        zb5Var.a.c(0.0d);
                        zb5Var.a0 = false;
                        return;
                    default:
                        zb5Var.a(true, true);
                        return;
                }
            }
        };
        this.W = new Runnable(this) {
            public final zb5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i10 = 0;
                zb5 zb5Var = this.b;
                switch (b) {
                    case 0:
                        zb5Var.n.N(0, null);
                        b29 b29Var = zb5Var.h;
                        b29Var.N(0, null);
                        zb5Var.f.setAnimation(b29Var);
                        return;
                    case 1:
                        e29 e29Var = zb5Var.f;
                        b29 b29Var2 = zb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i11 = 120;
                        if (nextInt >= 32) {
                            int i12 = 240;
                            if (nextInt >= 64) {
                                i11 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt != 98) {
                                        i11 = 720;
                                    }
                                }
                                i10 = i12;
                            }
                            i10 = i11;
                            i11 = i12;
                        }
                        b29Var2.K(i11);
                        b29Var2.N(i11 - 1, zb5Var.S);
                        e29Var.setAnimation(b29Var2);
                        b29Var2.H(i10);
                        e29Var.d();
                        return;
                    case 2:
                        zb5Var.a(true, true);
                        return;
                    case 3:
                        zb5Var.b0 = false;
                        zb5Var.a(true, true);
                        zb5Var.a.c(0.0d);
                        zb5Var.a0 = false;
                        return;
                    default:
                        zb5Var.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final zb5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i10 = 0;
                zb5 zb5Var = this.b;
                switch (b) {
                    case 0:
                        zb5Var.n.N(0, null);
                        b29 b29Var = zb5Var.h;
                        b29Var.N(0, null);
                        zb5Var.f.setAnimation(b29Var);
                        return;
                    case 1:
                        e29 e29Var = zb5Var.f;
                        b29 b29Var2 = zb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i11 = 120;
                        if (nextInt >= 32) {
                            int i12 = 240;
                            if (nextInt >= 64) {
                                i11 = 420;
                                if (nextInt >= 97) {
                                    i12 = 540;
                                    if (nextInt != 98) {
                                        i11 = 720;
                                    }
                                }
                                i10 = i12;
                            }
                            i10 = i11;
                            i11 = i12;
                        }
                        b29Var2.K(i11);
                        b29Var2.N(i11 - 1, zb5Var.S);
                        e29Var.setAnimation(b29Var2);
                        b29Var2.H(i10);
                        e29Var.d();
                        return;
                    case 2:
                        zb5Var.a(true, true);
                        return;
                    case 3:
                        zb5Var.b0 = false;
                        zb5Var.a(true, true);
                        zb5Var.a.c(0.0d);
                        zb5Var.a0 = false;
                        return;
                    default:
                        zb5Var.a(true, true);
                        return;
                }
            }
        };
        this.g0 = -1;
        Paint paint = new Paint();
        this.J = paint;
        paint.setColor(aob.w0(null, aob.Xg, false));
        this.E = new rb0((vnb) null);
        setClipChildren(false);
        de0 de0Var = new de0(context);
        this.b = de0Var;
        de0Var.setRoundRadius(hl.L(24.0f));
        boolean z = ob6.a0;
        if (z) {
            i = 5;
        } else {
            i = 3;
        }
        int i10 = i | 48;
        if (z) {
            f = 0.0f;
        } else {
            f = 11.0f;
        }
        if (z) {
            f2 = 11.0f;
        } else {
            f2 = 0.0f;
        }
        addView(de0Var, tre.d(46, 46.0f, i10, f, 6.0f, f2, 0.0f));
        vb5 vb5Var = new vb5(this, context);
        this.y = vb5Var;
        vb5Var.setSize(hl.L(26.0f));
        vb5Var.setProgressColor(-1);
        vb5Var.setNoProgress(false);
        boolean z2 = ob6.a0;
        if (z2) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i11 = i2 | 48;
        if (z2) {
            f3 = 0.0f;
        } else {
            f3 = 11.0f;
        }
        if (z2) {
            f4 = 11.0f;
        } else {
            f4 = 0.0f;
        }
        addView(vb5Var, tre.d(46, 46.0f, i11, f3, 6.0f, f4, 0.0f));
        hl.T3(vb5Var, false, 1.0f, true, false);
        ema emaVar = new ema(context);
        this.c = emaVar;
        yob.W(emaVar, aob.eh, null);
        emaVar.setTypeface(hl.o());
        emaVar.setTextSize(16);
        emaVar.setDrawablePadding(hl.L(6.0f));
        if (ob6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        emaVar.setGravity(i3 | 48);
        boolean z3 = ob6.a0;
        if (z3) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i12 = i4 | 48;
        if (z3) {
            f5 = 54.0f;
        } else {
            f5 = 67.0f;
        }
        if (z3) {
            f6 = 67.0f;
        } else {
            f6 = 54.0f;
        }
        addView(emaVar, tre.d(-1, 20.0f, i12, f5, 10.0f, f6, 0.0f));
        this.r = new ul(hl.L(20.0f), 9, emaVar, false);
        this.s = new ul(hl.L(20.0f), 9, emaVar, false);
        Drawable drawable = context.getResources().getDrawable(2131232826);
        this.d0 = drawable;
        yob.x(this, drawable, aob.hh, null, PorterDuff.Mode.MULTIPLY);
        int i13 = 0;
        while (true) {
            ema[] emaVarArr = this.d;
            if (i13 >= emaVarArr.length) {
                break;
            }
            emaVarArr[i13] = new wb5(this, context, i13);
            this.d[i13].setTextSize(15);
            ema emaVar2 = this.d[i13];
            if (ob6.a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            emaVar2.setGravity(i7 | 48);
            if (i13 == 4) {
                this.d[i13].setBuildFullLayout(true);
                yob.W(this.d[i13], aob.ih, null);
                ema emaVar3 = this.d[i13];
                boolean z4 = ob6.a0;
                if (z4) {
                    i9 = 5;
                } else {
                    i9 = 3;
                }
                int i14 = i9 | 48;
                if (z4) {
                    f9 = 54.0f;
                } else {
                    f9 = 67.0f;
                }
                if (z4) {
                    f10 = 67.0f;
                } else {
                    f10 = 54.0f;
                }
                addView(emaVar3, tre.d(-1, -2.0f, i14, f9, 32.0f, f10, 0.0f));
            } else {
                if (i13 == 0) {
                    yob.W(this.d[i13], aob.gh, null);
                    this.d[i13].k(ob6.M0(2131748631, null));
                } else if (i13 == 1) {
                    yob.W(this.d[i13], aob.hh, null);
                    this.d[i13].k(ob6.M0(2131744999, null));
                    this.d[i13].setDrawablePadding(hl.L(2.0f));
                } else if (i13 == 2) {
                    yob.W(this.d[i13], aob.jh, null);
                    this.d[i13].k(ob6.M0(2131743009, null));
                } else if (i13 == 3) {
                    yob.W(this.d[i13], aob.gh, null);
                    this.d[i13].k(ob6.M0(2131742581, null));
                }
                ema emaVar4 = this.d[i13];
                boolean z5 = ob6.a0;
                if (z5) {
                    i8 = 5;
                } else {
                    i8 = 3;
                }
                int i15 = i8 | 48;
                if (z5) {
                    f7 = 54.0f;
                } else {
                    f7 = 67.0f;
                }
                if (z5) {
                    f8 = 67.0f;
                } else {
                    f8 = 54.0f;
                }
                addView(emaVar4, tre.d(-1, 20.0f, i15, f7, 32.0f, f8, 0.0f));
            }
            i13++;
        }
        ema emaVar5 = new ema(context);
        this.e = emaVar5;
        emaVar5.setMaxLines(3);
        emaVar5.setTextSize(15);
        yob.W(emaVar5, aob.ih, null);
        emaVar5.setVisibility(8);
        if (ob6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        addView(emaVar5, tre.d(-1, 60.0f, i5 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        b29 b29Var = new b29(2131624330, hl.L(34.0f), hl.L(32.0f), true, null);
        this.h = b29Var;
        this.n = new b29(2131624044, hl.L(34.0f), hl.L(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(b29Var);
        hf0 f0 = aob.f0(aob.w0(null, this.U, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f0, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(f0);
        imageView.setImportantForAccessibility(2);
        if (ob6.a0) {
            i6 = 3;
        } else {
            i6 = 5;
        }
        addView((View) imageView, tre.d(48, -1.0f, i6 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new sa5(this, (byte) 3));
        this.a = new yb5(hl.L(26.0f), hl.L(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb5.a(boolean, boolean):void");
    }

    public final void b(int i) {
        ema[] emaVarArr;
        float f;
        float L;
        float f2;
        float L2;
        float f3;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            emaVarArr = this.d;
            if (i4 >= emaVarArr.length) {
                break;
            }
            ema emaVar = emaVarArr[i4];
            if (i4 == i) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            emaVar.setImportantForAccessibility(i2);
            i4++;
        }
        if (i == 0) {
            while (i3 < emaVarArr.length) {
                ema emaVar2 = emaVarArr[i3];
                if (i3 == i) {
                    L2 = 0.0f;
                } else {
                    L2 = hl.L(-2.0f);
                }
                emaVar2.setTranslationY(L2);
                ema emaVar3 = emaVarArr[i3];
                if (i3 == i) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                emaVar3.setAlpha(f3);
                i3++;
            }
            return;
        }
        while (i3 < emaVarArr.length) {
            ema emaVar4 = emaVarArr[i3];
            if (i3 == i) {
                L = 0.0f;
            } else {
                if (i3 == 0) {
                    f = 2.0f;
                } else {
                    f = -2.0f;
                }
                L = hl.L(f);
            }
            emaVar4.setTranslationY(L);
            ema emaVar5 = emaVarArr[i3];
            if (i3 == i) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            emaVar5.setAlpha(f2);
            i3++;
        }
    }

    public final boolean c() {
        long j = this.R;
        if (j > 0) {
            TLRPC.User user = this.H;
            if (user == null || user.id != j) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = this.I;
        if (chat == null || chat.id != (-j)) {
            return false;
        }
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float L;
        int i;
        if (this.O) {
            Paint paint = this.J;
            int alpha = paint.getAlpha();
            float f = this.f0;
            if (f != 0.0f) {
                paint.setAlpha((int) ((1.0f - f) * alpha));
            } else {
                paint.setAlpha((int) ((1.0f - this.d[4].getFullAlpha()) * alpha));
            }
            if (ob6.a0) {
                L = 0.0f;
            } else {
                L = hl.L(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (ob6.a0) {
                i = hl.L(68.0f);
            } else {
                i = 0;
            }
            float f2 = L;
            canvas2 = canvas;
            canvas2.drawLine(f2, measuredHeight, measuredWidth - i, getMeasuredHeight() - 1, paint);
            paint.setAlpha(alpha);
        } else {
            canvas2 = canvas;
        }
        de0 de0Var = this.b;
        int measuredWidth2 = (de0Var.getMeasuredWidth() / 2) + de0Var.getLeft();
        int measuredHeight2 = (de0Var.getMeasuredHeight() / 2) + de0Var.getTop();
        yb5 yb5Var = this.a;
        yb5Var.f();
        if (this.f0 == 0.0f) {
            yb5Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        de0Var.setScaleX(yb5Var.b());
        de0Var.setScaleY(yb5Var.b());
        float b = yb5Var.b();
        vb5 vb5Var = this.y;
        vb5Var.setScaleX(b);
        vb5Var.setScaleY(yb5Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(defpackage.k5 r17, org.telegram.tgnet.TLRPC.GroupCallParticipant r18, defpackage.vc2 r19, long r20, org.telegram.tgnet.TLRPC.FileLocation r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zb5.e(k5, org.telegram.tgnet.TLRPC$GroupCallParticipant, vc2, long, org.telegram.tgnet.TLRPC$FileLocation, boolean):void");
    }

    public final void f(int i, int i2) {
        if (this.U != i) {
            if (this.P) {
                this.M = aob.w0(null, i, false);
            }
            this.U = i;
        }
        if (this.P) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
            e29 e29Var = this.f;
            e29Var.setColorFilter(porterDuffColorFilter);
            aob.F1(e29Var.getDrawable(), i2 & 620756991, true);
        }
    }

    public de0 getAvatarImageView() {
        return this.b;
    }

    public yb5 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        ema emaVar = this.e;
        if (TextUtils.isEmpty(emaVar.getText()) || !this.c0) {
            emaVar = this.d[4];
        }
        if (emaVar.getLineCount() > 1) {
            return hl.L(8.0f) + emaVar.getTop() + emaVar.getTextHeight();
        }
        return getMeasuredHeight();
    }

    public CharSequence getName() {
        return this.c.getText();
    }

    public TLRPC.GroupCallParticipant getParticipant() {
        return this.G;
    }

    public long getPeerId() {
        TLRPC.GroupCallParticipant groupCallParticipant = this.G;
        if (groupCallParticipant == null) {
            return 0L;
        }
        return r47.B1(groupCallParticipant.peer);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        ul ulVar = this.s;
        if (ulVar != null) {
            ulVar.a();
        }
        ul ulVar2 = this.r;
        if (ulVar2 != null) {
            ulVar2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a0) {
            hl.r(this.W);
            this.a0 = false;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ul ulVar = this.s;
        if (ulVar != null) {
            ulVar.b();
        }
        ul ulVar2 = this.r;
        if (ulVar2 != null) {
            ulVar2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.G;
            if (groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                i = 2131742882;
            } else {
                i = 2131742945;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, ob6.M0(i, null)));
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(hl.L(58.0f), 1073741824));
    }

    public void setAboutVisible(boolean z) {
        ema[] emaVarArr = this.d;
        if (z) {
            emaVarArr[4].setTranslationY(0.0f);
        } else {
            emaVarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        int i = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        yb5 yb5Var = this.a;
        if (i > 0) {
            boolean z = this.a0;
            ub5 ub5Var = this.W;
            if (z) {
                hl.r(ub5Var);
            }
            if (!this.b0) {
                this.b0 = true;
                a(true, false);
            }
            yb5Var.c(d);
            hl.d3(ub5Var, 500L);
            this.a0 = true;
            return;
        }
        yb5Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z) {
        de0 de0Var = this.b;
        if (de0Var.getImageReceiver().R0 != z) {
            de0Var.getImageReceiver().v0(z, true);
        }
    }

    public void setDrawDivider(boolean z) {
        this.O = z;
        invalidate();
    }

    public void setProgressToAvatarPreview(float f) {
        int i;
        int i2;
        int L;
        int L2;
        this.f0 = f;
        if (ob6.a0) {
            i = hl.L(53.0f);
        } else {
            i = -hl.L(53.0f);
        }
        this.c.setTranslationX(i * f);
        boolean c = c();
        boolean z = true;
        ema emaVar = this.e;
        float f2 = 0.0f;
        ema[] emaVarArr = this.d;
        if (c && f > 0.0f) {
            if (ob6.a0) {
                L2 = -hl.L(53.0f);
            } else {
                L2 = hl.L(53.0f);
            }
            float f3 = 1.0f - f;
            emaVar.setTranslationX(L2 * f3);
            emaVar.setVisibility(0);
            emaVar.setAlpha(f);
            emaVarArr[4].setAlpha(f3);
            ema emaVar2 = emaVarArr[4];
            boolean z2 = ob6.a0;
            int L3 = hl.L(53.0f);
            if (!z2) {
                L3 = -L3;
            }
            emaVar2.setTranslationX(L3 * f);
        } else {
            emaVar.setVisibility(8);
            for (int i3 = 0; i3 < emaVarArr.length; i3++) {
                if (!TextUtils.isEmpty(emaVarArr[4].getText()) && emaVarArr[4].getLineCount() > 1) {
                    ema emaVar3 = emaVarArr[i3];
                    int L4 = hl.L(92.0f);
                    if (ob6.a0) {
                        L = hl.L(48.0f);
                    } else {
                        L = hl.L(53.0f);
                    }
                    emaVar3.h(L4, L);
                    emaVarArr[i3].setFullAlpha(f);
                    emaVarArr[i3].setTranslationX(0.0f);
                    emaVarArr[i3].invalidate();
                } else {
                    ema emaVar4 = emaVarArr[i3];
                    if (ob6.a0) {
                        i2 = hl.L(53.0f);
                    } else {
                        i2 = -hl.L(53.0f);
                    }
                    emaVar4.setTranslationX(i2 * f);
                    emaVarArr[i3].h(0, 0);
                }
            }
        }
        int i4 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i4 == 0) {
            f2 = 1.0f;
        }
        this.b.setAlpha(f2);
        this.a.e(this, (this.b0 && i4 == 0) ? false : false);
        float f4 = 1.0f - f;
        e29 e29Var = this.f;
        e29Var.setAlpha(f4);
        float f5 = (f4 * 0.4f) + 0.6f;
        e29Var.setScaleX(f5);
        e29Var.setScaleY(f5);
        invalidate();
    }

    @Override
    public final void updateColors() {
        ema emaVar;
        ema[] emaVarArr;
        ema emaVar2;
        try {
            this.J.setColor(aob.w0(null, aob.Xg, false));
            int i = this.g0;
            if (i >= 0 && (emaVar = this.e) != null && (emaVarArr = this.d) != null && i < emaVarArr.length && (emaVar2 = emaVarArr[i]) != null) {
                yob.a0(emaVar2);
                emaVar.setTextColor(emaVarArr[this.g0].getTextColor());
            }
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void d(zb5 zb5Var) {
    }
}
