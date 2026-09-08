package ci;

import ah.h0;
import ah.q0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.b8;
import bi.oa;
import bi.u5;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.xw0;
import w7.x5;
public final class t extends FrameLayout {
    public static final int f4857a0 = 0;
    public final n E;
    public final di.d F;
    public final s4.y G;
    public boolean H;
    public boolean I;
    public final q J;
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
    public final lr0 W;
    public b8 f4858a;
    public boolean f4859b;
    public float f4860c;
    public int d;
    public int f4861e;
    public final i f4862f;
    public final h h;
    public final s4.j f4863n;
    public final pt0 f4864r;
    public final k f4865s;
    public final l v;
    public final s f4866w;
    public final m f4867x;
    public final xw0 f4868y;

    public t(lr0 lr0Var, Context context) {
        super(context);
        this.W = lr0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f4861e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        h hVar = new h();
        this.h = hVar;
        hVar.O = new g(this, 1);
        hVar.y1(this.d);
        s4.j jVar = new s4.j();
        this.f4863n = jVar;
        jVar.n(280L);
        jVar.o(pr.h);
        jVar.f45805m = false;
        i iVar = new i(this, context);
        this.f4862f = iVar;
        iVar.setScrollingTouchSlop(1);
        iVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        iVar.setPadding(0, 0, 0, 0);
        iVar.setItemAnimator(null);
        iVar.setClipToPadding(false);
        iVar.setSectionsType(2);
        iVar.setLayoutManager(hVar);
        addView(iVar, x5.c(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new bi.d(this, 1));
        iVar.setOnItemLongClickListener(new a1.c(this, 13));
        ?? ll0Var = new ll0(context, null);
        this.f4864r = ll0Var;
        k kVar = new k(this);
        this.f4865s = kVar;
        ll0Var.setLayoutManager(kVar);
        ll0Var.i(new j(this, 1));
        kVar.y1(this.f4861e);
        ll0Var.setVisibility(8);
        addView((View) ll0Var, x5.c(-1.0f, -1));
        l lVar = new l(this, context);
        this.v = lVar;
        iVar.setAdapter(lVar);
        s sVar = new s(this, getContext());
        lVar.f4853f = sVar;
        this.f4866w = sVar;
        ll0Var.setAdapter(sVar);
        m mVar = new m(this, context);
        this.f4867x = mVar;
        mVar.f30492w = false;
        xw0 xw0Var = new xw0(context, mVar, 1, null);
        this.f4868y = xw0Var;
        xw0Var.setVisibility(8);
        xw0Var.setAnimateLayoutChange(true);
        addView(xw0Var, x5.c(-1.0f, -1));
        xw0Var.setOnTouchListener(new d(0));
        xw0Var.e(true, false);
        xw0Var.f32780b.setVisibility(8);
        xw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        xw0Var.f32782e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(lr0Var.f4876b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        di.d dVar = xw0Var.f32783f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        n nVar = new n(this, context);
        this.E = nVar;
        int i10 = j6.f21069y6;
        f6 f6Var = lr0Var.f4877c;
        nVar.setTextColor(j6.v0(i10, f6Var));
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        xw0Var.f32779a.addView(nVar, x5.t(165, -2, 17, 0, 17, 0, 12));
        di.d dVar2 = new di.d(context, f6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        xw0Var.f32779a.addView(dVar2, x5.q(-2, 44, 17));
        xw0Var.addView(mVar, 0, x5.c(-1.0f, -1));
        iVar.setEmptyView(xw0Var);
        iVar.Y1 = true;
        iVar.Z1 = 0;
        new SparseArray();
        new HashMap();
        s4.y yVar = new s4.y(new f(this, 0));
        this.G = yVar;
        yVar.d(iVar);
        q qVar = new q(context, f6Var);
        this.J = qVar;
        addView(qVar, x5.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f4859b) {
            float f7 = this.f4860c;
            pt0 pt0Var = this.f4864r;
            float f10 = 1.0f;
            i iVar = this.f4862f;
            if (f7 == 1.0f) {
                this.f4859b = false;
                int i10 = this.f4861e;
                this.d = i10;
                this.W.f4885y = i10;
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
                int i12 = this.S;
                if (i12 >= 0) {
                    View m10 = this.f4865s.m(i12);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    hVar.h1(this.S, (-iVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f4859b = false;
                pt0Var.setVisibility(8);
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
                ofFloat.addUpdateListener(new u5(this, 1));
                ofFloat.addListener(new q0(6, this, z10));
                ofFloat.setInterpolator(pr.f29493f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f4859b && !this.W.G.C1) {
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
            this.f4861e = clamp;
            if (clamp != this.d && !this.H) {
                pt0 pt0Var = this.f4864r;
                pt0Var.setVisibility(0);
                pt0Var.setAdapter(this.f4866w);
                pt0Var.setPadding(pt0Var.getPaddingLeft(), 0, pt0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                k kVar = this.f4865s;
                kVar.y1(clamp);
                pt0Var.a0();
                kVar.O = new g(this, 0);
                AndroidUtilities.updateVisibleRows(this.f4862f);
                this.f4859b = true;
                this.f4860c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    kVar.h1(i14, this.T - pt0Var.getPaddingTop());
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
        ah.u uVar;
        int i12 = this.W.f4876b;
        b8 b8Var = this.f4858a;
        int i13 = 0;
        if (b8Var == null) {
            size = 0;
        } else {
            size = b8Var.f3302i.size();
        }
        b8 b8Var2 = this.f4858a;
        if (b8Var2 != null && !TextUtils.isEmpty(b8Var2.E)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (size > 0) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        q qVar = this.J;
        qVar.setVisibility(i10);
        if (z10) {
            formatString = LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral);
        } else {
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, u31.D(this.f4858a.E, null, null));
        }
        String string2 = LocaleController.getString(R.string.ProfileBotAddPreview);
        oa oaVar = new oa(this, 7);
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
            uVar = null;
        } else {
            uVar = new ah.u(1, this, z10);
        }
        n nVar = qVar.f4850c;
        di.d dVar = qVar.d;
        qVar.f4848a.setText(formatString);
        p pVar = qVar.f4849b;
        pVar.g(string2, false, true);
        pVar.setOnClickListener(new h0(oaVar, 7));
        if (string == null) {
            nVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            nVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new o(0, uVar));
        }
        n nVar2 = this.E;
        di.d dVar2 = this.F;
        xw0 xw0Var = this.f4868y;
        if (z10) {
            xw0Var.d.setVisibility(0);
            xw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            xw0Var.f32782e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            xw0Var.f32783f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            xw0Var.d.setVisibility(8);
            xw0Var.f32782e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, u31.D(this.f4858a.E, null, null)));
            xw0Var.f32783f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        di.d dVar3 = xw0Var.f32783f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f4864r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i iVar = this.f4862f;
        iVar.setPadding(iVar.getPaddingLeft(), iVar.Y2, iVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(b8 b8Var) {
        if (this.f4858a != b8Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.f4885y;
        }
        this.f4858a = b8Var;
        l lVar = this.v;
        lVar.f4852e = b8Var;
        if (lVar != lVar.f4856s.f4866w) {
            lVar.M();
        }
        lVar.l();
        s sVar = this.f4866w;
        sVar.f4852e = b8Var;
        if (sVar != sVar.f4856s.f4866w) {
            sVar.M();
        }
        sVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f4868y.setTranslationY(f7);
        this.f4867x.setTranslationY(-f7);
    }
}
