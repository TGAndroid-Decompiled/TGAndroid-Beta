package hg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import gh.bb;
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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.x5;
public abstract class p0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final k5 D;
    public int E;
    public final lq F;
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
    public b9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final b6 X;
    public final pc Y;
    public final bb Z;
    public final TLRPC.ReactionCount f10681a;
    public final mi0 f10682a0;
    public final boolean f10683b;
    public int f10685c;
    public int d;
    public int f10688e;
    public boolean f10689e0;
    public int f10690f;
    public ImageReceiver f10691f0;
    public int f10692g;
    public k5 f10693g0;
    public int h;
    public int f10694i;
    public int f10695j;
    public final int f10696k;
    public final boolean f10698m;
    public boolean f10699n;
    public String f10700o;
    public boolean f10701p;
    public boolean f10702q;
    public final TLRPC.Reaction f10703r;
    public final r0 f10704s;
    public boolean f10706u;
    public final String v;
    public int f10707w;
    public int f10708x;
    public int f10709y;
    public int f10710z;
    public boolean f10697l = true;
    public final Rect f10705t = new Rect();
    public final RectF f10684b0 = new RectF();
    public final RectF f10686c0 = new RectF();
    public final Path f10687d0 = new Path();

    public p0(p0 p0Var, int i9, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, b6 b6Var) {
        bb bbVar;
        int i10;
        mi0 mi0Var;
        eg.a aVar = new eg.a(this, 3);
        this.V = i9;
        this.W = view;
        this.Y = new pc(view);
        this.X = b6Var;
        this.S = z11;
        if (p0Var != null) {
            this.F = p0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new lq(view, false, null);
        }
        if (this.G == null) {
            i6 i6Var = new i6(true, true, true, false);
            this.G = i6Var;
            i6Var.E = true;
            i6Var.k(0.4f, 320L, gr.h);
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
        this.f10681a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f10703r = reaction;
        r0 d = r0.d(reaction);
        this.f10704s = d;
        int i11 = reactionCount.count;
        this.f10707w = i11;
        this.f10701p = reactionCount.chosen;
        this.f10695j = i11;
        this.f10696k = reactionCount.chosen_order;
        this.f10683b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f10700o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f10700o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f10700o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        lq lqVar = this.F;
        lqVar.G = false;
        lqVar.f30514a = true;
        if (reaction != null) {
            if (d.f10713a) {
                this.f10698m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (p0Var != null && (mi0Var = p0Var.f10682a0) != null) {
                        this.f10682a0 = mi0Var;
                    } else {
                        this.f10682a0 = new mi0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), "star_reaction_click", AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f10682a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (p0Var == null || (bbVar = p0Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i10 = 18;
                    } else {
                        i10 = 8;
                    }
                    bbVar = new bb(1, i10);
                }
                this.Z = bbVar;
            } else if (d.f10717f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i9).getReactionsMap().get(d.f10717f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, f6.f22947a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f10718g != 0) {
                this.D = new k5(j(), i9, d.f10718g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.f30517e = s0.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i9).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f10706u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f10706u) {
            i6 i6Var3 = this.G;
            i6Var3.q(Emoji.replaceEmoji(this.v, i6Var3.f29332a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof qm0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f10707w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            i6 i6Var4 = this.G;
            if (i6Var4 != null) {
                i6Var4.q("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f10707w, false);
        }
        lq lqVar2 = this.F;
        lqVar2.I = 2;
        lqVar2.f30536z = 3;
    }

    public final void a() {
        this.f10689e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        b9 b9Var = this.T;
        if (b9Var != null) {
            b9Var.g();
        }
        k5 k5Var = this.D;
        if (k5Var != null) {
            k5Var.a(this.W);
        }
    }

    public final void b() {
        this.f10689e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        b9 b9Var = this.T;
        if (b9Var != null) {
            b9Var.h();
        }
        k5 k5Var = this.D;
        if (k5Var != null) {
            k5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f10691f0;
        if (imageReceiver != null || this.f10693g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f10691f0 = null;
            } else if (this.f10693g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f10693g0.o(view);
                this.f10693g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r32, float r33, float r34, float r35, float r36, boolean r37, boolean r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: hg.p0.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i9 = this.f10707w;
        if ((i9 != 0 && (!this.S || this.f10706u || i9 != 1)) || this.F.f30523l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f10) {
        ImageReceiver imageReceiver;
        k5 k5Var = this.D;
        if (k5Var == null || (imageReceiver = k5Var.f29951k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        k5 k5Var2 = this.D;
        if (k5Var2 != null && this.E != this.N) {
            int i9 = this.N;
            this.E = i9;
            k5Var2.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
        }
        boolean z10 = false;
        if (this.f10697l && (this.f10698m || this.f10695j > 1 || !n() || !this.Q)) {
            ImageReceiver l10 = l();
            if (l10 != null) {
                z10 = (l10.getLottieAnimation() == null || !l10.getLottieAnimation().s()) ? true : true;
                if (f10 != 1.0f) {
                    l10.setAlpha(f10);
                    if (f10 <= 0.0f) {
                        l10.onDetachedFromWindow();
                        o();
                    }
                } else if (l10.getLottieAnimation() != null && !l10.getLottieAnimation().f30852h0) {
                    float alpha = l10.getAlpha() - 0.08f;
                    if (alpha <= 0.0f) {
                        l10.onDetachedFromWindow();
                        o();
                    } else {
                        l10.setAlpha(alpha);
                    }
                    this.W.invalidate();
                    z10 = true;
                }
                l10.setImageCoords(imageReceiver.getImageX() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageY() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageWidth() * 2.0f, imageReceiver.getImageHeight() * 2.0f);
                l10.draw(canvas);
            } else {
                z10 = true;
            }
            if (z10) {
                imageReceiver.draw(canvas);
            }
            this.f10699n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f10699n = false;
    }

    public final boolean g(Canvas canvas, float f10, float f11) {
        bb bbVar = this.Z;
        if (bbVar != null) {
            RectF rectF = bbVar.f7879c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f10, f11, this.A + f10, this.B + f11);
                float f12 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                bbVar.g(rectF);
                boolean d = bbVar.d();
                bbVar.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
                if (this.Q) {
                    Path path = this.f10687d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    bbVar.a(canvas, this.K);
                    canvas.restore();
                }
                return d;
            }
            return false;
        }
        return false;
    }

    public final void h(Canvas canvas, RectF rectF, float f10, Paint paint) {
        if (this.S) {
            RectF rectF2 = this.f10684b0;
            float f11 = rectF2.left;
            float f12 = rectF.left;
            Path path = this.f10687d0;
            if (f11 != f12 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                s0.h(rectF2, this.f10686c0, path);
            }
            canvas.drawPath(path, paint);
            return;
        }
        canvas.drawRoundRect(rectF, f10, f10, paint);
    }

    public boolean i() {
        return true;
    }

    public int j() {
        if (this.S) {
            return 18;
        }
        return 3;
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
            Collections.sort(arrayList, s0.f10732c0);
            if (this.T == null) {
                b9 b9Var = new b9(this.W, false);
                this.T = b9Var;
                b9Var.v = 250L;
                gr grVar = rh.m.V;
                b9Var.f27090s = AndroidUtilities.dp(20.0f);
                this.T.f27087p = AndroidUtilities.dp(100.0f);
                b9 b9Var2 = this.T;
                b9Var2.f27086o = this.B;
                b9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f10689e0) {
                this.T.g();
            }
            for (int i9 = 0; i9 < arrayList.size() && i9 != 3; i9++) {
                this.T.l(i9, (TLObject) arrayList.get(i9), this.V);
            }
            this.T.b(false, true);
        }
    }

    public final void q() {
        ImageReceiver imageReceiver;
        k5 k5Var = this.D;
        if (k5Var == null || (imageReceiver = k5Var.f29951k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            mi0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        if (k5Var == null || (imageReceiver = k5Var.f29951k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            mi0 lottieAnimation = imageReceiver.getLottieAnimation();
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
        int i9;
        this.N = i0.a.d(f10, this.f10694i, i0.a.d(k(), this.K, this.M));
        int d = i0.a.d(f10, this.f10692g, i0.a.d(k(), this.J, this.L));
        this.O = d;
        int i10 = this.h;
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.8f) {
            i9 = 0;
        } else {
            i9 = 1526726655;
        }
        this.P = i0.a.d(f10, i10, i9);
    }

    public void o() {
    }
}
