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
import org.telegram.ui.ActionBar.e;
public final class em6 extends e implements xia, el4, fn7 {
    public boolean E;
    public boolean F;
    public int G;
    public b8 H;
    public b8 I;
    public b8 J;
    public hj6 K;
    public final uz4[] L;
    public int M;
    public FrameLayout N;
    public c51 O;
    public fm0 P;
    public View Q;
    public svc R;
    public dm6 S;
    public int T;
    public String U;
    public int V;
    public int a;
    public wia b;
    public TLRPC.ChatFull c;
    public TLRPC.UserFull d;
    public long e;
    public long f;
    public String h;
    public String n;
    public int r;
    public sla s;
    public SparseArray w;
    public b8 x;
    public b8 y;

    public em6(Bundle bundle, wia wiaVar) {
        super(bundle);
        this.E = true;
        this.F = true;
        this.G = -12;
        this.L = new uz4[2];
        this.M = -1;
        this.b = wiaVar;
    }

    public static int Z(em6 em6Var) {
        return em6Var.classGuid;
    }

    @Override
    public final List D() {
        String str;
        Activity parentActivity = getParentActivity();
        uo3 uo3Var = xca.m;
        if (parentActivity.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false)) {
            str = "Disable";
        } else {
            str = "Enable";
        }
        return Arrays.asList(new dl4(str.concat(" shape detector learning debug"), new zl6(this, (byte) 1)));
    }

    @Override
    public final void Q() {
        wia wiaVar;
        dm6 dm6Var = this.S;
        if (dm6Var != null && (wiaVar = this.b) != null) {
            dm6Var.setNewMediaCounts(wiaVar.c);
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
            i = hl.L(72.0f);
        } else {
            i = 0;
        }
        dm6 dm6Var = this.S;
        int currentActionBarHeight = a.getCurrentActionBarHeight() + this.mSystemInsets.b;
        int[] iArr = eja.t2;
        dm6Var.i1(eg0.f(currentActionBarHeight - a.getCurrentActionBarHeight()) - hl.L(6.666f), eg0.e(this.mSystemInsets.b), eg0.e(this.mSystemInsets.d + i), this.mSystemInsets.d + i);
        if (this.Q != null) {
            int topPanelShift = this.S.getTopPanelShift() + hl.L(44.0f) + a.getCurrentActionBarHeight() + this.mSystemInsets.b;
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
            if (i3 < hl.L(40.0f) && i <= 0) {
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
        float L = hl.L(72.0f) + this.mSystemInsets.d;
        this.K.setTranslationY((L * f) + (-i));
        float f2 = 1.0f - f;
        this.K.setAlpha(f2);
        hj6 hj6Var = this.K;
        int i3 = 4;
        if (f < 1.0f) {
            i2 = 0;
        } else {
            i2 = 4;
        }
        hj6Var.setVisibility(i2);
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
        eg0 eg0Var;
        int childCount;
        int i;
        int i2 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        this.simpleActionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 9));
        d26 d26Var = new d26((byte) 4, context, this);
        this.fragmentView = d26Var;
        if (this.a == 0 && this.e == getUserConfig().e() && this.f == 0 && !getMessagesController().F1().b && getMessagesController().F1().e()) {
            this.T = 11;
        }
        eg0 baseSimpleGlass = getBaseSimpleGlass();
        dm6 dm6Var = new dm6(this, context, this.e, this.b, this.c, this.d, this.T, this, new cm6(this), getResourceProvider(), baseSimpleGlass.c);
        this.S = dm6Var;
        dm6Var.setOnTopPanelShiftChanged(new zl6(this, (byte) 0));
        this.S.L0.setOpen(true);
        this.S.setPinnedToTop(true);
        d26Var.addView(this.S, tre.c(-1.0f, -1));
        if (c0()) {
            sla a = this.simpleActionBar.v().a(0, 2131231247);
            this.s = a;
            a.setContentDescription(ob6.M0(2131754834, null));
            this.s.Y(false, false);
            b8 e = this.s.e(8, 2131232443, ob6.M0(2131748404, null));
            this.I = e;
            e.setOnClickListener(new View.OnClickListener(this) {
                public final em6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    u5b u5bVar;
                    u5b u5bVar2;
                    u5b u5bVar3;
                    u5b u5bVar4;
                    boolean z;
                    int i3;
                    v21 j;
                    byte b = r2;
                    yw0 yw0Var = yw0.APP_ERROR;
                    em6 em6Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean O1 = em6Var.S.O1(null, null);
                            if (O1 != null) {
                                em6Var.g0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = em6Var.S.P1(null, null);
                            if (P1 != null) {
                                em6Var.g0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z2 = em6Var.E;
                            if (z2 && !em6Var.F) {
                                yw0Var.a();
                                b8 b8Var = em6Var.x;
                                int i4 = -em6Var.G;
                                em6Var.G = i4;
                                hl.A3(i4, b8Var, null);
                                return;
                            }
                            b8 b8Var2 = em6Var.x;
                            boolean z3 = !z2;
                            em6Var.E = z3;
                            b8Var2.setChecked(z3);
                            dm6 dm6Var2 = em6Var.S;
                            boolean z4 = em6Var.E;
                            boolean z5 = em6Var.F;
                            oha ohaVar = dm6Var2.f0;
                            if (ohaVar != null && (u5bVar2 = ohaVar.s) != null) {
                                u5bVar2.n = z4;
                                u5bVar2.o = z5;
                                u5bVar2.d(true);
                            }
                            aga agaVar = dm6Var2.h0;
                            if (agaVar != null && (u5bVar = agaVar.s) != null) {
                                u5bVar.n = z4;
                                u5bVar.o = z5;
                                u5bVar.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z6 = em6Var.F;
                            if (z6 && !em6Var.E) {
                                yw0Var.a();
                                b8 b8Var3 = em6Var.y;
                                int i5 = -em6Var.G;
                                em6Var.G = i5;
                                hl.A3(i5, b8Var3, null);
                                return;
                            }
                            b8 b8Var4 = em6Var.y;
                            boolean z7 = !z6;
                            em6Var.F = z7;
                            b8Var4.setChecked(z7);
                            dm6 dm6Var3 = em6Var.S;
                            boolean z8 = em6Var.E;
                            boolean z9 = em6Var.F;
                            oha ohaVar2 = dm6Var3.f0;
                            if (ohaVar2 != null && (u5bVar4 = ohaVar2.s) != null) {
                                u5bVar4.n = z8;
                                u5bVar4.o = z9;
                                u5bVar4.d(true);
                            }
                            aga agaVar2 = dm6Var3.h0;
                            if (agaVar2 != null && (u5bVar3 = agaVar2.s) != null) {
                                u5bVar3.n = z8;
                                u5bVar3.o = z9;
                                u5bVar3.d(true);
                                return;
                            }
                            return;
                        default:
                            em6 em6Var2 = this.b;
                            svc svcVar = em6Var2.R;
                            if (svcVar != null) {
                                svcVar.run();
                                em6Var2.R = null;
                            }
                            v21.e();
                            if (em6Var2.S.getClosestTab() == 9) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (em6Var2.w != null) {
                                i3 = 0;
                                for (int i6 = 0; i6 < em6Var2.w.size(); i6++) {
                                    TL_stories.StoryItem storyItem = ((r47) em6Var2.w.valueAt(i6)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i3++;
                                    }
                                }
                            } else {
                                i3 = 0;
                            }
                            em6Var2.S.E(false);
                            if (z) {
                                em6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i7);
                                    zArr[i7] = storyItem2.pinned;
                                    storyItem2.pinned = z;
                                }
                                em6Var2.getMessagesController().O1().q0(em6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                em6Var2.R = new svc(em6Var2, arrayList, z, (byte) 1);
                                g65 g65Var = new g65(em6Var2, zArr2, arrayList, zArr, (byte) 22);
                                if (z) {
                                    j = d31.b0(em6Var2).L(2131623990, ob6.G(i3, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743542, null), g65Var).j();
                                } else {
                                    j = d31.b0(em6Var2).J(2131623980, ob6.G(i3, "StoryArchived", new Object[0]), ob6.M0(2131743542, null), 5000, false, g65Var).j();
                                }
                                j.w = new z56(em6Var2, zArr2, (byte) 28);
                                return;
                            }
                            return;
                    }
                }
            });
            b8 e2 = this.s.e(9, 2131232444, ob6.M0(2131748403, null));
            this.J = e2;
            e2.setOnClickListener(new View.OnClickListener(this) {
                public final em6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    u5b u5bVar;
                    u5b u5bVar2;
                    u5b u5bVar3;
                    u5b u5bVar4;
                    boolean z;
                    int i3;
                    v21 j;
                    byte b = r2;
                    yw0 yw0Var = yw0.APP_ERROR;
                    em6 em6Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean O1 = em6Var.S.O1(null, null);
                            if (O1 != null) {
                                em6Var.g0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = em6Var.S.P1(null, null);
                            if (P1 != null) {
                                em6Var.g0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z2 = em6Var.E;
                            if (z2 && !em6Var.F) {
                                yw0Var.a();
                                b8 b8Var = em6Var.x;
                                int i4 = -em6Var.G;
                                em6Var.G = i4;
                                hl.A3(i4, b8Var, null);
                                return;
                            }
                            b8 b8Var2 = em6Var.x;
                            boolean z3 = !z2;
                            em6Var.E = z3;
                            b8Var2.setChecked(z3);
                            dm6 dm6Var2 = em6Var.S;
                            boolean z4 = em6Var.E;
                            boolean z5 = em6Var.F;
                            oha ohaVar = dm6Var2.f0;
                            if (ohaVar != null && (u5bVar2 = ohaVar.s) != null) {
                                u5bVar2.n = z4;
                                u5bVar2.o = z5;
                                u5bVar2.d(true);
                            }
                            aga agaVar = dm6Var2.h0;
                            if (agaVar != null && (u5bVar = agaVar.s) != null) {
                                u5bVar.n = z4;
                                u5bVar.o = z5;
                                u5bVar.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z6 = em6Var.F;
                            if (z6 && !em6Var.E) {
                                yw0Var.a();
                                b8 b8Var3 = em6Var.y;
                                int i5 = -em6Var.G;
                                em6Var.G = i5;
                                hl.A3(i5, b8Var3, null);
                                return;
                            }
                            b8 b8Var4 = em6Var.y;
                            boolean z7 = !z6;
                            em6Var.F = z7;
                            b8Var4.setChecked(z7);
                            dm6 dm6Var3 = em6Var.S;
                            boolean z8 = em6Var.E;
                            boolean z9 = em6Var.F;
                            oha ohaVar2 = dm6Var3.f0;
                            if (ohaVar2 != null && (u5bVar4 = ohaVar2.s) != null) {
                                u5bVar4.n = z8;
                                u5bVar4.o = z9;
                                u5bVar4.d(true);
                            }
                            aga agaVar2 = dm6Var3.h0;
                            if (agaVar2 != null && (u5bVar3 = agaVar2.s) != null) {
                                u5bVar3.n = z8;
                                u5bVar3.o = z9;
                                u5bVar3.d(true);
                                return;
                            }
                            return;
                        default:
                            em6 em6Var2 = this.b;
                            svc svcVar = em6Var2.R;
                            if (svcVar != null) {
                                svcVar.run();
                                em6Var2.R = null;
                            }
                            v21.e();
                            if (em6Var2.S.getClosestTab() == 9) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (em6Var2.w != null) {
                                i3 = 0;
                                for (int i6 = 0; i6 < em6Var2.w.size(); i6++) {
                                    TL_stories.StoryItem storyItem = ((r47) em6Var2.w.valueAt(i6)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i3++;
                                    }
                                }
                            } else {
                                i3 = 0;
                            }
                            em6Var2.S.E(false);
                            if (z) {
                                em6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i7);
                                    zArr[i7] = storyItem2.pinned;
                                    storyItem2.pinned = z;
                                }
                                em6Var2.getMessagesController().O1().q0(em6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                em6Var2.R = new svc(em6Var2, arrayList, z, (byte) 1);
                                g65 g65Var = new g65(em6Var2, zArr2, arrayList, zArr, (byte) 22);
                                if (z) {
                                    j = d31.b0(em6Var2).L(2131623990, ob6.G(i3, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743542, null), g65Var).j();
                                } else {
                                    j = d31.b0(em6Var2).J(2131623980, ob6.G(i3, "StoryArchived", new Object[0]), ob6.M0(2131743542, null), 5000, false, g65Var).j();
                                }
                                j.w = new z56(em6Var2, zArr2, (byte) 28);
                                return;
                            }
                            return;
                    }
                }
            });
            b8 e3 = this.s.e(10, 2131232082, ob6.M0(2131752623, null));
            this.H = e3;
            e3.setEnabled(false);
            this.H.setAlpha(0.5f);
            this.s.a(-1);
            sla slaVar = this.s;
            b8 d = slaVar.d(6, 0, null, ob6.M0(2131748407, null), true, true, slaVar.n0);
            this.x = d;
            d.setChecked(this.E);
            this.x.setOnClickListener(new View.OnClickListener(this) {
                public final em6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    u5b u5bVar;
                    u5b u5bVar2;
                    u5b u5bVar3;
                    u5b u5bVar4;
                    boolean z;
                    int i3;
                    v21 j;
                    byte b = r2;
                    yw0 yw0Var = yw0.APP_ERROR;
                    em6 em6Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean O1 = em6Var.S.O1(null, null);
                            if (O1 != null) {
                                em6Var.g0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = em6Var.S.P1(null, null);
                            if (P1 != null) {
                                em6Var.g0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z2 = em6Var.E;
                            if (z2 && !em6Var.F) {
                                yw0Var.a();
                                b8 b8Var = em6Var.x;
                                int i4 = -em6Var.G;
                                em6Var.G = i4;
                                hl.A3(i4, b8Var, null);
                                return;
                            }
                            b8 b8Var2 = em6Var.x;
                            boolean z3 = !z2;
                            em6Var.E = z3;
                            b8Var2.setChecked(z3);
                            dm6 dm6Var2 = em6Var.S;
                            boolean z4 = em6Var.E;
                            boolean z5 = em6Var.F;
                            oha ohaVar = dm6Var2.f0;
                            if (ohaVar != null && (u5bVar2 = ohaVar.s) != null) {
                                u5bVar2.n = z4;
                                u5bVar2.o = z5;
                                u5bVar2.d(true);
                            }
                            aga agaVar = dm6Var2.h0;
                            if (agaVar != null && (u5bVar = agaVar.s) != null) {
                                u5bVar.n = z4;
                                u5bVar.o = z5;
                                u5bVar.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z6 = em6Var.F;
                            if (z6 && !em6Var.E) {
                                yw0Var.a();
                                b8 b8Var3 = em6Var.y;
                                int i5 = -em6Var.G;
                                em6Var.G = i5;
                                hl.A3(i5, b8Var3, null);
                                return;
                            }
                            b8 b8Var4 = em6Var.y;
                            boolean z7 = !z6;
                            em6Var.F = z7;
                            b8Var4.setChecked(z7);
                            dm6 dm6Var3 = em6Var.S;
                            boolean z8 = em6Var.E;
                            boolean z9 = em6Var.F;
                            oha ohaVar2 = dm6Var3.f0;
                            if (ohaVar2 != null && (u5bVar4 = ohaVar2.s) != null) {
                                u5bVar4.n = z8;
                                u5bVar4.o = z9;
                                u5bVar4.d(true);
                            }
                            aga agaVar2 = dm6Var3.h0;
                            if (agaVar2 != null && (u5bVar3 = agaVar2.s) != null) {
                                u5bVar3.n = z8;
                                u5bVar3.o = z9;
                                u5bVar3.d(true);
                                return;
                            }
                            return;
                        default:
                            em6 em6Var2 = this.b;
                            svc svcVar = em6Var2.R;
                            if (svcVar != null) {
                                svcVar.run();
                                em6Var2.R = null;
                            }
                            v21.e();
                            if (em6Var2.S.getClosestTab() == 9) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (em6Var2.w != null) {
                                i3 = 0;
                                for (int i6 = 0; i6 < em6Var2.w.size(); i6++) {
                                    TL_stories.StoryItem storyItem = ((r47) em6Var2.w.valueAt(i6)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i3++;
                                    }
                                }
                            } else {
                                i3 = 0;
                            }
                            em6Var2.S.E(false);
                            if (z) {
                                em6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i7);
                                    zArr[i7] = storyItem2.pinned;
                                    storyItem2.pinned = z;
                                }
                                em6Var2.getMessagesController().O1().q0(em6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                em6Var2.R = new svc(em6Var2, arrayList, z, (byte) 1);
                                g65 g65Var = new g65(em6Var2, zArr2, arrayList, zArr, (byte) 22);
                                if (z) {
                                    j = d31.b0(em6Var2).L(2131623990, ob6.G(i3, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743542, null), g65Var).j();
                                } else {
                                    j = d31.b0(em6Var2).J(2131623980, ob6.G(i3, "StoryArchived", new Object[0]), ob6.M0(2131743542, null), 5000, false, g65Var).j();
                                }
                                j.w = new z56(em6Var2, zArr2, (byte) 28);
                                return;
                            }
                            return;
                    }
                }
            });
            sla slaVar2 = this.s;
            b8 d2 = slaVar2.d(7, 0, null, ob6.M0(2131748406, null), true, true, slaVar2.n0);
            this.y = d2;
            d2.setChecked(this.F);
            this.y.setOnClickListener(new View.OnClickListener(this) {
                public final em6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    u5b u5bVar;
                    u5b u5bVar2;
                    u5b u5bVar3;
                    u5b u5bVar4;
                    boolean z;
                    int i3;
                    v21 j;
                    byte b = r2;
                    yw0 yw0Var = yw0.APP_ERROR;
                    em6 em6Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean O1 = em6Var.S.O1(null, null);
                            if (O1 != null) {
                                em6Var.g0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = em6Var.S.P1(null, null);
                            if (P1 != null) {
                                em6Var.g0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z2 = em6Var.E;
                            if (z2 && !em6Var.F) {
                                yw0Var.a();
                                b8 b8Var = em6Var.x;
                                int i4 = -em6Var.G;
                                em6Var.G = i4;
                                hl.A3(i4, b8Var, null);
                                return;
                            }
                            b8 b8Var2 = em6Var.x;
                            boolean z3 = !z2;
                            em6Var.E = z3;
                            b8Var2.setChecked(z3);
                            dm6 dm6Var2 = em6Var.S;
                            boolean z4 = em6Var.E;
                            boolean z5 = em6Var.F;
                            oha ohaVar = dm6Var2.f0;
                            if (ohaVar != null && (u5bVar2 = ohaVar.s) != null) {
                                u5bVar2.n = z4;
                                u5bVar2.o = z5;
                                u5bVar2.d(true);
                            }
                            aga agaVar = dm6Var2.h0;
                            if (agaVar != null && (u5bVar = agaVar.s) != null) {
                                u5bVar.n = z4;
                                u5bVar.o = z5;
                                u5bVar.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z6 = em6Var.F;
                            if (z6 && !em6Var.E) {
                                yw0Var.a();
                                b8 b8Var3 = em6Var.y;
                                int i5 = -em6Var.G;
                                em6Var.G = i5;
                                hl.A3(i5, b8Var3, null);
                                return;
                            }
                            b8 b8Var4 = em6Var.y;
                            boolean z7 = !z6;
                            em6Var.F = z7;
                            b8Var4.setChecked(z7);
                            dm6 dm6Var3 = em6Var.S;
                            boolean z8 = em6Var.E;
                            boolean z9 = em6Var.F;
                            oha ohaVar2 = dm6Var3.f0;
                            if (ohaVar2 != null && (u5bVar4 = ohaVar2.s) != null) {
                                u5bVar4.n = z8;
                                u5bVar4.o = z9;
                                u5bVar4.d(true);
                            }
                            aga agaVar2 = dm6Var3.h0;
                            if (agaVar2 != null && (u5bVar3 = agaVar2.s) != null) {
                                u5bVar3.n = z8;
                                u5bVar3.o = z9;
                                u5bVar3.d(true);
                                return;
                            }
                            return;
                        default:
                            em6 em6Var2 = this.b;
                            svc svcVar = em6Var2.R;
                            if (svcVar != null) {
                                svcVar.run();
                                em6Var2.R = null;
                            }
                            v21.e();
                            if (em6Var2.S.getClosestTab() == 9) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (em6Var2.w != null) {
                                i3 = 0;
                                for (int i6 = 0; i6 < em6Var2.w.size(); i6++) {
                                    TL_stories.StoryItem storyItem = ((r47) em6Var2.w.valueAt(i6)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i3++;
                                    }
                                }
                            } else {
                                i3 = 0;
                            }
                            em6Var2.S.E(false);
                            if (z) {
                                em6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i7);
                                    zArr[i7] = storyItem2.pinned;
                                    storyItem2.pinned = z;
                                }
                                em6Var2.getMessagesController().O1().q0(em6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                em6Var2.R = new svc(em6Var2, arrayList, z, (byte) 1);
                                g65 g65Var = new g65(em6Var2, zArr2, arrayList, zArr, (byte) 22);
                                if (z) {
                                    j = d31.b0(em6Var2).L(2131623990, ob6.G(i3, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743542, null), g65Var).j();
                                } else {
                                    j = d31.b0(em6Var2).J(2131623980, ob6.G(i3, "StoryArchived", new Object[0]), ob6.M0(2131743542, null), 5000, false, g65Var).j();
                                }
                                j.w = new z56(em6Var2, zArr2, (byte) 28);
                                return;
                            }
                            return;
                    }
                }
            });
        }
        int i3 = this.a;
        uz4[] uz4VarArr = this.L;
        if (i3 == 1) {
            hj6 hj6Var = new hj6(context, getResourceProvider());
            this.K = hj6Var;
            hj6Var.setClipChildren(false);
            this.K.setPadding(hl.L(12.0f), hl.L(12.0f), hl.L(12.0f), hl.L(12.0f));
            uz4VarArr[0] = uz4.c(context, getResourceProvider(), tz4.S, 2131746378);
            uz4VarArr[1] = uz4.c(context, getResourceProvider(), tz4.T, 2131746354);
            for (int i4 = 0; i4 < uz4VarArr.length; i4++) {
                uz4VarArr[i4].setOnClickListener(new w0(this, i4, (byte) 11));
                this.K.addView(uz4VarArr[i4]);
                this.K.j(uz4VarArr[i4], true, false);
            }
            eg0Var = baseSimpleGlass;
            jl0 c = eg0Var.c.c(this.K, dtd.g(getResourceProvider()), false);
            ik8.r(c, hl.L(28.0f), 7.666f);
            this.K.setBackground(c);
            d26Var.addView(this.K, tre.e(-2, 72, 81));
            FrameLayout frameLayout = new FrameLayout(context);
            this.N = frameLayout;
            frameLayout.setPadding(hl.L(16.0f), hl.L(8.0f), hl.L(16.0f), hl.L(8.0f));
            c51 c51Var = new c51(getResourceProvider(), context, true);
            this.O = c51Var;
            c51Var.i(ob6.M0(2131745637, null), false, true);
            this.O.setShowZero(true);
            this.O.c(0, false);
            this.O.setEnabled(false);
            this.O.setOnClickListener(new View.OnClickListener(this) {
                public final em6 b;

                {
                    this.b = this;
                }

                @Override
                public final void onClick(View view) {
                    u5b u5bVar;
                    u5b u5bVar2;
                    u5b u5bVar3;
                    u5b u5bVar4;
                    boolean z;
                    int i32;
                    v21 j;
                    byte b = r2;
                    yw0 yw0Var = yw0.APP_ERROR;
                    em6 em6Var = this.b;
                    switch (b) {
                        case 0:
                            Boolean O1 = em6Var.S.O1(null, null);
                            if (O1 != null) {
                                em6Var.g0(true, O1.booleanValue());
                                return;
                            }
                            return;
                        case 1:
                            Boolean P1 = em6Var.S.P1(null, null);
                            if (P1 != null) {
                                em6Var.g0(P1.booleanValue(), true);
                                return;
                            }
                            return;
                        case 2:
                            boolean z2 = em6Var.E;
                            if (z2 && !em6Var.F) {
                                yw0Var.a();
                                b8 b8Var = em6Var.x;
                                int i42 = -em6Var.G;
                                em6Var.G = i42;
                                hl.A3(i42, b8Var, null);
                                return;
                            }
                            b8 b8Var2 = em6Var.x;
                            boolean z3 = !z2;
                            em6Var.E = z3;
                            b8Var2.setChecked(z3);
                            dm6 dm6Var2 = em6Var.S;
                            boolean z4 = em6Var.E;
                            boolean z5 = em6Var.F;
                            oha ohaVar = dm6Var2.f0;
                            if (ohaVar != null && (u5bVar2 = ohaVar.s) != null) {
                                u5bVar2.n = z4;
                                u5bVar2.o = z5;
                                u5bVar2.d(true);
                            }
                            aga agaVar = dm6Var2.h0;
                            if (agaVar != null && (u5bVar = agaVar.s) != null) {
                                u5bVar.n = z4;
                                u5bVar.o = z5;
                                u5bVar.d(true);
                                return;
                            }
                            return;
                        case 3:
                            boolean z6 = em6Var.F;
                            if (z6 && !em6Var.E) {
                                yw0Var.a();
                                b8 b8Var3 = em6Var.y;
                                int i5 = -em6Var.G;
                                em6Var.G = i5;
                                hl.A3(i5, b8Var3, null);
                                return;
                            }
                            b8 b8Var4 = em6Var.y;
                            boolean z7 = !z6;
                            em6Var.F = z7;
                            b8Var4.setChecked(z7);
                            dm6 dm6Var3 = em6Var.S;
                            boolean z8 = em6Var.E;
                            boolean z9 = em6Var.F;
                            oha ohaVar2 = dm6Var3.f0;
                            if (ohaVar2 != null && (u5bVar4 = ohaVar2.s) != null) {
                                u5bVar4.n = z8;
                                u5bVar4.o = z9;
                                u5bVar4.d(true);
                            }
                            aga agaVar2 = dm6Var3.h0;
                            if (agaVar2 != null && (u5bVar3 = agaVar2.s) != null) {
                                u5bVar3.n = z8;
                                u5bVar3.o = z9;
                                u5bVar3.d(true);
                                return;
                            }
                            return;
                        default:
                            em6 em6Var2 = this.b;
                            svc svcVar = em6Var2.R;
                            if (svcVar != null) {
                                svcVar.run();
                                em6Var2.R = null;
                            }
                            v21.e();
                            if (em6Var2.S.getClosestTab() == 9) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ArrayList arrayList = new ArrayList();
                            if (em6Var2.w != null) {
                                i32 = 0;
                                for (int i6 = 0; i6 < em6Var2.w.size(); i6++) {
                                    TL_stories.StoryItem storyItem = ((r47) em6Var2.w.valueAt(i6)).l;
                                    if (storyItem != null) {
                                        arrayList.add(storyItem);
                                        i32++;
                                    }
                                }
                            } else {
                                i32 = 0;
                            }
                            em6Var2.S.E(false);
                            if (z) {
                                em6Var2.S.f1(8);
                            }
                            if (!arrayList.isEmpty()) {
                                boolean[] zArr = new boolean[arrayList.size()];
                                for (int i7 = 0; i7 < arrayList.size(); i7++) {
                                    TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) arrayList.get(i7);
                                    zArr[i7] = storyItem2.pinned;
                                    storyItem2.pinned = z;
                                }
                                em6Var2.getMessagesController().O1().q0(em6Var2.e, arrayList, false);
                                boolean[] zArr2 = {false};
                                em6Var2.R = new svc(em6Var2, arrayList, z, (byte) 1);
                                g65 g65Var = new g65(em6Var2, zArr2, arrayList, zArr, (byte) 22);
                                if (z) {
                                    j = d31.b0(em6Var2).L(2131623990, ob6.G(i32, "StorySavedTitle", new Object[0]), ob6.M0(2131744138, null), ob6.M0(2131743542, null), g65Var).j();
                                } else {
                                    j = d31.b0(em6Var2).J(2131623980, ob6.G(i32, "StoryArchived", new Object[0]), ob6.M0(2131743542, null), 5000, false, g65Var).j();
                                }
                                j.w = new z56(em6Var2, zArr2, (byte) 28);
                                return;
                            }
                            return;
                    }
                }
            });
            this.N.addView(this.O, tre.c(56.0f, -1));
            this.N.setVisibility(4);
            d26Var.addView(this.N, tre.e(-1, 72, 80));
            this.P = new fm0(0, new bm6(this, (byte) 0), k43.h, 320L, false);
            setBulletinDelegate(new t10(this, (byte) 12));
        } else {
            eg0Var = baseSimpleGlass;
        }
        View view = new View(context);
        this.Q = view;
        this.S.e(view);
        View view2 = this.Q;
        view2.setBackground(eg0Var.a(view2));
        View view3 = new View(context);
        this.navigationBarFadeView = view3;
        view3.setBackground(eg0Var.b(view3));
        View view4 = this.navigationBarFadeView;
        hj6 hj6Var2 = this.K;
        if (hj6Var2 != null) {
            childCount = d26Var.indexOfChild(hj6Var2);
        } else {
            childCount = d26Var.getChildCount();
        }
        d26Var.addView(view4, childCount, tre.e(-1, 0, 80));
        eg0Var.i(d26Var, this.simpleActionBar, getResourceProvider());
        eg0Var.o = new dg0(this, d26Var, (byte) 6);
        this.S.setPagesGlassEngine(this.glassEngine);
        this.simpleActionBar.setBackground(null);
        f0(false);
        if (this.a == 3 && (i = this.r) != -1) {
            this.simpleActionBar.setSubtitle(ob6.H(' ', "FoundStories", i));
        }
        a0();
        e0();
        if (this.a == 1) {
            if (this.T != 9) {
                i2 = 0;
            }
            hj6 hj6Var3 = this.K;
            if (hj6Var3 != null && this.M != i2) {
                this.M = i2;
                hj6Var3.r(uz4VarArr[i2], false);
            }
        }
        return d26Var;
    }

    public final void d0(String str) {
        this.simpleActionBar.setSubtitleAnimated(str);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.E0 && ((Long) objArr[0]).longValue() == this.e) {
            TLRPC.UserFull userFull = (TLRPC.UserFull) objArr[1];
            this.d = userFull;
            dm6 dm6Var = this.S;
            if (dm6Var != null) {
                dm6Var.setUserInfo(userFull);
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
        dm6 dm6Var = this.S;
        if (dm6Var != null && this.simpleActionBar != null) {
            int closestTab = dm6Var.getClosestTab();
            if (this.a != 3 || closestTab == 8) {
                int[] iArr = this.b.c;
                boolean z3 = ob6.a0;
                boolean z4 = true;
                if (closestTab != 8 && closestTab != 9) {
                    if (closestTab == 11) {
                        d0(ob6.G(getMessagesController().F1().c(), "SavedDialogsTabCount", new Object[0]));
                        return;
                    } else if (closestTab >= 0) {
                        if (closestTab >= iArr.length || iArr[closestTab] >= 0) {
                            if (closestTab == 0) {
                                if (this.S.getPhotosVideosTypeFilter() == 1) {
                                    d0(ob6.G(iArr[6], "Photos", new Object[0]));
                                    return;
                                } else if (this.S.getPhotosVideosTypeFilter() == 2) {
                                    d0(ob6.G(iArr[7], "Videos", new Object[0]));
                                    return;
                                } else {
                                    d0(ob6.G(iArr[0], "Media", new Object[0]));
                                    return;
                                }
                            } else if (closestTab == 1) {
                                d0(ob6.G(iArr[1], "Files", new Object[0]));
                                return;
                            } else if (closestTab == 2) {
                                d0(ob6.G(iArr[2], "Voice", new Object[0]));
                                return;
                            } else if (closestTab == 3) {
                                d0(ob6.G(iArr[3], "Links", new Object[0]));
                                return;
                            } else if (closestTab == 4) {
                                d0(ob6.G(iArr[4], "MusicFiles", new Object[0]));
                                return;
                            } else if (closestTab == 5) {
                                d0(ob6.G(iArr[5], "GIFs", new Object[0]));
                                return;
                            } else if (closestTab == 15 && (i = iArr[8]) >= 0) {
                                d0(ob6.G(i, "ProfilePollsCount", new Object[0]));
                                return;
                            } else if (closestTab == 10) {
                                wb7 L0 = uc7.s1(this.currentAccount).L0(this.e);
                                if (L0 == null) {
                                    size2 = 0;
                                } else {
                                    size2 = L0.b.size() + L0.c;
                                }
                                d0(ob6.G(size2, "Channels", new Object[0]));
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
                b8 b8Var = this.J;
                float f3 = 0.5f;
                if (b8Var != null) {
                    b8Var.setEnabled(this.S.t());
                    b8 b8Var2 = this.J;
                    if (b8Var2.isEnabled()) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.5f;
                    }
                    b8Var2.setAlpha(f2);
                }
                b8 b8Var3 = this.I;
                if (b8Var3 != null) {
                    b8Var3.setEnabled(this.S.s());
                    b8 b8Var4 = this.I;
                    if (b8Var4.isEnabled()) {
                        f = 1.0f;
                    } else {
                        f = 0.5f;
                    }
                    b8Var4.setAlpha(f);
                }
                int W = this.S.W(closestTab);
                if (this.a == 3) {
                    if (W > 0) {
                        d0(ob6.H(' ', "FoundStories", W));
                    }
                } else if (closestTab == 8) {
                    if (W > 0) {
                        str2 = ob6.G(W, "ProfileMyStoriesCount", new Object[0]);
                    } else {
                        str2 = null;
                    }
                    d0(str2);
                } else {
                    if (W > 0) {
                        str = ob6.G(W, "ProfileStoriesArchiveCount", new Object[0]);
                    } else {
                        str = null;
                    }
                    d0(str);
                }
                f0(true);
                sla slaVar = this.s;
                if (slaVar != null) {
                    if (W > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    slaVar.Y(z2, true);
                }
                c51 c51Var = this.O;
                if (c51Var != null) {
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
                        c51Var.i(ob6.G(size, "ArchiveStories", new Object[0]), z, true);
                    } else {
                        c51Var.i(ob6.M0(2131745637, null), z, true);
                    }
                    this.V = closestTab;
                }
                b8 b8Var5 = this.H;
                if (b8Var5 != null) {
                    if (W <= 0) {
                        z4 = false;
                    }
                    b8Var5.setEnabled(z4);
                    b8 b8Var6 = this.H;
                    if (z4) {
                        f3 = 1.0f;
                    }
                    b8Var6.setAlpha(f3);
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
            int i2 = 2131746361;
            if (i == 2) {
                str = ob6.M0(2131746361, null);
            } else if (i == 1) {
                dm6 dm6Var = this.S;
                if (dm6Var != null && dm6Var.getClosestTab() != 9) {
                    z2 = false;
                }
                if (!z2) {
                    i2 = 2131746382;
                }
                str = ob6.M0(i2, null);
            } else {
                if (this.f != 0 && this.e == getUserConfig().e()) {
                    j = this.f;
                } else {
                    j = this.e;
                }
                if (j == 2666000) {
                    str = ob6.M0(2131754245, null);
                } else if (this.f != 0 && j == getUserConfig().e()) {
                    str = ob6.M0(2131748057, null);
                } else if (wf3.B(j)) {
                    TLRPC.EncryptedChat a1 = getMessagesController().a1(Integer.valueOf((int) (j & 4294967295L)));
                    if (a1 != null) {
                        user = getMessagesController().X1(Long.valueOf(a1.user_id));
                    } else {
                        user = null;
                    }
                    if (user != null) {
                        str = lv2.m(0, user.first_name, user.last_name);
                    }
                    str = null;
                } else if (wf3.D(j)) {
                    TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j));
                    if (X1 != null) {
                        if (X1.self) {
                            str = ob6.M0(2131745629, null);
                        } else {
                            str = lv2.m(0, X1.first_name, X1.last_name);
                        }
                    }
                    str = null;
                } else {
                    TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j));
                    if (M0 != null) {
                        str = M0.title;
                    }
                    str = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = ob6.M0(2131745143, null);
                }
            }
        }
        String str2 = str;
        boolean z3 = z2;
        if (TextUtils.equals(this.U, str2)) {
            return;
        }
        this.U = str2;
        jla jlaVar = this.simpleActionBar;
        if (z) {
            jlaVar.getClass();
            jlaVar.K(str2, z3, 320L, k43.h);
            return;
        }
        jlaVar.setTitle(str2);
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
        dm6 dm6Var = this.S;
        if (dm6Var.getSelectedTab() != dm6Var.L0.getFirstTabId()) {
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
            dm6 dm6Var = this.S;
            if (dm6Var.F1) {
                if (z) {
                    dm6Var.E(false);
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
        getNotificationCenter().b(this, jn7.E0);
        getNotificationCenter().b(this, jn7.i5);
        getNotificationCenter().b(this, jn7.b3);
        if (wf3.D(this.e) && this.f == 0) {
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(this.e));
            if (lbc.D(X1)) {
                getMessagesController().o3(this.classGuid, X1, false);
                this.d = getMessagesController().Y1(this.e);
            }
        }
        wia wiaVar = this.b;
        if (wiaVar == null) {
            wiaVar = new wia(this);
            this.b = wiaVar;
        }
        wiaVar.y.add(this);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        getNotificationCenter().n(this, jn7.E0);
        getNotificationCenter().n(this, jn7.i5);
        getNotificationCenter().n(this, jn7.b3);
        svc svcVar = this.R;
        if (svcVar != null) {
            this.R = null;
            hl.c3(svcVar);
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
