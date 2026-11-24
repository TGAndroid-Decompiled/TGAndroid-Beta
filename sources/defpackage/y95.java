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
public class y95 extends FrameLayout implements tjb {
    public final pb0 E;
    public fc2 F;
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
    public final t95 S;
    public final t95 T;
    public int U;
    public final t95 V;
    public final t95 W;
    public final x95 a;
    public boolean a0;
    public final be0 b;
    public boolean b0;
    public final jia c;
    public boolean c0;
    public final jia[] d;
    public final Drawable d0;
    public final jia e;
    public AnimatorSet e0;
    public final ry8 f;
    public float f0;
    public int g0;
    public final oy8 h;
    public final oy8 n;
    public final tl r;
    public final tl s;
    public f6 w;
    public Drawable x;
    public final u95 y;

    public y95(Context context) {
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
        this.d = new jia[5];
        this.S = new Runnable(this) {
            public final y95 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i10 = 0;
                y95 y95Var = this.b;
                switch (b) {
                    case 0:
                        y95Var.n.N(0, null);
                        oy8 oy8Var = y95Var.h;
                        oy8Var.N(0, null);
                        y95Var.f.setAnimation(oy8Var);
                        return;
                    case 1:
                        ry8 ry8Var = y95Var.f;
                        oy8 oy8Var2 = y95Var.n;
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
                        oy8Var2.K(i11);
                        oy8Var2.N(i11 - 1, y95Var.S);
                        ry8Var.setAnimation(oy8Var2);
                        oy8Var2.H(i10);
                        ry8Var.d();
                        return;
                    case 2:
                        y95Var.a(true, true);
                        return;
                    case 3:
                        y95Var.b0 = false;
                        y95Var.a(true, true);
                        y95Var.a.c(0.0d);
                        y95Var.a0 = false;
                        return;
                    default:
                        y95Var.a(true, true);
                        return;
                }
            }
        };
        this.T = new Runnable(this) {
            public final y95 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i10 = 0;
                y95 y95Var = this.b;
                switch (b) {
                    case 0:
                        y95Var.n.N(0, null);
                        oy8 oy8Var = y95Var.h;
                        oy8Var.N(0, null);
                        y95Var.f.setAnimation(oy8Var);
                        return;
                    case 1:
                        ry8 ry8Var = y95Var.f;
                        oy8 oy8Var2 = y95Var.n;
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
                        oy8Var2.K(i11);
                        oy8Var2.N(i11 - 1, y95Var.S);
                        ry8Var.setAnimation(oy8Var2);
                        oy8Var2.H(i10);
                        ry8Var.d();
                        return;
                    case 2:
                        y95Var.a(true, true);
                        return;
                    case 3:
                        y95Var.b0 = false;
                        y95Var.a(true, true);
                        y95Var.a.c(0.0d);
                        y95Var.a0 = false;
                        return;
                    default:
                        y95Var.a(true, true);
                        return;
                }
            }
        };
        this.U = bkb.hh;
        this.V = new Runnable(this) {
            public final y95 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i10 = 0;
                y95 y95Var = this.b;
                switch (b) {
                    case 0:
                        y95Var.n.N(0, null);
                        oy8 oy8Var = y95Var.h;
                        oy8Var.N(0, null);
                        y95Var.f.setAnimation(oy8Var);
                        return;
                    case 1:
                        ry8 ry8Var = y95Var.f;
                        oy8 oy8Var2 = y95Var.n;
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
                        oy8Var2.K(i11);
                        oy8Var2.N(i11 - 1, y95Var.S);
                        ry8Var.setAnimation(oy8Var2);
                        oy8Var2.H(i10);
                        ry8Var.d();
                        return;
                    case 2:
                        y95Var.a(true, true);
                        return;
                    case 3:
                        y95Var.b0 = false;
                        y95Var.a(true, true);
                        y95Var.a.c(0.0d);
                        y95Var.a0 = false;
                        return;
                    default:
                        y95Var.a(true, true);
                        return;
                }
            }
        };
        this.W = new Runnable(this) {
            public final y95 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i10 = 0;
                y95 y95Var = this.b;
                switch (b) {
                    case 0:
                        y95Var.n.N(0, null);
                        oy8 oy8Var = y95Var.h;
                        oy8Var.N(0, null);
                        y95Var.f.setAnimation(oy8Var);
                        return;
                    case 1:
                        ry8 ry8Var = y95Var.f;
                        oy8 oy8Var2 = y95Var.n;
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
                        oy8Var2.K(i11);
                        oy8Var2.N(i11 - 1, y95Var.S);
                        ry8Var.setAnimation(oy8Var2);
                        oy8Var2.H(i10);
                        ry8Var.d();
                        return;
                    case 2:
                        y95Var.a(true, true);
                        return;
                    case 3:
                        y95Var.b0 = false;
                        y95Var.a(true, true);
                        y95Var.a.c(0.0d);
                        y95Var.a0 = false;
                        return;
                    default:
                        y95Var.a(true, true);
                        return;
                }
            }
        };
        new Runnable(this) {
            public final y95 b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r2;
                int i10 = 0;
                y95 y95Var = this.b;
                switch (b) {
                    case 0:
                        y95Var.n.N(0, null);
                        oy8 oy8Var = y95Var.h;
                        oy8Var.N(0, null);
                        y95Var.f.setAnimation(oy8Var);
                        return;
                    case 1:
                        ry8 ry8Var = y95Var.f;
                        oy8 oy8Var2 = y95Var.n;
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
                        oy8Var2.K(i11);
                        oy8Var2.N(i11 - 1, y95Var.S);
                        ry8Var.setAnimation(oy8Var2);
                        oy8Var2.H(i10);
                        ry8Var.d();
                        return;
                    case 2:
                        y95Var.a(true, true);
                        return;
                    case 3:
                        y95Var.b0 = false;
                        y95Var.a(true, true);
                        y95Var.a.c(0.0d);
                        y95Var.a0 = false;
                        return;
                    default:
                        y95Var.a(true, true);
                        return;
                }
            }
        };
        this.g0 = -1;
        Paint paint = new Paint();
        this.J = paint;
        paint.setColor(bkb.w0(null, bkb.Wg, false));
        this.E = new pb0((wjb) null);
        setClipChildren(false);
        be0 be0Var = new be0(context);
        this.b = be0Var;
        be0Var.setRoundRadius(gl.L(24.0f));
        boolean z = k96.a0;
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
        addView(be0Var, nme.d(46, 46.0f, i10, f, 6.0f, f2, 0.0f));
        u95 u95Var = new u95(this, context);
        this.y = u95Var;
        u95Var.setSize(gl.L(26.0f));
        u95Var.setProgressColor(-1);
        u95Var.setNoProgress(false);
        boolean z2 = k96.a0;
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
        addView(u95Var, nme.d(46, 46.0f, i11, f3, 6.0f, f4, 0.0f));
        gl.U3(u95Var, false, 1.0f, true, false);
        jia jiaVar = new jia(context);
        this.c = jiaVar;
        zkb.W(jiaVar, bkb.dh, null);
        jiaVar.setTypeface(gl.o());
        jiaVar.setTextSize(16);
        jiaVar.setDrawablePadding(gl.L(6.0f));
        if (k96.a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        jiaVar.setGravity(i3 | 48);
        boolean z3 = k96.a0;
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
        addView(jiaVar, nme.d(-1, 20.0f, i12, f5, 10.0f, f6, 0.0f));
        this.r = new tl(gl.L(20.0f), 9, jiaVar, false);
        this.s = new tl(gl.L(20.0f), 9, jiaVar, false);
        Drawable drawable = context.getResources().getDrawable(2131232807);
        this.d0 = drawable;
        zkb.x(this, drawable, bkb.gh, null, PorterDuff.Mode.MULTIPLY);
        int i13 = 0;
        while (true) {
            jia[] jiaVarArr = this.d;
            if (i13 >= jiaVarArr.length) {
                break;
            }
            jiaVarArr[i13] = new v95(this, context, i13);
            this.d[i13].setTextSize(15);
            jia jiaVar2 = this.d[i13];
            if (k96.a0) {
                i7 = 5;
            } else {
                i7 = 3;
            }
            jiaVar2.setGravity(i7 | 48);
            if (i13 == 4) {
                this.d[i13].setBuildFullLayout(true);
                zkb.W(this.d[i13], bkb.hh, null);
                jia jiaVar3 = this.d[i13];
                boolean z4 = k96.a0;
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
                addView(jiaVar3, nme.d(-1, -2.0f, i14, f9, 32.0f, f10, 0.0f));
            } else {
                if (i13 == 0) {
                    zkb.W(this.d[i13], bkb.fh, null);
                    this.d[i13].k(k96.M0(2131748685, null));
                } else if (i13 == 1) {
                    zkb.W(this.d[i13], bkb.gh, null);
                    this.d[i13].k(k96.M0(2131745081, null));
                    this.d[i13].setDrawablePadding(gl.L(2.0f));
                } else if (i13 == 2) {
                    zkb.W(this.d[i13], bkb.ih, null);
                    this.d[i13].k(k96.M0(2131743115, null));
                } else if (i13 == 3) {
                    zkb.W(this.d[i13], bkb.fh, null);
                    this.d[i13].k(k96.M0(2131742687, null));
                }
                jia jiaVar4 = this.d[i13];
                boolean z5 = k96.a0;
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
                addView(jiaVar4, nme.d(-1, 20.0f, i15, f7, 32.0f, f8, 0.0f));
            }
            i13++;
        }
        jia jiaVar5 = new jia(context);
        this.e = jiaVar5;
        jiaVar5.setMaxLines(3);
        jiaVar5.setTextSize(15);
        zkb.W(jiaVar5, bkb.hh, null);
        jiaVar5.setVisibility(8);
        if (k96.a0) {
            i5 = 5;
        } else {
            i5 = 3;
        }
        addView(jiaVar5, nme.d(-1, 60.0f, i5 | 48, 14.0f, 32.0f, 14.0f, 0.0f));
        oy8 oy8Var = new oy8(2131624330, gl.L(34.0f), gl.L(32.0f), true, null);
        this.h = oy8Var;
        this.n = new oy8(2131624044, gl.L(34.0f), gl.L(32.0f), true, null);
        ?? imageView = new ImageView(context);
        this.f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAnimation(oy8Var);
        ff0 f0 = bkb.f0(bkb.w0(null, this.U, false) & 620756991, 1, -1);
        try {
            RippleDrawable.class.getDeclaredMethod("setForceSoftware", Boolean.TYPE).invoke(f0, Boolean.TRUE);
        } catch (Throwable unused) {
        }
        imageView.setBackground(f0);
        imageView.setImportantForAccessibility(2);
        if (k96.a0) {
            i6 = 3;
        } else {
            i6 = 5;
        }
        addView((View) imageView, nme.d(48, -1.0f, i6 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
        imageView.setOnClickListener(new b95(this, (byte) 2));
        this.a = new x95(gl.L(26.0f), gl.L(29.0f));
        setWillNotDraw(false);
        setFocusable(true);
    }

    public final void a(boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y95.a(boolean, boolean):void");
    }

    public final void b(int i) {
        jia[] jiaVarArr;
        float f;
        float L;
        float f2;
        float L2;
        float f3;
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            jiaVarArr = this.d;
            if (i4 >= jiaVarArr.length) {
                break;
            }
            jia jiaVar = jiaVarArr[i4];
            if (i4 == i) {
                i2 = 1;
            } else {
                i2 = 2;
            }
            jiaVar.setImportantForAccessibility(i2);
            i4++;
        }
        if (i == 0) {
            while (i3 < jiaVarArr.length) {
                jia jiaVar2 = jiaVarArr[i3];
                if (i3 == i) {
                    L2 = 0.0f;
                } else {
                    L2 = gl.L(-2.0f);
                }
                jiaVar2.setTranslationY(L2);
                jia jiaVar3 = jiaVarArr[i3];
                if (i3 == i) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                jiaVar3.setAlpha(f3);
                i3++;
            }
            return;
        }
        while (i3 < jiaVarArr.length) {
            jia jiaVar4 = jiaVarArr[i3];
            if (i3 == i) {
                L = 0.0f;
            } else {
                if (i3 == 0) {
                    f = 2.0f;
                } else {
                    f = -2.0f;
                }
                L = gl.L(f);
            }
            jiaVar4.setTranslationY(L);
            jia jiaVar5 = jiaVarArr[i3];
            if (i3 == i) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            jiaVar5.setAlpha(f2);
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
            if (k96.a0) {
                L = 0.0f;
            } else {
                L = gl.L(68.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (k96.a0) {
                i = gl.L(68.0f);
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
        be0 be0Var = this.b;
        int measuredWidth2 = (be0Var.getMeasuredWidth() / 2) + be0Var.getLeft();
        int measuredHeight2 = (be0Var.getMeasuredHeight() / 2) + be0Var.getTop();
        x95 x95Var = this.a;
        x95Var.f();
        if (this.f0 == 0.0f) {
            x95Var.a(canvas2, measuredWidth2, measuredHeight2, this);
        }
        be0Var.setScaleX(x95Var.b());
        be0Var.setScaleY(x95Var.b());
        float b = x95Var.b();
        u95 u95Var = this.y;
        u95Var.setScaleX(b);
        u95Var.setScaleY(x95Var.b());
        super.dispatchDraw(canvas2);
    }

    public final void e(defpackage.j5 r17, org.telegram.tgnet.TLRPC.GroupCallParticipant r18, defpackage.fc2 r19, long r20, org.telegram.tgnet.TLRPC.FileLocation r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y95.e(j5, org.telegram.tgnet.TLRPC$GroupCallParticipant, fc2, long, org.telegram.tgnet.TLRPC$FileLocation, boolean):void");
    }

    public final void f(int i, int i2) {
        if (this.U != i) {
            if (this.P) {
                this.M = bkb.w0(null, i, false);
            }
            this.U = i;
        }
        if (this.P) {
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN);
            ry8 ry8Var = this.f;
            ry8Var.setColorFilter(porterDuffColorFilter);
            bkb.F1(ry8Var.getDrawable(), i2 & 620756991, true);
        }
    }

    public be0 getAvatarImageView() {
        return this.b;
    }

    public x95 getAvatarWavesDrawable() {
        return this.a;
    }

    public int getClipHeight() {
        jia jiaVar = this.e;
        if (TextUtils.isEmpty(jiaVar.getText()) || !this.c0) {
            jiaVar = this.d[4];
        }
        if (jiaVar.getLineCount() > 1) {
            return gl.L(8.0f) + jiaVar.getTop() + jiaVar.getTextHeight();
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
        return k27.B1(groupCallParticipant.peer);
    }

    @Override
    public final boolean hasOverlappingRendering() {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a(false, false);
        tl tlVar = this.s;
        if (tlVar != null) {
            tlVar.a();
        }
        tl tlVar2 = this.r;
        if (tlVar2 != null) {
            tlVar2.a();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.a0) {
            gl.r(this.W);
            this.a0 = false;
        }
        AnimatorSet animatorSet = this.e0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        tl tlVar = this.s;
        if (tlVar != null) {
            tlVar.b();
        }
        tl tlVar2 = this.r;
        if (tlVar2 != null) {
            tlVar2.b();
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo.isEnabled()) {
            TLRPC.GroupCallParticipant groupCallParticipant = this.G;
            if (groupCallParticipant.muted && !groupCallParticipant.can_self_unmute) {
                i = 2131742988;
            } else {
                i = 2131743051;
            }
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, k96.M0(i, null)));
        }
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(58.0f), 1073741824));
    }

    public void setAboutVisible(boolean z) {
        jia[] jiaVarArr = this.d;
        if (z) {
            jiaVarArr[4].setTranslationY(0.0f);
        } else {
            jiaVarArr[4].setFullAlpha(0.0f);
        }
        invalidate();
    }

    public void setAmplitude(double d) {
        int i = (d > 1.5d ? 1 : (d == 1.5d ? 0 : -1));
        x95 x95Var = this.a;
        if (i > 0) {
            boolean z = this.a0;
            t95 t95Var = this.W;
            if (z) {
                gl.r(t95Var);
            }
            if (!this.b0) {
                this.b0 = true;
                a(true, false);
            }
            x95Var.c(d);
            gl.e3(t95Var, 500L);
            this.a0 = true;
            return;
        }
        x95Var.c(0.0d);
    }

    public void setDrawAvatar(boolean z) {
        be0 be0Var = this.b;
        if (be0Var.getImageReceiver().R0 != z) {
            be0Var.getImageReceiver().v0(z, true);
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
        if (k96.a0) {
            i = gl.L(53.0f);
        } else {
            i = -gl.L(53.0f);
        }
        this.c.setTranslationX(i * f);
        boolean c = c();
        boolean z = true;
        jia jiaVar = this.e;
        float f2 = 0.0f;
        jia[] jiaVarArr = this.d;
        if (c && f > 0.0f) {
            if (k96.a0) {
                L2 = -gl.L(53.0f);
            } else {
                L2 = gl.L(53.0f);
            }
            float f3 = 1.0f - f;
            jiaVar.setTranslationX(L2 * f3);
            jiaVar.setVisibility(0);
            jiaVar.setAlpha(f);
            jiaVarArr[4].setAlpha(f3);
            jia jiaVar2 = jiaVarArr[4];
            boolean z2 = k96.a0;
            int L3 = gl.L(53.0f);
            if (!z2) {
                L3 = -L3;
            }
            jiaVar2.setTranslationX(L3 * f);
        } else {
            jiaVar.setVisibility(8);
            for (int i3 = 0; i3 < jiaVarArr.length; i3++) {
                if (!TextUtils.isEmpty(jiaVarArr[4].getText()) && jiaVarArr[4].getLineCount() > 1) {
                    jia jiaVar3 = jiaVarArr[i3];
                    int L4 = gl.L(92.0f);
                    if (k96.a0) {
                        L = gl.L(48.0f);
                    } else {
                        L = gl.L(53.0f);
                    }
                    jiaVar3.h(L4, L);
                    jiaVarArr[i3].setFullAlpha(f);
                    jiaVarArr[i3].setTranslationX(0.0f);
                    jiaVarArr[i3].invalidate();
                } else {
                    jia jiaVar4 = jiaVarArr[i3];
                    if (k96.a0) {
                        i2 = gl.L(53.0f);
                    } else {
                        i2 = -gl.L(53.0f);
                    }
                    jiaVar4.setTranslationX(i2 * f);
                    jiaVarArr[i3].h(0, 0);
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
        ry8 ry8Var = this.f;
        ry8Var.setAlpha(f4);
        float f5 = (f4 * 0.4f) + 0.6f;
        ry8Var.setScaleX(f5);
        ry8Var.setScaleY(f5);
        invalidate();
    }

    @Override
    public final void updateColors() {
        jia jiaVar;
        jia[] jiaVarArr;
        jia jiaVar2;
        try {
            this.J.setColor(bkb.w0(null, bkb.Wg, false));
            int i = this.g0;
            if (i >= 0 && (jiaVar = this.e) != null && (jiaVarArr = this.d) != null && i < jiaVarArr.length && (jiaVar2 = jiaVarArr[i]) != null) {
                zkb.a0(jiaVar2);
                jiaVar.setTextColor(jiaVarArr[this.g0].getTextColor());
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }

    public void d(y95 y95Var) {
    }
}
