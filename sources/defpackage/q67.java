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
import org.telegram.ui.ActionBar.e;
public class q67 extends Dialog implements fn7 {
    public boolean A0;
    public wb2 B0;
    public pkb C0;
    public Paint D0;
    public float E;
    public final f67 F;
    public final l67 G;
    public final f67 H;
    public long I;
    public ul J;
    public final m67 K;
    public final cl2 L;
    public final z37 M;
    public final ArrayList N;
    public int O;
    public final zh6 P;
    public wb2 Q;
    public int R;
    public tx1 S;
    public final Paint T;
    public c U;
    public jw1 V;
    public bz1 W;
    public h67 X;
    public int Y;
    public ViewGroup Z;
    public final Context a;
    public final g67 a0;
    public final vnb b;
    public boolean b0;
    public final int c;
    public float c0;
    public mq5 d;
    public FrameLayout d0;
    public Bitmap e;
    public i67 e0;
    public BitmapShader f;
    public boolean f0;
    public boolean g0;
    public Paint h;
    public boolean h0;
    public final mpa i0;
    public final nz4 j0;
    public final ll0 k0;
    public RectF l0;
    public vh4 m0;
    public Matrix n;
    public rx n0;
    public final int[] o0;
    public boolean p0;
    public boolean q0;
    public boolean r;
    public final int[] r0;
    public boolean s;
    public final float[] s0;
    public boolean t0;
    public boolean u0;
    public wb2 v0;
    public boolean w;
    public float w0;
    public boolean x;
    public float x0;
    public boolean y;
    public final Rect y0;
    public ValueAnimator z0;

