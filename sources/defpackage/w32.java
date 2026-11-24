package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class w32 extends a22 implements vlb, jm7, g94 {
    public boolean E;
    public final q32 F;
    public final s32 G;
    public final r34 H;
    public final h22 I;
    public final e22 J;
    public n32 K;
    public boolean L;
    public final fn0 n;
    public final FrameLayout r;
    public final fv s;
    public final l32 w;
    public final HashMap x;
    public final ArrayList y;

    public w32(i22 i22Var, ylb ylbVar, Context context) {
        super(i22Var, ylbVar, context);
        this.n = new fn0(0, this, d53.h, 380L, false);
        this.x = new HashMap();
        this.y = new ArrayList();
        this.E = false;
        this.G = new s32(this, context);
        h22 h22Var = new h22(cmb.c6, ylbVar, context);
        this.I = h22Var;
        h22Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        e22 e22Var = new e22(this.b, ylbVar, context);
        this.J = e22Var;
        e22Var.setPadding(gm.L(4.0f), gm.L(4.0f), gm.L(4.0f), gm.L(4.0f));
        String M0 = jb6.M0(2131745501, null);
        l7 l7Var = e22Var.r;
        l7Var.setHint(M0);
        l7Var.addTextChangedListener(new b7(this, (byte) 9));
        frameLayout.addView(h22Var, qoe.g());
        FrameLayout.LayoutParams d = qoe.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += gm.m;
        frameLayout.addView(e22Var, d);
        r34 r34Var = new r34(context, ylbVar);
        this.H = r34Var;
        r34Var.c();
        r34Var.setText(jb6.M0(2131747957, null));
        addView(r34Var, qoe.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        fv fvVar = new fv(this, context, ylbVar, (byte) 8);
        this.s = fvVar;
        setBlur3Capture(fvVar);
        this.d = fvVar;
        this.h = true;
        this.f = true;
        fvVar.r1();
        fvVar.setClipToPadding(false);
        getContext();
        l32 l32Var = new l32(this, gm.L(9.0f), fvVar, (byte) 0);
        this.w = l32Var;
        fvVar.setLayoutManager(l32Var);
        l32Var.P = false;
        fvVar.setHorizontalScrollBarEnabled(false);
        fvVar.setVerticalScrollBarEnabled(false);
        fvVar.setClipToPadding(false);
        addView(fvVar, qoe.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        q32 q32Var = new q32(this, context);
        this.F = q32Var;
        fvVar.setAdapter(q32Var);
        anb.l(fvVar, 21, cmb.z5, ylbVar);
        fvVar.setOnItemClickListener(new k0(this, ylbVar, (byte) 9));
        fvVar.setOnScrollListener(new y(this, (byte) 19));
        fvVar.setOnItemLongClickListener(new i32(this));
        FrameLayout.LayoutParams e = qoe.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += gm.m;
        addView(frameLayout, e);
        nm7.f(this.b.G3).b(this, nm7.N);
        R();
    }

    public int getCurrentTop() {
        fv fvVar = this.s;
        if (fvVar.getChildCount() != 0) {
            int i = 0;
            View childAt = fvVar.getChildAt(0);
            b59 b59Var = (b59) fvVar.G(childAt);
            if (b59Var != null) {
                int paddingTop = fvVar.getPaddingTop();
                if (b59Var.b() == 0 && childAt.getTop() >= 0) {
                    i = childAt.getTop();
                }
                return paddingTop - i;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void B(int i, int i2) {
        int i3;
        i22 i22Var = this.b;
        if (i22Var.o3.Q() > gm.L(20.0f)) {
            i3 = gm.L(8.0f);
            i22Var.r0 = false;
        } else {
            if (!gm.O1()) {
                Point point = gm.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    i22Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            i22Var.r0 = true;
        }
        this.s.q1(0, i3 + gm.m, 0, this.e);
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        int i2;
        if (i == 0) {
            h22 h22Var = this.I;
            h22Var.setAlpha(f);
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            h22Var.setVisibility(i2);
        }
    }

    @Override
    public final void H(a22 a22Var) {
        this.w.g1(0, 0);
    }

    @Override
    public final void J() {
        this.s.z0(0);
    }

    @Override
    public final boolean K(final boolean z, final int i, int i2, final long j, final boolean z2) {
        HashMap hashMap = this.x;
        int i3 = 0;
        if ((hashMap.size() == 0 && this.K == null) || this.E) {
            return false;
        }
        this.E = true;
        final ArrayList arrayList = new ArrayList(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            arrayList.add(Q(hashMap.get((m32) obj)));
        }
        i22 i22Var = this.b;
        return ik.Y(i22Var.G3, i22Var.V0(), i22Var.R0() + arrayList.size(), new qac() {
            @Override
            public final void a(Object obj2) {
                w32 w32Var = w32.this;
                n32 n32Var = w32Var.K;
                i22 i22Var2 = w32Var.b;
                String obj3 = i22Var2.U0().getText().toString();
                ((Long) obj2).getClass();
                n32Var.a(arrayList, obj3, z, i, j, z2);
                i22Var2.dismiss();
            }
        }, 0L);
    }

    public final void P(v32 v32Var, Object obj) {
        boolean z;
        HashMap hashMap = this.x;
        if (hashMap.isEmpty() && !this.L) {
            String a0 = jb6.a0("AttachContactsSlowMode", null, 2131753943, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
            String M0 = jb6.M0(2131689472, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = a0;
            b10.t(null, 2131747564, alertDialog$Builder, null);
            return;
        }
        m32 a = m32.a(obj);
        boolean containsKey = hashMap.containsKey(a);
        ArrayList arrayList = this.y;
        int i = 1;
        if (containsKey) {
            hashMap.remove(a);
            arrayList.remove(a);
            z = false;
        } else {
            hashMap.put(a, obj);
            arrayList.add(a);
            z = true;
        }
        jh2 jh2Var = v32Var.d;
        if (jh2Var.getVisibility() != 0) {
            jh2Var.setVisibility(0);
        }
        jh2Var.a(z, true);
        if (!z) {
            i = 2;
        }
        this.b.F1(i);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 Q(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w32.Q(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
    }

    public final void R() {
        boolean z;
        int i = 0;
        if (this.s.getAdapter().b() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        this.H.setVisibility(i);
        S();
    }

    public final void S() {
        View childAt;
        r34 r34Var = this.H;
        if (r34Var.getVisibility() != 0 || (childAt = this.s.getChildAt(0)) == null) {
            return;
        }
        r34Var.setTranslationY((childAt.getTop() + (r34Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.T7));
        hashSet.add(Integer.valueOf(cmb.S7));
        hashSet.add(Integer.valueOf(cmb.R7));
        hashSet.add(Integer.valueOf(cmb.Q7));
        hashSet.add(Integer.valueOf(cmb.P7));
        hashSet.add(Integer.valueOf(cmb.O7));
        hashSet.add(Integer.valueOf(cmb.N7));
        hashSet.add(Integer.valueOf(cmb.I7));
        hashSet.add(Integer.valueOf(cmb.p5));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        q32 q32Var;
        if (i == nm7.N && (q32Var = this.F) != null) {
            q32Var.f();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i;
        fv fvVar = this.s;
        if (fvVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = fvVar.getChildAt(0);
        b59 b59Var = (b59) fvVar.G(childAt);
        int top = (childAt.getTop() - gm.m) - gm.L(8.0f);
        if (top > 0 && b59Var != null && b59Var.b() == 0) {
            i = top;
        } else {
            i = 0;
        }
        fn0 fn0Var = this.n;
        if (top >= 0 && b59Var != null && b59Var.b() == 0) {
            fn0Var.a(false, true);
        } else {
            fn0Var.a(true, true);
            top = i;
        }
        this.r.setTranslationY(top);
        return gm.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return gm.L(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.s.getPaddingTop();
    }

    public ArrayList<TLRPC.User> getSelected() {
        HashMap hashMap = this.x;
        ArrayList<TLRPC.User> arrayList = new ArrayList<>(hashMap.size());
        ArrayList arrayList2 = this.y;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(Q(hashMap.get((m32) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.x.size();
    }

    @Override
    public ArrayList<cnb> getThemeDescriptions() {
        ArrayList<cnb> arrayList = new ArrayList<>();
        arrayList.add(new cnb(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.b7));
        arrayList.add(new cnb(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.g6));
        int i = cmb.p5;
        arrayList.add(new cnb(this.s, 0, new Class[]{v32.class}, new String[]{"nameTextView"}, (Drawable[]) null, (bnb) null, i));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S();
    }

    @Override
    public final void p() {
        nm7.f(this.b.G3).n(this, nm7.N);
    }

    public void setDelegate(n32 n32Var) {
        this.K = n32Var;
    }

    public void setMultipleSelectionAllowed(boolean z) {
        this.L = z;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(km0 km0Var) {
        e22 e22Var = this.J;
        if (e22Var != null) {
            e22Var.setupBlurredBackground(km0Var.c(e22Var, qqd.a(this.a), false));
        }
    }

    @Override
    public final void updateColors() {
        try {
            e22 e22Var = this.J;
            if (e22Var != null) {
                e22Var.updateColors();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void V(float f, int i) {
    }
}
