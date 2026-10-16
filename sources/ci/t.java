package ci;

import ah.g0;
import ah.p0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.f8;
import bi.la;
import bi.w5;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.x41;
import w7.z5;
public final class t extends FrameLayout {
    public static final int f4782a0 = 0;
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
    public final ms0 W;
    public f8 f4783a;
    public boolean f4784b;
    public float f4785c;
    public int d;
    public int e;
    public final i f4786f;
    public final h h;
    public final s4.k f4787n;
    public final pu0 f4788r;
    public final k f4789s;
    public final l v;
    public final s f4790w;
    public final m f4791x;
    public final wx0 f4792y;

    public t(ms0 ms0Var, Context context) {
        super(context);
        this.W = ms0Var;
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
        this.f4787n = kVar;
        kVar.n(280L);
        kVar.o(es.h);
        kVar.f44872m = false;
        i iVar = new i(this, context);
        this.f4786f = iVar;
        iVar.setScrollingTouchSlop(1);
        iVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        iVar.setPadding(0, 0, 0, 0);
        iVar.setItemAnimator(null);
        iVar.setClipToPadding(false);
        iVar.setSectionsType(2);
        iVar.setLayoutManager(hVar);
        addView(iVar, z5.d(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new bi.d(this, 1));
        iVar.setOnItemLongClickListener(new a1.c(this, 14));
        ?? mm0Var = new mm0(context, null);
        this.f4788r = mm0Var;
        k kVar2 = new k(this);
        this.f4789s = kVar2;
        mm0Var.setLayoutManager(kVar2);
        mm0Var.i(new j(this, 1));
        kVar2.y1(this.e);
        mm0Var.setVisibility(8);
        addView((View) mm0Var, z5.d(-1.0f, -1));
        l lVar = new l(this, context);
        this.v = lVar;
        iVar.setAdapter(lVar);
        s sVar = new s(this, getContext());
        lVar.f4778f = sVar;
        this.f4790w = sVar;
        mm0Var.setAdapter(sVar);
        m mVar = new m(this, context);
        this.f4791x = mVar;
        mVar.f24549w = false;
        wx0 wx0Var = new wx0(context, mVar, 1, null);
        this.f4792y = wx0Var;
        wx0Var.setVisibility(8);
        wx0Var.setAnimateLayoutChange(true);
        addView(wx0Var, z5.d(-1.0f, -1));
        wx0Var.setOnTouchListener(new d(0));
        wx0Var.e(true, false);
        wx0Var.f30688b.setVisibility(8);
        wx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        wx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(ms0Var.f4800b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        di.d dVar = wx0Var.f30690f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        n nVar = new n(this, context);
        this.E = nVar;
        int i10 = g6.f19988y6;
        c6 c6Var = ms0Var.f4801c;
        nVar.setTextColor(g6.w0(i10, c6Var));
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        wx0Var.f30687a.addView(nVar, z5.t(165, -2, 17, 0, 17, 0, 12));
        di.d dVar2 = new di.d(context, c6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        wx0Var.f30687a.addView(dVar2, z5.q(-2, 44, 17));
        wx0Var.addView(mVar, 0, z5.d(-1.0f, -1));
        iVar.setEmptyView(wx0Var);
        iVar.W1 = true;
        iVar.X1 = 0;
        new SparseArray();
        new HashMap();
        s4.y yVar = new s4.y(new f(this, 0));
        this.G = yVar;
        yVar.d(iVar);
        q qVar = new q(context, c6Var);
        this.J = qVar;
        addView(qVar, z5.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f4784b) {
            float f7 = this.f4785c;
            float f10 = 1.0f;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            pu0 pu0Var = this.f4788r;
            i iVar = this.f4786f;
            if (i10 == 0) {
                this.f4784b = false;
                int i11 = this.e;
                this.d = i11;
                this.W.f4808y = i11;
                SharedConfig.setStoriesColumnsCount(i11);
                l lVar = this.v;
                int h = lVar.h();
                pu0Var.setVisibility(8);
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
                    View m10 = this.f4789s.m(i13);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    hVar.h1(this.S, (-iVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f4784b = false;
                pu0Var.setVisibility(8);
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
                ofFloat.addUpdateListener(new w5(this, 1));
                ofFloat.addListener(new p0(6, this, z10));
                ofFloat.setInterpolator(es.f24465f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f4784b && !this.W.G.C1) {
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
                pu0 pu0Var = this.f4788r;
                pu0Var.setVisibility(0);
                pu0Var.setAdapter(this.f4790w);
                pu0Var.setPadding(pu0Var.getPaddingLeft(), 0, pu0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                k kVar = this.f4789s;
                kVar.y1(clamp);
                pu0Var.a0();
                kVar.O = new g(this, 0);
                AndroidUtilities.updateVisibleRows(this.f4786f);
                this.f4784b = true;
                this.f4785c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    kVar.h1(i14, this.T - pu0Var.getPaddingTop());
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
        int i12 = this.W.f4800b;
        f8 f8Var = this.f4783a;
        int i13 = 0;
        if (f8Var == null) {
            size = 0;
        } else {
            size = f8Var.f3433i.size();
        }
        f8 f8Var2 = this.f4783a;
        if (f8Var2 != null && !TextUtils.isEmpty(f8Var2.E)) {
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
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, x41.F(this.f4783a.E, null, null));
        }
        String string2 = LocaleController.getString(R.string.ProfileBotAddPreview);
        la laVar = new la(this, 10);
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
            tVar = new ah.t(1, this, z10);
        }
        n nVar = qVar.f4776c;
        di.d dVar = qVar.d;
        qVar.f4774a.setText(formatString);
        p pVar = qVar.f4775b;
        pVar.g(string2, false, true);
        pVar.setOnClickListener(new g0(laVar, 7));
        if (string == null) {
            nVar.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            nVar.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new o(0, tVar));
        }
        n nVar2 = this.E;
        di.d dVar2 = this.F;
        wx0 wx0Var = this.f4792y;
        if (z10) {
            wx0Var.d.setVisibility(0);
            wx0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            wx0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            wx0Var.f30690f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            wx0Var.d.setVisibility(8);
            wx0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, x41.F(this.f4783a.E, null, null)));
            wx0Var.f30690f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        di.d dVar3 = wx0Var.f30690f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f4788r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i iVar = this.f4786f;
        iVar.setPadding(iVar.getPaddingLeft(), iVar.W2, iVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(f8 f8Var) {
        if (this.f4783a != f8Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.f4808y;
        }
        this.f4783a = f8Var;
        l lVar = this.v;
        lVar.e = f8Var;
        if (lVar != lVar.f4781s.f4790w) {
            lVar.M();
        }
        lVar.l();
        s sVar = this.f4790w;
        sVar.e = f8Var;
        if (sVar != sVar.f4781s.f4790w) {
            sVar.M();
        }
        sVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f4792y.setTranslationY(f7);
        this.f4791x.setTranslationY(-f7);
    }
}
