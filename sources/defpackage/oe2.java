package defpackage;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.WallpapersListActivity;
public final class oe2 extends nx0 implements fn7 {
    public static final int f2 = 0;
    public final je2 A1;
    public final View B1;
    public final in C1;
    public final in D1;
    public final TextView E1;
    public ne2 F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public tqb K1;
    public float L1;
    public ValueAnimator M1;
    public lg5 N1;
    public boolean O1;
    public ez3 P1;
    public e Q1;
    public n12 R1;
    public tt S1;
    public in T1;
    public boolean U1;
    public wm2 V1;
    public boolean W1;
    public boolean X1;
    public TL_stories.TL_premium_boostsStatus Y1;
    public float Z1;
    public ValueAnimator a2;
    public boolean b2;
    public boolean c2;
    public int d2;
    public int e2;
    public final ImageView l1;
    public final gd0 m1;
    public final TextView n1;
    public final TextView o1;
    public TLRPC.WallPaper p1;
    public final me2 q1;
    public final xu1 r1;
    public final ez3 s1;
    public final boolean t1;
    public final zu1 u1;
    public final d79 v1;
    public final x46 w1;
    public final tk4 x1;
    public final b29 y1;
    public final di1 z1;

    public oe2(zu1 zu1Var, xu1 xu1Var) {
        super(1, (vnb) xu1Var, (Context) zu1Var.getParentActivity(), true);
        String str;
        boolean z;
        this.J1 = -1;
        this.W1 = false;
        this.X1 = false;
        this.Z1 = 0.0f;
        this.u1 = zu1Var;
        this.r1 = xu1Var;
        this.s1 = xu1Var.f;
        this.p1 = xu1Var.g;
        this.t1 = aob.I.o();
        me2 me2Var = new me2(this.a, zu1Var.a(), xu1Var, 0);
        this.q1 = me2Var;
        this.p0 = false;
        this.c0 = false;
        this.w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i = aob.i5;
            this.H0 = aob.v0(i, this.J0);
            hl.o3(this, aob.v0(i, this.J0), false, null);
            if (hl.B(this.H0) > 0.721d) {
                z = true;
            } else {
                z = false;
            }
            hl.i3(this, z);
        } else {
            L(aob.i5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(ob6.M0(2131745379, null));
        qd4.w(textView, aob.j5, this.J0, 1, 20.0f);
        textView.setPadding(hl.L(12.0f), hl.L(6.0f), hl.L(12.0f), hl.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.l1 = imageView;
        int L = hl.L(10.0f);
        imageView.setPadding(L, L, L, L);
        gd0 gd0Var = new gd0(false);
        this.m1 = gd0Var;
        imageView.setImageDrawable(gd0Var);
        imageView.setOnClickListener(new zd2(this, (byte) 1));
        frameLayout.addView(imageView, tre.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, tre.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i2 = aob.Fi;
        int v0 = aob.v0(i2, this.J0);
        int L2 = hl.L(28.0f);
        b29 b29Var = new b29(2131624235, L2, L2, false, null);
        this.y1 = b29Var;
        this.G1 = !aob.I.o();
        P0(aob.I.o(), false);
        b29Var.E(true);
        b29Var.h = true;
        this.d2 = v0;
        b29Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        di1 di1Var = new di1((byte) 1, getContext(), this);
        this.z1 = di1Var;
        di1Var.setAnimation(b29Var);
        di1Var.setScaleType(ImageView.ScaleType.CENTER);
        di1Var.setOnClickListener(new zd2(this, (byte) 2));
        frameLayout.addView(di1Var, tre.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.A1 = new y46(getContext());
        d79 d79Var = new d79(getContext(), null);
        this.v1 = d79Var;
        d79Var.setAdapter(me2Var);
        d79Var.setDrawSelection(false);
        d79Var.setClipChildren(false);
        d79Var.setClipToPadding(false);
        d79Var.setHasFixedSize(true);
        d79Var.setItemAnimator(null);
        d79Var.setNestedScrollingEnabled(false);
        getContext();
        x46 x46Var = new x46(0, false);
        this.w1 = x46Var;
        d79Var.setLayoutManager(x46Var);
        d79Var.setPadding(hl.L(12.0f), 0, hl.L(12.0f), 0);
        d79Var.setOnItemClickListener(new u(this, (byte) 12));
        d79Var.setOnScrollListener(new y(this, (byte) 26));
        tk4 tk4Var = new tk4(getContext(), this.J0);
        this.x1 = tk4Var;
        tk4Var.setViewType(14);
        tk4Var.setVisibility(0);
        frameLayout.addView(tk4Var, tre.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(d79Var, tre.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.B1 = view;
        int L3 = hl.L(6.0f);
        int v02 = aob.v0(i2, this.J0);
        int i3 = aob.Hi;
        int v03 = aob.v0(i3, this.J0);
        Drawable i0 = aob.i0(L3, L3, L3, L3, v02, v03, v03);
        uob M = yob.M(i2);
        uob M2 = yob.M(i3);
        vnb vnbVar = this.J0;
        view.setBackground(i0);
        yob.j(view, i0, M, M2, vnbVar);
        view.setOnClickListener(new zd2(this, (byte) 3));
        frameLayout.addView(view, tre.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.E1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.p1 == null) {
            textView2.setText(ob6.M0(2131752103, null));
        } else {
            textView2.setText(ob6.M0(2131752105, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new h6(this, (byte) 4));
        frameLayout.addView(textView2, tre.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        in inVar = new in(getContext(), true, true, true);
        this.C1 = inVar;
        inVar.getDrawable().q(true);
        inVar.n = false;
        inVar.setGravity(17);
        int i4 = aob.Ji;
        yob.U(inVar, i4, this.J0);
        inVar.setTextSize(hl.L(15.0f));
        inVar.setTypeface(hl.o());
        frameLayout.addView(inVar, tre.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        in inVar2 = new in(getContext(), true, true, true);
        this.D1 = inVar2;
        inVar2.getDrawable().q(true);
        inVar2.n = false;
        inVar2.setGravity(17);
        yob.U(inVar2, i4, this.J0);
        inVar2.setTextSize(hl.L(12.0f));
        inVar2.setAlpha(0.0f);
        inVar2.setTranslationY(hl.L(11.0f));
        frameLayout.addView(inVar2, tre.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.p1 != null) {
            TextView textView3 = new TextView(getContext());
            this.n1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(ob6.M0(2131745812, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new sb1(this, zu1Var, (byte) 20));
            frameLayout.addView(textView3, tre.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.o1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (zu1Var.h() != null) {
                str = lbc.k(zu1Var.h(), true);
            } else {
                TLRPC.Chat chat = zu1Var.e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(ob6.a0("ChatThemeApplyHint", null, 2131752171, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, tre.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        U0();
        V0(false);
    }

    public static znb E0(boolean z) {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (aob.O0(string) != null && !aob.O0(string).o()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (aob.O0(string2) != null && aob.O0(string2).o()) {
            str2 = string2;
        }
        if (z) {
            return aob.O0(str2);
        }
        return aob.O0(str);
    }

    public static void S0(tqb tqbVar) {
        if (tqbVar == null) {
            return;
        }
        float width = tqbVar.getWidth() / 2.0f;
        float max = Math.max(width, tqbVar.getWidth() - width);
        float max2 = Math.max(0.0f, tqbVar.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tqbVar, tqb.x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(dt3.e);
        ofFloat.addListener(new jb1(tqbVar, (byte) 25));
        ofFloat.start();
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.i5));
    }

    public final void F0(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe2.F0(boolean):void");
    }

    public final defpackage.tqb G0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe2.G0():tqb");
    }

    public final void H0() {
        if (K0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
            String M0 = ob6.M0(2131752161, null);
            id idVar = alertDialog$Builder.a;
            idVar.S = M0;
            idVar.U = ob6.M0(2131752162, null);
            alertDialog$Builder.j(ob6.M0(2131752164, null), new fd(this) {
                public final oe2 b;

                {
                    this.b = this;
                }

                @Override
                public final void w(id idVar2, int i) {
                    byte b = r2;
                    oe2 oe2Var = this.b;
                    switch (b) {
                        case 0:
                            oe2Var.F0(false);
                            return;
                        default:
                            oe2Var.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.g(ob6.M0(2131752163, null), new fd(this) {
                public final oe2 b;

                {
                    this.b = this;
                }

                @Override
                public final void w(id idVar2, int i) {
                    byte b = r2;
                    oe2 oe2Var = this.b;
                    switch (b) {
                        case 0:
                            oe2Var.F0(false);
                            return;
                        default:
                            oe2Var.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
            return;
        }
        dismiss();
    }

    public final void I0() {
        try {
            int v0 = aob.v0(aob.Fi, this.J0);
            b29 b29Var = this.y1;
            if (b29Var != null && v0 != this.d2) {
                this.d2 = v0;
                b29Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
            gd0 gd0Var = this.m1;
            if (gd0Var != null) {
                int i = aob.j5;
                gd0Var.a(aob.v0(i, this.J0));
                gd0Var.b(aob.v0(i, this.J0));
                ImageView imageView = this.l1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int v02 = aob.v0(aob.h5, this.J0);
            if (v02 != this.e2) {
                this.e2 = v02;
                s0(v02);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void J0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.H1) {
            aob.b = false;
            if (K0()) {
                wallPaper = null;
            } else {
                wallPaper = this.r1.g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            ez3 ez3Var = this.F1.a;
            boolean z = ez3Var.a;
            boolean z2 = this.G1;
            xu1 xu1Var = this.r1;
            if (z) {
                xu1Var.q(null, wallPaper2, false, Boolean.valueOf(z2), true);
            } else {
                xu1Var.q(ez3Var, wallPaper2, false, Boolean.valueOf(z2), true);
            }
            n12 n12Var = this.R1;
            if (n12Var != null) {
                m22 m22Var = n12Var.l2;
                if (m22Var != null) {
                    boolean z3 = this.G1;
                    ly0 ly0Var = m22Var.w;
                    ((ArrayList) ly0Var.e).clear();
                    WallpapersListActivity.A0((ArrayList) ly0Var.e, z3);
                    ly0Var.f();
                }
                this.R1.I0();
            }
            me2 me2Var = this.q1;
            if (me2Var != null && me2Var.d != null) {
                for (int i = 0; i < me2Var.d.size(); i++) {
                    ((ne2) me2Var.d.get(i)).c = this.G1 ? 1 : 0;
                }
                me2Var.f();
            }
        }
    }

    public final boolean K0() {
        dpb dpbVar;
        if (this.F1 == null) {
            return false;
        }
        ez3 ez3Var = this.P1;
        dpb dpbVar2 = null;
        if (ez3Var != null) {
            dpbVar = ez3Var.c;
        } else {
            dpbVar = null;
        }
        if (dpbVar == null) {
            dpbVar = dpb.d("❌");
        }
        ez3 ez3Var2 = this.F1.a;
        if (ez3Var2 != null) {
            dpbVar2 = ez3Var2.c;
        }
        if (dpbVar2 == null) {
            dpbVar2 = dpb.d("❌");
        }
        return !dpb.a(dpbVar, dpbVar2);
    }

    public final void L0() {
        ArrayList arrayList;
        if (!this.U1) {
            af2 e = af2.e(this.a);
            if (e.f.c && (arrayList = e.b) != null && !arrayList.isEmpty()) {
                return;
            }
            boolean z = true;
            this.U1 = true;
            if (e.f.c) {
                e.o(new ke2(this, e), false);
                return;
            }
            le2 le2Var = new le2(this, e);
            long currentTimeMillis = System.currentTimeMillis();
            ze2 ze2Var = e.f;
            if (currentTimeMillis - ze2Var.b <= 7200000) {
                z = false;
            }
            if (((ArrayList) ze2Var.d) != null && ze2Var.c && !z) {
                return;
            }
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            ze2 ze2Var2 = e.f;
            tl_getUniqueGiftChatThemes.offset = (String) ze2Var2.e;
            tl_getUniqueGiftChatThemes.hash = ze2Var2.a;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = e.getConnectionsManager();
            to3 to3Var = af2.s;
            Objects.requireNonNull(to3Var);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new pe2(to3Var, (byte) 0), new qe2(e, le2Var, (byte) 0));
        }
    }

    public final void M0(ArrayList arrayList) {
        dpb dpbVar;
        if (arrayList.isEmpty()) {
            return;
        }
        ne2 ne2Var = new ne2((ez3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.O1) {
            ez3 ez3Var = this.r1.f;
            this.P1 = ez3Var;
            if (ez3Var != null) {
                ez3Var.k();
            }
        }
        arrayList2.add(0, ne2Var);
        if (!this.O1) {
            this.F1 = ne2Var;
        }
        ez3 ez3Var2 = this.P1;
        if (ez3Var2 != null) {
            dpbVar = ez3Var2.c;
        } else {
            dpbVar = null;
        }
        boolean z = false;
        int i = 1;
        while (i < arrayList.size()) {
            ez3 ez3Var3 = (ez3) arrayList.get(i);
            ne2 ne2Var2 = new ne2(ez3Var3);
            ez3Var3.m(this.a);
            ne2Var2.c = this.G1 ? 1 : 0;
            if (dpb.a(ez3Var3.c, dpbVar)) {
                arrayList2.add(1, ne2Var2);
                z = true;
            } else {
                arrayList2.add(ne2Var2);
            }
            i++;
            z = z;
        }
        ez3 ez3Var4 = this.P1;
        if (ez3Var4 != null && !z) {
            ne2 ne2Var3 = new ne2(ez3Var4);
            ez3Var4.m(this.a);
            ne2Var3.c = this.G1 ? 1 : 0;
            arrayList2.add(1, ne2Var3);
        }
        me2 me2Var = this.q1;
        me2Var.d = arrayList2;
        me2Var.f();
        this.z1.setVisibility(0);
        if (!this.O1) {
            O0(false);
            this.v1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.O1 = true;
        V0(true);
    }

    public final void N0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.H1) {
            this.I1 = false;
            this.u1.getClass();
            if (K0()) {
                wallPaper = null;
            } else {
                wallPaper = this.p1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            ez3 ez3Var = this.F1.a;
            boolean z = ez3Var.a;
            boolean z2 = this.G1;
            xu1 xu1Var = this.r1;
            if (z) {
                xu1Var.q(null, wallPaper2, true, Boolean.valueOf(z2), false);
            } else {
                xu1Var.q(ez3Var, wallPaper2, true, Boolean.valueOf(z2), false);
            }
        }
    }

    public final void O0(boolean z) {
        me2 me2Var = this.q1;
        ArrayList arrayList = me2Var.d;
        ez3 ez3Var = this.P1;
        x46 x46Var = this.w1;
        d79 d79Var = this.v1;
        if (ez3Var != null) {
            int i = 0;
            while (true) {
                if (i != arrayList.size()) {
                    if (dpb.a(((ne2) arrayList.get(i)).a.c, this.P1.c)) {
                        this.F1 = (ne2) arrayList.get(i);
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                this.J1 = i;
                me2Var.E(i);
                if (i > 0 && i < arrayList.size() / 2) {
                    i--;
                }
                int min = Math.min(i, me2Var.d.size() - 1);
                if (z) {
                    d79Var.A0(min);
                } else {
                    x46Var.g1(min, 0);
                }
            }
        } else {
            this.F1 = (ne2) arrayList.get(0);
            me2Var.E(0);
            if (z) {
                d79Var.A0(0);
            } else {
                x46Var.g1(0, 0);
            }
        }
        N0();
    }

    public final void P0(boolean z, boolean z2) {
        int i;
        if (this.G1 != z) {
            this.G1 = z;
            di1 di1Var = this.z1;
            b29 b29Var = this.y1;
            int i2 = 0;
            if (z2) {
                if (z) {
                    i2 = b29Var.e[0];
                }
                b29Var.K(i2);
                if (di1Var != null) {
                    di1Var.d();
                    return;
                }
                return;
            }
            if (z) {
                i = b29Var.e[0] - 1;
            } else {
                i = 0;
            }
            b29Var.I(i, false, true);
            b29Var.K(i);
            if (di1Var != null) {
                di1Var.invalidate();
            }
        }
    }

    public final void Q0(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe2.Q0(boolean):void");
    }

    public final void R0(pqb pqbVar) {
        ?? obj = new Object();
        obj.a = true;
        zu1 zu1Var = this.u1;
        pqbVar.a.a = zu1Var.getResourceProvider();
        pqbVar.r1 = new ie2(this);
        obj.c = new kc((byte) 24);
        obj.d = new xd2(this, (byte) 5);
        obj.b = new xd2(this, (byte) 6);
        obj.e = true;
        this.Q1 = pqbVar;
        zu1Var.showAsSheet(pqbVar, obj);
    }

    @Override
    public final ArrayList S() {
        be2 be2Var = new be2(this);
        ArrayList arrayList = new ArrayList();
        if (this.u1.w7) {
            e eVar = this.Q1;
            if (eVar instanceof pqb) {
                arrayList.addAll(((pqb) eVar).U0());
                return arrayList;
            }
        }
        n12 n12Var = this.R1;
        if (n12Var != null) {
            arrayList.addAll(n12Var.S());
        }
        int i = 0;
        arrayList.add(new apb((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, be2Var, aob.h5));
        int i2 = aob.Fi;
        View view = this.B1;
        arrayList.add(new apb(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, i2));
        arrayList.add(new apb(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.Hi));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((apb) obj).n = this.r1;
        }
        return arrayList;
    }

    public final void T0(znb znbVar) {
        if (znbVar != null && znbVar != aob.I) {
            this.b2 = true;
            try {
                jn7.e().k(jn7.w4, znbVar, Boolean.FALSE, null, -1);
            } finally {
                this.b2 = false;
            }
        }
    }

    public final void U0() {
        TextView textView = this.o1;
        if (textView != null) {
            yob.X(textView, aob.p5, this.J0);
            int L = hl.L(6.0f);
            int i = aob.Fi;
            int o = vm2.o(aob.v0(i, this.J0), 76);
            hf0 i0 = aob.i0(L, L, L, L, 0, o, o);
            uob g = yob.g(i, 76);
            vnb vnbVar = this.J0;
            textView.setBackground(i0);
            yob.j(textView, i0, null, g, vnbVar);
        }
        TextView textView2 = this.n1;
        if (textView2 != null) {
            int i2 = aob.p7;
            yob.X(textView2, i2, this.J0);
            int L2 = hl.L(6.0f);
            int o2 = vm2.o(aob.v0(i2, this.J0), 76);
            hf0 i02 = aob.i0(L2, L2, L2, L2, 0, o2, o2);
            uob g2 = yob.g(i2, 76);
            vnb vnbVar2 = this.J0;
            textView2.setBackground(i02);
            yob.j(textView2, i02, null, g2, vnbVar2);
        }
        int i3 = aob.j5;
        hf0 f0 = aob.f0(vm2.o(aob.v0(i3, this.J0), 30), 1, -1);
        uob g3 = yob.g(i3, 30);
        vnb vnbVar3 = this.J0;
        ImageView imageView = this.l1;
        yob.R(imageView, f0, null, g3, vnbVar3);
        int v0 = aob.v0(i3, this.J0);
        gd0 gd0Var = this.m1;
        gd0Var.a(v0);
        gd0Var.b(aob.v0(i3, this.J0));
        imageView.invalidate();
        int i4 = aob.Fi;
        yob.R(this.z1, aob.f0(vm2.o(aob.v0(i4, this.J0), 30), 1, -1), null, yob.g(i4, 30), this.J0);
        int i5 = aob.m5;
        vnb vnbVar4 = this.J0;
        TextView textView3 = this.E1;
        yob.X(textView3, i5, vnbVar4);
        int L3 = hl.L(6.0f);
        int o3 = vm2.o(aob.v0(i4, this.J0), 76);
        yob.R(textView3, aob.i0(L3, L3, L3, L3, 0, o3, o3), null, yob.g(i4, 76), this.J0);
    }

    public final void V0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe2.V0(boolean):void");
    }

    @Override
    public final boolean c0(MotionEvent motionEvent) {
        if (motionEvent != null && K0()) {
            int x = (int) motionEvent.getX();
            if (((int) motionEvent.getY()) < this.b.getTop() || x < this.b.getLeft() || x > this.b.getRight()) {
                this.u1.getFragmentView().dispatchTouchEvent(motionEvent);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void d0(float f) {
        lg5 lg5Var = this.N1;
        if (lg5Var != null) {
            lg5Var.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.l4) {
            jn7.f(this.a).d(new xd2(this, (byte) 0));
        }
    }

    @Override
    public final void dismiss() {
        tqb tqbVar;
        znb E0;
        boolean z;
        jn7.e().n(this, jn7.l4);
        super.dismiss();
        this.u1.getClass();
        boolean z2 = this.H1;
        boolean z3 = this.t1;
        if (!z2 && this.G1 != z3) {
            tqbVar = G0();
        } else {
            tqbVar = null;
        }
        if (!this.H1) {
            xu1 xu1Var = this.r1;
            TLRPC.WallPaper wallPaper = xu1Var.g;
            if (wallPaper == null) {
                wallPaper = this.p1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (tqbVar == null) {
                z = true;
            } else {
                z = false;
            }
            xu1Var.q(this.s1, wallPaper2, z, Boolean.valueOf(z3), false);
        }
        if (this.G1 != z3) {
            if (aob.I.o() == z3) {
                E0 = aob.I;
            } else {
                E0 = E0(z3);
            }
            if (this.c2) {
                T0(E0);
            } else {
                aob.t(E0, false, z3);
            }
        }
        this.c2 = false;
        S0(tqbVar);
    }

    @Override
    public final void onBackPressed() {
        H0();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        af2 e = af2.e(this.a);
        e.k(true);
        e.k(false);
        e.j(true);
        e.j(false);
        jn7.e().b(this, jn7.l4);
        this.H1 = false;
        if (e.f.c && (arrayList = e.b) != null && !arrayList.isEmpty()) {
            M0(e.d(7));
        } else {
            L0();
        }
        if (this.u1.h() != null && xea.a1 > 0 && !this.u1.h().self) {
            xea.a1--;
            a.b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", xea.a1).apply();
            lg5 lg5Var = new lg5(9, this.u1.getResourceProvider(), getContext(), false);
            this.N1 = lg5Var;
            lg5Var.setVisibility(4);
            this.N1.setShowingDuration(5000L);
            this.N1.setBottomOffset(-hl.L(8.0f));
            boolean z = this.G1;
            lg5 lg5Var2 = this.N1;
            if (z) {
                lg5Var2.setText(hl.S2(ob6.a0("ChatThemeDaySwitchTooltip", null, 2131752168, new Object[0])));
            } else {
                lg5Var2.setText(hl.S2(ob6.a0("ChatThemeNightSwitchTooltip", null, 2131752165, new Object[0])));
            }
            hl.d3(new xd2(this, (byte) 7), 1500L);
            this.c.addView(this.N1, tre.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        I0();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.G0 == -1 && this.H0 != (v0 = aob.v0(aob.i5, this.J0))) {
                this.H0 = v0;
                boolean z = false;
                hl.o3(this, v0, false, null);
                if (hl.B(v0) > 0.721d) {
                    z = true;
                }
                hl.i3(this, z);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
