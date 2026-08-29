package mh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bg.z2;
import cg.c1;
import cg.s0;
import f2.e0;
import i7.f6;
import java.util.HashMap;
import lh.c6;
import lh.m5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.fr0;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.qw0;
public final class r extends FrameLayout {
    public static final int T = 0;
    public final s0 A;
    public final nh.d B;
    public final e0 C;
    public boolean D;
    public boolean E;
    public final o F;
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
    public final fr0 S;
    public c6 f17041a;
    public boolean f17042b;
    public float f17043c;
    public int d;
    public int f17044e;
    public final i f17045f;
    public final h h;
    public final f2.l f17046n;
    public final ht0 f17047r;
    public final k f17048s;
    public final l v;
    public final q f17049w;
    public final m f17050x;
    public final qw0 f17051y;

    public r(fr0 fr0Var, Context context) {
        super(context);
        this.S = fr0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f17044e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.D = false;
        this.E = false;
        this.R = new Rect();
        h hVar = new h();
        this.h = hVar;
        hVar.O = new g(this, 1);
        hVar.y1(this.d);
        f2.l lVar = new f2.l();
        this.f17046n = lVar;
        lVar.n(280L);
        lVar.o(jr.h);
        lVar.f6463m = false;
        i iVar = new i(this, context);
        this.f17045f = iVar;
        iVar.setScrollingTouchSlop(1);
        iVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        iVar.setPadding(0, 0, 0, 0);
        iVar.setItemAnimator(null);
        iVar.setClipToPadding(false);
        iVar.setSectionsType(2);
        iVar.setLayoutManager(hVar);
        addView(iVar, f6.c(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new bg.o(this, 12));
        iVar.setOnItemLongClickListener(new l4.s0(this, 11));
        ?? jl0Var = new jl0(context, null);
        this.f17047r = jl0Var;
        k kVar = new k(this);
        this.f17048s = kVar;
        jl0Var.setLayoutManager(kVar);
        jl0Var.i(new j(this, 1));
        kVar.y1(this.f17044e);
        jl0Var.setVisibility(8);
        addView((View) jl0Var, f6.c(-1.0f, -1));
        l lVar2 = new l(this, context);
        this.v = lVar2;
        iVar.setAdapter(lVar2);
        q qVar = new q(this, getContext());
        lVar2.f17037f = qVar;
        this.f17049w = qVar;
        jl0Var.setAdapter(qVar);
        m mVar = new m(this, context);
        this.f17050x = mVar;
        mVar.f31529w = false;
        qw0 qw0Var = new qw0(context, mVar, 1, null);
        this.f17051y = qw0Var;
        qw0Var.setVisibility(8);
        qw0Var.setAnimateLayoutChange(true);
        addView(qw0Var, f6.c(-1.0f, -1));
        qw0Var.setOnTouchListener(new d(0));
        qw0Var.e(true, false);
        qw0Var.f32120b.setVisibility(8);
        qw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        qw0Var.f32122e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(fr0Var.f17057b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        nh.d dVar = qw0Var.f32123f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        s0 s0Var = new s0(this, context);
        this.A = s0Var;
        int i10 = g6.f23433y6;
        org.telegram.ui.ActionBar.c6 c6Var = fr0Var.f17058c;
        s0Var.setTextColor(g6.v0(i10, c6Var));
        s0Var.setText(LocaleController.getString(R.string.ProfileBotOr));
        s0Var.setTextSize(1, 14.0f);
        s0Var.setTextAlignment(4);
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        qw0Var.f32119a.addView(s0Var, f6.t(165, -2, 17, 0, 17, 0, 12));
        nh.d dVar2 = new nh.d(context, c6Var, false);
        this.B = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        qw0Var.f32119a.addView(dVar2, f6.q(-2, 44, 17));
        qw0Var.addView(mVar, 0, f6.c(-1.0f, -1));
        iVar.setEmptyView(qw0Var);
        iVar.U1 = true;
        iVar.V1 = 0;
        new SparseArray();
        new HashMap();
        e0 e0Var = new e0(new f(this, 0));
        this.C = e0Var;
        e0Var.d(iVar);
        o oVar = new o(context, c6Var);
        this.F = oVar;
        addView(oVar, f6.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f17042b) {
            float f9 = this.f17043c;
            ht0 ht0Var = this.f17047r;
            float f10 = 1.0f;
            i iVar = this.f17045f;
            if (f9 == 1.0f) {
                this.f17042b = false;
                int i10 = this.f17044e;
                this.d = i10;
                this.S.f17066y = i10;
                SharedConfig.setStoriesColumnsCount(i10);
                l lVar = this.v;
                int h = lVar.h();
                ht0Var.setVisibility(8);
                int i11 = this.d;
                h hVar = this.h;
                hVar.y1(i11);
                iVar.a0();
                iVar.invalidate();
                if (lVar.h() == h) {
                    AndroidUtilities.updateVisibleRows(iVar);
                } else {
                    lVar.l();
                }
                int i12 = this.O;
                if (i12 >= 0) {
                    View m10 = this.f17048s.m(i12);
                    if (m10 != null) {
                        this.P = m10.getTop();
                    }
                    hVar.h1(this.O, (-iVar.getPaddingTop()) + this.P);
                }
            } else if (f9 == 0.0f) {
                this.f17042b = false;
                ht0Var.setVisibility(8);
                iVar.invalidate();
            } else {
                if (f9 > 0.2f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    f10 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, f10);
                ofFloat.addUpdateListener(new c1(this, 4));
                ofFloat.addListener(new z2(9, this, z10));
                ofFloat.setInterpolator(jr.f29800f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f17042b && !this.S.C.f32111y1) {
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
            if (this.D) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            int clamp = Utilities.clamp(i13, 6, i11);
            this.f17044e = clamp;
            if (clamp != this.d && !this.D) {
                ht0 ht0Var = this.f17047r;
                ht0Var.setVisibility(0);
                ht0Var.setAdapter(this.f17049w);
                ht0Var.setPadding(ht0Var.getPaddingLeft(), 0, ht0Var.getPaddingRight(), this.F.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                k kVar = this.f17048s;
                kVar.y1(clamp);
                ht0Var.a0();
                kVar.O = new g(this, 0);
                AndroidUtilities.updateVisibleRows(this.f17045f);
                this.f17042b = true;
                this.f17043c = 0.0f;
                int i14 = this.O;
                if (i14 >= 0) {
                    kVar.h1(i14, this.P - ht0Var.getPaddingTop());
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
        hh.f fVar;
        int i12 = this.S.f17057b;
        c6 c6Var = this.f17041a;
        int i13 = 0;
        if (c6Var == null) {
            size = 0;
        } else {
            size = c6Var.f15838i.size();
        }
        c6 c6Var2 = this.f17041a;
        if (c6Var2 != null && !TextUtils.isEmpty(c6Var2.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (size > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        o oVar = this.F;
        oVar.setVisibility(i10);
        if (z10) {
            formatString = LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral);
        } else {
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, k31.D(this.f17041a.E, null, null));
        }
        String string2 = LocaleController.getString(R.string.ProfileBotAddPreview);
        m5 m5Var = new m5(this, 15);
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
            fVar = new hh.f(6, this, z10);
        }
        s0 s0Var = oVar.f17034c;
        nh.d dVar = oVar.d;
        oVar.f17032a.setText(formatString);
        jh.n nVar = oVar.f17033b;
        nVar.g(string2, false, true);
        nVar.setOnClickListener(new n(m5Var, 0));
        if (string == null) {
            s0Var.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            s0Var.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new gg.u(3, fVar));
        }
        s0 s0Var2 = this.A;
        nh.d dVar2 = this.B;
        qw0 qw0Var = this.f17051y;
        if (z10) {
            qw0Var.d.setVisibility(0);
            qw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            qw0Var.f32122e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            qw0Var.f32123f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            qw0Var.d.setVisibility(8);
            qw0Var.f32122e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, k31.D(this.f17041a.E, null, null)));
            qw0Var.f32123f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        nh.d dVar3 = qw0Var.f32123f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f17047r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i iVar = this.f17045f;
        iVar.setPadding(iVar.getPaddingLeft(), iVar.U2, iVar.getPaddingRight(), this.F.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(c6 c6Var) {
        if (this.f17041a != c6Var) {
            this.D = false;
            this.E = false;
            this.d = this.S.f17066y;
        }
        this.f17041a = c6Var;
        l lVar = this.v;
        lVar.f17036e = c6Var;
        if (lVar != lVar.f17040s.f17049w) {
            lVar.M();
        }
        lVar.l();
        q qVar = this.f17049w;
        qVar.f17036e = c6Var;
        if (qVar != qVar.f17040s.f17049w) {
            qVar.M();
        }
        qVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f9 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f17051y.setTranslationY(f9);
        this.f17050x.setTranslationY(-f9);
    }
}
