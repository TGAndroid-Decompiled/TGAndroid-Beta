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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class hx2 {
    public static TextPaint f0;
    public static volatile hx2 g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public kw7 C;
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
    public bj8 O;
    public c31 P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final dx2 U;
    public int V;
    public TLRPC.Document W;
    public t5a X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public ylb c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public up6 j;
    public m8 k;
    public fx2 l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final jz4 s;
    public final km0 t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public yd y;
    public su z;
    public float e = 0.0f;
    public iq5 q = iq5.e;

    public hx2() {
        jz4 jz4Var = new jz4();
        this.s = jz4Var;
        this.t = new km0(jz4Var, jz4Var, jz4Var);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = gm.L(200.0f);
        this.N = new Paint(1);
        this.U = new dx2(this);
    }

    public static hx2 e() {
        hx2 hx2Var;
        hx2 hx2Var2 = g0;
        if (hx2Var2 == null) {
            synchronized (PhotoViewer.class) {
                hx2Var = g0;
                if (hx2Var == null) {
                    hx2Var = new hx2();
                    g0 = hx2Var;
                }
            }
            return hx2Var;
        }
        return hx2Var2;
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
        g49 g49Var;
        String str2;
        g49 g49Var2;
        d dVar;
        fx2 fx2Var = this.l;
        if (fx2Var != null) {
            TLRPC.TL_messageMediaPoll d = fx2Var.d();
            TLRPC.PollAnswer g = this.l.g();
            if (d != null && d.poll != null && g != null) {
                TLRPC.PollAnswerVoters E1 = k47.E1(d, g.option);
                if (E1 != null && E1.voters > 0 && k47.A(d)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!k47.V4(d) && !d.poll.closed && !this.l.c()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && k47.D(d)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z) {
                    g49 g49Var3 = new g49(this.r, this.c0, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
                    bu5 bu5Var = new bu5(actionBarPopupWindow$ActionBarPopupWindowLayout, this.c0);
                    View view = bu5Var.B;
                    int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
                    int i3 = cmb.D8;
                    bu5Var.U(cmb.p1(0.06f, cmb.v0(i3, this.c0)));
                    nm0 k = qqd.k(this.c0);
                    if (view != null) {
                        g49Var = g49Var3;
                        str2 = null;
                        im0 c = this.t.c(view, null, true);
                        c.p(k);
                        view.setBackground(c);
                    } else {
                        g49Var = g49Var3;
                        str2 = null;
                    }
                    bu5Var.b(2131231244, jb6.M0(2131753721, str2), new vw2(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 0), false);
                    bu5Var.j();
                    k47 x = this.l.x();
                    Activity activity = this.w;
                    if ((activity instanceof LaunchActivity) && x != null) {
                        LaunchActivity launchActivity = (LaunchActivity) activity;
                        if (launchActivity.N() != null && launchActivity.N().getLastFragment() != null) {
                            dVar = launchActivity.N().getLastFragment();
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            q7c a = g49Var.a(dVar, k47.B0(x.k), x.e1(), g.option, E1.voters, new qy1(this, dVar, (byte) 11));
                            g49Var2 = g49Var;
                            bu5Var.p(a);
                            g49Var2.setText(jb6.G(E1.voters, "PollVotesCount", new Object[0]));
                            g49Var2.a.d(E1.recent_voters, false);
                            g49Var2.setLayoutParams(qoe.o(-1, 48));
                            int i4 = cmb.H5;
                            fg0 Y = cmb.Y(cmb.v0(i4, this.c0), 12, 0);
                            wmb M = anb.M(i4);
                            ylb ylbVar = this.c0;
                            g49Var2.setBackground(Y);
                            anb.j(g49Var2, Y, null, M, ylbVar);
                            g49Var2.setOnClickListener(new v0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g49Var2);
                            View j8Var = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
                            j8Var.setTag(2131296439, 1);
                            f = 0.06f;
                            anb.i(j8Var, anb.K(0.06f, i3), this.c0);
                            i = -1;
                            j8Var.setLayoutParams(qoe.o(-1, 8));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j8Var);
                        }
                    }
                    g49Var2 = g49Var;
                    g49Var2.setText(jb6.G(E1.voters, "PollVotesCount", new Object[0]));
                    g49Var2.a.d(E1.recent_voters, false);
                    g49Var2.setLayoutParams(qoe.o(-1, 48));
                    int i42 = cmb.H5;
                    fg0 Y2 = cmb.Y(cmb.v0(i42, this.c0), 12, 0);
                    wmb M2 = anb.M(i42);
                    ylb ylbVar2 = this.c0;
                    g49Var2.setBackground(Y2);
                    anb.j(g49Var2, Y2, null, M2, ylbVar2);
                    g49Var2.setOnClickListener(new v0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g49Var2);
                    View j8Var2 = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
                    j8Var2.setTag(2131296439, 1);
                    f = 0.06f;
                    anb.i(j8Var2, anb.K(0.06f, i3), this.c0);
                    i = -1;
                    j8Var2.setLayoutParams(qoe.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j8Var2);
                } else {
                    f = 0.06f;
                    i = -1;
                }
                if (z2) {
                    i2 = i;
                    str = null;
                    f2 = f;
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232363, jb6.M0(2131746889, null), false, this.c0).setOnClickListener(new uw2(this, (byte) 2));
                } else {
                    f2 = f;
                    i2 = i;
                    str = null;
                }
                if (z3) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232420, jb6.M0(2131743511, str), false, this.c0).setOnClickListener(new uw2(this, (byte) 3));
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                }
                if (!z && (z2 || z3)) {
                    View j8Var3 = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), this.c0);
                    j8Var3.setTag(2131296439, 1);
                    anb.i(j8Var3, anb.K(f2, cmb.D8), this.c0);
                    j8Var3.setLayoutParams(qoe.o(i2, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.addView(j8Var3);
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
            gm.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.z.invalidate();
            this.W = null;
            this.a0 = null;
            this.Y = null;
            this.l = null;
            this.E = false;
            gm.d3(new sw2(this, (byte) 0), 200L);
            bj8 bj8Var = this.O;
            if (bj8Var != null) {
                bj8Var.animate().alpha(0.0f).translationY(gm.L(56.0f)).setDuration(150L).setInterpolator(d53.f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(d53.f).start();
            }
            nm7.e().k(nm7.k1, 8);
        }
    }

    public final void c() {
        x53 reactionsWindow;
        c31 c31Var = this.P;
        if (c31Var != null && (reactionsWindow = c31Var.getReactionsWindow()) != null && !reactionsWindow.q) {
            reactionsWindow.d();
            return;
        }
        this.K = false;
        d();
        b();
    }

    public final void d() {
        m8 m8Var = this.k;
        if (m8Var != null) {
            m8Var.dismiss();
            this.k = null;
            return;
        }
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = this.L;
        if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
            wi8.t(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(gm.L(-12.0f)), d53.h, 320L);
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
        jz4 jz4Var = this.s;
        jz4Var.a(bitmap2);
        tl0.c(jz4Var, this.y);
        this.t.d();
        this.e0 = false;
        su suVar = this.z;
        if (suVar != null) {
            suVar.invalidate();
        }
    }

    public final boolean g(MotionEvent motionEvent, r59 r59Var, fx2 fx2Var, ylb ylbVar) {
        int i;
        this.l = fx2Var;
        if (fx2Var != null) {
            this.m = fx2Var.i();
            this.n = this.l.n();
        }
        fx2 fx2Var2 = this.l;
        if ((fx2Var2 == null || fx2Var2.h()) && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = r59Var.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = r59Var.getChildAt(i2);
                    if (childAt == null) {
                        break;
                    }
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int left = childAt.getLeft();
                    int right = childAt.getRight();
                    if (top <= y && bottom >= y && left <= x && right >= x) {
                        boolean z = childAt instanceof y0b;
                        ImageReceiver imageReceiver = this.A;
                        if (z) {
                            if (((y0b) childAt).a.E()) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else if (childAt instanceof v0b) {
                            if (((v0b) childAt).a.getImageReceiver().n() != null) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else {
                            i = 2;
                            if (childAt instanceof lx2) {
                                lx2 lx2Var = (lx2) childAt;
                                if (lx2Var.a.n() != null) {
                                    byte b = lx2Var.Q;
                                    if (b == 6) {
                                        imageReceiver.q0(0);
                                        i = 0;
                                    } else if (b == 2 && lx2Var.w) {
                                        imageReceiver.q0(gm.L(6.0f));
                                        i = 1;
                                    }
                                }
                                i = -1;
                            } else if (childAt instanceof ty3) {
                                imageReceiver.q0(0);
                            } else if ((childAt instanceof n24) && ((n24) childAt).getSpan() != null) {
                                imageReceiver.q0(0);
                            } else {
                                if ((childAt instanceof edb) && (((edb) childAt).b instanceof vm)) {
                                    imageReceiver.q0(0);
                                }
                                i = -1;
                            }
                        }
                        if (i != -1) {
                            this.a = x;
                            this.b = y;
                            this.h = childAt;
                            up6 up6Var = new up6(this, r59Var, i, ylbVar, (byte) 18);
                            this.j = up6Var;
                            gm.d3(up6Var, 200L);
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

    public final boolean h(android.view.MotionEvent r17, defpackage.r59 r18, java.lang.Object r19, defpackage.fx2 r20, defpackage.ylb r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx2.h(android.view.MotionEvent, r59, java.lang.Object, fx2, ylb):boolean");
    }

    public final void i(org.telegram.tgnet.TLRPC.Document r38, defpackage.t5a r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, defpackage.ylb r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx2.i(org.telegram.tgnet.TLRPC$Document, t5a, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, ylb, int):void");
    }

    public final void j() {
        up6 up6Var = this.j;
        if (up6Var != null) {
            gm.r(up6Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof y0b) {
                ((y0b) view).setScaled(false);
            } else if (view instanceof v0b) {
                ((v0b) view).setScaled(false);
            } else if (view instanceof lx2) {
                ((lx2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void k(fx2 fx2Var) {
        this.l = fx2Var;
        if (fx2Var != null) {
            this.m = fx2Var.i();
            this.n = this.l.n();
        }
    }

    public final void l(Activity activity) {
        int i = z8c.t0;
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
        this.J = activity.getResources().getDrawable(2131232591);
        this.y = new yd((byte) 16, activity, this);
        zgc zgcVar = new zgc(this.y);
        yd ydVar = this.y;
        km0 km0Var = this.t;
        km0Var.h = zgcVar;
        km0Var.i = ydVar;
        km0Var.g = new g79(0, false);
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        yd ydVar2 = this.y;
        tw2 tw2Var = new tw2(this);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(ydVar2, tw2Var);
        su suVar = new su(this, activity);
        this.z = suVar;
        suVar.setFocusable(false);
        this.y.addView(this.z, qoe.e(-1, -1, 51));
        this.z.setOnTouchListener(new a7(this, (byte) 3));
        oc7.r1(this.r);
        this.I = oc7.c1().getInt("kbd_height", gm.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        gm.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.p0(this.z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.p0(this.z);
    }

    public final boolean m(View view) {
        if (!(view instanceof y0b)) {
            return false;
        }
        Activity W = gm.W(view.getContext());
        if (W == null) {
            return true;
        }
        l(W);
        y0b y0bVar = (y0b) view;
        View view2 = this.h;
        if (view2 instanceof y0b) {
            ((y0b) view2).setScaled(false);
        } else if (view2 instanceof v0b) {
            ((v0b) view2).setScaled(false);
        } else if (view2 instanceof lx2) {
            ((lx2) view2).setScaled(false);
        }
        this.h = y0bVar;
        TLRPC.Document sticker = y0bVar.getSticker();
        t5a stickerPath = y0bVar.getStickerPath();
        String str = null;
        String V = k47.V(y0bVar.getSticker(), null, Integer.valueOf(this.r));
        fx2 fx2Var = this.l;
        if (fx2Var != null) {
            str = fx2Var.E(false);
        }
        i(sticker, stickerPath, V, str, null, 0, y0bVar.E, y0bVar.getParentObject(), this.c0, 0);
        dx2 dx2Var = this.U;
        gm.r(dx2Var);
        gm.d3(dx2Var, 16L);
        y0bVar.setScaled(true);
        return true;
    }
}
