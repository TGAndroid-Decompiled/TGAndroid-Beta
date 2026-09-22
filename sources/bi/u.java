package bi;

import ai.l6;
import ai.t8;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zr0;
import w7.y5;
public final class u extends FrameLayout {
    public static final int f3589a0 = 0;
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
    public final zr0 W;
    public t8 f3590a;
    public boolean f3591b;
    public float f3592c;
    public int d;
    public int e;
    public final j f3593f;
    public final i h;
    public final s4.j f3594n;
    public final du0 f3595r;
    public final l f3596s;
    public final m v;
    public final t f3597w;
    public final n f3598x;
    public final lx0 f3599y;

    public u(zr0 zr0Var, Context context) {
        super(context);
        this.W = zr0Var;
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
        this.f3594n = jVar;
        jVar.n(280L);
        jVar.o(qr.h);
        jVar.f43030m = false;
        j jVar2 = new j(this, context);
        this.f3593f = jVar2;
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
        ?? yl0Var = new yl0(context, null);
        this.f3595r = yl0Var;
        l lVar = new l(this);
        this.f3596s = lVar;
        yl0Var.setLayoutManager(lVar);
        yl0Var.i(new k(this, 1));
        lVar.y1(this.e);
        yl0Var.setVisibility(8);
        addView((View) yl0Var, y5.c(-1.0f, -1));
        m mVar = new m(this, context);
        this.v = mVar;
        jVar2.setAdapter(mVar);
        t tVar = new t(this, getContext());
        mVar.f3585f = tVar;
        this.f3597w = tVar;
        yl0Var.setAdapter(tVar);
        n nVar = new n(this, context);
        this.f3598x = nVar;
        nVar.f28362w = false;
        lx0 lx0Var = new lx0(context, nVar, 1, null);
        this.f3599y = lx0Var;
        lx0Var.setVisibility(8);
        lx0Var.setAnimateLayoutChange(true);
        addView(lx0Var, y5.c(-1.0f, -1));
        lx0Var.setOnTouchListener(new d(0));
        lx0Var.e(true, false);
        lx0Var.f26252b.setVisibility(8);
        lx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        lx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(zr0Var.f3607b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        ci.d dVar = lx0Var.f26254f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        o oVar = new o(this, context);
        this.E = oVar;
        int i10 = j6.f19492y6;
        f6 f6Var = zr0Var.f3608c;
        oVar.setTextColor(j6.v0(i10, f6Var));
        oVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        oVar.setTextSize(1, 14.0f);
        oVar.setTextAlignment(4);
        oVar.setGravity(17);
        oVar.setTypeface(AndroidUtilities.bold());
        lx0Var.f26251a.addView(oVar, y5.t(165, -2, 17, 0, 17, 0, 12));
        ci.d dVar2 = new ci.d(context, f6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        lx0Var.f26251a.addView(dVar2, y5.q(-2, 44, 17));
        lx0Var.addView(nVar, 0, y5.c(-1.0f, -1));
        jVar2.setEmptyView(lx0Var);
        jVar2.Y1 = true;
        jVar2.Z1 = 0;
        new SparseArray();
        new HashMap();
        s4.y yVar = new s4.y(new g(this, 0));
        this.G = yVar;
        yVar.e(jVar2);
        r rVar = new r(context, f6Var);
        this.J = rVar;
        addView(rVar, y5.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f3591b) {
            float f7 = this.f3592c;
            du0 du0Var = this.f3595r;
            float f10 = 1.0f;
            j jVar = this.f3593f;
            if (f7 == 1.0f) {
                this.f3591b = false;
                int i10 = this.e;
                this.d = i10;
                this.W.f3615y = i10;
                SharedConfig.setStoriesColumnsCount(i10);
                m mVar = this.v;
                int h = mVar.h();
                du0Var.setVisibility(8);
                int i11 = this.d;
                i iVar = this.h;
                iVar.y1(i11);
                jVar.b0();
                jVar.invalidate();
                if (mVar.h() == h) {
                    AndroidUtilities.updateVisibleRows(jVar);
                } else {
                    mVar.l();
                }
                int i12 = this.S;
                if (i12 >= 0) {
                    View m10 = this.f3596s.m(i12);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    iVar.h1(this.S, (-jVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f3591b = false;
                du0Var.setVisibility(8);
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
                ofFloat.addUpdateListener(new l6(this, 1));
                ofFloat.addListener(new ai.n(5, this, z10));
                ofFloat.setInterpolator(qr.f27653f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f3591b && !this.W.G.C1) {
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
                du0 du0Var = this.f3595r;
                du0Var.setVisibility(0);
                du0Var.setAdapter(this.f3597w);
                du0Var.setPadding(du0Var.getPaddingLeft(), 0, du0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                l lVar = this.f3596s;
                lVar.y1(clamp);
                du0Var.b0();
                lVar.O = new h(this, 0);
                AndroidUtilities.updateVisibleRows(this.f3593f);
                this.f3591b = true;
                this.f3592c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    lVar.h1(i14, this.T - du0Var.getPaddingTop());
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
        int i12 = this.W.f3607b;
        t8 t8Var = this.f3590a;
        int i13 = 0;
        if (t8Var == null) {
            size = 0;
        } else {
            size = t8Var.f718i.size();
        }
        t8 t8Var2 = this.f3590a;
        if (t8Var2 != null && !TextUtils.isEmpty(t8Var2.E)) {
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
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, l41.D(this.f3590a.E, null, null));
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
        o oVar = rVar.f3583c;
        ci.d dVar = rVar.d;
        rVar.f3581a.setText(formatString);
        q qVar = rVar.f3582b;
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
        lx0 lx0Var = this.f3599y;
        if (z10) {
            lx0Var.d.setVisibility(0);
            lx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            lx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            lx0Var.f26254f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            lx0Var.d.setVisibility(8);
            lx0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, l41.D(this.f3590a.E, null, null)));
            lx0Var.f26254f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        ci.d dVar3 = lx0Var.f26254f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f3595r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        j jVar = this.f3593f;
        jVar.setPadding(jVar.getPaddingLeft(), jVar.Y2, jVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(t8 t8Var) {
        if (this.f3590a != t8Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.f3615y;
        }
        this.f3590a = t8Var;
        m mVar = this.v;
        mVar.e = t8Var;
        if (mVar != mVar.f3588s.f3597w) {
            mVar.M();
        }
        mVar.l();
        t tVar = this.f3597w;
        tVar.e = t8Var;
        if (tVar != tVar.f3588s.f3597w) {
            tVar.M();
        }
        tVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f3599y.setTranslationY(f7);
        this.f3598x.setTranslationY(-f7);
    }
}
