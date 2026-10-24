package ah;

import ai.ee;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.zr;
public abstract class g1 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final p5 D;
    public int E;
    public final cr F;
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
    public h9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final g6 X;
    public final wc Y;
    public final ee Z;
    public final TLRPC.ReactionCount f741a;
    public final xj0 f742a0;
    public final boolean f743b;
    public int f745c;
    public int d;
    public int e;
    public boolean f748e0;
    public int f749f;
    public ImageReceiver f750f0;
    public int f751g;
    public p5 f752g0;
    public int h;
    public int f753i;
    public int f754j;
    public final int f755k;
    public final boolean f757m;
    public boolean f758n;
    public String f759o;
    public boolean f760p;
    public boolean f761q;
    public final TLRPC.Reaction f762r;
    public final i1 f763s;
    public boolean f765u;
    public final String v;
    public int f766w;
    public int f767x;
    public int f768y;
    public int f769z;
    public boolean f756l = true;
    public final Rect f764t = new Rect();
    public final RectF f744b0 = new RectF();
    public final RectF f746c0 = new RectF();
    public final Path f747d0 = new Path();

    public g1(g1 g1Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, g6 g6Var) {
        ee eeVar;
        int i11;
        xj0 xj0Var;
        f1 f1Var = new f1(this, 0);
        this.V = i10;
        this.W = view;
        this.Y = new wc(view);
        this.X = g6Var;
        this.S = z11;
        if (g1Var != null) {
            this.F = g1Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new cr(view, false, null);
        }
        if (this.G == null) {
            n6 n6Var = new n6(true, true, true);
            this.G = n6Var;
            n6Var.K = true;
            n6Var.n(0.4f, 320L, zr.h);
            n6Var.w(AndroidUtilities.dp(13.0f));
            n6Var.setCallback(f1Var);
            n6Var.x(AndroidUtilities.bold());
            n6Var.M = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            n6 n6Var2 = new n6(false, false, false, true, false);
            this.H = n6Var2;
            n6Var2.w(AndroidUtilities.dp(12.0f));
            n6Var2.setCallback(f1Var);
            n6Var2.x(AndroidUtilities.bold());
            n6Var2.M = AndroidUtilities.displaySize.x;
            n6Var2.A = 0.35f;
        }
        this.f741a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f762r = reaction;
        i1 d = i1.d(reaction);
        this.f763s = d;
        int i12 = reactionCount.count;
        this.f766w = i12;
        this.f760p = reactionCount.chosen;
        this.f754j = i12;
        this.f755k = reactionCount.chosen_order;
        this.f743b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f759o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f759o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f759o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        cr crVar = this.F;
        crVar.G = false;
        crVar.f25437a = true;
        if (reaction != null) {
            if (d.f781a) {
                this.f757m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (g1Var != null && (xj0Var = g1Var.f742a0) != null) {
                        this.f742a0 = xj0Var;
                    } else {
                        this.f742a0 = new xj0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f742a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (g1Var == null || (eeVar = g1Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    eeVar = new ee(1, i11);
                }
                this.Z = eeVar;
            } else if (d.f784f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f784f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, k6.f21126a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f785g != 0) {
                this.D = new p5(j(), i10, d.f785g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.e = j1.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f765u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f765u) {
            n6 n6Var3 = this.G;
            n6Var3.t(Emoji.replaceEmoji(this.v, n6Var3.f28795a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof go0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f766w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            n6 n6Var4 = this.G;
            if (n6Var4 != null) {
                n6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f766w, false);
        }
        cr crVar2 = this.F;
        crVar2.I = 2;
        crVar2.f25458z = 3;
    }

    public final void a() {
        this.f748e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        h9 h9Var = this.T;
        if (h9Var != null) {
            h9Var.g();
        }
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.a(this.W);
        }
    }

    public final void b() {
        this.f748e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        h9 h9Var = this.T;
        if (h9Var != null) {
            h9Var.h();
        }
        p5 p5Var = this.D;
        if (p5Var != null) {
            p5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f750f0;
        if (imageReceiver != null || this.f752g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f750f0 = null;
            } else if (this.f752g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f752g0.o(view);
                this.f752g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r31, float r32, float r33, float r34, float r35, boolean r36, boolean r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: ah.g1.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i10 = this.f766w;
        if ((i10 != 0 && (!this.S || this.f765u || i10 != 1)) || this.F.f25445l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        p5 p5Var = this.D;
        if (p5Var == null || (imageReceiver = p5Var.f29484k) == null) {
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
        if (this.f756l && (this.f757m || this.f754j > 1 || !n() || !this.Q)) {
            ImageReceiver l4 = l();
            if (l4 != null) {
                if (l4.getLottieAnimation() == null || !l4.getLottieAnimation().u()) {
                    z10 = true;
                }
                if (f7 != 1.0f) {
                    l4.setAlpha(f7);
                    if (f7 <= 0.0f) {
                        l4.onDetachedFromWindow();
                        o();
                    }
                } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().f32607k0) {
                    float alpha = l4.getAlpha() - 0.08f;
                    if (alpha <= 0.0f) {
                        l4.onDetachedFromWindow();
                        o();
                    } else {
                        l4.setAlpha(alpha);
                    }
                    this.W.invalidate();
                    z10 = true;
                }
                l4.setImageCoords(imageReceiver.getImageX() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageY() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageWidth() * 2.0f, imageReceiver.getImageHeight() * 2.0f);
                l4.draw(canvas);
            } else {
                z10 = true;
            }
            if (z10) {
                imageReceiver.draw(canvas);
            }
            this.f758n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f758n = false;
    }

    public final boolean g(Canvas canvas, float f7, float f10) {
        ee eeVar = this.Z;
        if (eeVar != null) {
            RectF rectF = eeVar.f1235c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f7, f10, this.A + f7, this.B + f10);
                float f11 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                eeVar.g(rectF);
                boolean d = eeVar.d();
                eeVar.a(canvas, i0.a.f(k(), i0.a.o(this.J, 255), i0.a.f(0.4f, this.M, i0.a.o(this.J, 255))));
                if (this.Q) {
                    Path path = this.f747d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    eeVar.a(canvas, this.K);
                    canvas.restore();
                }
                return d;
            }
            return false;
        }
        return false;
    }

    public final void h(Canvas canvas, RectF rectF, float f7, Paint paint) {
        if (this.S) {
            RectF rectF2 = this.f744b0;
            int i10 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f747d0;
            if (i10 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                j1.h(rectF2, this.f746c0, path);
            }
            canvas.drawPath(path, paint);
            return;
        }
        canvas.drawRoundRect(rectF, f7, f7, paint);
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
            Collections.sort(arrayList, j1.f791c0);
            if (this.T == null) {
                h9 h9Var = new h9(this.W, false);
                this.T = h9Var;
                h9Var.v = 250L;
                zr zrVar = li.m.V;
                h9Var.f26961s = AndroidUtilities.dp(20.0f);
                this.T.f26958p = AndroidUtilities.dp(100.0f);
                h9 h9Var2 = this.T;
                h9Var2.f26957o = this.B;
                h9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f748e0) {
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
        if (p5Var == null || (imageReceiver = p5Var.f29484k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            xj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.H(true);
                return;
            }
            c6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        p5 p5Var = this.D;
        if (p5Var == null || (imageReceiver = p5Var.f29484k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            xj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            c6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f7) {
        int i10;
        this.N = i0.a.f(f7, this.f753i, i0.a.f(k(), this.K, this.M));
        int f10 = i0.a.f(f7, this.f751g, i0.a.f(k(), this.J, this.L));
        this.O = f10;
        int i11 = this.h;
        if (AndroidUtilities.computePerceivedBrightness(f10) > 0.8f) {
            i10 = 0;
        } else {
            i10 = 1526726655;
        }
        this.P = i0.a.f(f7, i11, i10);
    }

    public void o() {
    }
}
