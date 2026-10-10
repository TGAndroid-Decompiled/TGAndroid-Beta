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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.uu0;
import w7.x5;
public final class u extends FrameLayout {
    public static final int f3922a0 = 0;
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
    public final rs0 W;
    public v8 f3923a;
    public boolean f3924b;
    public float f3925c;
    public int d;
    public int f3926e;
    public final j f3927f;
    public final i h;
    public final s4.j f3928n;
    public final uu0 f3929r;
    public final l f3930s;
    public final m v;
    public final t f3931w;
    public final n f3932x;
    public final by0 f3933y;

    public u(rs0 rs0Var, Context context) {
        super(context);
        this.W = rs0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f3926e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.H = false;
        this.I = false;
        this.V = new Rect();
        i iVar = new i();
        this.h = iVar;
        iVar.O = new h(this, 1);
        iVar.y1(this.d);
        s4.j jVar = new s4.j();
        this.f3928n = jVar;
        jVar.n(280L);
        jVar.o(is.h);
        jVar.f47742m = false;
        j jVar2 = new j(this, context);
        this.f3927f = jVar2;
        jVar2.setScrollingTouchSlop(1);
        jVar2.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        jVar2.setPadding(0, 0, 0, 0);
        jVar2.setItemAnimator(null);
        jVar2.setClipToPadding(false);
        jVar2.setSectionsType(2);
        jVar2.setLayoutManager(iVar);
        addView(jVar2, x5.d(-1.0f, -1));
        jVar2.i(new k(this, 0));
        jVar2.setOnItemClickListener(new ai.g(this, 1));
        jVar2.setOnItemLongClickListener(new a1.c(this, 12));
        ?? rm0Var = new rm0(context, null);
        this.f3929r = rm0Var;
        l lVar = new l(this);
        this.f3930s = lVar;
        rm0Var.setLayoutManager(lVar);
        rm0Var.i(new k(this, 1));
        lVar.y1(this.f3926e);
        rm0Var.setVisibility(8);
        addView((View) rm0Var, x5.d(-1.0f, -1));
        m mVar = new m(this, context);
        this.v = mVar;
        jVar2.setAdapter(mVar);
        t tVar = new t(this, getContext());
        mVar.f3918f = tVar;
        this.f3931w = tVar;
        rm0Var.setAdapter(tVar);
        n nVar = new n(this, context);
        this.f3932x = nVar;
        nVar.f27857w = false;
        by0 by0Var = new by0(context, nVar, 1, null);
        this.f3933y = by0Var;
        by0Var.setVisibility(8);
        by0Var.setAnimateLayoutChange(true);
        addView(by0Var, x5.d(-1.0f, -1));
        by0Var.setOnTouchListener(new d(0));
        by0Var.e(true, false);
        by0Var.f25083b.setVisibility(8);
        by0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        by0Var.f25085e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(rs0Var.f3941b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        ci.d dVar = by0Var.f25086f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new e(this, 0));
        o oVar = new o(this, context);
        this.E = oVar;
        int i10 = i6.f21185y6;
        e6 e6Var = rs0Var.f3942c;
        oVar.setTextColor(i6.w0(i10, e6Var));
        oVar.setText(LocaleController.getString(R.string.ProfileBotOr));
        oVar.setTextSize(1, 14.0f);
        oVar.setTextAlignment(4);
        oVar.setGravity(17);
        oVar.setTypeface(AndroidUtilities.bold());
        by0Var.f25082a.addView(oVar, x5.t(165, -2, 17, 0, 17, 0, 12));
        ci.d dVar2 = new ci.d(context, e6Var, false);
        this.F = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        by0Var.f25082a.addView(dVar2, x5.q(-2, 44, 17));
        by0Var.addView(nVar, 0, x5.d(-1.0f, -1));
        jVar2.setEmptyView(by0Var);
        jVar2.W1 = true;
        jVar2.X1 = 0;
        new SparseArray();
        new HashMap();
        s4.z zVar = new s4.z(new g(this, 0));
        this.G = zVar;
        zVar.e(jVar2);
        r rVar = new r(context, e6Var);
        this.J = rVar;
        addView(rVar, x5.e(-1, -2, 48));
    }

