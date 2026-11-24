package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class zj6 extends d implements gfa, aj4, gk7 {
    public boolean E;
    public boolean F;
    public int G;
    public a8 H;
    public a8 I;
    public a8 J;
    public ch6 K;
    public final ox4[] L;
    public int M;
    public FrameLayout N;
    public u41 O;
    public fm0 P;
    public View Q;
    public vj6 R;
    public yj6 S;
    public int T;
    public String U;
    public int V;
    public int a;
    public ffa b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public xha s;
    public SparseArray w;
    public a8 x;
    public a8 y;

    public zj6(Bundle bundle, ffa ffaVar) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new ox4[2];
        this.M = -1;
        this.b = ffaVar;
    }

    public static int Z(zj6 zj6Var) {
        return zj6Var.classGuid;
    }

    @Override
    public final List D() {
        String str;
        Activity parentActivity = getParentActivity();
        do3 do3Var = h9a.m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new zi4(str.concat(" shape detector learning debug"), new uj6(this, (byte) 1)));
    }

    @Override
    public final void Q() {
        ffa ffaVar;
        yj6 yj6Var = this.S;
        if (yj6Var != null && (ffaVar = this.b) != null) {
            yj6Var.setNewMediaCounts(ffaVar.c);
        }
        e0();
    }

    public final void a0() {
        int i;
        if (this.S == null) {
            return;
        }
        int i2 = 0;
        if (this.K != null) {
            i = gl.L(72.0f);
        } else {
            i = 0;
        }
        yj6 yj6Var = this.S;
        int currentActionBarHeight = a.getCurrentActionBarHeight() + this.mSystemInsets.b;
        int[] iArr = nfa.t2;
        yj6Var.i1(dg0.d(currentActionBarHeight - a.getCurrentActionBarHeight()) - gl.L(6.666f), dg0.c(this.mSystemInsets.b), dg0.c(this.mSystemInsets.d + i), this.mSystemInsets.d + i);
        if (this.Q != null) {
            int topPanelShift = this.S.getTopPanelShift() + gl.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
            if (this.Q.getLayoutParams().height != topPanelShift) {
                this.Q.getLayoutParams().height = topPanelShift;
                this.Q.requestLayout();
            }
        }
        View view = this.navigationBarFadeView;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i3 = this.mSystemInsets.d;
            layoutParams.height = i3 + i;
            View view2 = this.navigationBarFadeView;
            if (i3 < gl.L(40.0f) && i <= 0) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            this.navigationBarFadeView.requestLayout();
        }
        b0();
    }

    public final void b0() {
        int i;
        int i2;
        if (this.K == null) {
            return;
        }
        float f = this.P.e;
        float L = gl.L(72.0f) + this.mSystemInsets.d;
        this.K.setTranslationY((L * f) + (-i));
        float f2 = 1.0f - f;
        this.K.setAlpha(f2);
        ch6 ch6Var = this.K;
        int i3 = 4;
        if (f < 1.0f) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        ch6Var.setVisibility(i2);
        this.N.setTranslationY((L * f2) + (-this.mSystemInsets.d));
        this.N.setAlpha(f);
        FrameLayout frameLayout = this.N;
        if (f > 0.0f) {
            i3 = 0;
        }
        frameLayout.setVisibility(i3);
    }

    public final boolean c0() {
        int i = this.a;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        if (!this.S.u0()) {
            return false;
        }
        return super.canBeginSlide();
    }

    @Override
    public final View createView(Context context) {
        dg0 dg0Var;
        int childCount;
        int i;
        int i2 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 8));
        oc6 oc6Var = new oc6((byte) 3, context, this);
        this.fragmentView = oc6Var;
        if (this.a == 0 && this.e == getUserConfig().e() && this.f == 0 && !getMessagesController().D1().b && getMessagesController().D1().e()) {
            this.T = 11;
        }
        dg0 baseSimpleGlass = getBaseSimpleGlass();
        yj6 yj6Var = new yj6(this, context, this.e, this.b, this.c, this.d, this.T, this, new xj6(this), getResourceProvider(), baseSimpleGlass.c);
        this.S = yj6Var;
        yj6Var.setOnTopPanelShiftChanged(new uj6(this, (byte) 0));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        oc6Var.addView(this.S, nme.c(-1.0f, -1));
        if (c0()) {
            xha a = this.simpleActionBar.t().a(0, 2131231247);
            this.s = a;
            a.setContentDescription(k96.M0(2131754838, null));
            this.s.Y(false, false);
            a8 e = this.s.e(8, 2131232443, k96.M0(2131748458, null));
            this.I = e;
            e.setOnClickListener(new View.OnClickListener(this) {
                public final zj6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    y1b y1bVar;
                    y1b y1bVar2;
                    y1b y1bVar3;
                    y1b y1bVar4;
                    boolean z;
                    int i3;
                    m21 j;
                    byte b = r2;
                    pw0 pw0Var = pw0.APP_ERROR;
                    zj6 zj6Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean O1 = zj6Var.S.O1(null, null);
                            if (O1 != null) {
                                zj6Var.g0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = zj6Var.S.P1(null, null);
                            if (P1 != null) {
                                zj6Var.g0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z2 = zj6Var.E;
                            if (z2 && !zj6Var.F) {
                                pw0Var.a();
                                a8 a8Var = zj6Var.x;
                                int i4 = -zj6Var.G;
                                zj6Var.G = i4;
                                gl.A3(i4, a8Var, null);
                                return;
                            }
                            a8 a8Var2 = zj6Var.x;
                            boolean z3 = !z2;
                            zj6Var.E = z3;
                            a8Var2.setChecked(z3);
                            yj6 yj6Var2 = zj6Var.S;
                            boolean z4 = zj6Var.E;
                            boolean z5 = zj6Var.F;
                            xda xdaVar = yj6Var2.f0;
                            if (xdaVar != null && (y1bVar2 = xdaVar.s) != null) {
                                y1bVar2.n = z4;
                                y1bVar2.o = z5;
                                y1bVar2.d(true);
                            }
                            jca jcaVar = yj6Var2.h0;
                            if (jcaVar != null && (y1bVar = jcaVar.s) != null) {
                                y1bVar.n = z4;
                                y1bVar.o = z5;
                                y1bVar.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z6 = zj6Var.F;
                            if (z6 && !zj6Var.E) {
                                pw0Var.a();
                                a8 a8Var3 = zj6Var.y;
                                int i5 = -zj6Var.G;
                                zj6Var.G = i5;
                                gl.A3(i5, a8Var3, null);
                                return;
                            }
                            a8 a8Var4 = zj6Var.y;
                            boolean z7 = !z6;
                            zj6Var.F = z7;
                            a8Var4.setChecked(z7);
                            yj6 yj6Var3 = zj6Var.S;
                            boolean z8 = zj6Var.E;
                            boolean z9 = zj6Var.F;
                            xda xdaVar2 = yj6Var3.f0;
                            if (xdaVar2 != null && (y1bVar4 = xdaVar2.s) != null) {
                                y1bVar4.n = z8;
                                y1bVar4.o = z9;
                                y1bVar4.d(true);
                            }
                            jca jcaVar2 = yj6Var3.h0;
                            if (jcaVar2 != null && (y1bVar3 = jcaVar2.s) != null) {
                                y1bVar3.n = z8;
                                y1bVar3.o = z9;
                                y1bVar3.d(true);
                                return;
                            }
                            return;
                        default:
                            zj6 zj6Var2 = this.b;
                            vj6 vj6Var = zj6Var2.R;
                            if (vj6Var != null) {
                                vj6Var.run();
                                zj6Var2.R = null;
                            }
                            m21.e();
                            if (zj6Var2.S.getClosestTab() == 9) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (zj6Var2.w != null) {
                                i3 = 0;
                                for (int i6 = 0; i6 < zj6Var2.w.size(); i6++) {
                                    TL_stories.StoryItem storyItem = ((k27) zj6Var2.w.valueAt(i6)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i3++;
                                    }
                                }
                            } else {
                                i3 = 0;
                            }
                            zj6Var2.S.E(false);
                            if (z) {
                                zj6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i7);
                                    zArr[i7] = storyItem2.pinned;
                                    storyItem2.pinned = z;
                                }
                                zj6Var2.getMessagesController().M1().q0(zj6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                zj6Var2.R = new vj6(zj6Var2, arrayList, z, (byte) 0);
                                e45 e45Var = new e45(zj6Var2, zArr2, arrayList, zArr, (byte) 22);
                                if (z) {
                                    j = u21.b0(zj6Var2).L(2131623990, k96.G(i3, "StorySavedTitle", new Object[0]), k96.M0(2131744244, null), k96.M0(2131743648, null), e45Var).j();
                                } else {
                                    j = u21.b0(zj6Var2).J(2131623980, k96.G(i3, "StoryArchived", new Object[0]), k96.M0(2131743648, null), 5000, false, e45Var).j();
                                }
                                j.v = new oh6(zj6Var2, zArr2, (byte) 1);
                                return;
                            }
                            return;
                    }
                }
            });
            a8 e2 = this.s.e(9, 2131232444, k96.M0(2131748457, null));
            this.J = e2;
            e2.setOnClickListener(new View.OnClickListener(this) {
                public final zj6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    y1b y1bVar;
                    y1b y1bVar2;
                    y1b y1bVar3;
                    y1b y1bVar4;
                    boolean z;
                    int i3;
                    m21 j;
                    byte b = r2;
                    pw0 pw0Var = pw0.APP_ERROR;
                    zj6 zj6Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean O1 = zj6Var.S.O1(null, null);
                            if (O1 != null) {
                                zj6Var.g0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = zj6Var.S.P1(null, null);
                            if (P1 != null) {
                                zj6Var.g0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z2 = zj6Var.E;
                            if (z2 && !zj6Var.F) {
                                pw0Var.a();
                                a8 a8Var = zj6Var.x;
                                int i4 = -zj6Var.G;
                                zj6Var.G = i4;
                                gl.A3(i4, a8Var, null);
                                return;
                            }
                            a8 a8Var2 = zj6Var.x;
                            boolean z3 = !z2;
                            zj6Var.E = z3;
                            a8Var2.setChecked(z3);
                            yj6 yj6Var2 = zj6Var.S;
                            boolean z4 = zj6Var.E;
                            boolean z5 = zj6Var.F;
                            xda xdaVar = yj6Var2.f0;
                            if (xdaVar != null && (y1bVar2 = xdaVar.s) != null) {
                                y1bVar2.n = z4;
                                y1bVar2.o = z5;
                                y1bVar2.d(true);
                            }
                            jca jcaVar = yj6Var2.h0;
                            if (jcaVar != null && (y1bVar = jcaVar.s) != null) {
                                y1bVar.n = z4;
                                y1bVar.o = z5;
                                y1bVar.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z6 = zj6Var.F;
                            if (z6 && !zj6Var.E) {
                                pw0Var.a();
                                a8 a8Var3 = zj6Var.y;
                                int i5 = -zj6Var.G;
                                zj6Var.G = i5;
                                gl.A3(i5, a8Var3, null);
                                return;
                            }
                            a8 a8Var4 = zj6Var.y;
                            boolean z7 = !z6;
                            zj6Var.F = z7;
                            a8Var4.setChecked(z7);
                            yj6 yj6Var3 = zj6Var.S;
                            boolean z8 = zj6Var.E;
                            boolean z9 = zj6Var.F;
                            xda xdaVar2 = yj6Var3.f0;
                            if (xdaVar2 != null && (y1bVar4 = xdaVar2.s) != null) {
                                y1bVar4.n = z8;
                                y1bVar4.o = z9;
                                y1bVar4.d(true);
                            }
                            jca jcaVar2 = yj6Var3.h0;
                            if (jcaVar2 != null && (y1bVar3 = jcaVar2.s) != null) {
                                y1bVar3.n = z8;
                                y1bVar3.o = z9;
                                y1bVar3.d(true);
                                return;
                            }
                            return;
                        default:
                            zj6 zj6Var2 = this.b;
                            vj6 vj6Var = zj6Var2.R;
                            if (vj6Var != null) {
                                vj6Var.run();
                                zj6Var2.R = null;
                            }
                            m21.e();
                            if (zj6Var2.S.getClosestTab() == 9) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (zj6Var2.w != null) {
                                i3 = 0;
                                for (int i6 = 0; i6 < zj6Var2.w.size(); i6++) {
                                    TL_stories.StoryItem storyItem = ((k27) zj6Var2.w.valueAt(i6)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i3++;
                                    }
                                }
                            } else {
                                i3 = 0;
                            }
                            zj6Var2.S.E(false);
                            if (z) {
                                zj6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i7);
                                    zArr[i7] = storyItem2.pinned;
                                    storyItem2.pinned = z;
                                }
                                zj6Var2.getMessagesController().M1().q0(zj6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                zj6Var2.R = new vj6(zj6Var2, arrayList, z, (byte) 0);
                                e45 e45Var = new e45(zj6Var2, zArr2, arrayList, zArr, (byte) 22);
                                if (z) {
                                    j = u21.b0(zj6Var2).L(2131623990, k96.G(i3, "StorySavedTitle", new Object[0]), k96.M0(2131744244, null), k96.M0(2131743648, null), e45Var).j();
                                } else {
                                    j = u21.b0(zj6Var2).J(2131623980, k96.G(i3, "StoryArchived", new Object[0]), k96.M0(2131743648, null), 5000, false, e45Var).j();
                                }
                                j.v = new oh6(zj6Var2, zArr2, (byte) 1);
                                return;
                            }
                            return;
                    }
                }
            });
            a8 e3 = this.s.e(10, 2131232082, k96.M0(2131752630, null));
            this.H = e3;
            e3.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.s.a(-1);
            xha xhaVar = this.s;
            a8 d = xhaVar.d(6, 0, null, k96.M0(2131748461, null), true, true, xhaVar.n0);
            this.x = d;
            d.setChecked(this.E);
            this.x.setOnClickListener(new View.OnClickListener(this) {
                public final zj6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    y1b y1bVar;
                    y1b y1bVar2;
                    y1b y1bVar3;
                    y1b y1bVar4;
                    boolean z;
                    int i3;
                    m21 j;
                    byte b = r2;
                    pw0 pw0Var = pw0.APP_ERROR;
                    zj6 zj6Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean O1 = zj6Var.S.O1(null, null);
                            if (O1 != null) {
                                zj6Var.g0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = zj6Var.S.P1(null, null);
                            if (P1 != null) {
                                zj6Var.g0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z2 = zj6Var.E;
                            if (z2 && !zj6Var.F) {
                                pw0Var.a();
                                a8 a8Var = zj6Var.x;
                                int i4 = -zj6Var.G;
                                zj6Var.G = i4;
                                gl.A3(i4, a8Var, null);
                                return;
                            }
                            a8 a8Var2 = zj6Var.x;
                            boolean z3 = !z2;
                            zj6Var.E = z3;
                            a8Var2.setChecked(z3);
                            yj6 yj6Var2 = zj6Var.S;
                            boolean z4 = zj6Var.E;
                            boolean z5 = zj6Var.F;
                            xda xdaVar = yj6Var2.f0;
                            if (xdaVar != null && (y1bVar2 = xdaVar.s) != null) {
                                y1bVar2.n = z4;
                                y1bVar2.o = z5;
                                y1bVar2.d(true);
                            }
                            jca jcaVar = yj6Var2.h0;
                            if (jcaVar != null && (y1bVar = jcaVar.s) != null) {
                                y1bVar.n = z4;
                                y1bVar.o = z5;
                                y1bVar.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z6 = zj6Var.F;
                            if (z6 && !zj6Var.E) {
                                pw0Var.a();
                                a8 a8Var3 = zj6Var.y;
                                int i5 = -zj6Var.G;
                                zj6Var.G = i5;
                                gl.A3(i5, a8Var3, null);
                                return;
                            }
                            a8 a8Var4 = zj6Var.y;
                            boolean z7 = !z6;
                            zj6Var.F = z7;
                            a8Var4.setChecked(z7);
                            yj6 yj6Var3 = zj6Var.S;
                            boolean z8 = zj6Var.E;
                            boolean z9 = zj6Var.F;
                            xda xdaVar2 = yj6Var3.f0;
                            if (xdaVar2 != null && (y1bVar4 = xdaVar2.s) != null) {
                                y1bVar4.n = z8;
                                y1bVar4.o = z9;
                                y1bVar4.d(true);
                            }
                            jca jcaVar2 = yj6Var3.h0;
                            if (jcaVar2 != null && (y1bVar3 = jcaVar2.s) != null) {
                                y1bVar3.n = z8;
                                y1bVar3.o = z9;
                                y1bVar3.d(true);
                                return;
                            }
                            return;
                        default:
                            zj6 zj6Var2 = this.b;
                            vj6 vj6Var = zj6Var2.R;
                            if (vj6Var != null) {
                                vj6Var.run();
                                zj6Var2.R = null;
                            }
                            m21.e();
                            if (zj6Var2.S.getClosestTab() == 9) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (zj6Var2.w != null) {
                                i3 = 0;
                                for (int i6 = 0; i6 < zj6Var2.w.size(); i6++) {
                                    TL_stories.StoryItem storyItem = ((k27) zj6Var2.w.valueAt(i6)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i3++;
                                    }
                                }
                            } else {
                                i3 = 0;
                            }
                            zj6Var2.S.E(false);
                            if (z) {
                                zj6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i7);
                                    zArr[i7] = storyItem2.pinned;
                                    storyItem2.pinned = z;
                                }
                                zj6Var2.getMessagesController().M1().q0(zj6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                zj6Var2.R = new vj6(zj6Var2, arrayList, z, (byte) 0);
                                e45 e45Var = new e45(zj6Var2, zArr2, arrayList, zArr, (byte) 22);
                                if (z) {
                                    j = u21.b0(zj6Var2).L(2131623990, k96.G(i3, "StorySavedTitle", new Object[0]), k96.M0(2131744244, null), k96.M0(2131743648, null), e45Var).j();
                                } else {
                                    j = u21.b0(zj6Var2).J(2131623980, k96.G(i3, "StoryArchived", new Object[0]), k96.M0(2131743648, null), 5000, false, e45Var).j();
                                }
                                j.v = new oh6(zj6Var2, zArr2, (byte) 1);
                                return;
                            }
                            return;
                    }
                }
            });
            xha xhaVar2 = this.s;
            a8 d2 = xhaVar2.d(7, 0, null, k96.M0(2131748460, null), true, true, xhaVar2.n0);
            this.y = d2;
            d2.setChecked(this.F);
            this.y.setOnClickListener(new View.OnClickListener(this) {
                public final zj6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    y1b y1bVar;
                    y1b y1bVar2;
                    y1b y1bVar3;
                    y1b y1bVar4;
                    boolean z;
                    int i3;
                    m21 j;
                    byte b = r2;
                    pw0 pw0Var = pw0.APP_ERROR;
                    zj6 zj6Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean O1 = zj6Var.S.O1(null, null);
                            if (O1 != null) {
                                zj6Var.g0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = zj6Var.S.P1(null, null);
                            if (P1 != null) {
                                zj6Var.g0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z2 = zj6Var.E;
                            if (z2 && !zj6Var.F) {
                                pw0Var.a();
                                a8 a8Var = zj6Var.x;
                                int i4 = -zj6Var.G;
                                zj6Var.G = i4;
                                gl.A3(i4, a8Var, null);
                                return;
                            }
                            a8 a8Var2 = zj6Var.x;
                            boolean z3 = !z2;
                            zj6Var.E = z3;
                            a8Var2.setChecked(z3);
                            yj6 yj6Var2 = zj6Var.S;
                            boolean z4 = zj6Var.E;
                            boolean z5 = zj6Var.F;
                            xda xdaVar = yj6Var2.f0;
                            if (xdaVar != null && (y1bVar2 = xdaVar.s) != null) {
                                y1bVar2.n = z4;
                                y1bVar2.o = z5;
                                y1bVar2.d(true);
                            }
                            jca jcaVar = yj6Var2.h0;
                            if (jcaVar != null && (y1bVar = jcaVar.s) != null) {
                                y1bVar.n = z4;
                                y1bVar.o = z5;
                                y1bVar.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z6 = zj6Var.F;
                            if (z6 && !zj6Var.E) {
                                pw0Var.a();
                                a8 a8Var3 = zj6Var.y;
                                int i5 = -zj6Var.G;
                                zj6Var.G = i5;
                                gl.A3(i5, a8Var3, null);
                                return;
                            }
                            a8 a8Var4 = zj6Var.y;
                            boolean z7 = !z6;
                            zj6Var.F = z7;
                            a8Var4.setChecked(z7);
                            yj6 yj6Var3 = zj6Var.S;
                            boolean z8 = zj6Var.E;
                            boolean z9 = zj6Var.F;
                            xda xdaVar2 = yj6Var3.f0;
                            if (xdaVar2 != null && (y1bVar4 = xdaVar2.s) != null) {
                                y1bVar4.n = z8;
                                y1bVar4.o = z9;
                                y1bVar4.d(true);
                            }
                            jca jcaVar2 = yj6Var3.h0;
                            if (jcaVar2 != null && (y1bVar3 = jcaVar2.s) != null) {
                                y1bVar3.n = z8;
                                y1bVar3.o = z9;
                                y1bVar3.d(true);
                                return;
                            }
                            return;
                        default:
                            zj6 zj6Var2 = this.b;
                            vj6 vj6Var = zj6Var2.R;
                            if (vj6Var != null) {
                                vj6Var.run();
                                zj6Var2.R = null;
                            }
                            m21.e();
                            if (zj6Var2.S.getClosestTab() == 9) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (zj6Var2.w != null) {
                                i3 = 0;
                                for (int i6 = 0; i6 < zj6Var2.w.size(); i6++) {
                                    TL_stories.StoryItem storyItem = ((k27) zj6Var2.w.valueAt(i6)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i3++;
                                    }
                                }
                            } else {
                                i3 = 0;
                            }
                            zj6Var2.S.E(false);
                            if (z) {
                                zj6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i7);
                                    zArr[i7] = storyItem2.pinned;
                                    storyItem2.pinned = z;
                                }
                                zj6Var2.getMessagesController().M1().q0(zj6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                zj6Var2.R = new vj6(zj6Var2, arrayList, z, (byte) 0);
                                e45 e45Var = new e45(zj6Var2, zArr2, arrayList, zArr, (byte) 22);
                                if (z) {
                                    j = u21.b0(zj6Var2).L(2131623990, k96.G(i3, "StorySavedTitle", new Object[0]), k96.M0(2131744244, null), k96.M0(2131743648, null), e45Var).j();
                                } else {
                                    j = u21.b0(zj6Var2).J(2131623980, k96.G(i3, "StoryArchived", new Object[0]), k96.M0(2131743648, null), 5000, false, e45Var).j();
                                }
                                j.v = new oh6(zj6Var2, zArr2, (byte) 1);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        int i3 = this.a;
        ox4[] ox4VarArr = this.L;
        if (i3 == 1) {
            ch6 ch6Var = new ch6(context, getResourceProvider());
            this.K = ch6Var;
            ch6Var.setClipChildren(false);
            this.K.setPadding(gl.L(12.0f), gl.L(12.0f), gl.L(12.0f), gl.L(12.0f));
            ox4VarArr[0] = ox4.c(context, getResourceProvider(), nx4.R, 2131746458);
            ox4VarArr[1] = ox4.c(context, getResourceProvider(), nx4.S, 2131746434);
            for (int i4 = 0; i4 < ox4VarArr.length; i4++) {
                ox4VarArr[i4].setOnClickListener(new v0(this, i4, (byte) 10));
                this.K.addView(ox4VarArr[i4]);
                this.K.j(ox4VarArr[i4], true, false);
            }
            dg0Var = baseSimpleGlass;
            il0 c = dg0Var.c.c(this.K, nod.g(getResourceProvider()), false);
            ug8.r(c, gl.L(28.0f), 7.666f);
            this.K.setBackground(c);
            oc6Var.addView(this.K, nme.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(gl.L(16.0f), gl.L(8.0f), gl.L(16.0f), gl.L(8.0f));
            u41 u41Var = new u41(getResourceProvider(), context, true);
            this.O = u41Var;
            u41Var.i(k96.M0(2131745717, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            this.O.setOnClickListener(new View.OnClickListener(this) {
                public final zj6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    y1b y1bVar;
                    y1b y1bVar2;
                    y1b y1bVar3;
                    y1b y1bVar4;
                    boolean z;
                    int i32;
                    m21 j;
                    byte b = r2;
                    pw0 pw0Var = pw0.APP_ERROR;
                    zj6 zj6Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean O1 = zj6Var.S.O1(null, null);
                            if (O1 != null) {
                                zj6Var.g0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = zj6Var.S.P1(null, null);
                            if (P1 != null) {
                                zj6Var.g0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z2 = zj6Var.E;
                            if (z2 && !zj6Var.F) {
                                pw0Var.a();
                                a8 a8Var = zj6Var.x;
                                int i42 = -zj6Var.G;
                                zj6Var.G = i42;
                                gl.A3(i42, a8Var, null);
                                return;
                            }
                            a8 a8Var2 = zj6Var.x;
                            boolean z3 = !z2;
                            zj6Var.E = z3;
                            a8Var2.setChecked(z3);
                            yj6 yj6Var2 = zj6Var.S;
                            boolean z4 = zj6Var.E;
                            boolean z5 = zj6Var.F;
                            xda xdaVar = yj6Var2.f0;
                            if (xdaVar != null && (y1bVar2 = xdaVar.s) != null) {
                                y1bVar2.n = z4;
                                y1bVar2.o = z5;
                                y1bVar2.d(true);
                            }
                            jca jcaVar = yj6Var2.h0;
                            if (jcaVar != null && (y1bVar = jcaVar.s) != null) {
                                y1bVar.n = z4;
                                y1bVar.o = z5;
                                y1bVar.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z6 = zj6Var.F;
                            if (z6 && !zj6Var.E) {
                                pw0Var.a();
                                a8 a8Var3 = zj6Var.y;
                                int i5 = -zj6Var.G;
                                zj6Var.G = i5;
                                gl.A3(i5, a8Var3, null);
                                return;
                            }
                            a8 a8Var4 = zj6Var.y;
                            boolean z7 = !z6;
                            zj6Var.F = z7;
                            a8Var4.setChecked(z7);
                            yj6 yj6Var3 = zj6Var.S;
                            boolean z8 = zj6Var.E;
                            boolean z9 = zj6Var.F;
                            xda xdaVar2 = yj6Var3.f0;
                            if (xdaVar2 != null && (y1bVar4 = xdaVar2.s) != null) {
                                y1bVar4.n = z8;
                                y1bVar4.o = z9;
                                y1bVar4.d(true);
                            }
                            jca jcaVar2 = yj6Var3.h0;
                            if (jcaVar2 != null && (y1bVar3 = jcaVar2.s) != null) {
                                y1bVar3.n = z8;
                                y1bVar3.o = z9;
                                y1bVar3.d(true);
                                return;
                            }
                            return;
                        default:
                            zj6 zj6Var2 = this.b;
                            vj6 vj6Var = zj6Var2.R;
                            if (vj6Var != null) {
                                vj6Var.run();
                                zj6Var2.R = null;
                            }
                            m21.e();
                            if (zj6Var2.S.getClosestTab() == 9) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (zj6Var2.w != null) {
                                i32 = 0;
                                for (int i6 = 0; i6 < zj6Var2.w.size(); i6++) {
                                    TL_stories.StoryItem storyItem = ((k27) zj6Var2.w.valueAt(i6)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i32++;
                                    }
                                }
                            } else {
                                i32 = 0;
                            }
                            zj6Var2.S.E(false);
                            if (z) {
                                zj6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i7);
                                    zArr[i7] = storyItem2.pinned;
                                    storyItem2.pinned = z;
                                }
                                zj6Var2.getMessagesController().M1().q0(zj6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                zj6Var2.R = new vj6(zj6Var2, arrayList, z, (byte) 0);
                                e45 e45Var = new e45(zj6Var2, zArr2, arrayList, zArr, (byte) 22);
                                if (z) {
                                    j = u21.b0(zj6Var2).L(2131623990, k96.G(i32, "StorySavedTitle", new Object[0]), k96.M0(2131744244, null), k96.M0(2131743648, null), e45Var).j();
                                } else {
                                    j = u21.b0(zj6Var2).J(2131623980, k96.G(i32, "StoryArchived", new Object[0]), k96.M0(2131743648, null), 5000, false, e45Var).j();
                                }
                                j.v = new oh6(zj6Var2, zArr2, (byte) 1);
                                return;
                            }
                            return;
                    }
                }
            });
            this.N.addView(this.O, nme.c(56.0f, -1));
            this.N.setVisibility(4);
            oc6Var.addView(this.N, nme.e(-1, 72, 80));
            this.P = new fm0(0, new ry4(this, (byte) 28), s33.h, 320L, false);
            setBulletinDelegate(new s10(this, (byte) 12));
        } else {
            dg0Var = baseSimpleGlass;
        }
        View view = new View(context);
        this.Q = view;
        this.S.e(view);
        View view2 = this.Q;
        view2.setBackground(dg0Var.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(dg0Var.b(view3));
        View view4 = this.navigationBarFadeView;
        ch6 ch6Var2 = this.K;
        if (ch6Var2 != null) {
            childCount = oc6Var.indexOfChild(ch6Var2);
        } else {
            childCount = oc6Var.getChildCount();
        }
        oc6Var.addView(view4, childCount, nme.e(-1, 0, 80));
        pha phaVar = this.simpleActionBar;
        wjb resourceProvider = getResourceProvider();
        dg0Var.m = oc6Var;
        dg0Var.n = null;
        dg0Var.g(oc6Var, phaVar, resourceProvider);
        dg0Var.o = new cg0(this, oc6Var, (byte) 6);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        f0(false);
        if (this.a == 3 && (i = this.r) != -1) {
            this.simpleActionBar.setSubtitle(k96.H(' ', "FoundStories", i));
        }
        a0();
        e0();
        if (this.a == 1) {
            if (this.T != 9) {
                i2 = 0;
            }
            ch6 ch6Var3 = this.K;
            if (ch6Var3 != null && this.M != i2) {
                this.M = i2;
                ch6Var3.r(ox4VarArr[i2], false);
            }
        }
        return oc6Var;
    }

    public final void d0(String str) {
        this.simpleActionBar.setSubtitleAnimated(str);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.D0 && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            yj6 yj6Var = this.S;
            if (yj6Var != null) {
                yj6Var.setUserInfo(userFull);
            }
        }
    }

    public final void e0() {
        String str;
        String str2;
        boolean z;
        int size;
        boolean z2;
        float f;
        float f2;
        int size2;
        int i;
        yj6 yj6Var = this.S;
        if (yj6Var != null && this.simpleActionBar != null) {
            int closestTab = yj6Var.getClosestTab();
            if (this.a != 3 || closestTab == 8) {
                int[] iArr = this.b.c;
                boolean z3 = k96.a0;
                boolean z4 = true;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        d0(k96.G(getMessagesController().D1().c(), "SavedDialogsTabCount", new Object[0]));
                        return;
                    } else if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                if (this.S.getPhotosVideosTypeFilter() == 1) {
                                    d0(k96.G(iArr[6], "Photos", new Object[0]));
                                    return;
                                } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                                    d0(k96.G(iArr[7], "Videos", new Object[0]));
                                    return;
                                } else {
                                    d0(k96.G(iArr[0], "Media", new Object[0]));
                                    return;
                                }
                            } else if (closestTab == 1) {
                                d0(k96.G(iArr[1], "Files", new Object[0]));
                                return;
                            } else if (closestTab == 2) {
                                d0(k96.G(iArr[2], "Voice", new Object[0]));
                                return;
                            } else if (closestTab == 3) {
                                d0(k96.G(iArr[3], "Links", new Object[0]));
                                return;
                            } else if (closestTab == 4) {
                                d0(k96.G(iArr[4], "MusicFiles", new Object[0]));
                                return;
                            } else if (closestTab == 5) {
                                d0(k96.G(iArr[5], "GIFs", new Object[0]));
                                return;
                            } else if (closestTab == 15 && (i = iArr[8]) >= 0) {
                                d0(k96.G(i, "ProfilePollsCount", new Object[0]));
                                return;
                            } else if (closestTab == 10) {
                                p97 J0 = na7.q1(this.currentAccount).J0(this.e);
                                if (J0 == null) {
                                    size2 = 0;
                                } else {
                                    size2 = J0.b.size() + J0.c;
                                }
                                d0(k96.G(size2, "Channels", new Object[0]));
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    } else {
                        return;
                    }
                }
                a8 a8Var = this.J;
                float f3 = 0.5f;
                if (a8Var != null) {
                    a8Var.setEnabled(this.S.t());
                    a8 a8Var2 = this.J;
                    if (a8Var2.isEnabled()) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.5f;
                    }
                    a8Var2.setAlpha(f2);
                }
                a8 a8Var3 = this.I;
                if (a8Var3 != null) {
                    a8Var3.setEnabled(this.S.r());
                    a8 a8Var4 = this.I;
                    if (a8Var4.isEnabled()) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    a8Var4.setAlpha(f);
                }
                int W = this.S.W(closestTab);
                if (this.a == 3) {
                    if (W > 0) {
                        d0(k96.H(' ', "FoundStories", W));
                    }
                } else if (closestTab == 8) {
                    if (W > 0) {
                        str2 = k96.G(W, "ProfileMyStoriesCount", new Object[0]);
                    } else {
                        str2 = null;
                    }
                    d0(str2);
                } else {
                    if (W > 0) {
                        str = k96.G(W, "ProfileStoriesArchiveCount", new Object[0]);
                    } else {
                        str = null;
                    }
                    d0(str);
                }
                f0(true);
                xha xhaVar = this.s;
                if (xhaVar != null) {
                    if (W > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    xhaVar.Y(z2, true);
                }
                u41 u41Var = this.O;
                if (u41Var != null) {
                    if (!z3 && this.V == closestTab) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (closestTab == 8) {
                        SparseArray sparseArray = this.w;
                        if (sparseArray == null) {
                            size = 0;
                        } else {
                            size = sparseArray.size();
                        }
                        u41Var.i(k96.G(size, "ArchiveStories", new Object[0]), z, true);
                    } else {
                        u41Var.i(k96.M0(2131745717, null), z, true);
                    }
                    this.V = closestTab;
                }
                a8 a8Var5 = this.H;
                if (a8Var5 != null) {
                    if (W <= 0) {
                        z4 = false;
                    }
                    a8Var5.setEnabled(z4);
                    a8 a8Var6 = this.H;
                    if (z4) {
                        f3 = 1.0f;
                    }
                    a8Var6.setAlpha(f3);
                }
            }
        }
    }

    public final void f0(boolean z) {
        long j;
        String str;
        TLRPC.User user;
        int i = this.a;
        boolean z2 = true;
        if (i == 3) {
            str = this.h;
        } else {
            int i2 = 2131746441;
            if (i == 2) {
                str = k96.M0(2131746441, null);
            } else if (i == 1) {
                yj6 yj6Var = this.S;
                if (yj6Var != null && yj6Var.getClosestTab() != 9) {
                    z2 = false;
                }
                if (!z2) {
                    i2 = 2131746462;
                }
                str = k96.M0(i2, null);
            } else {
                if (this.f != 0 && this.e == getUserConfig().e()) {
                    j = this.f;
                } else {
                    j = this.e;
                }
                if (j == 2666000) {
                    str = k96.M0(2131754249, null);
                } else if (this.f != 0 && j == getUserConfig().e()) {
                    str = k96.M0(2131748111, null);
                } else if (cf3.B(j)) {
                    TLRPC.EncryptedChat Y0 = getMessagesController().Y0(Integer.valueOf((int) (j & 4294967295L)));
                    if (Y0 != null) {
                        user = getMessagesController().V1(Long.valueOf(Y0.user_id));
                    } else {
                        user = null;
                    }
                    if (user != null) {
                        str = qu2.m(0, user.first_name, user.last_name);
                    }
                    str = null;
                } else if (cf3.D(j)) {
                    TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
                    if (V1 != null) {
                        if (V1.self) {
                            str = k96.M0(2131745709, null);
                        } else {
                            str = qu2.m(0, V1.first_name, V1.last_name);
                        }
                    }
                    str = null;
                } else {
                    TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
                    if (K0 != null) {
                        str = K0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = k96.M0(2131745223, null);
                }
            }
        }
        String str2 = str;
        boolean z3 = z2;
        if (TextUtils.equals(this.U, str2)) {
            return;
        }
        this.U = str2;
        pha phaVar = this.simpleActionBar;
        if (z) {
            phaVar.getClass();
            phaVar.I(str2, z3, 320L, s33.h);
            return;
        }
        phaVar.setTitle(str2);
    }

    public final void g0(boolean z, boolean z2) {
        float f;
        this.J.setEnabled(z);
        ViewPropertyAnimator animate = this.J.animate();
        float f2 = 0.5f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        animate.alpha(f).start();
        this.I.setEnabled(z2);
        ViewPropertyAnimator animate2 = this.I.animate();
        if (z2) {
            f2 = 1.0f;
        }
        animate2.alpha(f2).start();
    }

    @Override
    public final int getNavigationBarColor() {
        int navigationBarColor = super.getNavigationBarColor();
        if (getLastStoryViewer() != null && getLastStoryViewer().z()) {
            return getLastStoryViewer().e(navigationBarColor);
        }
        return navigationBarColor;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.S.getThemeDescriptions());
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (!this.S.u0()) {
            return false;
        }
        yj6 yj6Var = this.S;
        if (yj6Var.getSelectedTab() != yj6Var.L0.getFirstTabId()) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (hasShownSheet()) {
            if (z) {
                closeSheet();
                return false;
            }
        } else {
            yj6 yj6Var = this.S;
            if (yj6Var.F1) {
                if (z) {
                    yj6Var.E(false);
                }
            } else {
                return super.onBackPressed(z);
            }
        }
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int i;
        this.a = getArguments().getInt("type", 0);
        this.e = getArguments().getLong("dialog_id");
        this.f = getArguments().getLong("topic_id", 0L);
        this.h = getArguments().getString("hashtag", "");
        this.n = getArguments().getString("username", "");
        this.r = getArguments().getInt("storiesCount", -1);
        int i2 = this.a;
        if (i2 == 2) {
            i = 9;
        } else if (i2 == 1) {
            i = 8;
        } else {
            i = 0;
        }
        this.T = getArguments().getInt("start_from", i);
        getNotificationCenter().b(this, kk7.D0);
        getNotificationCenter().b(this, kk7.h5);
        getNotificationCenter().b(this, kk7.a3);
        if (cf3.D(this.e) && this.f == 0) {
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(this.e));
            if (l7c.D(V1)) {
                getMessagesController().i3(this.classGuid, V1, false);
                this.d = getMessagesController().W1(this.e);
            }
        }
        ffa ffaVar = this.b;
        if (ffaVar == null) {
            ffaVar = new ffa(this);
            this.b = ffaVar;
        }
        ffaVar.y.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, kk7.D0);
        getNotificationCenter().n(this, kk7.h5);
        getNotificationCenter().n(this, kk7.a3);
        vj6 vj6Var = this.R;
        if (vj6Var != null) {
            this.R = null;
            gl.c3(vj6Var);
        }
    }

    @Override
    public final void onInsets(int i, int i2, int i3, int i4) {
        a0();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
