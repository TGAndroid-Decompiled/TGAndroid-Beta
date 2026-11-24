package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
public class j67 extends Dialog implements jm7 {
    public boolean A0;
    public rc2 B0;
    public uib C0;
    public Paint D0;
    public float E;
    public final y57 F;
    public final e67 G;
    public final y57 H;
    public long I;
    public tm J;
    public final f67 K;
    public final ul2 L;
    public final s37 M;
    public final ArrayList N;
    public int O;
    public final vh6 P;
    public rc2 Q;
    public int R;
    public sy1 S;
    public final Paint T;
    public f U;
    public ix1 V;
    public xz1 W;
    public a67 X;
    public int Y;
    public ViewGroup Z;
    public final Context a;
    public final z57 a0;
    public final ylb b;
    public boolean b0;
    public final int c;
    public float c0;
    public iq5 d;
    public FrameLayout d0;
    public Bitmap e;
    public b67 e0;
    public BitmapShader f;
    public boolean f0;
    public boolean g0;
    public Paint h;
    public boolean h0;
    public final qna i0;
    public final jz4 j0;
    public final km0 k0;
    public RectF l0;
    public yh4 m0;
    public Matrix n;
    public ry n0;
    public final int[] o0;
    public boolean p0;
    public boolean q0;
    public boolean r;
    public final int[] r0;
    public boolean s;
    public final float[] s0;
    public boolean t0;
    public boolean u0;
    public rc2 v0;
    public boolean w;
    public float w0;
    public boolean x;
    public float x0;
    public boolean y;
    public final Rect y0;
    public ValueAnimator z0;

