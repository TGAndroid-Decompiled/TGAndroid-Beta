package di;

import ah.g0;
import ah.p0;
import ai.wa;
import ai.z6;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import ci.t6;
import ci.v4;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.hs0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ku0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.rx0;
import s4.y;
import w7.z5;
public final class r extends FrameLayout {
    public static final int f8056a0 = 0;
    public final n E;
    public final ei.d F;
    public final y G;
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
    public final hs0 W;
    public t6 f8057a;
    public boolean f8058b;
    public float f8059c;
    public int d;
    public int e;
    public final i f8060f;
    public final h h;
    public final s4.k f8061n;
    public final ku0 f8062r;
    public final k f8063s;
    public final l v;
    public final q f8064w;
    public final m f8065x;
    public final rx0 f8066y;

    public r(hs0 hs0Var, Context context) {
        super(context);
        this.W = hs0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        h hVar = new h();
        this.h = hVar;
        hVar.O = new g(this, 1);
        hVar.y1(this.d);
        s4.k kVar = new s4.k();
        this.f8061n = kVar;
        kVar.n(280L);
        kVar.o(bs.h);
        kVar.f45992m = false;
        i iVar = new i(this, context);
        this.f8060f = iVar;
        iVar.setScrollingTouchSlop(1);
        iVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        iVar.setPadding(0, 0, 0, 0);
        iVar.setItemAnimator(null);
        iVar.setClipToPadding(false);
        iVar.setSectionsType(2);
        iVar.setLayoutManager(hVar);
        addView(iVar, z5.d(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new wa(this, 5));
        iVar.setOnItemLongClickListener(new a1.c(this, 29));
        ?? im0Var = new im0(context, null);
        this.f8062r = im0Var;
        k kVar2 = new k(this);
        this.f8063s = kVar2;
        im0Var.setLayoutManager(kVar2);
        im0Var.i(new j(this, 1));
        kVar2.y1(this.e);
        im0Var.setVisibility(8);
        addView((View) im0Var, z5.d(-1.0f, -1));
        l lVar = new l(this, context);
        this.v = lVar;
        iVar.setAdapter(lVar);
        q qVar = new q(this, getContext());
        lVar.f8052f = qVar;
        this.f8064w = qVar;
        im0Var.setAdapter(qVar);
        m mVar = new m(this, context);
        this.f8065x = mVar;
        mVar.f24774w = false;
        rx0 rx0Var = new rx0(context, mVar, 1, null);
        this.f8066y = rx0Var;
        rx0Var.setVisibility(8);
        rx0Var.setAnimateLayoutChange(true);
        addView(rx0Var, z5.d(-1.0f, -1));
        rx0Var.setOnTouchListener(new d(0));
        rx0Var.e(true, false);
        rx0Var.f30079b.setVisibility(8);
        rx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        rx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(hs0Var.f8072b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        ei.d dVar = rx0Var.f30081f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        n nVar = new n(this, context);
        this.E = nVar;
        int i10 = h6.f21381y6;
        d6 d6Var = hs0Var.f8073c;
        nVar.setTextColor(h6.w0(i10, d6Var));
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        rx0Var.f30078a.addView(nVar, z5.t(165, -2, 17, 0, 17, 0, 12));
        ei.d dVar2 = new ei.d(context, d6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        rx0Var.f30078a.addView(dVar2, z5.q(-2, 44, 17));
        rx0Var.addView(mVar, 0, z5.d(-1.0f, -1));
        iVar.setEmptyView(rx0Var);
        iVar.W1 = true;
        iVar.X1 = 0;
        new SparseArray();
        new HashMap();
        y yVar = new y(new f(this, 0));
        this.G = yVar;
        yVar.d(iVar);
        o oVar = new o(context, d6Var);
        this.J = oVar;
        addView(oVar, z5.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f8058b) {
            float f7 = this.f8059c;
            float f10 = 1.0f;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            ku0 ku0Var = this.f8062r;
            i iVar = this.f8060f;
            if (i10 == 0) {
                this.f8058b = false;
                int i11 = this.e;
                this.d = i11;
                this.W.f8080y = i11;
                SharedConfig.setStoriesColumnsCount(i11);
                l lVar = this.v;
                int h = lVar.h();
                ku0Var.setVisibility(8);
                int i12 = this.d;
                h hVar = this.h;
                hVar.y1(i12);
                iVar.a0();
                iVar.invalidate();
                if (lVar.h() == h) {
                    AndroidUtilities.updateVisibleRows(iVar);
                } else {
                    lVar.l();
                }
                int i13 = this.S;
                if (i13 >= 0) {
                    View m10 = this.f8063s.m(i13);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    hVar.h1(this.S, (-iVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f8058b = false;
                ku0Var.setVisibility(8);
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
                ofFloat.addUpdateListener(new v4(this, 1));
                ofFloat.addListener(new p0(6, this, z10));
                ofFloat.setInterpolator(bs.f25037f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f8058b && !this.W.G.C1) {
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
                ku0 ku0Var = this.f8062r;
                ku0Var.setVisibility(0);
                ku0Var.setAdapter(this.f8064w);
                ku0Var.setPadding(ku0Var.getPaddingLeft(), 0, ku0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                k kVar = this.f8063s;
                kVar.y1(clamp);
                ku0Var.a0();
                kVar.O = new g(this, 0);
                AndroidUtilities.updateVisibleRows(this.f8060f);
                this.f8058b = true;
                this.f8059c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    kVar.h1(i14, this.T - ku0Var.getPaddingTop());
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
        ah.t tVar;
        int i12 = this.W.f8072b;
        t6 t6Var = this.f8057a;
        int i13 = 0;
        if (t6Var == null) {
            size = 0;
        } else {
            size = t6Var.f5152i.size();
        }
        t6 t6Var2 = this.f8057a;
        if (t6Var2 != null && !TextUtils.isEmpty(t6Var2.E)) {
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
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, r41.F(this.f8057a.E, null, null));
        }
        String string2 = LocaleController.getString(R.string.ProfileBotAddPreview);
        com.google.firebase.messaging.s sVar = new com.google.firebase.messaging.s(this, 3);
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
            tVar = null;
        } else {
            tVar = new ah.t(4, this, z10);
        }
        n nVar = oVar.f8050c;
        ei.d dVar = oVar.d;
        oVar.f8048a.setText(formatString);
        ai.v vVar = oVar.f8049b;
        vVar.g(string2, false, true);
        vVar.setOnClickListener(new g0(sVar, 17));
        if (string == null) {
            nVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            nVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new z6(1, tVar));
        }
        n nVar2 = this.E;
        ei.d dVar2 = this.F;
        rx0 rx0Var = this.f8066y;
        if (z10) {
            rx0Var.d.setVisibility(0);
            rx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            rx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            rx0Var.f30081f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            rx0Var.d.setVisibility(8);
            rx0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, r41.F(this.f8057a.E, null, null)));
            rx0Var.f30081f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        ei.d dVar3 = rx0Var.f30081f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f8062r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i iVar = this.f8060f;
        iVar.setPadding(iVar.getPaddingLeft(), iVar.W2, iVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(t6 t6Var) {
        if (this.f8057a != t6Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.f8080y;
        }
        this.f8057a = t6Var;
        l lVar = this.v;
        lVar.e = t6Var;
        if (lVar != lVar.f8055s.f8064w) {
            lVar.M();
        }
        lVar.l();
        q qVar = this.f8064w;
        qVar.e = t6Var;
        if (qVar != qVar.f8055s.f8064w) {
            qVar.M();
        }
        qVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f8066y.setTranslationY(f7);
        this.f8065x.setTranslationY(-f7);
    }
}
