package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.zt0;
import w7.a6;
import zh.s4;
public final class a0 extends FrameLayout {
    public static final int f410a0 = 0;
    public final t E;
    public final bi.d F;
    public final s4.y G;
    public boolean H;
    public boolean I;
    public final x J;
    public boolean K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public float P;
    public float Q;
    public boolean R;
    public int S;
    public int T;
    public int U;
    public final Rect V;
    public final vr0 W;
    public s4 f411a;
    public boolean f412b;
    public float f413c;
    public int d;
    public int e;
    public final o f414f;
    public final n h;
    public final s4.j f415n;
    public final zt0 f416r;
    public final q f417s;
    public final r v;
    public final z f418w;
    public final s f419x;
    public final jx0 f420y;

    public a0(vr0 vr0Var, Context context) {
        super(context);
        this.W = vr0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        n nVar = new n();
        this.h = nVar;
        nVar.O = new l(this, 1);
        nVar.y1(this.d);
        s4.j jVar = new s4.j();
        this.f415n = jVar;
        jVar.n(280L);
        jVar.o(wr.h);
        jVar.f41645m = false;
        o oVar = new o(this, context);
        this.f414f = oVar;
        oVar.setScrollingTouchSlop(1);
        oVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        oVar.setPadding(0, 0, 0, 0);
        oVar.setItemAnimator(null);
        oVar.setClipToPadding(false);
        oVar.setSectionsType(2);
        oVar.setLayoutManager(nVar);
        addView(oVar, a6.c(-1.0f, -1));
        oVar.i(new p(this, 0));
        oVar.setOnItemClickListener(new g(this, 0));
        oVar.setOnItemLongClickListener(new a1.c(this, 3));
        ?? vl0Var = new vl0(context, null);
        this.f416r = vl0Var;
        q qVar = new q(this);
        this.f417s = qVar;
        vl0Var.setLayoutManager(qVar);
        vl0Var.i(new p(this, 1));
        qVar.y1(this.e);
        vl0Var.setVisibility(8);
        addView((View) vl0Var, a6.c(-1.0f, -1));
        r rVar = new r(this, context);
        this.v = rVar;
        oVar.setAdapter(rVar);
        z zVar = new z(this, getContext());
        rVar.f476f = zVar;
        this.f418w = zVar;
        vl0Var.setAdapter(zVar);
        s sVar = new s(this, context);
        this.f419x = sVar;
        sVar.f21345w = false;
        jx0 jx0Var = new jx0(context, sVar, 1, null);
        this.f420y = jx0Var;
        jx0Var.setVisibility(8);
        jx0Var.setAnimateLayoutChange(true);
        addView(jx0Var, a6.c(-1.0f, -1));
        jx0Var.setOnTouchListener(new h(0));
        jx0Var.e(true, false);
        jx0Var.f24510b.setVisibility(8);
        jx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        jx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(vr0Var.f443b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        bi.d dVar = jx0Var.f24512f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new i(this, 0));
        t tVar = new t(this, context);
        this.E = tVar;
        int i10 = j6.f18306y6;
        f6 f6Var = vr0Var.f444c;
        tVar.setTextColor(j6.v0(i10, f6Var));
        tVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        tVar.setTextSize(1, 14.0f);
        tVar.setTextAlignment(4);
        tVar.setGravity(17);
        tVar.setTypeface(AndroidUtilities.bold());
        jx0Var.f24509a.addView(tVar, a6.t(165, -2, 17, 0, 17, 0, 12));
        bi.d dVar2 = new bi.d(context, f6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        jx0Var.f24509a.addView(dVar2, a6.q(-2, 44, 17));
        jx0Var.addView(sVar, 0, a6.c(-1.0f, -1));
        oVar.setEmptyView(jx0Var);
        oVar.Y1 = true;
        oVar.Z1 = 0;
        new SparseArray();
        new HashMap();
        s4.y yVar = new s4.y(new k(this, 0));
        this.G = yVar;
        yVar.d(oVar);
        x xVar = new x(context, f6Var);
        this.J = xVar;
        addView(xVar, a6.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f412b) {
            float f7 = this.f413c;
            zt0 zt0Var = this.f416r;
            float f10 = 1.0f;
            o oVar = this.f414f;
            if (f7 == 1.0f) {
                this.f412b = false;
                int i10 = this.e;
                this.d = i10;
                this.W.f451y = i10;
                SharedConfig.setStoriesColumnsCount(i10);
                r rVar = this.v;
                int h = rVar.h();
                zt0Var.setVisibility(8);
                int i11 = this.d;
                n nVar = this.h;
                nVar.y1(i11);
                oVar.a0();
                oVar.invalidate();
                if (rVar.h() == h) {
                    AndroidUtilities.updateVisibleRows(oVar);
                } else {
                    rVar.l();
                }
                int i12 = this.S;
                if (i12 >= 0) {
                    View m10 = this.f417s.m(i12);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    nVar.h1(this.S, (-oVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f412b = false;
                zt0Var.setVisibility(8);
                oVar.invalidate();
            } else {
                if (f7 > 0.2f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, f10);
                ofFloat.addUpdateListener(new m(this, 0));
                ofFloat.addListener(new e(1, this, z10));
                ofFloat.setInterpolator(wr.f28819f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f412b && !this.W.G.C1) {
            int i12 = this.d;
            if (!z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i13 = i12 + i10;
            if (i13 > 6) {
                if (!z10) {
                    i13 = 9;
                } else {
                    i13 = 6;
                }
            }
            if (this.H) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            int clamp = Utilities.clamp(i13, 6, i11);
            this.e = clamp;
            if (clamp != this.d && !this.H) {
                zt0 zt0Var = this.f416r;
                zt0Var.setVisibility(0);
                zt0Var.setAdapter(this.f418w);
                zt0Var.setPadding(zt0Var.getPaddingLeft(), 0, zt0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                q qVar = this.f417s;
                qVar.y1(clamp);
                zt0Var.a0();
                qVar.O = new l(this, 0);
                AndroidUtilities.updateVisibleRows(this.f414f);
                this.f412b = true;
                this.f413c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    qVar.h1(i14, this.T - zt0Var.getPaddingTop());
                }
            }
        }
    }

    public final void c() {
        int size;
        boolean z10;
        int i10;
        String formatString;
        int i11;
        String string;
        j jVar;
        int i12 = this.W.f443b;
        s4 s4Var = this.f411a;
        int i13 = 0;
        if (s4Var == null) {
            size = 0;
        } else {
            size = s4Var.f48240i.size();
        }
        s4 s4Var2 = this.f411a;
        if (s4Var2 != null && !TextUtils.isEmpty(s4Var2.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (size > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        x xVar = this.J;
        xVar.setVisibility(i10);
        if (z10) {
            formatString = LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral);
        } else {
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, i41.D(this.f411a.E, null, null));
        }
        String string2 = LocaleController.getString(R.string.ProfileBotAddPreview);
        a3.d dVar = new a3.d(this, 3);
        if (!z10 && size > 0) {
            string = null;
        } else {
            if (z10) {
                i11 = R.string.ProfileBotPreviewFooterCreateTranslation;
            } else {
                i11 = R.string.ProfileBotPreviewFooterDeleteTranslation;
            }
            string = LocaleController.getString(i11);
        }
        if (!z10 && size > 0) {
            jVar = null;
        } else {
            jVar = new j(0, this, z10);
        }
        t tVar = xVar.f474c;
        bi.d dVar2 = xVar.d;
        xVar.f472a.setText(formatString);
        w wVar = xVar.f473b;
        wVar.g(string2, false, true);
        wVar.setOnClickListener(new u(dVar, 0));
        if (string == null) {
            tVar.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            tVar.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(string, false, true);
            dVar2.setOnClickListener(new v(0, jVar));
        }
        t tVar2 = this.E;
        bi.d dVar3 = this.F;
        jx0 jx0Var = this.f420y;
        if (z10) {
            jx0Var.d.setVisibility(0);
            jx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            jx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            jx0Var.f24512f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            tVar2.setVisibility(8);
            dVar3.setVisibility(8);
        } else {
            jx0Var.d.setVisibility(8);
            jx0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, i41.D(this.f411a.E, null, null)));
            jx0Var.f24512f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            tVar2.setVisibility(0);
            dVar3.setVisibility(0);
            dVar3.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar3.setOnClickListener(new i(this, 1));
        }
        bi.d dVar4 = jx0Var.f24512f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar4.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f416r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        o oVar = this.f414f;
        oVar.setPadding(oVar.getPaddingLeft(), oVar.Y2, oVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(s4 s4Var) {
        if (this.f411a != s4Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.f451y;
        }
        this.f411a = s4Var;
        r rVar = this.v;
        rVar.e = s4Var;
        if (rVar != rVar.f479s.f418w) {
            rVar.M();
        }
        rVar.l();
        z zVar = this.f418w;
        zVar.e = s4Var;
        if (zVar != zVar.f479s.f418w) {
            zVar.M();
        }
        zVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f420y.setTranslationY(f7);
        this.f419x.setTranslationY(-f7);
    }
}
