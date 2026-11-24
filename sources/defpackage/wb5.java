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
public class wb5 extends FrameLayout implements vlb {
    public final pc0 E;
    public qd2 F;
    public TLRPC.GroupCallParticipant G;
    public TLRPC.User H;
    public TLRPC.Chat I;
    public final Paint J;
    public boolean K;
    public boolean L;
    public int M;
    public j5 N;
    public boolean O;
    public boolean P;
    public byte Q;
    public long R;
    public final rb5 S;
    public final rb5 T;
    public int U;
    public final rb5 V;
    public final rb5 W;
    public final vb5 a;
    public boolean a0;
    public final bf0 b;
    public boolean b0;
    public final lka c;
    public boolean c0;
    public final lka[] d;
    public final Drawable d0;
    public final lka e;
    public AnimatorSet e0;
    public final s09 f;
    public float f0;
    public int g0;
    public final p09 h;
    public final p09 n;
    public final tm r;
    public final tm s;
    public f6 w;
    public Drawable x;
    public final sb5 y;

    public wb5(Context context) {
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
        float f7;
        float f8;
        int i8;
        float f9;
        float f10;
        this.d = new lka[5];
        this.S = new Runnable(this) {
            public final wb5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i9 = 0;
                wb5 wb5Var = this.b;
                switch (b) {
                    case 0:
                        wb5Var.n.N(0, null);
                        p09 p09Var = wb5Var.h;
                        p09Var.N(0, null);
                        wb5Var.f.setAnimation(p09Var);
                        return;
                    case 1:
                        s09 s09Var = wb5Var.f;
                        p09 p09Var2 = wb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i10 = 120;
                        if (nextInt >= 32) {
                            int i11 = 240;
                            if (nextInt >= 64) {
                                i10 = 420;
                                if (nextInt >= 97) {
                                    i11 = 540;
                                    if (nextInt != 98) {
                                        i10 = 720;
                                    }
                                }
                                i9 = i11;
                            }
                            i9 = i10;
                            i10 = i11;
                        }
                        p09Var2.K(i10);
                        p09Var2.N(i10 - 1, wb5Var.S);
                        s09Var.setAnimation(p09Var2);
                        p09Var2.H(i9);
                        s09Var.d();
                        return;
                    case 2:
                        wb5Var.a(true, true);
                        return;
                    case 3:
                        wb5Var.b0 = false;
                        wb5Var.a(true, true);
                        wb5Var.a.c(0.0d);
                        wb5Var.a0 = false;
                        return;
                    default:
                        wb5Var.a(true, true);
                        return;
                }
            }
        };
        this.T = new Runnable(this) {
            public final wb5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i9 = 0;
                wb5 wb5Var = this.b;
                switch (b) {
                    case 0:
                        wb5Var.n.N(0, null);
                        p09 p09Var = wb5Var.h;
                        p09Var.N(0, null);
                        wb5Var.f.setAnimation(p09Var);
                        return;
                    case 1:
                        s09 s09Var = wb5Var.f;
                        p09 p09Var2 = wb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i10 = 120;
                        if (nextInt >= 32) {
                            int i11 = 240;
                            if (nextInt >= 64) {
                                i10 = 420;
                                if (nextInt >= 97) {
                                    i11 = 540;
                                    if (nextInt != 98) {
                                        i10 = 720;
                                    }
                                }
                                i9 = i11;
                            }
                            i9 = i10;
                            i10 = i11;
                        }
                        p09Var2.K(i10);
                        p09Var2.N(i10 - 1, wb5Var.S);
                        s09Var.setAnimation(p09Var2);
                        p09Var2.H(i9);
                        s09Var.d();
                        return;
                    case 2:
                        wb5Var.a(true, true);
                        return;
                    case 3:
                        wb5Var.b0 = false;
                        wb5Var.a(true, true);
                        wb5Var.a.c(0.0d);
                        wb5Var.a0 = false;
                        return;
                    default:
                        wb5Var.a(true, true);
                        return;
                }
            }
        };
        this.U = cmb.hh;
        this.V = new Runnable(this) {
            public final wb5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i9 = 0;
                wb5 wb5Var = this.b;
                switch (b) {
                    case 0:
                        wb5Var.n.N(0, null);
                        p09 p09Var = wb5Var.h;
                        p09Var.N(0, null);
                        wb5Var.f.setAnimation(p09Var);
                        return;
                    case 1:
                        s09 s09Var = wb5Var.f;
                        p09 p09Var2 = wb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i10 = 120;
                        if (nextInt >= 32) {
                            int i11 = 240;
                            if (nextInt >= 64) {
                                i10 = 420;
                                if (nextInt >= 97) {
                                    i11 = 540;
                                    if (nextInt != 98) {
                                        i10 = 720;
                                    }
                                }
                                i9 = i11;
                            }
                            i9 = i10;
                            i10 = i11;
                        }
                        p09Var2.K(i10);
                        p09Var2.N(i10 - 1, wb5Var.S);
                        s09Var.setAnimation(p09Var2);
                        p09Var2.H(i9);
                        s09Var.d();
                        return;
                    case 2:
                        wb5Var.a(true, true);
                        return;
                    case 3:
                        wb5Var.b0 = false;
                        wb5Var.a(true, true);
                        wb5Var.a.c(0.0d);
                        wb5Var.a0 = false;
                        return;
                    default:
                        wb5Var.a(true, true);
                        return;
                }
            }
        };
        this.W = new Runnable(this) {
            public final wb5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i9 = 0;
                wb5 wb5Var = this.b;
                switch (b) {
                    case 0:
                        wb5Var.n.N(0, null);
                        p09 p09Var = wb5Var.h;
                        p09Var.N(0, null);
                        wb5Var.f.setAnimation(p09Var);
                        return;
                    case 1:
                        s09 s09Var = wb5Var.f;
                        p09 p09Var2 = wb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i10 = 120;
                        if (nextInt >= 32) {
                            int i11 = 240;
                            if (nextInt >= 64) {
                                i10 = 420;
                                if (nextInt >= 97) {
                                    i11 = 540;
                                    if (nextInt != 98) {
                                        i10 = 720;
                                    }
                                }
                                i9 = i11;
                            }
                            i9 = i10;
                            i10 = i11;
                        }
                        p09Var2.K(i10);
                        p09Var2.N(i10 - 1, wb5Var.S);
                        s09Var.setAnimation(p09Var2);
                        p09Var2.H(i9);
                        s09Var.d();
                        return;
                    case 2:
                        wb5Var.a(true, true);
                        return;
                    case 3:
                        wb5Var.b0 = false;
                        wb5Var.a(true, true);
                        wb5Var.a.c(0.0d);
                        wb5Var.a0 = false;
                        return;
                    default:
                        wb5Var.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final wb5 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i9 = 0;
                wb5 wb5Var = this.b;
                switch (b) {
                    case 0:
                        wb5Var.n.N(0, null);
                        p09 p09Var = wb5Var.h;
                        p09Var.N(0, null);
                        wb5Var.f.setAnimation(p09Var);
                        return;
                    case 1:
                        s09 s09Var = wb5Var.f;
                        p09 p09Var2 = wb5Var.n;
                        int nextInt = Utilities.b.nextInt(100);
                        int i10 = 120;
                        if (nextInt >= 32) {
                            int i11 = 240;
                            if (nextInt >= 64) {
                                i10 = 420;
                                if (nextInt >= 97) {
                                    i11 = 540;
                                    if (nextInt != 98) {
                                        i10 = 720;
                                    }
                                }
                                i9 = i11;
                            }
                            i9 = i10;
                            i10 = i11;
                        }
                        p09Var2.K(i10);
                        p09Var2.N(i10 - 1, wb5Var.S);
                        s09Var.setAnimation(p09Var2);
                        p09Var2.H(i9);
                        s09Var.d();
                        return;
                    case 2:
                        wb5Var.a(true, true);
                        return;
                    case 3:
                        wb5Var.b0 = false;
                        wb5Var.a(true, true);
                        wb5Var.a.c(0.0d);
                        wb5Var.a0 = false;
                        return;
                    default:
                        wb5Var.a(true, true);
                        return;
                }
            }
        };
        this.g0 = -1;
        Paint paint = new Paint();
        this.J = paint;
        paint.setColor(cmb.w0(null, cmb.Wg, false));
        this.E = new pc0((ylb) null);
        setClipChildren(false);
        bf0 bf0Var = new bf0(context);
        this.b = bf0Var;
        bf0Var.setRoundRadius(gm.L(24.0f));
        boolean z = jb6.a0;
        if (z) {
            i = 5;
        } else {
            i = 3;
        }
        int i9 = i | 48;
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
        addView(bf0Var, qoe.d(46, 46.0f, i9, f, 6.0f, f2, 0.0f));
        sb5 sb5Var = new sb5(this, context);
        this.y = sb5Var;
        sb5Var.setSize(gm.L(26.0f));
        sb5Var.setProgressColor(-1);
        sb5Var.setNoProgress(false);
        boolean z2 = jb6.a0;
        if (z2) {
            i2 = 5;
        } else {
            i2 = 3;
        }
        int i10 = i2 | 48;
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
        addView(sb5Var, qoe.d(46, 46.0f, i10, f3, 6.0f, f4, 0.0f));
        gm.T3(sb5Var, false, 1.0f, true, false);
        lka lkaVar = new lka(context);
        this.c = lkaVar;
        anb.W(lkaVar, cmb.dh, null);
        lkaVar.setTypeface(gm.o());
        lkaVar.setTextSize(16);
        lkaVar.setDrawablePadding(gm.L(6.0f));
        if (jb6.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        lkaVar.setGravity(i3 | 48);
        boolean z3 = jb6.a0;
        if (z3) {
            i4 = 5;
        } else {
            i4 = 3;
        }
        int i11 = i4 | 48;
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
        addView(lkaVar, qoe.d(-1, 20.0f, i11, f5, 10.0f, f6, 0.0f));
        this.r = new tm(gm.L(20.0f), 9, lkaVar, false);
        this.s = new tm(gm.L(20.0f), 9, lkaVar, false);
        Drawable drawable = context.getResources().getDrawable(2131232820);
        this.d0 = drawable;
        anb.x(this, drawable, cmb.gh, null, PorterDuff.Mode.MULTIPLY);
        int i12 = 0;
        while (true) {
            lka[] lkaVarArr = this.d;
            if (i12 >= lkaVarArr.length) {
                break;
            }
            lkaVarArr[i12] = new tb5(this, context, i12);
            this.d[i12].setTextSize(15);
            lka lkaVar2 = this.d[i12];
            if (jb6.a0) {
                i6 = 5;
            } else {
                i6 = 3;
            }
            lkaVar2.setGravity(i6 | 48);
            if (i12 == 4) {
                this.d[i12].setBuildFullLayout(true);
                anb.W(this.d[i12], cmb.hh, null);
                lka lkaVar3 = this.d[i12];
                boolean z4 = jb6.a0;
                if (z4) {
                    i8 = 5;
                } else {
                    i8 = 3;
                }
                int i13 = i8 | 48;
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
                addView(lkaVar3, qoe.d(-1, -2.0f, i13, f9, 32.0f, f10, 0.0f));
            } else {
                if (i12 == 0) {
                    anb.W(this.d[i12], cmb.fh, null);
                    this.d[i12].k(jb6.M0(2131748634, null));
                } else if (i12 == 1) {
                    anb.W(this.d[i12], cmb.gh, null);
                    this.d[i12].k(jb6.M0(2131745007, null));
                    this.d[i12].setDrawablePadding(gm.L(2.0f));
                } else if (i12 == 2) {
                    anb.W(this.d[i12], cmb.ih, null);
                    this.d[i12].k(jb6.M0(2131743041, null));
                } else if (i12 == 3) {
                    anb.W(this.d[i12], cmb.fh, null);
                    this.d[i12].k(jb6.M0(2131742613, null));
                }
                lka lkaVar4 = this.d[i12];
                boolean z5 = jb6.a0;
                if (z5) {
                    i7 = 5;
                } else {
                    i7 = 3;
                }
                int i14 = i7 | 48;
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
                addView(lkaVar4, qoe.d(-1, 20.0f, i14, f7, 32.0f, f8, 0.0f));
            }
            i12++;
        }
        lka lkaVar5 = new lka(context);
        this.e = lkaVar5;
        lkaVar5.setMaxLines(3);
        lkaVar5.setTextSize(15);
        anb.W(lkaVar5, cmb.hh, null);
        lkaVar5.setVisibility(8);
        if (jb6.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        addView(lkaVar5, qoe.d(-1, 60.0f, i5 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        p09 p09Var = new p09(2131624330, gm.L(34.0f), gm.L(32.0f), true, null);
        this.h = p09Var;
        this.n = new p09(2131624044, gm.L(34.0f), gm.L(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(p09Var);
        fg0 f0 = cmb.f0(cmb.w0(null, this.U, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f0, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(f0);
        imageView.setImportantForAccessibility(2);
        addView((View) imageView, qoe.d(48, -1.0f, (jb6.a0 ? 3 : 5) | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new ca5(this, (byte) 5));
        this.a = new vb5(gm.L(26.0f), gm.L(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb5.a(boolean, boolean):void");
    }

    public final void b(int i) {
        lka[] lkaVarArr;
        float f;
        float L;
        float f2;
        float L2;
        float f3;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            lkaVarArr = this.d;
            if (i4 >= lkaVarArr.length) {
                break;
            }
            lka lkaVar = lkaVarArr[i4];
            if (i4 == i) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            lkaVar.setImportantForAccessibility(i2);
            i4++;
        }
        if (i == 0) {
            while (i3 < lkaVarArr.length) {
                lka lkaVar2 = lkaVarArr[i3];
                if (i3 == i) {
                    L2 = 0.0f;
                } else {
                    L2 = gm.L(-2.0f);
                }
                lkaVar2.setTranslationY(L2);
                lka lkaVar3 = lkaVarArr[i3];
                if (i3 == i) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                lkaVar3.setAlpha(f3);
                i3++;
            }
            return;
        }
        while (i3 < lkaVarArr.length) {
            lka lkaVar4 = lkaVarArr[i3];
            if (i3 == i) {
                L = 0.0f;
            } else {
                if (i3 == 0) {
                    f = 2.0f;
                } else {
                    f = -2.0f;
                }
                L = gm.L(f);
            }
            lkaVar4.setTranslationY(L);
            lka lkaVar5 = lkaVarArr[i3];
            if (i3 == i) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            lkaVar5.setAlpha(f2);
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
            if (jb6.a0) {
                L = 0.0f;
            } else {
                L = gm.L(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (jb6.a0) {
                i = gm.L(68.0f);
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
        bf0 bf0Var = this.b;
        int measuredWidth2 = (bf0Var.getMeasuredWidth() / 2) + bf0Var.getLeft();
        int measuredHeight2 = (bf0Var.getMeasuredHeight() / 2) + bf0Var.getTop();
        vb5 vb5Var = this.a;
        vb5Var.f();
        if (this.f0 == 0.0f) {
            vb5Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        bf0Var.setScaleX(vb5Var.b());
        bf0Var.setScaleY(vb5Var.b());
        float b = vb5Var.b();
        sb5 sb5Var = this.y;
        sb5Var.setScaleX(b);
        sb5Var.setScaleY(vb5Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(defpackage.j5 r17, org.telegram.tgnet.TLRPC.GroupCallParticipant r18, defpackage.qd2 r19, long r20, org.telegram.tgnet.TLRPC.FileLocation r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wb5.e(j5, org.telegram.tgnet.TLRPC$GroupCallParticipant, qd2, long, org.telegram.tgnet.TLRPC$FileLocation, boolean):void");
    }

    public final void f(int i, int i2) {
        if (this.U != i) {
            if (this.P) {
                this.M = cmb.w0(null, i, false);
            }
            this.U = i;
        }
        if (this.P) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
            s09 s09Var = this.f;
            s09Var.setColorFilter(porterDuffColorFilter);
            cmb.F1(s09Var.getDrawable(), i2 & 620756991, true);
        }
    }

    public bf0 getAvatarImageView() {
        return this.b;
    }

    public vb5 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        lka lkaVar = this.e;
        if (TextUtils.isEmpty(lkaVar.getText()) || !this.c0) {
            lkaVar = this.d[4];
        }
        if (lkaVar.getLineCount() > 1) {
            return gm.L(8.0f) + lkaVar.getTop() + lkaVar.getTextHeight();
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
        return k47.B1(groupCallParticipant.peer);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        tm tmVar = this.s;
        if (tmVar != null) {
            tmVar.a();
        }
        tm tmVar2 = this.r;
        if (tmVar2 != null) {
            tmVar2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a0) {
            gm.r(this.W);
            this.a0 = false;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        tm tmVar = this.s;
        if (tmVar != null) {
            tmVar.b();
        }
        tm tmVar2 = this.r;
        if (tmVar2 != null) {
            tmVar2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.G;
            if (groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                i = 2131742914;
            } else {
                i = 2131742977;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, jb6.M0(i, null)));
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gm.L(58.0f), 1073741824));
    }

    public void setAboutVisible(boolean z) {
        lka[] lkaVarArr = this.d;
        if (z) {
            lkaVarArr[4].setTranslationY(0.0f);
        } else {
            lkaVarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        int i = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        vb5 vb5Var = this.a;
        if (i > 0) {
            boolean z = this.a0;
            rb5 rb5Var = this.W;
            if (z) {
                gm.r(rb5Var);
            }
            if (!this.b0) {
                this.b0 = true;
                a(true, false);
            }
            vb5Var.c(d);
            gm.d3(rb5Var, 500L);
            this.a0 = true;
            return;
        }
        vb5Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z) {
        bf0 bf0Var = this.b;
        if (bf0Var.getImageReceiver().R0 != z) {
            bf0Var.getImageReceiver().v0(z, true);
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
        if (jb6.a0) {
            i = gm.L(53.0f);
        } else {
            i = -gm.L(53.0f);
        }
        this.c.setTranslationX(i * f);
        boolean c = c();
        boolean z = true;
        lka lkaVar = this.e;
        float f2 = 0.0f;
        lka[] lkaVarArr = this.d;
        if (c && f > 0.0f) {
            if (jb6.a0) {
                L2 = -gm.L(53.0f);
            } else {
                L2 = gm.L(53.0f);
            }
            float f3 = 1.0f - f;
            lkaVar.setTranslationX(L2 * f3);
            lkaVar.setVisibility(0);
            lkaVar.setAlpha(f);
            lkaVarArr[4].setAlpha(f3);
            lka lkaVar2 = lkaVarArr[4];
            boolean z2 = jb6.a0;
            int L3 = gm.L(53.0f);
            if (!z2) {
                L3 = -L3;
            }
            lkaVar2.setTranslationX(L3 * f);
        } else {
            lkaVar.setVisibility(8);
            for (int i3 = 0; i3 < lkaVarArr.length; i3++) {
                if (!TextUtils.isEmpty(lkaVarArr[4].getText()) && lkaVarArr[4].getLineCount() > 1) {
                    lka lkaVar3 = lkaVarArr[i3];
                    int L4 = gm.L(92.0f);
                    if (jb6.a0) {
                        L = gm.L(48.0f);
                    } else {
                        L = gm.L(53.0f);
                    }
                    lkaVar3.h(L4, L);
                    lkaVarArr[i3].setFullAlpha(f);
                    lkaVarArr[i3].setTranslationX(0.0f);
                    lkaVarArr[i3].invalidate();
                } else {
                    lka lkaVar4 = lkaVarArr[i3];
                    if (jb6.a0) {
                        i2 = gm.L(53.0f);
                    } else {
                        i2 = -gm.L(53.0f);
                    }
                    lkaVar4.setTranslationX(i2 * f);
                    lkaVarArr[i3].h(0, 0);
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
        s09 s09Var = this.f;
        s09Var.setAlpha(f4);
        float f5 = (f4 * 0.4f) + 0.6f;
        s09Var.setScaleX(f5);
        s09Var.setScaleY(f5);
        invalidate();
    }

    @Override
    public final void updateColors() {
        lka lkaVar;
        lka[] lkaVarArr;
        lka lkaVar2;
        try {
            this.J.setColor(cmb.w0(null, cmb.Wg, false));
            int i = this.g0;
            if (i >= 0 && (lkaVar = this.e) != null && (lkaVarArr = this.d) != null && i < lkaVarArr.length && (lkaVar2 = lkaVarArr[i]) != null) {
                anb.a0(lkaVar2);
                lkaVar.setTextColor(lkaVarArr[this.g0].getTextColor());
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void d(wb5 wb5Var) {
    }
}
