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
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.su0;
import org.telegram.ui.Components.us0;
import s4.z;
public final class r extends FrameLayout {
    public static final int f10000a0 = 0;
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
    public final us0 W;
    public s6 f10001a;
    public boolean f10002b;
    public float f10003c;
    public int d;
    public int e;
    public final i f10004f;
    public final h h;
    public final s4.l f10005n;
    public final su0 f10006r;
    public final k f10007s;
    public final l v;
    public final q f10008w;
    public final m f10009x;
    public final ey0 f10010y;

    public r(us0 us0Var, Context context) {
        super(context);
        this.W = us0Var;
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
        this.f10005n = lVar;
        lVar.n(280L);
        lVar.o(ds.h);
        lVar.f47763m = false;
        i iVar = new i(this, context);
        this.f10004f = iVar;
        iVar.setScrollingTouchSlop(1);
        iVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        iVar.setPadding(0, 0, 0, 0);
        iVar.setItemAnimator(null);
        iVar.setClipToPadding(false);
        iVar.setSectionsType(2);
        iVar.setLayoutManager(hVar);
        addView(iVar, gb1.g(-1.0f, -1));
        iVar.i(new j(this, 0));
        iVar.setOnItemClickListener(new ai.k(this, 6));
        iVar.setOnItemLongClickListener(new e1.c(this, 2));
        ?? mm0Var = new mm0(context, null);
        this.f10006r = mm0Var;
        k kVar = new k(this);
        this.f10007s = kVar;
        mm0Var.setLayoutManager(kVar);
        mm0Var.i(new j(this, 1));
        kVar.z1(this.e);
        mm0Var.setVisibility(8);
        addView((View) mm0Var, gb1.g(-1.0f, -1));
        l lVar2 = new l(this, context);
        this.v = lVar2;
        iVar.setAdapter(lVar2);
        q qVar = new q(this, getContext());
        lVar2.f9996f = qVar;
        this.f10008w = qVar;
        mm0Var.setAdapter(qVar);
        m mVar = new m(this, context);
        this.f10009x = mVar;
        mVar.f27031w = false;
        ey0 ey0Var = new ey0(context, mVar, 1, null);
        this.f10010y = ey0Var;
        ey0Var.setVisibility(8);
        ey0Var.setAnimateLayoutChange(true);
        addView(ey0Var, gb1.g(-1.0f, -1));
        ey0Var.setOnTouchListener(new d(0));
        ey0Var.e(true, false);
        ey0Var.f28015b.setVisibility(8);
        ey0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        ey0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(us0Var.f10016b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        fi.d dVar = ey0Var.f28017f;
        dVar.i(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        n nVar = new n(this, context);
        this.E = nVar;
        int i10 = y6.f23748y6;
        u6 u6Var = us0Var.f10017c;
        f7.V(nVar, i10, u6Var);
        nVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        nVar.setTextSize(1, 14.0f);
        nVar.setTextAlignment(4);
        nVar.setGravity(17);
        nVar.setTypeface(AndroidUtilities.bold());
        ey0Var.f28014a.addView(nVar, gb1.x(165, -2, 17, 0, 17, 0, 12));
        fi.d dVar2 = new fi.d(context, u6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        ey0Var.f28014a.addView(dVar2, gb1.u(-2, 44, 17));
        ey0Var.addView(mVar, 0, gb1.g(-1.0f, -1));
        iVar.setEmptyView(ey0Var);
        iVar.W1 = true;
        iVar.X1 = 0;
        new SparseArray();
        new HashMap();
        z zVar = new z(new f(this, 0));
        this.G = zVar;
        zVar.h(iVar);
        o oVar = new o(context, u6Var);
        this.J = oVar;
        addView(oVar, gb1.i(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f10002b) {
            float f7 = this.f10003c;
            float f10 = 1.0f;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            su0 su0Var = this.f10006r;
            i iVar = this.f10004f;
            if (i10 == 0) {
                this.f10002b = false;
                int i11 = this.e;
                this.d = i11;
                this.W.f10024y = i11;
                SharedConfig.setStoriesColumnsCount(i11);
                l lVar = this.v;
                int h = lVar.h();
                su0Var.setVisibility(8);
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
                    View m10 = this.f10007s.m(i13);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    hVar.h1(this.S, (-iVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f10002b = false;
                su0Var.setVisibility(8);
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
                ofFloat.setInterpolator(ds.f27586f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f10002b && !this.W.G.E1) {
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
                su0 su0Var = this.f10006r;
                su0Var.setVisibility(0);
                su0Var.setAdapter(this.f10008w);
                su0Var.setPadding(su0Var.getPaddingLeft(), 0, su0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                k kVar = this.f10007s;
                kVar.z1(clamp);
                su0Var.a0();
                kVar.O = new g(this, 0);
                AndroidUtilities.updateVisibleRows(this.f10004f);
                this.f10002b = true;
                this.f10003c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    kVar.h1(i14, this.T - su0Var.getPaddingTop());
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
        int i12 = this.W.f10016b;
        s6 s6Var = this.f10001a;
        int i13 = 0;
        if (s6Var == null) {
            size = 0;
        } else {
            size = s6Var.f9493i.size();
        }
        s6 s6Var2 = this.f10001a;
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
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, f51.N(this.f10001a.E, null, null));
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
        n nVar2 = oVar.f9994c;
        fi.d dVar = oVar.d;
        oVar.f9992a.setText(formatString);
        bi.v vVar = oVar.f9993b;
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
        ey0 ey0Var = this.f10010y;
        if (z10) {
            ey0Var.d.setVisibility(0);
            ey0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            ey0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            ey0Var.f28017f.i(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar3.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            ey0Var.d.setVisibility(8);
            ey0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, f51.N(this.f10001a.E, null, null)));
            ey0Var.f28017f.i(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            nVar3.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.i(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        fi.d dVar3 = ey0Var.f28017f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.f10006r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        i iVar = this.f10004f;
        iVar.setPadding(iVar.getPaddingLeft(), iVar.f32682f3, iVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(s6 s6Var) {
        if (this.f10001a != s6Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.f10024y;
        }
        this.f10001a = s6Var;
        l lVar = this.v;
        lVar.e = s6Var;
        if (lVar != lVar.f9999s.f10008w) {
            lVar.M();
        }
        lVar.l();
        q qVar = this.f10008w;
        qVar.e = s6Var;
        if (qVar != qVar.f9999s.f10008w) {
            qVar.M();
        }
        qVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f10010y.setTranslationY(f7);
        this.f10009x.setTranslationY(-f7);
    }
}
