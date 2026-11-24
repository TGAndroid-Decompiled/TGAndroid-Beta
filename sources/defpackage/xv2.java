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
public final class xv2 {
    public static TextPaint f0;
    public static volatile xv2 g0;
    public final ImageReceiver A;
    public final ImageReceiver B;
    public ju7 C;
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
    public zg8 O;
    public u11 P;
    public FrameLayout Q;
    public boolean R;
    public boolean S;
    public TLRPC.TL_messages_stickerSet T;
    public final tv2 U;
    public int V;
    public TLRPC.Document W;
    public s3a X;
    public String Y;
    public TLRPC.BotInlineResult Z;
    public int a;
    public TLRPC.InputStickerSet a0;
    public int b;
    public Object b0;
    public float c;
    public wjb c0;
    public float d;
    public VibrationEffect d0;
    public boolean e0;
    public float f;
    public float g;
    public View h;
    public boolean i;
    public tn6 j;
    public m8 k;
    public vv2 l;
    public boolean m;
    public boolean n;
    public ArrayList o;
    public boolean p;
    public int r;
    public final hx4 s;
    public final kl0 t;
    public final ColorDrawable u;
    public Bitmap v;
    public Activity w;
    public WindowManager.LayoutParams x;
    public yc y;
    public st z;
    public float e = 0.0f;
    public io5 q = io5.e;

    public xv2() {
        hx4 hx4Var = new hx4();
        this.s = hx4Var;
        this.t = new kl0(hx4Var, hx4Var, hx4Var);
        this.u = new ColorDrawable(1895825408);
        this.A = new ImageReceiver(null);
        this.B = new ImageReceiver(null);
        this.E = false;
        this.I = gl.L(200.0f);
        this.N = new Paint(1);
        this.U = new tv2(this);
    }

