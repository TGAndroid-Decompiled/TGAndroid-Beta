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
public abstract class nfa extends FrameLayout implements tjb, gk7, qe3, i39 {
    public static final int[] t2 = {0, 1, 2, 4};
    public static final ef3 u2 = new ef3((byte) 3);
    public static final int v2 = gl.L(7.0f);
    public static final int w2 = gl.L(7.0f) + gl.L(14.0f);
    public byte A0;
    public boolean A1;
    public final Drawable B0;
    public boolean B1;
    public boolean C0;
    public int C1;
    public final NumberTextView D0;
    public int D1;
    public final pi4 E;
    public final LinearLayout E0;
    public VelocityTracker E1;
    public final boolean F;
    public final ImageView F0;
    public boolean F1;
    public final long G;
    public final ed0 G0;
    public final cea G1;
    public final a H;
    public final ArrayList H0;
    public je5 H1;
    public final pha I;
    public final ArrayList I0;
    public final wjb I1;
    public final xha J;
    public final ArrayList J0;
    public final ix4 J1;
    public final uda K;
    public final ArrayList K0;
    public final wtc K1;
    public final hfa L;
    public final kda L0;
    public boolean L1;
    public final bfa M;
    public final hda M0;
    public final on M1;
    public final afa N;
    public final uk1 N0;
    public t79 N1;
    public final afa O;
    public AnimatorSet O0;
    public int O1;
    public final afa P;
    public final oba P0;
    public boolean P1;
    public final wea Q;
    public final ArrayList Q0;
    public int Q1;
    public final dea R;
    public float R0;
    public AnimatorSet R1;
    public final bea S;
    public final fj3 S0;
    public final SparseArray S1;
    public final zda T;
    public final FrameLayout T0;
    public long T1;
    public final yea U;
    public final gda U0;
    public boolean U1;
    public final zea V;
    public final int V0;
    public int V1;
    public final vda W;
    public final Paint W0;
    public final rda W1;
    public boolean X0;
    public y1b X1;
    public boolean Y0;
    public float Y1;
    public h19 Z0;
    public boolean Z1;
    public boolean a;
    public final kca a0;
    public final int[] a1;
    public SpannableStringBuilder a2;
    public boolean b;
    public final lca b0;
    public int b1;
    public int b2;
    public boolean c;
    public final oca c0;
    public final SparseArray[] c1;
    public boolean c2;
    public boolean d;
    public final aea d0;
    public int d1;
    public int d2;
    public int e;
    public final is5 e0;
    public boolean e1;
    public int e2;
    public int f;
    public final xda f0;
    public long f1;
    public int f2;
    public final kfa g0;
    public TLRPC.ChatFull g1;
    public int g2;
    public float h;
    public final jca h0;
    public TLRPC.UserFull h1;
    public qw4 h2;
    public final kfa i0;
    public AnimatorSet i1;
    public float i2;
    public final kea j0;
    public boolean j1;
    public final RectF j2;
    public final kea k0;
    public boolean k1;
    public Runnable k2;
    public final kea l0;
    public boolean l1;
    public int l2;
    public final gea m0;
    public final long m1;
    public final HashMap m2;
    public float n;
    public final iea[] n0;
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
    public final uca u1;
    public final ry8 v0;
    public float v1;
    public int w;
    public final r7 w0;
    public final cfa[] w1;
    public int x;
    public final r7 x0;
    public final ffa x1;
    public final Rect y;
    public final r7 y0;
    public final d y1;
    public final r7 z0;
    public int z1;

