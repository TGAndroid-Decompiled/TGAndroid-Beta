package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class tq8 extends FrameLayout implements gk7 {
    public static final HashMap V = new HashMap();
    public final LinearLayout E;
    public final TextView F;
    public final wf2 G;
    public final FrameLayout H;
    public int I;
    public cs5 J;
    public SpannableStringBuilder K;
    public int L;
    public int M;
    public int N;
    public qw4 O;
    public boolean P;
    public int Q;
    public final tp8 R;
    public final fm0 S;
    public int T;
    public int U;
    public final d a;
    public final int b;
    public final long c;
    public final xsa d;
    public final wsa e;
    public final wjb f;
    public final uq0 h;
    public final vec n;
    public final FrameLayout r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public final u41 x;
    public byte y;

    public tq8(org.telegram.ui.ActionBar.d r31, android.content.Context r32, int r33, long r34, defpackage.wjb r36, defpackage.kl0 r37) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tq8.<init>(org.telegram.ui.ActionBar.d, android.content.Context, int, long, wjb, kl0):void");
    }

    public static void j(a8 a8Var, final xsa xsaVar, final Runnable runnable, final int i) {
        a8Var.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                int i2;
                xsa xsaVar2 = xsa.this;
                xsaVar2.getClass();
                short s = i;
                if ((s & 15) != 0) {
                    i2 = 15;
                } else if ((s & 768) != 0) {
                    i2 = 768;
                } else {
                    i2 = 0;
                }
                int i3 = xsaVar2.g & i2;
                int flag = TLObject.setFlag(i3, s, !TLObject.hasFlag(i3, s));
                if (flag == 0) {
                    flag = i2 & (~s);
                }
                int i4 = xsaVar2.g;
                int i5 = ((~i2) & i4) | flag;
                if (i4 != i5) {
                    xsaVar2.g = i5;
                    xsaVar2.k(true);
                }
                runnable.run();
            }
        });
        a8Var.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                xsa.this.g(i, true);
                runnable.run();
                return true;
            }
        });
    }

    public final void a() {
        xsa xsaVar;
        pq8 currentPage = getCurrentPage();
        if (currentPage != null && (xsaVar = currentPage.e) != null && currentPage.d) {
            int i = xsaVar.d;
            new ny9(this.a, this.c, i, new a61(this, i, currentPage, (byte) 3)).show();
        }
    }

    public final boolean b() {
        wsa wsaVar = this.e;
        if (wsaVar.h() && wsaVar.d().size() < na7.q1(this.b).k4.x.f()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        long j = this.c;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i2 = this.b;
        if (i >= 0) {
            if (i != 0 && j != y6c.h(i2).e()) {
                return false;
            }
            return true;
        }
        return hc2.w(5, na7.q1(i2).K0(Long.valueOf(-j)));
    }

    public final boolean d() {
        if (this.c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3;
        int i4;
        int i5 = kk7.H3;
        LinearLayout linearLayout = this.E;
        u41 u41Var = this.x;
        long j = this.c;
        int i6 = 8;
        if (i == i5) {
            if (((Long) objArr[0]).longValue() == j) {
                if (d()) {
                    i4 = 8;
                } else {
                    i4 = 0;
                }
                u41Var.setVisibility(i4);
                if (d()) {
                    i6 = 0;
                }
                linearLayout.setVisibility(i6);
                this.y = (byte) 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.G.a(bool.booleanValue(), true);
                }
            }
        } else if (i == kk7.I3) {
            if (((Long) objArr[0]).longValue() == j) {
                f(true);
                o();
            }
        } else if (i == 2) {
            if (d()) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            u41Var.setVisibility(i3);
            if (d()) {
                i6 = 0;
            }
            linearLayout.setVisibility(i6);
            this.y = (byte) 60;
            setVisibleHeight(this.U);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.Q > 0) {
            ArrayList d = this.e.d();
            int i = 0;
            while (true) {
                if (i < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i)).collection_id == this.Q) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i);
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            if (i >= 0 && tL_starGiftCollection != null) {
                this.Q = 0;
                this.n.e(tL_starGiftCollection.collection_id, i + 1);
            }
        }
    }

    public final void f(boolean z) {
        uq0 uq0Var = this.h;
        if (uq0Var != null && this.n != null) {
            uq0Var.m(z);
            e();
        }
    }

    public final boolean g() {
        if (this.P) {
            return true;
        }
        pq8 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.h) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.r;
        float translationY = frameLayout.getTranslationY() - ls6.x(this.y, Math.max(gl.L(240.0f), this.U) + (-frameLayout.getTop()), 1);
        if (this.U < gl.L(240.0f)) {
            translationY += Math.min(gl.L(240.0f) - this.U, gl.L(this.y));
        }
        return (int) (gl.L(this.y) - translationY);
    }

    public xsa getCurrentList() {
        pq8 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.e;
        }
        return this.d;
    }

    public o39 getCurrentListView() {
        pq8 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f;
        }
        return null;
    }

    public pq8 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (pq8) currentView;
    }

    public int getGiftsCount() {
        int i;
        xsa xsaVar;
        int i2;
        pq8 currentPage = getCurrentPage();
        xsa xsaVar2 = this.d;
        if (currentPage != null && (xsaVar = currentPage.e) != xsaVar2) {
            if (xsaVar != null && (i2 = xsaVar.n) > 0) {
                return i2;
            }
        } else if (xsaVar2 != null && (i = xsaVar2.n) > 0) {
            return i;
        }
        long j = this.c;
        int i3 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        int i4 = this.b;
        if (i3 >= 0) {
            TLRPC.UserFull W1 = na7.q1(i4).W1(j);
            if (W1 == null) {
                return 0;
            }
            return W1.stargifts_count;
        }
        TLRPC.ChatFull L0 = na7.q1(i4).L0(-j);
        if (L0 == null) {
            return 0;
        }
        return L0.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j = 0;
        xsa xsaVar = this.d;
        if (xsaVar != null && !xsaVar.l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i = 0;
            for (int i2 = 0; i < 3 && i2 < xsaVar.l.size(); i2++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) xsaVar.l.get(i2)).gift.getDocument();
                if (document != null && hashSet.add(Long.valueOf(document.id))) {
                    j = Objects.hash(Long.valueOf(j), Long.valueOf(document.id));
                    i++;
                }
            }
        }
        return j;
    }

    public float getTabsHeight() {
        View[] viewPages;
        uq0 uq0Var = this.h;
        float f = 0.0f;
        if (uq0Var.getViewPages() != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof pq8) {
                    f = (((pq8) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f;
                }
            }
        }
        return f;
    }

    public float getTabsVisibility() {
        vec vecVar = this.n;
        if (vecVar != null) {
            return vecVar.getAlpha();
        }
        return 0.0f;
    }

    public final void h(p8c p8cVar, String str) {
        View view;
        int i;
        xr5 xr5Var;
        Context context = getContext();
        Activity W = gl.W(context);
        if (W != null) {
            view = W.getCurrentFocus();
        } else {
            view = null;
        }
        hd[] hdVarArr = new hd[1];
        wjb wjbVar = this.f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar, context);
        hd hdVar = alertDialog$Builder.a;
        if (str != null) {
            hdVar.S = k96.M0(2131750199, null);
        } else {
            hdVar.S = k96.M0(2131750079, null);
            hdVar.U = k96.M0(2131750080, null);
        }
        dq8 dq8Var = new dq8(this, context, wjbVar);
        dq8Var.s0 = true;
        dq8Var.setOnEditorActionListener(new xu0(dq8Var, p8cVar, hdVarArr, view, (byte) 1));
        hq6.d0(this.b).O(gl.F0(), true);
        dq8Var.setTextSize(1, 18.0f);
        zkb.X(dq8Var, bkb.i5, wjbVar);
        zkb.l(dq8Var, 34, bkb.Ni, wjbVar);
        dq8Var.setHintText(k96.M0(2131750081, null));
        dq8Var.setFocusable(true);
        dq8Var.setInputType(147457);
        zkb.F(dq8Var, bkb.j6, bkb.k6, bkb.o7, wjbVar);
        dq8Var.setImeOptions(6);
        dq8Var.setBackgroundDrawable(null);
        dq8Var.setPadding(0, gl.L(6.0f), 0, gl.L(6.0f));
        dq8Var.addTextChangedListener(new fd6(dq8Var, (byte) 1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        dq8Var.setText(str);
        linearLayout.addView(dq8Var, nme.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.b();
        alertDialog$Builder.n(linearLayout);
        hdVar.a = gl.L(292.0f);
        if (str != null) {
            i = 2131751323;
        } else {
            i = 2131751741;
        }
        alertDialog$Builder.j(k96.M0(i, null), new dx6(dq8Var, p8cVar, (byte) 29));
        alertDialog$Builder.g(k96.M0(2131752577, null), new sc8((byte) 5));
        hdVarArr[0] = hdVar;
        cs5 cs5Var = this.J;
        if (cs5Var != null && (xr5Var = cs5Var.m) != null) {
            xr5Var.setSoftInputMode(48);
        }
        gl.U2(W, this.a.getClassGuid());
        hdVarArr[0].setOnDismissListener(new ag(this, dq8Var, W, (byte) 6));
        hdVarArr[0].setOnShowListener(new jg(dq8Var, (byte) 5));
        hdVarArr[0].show();
        hd hdVar2 = hdVarArr[0];
        hdVar2.k0 = false;
        hdVar2.c(-1);
        dq8Var.setSelection(dq8Var.getText().length());
    }

    public final void i() {
        pq8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i) {
        xsa xsaVar;
        if (i == 0) {
            return false;
        }
        int i2 = i - 1;
        if (i2 >= 0) {
            wsa wsaVar = this.e;
            if (i2 < wsaVar.d().size()) {
                if (i2 >= 0 && i2 < wsaVar.d().size()) {
                    xsaVar = wsaVar.e(((TL_stars.TL_starGiftCollection) wsaVar.d().get(i2)).collection_id);
                } else {
                    xsaVar = null;
                }
                if (xsaVar != null) {
                    return xsaVar.l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float f;
        float f2;
        float nextPositionAlpha;
        boolean z;
        SpannableStringBuilder spannableStringBuilder;
        q11 q11Var;
        uq0 uq0Var = this.h;
        if (uq0Var != null) {
            if (uq0Var.getCurrentPosition() == uq0Var.getNextPosition()) {
                if (k(uq0Var.getCurrentPosition())) {
                    nextPositionAlpha = 1.0f;
                } else {
                    nextPositionAlpha = 0.0f;
                }
            } else {
                if (k(uq0Var.getCurrentPosition())) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                float currentPositionAlpha = uq0Var.getCurrentPositionAlpha() * f;
                if (k(uq0Var.getNextPosition())) {
                    f2 = 1.0f;
                } else {
                    f2 = 0.0f;
                }
                nextPositionAlpha = (uq0Var.getNextPositionAlpha() * f2) + currentPositionAlpha;
            }
            FrameLayout frameLayout = this.r;
            float x = ls6.x(this.y, (-frameLayout.getTop()) + this.U, 1);
            float L = ((gl.L(68.0f) + 2) * nextPositionAlpha) + x;
            int i = 0;
            if (this.U > gl.L(184.0f)) {
                z = true;
            } else {
                z = false;
            }
            fm0 fm0Var = this.S;
            fm0Var.a(z, true);
            float f3 = fm0Var.e;
            float R1 = gl.R1(gl.L(60.0f) + x, (gl.L(16.0f) * nextPositionAlpha) + x, f3);
            float f4 = (1.0f - nextPositionAlpha) * f3;
            this.H.setTranslationY(gl.R1(gl.L(60.0f) + L, L, f3) - gl.L(200.0f));
            frameLayout.setTranslationY(R1 - this.T);
            frameLayout.setAlpha(f4);
            if (f4 <= 0.0f) {
                i = 4;
            }
            frameLayout.setVisibility(i);
            if (this.e.h() && uq0Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.w;
            } else {
                spannableStringBuilder = this.s;
            }
            this.x.i(spannableStringBuilder, true, true);
            m21 m21Var = m21.w;
            if (m21Var != null && (q11Var = m21Var.e) != null) {
                q11Var.updatePosition();
            }
        }
    }

    public final void m() {
        u41 u41Var = this.x;
        u41Var.updateColors();
        int i = bkb.Ei;
        wjb wjbVar = this.f;
        int c1 = ((lca) this).W.c1(bkb.v0(i, wjbVar));
        if (u41Var.getBackground() instanceof ShapeDrawable) {
            if (((ShapeDrawable) u41Var.getBackground()).getPaint().getColor() != c1) {
                bkb.A1(c1, u41Var.getBackground());
                u41Var.invalidate();
            }
        } else {
            u41Var.setBackground(bkb.b0(gl.L(19.0f), c1));
        }
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    pq8 pq8Var = (pq8) view;
                    wjb wjbVar2 = pq8Var.c;
                    if (pq8Var.r != null) {
                        pq8Var.w.setTextColor(bkb.v0(bkb.F6, wjbVar2));
                        pq8Var.x.setTextColor(bkb.v0(bkb.Ei, wjbVar2));
                    } else {
                        pq8Var.F.setTextColor(bkb.v0(bkb.F6, wjbVar2));
                        pq8Var.G.setTextColor(bkb.v0(bkb.x6, wjbVar2));
                        pq8Var.H.updateColors();
                    }
                }
            }
        }
        this.F.setTextColor(bkb.v0(bkb.i5, wjbVar));
    }

    public final void n() {
        View[] viewPages;
        for (View view : this.h.getViewPages()) {
            if (view instanceof pq8) {
                pq8 pq8Var = (pq8) view;
                va vaVar = pq8Var.f;
                int paddingTop = vaVar.getPaddingTop();
                pq8Var.g();
                int paddingTop2 = paddingTop - vaVar.getPaddingTop();
                if (paddingTop2 != 0) {
                    gl.J(vaVar, new zp8(pq8Var, paddingTop2, (byte) 0));
                }
            }
        }
    }

    public final void o() {
        boolean z;
        View[] viewPages;
        if (this.e.d().isEmpty() && !b()) {
            z = false;
        } else {
            z = true;
        }
        uq0 uq0Var = this.h;
        if (uq0Var.getViewPages() != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof pq8) {
                    ((pq8) view).setHasTabs(z);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = this.b;
        kk7.f(i).b(this, kk7.H3);
        kk7.f(i).b(this, kk7.I3);
        kk7.f(i).b(this, 2);
        pq8 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        o();
        xsa xsaVar = this.d;
        if (xsaVar != null) {
            xsaVar.o = true;
            xsaVar.a();
        }
        wsa wsaVar = this.e;
        if (wsaVar != null) {
            wsaVar.j = true;
            wsaVar.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        pq8 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i = this.b;
        kk7.f(i).n(this, kk7.H3);
        kk7.f(i).n(this, kk7.I3);
        kk7.f(i).n(this, 2);
        xsa xsaVar = this.d;
        if (xsaVar != null) {
            xsaVar.o = false;
        }
        wsa wsaVar = this.e;
        if (wsaVar != null) {
            wsaVar.j = false;
        }
    }

    public final void p() {
        float f;
        View[] viewPages;
        float f2;
        vec vecVar = this.n;
        if (vecVar == null) {
            return;
        }
        float min = Math.min(this.L, getTabsHeight() - gl.L(42.0f));
        float l = Utilities.l(gl.x1(min - this.L, -gl.L(42.0f), 0.0f));
        float R1 = gl.R1(0.9f, 1.0f, l);
        vecVar.setTranslationY(min);
        vecVar.setScaleX(R1);
        vecVar.setScaleY(R1);
        uq0 uq0Var = this.h;
        if (uq0Var.getViewPages() != null) {
            f = 0.0f;
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof pq8) {
                    if (((pq8) view).I) {
                        f2 = 1.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    f += f2;
                }
            }
        } else {
            f = 0.0f;
        }
        vecVar.setAlpha(moe.a(f, 0.0f, 1.0f) * l);
    }

    public abstract void q(boolean z);

    public void setButtonOffset(int i) {
        if (this.T != i) {
            this.T = i;
            l();
        }
    }

    public void setGlassEngine(qw4 qw4Var) {
        View[] viewPages;
        this.O = qw4Var;
        uq0 uq0Var = this.h;
        qw4Var.c(uq0Var);
        for (View view : uq0Var.getViewPages()) {
            if (view instanceof pq8) {
                qw4Var.b(((pq8) view).f);
            }
        }
    }

    public void setPaddingTop(int i) {
        if (this.L != i) {
            this.L = i;
            n();
            p();
            l();
        }
    }

    public void setReordering(boolean z) {
        pq8 currentPage = getCurrentPage();
        if (currentPage != null) {
            pq8.a(currentPage, z);
        }
    }

    public void setReorderingCollections(boolean z) {
        if (this.P != z) {
            this.P = z;
            q(g());
            this.n.setReordering(z);
            if (z) {
                d S = LaunchActivity.S();
                if (S instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) S;
                    profileActivity.j3(false);
                    gl.c3(new v36(profileActivity, (byte) 28));
                }
            }
            if (!z) {
                tp8 tp8Var = this.R;
                gl.r(tp8Var);
                gl.c3(tp8Var);
            }
        }
    }

    public void setVisibleHeight(int i) {
        View[] viewPages;
        this.U = i;
        l();
        uq0 uq0Var = this.h;
        if (uq0Var != null) {
            for (View view : uq0Var.getViewPages()) {
                if (view instanceof pq8) {
                    ((pq8) view).setVisibleHeight(this.U);
                }
            }
        }
    }
}
