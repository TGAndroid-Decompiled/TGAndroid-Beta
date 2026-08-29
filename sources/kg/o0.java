package kg;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import jh.va;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.cn0;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.uc;
import org.telegram.ui.Components.xi0;
public abstract class o0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final p5 D;
    public int E;
    public final pq F;
    public final n6 G;
    public final n6 H;
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
    public g9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final c6 X;
    public final uc Y;
    public final va Z;
    public final TLRPC.ReactionCount f13790a;
    public final xi0 f13791a0;
    public final boolean f13792b;
    public int f13794c;
    public int d;
    public int f13797e;
    public boolean f13798e0;
    public int f13799f;
    public ImageReceiver f13800f0;
    public int f13801g;
    public p5 f13802g0;
    public int h;
    public int f13803i;
    public int f13804j;
    public final int f13805k;
    public final boolean f13807m;
    public boolean f13808n;
    public String f13809o;
    public boolean f13810p;
    public boolean f13811q;
    public final TLRPC.Reaction f13812r;
    public final q0 f13813s;
    public boolean f13815u;
    public final String v;
    public int f13816w;
    public int f13817x;
    public int f13818y;
    public int f13819z;
    public boolean f13806l = true;
    public final Rect f13814t = new Rect();
    public final RectF f13793b0 = new RectF();
    public final RectF f13795c0 = new RectF();
    public final Path f13796d0 = new Path();

    public o0(o0 o0Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, c6 c6Var) {
        va vaVar;
        int i11;
        xi0 xi0Var;
        hg.a aVar = new hg.a(this, 5);
        this.V = i10;
        this.W = view;
        this.Y = new uc(view);
        this.X = c6Var;
        this.S = z11;
        if (o0Var != null) {
            this.F = o0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new pq(view, false, null);
        }
        if (this.G == null) {
            n6 n6Var = new n6(true, true, true, false);
            this.G = n6Var;
            n6Var.E = true;
            n6Var.k(0.4f, 320L, jr.h);
            n6Var.t(AndroidUtilities.dp(13.0f));
            n6Var.setCallback(aVar);
            n6Var.u(AndroidUtilities.bold());
            n6Var.G = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            n6 n6Var2 = new n6(false, false, false, true);
            this.H = n6Var2;
            n6Var2.t(AndroidUtilities.dp(12.0f));
            n6Var2.setCallback(aVar);
            n6Var2.u(AndroidUtilities.bold());
            n6Var2.G = AndroidUtilities.displaySize.x;
            n6Var2.v = 0.35f;
        }
        this.f13790a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f13812r = reaction;
        q0 d = q0.d(reaction);
        this.f13813s = d;
        int i12 = reactionCount.count;
        this.f13816w = i12;
        this.f13810p = reactionCount.chosen;
        this.f13804j = i12;
        this.f13805k = reactionCount.chosen_order;
        this.f13792b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f13809o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f13809o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f13809o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        pq pqVar = this.F;
        pqVar.G = false;
        pqVar.f31731a = true;
        if (reaction != null) {
            if (d.f13821a) {
                this.f13807m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (o0Var != null && (xi0Var = o0Var.f13791a0) != null) {
                        this.f13791a0 = xi0Var;
                    } else {
                        this.f13791a0 = new xi0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), "star_reaction_click", AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f13791a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (o0Var == null || (vaVar = o0Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    vaVar = new va(1, i11);
                }
                this.Z = vaVar;
            } else if (d.f13825f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f13825f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, g6.f23009a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f13826g != 0) {
                this.D = new p5(j(), i10, d.f13826g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.f31734e = r0.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f13815u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f13815u) {
            n6 n6Var3 = this.G;
            n6Var3.q(Emoji.replaceEmoji(this.v, n6Var3.f30861a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof cn0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f13816w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            n6 n6Var4 = this.G;
            if (n6Var4 != null) {
                n6Var4.q("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f13816w, false);
        }
        pq pqVar2 = this.F;
        pqVar2.I = 2;
        pqVar2.f31753z = 3;
    }

    public final void a() {
        this.f13798e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        g9 g9Var = this.T;
        if (g9Var != null) {
            g9Var.g();
        }
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.a(this.W);
        }
    }

    public final void b() {
        this.f13798e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        g9 g9Var = this.T;
        if (g9Var != null) {
            g9Var.h();
        }
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f13800f0;
        if (imageReceiver != null || this.f13802g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f13800f0 = null;
            } else if (this.f13802g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f13802g0.o(view);
                this.f13802g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r32, float r33, float r34, float r35, float r36, boolean r37, boolean r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: kg.o0.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i10 = this.f13816w;
        if ((i10 != 0 && (!this.S || this.f13815u || i10 != 1)) || this.F.f31740l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f9) {
        ImageReceiver imageReceiver;
        p5 p5Var = this.D;
        if (p5Var == null || (imageReceiver = p5Var.f31593k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        p5 p5Var2 = this.D;
        if (p5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            p5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        boolean z10 = false;
        if (this.f13806l && (this.f13807m || this.f13804j > 1 || !n() || !this.Q)) {
            ImageReceiver l10 = l();
            if (l10 != null) {
                z10 = (l10.getLottieAnimation() == null || !l10.getLottieAnimation().s()) ? true : true;
                if (f9 != 1.0f) {
                    l10.setAlpha(f9);
                    if (f9 <= 0.0f) {
                        l10.onDetachedFromWindow();
                        o();
                    }
                } else if (l10.getLottieAnimation() != null && !l10.getLottieAnimation().f34742h0) {
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
            this.f13808n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f13808n = false;
    }

    public final boolean g(Canvas canvas, float f9, float f10) {
        va vaVar = this.Z;
        if (vaVar != null) {
            RectF rectF = vaVar.f12988c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f9, f10, this.A + f9, this.B + f10);
                float f11 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                vaVar.g(rectF);
                boolean d = vaVar.d();
                vaVar.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
                if (this.Q) {
                    Path path = this.f13796d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    vaVar.a(canvas, this.K);
                    canvas.restore();
                }
                return d;
            }
            return false;
        }
        return false;
    }

    public final void h(Canvas canvas, RectF rectF, float f9, Paint paint) {
        if (this.S) {
            RectF rectF2 = this.f13793b0;
            float f10 = rectF2.left;
            float f11 = rectF.left;
            Path path = this.f13796d0;
            if (f10 != f11 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                r0.h(rectF2, this.f13795c0, path);
            }
            canvas.drawPath(path, paint);
            return;
        }
        canvas.drawRoundRect(rectF, f9, f9, paint);
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
            Collections.sort(arrayList, r0.f13830c0);
            if (this.T == null) {
                g9 g9Var = new g9(this.W, false);
                this.T = g9Var;
                g9Var.v = 250L;
                jr jrVar = uh.m.V;
                g9Var.f28839s = AndroidUtilities.dp(20.0f);
                this.T.f28836p = AndroidUtilities.dp(100.0f);
                g9 g9Var2 = this.T;
                g9Var2.f28835o = this.B;
                g9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f13798e0) {
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
        p5 p5Var = this.D;
        if (p5Var == null || (imageReceiver = p5Var.f31593k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            xi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.F(true);
                return;
            }
            org.telegram.ui.Components.c6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        p5 p5Var = this.D;
        if (p5Var == null || (imageReceiver = p5Var.f31593k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            xi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            org.telegram.ui.Components.c6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f9) {
        int i10;
        this.N = i0.a.d(f9, this.f13803i, i0.a.d(k(), this.K, this.M));
        int d = i0.a.d(f9, this.f13801g, i0.a.d(k(), this.J, this.L));
        this.O = d;
        int i11 = this.h;
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.8f) {
            i10 = 0;
        } else {
            i10 = 1526726655;
        }
        this.P = i0.a.d(f9, i11, i10);
    }

    public void o() {
    }
}
