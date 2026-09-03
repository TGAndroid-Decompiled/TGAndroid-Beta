package oh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import dg.w2;
import eg.b1;
import eg.s0;
import f2.e0;
import java.util.HashMap;
import k7.b6;
import lh.m5;
import nh.d6;
import nh.n5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.zw0;
public final class r extends FrameLayout {
    public static final int U = 0;
    public final s0 B;
    public final ph.d C;
    public final e0 D;
    public boolean E;
    public boolean F;
    public final o G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public final Rect S;
    public final nr0 T;
    public d6 f16581a;
    public boolean f16582b;
    public float f16583c;
    public int d;
    public int e;
    public final i f16584f;
    public final h h;
    public final f2.l f16585n;
    public final pt0 f16586r;
    public final k f16587s;
    public final l v;
    public final q f16588w;
    public final m f16589x;
    public final zw0 f16590y;

    public r(nr0 nr0Var, Context context) {
        super(context);
        this.T = nr0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.E = false;
        this.F = false;
        this.S = new Rect();
        h hVar = new h();
        this.h = hVar;
        hVar.O = new g(this, 1);
        hVar.y1(this.d);
        f2.l lVar = new f2.l();
        this.f16585n = lVar;
        lVar.n(280L);
        lVar.o(mr.h);
        lVar.f5807m = false;
        i iVar = new i(this, context);
        this.f16584f = iVar;
        iVar.setScrollingTouchSlop(1);
        iVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        iVar.setPadding(0, 0, 0, 0);
        iVar.setItemAnimator(null);
        iVar.setClipToPadding(false);
        iVar.setSectionsType(2);
        iVar.setLayoutManager(hVar);
        addView(iVar, b6.c(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new dg.n(this, 12));
        iVar.setOnItemLongClickListener(new m5(this, 16));
        ?? rl0Var = new rl0(context, null);
        this.f16586r = rl0Var;
        k kVar = new k(this);
        this.f16587s = kVar;
        rl0Var.setLayoutManager(kVar);
        rl0Var.i(new j(this, 1));
        kVar.y1(this.e);
        rl0Var.setVisibility(8);
        addView((View) rl0Var, b6.c(-1.0f, -1));
        l lVar2 = new l(this, context);
        this.v = lVar2;
        iVar.setAdapter(lVar2);
        q qVar = new q(this, getContext());
        lVar2.f16577f = qVar;
        this.f16588w = qVar;
        rl0Var.setAdapter(qVar);
        m mVar = new m(this, context);
        this.f16589x = mVar;
        mVar.f29071w = false;
        zw0 zw0Var = new zw0(context, mVar, 1, null);
        this.f16590y = zw0Var;
        zw0Var.setVisibility(8);
        zw0Var.setAnimateLayoutChange(true);
        addView(zw0Var, b6.c(-1.0f, -1));
        zw0Var.setOnTouchListener(new d(0));
        zw0Var.e(true, false);
        zw0Var.f31483b.setVisibility(8);
        zw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        zw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(nr0Var.f16596b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        ph.d dVar = zw0Var.f31485f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        s0 s0Var = new s0(this, context);
        this.B = s0Var;
        int i10 = j6.f20256y6;
        f6 f6Var = nr0Var.f16597c;
        s0Var.setTextColor(j6.v0(i10, f6Var));
        s0Var.setText(LocaleController.getString(R.string.ProfileBotOr));
        s0Var.setTextSize(1, 14.0f);
        s0Var.setTextAlignment(4);
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        zw0Var.f31482a.addView(s0Var, b6.t(165, -2, 17, 0, 17, 0, 12));
        ph.d dVar2 = new ph.d(context, f6Var, false);
        this.C = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        zw0Var.f31482a.addView(dVar2, b6.q(-2, 44, 17));
        zw0Var.addView(mVar, 0, b6.c(-1.0f, -1));
        iVar.setEmptyView(zw0Var);
        iVar.V1 = true;
        iVar.W1 = 0;
        new SparseArray();
        new HashMap();
        e0 e0Var = new e0(new f(this, 0));
        this.D = e0Var;
        e0Var.d(iVar);
        o oVar = new o(context, f6Var);
        this.G = oVar;
        addView(oVar, b6.e(-1, -2, 48));
    }

    public final void a() {
        boolean z4;
        if (this.f16582b) {
            float f10 = this.f16583c;
            pt0 pt0Var = this.f16586r;
            float f11 = 1.0f;
            i iVar = this.f16584f;
            if (f10 == 1.0f) {
                this.f16582b = false;
                int i10 = this.e;
                this.d = i10;
                this.T.f16604y = i10;
                SharedConfig.setStoriesColumnsCount(i10);
                l lVar = this.v;
                int h = lVar.h();
                pt0Var.setVisibility(8);
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
                int i12 = this.P;
                if (i12 >= 0) {
                    View m9 = this.f16587s.m(i12);
                    if (m9 != null) {
                        this.Q = m9.getTop();
                    }
                    hVar.h1(this.P, (-iVar.getPaddingTop()) + this.Q);
                }
            } else if (f10 == 0.0f) {
                this.f16582b = false;
                pt0Var.setVisibility(8);
                iVar.invalidate();
            } else {
                if (f10 > 0.2f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    f11 = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f11);
                ofFloat.addUpdateListener(new b1(this, 4));
                ofFloat.addListener(new w2(9, this, z4));
                ofFloat.setInterpolator(mr.f27122f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z4) {
        int i10;
        int i11;
        if (!this.f16582b && !this.T.D.f31172z1) {
            int i12 = this.d;
            if (!z4) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i13 = i12 + i10;
            if (i13 > 6) {
                if (!z4) {
                    i13 = 9;
                } else {
                    i13 = 6;
                }
            }
            if (this.E) {
                i11 = 1;
            } else {
                i11 = 2;
            }
            int clamp = Utilities.clamp(i13, 6, i11);
            this.e = clamp;
            if (clamp != this.d && !this.E) {
                pt0 pt0Var = this.f16586r;
                pt0Var.setVisibility(0);
                pt0Var.setAdapter(this.f16588w);
                pt0Var.setPadding(pt0Var.getPaddingLeft(), 0, pt0Var.getPaddingRight(), this.G.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                k kVar = this.f16587s;
                kVar.y1(clamp);
                pt0Var.a0();
                kVar.O = new g(this, 0);
                AndroidUtilities.updateVisibleRows(this.f16584f);
                this.f16582b = true;
                this.f16583c = 0.0f;
                int i14 = this.P;
                if (i14 >= 0) {
                    kVar.h1(i14, this.Q - pt0Var.getPaddingTop());
                }
            }
        }
    }

    public final void c() {
        int size;
        boolean z4;
        int i10;
        String formatString;
        int i11;
        String string;
        jh.f fVar;
        int i12 = this.T.f16596b;
        d6 d6Var = this.f16581a;
        int i13 = 0;
        if (d6Var == null) {
            size = 0;
        } else {
            size = d6Var.f15560i.size();
        }
        d6 d6Var2 = this.f16581a;
        if (d6Var2 != null && !TextUtils.isEmpty(d6Var2.E)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (size > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        o oVar = this.G;
        oVar.setVisibility(i10);
        if (z4) {
            formatString = LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral);
        } else {
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, v31.D(this.f16581a.E, null, null));
        }
        String string2 = LocaleController.getString(R.string.ProfileBotAddPreview);
        n5 n5Var = new n5(this, 17);
        if (!z4 && size > 0) {
            string = null;
        } else {
            if (z4) {
                i11 = R.string.ProfileBotPreviewFooterCreateTranslation;
            } else {
                i11 = R.string.ProfileBotPreviewFooterDeleteTranslation;
            }
            string = LocaleController.getString(i11);
        }
        if (!z4 && size > 0) {
            fVar = null;
        } else {
            fVar = new jh.f(6, this, z4);
        }
        s0 s0Var = oVar.f16575c;
        ph.d dVar = oVar.d;
        oVar.f16573a.setText(formatString);
        lh.o oVar2 = oVar.f16574b;
        oVar2.g(string2, false, true);
        oVar2.setOnClickListener(new n(n5Var, 0));
        if (string == null) {
            s0Var.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            s0Var.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new ig.u(3, fVar));
        }
        s0 s0Var2 = this.B;
        ph.d dVar2 = this.C;
        zw0 zw0Var = this.f16590y;
        if (z4) {
            zw0Var.d.setVisibility(0);
            zw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            zw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            zw0Var.f31485f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            zw0Var.d.setVisibility(8);
            zw0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, v31.D(this.f16581a.E, null, null)));
            zw0Var.f31485f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        ph.d dVar3 = zw0Var.f31485f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f16586r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i iVar = this.f16584f;
        iVar.setPadding(iVar.getPaddingLeft(), iVar.V2, iVar.getPaddingRight(), this.G.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(d6 d6Var) {
        if (this.f16581a != d6Var) {
            this.E = false;
            this.F = false;
            this.d = this.T.f16604y;
        }
        this.f16581a = d6Var;
        l lVar = this.v;
        lVar.e = d6Var;
        if (lVar != lVar.f16580s.f16588w) {
            lVar.M();
        }
        lVar.l();
        q qVar = this.f16588w;
        qVar.e = d6Var;
        if (qVar != qVar.f16580s.f16588w) {
            qVar.M();
        }
        qVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f10 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f16590y.setTranslationY(f10);
        this.f16589x.setTranslationY(-f10);
    }
}