    public nfa(android.content.Context r34, long r35, defpackage.ffa r37, int r38, java.util.ArrayList r39, org.telegram.tgnet.TLRPC.ChatFull r40, org.telegram.tgnet.TLRPC.UserFull r41, int r42, int r43, org.telegram.ui.ActionBar.d r44, defpackage.cea r45, int r46, defpackage.wjb r47, defpackage.kl0 r48) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfa.<init>(android.content.Context, long, ffa, int, java.util.ArrayList, org.telegram.tgnet.TLRPC$ChatFull, org.telegram.tgnet.TLRPC$UserFull, int, int, org.telegram.ui.ActionBar.d, cea, int, wjb, kl0):void");
    }

    public static bi G(int i, long j, wjb wjbVar, Context context) {
        bi biVar = new bi(context, wjbVar);
        ImageView imageView = (ImageView) biVar.d;
        TextView textView = (TextView) biVar.c;
        if (i == 0) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131748004, null));
                return biVar;
            }
            textView.setText(k96.M0(2131748006, null));
            return biVar;
        } else if (i == 1) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131747965, null));
                return biVar;
            }
            textView.setText(k96.M0(2131747966, null));
            return biVar;
        } else if (i == 2) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131747960, null));
                return biVar;
            }
            textView.setText(k96.M0(2131747961, null));
            return biVar;
        } else if (i == 3) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131747962, null));
                return biVar;
            }
            textView.setText(k96.M0(2131747963, null));
            return biVar;
        } else if (i == 4) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131747967, null));
                return biVar;
            }
            textView.setText(k96.M0(2131747968, null));
            return biVar;
        } else if (i == 5) {
            if (cf3.B(j)) {
                textView.setText(k96.M0(2131747964, null));
                return biVar;
            }
            textView.setText(k96.M0(2131748016, null));
            return biVar;
        } else if (i == 6) {
            imageView.setImageDrawable(null);
            textView.setText(k96.M0(2131748014, null));
            return biVar;
        } else {
            if (i == 7) {
                imageView.setImageDrawable(null);
                textView.setText("");
            }
            return biVar;
        }
    }

    public static int Q(View view) {
        if (view instanceof qfa) {
            return ((qfa) view).getMessageId();
        }
        if (view instanceof iba) {
            return ((iba) view).getMessage().e1();
        }
        if (view instanceof eba) {
            return ((eba) view).getMessage().e1();
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
        if (hc2.b0(this.y1.getCurrentAccount(), this.m1)) {
            return this.G;
        }
        return 0L;
    }

    public g2b getStoriesController() {
        return na7.q1(this.y1.getCurrentAccount()).M1();
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

    public static void m1(iea ieaVar, cfa[] cfaVarArr, boolean z) {
        t7a t7aVar;
        if (z) {
            if (gba.s1 > 0 && ieaVar.G == null && !ieaVar.I && ieaVar.h.getFastScroll() != null && ieaVar.h.getFastScroll().b0 && ieaVar.h.getFastScroll().getVisibility() == 0 && cfaVarArr[0].e() >= 50) {
                int i = gba.s1;
                int i2 = i - 1;
                if (i != i2) {
                    gba.s1 = i2;
                    org.telegram.messenger.a.b.getSharedPreferences("mainconfig", 0).edit().putInt("fastScrollHintCount", gba.s1).apply();
                }
                ieaVar.I = true;
                Context context = ieaVar.getContext();
                ar8 ar8Var = new ar8(context, (byte) 6);
                TextView textView = new TextView(context);
                tb4.u(14.0f, 2131745216, 1, textView, null);
                textView.setMaxLines(3);
                int i3 = bkb.fg;
                zkb.X(textView, i3, null);
                int L = gl.L(6.0f);
                int i4 = bkb.gg;
                ShapeDrawable b0 = bkb.b0(L, bkb.w0(null, i4, false));
                vkb M = zkb.M(i4);
                ar8Var.setBackground(b0);
                zkb.j(ar8Var, b0, M, null, null);
                ar8Var.addView(textView, nme.d(-2, -2.0f, 16, 46.0f, 8.0f, 8.0f, 8.0f));
                ?? view = new View(context);
                view.a = new Random();
                Paint paint = new Paint(1);
                view.b = paint;
                Paint paint2 = new Paint(1);
                view.c = paint2;
                view.f = 1.0f;
                view.h = 0.0f;
                paint.setColor(bm2.o(bkb.w0(null, i3, false), 76));
                paint2.setColor(bkb.w0(null, i3, false));
                Paint paint3 = new Paint();
                view.d = paint3;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                paint3.setShader(new LinearGradient(0.0f, gl.L(4.0f), 0.0f, 0.0f, new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                PorterDuff.Mode mode = PorterDuff.Mode.DST_OUT;
                paint3.setXfermode(new PorterDuffXfermode(mode));
                Paint paint4 = new Paint();
                view.e = paint4;
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, gl.L(4.0f), new int[]{0, -1}, new float[]{0.0f, 1.0f}, tileMode));
                paint4.setXfermode(new PorterDuffXfermode(mode));
                ar8Var.addView((View) view, nme.d(29, 32.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                ieaVar.G = ar8Var;
                ieaVar.addView(ar8Var, nme.c(-2.0f, -2));
                ieaVar.G.setAlpha(0.0f);
                ieaVar.G.setScaleX(0.8f);
                ieaVar.G.setScaleY(0.8f);
                ieaVar.G.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                ieaVar.invalidate();
                t7a t7aVar2 = new t7a(ieaVar, ar8Var, (byte) 3);
                ieaVar.H = t7aVar2;
                gl.e3(t7aVar2, 4000L);
            }
        } else if (ieaVar.G != null && (t7aVar = ieaVar.H) != null) {
            gl.r(t7aVar);
            ieaVar.H.run();
            ieaVar.H = null;
            ieaVar.G = null;
        }
    }

    public void setHeaderEnabled(boolean z) {
        pha phaVar = this.I;
        if (phaVar != null) {
            phaVar.setEnabled(z);
        } else {
            this.H.setEnabled(z);
        }
    }

    private void setPageOverscan(hea heaVar) {
        if (this.c2 && heaVar != null) {
            heaVar.j3 = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) heaVar.getLayoutParams();
            if (marginLayoutParams != null) {
                int i = marginLayoutParams.topMargin;
                int i2 = -this.e2;
                if (i != i2 || marginLayoutParams.bottomMargin != (-this.f2)) {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.bottomMargin = -this.f2;
                    heaVar.setLayoutParams(marginLayoutParams);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfa.A(android.view.MotionEvent):boolean");
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
            gl.B3(f, a8Var, null);
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
                ((xha) r7Var).Y(z4, z);
            }
            xha xhaVar = this.J;
            if (xhaVar != null) {
                if (z3 && q() && !k0() && f0(closestTab)) {
                    z5 = true;
                }
                xhaVar.Y(z5, z2);
            }
        }
    }

    public final void B0(int i, TL_stories.StoryItem storyItem, String str) {
        t79 t79Var = new t79(this, i, storyItem, (byte) 5);
        g2b storiesController = getStoriesController();
        storiesController.getClass();
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(storyItem);
        storiesController.e0(i, this.m1, arrayList);
        u21.b0(this.y1).K(2131623980, gl.T2(k96.G(1, "StoryRemovedFromAlbumTitle", str)), k96.M0(2131743646, null), t79Var).j();
    }

    public final void B1() {
        if (this.I == null) {
            try {
                int c0 = c0(bkb.x8);
                int c02 = c0(bkb.y8);
                if (c0 != this.r2 || c02 != this.s2) {
                    this.r2 = c0;
                    this.s2 = c02;
                    r7[] r7VarArr = {this.x0, this.w0, this.y0, this.z0, this.o0};
                    for (int i = 0; i < 5; i++) {
                        r7 r7Var = r7VarArr[i];
                        if (r7Var != null) {
                            r7Var.setIconColor(c0);
                            if (r7Var.getBackground() != null) {
                                bkb.F1(r7Var.getBackground(), c02, true);
                            }
                        }
                    }
                }
            } catch (Exception e) {
                fa4.g(e, true);
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
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[0];
        if (ieaVar != null && ieaVarArr[1] != null) {
            float f2 = 0.0f;
            oca ocaVar = this.c0;
            if (ocaVar != null) {
                if (j0(ieaVar.F) && ieaVarArr[0].F != 9) {
                    c = 1;
                } else {
                    c = 0;
                }
                if (ieaVarArr[1].getVisibility() == 0) {
                    if (j0(ieaVarArr[1].F) && ieaVarArr[1].F != 9) {
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
                        measuredWidth = ieaVarArr[0].getMeasuredWidth();
                        abs = 0.0f;
                    }
                    ocaVar.setTranslationX(measuredWidth);
                } else {
                    ocaVar.setTranslationX(ieaVarArr[c ^ 1].getTranslationX());
                    abs = 1.0f - (Math.abs(ocaVar.getTranslationX()) / ocaVar.getMeasuredWidth());
                }
                float f3 = 0.0f;
                for (int i = 0; i < ieaVarArr.length; i++) {
                    if (ieaVarArr[i].getVisibility() == 0) {
                        sca scaVar = ieaVarArr[i].h;
                        if (scaVar.getChildCount() == 0) {
                            childAt = null;
                        } else {
                            childAt = scaVar.getChildAt(0);
                        }
                        if (childAt == null) {
                            R = -1;
                        } else {
                            R = RecyclerView.R(childAt);
                        }
                        if (R == 0) {
                            f = childAt.getY() - scaVar.getPaddingTop();
                        } else if (scaVar.getChildCount() == 0) {
                            f = 0.0f;
                        } else {
                            f = -gl.L(48.0f);
                        }
                        f3 += Utilities.l(1.0f - (ieaVarArr[i].getTranslationX() / ieaVarArr[i].getMeasuredWidth())) * f;
                    }
                }
                float l = Utilities.l(1.0f - ((-f3) / gl.N(48.0f)));
                float R1 = gl.R1(0.9f, 1.0f, l);
                ocaVar.setAlpha(l);
                ocaVar.setScaleX(R1);
                ocaVar.setScaleY(R1);
                ocaVar.setTranslationY(this.O1 + f3);
                f2 = abs;
            }
            fj3 fj3Var = this.S0;
            if (fj3Var != null) {
                fj3Var.setTranslationY(this.O1);
            }
            if (this.Y1 != f2) {
                this.Y1 = f2;
                invalidate();
            }
        }
    }

    public final void C0(TL_stories.StoryItem storyItem) {
        getStoriesController().r0(this.m1, new ArrayList(Collections.singletonList(storyItem)), false, null);
        u21.b0(this.y1).G(2131623980, 5000, k96.G(1, "StoryArchived", new Object[0])).j();
    }

    public final void C1() {
        if (n0()) {
            post(new oba(this, (byte) 13));
            return;
        }
        uda udaVar = this.K;
        if (udaVar != null) {
            udaVar.f();
        }
        afa afaVar = this.N;
        if (afaVar != null) {
            afaVar.f();
        }
        afa afaVar2 = this.O;
        if (afaVar2 != null) {
            afaVar2.f();
        }
        bfa bfaVar = this.M;
        if (bfaVar != null) {
            bfaVar.X(false);
        }
        afa afaVar3 = this.P;
        if (afaVar3 != null) {
            afaVar3.f();
        }
        wea weaVar = this.Q;
        if (weaVar != null) {
            weaVar.f();
        }
        dea deaVar = this.R;
        if (deaVar != null) {
            deaVar.f();
        }
        xda xdaVar = this.f0;
        if (xdaVar != null) {
            xdaVar.f();
        }
        for (mfa mfaVar : this.m2.values()) {
            mfaVar.c.f();
        }
    }

    public final boolean D() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfa.D():boolean");
    }

    public final void D0(int i, long j, ArrayList arrayList) {
        getStoriesController().a(i, j, arrayList);
    }

    public final void D1(iea ieaVar, boolean z) {
        boolean z2;
        Integer num = 1;
        int i = 0;
        if (ieaVar.b && this.d) {
            z2 = true;
        } else {
            z2 = false;
        }
        v29 fastScroll = ieaVar.h.getFastScroll();
        ObjectAnimator objectAnimator = ieaVar.c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            ieaVar.c.cancel();
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
                ieaVar.c = ofFloat;
                ofFloat.setDuration(150L).start();
                fastScroll.setTag(num);
            }
        } else if (fastScroll.getTag() != null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(fastScroll, property, fastScroll.getAlpha(), 0.0f);
            ofFloat2.addListener(new id4(fastScroll));
            ieaVar.c = ofFloat2;
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
        kca kcaVar = this.a0;
        if (kcaVar != null) {
            kcaVar.h();
            kcaVar.j();
        }
        l1(false);
        J1(z);
        yea yeaVar = this.U;
        if (yeaVar != null) {
            yeaVar.x.clear();
        }
        return true;
    }

    public final void E0(int i, long j) {
        u1b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        TL_stories.TL_deleteAlbum tL_deleteAlbum = new TL_stories.TL_deleteAlbum();
        tL_deleteAlbum.peer = na7.q1(i2).h1(A.b);
        tL_deleteAlbum.album_id = ((z1b) A.h.remove(c)).a;
        ConnectionsManager.getInstance(i2).sendRequest(tL_deleteAlbum, null);
        A.f(true);
    }

    public final void E1() {
        boolean z;
        float f;
        r7 r7Var = this.w0;
        if (r7Var != null) {
            if (!this.y1.getMessagesController().z2(this.m1) && !e0()) {
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
                int i = bkb.y8;
                ff0 f0 = bkb.f0(c0(i), 5, -1);
                vkb M = zkb.M(i);
                r7Var.setBackground(f0);
                zkb.j(r7Var, f0, null, M, this.I1);
            }
        }
    }

    public final r7 F(Context context, int i, int i2, String str) {
        r7 r7Var;
        pha phaVar = this.I;
        if (phaVar != null) {
            r7Var = phaVar.q().a(i, i2);
        } else {
            int i3 = bkb.y8;
            int c0 = c0(i3);
            int i4 = bkb.x8;
            r7 r7Var2 = new r7(context, null, c0, c0(i4), false, null);
            r7Var2.setIcon(i2);
            r7Var2.setDuplicateParentStateEnabled(false);
            this.E0.addView(r7Var2, new LinearLayout.LayoutParams(gl.L(54.0f), -1));
            this.Q0.add(r7Var2);
            ry8 iconView = r7Var2.getIconView();
            wjb wjbVar = this.I1;
            if (iconView != null) {
                zkb.s(r7Var2.getIconView(), i4, wjbVar, PorterDuff.Mode.SRC_IN);
            }
            if (r7Var2.getBackground() != null) {
                Drawable background = r7Var2.getBackground();
                vkb M = zkb.M(i3);
                r7Var2.setBackground(background);
                zkb.j(r7Var2, background, null, M, wjbVar);
            }
            r7Var = r7Var2;
        }
        r7Var.setContentDescription(str);
        r7Var.setOnClickListener(new hb(this, i, (byte) 7));
        return r7Var;
    }

    public final void F0(int i, String str, long j) {
        u1b A = getStoriesController().A(j, true);
        int i2 = A.a;
        int c = A.c(i);
        if (c == -1) {
            return;
        }
        ((z1b) A.h.get(c)).b = str;
        TL_stories.TL_updateAlbum tL_updateAlbum = new TL_stories.TL_updateAlbum();
        tL_updateAlbum.peer = na7.q1(i2).h1(A.b);
        tL_updateAlbum.album_id = i;
        tL_updateAlbum.title = str;
        ConnectionsManager.getInstance(i2).sendRequest(tL_updateAlbum, null);
        A.f(true);
    }

    public final void F1() {
        int i;
        lca lcaVar = this.b0;
        if (lcaVar != null) {
            int L = gl.L(48.0f) + this.d2;
            fj3 fj3Var = this.S0;
            if (fj3Var != null) {
                i = (int) fj3Var.c(gl.L(7.0f));
            } else {
                i = 0;
            }
            lcaVar.setPaddingTop(L + i);
        }
    }

    public final void G0(boolean z) {
        long j = this.G;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0 && !q0()) {
            for (int i2 = 0; i2 < 4; i2++) {
                int i3 = t2[i2];
                cfa[] cfaVarArr = this.w1;
                if (!cfaVarArr[i3].h || z) {
                    long j2 = this.m1;
                    if (!cf3.B(j2)) {
                        cfaVarArr[i3].h = false;
                        TLRPC.TL_messages_getSearchResultsPositions tL_messages_getSearchResultsPositions = new TLRPC.TL_messages_getSearchResultsPositions();
                        if (i3 == 0) {
                            byte b = cfaVarArr[i3].q;
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
                        tL_messages_getSearchResultsPositions.peer = dVar.getMessagesController().h1(j2);
                        if (i != 0 && dVar.getUserConfig().e() == j2) {
                            tL_messages_getSearchResultsPositions.flags |= 4;
                            tL_messages_getSearchResultsPositions.saved_peer_id = dVar.getMessagesController().h1(j);
                        }
                        ConnectionsManager.getInstance(dVar.getCurrentAccount()).bindRequestToGuid(ConnectionsManager.getInstance(dVar.getCurrentAccount()).sendRequest(tL_messages_getSearchResultsPositions, new fl6(this, cfaVarArr[i3].p, i3, (byte) 2)), dVar.getClassGuid());
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
        lca lcaVar;
        oca ocaVar;
        boolean z2 = true;
        B(true, true);
        ry8 ry8Var = this.v0;
        if (ry8Var == null) {
            return;
        }
        float f = 0.0f;
        if (!this.Y0 && (((lcaVar = this.b0) == null || !lcaVar.g()) && ((ocaVar = this.c0) == null || !ocaVar.f))) {
            f = Utilities.i(this.r0 + this.s0, 1.0f, 0.0f);
        }
        ry8Var.setAlpha(f);
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
        return this instanceof qc5;
    }

    public final void H0(int i) {
        int i2;
        int i3 = 2;
        cfa[] cfaVarArr = this.w1;
        if (i == 0) {
            byte b = cfaVarArr[0].q;
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
        cfaVarArr[i].g = true;
        d dVar = this.y1;
        dVar.getMediaDataController().P0(this.m1, 50, 0, cfaVarArr[i].k, i2, this.G, 1, dVar.getClassGuid(), cfaVarArr[i].p, null, null);
    }

    public final void H1(iea ieaVar) {
        boolean z;
        boolean c1 = ieaVar.h.c1();
        if (c1) {
            ieaVar.h.setSectionsDrawBackground(this.c2);
        }
        if (this.c2 && !c1 && ieaVar.F != 15) {
            z = true;
        } else {
            z = false;
        }
        iea.a(ieaVar, z);
        if (ieaVar.F == 15) {
            Drawable drawable = ieaVar.P;
            if (drawable == null) {
                drawable = ieaVar.getBackground();
            }
            Drawable d = zi8.d(drawable, this.y1.getCurrentAccount(), this.m1, bkb.I.o());
            if (this.c2) {
                ieaVar.setBackground(null);
                ieaVar.setClipToOutline(false);
                iea.b(ieaVar, d);
                return;
            }
            iea.b(ieaVar, null);
            ieaVar.setBackground(d);
            ieaVar.setOutlineProvider(new xi((byte) 18));
            ieaVar.setClipToOutline(true);
            return;
        }
        ieaVar.setClipToOutline(false);
        ieaVar.setBackground(null);
        iea.b(ieaVar, null);
    }

    public final boolean I(MotionEvent motionEvent) {
        View view = (View) getParent();
        float x = (-view.getX()) - getX();
        iea[] ieaVarArr = this.n0;
        motionEvent.offsetLocation(x - ieaVarArr[0].h.getFastScroll().getX(), (((-view.getY()) - getY()) - ieaVarArr[0].getY()) - ieaVarArr[0].h.getFastScroll().getY());
        return ieaVarArr[0].h.getFastScroll().dispatchTouchEvent(motionEvent);
    }

    public int I0() {
        return 0;
    }

    public final void I1(iea ieaVar) {
        boolean z;
        float f;
        int i;
        float f2;
        int i2 = ieaVar.F;
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
        FrameLayout.LayoutParams d = nme.d(-1, -1.0f, 119, f, f3, f2, f2);
        d.topMargin = X(ieaVar.F) + d.topMargin;
        ViewGroup.LayoutParams layoutParams = ieaVar.s.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.leftMargin == d.leftMargin && layoutParams2.topMargin == d.topMargin && layoutParams2.rightMargin == d.rightMargin && layoutParams2.bottomMargin == d.bottomMargin && layoutParams2.gravity == d.gravity) {
                return;
            }
        }
        ieaVar.s.setLayoutParams(d);
    }

    public final boolean J(int i) {
        cfa[] cfaVarArr = this.x1.n;
        if (cfaVarArr == null) {
            return false;
        }
        cfa[] cfaVarArr2 = this.w1;
        if (i == 0) {
            cfa cfaVar = cfaVarArr2[i];
            if (!cfaVar.h) {
                int[] iArr = cfaVar.f;
                int[] iArr2 = cfaVarArr[i].f;
                iArr[0] = iArr2[0];
                iArr[1] = iArr2[1];
            }
        } else {
            int[] iArr3 = cfaVarArr2[i].f;
            int[] iArr4 = cfaVarArr[i].f;
            iArr3[0] = iArr4[0];
            iArr3[1] = iArr4[1];
        }
        cfaVarArr2[i].a.addAll(cfaVarArr[i].a);
        cfaVarArr2[i].c.addAll(cfaVarArr[i].c);
        for (Map.Entry entry : cfaVarArr[i].d.entrySet()) {
            cfaVarArr2[i].d.put((String) entry.getKey(), new ArrayList((Collection) entry.getValue()));
        }
        for (int i2 = 0; i2 < 2; i2++) {
            cfaVarArr2[i].b[i2] = cfaVarArr[i].b[i2].clone();
            cfa cfaVar2 = cfaVarArr2[i];
            int[] iArr5 = cfaVar2.j;
            cfa cfaVar3 = cfaVarArr[i];
            iArr5[i2] = cfaVar3.j[i2];
            cfaVar2.i[i2] = cfaVar3.i[i2];
        }
        cfaVarArr2[i].e.addAll(cfaVarArr[i].e);
        return !cfaVarArr[i].a.isEmpty();
    }

    public final void J1(boolean z) {
        int i = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i < ieaVarArr.length) {
                int childCount = ieaVarArr[i].h.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = ieaVarArr[i].h.getChildAt(i2);
                    if (childAt instanceof iba) {
                        ((iba) childAt).b(false, z);
                    } else if (childAt instanceof qfa) {
                        ((qfa) childAt).i(false, z);
                    } else if (childAt instanceof lba) {
                        ((lba) childAt).f(false, z);
                    } else if (childAt instanceof eba) {
                        ((eba) childAt).e(false, z);
                    } else if (childAt instanceof bw2) {
                        ((bw2) childAt).c(false, z);
                    } else if (childAt instanceof ue3) {
                        ((ue3) childAt).e0(false, z);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final boolean K(int r27, defpackage.mea r28) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfa.K(int, mea):boolean");
    }

    public final void K1(float f) {
        r7 r7Var = this.p0;
        if (r7Var == null) {
            return;
        }
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[1];
        float f2 = 0.0f;
        if (ieaVar != null && ieaVar.F == 11) {
            f2 = 0.0f + f;
        }
        int i = 0;
        iea ieaVar2 = ieaVarArr[0];
        if (ieaVar2 != null && ieaVar2.F == 11) {
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

    public final void L(int i, o39 o39Var, boolean z) {
        nea neaVar;
        ArrayList arrayList = this.w1[i].e;
        int K0 = ((t26) o39Var.getLayoutManager()).K0();
        if (K0 >= 0) {
            int i2 = 0;
            while (true) {
                if (i2 < arrayList.size()) {
                    if (K0 <= ((nea) arrayList.get(i2)).b) {
                        neaVar = (nea) arrayList.get(i2);
                        break;
                    }
                    i2++;
                } else {
                    neaVar = null;
                    break;
                }
            }
            if (neaVar == null) {
                neaVar = (nea) b00.f(1, arrayList);
            }
            if (neaVar != null) {
                v0(i, neaVar.d, neaVar.b + 1, z);
            }
        }
    }

    public final void L0() {
        y1b y1bVar;
        y1b y1bVar2;
        this.K1.a();
        xda xdaVar = this.f0;
        if (xdaVar != null && (y1bVar2 = xdaVar.s) != null && y1bVar2 != null) {
            y1bVar2.z(xdaVar.w);
        }
        jca jcaVar = this.h0;
        if (jcaVar != null && (y1bVar = jcaVar.s) != null && y1bVar != null) {
            y1bVar.z(jcaVar.w);
        }
        for (mfa mfaVar : this.m2.values()) {
            lfa lfaVar = mfaVar.c;
            y1b y1bVar3 = lfaVar.s;
            if (y1bVar3 != null && y1bVar3 != null) {
                y1bVar3.z(lfaVar.w);
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
        iea ieaVar = this.n0[1];
        if (ieaVar == null || ieaVar.F != 11) {
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
        scaleX.scaleY(f3).withEndAction(new k08((byte) 12, this, z)).setDuration(420L).setInterpolator(s33.h).start();
    }

    public final void M() {
        iea[] ieaVarArr;
        iea ieaVar;
        boolean z;
        int i;
        w39 adapter;
        if (this.r1) {
            int i2 = 0;
            while (true) {
                ieaVarArr = this.n0;
                if (i2 < ieaVarArr.length) {
                    ieaVar = ieaVarArr[i2];
                    if (ieaVar.F == this.s1) {
                        break;
                    }
                    i2++;
                } else {
                    ieaVar = null;
                    break;
                }
            }
            if (ieaVar != null) {
                boolean j0 = j0(ieaVar.F);
                float f = this.q1;
                float f2 = 1.0f;
                int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                cfa[] cfaVarArr = this.w1;
                if (i3 == 0) {
                    this.r1 = false;
                    int i4 = this.t1;
                    int[] iArr = this.p1;
                    iArr[j0 ? 1 : 0] = i4;
                    if (!j0) {
                        gba.A(i4);
                    } else if (W(ieaVar.F) >= 5) {
                        gba.E(this.t1);
                    }
                    for (int i5 = 0; i5 < ieaVarArr.length; i5++) {
                        iea ieaVar2 = ieaVarArr[i5];
                        if (ieaVar2 != null && ieaVar2.h != null && (((i = ieaVar2.F) == 0 || j0(i)) && (adapter = ieaVarArr[i5].h.getAdapter()) != null)) {
                            int b = adapter.b();
                            if (i5 == 0) {
                                cfaVarArr[0].g(false);
                            }
                            ieaVarArr[i5].n.setVisibility(8);
                            ieaVarArr[i5].x.x1(iArr[j0 ? 1 : 0]);
                            ieaVarArr[i5].h.b0();
                            ieaVarArr[i5].h.invalidate();
                            if (adapter.b() == b) {
                                gl.W3(ieaVarArr[i5].h);
                            } else {
                                adapter.f();
                            }
                        }
                    }
                    if (this.s >= 0) {
                        for (int i6 = 0; i6 < ieaVarArr.length; i6++) {
                            iea ieaVar3 = ieaVarArr[i6];
                            if (ieaVar3.F == this.s1) {
                                View m = ieaVar3.r.m(this.s);
                                if (m != null) {
                                    this.w = m.getTop();
                                }
                                iea ieaVar4 = ieaVarArr[i6];
                                ieaVar4.x.g1(this.s, (-ieaVar4.h.getPaddingTop()) + this.w);
                            }
                        }
                        return;
                    }
                    e1();
                } else if (f == 0.0f) {
                    this.r1 = false;
                    if (this.s1 == 0) {
                        cfaVarArr[0].g(false);
                    }
                    ieaVar.n.setVisibility(8);
                    ieaVar.h.invalidate();
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
                    ofFloat.addUpdateListener(new jda(this, ieaVar, (byte) 0));
                    ofFloat.addListener(new rp1(this, z, j0 ? 1 : 0, ieaVar));
                    ofFloat.setInterpolator(s33.f);
                    ofFloat.setDuration(200L);
                    ofFloat.start();
                }
            }
        }
    }

    public final void M0(int i, View view, k27 k27Var, int i2) {
        TLRPC.WebPage webPage;
        String str;
        char c;
        int i3;
        int i4;
        boolean z;
        if (k27Var != null && !this.r1) {
            oca ocaVar = this.c0;
            if (ocaVar == null || !ocaVar.f) {
                int i5 = 0;
                boolean z2 = false;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                boolean z6 = false;
                i5 = 0;
                String str2 = null;
                y1b y1bVar = null;
                if (this.F1) {
                    int i6 = 8;
                    if (i2 != 8 || p()) {
                        if (k27.B0(k27Var.k) == this.m1) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        SparseArray[] sparseArrayArr = this.c1;
                        if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                            sparseArrayArr[c].remove(k27Var.e1());
                            if (!k27Var.s(null, false)) {
                                this.d1--;
                            }
                        } else {
                            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() < 100) {
                                sparseArrayArr[c].put(k27Var.e1(), k27Var);
                                if (!k27Var.s(null, false)) {
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
                        if (view instanceof iba) {
                            iba ibaVar = (iba) view;
                            if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                                z2 = true;
                            }
                            ibaVar.b(z2, true);
                        } else if (view instanceof rfa) {
                            rfa rfaVar = (rfa) view;
                            if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            rfaVar.b(0, z, true);
                        } else if (view instanceof lba) {
                            lba lbaVar = (lba) view;
                            if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                                z3 = true;
                            }
                            lbaVar.f(z3, true);
                        } else if (view instanceof eba) {
                            eba ebaVar = (eba) view;
                            if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                                z4 = true;
                            }
                            ebaVar.e(z4, true);
                        } else if (view instanceof bw2) {
                            bw2 bw2Var = (bw2) view;
                            if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                                z5 = true;
                            }
                            bw2Var.c(z5, true);
                        } else if (view instanceof qfa) {
                            qfa qfaVar = (qfa) view;
                            if (sparseArrayArr[c].indexOfKey(k27Var.e1()) >= 0) {
                                z6 = true;
                            }
                            qfaVar.i(z6, true);
                        }
                    } else {
                        return;
                    }
                } else {
                    uca ucaVar = this.u1;
                    cfa[] cfaVarArr = this.w1;
                    d dVar = this.y1;
                    if (i2 == 0) {
                        cfa cfaVar = cfaVarArr[i2];
                        int i7 = i - cfaVar.m;
                        if (i7 >= 0 && i7 < cfaVar.a.size()) {
                            PhotoViewer.r0().S1(null, dVar, null);
                            PhotoViewer.r0().i1(cfaVarArr[i2].a, i7, this.m1, this.f1, this.G, ucaVar);
                        }
                    } else if (i2 != 2 && i2 != 4) {
                        if (i2 == 5) {
                            PhotoViewer.r0().S1(null, dVar, null);
                            int indexOf = cfaVarArr[i2].a.indexOf(k27Var);
                            if (indexOf < 0) {
                                PhotoViewer.r0().i1(tb4.t(k27Var), 0, 0L, 0L, 0L, ucaVar);
                            } else {
                                PhotoViewer.r0().i1(cfaVarArr[i2].a, indexOf, this.m1, this.f1, this.G, ucaVar);
                            }
                        } else if (i2 == 1) {
                            if (view instanceof iba) {
                                iba ibaVar2 = (iba) view;
                                TLRPC.Document F0 = k27Var.F0();
                                if (ibaVar2.H) {
                                    if (k27Var.x()) {
                                        PhotoViewer.r0().S1(null, dVar, null);
                                        int indexOf2 = cfaVarArr[i2].a.indexOf(k27Var);
                                        if (indexOf2 < 0) {
                                            PhotoViewer.r0().i1(tb4.t(k27Var), 0, 0L, 0L, 0L, ucaVar);
                                            return;
                                        }
                                        PhotoViewer.r0().i1(cfaVarArr[i2].a, indexOf2, this.m1, this.f1, this.G, ucaVar);
                                        return;
                                    }
                                    gl.q2(k27Var, dVar.getParentActivity(), dVar);
                                } else if (!ibaVar2.G) {
                                    k27 message = ibaVar2.getMessage();
                                    message.P = true;
                                    dVar.getFileLoader().X(F0, message, 0, 0);
                                    ibaVar2.f(true);
                                } else {
                                    dVar.getFileLoader().f(F0);
                                    ibaVar2.f(true);
                                }
                            }
                        } else if (i2 == 3) {
                            try {
                                if (k27.n1(k27Var.k) != null) {
                                    webPage = k27.n1(k27Var.k).webpage;
                                } else {
                                    webPage = null;
                                }
                                if (webPage != null && !(webPage instanceof TLRPC.TL_webPageEmpty)) {
                                    if (webPage.cached_page != null) {
                                        LaunchActivity launchActivity = LaunchActivity.H1;
                                        if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(k27Var) == null) {
                                            dVar.createArticleViewer(false).L(k27Var, null, null, null);
                                            return;
                                        }
                                        return;
                                    }
                                    String str3 = webPage.embed_url;
                                    if (str3 != null && str3.length() != 0) {
                                        ou3.I0(dVar, k27Var, this.u1, webPage.site_name, webPage.description, webPage.url, webPage.embed_url, webPage.embed_width, webPage.embed_height, -1, false);
                                        return;
                                    }
                                    str = webPage.url;
                                } else {
                                    str = null;
                                }
                                if (str == null) {
                                    ArrayList arrayList = ((lba) view).F;
                                    if (arrayList.size() > 0) {
                                        str2 = ((CharSequence) arrayList.get(0)).toString();
                                    }
                                    str = str2;
                                }
                                if (str != null) {
                                    Y0(str);
                                }
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                        } else if (j0(i2)) {
                            kfa v1 = v1(i2);
                            if (v1 != null) {
                                y1bVar = v1.s;
                            }
                            if (y1bVar != null) {
                                m8b orCreateStoryViewer = dVar.getOrCreateStoryViewer();
                                Context context = getContext();
                                int e1 = k27Var.e1();
                                p2b a = p2b.a(this.n0[0].h);
                                a.e = new wh9(y1bVar, (byte) 15);
                                if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).s1) {
                                    i5 = gl.L(68.0f);
                                }
                                a.s += i5;
                                orCreateStoryViewer.G(context, e1, y1bVar, a);
                            } else {
                                return;
                            }
                        }
                    } else if (view instanceof eba) {
                        ((eba) view).a();
                    }
                }
                E1();
            }
        }
    }

    public final void M1() {
        boolean z;
        int i;
        y1b y1bVar;
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
                    k27 k27Var = (k27) sparseArrayArr[0].valueAt(i3);
                    xda xdaVar = this.f0;
                    if (xdaVar != null && (y1bVar = xdaVar.s) != null && !y1bVar.m(k27Var.e1())) {
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
            if (!gl.O1() && org.telegram.messenger.a.b.getResources().getConfiguration().orientation == 2) {
                this.D0.setTextSize(18);
            } else {
                this.D0.setTextSize(20);
            }
        }
        if (i == 0) {
            this.K.f();
        }
    }

    public final boolean N0(k27 k27Var, View view, int i, boolean z) {
        oca ocaVar;
        char c;
        int i2;
        int i3;
        final TL_stories.StoryItem storyItem;
        xda xdaVar;
        y1b y1bVar;
        if (!this.F1) {
            d dVar = this.y1;
            if (dVar.getParentActivity() != null && k27Var != null && ((ocaVar = this.c0) == null || !ocaVar.f)) {
                gl.t1(dVar.getParentActivity().getCurrentFocus());
                long j = this.m1;
                int i4 = 8;
                if (z && ((t0(getClosestTab()) || getClosestTab() == 8) && !this.F1)) {
                    if (view instanceof qfa) {
                        qfa qfaVar = (qfa) view;
                        qfaVar.k(qfaVar.n, qfaVar.r, true);
                    }
                    TL_stories.StoryItem storyItem2 = k27Var.l;
                    if (storyItem2 != null) {
                        HashSet hashSet = new HashSet();
                        ArrayList<Integer> arrayList = storyItem2.albums;
                        if (arrayList != null) {
                            hashSet.addAll(arrayList);
                        }
                        boolean t0 = t0(getClosestTab());
                        cs5 J = cs5.J(dVar, view);
                        cs5 K = J.K();
                        K.b(2131231243, k96.M0(2131753753, null), new en1(J, (byte) 0), false);
                        K.j();
                        cs5.e(K, getStoriesController().A(j, true), hashSet, true, new q3a(this, storyItem2, J, (byte) 4), new au0(this, hashSet, storyItem2, J, (byte) 21));
                        J.b(2131231769, k96.M0(2131744568, null), new c10(J, K, (byte) 10), false);
                        J.j();
                        J.b(2131232362, k96.M0(2131744552, null), new q76(this, k27Var, view, i, (byte) 28), false);
                        if (t0) {
                            int s1 = s1(getClosestTab());
                            String v = getStoriesController().v(s1, j);
                            J.b(2131232778, k96.M0(2131744553, null), new sba(this, s1, (byte) 0), false);
                            storyItem = storyItem2;
                            J.b(2131232334, k96.M0(2131744554, null), new q76(this, s1, storyItem, v, (byte) 29), false);
                        } else {
                            storyItem = storyItem2;
                            if (getClosestTab() == 8 && (xdaVar = this.f0) != null && (y1bVar = xdaVar.s) != null) {
                                if (y1bVar.m(storyItem.id)) {
                                    J.b(2131231004, k96.M0(2131744550, null), new Runnable(this) {
                                        public final nfa b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r3;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            nfa nfaVar = this.b;
                                            switch (b) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nfaVar.I1, nfaVar.getContext());
                                                    String M0 = k96.M0(2131751475, null);
                                                    hd hdVar = alertDialog$Builder.a;
                                                    hdVar.S = M0;
                                                    hdVar.U = k96.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.j(k96.M0(2131751586, null), new aca(nfaVar, storyItem3));
                                                    alertDialog$Builder.g(k96.M0(2131752577, null), new ho9((byte) 14));
                                                    hdVar.show();
                                                    hdVar.h();
                                                    return;
                                                case 1:
                                                    nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                    return;
                                                case 2:
                                                    nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                    return;
                                                default:
                                                    nfaVar.C0(storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                } else {
                                    J.b(2131231000, k96.M0(2131744555, null), new Runnable(this) {
                                        public final nfa b;

                                        {
                                            this.b = this;
                                        }

                                        @Override
                                        public final void run() {
                                            byte b = r3;
                                            TL_stories.StoryItem storyItem3 = storyItem;
                                            nfa nfaVar = this.b;
                                            switch (b) {
                                                case 0:
                                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nfaVar.I1, nfaVar.getContext());
                                                    String M0 = k96.M0(2131751475, null);
                                                    hd hdVar = alertDialog$Builder.a;
                                                    hdVar.S = M0;
                                                    hdVar.U = k96.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                                    alertDialog$Builder.j(k96.M0(2131751586, null), new aca(nfaVar, storyItem3));
                                                    alertDialog$Builder.g(k96.M0(2131752577, null), new ho9((byte) 14));
                                                    hdVar.show();
                                                    hdVar.h();
                                                    return;
                                                case 1:
                                                    nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                                    return;
                                                case 2:
                                                    nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                                    return;
                                                default:
                                                    nfaVar.C0(storyItem3);
                                                    return;
                                            }
                                        }
                                    }, false);
                                }
                            }
                            J.b(2131232056, k96.M0(2131744560, null), new Runnable(this) {
                                public final nfa b;

                                {
                                    this.b = this;
                                }

                                @Override
                                public final void run() {
                                    byte b = r3;
                                    TL_stories.StoryItem storyItem3 = storyItem;
                                    nfa nfaVar = this.b;
                                    switch (b) {
                                        case 0:
                                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nfaVar.I1, nfaVar.getContext());
                                            String M0 = k96.M0(2131751475, null);
                                            hd hdVar = alertDialog$Builder.a;
                                            hdVar.S = M0;
                                            hdVar.U = k96.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                            alertDialog$Builder.j(k96.M0(2131751586, null), new aca(nfaVar, storyItem3));
                                            alertDialog$Builder.g(k96.M0(2131752577, null), new ho9((byte) 14));
                                            hdVar.show();
                                            hdVar.h();
                                            return;
                                        case 1:
                                            nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                            return;
                                        case 2:
                                            nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                            return;
                                        default:
                                            nfaVar.C0(storyItem3);
                                            return;
                                    }
                                }
                            }, false);
                        }
                        J.b(2131232113, k96.M0(2131751586, null), new Runnable(this) {
                            public final nfa b;

                            {
                                this.b = this;
                            }

                            @Override
                            public final void run() {
                                byte b = r3;
                                TL_stories.StoryItem storyItem3 = storyItem;
                                nfa nfaVar = this.b;
                                switch (b) {
                                    case 0:
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, nfaVar.I1, nfaVar.getContext());
                                        String M0 = k96.M0(2131751475, null);
                                        hd hdVar = alertDialog$Builder.a;
                                        hdVar.S = M0;
                                        hdVar.U = k96.G(1, "DeleteStoriesSubtitle", new Object[0]);
                                        alertDialog$Builder.j(k96.M0(2131751586, null), new aca(nfaVar, storyItem3));
                                        alertDialog$Builder.g(k96.M0(2131752577, null), new ho9((byte) 14));
                                        hdVar.show();
                                        hdVar.h();
                                        return;
                                    case 1:
                                        nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), false);
                                        return;
                                    case 2:
                                        nfaVar.a1(new ArrayList(Collections.singletonList(Integer.valueOf(storyItem3.id))), true);
                                        return;
                                    default:
                                        nfaVar.C0(storyItem3);
                                        return;
                                }
                            }
                        }, true);
                        J.i = (byte) 3;
                        J.u = true;
                        J.v = true;
                        J.L = true;
                        J.M = (byte) 3;
                        Point point = gl.q;
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
                    if (k27.B0(k27Var.k) == j) {
                        c = 0;
                    } else {
                        c = 1;
                    }
                    SparseArray[] sparseArrayArr = this.c1;
                    sparseArrayArr[c].put(k27Var.e1(), k27Var);
                    if (!k27Var.s(null, false)) {
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
                        gl.y(view2);
                        arrayList2.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                        i5++;
                    }
                    animatorSet.playTogether(arrayList2);
                    animatorSet.setDuration(250L);
                    animatorSet.start();
                    this.e1 = false;
                    if (view instanceof iba) {
                        ((iba) view).b(true, true);
                    } else if (view instanceof rfa) {
                        ((rfa) view).b(i, true, true);
                    } else if (view instanceof lba) {
                        ((lba) view).f(true, true);
                    } else if (view instanceof eba) {
                        ((eba) view).e(true, true);
                    } else if (view instanceof bw2) {
                        ((bw2) view).c(true, true);
                    } else if (view instanceof qfa) {
                        ((qfa) view).i(true, true);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfa.N1(boolean):void");
    }

    public final String O(boolean z) {
        int i;
        int i2;
        TLRPC.MessageMedia messageMedia;
        kca kcaVar;
        if (!l0()) {
            return k96.M0(2131753002, null);
        }
        if (z && (kcaVar = this.a0) != null) {
            return kcaVar.getBotPreviewsSubtitle();
        }
        xda xdaVar = this.f0;
        if (xdaVar != null && xdaVar.s != null) {
            i = 0;
            i2 = 0;
            for (int i3 = 0; i3 < xdaVar.s.i.size(); i3++) {
                k27 k27Var = (k27) xdaVar.s.i.get(i3);
                TL_stories.StoryItem storyItem = k27Var.l;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    if (k27.J4(messageMedia.document)) {
                        i2++;
                    } else if (k27Var.l.media.photo != null) {
                        i++;
                    }
                }
            }
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return k96.M0(2131753002, null);
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            sb.append(k96.G(i, "Images", new Object[0]));
        }
        if (i2 > 0) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(k96.G(i2, "Videos", new Object[0]));
        }
        return sb.toString();
    }

    public boolean O0(TLRPC.ChatParticipant chatParticipant, boolean z, View view) {
        return false;
    }

    public final Boolean O1(View view, View view2) {
        if (!this.r1) {
            iea[] ieaVarArr = this.n0;
            boolean z = false;
            iea ieaVar = ieaVarArr[0];
            if (ieaVar != null) {
                int i = ieaVar.F;
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
                        gba.A(R);
                    } else if (W(ieaVarArr[0].F) >= 5 || t0(ieaVarArr[0].F)) {
                        gba.E(R);
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

    public final iea P(int i) {
        int i2 = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i2 < ieaVarArr.length) {
                iea ieaVar = ieaVarArr[i2];
                if (ieaVar != null && ieaVar.F == i) {
                    return ieaVar;
                }
                i2++;
            } else {
                return null;
            }
        }
    }

    public final void P0(float f) {
        iea ieaVar;
        int i;
        int i2;
        iea ieaVar2;
        int i3 = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        iea[] ieaVarArr = this.n0;
        if (i3 != 0 || ieaVarArr[1].getVisibility() == 0) {
            if (this.k1) {
                ieaVarArr[0].setTranslationX((-f) * ieaVar2.getMeasuredWidth());
                ieaVarArr[1].setTranslationX(ieaVarArr[0].getMeasuredWidth() - (ieaVarArr[0].getMeasuredWidth() * f));
            } else {
                ieaVarArr[0].setTranslationX(ieaVar.getMeasuredWidth() * f);
                ieaVarArr[1].setTranslationX((ieaVarArr[0].getMeasuredWidth() * f) - ieaVarArr[0].getMeasuredWidth());
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
                iea ieaVar3 = ieaVarArr[0];
                ieaVarArr[0] = ieaVarArr[1];
                ieaVarArr[1] = ieaVar3;
                ieaVar3.setVisibility(8);
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
            iea[] ieaVarArr = this.n0;
            boolean z = false;
            iea ieaVar = ieaVarArr[0];
            if (ieaVar != null) {
                if (!this.n1 || !j0(ieaVar.F)) {
                    int i = ieaVarArr[0].F;
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
                            gba.A(R);
                        } else if (W(ieaVarArr[0].F) >= 5 || t0(ieaVarArr[0].F)) {
                            gba.E(R);
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
            i = gl.L(52.0f);
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
        ifa ifaVar = this.h0.x;
        if (ifaVar != null) {
            if (z && getClosestTab() == 9) {
                z4 = true;
            } else {
                z4 = false;
            }
            ifaVar.b(z4);
        }
        ifa ifaVar2 = this.f0.x;
        if (ifaVar2 != null) {
            if (z && getClosestTab() == 8) {
                z3 = true;
            } else {
                z3 = false;
            }
            ifaVar2.b(z3);
        }
        for (mfa mfaVar : this.m2.values()) {
            lfa lfaVar = mfaVar.c;
            if (lfaVar.s != null) {
                ifa ifaVar3 = lfaVar.x;
                if (z && getClosestTab() == mfaVar.a) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ifaVar3.b(z2);
            }
        }
        r7 r7Var = this.q0;
        if (r7Var != null) {
            hda hdaVar = this.M0;
            if (hdaVar != null && hdaVar.a() && getSelectedTab() == 11) {
                i = 2131745676;
            } else {
                i = 2131745644;
            }
            r7Var.setSearchFieldHint(k96.M0(i, null));
        }
        C();
        B(true, true);
    }

    public final int T(int i) {
        int i2;
        int i3 = this.d2 + this.e2;
        int X = X(i) + gl.L(54.0f) + i3 + this.p2;
        if (i == 9) {
            i2 = gl.L(64.0f);
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
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[1];
        if (ieaVar != null && f0(ieaVar.F)) {
            f2 = 0.0f + f;
        }
        iea ieaVar2 = ieaVarArr[0];
        if (ieaVar2 != null && f0(ieaVar2.F)) {
            return (1.0f - f) + f2;
        }
        return f2;
    }

    public final void U0(int i, long j, d dVar) {
        new qy9(dVar, j, this.p1[1], new gq7(this, j, i, (byte) 1)).show();
    }

    public final float V(float f) {
        float f2 = 0.0f;
        if (k0()) {
            return 0.0f;
        }
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[1];
        if (ieaVar != null && p0(ieaVar.F) && ieaVarArr[1].F != 11) {
            f2 = 0.0f + f;
        }
        iea ieaVar2 = ieaVarArr[0];
        if (ieaVar2 != null && p0(ieaVar2.F) && ieaVarArr[0].F != 11) {
            return (1.0f - f) + f2;
        }
        return f2;
    }

    public final void V0(int i, long j, d dVar) {
        ij.s0(dVar, k96.M0(2131751586, null), gl.T2(k96.a0(null, null, 2131744558, getStoriesController().v(i, j))), k96.M0(2131751586, null), true, new va2(this, j, i, (byte) 5));
    }

    public final int W(int i) {
        kfa v1;
        y1b y1bVar;
        if (j0(i) && (v1 = v1(i)) != null && (y1bVar = v1.s) != null) {
            return y1bVar.g();
        }
        return 0;
    }

    public final void W0(int i, long j, d dVar) {
        String v = getStoriesController().v(i, j);
        Context context = dVar.getContext();
        wjb resourceProvider = dVar.getResourceProvider();
        gf gfVar = new gf(this, j, i, (byte) 6);
        Pattern pattern = ij.a;
        ij.O(context, dVar, k96.M0(2131744545, null), k96.M0(2131744544, null), k96.M0(2131744543, null), v, 12, k96.M0(2131746085, null), resourceProvider, gfVar);
    }

    public final int X(int i) {
        float f;
        oca ocaVar = this.c0;
        if (ocaVar != null && (t0(i) || i == 8)) {
            f = ocaVar.getVisibilityFactor() * gl.L(40.0f);
        } else {
            f = 0.0f;
        }
        return (int) f;
    }

    public final void X0(int i, boolean z) {
        iea[] ieaVarArr = this.n0;
        if (ieaVarArr[0].F == i) {
            return;
        }
        iea ieaVar = ieaVarArr[1];
        ieaVar.F = i;
        ieaVar.setVisibility(0);
        g0();
        z1(true);
        this.k1 = z;
        S0();
        j(!p0(i));
        G1(true);
    }

    public final void Y0(String str) {
        boolean E3 = gl.E3(str);
        d dVar = this.y1;
        if (E3) {
            ij.n0(dVar, str, true, true);
        } else {
            d01.t(dVar.getParentActivity(), str);
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
            iea[] ieaVarArr = this.n0;
            if (i2 >= ieaVarArr.length) {
                break;
            }
            iea ieaVar = ieaVarArr[i2];
            if (ieaVar != null) {
                int i4 = ieaVar.F;
                if ((z && i == 8 && t0(i4)) || i4 == i) {
                    i3++;
                    width = ieaVarArr[i2].getTranslationX();
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
        xda xdaVar = this.f0;
        if (xdaVar != null && xdaVar.s != null) {
            d dVar = this.y1;
            if (z && arrayList.size() > dVar.getMessagesController().k4.p2.f()) {
                b00.u(k96.G(dVar.getMessagesController().k4.p2.f(), "StoriesPinLimit", new Object[0]), u21.b0(dVar), 2131623982, 36);
                return;
            }
            y1b y1bVar = xdaVar.s;
            int i = y1bVar.c;
            ArrayList arrayList2 = y1bVar.g;
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
            if (arrayList3.size() > na7.q1(i).k4.p2.f()) {
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
                    y1bVar.d(true);
                    TL_stories.TL_togglePinnedToTop tL_togglePinnedToTop = new TL_stories.TL_togglePinnedToTop();
                    tL_togglePinnedToTop.id.addAll(arrayList2);
                    tL_togglePinnedToTop.peer = na7.q1(i).h1(y1bVar.d);
                    ConnectionsManager.getInstance(i).sendRequest(tL_togglePinnedToTop, new ce2((byte) 10));
                }
                z4 = z2;
            }
            if (z4) {
                b00.u(k96.G(dVar.getMessagesController().k4.p2.f(), "StoriesPinLimit", new Object[0]), u21.b0(dVar), 2131623982, 36);
            } else if (z) {
                u21.b0(dVar).I(2131624055, gl.T2(k96.G(arrayList.size(), "StoriesPinned", new Object[0])), k96.G(arrayList.size(), "StoriesPinnedText", new Object[0])).j();
            } else {
                b00.u(k96.G(arrayList.size(), "StoriesUnpinned", new Object[0]), u21.b0(dVar), 2131624061, 36);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Bi));
        hashSet.add(Integer.valueOf(bkb.c6));
        hashSet.add(Integer.valueOf(bkb.zi));
        hashSet.add(Integer.valueOf(bkb.Ai));
        hashSet.add(Integer.valueOf(bkb.J6));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.rj));
        hashSet.add(Integer.valueOf(bkb.yi));
        hashSet.add(Integer.valueOf(bkb.z6));
        hashSet.add(Integer.valueOf(bkb.I7));
        hashSet.add(Integer.valueOf(bkb.Y8));
        hashSet.add(Integer.valueOf(bkb.W8));
        hashSet.add(Integer.valueOf(bkb.x6));
        hashSet.add(Integer.valueOf(bkb.l6));
        hashSet.add(Integer.valueOf(bkb.ki));
        hashSet.add(Integer.valueOf(bkb.d7));
        hashSet.add(Integer.valueOf(bkb.e7));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.w7));
        hashSet.add(Integer.valueOf(bkb.s7));
        hashSet.add(Integer.valueOf(bkb.v7));
        hashSet.add(Integer.valueOf(bkb.ae));
        hashSet.add(Integer.valueOf(bkb.md));
    }

    public final float b0(int i, boolean z) {
        float f = 0.0f;
        int i2 = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i2 < ieaVarArr.length) {
                iea ieaVar = ieaVarArr[i2];
                if (ieaVar != null) {
                    int i3 = ieaVar.F;
                    if ((z && i == 8 && t0(i3)) || i3 == i) {
                        f = (1.0f - Math.abs(ieaVarArr[i2].getTranslationX() / getWidth())) + f;
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
        iea ieaVar;
        kca kcaVar;
        int i2;
        int i3;
        int closestTab = getClosestTab();
        kda kdaVar = this.L0;
        SparseIntArray sparseIntArray = kdaVar.P;
        int i4 = kdaVar.n;
        int i5 = -1;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        int i6 = sparseIntArray.get(i4 + i, -1);
        oca ocaVar = this.c0;
        if (ocaVar != null) {
            if (!t0(closestTab) && closestTab != 8) {
                if (t0(i6) || i6 == 8) {
                    i5 = ocaVar.getCurrentAlbumId();
                }
            } else {
                vec vecVar = ocaVar.b;
                SparseIntArray sparseIntArray2 = vecVar.c0;
                int i7 = vecVar.G;
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
                iea[] ieaVarArr = this.n0;
                iea ieaVar2 = ieaVarArr[0];
                if (ieaVar2 != null && ieaVar2.F == 13 && (kcaVar = this.a0) != null) {
                    uq0 uq0Var = kcaVar.n;
                    if (!z) {
                    }
                }
                iea ieaVar3 = ieaVarArr[0];
                lca lcaVar = this.b0;
                if (ieaVar3 != null && ieaVar3.F == 14 && lcaVar != null) {
                    uq0 uq0Var2 = lcaVar.h;
                    if (!z) {
                    }
                }
                if ((!this.F1 || (ieaVar = ieaVarArr[0]) == null || ieaVar.F != 13) && ((lcaVar == null || !lcaVar.g()) && (ocaVar == null || !ocaVar.f))) {
                    G1(false);
                    getParent().requestDisallowInterceptTouchEvent(true);
                    g0();
                    this.B1 = false;
                    this.A1 = true;
                    this.C1 = (int) motionEvent.getX();
                    setHeaderEnabled(false);
                    kdaVar.setEnabled(false);
                    iea ieaVar4 = ieaVarArr[1];
                    ieaVar4.F = i6;
                    ieaVar4.setVisibility(0);
                    this.k1 = z;
                    z1(true);
                    if (z) {
                        ieaVarArr[1].setTranslationX(ieaVarArr[0].getMeasuredWidth());
                    } else {
                        ieaVarArr[1].setTranslationX(-ieaVarArr[0].getMeasuredWidth());
                    }
                    T0(getTabProgress());
                    return true;
                }
            }
        }
        return false;
    }

    public final int c0(int i) {
        wjb wjbVar = this.I1;
        if (wjbVar != null) {
            return wjbVar.h(i);
        }
        return bkb.w0(null, i, false);
    }

    public final boolean d0() {
        if (this.y1.getConnectionsManager().getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public final void d1(w39 w39Var) {
        if (w39Var instanceof hfa) {
            ArrayList arrayList = this.H0;
            ArrayList arrayList2 = this.I0;
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        } else if (w39Var == this.P) {
            ArrayList arrayList3 = this.J0;
            ArrayList arrayList4 = this.K0;
            arrayList3.addAll(arrayList4);
            arrayList4.clear();
        } else {
            wea weaVar = this.Q;
            if (w39Var == weaVar) {
                weaVar.r = null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int r42, int r43, java.lang.Object... r44) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfa.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        kda kdaVar = this.L0;
        if (kdaVar != null) {
            canvas.save();
            canvas.translate(kdaVar.getX(), kdaVar.getY());
            canvas.restore();
        }
        super.dispatchDraw(canvas);
        gda gdaVar = this.U0;
        if (gdaVar != null) {
            int i = gdaVar.U;
            if ((i == 3 || i == 1) && this.S0 == null) {
                canvas.save();
                canvas.translate(gdaVar.getX(), gdaVar.getY());
                gdaVar.setDrawOverlay(true);
                gdaVar.draw(canvas);
                gdaVar.setDrawOverlay(false);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        if (this.c2 && (view instanceof iea) && this.g2 < this.e2) {
            canvas.save();
            canvas.clipRect(0, -this.g2, getWidth(), getHeight() + this.f2);
            boolean drawChild = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild;
        } else if (view == this.U0 && this.S0 == null) {
            canvas.save();
            iea[] ieaVarArr = this.n0;
            float top = ieaVarArr[0].getTop();
            oca ocaVar = this.c0;
            if (ocaVar != null && ((i = ieaVarArr[0].F) == 8 || t0(i))) {
                top -= ocaVar.getVisualHeight();
            }
            canvas.clipRect(0.0f, top, view.getMeasuredWidth(), view.getMeasuredHeight() + top + gl.L(12.0f));
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j);
        }
    }

    public final void e(View view) {
        iea[] ieaVarArr = this.n0;
        addView(view, Math.max(indexOfChild(ieaVarArr[0]), indexOfChild(ieaVarArr[1])) + 1, nme.e(-1, 0, 48));
        view.getLayoutParams().height = 0;
    }

    public final boolean e0() {
        SparseArray[] sparseArrayArr;
        k27 k27Var;
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
                if (num.intValue() > 0 && (k27Var = (k27) sparseArrayArr[i].get(num.intValue())) != null && (message = k27Var.k) != null && message.noforwards) {
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
            iea[] ieaVarArr = this.n0;
            if (i2 < ieaVarArr.length) {
                sca scaVar = ieaVarArr[i2].h;
                if (scaVar != null) {
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < scaVar.getChildCount(); i5++) {
                        View childAt = scaVar.getChildAt(i5);
                        if (childAt instanceof qfa) {
                            qfa qfaVar = (qfa) childAt;
                            int messageId = qfaVar.getMessageId();
                            i4 = qfaVar.getTop();
                            i3 = messageId;
                        }
                        if (childAt instanceof iba) {
                            iba ibaVar = (iba) childAt;
                            int e1 = ibaVar.getMessage().e1();
                            i4 = ibaVar.getTop();
                            i3 = e1;
                        }
                        if (childAt instanceof eba) {
                            eba ebaVar = (eba) childAt;
                            i3 = ebaVar.getMessage().e1();
                            i4 = ebaVar.getTop();
                        }
                        if (i3 != 0) {
                            break;
                        }
                    }
                    if (i3 != 0) {
                        int i6 = ieaVarArr[i2].F;
                        int i7 = -1;
                        if (j0(i6)) {
                            kfa v1 = v1(i6);
                            if (v1 != null && v1.s != null) {
                                int i8 = 0;
                                while (true) {
                                    if (i8 >= v1.s.i.size()) {
                                        break;
                                    } else if (i3 == ((k27) v1.s.i.get(i8)).e1()) {
                                        i7 = i8;
                                        break;
                                    } else {
                                        i8++;
                                    }
                                }
                            }
                            i = i7;
                        } else if (i6 >= 0) {
                            cfa[] cfaVarArr = this.w1;
                            if (i6 < cfaVarArr.length) {
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= cfaVarArr[i6].a.size()) {
                                        break;
                                    } else if (i3 == ((k27) cfaVarArr[i6].a.get(i9)).e1()) {
                                        i7 = i9;
                                        break;
                                    } else {
                                        i9++;
                                    }
                                }
                                i = cfaVarArr[i6].m + i7;
                            }
                        }
                        if (i7 >= 0) {
                            ((t26) scaVar.getLayoutManager()).g1(i, (-ieaVarArr[i2].h.getPaddingTop()) + i4);
                            if (this.r1) {
                                iea ieaVar = ieaVarArr[i2];
                                ieaVar.r.g1(i, (-ieaVar.h.getPaddingTop()) + i4);
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
                spannableStringBuilder.append((CharSequence) k96.M0(2131746509, null));
            } else {
                spannableStringBuilder.append((CharSequence) "c");
                this.a2.setSpan(new cm2(2131231148, 0), 0, 1, 33);
                this.a2.append((CharSequence) "  ").append((CharSequence) k96.M0(2131744572, null));
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
        kda kdaVar;
        if (!this.P1 && (kdaVar = this.L0) != null) {
            kdaVar.g(null, i, kdaVar.Q.get(i));
        }
    }

    public final void g(mea meaVar, d dVar, long j, int i) {
        String K;
        if (j > 0) {
            K = l7c.o(na7.q1(dVar.getCurrentAccount()).V1(Long.valueOf(j)));
        } else {
            K = hc2.K(na7.q1(dVar.getCurrentAccount()).K0(Long.valueOf(-j)), false);
        }
        if (K == null) {
            return;
        }
        StringBuilder sb = new StringBuilder("https://");
        ls6.u(sb, na7.q1(dVar.getCurrentAccount()).N2, "/", K, "/a/");
        sb.append(i);
        String sb2 = sb.toString();
        meaVar.f0(2131231761, new q3a(this, sb2, dVar, (byte) 5), k96.M0(2131744551, null), false, true);
    }

    public final void g0() {
        gl.r(this.P0);
        uk1 uk1Var = this.N0;
        if (uk1Var.getTag() == null) {
            return;
        }
        uk1Var.setTag(null);
        AnimatorSet animatorSet = this.O0;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.O0 = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.O0 = animatorSet2;
        animatorSet2.setDuration(180L);
        this.O0.playTogether(ObjectAnimator.ofFloat(uk1Var, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(uk1Var, View.TRANSLATION_Y, (-gl.L(48.0f)) + this.R0));
        this.O0.setInterpolator(s33.g);
        this.O0.addListener(new nda(this, (byte) 0));
        this.O0.start();
    }

    public final void g1(float f, int i) {
        int i2;
        kda kdaVar = this.L0;
        if (kdaVar != null) {
            if (t0(i)) {
                i2 = 8;
            } else {
                i2 = i;
            }
            kdaVar.i(f, i2);
        }
        oca ocaVar = this.c0;
        if (ocaVar != null) {
            vec vecVar = ocaVar.b;
            if (t0(i)) {
                vecVar.g(f, s1(i));
            } else if (i == 8) {
                vecVar.g(f, 0);
            }
        }
    }

    public SparseArray<k27> getActionModeSelected() {
        return this.c1[0];
    }

    public float getBottomButtonStoriesVisibility() {
        iea ieaVar;
        iea ieaVar2;
        boolean z;
        boolean z2;
        y1b y1bVar;
        y1b y1bVar2;
        float f = 1.0f;
        iea[] ieaVarArr = this.n0;
        if (ieaVarArr != null && (ieaVar = ieaVarArr[0]) != null && (ieaVar2 = ieaVarArr[1]) != null && ieaVar.w != null && ieaVar2.w != null) {
            int i = ieaVar.F;
            int i2 = ieaVar2.F;
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
                float visibilityFactor = 1.0f - ieaVarArr[0].w.getVisibilityFactor();
                float visibilityFactor2 = 1.0f - ieaVarArr[1].w.getVisibilityFactor();
                kfa v1 = v1(ieaVarArr[0].F);
                if (i == 8 || (v1 != null && (y1bVar2 = v1.s) != null && y1bVar2.g() > 0)) {
                    visibilityFactor = 1.0f;
                }
                kfa v12 = v1(i2);
                if (i2 != 8 && (v12 == null || (y1bVar = v12.s) == null || y1bVar.g() <= 0)) {
                    f = visibilityFactor2;
                }
                if (!z) {
                    visibilityFactor = f;
                }
                if (!z2) {
                    f = visibilityFactor;
                }
                return gl.R1(visibilityFactor, f, Math.abs(ieaVarArr[0].getTranslationX() / ieaVarArr[0].getMeasuredWidth()));
            }
        }
        return 1.0f;
    }

    public int getClosestTab() {
        iea[] ieaVarArr = this.n0;
        iea ieaVar = ieaVarArr[1];
        if (ieaVar != null && ieaVar.getVisibility() == 0) {
            if (this.j1 && !this.l1) {
                return ieaVarArr[1].F;
            }
            if (Math.abs(ieaVarArr[1].getTranslationX()) < ieaVarArr[1].getMeasuredWidth() / 2.0f) {
                return ieaVarArr[1].F;
            }
        }
        return getSelectedTab();
    }

    public o39 getCurrentListView() {
        vda vdaVar;
        iea ieaVar = this.n0[0];
        int i = ieaVar.F;
        if (i == 13) {
            return this.a0.getCurrentListView();
        }
        if (i == 14) {
            return this.b0.getCurrentListView();
        }
        if (i == 12 && (vdaVar = this.W) != null) {
            return vdaVar.a.A0;
        }
        return ieaVar.h;
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

    public ry8 getSearchOptionsItem() {
        return this.v0;
    }

    public int getSelectedTab() {
        int currentTabId = this.L0.getCurrentTabId();
        oca ocaVar = this.c0;
        if (ocaVar != null && currentTabId == 8) {
            int currentAlbumId = ocaVar.getCurrentAlbumId();
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
            iea[] ieaVarArr = this.n0;
            if (i < ieaVarArr.length) {
                iea ieaVar = ieaVarArr[i];
                if (ieaVar != null) {
                    f = ((1.0f - Math.abs(ieaVar.getTranslationX() / getWidth())) * ieaVar.F) + f;
                }
                i++;
            } else {
                return f;
            }
        }
    }

    public ArrayList<blb> getThemeDescriptions() {
        ArrayList<blb> arrayList = new ArrayList<>();
        arrayList.add(new blb(this.D0, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.y6));
        int i = bkb.y8;
        arrayList.add(new blb(this.o0, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        r7 r7Var = this.x0;
        if (r7Var != null) {
            arrayList.add(new blb(r7Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        }
        r7 r7Var2 = this.w0;
        if (r7Var2 != null) {
            arrayList.add(new blb(r7Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        }
        Drawable[] drawableArr = {this.G0};
        int i2 = bkb.x8;
        ImageView imageView = this.F0;
        arrayList.add(new blb(imageView, 8, (Class[]) null, (Paint) null, drawableArr, (alb) null, i2));
        arrayList.add(new blb(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.E0, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.c6));
        arrayList.add(new blb(this.L0, 0, new Class[]{ScrollSlidingTextTabStrip.class}, new String[]{"selectorDrawable"}, (Drawable[]) null, (alb) null, bkb.wi));
        kda kdaVar = this.L0;
        arrayList.add(new blb(kdaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.vi));
        arrayList.add(new blb(kdaVar.getTabsContainer(), 262148, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.ui));
        arrayList.add(new blb(kdaVar.getTabsContainer(), 65568, new Class[]{TextView.class}, (Paint) null, (Drawable[]) null, (alb) null, bkb.xi));
        gda gdaVar = this.U0;
        if (gdaVar != null) {
            arrayList.add(new blb(gdaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (alb) null, bkb.u7));
            arrayList.add(new blb(gdaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (alb) null, bkb.t7));
            arrayList.add(new blb(gdaVar, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (alb) null, bkb.x7));
            arrayList.add(new blb(gdaVar, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (alb) null, bkb.z7));
        }
        final int i3 = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i3 < ieaVarArr.length) {
                alb albVar = new alb() {
                    @Override
                    public final void b() {
                        iea[] ieaVarArr2 = nfa.this.n0;
                        int i4 = i3;
                        sca scaVar = ieaVarArr2[i4].h;
                        if (scaVar != null) {
                            int childCount = scaVar.getChildCount();
                            for (int i5 = 0; i5 < childCount; i5++) {
                                View childAt = ieaVarArr2[i4].h.getChildAt(i5);
                                if (childAt instanceof rfa) {
                                    rfa rfaVar = (rfa) childAt;
                                    for (int i6 = 0; i6 < 6; i6++) {
                                        rfaVar.a[i6].e.invalidate();
                                    }
                                } else if (childAt instanceof rr8) {
                                    ((rr8) childAt).A(0);
                                } else if (childAt instanceof v6c) {
                                    ((v6c) childAt).i(0);
                                }
                            }
                        }
                    }

                    @Override
                    public final void a(float f) {
                    }
                };
                arrayList.add(new blb(ieaVarArr[i3].h, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.r8));
                arrayList.add(new blb(ieaVarArr[i3].h, 4096, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.h6));
                arrayList.add(new blb(ieaVarArr[i3].w, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.b7));
                int i4 = bkb.g6;
                arrayList.add(new blb(ieaVarArr[i3].h, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, i4));
                arrayList.add(new blb(ieaVarArr[i3].h, 0, new Class[]{v6c.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, albVar, bkb.m6));
                arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.N7));
                arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.O7));
                arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.P7));
                arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.Q7));
                arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.R7));
                arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.S7));
                arrayList.add(new blb((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, albVar, bkb.T7));
                int i5 = bkb.h7;
                arrayList.add(new blb(ieaVarArr[i3].h, 8192, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i5));
                int i6 = bkb.j7;
                arrayList.add(new blb(ieaVarArr[i3].h, 16384, new Class[]{iba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i6));
                arrayList.add(new blb(ieaVarArr[i3].h, 8, new Class[]{iba.class}, new String[]{"thumbImageView"}, (Drawable[]) null, (alb) null, bkb.pj));
                arrayList.add(new blb(ieaVarArr[i3].h, 0, new Class[]{q86.class}, new String[]{"progressBar"}, (Drawable[]) null, (alb) null, i4));
                arrayList.add(new blb(ieaVarArr[i3].h, 8192, new Class[]{eba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i5));
                arrayList.add(new blb(ieaVarArr[i3].h, 16384, new Class[]{eba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i6));
                arrayList.add(new blb(ieaVarArr[i3].h, 8192, new Class[]{lba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i5));
                arrayList.add(new blb(ieaVarArr[i3].h, 16384, new Class[]{lba.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i6));
                arrayList.add(new blb(ieaVarArr[i3].h, 8192, new Class[]{rfa.class}, (Paint) null, (Drawable[]) null, albVar, i5));
                arrayList.add(new blb(ieaVarArr[i3].h, 16384, new Class[]{rfa.class}, (Paint) null, (Drawable[]) null, albVar, i6));
                arrayList.add(new blb(ieaVarArr[i3].h, 0, new Class[]{bw2.class}, new String[]{"backgroundPaint"}, (Drawable[]) null, (alb) null, bkb.Bi));
                arrayList.add(new blb(ieaVarArr[i3].h, 8192, new Class[]{bw2.class}, (Paint) null, (Drawable[]) null, albVar, i5));
                arrayList.add(new blb(ieaVarArr[i3].h, 16384, new Class[]{bw2.class}, (Paint) null, (Drawable[]) null, albVar, i6));
                arrayList.add(new blb(ieaVarArr[i3].h, 0, (Class[]) null, (Paint) null, new Drawable[]{this.B0}, (alb) null, bkb.a7));
                arrayList.add(new blb(ieaVarArr[i3].w.d, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.F6));
                arrayList.add(new blb(ieaVarArr[i3].w.e, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.x6));
                i3++;
            } else {
                return arrayList;
            }
        }
    }

    public int getTopPanelShift() {
        return this.p2;
    }

    public final void h(mea meaVar) {
        float f;
        final View[] viewArr = {meaVar.f0(2131232443, new Runnable(this) {
            public final nfa b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                View[] viewArr2 = viewArr;
                nfa nfaVar = this.b;
                switch (b) {
                    case 0:
                        nfaVar.O1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        nfaVar.P1(viewArr2[0], viewArr2[1]);
                        return;
                }
            }
        }, k96.M0(2131748458, null), false, false), meaVar.f0(2131232444, new Runnable(this) {
            public final nfa b;

            {
                this.b = this;
            }

            @Override
            public final void run() {
                byte b = r3;
                View[] viewArr2 = viewArr;
                nfa nfaVar = this.b;
                switch (b) {
                    case 0:
                        nfaVar.O1(viewArr2[0], viewArr2[1]);
                        return;
                    default:
                        nfaVar.P1(viewArr2[0], viewArr2[1]);
                        return;
                }
            }
        }, k96.M0(2131748457, null), false, false)};
        View view = viewArr[0];
        float f2 = 0.5f;
        if (view != null) {
            view.setEnabled(r());
            View view2 = viewArr[0];
            if (r()) {
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
            iea[] ieaVarArr = this.n0;
            if (i < ieaVarArr.length) {
                iea ieaVar = ieaVarArr[i];
                if (ieaVar.F != 7 || ieaVar.h.getAdapter() == null || ieaVarArr[i].h.getAdapter().b() == 0 || this.y1.getMessagesController().M1().j.size() <= 0) {
                    i++;
                } else {
                    return;
                }
            } else {
                if (this.G == 0) {
                    aea aeaVar = this.d0;
                    aeaVar.d = chatFull;
                    aeaVar.e = arrayList;
                }
                N1(true);
                for (int i2 = 0; i2 < ieaVarArr.length; i2++) {
                    iea ieaVar2 = ieaVarArr[i2];
                    if (ieaVar2.F == 7 && ieaVar2.h.getAdapter() != null) {
                        gl.p2(ieaVarArr[i2].h);
                    }
                }
                return;
            }
        }
    }

    public final void i(sca scaVar, int i, SparseBooleanArray sparseBooleanArray) {
        int childCount = scaVar.getChildCount();
        pi4 pi4Var = null;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = scaVar.getChildAt(i2);
            if (childAt instanceof pi4) {
                pi4Var = childAt;
            }
        }
        if (pi4Var != null) {
            scaVar.removeView(pi4Var);
        }
        getViewTreeObserver().addOnPreDrawListener(new pda(this, scaVar, sparseBooleanArray, pi4Var, i));
    }

    public boolean i0() {
        return !(this instanceof qc5);
    }

    public final void i1(int i, int i2, int i3, int i4) {
        iea[] ieaVarArr;
        boolean z;
        boolean z2;
        this.c2 = true;
        this.d2 = i;
        this.e2 = i2;
        this.f2 = i3;
        this.b2 = i4;
        n();
        lca lcaVar = this.b0;
        if (lcaVar != null) {
            if (lcaVar.M != i2 || lcaVar.N != i3) {
                lcaVar.M = i2;
                lcaVar.N = i3;
                if (i2 == 0 && i3 == 0) {
                    z = true;
                } else {
                    z = false;
                }
                lcaVar.setClipChildren(z);
                uq0 uq0Var = lcaVar.h;
                if (i2 == 0 && i3 == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                uq0Var.setClipChildren(z2);
                lcaVar.n();
            }
            F1();
        }
        for (iea ieaVar : this.n0) {
            if (ieaVar != null) {
                ieaVar.setClipChildren(false);
                H1(ieaVar);
                setPageOverscan(ieaVar.h);
                setPageOverscan(ieaVar.n);
                int paddingTop = ieaVar.h.getPaddingTop();
                sca scaVar = ieaVar.h;
                int paddingLeft = scaVar.getPaddingLeft();
                sca scaVar2 = ieaVar.h;
                int T = T(ieaVar.F);
                scaVar2.h3 = T;
                int paddingRight = ieaVar.h.getPaddingRight();
                sca scaVar3 = ieaVar.h;
                int S = S(s0());
                scaVar3.i3 = S;
                scaVar.setPadding(paddingLeft, T, paddingRight, S);
                int paddingTop2 = paddingTop - ieaVar.h.getPaddingTop();
                if (paddingTop2 != 0) {
                    gl.J(ieaVar.h, new wba(ieaVar, paddingTop2, (byte) 1));
                }
                ieaVar.w.setPadding(0, i, 0, i4);
                vda vdaVar = this.W;
                if (vdaVar != null && vdaVar.getParent() == ieaVar) {
                    k1(gl.L(56.0f) + i, vdaVar);
                }
                kca kcaVar = this.a0;
                if (kcaVar != null && kcaVar.getParent() == ieaVar) {
                    k1(i, kcaVar);
                }
            }
        }
        setClipChildren(false);
        requestLayout();
        invalidate();
    }

    public final void j(boolean z) {
        int i;
        ry8 ry8Var = this.v0;
        if (ry8Var != null && this.Z1 != z) {
            this.Z1 = z;
            if (!z && ry8Var.getAnimatedDrawable().b0 < 20) {
                ry8Var.getAnimatedDrawable().K(0);
            } else {
                oy8 animatedDrawable = ry8Var.getAnimatedDrawable();
                if (this.Z1) {
                    i = 50;
                } else {
                    i = 100;
                }
                animatedDrawable.K(i);
            }
            ry8Var.getAnimatedDrawable().start();
        }
    }

    public final void j1(int i, boolean z) {
        this.D0.a(i, z);
        pha phaVar = this.I;
        if (phaVar != null) {
            phaVar.F(i, z);
        }
    }

    @Override
    public final void k(ue3 ue3Var) {
        int i;
        d dVar = this.y1;
        if (dVar != null && dVar.getMessagesController().M1().J(ue3Var.getDialogId())) {
            dVar.getOrCreateStoryViewer().getClass();
            m8b orCreateStoryViewer = dVar.getOrCreateStoryViewer();
            Context context = dVar.getContext();
            long dialogId = ue3Var.getDialogId();
            p2b a = p2b.a((o39) ue3Var.getParent());
            if ((dVar instanceof ProfileActivity) && ((ProfileActivity) dVar).s1) {
                i = gl.L(68.0f);
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
        iea P = P(this.s1);
        this.s = -1;
        if (P != null) {
            P.h.D0();
            this.t1 = i;
            P.n.setVisibility(0);
            boolean j0 = j0(this.s1);
            hea heaVar = P.n;
            if (j0) {
                heaVar.setAdapter(w1(this.s1));
            } else {
                heaVar.setAdapter(this.L);
            }
            hea heaVar2 = P.n;
            int paddingLeft = heaVar2.getPaddingLeft();
            hea heaVar3 = P.n;
            int T = T(P.F);
            heaVar3.h3 = T;
            int paddingRight = P.n.getPaddingRight();
            hea heaVar4 = P.n;
            int S = S(s0());
            heaVar4.i3 = S;
            heaVar2.setPadding(paddingLeft, T, paddingRight, S);
            P.r.x1(i);
            P.n.b0();
            int i3 = 0;
            while (true) {
                iea[] ieaVarArr = this.n0;
                if (i3 >= ieaVarArr.length) {
                    break;
                }
                iea ieaVar = ieaVarArr[i3];
                if (ieaVar != null && ((i2 = ieaVar.F) == 0 || j0(i2))) {
                    gl.W3(ieaVarArr[i3].h);
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
            ofFloat.addUpdateListener(new jda(this, P, (byte) 1));
            ofFloat.addListener(new dw0(this, j0(P.F) ? 1 : 0, i, (byte) 3));
            ofFloat.setInterpolator(s33.f);
            ofFloat.setStartDelay(100L);
            ofFloat.setDuration(350L);
            ofFloat.start();
        }
    }

    public final boolean l0() {
        TLRPC.User V1;
        long j = this.m1;
        if (j > 0 && (V1 = na7.q1(this.y1.getCurrentAccount()).V1(Long.valueOf(j))) != null && V1.bot) {
            return true;
        }
        return false;
    }

    public void l1(boolean z) {
        float f;
        if (this.F1 != z) {
            this.F1 = z;
            pha phaVar = this.I;
            if (phaVar != null) {
                if (z) {
                    M1();
                    phaVar.J();
                } else {
                    phaVar.w();
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
            this.R1.addListener(new pu9((byte) 3, this, z));
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
            return hc2.V(dVar.getMessagesController().K0(Long.valueOf(this.g1.id)));
        }
        return false;
    }

    public final void n() {
        int i = this.d2;
        int i2 = this.p2;
        k1((gl.L(6.666f) + i) - w2, this.S0);
        int i3 = i + i2;
        k1(i3, this.L0);
        k1(i3, this.E0);
        k1(gl.L(52.0f) + i + i2, this.N0);
        k1(gl.L(4.0f) + i + i2, this.M0);
        k1(gl.L(48.0f) + i + i2, this.c0);
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
            iea[] ieaVarArr = this.n0;
            if (i >= ieaVarArr.length) {
                return false;
            }
            iea ieaVar = ieaVarArr[i];
            if (ieaVar != null) {
                sca scaVar = ieaVar.h;
                if (scaVar == null || !scaVar.d0()) {
                    hea heaVar = ieaVarArr[i].n;
                    if (heaVar != null && heaVar.d0()) {
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfa.n1(int, boolean):void");
    }

    public final boolean o0() {
        lca lcaVar = this.b0;
        if (lcaVar == null || !lcaVar.g()) {
            oca ocaVar = this.c0;
            if (ocaVar != null && ocaVar.f) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void o1(int i) {
        int s1 = s1(getClosestTab());
        oca ocaVar = this.c0;
        if (s1 != i) {
            if (ocaVar != null) {
                ocaVar.b.e(i, ocaVar.d.i(i));
                return;
            }
            return;
        }
        ocaVar.setReorderingAlbums(true);
        mfa t1 = t1(i);
        iea P = P(t1.a);
        if (P == null) {
            return;
        }
        sca scaVar = P.h;
        for (int i2 = 0; i2 < scaVar.getChildCount(); i2++) {
            View childAt = scaVar.getChildAt(i2);
            if (childAt instanceof qfa) {
                ((qfa) childAt).l(true, true);
            }
        }
        lfa lfaVar = t1.c;
        if (lfaVar != null && !lfaVar.y) {
            lfaVar.y = true;
        }
        G1(true);
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = 0;
        while (true) {
            iea[] ieaVarArr = this.n0;
            if (i < ieaVarArr.length) {
                sca scaVar = ieaVarArr[i].h;
                if (scaVar != null) {
                    scaVar.getViewTreeObserver().addOnPreDrawListener(new qda(this, i, (byte) 0));
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
        nfa nfaVar;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        cea ceaVar = this.G1;
        if (ceaVar.e() != null) {
            i3 = ceaVar.e().getHeight();
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
                if (childAt instanceof iea) {
                    nfaVar = this;
                    i4 = i;
                    nfaVar.measureChildWithMargins(childAt, i4, 0, View.MeasureSpec.makeMeasureSpec(i3, 1073741824), 0);
                    sca scaVar = ((iea) childAt).h;
                    scaVar.setPadding(0, scaVar.f3, 0, scaVar.g3);
                } else {
                    nfaVar = this;
                    i4 = i;
                    i5 = i2;
                    nfaVar.measureChildWithMargins(childAt, i4, 0, i5, 0);
                    i6++;
                    this = nfaVar;
                    i = i4;
                    i2 = i5;
                }
            } else {
                nfaVar = this;
                i4 = i;
            }
            i5 = i2;
            i6++;
            this = nfaVar;
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
                    je5 je5Var = this.H1;
                    if (je5Var != null) {
                        je5Var.f(true);
                    }
                }
                if (motionEvent != null && motionEvent.getAction() == 0 && !this.A1 && !this.B1) {
                    if (motionEvent.getY() >= gl.L(90.0f) + this.d2) {
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
                    iea[] ieaVarArr = this.n0;
                    if (z3 && (!this.k1 ? x < 0 : x > 0)) {
                        if (x < 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!b1(motionEvent, z)) {
                            this.B1 = true;
                            this.A1 = false;
                            ieaVarArr[0].setTranslationX(0.0f);
                            iea ieaVar = ieaVarArr[1];
                            if (this.k1) {
                                i2 = ieaVarArr[0].getMeasuredWidth();
                            } else {
                                i2 = -ieaVarArr[0].getMeasuredWidth();
                            }
                            ieaVar.setTranslationX(i2);
                            g1(0.0f, ieaVarArr[1].F);
                            T0(getTabProgress());
                        }
                    }
                    if (this.B1 && !this.A1) {
                        if (Math.abs(x) >= gl.Z0(true, 0.3f) && Math.abs(x) > abs) {
                            if (x < 0) {
                                z2 = true;
                            }
                            b1(motionEvent, z2);
                        }
                    } else if (this.A1) {
                        ieaVarArr[0].setTranslationX(x);
                        if (this.k1) {
                            ieaVarArr[1].setTranslationX(ieaVarArr[0].getMeasuredWidth() + x);
                        } else {
                            ieaVarArr[1].setTranslationX(x - ieaVarArr[0].getMeasuredWidth());
                        }
                        float abs2 = Math.abs(x) / ieaVarArr[0].getMeasuredWidth();
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
                        g1(abs2, ieaVarArr[1].F);
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
            TLRPC.User V1 = na7.q1(dVar.getCurrentAccount()).V1(Long.valueOf(j));
            if (V1 == null || !V1.bot || !V1.bot_can_edit) {
                return false;
            }
            return true;
        } else if (!s0()) {
            if (dVar == null || !dVar.getMessagesController().M1().g(j)) {
                return false;
            }
            return true;
        } else {
            return true;
        }
    }

    public final boolean p0(int i) {
        if (i == 7) {
            return this.G1.X();
        }
        if (!q0() && i != 0 && !j0(i) && i != 2 && i != 5 && i != 6 && i != 11 && i != 10 && i != 13 && i != 14 && i != 15) {
            return true;
        }
        return false;
    }

    public final void p1(boolean z) {
        iea[] ieaVarArr;
        iea ieaVar;
        if (!this.r1) {
            int i = 0;
            while (true) {
                ieaVarArr = this.n0;
                if (i < ieaVarArr.length) {
                    int i2 = ieaVarArr[i].F;
                    if (i2 == 0 || j0(i2)) {
                        break;
                    }
                    i++;
                } else {
                    ieaVar = null;
                    break;
                }
            }
            ieaVar = ieaVarArr[i];
            if (ieaVar != null) {
                int i3 = ieaVar.F;
                this.s1 = i3;
                boolean j0 = j0(i3);
                int[] iArr = this.p1;
                int R = R(j0 ? 1 : 0, iArr[j0 ? 1 : 0], z);
                this.t1 = R;
                if (R != iArr[j0 ? 1 : 0]) {
                    if (!this.n1 || !j0(this.s1)) {
                        ieaVar.n.setVisibility(0);
                        boolean j02 = j0(this.s1);
                        hea heaVar = ieaVar.n;
                        if (j02) {
                            heaVar.setAdapter(w1(this.s1));
                        } else {
                            heaVar.setAdapter(this.L);
                        }
                        hea heaVar2 = ieaVar.n;
                        heaVar2.setPadding(heaVar2.getPaddingLeft(), T(this.s1), ieaVar.n.getPaddingRight(), S(s0()));
                        ieaVar.r.x1(R);
                        ieaVar.n.b0();
                        ieaVar.r.O = new ida(this, ieaVar, (byte) 0);
                        gl.W3(ieaVar.h);
                        this.r1 = true;
                        if (this.s1 == 0) {
                            this.w1[0].g(true);
                        }
                        this.q1 = 0.0f;
                        if (this.s >= 0) {
                            for (iea ieaVar2 : ieaVarArr) {
                                if (ieaVar2.F == this.s1) {
                                    ieaVar2.r.g1(this.s, this.w - ieaVar2.n.getPaddingTop());
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
        return !(this instanceof qc5);
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
            iea[] ieaVarArr = this.n0;
            if (i < ieaVarArr.length) {
                int childCount = ieaVarArr[i].h.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = ieaVarArr[i].h.getChildAt(i2);
                    if (childAt instanceof bw2) {
                        ImageReceiver photoImage = ((bw2) childAt).getPhotoImage();
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

    public final boolean r() {
        iea ieaVar;
        iea[] ieaVarArr = this.n0;
        if (ieaVarArr != null && (ieaVar = ieaVarArr[0]) != null) {
            boolean j0 = j0(ieaVar.F);
            int i = this.p1[j0 ? 1 : 0];
            if (i != R(j0 ? 1 : 0, i, true)) {
                return true;
            }
        }
        return false;
    }

    public boolean r0() {
        return false;
    }

    public final void r1(MotionEvent motionEvent) {
        float f;
        float f2;
        boolean z;
        float measuredWidth;
        iea ieaVar;
        iea ieaVar2;
        int measuredWidth2;
        iea ieaVar3;
        iea ieaVar4;
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
                iea[] ieaVarArr = this.n0;
                float x = ieaVarArr[0].getX();
                this.i1 = new AnimatorSet();
                if (Math.abs(x) < ieaVarArr[0].getMeasuredWidth() / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2))) {
                    z = true;
                } else {
                    z = false;
                }
                this.l1 = z;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new x89(this, (byte) 26));
                boolean z3 = this.l1;
                Property property = View.TRANSLATION_X;
                if (z3) {
                    measuredWidth = Math.abs(x);
                    boolean z4 = this.k1;
                    AnimatorSet animatorSet = this.i1;
                    if (z4) {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ieaVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ieaVarArr[1], property, ieaVar4.getMeasuredWidth()), ofFloat);
                    } else {
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ieaVarArr[0], property, 0.0f), ObjectAnimator.ofFloat(ieaVarArr[1], property, -ieaVar3.getMeasuredWidth()), ofFloat);
                    }
                } else {
                    measuredWidth = ieaVarArr[0].getMeasuredWidth() - Math.abs(x);
                    boolean z5 = this.k1;
                    AnimatorSet animatorSet2 = this.i1;
                    if (z5) {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ieaVarArr[0], property, -ieaVar2.getMeasuredWidth()), ObjectAnimator.ofFloat(ieaVarArr[1], property, 0.0f), ofFloat);
                    } else {
                        animatorSet2.playTogether(ObjectAnimator.ofFloat(ieaVarArr[0], property, ieaVar.getMeasuredWidth()), ObjectAnimator.ofFloat(ieaVarArr[1], property, 0.0f), ofFloat);
                    }
                }
                this.i1.setInterpolator(u2);
                int measuredWidth3 = getMeasuredWidth();
                float f3 = measuredWidth3 / 2;
                float I = (gl.I(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f3) + f3;
                float abs = Math.abs(f);
                if (abs > 0.0f) {
                    measuredWidth2 = Math.round(Math.abs(I / abs) * 1000.0f) << 2;
                } else {
                    measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                }
                this.i1.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                this.i1.addListener(new nda(this, (byte) 1));
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

    public boolean s0() {
        return false;
    }

    public final int s1(int i) {
        mfa u1 = u1(i);
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
                    cfa[] cfaVarArr = this.w1;
                    if (i2 >= cfaVarArr.length) {
                        break;
                    }
                    if (cfaVarArr[i2].b[1].size() == 0) {
                        cfa cfaVar = cfaVarArr[i2];
                        cfaVar.j[1] = this.g1.migrated_from_max_id;
                        cfaVar.i[1] = false;
                    }
                    i2++;
                }
            }
        }
        TLRPC.ChatFull chatFull3 = this.g1;
        if (chatFull3 != null && z != chatFull3.stories_pinned_available) {
            kda kdaVar = this.L0;
            if (kdaVar != null) {
                if (k0()) {
                    i = 9;
                } else {
                    i = 8;
                }
                kdaVar.setInitialTabId(i);
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

    public void setForwardRestrictedHint(je5 je5Var) {
        this.H1 = je5Var;
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
            iea[] ieaVarArr = this.n0;
            if (i6 >= ieaVarArr.length) {
                break;
            }
            ieaVarArr[i6].setTranslationY(this.O1);
            i6++;
        }
        fj3 fj3Var = this.S0;
        if (fj3Var != null) {
            if (fj3Var != null) {
                fj3Var.setTranslationY(this.O1);
            }
        } else {
            gda gdaVar = this.U0;
            if (gdaVar != null) {
                gdaVar.setTranslationY(gl.L(48.0f) + i2);
            }
        }
        this.R0 = i2;
        uk1 uk1Var = this.N0;
        if (uk1Var.getTag() == null) {
            i5 = -gl.L(48.0f);
        }
        uk1Var.setTranslationY(i5 + this.R0);
    }

    public void setPagesGlassEngine(qw4 qw4Var) {
        iea[] ieaVarArr;
        this.h2 = qw4Var;
        lca lcaVar = this.b0;
        if (lcaVar != null) {
            lcaVar.setGlassEngine(qw4Var);
        }
        for (iea ieaVar : this.n0) {
            if (ieaVar != null) {
                ieaVar.h.setCaptureSectionsDecoratorAllowed(true);
                qw4Var.b(ieaVar.h);
            }
        }
    }

    public void setPagesPaddingBottom(int i) {
        if (this.b2 != i) {
            this.b2 = i;
            iea[] ieaVarArr = this.n0;
            if (ieaVarArr != null) {
                for (iea ieaVar : ieaVarArr) {
                    if (ieaVar != null) {
                        sca scaVar = ieaVar.h;
                        int paddingLeft = scaVar.getPaddingLeft();
                        sca scaVar2 = ieaVar.h;
                        int i2 = scaVar2.f3;
                        int paddingRight = scaVar2.getPaddingRight();
                        sca scaVar3 = ieaVar.h;
                        int S = S(s0());
                        scaVar3.i3 = S;
                        scaVar.setPadding(paddingLeft, i2, paddingRight, S);
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
                iea[] ieaVarArr = this.n0;
                if (i < ieaVarArr.length) {
                    D1(ieaVarArr[i], true);
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
            iea[] ieaVarArr = this.n0;
            if (i2 >= ieaVarArr.length) {
                break;
            }
            int measuredHeight = getMeasuredHeight();
            if (ieaVarArr[i2].F == 8) {
                f = 280.0f;
            } else {
                f = 120.0f;
            }
            float f2 = (-(measuredHeight - Math.max(i, gl.L(f)))) / 2.0f;
            ieaVarArr[i2].w.setTranslationY(f2);
            ieaVarArr[i2].s.setTranslationY(-f2);
            i2++;
        }
        kca kcaVar = this.a0;
        if (kcaVar != null) {
            kcaVar.setVisibleHeight(i);
        }
        lca lcaVar = this.b0;
        if (lcaVar != null) {
            lcaVar.setVisibleHeight(i);
        }
    }

    public final boolean t() {
        iea ieaVar;
        iea[] ieaVarArr = this.n0;
        if (ieaVarArr != null && (ieaVar = ieaVarArr[0]) != null && (!this.n1 || !j0(ieaVar.F))) {
            boolean j0 = j0(ieaVarArr[0].F);
            int i = this.p1[j0 ? 1 : 0];
            if (i != R(j0 ? 1 : 0, i, false)) {
                return true;
            }
        }
        return false;
    }

    public final mfa t1(int i) {
        Integer valueOf = Integer.valueOf(i);
        HashMap hashMap = this.m2;
        mfa mfaVar = (mfa) hashMap.get(valueOf);
        if (mfaVar == null) {
            mfa mfaVar2 = new mfa(this, getContext(), i);
            hashMap.put(Integer.valueOf(i), mfaVar2);
            this.n2.put(Integer.valueOf(mfaVar2.a), Integer.valueOf(i));
            return mfaVar2;
        }
        return mfaVar;
    }

    public final void u(Canvas canvas, RectF rectF, ViewGroup viewGroup) {
        iea[] ieaVarArr;
        o39 o39Var;
        kca kcaVar;
        vda vdaVar;
        lca lcaVar;
        View[] viewPages;
        for (iea ieaVar : this.n0) {
            if (ieaVar != null && ieaVar.getVisibility() == 0) {
                if (ieaVar.P != null) {
                    RectF rectF2 = this.j2;
                    if (zec.c(ieaVar, viewGroup, rectF2)) {
                        canvas.save();
                        canvas.translate(rectF2.left, rectF2.top);
                        ieaVar.c(canvas);
                        canvas.restore();
                    }
                }
                if (ieaVar.F == 14 && (lcaVar = this.b0) != null && lcaVar.getParent() == ieaVar) {
                    for (View view : lcaVar.h.getViewPages()) {
                        if ((view instanceof pq8) && view.getVisibility() == 0) {
                            va vaVar = ((pq8) view).f;
                            tk0.a(vaVar, canvas, rectF, vaVar, viewGroup);
                        }
                    }
                } else {
                    if (ieaVar.F == 12 && (vdaVar = this.W) != null && vdaVar.getParent() == ieaVar) {
                        o39Var = vdaVar.a.A0;
                    } else if (ieaVar.F == 13 && (kcaVar = this.a0) != null && kcaVar.getParent() == ieaVar) {
                        o39Var = kcaVar.getCurrentListView();
                    } else {
                        o39Var = ieaVar.h;
                    }
                    if (o39Var != null && o39Var.getVisibility() == 0) {
                        tk0.a(o39Var, canvas, rectF, o39Var, viewGroup);
                    }
                }
            }
        }
    }

    public final boolean u0() {
        if (!p() || ((getClosestTab() != 8 && getClosestTab() != 13 && !t0(getClosestTab())) || !this.F1)) {
            lca lcaVar = this.b0;
            if (lcaVar == null || !lcaVar.g()) {
                oca ocaVar = this.c0;
                if ((ocaVar == null || !ocaVar.f) && !this.r1 && !this.j1) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final mfa u1(int i) {
        Integer num = (Integer) this.n2.get(Integer.valueOf(i));
        if (num == null) {
            return null;
        }
        return (mfa) this.m2.get(num);
    }

    @Override
    public final void updateColors() {
        iea[] ieaVarArr;
        try {
            this.J1.a(c0(bkb.c6));
            ed0 ed0Var = this.G0;
            if (ed0Var != null) {
                ed0Var.a(c0(bkb.x8));
            }
            NumberTextView numberTextView = this.D0;
            if (numberTextView != null) {
                numberTextView.setTextColor(c0(bkb.x8));
            }
            B1();
            invalidate();
            for (iea ieaVar : this.n0) {
                if (ieaVar != null && ieaVar.M) {
                    ieaVar.invalidate();
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void v0(int i, int i2, int i3, boolean z) {
        cfa[] cfaVarArr = this.w1;
        cfaVarArr[i].a.clear();
        cfaVarArr[i].b[0].clear();
        cfaVarArr[i].b[1].clear();
        cfa cfaVar = cfaVarArr[i];
        cfaVar.j[0] = i2;
        cfaVar.i[0] = false;
        cfaVar.l = false;
        cfaVar.m = i3;
        cfaVar.n = (cfaVar.e() - i3) - 1;
        cfa cfaVar2 = cfaVarArr[i];
        if (cfaVar2.n < 0) {
            cfaVar2.n = 0;
        }
        cfaVar2.k = i2;
        cfaVar2.o = true;
        cfaVar2.g = false;
        cfaVar2.p++;
        iea P = P(i);
        if (P != null && P.h.getAdapter() != null) {
            P.h.getAdapter().f();
        }
        if (z) {
            int i4 = 0;
            while (true) {
                iea[] ieaVarArr = this.n0;
                if (i4 < ieaVarArr.length) {
                    iea ieaVar = ieaVarArr[i4];
                    if (ieaVar.F == i) {
                        ieaVar.x.g1(Math.min(cfaVarArr[i].e() - 1, cfaVarArr[i].m), 0);
                    }
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public final kfa v1(int i) {
        mfa u1;
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

    public final void w0(String str) {
        getStoriesController().q(this.m1, str, new nba(this, (byte) 0));
    }

    public final kfa w1(int i) {
        mfa u1;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfa.x():void");
    }

    public final void x0(TL_stories.StoryItem storyItem, z1b z1bVar) {
        getStoriesController().b(z1bVar.a, this.m1, storyItem);
        gl.e3(new t7a(this, z1bVar, (byte) 2), 100L);
    }

    public final int x1(w39 w39Var) {
        if (w39Var == this.f0) {
            return 8;
        }
        if (w39Var == this.h0) {
            return 9;
        }
        for (mfa mfaVar : this.m2.values()) {
            if (mfaVar.c == w39Var) {
                return mfaVar.a;
            }
        }
        return -1;
    }

    public final void y() {
        kda kdaVar = this.L0;
        if (!kdaVar.d(kdaVar.getCurrentTabId())) {
            int firstTabId = kdaVar.getFirstTabId();
            kdaVar.setInitialTabId(firstTabId);
            this.n0[0].F = firstTabId;
            z1(false);
        }
    }

    public final void y0(TL_stories.StoryItem storyItem, String str) {
        getStoriesController().q(this.m1, str, new nu9(this, storyItem, (byte) 5));
    }

    public final int y1(w39 w39Var) {
        if (w39Var == this.g0) {
            return 8;
        }
        if (w39Var == this.i0) {
            return 9;
        }
        for (mfa mfaVar : this.m2.values()) {
            if (mfaVar.d == w39Var) {
                return mfaVar.a;
            }
        }
        return -1;
    }

    public final void z(iea ieaVar, o39 o39Var, t26 t26Var) {
        int abs;
        int b;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        s49 K;
        boolean z;
        k27 k27Var;
        sca scaVar;
        y1b y1bVar;
        if (!this.r1 && this.N1 == null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (o39Var.getFastScroll() == null || !o39Var.getFastScroll().n || currentTimeMillis - ieaVar.a >= 300) {
                ieaVar.a = currentTimeMillis;
                if ((!this.Y0 || !this.X0 || ieaVar.F == 11) && ieaVar.F != 7) {
                    int K0 = t26Var.K0();
                    if (K0 == -1) {
                        abs = 0;
                    } else {
                        abs = Math.abs(t26Var.M0() - K0) + 1;
                    }
                    if (o39Var.getAdapter() == null) {
                        b = 0;
                    } else {
                        b = o39Var.getAdapter().b();
                    }
                    int i6 = ieaVar.F;
                    int[] iArr = this.p1;
                    cfa[] cfaVarArr = this.w1;
                    if (i6 != 0 && i6 != 1 && i6 != 2 && i6 != 4) {
                        i = false;
                    } else {
                        b = cfaVarArr[i6].d() + cfaVarArr[i6].a.size();
                        cfa cfaVar = cfaVarArr[i6];
                        i = false;
                        if (cfaVar.h && cfaVar.e.size() > 2 && ieaVar.F == 0 && cfaVarArr[i6].a.size() != 0) {
                            if (i6 == 0) {
                                i2 = iArr[0];
                            } else {
                                i2 = 1;
                            }
                            float f = i2;
                            int measuredHeight = (int) ((o39Var.getMeasuredHeight() / (o39Var.getMeasuredWidth() / f)) * f * 1.5f);
                            if (measuredHeight < 100) {
                                measuredHeight = 100;
                            }
                            if (measuredHeight < ((nea) cfaVarArr[i6].e.get(1)).b) {
                                measuredHeight = ((nea) cfaVarArr[i6].e.get(1)).b;
                            }
                            if ((K0 > b && K0 - b > measuredHeight) || ((i3 = K0 + abs) < cfaVarArr[i6].m && cfaVarArr[0].m - i3 > measuredHeight)) {
                                t79 t79Var = new t79(this, i6, o39Var, (byte) 6);
                                this.N1 = t79Var;
                                gl.d3(t79Var);
                                return;
                            }
                        }
                    }
                    int i7 = ieaVar.F;
                    if (i7 != 7) {
                        boolean j0 = j0(i7);
                        int i8 = ieaVar.F;
                        if (j0) {
                            kfa v1 = v1(i8);
                            if (v1 != null && (y1bVar = v1.s) != null && K0 + abs > y1bVar.i() - iArr[1]) {
                                v1.P();
                            }
                        } else if (i8 == 6) {
                            if (abs > 0) {
                                bea beaVar = this.S;
                                boolean z2 = beaVar.h;
                                ArrayList arrayList = beaVar.d;
                                if (!z2 && !beaVar.e && !arrayList.isEmpty() && K0 + abs >= b - 5) {
                                    beaVar.E(((TLRPC.Chat) b00.f(1, arrayList)).id);
                                }
                            }
                        } else {
                            d dVar = this.y1;
                            if (i8 == 11) {
                                int i9 = i;
                                int i10 = -1;
                                while (true) {
                                    int childCount = ieaVar.h.getChildCount();
                                    scaVar = ieaVar.h;
                                    if (i9 >= childCount) {
                                        break;
                                    }
                                    View childAt = scaVar.getChildAt(i9);
                                    ieaVar.h.getClass();
                                    i10 = Math.max(RecyclerView.R(childAt), i10);
                                    i9++;
                                }
                                w39 adapter = scaVar.getAdapter();
                                zea zeaVar = this.V;
                                int i11 = i10 + 1;
                                if (adapter == zeaVar) {
                                    if (i11 >= zeaVar.h.size() + zeaVar.e.size() && !zeaVar.s && !zeaVar.r) {
                                        zeaVar.r = true;
                                        zeaVar.F();
                                        return;
                                    }
                                    return;
                                } else if (i11 >= dVar.getMessagesController().D1().i.size()) {
                                    dVar.getMessagesController().D1().g(i);
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
                                if (abs + K0 > b - i12 || cfaVarArr[i4].o) {
                                    cfa cfaVar2 = cfaVarArr[i4];
                                    if (!cfaVar2.g) {
                                        if (i8 == 0) {
                                            byte b2 = cfaVarArr[0].q;
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
                                        boolean[] zArr = cfaVar2.i;
                                        if (!zArr[0]) {
                                            cfaVar2.g = true;
                                            dVar.getMediaDataController().P0(this.m1, 50, cfaVarArr[i4].j[0], 0, i5, this.G, 1, dVar.getClassGuid(), cfaVarArr[i4].p, null, null);
                                        } else if (this.f1 != 0 && !zArr[1]) {
                                            cfaVar2.g = true;
                                            dVar.getMediaDataController().P0(this.f1, 50, cfaVarArr[i4].j[1], 0, i5, this.G, 1, dVar.getClassGuid(), cfaVarArr[i4].p, null, null);
                                        }
                                    }
                                }
                                int i14 = cfaVarArr[i4].m;
                                if (i4 == 0) {
                                    i14 = this.K.L(0);
                                }
                                if (K0 - i14 < i12 + 1) {
                                    cfa cfaVar3 = cfaVarArr[i4];
                                    if (!cfaVar3.g && !cfaVar3.l && !cfaVar3.o) {
                                        H0(ieaVar.F);
                                    }
                                }
                                iea ieaVar2 = this.n0[0];
                                if (ieaVar2.h == o39Var) {
                                    int i15 = ieaVar2.F;
                                    if ((i15 == 0 || i15 == 5) && K0 != -1 && (K = o39Var.K(K0)) != null) {
                                        int i16 = K.f;
                                        if (i16 == 0 || i16 == 12) {
                                            View view = K.a;
                                            boolean z3 = view instanceof rfa;
                                            uk1 uk1Var = this.N0;
                                            if (z3) {
                                                rfa rfaVar = (rfa) view;
                                                if (rfaVar.e <= 0) {
                                                    k27Var = null;
                                                    z = false;
                                                } else {
                                                    z = false;
                                                    k27Var = rfaVar.b[0];
                                                }
                                                if (k27Var != null) {
                                                    uk1Var.i0(k27Var.k.date, z, true);
                                                }
                                            } else if (view instanceof bw2) {
                                                uk1Var.i0(((bw2) view).getDate(), false, true);
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

    public final void z0(HashSet hashSet, TL_stories.StoryItem storyItem, cs5 cs5Var, z1b z1bVar) {
        String a0;
        boolean contains = hashSet.contains(Integer.valueOf(z1bVar.a));
        long j = this.m1;
        if (contains) {
            getStoriesController().b(z1bVar.a, j, storyItem);
            a0 = k96.a0(null, null, 2131744494, z1bVar.b);
        } else {
            g2b storiesController = getStoriesController();
            int i = z1bVar.a;
            storiesController.getClass();
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(storyItem);
            storiesController.e0(i, j, arrayList);
            a0 = k96.a0(null, null, 2131744254, z1bVar.b);
        }
        u21.b0(this.y1).Q(2131623990, 36, gl.T2(a0)).j();
        cs5Var.u();
    }

    public final void z1(boolean z) {
        iea[] ieaVarArr;
        iea[] ieaVarArr2;
        r7 r7Var;
        k49 k49Var;
        boolean z2;
        boolean z3;
        boolean z4;
        k49 k49Var2;
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
        k49 k49Var3;
        int i8;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        boolean z10;
        boolean z11;
        int i12;
        k49 k49Var4;
        lca lcaVar = this.b0;
        if (lcaVar != null) {
            lcaVar.i();
        }
        int i13 = 0;
        while (true) {
            ieaVarArr = this.n0;
            if (i13 >= ieaVarArr.length) {
                break;
            }
            ieaVarArr[i13].h.D0();
            i13++;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ieaVarArr[z ? 1 : 0].getLayoutParams();
        layoutParams.topMargin = gl.L(I0());
        layoutParams.rightMargin = 0;
        layoutParams.leftMargin = 0;
        w39 adapter = ieaVarArr[z ? 1 : 0].h.getAdapter();
        w39 w39Var = this.f0;
        is5 is5Var = this.e0;
        if (adapter == w39Var) {
            is5Var.h(null);
        }
        boolean z12 = this.Y0;
        pha phaVar = this.I;
        cea ceaVar = this.G1;
        a aVar = this.H;
        String str = "";
        wea weaVar = this.Q;
        r7 r7Var2 = this.q0;
        int i14 = 100;
        if (z12 && this.X0) {
            iea ieaVar = ieaVarArr[z ? 1 : 0];
            if (ieaVar.f == null) {
                ieaVar.f = new k49();
            }
            iea ieaVar2 = ieaVarArr[z ? 1 : 0];
            k49 k49Var5 = ieaVar2.f;
            zea zeaVar = this.V;
            gea geaVar = this.m0;
            kea keaVar = this.k0;
            kea keaVar2 = this.l0;
            kea keaVar3 = this.j0;
            if (z) {
                int i15 = ieaVar2.F;
                if (i15 != 0) {
                    k49Var4 = k49Var5;
                    if (i15 != 2 && i15 != 5 && i15 != 6 && (i15 != 7 || ceaVar.X())) {
                        if (r7Var2 != null) {
                            str = r7Var2.getSearchField().getText().toString();
                        }
                        String str2 = str;
                        int i16 = ieaVarArr[z ? 1 : 0].F;
                        if (i16 == 1) {
                            if (keaVar3 != null) {
                                keaVar3.G(str2, false);
                                if (adapter != keaVar3) {
                                    d1(adapter);
                                    ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar3);
                                }
                            }
                        } else if (i16 == 3) {
                            if (keaVar2 != null) {
                                keaVar2.G(str2, false);
                                if (adapter != keaVar2) {
                                    d1(adapter);
                                    ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar2);
                                }
                            }
                        } else if (i16 == 4) {
                            if (keaVar != null) {
                                keaVar.G(str2, false);
                                if (adapter != keaVar) {
                                    d1(adapter);
                                    ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar);
                                }
                            }
                        } else if (i16 == 7) {
                            if (geaVar != null) {
                                geaVar.F(str2, false);
                                if (adapter != geaVar) {
                                    d1(adapter);
                                    ieaVarArr[z ? 1 : 0].h.setAdapter(geaVar);
                                }
                            }
                        } else if (i16 == 11) {
                            if (zeaVar != null) {
                                zeaVar.E(this.Z0, str2);
                                if (adapter != zeaVar) {
                                    d1(adapter);
                                    ieaVarArr[z ? 1 : 0].h.setAdapter(zeaVar);
                                }
                            }
                        } else if (i16 == 15 && weaVar != null && adapter != weaVar) {
                            d1(adapter);
                            sca scaVar = ieaVarArr[z ? 1 : 0].h;
                            weaVar.r = scaVar;
                            scaVar.setAdapter(weaVar);
                        }
                    }
                }
                this.Y0 = false;
                hda hdaVar = this.M0;
                if (hdaVar != null) {
                    hdaVar.g(false);
                }
                this.X0 = false;
                z1(true);
                return;
            }
            k49Var4 = k49Var5;
            if (ieaVar2.h != null) {
                int i17 = ieaVar2.F;
                if (i17 == 1) {
                    if (adapter != keaVar3) {
                        d1(adapter);
                        ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar3);
                    }
                    keaVar3.f();
                } else if (i17 == 3) {
                    if (adapter != keaVar2) {
                        d1(adapter);
                        ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar2);
                    }
                    keaVar2.f();
                } else if (i17 == 4) {
                    if (adapter != keaVar) {
                        d1(adapter);
                        ieaVarArr[z ? 1 : 0].h.setAdapter(keaVar);
                    }
                    keaVar.f();
                } else if (i17 == 7) {
                    if (adapter != geaVar) {
                        d1(adapter);
                        ieaVarArr[z ? 1 : 0].h.setAdapter(geaVar);
                    }
                    geaVar.f();
                } else if (i17 == 11) {
                    if (adapter != zeaVar) {
                        d1(adapter);
                        ieaVarArr[z ? 1 : 0].h.setAdapter(zeaVar);
                    }
                    zeaVar.f();
                }
            }
            ieaVarArr2 = ieaVarArr;
            r7Var = r7Var2;
            k49Var3 = k49Var4;
            i3 = 4;
            z4 = false;
            z7 = false;
            i5 = 8;
        } else {
            iea ieaVar3 = ieaVarArr[z ? 1 : 0];
            if (ieaVar3.e == null) {
                ieaVar3.e = new k49();
            }
            iea ieaVar4 = ieaVarArr[z ? 1 : 0];
            k49 k49Var6 = ieaVar4.e;
            ieaVar4.h.setPinnedHeaderShadowDrawable(null);
            int i18 = ieaVarArr[z ? 1 : 0].F;
            if (i18 == 8 || t0(i18)) {
                layoutParams.topMargin = gl.L(I0());
            }
            sca scaVar2 = ieaVarArr[z ? 1 : 0].h;
            int paddingLeft = scaVar2.getPaddingLeft();
            iea ieaVar5 = ieaVarArr[z ? 1 : 0];
            ieaVarArr2 = ieaVarArr;
            sca scaVar3 = ieaVar5.h;
            int T = T(ieaVar5.F);
            scaVar3.h3 = T;
            int paddingRight = ieaVarArr2[z ? 1 : 0].h.getPaddingRight();
            sca scaVar4 = ieaVarArr2[z ? 1 : 0].h;
            int S = S(s0());
            scaVar4.i3 = S;
            scaVar2.setPadding(paddingLeft, T, paddingRight, S);
            int i19 = ieaVarArr2[z ? 1 : 0].F;
            int[] iArr = this.p1;
            w39 w39Var2 = this.N;
            bea beaVar = this.S;
            yea yeaVar = this.U;
            View view = this.a0;
            vda vdaVar = this.W;
            r7Var = r7Var2;
            cfa[] cfaVarArr = this.w1;
            if (i19 == 0) {
                w39 w39Var3 = this.K;
                if (adapter != w39Var3) {
                    d1(adapter);
                    ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var3);
                }
                int i20 = -gl.L(1.0f);
                layoutParams.rightMargin = i20;
                layoutParams.leftMargin = i20;
                cfa cfaVar = cfaVarArr[0];
                if (cfaVar.h && !cfaVar.e.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i14 = iArr[0];
                ieaVarArr2[z ? 1 : 0].h.setPinnedHeaderShadowDrawable(this.B0);
                k49Var = cfaVarArr[0].x;
                z4 = z10;
                z2 = false;
            } else {
                if (i19 == 1) {
                    cfa cfaVar2 = cfaVarArr[1];
                    if (cfaVar2.h && !cfaVar2.e.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (adapter != w39Var2) {
                        d1(adapter);
                        ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var2);
                    }
                } else if (i19 == 2) {
                    cfa cfaVar3 = cfaVarArr[2];
                    if (cfaVar3.h && !cfaVar3.e.isEmpty()) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    w39 w39Var4 = this.O;
                    if (adapter != w39Var4) {
                        d1(adapter);
                        ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var4);
                    }
                } else {
                    if (i19 == 3) {
                        w39 w39Var5 = this.M;
                        if (adapter != w39Var5) {
                            d1(adapter);
                            ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var5);
                        }
                    } else if (i19 == 4) {
                        cfa cfaVar4 = cfaVarArr[4];
                        if (cfaVar4.h && !cfaVar4.e.isEmpty()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        w39 w39Var6 = this.P;
                        if (adapter != w39Var6) {
                            d1(adapter);
                            ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var6);
                        }
                    } else {
                        if (i19 == 5) {
                            w39 w39Var7 = this.R;
                            if (adapter != w39Var7) {
                                d1(adapter);
                                ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var7);
                            }
                        } else if (i19 == 15) {
                            if (adapter != weaVar) {
                                d1(adapter);
                                sca scaVar5 = ieaVarArr2[z ? 1 : 0].h;
                                weaVar.r = scaVar5;
                                scaVar5.setAdapter(weaVar);
                            }
                        } else if (i19 == 6) {
                            if (adapter != beaVar) {
                                d1(adapter);
                                ieaVarArr2[z ? 1 : 0].h.setAdapter(beaVar);
                            }
                        } else if (i19 == 7) {
                            w39 w39Var8 = this.d0;
                            if (adapter != w39Var8) {
                                d1(adapter);
                                ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var8);
                            }
                        } else if (j0(i19)) {
                            w39 v1 = v1(ieaVarArr2[z ? 1 : 0].F);
                            if (adapter != v1) {
                                d1(adapter);
                                ieaVarArr2[z ? 1 : 0].h.setAdapter(v1);
                                ieaVarArr2[z ? 1 : 0].h.getClass();
                            }
                            iea ieaVar6 = ieaVarArr2[z ? 1 : 0];
                            if (ieaVar6.F != 9) {
                                is5Var.h(ieaVar6.h);
                            }
                            i14 = iArr[1];
                        } else {
                            int i21 = ieaVarArr2[z ? 1 : 0].F;
                            if (i21 == 10) {
                                w39 w39Var9 = this.T;
                                if (adapter != w39Var9) {
                                    d1(adapter);
                                    ieaVarArr2[z ? 1 : 0].h.setAdapter(w39Var9);
                                }
                            } else if (i21 == 11) {
                                if (adapter != yeaVar) {
                                    d1(adapter);
                                    ieaVarArr2[z ? 1 : 0].h.setAdapter(yeaVar);
                                    is5 is5Var2 = yeaVar.w;
                                    sca scaVar6 = ieaVarArr2[z ? 1 : 0].h;
                                    yeaVar.s = scaVar6;
                                    is5Var2.h(scaVar6);
                                }
                                k49Var = yeaVar.r;
                                z2 = true;
                                z4 = false;
                            } else if (i21 == 12) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ieaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (vdaVar.getParent() != ieaVarArr2[z ? 1 : 0]) {
                                    gl.B2(vdaVar);
                                    ieaVarArr2[z ? 1 : 0].addView(vdaVar, nme.d(-1, -1.0f, 119, 0.0f, 56.0f, 0.0f, 0.0f));
                                    k1(gl.L(56.0f) + this.d2, vdaVar);
                                }
                            } else if (i21 == 13) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ieaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (view != null && view.getParent() != ieaVarArr2[z ? 1 : 0]) {
                                    gl.B2(view);
                                    ieaVarArr2[z ? 1 : 0].addView(view);
                                    k1(this.d2, view);
                                }
                            } else if (i21 == 14) {
                                if (adapter != null) {
                                    d1(adapter);
                                    ieaVarArr2[z ? 1 : 0].h.setAdapter(null);
                                }
                                if (lcaVar != null && lcaVar.getParent() != ieaVarArr2[z ? 1 : 0]) {
                                    gl.B2(lcaVar);
                                    ieaVarArr2[z ? 1 : 0].addView(lcaVar);
                                    ieaVarArr2[z ? 1 : 0].w.setVisibility(4);
                                }
                            }
                        }
                        k49Var = k49Var6;
                        z2 = false;
                        z4 = false;
                    }
                    k49Var = k49Var6;
                    z2 = true;
                    z4 = false;
                }
                z4 = z3;
                k49Var = k49Var6;
                z2 = true;
            }
            I1(ieaVarArr2[z ? 1 : 0]);
            if (z2) {
                ieaVarArr2[z ? 1 : 0].h.setSections(false);
                k49Var2 = k49Var;
            } else {
                sca scaVar7 = ieaVarArr2[z ? 1 : 0].h;
                scaVar7.getClass();
                k49Var2 = k49Var;
                zkb.l(scaVar7, 20, bkb.h6, scaVar7.o2);
                scaVar7.U2 = false;
                scaVar7.I2 = null;
                scaVar7.J2 = null;
                scaVar7.M2 = 0.0f;
                scaVar7.N2 = null;
                scaVar7.O2 = null;
                scaVar7.K2 = null;
                a39 a39Var = scaVar7.H2;
                if (a39Var != null) {
                    scaVar7.r0(a39Var);
                    scaVar7.H2 = null;
                }
                yj0 yj0Var = scaVar7.S2;
                if (yj0Var != null) {
                    scaVar7.r0(yj0Var);
                    scaVar7.S2 = null;
                }
            }
            H1(ieaVarArr2[z ? 1 : 0]);
            iea ieaVar7 = ieaVarArr2[z ? 1 : 0];
            int i22 = ieaVar7.F;
            sca scaVar8 = ieaVar7.h;
            if (i22 == 11) {
                scaVar8.setItemAnimator(ieaVar7.d);
            } else {
                scaVar8.setItemAnimator(null);
                if (yeaVar != null && ieaVarArr2[z ? 1 : 0].h == yeaVar.s) {
                    is5 is5Var3 = yeaVar.w;
                    yeaVar.s = null;
                    is5Var3.h(null);
                }
            }
            if (vdaVar != null && ieaVarArr2[z ? 1 : 0].F != 12 && vdaVar.getParent() == ieaVarArr2[z ? 1 : 0]) {
                vdaVar.a.onRemoveFromParent();
                ieaVarArr2[z ? 1 : 0].removeView(vdaVar);
            }
            if (view != null && ieaVarArr2[z ? 1 : 0].F != 13) {
                ViewParent parent = view.getParent();
                iea ieaVar8 = ieaVarArr2[z ? 1 : 0];
                if (parent == ieaVar8) {
                    ieaVar8.removeView(view);
                }
            }
            if (lcaVar != null && ieaVarArr2[z ? 1 : 0].F != 14) {
                ViewParent parent2 = lcaVar.getParent();
                iea ieaVar9 = ieaVarArr2[z ? 1 : 0];
                if (parent2 == ieaVar9) {
                    ieaVar9.removeView(lcaVar);
                }
            }
            int i23 = ieaVarArr2[z ? 1 : 0].F;
            if (i23 != 0 && i23 != 11 && !j0(i23) && (i8 = ieaVarArr2[z ? 1 : 0].F) != 2 && i8 != 5 && i8 != 6 && ((i8 != 7 || ceaVar.X()) && (i9 = ieaVarArr2[z ? 1 : 0].F) != 10 && i9 != 13 && i9 != 14)) {
                if (z) {
                    if (r7Var != null && r7Var.getVisibility() == 4) {
                        if (phaVar != null) {
                            z9 = phaVar.G;
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
            int i24 = ieaVarArr2[z ? 1 : 0].F;
            if (i24 == 6) {
                if (!beaVar.e && !beaVar.h && beaVar.d.isEmpty()) {
                    beaVar.E(0L);
                }
            } else if (i24 != 7) {
                if (j0(i24)) {
                    kfa v12 = v1(ieaVarArr2[z ? 1 : 0].F);
                    if (v12 != null) {
                        y1b y1bVar = v12.s;
                        v12.P();
                        eda edaVar = ieaVarArr2[z ? 1 : 0].w;
                        if (y1bVar != null && (y1bVar.k() || (d0() && y1bVar.g() > 0))) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        edaVar.e(z5, z);
                        if (y1bVar != null && y1bVar.g() > 0 && !q0()) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z4 = z6;
                    }
                } else {
                    int i25 = ieaVarArr2[z ? 1 : 0].F;
                    if (i25 != 10 && i25 != 11 && i25 != 12 && i25 != 13 && i25 != 14) {
                        if (i25 == 15) {
                            i25 = 8;
                        }
                        cfa cfaVar5 = cfaVarArr[i25];
                        if (!cfaVar5.g && !cfaVar5.i[0] && cfaVar5.a.isEmpty()) {
                            cfaVarArr[i25].g = true;
                            w39Var2.f();
                            if (i25 == 0) {
                                byte b = cfaVarArr[0].q;
                                if (b == 1) {
                                    i2 = 6;
                                } else if (b == 2) {
                                    i2 = 7;
                                }
                                d dVar = this.y1;
                                dVar.getMediaDataController().P0(this.m1, 50, 0, 0, i2, this.G, 1, dVar.getClassGuid(), cfaVarArr[i2].p, null, null);
                            }
                            i2 = i25;
                            d dVar2 = this.y1;
                            dVar2.getMediaDataController().P0(this.m1, 50, 0, 0, i2, this.G, 1, dVar2.getClassGuid(), cfaVarArr[i2].p, null, null);
                        }
                    }
                }
            }
            int i26 = ieaVarArr2[z ? 1 : 0].F;
            if (i26 != 8 && !t0(i26)) {
                iea ieaVar10 = ieaVarArr2[z ? 1 : 0];
                if (ieaVar10.F == 9) {
                    if (r0()) {
                        ieaVarArr2[z ? 1 : 0].w.b.setVisibility(8);
                        ieaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                    } else {
                        ieaVarArr2[z ? 1 : 0].w.b.setVisibility(0);
                        ieaVarArr2[z ? 1 : 0].w.setStickerType(11);
                        ieaVarArr2[z ? 1 : 0].w.f.setVisibility(0);
                        ieaVarArr2[z ? 1 : 0].w.f.h(f(), false);
                    }
                    ieaVarArr2[z ? 1 : 0].w.d.setText(k96.M0(2131748054, null));
                    l46 l46Var = ieaVarArr2[z ? 1 : 0].w.e;
                    if (s0()) {
                        str = k96.M0(2131748055, null);
                    }
                    l46Var.setText(str);
                    i3 = 4;
                    ieaVarArr2[z ? 1 : 0].w.f.setOnClickListener(new pba(this, (byte) 4));
                    i5 = 8;
                } else {
                    i3 = 4;
                    ieaVar10.w.b.setVisibility(0);
                    ieaVarArr2[z ? 1 : 0].w.setStickerType(1);
                    ieaVarArr2[z ? 1 : 0].w.d.setText(k96.M0(2131747975, null));
                    ieaVarArr2[z ? 1 : 0].w.e.setText(k96.M0(2131745615, null));
                    i5 = 8;
                    ieaVarArr2[z ? 1 : 0].w.f.setVisibility(8);
                }
            } else {
                i3 = 4;
                iea ieaVar11 = ieaVarArr2[z ? 1 : 0];
                eda edaVar2 = ieaVar11.w;
                boolean t0 = t0(ieaVar11.F);
                int s1 = s1(ieaVarArr2[z ? 1 : 0].F);
                be0 be0Var = edaVar2.b;
                u41 u41Var = edaVar2.f;
                if (!t0 && !r0() && !l0()) {
                    i4 = 0;
                } else {
                    i4 = 8;
                }
                be0Var.setVisibility(i4);
                if (t0) {
                    u41Var.setVisibility(0);
                    u41Var.h(k96.M0(2131744568, null), false);
                    i5 = 8;
                } else if (r0()) {
                    i5 = 8;
                    u41Var.setVisibility(8);
                } else {
                    i5 = 8;
                    edaVar2.setStickerType(11);
                    if (!q0()) {
                        i6 = 0;
                    } else {
                        i6 = 8;
                    }
                    u41Var.setVisibility(i6);
                    u41Var.h(f(), false);
                }
                wla wlaVar = edaVar2.d;
                if (t0) {
                    wlaVar.setText(k96.M0(2131744546, null));
                    edaVar2.e.setText(k96.M0(2131744547, null));
                } else {
                    if (!q0()) {
                        if (s0()) {
                            i7 = 2131747984;
                        } else {
                            i7 = 2131747955;
                        }
                    } else {
                        i7 = 2131748012;
                    }
                    wlaVar.setText(k96.M0(i7, null));
                    l46 l46Var2 = edaVar2.e;
                    if (s0()) {
                        str = k96.M0(2131747956, null);
                    }
                    l46Var2.setText(str);
                }
                u41Var.setOnClickListener(new yp8(this, t0, s1, (byte) 1));
            }
            z7 = false;
            ieaVarArr2[z ? 1 : 0].h.setVisibility(0);
            k49Var3 = k49Var2;
        }
        int i27 = i14;
        iea ieaVar12 = ieaVarArr2[z ? 1 : 0];
        ieaVar12.b = z4;
        D1(ieaVar12, z7);
        ieaVarArr2[z ? 1 : 0].x.x1(i27);
        ieaVarArr2[z ? 1 : 0].h.b0();
        if (k49Var3 != null) {
            ieaVarArr2[z ? 1 : 0].h.setRecycledViewPool(k49Var3);
            ieaVarArr2[z ? 1 : 0].n.setRecycledViewPool(k49Var3);
        }
        if (this.A0 == 2) {
            if (phaVar != null) {
                z11 = phaVar.G;
            } else {
                z11 = aVar.o0;
            }
            if (z11) {
                this.C0 = true;
                if (phaVar != null) {
                    phaVar.n(true);
                } else {
                    aVar.n(true);
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

    public void K0() {
    }

    public void Q0() {
    }

    @Override
    public final void s() {
    }

    public void J0(SparseArray sparseArray) {
    }

    public void R0(boolean z) {
    }

    public int c1(int i) {
        return i;
    }

    @Override
    public final void o(ue3 ue3Var) {
    }

    @Override
    public final void v(ue3 ue3Var) {
    }

    @Override
    public final void w(ue3 ue3Var) {
    }
}
