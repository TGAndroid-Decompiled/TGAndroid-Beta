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
public final class b32 extends f12 implements snb, fn7, s84 {
    public boolean E;
    public final v22 F;
    public final x22 G;
    public final b34 H;
    public final m12 I;
    public final j12 J;
    public s22 K;
    public boolean L;
    public final fm0 n;
    public final FrameLayout r;
    public final gu s;
    public final q22 w;
    public final HashMap x;
    public final ArrayList y;

    public b32(n12 n12Var, vnb vnbVar, Context context) {
        super(n12Var, vnbVar, context);
        this.n = new fm0(0, this, k43.h, 380L, false);
        this.x = new HashMap();
        this.y = new ArrayList();
        this.E = false;
        this.G = new x22(this, context);
        m12 m12Var = new m12(aob.d6, vnbVar, context);
        this.I = m12Var;
        m12Var.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        j12 j12Var = new j12(this.b, vnbVar, context);
        this.J = j12Var;
        j12Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
        String M0 = ob6.M0(2131745495, null);
        m7 m7Var = j12Var.r;
        m7Var.setHint(M0);
        m7Var.addTextChangedListener(new c7(this, (byte) 8));
        frameLayout.addView(m12Var, tre.g());
        FrameLayout.LayoutParams d = tre.d(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) d).topMargin += hl.m;
        frameLayout.addView(j12Var, d);
        b34 b34Var = new b34(context, vnbVar);
        this.H = b34Var;
        b34Var.c();
        b34Var.setText(ob6.M0(2131747954, null));
        addView(b34Var, tre.d(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        gu guVar = new gu(this, context, vnbVar, (byte) 8);
        this.s = guVar;
        setBlur3Capture(guVar);
        this.d = guVar;
        this.h = true;
        this.f = true;
        guVar.s1();
        guVar.setClipToPadding(false);
        getContext();
        q22 q22Var = new q22(this, hl.L(9.0f), guVar, (byte) 0);
        this.w = q22Var;
        guVar.setLayoutManager(q22Var);
        q22Var.P = false;
        guVar.setHorizontalScrollBarEnabled(false);
        guVar.setVerticalScrollBarEnabled(false);
        guVar.setClipToPadding(false);
        addView(guVar, tre.d(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        v22 v22Var = new v22(this, context);
        this.F = v22Var;
        guVar.setAdapter(v22Var);
        yob.l(guVar, 21, aob.A5, vnbVar);
        guVar.setOnItemClickListener(new l0(this, vnbVar, (byte) 9));
        guVar.setOnScrollListener(new y(this, (byte) 18));
        guVar.setOnItemLongClickListener(new n22(this));
        FrameLayout.LayoutParams e = tre.e(-1, 60, 51);
        ((ViewGroup.MarginLayoutParams) e).height += hl.m;
        addView(frameLayout, e);
        jn7.f(this.b.G3).b(this, jn7.N);
        R();
    }

    public int getCurrentTop() {
        gu guVar = this.s;
        if (guVar.getChildCount() != 0) {
            int i = 0;
            View childAt = guVar.getChildAt(0);
            n69 n69Var = (n69) guVar.H(childAt);
            if (n69Var != null) {
                int paddingTop = guVar.getPaddingTop();
                if (n69Var.b() == 0 && childAt.getTop() >= 0) {
                    i = childAt.getTop();
                }
                return paddingTop - i;
            }
            return -1000;
        }
        return -1000;
    }

    @Override
    public final void C(int i, int i2) {
        int i3;
        n12 n12Var = this.b;
        if (n12Var.o3.Q() > hl.L(20.0f)) {
            i3 = hl.L(8.0f);
            n12Var.r0 = false;
        } else {
            if (!hl.O1()) {
                Point point = hl.q;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    n12Var.r0 = true;
                }
            }
            i3 = (i2 / 5) << 1;
            n12Var.r0 = true;
        }
        this.s.r1(0, i3 + hl.m, 0, this.e);
    }

    @Override
    public final void H(f12 f12Var) {
        this.w.g1(0, 0);
    }

    @Override
    public final void J() {
        this.s.A0(0);
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
            arrayList.add(Q(hashMap.get((r22) obj)));
        }
        n12 n12Var = this.b;
        return jj.Y(n12Var.G3, n12Var.W0(), n12Var.S0() + arrayList.size(), new pcc() {
            @Override
            public final void a(Object obj2) {
                b32 b32Var = b32.this;
                s22 s22Var = b32Var.K;
                n12 n12Var2 = b32Var.b;
                String obj3 = n12Var2.V0().getText().toString();
                ((Long) obj2).getClass();
                s22Var.a(arrayList, obj3, z, i, j, z2);
                n12Var2.dismiss();
            }
        }, 0L);
    }

    public final void P(a32 a32Var, Object obj) {
        boolean z;
        HashMap hashMap = this.x;
        if (hashMap.isEmpty() && !this.L) {
            String a0 = ob6.a0("AttachContactsSlowMode", null, 2131753971, new Object[0]);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.a, getContext());
            String M0 = ob6.M0(2131689472, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = a0;
            c00.u(null, 2131747558, alertDialog$Builder, null);
            return;
        }
        r22 a = r22.a(obj);
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
        og2 og2Var = a32Var.d;
        if (og2Var.getVisibility() != 0) {
            og2Var.setVisibility(0);
        }
        og2Var.a(z, true);
        if (!z) {
            i = 2;
        }
        this.b.G1(i);
    }

    public final org.telegram.tgnet.TLRPC.TL_userContact_old2 Q(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b32.Q(java.lang.Object):org.telegram.tgnet.TLRPC$TL_userContact_old2");
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
        b34 b34Var = this.H;
        if (b34Var.getVisibility() != 0 || (childAt = this.s.getChildAt(0)) == null) {
            return;
        }
        b34Var.setTranslationY((childAt.getTop() + (b34Var.getMeasuredHeight() - getMeasuredHeight())) / 2);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.q5));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        v22 v22Var;
        if (i == jn7.N && (v22Var = this.F) != null) {
            v22Var.f();
        }
    }

    @Override
    public int getCurrentItemTop() {
        int i;
        gu guVar = this.s;
        if (guVar.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        View childAt = guVar.getChildAt(0);
        n69 n69Var = (n69) guVar.H(childAt);
        int top = (childAt.getTop() - hl.m) - hl.L(8.0f);
        if (top > 0 && n69Var != null && n69Var.b() == 0) {
            i = top;
        } else {
            i = 0;
        }
        fm0 fm0Var = this.n;
        if (top >= 0 && n69Var != null && n69Var.b() == 0) {
            fm0Var.a(false, true);
        } else {
            fm0Var.a(true, true);
            top = i;
        }
        this.r.setTranslationY(top);
        return hl.L(12.0f) + top;
    }

    @Override
    public int getFirstOffset() {
        return hl.L(4.0f) + getListTopPadding();
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
            arrayList.add(Q(hashMap.get((r22) obj)));
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.x.size();
    }

    @Override
    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        arrayList.add(new apb(this.H, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.c7));
        arrayList.add(new apb(this.H, 2048, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.h6));
        int i = aob.q5;
        arrayList.add(new apb(this.s, 0, new Class[]{a32.class}, new String[]{"nameTextView"}, (Drawable[]) null, (zob) null, i));
        return arrayList;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        S();
    }

    @Override
    public final void p() {
        jn7.f(this.b.G3).n(this, jn7.N);
    }

    public void setDelegate(s22 s22Var) {
        this.K = s22Var;
    }

    public void setMultipleSelectionAllowed(boolean z) {
        this.L = z;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.b.b.invalidate();
    }

    public void setupBlurredSearchField(ll0 ll0Var) {
        j12 j12Var = this.J;
        if (j12Var != null) {
            j12Var.setupBlurredBackground(ll0Var.c(j12Var, dtd.a(this.a), false));
        }
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        int i2;
        if (i == 0) {
            m12 m12Var = this.I;
            m12Var.setAlpha(f);
            if (f > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            m12Var.setVisibility(i2);
        }
    }

    @Override
    public final void updateColors() {
        try {
            j12 j12Var = this.J;
            if (j12Var != null) {
                j12Var.updateColors();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void v0(float f, int i) {
    }
}
