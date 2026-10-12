package bi;

import ai.l6;
import ai.v0;
import ai.v8;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.zu0;
import w7.w5;
public final class u extends FrameLayout {
    public static final int f3921a0 = 0;
    public final o E;
    public final ci.d F;
    public final s4.z G;
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
    public final ws0 W;
    public v8 f3922a;
    public boolean f3923b;
    public float f3924c;
    public int d;
    public int f3925e;
    public final j f3926f;
    public final i h;
    public final s4.j f3927n;
    public final zu0 f3928r;
    public final l f3929s;
    public final m v;
    public final t f3930w;
    public final n f3931x;
    public final gy0 f3932y;

    public u(ws0 ws0Var, Context context) {
        super(context);
        this.W = ws0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f3925e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        i iVar = new i();
        this.h = iVar;
        iVar.O = new h(this, 1);
        iVar.y1(this.d);
        s4.j jVar = new s4.j();
        this.f3927n = jVar;
        jVar.n(280L);
        jVar.o(js.h);
        jVar.f47937m = false;
        j jVar2 = new j(this, context);
        this.f3926f = jVar2;
        jVar2.setScrollingTouchSlop(1);
        jVar2.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        jVar2.setPadding(0, 0, 0, 0);
        jVar2.setItemAnimator(null);
        jVar2.setClipToPadding(false);
        jVar2.setSectionsType(2);
        jVar2.setLayoutManager(iVar);
        addView(jVar2, w5.d(-1.0f, -1));
        jVar2.i(new k(this, 0));
        jVar2.setOnItemClickListener(new ai.g(this, 1));
        jVar2.setOnItemLongClickListener(new a1.c(this, 12));
        ?? wm0Var = new wm0(context, null);
        this.f3928r = wm0Var;
        l lVar = new l(this);
        this.f3929s = lVar;
        wm0Var.setLayoutManager(lVar);
        wm0Var.i(new k(this, 1));
        lVar.y1(this.f3925e);
        wm0Var.setVisibility(8);
        addView((View) wm0Var, w5.d(-1.0f, -1));
        m mVar = new m(this, context);
        this.v = mVar;
        jVar2.setAdapter(mVar);
        t tVar = new t(this, getContext());
        mVar.f3917f = tVar;
        this.f3930w = tVar;
        wm0Var.setAdapter(tVar);
        n nVar = new n(this, context);
        this.f3931x = nVar;
        nVar.f28350w = false;
        gy0 gy0Var = new gy0(context, nVar, 1, null);
        this.f3932y = gy0Var;
        gy0Var.setVisibility(8);
        gy0Var.setAnimateLayoutChange(true);
        addView(gy0Var, w5.d(-1.0f, -1));
        gy0Var.setOnTouchListener(new d(0));
        gy0Var.e(true, false);
        gy0Var.f26559b.setVisibility(8);
        gy0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        gy0Var.f26561e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(ws0Var.f3940b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        ci.d dVar = gy0Var.f26562f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        o oVar = new o(this, context);
        this.E = oVar;
        int i10 = h6.f20946y6;
        c6 c6Var = ws0Var.f3941c;
        oVar.setTextColor(h6.w0(i10, c6Var));
        oVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        oVar.setTextSize(1, 14.0f);
        oVar.setTextAlignment(4);
        oVar.setGravity(17);
        oVar.setTypeface(AndroidUtilities.bold());
        gy0Var.f26558a.addView(oVar, w5.t(165, -2, 17, 0, 17, 0, 12));
        ci.d dVar2 = new ci.d(context, c6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        gy0Var.f26558a.addView(dVar2, w5.q(-2, 44, 17));
        gy0Var.addView(nVar, 0, w5.d(-1.0f, -1));
        jVar2.setEmptyView(gy0Var);
        jVar2.W1 = true;
        jVar2.X1 = 0;
        new SparseArray();
        new HashMap();
        s4.z zVar = new s4.z(new g(this, 0));
        this.G = zVar;
        zVar.e(jVar2);
        r rVar = new r(context, c6Var);
        this.J = rVar;
        addView(rVar, w5.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f3923b) {
            float f7 = this.f3924c;
            float f10 = 1.0f;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            zu0 zu0Var = this.f3928r;
            j jVar = this.f3926f;
            if (i10 == 0) {
                this.f3923b = false;
                int i11 = this.f3925e;
                this.d = i11;
                this.W.f3949y = i11;
                SharedConfig.setStoriesColumnsCount(i11);
                m mVar = this.v;
                int h = mVar.h();
                zu0Var.setVisibility(8);
                int i12 = this.d;
                i iVar = this.h;
                iVar.y1(i12);
                jVar.a0();
                jVar.invalidate();
                if (mVar.h() == h) {
                    AndroidUtilities.updateVisibleRows(jVar);
                } else {
                    mVar.l();
                }
                int i13 = this.S;
                if (i13 >= 0) {
                    View m10 = this.f3929s.m(i13);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    iVar.h1(this.S, (-jVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f3923b = false;
                zu0Var.setVisibility(8);
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
                ofFloat.setInterpolator(js.f27634f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f3923b && !this.W.G.C1) {
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
            this.f3925e = clamp;
            if (clamp != this.d && !this.H) {
                zu0 zu0Var = this.f3928r;
                zu0Var.setVisibility(0);
                zu0Var.setAdapter(this.f3930w);
                zu0Var.setPadding(zu0Var.getPaddingLeft(), 0, zu0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                l lVar = this.f3929s;
                lVar.y1(clamp);
                zu0Var.a0();
                lVar.O = new h(this, 0);
                AndroidUtilities.updateVisibleRows(this.f3926f);
                this.f3923b = true;
                this.f3924c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    lVar.h1(i14, this.T - zu0Var.getPaddingTop());
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
        int i12 = this.W.f3940b;
        v8 v8Var = this.f3922a;
        int i13 = 0;
        if (v8Var == null) {
            size = 0;
        } else {
            size = v8Var.f897i.size();
        }
        v8 v8Var2 = this.f3922a;
        if (v8Var2 != null && !TextUtils.isEmpty(v8Var2.E)) {
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
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, g51.F(this.f3922a.E, null, null));
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
        o oVar = rVar.f3914c;
        ci.d dVar = rVar.d;
        rVar.f3912a.setText(formatString);
        q qVar = rVar.f3913b;
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
        gy0 gy0Var = this.f3932y;
        if (z10) {
            gy0Var.d.setVisibility(0);
            gy0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            gy0Var.f26561e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            gy0Var.f26562f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            gy0Var.d.setVisibility(8);
            gy0Var.f26561e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, g51.F(this.f3922a.E, null, null)));
            gy0Var.f26562f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        ci.d dVar3 = gy0Var.f26562f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f3928r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        j jVar = this.f3926f;
        jVar.setPadding(jVar.getPaddingLeft(), jVar.W2, jVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(v8 v8Var) {
        if (this.f3922a != v8Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.f3949y;
        }
        this.f3922a = v8Var;
        m mVar = this.v;
        mVar.f3916e = v8Var;
        if (mVar != mVar.f3920s.f3930w) {
            mVar.M();
        }
        mVar.l();
        t tVar = this.f3930w;
        tVar.f3916e = v8Var;
        if (tVar != tVar.f3920s.f3930w) {
            tVar.M();
        }
        tVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f3932y.setTranslationY(f7);
        this.f3931x.setTranslationY(-f7);
    }
}
