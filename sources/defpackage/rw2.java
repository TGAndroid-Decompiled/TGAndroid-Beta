package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class rw2 {
    public static TextPaint f0;
    public static volatile rw2 g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public qx7 C;
    public Path D;
    public boolean E;
    public float F;
    public StaticLayout G;
    public long H;
    public int I;
    public Drawable J;
    public boolean K;
    public ActionBarPopupWindow$ActionBarPopupWindowLayout L;
    public float M;
    public final Paint N;
    public nk8 O;
    public d21 P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final nw2 U;
    public int V;
    public TLRPC.Document W;
    public k7a X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public vnb c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public gp6 j;
    public n8 k;
    public pw2 l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final nz4 s;
    public final ll0 t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public zc y;
    public tt z;
    public float e = 0.0f;
    public mq5 q = mq5.e;

    public rw2() {
        nz4 nz4Var = new nz4();
        this.s = nz4Var;
        this.t = new ll0(nz4Var, nz4Var, nz4Var);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = hl.L(200.0f);
        this.N = new Paint(1);
        this.U = new nw2(this);
    }

    public static rw2 e() {
        rw2 rw2Var;
        rw2 rw2Var2 = g0;
        if (rw2Var2 == null) {
            synchronized (PhotoViewer.class) {
                rw2Var = g0;
                if (rw2Var == null) {
                    rw2Var = new rw2();
                    g0 = rw2Var;
                }
            }
            return rw2Var;
        }
        return rw2Var2;
    }

    public final boolean a(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        boolean z;
        boolean z2;
        boolean z3;
        float f;
        int i;
        float f2;
        int i2;
        String str;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2;
        r59 r59Var;
        String str2;
        r59 r59Var2;
        e eVar;
        pw2 pw2Var = this.l;
        if (pw2Var != null) {
            TLRPC.TL_messageMediaPoll d = pw2Var.d();
            TLRPC.PollAnswer g = this.l.g();
            if (d != null && d.poll != null && g != null) {
                TLRPC.PollAnswerVoters E1 = r47.E1(d, g.option);
                if (E1 != null && E1.voters > 0 && r47.A(d)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!r47.V4(d) && !d.poll.closed && !this.l.c()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && r47.D(d)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z) {
                    r59 r59Var3 = new r59(this.r, this.c0, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
                    fu5 fu5Var = new fu5(actionBarPopupWindow$ActionBarPopupWindowLayout, this.c0);
                    View view = fu5Var.B;
                    int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
                    int i3 = aob.E8;
                    fu5Var.U(aob.p1(0.06f, aob.v0(i3, this.c0)));
                    ol0 k = dtd.k(this.c0);
                    if (view != null) {
                        r59Var = r59Var3;
                        str2 = null;
                        jl0 c = this.t.c(view, null, true);
                        c.p(k);
                        view.setBackground(c);
                    } else {
                        r59Var = r59Var3;
                        str2 = null;
                    }
                    fu5Var.b(2131231243, ob6.M0(2131753749, str2), new fw2(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 0), false);
                    fu5Var.j();
                    r47 x = this.l.x();
                    Activity activity = this.w;
                    if ((activity instanceof LaunchActivity) && x != null) {
                        LaunchActivity launchActivity = (LaunchActivity) activity;
                        if (launchActivity.N() != null && launchActivity.N().getLastFragment() != null) {
                            eVar = launchActivity.N().getLastFragment();
                        } else {
                            eVar = null;
                        }
                        if (eVar != null) {
                            q9c a = r59Var.a(eVar, r47.B0(x.k), x.e1(), g.option, E1.voters, new rx1(this, eVar, (byte) 11));
                            r59Var2 = r59Var;
                            fu5Var.p(a);
                            r59Var2.setText(ob6.G(E1.voters, "PollVotesCount", new Object[0]));
                            r59Var2.a.d(E1.recent_voters, false);
                            r59Var2.setLayoutParams(tre.o(-1, 48));
                            int i4 = aob.I5;
                            hf0 Y = aob.Y(aob.v0(i4, this.c0), 12, 0);
                            uob M = yob.M(i4);
                            vnb vnbVar = this.c0;
                            r59Var2.setBackground(Y);
                            yob.j(r59Var2, Y, null, M, vnbVar);
                            r59Var2.setOnClickListener(new w0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(r59Var2);
                            View k8Var = new k8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
                            k8Var.setTag(2131296439, 1);
                            f = 0.06f;
                            yob.i(k8Var, yob.K(0.06f, i3), this.c0);
                            i = -1;
                            k8Var.setLayoutParams(tre.o(-1, 8));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k8Var);
                        }
                    }
                    r59Var2 = r59Var;
                    r59Var2.setText(ob6.G(E1.voters, "PollVotesCount", new Object[0]));
                    r59Var2.a.d(E1.recent_voters, false);
                    r59Var2.setLayoutParams(tre.o(-1, 48));
                    int i42 = aob.I5;
                    hf0 Y2 = aob.Y(aob.v0(i42, this.c0), 12, 0);
                    uob M2 = yob.M(i42);
                    vnb vnbVar2 = this.c0;
                    r59Var2.setBackground(Y2);
                    yob.j(r59Var2, Y2, null, M2, vnbVar2);
                    r59Var2.setOnClickListener(new w0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(r59Var2);
                    View k8Var2 = new k8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
                    k8Var2.setTag(2131296439, 1);
                    f = 0.06f;
                    yob.i(k8Var2, yob.K(0.06f, i3), this.c0);
                    i = -1;
                    k8Var2.setLayoutParams(tre.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(k8Var2);
                } else {
                    f = 0.06f;
                    i = -1;
                }
                if (z2) {
                    i2 = i;
                    str = null;
                    f2 = f;
                    s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232362, ob6.M0(2131746883, null), false, this.c0).setOnClickListener(new ew2(this, (byte) 2));
                } else {
                    f2 = f;
                    i2 = i;
                    str = null;
                }
                if (z3) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232419, ob6.M0(2131743479, str), false, this.c0).setOnClickListener(new ew2(this, (byte) 3));
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                }
                if (!z && (z2 || z3)) {
                    View k8Var3 = new k8(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), this.c0);
                    k8Var3.setTag(2131296439, 1);
                    yob.i(k8Var3, yob.K(f2, aob.E8), this.c0);
                    k8Var3.setLayoutParams(tre.o(i2, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(k8Var3);
                }
                if (z || z2 || z3) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void b() {
        if (this.w != null && !this.K) {
            hl.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.z.invalidate();
            this.W = null;
            this.a0 = null;
            this.Y = null;
            this.l = null;
            this.E = false;
            hl.d3(new cw2(this, (byte) 0), 200L);
            nk8 nk8Var = this.O;
            if (nk8Var != null) {
                nk8Var.animate().alpha(0.0f).translationY(hl.L(56.0f)).setDuration(150L).setInterpolator(k43.f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(k43.f).start();
            }
            jn7.e().k(jn7.k1, 8);
        }
    }

    public final void c() {
        e53 reactionsWindow;
        d21 d21Var = this.P;
        if (d21Var != null && (reactionsWindow = d21Var.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        d();
        b();
    }

    public final void d() {
        n8 n8Var = this.k;
        if (n8Var != null) {
            n8Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            ik8.t(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(hl.L(-12.0f)), k43.h, 320L);
            this.L = null;
            this.K = false;
            if (this.R) {
                b();
            }
        }
    }

    public final void f(Bitmap bitmap, Bitmap bitmap2) {
        this.A.v0(true, false);
        this.v = bitmap;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setScale(15.0f, 15.0f);
        bitmapShader.setLocalMatrix(matrix);
        if (Build.VERSION.SDK_INT >= 33) {
            bitmapShader.setFilterMode(2);
        }
        Paint paint = this.N;
        paint.setFilterBitmap(true);
        paint.setShader(bitmapShader);
        nz4 nz4Var = this.s;
        nz4Var.a(bitmap2);
        uk0.c(nz4Var, this.y);
        this.t.d();
        this.e0 = false;
        tt ttVar = this.z;
        if (ttVar != null) {
            ttVar.invalidate();
        }
    }

    public final boolean g(MotionEvent motionEvent, d79 d79Var, pw2 pw2Var, vnb vnbVar) {
        int i;
        this.l = pw2Var;
        if (pw2Var != null) {
            this.m = pw2Var.i();
            this.n = this.l.n();
        }
        pw2 pw2Var2 = this.l;
        if ((pw2Var2 == null || pw2Var2.h()) && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = d79Var.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = d79Var.getChildAt(i2);
                    if (childAt == null) {
                        break;
                    }
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int left = childAt.getLeft();
                    int right = childAt.getRight();
                    if (top <= y && bottom >= y && left <= x && right >= x) {
                        boolean z = childAt instanceof x2b;
                        ImageReceiver imageReceiver = this.A;
                        if (z) {
                            if (((x2b) childAt).a.E()) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else if (childAt instanceof u2b) {
                            if (((u2b) childAt).a.getImageReceiver().n() != null) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else {
                            i = 2;
                            if (childAt instanceof vw2) {
                                vw2 vw2Var = (vw2) childAt;
                                if (vw2Var.a.n() != null) {
                                    byte b = vw2Var.Q;
                                    if (b == 6) {
                                        imageReceiver.q0(0);
                                        i = 0;
                                    } else if (b == 2 && vw2Var.w) {
                                        imageReceiver.q0(hl.L(6.0f));
                                        i = 1;
                                    }
                                }
                                i = -1;
                            } else if (childAt instanceof ey3) {
                                imageReceiver.q0(0);
                            } else if ((childAt instanceof x14) && ((x14) childAt).getSpan() != null) {
                                imageReceiver.q0(0);
                            } else {
                                if ((childAt instanceof yeb) && (((yeb) childAt).b instanceof wl)) {
                                    imageReceiver.q0(0);
                                }
                                i = -1;
                            }
                        }
                        if (i != -1) {
                            this.a = x;
                            this.b = y;
                            this.h = childAt;
                            gp6 gp6Var = new gp6(this, d79Var, i, vnbVar, (byte) 18);
                            this.j = gp6Var;
                            hl.d3(gp6Var, 200L);
                            return true;
                        }
                    } else {
                        i2++;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

    public final boolean h(android.view.MotionEvent r17, defpackage.d79 r18, java.lang.Object r19, defpackage.pw2 r20, defpackage.vnb r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw2.h(android.view.MotionEvent, d79, java.lang.Object, pw2, vnb):boolean");
    }

    public final void i(org.telegram.tgnet.TLRPC.Document r38, defpackage.k7a r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, defpackage.vnb r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rw2.i(org.telegram.tgnet.TLRPC$Document, k7a, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, vnb, int):void");
    }

    public final void j() {
        gp6 gp6Var = this.j;
        if (gp6Var != null) {
            hl.r(gp6Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof x2b) {
                ((x2b) view).setScaled(false);
            } else if (view instanceof u2b) {
                ((u2b) view).setScaled(false);
            } else if (view instanceof vw2) {
                ((vw2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void k(pw2 pw2Var) {
        this.l = pw2Var;
        if (pw2Var != null) {
            this.m = pw2Var.i();
            this.n = this.l.n();
        }
    }

    public final void l(Activity activity) {
        int i = yac.t0;
        this.r = i;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.d = i;
        imageReceiver.m0(Integer.MAX_VALUE);
        int i2 = this.r;
        ImageReceiver imageReceiver2 = this.B;
        imageReceiver2.d = i2;
        imageReceiver2.m0(Integer.MAX_VALUE);
        if (this.w == activity) {
            return;
        }
        this.w = activity;
        this.J = activity.getResources().getDrawable(2131232590);
        this.y = new zc((byte) 16, activity, this);
        yic yicVar = new yic(this.y);
        zc zcVar = this.y;
        ll0 ll0Var = this.t;
        ll0Var.h = yicVar;
        ll0Var.i = zcVar;
        ll0Var.g = new r89(0, false);
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        zc zcVar2 = this.y;
        dw2 dw2Var = new dw2(this);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(zcVar2, dw2Var);
        tt ttVar = new tt(this, activity);
        this.z = ttVar;
        ttVar.setFocusable(false);
        this.y.addView(this.z, tre.e(-1, -1, 51));
        this.z.setOnTouchListener(new b7(this, (byte) 3));
        uc7.s1(this.r);
        this.I = uc7.d1().getInt("kbd_height", hl.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        hl.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.p0(this.z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.p0(this.z);
    }

    public final boolean m(View view) {
        if (!(view instanceof x2b)) {
            return false;
        }
        Activity W = hl.W(view.getContext());
        if (W == null) {
            return true;
        }
        l(W);
        x2b x2bVar = (x2b) view;
        View view2 = this.h;
        if (view2 instanceof x2b) {
            ((x2b) view2).setScaled(false);
        } else if (view2 instanceof u2b) {
            ((u2b) view2).setScaled(false);
        } else if (view2 instanceof vw2) {
            ((vw2) view2).setScaled(false);
        }
        this.h = x2bVar;
        TLRPC.Document sticker = x2bVar.getSticker();
        k7a stickerPath = x2bVar.getStickerPath();
        String str = null;
        String V = r47.V(x2bVar.getSticker(), null, Integer.valueOf(this.r));
        pw2 pw2Var = this.l;
        if (pw2Var != null) {
            str = pw2Var.E(false);
        }
        i(sticker, stickerPath, V, str, null, 0, x2bVar.E, x2bVar.getParentObject(), this.c0, 0);
        nw2 nw2Var = this.U;
        hl.r(nw2Var);
        hl.d3(nw2Var, 16L);
        x2bVar.setScaled(true);
        return true;
    }
}