    public q67(Context context, vnb vnbVar) {
        super(context, 2131755352);
        int i = yac.t0;
        this.c = i;
        this.d = mq5.e;
        this.N = new ArrayList();
        this.P = new zh6();
        this.T = new Paint(1);
        this.o0 = new int[2];
        this.r0 = new int[2];
        this.s0 = new float[4];
        this.u0 = false;
        this.y0 = new Rect();
        this.a = context;
        this.b = vnbVar;
        hl.S(getWindow());
        f67 f67Var = new f67(this, context, (byte) 1);
        this.F = f67Var;
        this.i0 = mpa.d(1, f67Var, f67Var);
        f67Var.setOnClickListener(new View.OnClickListener(this) {
            public final q67 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                q67 q67Var = this.b;
                switch (b) {
                    case 0:
                        q67Var.onBackPressed();
                        return;
                    default:
                        q67Var.onBackPressed();
                        return;
                }
            }
        });
        f67Var.getViewTreeObserver().addOnGlobalFocusChangeListener(new o72(this, (byte) 1));
        nz4 nz4Var = new nz4();
        this.j0 = nz4Var;
        ll0 ll0Var = new ll0(nz4Var, nz4Var, nz4Var);
        this.k0 = ll0Var;
        ll0Var.h = new yic(f67Var);
        ll0Var.i = f67Var;
        l67 l67Var = new l67(this, context, vnbVar);
        this.G = l67Var;
        l67Var.setClipToPadding(false);
        f67Var.addView(l67Var, tre.e(-1, -1, 119));
        aj3 aj3Var = new aj3(this, (byte) 21);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(f67Var, aj3Var);
        m67 m67Var = new m67(this, context, vnbVar);
        this.K = m67Var;
        m67Var.setOnClickListener(new View.OnClickListener(this) {
            public final q67 b;

            {
                this.b = this;
            }

            @Override
            public final void onClick(View view) {
                byte b = r2;
                q67 q67Var = this.b;
                switch (b) {
                    case 0:
                        q67Var.onBackPressed();
                        return;
                    default:
                        q67Var.onBackPressed();
                        return;
                }
            }
        });
        m67Var.setOnItemClickListener(new zg4(this, (byte) 12));
        m67Var.setOnScrollListener(new to2(this, (byte) 26));
        m67Var.setItemAnimator(new bb2(null, m67Var, vnbVar));
        z37 z37Var = new z37(this, (byte) 2);
        this.M = z37Var;
        z37Var.O = new ar1(this, (byte) 10);
        m67Var.setLayoutManager(z37Var);
        m67Var.i(new br1((byte) 10));
        cl2 cl2Var = new cl2(this, context, vnbVar, (byte) 1);
        this.L = cl2Var;
        m67Var.setAdapter(cl2Var);
        m67Var.setVerticalScrollBarEnabled(false);
        m67Var.setOverScrollMode(2);
        l67Var.addView(m67Var, tre.c(-2.0f, -1));
        f67 f67Var2 = new f67(this, context, (byte) 0);
        this.H = f67Var2;
        f67Var.addView(f67Var2, tre.c(-1.0f, -1));
        this.a0 = new g67(this, f67Var2, i);
    }

    public final void a(e eVar) {
        a53 a53Var;
        if (this.e0 == null && eVar != null) {
            int i = this.c;
            uc7.s1(i).E0();
            FrameLayout frameLayout = new FrameLayout(this.a);
            this.d0 = frameLayout;
            frameLayout.setClipChildren(false);
            this.d0.setClipToPadding(false);
            this.d0.setPadding(0, 0, 0, hl.L(24.0f));
            ?? i49Var = new i49(5, this.c, this.b, getContext(), null);
            this.e0 = i49Var;
            i49Var.setClipChildren(false);
            this.e0.setClipToPadding(false);
            this.e0.setPadding(hl.L(4.0f), hl.L(22.0f), hl.L(4.0f), hl.L(22.0f));
            this.e0.setDelegate(new j67(this, eVar));
            this.e0.setTop(false);
            this.e0.setClipChildren(false);
            this.e0.setClipToPadding(false);
            this.e0.setVisibility(0);
            this.e0.setHint(ob6.M0(2131754436, null));
            this.e0.setBubbleOffset(hl.L(-25.0f));
            this.e0.setMiniBubblesOffset(hl.L(2.0f));
            this.G.addView(this.d0, tre.d(-2, 300.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            this.d0.addView(this.e0, tre.d(-1, 116.0f, 83, 0.0f, 0.0f, 0.0f, 0.0f));
            this.e0.setScaleY(0.4f);
            this.e0.setScaleX(0.4f);
            this.e0.setAlpha(0.0f);
            TLRPC.messages_AvailableEffects messages_availableeffects = uc7.s1(i).X4;
            if (messages_availableeffects != null && !messages_availableeffects.effects.isEmpty()) {
                u();
            } else {
                jn7.f(i).b(this, jn7.w3);
            }
            i67 i67Var = this.e0;
            if (i67Var != null && !i67Var.h1) {
                i67Var.h1 = true;
                i67Var.i1 = true;
                e53 e53Var = i67Var.y0;
                if (e53Var != null && (a53Var = e53Var.m) != null && !a53Var.M1) {
                    a53Var.M1 = true;
                    a53Var.N1 = true;
                    k0a k0aVar = a53Var.i0;
                    if (k0aVar != null) {
                        k0aVar.invalidate();
                    }
                    a0a a0aVar = a53Var.j0;
                    if (a0aVar != null) {
                        a0aVar.invalidate();
                    }
                }
            }
            new rx5(this.F, false, new zj3(this, (byte) 29));
        }
    }

    public final void b(int[] iArr) {
        rx rxVar = this.n0;
        if (rxVar != null) {
            int[] iArr2 = (int[]) rxVar.c;
            knc kncVar = (knc) rxVar.d;
            if (!rxVar.b || (!kncVar.H3 && kncVar.isAttachedToWindow() && !kncVar.l0.isEmpty())) {
                int[] iArr3 = kncVar.I3;
                RectF rectF = kncVar.l0;
                kncVar.getLocationOnScreen(iArr3);
                iArr2[0] = (int) (rectF.centerX() + iArr3[0]);
                iArr2[1] = (int) (rectF.centerY() + iArr3[1]);
                rxVar.b = true;
            }
            int i = iArr2[0];
            int[] iArr4 = this.o0;
            iArr4[0] = i;
            iArr4[1] = iArr2[1];
            iArr[0] = hl.L(22.0f) + ((i - this.W.l()) - hl.L(6.0f));
            iArr[1] = hl.L(22.0f) + (iArr4[1] - this.W.getHeight());
            return;
        }
        this.W.getLocationOnScreen(iArr);
        iArr[0] = c00.A(6.0f, this.W.getWidth() - this.W.l(), iArr[0]);
    }

    public final void c(Runnable runnable, boolean z) {
        boolean z2;
        i67 i67Var;
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
            n8.i((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.Z);
        }
        float f = 0.0f;
        if (!z && (i67Var = this.e0) != null && this.f0) {
            i67Var.b();
            if (this.e0.getReactionsWindow() != null && this.e0.getReactionsWindow().a != null) {
                this.e0.getReactionsWindow().a.animate().alpha(0.0f).setDuration(180L).start();
            }
            this.e0.animate().alpha(0.01f).translationY(-hl.L(12.0f)).scaleX(0.6f).scaleY(0.6f).setDuration(180L).start();
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
        ofFloat.addUpdateListener(new e20((byte) 6, this, z2));
        this.z0.addListener(new x5(this, z, z2, runnable));
        this.z0.setInterpolator(k43.h);
        this.z0.setDuration(350L);
        this.z0.start();
    }

    public final void d(r47 r47Var) {
        m47 j = j(r47Var);
        if (j != null) {
            j.a();
            ArrayList arrayList = j.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                e((r47) obj);
            }
            return;
        }
        e(r47Var);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.messages_AvailableEffects messages_availableeffects;
        if (i == jn7.w3 && (messages_availableeffects = uc7.s1(this.c).X4) != null && !messages_availableeffects.effects.isEmpty()) {
            u();
        }
    }

    @Override
    public final void dismiss() {
        if (this.u0) {
            return;
        }
        this.u0 = true;
        h67 h67Var = this.X;
        if (h67Var != null) {
            h67Var.invalidate();
        }
        bz1 bz1Var = this.W;
        if (bz1Var != null) {
            bz1Var.invalidate();
        }
        c(new b67(this, (byte) 2), false);
        this.F.invalidate();
        jn7.f(this.c).n(this, jn7.w3);
    }

    public final void e(r47 r47Var) {
        wb2 wb2Var;
        m67 m67Var = this.K;
        if (m67Var == null) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 < m67Var.getChildCount()) {
                View childAt = m67Var.getChildAt(i2);
                if (childAt instanceof wb2) {
                    wb2Var = (wb2) childAt;
                    if (wb2Var.getMessageObject() == r47Var) {
                        break;
                    }
                }
                i2++;
            } else {
                wb2Var = null;
                break;
            }
        }
        wb2 wb2Var2 = wb2Var;
        int i3 = -1;
        while (true) {
            ArrayList arrayList = this.N;
            if (i >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i) == r47Var) {
                i3 = (arrayList.size() - 1) - i;
            }
            i++;
        }
        if (wb2Var2 == null) {
            m67Var.getAdapter().g(i3);
            return;
        }
        r47Var.M1 = true;
        wb2Var2.z3(r47Var, wb2Var2.getCurrentMessagesGroup(), wb2Var2.K2(), wb2Var2.L2(), wb2Var2.C2(), false);
        m67Var.getAdapter().g(i3);
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
        mpa.f(false);
        mpa mpaVar = this.i0;
        if (mpaVar != null) {
            mpaVar.b(this.F);
        }
        super.dismiss();
        jn7.f(this.c).n(this, jn7.w3);
    }

    public final void h(float f, float f2, float f3, float f4, Canvas canvas) {
        if (this.C0 != null && this.D0 != null) {
            float f5 = (f + f3) / 2.0f;
            float f6 = (f2 + f4) / 2.0f;
            float L = hl.L(28.0f) + this.C0.c;
            RectF rectF = hl.P;
            float f7 = L / 2.0f;
            float f8 = f5 - f7;
            float L2 = hl.L(32.0f) / 2.0f;
            rectF.set(f8, f6 - L2, f5 + f7, f6 + L2);
            canvas.save();
            canvas.drawRoundRect(rectF, L2, L2, this.D0);
            this.C0.c(f8 + hl.L(14.0f), f6, 1.0f, -1, canvas);
            canvas.restore();
        }
    }

    public final long i() {
        r47 messageObject;
        if (!this.q0 && this.e0 != null) {
            if (this.l0 != null) {
                this.q0 = true;
                return this.I;
            }
            wb2 wb2Var = this.Q;
            if (wb2Var != null && (messageObject = wb2Var.getMessageObject()) != null) {
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

    public final m47 j(r47 r47Var) {
        if (r47Var.c1() != 0) {
            m47 m47Var = (m47) this.P.f(r47Var.c1());
            if (m47Var == null || (m47Var.d.size() > 1 && m47Var.d(r47Var) != null)) {
                return m47Var;
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
        z37 z37Var;
        int i;
        m67 m67Var = this.K;
        if (m67Var != null && m67Var.getAdapter() != null && (z37Var = this.M) != null) {
            int b = m67Var.getAdapter().b();
            if (z) {
                if (b > 10) {
                    i = b % 10;
                } else {
                    i = 0;
                }
            } else {
                i = b - 1;
            }
            z37Var.h1(i, hl.L(12.0f), z);
            this.A0 = z;
        }
    }

    public final void o(boolean z, float f) {
        rx rxVar = this.n0;
        if (rxVar != null) {
            knc kncVar = (knc) rxVar.d;
            kncVar.H3 = z;
            kncVar.invalidate();
            return;
        }
        bz1 bz1Var = this.W;
        if (bz1Var != null) {
            if (z) {
                f = 0.0f;
            }
            bz1Var.setAlpha(f);
        }
    }

    @Override
    public final void onBackPressed() {
        if (this.b0) {
            hl.t1(getCurrentFocus());
            this.b0 = false;
            return;
        }
        i67 i67Var = this.e0;
        if (i67Var != null && i67Var.getReactionsWindow() != null) {
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
        f67 f67Var = this.F;
        setContentView(f67Var, layoutParams);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        attributes.softInputMode = 16;
        attributes.flags = (attributes.flags & (-3)) | (-1945959040);
        window.setAttributes(attributes);
        f67Var.setSystemUiVisibility(256);
        hl.j3(f67Var, !aob.I.o());
    }

    public final void p(long j) {
        int i;
        r47 r47Var;
        TLRPC.TL_availableEffect Z0;
        this.I = j;
        boolean i2 = this.P.i();
        ArrayList arrayList = this.N;
        if (!i2 && arrayList.size() >= 10) {
            i = arrayList.size() % 10;
        } else {
            i = 0;
        }
        if (i >= 0 && i < arrayList.size()) {
            r47Var = (r47) arrayList.get(i);
        } else {
            r47Var = null;
        }
        if (r47Var != null) {
            TLRPC.Message message = r47Var.k;
            message.flags2 |= 4;
            message.effect = j;
        }
        if (this.e0 != null && (Z0 = uc7.s1(this.c).Z0(j)) != null) {
            this.e0.setSelectedReactionAnimated(w49.e(Z0));
        }
    }

    public final void q(fu5 fu5Var) {
        int i = aob.E8;
        vnb vnbVar = this.b;
        fu5Var.U(aob.p1(0.06f, aob.v0(i, vnbVar)));
        fu5Var.R(this.k0, dtd.k(vnbVar), false);
        ViewGroup viewGroup = fu5Var.A;
        this.Z = viewGroup;
        this.G.addView(viewGroup, tre.c(-2.0f, -2));
    }

    public final void r(ArrayList arrayList) {
        zh6 zh6Var;
        wb2 wb2Var;
        int i;
        int i2;
        wb2 wb2Var2;
        ArrayList arrayList2;
        m47 m47Var;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = arrayList.size();
            zh6Var = this.P;
            if (i4 >= size) {
                break;
            }
            r47 r47Var = (r47) arrayList.get(i4);
            if (r47Var.z2()) {
                m47 m47Var2 = (m47) zh6Var.f(r47Var.d1());
                if (m47Var2 == null) {
                    m47Var2 = new m47();
                    m47Var2.n = false;
                    long c1 = r47Var.c1();
                    m47Var2.a = c1;
                    zh6Var.k(c1, m47Var2);
                }
                ArrayList arrayList3 = m47Var2.d;
                if (m47Var2.d(r47Var) == null) {
                    int i5 = 0;
                    while (true) {
                        if (i5 < arrayList3.size()) {
                            if (((r47) arrayList3.get(i5)).e1() != r47Var.e1()) {
                                i5++;
                            }
                        } else {
                            arrayList3.add(r47Var);
                            break;
                        }
                    }
                }
            } else if (r47Var.d1() != 0) {
                r47Var.k.grouped_id = 0L;
                r47Var.e = 0L;
            }
            i4++;
        }
        for (int i6 = 0; i6 < zh6Var.m(); i6++) {
            ((m47) zh6Var.n(i6)).a();
        }
        ArrayList arrayList4 = this.N;
        arrayList4.addAll(arrayList);
        int i7 = 0;
        while (i7 < arrayList4.size()) {
            int i8 = this.O;
            r47 r47Var2 = (r47) arrayList4.get(i7);
            if (getContext() == null) {
                i = i7;
                i2 = 0;
            } else {
                wb2 wb2Var3 = this.B0;
                if (wb2Var3 == null) {
                    wb2 wb2Var4 = new wb2(getContext(), this.c, true, null, this.b);
                    this.B0 = wb2Var4;
                    wb2Var = wb2Var4;
                } else {
                    wb2Var = wb2Var3;
                }
                wb2Var.f6 = false;
                wb2Var.h6 = false;
                wb2Var.i6 = false;
                wb2Var.j6 = false;
                wb2Var.k6 = false;
                m47 m47Var3 = (m47) zh6Var.f(r47Var2.c1());
                nl nlVar = wb2Var.U0;
                nlVar.p0 = true;
                ImageReceiver imageReceiver = wb2Var.A7;
                imageReceiver.p0 = true;
                ImageReceiver imageReceiver2 = wb2Var.T7;
                imageReceiver2.p0 = true;
                ImageReceiver imageReceiver3 = wb2Var.F7;
                imageReceiver3.p0 = true;
                if (m47Var3 != null) {
                    ArrayList arrayList5 = m47Var3.d;
                    if (arrayList5.size() != 1) {
                        if (arrayList5.size() != m47Var3.f.size()) {
                            m47Var3.a();
                        }
                        wb2Var.td = 0;
                        int i9 = 0;
                        i2 = 0;
                        while (i9 < arrayList5.size()) {
                            r47 r47Var3 = (r47) arrayList5.get(i9);
                            j47 d = m47Var3.d(r47Var3);
                            if (d != null && (d.l & 4) != 0) {
                                wb2 wb2Var5 = wb2Var;
                                arrayList2 = arrayList5;
                                m47Var = m47Var3;
                                wb2Var5.y3(r47Var3, m47Var, false, false, false, false);
                                wb2Var2 = wb2Var5;
                                i2 += wb2Var2.b7;
                            } else {
                                m47 m47Var4 = m47Var3;
                                wb2Var2 = wb2Var;
                                arrayList2 = arrayList5;
                                m47Var = m47Var4;
                            }
                            i9++;
                            m47 m47Var5 = m47Var;
                            arrayList5 = arrayList2;
                            wb2Var = wb2Var2;
                            m47Var3 = m47Var5;
                        }
                        i = i7;
                    }
                }
                i = i7;
                wb2Var.y3(r47Var2, m47Var3, false, false, false, false);
                nlVar.p0 = false;
                imageReceiver.p0 = false;
                imageReceiver2.p0 = false;
                imageReceiver3.p0 = false;
                wb2Var.S3();
                i2 = wb2Var.b7;
            }
            this.O = Math.max(i8, i2);
            i7 = i + 1;
        }
        m67 m67Var = this.K;
        m67Var.getAdapter().f();
        int b = m67Var.getAdapter().b();
        if (b > 10) {
            i3 = b % 10;
        }
        this.M.h1(i3, hl.L(12.0f), true);
    }

    public final bz1 s(bz1 bz1Var, boolean z, View.OnClickListener onClickListener) {
        this.W = bz1Var;
        h67 h67Var = new h67(this, getContext(), bz1Var.d, this.b, bz1Var, z);
        this.X = h67Var;
        h67Var.setScaleX(this.W.getScaleX());
        this.X.setScaleY(this.W.getScaleY());
        bz1 bz1Var2 = this.W;
        h67 h67Var2 = this.X;
        h67Var2.H = bz1Var2.H;
        h67Var2.t0 = bz1Var2.t0;
        h67Var2.f0.t(bz1Var2.f0.i, false, true);
        h67Var2.g0 = bz1Var2.g0;
        h67Var2.setEmoji(bz1Var2.n.f[0]);
        h67Var2.i(bz1Var2.x, bz1Var2.w, true);
        h67Var2.S.e(true, bz1Var2.S.c);
        h67Var2.F.e(true, bz1Var2.F.c);
        int i = bz1Var2.L;
        int i2 = bz1Var2.M;
        h67Var2.L = i;
        h67Var2.M = i2;
        float f = bz1Var2.P;
        float f2 = bz1Var2.Q;
        h67Var2.P = f;
        h67Var2.Q = f2;
        this.X.S.e(true, bz1Var.S.c);
        this.X.setOnClickListener(onClickListener);
        this.G.addView(this.X, new ViewGroup.LayoutParams(bz1Var.getWidth(), bz1Var.getHeight()));
        bz1 bz1Var3 = this.W;
        bz1Var.getHeight();
        this.Y = bz1Var3.m();
        b(this.r0);
        return this.X;
    }

    @Override
    public final void show() {
        if (!hl.K1(getContext())) {
            return;
        }
        mpa.f(true);
        super.show();
        final float alpha = this.W.getAlpha();
        o(true, alpha);
        mu9.d(new icc() {
            @Override
            public final void a(Object obj, Object obj2) {
                q67 q67Var = q67.this;
                q67Var.o(false, alpha);
                q67Var.e = (Bitmap) obj;
                Paint paint = new Paint(1);
                q67Var.h = paint;
                Bitmap bitmap = q67Var.e;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
                q67Var.f = bitmapShader;
                paint.setShader(bitmapShader);
                q67Var.n = new Matrix();
                nz4 nz4Var = q67Var.j0;
                nz4Var.a((Bitmap) obj2);
                uk0.c(nz4Var, q67Var.F);
                ViewGroup viewGroup = q67Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
        });
        f67 f67Var = this.H;
        if (f67Var != null) {
            f67Var.bringToFront();
        }
        c(null, true);
    }

    public final void t(long j) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        pkb pkbVar = null;
        if (i > 0) {
            pkbVar = new pkb(nza.b1(false, ob6.H(',', "UnlockPaidContent", (int) j), 0.7f, null), 14.0f, hl.o());
        }
        this.C0 = pkbVar;
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
                r47 r47Var = (r47) arrayList.get(i2);
                if (r47Var != null && (message = r47Var.k) != null && (messageMedia = message.media) != null) {
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
        this.e0.animate().scaleY(1.0f).scaleX(1.0f).alpha(1.0f).setDuration(420L).setInterpolator(k43.h).start();
        this.e0.p(false);
    }

    public void m(long j) {
    }
}
