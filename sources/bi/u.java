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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xr0;
import w7.y5;
public final class u extends FrameLayout {
    public static final int f3582a0 = 0;
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
    public final xr0 W;
    public u8 f3583a;
    public boolean f3584b;
    public float f3585c;
    public int d;
    public int e;
    public final j f3586f;
    public final i h;
    public final s4.j f3587n;
    public final bu0 f3588r;
    public final l f3589s;
    public final m v;
    public final t f3590w;
    public final n f3591x;
    public final ix0 f3592y;

    public u(xr0 xr0Var, Context context) {
        super(context);
        this.W = xr0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        i iVar = new i();
        this.h = iVar;
        iVar.O = new h(this, 1);
        iVar.y1(this.d);
        s4.j jVar = new s4.j();
        this.f3587n = jVar;
        jVar.n(280L);
        jVar.o(rr.h);
        jVar.f42981m = false;
        j jVar2 = new j(this, context);
        this.f3586f = jVar2;
        jVar2.setScrollingTouchSlop(1);
        jVar2.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        jVar2.setPadding(0, 0, 0, 0);
        jVar2.setItemAnimator(null);
        jVar2.setClipToPadding(false);
        jVar2.setSectionsType(2);
        jVar2.setLayoutManager(iVar);
        addView(jVar2, y5.c(-1.0f, -1));
        jVar2.i(new k(this, 0));
        jVar2.setOnItemClickListener(new ai.g(this, 1));
        jVar2.setOnItemLongClickListener(new a1.c(this, 12));
        ?? wl0Var = new wl0(context, null);
        this.f3588r = wl0Var;
        l lVar = new l(this);
        this.f3589s = lVar;
        wl0Var.setLayoutManager(lVar);
        wl0Var.i(new k(this, 1));
        lVar.y1(this.e);
        wl0Var.setVisibility(8);
        addView((View) wl0Var, y5.c(-1.0f, -1));
        m mVar = new m(this, context);
        this.v = mVar;
        jVar2.setAdapter(mVar);
        t tVar = new t(this, getContext());
        mVar.f3578f = tVar;
        this.f3590w = tVar;
        wl0Var.setAdapter(tVar);
        n nVar = new n(this, context);
        this.f3591x = nVar;
        nVar.f28648w = false;
        ix0 ix0Var = new ix0(context, nVar, 1, null);
        this.f3592y = ix0Var;
        ix0Var.setVisibility(8);
        ix0Var.setAnimateLayoutChange(true);
        addView(ix0Var, y5.c(-1.0f, -1));
        ix0Var.setOnTouchListener(new d(0));
        ix0Var.e(true, false);
        ix0Var.f25164b.setVisibility(8);
        ix0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        ix0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(xr0Var.f3600b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        ci.d dVar = ix0Var.f25166f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        o oVar = new o(this, context);
        this.E = oVar;
        int i10 = h6.f19428y6;
        d6 d6Var = xr0Var.f3601c;
        oVar.setTextColor(h6.v0(i10, d6Var));
        oVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        oVar.setTextSize(1, 14.0f);
        oVar.setTextAlignment(4);
        oVar.setGravity(17);
        oVar.setTypeface(AndroidUtilities.bold());
        ix0Var.f25163a.addView(oVar, y5.t(165, -2, 17, 0, 17, 0, 12));
        ci.d dVar2 = new ci.d(context, d6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        ix0Var.f25163a.addView(dVar2, y5.q(-2, 44, 17));
        ix0Var.addView(nVar, 0, y5.c(-1.0f, -1));
        jVar2.setEmptyView(ix0Var);
        jVar2.Y1 = true;
        jVar2.Z1 = 0;
        new SparseArray();
        new HashMap();
        s4.y yVar = new s4.y(new g(this, 0));
        this.G = yVar;
        yVar.e(jVar2);
        r rVar = new r(context, d6Var);
        this.J = rVar;
        addView(rVar, y5.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f3584b) {
            float f7 = this.f3585c;
            bu0 bu0Var = this.f3588r;
            float f10 = 1.0f;
            j jVar = this.f3586f;
            if (f7 == 1.0f) {
                this.f3584b = false;
                int i10 = this.e;
                this.d = i10;
                this.W.f3608y = i10;
                SharedConfig.setStoriesColumnsCount(i10);
                m mVar = this.v;
                int h = mVar.h();
                bu0Var.setVisibility(8);
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
                    View m10 = this.f3589s.m(i12);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    iVar.h1(this.S, (-jVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f3584b = false;
                bu0Var.setVisibility(8);
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
                ofFloat.setInterpolator(rr.f28022f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f3584b && !this.W.G.C1) {
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
                bu0 bu0Var = this.f3588r;
                bu0Var.setVisibility(0);
                bu0Var.setAdapter(this.f3590w);
                bu0Var.setPadding(bu0Var.getPaddingLeft(), 0, bu0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                l lVar = this.f3589s;
                lVar.y1(clamp);
                bu0Var.a0();
                lVar.O = new h(this, 0);
                AndroidUtilities.updateVisibleRows(this.f3586f);
                this.f3584b = true;
                this.f3585c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    lVar.h1(i14, this.T - bu0Var.getPaddingTop());
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
        int i12 = this.W.f3600b;
        u8 u8Var = this.f3583a;
        int i13 = 0;
        if (u8Var == null) {
            size = 0;
        } else {
            size = u8Var.f725i.size();
        }
        u8 u8Var2 = this.f3583a;
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
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, i41.E(this.f3583a.E, null, null));
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
        o oVar = rVar.f3576c;
        ci.d dVar = rVar.d;
        rVar.f3574a.setText(formatString);
        q qVar = rVar.f3575b;
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
        ix0 ix0Var = this.f3592y;
        if (z10) {
            ix0Var.d.setVisibility(0);
            ix0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            ix0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            ix0Var.f25166f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            ix0Var.d.setVisibility(8);
            ix0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, i41.E(this.f3583a.E, null, null)));
            ix0Var.f25166f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        ci.d dVar3 = ix0Var.f25166f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f3588r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        j jVar = this.f3586f;
        jVar.setPadding(jVar.getPaddingLeft(), jVar.Y2, jVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(u8 u8Var) {
        if (this.f3583a != u8Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.f3608y;
        }
        this.f3583a = u8Var;
        m mVar = this.v;
        mVar.e = u8Var;
        if (mVar != mVar.f3581s.f3590w) {
            mVar.M();
        }
        mVar.l();
        t tVar = this.f3590w;
        tVar.e = u8Var;
        if (tVar != tVar.f3581s.f3590w) {
            tVar.M();
        }
        tVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f3592y.setTranslationY(f7);
        this.f3591x.setTranslationY(-f7);
    }
}
