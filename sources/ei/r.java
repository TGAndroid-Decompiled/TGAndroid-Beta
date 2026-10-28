package ei;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bh.f0;
import bi.w6;
import di.s6;
import di.s8;
import di.u4;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.vs0;
import s4.z;
public final class r extends FrameLayout {
    public static final int f9999a0 = 0;
    public final n E;
    public final fi.d F;
    public final z G;
    public boolean H;
    public boolean I;
    public final o J;
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
    public final vs0 W;
    public s6 f10000a;
    public boolean f10001b;
    public float f10002c;
    public int d;
    public int e;
    public final i f10003f;
    public final h h;
    public final s4.l f10004n;
    public final tu0 f10005r;
    public final k f10006s;
    public final l v;
    public final q f10007w;
    public final m f10008x;
    public final fy0 f10009y;

    public r(vs0 vs0Var, Context context) {
        super(context);
        this.W = vs0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        h hVar = new h();
        this.h = hVar;
        hVar.O = new g(this, 1);
        hVar.z1(this.d);
        s4.l lVar = new s4.l();
        this.f10004n = lVar;
        lVar.n(280L);
        lVar.o(ds.h);
        lVar.f47798m = false;
        i iVar = new i(this, context);
        this.f10003f = iVar;
        iVar.setScrollingTouchSlop(1);
        iVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        iVar.setPadding(0, 0, 0, 0);
        iVar.setItemAnimator(null);
        iVar.setClipToPadding(false);
        iVar.setSectionsType(2);
        iVar.setLayoutManager(hVar);
        addView(iVar, kb1.g(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new ai.k(this, 6));
        iVar.setOnItemLongClickListener(new e1.c(this, 2));
        ?? nm0Var = new nm0(context, null);
        this.f10005r = nm0Var;
        k kVar = new k(this);
        this.f10006s = kVar;
        nm0Var.setLayoutManager(kVar);
        nm0Var.i(new j(this, 1));
        kVar.z1(this.e);
        nm0Var.setVisibility(8);
        addView((View) nm0Var, kb1.g(-1.0f, -1));
        l lVar2 = new l(this, context);
        this.v = lVar2;
        iVar.setAdapter(lVar2);
        q qVar = new q(this, getContext());
        lVar2.f9995f = qVar;
        this.f10007w = qVar;
        nm0Var.setAdapter(qVar);
        m mVar = new m(this, context);
        this.f10008x = mVar;
        mVar.f27026w = false;
        fy0 fy0Var = new fy0(context, mVar, 1, null);
        this.f10009y = fy0Var;
        fy0Var.setVisibility(8);
        fy0Var.setAnimateLayoutChange(true);
        addView(fy0Var, kb1.g(-1.0f, -1));
        fy0Var.setOnTouchListener(new d(0));
        fy0Var.e(true, false);
        fy0Var.f28313b.setVisibility(8);
        fy0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        fy0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(vs0Var.f10015b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        fi.d dVar = fy0Var.f28315f;
        dVar.i(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        n nVar = new n(this, context);
        this.E = nVar;
        int i10 = y6.f23749y6;
        u6 u6Var = vs0Var.f10016c;
        f7.V(nVar, i10, u6Var);
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        fy0Var.f28312a.addView(nVar, kb1.x(165, -2, 17, 0, 17, 0, 12));
        fi.d dVar2 = new fi.d(context, u6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        fy0Var.f28312a.addView(dVar2, kb1.u(-2, 44, 17));
        fy0Var.addView(mVar, 0, kb1.g(-1.0f, -1));
        iVar.setEmptyView(fy0Var);
        iVar.W1 = true;
        iVar.X1 = 0;
        new SparseArray();
        new HashMap();
        z zVar = new z(new f(this, 0));
        this.G = zVar;
        zVar.h(iVar);
        o oVar = new o(context, u6Var);
        this.J = oVar;
        addView(oVar, kb1.i(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f10001b) {
            float f7 = this.f10002c;
            float f10 = 1.0f;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            tu0 tu0Var = this.f10005r;
            i iVar = this.f10003f;
            if (i10 == 0) {
                this.f10001b = false;
                int i11 = this.e;
                this.d = i11;
                this.W.f10023y = i11;
                SharedConfig.setStoriesColumnsCount(i11);
                l lVar = this.v;
                int h = lVar.h();
                tu0Var.setVisibility(8);
                int i12 = this.d;
                h hVar = this.h;
                hVar.z1(i12);
                iVar.a0();
                iVar.invalidate();
                if (lVar.h() == h) {
                    AndroidUtilities.updateVisibleRows(iVar);
                } else {
                    lVar.l();
                }
                int i13 = this.S;
                if (i13 >= 0) {
                    View m10 = this.f10006s.m(i13);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    hVar.h1(this.S, (-iVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f10001b = false;
                tu0Var.setVisibility(8);
                iVar.invalidate();
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
                ofFloat.addUpdateListener(new u4(this, 1));
                ofFloat.addListener(new f0(6, this, z10));
                ofFloat.setInterpolator(ds.f27530f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f10001b && !this.W.G.E1) {
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
                tu0 tu0Var = this.f10005r;
                tu0Var.setVisibility(0);
                tu0Var.setAdapter(this.f10007w);
                tu0Var.setPadding(tu0Var.getPaddingLeft(), 0, tu0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                k kVar = this.f10006s;
                kVar.z1(clamp);
                tu0Var.a0();
                kVar.O = new g(this, 0);
                AndroidUtilities.updateVisibleRows(this.f10003f);
                this.f10001b = true;
                this.f10002c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    kVar.h1(i14, this.T - tu0Var.getPaddingTop());
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
        bh.n nVar;
        int i12 = this.W.f10015b;
        s6 s6Var = this.f10000a;
        int i13 = 0;
        if (s6Var == null) {
            size = 0;
        } else {
            size = s6Var.f9492i.size();
        }
        s6 s6Var2 = this.f10000a;
        if (s6Var2 != null && !TextUtils.isEmpty(s6Var2.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (size > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        o oVar = this.J;
        oVar.setVisibility(i10);
        if (z10) {
            formatString = LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral);
        } else {
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, g51.N(this.f10000a.E, null, null));
        }
        String string2 = LocaleController.getString(R.string.ProfileBotAddPreview);
        s8 s8Var = new s8(this, 8);
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
            nVar = null;
        } else {
            nVar = new bh.n(4, this, z10);
        }
        n nVar2 = oVar.f9993c;
        fi.d dVar = oVar.d;
        oVar.f9991a.setText(formatString);
        bi.v vVar = oVar.f9992b;
        vVar.i(string2, false, true);
        vVar.setOnClickListener(new ai.s(s8Var, 18));
        if (string == null) {
            nVar2.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            nVar2.setVisibility(0);
            dVar.setVisibility(0);
            dVar.i(string, false, true);
            dVar.setOnClickListener(new w6(1, nVar));
        }
        n nVar3 = this.E;
        fi.d dVar2 = this.F;
        fy0 fy0Var = this.f10009y;
        if (z10) {
            fy0Var.d.setVisibility(0);
            fy0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            fy0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            fy0Var.f28315f.i(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar3.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            fy0Var.d.setVisibility(8);
            fy0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, g51.N(this.f10000a.E, null, null)));
            fy0Var.f28315f.i(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar3.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        fi.d dVar3 = fy0Var.f28315f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f10005r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i iVar = this.f10003f;
        iVar.setPadding(iVar.getPaddingLeft(), iVar.f33150f3, iVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(s6 s6Var) {
        if (this.f10000a != s6Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.f10023y;
        }
        this.f10000a = s6Var;
        l lVar = this.v;
        lVar.e = s6Var;
        if (lVar != lVar.f9998s.f10007w) {
            lVar.M();
        }
        lVar.l();
        q qVar = this.f10007w;
        qVar.e = s6Var;
        if (qVar != qVar.f9998s.f10007w) {
            qVar.M();
        }
        qVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f10009y.setTranslationY(f7);
        this.f10008x.setTranslationY(-f7);
    }
}
