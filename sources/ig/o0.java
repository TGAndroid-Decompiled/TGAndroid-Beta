package ig;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import hh.bb;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d5;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.x5;

public abstract class o0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final k5 D;
    public int E;
    public final jq F;
    public final i6 G;
    public final i6 H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public a9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final c6 X;
    public final nc Y;
    public final bb Z;

    public final TLRPC.ReactionCount f11377a;

    public final oi0 f11378a0;

    public final boolean f11379b;

    public int f11381c;
    public int d;

    public int f11384e;

    public boolean f11385e0;

    public int f11386f;

    public ImageReceiver f11387f0;

    public int f11388g;

    public k5 f11389g0;
    public int h;

    public int f11390i;

    public int f11391j;

    public final int f11392k;

    public final boolean f11394m;

    public boolean f11395n;

    public String f11396o;

    public boolean f11397p;

    public boolean f11398q;

    public final TLRPC.Reaction f11399r;

    public final q0 f11400s;

    public boolean f11402u;
    public final String v;

    public int f11403w;

    public int f11404x;

    public int f11405y;

    public int f11406z;

    public boolean f11393l = true;

    public final Rect f11401t = new Rect();

    public final RectF f11380b0 = new RectF();

    public final RectF f11382c0 = new RectF();

    public final Path f11383d0 = new Path();

    public o0(o0 o0Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, c6 c6Var) {
        bb bbVar;
        oi0 oi0Var;
        fg.a aVar = new fg.a(this, 4);
        this.V = i10;
        this.W = view;
        this.Y = new nc(view);
        this.X = c6Var;
        this.S = z11;
        if (o0Var != null) {
            this.F = o0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new jq(view, false, null);
        }
        if (this.G == null) {
            i6 i6Var = new i6(true, true, true, false);
            this.G = i6Var;
            i6Var.E = true;
            i6Var.k(0.4f, 320L, er.h);
            i6Var.t(AndroidUtilities.dp(13.0f));
            i6Var.setCallback(aVar);
            i6Var.u(AndroidUtilities.bold());
            i6Var.G = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            i6 i6Var2 = new i6(false, false, false, true);
            this.H = i6Var2;
            i6Var2.t(AndroidUtilities.dp(12.0f));
            i6Var2.setCallback(aVar);
            i6Var2.u(AndroidUtilities.bold());
            i6Var2.G = AndroidUtilities.displaySize.x;
            i6Var2.v = 0.35f;
        }
        this.f11377a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f11399r = reaction;
        q0 q0VarD = q0.d(reaction);
        this.f11400s = q0VarD;
        int i11 = reactionCount.count;
        this.f11403w = i11;
        this.f11397p = reactionCount.chosen;
        this.f11391j = i11;
        this.f11392k = reactionCount.chosen_order;
        this.f11379b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f11396o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f11396o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else {
            if (!(reaction instanceof TLRPC.TL_reactionCustomEmoji)) {
                throw new RuntimeException("unsupported");
            }
            this.f11396o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        jq jqVar = this.F;
        jqVar.G = false;
        jqVar.f29775a = true;
        if (reaction != null) {
            if (q0VarD.f11408a) {
                this.f11394m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (o0Var == null || (oi0Var = o0Var.f11378a0) == null) {
                        this.f11378a0 = new oi0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), "star_reaction_click", AndroidUtilities.dp(40.0f));
                    } else {
                        this.f11378a0 = oi0Var;
                    }
                    this.C.setImageBitmap(this.f11378a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (o0Var == null || (bbVar = o0Var.Z) == null) {
                    bbVar = new bb(1, SharedConfig.getDevicePerformanceClass() == 2 ? 18 : 8);
                }
                this.Z = bbVar;
            } else if (q0VarD.f11412f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(q0VarD.f11412f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, g6.f22999a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (q0VarD.f11413g != 0) {
                this.D = new k5(j(), i10, q0VarD.f11413g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.f29778e = r0.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f11402u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f11402u) {
            i6 i6Var3 = this.G;
            i6Var3.q(Emoji.replaceEmoji(this.v, i6Var3.f29238a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof sm0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f11403w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            i6 i6Var4 = this.G;
            if (i6Var4 != null) {
                i6Var4.q("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f11403w, false);
        }
        jq jqVar2 = this.F;
        jqVar2.I = 2;
        jqVar2.f29797z = 3;
    }

    public final void a() {
        this.f11385e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        a9 a9Var = this.T;
        if (a9Var != null) {
            a9Var.g();
        }
        k5 k5Var = this.D;
        if (k5Var != null) {
            k5Var.a(this.W);
        }
    }

    public final void b() {
        this.f11385e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        a9 a9Var = this.T;
        if (a9Var != null) {
            a9Var.h();
        }
        k5 k5Var = this.D;
        if (k5Var != null) {
            k5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f11387f0;
        if (imageReceiver == null && this.f11389g0 == null) {
            return;
        }
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
            this.f11387f0 = null;
        } else if (this.f11389g0 != null) {
            View view = this.W;
            if (view != null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            this.f11389g0.o(view);
            this.f11389g0 = null;
        }
    }

    public final void d(Canvas canvas, float f10, float f11, float f12, float f13, boolean z10, boolean z11, float f14) {
        int i10;
        float f15;
        float f16;
        float f17;
        RectF rectF;
        float f18;
        boolean z12;
        float f19;
        float f20;
        float fD;
        jq jqVar;
        float f21;
        int i11;
        a9 a9Var;
        float f22;
        float f23;
        int iDp;
        int iDp2;
        Paint paint;
        d5 d5VarX2;
        k5 k5Var = this.D;
        ImageReceiver imageReceiver = k5Var != null ? k5Var.f29961k : this.C;
        boolean z13 = this.f11379b;
        Rect rect = this.f11401t;
        if (z13 && imageReceiver != null) {
            imageReceiver.setAlpha(f13);
            rect.set((int) f10, (int) f11, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
            imageReceiver.setImageCoords(rect);
            imageReceiver.setRoundRadius(0);
            f(canvas, rect, f13);
            return;
        }
        boolean z14 = this.f11397p;
        View view = this.W;
        boolean z15 = this.f11394m;
        c6 c6Var = this.X;
        if (z14) {
            if (z15) {
                this.J = -1529086;
                this.K = -1;
                this.M = -1;
                this.L = -1529086;
            } else {
                this.J = g6.v0(m() ? g6.Sb : g6.Cj, c6Var);
                this.K = g6.v0(m() ? g6.Gj : g6.Fj, c6Var);
                if (view instanceof v0) {
                    this.M = g6.v0(g6.Ij, c6Var);
                    this.L = g6.v0(g6.Hj, c6Var);
                } else {
                    this.M = g6.v0(m() ? g6.Sb : g6.Cj, c6Var);
                    this.L = g6.v0(m() ? g6.Aa : g6.f23305ra, c6Var);
                }
            }
            i10 = 0;
        } else if (z15) {
            this.K = -1529086;
            this.J = 1088989954;
            this.M = -1;
            i10 = 0;
            this.L = 0;
        } else {
            this.K = g6.v0(m() ? g6.Dj : g6.Ej, c6Var);
            int iV0 = g6.v0(m() ? g6.Sb : g6.Cj, c6Var);
            this.J = iV0;
            this.J = i0.b.k(iV0, (int) (Color.alpha(iV0) * 0.156f));
            this.M = g6.v0(g6.f23150ic, c6Var);
            i10 = 0;
            this.L = 0;
        }
        if (this.f11398q) {
            this.J = i10;
            this.L = i10;
        }
        s(f12);
        TextPaint textPaint = r0.Y;
        textPaint.setColor(this.N);
        i6 i6Var = this.G;
        if (i6Var != null) {
            i6Var.r(this.N);
        }
        Paint paint2 = r0.V;
        paint2.setColor(this.O);
        boolean z16 = this.S && i() && Color.alpha(this.P) == 0;
        if (f13 != 1.0f) {
            f15 = 1.0f;
            textPaint.setAlpha((int) (textPaint.getAlpha() * f13));
            paint2.setAlpha((int) (paint2.getAlpha() * f13));
        } else {
            f15 = 1.0f;
        }
        if (imageReceiver != null) {
            imageReceiver.setAlpha(f13);
        }
        i6 i6Var2 = this.H;
        if (f14 > 0.0f) {
            f16 = 0.0f;
            if (this.I != z11) {
                if (z11) {
                    er erVar = er.f28126k;
                    i6Var2.f29256u = 0.6f;
                    i6Var2.f29253r = 650L;
                    i6Var2.f29255t = 1.6f;
                    i6Var2.f29254s = erVar;
                    i6Var2.q(AndroidUtilities.formatWholeNumber(this.f11403w, 0), false, true);
                    i6Var2.q(LocaleController.formatNumber(this.f11403w, ','), true, true);
                } else {
                    er erVar2 = er.h;
                    i6Var2.f29256u = 0.6f;
                    i6Var2.f29253r = 320L;
                    i6Var2.f29255t = 1.6f;
                    i6Var2.f29254s = erVar2;
                    i6Var2.q(AndroidUtilities.formatWholeNumber(this.f11403w, 0), true, true);
                }
                this.I = z11;
            } else {
                imageReceiver = imageReceiver;
                i6Var = i6Var;
                paint2 = paint2;
                z15 = z15;
            }
        } else {
            imageReceiver = imageReceiver;
            i6Var = i6Var;
            paint2 = paint2;
            z15 = z15;
            f16 = 0.0f;
        }
        float fA = this.Y.a(0.1f);
        int iZ = this.A;
        if (f14 <= 0.0f || this.S || i6Var2 == null || this.T != null) {
            if (f12 != f15) {
                f17 = 8.0f;
                if (this.f11381c == 3) {
                    iZ = (int) com.google.android.recaptcha.internal.a.z(1.0f, f12, this.f11386f, iZ * f12);
                }
            }
            rectF = AndroidUtilities.rectTmp;
            f18 = iZ;
            rectF.set(f10, f11, f10 + f18, this.B + f11);
            if (fA != 1.0f) {
                canvas.save();
                canvas.scale(fA, fA, (f18 / 2.0f) + f10, (this.B / 2.0f) + f11);
                z12 = true;
            } else {
                z12 = false;
            }
            f19 = this.B / 2.0f;
            if (k() > f16 || this.f11398q) {
                f20 = 2.0f;
            } else {
                Paint paintT0 = g6.T0("paintChatActionBackground", c6Var);
                Paint paintT1 = g6.T0("paintChatActionBackgroundDarken", c6Var);
                f20 = 2.0f;
                int alpha = paintT0.getAlpha();
                int alpha2 = paintT1.getAlpha();
                paintT0.setAlpha((int) (alpha * f13 * k()));
                paintT1.setAlpha((int) (alpha2 * f13 * k()));
                h(canvas, rectF, f19, paintT0);
                if (c6Var == null ? g6.a1() : c6Var.u0()) {
                    h(canvas, rectF, f19, paintT1);
                }
                paintT0.setAlpha(alpha);
                paintT1.setAlpha(alpha2);
            }
            if (z10 && k() < 1.0f && (view instanceof s1) && (d5VarX2 = ((s1) view).x2(false)) != null && !this.S) {
                canvas.drawRoundRect(rectF, f19, f19, d5VarX2.f22845c);
            }
            if (z16) {
                rectF.right += AndroidUtilities.dp(4.0f);
                canvas.saveLayerAlpha(rectF, 255, 31);
                rectF.right -= AndroidUtilities.dp(4.0f);
            }
            if (this.Z != null) {
                LiteMode.isEnabled(8200);
            }
            h(canvas, rectF, f19, paint2);
            if (this.S && i()) {
                if (z16) {
                    paint = r0.X;
                } else {
                    paint = r0.W;
                    paint.setColor(this.P);
                    paint.setAlpha((int) (paint.getAlpha() * f13));
                }
                canvas.drawCircle(rectF.right - AndroidUtilities.dp(8.4f), rectF.centerY(), AndroidUtilities.dp(2.66f), paint);
            }
            if (z16) {
                canvas.restore();
            }
            if (imageReceiver != null) {
                if (z15) {
                    iDp = AndroidUtilities.dp(22.0f);
                    iDp2 = AndroidUtilities.dp(4.0f);
                } else if (k5Var != null) {
                    iDp = AndroidUtilities.dp(24.0f);
                    iDp2 = AndroidUtilities.dp(6.0f);
                    imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
                } else {
                    iDp = AndroidUtilities.dp(20.0f);
                    iDp2 = AndroidUtilities.dp(f17);
                    imageReceiver.setRoundRadius(0);
                }
                int i12 = (int) ((this.B - iDp) / f20);
                if (this.S) {
                    iDp2 -= AndroidUtilities.dp(f20);
                }
                int i13 = ((int) f10) + iDp2;
                int i14 = ((int) f11) + i12;
                rect.set(i13, i14, i13 + iDp, iDp + i14);
                f(canvas, rect, f13);
            }
            if (i6Var != null || i6Var.g() <= f16) {
                fD = 0.0f;
            } else {
                canvas.save();
                if (!this.f11402u || i()) {
                    f23 = this.f11402u ? 9 : 8;
                } else {
                    f23 = 10.0f;
                }
                canvas.translate(AndroidUtilities.dp(f23) + f10 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f20), f11);
                i6 i6Var3 = i6Var;
                i6Var3.setBounds(0, 0, this.A, this.B);
                i6Var3.draw(canvas);
                i6Var3.f29257w = (int) (f13 * 255.0f);
                canvas.restore();
                fD = i6Var3.d() + (i6Var3.g() * AndroidUtilities.dp(4.0f));
            }
            if (f14 > 0.0f || this.S || i6Var2 == null || this.T != null) {
                jqVar = this.F;
                if (jqVar != null && e()) {
                    canvas.save();
                    if (this.f11402u || i()) {
                        f21 = this.f11402u ? 9 : 8;
                    } else {
                        f21 = 10.0f;
                    }
                    float fDp = AndroidUtilities.dp(f21) + f10 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(k5Var == null ? 2.0f : 5.0f) + fD;
                    if (z15) {
                        i11 = -AndroidUtilities.dp(1.0f);
                    } else {
                        i11 = 0;
                    }
                    canvas.translate(fDp + i11, f11);
                    jqVar.a(canvas);
                    canvas.restore();
                }
            } else {
                canvas.save();
                if (!this.f11402u || i()) {
                    f22 = this.f11402u ? 9 : 8;
                } else {
                    f22 = 10.0f;
                }
                canvas.translate(AndroidUtilities.dp(f22) + f10 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(k5Var == null ? 2.0f : 5.0f), f11 - AndroidUtilities.dp(1.0f));
                i6Var2.setBounds(0, 0, this.A, this.B);
                i6Var2.draw(canvas);
                i6Var2.f29257w = (int) (255.0f * f13);
                canvas.restore();
            }
            if (!this.S && this.T != null) {
                canvas.save();
                canvas.translate(f10 + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f20), f11);
                a9Var = this.T;
                a9Var.f26680u = f13;
                if (a9Var.f26681w && a9Var.f26665e != f12) {
                    a9Var.f26665e = f12;
                    if (f12 == 1.0f) {
                        a9Var.n();
                        a9Var.f26681w = false;
                    }
                }
                this.T.i(canvas);
                canvas.restore();
            }
            if (z12) {
                canvas.restore();
            }
        }
        iZ = (int) (i6Var2.d() + AndroidUtilities.dp(k5Var != null ? 6.0f : 4.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(8.0f) + AndroidUtilities.dp(8.0f));
        i6Var2.r(this.N);
        f17 = 8.0f;
        rectF = AndroidUtilities.rectTmp;
        f18 = iZ;
        rectF.set(f10, f11, f10 + f18, this.B + f11);
        if (fA != 1.0f) {
            canvas.save();
            canvas.scale(fA, fA, (f18 / 2.0f) + f10, (this.B / 2.0f) + f11);
            z12 = true;
        } else {
            z12 = false;
        }
        f19 = this.B / 2.0f;
        if (k() > f16) {
            f20 = 2.0f;
        } else {
            f20 = 2.0f;
        }
        if (z10) {
            canvas.drawRoundRect(rectF, f19, f19, d5VarX2.f22845c);
        }
        if (z16) {
            rectF.right += AndroidUtilities.dp(4.0f);
            canvas.saveLayerAlpha(rectF, 255, 31);
            rectF.right -= AndroidUtilities.dp(4.0f);
        }
        if (this.Z != null) {
            LiteMode.isEnabled(8200);
        }
        h(canvas, rectF, f19, paint2);
        if (this.S) {
            if (z16) {
                paint = r0.X;
            } else {
                paint = r0.W;
                paint.setColor(this.P);
                paint.setAlpha((int) (paint.getAlpha() * f13));
            }
            canvas.drawCircle(rectF.right - AndroidUtilities.dp(8.4f), rectF.centerY(), AndroidUtilities.dp(2.66f), paint);
        }
        if (z16) {
            canvas.restore();
        }
        if (imageReceiver != null) {
            if (z15) {
                iDp = AndroidUtilities.dp(22.0f);
                iDp2 = AndroidUtilities.dp(4.0f);
            } else if (k5Var != null) {
                iDp = AndroidUtilities.dp(24.0f);
                iDp2 = AndroidUtilities.dp(6.0f);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
            } else {
                iDp = AndroidUtilities.dp(20.0f);
                iDp2 = AndroidUtilities.dp(f17);
                imageReceiver.setRoundRadius(0);
            }
            int i15 = (int) ((this.B - iDp) / f20);
            if (this.S) {
                iDp2 -= AndroidUtilities.dp(f20);
            }
            int i16 = ((int) f10) + iDp2;
            int i17 = ((int) f11) + i15;
            rect.set(i16, i17, i16 + iDp, iDp + i17);
            f(canvas, rect, f13);
        }
        if (i6Var != null) {
            fD = 0.0f;
        } else {
            fD = 0.0f;
        }
        if (f14 > 0.0f) {
            jqVar = this.F;
            if (jqVar != null) {
                canvas.save();
                if (this.f11402u) {
                    f21 = this.f11402u ? 9 : 8;
                } else {
                    f21 = this.f11402u ? 9 : 8;
                }
                float fDp2 = AndroidUtilities.dp(f21) + f10 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(k5Var == null ? 2.0f : 5.0f) + fD;
                if (z15) {
                    i11 = -AndroidUtilities.dp(1.0f);
                } else {
                    i11 = 0;
                }
                canvas.translate(fDp2 + i11, f11);
                jqVar.a(canvas);
                canvas.restore();
            }
        } else {
            jqVar = this.F;
            if (jqVar != null) {
                canvas.save();
                if (this.f11402u) {
                    f21 = this.f11402u ? 9 : 8;
                } else {
                    f21 = this.f11402u ? 9 : 8;
                }
                float fDp3 = AndroidUtilities.dp(f21) + f10 + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(k5Var == null ? 2.0f : 5.0f) + fD;
                if (z15) {
                    i11 = -AndroidUtilities.dp(1.0f);
                } else {
                    i11 = 0;
                }
                canvas.translate(fDp3 + i11, f11);
                jqVar.a(canvas);
                canvas.restore();
            }
        }
        if (!this.S) {
            canvas.save();
            canvas.translate(f10 + AndroidUtilities.dp(10.0f) + AndroidUtilities.dp(20.0f) + AndroidUtilities.dp(f20), f11);
            a9Var = this.T;
            a9Var.f26680u = f13;
            if (a9Var.f26681w) {
                a9Var.f26665e = f12;
                if (f12 == 1.0f) {
                    a9Var.n();
                    a9Var.f26681w = false;
                }
            }
            this.T.i(canvas);
            canvas.restore();
        }
        if (z12) {
            canvas.restore();
        }
    }

    public boolean e() {
        int i10 = this.f11403w;
        return ((i10 == 0 || (this.S && !this.f11402u && i10 == 1)) && this.F.f29784l == 1.0f) ? false : true;
    }

    public final void f(Canvas canvas, Rect rect, float f10) {
        ImageReceiver imageReceiver;
        boolean z10;
        k5 k5Var = this.D;
        if (k5Var == null || (imageReceiver = k5Var.f29961k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        k5 k5Var2 = this.D;
        if (k5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            k5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        if (!this.f11393l || (!this.f11394m && this.f11391j <= 1 && n() && this.Q)) {
            imageReceiver.setAlpha(0.0f);
            imageReceiver.draw(canvas);
            this.f11395n = false;
            return;
        }
        ImageReceiver imageReceiverL = l();
        if (imageReceiverL != null) {
            z10 = imageReceiverL.getLottieAnimation() == null || !imageReceiverL.getLottieAnimation().s();
            if (f10 != 1.0f) {
                imageReceiverL.setAlpha(f10);
                if (f10 <= 0.0f) {
                    imageReceiverL.onDetachedFromWindow();
                    o();
                }
            } else if (imageReceiverL.getLottieAnimation() != null && !imageReceiverL.getLottieAnimation().f31317h0) {
                float alpha = imageReceiverL.getAlpha() - 0.08f;
                if (alpha <= 0.0f) {
                    imageReceiverL.onDetachedFromWindow();
                    o();
                } else {
                    imageReceiverL.setAlpha(alpha);
                }
                this.W.invalidate();
                z10 = true;
            }
            imageReceiverL.setImageCoords(imageReceiver.getImageX() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageY() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageWidth() * 2.0f, imageReceiver.getImageHeight() * 2.0f);
            imageReceiverL.draw(canvas);
        } else {
            z10 = true;
        }
        if (z10) {
            imageReceiver.draw(canvas);
        }
        this.f11395n = true;
    }

    public final boolean g(Canvas canvas, float f10, float f11) {
        bb bbVar = this.Z;
        if (bbVar == null) {
            return false;
        }
        RectF rectF = bbVar.f9034c;
        if (!LiteMode.isEnabled(8200) || !LiteMode.isEnabled(131072)) {
            return false;
        }
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(f10, f11, this.A + f10, this.B + f11);
        float f12 = this.B / 2.0f;
        rectF.set(rectF2);
        rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        bbVar.g(rectF);
        boolean zD = bbVar.d();
        bbVar.a(canvas, i0.b.d(k(), i0.b.k(this.J, 255), i0.b.d(0.4f, this.M, i0.b.k(this.J, 255))));
        if (this.Q) {
            Path path = this.f11383d0;
            path.rewind();
            path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            bbVar.a(canvas, this.K);
            canvas.restore();
        }
        return zD;
    }

    public final void h(Canvas canvas, RectF rectF, float f10, Paint paint) {
        if (!this.S) {
            canvas.drawRoundRect(rectF, f10, f10, paint);
            return;
        }
        RectF rectF2 = this.f11380b0;
        float f11 = rectF2.left;
        float f12 = rectF.left;
        Path path = this.f11383d0;
        if (f11 != f12 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
            rectF2.set(rectF);
            r0.h(rectF2, this.f11382c0, path);
        }
        canvas.drawPath(path, paint);
    }

    public boolean i() {
        return true;
    }

    public int j() {
        return this.S ? 18 : 3;
    }

    public float k() {
        return 0.0f;
    }

    public ImageReceiver l() {
        return null;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public final void p(ArrayList arrayList) {
        this.U = arrayList;
        if (arrayList != null) {
            Collections.sort(arrayList, r0.f11417c0);
            if (this.T == null) {
                a9 a9Var = new a9(this.W, false);
                this.T = a9Var;
                a9Var.v = 250L;
                er erVar = sh.m.V;
                a9Var.f26678s = AndroidUtilities.dp(20.0f);
                this.T.f26675p = AndroidUtilities.dp(100.0f);
                a9 a9Var2 = this.T;
                a9Var2.f26674o = this.B;
                a9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f11385e0) {
                this.T.g();
            }
            for (int i10 = 0; i10 < arrayList.size() && i10 != 3; i10++) {
                this.T.l(i10, (TLObject) arrayList.get(i10), this.V);
            }
            this.T.b(false, true);
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        k5 k5Var = this.D;
        if (k5Var == null || (imageReceiver = k5Var.f29961k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            oi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.F(true);
                return;
            }
            x5 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        k5 k5Var = this.D;
        if (k5Var == null || (imageReceiver = k5Var.f29961k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            oi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            x5 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f10) {
        this.N = i0.b.d(f10, this.f11390i, i0.b.d(k(), this.K, this.M));
        int iD = i0.b.d(f10, this.f11388g, i0.b.d(k(), this.J, this.L));
        this.O = iD;
        this.P = i0.b.d(f10, this.h, AndroidUtilities.computePerceivedBrightness(iD) > 0.8f ? 0 : 1526726655);
    }

    public void o() {
    }
}