    public final void a() {
        boolean z10;
        if (this.f3924b) {
            float f7 = this.f3925c;
            float f10 = 1.0f;
            int i10 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
            uu0 uu0Var = this.f3929r;
            j jVar = this.f3927f;
            if (i10 == 0) {
                this.f3924b = false;
                int i11 = this.f3926e;
                this.d = i11;
                this.W.f3950y = i11;
                SharedConfig.setStoriesColumnsCount(i11);
                m mVar = this.v;
                int h = mVar.h();
                uu0Var.setVisibility(8);
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
                    View m10 = this.f3930s.m(i13);
                    if (m10 != null) {
                        this.T = m10.getTop();
                    }
                    iVar.h1(this.S, (-jVar.getPaddingTop()) + this.T);
                }
            } else if (f7 == 0.0f) {
                this.f3924b = false;
                uu0Var.setVisibility(8);
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
                ofFloat.setInterpolator(is.f27443f);
                ofFloat.setDuration(200L);
                ofFloat.start();
            }
        }
    }

    public final void b(boolean z10) {
        int i10;
        int i11;
        if (!this.f3924b && !this.W.G.C1) {
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
            this.f3926e = clamp;
            if (clamp != this.d && !this.H) {
                uu0 uu0Var = this.f3929r;
                uu0Var.setVisibility(0);
                uu0Var.setAdapter(this.f3931w);
                uu0Var.setPadding(uu0Var.getPaddingLeft(), 0, uu0Var.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
                l lVar = this.f3930s;
                lVar.y1(clamp);
                uu0Var.a0();
                lVar.O = new h(this, 0);
                AndroidUtilities.updateVisibleRows(this.f3927f);
                this.f3924b = true;
                this.f3925c = 0.0f;
                int i14 = this.S;
                if (i14 >= 0) {
                    lVar.h1(i14, this.T - uu0Var.getPaddingTop());
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
        int i12 = this.W.f3941b;
        v8 v8Var = this.f3923a;
        int i13 = 0;
        if (v8Var == null) {
            size = 0;
        } else {
            size = v8Var.f899i.size();
        }
        v8 v8Var2 = this.f3923a;
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
            formatString = LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, c51.F(this.f3923a.E, null, null));
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
        o oVar = rVar.f3915c;
        ci.d dVar = rVar.d;
        rVar.f3913a.setText(formatString);
        q qVar = rVar.f3914b;
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
        by0 by0Var = this.f3933y;
        if (z10) {
            by0Var.d.setVisibility(0);
            by0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            by0Var.f25085e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i12).botPreviewMediasMax, new Object[0]));
            by0Var.f25086f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            by0Var.d.setVisibility(8);
            by0Var.f25085e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, c51.F(this.f3923a.E, null, null)));
            by0Var.f25086f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            oVar2.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new e(this, 1));
        }
        ci.d dVar3 = by0Var.f25086f;
        if (this.v.h() >= MessagesController.getInstance(i12).botPreviewMediasMax) {
            i13 = 8;
        }
        dVar3.setVisibility(i13);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view == this.f3929r) {
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        j jVar = this.f3927f;
        jVar.setPadding(jVar.getPaddingLeft(), jVar.W2, jVar.getPaddingRight(), this.J.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(v8 v8Var) {
        if (this.f3923a != v8Var) {
            this.H = false;
            this.I = false;
            this.d = this.W.f3950y;
        }
        this.f3923a = v8Var;
        m mVar = this.v;
        mVar.f3917e = v8Var;
        if (mVar != mVar.f3921s.f3931w) {
            mVar.M();
        }
        mVar.l();
        t tVar = this.f3931w;
        tVar.f3917e = v8Var;
        if (tVar != tVar.f3921s.f3931w) {
            tVar.M();
        }
        tVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f7 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.f3933y.setTranslationY(f7);
        this.f3932x.setTranslationY(-f7);
    }
}