    public static xv2 e() {
        xv2 xv2Var;
        xv2 xv2Var2 = g0;
        if (xv2Var2 == null) {
            synchronized (PhotoViewer.class) {
                xv2Var = g0;
                if (xv2Var == null) {
                    xv2Var = new xv2();
                    g0 = xv2Var;
                }
            }
            return xv2Var;
        }
        return xv2Var2;
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
        c29 c29Var;
        String str2;
        c29 c29Var2;
        d dVar;
        vv2 vv2Var = this.l;
        if (vv2Var != null) {
            TLRPC.TL_messageMediaPoll d = vv2Var.d();
            TLRPC.PollAnswer g = this.l.g();
            if (d != null && d.poll != null && g != null) {
                TLRPC.PollAnswerVoters E1 = k27.E1(d, g.option);
                if (E1 != null && E1.voters > 0 && k27.A(d)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!k27.V4(d) && !d.poll.closed && !this.l.c()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && k27.D(d)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z) {
                    c29 c29Var3 = new c29(this.r, this.c0, actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
                    cs5 cs5Var = new cs5(actionBarPopupWindow$ActionBarPopupWindowLayout, this.c0);
                    View view = cs5Var.B;
                    int b = actionBarPopupWindow$ActionBarPopupWindowLayout.b(view);
                    int i3 = bkb.D8;
                    cs5Var.U(bkb.p1(0.06f, bkb.v0(i3, this.c0)));
                    nl0 k = nod.k(this.c0);
                    if (view != null) {
                        c29Var = c29Var3;
                        str2 = null;
                        il0 c = this.t.c(view, null, true);
                        c.p(k);
                        view.setBackground(c);
                    } else {
                        c29Var = c29Var3;
                        str2 = null;
                    }
                    cs5Var.b(2131231243, k96.M0(2131753753, str2), new lv2(actionBarPopupWindow$ActionBarPopupWindowLayout, (byte) 0), false);
                    cs5Var.j();
                    k27 w = this.l.w();
                    Activity activity = this.w;
                    if ((activity instanceof LaunchActivity) && w != null) {
                        LaunchActivity launchActivity = (LaunchActivity) activity;
                        if (launchActivity.N() != null && launchActivity.N().getLastFragment() != null) {
                            dVar = launchActivity.N().getLastFragment();
                        } else {
                            dVar = null;
                        }
                        if (dVar != null) {
                            q5c a = c29Var.a(dVar, k27.B0(w.k), w.e1(), g.option, E1.voters, new pz1(this, dVar, (byte) 10));
                            c29Var2 = c29Var;
                            cs5Var.p(a);
                            c29Var2.setText(k96.G(E1.voters, "PollVotesCount", new Object[0]));
                            c29Var2.a.d(E1.recent_voters, false);
                            c29Var2.setLayoutParams(nme.o(-1, 48));
                            int i4 = bkb.H5;
                            ff0 Y = bkb.Y(bkb.v0(i4, this.c0), 12, 0);
                            vkb M = zkb.M(i4);
                            wjb wjbVar = this.c0;
                            c29Var2.setBackground(Y);
                            zkb.j(c29Var2, Y, null, M, wjbVar);
                            c29Var2.setOnClickListener(new v0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(c29Var2);
                            View j8Var = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
                            j8Var.setTag(2131296439, 1);
                            f = 0.06f;
                            zkb.i(j8Var, zkb.K(0.06f, i3), this.c0);
                            i = -1;
                            j8Var.setLayoutParams(nme.o(-1, 8));
                            actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j8Var);
                        }
                    }
                    c29Var2 = c29Var;
                    c29Var2.setText(k96.G(E1.voters, "PollVotesCount", new Object[0]));
                    c29Var2.a.d(E1.recent_voters, false);
                    c29Var2.setLayoutParams(nme.o(-1, 48));
                    int i42 = bkb.H5;
                    ff0 Y2 = bkb.Y(bkb.v0(i42, this.c0), 12, 0);
                    vkb M2 = zkb.M(i42);
                    wjb wjbVar2 = this.c0;
                    c29Var2.setBackground(Y2);
                    zkb.j(c29Var2, Y2, null, M2, wjbVar2);
                    c29Var2.setOnClickListener(new v0(actionBarPopupWindow$ActionBarPopupWindowLayout, b, (byte) 5));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(c29Var2);
                    View j8Var2 = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext(), this.c0);
                    j8Var2.setTag(2131296439, 1);
                    f = 0.06f;
                    zkb.i(j8Var2, zkb.K(0.06f, i3), this.c0);
                    i = -1;
                    j8Var2.setLayoutParams(nme.o(-1, 8));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.addView(j8Var2);
                } else {
                    f = 0.06f;
                    i = -1;
                }
                if (z2) {
                    i2 = i;
                    str = null;
                    f2 = f;
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232362, k96.M0(2131746963, null), false, this.c0).setOnClickListener(new kv2(this, (byte) 2));
                } else {
                    f2 = f;
                    i2 = i;
                    str = null;
                }
                if (z3) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                    r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232419, k96.M0(2131743585, str), false, this.c0).setOnClickListener(new kv2(this, (byte) 3));
                } else {
                    actionBarPopupWindow$ActionBarPopupWindowLayout2 = actionBarPopupWindow$ActionBarPopupWindowLayout;
                }
                if (!z && (z2 || z3)) {
                    View j8Var3 = new j8(actionBarPopupWindow$ActionBarPopupWindowLayout2.getContext(), this.c0);
                    j8Var3.setTag(2131296439, 1);
                    zkb.i(j8Var3, zkb.K(f2, bkb.D8), this.c0);
                    j8Var3.setLayoutParams(nme.o(i2, 8));
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
            gl.r(this.U);
            this.F = 1.0f;
            this.H = System.currentTimeMillis();
            this.z.invalidate();
            this.W = null;
            this.a0 = null;
            this.Y = null;
            this.l = null;
            this.E = false;
            gl.e3(new iv2(this, (byte) 0), 200L);
            zg8 zg8Var = this.O;
            if (zg8Var != null) {
                zg8Var.animate().alpha(0.0f).translationY(gl.L(56.0f)).setDuration(150L).setInterpolator(s33.f).start();
            }
            FrameLayout frameLayout = this.Q;
            if (frameLayout != null) {
                frameLayout.animate().alpha(0.0f).setDuration(150L).scaleX(0.6f).scaleY(0.6f).setInterpolator(s33.f).start();
            }
            kk7.e().k(kk7.j1, 8);
        }
    }

    public final void c() {
        m43 reactionsWindow;
        u11 u11Var = this.P;
        if (u11Var != null && (reactionsWindow = u11Var.getReactionsWindow()) != null && !reactionsWindow.q) {
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
            ug8.t(actionBarPopupWindow$ActionBarPopupWindowLayout.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).translationY(gl.L(-12.0f)), s33.h, 320L);
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
        hx4 hx4Var = this.s;
        hx4Var.a(bitmap2);
        tk0.c(hx4Var, this.y);
        this.t.d();
        this.e0 = false;
        st stVar = this.z;
        if (stVar != null) {
            stVar.invalidate();
        }
    }

    public final boolean g(MotionEvent motionEvent, o39 o39Var, vv2 vv2Var, wjb wjbVar) {
        int i;
        this.l = vv2Var;
        if (vv2Var != null) {
            this.m = vv2Var.i();
            this.n = this.l.n();
        }
        vv2 vv2Var2 = this.l;
        if ((vv2Var2 == null || vv2Var2.h()) && motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int childCount = o39Var.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = o39Var.getChildAt(i2);
                    if (childAt == null) {
                        break;
                    }
                    int top = childAt.getTop();
                    int bottom = childAt.getBottom();
                    int left = childAt.getLeft();
                    int right = childAt.getRight();
                    if (top <= y && bottom >= y && left <= x && right >= x) {
                        boolean z = childAt instanceof xya;
                        ImageReceiver imageReceiver = this.A;
                        if (z) {
                            if (((xya) childAt).a.E()) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else if (childAt instanceof uya) {
                            if (((uya) childAt).a.getImageReceiver().n() != null) {
                                imageReceiver.q0(0);
                                i = 0;
                            }
                            i = -1;
                        } else {
                            i = 2;
                            if (childAt instanceof bw2) {
                                bw2 bw2Var = (bw2) childAt;
                                if (bw2Var.a.n() != null) {
                                    byte b = bw2Var.Q;
                                    if (b == 6) {
                                        imageReceiver.q0(0);
                                        i = 0;
                                    } else if (b == 2 && bw2Var.w) {
                                        imageReceiver.q0(gl.L(6.0f));
                                        i = 1;
                                    }
                                }
                                i = -1;
                            } else if (childAt instanceof ix3) {
                                imageReceiver.q0(0);
                            } else if ((childAt instanceof c14) && ((c14) childAt).getSpan() != null) {
                                imageReceiver.q0(0);
                            } else {
                                if ((childAt instanceof cbb) && (((cbb) childAt).b instanceof vl)) {
                                    imageReceiver.q0(0);
                                }
                                i = -1;
                            }
                        }
                        if (i != -1) {
                            this.a = x;
                            this.b = y;
                            this.h = childAt;
                            tn6 tn6Var = new tn6(this, o39Var, i, wjbVar, (byte) 18);
                            this.j = tn6Var;
                            gl.e3(tn6Var, 200L);
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

    public final boolean h(android.view.MotionEvent r17, defpackage.o39 r18, java.lang.Object r19, defpackage.vv2 r20, defpackage.wjb r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv2.h(android.view.MotionEvent, o39, java.lang.Object, vv2, wjb):boolean");
    }

    public final void i(org.telegram.tgnet.TLRPC.Document r38, defpackage.s3a r39, java.lang.String r40, java.lang.String r41, org.telegram.tgnet.TLRPC.BotInlineResult r42, int r43, boolean r44, java.lang.Object r45, defpackage.wjb r46, int r47) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv2.i(org.telegram.tgnet.TLRPC$Document, s3a, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$BotInlineResult, int, boolean, java.lang.Object, wjb, int):void");
    }

    public final void j() {
        tn6 tn6Var = this.j;
        if (tn6Var != null) {
            gl.r(tn6Var);
            this.j = null;
        }
        View view = this.h;
        if (view != null) {
            if (view instanceof xya) {
                ((xya) view).setScaled(false);
            } else if (view instanceof uya) {
                ((uya) view).setScaled(false);
            } else if (view instanceof bw2) {
                ((bw2) view).setScaled(false);
            }
            this.h = null;
        }
    }

    public final void k(vv2 vv2Var) {
        this.l = vv2Var;
        if (vv2Var != null) {
            this.m = vv2Var.i();
            this.n = this.l.n();
        }
    }

    public final void l(Activity activity) {
        int i = y6c.t0;
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
        this.J = activity.getResources().getDrawable(2131232579);
        this.y = new yc((byte) 16, activity, this);
        zec zecVar = new zec(this.y);
        yc ycVar = this.y;
        kl0 kl0Var = this.t;
        kl0Var.h = zecVar;
        kl0Var.i = ycVar;
        kl0Var.g = new e59(0, false);
        this.y.setFocusable(true);
        this.y.setFocusableInTouchMode(true);
        this.y.setSystemUiVisibility(1792);
        yc ycVar2 = this.y;
        jv2 jv2Var = new jv2(this);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(ycVar2, jv2Var);
        st stVar = new st(this, activity);
        this.z = stVar;
        stVar.setFocusable(false);
        this.y.addView(this.z, nme.e(-1, -1, 51));
        this.z.setOnTouchListener(new a7(this, (byte) 3));
        na7.q1(this.r);
        this.I = na7.b1().getInt("kbd_height", gl.L(200.0f));
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.x = layoutParams;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.width = -1;
        layoutParams.gravity = 48;
        layoutParams.type = 99;
        layoutParams.flags = -2147286784;
        gl.m(layoutParams);
        imageReceiver.S0 = true;
        imageReceiver.K0 = true;
        imageReceiver.p0(this.z);
        imageReceiver2.S0 = true;
        imageReceiver2.K0 = true;
        imageReceiver2.p0(this.z);
    }

    public final boolean m(View view) {
        if (!(view instanceof xya)) {
            return false;
        }
        Activity W = gl.W(view.getContext());
        if (W == null) {
            return true;
        }
        l(W);
        xya xyaVar = (xya) view;
        View view2 = this.h;
        if (view2 instanceof xya) {
            ((xya) view2).setScaled(false);
        } else if (view2 instanceof uya) {
            ((uya) view2).setScaled(false);
        } else if (view2 instanceof bw2) {
            ((bw2) view2).setScaled(false);
        }
        this.h = xyaVar;
        TLRPC.Document sticker = xyaVar.getSticker();
        s3a stickerPath = xyaVar.getStickerPath();
        String str = null;
        String V = k27.V(xyaVar.getSticker(), null, Integer.valueOf(this.r));
        vv2 vv2Var = this.l;
        if (vv2Var != null) {
            str = vv2Var.C(false);
        }
        i(sticker, stickerPath, V, str, null, 0, xyaVar.E, xyaVar.getParentObject(), this.c0, 0);
        tv2 tv2Var = this.U;
        gl.r(tv2Var);
        gl.e3(tv2Var, 16L);
        xyaVar.setScaled(true);
        return true;
    }
}
