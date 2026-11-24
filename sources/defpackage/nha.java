package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public abstract class nha extends FrameLayout implements vlb, jm7, dg3, l59 {
    public static final int[] t2 = {0, 1, 2, 4};
    public static final rg3 u2 = new rg3((byte) 3);
    public static final int v2 = gm.L(7.0f);
    public static final int w2 = gm.L(7.0f) + gm.L(14.0f);
    public byte A0;
    public boolean A1;
    public final Drawable B0;
    public boolean B1;
    public boolean C0;
    public int C1;
    public final NumberTextView D0;
    public int D1;
    public final tk4 E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final boolean F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final ee0 G0;
    public final cga G1;
    public final a H;
    public final ArrayList H0;
    public hg5 H1;
    public final rja I;
    public final ArrayList I0;
    public final ylb I1;
    public final zja J;
    public final ArrayList J0;
    public final kz4 J1;
    public final ufa K;
    public final ArrayList K0;
    public final e7a K1;
    public final hha L;
    public final kfa L0;
    public boolean L1;
    public final bha M;
    public final hfa M0;
    public final po M1;
    public final aha N;
    public final cm1 N0;
    public v99 N1;
    public final aha O;
    public AnimatorSet O0;
    public int O1;
    public final aha P;
    public final oda P0;
    public boolean P1;
    public final wga Q;
    public final ArrayList Q0;
    public int Q1;
    public final dga R;
    public float R0;
    public AnimatorSet R1;
    public final bga S;
    public final qk3 S0;
    public final SparseArray S1;
    public final zfa T;
    public final FrameLayout T0;
    public long T1;
    public final yga U;
    public final gfa U0;
    public boolean U1;
    public final zga V;
    public final int V0;
    public int V1;
    public final vfa W;
    public final Paint W0;
    public final rfa W1;
    public boolean X0;
    public z3b X1;
    public boolean Y0;
    public float Y1;
    public k39 Z0;
    public boolean Z1;
    public boolean a;
    public final kea a0;
    public final int[] a1;
    public SpannableStringBuilder a2;
    public boolean b;
    public final lea b0;
    public int b1;
    public int b2;
    public boolean c;
    public final oea c0;
    public final SparseArray[] c1;
    public boolean c2;
    public boolean d;
    public final aga d0;
    public int d1;
    public int d2;
    public int e;
    public final hu5 e0;
    public boolean e1;
    public int e2;
    public int f;
    public final xfa f0;
    public long f1;
    public int f2;
    public final kha g0;
    public TLRPC.ChatFull g1;
    public int g2;
    public float h;
    public final jea h0;
    public TLRPC.UserFull h1;
    public sy4 h2;
    public final kha i0;
    public AnimatorSet i1;
    public float i2;
    public final kga j0;
    public boolean j1;
    public final RectF j2;
    public final kga k0;
    public boolean k1;
    public Runnable k2;
    public final kga l0;
    public boolean l1;
    public int l2;
    public final gga m0;
    public final long m1;
    public final HashMap m2;
    public float n;
    public final iga[] n0;
    public boolean n1;
    public final HashMap n2;
    public final r7 o0;
    public boolean o1;
    public int o2;
    public final r7 p0;
    public final int[] p1;
    public int p2;
    public final r7 q0;
    public float q1;
    public boolean q2;
    public boolean r;
    public float r0;
    public boolean r1;
    public int r2;
    public int s;
    public float s0;
    public int s1;
    public int s2;
    public final TextView t0;
    public int t1;
    public final ImageView u0;
    public final uea u1;
    public final s09 v0;
    public float v1;
    public int w;
    public final r7 w0;
    public final cha[] w1;
    public int x;
    public final r7 x0;
    public final fha x1;
    public final Rect y;
    public final r7 y0;
    public final d y1;
    public final r7 z0;
    public int z1;

    public nha(android.content.Context r34, long r35, defpackage.fha r37, int r38, java.util.ArrayList r39, org.telegram.tgnet.TLRPC.ChatFull r40, org.telegram.tgnet.TLRPC.UserFull r41, int r42, int r43, org.telegram.ui.ActionBar.d r44, defpackage.cga r45, int r46, defpackage.ylb r47, defpackage.km0 r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nha.<init>(android.content.Context, long, fha, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.d, cga, int, ylb, km0):void");
    }

    public static bj G(int i, long j, ylb ylbVar, Context context) {
        bj bjVar = new bj(context, ylbVar);
        ImageView imageView = (ImageView) bjVar.d;
        TextView textView = (TextView) bjVar.c;
        if (i == 0) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747930, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747932, null));
            return bjVar;
        } else if (i == 1) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747891, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747892, null));
            return bjVar;
        } else if (i == 2) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747886, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747887, null));
            return bjVar;
        } else if (i == 3) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747888, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747889, null));
            return bjVar;
        } else if (i == 4) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747893, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747894, null));
            return bjVar;
        } else if (i == 5) {
            if (pg3.B(j)) {
                textView.setText(jb6.M0(2131747890, null));
                return bjVar;
            }
            textView.setText(jb6.M0(2131747942, null));
            return bjVar;
        } else if (i == 6) {
            imageView.setImageDrawable(null);
            textView.setText(jb6.M0(2131747940, null));
            return bjVar;
        } else {
            if (i == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return bjVar;
        }
    }

    public static int Q(View view) {
        if (view instanceof sha) {
            return ((sha) view).getMessageId();
        }
        if (view instanceof ida) {
            return ((ida) view).getMessage().e1();
        }
        if (view instanceof eda) {
            return ((eda) view).getMessage().e1();
        }
        return 0;
    }

    public static TLRPC.ProfileTab Y(int i, boolean z) {
        if (i != 8 && i != 14 && !z) {
            return null;
        }
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                if (i != 8) {
                                    if (i != 14) {
                                        return null;
                                    }
                                    return new TLRPC.TL_profileTabGifts();
                                }
                                return new TLRPC.TL_profileTabPosts();
                            }
                            return new TLRPC.TL_profileTabGifs();
                        }
                        return new TLRPC.TL_profileTabMusic();
                    }
                    return new TLRPC.TL_profileTabLinks();
                }
                return new TLRPC.TL_profileTabVoice();
            }
            return new TLRPC.TL_profileTabFiles();
        }
        return new TLRPC.TL_profileTabMedia();
    }

    public static int Z(TLRPC.ProfileTab profileTab) {
        if (profileTab instanceof TLRPC.TL_profileTabPosts) {
            return 8;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMedia) {
            return 0;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifts) {
            return 14;
        }
        if (profileTab instanceof TLRPC.TL_profileTabMusic) {
            return 4;
        }
        if (profileTab instanceof TLRPC.TL_profileTabVoice) {
            return 2;
        }
        if (profileTab instanceof TLRPC.TL_profileTabLinks) {
            return 3;
        }
        if (profileTab instanceof TLRPC.TL_profileTabFiles) {
            return 1;
        }
        if (profileTab instanceof TLRPC.TL_profileTabGifs) {
            return 5;
        }
        return -1;
    }

    public long getPlaylistTopicId() {
        if (sd2.b0(this.y1.getCurrentAccount(), this.m1)) {
            return this.G;
        }
        return 0L;
    }

    public h4b getStoriesController() {
        return oc7.r1(this.y1.getCurrentAccount()).N1();
    }

    public static boolean j0(int i) {
        if (i != 8 && i != 9 && !t0(i)) {
            return false;
        }
        return true;
    }

    public static void k1(int i, View view) {
        if (view != null && (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.topMargin != i) {
                marginLayoutParams.topMargin = i;
                view.setLayoutParams(marginLayoutParams);
            }
        }
    }

    public static void m1(iga igaVar, cha[] chaVarArr, boolean z) {
        e6a e6aVar;
        if (z) {
            if (gda.r1 > 0 && igaVar.G == null && !igaVar.I && igaVar.h.getFastScroll() != null && igaVar.h.getFastScroll().b0 && igaVar.h.getFastScroll().getVisibility() == 0 && chaVarArr[0].e() >= 50) {
                int i = gda.r1;
                int i2 = i - 1;
                if (i != i2) {
                    gda.r1 = i2;
                    org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", gda.r1).apply();
                }
                igaVar.I = true;
                Context context = igaVar.getContext();
                ct8 ct8Var = new ct8(context, (byte) 6);
                TextView textView = new TextView(context);
                td4.v(14.0f, 2131745142, 1, textView, null);
                textView.setMaxLines(3);
                int i3 = cmb.fg;
                anb.X(textView, i3, null);
                int L = gm.L(6.0f);
                int i4 = cmb.gg;
                ShapeDrawable b0 = cmb.b0(L, cmb.w0(null, i4, false));
                wmb M = anb.M(i4);
                ct8Var.setBackground(b0);
                anb.j(ct8Var, b0, M, null, null);
                ct8Var.addView(textView, qoe.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.a = new Random();
                Paint paint = new Paint(1);
                view.b = paint;
                Paint paint2 = new Paint(1);
                view.c = paint2;
                view.f = 1.0f;
                view.h = 0.0f;
                paint.setColor(on2.p(cmb.w0(null, i3, false), 76));
                paint2.setColor(cmb.w0(null, i3, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, gm.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gm.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                ct8Var.addView((View) view, qoe.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                igaVar.G = ct8Var;
                igaVar.addView(ct8Var, qoe.c(-2.0f, -2));
                igaVar.G.setAlpha(0.0f);
                igaVar.G.setScaleX(0.8f);
                igaVar.G.setScaleY(0.8f);
                igaVar.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                igaVar.invalidate();
                e6a e6aVar2 = new e6a(igaVar, ct8Var, (byte) 5);
                igaVar.H = e6aVar2;
                gm.d3(e6aVar2, 4000L);
            }
        } else if (igaVar.G != null && (e6aVar = igaVar.H) != null) {
            gm.r(e6aVar);
            igaVar.H.run();
            igaVar.H = null;
            igaVar.G = null;
        }
    }

    public void setHeaderEnabled(boolean z) {
        rja rjaVar = this.I;
        if (rjaVar != null) {
            rjaVar.setEnabled(z);
        } else {
            this.H.setEnabled(z);
        }
    }

    private void setPageOverscan(hga hgaVar) {
        if (this.c2 && hgaVar != null) {
            hgaVar.j3 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) hgaVar.getLayoutParams();
            if (marginLayoutParams != null) {
                int i = marginLayoutParams.topMargin;
                int i2 = -this.e2;
                if (i != i2 || marginLayoutParams.bottomMargin != (-this.f2)) {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.bottomMargin = -this.f2;
                    hgaVar.setLayoutParams(marginLayoutParams);
                }
            }
        }
    }

    public void setSearchItemVisibility(int i) {
        r7 r7Var = this.q0;
        if (r7Var == null) {
            return;
        }
        if (this.I != null) {
            B(true, true);
        } else {
            r7Var.setVisibility(i);
        }
    }

    public static boolean t0(int i) {
        if ((i & (-65536)) == 65536) {
            return true;
        }
        return false;
    }

    public final boolean A(android.view.MotionEvent r25) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nha.A(android.view.MotionEvent):boolean");
    }

    public final void A0(int i, TL_stories.StoryItem storyItem) {
        getStoriesController().b(i, this.m1, storyItem);
    }

    public final void A1(a8 a8Var, a8 a8Var2, Runnable runnable) {
        if (this.L1) {
            return;
        }
        if (!a8Var2.getCheckView().a.q && a8Var.getCheckView().a.q) {
            float f = -this.v1;
            this.v1 = f;
            gm.A3(f, a8Var, null);
            return;
        }
        a8Var.setChecked(!a8Var.getCheckView().a.q);
        runnable.run();
    }

    public final void B(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        if (this.I != null) {
            int closestTab = getClosestTab();
            boolean z5 = false;
            if (this.q2 && !o0()) {
                z3 = true;
            } else {
                z3 = false;
            }
            r7 r7Var = this.q0;
            if (r7Var != null) {
                if (z3 && q() && (p0(closestTab) || (closestTab == 11 && h0()))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                ((zja) r7Var).Y(z4, z);
            }
            zja zjaVar = this.J;
            if (zjaVar != null) {
                if (z3 && q() && !k0() && f0(closestTab)) {
                    z5 = true;
                }
                zjaVar.Y(z5, z2);
            }
        }
    }

    public final void B0(int i, TL_stories.StoryItem storyItem, String str) {
        v99 v99Var = new v99(this, i, storyItem, (byte) 5);
        h4b storiesController = getStoriesController();
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.e0(i, this.m1, arrayList);
        c41.b0(this.y1).K(2131623980, gm.S2(jb6.G(1, "StoryRemovedFromAlbumTitle", str)), jb6.M0(2131743572, null), v99Var).j();
    }

    public final void B1() {
        if (this.I == null) {
            try {
                int c0 = c0(cmb.x8);
                int c02 = c0(cmb.y8);
                if (c0 != this.r2 || c02 != this.s2) {
                    this.r2 = c0;
                    this.s2 = c02;
                    r7[] r7VarArr = {this.x0, this.w0, this.y0, this.z0, this.o0};
                    for (int i = 0; i < 5; i++) {
                        r7 r7Var = r7VarArr[i];
                        if (r7Var != null) {
                            r7Var.setIconColor(c0);
                            if (r7Var.getBackground() != null) {
                                cmb.F1(r7Var.getBackground(), c02, true);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
    }

    public final void C() {
        char c;
        char c2;
        float abs;
        View childAt;
        int R;
        float f;
        float measuredWidth;
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[0];
        if (igaVar != null && igaVarArr[1] != null) {
            float f2 = 0.0f;
            oea oeaVar = this.c0;
            if (oeaVar != null) {
                if (j0(igaVar.F) && igaVarArr[0].F != 9) {
                    c = 1;
                } else {
                    c = 0;
                }
                if (igaVarArr[1].getVisibility() == 0) {
                    if (j0(igaVarArr[1].F) && igaVarArr[1].F != 9) {
                        c2 = 1;
                    } else {
                        c2 = 0;
                    }
                } else {
                    c2 = c;
                }
                if (c == c2) {
                    if (c != 0) {
                        measuredWidth = 0.0f;
                        abs = 1.0f;
                    } else {
                        measuredWidth = igaVarArr[0].getMeasuredWidth();
                        abs = 0.0f;
                    }
                    oeaVar.setTranslationX(measuredWidth);
                } else {
                    oeaVar.setTranslationX(igaVarArr[c ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(oeaVar.getTranslationX()) / oeaVar.getMeasuredWidth());
                }
                float f3 = 0.0f;
                for (int i = 0; i < igaVarArr.length; i++) {
                    if (igaVarArr[i].getVisibility() == 0) {
                        sea seaVar = igaVarArr[i].h;
                        if (seaVar.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = seaVar.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f = childAt.getY() - seaVar.getPaddingTop();
                        } else if (seaVar.getChildCount() == 0) {
                            f = 0.0f;
                        } else {
                            f = -gm.L(48.0f);
                        }
                        f3 += Utilities.l(1.0f - (igaVarArr[i].getTranslationX() / igaVarArr[i].getMeasuredWidth())) * f;
                    }
                }
                float l = Utilities.l(1.0f - ((-f3) / gm.N(48.0f)));
                float R1 = gm.R1(0.9f, 1.0f, l);
                oeaVar.setAlpha(l);
                oeaVar.setScaleX(R1);
                oeaVar.setScaleY(R1);
                oeaVar.setTranslationY(this.O1 + f3);
                f2 = abs;
            }
            qk3 qk3Var = this.S0;
            if (qk3Var != null) {
                qk3Var.setTranslationY(this.O1);
            }
            if (this.Y1 != f2) {
                this.Y1 = f2;
                invalidate();
            }
        }
    }

    public final void C0(TL_stories.StoryItem storyItem) {
        getStoriesController().r0(this.m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        c41.b0(this.y1).G(2131623980, 5000, jb6.G(1, "StoryArchived", new Object[0])).j();
    }

    public final void C1() {
        if (n0()) {
            post(new oda(this, (byte) 13));
            return;
        }
        ufa ufaVar = this.K;
        if (ufaVar != null) {
            ufaVar.f();
        }
        aha ahaVar = this.N;
        if (ahaVar != null) {
            ahaVar.f();
        }
        aha ahaVar2 = this.O;
        if (ahaVar2 != null) {
            ahaVar2.f();
        }
        bha bhaVar = this.M;
        if (bhaVar != null) {
            bhaVar.X(false);
        }
        aha ahaVar3 = this.P;
        if (ahaVar3 != null) {
            ahaVar3.f();
        }
        wga wgaVar = this.Q;
        if (wgaVar != null) {
            wgaVar.f();
        }
        dga dgaVar = this.R;
        if (dgaVar != null) {
            dgaVar.f();
        }
        xfa xfaVar = this.f0;
        if (xfaVar != null) {
            xfaVar.f();
        }
        for (mha mhaVar : this.m2.values()) {
            mhaVar.c.f();
        }
    }

    public final boolean D() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nha.D():boolean");
    }

    public final void D0(int i, long j, ArrayList arrayList) {
        getStoriesController().a(i, j, arrayList);
    }

    public final void D1(iga igaVar, boolean z) {
        boolean z2;
        Integer num = 1;
        int i = 0;
        if (igaVar.b && this.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        y49 fastScroll = igaVar.h.getFastScroll();
        ObjectAnimator objectAnimator = igaVar.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            igaVar.c.cancel();
        }
        if (!z) {
            fastScroll.animate().setListener(null).cancel();
            if (!z2) {
                i = 8;
            }
            fastScroll.setVisibility(i);
            if (!z2) {
                num = null;
            }
            fastScroll.setTag(num);
            fastScroll.setAlpha(1.0f);
            fastScroll.setScaleX(1.0f);
            fastScroll.setScaleY(1.0f);
            return;
        }
        Property property = View.ALPHA;
        if (z2) {
            if (fastScroll.getTag() == null) {
                fastScroll.animate().setListener(null).cancel();
                if (fastScroll.getVisibility() != 0) {
                    fastScroll.setVisibility(0);
                    fastScroll.setAlpha(0.0f);
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 1.0f);
                igaVar.c = ofFloat;
                ofFloat.setDuration(150L).start();
                fastScroll.setTag(num);
            }
        } else if (fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new jf4(fastScroll));
            igaVar.c = ofFloat2;
            ofFloat2.setDuration(150L).start();
            fastScroll.animate().setListener(null).cancel();
            fastScroll.setTag(null);
        }
    }

    public final boolean E(boolean z) {
        SparseArray[] sparseArrayArr;
        if (!this.F1) {
            return false;
        }
        int i = 1;
        while (true) {
            sparseArrayArr = this.c1;
            if (i < 0) {
                break;
            }
            sparseArrayArr[i].clear();
            i--;
        }
        this.d1 = 0;
        J0(sparseArrayArr[0]);
        kea keaVar = this.a0;
        if (keaVar != null) {
            keaVar.h();
            keaVar.j();
        }
        l1(false);
        J1(z);
        yga ygaVar = this.U;
        if (ygaVar != null) {
            ygaVar.x.clear();
        }
        return true;
    }

    public final void E0(int i, long j) {
        v3b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = oc7.r1(i2).i1(A.b);
        tL_deleteAlbum.album_id = ((a4b) A.h.remove(c)).a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_deleteAlbum, null);
        A.f(true);
    }

    public final void E1() {
        boolean z;
        float f;
        r7 r7Var = this.w0;
        if (r7Var != null) {
            if (!this.y1.getMessagesController().B2(this.m1) && !e0()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                f = 0.5f;
            } else {
                f = 1.0f;
            }
            r7Var.setAlpha(f);
            if (z) {
                if (r7Var.getBackground() != null) {
                    r7Var.setBackground(null);
                }
            } else if (r7Var.getBackground() == null) {
                int i = cmb.y8;
                fg0 f0 = cmb.f0(c0(i), 5, -1);
                wmb M = anb.M(i);
                r7Var.setBackground(f0);
                anb.j(r7Var, f0, null, M, this.I1);
            }
        }
    }

    public final r7 F(Context context, int i, int i2, String str) {
        r7 r7Var;
        rja rjaVar = this.I;
        if (rjaVar != null) {
            r7Var = rjaVar.q().a(i, i2);
        } else {
            int i3 = cmb.y8;
            int c0 = c0(i3);
            int i4 = cmb.x8;
            r7 r7Var2 = new r7(context, null, c0, c0(i4), false, null);
            r7Var2.setIcon(i2);
            r7Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(r7Var2, new LinearLayout.LayoutParams(gm.L(54.0f), -1));
            this.Q0.add(r7Var2);
            s09 iconView = r7Var2.getIconView();
            ylb ylbVar = this.I1;
            if (iconView != null) {
                anb.s(r7Var2.getIconView(), i4, ylbVar, PorterDuff.Mode.SRC_IN);
            }
            if (r7Var2.getBackground() != null) {
                Drawable background = r7Var2.getBackground();
                wmb M = anb.M(i3);
                r7Var2.setBackground(background);
                anb.j(r7Var2, background, null, M, ylbVar);
            }
            r7Var = r7Var2;
        }
        r7Var.setContentDescription(str);
        r7Var.setOnClickListener(new hb(this, i, (byte) 7));
        return r7Var;
    }

    public final void F0(int i, String str, long j) {
        v3b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        ((a4b) A.h.get(c)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = oc7.r1(i2).i1(A.b);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        A.f(true);
    }

    public final void F1() {
        int i;
        lea leaVar = this.b0;
        if (leaVar != null) {
            int L = gm.L(48.0f) + this.d2;
            qk3 qk3Var = this.S0;
            if (qk3Var != null) {
                i = (int) qk3Var.c(gm.L(7.0f));
            } else {
                i = 0;
            }
            leaVar.setPaddingTop(L + i);
        }
    }

    public final void G0(boolean z) {
        long j = this.G;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0 && !q0()) {
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = t2[i2];
                cha[] chaVarArr = this.w1;
                if (!chaVarArr[i3].h || z) {
                    long j2 = this.m1;
                    if (!pg3.B(j2)) {
                        chaVarArr[i3].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i3 == 0) {
                            byte b = chaVarArr[i3].q;
                            if (b == 1) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotos();
                            } else if (b == 2) {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterVideo();
                            } else {
                                tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterPhotoVideo();
                            }
                        } else if (i3 == 1) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterDocument();
                        } else if (i3 == 2) {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterRoundVoice();
                        } else {
                            tL_messages_getSearchResultsPositions.filter = new TLRPC.TL_inputMessagesFilterMusic();
                        }
                        tL_messages_getSearchResultsPositions.limit = 100;
                        d dVar = this.y1;
                        tL_messages_getSearchResultsPositions.peer = dVar.getMessagesController().i1(j2);
                        if (i != 0 && dVar.getUserConfig().e() == j2) {
                            tL_messages_getSearchResultsPositions.flags |= 4;
                            tL_messages_getSearchResultsPositions.saved_peer_id = dVar.getMessagesController().i1(j);
                        }
                        ConnectionsManager.getInstance(dVar.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(dVar.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new hn6(this, chaVarArr[i3].p, i3, (byte) 2)), dVar.getClassGuid());
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void G1(boolean z) {
        lea leaVar;
        oea oeaVar;
        boolean z2 = true;
        B(true, true);
        s09 s09Var = this.v0;
        if (s09Var == null) {
            return;
        }
        float f = 0.0f;
        if (!this.Y0 && (((leaVar = this.b0) == null || !leaVar.g()) && ((oeaVar = this.c0) == null || !oeaVar.f))) {
            f = Utilities.i(this.r0 + this.s0, 1.0f, 0.0f);
        }
        s09Var.setAlpha(f);
        if (z) {
            if (U(1.0f) <= 0.5f) {
                z2 = false;
            }
            j(z2);
        } else if (this.A0 == 2) {
            if (this.s0 <= 0.1f) {
                z2 = false;
            }
            j(z2);
        } else {
            if (this.r0 >= 0.1f) {
                z2 = false;
            }
            j(z2);
        }
    }

    public boolean H() {
        return this instanceof oe5;
    }

    public final void H0(int i) {
        int i2;
        int i3 = 2;
        cha[] chaVarArr = this.w1;
        if (i == 0) {
            byte b = chaVarArr[0].q;
            if (b == 1) {
                i3 = 6;
            } else if (b == 2) {
                i3 = 7;
            } else {
                i2 = 0;
            }
            i2 = i3;
        } else if (i == 1) {
            i2 = 1;
        } else {
            if (i != 2) {
                i3 = 4;
                if (i != 4) {
                    i3 = 5;
                    if (i != 5) {
                        i3 = 3;
                    }
                }
            }
            i2 = i3;
        }
        chaVarArr[i].g = true;
        d dVar = this.y1;
        dVar.getMediaDataController().P0(this.m1, 50, 0, chaVarArr[i].k, i2, this.G, 1, dVar.getClassGuid(), chaVarArr[i].p, null, null);
    }

    public final void H1(iga igaVar) {
        boolean z;
        boolean c1 = igaVar.h.c1();
        if (c1) {
            igaVar.h.setSectionsDrawBackground(this.c2);
        }
        if (this.c2 && !c1 && igaVar.F != 15) {
            z = true;
        } else {
            z = false;
        }
        igaVar.setDrawPageBackground(z);
        if (igaVar.F == 15) {
            Drawable drawable = igaVar.P;
            if (drawable == null) {
                drawable = igaVar.getBackground();
            }
            Drawable d = cl8.d(drawable, this.y1.getCurrentAccount(), this.m1, cmb.I.o());
            if (!this.c2) {
                igaVar.setWallpaper(null);
                igaVar.setBackground(d);
                igaVar.setOutlineProvider(new xj((byte) 18));
                igaVar.setClipToOutline(true);
                return;
            }
            igaVar.setBackground(null);
            igaVar.setClipToOutline(false);
            igaVar.setWallpaper(d);
            return;
        }
        igaVar.setClipToOutline(false);
        igaVar.setBackground(null);
        igaVar.setWallpaper(null);
    }

    public final boolean I(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x = (-view.getX()) - getX();
        iga[] igaVarArr = this.n0;
        motionEvent.offsetLocation(x - igaVarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - igaVarArr[0].getY()) - igaVarArr[0].h.getFastScroll().getY());
        return igaVarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public int I0() {
        return 0;
    }

    public final void I1(iga igaVar) {
        boolean z;
        float f;
        int i;
        float f2;
        int i2 = igaVar.F;
        if (i2 != 0 && !j0(i2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            f = 0.0f;
        } else {
            f = 12.0f;
        }
        if (z) {
            i = 8;
        } else {
            i = 12;
        }
        float f3 = i + 48;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 12.0f;
        }
        FrameLayout.LayoutParams d = qoe.d(-1, -1.0f, 119, f, f3, f2, f2);
        d.topMargin = X(igaVar.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = igaVar.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        igaVar.s.setLayoutParams(d);
    }

    public final boolean J(int i) {
        cha[] chaVarArr = this.x1.n;
        if (chaVarArr == null) {
            return false;
        }
        cha[] chaVarArr2 = this.w1;
        if (i == 0) {
            cha chaVar = chaVarArr2[i];
            if (!chaVar.h) {
                int[] iArr = chaVar.f;
                int[] iArr2 = chaVarArr[i].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = chaVarArr2[i].f;
            int[] iArr4 = chaVarArr[i].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        chaVarArr2[i].a.addAll(chaVarArr[i].a);
        chaVarArr2[i].c.addAll(chaVarArr[i].c);
        for (Map.Entry entry : chaVarArr[i].d.entrySet()) {
            chaVarArr2[i].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i2 = 0; i2 < 2; i2++) {
            chaVarArr2[i].b[i2] = chaVarArr[i].b[i2].clone();
            cha chaVar2 = chaVarArr2[i];
            int[] iArr5 = chaVar2.j;
            cha chaVar3 = chaVarArr[i];
            iArr5[i2] = chaVar3.j[i2];
            chaVar2.i[i2] = chaVar3.i[i2];
        }
        chaVarArr2[i].e.addAll(chaVarArr[i].e);
        return !chaVarArr[i].a.isEmpty();
    }

    public final void J1(boolean z) {
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i < igaVarArr.length) {
                int childCount = igaVarArr[i].h.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = igaVarArr[i].h.getChildAt(i2);
                    if (childAt instanceof ida) {
                        ((ida) childAt).b(false, z);
                    } else if (childAt instanceof sha) {
                        ((sha) childAt).i(false, z);
                    } else if (childAt instanceof lda) {
                        ((lda) childAt).f(false, z);
                    } else if (childAt instanceof eda) {
                        ((eda) childAt).e(false, z);
                    } else if (childAt instanceof lx2) {
                        ((lx2) childAt).c(false, z);
                    } else if (childAt instanceof hg3) {
                        ((hg3) childAt).d0(false, z);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean K(int r27, defpackage.mga r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nha.K(int, mga):boolean");
    }

    public final void K1(float f) {
        r7 r7Var = this.p0;
        if (r7Var == null) {
            return;
        }
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[1];
        float f2 = 0.0f;
        if (igaVar != null && igaVar.F == 11) {
            f2 = 0.0f + f;
        }
        int i = 0;
        iga igaVar2 = igaVarArr[0];
        if (igaVar2 != null && igaVar2.F == 11) {
            f2 += 1.0f - f;
        }
        r7Var.setAlpha(f2);
        float f3 = (0.15f * f2) + 0.85f;
        r7Var.setScaleX(f3);
        r7Var.setScaleY(f3);
        if (f2 <= 0.01f) {
            i = 8;
        }
        r7Var.setVisibility(i);
    }

    public final void L(int i, r59 r59Var, boolean z) {
        nga ngaVar;
        ArrayList arrayList = this.w1[i].e;
        int K0 = ((u46) r59Var.getLayoutManager()).K0();
        if (K0 >= 0) {
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    if (K0 <= ((nga) arrayList.get(i2)).b) {
                        ngaVar = (nga) arrayList.get(i2);
                        break;
                    }
                    i2++;
                } else {
                    ngaVar = null;
                    break;
                }
            }
            if (ngaVar == null) {
                ngaVar = (nga) b10.f(1, arrayList);
            }
            if (ngaVar != null) {
                v0(i, ngaVar.d, ngaVar.b + 1, z);
            }
        }
    }

    public final void L0() {
        z3b z3bVar;
        z3b z3bVar2;
        this.K1.a();
        xfa xfaVar = this.f0;
        if (xfaVar != null && (z3bVar2 = xfaVar.s) != null && z3bVar2 != null) {
            z3bVar2.z(xfaVar.w);
        }
        jea jeaVar = this.h0;
        if (jeaVar != null && (z3bVar = jeaVar.s) != null && z3bVar != null) {
            z3bVar.z(jeaVar.w);
        }
        for (mha mhaVar : this.m2.values()) {
            lha lhaVar = mhaVar.c;
            z3b z3bVar3 = lhaVar.s;
            if (z3bVar3 != null && z3bVar3 != null) {
                z3bVar3.z(lhaVar.w);
            }
        }
    }

    public final void L1() {
        float f;
        float f2;
        r7 r7Var = this.p0;
        if (r7Var == null) {
            return;
        }
        boolean z = true;
        iga igaVar = this.n0[1];
        if (igaVar == null || igaVar.F != 11) {
            z = false;
        }
        if (z) {
            r7Var.setVisibility(0);
        }
        ViewPropertyAnimator animate = r7Var.animate();
        float f3 = 1.0f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ViewPropertyAnimator alpha = animate.alpha(f);
        if (z) {
            f2 = 1.0f;
        } else {
            f2 = 0.85f;
        }
        ViewPropertyAnimator scaleX = alpha.scaleX(f2);
        if (!z) {
            f3 = 0.85f;
        }
        scaleX.scaleY(f3).withEndAction(new n28((byte) 12, this, z)).setDuration(420L).setInterpolator(d53.h).start();
    }

    public final void M() {
        iga[] igaVarArr;
        iga igaVar;
        boolean z;
        int i;
        y59 adapter;
        if (this.r1) {
            int i2 = 0;
            while (true) {
                igaVarArr = this.n0;
                if (i2 < igaVarArr.length) {
                    igaVar = igaVarArr[i2];
                    if (igaVar.F == this.s1) {
                        break;
                    }
                    i2++;
                } else {
                    igaVar = null;
                    break;
                }
            }
            if (igaVar != null) {
                boolean j0 = j0(igaVar.F);
                float f = this.q1;
                float f2 = 1.0f;
                int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                cha[] chaVarArr = this.w1;
                if (i3 == 0) {
                    this.r1 = false;
                    int i4 = this.t1;
                    int[] iArr = this.p1;
                    iArr[j0 ? 1 : 0] = i4;
                    if (!j0) {
                        gda.A(i4);
                    } else if (W(igaVar.F) >= 5) {
                        gda.E(this.t1);
                    }
                    for (int i5 = 0; i5 < igaVarArr.length; i5++) {
                        iga igaVar2 = igaVarArr[i5];
                        if (igaVar2 != null && igaVar2.h != null && (((i = igaVar2.F) == 0 || j0(i)) && (adapter = igaVarArr[i5].h.getAdapter()) != null)) {
                            int b = adapter.b();
                            if (i5 == 0) {
                                chaVarArr[0].g(false);
                            }
                            igaVarArr[i5].n.setVisibility(8);
                            igaVarArr[i5].x.x1(iArr[j0 ? 1 : 0]);
                            igaVarArr[i5].h.b0();
                            igaVarArr[i5].h.invalidate();
                            if (adapter.b() == b) {
                                gm.V3(igaVarArr[i5].h);
                            } else {
                                adapter.f();
                            }
                        }
                    }
                    if (this.s >= 0) {
                        for (int i6 = 0; i6 < igaVarArr.length; i6++) {
                            iga igaVar3 = igaVarArr[i6];
                            if (igaVar3.F == this.s1) {
                                View m = igaVar3.r.m(this.s);
                                if (m != null) {
                                    this.w = m.getTop();
                                }
                                iga igaVar4 = igaVarArr[i6];
                                igaVar4.x.g1(this.s, (-igaVar4.h.getPaddingTop()) + this.w);
                            }
                        }
                        return;
                    }
                    e1();
                } else if (f == 0.0f) {
                    this.r1 = false;
                    if (this.s1 == 0) {
                        chaVarArr[0].g(false);
                    }
                    igaVar.n.setVisibility(8);
                    igaVar.h.invalidate();
                } else {
                    if (f > 0.2f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        f2 = 0.0f;
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f, f2);
                    ofFloat.addUpdateListener(new jfa(this, igaVar, (byte) 0));
                    ofFloat.addListener(new er1(this, z, j0 ? 1 : 0, igaVar));
                    ofFloat.setInterpolator(d53.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void M0(int i, View view, k47 k47Var, int i2) {
        TLRPC.WebPage webPage;
        String str;
        char c;
        int i3;
        int i4;
        boolean z;
        if (k47Var != null && !this.r1) {
            oea oeaVar = this.c0;
            if (oeaVar == null || !oeaVar.f) {
                int i5 = 0;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                i5 = 0;
                String str2 = null;
                z3b z3bVar = null;
                if (this.F1) {
                    int i6 = 8;
                    if (i2 != 8 || p()) {
                        if (k47.B0(k47Var.k) == this.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        SparseArray[] sparseArrayArr = this.c1;
                        if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                            sparseArrayArr[c].remove(k47Var.e1());
                            if (!k47Var.s(null, false)) {
                                this.d1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c].put(k47Var.e1(), k47Var);
                                if (!k47Var.s(null, false)) {
                                    this.d1++;
                                }
                            } else {
                                return;
                            }
                        }
                        J0(sparseArrayArr[0]);
                        if (sparseArrayArr[0].size() == 0 && sparseArrayArr[1].size() == 0) {
                            l1(false);
                        } else {
                            j1(sparseArrayArr[1].size() + sparseArrayArr[0].size(), true);
                            if (this.d1 == 0) {
                                i3 = 0;
                            } else {
                                i3 = 8;
                            }
                            this.o0.setVisibility(i3);
                            r7 r7Var = this.x0;
                            if (r7Var != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14 && sparseArrayArr[0].size() == 1) {
                                    i4 = 0;
                                } else {
                                    i4 = 8;
                                }
                                r7Var.setVisibility(i4);
                            }
                            r7 r7Var2 = this.w0;
                            if (r7Var2 != null) {
                                if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                                    i6 = 0;
                                }
                                r7Var2.setVisibility(i6);
                            }
                            M1();
                        }
                        this.e1 = false;
                        if (view instanceof ida) {
                            ida idaVar = (ida) view;
                            if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                                z2 = true;
                            }
                            idaVar.b(z2, true);
                        } else if (view instanceof tha) {
                            tha thaVar = (tha) view;
                            if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            thaVar.b(0, z, true);
                        } else if (view instanceof lda) {
                            lda ldaVar = (lda) view;
                            if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                                z3 = true;
                            }
                            ldaVar.f(z3, true);
                        } else if (view instanceof eda) {
                            eda edaVar = (eda) view;
                            if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                                z4 = true;
                            }
                            edaVar.e(z4, true);
                        } else if (view instanceof lx2) {
                            lx2 lx2Var = (lx2) view;
                            if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                                z5 = true;
                            }
                            lx2Var.c(z5, true);
                        } else if (view instanceof sha) {
                            sha shaVar = (sha) view;
                            if (sparseArrayArr[c].indexOfKey(k47Var.e1()) >= 0) {
                                z6 = true;
                            }
                            shaVar.i(z6, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    uea ueaVar = this.u1;
                    cha[] chaVarArr = this.w1;
                    d dVar = this.y1;
                    if (i2 == 0) {
                        cha chaVar = chaVarArr[i2];
                        int i7 = i - chaVar.m;
                        if (i7 >= 0 && i7 < chaVar.a.size()) {
                            PhotoViewer.r0().T1(null, dVar, null);
                            PhotoViewer.r0().n1(chaVarArr[i2].a, i7, this.m1, this.f1, this.G, ueaVar);
                        }
                    } else if (i2 != 2 && i2 != 4) {
                        if (i2 == 5) {
                            PhotoViewer.r0().T1(null, dVar, null);
                            int indexOf = chaVarArr[i2].a.indexOf(k47Var);
                            if (indexOf < 0) {
                                PhotoViewer.r0().n1(td4.u(k47Var), 0, 0L, 0L, 0L, ueaVar);
                            } else {
                                PhotoViewer.r0().n1(chaVarArr[i2].a, indexOf, this.m1, this.f1, this.G, ueaVar);
                            }
                        } else if (i2 == 1) {
                            if (view instanceof ida) {
                                ida idaVar2 = (ida) view;
                                TLRPC.Document F0 = k47Var.F0();
                                if (idaVar2.H) {
                                    if (k47Var.x()) {
                                        PhotoViewer.r0().T1(null, dVar, null);
                                        int indexOf2 = chaVarArr[i2].a.indexOf(k47Var);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.r0().n1(td4.u(k47Var), 0, 0L, 0L, 0L, ueaVar);
                                            return;
                                        }
                                        PhotoViewer.r0().n1(chaVarArr[i2].a, indexOf2, this.m1, this.f1, this.G, ueaVar);
                                        return;
                                    }
                                    gm.q2(k47Var, dVar.getParentActivity(), dVar);
                                } else if (!idaVar2.G) {
                                    k47 message = idaVar2.getMessage();
                                    message.P = true;
                                    dVar.getFileLoader().X(F0, message, 0, 0);
                                    idaVar2.f(true);
                                } else {
                                    dVar.getFileLoader().f(F0);
                                    idaVar2.f(true);
                                }
                            }
                        } else if (i2 == 3) {
                            try {
                                if (k47.n1(k47Var.k) != null) {
                                    webPage = k47.n1(k47Var.k).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k47Var) == null) {
                                            dVar.createArticleViewer(false).L(k47Var, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        zv3.I0(dVar, k47Var, this.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((lda) view).F;
                                    if (arrayList.size() > 0) {
                                        str2 = ((CharSequence) arrayList.get(0)).toString();
                                    }
                                    str = str2;
                                }
                                if (str != null) {
                                    Y0(str);
                                }
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                        } else if (j0(i2)) {
                            kha v1 = v1(i2);
                            if (v1 != null) {
                                z3bVar = v1.s;
                            }
                            if (z3bVar != null) {
                                oab orCreateStoryViewer = dVar.getOrCreateStoryViewer();
                                Context context = getContext();
                                int e1 = k47Var.e1();
                                q4b a = q4b.a(this.n0[0].h);
                                a.e = new yf9(z3bVar, (byte) 19);
                                if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).s1) {
                                    i5 = gm.L(68.0f);
                                }
                                a.s += i5;
                                orCreateStoryViewer.G(context, e1, z3bVar, a);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof eda) {
                        ((eda) view).a();
                    }
                }
                E1();
            }
        }
    }

    public final void M1() {
        boolean z;
        int i;
        z3b z3bVar;
        boolean l0 = l0();
        r7 r7Var = this.z0;
        r7 r7Var2 = this.y0;
        int i2 = 8;
        if (l0) {
            if (r7Var2 != null) {
                r7Var2.setVisibility(8);
            }
            if (r7Var != null) {
                r7Var.setVisibility(8);
            }
        } else if (getClosestTab() == 9) {
            if (r7Var2 != null) {
                r7Var2.setVisibility(8);
            }
            if (r7Var != null) {
                r7Var.setVisibility(8);
            }
        } else if (getClosestTab() == 8) {
            int i3 = 0;
            while (true) {
                SparseArray[] sparseArrayArr = this.c1;
                if (i3 < sparseArrayArr[0].size()) {
                    k47 k47Var = (k47) sparseArrayArr[0].valueAt(i3);
                    xfa xfaVar = this.f0;
                    if (xfaVar != null && (z3bVar = xfaVar.s) != null && !z3bVar.m(k47Var.e1())) {
                        z = true;
                        break;
                    }
                    i3++;
                } else {
                    z = false;
                    break;
                }
            }
            if (r7Var2 != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                r7Var2.setVisibility(i);
            }
            if (r7Var != null) {
                if (!z) {
                    i2 = 0;
                }
                r7Var.setVisibility(i2);
            }
        } else if (t0(getClosestTab())) {
            if (r7Var2 != null) {
                r7Var2.setVisibility(8);
            }
            if (r7Var != null) {
                r7Var.setVisibility(8);
            }
        }
    }

    public final void N(int i) {
        ((WindowManager) org.telegram.messenger.a.b.getSystemService("window")).getDefaultDisplay().getRotation();
        if (i == 0) {
            if (!gm.O1() && org.telegram.messenger.a.b.getResources().getConfiguration().orientation == 2) {
                this.D0.setTextSize(18);
            } else {
                this.D0.setTextSize(20);
            }
        }
        if (i == 0) {
            this.K.f();
        }
    }

    public final boolean N0(k47 k47Var, View view, int i, boolean z) {
        oea oeaVar;
        char c;
        int i2;
        int i3;
        final TL_stories.StoryItem storyItem;
        xfa xfaVar;
        z3b z3bVar;
        if (!this.F1) {
            d dVar = this.y1;
            if (dVar.getParentActivity() != null && k47Var != null && ((oeaVar = this.c0) == null || !oeaVar.f)) {
                gm.t1(dVar.getParentActivity().getCurrentFocus());
                long j = this.m1;
                int i4 = 8;
                if (z && ((t0(getClosestTab()) || getClosestTab() == 8) && !this.F1)) {
                    if (view instanceof sha) {
                        sha shaVar = (sha) view;
                        shaVar.k(shaVar.n, shaVar.r, true);
                    }
                    TL_stories.StoryItem storyItem2 = k47Var.l;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean t0 = t0(getClosestTab());
                        bu5 J = bu5.J(dVar, view);
                        bu5 K = J.K();
                        K.b(2131231244, jb6.M0(2131753721, null), new bo1(J, (byte) 0), false);
                        K.j();
                        bu5.e(K, getStoriesController().A(j, true), hashSet, true, new hw9(this, storyItem2, J, (byte) 7), new jv0(this, hashSet, storyItem2, J, (byte) 21));
                        J.b(2131231770, jb6.M0(2131744494, null), new c20(J, K, (byte) 10), false);
                        J.j();
                        J.b(2131232363, jb6.M0(2131744478, null), new v36(this, k47Var, view, i, (byte) 29), false);
                        if (t0) {
                            int s1 = s1(getClosestTab());
                            String v = getStoriesController().v(s1, j);
                            J.b(2131232791, jb6.M0(2131744479, null), new sda(this, s1, (byte) 0), false);
                            storyItem = storyItem2;
                            J.b(2131232335, jb6.M0(2131744480, null), new tda(this, s1, storyItem, v, (byte) 0), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (xfaVar = this.f0) != null && (z3bVar = xfaVar.s) != null) {
                                if (z3bVar.m(storyItem.id)) {
                                    J.b(2131231005, jb6.M0(2131744476, null), new Runnable(this) {
                                        public final nha b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r3;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            nha nhaVar = this.b;
                                            switch (b) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nhaVar.I1, nhaVar.getContext());
                                                    String M0 = jb6.M0(2131751424, null);
                                                    he heVar = alertDialog$Builder.a;
                                                    heVar.S = M0;
                                                    heVar.U = jb6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.j(jb6.M0(2131751535, null), new bea(nhaVar, storyItem3));
                                                    alertDialog$Builder.g(jb6.M0(2131752542, null), new dq9((byte) 15));
                                                    heVar.show();
                                                    heVar.h();
                                                    return;
                                                case 1:
                                                    nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                    return;
                                                case 2:
                                                    nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                    return;
                                                default:
                                                    nhaVar.C0(storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                } else {
                                    J.b(2131231001, jb6.M0(2131744481, null), new Runnable(this) {
                                        public final nha b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r3;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            nha nhaVar = this.b;
                                            switch (b) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nhaVar.I1, nhaVar.getContext());
                                                    String M0 = jb6.M0(2131751424, null);
                                                    he heVar = alertDialog$Builder.a;
                                                    heVar.S = M0;
                                                    heVar.U = jb6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.j(jb6.M0(2131751535, null), new bea(nhaVar, storyItem3));
                                                    alertDialog$Builder.g(jb6.M0(2131752542, null), new dq9((byte) 15));
                                                    heVar.show();
                                                    heVar.h();
                                                    return;
                                                case 1:
                                                    nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                    return;
                                                case 2:
                                                    nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                    return;
                                                default:
                                                    nhaVar.C0(storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            J.b(2131232057, jb6.M0(2131744486, null), new Runnable(this) {
                                public final nha b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run() {
                                    byte b = r3;
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    nha nhaVar = this.b;
                                    switch (b) {
                                        case 0:
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nhaVar.I1, nhaVar.getContext());
                                            String M0 = jb6.M0(2131751424, null);
                                            he heVar = alertDialog$Builder.a;
                                            heVar.S = M0;
                                            heVar.U = jb6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                            alertDialog$Builder.j(jb6.M0(2131751535, null), new bea(nhaVar, storyItem3));
                                            alertDialog$Builder.g(jb6.M0(2131752542, null), new dq9((byte) 15));
                                            heVar.show();
                                            heVar.h();
                                            return;
                                        case 1:
                                            nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                            return;
                                        case 2:
                                            nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                            return;
                                        default:
                                            nhaVar.C0(storyItem3);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        J.b(2131232114, jb6.M0(2131751535, null), new Runnable(this) {
                            public final nha b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b = r3;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                nha nhaVar = this.b;
                                switch (b) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nhaVar.I1, nhaVar.getContext());
                                        String M0 = jb6.M0(2131751424, null);
                                        he heVar = alertDialog$Builder.a;
                                        heVar.S = M0;
                                        heVar.U = jb6.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.j(jb6.M0(2131751535, null), new bea(nhaVar, storyItem3));
                                        alertDialog$Builder.g(jb6.M0(2131752542, null), new dq9((byte) 15));
                                        heVar.show();
                                        heVar.h();
                                        return;
                                    case 1:
                                        nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        return;
                                    case 2:
                                        nhaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        return;
                                    default:
                                        nhaVar.C0(storyItem3);
                                        return;
                                }
                            }
                        }, true);
                        J.i = (byte) 3;
                        J.u = true;
                        J.v = true;
                        J.L = true;
                        J.M = (byte) 3;
                        Point point = gm.q;
                        int min = Math.min((int) (Math.min(point.x, point.y) * 0.6777f), (int) (((Math.max(point.x, point.y) * 0.4333f) * 3.0f) / 4.0f));
                        J.N = min;
                        J.O = (min << 2) / 3;
                        J.t = true;
                        J.S = true;
                        J.Z = true;
                        J.a0();
                        return true;
                    }
                } else {
                    if (k47.B0(k47Var.k) == j) {
                        c = 0;
                    } else {
                        c = 1;
                    }
                    SparseArray[] sparseArrayArr = this.c1;
                    sparseArrayArr[c].put(k47Var.e1(), k47Var);
                    if (!k47Var.s(null, false)) {
                        this.d1++;
                    }
                    if (this.d1 == 0) {
                        i2 = 0;
                    } else {
                        i2 = 8;
                    }
                    this.o0.setVisibility(i2);
                    r7 r7Var = this.x0;
                    if (r7Var != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i3 = 0;
                        } else {
                            i3 = 8;
                        }
                        r7Var.setVisibility(i3);
                    }
                    r7 r7Var2 = this.w0;
                    if (r7Var2 != null) {
                        if (getClosestTab() != 8 && getClosestTab() != 13 && getClosestTab() != 14) {
                            i4 = 0;
                        }
                        r7Var2.setVisibility(i4);
                    }
                    j1(1, false);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        ArrayList arrayList3 = this.Q0;
                        if (i5 >= arrayList3.size()) {
                            break;
                        }
                        View view2 = (View) arrayList3.get(i5);
                        gm.y(view2);
                        arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                        i5++;
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.e1 = false;
                    if (view instanceof ida) {
                        ((ida) view).b(true, true);
                    } else if (view instanceof tha) {
                        ((tha) view).b(i, true, true);
                    } else if (view instanceof lda) {
                        ((lda) view).f(true, true);
                    } else if (view instanceof eda) {
                        ((eda) view).e(true, true);
                    } else if (view instanceof lx2) {
                        ((lx2) view).c(true, true);
                    } else if (view instanceof sha) {
                        ((sha) view).i(true, true);
                    }
                    if (!this.F1) {
                        l1(true);
                    }
                    J0(sparseArrayArr[0]);
                    E1();
                    return true;
                }
            }
        }
        return false;
    }

    public void N1(boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nha.N1(boolean):void");
    }

    public final String O(boolean z) {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        kea keaVar;
        if (!l0()) {
            return jb6.M0(2131752970, null);
        }
        if (z && (keaVar = this.a0) != null) {
            return keaVar.getBotPreviewsSubtitle();
        }
        xfa xfaVar = this.f0;
        if (xfaVar != null && xfaVar.s != null) {
            i = 0;
            i2 = 0;
            for (int i3 = 0; i3 < xfaVar.s.i.size(); i3++) {
                k47 k47Var = (k47) xfaVar.s.i.get(i3);
                TL_stories.StoryItem storyItem = k47Var.l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (k47.J4(messageMedia.document)) {
                        i2++;
                    } else if (k47Var.l.media.photo != null) {
                        i++;
                    }
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return jb6.M0(2131752970, null);
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(jb6.G(i, "Images", new Object[0]));
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(jb6.G(i2, "Videos", new Object[0]));
        }
        return sb.toString();
    }

    public boolean O0(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return false;
    }

    public final Boolean O1(View view, View view2) {
        if (!this.r1) {
            iga[] igaVarArr = this.n0;
            boolean z = false;
            iga igaVar = igaVarArr[0];
            if (igaVar != null) {
                int i = igaVar.F;
                this.s1 = i;
                boolean j0 = j0(i);
                int[] iArr = this.p1;
                int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], true);
                if (view != null && R == R(j0 ? 1 : 0, R, true)) {
                    view.setEnabled(false);
                    view.animate().alpha(0.5f).start();
                }
                if (iArr[j0 ? 1 : 0] != R) {
                    if (view2 != null && !view2.isEnabled()) {
                        view2.setEnabled(true);
                        view2.animate().alpha(1.0f).start();
                    }
                    if (!j0) {
                        gda.A(R);
                    } else if (W(igaVarArr[0].F) >= 5 || t0(igaVarArr[0].F)) {
                        gda.E(R);
                    }
                    l(R);
                }
                if (R != R(j0 ? 1 : 0, R, true)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            return null;
        }
        return null;
    }

    public final iga P(int i) {
        int i2 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i2 < igaVarArr.length) {
                iga igaVar = igaVarArr[i2];
                if (igaVar != null && igaVar.F == i) {
                    return igaVar;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    public final void P0(float f) {
        iga igaVar;
        int i;
        int i2;
        iga igaVar2;
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        iga[] igaVarArr = this.n0;
        if (i3 != 0 || igaVarArr[1].getVisibility() == 0) {
            if (this.k1) {
                igaVarArr[0].setTranslationX((-f) * igaVar2.getMeasuredWidth());
                igaVarArr[1].setTranslationX(igaVarArr[0].getMeasuredWidth() - (igaVarArr[0].getMeasuredWidth() * f));
            } else {
                igaVarArr[0].setTranslationX(igaVar.getMeasuredWidth() * f);
                igaVarArr[1].setTranslationX((igaVarArr[0].getMeasuredWidth() * f) - igaVarArr[0].getMeasuredWidth());
            }
            T0(getTabProgress());
            float U = U(f);
            this.s0 = U;
            int i4 = 4;
            if (U != 0.0f && q() && !k0()) {
                i = 0;
            } else {
                i = 4;
            }
            this.u0.setVisibility(i);
            r7 r7Var = this.q0;
            if (r7Var != null && !q()) {
                if (s0()) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                setSearchItemVisibility(i2);
                this.r0 = 0.0f;
            } else {
                this.r0 = V(f);
                L1();
            }
            G1(false);
            if (i3 == 0) {
                iga igaVar3 = igaVarArr[0];
                igaVarArr[0] = igaVarArr[1];
                igaVarArr[1] = igaVar3;
                igaVar3.setVisibility(8);
                if (r7Var != null && this.A0 == 2) {
                    if (s0()) {
                        i4 = 8;
                    }
                    setSearchItemVisibility(i4);
                }
                this.A0 = (byte) 0;
                q1();
            }
        }
    }

    public final Boolean P1(View view, View view2) {
        if (!this.r1) {
            iga[] igaVarArr = this.n0;
            boolean z = false;
            iga igaVar = igaVarArr[0];
            if (igaVar != null) {
                if (!this.n1 || !j0(igaVar.F)) {
                    int i = igaVarArr[0].F;
                    this.s1 = i;
                    boolean j0 = j0(i);
                    int[] iArr = this.p1;
                    int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], false);
                    if (view2 != null && R == R(j0 ? 1 : 0, R, false)) {
                        view2.setEnabled(false);
                        view2.animate().alpha(0.5f).start();
                    }
                    if (iArr[j0 ? 1 : 0] != R) {
                        if (view != null && !view.isEnabled()) {
                            view.setEnabled(true);
                            view.animate().alpha(1.0f).start();
                        }
                        if (!j0) {
                            gda.A(R);
                        } else if (W(igaVarArr[0].F) >= 5 || t0(igaVarArr[0].F)) {
                            gda.E(R);
                        }
                        l(R);
                    }
                    if (R != R(j0 ? 1 : 0, R, false)) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public final int R(int i, int i2, boolean z) {
        int i3;
        int i4 = 1;
        if (!z) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        int i5 = i2 + i3;
        if (i5 > 6) {
            if (!z) {
                i5 = 9;
            } else {
                i5 = 6;
            }
        }
        return Utilities.j(i5, 9, (this.n1 && i == 1) ? 2 : 2);
    }

    public final int S(boolean z) {
        int i;
        int i2 = this.b2 + this.f2;
        if (z) {
            i = gm.L(52.0f);
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public void S0() {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        if (!s0() && !k0()) {
            z = false;
        } else {
            z = true;
        }
        iha ihaVar = this.h0.x;
        if (ihaVar != null) {
            if (z && getClosestTab() == 9) {
                z4 = true;
            } else {
                z4 = false;
            }
            ihaVar.b(z4);
        }
        iha ihaVar2 = this.f0.x;
        if (ihaVar2 != null) {
            if (z && getClosestTab() == 8) {
                z3 = true;
            } else {
                z3 = false;
            }
            ihaVar2.b(z3);
        }
        for (mha mhaVar : this.m2.values()) {
            lha lhaVar = mhaVar.c;
            if (lhaVar.s != null) {
                iha ihaVar3 = lhaVar.x;
                if (z && getClosestTab() == mhaVar.a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ihaVar3.b(z2);
            }
        }
        r7 r7Var = this.q0;
        if (r7Var != null) {
            hfa hfaVar = this.M0;
            if (hfaVar != null && hfaVar.a() && getSelectedTab() == 11) {
                i = 2131745602;
            } else {
                i = 2131745570;
            }
            r7Var.setSearchFieldHint(jb6.M0(i, null));
        }
        C();
        B(true, true);
    }

    public final int T(int i) {
        int i2;
        int i3 = this.d2 + this.e2;
        int X = X(i) + gm.L(54.0f) + i3 + this.p2;
        if (i == 9) {
            i2 = gm.L(64.0f);
        } else {
            i2 = 0;
        }
        return X + i2;
    }

    public void T0(float f) {
        K0();
    }

    public final float U(float f) {
        float f2 = 0.0f;
        if (k0()) {
            return 0.0f;
        }
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[1];
        if (igaVar != null && f0(igaVar.F)) {
            f2 = 0.0f + f;
        }
        iga igaVar2 = igaVarArr[0];
        if (igaVar2 != null && f0(igaVar2.F)) {
            return (1.0f - f) + f2;
        }
        return f2;
    }

    public final void U0(int i, long j, d dVar) {
        new s0a(dVar, j, this.p1[1], new js7(this, j, i, (byte) 1)).show();
    }

    public final float V(float f) {
        float f2 = 0.0f;
        if (k0()) {
            return 0.0f;
        }
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[1];
        if (igaVar != null && p0(igaVar.F) && igaVarArr[1].F != 11) {
            f2 = 0.0f + f;
        }
        iga igaVar2 = igaVarArr[0];
        if (igaVar2 != null && p0(igaVar2.F) && igaVarArr[0].F != 11) {
            return (1.0f - f) + f2;
        }
        return f2;
    }

    public final void V0(int i, long j, d dVar) {
        ik.s0(dVar, jb6.M0(2131751535, null), gm.S2(jb6.a0(null, null, 2131744484, getStoriesController().v(i, j))), jb6.M0(2131751535, null), true, new gc2(this, j, i, (byte) 5));
    }

    public final int W(int i) {
        kha v1;
        z3b z3bVar;
        if (j0(i) && (v1 = v1(i)) != null && (z3bVar = v1.s) != null) {
            return z3bVar.g();
        }
        return 0;
    }

    public final void W0(int i, long j, d dVar) {
        String v = getStoriesController().v(i, j);
        Context context = dVar.getContext();
        ylb resourceProvider = dVar.getResourceProvider();
        hg hgVar = new hg(this, j, i, (byte) 6);
        Pattern pattern = ik.a;
        ik.O(context, dVar, jb6.M0(2131744471, null), jb6.M0(2131744470, null), jb6.M0(2131744469, null), v, 12, jb6.M0(2131746011, null), resourceProvider, hgVar);
    }

    public final int X(int i) {
        float f;
        oea oeaVar = this.c0;
        if (oeaVar != null && (t0(i) || i == 8)) {
            f = oeaVar.getVisibilityFactor() * gm.L(40.0f);
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    public final void X0(int i, boolean z) {
        iga[] igaVarArr = this.n0;
        if (igaVarArr[0].F == i) {
            return;
        }
        iga igaVar = igaVarArr[1];
        igaVar.F = i;
        igaVar.setVisibility(0);
        g0();
        z1(true);
        this.k1 = z;
        S0();
        j(!p0(i));
        G1(true);
    }

    public final void Y0(String str) {
        boolean D3 = gm.D3(str);
        d dVar = this.y1;
        if (D3) {
            ik.n0(dVar, str, true, true);
        } else {
            l11.u(dVar.getParentActivity(), str);
        }
    }

    public int Z0() {
        return -1;
    }

    public final float a0(int i, boolean z) {
        float width = getWidth();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i2 >= igaVarArr.length) {
                break;
            }
            iga igaVar = igaVarArr[i2];
            if (igaVar != null) {
                int i4 = igaVar.F;
                if ((z && i == 8 && t0(i4)) || i4 == i) {
                    i3++;
                    width = igaVarArr[i2].getTranslationX();
                }
            }
            i2++;
        }
        if (i3 == 2) {
            return 0.0f;
        }
        return width;
    }

    public final void a1(ArrayList arrayList, boolean z) {
        boolean z2;
        boolean z3;
        xfa xfaVar = this.f0;
        if (xfaVar != null && xfaVar.s != null) {
            d dVar = this.y1;
            if (z && arrayList.size() > dVar.getMessagesController().l4.p2.f()) {
                b10.u(jb6.G(dVar.getMessagesController().l4.p2.f(), "StoriesPinLimit", new Object[0]), c41.b0(dVar), 2131623982, 36);
                return;
            }
            z3b z3bVar = xfaVar.s;
            int i = z3bVar.c;
            ArrayList arrayList2 = z3bVar.g;
            ArrayList arrayList3 = new ArrayList(arrayList2);
            boolean z4 = true;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Integer num = (Integer) arrayList.get(size);
                num.getClass();
                if (z) {
                    if (!arrayList3.contains(num)) {
                        arrayList3.add(0, num);
                    }
                } else if (arrayList3.contains(num)) {
                    arrayList3.remove(num);
                }
            }
            if (arrayList3.size() > oc7.r1(i).l4.p2.f()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (arrayList2.size() != arrayList3.size()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i2) != arrayList3.get(i2)) {
                            z3 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (z3) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList3);
                    z3bVar.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = oc7.r1(i).i1(z3bVar.d);
                    ConnectionsManager.getInstance(i).sendRequest(tL_togglePinnedToTop, new nf2((byte) 10));
                }
                z4 = z2;
            }
            if (z4) {
                b10.u(jb6.G(dVar.getMessagesController().l4.p2.f(), "StoriesPinLimit", new Object[0]), c41.b0(dVar), 2131623982, 36);
            } else if (z) {
                c41.b0(dVar).I(2131624055, gm.S2(jb6.G(arrayList.size(), "StoriesPinned", new Object[0])), jb6.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
            } else {
                b10.u(jb6.G(arrayList.size(), "StoriesUnpinned", new Object[0]), c41.b0(dVar), 2131624061, 36);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.Bi));
        hashSet.add(Integer.valueOf(cmb.c6));
        hashSet.add(Integer.valueOf(cmb.zi));
        hashSet.add(Integer.valueOf(cmb.Ai));
        hashSet.add(Integer.valueOf(cmb.J6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.rj));
        hashSet.add(Integer.valueOf(cmb.yi));
        hashSet.add(Integer.valueOf(cmb.z6));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.Y8));
        hashSet.add(Integer.valueOf(cmb.W8));
        hashSet.add(Integer.valueOf(cmb.x6));
        hashSet.add(Integer.valueOf(cmb.l6));
        hashSet.add(Integer.valueOf(cmb.ki));
        hashSet.add(Integer.valueOf(cmb.d7));
        hashSet.add(Integer.valueOf(cmb.e7));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.w7));
        hashSet.add(Integer.valueOf(cmb.s7));
        hashSet.add(Integer.valueOf(cmb.v7));
        hashSet.add(Integer.valueOf(cmb.ae));
        hashSet.add(Integer.valueOf(cmb.md));
    }

    public final float b0(int i, boolean z) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i2 < igaVarArr.length) {
                iga igaVar = igaVarArr[i2];
                if (igaVar != null) {
                    int i3 = igaVar.F;
                    if ((z && i == 8 && t0(i3)) || i3 == i) {
                        f = (1.0f - Math.abs(igaVarArr[i2].getTranslationX() / getWidth())) + f;
                    }
                }
                i2++;
            } else {
                return f;
            }
        }
    }

    public final boolean b1(MotionEvent motionEvent, boolean z) {
        int i;
        iga igaVar;
        kea keaVar;
        int i2;
        int i3;
        int closestTab = getClosestTab();
        kfa kfaVar = this.L0;
        SparseIntArray sparseIntArray = kfaVar.P;
        int i4 = kfaVar.n;
        int i5 = -1;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        int i6 = sparseIntArray.get(i4 + i, -1);
        oea oeaVar = this.c0;
        if (oeaVar != null) {
            if (!t0(closestTab) && closestTab != 8) {
                if (t0(i6) || i6 == 8) {
                    i5 = oeaVar.getCurrentAlbumId();
                }
            } else {
                vgc vgcVar = oeaVar.b;
                SparseIntArray sparseIntArray2 = vgcVar.c0;
                int i7 = vgcVar.G;
                if (z) {
                    i3 = 1;
                } else {
                    i3 = -1;
                }
                i5 = sparseIntArray2.get(i7 + i3, -1);
            }
            if (i5 == 0) {
                i6 = 8;
            } else if (i5 > 0) {
                i6 = t1(i5).a;
            }
        }
        if (i6 >= 0) {
            if (this.q0 != null && !q()) {
                if (s0()) {
                    i2 = 8;
                } else {
                    i2 = 4;
                }
                setSearchItemVisibility(i2);
                this.r0 = 0.0f;
            } else {
                this.r0 = V(0.0f);
                K1(0.0f);
            }
            if ((!this.Y0 || getSelectedTab() != 11) && (!p() || !this.F1 || (getClosestTab() != 8 && !t0(getClosestTab())))) {
                iga[] igaVarArr = this.n0;
                iga igaVar2 = igaVarArr[0];
                if (igaVar2 != null && igaVar2.F == 13 && (keaVar = this.a0) != null) {
                    ur0 ur0Var = keaVar.n;
                    if (!z) {
                    }
                }
                iga igaVar3 = igaVarArr[0];
                lea leaVar = this.b0;
                if (igaVar3 != null && igaVar3.F == 14 && leaVar != null) {
                    ur0 ur0Var2 = leaVar.h;
                    if (!z) {
                    }
                }
                if ((!this.F1 || (igaVar = igaVarArr[0]) == null || igaVar.F != 13) && ((leaVar == null || !leaVar.g()) && (oeaVar == null || !oeaVar.f))) {
                    G1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    g0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    kfaVar.setEnabled(false);
                    iga igaVar4 = igaVarArr[1];
                    igaVar4.F = i6;
                    igaVar4.setVisibility(0);
                    this.k1 = z;
                    z1(true);
                    if (z) {
                        igaVarArr[1].setTranslationX(igaVarArr[0].getMeasuredWidth());
                    } else {
                        igaVarArr[1].setTranslationX(-igaVarArr[0].getMeasuredWidth());
                    }
                    T0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final int c0(int i) {
        ylb ylbVar = this.I1;
        if (ylbVar != null) {
            return ylbVar.h(i);
        }
        return cmb.w0(null, i, false);
    }

    public final boolean d0() {
        if (this.y1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final void d1(y59 y59Var) {
        if (y59Var instanceof hha) {
            ArrayList arrayList = this.H0;
            ArrayList arrayList2 = this.I0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (y59Var == this.P) {
            ArrayList arrayList3 = this.J0;
            ArrayList arrayList4 = this.K0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            wga wgaVar = this.Q;
            if (y59Var == wgaVar) {
                wgaVar.r = null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nha.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        kfa kfaVar = this.L0;
        if (kfaVar != null) {
            canvas.save();
            canvas.translate(kfaVar.getX(), kfaVar.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        gfa gfaVar = this.U0;
        if (gfaVar != null) {
            int i = gfaVar.U;
            if ((i == 3 || i == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(gfaVar.getX(), gfaVar.getY());
                gfaVar.setDrawOverlay(true);
                gfaVar.draw(canvas);
                gfaVar.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        if (this.c2 && (view instanceof iga) && this.g2 < this.e2) {
            canvas.save();
            canvas.clipRect(0, -this.g2, getWidth(), getHeight() + this.f2);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        } else if (view == this.U0 && this.S0 == null) {
            canvas.save();
            iga[] igaVarArr = this.n0;
            float top = igaVarArr[0].getTop();
            oea oeaVar = this.c0;
            if (oeaVar != null && ((i = igaVarArr[0].F) == 8 || t0(i))) {
                top -= oeaVar.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + gm.L(12.0f));
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j);
        }
    }

    public final void e(View view) {
        iga[] igaVarArr = this.n0;
        addView(view, Math.max(indexOfChild(igaVarArr[0]), indexOfChild(igaVarArr[1])) + 1, qoe.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final boolean e0() {
        SparseArray[] sparseArrayArr;
        k47 k47Var;
        TLRPC.Message message;
        boolean z = false;
        for (int i = 1; i >= 0; i--) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (true) {
                sparseArrayArr = this.c1;
                if (i2 >= sparseArrayArr[i].size()) {
                    break;
                }
                arrayList.add(Integer.valueOf(sparseArrayArr[i].keyAt(i2)));
                i2++;
            }
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                Object obj = arrayList.get(i3);
                i3++;
                Integer num = (Integer) obj;
                if (num.intValue() > 0 && (k47Var = (k47) sparseArrayArr[i].get(num.intValue())) != null && (message = k47Var.k) != null && message.noforwards) {
                    z = true;
                    break;
                }
            }
            if (z) {
                return z;
            }
        }
        return z;
    }

    public final void e1() {
        int i;
        int i2 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i2 < igaVarArr.length) {
                sea seaVar = igaVarArr[i2].h;
                if (seaVar != null) {
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < seaVar.getChildCount(); i5++) {
                        View childAt = seaVar.getChildAt(i5);
                        if (childAt instanceof sha) {
                            sha shaVar = (sha) childAt;
                            int messageId = shaVar.getMessageId();
                            i4 = shaVar.getTop();
                            i3 = messageId;
                        }
                        if (childAt instanceof ida) {
                            ida idaVar = (ida) childAt;
                            int e1 = idaVar.getMessage().e1();
                            i4 = idaVar.getTop();
                            i3 = e1;
                        }
                        if (childAt instanceof eda) {
                            eda edaVar = (eda) childAt;
                            i3 = edaVar.getMessage().e1();
                            i4 = edaVar.getTop();
                        }
                        if (i3 != 0) {
                            break;
                        }
                    }
                    if (i3 != 0) {
                        int i6 = igaVarArr[i2].F;
                        int i7 = -1;
                        if (j0(i6)) {
                            kha v1 = v1(i6);
                            if (v1 != null && v1.s != null) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= v1.s.i.size()) {
                                        break;
                                    } else if (i3 == ((k47) v1.s.i.get(i8)).e1()) {
                                        i7 = i8;
                                        break;
                                    } else {
                                        i8++;
                                    }
                                }
                            }
                            i = i7;
                        } else if (i6 >= 0) {
                            cha[] chaVarArr = this.w1;
                            if (i6 < chaVarArr.length) {
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= chaVarArr[i6].a.size()) {
                                        break;
                                    } else if (i3 == ((k47) chaVarArr[i6].a.get(i9)).e1()) {
                                        i7 = i9;
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                                i = chaVarArr[i6].m + i7;
                            }
                        }
                        if (i7 >= 0) {
                            ((u46) seaVar.getLayoutManager()).g1(i, (-igaVarArr[i2].h.getPaddingTop()) + i4);
                            if (this.r1) {
                                iga igaVar = igaVarArr[i2];
                                igaVar.r.g1(i, (-igaVar.h.getPaddingTop()) + i4);
                            }
                        }
                    }
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final SpannableStringBuilder f() {
        if (this.a2 == null) {
            this.a2 = new SpannableStringBuilder();
            boolean l0 = l0();
            SpannableStringBuilder spannableStringBuilder = this.a2;
            if (l0) {
                spannableStringBuilder.append((CharSequence) jb6.M0(2131746435, null));
            } else {
                spannableStringBuilder.append((CharSequence) "c");
                this.a2.setSpan(new pn2(2131231149, 0), 0, 1, 33);
                this.a2.append((CharSequence) "  ").append((CharSequence) jb6.M0(2131744498, null));
            }
        }
        return this.a2;
    }

    public final boolean f0(int i) {
        if (i != 0) {
            if (((i != 8 && !t0(i)) || !TextUtils.isEmpty(getStoriesHashtag())) && i != 9 && i != 11 && i != 13) {
                if (i != 14 || this.b0 == null) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void f1(int i) {
        kfa kfaVar;
        if (!this.P1 && (kfaVar = this.L0) != null) {
            kfaVar.g(null, i, kfaVar.Q.get(i));
        }
    }

    public final void g(mga mgaVar, d dVar, long j, int i) {
        String K;
        if (j > 0) {
            K = m9c.p(oc7.r1(dVar.getCurrentAccount()).W1(Long.valueOf(j)));
        } else {
            K = sd2.K(oc7.r1(dVar.getCurrentAccount()).L0(Long.valueOf(-j)), false);
        }
        if (K == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        kt6.v(sb, oc7.r1(dVar.getCurrentAccount()).N2, "/", K, "/a/");
        sb.append(i);
        String sb2 = sb.toString();
        mgaVar.c0(2131231762, new hw9(this, sb2, dVar, (byte) 8), jb6.M0(2131744477, null), false, true);
    }

    public final void g0() {
        gm.r(this.P0);
        cm1 cm1Var = this.N0;
        if (cm1Var.getTag() == null) {
            return;
        }
        cm1Var.setTag(null);
        AnimatorSet animatorSet = this.O0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.O0.playTogether(ObjectAnimator.ofFloat(cm1Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(cm1Var, View.TRANSLATION_Y, (-gm.L(48.0f)) + this.R0));
        this.O0.setInterpolator(d53.g);
        this.O0.addListener(new nfa(this, (byte) 0));
        this.O0.start();
    }

    public final void g1(float f, int i) {
        int i2;
        kfa kfaVar = this.L0;
        if (kfaVar != null) {
            if (t0(i)) {
                i2 = 8;
            } else {
                i2 = i;
            }
            kfaVar.i(f, i2);
        }
        oea oeaVar = this.c0;
        if (oeaVar != null) {
            vgc vgcVar = oeaVar.b;
            if (t0(i)) {
                vgcVar.g(f, s1(i));
            } else if (i == 8) {
                vgcVar.g(f, 0);
            }
        }
    }

    public SparseArray<k47> getActionModeSelected() {
        return this.c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        iga igaVar;
        iga igaVar2;
        boolean z;
        boolean z2;
        z3b z3bVar;
        z3b z3bVar2;
        float f = 1.0f;
        iga[] igaVarArr = this.n0;
        if (igaVarArr != null && (igaVar = igaVarArr[0]) != null && (igaVar2 = igaVarArr[1]) != null && igaVar.w != null && igaVar2.w != null) {
            int i = igaVar.F;
            int i2 = igaVar2.F;
            if (!t0(i) && i != 8) {
                z = false;
            } else {
                z = true;
            }
            if (!t0(i2) && i2 != 8) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                float visibilityFactor = 1.0f - igaVarArr[0].w.getVisibilityFactor();
                float visibilityFactor2 = 1.0f - igaVarArr[1].w.getVisibilityFactor();
                kha v1 = v1(igaVarArr[0].F);
                if (i == 8 || (v1 != null && (z3bVar2 = v1.s) != null && z3bVar2.g() > 0)) {
                    visibilityFactor = 1.0f;
                }
                kha v12 = v1(i2);
                if (i2 != 8 && (v12 == null || (z3bVar = v12.s) == null || z3bVar.g() <= 0)) {
                    f = visibilityFactor2;
                }
                if (!z) {
                    visibilityFactor = f;
                }
                if (!z2) {
                    f = visibilityFactor;
                }
                return gm.R1(visibilityFactor, f, Math.abs(igaVarArr[0].getTranslationX() / igaVarArr[0].getMeasuredWidth()));
            }
        }
        return 1.0f;
    }

    public int getClosestTab() {
        iga[] igaVarArr = this.n0;
        iga igaVar = igaVarArr[1];
        if (igaVar != null && igaVar.getVisibility() == 0) {
            if (this.j1 && !this.l1) {
                return igaVarArr[1].F;
            }
            if (Math.abs(igaVarArr[1].getTranslationX()) < igaVarArr[1].getMeasuredWidth() / 2.0f) {
                return igaVarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public r59 getCurrentListView() {
        vfa vfaVar;
        iga igaVar = this.n0[0];
        int i = igaVar.F;
        if (i == 13) {
            return this.a0.getCurrentListView();
        }
        if (i == 14) {
            return this.b0.getCurrentListView();
        }
        if (i == 12 && (vfaVar = this.W) != null) {
            return vfaVar.a.A0;
        }
        return igaVar.h;
    }

    public int getInitialTab() {
        return 0;
    }

    public int getPhotosVideosTypeFilter() {
        return this.w1[0].q;
    }

    public TextView getSaveItem() {
        return this.t0;
    }

    public r7 getSearchItem() {
        return this.q0;
    }

    public s09 getSearchOptionsItem() {
        return this.v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        oea oeaVar = this.c0;
        if (oeaVar != null && currentTabId == 8) {
            int currentAlbumId = oeaVar.getCurrentAlbumId();
            if (currentAlbumId == 0) {
                return 8;
            }
            if (currentAlbumId > 0) {
                return t1(currentAlbumId).a;
            }
        }
        return currentTabId;
    }

    public TL_stories.MediaArea getStoriesArea() {
        return null;
    }

    public String getStoriesHashtag() {
        return null;
    }

    public String getStoriesHashtagUsername() {
        return null;
    }

    @Deprecated
    public float getTabProgress() {
        float f = 0.0f;
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i < igaVarArr.length) {
                iga igaVar = igaVarArr[i];
                if (igaVar != null) {
                    f = ((1.0f - Math.abs(igaVar.getTranslationX() / getWidth())) * igaVar.F) + f;
                }
                i++;
            } else {
                return f;
            }
        }
    }

    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        arrayList.add(new cnb(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.y6));
        int i = cmb.y8;
        arrayList.add(new cnb(this.o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        r7 r7Var = this.x0;
        if (r7Var != null) {
            arrayList.add(new cnb(r7Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        }
        r7 r7Var2 = this.w0;
        if (r7Var2 != null) {
            arrayList.add(new cnb(r7Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        }
        Drawable[] drawableArr = {this.G0};
        int i2 = cmb.x8;
        ImageView imageView = this.F0;
        arrayList.add(new cnb(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (bnb) null, i2));
        arrayList.add(new cnb(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.c6));
        arrayList.add(new cnb(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (bnb) null, cmb.wi));
        kfa kfaVar = this.L0;
        arrayList.add(new cnb(kfaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.vi));
        arrayList.add(new cnb(kfaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.ui));
        arrayList.add(new cnb(kfaVar.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (bnb) null, cmb.xi));
        gfa gfaVar = this.U0;
        if (gfaVar != null) {
            arrayList.add(new cnb(gfaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (bnb) null, cmb.u7));
            arrayList.add(new cnb(gfaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (bnb) null, cmb.t7));
            arrayList.add(new cnb(gfaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (bnb) null, cmb.x7));
            arrayList.add(new cnb(gfaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (bnb) null, cmb.z7));
        }
        final int i3 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i3 < igaVarArr.length) {
                bnb bnbVar = new bnb() {
                    @Override
                    public final void b() {
                        iga[] igaVarArr2 = nha.this.n0;
                        int i4 = i3;
                        sea seaVar = igaVarArr2[i4].h;
                        if (seaVar != null) {
                            int childCount = seaVar.getChildCount();
                            for (int i5 = 0; i5 < childCount; i5++) {
                                View childAt = igaVarArr2[i4].h.getChildAt(i5);
                                if (childAt instanceof tha) {
                                    tha thaVar = (tha) childAt;
                                    for (int i6 = 0; i6 < 6; i6++) {
                                        thaVar.a[i6].e.invalidate();
                                    }
                                } else if (childAt instanceof ut8) {
                                    ((ut8) childAt).y(0);
                                } else if (childAt instanceof w8c) {
                                    ((w8c) childAt).i(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f) {
                    }
                };
                arrayList.add(new cnb(igaVarArr[i3].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.r8));
                arrayList.add(new cnb(igaVarArr[i3].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.h6));
                arrayList.add(new cnb(igaVarArr[i3].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
                int i4 = cmb.g6;
                arrayList.add(new cnb(igaVarArr[i3].h, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, i4));
                arrayList.add(new cnb(igaVarArr[i3].h, 0, new Class[]{w8c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, bnbVar, cmb.m6));
                arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.N7));
                arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.O7));
                arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.P7));
                arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.Q7));
                arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.R7));
                arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.S7));
                arrayList.add(new cnb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, bnbVar, cmb.T7));
                int i5 = cmb.h7;
                arrayList.add(new cnb(igaVarArr[i3].h, 8192, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i5));
                int i6 = cmb.j7;
                arrayList.add(new cnb(igaVarArr[i3].h, 16384, new Class[]{ida.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i6));
                arrayList.add(new cnb(igaVarArr[i3].h, 8, new Class[]{ida.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (bnb) null, cmb.pj));
                arrayList.add(new cnb(igaVarArr[i3].h, 0, new Class[]{pa6.class}, new String[]{"progressBar"}, (Drawable[]) null, (bnb) null, i4));
                arrayList.add(new cnb(igaVarArr[i3].h, 8192, new Class[]{eda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i5));
                arrayList.add(new cnb(igaVarArr[i3].h, 16384, new Class[]{eda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i6));
                arrayList.add(new cnb(igaVarArr[i3].h, 8192, new Class[]{lda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i5));
                arrayList.add(new cnb(igaVarArr[i3].h, 16384, new Class[]{lda.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i6));
                arrayList.add(new cnb(igaVarArr[i3].h, 8192, new Class[]{tha.class}, (Paint) null, (Drawable[]) null, bnbVar, i5));
                arrayList.add(new cnb(igaVarArr[i3].h, 16384, new Class[]{tha.class}, (Paint) null, (Drawable[]) null, bnbVar, i6));
                arrayList.add(new cnb(igaVarArr[i3].h, 0, new Class[]{lx2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (bnb) null, cmb.Bi));
                arrayList.add(new cnb(igaVarArr[i3].h, 8192, new Class[]{lx2.class}, (Paint) null, (Drawable[]) null, bnbVar, i5));
                arrayList.add(new cnb(igaVarArr[i3].h, 16384, new Class[]{lx2.class}, (Paint) null, (Drawable[]) null, bnbVar, i6));
                arrayList.add(new cnb(igaVarArr[i3].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (bnb) null, cmb.a7));
                arrayList.add(new cnb(igaVarArr[i3].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.F6));
                arrayList.add(new cnb(igaVarArr[i3].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.x6));
                i3++;
            } else {
                return arrayList;
            }
        }
    }

    public int getTopPanelShift() {
        return this.p2;
    }

    public final void h(mga mgaVar) {
        float f;
        final View[] viewArr = {mgaVar.c0(2131232444, new Runnable(this) {
            public final nha b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                View[] viewArr2 = viewArr;
                nha nhaVar = this.b;
                switch (b) {
                    case 0:
                        nhaVar.O1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        nhaVar.P1(viewArr2[0], viewArr2[1]);
                        return;
                }
            }
        }, jb6.M0(2131748407, null), false, false), mgaVar.c0(2131232445, new Runnable(this) {
            public final nha b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                View[] viewArr2 = viewArr;
                nha nhaVar = this.b;
                switch (b) {
                    case 0:
                        nhaVar.O1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        nhaVar.P1(viewArr2[0], viewArr2[1]);
                        return;
                }
            }
        }, jb6.M0(2131748406, null), false, false)};
        View view = viewArr[0];
        float f2 = 0.5f;
        if (view != null) {
            view.setEnabled(s());
            View view2 = viewArr[0];
            if (s()) {
                f = 1.0f;
            } else {
                f = 0.5f;
            }
            view2.setAlpha(f);
        }
        View view3 = viewArr[1];
        if (view3 != null) {
            view3.setEnabled(t());
            View view4 = viewArr[1];
            if (t()) {
                f2 = 1.0f;
            }
            view4.setAlpha(f2);
        }
    }

    public boolean h0() {
        return false;
    }

    public final void h1(ArrayList arrayList, TLRPC.ChatFull chatFull) {
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i < igaVarArr.length) {
                iga igaVar = igaVarArr[i];
                if (igaVar.F != 7 || igaVar.h.getAdapter() == null || igaVarArr[i].h.getAdapter().b() == 0 || this.y1.getMessagesController().N1().j.size() <= 0) {
                    i++;
                } else {
                    return;
                }
            } else {
                if (this.G == 0) {
                    aga agaVar = this.d0;
                    agaVar.d = chatFull;
                    agaVar.e = arrayList;
                }
                N1(true);
                for (int i2 = 0; i2 < igaVarArr.length; i2++) {
                    iga igaVar2 = igaVarArr[i2];
                    if (igaVar2.F == 7 && igaVar2.h.getAdapter() != null) {
                        gm.p2(igaVarArr[i2].h);
                    }
                }
                return;
            }
        }
    }

    public final void i(sea seaVar, int i, SparseBooleanArray sparseBooleanArray) {
        int childCount = seaVar.getChildCount();
        tk4 tk4Var = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = seaVar.getChildAt(i2);
            if (childAt instanceof tk4) {
                tk4Var = childAt;
            }
        }
        if (tk4Var != null) {
            seaVar.removeView(tk4Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new pfa(this, seaVar, sparseBooleanArray, tk4Var, i));
    }

    public boolean i0() {
        return !(this instanceof oe5);
    }

    public final void i1(int i, int i2, int i3, int i4) {
        iga[] igaVarArr;
        boolean z;
        boolean z2;
        this.c2 = true;
        this.d2 = i;
        this.e2 = i2;
        this.f2 = i3;
        this.b2 = i4;
        n();
        lea leaVar = this.b0;
        if (leaVar != null) {
            if (leaVar.M != i2 || leaVar.N != i3) {
                leaVar.M = i2;
                leaVar.N = i3;
                if (i2 == 0 && i3 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                leaVar.setClipChildren(z);
                ur0 ur0Var = leaVar.h;
                if (i2 == 0 && i3 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ur0Var.setClipChildren(z2);
                leaVar.n();
            }
            F1();
        }
        for (iga igaVar : this.n0) {
            if (igaVar != null) {
                igaVar.setClipChildren(false);
                H1(igaVar);
                setPageOverscan(igaVar.h);
                setPageOverscan(igaVar.n);
                int paddingTop = igaVar.h.getPaddingTop();
                sea seaVar = igaVar.h;
                int paddingLeft = seaVar.getPaddingLeft();
                sea seaVar2 = igaVar.h;
                int T = T(igaVar.F);
                seaVar2.h3 = T;
                int paddingRight = igaVar.h.getPaddingRight();
                sea seaVar3 = igaVar.h;
                int S = S(s0());
                seaVar3.i3 = S;
                seaVar.setPadding(paddingLeft, T, paddingRight, S);
                int paddingTop2 = paddingTop - igaVar.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    gm.J(igaVar.h, new xda(igaVar, paddingTop2, (byte) 1));
                }
                igaVar.w.setPadding(0, i, 0, i4);
                vfa vfaVar = this.W;
                if (vfaVar != null && vfaVar.getParent() == igaVar) {
                    k1(gm.L(56.0f) + i, vfaVar);
                }
                kea keaVar = this.a0;
                if (keaVar != null && keaVar.getParent() == igaVar) {
                    k1(i, keaVar);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void j(boolean z) {
        int i;
        s09 s09Var = this.v0;
        if (s09Var != null && this.Z1 != z) {
            this.Z1 = z;
            if (!z && s09Var.getAnimatedDrawable().b0 < 20) {
                s09Var.getAnimatedDrawable().K(0);
            } else {
                p09 animatedDrawable = s09Var.getAnimatedDrawable();
                if (this.Z1) {
                    i = 50;
                } else {
                    i = 100;
                }
                animatedDrawable.K(i);
            }
            s09Var.getAnimatedDrawable().start();
        }
    }

    public final void j1(int i, boolean z) {
        this.D0.a(i, z);
        rja rjaVar = this.I;
        if (rjaVar != null) {
            rjaVar.F(i, z);
        }
    }

    @Override
    public final void k(hg3 hg3Var) {
        int i;
        d dVar = this.y1;
        if (dVar != null && dVar.getMessagesController().N1().J(hg3Var.getDialogId())) {
            dVar.getOrCreateStoryViewer().getClass();
            oab orCreateStoryViewer = dVar.getOrCreateStoryViewer();
            Context context = dVar.getContext();
            long dialogId = hg3Var.getDialogId();
            q4b a = q4b.a((r59) hg3Var.getParent());
            if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).s1) {
                i = gm.L(68.0f);
            } else {
                i = 0;
            }
            a.s += i;
            orCreateStoryViewer.H(context, dialogId, a);
        }
    }

    public boolean k0() {
        return false;
    }

    public final void l(int i) {
        int i2;
        iga P = P(this.s1);
        this.s = -1;
        if (P != null) {
            P.h.D0();
            this.t1 = i;
            P.n.setVisibility(0);
            boolean j0 = j0(this.s1);
            hga hgaVar = P.n;
            if (j0) {
                hgaVar.setAdapter(w1(this.s1));
            } else {
                hgaVar.setAdapter(this.L);
            }
            hga hgaVar2 = P.n;
            int paddingLeft = hgaVar2.getPaddingLeft();
            hga hgaVar3 = P.n;
            int T = T(P.F);
            hgaVar3.h3 = T;
            int paddingRight = P.n.getPaddingRight();
            hga hgaVar4 = P.n;
            int S = S(s0());
            hgaVar4.i3 = S;
            hgaVar2.setPadding(paddingLeft, T, paddingRight, S);
            P.r.x1(i);
            P.n.b0();
            int i3 = 0;
            while (true) {
                iga[] igaVarArr = this.n0;
                if (i3 >= igaVarArr.length) {
                    break;
                }
                iga igaVar = igaVarArr[i3];
                if (igaVar != null && ((i2 = igaVar.F) == 0 || j0(i2))) {
                    gm.V3(igaVarArr[i3].h);
                }
                i3++;
            }
            this.r1 = true;
            if (this.s1 == 0) {
                this.w1[0].g(true);
            }
            this.q1 = 0.0f;
            e1();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.M1.d();
            ofFloat.addUpdateListener(new jfa(this, P, (byte) 1));
            ofFloat.addListener(new lx0(this, j0(P.F) ? 1 : 0, i, (byte) 3));
            ofFloat.setInterpolator(d53.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final boolean l0() {
        TLRPC.User W1;
        long j = this.m1;
        if (j > 0 && (W1 = oc7.r1(this.y1.getCurrentAccount()).W1(Long.valueOf(j))) != null && W1.bot) {
            return true;
        }
        return false;
    }

    public void l1(boolean z) {
        float f;
        if (this.F1 != z) {
            this.F1 = z;
            rja rjaVar = this.I;
            if (rjaVar != null) {
                if (z) {
                    M1();
                    rjaVar.J();
                } else {
                    rjaVar.w();
                }
                B(true, true);
                return;
            }
            AnimatorSet animatorSet = this.R1;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            LinearLayout linearLayout = this.E0;
            if (z) {
                linearLayout.setVisibility(0);
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.R1 = animatorSet2;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            animatorSet2.playTogether(ObjectAnimator.ofFloat(linearLayout, View.ALPHA, f));
            this.R1.setDuration(180L);
            this.R1.addListener(new sw9((byte) 3, this, z));
            this.R1.start();
            if (z) {
                M1();
            }
        }
    }

    @Override
    public final boolean m() {
        return false;
    }

    public final boolean m0() {
        d dVar;
        if (this.g1 != null && (dVar = this.y1) != null) {
            return sd2.V(dVar.getMessagesController().L0(Long.valueOf(this.g1.id)));
        }
        return false;
    }

    public final void n() {
        int i = this.d2;
        int i2 = this.p2;
        k1((gm.L(6.666f) + i) - w2, this.S0);
        int i3 = i + i2;
        k1(i3, this.L0);
        k1(i3, this.E0);
        k1(gm.L(52.0f) + i + i2, this.N0);
        k1(gm.L(4.0f) + i + i2, this.M0);
        k1(gm.L(48.0f) + i + i2, this.c0);
        if (this.l2 != i2) {
            this.l2 = i2;
            Runnable runnable = this.k2;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final boolean n0() {
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i >= igaVarArr.length) {
                return false;
            }
            iga igaVar = igaVarArr[i];
            if (igaVar != null) {
                sea seaVar = igaVar.h;
                if (seaVar == null || !seaVar.d0()) {
                    hga hgaVar = igaVarArr[i].n;
                    if (hgaVar != null && hgaVar.d0()) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
            i++;
        }
    }

    public final void n1(int r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nha.n1(int, boolean):void");
    }

    public final boolean o0() {
        lea leaVar = this.b0;
        if (leaVar == null || !leaVar.g()) {
            oea oeaVar = this.c0;
            if (oeaVar != null && oeaVar.f) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void o1(int i) {
        int s1 = s1(getClosestTab());
        oea oeaVar = this.c0;
        if (s1 != i) {
            if (oeaVar != null) {
                oeaVar.b.e(i, oeaVar.d.i(i));
                return;
            }
            return;
        }
        oeaVar.setReorderingAlbums(true);
        mha t1 = t1(i);
        iga P = P(t1.a);
        if (P == null) {
            return;
        }
        sea seaVar = P.h;
        for (int i2 = 0; i2 < seaVar.getChildCount(); i2++) {
            View childAt = seaVar.getChildAt(i2);
            if (childAt instanceof sha) {
                ((sha) childAt).l(true, true);
            }
        }
        lha lhaVar = t1.c;
        if (lhaVar != null && !lhaVar.y) {
            lhaVar.y = true;
        }
        G1(true);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i < igaVarArr.length) {
                sea seaVar = igaVarArr[i].h;
                if (seaVar != null) {
                    seaVar.getViewTreeObserver().addOnPreDrawListener(new qfa(this, i, (byte) 0));
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!D() && !this.L0.I && !onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        nha nhaVar;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        cga cgaVar = this.G1;
        if (cgaVar.e() != null) {
            i3 = cgaVar.e().getHeight();
        } else {
            i3 = 0;
        }
        if (i3 == 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(size, i3);
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = this.getChildAt(i6);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (childAt instanceof iga) {
                    nhaVar = this;
                    i4 = i;
                    nhaVar.measureChildWithMargins(childAt, i4, 0, View.MeasureSpec.makeMeasureSpec(i3, 1073741824), 0);
                    sea seaVar = ((iga) childAt).h;
                    seaVar.setPadding(0, seaVar.f3, 0, seaVar.g3);
                } else {
                    nhaVar = this;
                    i4 = i;
                    i5 = i2;
                    nhaVar.measureChildWithMargins(childAt, i4, 0, i5, 0);
                    i6++;
                    this = nhaVar;
                    i = i4;
                    i2 = i5;
                }
            } else {
                nhaVar = this;
                i4 = i;
            }
            i5 = i2;
            i6++;
            this = nhaVar;
            i = i4;
            i2 = i5;
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        int i2;
        boolean z2 = false;
        if (!this.P1) {
            d dVar = this.y1;
            if (dVar.getParentLayout() != null && !((ActionBarLayout) dVar.getParentLayout()).h() && !D() && !this.a) {
                if (motionEvent != null) {
                    VelocityTracker velocityTracker = this.E1;
                    if (velocityTracker == null) {
                        velocityTracker = VelocityTracker.obtain();
                        this.E1 = velocityTracker;
                    }
                    velocityTracker.addMovement(motionEvent);
                    hg5 hg5Var = this.H1;
                    if (hg5Var != null) {
                        hg5Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.A1 && !this.B1) {
                    if (motionEvent.getY() >= gm.L(90.0f) + this.d2) {
                        this.z1 = motionEvent.getPointerId(0);
                        this.B1 = true;
                        this.C1 = (int) motionEvent.getX();
                        this.D1 = (int) motionEvent.getY();
                        this.E1.clear();
                        return this.A1;
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.z1) {
                    int x = (int) (motionEvent.getX() - this.C1);
                    int abs = Math.abs(((int) motionEvent.getY()) - this.D1);
                    boolean z3 = this.A1;
                    iga[] igaVarArr = this.n0;
                    if (z3 && (!this.k1 ? x < 0 : x > 0)) {
                        if (x < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!b1(motionEvent, z)) {
                            this.B1 = true;
                            this.A1 = false;
                            igaVarArr[0].setTranslationX(0.0f);
                            iga igaVar = igaVarArr[1];
                            if (this.k1) {
                                i2 = igaVarArr[0].getMeasuredWidth();
                            } else {
                                i2 = -igaVarArr[0].getMeasuredWidth();
                            }
                            igaVar.setTranslationX(i2);
                            g1(0.0f, igaVarArr[1].F);
                            T0(getTabProgress());
                        }
                    }
                    if (this.B1 && !this.A1) {
                        if (Math.abs(x) >= gm.Z0(true, 0.3f) && Math.abs(x) > abs) {
                            if (x < 0) {
                                z2 = true;
                            }
                            b1(motionEvent, z2);
                        }
                    } else if (this.A1) {
                        igaVarArr[0].setTranslationX(x);
                        if (this.k1) {
                            igaVarArr[1].setTranslationX(igaVarArr[0].getMeasuredWidth() + x);
                        } else {
                            igaVarArr[1].setTranslationX(x - igaVarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x) / igaVarArr[0].getMeasuredWidth();
                        if (!q()) {
                            this.r0 = 0.0f;
                        } else {
                            this.r0 = V(abs2);
                            K1(abs2);
                            float U = U(abs2);
                            this.s0 = U;
                            if (U != 0.0f && q() && !k0()) {
                                i = 0;
                            } else {
                                i = 4;
                            }
                            this.u0.setVisibility(i);
                        }
                        G1(false);
                        g1(abs2, igaVarArr[1].F);
                        T0(getTabProgress());
                        S0();
                    }
                } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.z1 && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                    r1(motionEvent);
                }
                return this.A1;
            }
        }
        return false;
    }

    public final boolean p() {
        boolean l0 = l0();
        long j = this.m1;
        d dVar = this.y1;
        if (l0) {
            TLRPC.User W1 = oc7.r1(dVar.getCurrentAccount()).W1(Long.valueOf(j));
            if (W1 == null || !W1.bot || !W1.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!s0()) {
            if (dVar == null || !dVar.getMessagesController().N1().g(j)) {
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    public final boolean p0(int i) {
        if (i == 7) {
            return this.G1.Y();
        }
        if (!q0() && i != 0 && !j0(i) && i != 2 && i != 5 && i != 6 && i != 11 && i != 10 && i != 13 && i != 14 && i != 15) {
            return true;
        }
        return false;
    }

    public final void p1(boolean z) {
        iga[] igaVarArr;
        iga igaVar;
        if (!this.r1) {
            int i = 0;
            while (true) {
                igaVarArr = this.n0;
                if (i < igaVarArr.length) {
                    int i2 = igaVarArr[i].F;
                    if (i2 == 0 || j0(i2)) {
                        break;
                    }
                    i++;
                } else {
                    igaVar = null;
                    break;
                }
            }
            igaVar = igaVarArr[i];
            if (igaVar != null) {
                int i3 = igaVar.F;
                this.s1 = i3;
                boolean j0 = j0(i3);
                int[] iArr = this.p1;
                int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], z);
                this.t1 = R;
                if (R != iArr[j0 ? 1 : 0]) {
                    if (!this.n1 || !j0(this.s1)) {
                        igaVar.n.setVisibility(0);
                        boolean j02 = j0(this.s1);
                        hga hgaVar = igaVar.n;
                        if (j02) {
                            hgaVar.setAdapter(w1(this.s1));
                        } else {
                            hgaVar.setAdapter(this.L);
                        }
                        hga hgaVar2 = igaVar.n;
                        hgaVar2.setPadding(hgaVar2.getPaddingLeft(), T(this.s1), igaVar.n.getPaddingRight(), S(s0()));
                        igaVar.r.x1(R);
                        igaVar.n.b0();
                        igaVar.r.O = new ifa(this, igaVar, (byte) 0);
                        gm.V3(igaVar.h);
                        this.r1 = true;
                        if (this.s1 == 0) {
                            this.w1[0].g(true);
                        }
                        this.q1 = 0.0f;
                        if (this.s >= 0) {
                            for (iga igaVar2 : igaVarArr) {
                                if (igaVar2.F == this.s1) {
                                    igaVar2.r.g1(this.s, this.w - igaVar2.n.getPaddingTop());
                                }
                            }
                            return;
                        }
                        e1();
                    }
                }
            }
        }
    }

    public boolean q() {
        return !(this instanceof oe5);
    }

    public boolean q0() {
        if (TextUtils.isEmpty(getStoriesHashtag()) && getStoriesArea() == null) {
            return false;
        }
        return true;
    }

    public final void q1() {
        int i = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i < igaVarArr.length) {
                int childCount = igaVarArr[i].h.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = igaVarArr[i].h.getChildAt(i2);
                    if (childAt instanceof lx2) {
                        ImageReceiver photoImage = ((lx2) childAt).getPhotoImage();
                        if (i == 0) {
                            photoImage.u0 = true;
                            photoImage.w0(false);
                        } else {
                            photoImage.u0 = false;
                            photoImage.x0();
                        }
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public boolean r0() {
        return false;
    }

    public final void r1(MotionEvent motionEvent) {
        float f;
        float f2;
        boolean z;
        float measuredWidth;
        iga igaVar;
        iga igaVar2;
        int measuredWidth2;
        iga igaVar3;
        iga igaVar4;
        boolean z2;
        VelocityTracker velocityTracker = this.E1;
        if (velocityTracker != null) {
            velocityTracker.computeCurrentVelocity(1000, this.V0);
            if (motionEvent != null && motionEvent.getAction() != 3) {
                f = this.E1.getXVelocity();
                f2 = this.E1.getYVelocity();
                if (!this.A1 && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                    if (f < 0.0f) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    b1(motionEvent, z2);
                }
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
            if (this.A1) {
                iga[] igaVarArr = this.n0;
                float x = igaVarArr[0].getX();
                this.i1 = new AnimatorSet();
                if (Math.abs(x) < igaVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2))) {
                    z = true;
                } else {
                    z = false;
                }
                this.l1 = z;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new p29(this, (byte) 28));
                boolean z3 = this.l1;
                Property property = View.TRANSLATION_X;
                if (z3) {
                    measuredWidth = Math.abs(x);
                    boolean z4 = this.k1;
                    AnimatorSet animatorSet = this.i1;
                    if (z4) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(igaVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(igaVarArr[1], property, igaVar4.getMeasuredWidth()), ofFloat);
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(igaVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(igaVarArr[1], property, -igaVar3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = igaVarArr[0].getMeasuredWidth() - Math.abs(x);
                    boolean z5 = this.k1;
                    AnimatorSet animatorSet2 = this.i1;
                    if (z5) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(igaVarArr[0], property, -igaVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(igaVarArr[1], property, 0.0f), ofFloat);
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(igaVarArr[0], property, igaVar.getMeasuredWidth()), ObjectAnimator.ofFloat(igaVarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.i1.setInterpolator(u2);
                int measuredWidth3 = getMeasuredWidth();
                float f3 = measuredWidth3 / 2;
                float I = (gm.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f3) + f3;
                float abs = Math.abs(f);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs) * 1000.0f) << 2;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.i1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.i1.addListener(new nfa(this, (byte) 1));
                this.i1.start();
                this.j1 = true;
                this.A1 = false;
                S0();
            } else {
                this.B1 = false;
                setHeaderEnabled(true);
                this.L0.setEnabled(true);
            }
            VelocityTracker velocityTracker2 = this.E1;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.E1 = null;
            }
        }
    }

    public final boolean s() {
        iga igaVar;
        iga[] igaVarArr = this.n0;
        if (igaVarArr != null && (igaVar = igaVarArr[0]) != null) {
            boolean j0 = j0(igaVar.F);
            int i = this.p1[j0 ? 1 : 0];
            if (i != R(j0 ? 1 : 0, i, true)) {
                return true;
            }
        }
        return false;
    }

    public boolean s0() {
        return false;
    }

    public final int s1(int i) {
        mha u1 = u1(i);
        if (u1 == null) {
            return -1;
        }
        return u1.b;
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        boolean z;
        int i;
        TLRPC.ChatFull chatFull2 = this.g1;
        if (chatFull2 != null && chatFull2.stories_pinned_available) {
            z = true;
        } else {
            z = false;
        }
        this.g1 = chatFull;
        if (chatFull != null) {
            long j = chatFull.migrated_from_chat_id;
            if (j != 0 && this.f1 == 0) {
                this.f1 = -j;
                int i2 = 0;
                while (true) {
                    cha[] chaVarArr = this.w1;
                    if (i2 >= chaVarArr.length) {
                        break;
                    }
                    if (chaVarArr[i2].b[1].size() == 0) {
                        cha chaVar = chaVarArr[i2];
                        chaVar.j[1] = this.g1.migrated_from_max_id;
                        chaVar.i[1] = false;
                    }
                    i2++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.g1;
        if (chatFull3 != null && z != chatFull3.stories_pinned_available) {
            kfa kfaVar = this.L0;
            if (kfaVar != null) {
                if (k0()) {
                    i = 9;
                } else {
                    i = 8;
                }
                kfaVar.setInitialTabId(i);
            }
            N1(true);
            z1(false);
        }
    }

    public void setCommonGroupsCount(int i) {
        if (this.G == 0) {
            this.a1[6] = i;
        }
        N1(true);
        y();
    }

    public void setForwardRestrictedHint(hg5 hg5Var) {
        this.H1 = hg5Var;
    }

    public void setMergeDialogId(long j) {
        this.f1 = j;
    }

    public void setNewMediaCounts(int[] iArr) {
        int[] iArr2;
        int i = 0;
        while (true) {
            iArr2 = this.a1;
            if (i > 6 || iArr2[i] >= 0) {
                break;
            }
            i++;
        }
        System.arraycopy(iArr, 0, iArr2, 0, 6);
        N1(true);
        y();
        if (iArr2[0] >= 0) {
            G0(false);
        }
    }

    public void setOnTopPanelShiftChanged(Runnable runnable) {
        this.k2 = runnable;
    }

    @Override
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.O1 = i2;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i6 >= igaVarArr.length) {
                break;
            }
            igaVarArr[i6].setTranslationY(this.O1);
            i6++;
        }
        qk3 qk3Var = this.S0;
        if (qk3Var != null) {
            if (qk3Var != null) {
                qk3Var.setTranslationY(this.O1);
            }
        } else {
            gfa gfaVar = this.U0;
            if (gfaVar != null) {
                gfaVar.setTranslationY(gm.L(48.0f) + i2);
            }
        }
        this.R0 = i2;
        cm1 cm1Var = this.N0;
        if (cm1Var.getTag() == null) {
            i5 = -gm.L(48.0f);
        }
        cm1Var.setTranslationY(i5 + this.R0);
    }

    public void setPagesGlassEngine(sy4 sy4Var) {
        iga[] igaVarArr;
        this.h2 = sy4Var;
        lea leaVar = this.b0;
        if (leaVar != null) {
            leaVar.setGlassEngine(sy4Var);
        }
        for (iga igaVar : this.n0) {
            if (igaVar != null) {
                igaVar.h.setCaptureSectionsDecoratorAllowed(true);
                sy4Var.b(igaVar.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i) {
        if (this.b2 != i) {
            this.b2 = i;
            iga[] igaVarArr = this.n0;
            if (igaVarArr != null) {
                for (iga igaVar : igaVarArr) {
                    if (igaVar != null) {
                        sea seaVar = igaVar.h;
                        int paddingLeft = seaVar.getPaddingLeft();
                        sea seaVar2 = igaVar.h;
                        int i2 = seaVar2.f3;
                        int paddingRight = seaVar2.getPaddingRight();
                        sea seaVar3 = igaVar.h;
                        int S = S(s0());
                        seaVar3.i3 = S;
                        seaVar.setPadding(paddingLeft, i2, paddingRight, S);
                    }
                }
            }
        }
    }

    public void setPagesVisibleOverscanTop(int i) {
        if (this.g2 != i) {
            this.g2 = i;
            invalidate();
            if (getParent() instanceof View) {
                ((View) getParent()).invalidate();
            }
        }
    }

    public void setPinnedToTop(boolean z) {
        if (this.d != z) {
            this.d = z;
            int i = 0;
            while (true) {
                iga[] igaVarArr = this.n0;
                if (i < igaVarArr.length) {
                    D1(igaVarArr[i], true);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setUserInfo(TLRPC.UserFull userFull) {
        boolean z;
        TLRPC.UserFull userFull2 = this.h1;
        if (userFull2 != null && userFull2.stories_pinned_available) {
            z = true;
        } else {
            z = false;
        }
        this.h1 = userFull;
        N1(true);
        if (userFull != null && z != userFull.stories_pinned_available) {
            f1(8);
        }
    }

    public void setVisibleHeight(int i) {
        float f;
        this.Q1 = i;
        int i2 = 0;
        while (true) {
            iga[] igaVarArr = this.n0;
            if (i2 >= igaVarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (igaVarArr[i2].F == 8) {
                f = 280.0f;
            } else {
                f = 120.0f;
            }
            float f2 = (-(measuredHeight - Math.max(i, gm.L(f)))) / 2.0f;
            igaVarArr[i2].w.setTranslationY(f2);
            igaVarArr[i2].s.setTranslationY(-f2);
            i2++;
        }
        kea keaVar = this.a0;
        if (keaVar != null) {
            keaVar.setVisibleHeight(i);
        }
        lea leaVar = this.b0;
        if (leaVar != null) {
            leaVar.setVisibleHeight(i);
        }
    }

    public final boolean t() {
        iga igaVar;
        iga[] igaVarArr = this.n0;
        if (igaVarArr != null && (igaVar = igaVarArr[0]) != null && (!this.n1 || !j0(igaVar.F))) {
            boolean j0 = j0(igaVarArr[0].F);
            int i = this.p1[j0 ? 1 : 0];
            if (i != R(j0 ? 1 : 0, i, false)) {
                return true;
            }
        }
        return false;
    }

    public final mha t1(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.m2;
        mha mhaVar = (mha) hashMap.get(valueOf);
        if (mhaVar == null) {
            mha mhaVar2 = new mha(this, getContext(), i);
            hashMap.put(Integer.valueOf(i), mhaVar2);
            this.n2.put(Integer.valueOf(mhaVar2.a), Integer.valueOf(i));
            return mhaVar2;
        }
        return mhaVar;
    }

    public final boolean u0() {
        if (!p() || ((getClosestTab() != 8 && getClosestTab() != 13 && !t0(getClosestTab())) || !this.F1)) {
            lea leaVar = this.b0;
            if (leaVar == null || !leaVar.g()) {
                oea oeaVar = this.c0;
                if ((oeaVar == null || !oeaVar.f) && !this.r1 && !this.j1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final mha u1(int i) {
        Integer num = (Integer) this.n2.get(Integer.valueOf(i));
        if (num == null) {
            return null;
        }
        return (mha) this.m2.get(num);
    }

    @Override
    public final void updateColors() {
        iga[] igaVarArr;
        try {
            this.J1.a(c0(cmb.c6));
            ee0 ee0Var = this.G0;
            if (ee0Var != null) {
                ee0Var.a(c0(cmb.x8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(c0(cmb.x8));
            }
            B1();
            invalidate();
            for (iga igaVar : this.n0) {
                if (igaVar != null && igaVar.M) {
                    igaVar.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void v0(int i, int i2, int i3, boolean z) {
        cha[] chaVarArr = this.w1;
        chaVarArr[i].a.clear();
        chaVarArr[i].b[0].clear();
        chaVarArr[i].b[1].clear();
        cha chaVar = chaVarArr[i];
        chaVar.j[0] = i2;
        chaVar.i[0] = false;
        chaVar.l = false;
        chaVar.m = i3;
        chaVar.n = (chaVar.e() - i3) - 1;
        cha chaVar2 = chaVarArr[i];
        if (chaVar2.n < 0) {
            chaVar2.n = 0;
        }
        chaVar2.k = i2;
        chaVar2.o = true;
        chaVar2.g = false;
        chaVar2.p++;
        iga P = P(i);
        if (P != null && P.h.getAdapter() != null) {
            P.h.getAdapter().f();
        }
        if (z) {
            int i4 = 0;
            while (true) {
                iga[] igaVarArr = this.n0;
                if (i4 < igaVarArr.length) {
                    iga igaVar = igaVarArr[i4];
                    if (igaVar.F == i) {
                        igaVar.x.g1(Math.min(chaVarArr[i].e() - 1, chaVarArr[i].m), 0);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public final kha v1(int i) {
        mha u1;
        if (i == 8) {
            return this.f0;
        }
        if (i == 9) {
            return this.h0;
        }
        if (t0(i) && (u1 = u1(i)) != null) {
            return u1.c;
        }
        return null;
    }

    public final void w(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        iga[] igaVarArr;
        r59 r59Var;
        kea keaVar;
        vfa vfaVar;
        lea leaVar;
        View[] viewPages;
        for (iga igaVar : this.n0) {
            if (igaVar != null && igaVar.getVisibility() == 0) {
                if (igaVar.P != null) {
                    RectF rectF2 = this.j2;
                    if (zgc.c(igaVar, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        igaVar.c(canvas);
                        canvas.restore();
                    }
                }
                if (igaVar.F == 14 && (leaVar = this.b0) != null && leaVar.getParent() == igaVar) {
                    for (View view : leaVar.h.getViewPages()) {
                        if ((view instanceof rs8) && view.getVisibility() == 0) {
                            va vaVar = ((rs8) view).f;
                            tl0.a(vaVar, canvas, rectF, vaVar, viewGroup);
                        }
                    }
                } else {
                    if (igaVar.F == 12 && (vfaVar = this.W) != null && vfaVar.getParent() == igaVar) {
                        r59Var = vfaVar.a.A0;
                    } else if (igaVar.F == 13 && (keaVar = this.a0) != null && keaVar.getParent() == igaVar) {
                        r59Var = keaVar.getCurrentListView();
                    } else {
                        r59Var = igaVar.h;
                    }
                    if (r59Var != null && r59Var.getVisibility() == 0) {
                        tl0.a(r59Var, canvas, rectF, r59Var, viewGroup);
                    }
                }
            }
        }
    }

    public final void w0(String str) {
        getStoriesController().q(this.m1, str, new nda(this, (byte) 0));
    }

    public final kha w1(int i) {
        mha u1;
        if (i == 8) {
            return this.g0;
        }
        if (i == 9) {
            return this.i0;
        }
        if (!t0(i) || (u1 = u1(i)) == null) {
            return null;
        }
        return u1.d;
    }

    public final void x() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nha.x():void");
    }

    public final void x0(TL_stories.StoryItem storyItem, a4b a4bVar) {
        getStoriesController().b(a4bVar.a, this.m1, storyItem);
        gm.d3(new e6a(this, a4bVar, (byte) 4), 100L);
    }

    public final int x1(y59 y59Var) {
        if (y59Var == this.f0) {
            return 8;
        }
        if (y59Var == this.h0) {
            return 9;
        }
        for (mha mhaVar : this.m2.values()) {
            if (mhaVar.c == y59Var) {
                return mhaVar.a;
            }
        }
        return -1;
    }

    public final void y() {
        kfa kfaVar = this.L0;
        if (!kfaVar.d(kfaVar.getCurrentTabId())) {
            int firstTabId = kfaVar.getFirstTabId();
            kfaVar.setInitialTabId(firstTabId);
            this.n0[0].F = firstTabId;
            z1(false);
        }
    }

    public final void y0(TL_stories.StoryItem storyItem, String str) {
        getStoriesController().q(this.m1, str, new ts9(this, storyItem, (byte) 6));
    }

    public final int y1(y59 y59Var) {
        if (y59Var == this.g0) {
            return 8;
        }
        if (y59Var == this.i0) {
            return 9;
        }
        for (mha mhaVar : this.m2.values()) {
            if (mhaVar.d == y59Var) {
                return mhaVar.a;
            }
        }
        return -1;
    }

    public final void z(iga igaVar, r59 r59Var, u46 u46Var) {
        int abs;
        int b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        u69 K;
        boolean z;
        k47 k47Var;
        sea seaVar;
        z3b z3bVar;
        if (!this.r1 && this.N1 == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (r59Var.getFastScroll() == null || !r59Var.getFastScroll().n || currentTimeMillis - igaVar.a >= 300) {
                igaVar.a = currentTimeMillis;
                if ((!this.Y0 || !this.X0 || igaVar.F == 11) && igaVar.F != 7) {
                    int K0 = u46Var.K0();
                    if (K0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(u46Var.M0() - K0) + 1;
                    }
                    if (r59Var.getAdapter() == null) {
                        b = 0;
                    } else {
                        b = r59Var.getAdapter().b();
                    }
                    int i6 = igaVar.F;
                    int[] iArr = this.p1;
                    cha[] chaVarArr = this.w1;
                    if (i6 != 0 && i6 != 1 && i6 != 2 && i6 != 4) {
                        i = false;
                    } else {
                        b = chaVarArr[i6].d() + chaVarArr[i6].a.size();
                        cha chaVar = chaVarArr[i6];
                        i = false;
                        if (chaVar.h && chaVar.e.size() > 2 && igaVar.F == 0 && chaVarArr[i6].a.size() != 0) {
                            if (i6 == 0) {
                                i2 = iArr[0];
                            } else {
                                i2 = 1;
                            }
                            float f = i2;
                            int measuredHeight = (int) ((r59Var.getMeasuredHeight() / (r59Var.getMeasuredWidth() / f)) * f * 1.5f);
                            if (measuredHeight < 100) {
                                measuredHeight = 100;
                            }
                            if (measuredHeight < ((nga) chaVarArr[i6].e.get(1)).b) {
                                measuredHeight = ((nga) chaVarArr[i6].e.get(1)).b;
                            }
                            if ((K0 > b && K0 - b > measuredHeight) || ((i3 = K0 + abs) < chaVarArr[i6].m && chaVarArr[0].m - i3 > measuredHeight)) {
                                v99 v99Var = new v99(this, i6, r59Var, (byte) 6);
                                this.N1 = v99Var;
                                gm.c3(v99Var);
                                return;
                            }
                        }
                    }
                    int i7 = igaVar.F;
                    if (i7 != 7) {
                        boolean j0 = j0(i7);
                        int i8 = igaVar.F;
                        if (j0) {
                            kha v1 = v1(i8);
                            if (v1 != null && (z3bVar = v1.s) != null && K0 + abs > z3bVar.i() - iArr[1]) {
                                v1.P();
                            }
                        } else if (i8 == 6) {
                            if (abs > 0) {
                                bga bgaVar = this.S;
                                boolean z2 = bgaVar.h;
                                ArrayList arrayList = bgaVar.d;
                                if (!z2 && !bgaVar.e && !arrayList.isEmpty() && K0 + abs >= b - 5) {
                                    bgaVar.E(((TLRPC.Chat) b10.f(1, arrayList)).id);
                                }
                            }
                        } else {
                            d dVar = this.y1;
                            if (i8 == 11) {
                                int i9 = i;
                                int i10 = -1;
                                while (true) {
                                    int childCount = igaVar.h.getChildCount();
                                    seaVar = igaVar.h;
                                    if (i9 >= childCount) {
                                        break;
                                    }
                                    View childAt = seaVar.getChildAt(i9);
                                    igaVar.h.getClass();
                                    i10 = Math.max(RecyclerView.R(childAt), i10);
                                    i9++;
                                }
                                y59 adapter = seaVar.getAdapter();
                                zga zgaVar = this.V;
                                int i11 = i10 + 1;
                                if (adapter == zgaVar) {
                                    if (i11 >= zgaVar.h.size() + zgaVar.e.size() && !zgaVar.s && !zgaVar.r) {
                                        zgaVar.r = true;
                                        zgaVar.F();
                                        return;
                                    }
                                    return;
                                } else if (i11 >= dVar.getMessagesController().E1().i.size()) {
                                    dVar.getMessagesController().E1().g(i);
                                    return;
                                } else {
                                    return;
                                }
                            }
                            int i12 = 10;
                            if (i8 != 10 && i8 != 12 && i8 != 13 && i8 != 14) {
                                if (i8 == 0) {
                                    i12 = 3;
                                } else if (i8 != 5) {
                                    i12 = 6;
                                }
                                if (i8 == 15) {
                                    i4 = 8;
                                } else {
                                    i4 = i8;
                                }
                                if (abs + K0 > b - i12 || chaVarArr[i4].o) {
                                    cha chaVar2 = chaVarArr[i4];
                                    if (!chaVar2.g) {
                                        if (i8 == 0) {
                                            byte b2 = chaVarArr[0].q;
                                            if (b2 == 1) {
                                                i5 = 6;
                                            } else if (b2 == 2) {
                                                i5 = 7;
                                            } else {
                                                i5 = 0;
                                            }
                                        } else {
                                            int i13 = 2;
                                            if (i8 == 1) {
                                                i5 = 1;
                                            } else {
                                                if (i8 != 2) {
                                                    i13 = 4;
                                                    if (i8 != 4) {
                                                        if (i8 == 5) {
                                                            i5 = 5;
                                                        } else if (i8 == 15) {
                                                            i5 = 8;
                                                        } else {
                                                            i5 = 3;
                                                        }
                                                    }
                                                }
                                                i5 = i13;
                                            }
                                        }
                                        boolean[] zArr = chaVar2.i;
                                        if (!zArr[0]) {
                                            chaVar2.g = true;
                                            dVar.getMediaDataController().P0(this.m1, 50, chaVarArr[i4].j[0], 0, i5, this.G, 1, dVar.getClassGuid(), chaVarArr[i4].p, null, null);
                                        } else if (this.f1 != 0 && !zArr[1]) {
                                            chaVar2.g = true;
                                            dVar.getMediaDataController().P0(this.f1, 50, chaVarArr[i4].j[1], 0, i5, this.G, 1, dVar.getClassGuid(), chaVarArr[i4].p, null, null);
                                        }
                                    }
                                }
                                int i14 = chaVarArr[i4].m;
                                if (i4 == 0) {
                                    i14 = this.K.L(0);
                                }
                                if (K0 - i14 < i12 + 1) {
                                    cha chaVar3 = chaVarArr[i4];
                                    if (!chaVar3.g && !chaVar3.l && !chaVar3.o) {
                                        H0(igaVar.F);
                                    }
                                }
                                iga igaVar2 = this.n0[0];
                                if (igaVar2.h == r59Var) {
                                    int i15 = igaVar2.F;
                                    if ((i15 == 0 || i15 == 5) && K0 != -1 && (K = r59Var.K(K0)) != null) {
                                        int i16 = K.f;
                                        if (i16 == 0 || i16 == 12) {
                                            View view = K.a;
                                            boolean z3 = view instanceof tha;
                                            cm1 cm1Var = this.N0;
                                            if (z3) {
                                                tha thaVar = (tha) view;
                                                if (thaVar.e <= 0) {
                                                    k47Var = null;
                                                    z = false;
                                                } else {
                                                    z = false;
                                                    k47Var = thaVar.b[0];
                                                }
                                                if (k47Var != null) {
                                                    cm1Var.h0(k47Var.k.date, z, true);
                                                }
                                            } else if (view instanceof lx2) {
                                                cm1Var.h0(((lx2) view).getDate(), false, true);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void z0(HashSet hashSet, TL_stories.StoryItem storyItem, bu5 bu5Var, a4b a4bVar) {
        String a0;
        boolean contains = hashSet.contains(Integer.valueOf(a4bVar.a));
        long j = this.m1;
        if (contains) {
            getStoriesController().b(a4bVar.a, j, storyItem);
            a0 = jb6.a0(null, null, 2131744420, a4bVar.b);
        } else {
            h4b storiesController = getStoriesController();
            int i = a4bVar.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.e0(i, j, arrayList);
            a0 = jb6.a0(null, null, 2131744180, a4bVar.b);
        }
        c41.b0(this.y1).Q(2131623990, 36, gm.S2(a0)).j();
        bu5Var.u();
    }

    public final void z1(boolean z) {
        iga[] igaVarArr;
        iga[] igaVarArr2;
        r7 r7Var;
        m69 m69Var;
        boolean z2;
        boolean z3;
        boolean z4;
        m69 m69Var2;
        int i;
        int i2;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z7;
        m69 m69Var3;
        int i8;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        m69 m69Var4;
        lea leaVar = this.b0;
        if (leaVar != null) {
            leaVar.i();
        }
        int i13 = 0;
        while (true) {
            igaVarArr = this.n0;
            if (i13 >= igaVarArr.length) {
                break;
            }
            igaVarArr[i13].h.D0();
            i13++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) igaVarArr[z ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = gm.L(I0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        y59 adapter = igaVarArr[z ? 1 : 0].h.getAdapter();
        y59 y59Var = this.f0;
        hu5 hu5Var = this.e0;
        if (adapter == y59Var) {
            hu5Var.h(null);
        }
        boolean z12 = this.Y0;
        rja rjaVar = this.I;
        cga cgaVar = this.G1;
        a aVar = this.H;
        String str = "";
        wga wgaVar = this.Q;
        r7 r7Var2 = this.q0;
        int i14 = 100;
        if (z12 && this.X0) {
            iga igaVar = igaVarArr[z ? 1 : 0];
            if (igaVar.f == null) {
                igaVar.f = new m69();
            }
            iga igaVar2 = igaVarArr[z ? 1 : 0];
            m69 m69Var5 = igaVar2.f;
            zga zgaVar = this.V;
            gga ggaVar = this.m0;
            kga kgaVar = this.k0;
            kga kgaVar2 = this.l0;
            kga kgaVar3 = this.j0;
            if (z) {
                int i15 = igaVar2.F;
                if (i15 != 0) {
                    m69Var4 = m69Var5;
                    if (i15 != 2 && i15 != 5 && i15 != 6 && (i15 != 7 || cgaVar.Y())) {
                        if (r7Var2 != null) {
                            str = r7Var2.getSearchField().getText().toString();
                        }
                        String str2 = str;
                        int i16 = igaVarArr[z ? 1 : 0].F;
                        if (i16 == 1) {
                            if (kgaVar3 != null) {
                                kgaVar3.G(str2, false);
                                if (adapter != kgaVar3) {
                                    d1(adapter);
                                    igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar3);
                                }
                            }
                        } else if (i16 == 3) {
                            if (kgaVar2 != null) {
                                kgaVar2.G(str2, false);
                                if (adapter != kgaVar2) {
                                    d1(adapter);
                                    igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar2);
                                }
                            }
                        } else if (i16 == 4) {
                            if (kgaVar != null) {
                                kgaVar.G(str2, false);
                                if (adapter != kgaVar) {
                                    d1(adapter);
                                    igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar);
                                }
                            }
                        } else if (i16 == 7) {
                            if (ggaVar != null) {
                                ggaVar.F(str2, false);
                                if (adapter != ggaVar) {
                                    d1(adapter);
                                    igaVarArr[z ? 1 : 0].h.setAdapter(ggaVar);
                                }
                            }
                        } else if (i16 == 11) {
                            if (zgaVar != null) {
                                zgaVar.E(this.Z0, str2);
                                if (adapter != zgaVar) {
                                    d1(adapter);
                                    igaVarArr[z ? 1 : 0].h.setAdapter(zgaVar);
                                }
                            }
                        } else if (i16 == 15 && wgaVar != null && adapter != wgaVar) {
                            d1(adapter);
                            sea seaVar = igaVarArr[z ? 1 : 0].h;
                            wgaVar.r = seaVar;
                            seaVar.setAdapter(wgaVar);
                        }
                    }
                }
                this.Y0 = false;
                hfa hfaVar = this.M0;
                if (hfaVar != null) {
                    hfaVar.g(false);
                }
                this.X0 = false;
                z1(true);
                return;
            }
            m69Var4 = m69Var5;
            if (igaVar2.h != null) {
                int i17 = igaVar2.F;
                if (i17 == 1) {
                    if (adapter != kgaVar3) {
                        d1(adapter);
                        igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar3);
                    }
                    kgaVar3.f();
                } else if (i17 == 3) {
                    if (adapter != kgaVar2) {
                        d1(adapter);
                        igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar2);
                    }
                    kgaVar2.f();
                } else if (i17 == 4) {
                    if (adapter != kgaVar) {
                        d1(adapter);
                        igaVarArr[z ? 1 : 0].h.setAdapter(kgaVar);
                    }
                    kgaVar.f();
                } else if (i17 == 7) {
                    if (adapter != ggaVar) {
                        d1(adapter);
                        igaVarArr[z ? 1 : 0].h.setAdapter(ggaVar);
                    }
                    ggaVar.f();
                } else if (i17 == 11) {
                    if (adapter != zgaVar) {
                        d1(adapter);
                        igaVarArr[z ? 1 : 0].h.setAdapter(zgaVar);
                    }
                    zgaVar.f();
                }
            }
            igaVarArr2 = igaVarArr;
            r7Var = r7Var2;
            m69Var3 = m69Var4;
            i3 = 4;
            z4 = false;
            z7 = false;
            i5 = 8;
        } else {
            iga igaVar3 = igaVarArr[z ? 1 : 0];
            if (igaVar3.e == null) {
                igaVar3.e = new m69();
            }
            iga igaVar4 = igaVarArr[z ? 1 : 0];
            m69 m69Var6 = igaVar4.e;
            igaVar4.h.setPinnedHeaderShadowDrawable(null);
            int i18 = igaVarArr[z ? 1 : 0].F;
            if (i18 == 8 || t0(i18)) {
                layoutParams.topMargin = gm.L(I0());
            }
            sea seaVar2 = igaVarArr[z ? 1 : 0].h;
            int paddingLeft = seaVar2.getPaddingLeft();
            iga igaVar5 = igaVarArr[z ? 1 : 0];
            igaVarArr2 = igaVarArr;
            sea seaVar3 = igaVar5.h;
            int T = T(igaVar5.F);
            seaVar3.h3 = T;
            int paddingRight = igaVarArr2[z ? 1 : 0].h.getPaddingRight();
            sea seaVar4 = igaVarArr2[z ? 1 : 0].h;
            int S = S(s0());
            seaVar4.i3 = S;
            seaVar2.setPadding(paddingLeft, T, paddingRight, S);
            int i19 = igaVarArr2[z ? 1 : 0].F;
            int[] iArr = this.p1;
            y59 y59Var2 = this.N;
            bga bgaVar = this.S;
            yga ygaVar = this.U;
            View view = this.a0;
            vfa vfaVar = this.W;
            r7Var = r7Var2;
            cha[] chaVarArr = this.w1;
            if (i19 == 0) {
                y59 y59Var3 = this.K;
                if (adapter != y59Var3) {
                    d1(adapter);
                    igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var3);
                }
                int i20 = -gm.L(1.0f);
                layoutParams.rightMargin = i20;
                layoutParams.leftMargin = i20;
                cha chaVar = chaVarArr[0];
                if (chaVar.h && !chaVar.e.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i14 = iArr[0];
                igaVarArr2[z ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                m69Var = chaVarArr[0].x;
                z4 = z10;
                z2 = false;
            } else {
                if (i19 == 1) {
                    cha chaVar2 = chaVarArr[1];
                    if (chaVar2.h && !chaVar2.e.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (adapter != y59Var2) {
                        d1(adapter);
                        igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var2);
                    }
                } else if (i19 == 2) {
                    cha chaVar3 = chaVarArr[2];
                    if (chaVar3.h && !chaVar3.e.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    y59 y59Var4 = this.O;
                    if (adapter != y59Var4) {
                        d1(adapter);
                        igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var4);
                    }
                } else {
                    if (i19 == 3) {
                        y59 y59Var5 = this.M;
                        if (adapter != y59Var5) {
                            d1(adapter);
                            igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var5);
                        }
                    } else if (i19 == 4) {
                        cha chaVar4 = chaVarArr[4];
                        if (chaVar4.h && !chaVar4.e.isEmpty()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        y59 y59Var6 = this.P;
                        if (adapter != y59Var6) {
                            d1(adapter);
                            igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var6);
                        }
                    } else {
                        if (i19 == 5) {
                            y59 y59Var7 = this.R;
                            if (adapter != y59Var7) {
                                d1(adapter);
                                igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var7);
                            }
                        } else if (i19 == 15) {
                            if (adapter != wgaVar) {
                                d1(adapter);
                                sea seaVar5 = igaVarArr2[z ? 1 : 0].h;
                                wgaVar.r = seaVar5;
                                seaVar5.setAdapter(wgaVar);
                            }
                        } else if (i19 == 6) {
                            if (adapter != bgaVar) {
                                d1(adapter);
                                igaVarArr2[z ? 1 : 0].h.setAdapter(bgaVar);
                            }
                        } else if (i19 == 7) {
                            y59 y59Var8 = this.d0;
                            if (adapter != y59Var8) {
                                d1(adapter);
                                igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var8);
                            }
                        } else if (j0(i19)) {
                            y59 v1 = v1(igaVarArr2[z ? 1 : 0].F);
                            if (adapter != v1) {
                                d1(adapter);
                                igaVarArr2[z ? 1 : 0].h.setAdapter(v1);
                                igaVarArr2[z ? 1 : 0].h.getClass();
                            }
                            iga igaVar6 = igaVarArr2[z ? 1 : 0];
                            if (igaVar6.F != 9) {
                                hu5Var.h(igaVar6.h);
                            }
                            i14 = iArr[1];
                        } else {
                            int i21 = igaVarArr2[z ? 1 : 0].F;
                            if (i21 == 10) {
                                y59 y59Var9 = this.T;
                                if (adapter != y59Var9) {
                                    d1(adapter);
                                    igaVarArr2[z ? 1 : 0].h.setAdapter(y59Var9);
                                }
                            } else if (i21 == 11) {
                                if (adapter != ygaVar) {
                                    d1(adapter);
                                    igaVarArr2[z ? 1 : 0].h.setAdapter(ygaVar);
                                    hu5 hu5Var2 = ygaVar.w;
                                    sea seaVar6 = igaVarArr2[z ? 1 : 0].h;
                                    ygaVar.s = seaVar6;
                                    hu5Var2.h(seaVar6);
                                }
                                m69Var = ygaVar.r;
                                z2 = true;
                                z4 = false;
                            } else if (i21 == 12) {
                                if (adapter != null) {
                                    d1(adapter);
                                    igaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (vfaVar.getParent() != igaVarArr2[z ? 1 : 0]) {
                                    gm.B2(vfaVar);
                                    igaVarArr2[z ? 1 : 0].addView(vfaVar, qoe.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    k1(gm.L(56.0f) + this.d2, vfaVar);
                                }
                            } else if (i21 == 13) {
                                if (adapter != null) {
                                    d1(adapter);
                                    igaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != igaVarArr2[z ? 1 : 0]) {
                                    gm.B2(view);
                                    igaVarArr2[z ? 1 : 0].addView(view);
                                    k1(this.d2, view);
                                }
                            } else if (i21 == 14) {
                                if (adapter != null) {
                                    d1(adapter);
                                    igaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (leaVar != null && leaVar.getParent() != igaVarArr2[z ? 1 : 0]) {
                                    gm.B2(leaVar);
                                    igaVarArr2[z ? 1 : 0].addView(leaVar);
                                    igaVarArr2[z ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        m69Var = m69Var6;
                        z2 = false;
                        z4 = false;
                    }
                    m69Var = m69Var6;
                    z2 = true;
                    z4 = false;
                }
                z4 = z3;
                m69Var = m69Var6;
                z2 = true;
            }
            I1(igaVarArr2[z ? 1 : 0]);
            if (z2) {
                igaVarArr2[z ? 1 : 0].h.setSections(false);
                m69Var2 = m69Var;
            } else {
                sea seaVar7 = igaVarArr2[z ? 1 : 0].h;
                seaVar7.getClass();
                m69Var2 = m69Var;
                anb.l(seaVar7, 20, cmb.h6, seaVar7.o2);
                seaVar7.U2 = false;
                seaVar7.I2 = null;
                seaVar7.J2 = null;
                seaVar7.M2 = 0.0f;
                seaVar7.N2 = null;
                seaVar7.O2 = null;
                seaVar7.K2 = null;
                d59 d59Var = seaVar7.H2;
                if (d59Var != null) {
                    seaVar7.r0(d59Var);
                    seaVar7.H2 = null;
                }
                yk0 yk0Var = seaVar7.S2;
                if (yk0Var != null) {
                    seaVar7.r0(yk0Var);
                    seaVar7.S2 = null;
                }
            }
            H1(igaVarArr2[z ? 1 : 0]);
            iga igaVar7 = igaVarArr2[z ? 1 : 0];
            int i22 = igaVar7.F;
            sea seaVar8 = igaVar7.h;
            if (i22 == 11) {
                seaVar8.setItemAnimator(igaVar7.d);
            } else {
                seaVar8.setItemAnimator(null);
                if (ygaVar != null && igaVarArr2[z ? 1 : 0].h == ygaVar.s) {
                    hu5 hu5Var3 = ygaVar.w;
                    ygaVar.s = null;
                    hu5Var3.h(null);
                }
            }
            if (vfaVar != null && igaVarArr2[z ? 1 : 0].F != 12 && vfaVar.getParent() == igaVarArr2[z ? 1 : 0]) {
                vfaVar.a.onRemoveFromParent();
                igaVarArr2[z ? 1 : 0].removeView(vfaVar);
            }
            if (view != null && igaVarArr2[z ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                iga igaVar8 = igaVarArr2[z ? 1 : 0];
                if (parent == igaVar8) {
                    igaVar8.removeView(view);
                }
            }
            if (leaVar != null && igaVarArr2[z ? 1 : 0].F != 14) {
                ViewParent parent2 = leaVar.getParent();
                iga igaVar9 = igaVarArr2[z ? 1 : 0];
                if (parent2 == igaVar9) {
                    igaVar9.removeView(leaVar);
                }
            }
            int i23 = igaVarArr2[z ? 1 : 0].F;
            if (i23 != 0 && i23 != 11 && !j0(i23) && (i8 = igaVarArr2[z ? 1 : 0].F) != 2 && i8 != 5 && i8 != 6 && ((i8 != 7 || cgaVar.Y()) && (i9 = igaVarArr2[z ? 1 : 0].F) != 10 && i9 != 13 && i9 != 14)) {
                if (z) {
                    if (r7Var != null && r7Var.getVisibility() == 4) {
                        if (rjaVar != null) {
                            z9 = rjaVar.G;
                        } else {
                            z9 = aVar.o0;
                        }
                        if (!z9) {
                            if (q()) {
                                this.A0 = (byte) 1;
                                setSearchItemVisibility(0);
                            } else {
                                if (s0()) {
                                    i11 = 8;
                                } else {
                                    i11 = 4;
                                }
                                setSearchItemVisibility(i11);
                            }
                            float f = z ? 1.0f : 0.0f;
                            this.r0 = V(f);
                            K1(1.0f - f);
                            z8 = false;
                        }
                    }
                    z8 = false;
                    this.A0 = (byte) 0;
                    this.r0 = 1.0f;
                } else {
                    z8 = false;
                    if (r7Var != null && r7Var.getVisibility() == 4) {
                        if (q()) {
                            this.A0 = (byte) 0;
                            this.r0 = 1.0f;
                            setSearchItemVisibility(0);
                        } else {
                            if (s0()) {
                                i10 = 8;
                            } else {
                                i10 = 4;
                            }
                            setSearchItemVisibility(i10);
                            this.r0 = 0.0f;
                        }
                    }
                }
                G1(z8);
            } else if (z) {
                this.A0 = (byte) 2;
            } else {
                this.A0 = (byte) 0;
                if (r7Var != null) {
                    if (!s0() && !this.Y0) {
                        i = 4;
                    } else {
                        i = 8;
                    }
                    setSearchItemVisibility(i);
                }
            }
            int i24 = igaVarArr2[z ? 1 : 0].F;
            if (i24 == 6) {
                if (!bgaVar.e && !bgaVar.h && bgaVar.d.isEmpty()) {
                    bgaVar.E(0L);
                }
            } else if (i24 != 7) {
                if (j0(i24)) {
                    kha v12 = v1(igaVarArr2[z ? 1 : 0].F);
                    if (v12 != null) {
                        z3b z3bVar = v12.s;
                        v12.P();
                        efa efaVar = igaVarArr2[z ? 1 : 0].w;
                        if (z3bVar != null && (z3bVar.k() || (d0() && z3bVar.g() > 0))) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        efaVar.e(z5, z);
                        if (z3bVar != null && z3bVar.g() > 0 && !q0()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z4 = z6;
                    }
                } else {
                    int i25 = igaVarArr2[z ? 1 : 0].F;
                    if (i25 != 10 && i25 != 11 && i25 != 12 && i25 != 13 && i25 != 14) {
                        if (i25 == 15) {
                            i25 = 8;
                        }
                        cha chaVar5 = chaVarArr[i25];
                        if (!chaVar5.g && !chaVar5.i[0] && chaVar5.a.isEmpty()) {
                            chaVarArr[i25].g = true;
                            y59Var2.f();
                            if (i25 == 0) {
                                byte b = chaVarArr[0].q;
                                if (b == 1) {
                                    i2 = 6;
                                } else if (b == 2) {
                                    i2 = 7;
                                }
                                d dVar = this.y1;
                                dVar.getMediaDataController().P0(this.m1, 50, 0, 0, i2, this.G, 1, dVar.getClassGuid(), chaVarArr[i2].p, null, null);
                            }
                            i2 = i25;
                            d dVar2 = this.y1;
                            dVar2.getMediaDataController().P0(this.m1, 50, 0, 0, i2, this.G, 1, dVar2.getClassGuid(), chaVarArr[i2].p, null, null);
                        }
                    }
                }
            }
            int i26 = igaVarArr2[z ? 1 : 0].F;
            if (i26 != 8 && !t0(i26)) {
                iga igaVar10 = igaVarArr2[z ? 1 : 0];
                if (igaVar10.F == 9) {
                    if (r0()) {
                        igaVarArr2[z ? 1 : 0].w.b.setVisibility(8);
                        igaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        igaVarArr2[z ? 1 : 0].w.b.setVisibility(0);
                        igaVarArr2[z ? 1 : 0].w.setStickerType(11);
                        igaVarArr2[z ? 1 : 0].w.f.setVisibility(0);
                        igaVarArr2[z ? 1 : 0].w.f.h(f(), false);
                    }
                    igaVarArr2[z ? 1 : 0].w.d.setText(jb6.M0(2131747980, null));
                    l66 l66Var = igaVarArr2[z ? 1 : 0].w.e;
                    if (s0()) {
                        str = jb6.M0(2131747981, null);
                    }
                    l66Var.setText(str);
                    i3 = 4;
                    igaVarArr2[z ? 1 : 0].w.f.setOnClickListener(new pda(this, (byte) 4));
                    i5 = 8;
                } else {
                    i3 = 4;
                    igaVar10.w.b.setVisibility(0);
                    igaVarArr2[z ? 1 : 0].w.setStickerType(1);
                    igaVarArr2[z ? 1 : 0].w.d.setText(jb6.M0(2131747901, null));
                    igaVarArr2[z ? 1 : 0].w.e.setText(jb6.M0(2131745541, null));
                    i5 = 8;
                    igaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                }
            } else {
                i3 = 4;
                iga igaVar11 = igaVarArr2[z ? 1 : 0];
                efa efaVar2 = igaVar11.w;
                boolean t0 = t0(igaVar11.F);
                int s1 = s1(igaVarArr2[z ? 1 : 0].F);
                bf0 bf0Var = efaVar2.b;
                b61 b61Var = efaVar2.f;
                if (!t0 && !r0() && !l0()) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                bf0Var.setVisibility(i4);
                if (t0) {
                    b61Var.setVisibility(0);
                    b61Var.h(jb6.M0(2131744494, null), false);
                    i5 = 8;
                } else if (r0()) {
                    i5 = 8;
                    b61Var.setVisibility(8);
                } else {
                    i5 = 8;
                    efaVar2.setStickerType(11);
                    if (!q0()) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    b61Var.setVisibility(i6);
                    b61Var.h(f(), false);
                }
                xna xnaVar = efaVar2.d;
                if (t0) {
                    xnaVar.setText(jb6.M0(2131744472, null));
                    efaVar2.e.setText(jb6.M0(2131744473, null));
                } else {
                    if (!q0()) {
                        if (s0()) {
                            i7 = 2131747910;
                        } else {
                            i7 = 2131747881;
                        }
                    } else {
                        i7 = 2131747938;
                    }
                    xnaVar.setText(jb6.M0(i7, null));
                    l66 l66Var2 = efaVar2.e;
                    if (s0()) {
                        str = jb6.M0(2131747882, null);
                    }
                    l66Var2.setText(str);
                }
                b61Var.setOnClickListener(new as8(this, t0, s1, (byte) 1));
            }
            z7 = false;
            igaVarArr2[z ? 1 : 0].h.setVisibility(0);
            m69Var3 = m69Var2;
        }
        int i27 = i14;
        iga igaVar12 = igaVarArr2[z ? 1 : 0];
        igaVar12.b = z4;
        D1(igaVar12, z7);
        igaVarArr2[z ? 1 : 0].x.x1(i27);
        igaVarArr2[z ? 1 : 0].h.b0();
        if (m69Var3 != null) {
            igaVarArr2[z ? 1 : 0].h.setRecycledViewPool(m69Var3);
            igaVarArr2[z ? 1 : 0].n.setRecycledViewPool(m69Var3);
        }
        if (this.A0 == 2) {
            if (rjaVar != null) {
                z11 = rjaVar.G;
            } else {
                z11 = aVar.o0;
            }
            if (z11) {
                this.C0 = true;
                if (rjaVar != null) {
                    rjaVar.o(true);
                } else {
                    aVar.o(true);
                }
                this.A0 = (byte) 0;
                this.r0 = 0.0f;
                if (r7Var != null) {
                    if (s0()) {
                        i12 = i5;
                    } else {
                        i12 = i3;
                    }
                    setSearchItemVisibility(i12);
                }
                G1(false);
            }
        }
    }

    public void J0(SparseArray sparseArray) {
    }

    public void K0() {
    }

    public void Q0() {
    }

    public void R0(boolean z) {
    }

    public int c1(int i) {
        return i;
    }

    @Override
    public final void o(hg3 hg3Var) {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void u(hg3 hg3Var) {
    }

    @Override
    public final void v(hg3 hg3Var) {
    }
}
