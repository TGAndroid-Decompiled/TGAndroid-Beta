package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import dg.w;
import f2.f0;
import f2.h0;
import g7.e6;
import gh.i3;
import hg.b0;
import ih.f6;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.z21;
public final class q extends FrameLayout {
    public static final int T = 0;
    public final bh.e A;
    public final kh.d B;
    public final h0 C;
    public boolean D;
    public boolean E;
    public final n F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public float L;
    public float M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public final Rect R;
    public final uq0 S;
    public f6 f14363a;
    public boolean f14364b;
    public float f14365c;
    public int d;
    public int f14366e;
    public final i f14367f;
    public final h h;
    public final f2.n f14368n;
    public final ws0 f14369r;
    public final k f14370s;
    public final l v;
    public final p f14371w;
    public final m f14372x;
    public final gw0 f14373y;

    public q(uq0 uq0Var, Context context) {
        super(context);
        this.S = uq0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f14366e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.D = false;
        this.E = false;
        this.R = new Rect();
        h hVar = new h();
        this.h = hVar;
        hVar.O = new g(this, 1);
        hVar.y1(this.d);
        f2.n nVar = new f2.n();
        this.f14368n = nVar;
        nVar.n(280L);
        nVar.o(gr.h);
        nVar.f5532m = false;
        i iVar = new i(this, context);
        this.f14367f = iVar;
        iVar.setScrollingTouchSlop(1);
        iVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        iVar.setPadding(0, 0, 0, 0);
        iVar.setItemAnimator(null);
        iVar.setClipToPadding(false);
        iVar.setSectionsType(2);
        iVar.setLayoutManager(hVar);
        addView(iVar, e6.c(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new eh.j(this, 8));
        iVar.setOnItemLongClickListener(new i3(this, 29));
        ?? wk0Var = new wk0(context, null);
        this.f14369r = wk0Var;
        k kVar = new k(this);
        this.f14370s = kVar;
        wk0Var.setLayoutManager(kVar);
        wk0Var.i(new j(this, 1));
        kVar.y1(this.f14366e);
        wk0Var.setVisibility(8);
        addView((View) wk0Var, e6.c(-1.0f, -1));
        l lVar = new l(this, context);
        this.v = lVar;
        iVar.setAdapter(lVar);
        p pVar = new p(this, getContext());
        lVar.f14359f = pVar;
        this.f14371w = pVar;
        wk0Var.setAdapter(pVar);
        m mVar = new m(this, context);
        this.f14372x = mVar;
        mVar.f27885w = false;
        gw0 gw0Var = new gw0(context, mVar, 1, null);
        this.f14373y = gw0Var;
        gw0Var.setVisibility(8);
        gw0Var.setAnimateLayoutChange(true);
        addView(gw0Var, e6.c(-1.0f, -1));
        gw0Var.setOnTouchListener(new d(0));
        gw0Var.e(true, false);
        gw0Var.f28883b.setVisibility(8);
        gw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        gw0Var.f28885e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(uq0Var.f14379b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        kh.d dVar = gw0Var.f28886f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        bh.e eVar = new bh.e(this, context);
        this.A = eVar;
        int i9 = org.telegram.ui.ActionBar.f6.f23369y6;
        b6 b6Var = uq0Var.f14380c;
        eVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        eVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        eVar.setTextSize(1, 14.0f);
        eVar.setTextAlignment(4);
        eVar.setGravity(17);
        eVar.setTypeface(AndroidUtilities.bold());
        gw0Var.f28882a.addView(eVar, e6.t(165, -2, 17, 0, 17, 0, 12));
        kh.d dVar2 = new kh.d(context, b6Var, false);
        this.B = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        gw0Var.f28882a.addView(dVar2, e6.q(-2, 44, 17));
        gw0Var.addView(mVar, 0, e6.c(-1.0f, -1));
        iVar.setEmptyView(gw0Var);
        iVar.U1 = true;
        iVar.V1 = 0;
        new SparseArray();
        new HashMap();
        h0 h0Var = new h0(new f(this, 0));
        this.C = h0Var;
        h0Var.d(iVar);
        n nVar2 = new n(context, b6Var);
        this.F = nVar2;
        addView(nVar2, e6.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f14364b) {
            float f10 = this.f14365c;
            ws0 ws0Var = this.f14369r;
            float f11 = 1.0f;
            i iVar = this.f14367f;
            if (f10 == 1.0f) {
                this.f14364b = false;
                int i9 = this.f14366e;
                this.d = i9;
                this.S.f14388y = i9;
                SharedConfig.setStoriesColumnsCount(i9);
                l lVar = this.v;
                int h = lVar.h();
                ws0Var.setVisibility(8);
                int i10 = this.d;
                h hVar = this.h;
                hVar.y1(i10);
                iVar.a0();
                iVar.invalidate();
                if (lVar.h() == h) {
                    AndroidUtilities.updateVisibleRows(iVar);
                } else {
                    lVar.l();
                }
                int i11 = this.O;
                if (i11 >= 0) {
                    View m10 = this.f14370s.m(i11);
                    if (m10 != null) {
                        this.P = m10.getTop();
                    }
                    hVar.h1(this.O, (-iVar.getPaddingTop()) + this.P);
                }
            } else if (f10 == 0.0f) {
                this.f14364b = false;
                ws0Var.setVisibility(8);
                iVar.invalidate();
            } else {
                if (f10 > 0.2f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
                ofFloat.addUpdateListener(new f0(this, 2));
                ofFloat.addListener(new b0(6, this, z10));
                ofFloat.setInterpolator(gr.f28844f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i9;
        int i10;
        if (!this.f14364b && !this.S.C.f28178y1) {
            int i11 = this.d;
            if (!z10) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            int i12 = i11 + i9;
            if (i12 > 6) {
                if (!z10) {
                    i12 = 9;
                } else {
                    i12 = 6;
                }
            }
            if (this.D) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            int clamp = Utilities.clamp(i12, 6, i10);
            this.f14366e = clamp;
            if (clamp != this.d && !this.D) {
                ws0 ws0Var = this.f14369r;
                ws0Var.setVisibility(0);
                ws0Var.setAdapter(this.f14371w);
                ws0Var.setPadding(ws0Var.getPaddingLeft(), 0, ws0Var.getPaddingRight(), this.F.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                k kVar = this.f14370s;
                kVar.y1(clamp);
                ws0Var.a0();
                kVar.O = new g(this, 0);
                AndroidUtilities.updateVisibleRows(this.f14367f);
                this.f14364b = true;
                this.f14365c = 0.0f;
                int i13 = this.O;
                if (i13 >= 0) {
                    kVar.h1(i13, this.P - ws0Var.getPaddingTop());
                }
            }
        }
    }

    public final void c() {
        int size;
        boolean z10;
        int i9;
        String formatString;
        int i10;
        String string;
        eh.f fVar;
        int i11 = this.S.f14379b;
        f6 f6Var = this.f14363a;
        int i12 = 0;
        if (f6Var == null) {
            size = 0;
        } else {
            size = f6Var.f11851i.size();
        }
        f6 f6Var2 = this.f14363a;
        if (f6Var2 != null && !TextUtils.isEmpty(f6Var2.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (size > 0) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        n nVar = this.F;
        nVar.setVisibility(i9);
        if (z10) {
            formatString = LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral);
        } else {
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, z21.D(this.f14363a.E, null, null));
        }
        String string2 = LocaleController.getString(R.string.ProfileBotAddPreview);
        ih.g gVar = new ih.g(this, 24);
        if (!z10 && size > 0) {
            string = null;
        } else {
            if (z10) {
                i10 = R.string.ProfileBotPreviewFooterCreateTranslation;
            } else {
                i10 = R.string.ProfileBotPreviewFooterDeleteTranslation;
            }
            string = LocaleController.getString(i10);
        }
        if (!z10 && size > 0) {
            fVar = null;
        } else {
            fVar = new eh.f(6, this, z10);
        }
        bh.e eVar = nVar.f14356c;
        kh.d dVar = nVar.d;
        nVar.f14354a.setText(formatString);
        gh.p pVar = nVar.f14355b;
        pVar.g(string2, false, true);
        pVar.setOnClickListener(new androidx.mediarouter.app.c(gVar, 24));
        if (string == null) {
            eVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            eVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new w(3, fVar));
        }
        bh.e eVar2 = this.A;
        kh.d dVar2 = this.B;
        gw0 gw0Var = this.f14373y;
        if (z10) {
            gw0Var.d.setVisibility(0);
            gw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            gw0Var.f28885e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i11).botPreviewMediasMax, new Object[0]));
            gw0Var.f28886f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            eVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            gw0Var.d.setVisibility(8);
            gw0Var.f28885e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, z21.D(this.f14363a.E, null, null)));
            gw0Var.f28886f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            eVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        kh.d dVar3 = gw0Var.f28886f;
        if (this.v.h() >= MessagesController.getInstance(i11).botPreviewMediasMax) {
            i12 = 8;
        }
        dVar3.setVisibility(i12);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f14369r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        i iVar = this.f14367f;
        iVar.setPadding(iVar.getPaddingLeft(), iVar.U2, iVar.getPaddingRight(), this.F.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(f6 f6Var) {
        if (this.f14363a != f6Var) {
            this.D = false;
            this.E = false;
            this.d = this.S.f14388y;
        }
        this.f14363a = f6Var;
        l lVar = this.v;
        lVar.f14358e = f6Var;
        if (lVar != lVar.f14362s.f14371w) {
            lVar.M();
        }
        lVar.l();
        p pVar = this.f14371w;
        pVar.f14358e = f6Var;
        if (pVar != pVar.f14362s.f14371w) {
            pVar.M();
        }
        pVar.l();
        c();
    }

    public void setVisibleHeight(int i9) {
        float f10 = (-(getMeasuredHeight() - Math.max(i9, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f14373y.setTranslationY(f10);
        this.f14372x.setTranslationY(-f10);
    }
}
