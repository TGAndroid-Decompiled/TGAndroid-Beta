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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.WallpapersListActivity;
public final class xd2 extends fx0 implements gk7 {
    public static final int f2 = 0;
    public final sd2 A1;
    public final View B1;
    public final hn C1;
    public final hn D1;
    public final TextView E1;
    public wd2 F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public umb K1;
    public float L1;
    public ValueAnimator M1;
    public ke5 N1;
    public boolean O1;
    public jy3 P1;
    public d Q1;
    public x02 R1;
    public st S1;
    public hn T1;
    public boolean U1;
    public cm2 V1;
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
    public final ed0 m1;
    public final TextView n1;
    public final TextView o1;
    public TLRPC.WallPaper p1;
    public final vd2 q1;
    public final ku1 r1;
    public final jy3 s1;
    public final boolean t1;
    public final mu1 u1;
    public final o39 v1;
    public final t26 w1;
    public final pi4 x1;
    public final oy8 y1;
    public final vh1 z1;

    public xd2(mu1 mu1Var, ku1 ku1Var) {
        super(1, (wjb) ku1Var, (Context) mu1Var.getParentActivity(), true);
        String str;
        boolean z;
        this.J1 = -1;
        this.W1 = false;
        this.X1 = false;
        this.Z1 = 0.0f;
        this.u1 = mu1Var;
        this.r1 = ku1Var;
        this.s1 = ku1Var.f;
        this.p1 = ku1Var.g;
        this.t1 = bkb.I.o();
        vd2 vd2Var = new vd2(this.a, mu1Var.a(), ku1Var, 0);
        this.q1 = vd2Var;
        this.p0 = false;
        this.c0 = false;
        this.w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i = bkb.h5;
            this.H0 = bkb.v0(i, this.J0);
            gl.p3(this, bkb.v0(i, this.J0), false, null);
            if (gl.B(this.H0) > 0.721d) {
                z = true;
            } else {
                z = false;
            }
            gl.j3(this, z);
        } else {
            M(bkb.h5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(k96.M0(2131745459, null));
        tb4.w(textView, bkb.i5, this.J0, 1, 20.0f);
        textView.setPadding(gl.L(12.0f), gl.L(6.0f), gl.L(12.0f), gl.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.l1 = imageView;
        int L = gl.L(10.0f);
        imageView.setPadding(L, L, L, L);
        ed0 ed0Var = new ed0(false);
        this.m1 = ed0Var;
        imageView.setImageDrawable(ed0Var);
        imageView.setOnClickListener(new hd2(this, (byte) 1));
        frameLayout.addView(imageView, nme.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, nme.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i2 = bkb.Ei;
        int v0 = bkb.v0(i2, this.J0);
        int L2 = gl.L(28.0f);
        oy8 oy8Var = new oy8(2131624236, L2, L2, false, null);
        this.y1 = oy8Var;
        this.G1 = !bkb.I.o();
        O0(bkb.I.o(), false);
        oy8Var.E(true);
        oy8Var.h = true;
        this.d2 = v0;
        oy8Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        vh1 vh1Var = new vh1((byte) 1, getContext(), this);
        this.z1 = vh1Var;
        vh1Var.setAnimation(oy8Var);
        vh1Var.setScaleType(ImageView.ScaleType.CENTER);
        vh1Var.setOnClickListener(new hd2(this, (byte) 2));
        frameLayout.addView(vh1Var, nme.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.A1 = new u26(getContext());
        o39 o39Var = new o39(getContext(), null);
        this.v1 = o39Var;
        o39Var.setAdapter(vd2Var);
        o39Var.setDrawSelection(false);
        o39Var.setClipChildren(false);
        o39Var.setClipToPadding(false);
        o39Var.setHasFixedSize(true);
        o39Var.setItemAnimator(null);
        o39Var.setNestedScrollingEnabled(false);
        getContext();
        t26 t26Var = new t26(0, false);
        this.w1 = t26Var;
        o39Var.setLayoutManager(t26Var);
        o39Var.setPadding(gl.L(12.0f), 0, gl.L(12.0f), 0);
        o39Var.setOnItemClickListener(new u(this, (byte) 12));
        o39Var.setOnScrollListener(new y(this, (byte) 26));
        pi4 pi4Var = new pi4(getContext(), this.J0);
        this.x1 = pi4Var;
        pi4Var.setViewType(14);
        pi4Var.setVisibility(0);
        frameLayout.addView(pi4Var, nme.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(o39Var, nme.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.B1 = view;
        int L3 = gl.L(6.0f);
        int v02 = bkb.v0(i2, this.J0);
        int i3 = bkb.Gi;
        int v03 = bkb.v0(i3, this.J0);
        Drawable i0 = bkb.i0(L3, L3, L3, L3, v02, v03, v03);
        vkb M = zkb.M(i2);
        vkb M2 = zkb.M(i3);
        wjb wjbVar = this.J0;
        view.setBackground(i0);
        zkb.j(view, i0, M, M2, wjbVar);
        view.setOnClickListener(new hd2(this, (byte) 3));
        frameLayout.addView(view, nme.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.E1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.p1 == null) {
            textView2.setText(k96.M0(2131752126, null));
        } else {
            textView2.setText(k96.M0(2131752128, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new g6(this, (byte) 4));
        frameLayout.addView(textView2, nme.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        hn hnVar = new hn(getContext(), true, true, true);
        this.C1 = hnVar;
        hnVar.getDrawable().q(true);
        hnVar.n = false;
        hnVar.setGravity(17);
        int i4 = bkb.Ii;
        zkb.U(hnVar, i4, this.J0);
        hnVar.setTextSize(gl.L(15.0f));
        hnVar.setTypeface(gl.o());
        frameLayout.addView(hnVar, nme.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        hn hnVar2 = new hn(getContext(), true, true, true);
        this.D1 = hnVar2;
        hnVar2.getDrawable().q(true);
        hnVar2.n = false;
        hnVar2.setGravity(17);
        zkb.U(hnVar2, i4, this.J0);
        hnVar2.setTextSize(gl.L(12.0f));
        hnVar2.setAlpha(0.0f);
        hnVar2.setTranslationY(gl.L(11.0f));
        frameLayout.addView(hnVar2, nme.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.p1 != null) {
            TextView textView3 = new TextView(getContext());
            this.n1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(k96.M0(2131745892, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new kb1(this, mu1Var, (byte) 18));
            frameLayout.addView(textView3, nme.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.o1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (mu1Var.h() != null) {
                str = l7c.k(mu1Var.h(), true);
            } else {
                TLRPC.Chat chat = mu1Var.e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(k96.a0("ChatThemeApplyHint", null, 2131752194, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, nme.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        T0();
        U0(false);
    }

    public static akb D0(boolean z) {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (bkb.O0(string) != null && !bkb.O0(string).o()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (bkb.O0(string2) != null && bkb.O0(string2).o()) {
            str2 = string2;
        }
        if (z) {
            return bkb.O0(str2);
        }
        return bkb.O0(str);
    }

    public static void R0(umb umbVar) {
        if (umbVar == null) {
            return;
        }
        float width = umbVar.getWidth() / 2.0f;
        float max = Math.max(width, umbVar.getWidth() - width);
        float max2 = Math.max(0.0f, umbVar.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(umbVar, umb.x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(ls3.e);
        ofFloat.addListener(new bb1(umbVar, (byte) 25));
        ofFloat.start();
    }

    @Override
    public final void A(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.h5));
    }

    public final void E0(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd2.E0(boolean):void");
    }

    public final defpackage.umb F0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd2.F0():umb");
    }

    public final void G0() {
        if (J0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
            String M0 = k96.M0(2131752184, null);
            hd hdVar = alertDialog$Builder.a;
            hdVar.S = M0;
            hdVar.U = k96.M0(2131752185, null);
            alertDialog$Builder.j(k96.M0(2131752187, null), new ed(this) {
                public final xd2 b;

                {
                    this.b = this;
                }

                @Override
                public final void u(hd hdVar2, int i) {
                    byte b = r2;
                    xd2 xd2Var = this.b;
                    switch (b) {
                        case 0:
                            xd2Var.E0(false);
                            return;
                        default:
                            xd2Var.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.g(k96.M0(2131752186, null), new ed(this) {
                public final xd2 b;

                {
                    this.b = this;
                }

                @Override
                public final void u(hd hdVar2, int i) {
                    byte b = r2;
                    xd2 xd2Var = this.b;
                    switch (b) {
                        case 0:
                            xd2Var.E0(false);
                            return;
                        default:
                            xd2Var.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.o();
            return;
        }
        dismiss();
    }

    public final void H0() {
        try {
            int v0 = bkb.v0(bkb.Ei, this.J0);
            oy8 oy8Var = this.y1;
            if (oy8Var != null && v0 != this.d2) {
                this.d2 = v0;
                oy8Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
            ed0 ed0Var = this.m1;
            if (ed0Var != null) {
                int i = bkb.i5;
                ed0Var.a(bkb.v0(i, this.J0));
                ed0Var.b(bkb.v0(i, this.J0));
                ImageView imageView = this.l1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int v02 = bkb.v0(bkb.g5, this.J0);
            if (v02 != this.e2) {
                this.e2 = v02;
                s0(v02);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void I0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.H1) {
            bkb.b = false;
            if (J0()) {
                wallPaper = null;
            } else {
                wallPaper = this.r1.g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            jy3 jy3Var = this.F1.a;
            boolean z = jy3Var.a;
            boolean z2 = this.G1;
            ku1 ku1Var = this.r1;
            if (z) {
                ku1Var.q(null, wallPaper2, false, Boolean.valueOf(z2), true);
            } else {
                ku1Var.q(jy3Var, wallPaper2, false, Boolean.valueOf(z2), true);
            }
            x02 x02Var = this.R1;
            if (x02Var != null) {
                v12 v12Var = x02Var.l2;
                if (v12Var != null) {
                    boolean z3 = this.G1;
                    dy0 dy0Var = v12Var.w;
                    ((ArrayList) dy0Var.e).clear();
                    WallpapersListActivity.z0((ArrayList) dy0Var.e, z3);
                    dy0Var.f();
                }
                this.R1.H0();
            }
            vd2 vd2Var = this.q1;
            if (vd2Var != null && vd2Var.d != null) {
                for (int i = 0; i < vd2Var.d.size(); i++) {
                    ((wd2) vd2Var.d.get(i)).c = this.G1 ? 1 : 0;
                }
                vd2Var.f();
            }
        }
    }

    public final boolean J0() {
        elb elbVar;
        if (this.F1 == null) {
            return false;
        }
        jy3 jy3Var = this.P1;
        elb elbVar2 = null;
        if (jy3Var != null) {
            elbVar = jy3Var.c;
        } else {
            elbVar = null;
        }
        if (elbVar == null) {
            elbVar = elb.d("❌");
        }
        jy3 jy3Var2 = this.F1.a;
        if (jy3Var2 != null) {
            elbVar2 = jy3Var2.c;
        }
        if (elbVar2 == null) {
            elbVar2 = elb.d("❌");
        }
        return !elb.a(elbVar, elbVar2);
    }

    public final void K0() {
        ArrayList arrayList;
        if (!this.U1) {
            je2 e = je2.e(this.a);
            if (e.f.c && (arrayList = e.b) != null && !arrayList.isEmpty()) {
                return;
            }
            boolean z = true;
            this.U1 = true;
            if (e.f.c) {
                e.o(new td2(this, e), false);
                return;
            }
            ud2 ud2Var = new ud2(this, e);
            long currentTimeMillis = System.currentTimeMillis();
            ie2 ie2Var = e.f;
            if (currentTimeMillis - ie2Var.b <= 7200000) {
                z = false;
            }
            if (((ArrayList) ie2Var.d) != null && ie2Var.c && !z) {
                return;
            }
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            ie2 ie2Var2 = e.f;
            tl_getUniqueGiftChatThemes.offset = (String) ie2Var2.e;
            tl_getUniqueGiftChatThemes.hash = ie2Var2.a;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = e.getConnectionsManager();
            co3 co3Var = je2.s;
            Objects.requireNonNull(co3Var);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new ge2(co3Var, (byte) 0), new ae2(e, ud2Var, (byte) 0));
        }
    }

    public final void L0(ArrayList arrayList) {
        elb elbVar;
        if (arrayList.isEmpty()) {
            return;
        }
        wd2 wd2Var = new wd2((jy3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.O1) {
            jy3 jy3Var = this.r1.f;
            this.P1 = jy3Var;
            if (jy3Var != null) {
                jy3Var.k();
            }
        }
        arrayList2.add(0, wd2Var);
        if (!this.O1) {
            this.F1 = wd2Var;
        }
        jy3 jy3Var2 = this.P1;
        if (jy3Var2 != null) {
            elbVar = jy3Var2.c;
        } else {
            elbVar = null;
        }
        boolean z = false;
        int i = 1;
        while (i < arrayList.size()) {
            jy3 jy3Var3 = (jy3) arrayList.get(i);
            wd2 wd2Var2 = new wd2(jy3Var3);
            jy3Var3.m(this.a);
            wd2Var2.c = this.G1 ? 1 : 0;
            if (elb.a(jy3Var3.c, elbVar)) {
                arrayList2.add(1, wd2Var2);
                z = true;
            } else {
                arrayList2.add(wd2Var2);
            }
            i++;
            z = z;
        }
        jy3 jy3Var4 = this.P1;
        if (jy3Var4 != null && !z) {
            wd2 wd2Var3 = new wd2(jy3Var4);
            jy3Var4.m(this.a);
            wd2Var3.c = this.G1 ? 1 : 0;
            arrayList2.add(1, wd2Var3);
        }
        vd2 vd2Var = this.q1;
        vd2Var.d = arrayList2;
        vd2Var.f();
        this.z1.setVisibility(0);
        if (!this.O1) {
            N0(false);
            this.v1.animate().alpha(1.0f).setDuration(150L).start();
        }
        this.O1 = true;
        U0(true);
    }

    public final void M0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.H1) {
            this.I1 = false;
            this.u1.getClass();
            if (J0()) {
                wallPaper = null;
            } else {
                wallPaper = this.p1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            jy3 jy3Var = this.F1.a;
            boolean z = jy3Var.a;
            boolean z2 = this.G1;
            ku1 ku1Var = this.r1;
            if (z) {
                ku1Var.q(null, wallPaper2, true, Boolean.valueOf(z2), false);
            } else {
                ku1Var.q(jy3Var, wallPaper2, true, Boolean.valueOf(z2), false);
            }
        }
    }

    public final void N0(boolean z) {
        vd2 vd2Var = this.q1;
        ArrayList arrayList = vd2Var.d;
        jy3 jy3Var = this.P1;
        t26 t26Var = this.w1;
        o39 o39Var = this.v1;
        if (jy3Var != null) {
            int i = 0;
            while (true) {
                if (i != arrayList.size()) {
                    if (elb.a(((wd2) arrayList.get(i)).a.c, this.P1.c)) {
                        this.F1 = (wd2) arrayList.get(i);
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
                vd2Var.E(i);
                if (i > 0 && i < arrayList.size() / 2) {
                    i--;
                }
                int min = Math.min(i, vd2Var.d.size() - 1);
                if (z) {
                    o39Var.z0(min);
                } else {
                    t26Var.g1(min, 0);
                }
            }
        } else {
            this.F1 = (wd2) arrayList.get(0);
            vd2Var.E(0);
            if (z) {
                o39Var.z0(0);
            } else {
                t26Var.g1(0, 0);
            }
        }
        M0();
    }

    public final void O0(boolean z, boolean z2) {
        int i;
        if (this.G1 != z) {
            this.G1 = z;
            vh1 vh1Var = this.z1;
            oy8 oy8Var = this.y1;
            int i2 = 0;
            if (z2) {
                if (z) {
                    i2 = oy8Var.e[0];
                }
                oy8Var.K(i2);
                if (vh1Var != null) {
                    vh1Var.d();
                    return;
                }
                return;
            }
            if (z) {
                i = oy8Var.e[0] - 1;
            } else {
                i = 0;
            }
            oy8Var.I(i, false, true);
            oy8Var.K(i);
            if (vh1Var != null) {
                vh1Var.invalidate();
            }
        }
    }

    public final void P0(boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd2.P0(boolean):void");
    }

    public final void Q0(qmb qmbVar) {
        ?? obj = new Object();
        obj.a = true;
        mu1 mu1Var = this.u1;
        qmbVar.a.a = mu1Var.getResourceProvider();
        qmbVar.r1 = new rd2(this);
        obj.c = new jc((byte) 24);
        obj.d = new gd2(this, (byte) 5);
        obj.b = new gd2(this, (byte) 6);
        obj.e = true;
        this.Q1 = qmbVar;
        mu1Var.showAsSheet(qmbVar, obj);
    }

    @Override
    public final ArrayList S() {
        kd2 kd2Var = new kd2(this);
        ArrayList arrayList = new ArrayList();
        if (this.u1.w7) {
            d dVar = this.Q1;
            if (dVar instanceof qmb) {
                arrayList.addAll(((qmb) dVar).T0());
                return arrayList;
            }
        }
        x02 x02Var = this.R1;
        if (x02Var != null) {
            arrayList.addAll(x02Var.S());
        }
        int i = 0;
        arrayList.add(new blb((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, kd2Var, bkb.g5));
        int i2 = bkb.Ei;
        View view = this.B1;
        arrayList.add(new blb(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, i2));
        arrayList.add(new blb(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Gi));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((blb) obj).n = this.r1;
        }
        return arrayList;
    }

    public final void S0(akb akbVar) {
        if (akbVar != null && akbVar != bkb.I) {
            this.b2 = true;
            try {
                kk7.e().k(kk7.v4, akbVar, Boolean.FALSE, null, -1);
            } finally {
                this.b2 = false;
            }
        }
    }

    public final void T0() {
        TextView textView = this.o1;
        if (textView != null) {
            zkb.X(textView, bkb.o5, this.J0);
            int L = gl.L(6.0f);
            int i = bkb.Ei;
            int o = bm2.o(bkb.v0(i, this.J0), 76);
            ff0 i0 = bkb.i0(L, L, L, L, 0, o, o);
            vkb g = zkb.g(i, 76);
            wjb wjbVar = this.J0;
            textView.setBackground(i0);
            zkb.j(textView, i0, null, g, wjbVar);
        }
        TextView textView2 = this.n1;
        if (textView2 != null) {
            int i2 = bkb.o7;
            zkb.X(textView2, i2, this.J0);
            int L2 = gl.L(6.0f);
            int o2 = bm2.o(bkb.v0(i2, this.J0), 76);
            ff0 i02 = bkb.i0(L2, L2, L2, L2, 0, o2, o2);
            vkb g2 = zkb.g(i2, 76);
            wjb wjbVar2 = this.J0;
            textView2.setBackground(i02);
            zkb.j(textView2, i02, null, g2, wjbVar2);
        }
        int i3 = bkb.i5;
        ff0 f0 = bkb.f0(bm2.o(bkb.v0(i3, this.J0), 30), 1, -1);
        vkb g3 = zkb.g(i3, 30);
        wjb wjbVar3 = this.J0;
        ImageView imageView = this.l1;
        zkb.R(imageView, f0, null, g3, wjbVar3);
        int v0 = bkb.v0(i3, this.J0);
        ed0 ed0Var = this.m1;
        ed0Var.a(v0);
        ed0Var.b(bkb.v0(i3, this.J0));
        imageView.invalidate();
        int i4 = bkb.Ei;
        zkb.R(this.z1, bkb.f0(bm2.o(bkb.v0(i4, this.J0), 30), 1, -1), null, zkb.g(i4, 30), this.J0);
        int i5 = bkb.l5;
        wjb wjbVar4 = this.J0;
        TextView textView3 = this.E1;
        zkb.X(textView3, i5, wjbVar4);
        int L3 = gl.L(6.0f);
        int o3 = bm2.o(bkb.v0(i4, this.J0), 76);
        zkb.R(textView3, bkb.i0(L3, L3, L3, L3, 0, o3, o3), null, zkb.g(i4, 76), this.J0);
    }

    public final void U0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xd2.U0(boolean):void");
    }

    @Override
    public final boolean c0(MotionEvent motionEvent) {
        if (motionEvent != null && J0()) {
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
        ke5 ke5Var = this.N1;
        if (ke5Var != null) {
            ke5Var.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.k4) {
            kk7.f(this.a).d(new gd2(this, (byte) 0));
        }
    }

    @Override
    public final void dismiss() {
        umb umbVar;
        akb D0;
        boolean z;
        kk7.e().n(this, kk7.k4);
        super.dismiss();
        this.u1.getClass();
        boolean z2 = this.H1;
        boolean z3 = this.t1;
        if (!z2 && this.G1 != z3) {
            umbVar = F0();
        } else {
            umbVar = null;
        }
        if (!this.H1) {
            ku1 ku1Var = this.r1;
            TLRPC.WallPaper wallPaper = ku1Var.g;
            if (wallPaper == null) {
                wallPaper = this.p1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (umbVar == null) {
                z = true;
            } else {
                z = false;
            }
            ku1Var.q(this.s1, wallPaper2, z, Boolean.valueOf(z3), false);
        }
        if (this.G1 != z3) {
            if (bkb.I.o() == z3) {
                D0 = bkb.I;
            } else {
                D0 = D0(z3);
            }
            if (this.c2) {
                S0(D0);
            } else {
                bkb.t(D0, false, z3);
            }
        }
        this.c2 = false;
        R0(umbVar);
    }

    @Override
    public final void onBackPressed() {
        G0();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        je2 e = je2.e(this.a);
        e.k(true);
        e.k(false);
        e.j(true);
        e.j(false);
        kk7.e().b(this, kk7.k4);
        this.H1 = false;
        if (e.f.c && (arrayList = e.b) != null && !arrayList.isEmpty()) {
            L0(e.d(7));
        } else {
            K0();
        }
        if (this.u1.h() != null && gba.b1 > 0 && !this.u1.h().self) {
            gba.b1--;
            a.b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", gba.b1).apply();
            ke5 ke5Var = new ke5(9, this.u1.getResourceProvider(), getContext(), false);
            this.N1 = ke5Var;
            ke5Var.setVisibility(4);
            this.N1.setShowingDuration(5000L);
            this.N1.setBottomOffset(-gl.L(8.0f));
            boolean z = this.G1;
            ke5 ke5Var2 = this.N1;
            if (z) {
                ke5Var2.setText(gl.T2(k96.a0("ChatThemeDaySwitchTooltip", null, 2131752191, new Object[0])));
            } else {
                ke5Var2.setText(gl.T2(k96.a0("ChatThemeNightSwitchTooltip", null, 2131752188, new Object[0])));
            }
            gl.e3(new gd2(this, (byte) 7), 1500L);
            this.c.addView(this.N1, nme.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        H0();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.G0 == -1 && this.H0 != (v0 = bkb.v0(bkb.h5, this.J0))) {
                this.H0 = v0;
                boolean z = false;
                gl.p3(this, v0, false, null);
                if (gl.B(v0) > 0.721d) {
                    z = true;
                }
                gl.j3(this, z);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