    public j67(Context context, ylb ylbVar) {
        super(context, 2131755352);
        int i = z8c.t0;
        this.c = i;
        this.d = iq5.e;
        this.N = new ArrayList();
        this.P = new vh6();
        this.T = new Paint(1);
        this.o0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new float[4];
        this.u0 = false;
        this.y0 = new Rect();
        this.a = context;
        this.b = ylbVar;
        gm.S(getWindow());
        y57 y57Var = new y57(this, context, (byte) 1);
        this.F = y57Var;
        this.i0 = qna.d(1, y57Var, y57Var);
        y57Var.setOnClickListener(new View.OnClickListener(this) {
            public final j67 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                j67 j67Var = this.b;
                switch (b) {
                    case 0:
                        j67Var.onBackPressed();
                        return;
                    default:
                        j67Var.onBackPressed();
                        return;
                }
            }
        });
        y57Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new i82(this, (byte) 1));
        jz4 jz4Var = new jz4();
        this.j0 = jz4Var;
        km0 km0Var = new km0(jz4Var, jz4Var, jz4Var);
        this.k0 = km0Var;
        km0Var.h = new zgc(y57Var);
        km0Var.i = y57Var;
        e67 e67Var = new e67(this, context, ylbVar);
        this.G = e67Var;
        e67Var.setClipToPadding(false);
        y57Var.addView(e67Var, qoe.e(-1, -1, 119));
        fk3 fk3Var = new fk3(this);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(y57Var, fk3Var);
        f67 f67Var = new f67(this, context, ylbVar);
        this.K = f67Var;
        f67Var.setOnClickListener(new View.OnClickListener(this) {
            public final j67 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                j67 j67Var = this.b;
                switch (b) {
                    case 0:
                        j67Var.onBackPressed();
                        return;
                    default:
                        j67Var.onBackPressed();
                        return;
                }
            }
        });
        f67Var.setOnItemClickListener(new kg4(this, (byte) 13));
        f67Var.setOnScrollListener(new ip2(this, (byte) 27));
        f67Var.setItemAnimator(new wb2(null, f67Var, ylbVar));
        s37 s37Var = new s37(this, (byte) 2);
        this.M = s37Var;
        s37Var.O = new zr1(this, (byte) 10);
        f67Var.setLayoutManager(s37Var);
        f67Var.i(new as1((byte) 10));
        ul2 ul2Var = new ul2(this, context, ylbVar, (byte) 1);
        this.L = ul2Var;
        f67Var.setAdapter(ul2Var);
        f67Var.setVerticalScrollBarEnabled(false);
        f67Var.setOverScrollMode(2);
        e67Var.addView(f67Var, qoe.c(-2.0f, -1));
        y57 y57Var2 = new y57(this, context, (byte) 0);
        this.H = y57Var2;
        y57Var.addView(y57Var2, qoe.c(-1.0f, -1));
        this.a0 = new z57(this, y57Var2, i);
    }

    public final void a(d dVar) {
        t53 t53Var;
        if (this.e0 == null && dVar != null) {
            int i = this.c;
            oc7.r1(i).D0();
            FrameLayout frameLayout = new FrameLayout(this.a);
            this.d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.d0.setClipToPadding(false);
            this.d0.setPadding(0, 0, 0, gm.L(24.0f));
            ?? v29Var = new v29(5, this.c, this.b, getContext(), null);
            this.e0 = v29Var;
            v29Var.setClipChildren(false);
            this.e0.setClipToPadding(false);
            this.e0.setPadding(gm.L(4.0f), gm.L(22.0f), gm.L(4.0f), gm.L(22.0f));
            this.e0.setDelegate(new c67(this, dVar));
            this.e0.setTop(false);
            this.e0.setClipChildren(false);
            this.e0.setClipToPadding(false);
            this.e0.setVisibility(0);
            this.e0.setHint(jb6.M0(2131754440, null));
            this.e0.setBubbleOffset(gm.L(-25.0f));
            this.e0.setMiniBubblesOffset(gm.L(2.0f));
            this.G.addView(this.d0, qoe.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.d0.addView(this.e0, qoe.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.e0.setScaleY(0.4f);
            this.e0.setScaleX(0.4f);
            this.e0.setAlpha(0.0f);
            TLRPC.messages_AvailableEffects messages_availableeffects = oc7.r1(i).X4;
            if (messages_availableeffects != null && !messages_availableeffects.effects.isEmpty()) {
                u();
            } else {
                nm7.f(i).b(this, nm7.w3);
            }
            b67 b67Var = this.e0;
            if (b67Var != null && !b67Var.h1) {
                b67Var.h1 = true;
                b67Var.i1 = true;
                x53 x53Var = b67Var.y0;
                if (x53Var != null && (t53Var = x53Var.m) != null && !t53Var.M1) {
                    t53Var.M1 = true;
                    t53Var.N1 = true;
                    ty9 ty9Var = t53Var.i0;
                    if (ty9Var != null) {
                        ty9Var.invalidate();
                    }
                    jy9 jy9Var = t53Var.j0;
                    if (jy9Var != null) {
                        jy9Var.invalidate();
                    }
                }
            }
            new mx5(this.F, false, new sk3(this, (byte) 29));
        }
    }

    public final void b(int[] iArr) {
        ry ryVar = this.n0;
        if (ryVar != null) {
            int[] iArr2 = (int[]) ryVar.c;
            ykc ykcVar = (ykc) ryVar.d;
            if (!ryVar.b || (!ykcVar.q3 && ykcVar.isAttachedToWindow() && !ykcVar.l0.isEmpty())) {
                int[] iArr3 = ykcVar.r3;
                RectF rectF = ykcVar.l0;
                ykcVar.getLocationOnScreen(iArr3);
                iArr2[0] = (int) (rectF.centerX() + iArr3[0]);
                iArr2[1] = (int) (rectF.centerY() + iArr3[1]);
                ryVar.b = true;
            }
            int i = iArr2[0];
            int[] iArr4 = this.o0;
            iArr4[0] = i;
            iArr4[1] = iArr2[1];
            iArr[0] = gm.L(22.0f) + ((i - this.W.l()) - gm.L(6.0f));
            iArr[1] = gm.L(22.0f) + (iArr4[1] - this.W.getHeight());
            return;
        }
        this.W.getLocationOnScreen(iArr);
        iArr[0] = b10.z(6.0f, this.W.getWidth() - this.W.l(), iArr[0]);
    }

    public final void c(Runnable runnable, boolean z) {
        boolean z2;
        b67 b67Var;
        ViewGroup viewGroup;
        ValueAnimator valueAnimator = this.z0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z && (viewGroup = this.Z) != null && (viewGroup instanceof ActionBarPopupWindow$ActionBarPopupWindowLayout)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            m8.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        float f = 0.0f;
        if (!z && (b67Var = this.e0) != null && this.f0) {
            b67Var.b();
            if (this.e0.getReactionsWindow() != null && this.e0.getReactionsWindow().a != null) {
                this.e0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.e0.animate().alpha(0.01f).translationY(-gm.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
        }
        this.w = true;
        this.s = !z;
        this.K.invalidate();
        this.x = true;
        this.y = true;
        float f2 = this.E;
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.z0 = ofFloat;
        ofFloat.addUpdateListener(new d30((byte) 6, this, z2));
        this.z0.addListener(new w5(this, z, z2, runnable));
        this.z0.setInterpolator(d53.h);
        this.z0.setDuration(350L);
        this.z0.start();
    }

    public final void d(k47 k47Var) {
        f47 j = j(k47Var);
        if (j != null) {
            j.a();
            ArrayList arrayList = j.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                e((k47) obj);
            }
            return;
        }
        e(k47Var);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i == nm7.w3 && (messages_availableeffects = oc7.r1(this.c).X4) != null && !messages_availableeffects.effects.isEmpty()) {
            u();
        }
    }

    @Override
    public final void dismiss() {
        if (this.u0) {
            return;
        }
        this.u0 = true;
        a67 a67Var = this.X;
        if (a67Var != null) {
            a67Var.invalidate();
        }
        xz1 xz1Var = this.W;
        if (xz1Var != null) {
            xz1Var.invalidate();
        }
        c(new u57(this, (byte) 2), false);
        this.F.invalidate();
        nm7.f(this.c).n(this, nm7.w3);
    }

    public final void e(k47 k47Var) {
        rc2 rc2Var;
        f67 f67Var = this.K;
        if (f67Var == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < f67Var.getChildCount()) {
                View childAt = f67Var.getChildAt(i2);
                if (childAt instanceof rc2) {
                    rc2Var = (rc2) childAt;
                    if (rc2Var.getMessageObject() == k47Var) {
                        break;
                    }
                }
                i2++;
            } else {
                rc2Var = null;
                break;
            }
        }
        rc2 rc2Var2 = rc2Var;
        int i3 = -1;
        while (true) {
            ArrayList arrayList = this.N;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) == k47Var) {
                i3 = (arrayList.size() - 1) - i;
            }
            i++;
        }
        if (rc2Var2 == null) {
            f67Var.getAdapter().g(i3);
            return;
        }
        k47Var.M1 = true;
        rc2Var2.z3(k47Var, rc2Var2.getCurrentMessagesGroup(), rc2Var2.K2(), rc2Var2.L2(), rc2Var2.C2(), false);
        f67Var.getAdapter().g(i3);
    }

    public final void f(boolean z) {
        this.r = z;
        dismiss();
    }

    public final void g() {
        if (this.u0) {
            return;
        }
        this.u0 = true;
        qna.f(false);
        qna qnaVar = this.i0;
        if (qnaVar != null) {
            qnaVar.b(this.F);
        }
        super.dismiss();
        nm7.f(this.c).n(this, nm7.w3);
    }

    public final void h(float f, float f2, float f3, float f4, Canvas canvas) {
        if (this.C0 != null && this.D0 != null) {
            float f5 = (f + f3) / 2.0f;
            float f6 = (f2 + f4) / 2.0f;
            float L = gm.L(28.0f) + this.C0.c;
            RectF rectF = gm.P;
            float f7 = L / 2.0f;
            float f8 = f5 - f7;
            float L2 = gm.L(32.0f) / 2.0f;
            rectF.set(f8, f6 - L2, f5 + f7, f6 + L2);
            canvas.save();
            canvas.drawRoundRect(rectF, L2, L2, this.D0);
            this.C0.c(f8 + gm.L(14.0f), f6, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long i() {
        k47 messageObject;
        if (!this.q0 && this.e0 != null) {
            if (this.l0 != null) {
                this.q0 = true;
                return this.I;
            }
            rc2 rc2Var = this.Q;
            if (rc2Var != null && (messageObject = rc2Var.getMessageObject()) != null) {
                TLRPC.Message message = messageObject.k;
                if ((message.flags2 & 4) != 0) {
                    this.q0 = true;
                    return message.effect;
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }

    @Override
    public final boolean isShowing() {
        return !this.u0;
    }

    public final f47 j(k47 k47Var) {
        if (k47Var.c1() != 0) {
            f47 f47Var = (f47) this.P.f(k47Var.c1());
            if (f47Var == null || (f47Var.d.size() > 1 && f47Var.d(k47Var) != null)) {
                return f47Var;
            }
            return null;
        }
        return null;
    }

    public final void k() {
        super.dismiss();
    }

    public final void l() {
        super.dismiss();
    }

    public final void n(boolean z) {
        s37 s37Var;
        int i;
        f67 f67Var = this.K;
        if (f67Var != null && f67Var.getAdapter() != null && (s37Var = this.M) != null) {
            int b = f67Var.getAdapter().b();
            if (z) {
                if (b > 10) {
                    i = b % 10;
                } else {
                    i = 0;
                }
            } else {
                i = b - 1;
            }
            s37Var.h1(i, gm.L(12.0f), z);
            this.A0 = z;
        }
    }

    public final void o(boolean z, float f) {
        ry ryVar = this.n0;
        if (ryVar != null) {
            ykc ykcVar = (ykc) ryVar.d;
            ykcVar.q3 = z;
            ykcVar.invalidate();
            return;
        }
        xz1 xz1Var = this.W;
        if (xz1Var != null) {
            if (z) {
                f = 0.0f;
            }
            xz1Var.setAlpha(f);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.b0) {
            gm.t1(getCurrentFocus());
            this.b0 = false;
            return;
        }
        b67 b67Var = this.e0;
        if (b67Var != null && b67Var.getReactionsWindow() != null) {
            if (!this.e0.getReactionsWindow().C) {
                this.e0.getReactionsWindow().d();
                return;
            }
            return;
        }
        this.q0 = true;
        super.onBackPressed();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        y57 y57Var = this.F;
        setContentView(y57Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        y57Var.setSystemUiVisibility(256);
        gm.j3(y57Var, !cmb.I.o());
    }

    public final void p(long j) {
        int i;
        k47 k47Var;
        TLRPC.TL_availableEffect Y0;
        this.I = j;
        boolean i2 = this.P.i();
        ArrayList arrayList = this.N;
        if (!i2 && arrayList.size() >= 10) {
            i = arrayList.size() % 10;
        } else {
            i = 0;
        }
        if (i >= 0 && i < arrayList.size()) {
            k47Var = (k47) arrayList.get(i);
        } else {
            k47Var = null;
        }
        if (k47Var != null) {
            TLRPC.Message message = k47Var.k;
            message.flags2 |= 4;
            message.effect = j;
        }
        if (this.e0 != null && (Y0 = oc7.r1(this.c).Y0(j)) != null) {
            this.e0.setSelectedReactionAnimated(k39.e(Y0));
        }
    }

    public final void q(bu5 bu5Var) {
        int i = cmb.D8;
        ylb ylbVar = this.b;
        bu5Var.U(cmb.p1(0.06f, cmb.v0(i, ylbVar)));
        bu5Var.R(this.k0, qqd.k(ylbVar), false);
        ViewGroup viewGroup = bu5Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, qoe.c(-2.0f, -2));
    }

    public final void r(ArrayList arrayList) {
        vh6 vh6Var;
        rc2 rc2Var;
        int i;
        int i2;
        rc2 rc2Var2;
        ArrayList arrayList2;
        f47 f47Var;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = arrayList.size();
            vh6Var = this.P;
            if (i4 >= size) {
                break;
            }
            k47 k47Var = (k47) arrayList.get(i4);
            if (k47Var.z2()) {
                f47 f47Var2 = (f47) vh6Var.f(k47Var.d1());
                if (f47Var2 == null) {
                    f47Var2 = new f47();
                    f47Var2.n = false;
                    long c1 = k47Var.c1();
                    f47Var2.a = c1;
                    vh6Var.k(f47Var2, c1);
                }
                ArrayList arrayList3 = f47Var2.d;
                if (f47Var2.d(k47Var) == null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < arrayList3.size()) {
                            if (((k47) arrayList3.get(i5)).e1() != k47Var.e1()) {
                                i5++;
                            }
                        } else {
                            arrayList3.add(k47Var);
                            break;
                        }
                    }
                }
            } else if (k47Var.d1() != 0) {
                k47Var.k.grouped_id = 0L;
                k47Var.e = 0L;
            }
            i4++;
        }
        for (int i6 = 0; i6 < vh6Var.m(); i6++) {
            ((f47) vh6Var.n(i6)).a();
        }
        ArrayList arrayList4 = this.N;
        arrayList4.addAll(arrayList);
        int i7 = 0;
        while (i7 < arrayList4.size()) {
            int i8 = this.O;
            k47 k47Var2 = (k47) arrayList4.get(i7);
            if (getContext() == null) {
                i = i7;
                i2 = 0;
            } else {
                rc2 rc2Var3 = this.B0;
                if (rc2Var3 == null) {
                    rc2 rc2Var4 = new rc2(getContext(), this.c, true, null, this.b);
                    this.B0 = rc2Var4;
                    rc2Var = rc2Var4;
                } else {
                    rc2Var = rc2Var3;
                }
                rc2Var.f6 = false;
                rc2Var.h6 = false;
                rc2Var.i6 = false;
                rc2Var.j6 = false;
                rc2Var.k6 = false;
                f47 f47Var3 = (f47) vh6Var.f(k47Var2.c1());
                mm mmVar = rc2Var.U0;
                mmVar.p0 = true;
                ImageReceiver imageReceiver = rc2Var.A7;
                imageReceiver.p0 = true;
                ImageReceiver imageReceiver2 = rc2Var.T7;
                imageReceiver2.p0 = true;
                ImageReceiver imageReceiver3 = rc2Var.F7;
                imageReceiver3.p0 = true;
                if (f47Var3 != null) {
                    ArrayList arrayList5 = f47Var3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != f47Var3.f.size()) {
                            f47Var3.a();
                        }
                        rc2Var.td = 0;
                        int i9 = 0;
                        i2 = 0;
                        while (i9 < arrayList5.size()) {
                            k47 k47Var3 = (k47) arrayList5.get(i9);
                            c47 d = f47Var3.d(k47Var3);
                            if (d != null && (d.l & 4) != 0) {
                                rc2 rc2Var5 = rc2Var;
                                arrayList2 = arrayList5;
                                f47Var = f47Var3;
                                rc2Var5.y3(k47Var3, f47Var, false, false, false, false);
                                rc2Var2 = rc2Var5;
                                i2 += rc2Var2.b7;
                            } else {
                                f47 f47Var4 = f47Var3;
                                rc2Var2 = rc2Var;
                                arrayList2 = arrayList5;
                                f47Var = f47Var4;
                            }
                            i9++;
                            f47 f47Var5 = f47Var;
                            arrayList5 = arrayList2;
                            rc2Var = rc2Var2;
                            f47Var3 = f47Var5;
                        }
                        i = i7;
                    }
                }
                i = i7;
                rc2Var.y3(k47Var2, f47Var3, false, false, false, false);
                mmVar.p0 = false;
                imageReceiver.p0 = false;
                imageReceiver2.p0 = false;
                imageReceiver3.p0 = false;
                rc2Var.S3();
                i2 = rc2Var.b7;
            }
            this.O = Math.max(i8, i2);
            i7 = i + 1;
        }
        f67 f67Var = this.K;
        f67Var.getAdapter().f();
        int b = f67Var.getAdapter().b();
        if (b > 10) {
            i3 = b % 10;
        }
        this.M.h1(i3, gm.L(12.0f), true);
    }

    public final xz1 s(xz1 xz1Var, boolean z, View.OnClickListener onClickListener) {
        this.W = xz1Var;
        a67 a67Var = new a67(this, getContext(), xz1Var.d, this.b, xz1Var, z);
        this.X = a67Var;
        a67Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        xz1 xz1Var2 = this.W;
        a67 a67Var2 = this.X;
        a67Var2.H = xz1Var2.H;
        a67Var2.s0 = xz1Var2.s0;
        a67Var2.f0.t(xz1Var2.f0.i, false, true);
        a67Var2.g0 = xz1Var2.g0;
        a67Var2.setEmoji(xz1Var2.n.f[0]);
        a67Var2.i(xz1Var2.x, xz1Var2.w, true);
        a67Var2.S.e(true, xz1Var2.S.c);
        a67Var2.F.e(true, xz1Var2.F.c);
        int i = xz1Var2.L;
        int i2 = xz1Var2.M;
        a67Var2.L = i;
        a67Var2.M = i2;
        float f = xz1Var2.P;
        float f2 = xz1Var2.Q;
        a67Var2.P = f;
        a67Var2.Q = f2;
        this.X.S.e(true, xz1Var.S.c);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(xz1Var.getWidth(), xz1Var.getHeight()));
        xz1 xz1Var3 = this.W;
        xz1Var.getHeight();
        this.Y = xz1Var3.m();
        b(this.r0);
        return this.X;
    }

    @Override
    public final void show() {
        if (!gm.K1(getContext())) {
            return;
        }
        qna.f(true);
        super.show();
        final float alpha = this.W.getAlpha();
        o(true, alpha);
        vs9.d(new jac() {
            @Override
            public final void a(Object obj, Object obj2) {
                j67 j67Var = j67.this;
                j67Var.o(false, alpha);
                j67Var.e = (Bitmap) obj;
                Paint paint = new Paint(1);
                j67Var.h = paint;
                Bitmap bitmap = j67Var.e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                j67Var.f = bitmapShader;
                paint.setShader(bitmapShader);
                j67Var.n = new Matrix();
                jz4 jz4Var = j67Var.j0;
                jz4Var.a((Bitmap) obj2);
                tl0.c(jz4Var, j67Var.F);
                ViewGroup viewGroup = j67Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        y57 y57Var = this.H;
        if (y57Var != null) {
            y57Var.bringToFront();
        }
        c(null, true);
    }

    public final void t(long j) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        uib uibVar = null;
        if (i > 0) {
            uibVar = new uib(nxa.b1(false, jb6.H(',', "UnlockPaidContent", (int) j), 0.7f, null), 14.0f, gm.o());
        }
        this.C0 = uibVar;
        if (this.D0 == null) {
            Paint paint = new Paint(1);
            this.D0 = paint;
            paint.setColor(1073741824);
        }
        this.K.invalidate();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.N;
            if (i2 < arrayList.size()) {
                k47 k47Var = (k47) arrayList.get(i2);
                if (k47Var != null && (message = k47Var.k) != null && (messageMedia = message.media) != null) {
                    if (i > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    messageMedia.spoiler = z;
                }
                i2++;
            } else {
                this.L.f();
                return;
            }
        }
    }

    public final void u() {
        if (this.f0) {
            return;
        }
        this.g0 = false;
        this.f0 = true;
        this.e0.m(null, null, true);
        this.e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(d53.h).start();
        this.e0.p(false);
    }

    public void m(long j) {
    }
}
