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
public final class if2 extends my0 implements jm7 {
    public static final int f2 = 0;
    public final df2 A1;
    public final View B1;
    public final io C1;
    public final io D1;
    public final TextView E1;
    public hf2 F1;
    public boolean G1;
    public boolean H1;
    public boolean I1;
    public int J1;
    public vob K1;
    public float L1;
    public ValueAnimator M1;
    public ig5 N1;
    public boolean O1;
    public tz3 P1;
    public d Q1;
    public i22 R1;
    public su S1;
    public io T1;
    public boolean U1;
    public pn2 V1;
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
    public final ee0 m1;
    public final TextView n1;
    public final TextView o1;
    public TLRPC.WallPaper p1;
    public final gf2 q1;
    public final wv1 r1;
    public final tz3 s1;
    public final boolean t1;
    public final yv1 u1;
    public final r59 v1;
    public final u46 w1;
    public final tk4 x1;
    public final p09 y1;
    public final cj1 z1;

    public if2(yv1 yv1Var, wv1 wv1Var) {
        super(1, (ylb) wv1Var, (Context) yv1Var.getParentActivity(), true);
        String str;
        boolean z;
        this.J1 = -1;
        this.W1 = false;
        this.X1 = false;
        this.Z1 = 0.0f;
        this.u1 = yv1Var;
        this.r1 = wv1Var;
        this.s1 = wv1Var.f;
        this.p1 = wv1Var.g;
        this.t1 = cmb.I.o();
        gf2 gf2Var = new gf2(this.a, yv1Var.a(), wv1Var, 0);
        this.q1 = gf2Var;
        this.p0 = false;
        this.c0 = false;
        this.w0 = false;
        if (Build.VERSION.SDK_INT >= 30) {
            this.G0 = -1;
            int i = cmb.h5;
            this.H0 = cmb.v0(i, this.J0);
            gm.o3(this, cmb.v0(i, this.J0), false, null);
            if (gm.B(this.H0) > 0.721d) {
                z = true;
            } else {
                z = false;
            }
            gm.i3(this, z);
        } else {
            L(cmb.h5);
        }
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.O = frameLayout;
        TextView textView = new TextView(getContext());
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        textView.setLines(1);
        textView.setSingleLine(true);
        textView.setText(jb6.M0(2131745385, null));
        td4.x(textView, cmb.i5, this.J0, 1, 20.0f);
        textView.setPadding(gm.L(12.0f), gm.L(6.0f), gm.L(12.0f), gm.L(8.0f));
        ImageView imageView = new ImageView(getContext());
        this.l1 = imageView;
        int L = gm.L(10.0f);
        imageView.setPadding(L, L, L, L);
        ee0 ee0Var = new ee0(false);
        this.m1 = ee0Var;
        imageView.setImageDrawable(ee0Var);
        imageView.setOnClickListener(new se2(this, (byte) 1));
        frameLayout.addView(imageView, qoe.d(44, 44.0f, 8388659, 4.0f, -2.0f, 62.0f, 12.0f));
        frameLayout.addView(textView, qoe.d(-1, -2.0f, 8388659, 44.0f, 0.0f, 62.0f, 0.0f));
        int i2 = cmb.Ei;
        int v0 = cmb.v0(i2, this.J0);
        int L2 = gm.L(28.0f);
        p09 p09Var = new p09(2131624235, L2, L2, false, null);
        this.y1 = p09Var;
        this.G1 = !cmb.I.o();
        O0(cmb.I.o(), false);
        p09Var.E(true);
        p09Var.h = true;
        this.d2 = v0;
        p09Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        cj1 cj1Var = new cj1((byte) 1, getContext(), this);
        this.z1 = cj1Var;
        cj1Var.setAnimation(p09Var);
        cj1Var.setScaleType(ImageView.ScaleType.CENTER);
        cj1Var.setOnClickListener(new se2(this, (byte) 2));
        frameLayout.addView(cj1Var, qoe.d(44, 44.0f, 8388661, 0.0f, -2.0f, 7.0f, 0.0f));
        this.A1 = new v46(getContext());
        r59 r59Var = new r59(getContext(), null);
        this.v1 = r59Var;
        r59Var.setAdapter(gf2Var);
        r59Var.setDrawSelection(false);
        r59Var.setClipChildren(false);
        r59Var.setClipToPadding(false);
        r59Var.setHasFixedSize(true);
        r59Var.setItemAnimator(null);
        r59Var.setNestedScrollingEnabled(false);
        getContext();
        u46 u46Var = new u46(0, false);
        this.w1 = u46Var;
        r59Var.setLayoutManager(u46Var);
        r59Var.setPadding(gm.L(12.0f), 0, gm.L(12.0f), 0);
        r59Var.setOnItemClickListener(new u(this, (byte) 13));
        r59Var.setOnScrollListener(new y(this, (byte) 27));
        tk4 tk4Var = new tk4(getContext(), this.J0);
        this.x1 = tk4Var;
        tk4Var.setViewType(14);
        tk4Var.setVisibility(0);
        frameLayout.addView(tk4Var, qoe.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        frameLayout.addView(r59Var, qoe.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
        View view = new View(getContext());
        this.B1 = view;
        int L3 = gm.L(6.0f);
        int v02 = cmb.v0(i2, this.J0);
        int i3 = cmb.Gi;
        int v03 = cmb.v0(i3, this.J0);
        Drawable i0 = cmb.i0(L3, L3, L3, L3, v02, v03, v03);
        wmb M = anb.M(i2);
        wmb M2 = anb.M(i3);
        ylb ylbVar = this.J0;
        view.setBackground(i0);
        anb.j(view, i0, M, M2, ylbVar);
        view.setOnClickListener(new se2(this, (byte) 3));
        frameLayout.addView(view, qoe.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        TextView textView2 = new TextView(getContext());
        this.E1 = textView2;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        textView2.setGravity(17);
        textView2.setLines(1);
        textView2.setSingleLine(true);
        if (this.p1 == null) {
            textView2.setText(jb6.M0(2131752075, null));
        } else {
            textView2.setText(jb6.M0(2131752077, null));
        }
        textView2.setTextSize(1, 15.0f);
        textView2.setOnClickListener(new g6(this, (byte) 4));
        frameLayout.addView(textView2, qoe.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        io ioVar = new io(getContext(), true, true, true);
        this.C1 = ioVar;
        ioVar.getDrawable().q(true);
        ioVar.n = false;
        ioVar.setGravity(17);
        int i4 = cmb.Ii;
        anb.U(ioVar, i4, this.J0);
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setTypeface(gm.o());
        frameLayout.addView(ioVar, qoe.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        io ioVar2 = new io(getContext(), true, true, true);
        this.D1 = ioVar2;
        ioVar2.getDrawable().q(true);
        ioVar2.n = false;
        ioVar2.setGravity(17);
        anb.U(ioVar2, i4, this.J0);
        ioVar2.setTextSize(gm.L(12.0f));
        ioVar2.setAlpha(0.0f);
        ioVar2.setTranslationY(gm.L(11.0f));
        frameLayout.addView(ioVar2, qoe.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
        if (this.p1 != null) {
            TextView textView3 = new TextView(getContext());
            this.n1 = textView3;
            textView3.setEllipsize(truncateAt);
            textView3.setGravity(17);
            textView3.setLines(1);
            textView3.setSingleLine(true);
            textView3.setText(jb6.M0(2131745818, null));
            textView3.setTextSize(1, 15.0f);
            textView3.setOnClickListener(new rc1(this, yv1Var, (byte) 19));
            frameLayout.addView(textView3, qoe.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
            TextView textView4 = new TextView(getContext());
            this.o1 = textView4;
            textView4.setEllipsize(truncateAt);
            textView4.setGravity(17);
            textView4.setLines(1);
            textView4.setSingleLine(true);
            if (yv1Var.h() != null) {
                str = m9c.k(yv1Var.h(), true);
            } else {
                TLRPC.Chat chat = yv1Var.e;
                if (chat != null) {
                    str = chat.title;
                } else {
                    str = "";
                }
            }
            textView4.setText(jb6.a0("ChatThemeApplyHint", null, 2131752143, str));
            textView4.setTextSize(1, 15.0f);
            frameLayout.addView(textView4, qoe.d(-1, 48.0f, 8388611, 16.0f, 214.0f, 16.0f, 12.0f));
        }
        T0();
        U0(false);
    }

    public static bmb D0(boolean z) {
        SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
        String str = "Blue";
        String string = sharedPreferences.getString("lastDayTheme", "Blue");
        if (cmb.O0(string) != null && !cmb.O0(string).o()) {
            str = string;
        }
        String str2 = "Dark Blue";
        String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
        if (cmb.O0(string2) != null && cmb.O0(string2).o()) {
            str2 = string2;
        }
        if (z) {
            return cmb.O0(str2);
        }
        return cmb.O0(str);
    }

    public static void R0(vob vobVar) {
        if (vobVar == null) {
            return;
        }
        float width = vobVar.getWidth() / 2.0f;
        float max = Math.max(width, vobVar.getWidth() - width);
        float max2 = Math.max(0.0f, vobVar.getHeight() - 0.0f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(vobVar, vob.x, 0.0f, ((float) Math.sqrt((max2 * max2) + (max * max))) / 0.6f);
        ofFloat.setDuration(450L);
        ofFloat.setInterpolator(vt3.e);
        ofFloat.addListener(new b91(vobVar, (byte) 27));
        ofFloat.start();
    }

    public final void E0(boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if2.E0(boolean):void");
    }

    public final defpackage.vob F0() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if2.F0():vob");
    }

    public final void G0() {
        if (J0()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.J0, getContext());
            String M0 = jb6.M0(2131752133, null);
            he heVar = alertDialog$Builder.a;
            heVar.S = M0;
            heVar.U = jb6.M0(2131752134, null);
            alertDialog$Builder.j(jb6.M0(2131752136, null), new ee(this) {
                public final if2 b;

                {
                    this.b = this;
                }

                @Override
                public final void r(he heVar2, int i) {
                    byte b = r2;
                    if2 if2Var = this.b;
                    switch (b) {
                        case 0:
                            if2Var.E0(false);
                            return;
                        default:
                            if2Var.dismiss();
                            return;
                    }
                }
            });
            alertDialog$Builder.g(jb6.M0(2131752135, null), new ee(this) {
                public final if2 b;

                {
                    this.b = this;
                }

                @Override
                public final void r(he heVar2, int i) {
                    byte b = r2;
                    if2 if2Var = this.b;
                    switch (b) {
                        case 0:
                            if2Var.E0(false);
                            return;
                        default:
                            if2Var.dismiss();
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
            int v0 = cmb.v0(cmb.Ei, this.J0);
            p09 p09Var = this.y1;
            if (p09Var != null && v0 != this.d2) {
                this.d2 = v0;
                p09Var.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
            }
            ee0 ee0Var = this.m1;
            if (ee0Var != null) {
                int i = cmb.i5;
                ee0Var.a(cmb.v0(i, this.J0));
                ee0Var.b(cmb.v0(i, this.J0));
                ImageView imageView = this.l1;
                if (imageView != null) {
                    imageView.invalidate();
                }
            }
            int v02 = cmb.v0(cmb.g5, this.J0);
            if (v02 != this.e2) {
                this.e2 = v02;
                s0(v02);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void I0() {
        TLRPC.WallPaper wallPaper;
        if (!this.J && !this.H1) {
            cmb.b = false;
            if (J0()) {
                wallPaper = null;
            } else {
                wallPaper = this.r1.g;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            tz3 tz3Var = this.F1.a;
            boolean z = tz3Var.a;
            boolean z2 = this.G1;
            wv1 wv1Var = this.r1;
            if (z) {
                wv1Var.q(null, wallPaper2, false, Boolean.valueOf(z2), true);
            } else {
                wv1Var.q(tz3Var, wallPaper2, false, Boolean.valueOf(z2), true);
            }
            i22 i22Var = this.R1;
            if (i22Var != null) {
                h32 h32Var = i22Var.l2;
                if (h32Var != null) {
                    boolean z3 = this.G1;
                    kz0 kz0Var = h32Var.w;
                    ((ArrayList) kz0Var.e).clear();
                    WallpapersListActivity.A0((ArrayList) kz0Var.e, z3);
                    kz0Var.f();
                }
                this.R1.H0();
            }
            gf2 gf2Var = this.q1;
            if (gf2Var != null && gf2Var.d != null) {
                for (int i = 0; i < gf2Var.d.size(); i++) {
                    ((hf2) gf2Var.d.get(i)).c = this.G1 ? 1 : 0;
                }
                gf2Var.f();
            }
        }
    }

    public final boolean J0() {
        fnb fnbVar;
        if (this.F1 == null) {
            return false;
        }
        tz3 tz3Var = this.P1;
        fnb fnbVar2 = null;
        if (tz3Var != null) {
            fnbVar = tz3Var.c;
        } else {
            fnbVar = null;
        }
        if (fnbVar == null) {
            fnbVar = fnb.d("❌");
        }
        tz3 tz3Var2 = this.F1.a;
        if (tz3Var2 != null) {
            fnbVar2 = tz3Var2.c;
        }
        if (fnbVar2 == null) {
            fnbVar2 = fnb.d("❌");
        }
        return !fnb.a(fnbVar, fnbVar2);
    }

    public final void K0() {
        ArrayList arrayList;
        if (!this.U1) {
            uf2 e = uf2.e(this.a);
            if (e.f.c && (arrayList = e.b) != null && !arrayList.isEmpty()) {
                return;
            }
            boolean z = true;
            this.U1 = true;
            if (e.f.c) {
                e.o(new ef2(this, e), false);
                return;
            }
            ff2 ff2Var = new ff2(this, e);
            long currentTimeMillis = System.currentTimeMillis();
            tf2 tf2Var = e.f;
            if (currentTimeMillis - tf2Var.b <= 7200000) {
                z = false;
            }
            if (((ArrayList) tf2Var.d) != null && tf2Var.c && !z) {
                return;
            }
            TL_account.Tl_getUniqueGiftChatThemes tl_getUniqueGiftChatThemes = new TL_account.Tl_getUniqueGiftChatThemes();
            tf2 tf2Var2 = e.f;
            tl_getUniqueGiftChatThemes.offset = (String) tf2Var2.e;
            tl_getUniqueGiftChatThemes.hash = tf2Var2.a;
            tl_getUniqueGiftChatThemes.limit = 50;
            ConnectionsManager connectionsManager = e.getConnectionsManager();
            mp3 mp3Var = uf2.s;
            Objects.requireNonNull(mp3Var);
            connectionsManager.sendRequestTyped(tl_getUniqueGiftChatThemes, new rf2(mp3Var, (byte) 0), new lf2(e, ff2Var, (byte) 0));
        }
    }

    public final void L0(ArrayList arrayList) {
        fnb fnbVar;
        if (arrayList.isEmpty()) {
            return;
        }
        hf2 hf2Var = new hf2((tz3) arrayList.get(0));
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        if (!this.O1) {
            tz3 tz3Var = this.r1.f;
            this.P1 = tz3Var;
            if (tz3Var != null) {
                tz3Var.k();
            }
        }
        arrayList2.add(0, hf2Var);
        if (!this.O1) {
            this.F1 = hf2Var;
        }
        tz3 tz3Var2 = this.P1;
        if (tz3Var2 != null) {
            fnbVar = tz3Var2.c;
        } else {
            fnbVar = null;
        }
        boolean z = false;
        int i = 1;
        while (i < arrayList.size()) {
            tz3 tz3Var3 = (tz3) arrayList.get(i);
            hf2 hf2Var2 = new hf2(tz3Var3);
            tz3Var3.m(this.a);
            hf2Var2.c = this.G1 ? 1 : 0;
            if (fnb.a(tz3Var3.c, fnbVar)) {
                arrayList2.add(1, hf2Var2);
                z = true;
            } else {
                arrayList2.add(hf2Var2);
            }
            i++;
            z = z;
        }
        tz3 tz3Var4 = this.P1;
        if (tz3Var4 != null && !z) {
            hf2 hf2Var3 = new hf2(tz3Var4);
            tz3Var4.m(this.a);
            hf2Var3.c = this.G1 ? 1 : 0;
            arrayList2.add(1, hf2Var3);
        }
        gf2 gf2Var = this.q1;
        gf2Var.d = arrayList2;
        gf2Var.f();
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
            tz3 tz3Var = this.F1.a;
            boolean z = tz3Var.a;
            boolean z2 = this.G1;
            wv1 wv1Var = this.r1;
            if (z) {
                wv1Var.q(null, wallPaper2, true, Boolean.valueOf(z2), false);
            } else {
                wv1Var.q(tz3Var, wallPaper2, true, Boolean.valueOf(z2), false);
            }
        }
    }

    public final void N0(boolean z) {
        gf2 gf2Var = this.q1;
        ArrayList arrayList = gf2Var.d;
        tz3 tz3Var = this.P1;
        u46 u46Var = this.w1;
        r59 r59Var = this.v1;
        if (tz3Var != null) {
            int i = 0;
            while (true) {
                if (i != arrayList.size()) {
                    if (fnb.a(((hf2) arrayList.get(i)).a.c, this.P1.c)) {
                        this.F1 = (hf2) arrayList.get(i);
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
                gf2Var.E(i);
                if (i > 0 && i < arrayList.size() / 2) {
                    i--;
                }
                int min = Math.min(i, gf2Var.d.size() - 1);
                if (z) {
                    r59Var.z0(min);
                } else {
                    u46Var.g1(min, 0);
                }
            }
        } else {
            this.F1 = (hf2) arrayList.get(0);
            gf2Var.E(0);
            if (z) {
                r59Var.z0(0);
            } else {
                u46Var.g1(0, 0);
            }
        }
        M0();
    }

    public final void O0(boolean z, boolean z2) {
        int i;
        if (this.G1 != z) {
            this.G1 = z;
            cj1 cj1Var = this.z1;
            p09 p09Var = this.y1;
            int i2 = 0;
            if (z2) {
                if (z) {
                    i2 = p09Var.e[0];
                }
                p09Var.K(i2);
                if (cj1Var != null) {
                    cj1Var.d();
                    return;
                }
                return;
            }
            if (z) {
                i = p09Var.e[0] - 1;
            } else {
                i = 0;
            }
            p09Var.I(i, false, true);
            p09Var.K(i);
            if (cj1Var != null) {
                cj1Var.invalidate();
            }
        }
    }

    public final void P0(boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if2.P0(boolean):void");
    }

    public final void Q0(rob robVar) {
        ?? obj = new Object();
        obj.a = true;
        yv1 yv1Var = this.u1;
        robVar.a.a = yv1Var.getResourceProvider();
        robVar.r1 = new cf2(this);
        obj.c = new jd((byte) 24);
        obj.d = new re2(this, (byte) 5);
        obj.b = new re2(this, (byte) 6);
        obj.e = true;
        this.Q1 = robVar;
        yv1Var.showAsSheet(robVar, obj);
    }

    @Override
    public final ArrayList R() {
        ve2 ve2Var = new ve2(this);
        ArrayList arrayList = new ArrayList();
        if (this.u1.w7) {
            d dVar = this.Q1;
            if (dVar instanceof rob) {
                arrayList.addAll(((rob) dVar).U0());
                return arrayList;
            }
        }
        i22 i22Var = this.R1;
        if (i22Var != null) {
            arrayList.addAll(i22Var.R());
        }
        int i = 0;
        arrayList.add(new cnb((View) null, 32, (Class[]) null, (Paint) null, new Drawable[]{this.s0}, ve2Var, cmb.g5));
        int i2 = cmb.Ei;
        View view = this.B1;
        arrayList.add(new cnb(view, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, i2));
        arrayList.add(new cnb(view, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (bnb) null, cmb.Gi));
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cnb) obj).n = this.r1;
        }
        return arrayList;
    }

    public final void S0(bmb bmbVar) {
        if (bmbVar != null && bmbVar != cmb.I) {
            this.b2 = true;
            try {
                nm7.e().k(nm7.x4, bmbVar, Boolean.FALSE, null, -1);
            } finally {
                this.b2 = false;
            }
        }
    }

    public final void T0() {
        TextView textView = this.o1;
        if (textView != null) {
            anb.X(textView, cmb.o5, this.J0);
            int L = gm.L(6.0f);
            int i = cmb.Ei;
            int p = on2.p(cmb.v0(i, this.J0), 76);
            fg0 i0 = cmb.i0(L, L, L, L, 0, p, p);
            wmb g = anb.g(i, 76);
            ylb ylbVar = this.J0;
            textView.setBackground(i0);
            anb.j(textView, i0, null, g, ylbVar);
        }
        TextView textView2 = this.n1;
        if (textView2 != null) {
            int i2 = cmb.o7;
            anb.X(textView2, i2, this.J0);
            int L2 = gm.L(6.0f);
            int p2 = on2.p(cmb.v0(i2, this.J0), 76);
            fg0 i02 = cmb.i0(L2, L2, L2, L2, 0, p2, p2);
            wmb g2 = anb.g(i2, 76);
            ylb ylbVar2 = this.J0;
            textView2.setBackground(i02);
            anb.j(textView2, i02, null, g2, ylbVar2);
        }
        int i3 = cmb.i5;
        fg0 f0 = cmb.f0(on2.p(cmb.v0(i3, this.J0), 30), 1, -1);
        wmb g3 = anb.g(i3, 30);
        ylb ylbVar3 = this.J0;
        ImageView imageView = this.l1;
        anb.R(imageView, f0, null, g3, ylbVar3);
        int v0 = cmb.v0(i3, this.J0);
        ee0 ee0Var = this.m1;
        ee0Var.a(v0);
        ee0Var.b(cmb.v0(i3, this.J0));
        imageView.invalidate();
        int i4 = cmb.Ei;
        anb.R(this.z1, cmb.f0(on2.p(cmb.v0(i4, this.J0), 30), 1, -1), null, anb.g(i4, 30), this.J0);
        int i5 = cmb.l5;
        ylb ylbVar4 = this.J0;
        TextView textView3 = this.E1;
        anb.X(textView3, i5, ylbVar4);
        int L3 = gm.L(6.0f);
        int p3 = on2.p(cmb.v0(i4, this.J0), 76);
        anb.R(textView3, cmb.i0(L3, L3, L3, L3, 0, p3, p3), null, anb.g(i4, 76), this.J0);
    }

    public final void U0(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if2.U0(boolean):void");
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
        ig5 ig5Var = this.N1;
        if (ig5Var != null) {
            ig5Var.a();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == nm7.m4) {
            nm7.f(this.a).d(new re2(this, (byte) 0));
        }
    }

    @Override
    public final void dismiss() {
        vob vobVar;
        bmb D0;
        boolean z;
        nm7.e().n(this, nm7.m4);
        super.dismiss();
        this.u1.getClass();
        boolean z2 = this.H1;
        boolean z3 = this.t1;
        if (!z2 && this.G1 != z3) {
            vobVar = F0();
        } else {
            vobVar = null;
        }
        if (!this.H1) {
            wv1 wv1Var = this.r1;
            TLRPC.WallPaper wallPaper = wv1Var.g;
            if (wallPaper == null) {
                wallPaper = this.p1;
            }
            TLRPC.WallPaper wallPaper2 = wallPaper;
            if (vobVar == null) {
                z = true;
            } else {
                z = false;
            }
            wv1Var.q(this.s1, wallPaper2, z, Boolean.valueOf(z3), false);
        }
        if (this.G1 != z3) {
            if (cmb.I.o() == z3) {
                D0 = cmb.I;
            } else {
                D0 = D0(z3);
            }
            if (this.c2) {
                S0(D0);
            } else {
                cmb.t(D0, false, z3);
            }
        }
        this.c2 = false;
        R0(vobVar);
    }

    @Override
    public final void onBackPressed() {
        G0();
    }

    @Override
    public final void onCreate(Bundle bundle) {
        ArrayList arrayList;
        super.onCreate(bundle);
        uf2 e = uf2.e(this.a);
        e.k(true);
        e.k(false);
        e.j(true);
        e.j(false);
        nm7.e().b(this, nm7.m4);
        this.H1 = false;
        if (e.f.c && (arrayList = e.b) != null && !arrayList.isEmpty()) {
            L0(e.d(7));
        } else {
            K0();
        }
        if (this.u1.h() != null && gda.a1 > 0 && !this.u1.h().self) {
            gda.a1--;
            a.b.getSharedPreferences("mainconfig", 0).edit().putInt("dayNightThemeSwitchHintCount", gda.a1).apply();
            ig5 ig5Var = new ig5(9, this.u1.getResourceProvider(), getContext(), false);
            this.N1 = ig5Var;
            ig5Var.setVisibility(4);
            this.N1.setShowingDuration(5000L);
            this.N1.setBottomOffset(-gm.L(8.0f));
            boolean z = this.G1;
            ig5 ig5Var2 = this.N1;
            if (z) {
                ig5Var2.setText(gm.S2(jb6.a0("ChatThemeDaySwitchTooltip", null, 2131752140, new Object[0])));
            } else {
                ig5Var2.setText(gm.S2(jb6.a0("ChatThemeNightSwitchTooltip", null, 2131752137, new Object[0])));
            }
            gm.d3(new re2(this, (byte) 7), 1500L);
            this.c.addView(this.N1, qoe.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        }
    }

    @Override
    public final void p0() {
        int v0;
        super.p0();
        H0();
        try {
            if (Build.VERSION.SDK_INT >= 30 && this.G0 == -1 && this.H0 != (v0 = cmb.v0(cmb.h5, this.J0))) {
                this.H0 = v0;
                boolean z = false;
                gm.o3(this, v0, false, null);
                if (gm.B(v0) > 0.721d) {
                    z = true;
                }
                gm.i3(this, z);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void z(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.h5));
    }
}
