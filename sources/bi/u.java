package bi;

import ai.k6;
import ai.u8;
import ai.v0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.a0;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.zl0;
import w7.z5;
public final class u extends FrameLayout {
    public static final int f3872a0 = 0;
    public final o E;
    public final ci.d F;
    public final s4.y G;
    public boolean H;
    public boolean I;
    public final r J;
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
    public final ds0 W;
    public u8 f3873a;
    public boolean f3874b;
    public float f3875c;
    public int d;
    public int f3876e;
    public final j f3877f;
    public final i h;
    public final s4.j f3878n;
    public final hu0 f3879r;
    public final l f3880s;
    public final m v;
    public final t f3881w;
    public final n f3882x;
    public final tx0 f3883y;

    public u(ds0 ds0Var, Context context) {
        super(context);
        this.W = ds0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f3876e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        i iVar = new i();
        this.h = iVar;
        iVar.O = new h(this, 1);
        iVar.y1(this.d);
        s4.j jVar = new s4.j();
        this.f3878n = jVar;
        jVar.n(280L);
        jVar.o(tr.h);
        jVar.f46562m = false;
        j jVar2 = new j(this, context);
        this.f3877f = jVar2;
        jVar2.setScrollingTouchSlop(1);
        jVar2.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        jVar2.setPadding(0, 0, 0, 0);
        jVar2.setItemAnimator(null);
        jVar2.setClipToPadding(false);
        jVar2.setSectionsType(2);
        jVar2.setLayoutManager(iVar);
        addView(jVar2, z5.c(-1.0f, -1));
        jVar2.i(new k(this, 0));
        jVar2.setOnItemClickListener(new ai.g(this, 1));
        jVar2.setOnItemLongClickListener(new a1.c(this, 12));
        ?? zl0Var = new zl0(context, null);
        this.f3879r = zl0Var;
        l lVar = new l(this);
        this.f3880s = lVar;
        zl0Var.setLayoutManager(lVar);
        zl0Var.i(new k(this, 1));
        lVar.y1(this.f3876e);
        zl0Var.setVisibility(8);
        addView((View) zl0Var, z5.c(-1.0f, -1));
        m mVar = new m(this, context);
        this.v = mVar;
        jVar2.setAdapter(mVar);
        t tVar = new t(this, getContext());
        mVar.f3868f = tVar;
        this.f3881w = tVar;
        zl0Var.setAdapter(tVar);
        n nVar = new n(this, context);
        this.f3882x = nVar;
        nVar.f32416w = false;
        tx0 tx0Var = new tx0(context, nVar, 1, null);
        this.f3883y = tx0Var;
        tx0Var.setVisibility(8);
        tx0Var.setAnimateLayoutChange(true);
        addView(tx0Var, z5.c(-1.0f, -1));
        tx0Var.setOnTouchListener(new d(0));
        tx0Var.e(true, false);
        tx0Var.f31192b.setVisibility(8);
        tx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        tx0Var.f31194e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(ds0Var.f3891b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        ci.d dVar = tx0Var.f31195f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        o oVar = new o(this, context);
        this.E = oVar;
        int i10 = i6.f21204y6;
        d6 d6Var = ds0Var.f3892c;
        oVar.setTextColor(i6.v0(i10, d6Var));
        oVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        oVar.setTextSize(1, 14.0f);
        oVar.setTextAlignment(4);
        oVar.setGravity(17);
        oVar.setTypeface(AndroidUtilities.bold());
        tx0Var.f31191a.addView(oVar, z5.t(165, -2, 17, 0, 17, 0, 12));
        ci.d dVar2 = new ci.d(context, d6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        tx0Var.f31191a.addView(dVar2, z5.q(-2, 44, 17));
        tx0Var.addView(nVar, 0, z5.c(-1.0f, -1));
        jVar2.setEmptyView(tx0Var);
        jVar2.Y1 = true;
        jVar2.Z1 = 0;
        new SparseArray();
        new HashMap();
        s4.y yVar = new s4.y(new g(this, 0));
        this.G = yVar;
        yVar.e(jVar2);
        r rVar = new r(context, d6Var);
        this.J = rVar;
        addView(rVar, z5.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f3874b) {
            float f7 = this.f3875c;
            hu0 hu0Var = this.f3879r;
            float f10 = 1.0f;
            j jVar = this.f3877f;
            if (f7 == 1.0f) {
                this.f3874b = false;
                int i10 = this.f3876e;
                this.d = i10;
                this.W.f3900y = i10;
                SharedConfig.setStoriesColumnsCount(i10);
                m mVar = this.v;
                int h = mVar.h();
                hu0Var.setVisibility(8);
                int i11 = this.d;
                i iVar = this.h;
                iVar.y1(i11);
                jVar.a0();
                jVar.invalidate();
                if (mVar.h() == h) {
                    AndroidUtilities.updateVisibleRows(jVar);
                } else {
                    mVar.l();
                }
                int i12 = this.S;
                if (i12 >= 0) {
                    View m10 = this.f3880s.m(i12);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    iVar.h1(this.S, (-jVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f3874b = false;
                hu0Var.setVisibility(8);
                jVar.invalidate();
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
                ofFloat.addUpdateListener(new k6(this, 1));
                ofFloat.addListener(new ai.n(5, this, z10));
                ofFloat.setInterpolator(tr.f31140f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f3874b && !this.W.G.C1) {
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
            this.f3876e = clamp;
            if (clamp != this.d && !this.H) {
                hu0 hu0Var = this.f3879r;
                hu0Var.setVisibility(0);
                hu0Var.setAdapter(this.f3881w);
                hu0Var.setPadding(hu0Var.getPaddingLeft(), 0, hu0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                l lVar = this.f3880s;
                lVar.y1(clamp);
                hu0Var.a0();
                lVar.O = new h(this, 0);
                AndroidUtilities.updateVisibleRows(this.f3877f);
                this.f3874b = true;
                this.f3875c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    lVar.h1(i14, this.T - hu0Var.getPaddingTop());
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
        f fVar;
        int i12 = this.W.f3891b;
        u8 u8Var = this.f3873a;
        int i13 = 0;
        if (u8Var == null) {
            size = 0;
        } else {
            size = u8Var.f789i.size();
        }
        u8 u8Var2 = this.f3873a;
        if (u8Var2 != null && !TextUtils.isEmpty(u8Var2.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (size > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        r rVar = this.J;
        rVar.setVisibility(i10);
        if (z10) {
            formatString = LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral);
        } else {
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, t41.C(this.f3873a.E, null, null));
        }
        String string2 = LocaleController.getString(R.string.ProfileBotAddPreview);
        a0 a0Var = new a0(this, 3);
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
            fVar = null;
        } else {
            fVar = new f(0, this, z10);
        }
        o oVar = rVar.f3865c;
        ci.d dVar = rVar.d;
        rVar.f3863a.setText(formatString);
        q qVar = rVar.f3864b;
        qVar.g(string2, false, true);
        qVar.setOnClickListener(new v0(a0Var, 6));
        if (string == null) {
            oVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            oVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new p(0, fVar));
        }
        o oVar2 = this.E;
        ci.d dVar2 = this.F;
        tx0 tx0Var = this.f3883y;
        if (z10) {
            tx0Var.d.setVisibility(0);
            tx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            tx0Var.f31194e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            tx0Var.f31195f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            tx0Var.d.setVisibility(8);
            tx0Var.f31194e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, t41.C(this.f3873a.E, null, null)));
            tx0Var.f31195f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        ci.d dVar3 = tx0Var.f31195f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f3879r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        j jVar = this.f3877f;
        jVar.setPadding(jVar.getPaddingLeft(), jVar.f27701f3, jVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(u8 u8Var) {
        if (this.f3873a != u8Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.f3900y;
        }
        this.f3873a = u8Var;
        m mVar = this.v;
        mVar.f3867e = u8Var;
        if (mVar != mVar.f3871s.f3881w) {
            mVar.M();
        }
        mVar.l();
        t tVar = this.f3881w;
        tVar.f3867e = u8Var;
        if (tVar != tVar.f3871s.f3881w) {
            tVar.M();
        }
        tVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f3883y.setTranslationY(f7);
        this.f3882x.setTranslationY(-f7);
    }
}
