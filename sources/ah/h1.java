package ah;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.fn0;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.Components.zc;
import zh.h8;
public abstract class h1 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final q5 D;
    public int E;
    public final uq F;
    public final p6 G;
    public final p6 H;
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
    public k9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final f6 X;
    public final zc Y;
    public final h8 Z;
    public final TLRPC.ReactionCount f552a;
    public final xi0 f553a0;
    public final boolean f554b;
    public int f556c;
    public int d;
    public int f559e;
    public boolean f560e0;
    public int f561f;
    public ImageReceiver f562f0;
    public int f563g;
    public q5 f564g0;
    public int h;
    public int f565i;
    public int f566j;
    public final int f567k;
    public final boolean f569m;
    public boolean f570n;
    public String f571o;
    public boolean f572p;
    public boolean f573q;
    public final TLRPC.Reaction f574r;
    public final j1 f575s;
    public boolean f577u;
    public final String v;
    public int f578w;
    public int f579x;
    public int f580y;
    public int f581z;
    public boolean f568l = true;
    public final Rect f576t = new Rect();
    public final RectF f555b0 = new RectF();
    public final RectF f557c0 = new RectF();
    public final Path f558d0 = new Path();

    public h1(h1 h1Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, f6 f6Var) {
        h8 h8Var;
        int i11;
        xi0 xi0Var;
        g1 g1Var = new g1(this, 0);
        this.V = i10;
        this.W = view;
        this.Y = new zc(view);
        this.X = f6Var;
        this.S = z11;
        if (h1Var != null) {
            this.F = h1Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new uq(view, false, null);
        }
        if (this.G == null) {
            p6 p6Var = new p6(true, true, true, false);
            this.G = p6Var;
            p6Var.E = true;
            p6Var.k(0.4f, 320L, pr.h);
            p6Var.t(AndroidUtilities.dp(13.0f));
            p6Var.setCallback(g1Var);
            p6Var.u(AndroidUtilities.bold());
            p6Var.G = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            p6 p6Var2 = new p6(false, false, false, true);
            this.H = p6Var2;
            p6Var2.t(AndroidUtilities.dp(12.0f));
            p6Var2.setCallback(g1Var);
            p6Var2.u(AndroidUtilities.bold());
            p6Var2.G = AndroidUtilities.displaySize.x;
            p6Var2.v = 0.35f;
        }
        this.f552a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f574r = reaction;
        j1 d = j1.d(reaction);
        this.f575s = d;
        int i12 = reactionCount.count;
        this.f578w = i12;
        this.f572p = reactionCount.chosen;
        this.f566j = i12;
        this.f567k = reactionCount.chosen_order;
        this.f554b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f571o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f571o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f571o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        uq uqVar = this.F;
        uqVar.G = false;
        uqVar.f30935a = true;
        if (reaction != null) {
            if (d.f593a) {
                this.f569m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (h1Var != null && (xi0Var = h1Var.f553a0) != null) {
                        this.f553a0 = xi0Var;
                    } else {
                        this.f553a0 = new xi0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f553a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (h1Var == null || (h8Var = h1Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    h8Var = new h8(1, i11);
                }
                this.Z = h8Var;
            } else if (d.f597f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f597f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, j6.f20607a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f598g != 0) {
                this.D = new q5(j(), i10, d.f598g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.f30938e = k1.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f577u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f577u) {
            p6 p6Var3 = this.G;
            p6Var3.q(Emoji.replaceEmoji(this.v, p6Var3.f29284a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof fn0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f578w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            p6 p6Var4 = this.G;
            if (p6Var4 != null) {
                p6Var4.q("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f578w, false);
        }
        uq uqVar2 = this.F;
        uqVar2.I = 2;
        uqVar2.f30957z = 3;
    }

    public final void a() {
        this.f560e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        k9 k9Var = this.T;
        if (k9Var != null) {
            k9Var.g();
        }
        q5 q5Var = this.D;
        if (q5Var != null) {
            q5Var.a(this.W);
        }
    }

    public final void b() {
        this.f560e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        k9 k9Var = this.T;
        if (k9Var != null) {
            k9Var.h();
        }
        q5 q5Var = this.D;
        if (q5Var != null) {
            q5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f562f0;
        if (imageReceiver != null || this.f564g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f562f0 = null;
            } else if (this.f564g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f564g0.o(view);
                this.f564g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r32, float r33, float r34, float r35, float r36, boolean r37, boolean r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: ah.h1.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i10 = this.f578w;
        if ((i10 != 0 && (!this.S || this.f577u || i10 != 1)) || this.F.f30944l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        q5 q5Var = this.D;
        if (q5Var == null || (imageReceiver = q5Var.f29584k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        q5 q5Var2 = this.D;
        if (q5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            q5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        boolean z10 = false;
        if (this.f568l && (this.f569m || this.f566j > 1 || !n() || !this.Q)) {
            ImageReceiver l4 = l();
            if (l4 != null) {
                z10 = (l4.getLottieAnimation() == null || !l4.getLottieAnimation().s()) ? true : true;
                if (f7 != 1.0f) {
                    l4.setAlpha(f7);
                    if (f7 <= 0.0f) {
                        l4.onDetachedFromWindow();
                        o();
                    }
                } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().f32566l0) {
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
            this.f570n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f570n = false;
    }

    public final boolean g(Canvas canvas, float f7, float f10) {
        h8 h8Var = this.Z;
        if (h8Var != null) {
            RectF rectF = h8Var.f51993c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f7, f10, this.A + f7, this.B + f10);
                float f11 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                h8Var.g(rectF);
                boolean d = h8Var.d();
                h8Var.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
                if (this.Q) {
                    Path path = this.f558d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    h8Var.a(canvas, this.K);
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
            RectF rectF2 = this.f555b0;
            float f10 = rectF2.left;
            float f11 = rectF.left;
            Path path = this.f558d0;
            if (f10 != f11 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                k1.h(rectF2, this.f557c0, path);
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
            Collections.sort(arrayList, k1.f605c0);
            if (this.T == null) {
                k9 k9Var = new k9(this.W, false);
                this.T = k9Var;
                k9Var.v = 250L;
                pr prVar = ki.o.V;
                k9Var.f27772s = AndroidUtilities.dp(20.0f);
                this.T.f27769p = AndroidUtilities.dp(100.0f);
                k9 k9Var2 = this.T;
                k9Var2.f27768o = this.B;
                k9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f560e0) {
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
        q5 q5Var = this.D;
        if (q5Var == null || (imageReceiver = q5Var.f29584k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            xi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.F(true);
                return;
            }
            d6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        q5 q5Var = this.D;
        if (q5Var == null || (imageReceiver = q5Var.f29584k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            xi0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            d6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f7) {
        int i10;
        this.N = i0.a.d(f7, this.f565i, i0.a.d(k(), this.K, this.M));
        int d = i0.a.d(f7, this.f563g, i0.a.d(k(), this.J, this.L));
        this.O = d;
        int i11 = this.h;
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.8f) {
            i10 = 0;
        } else {
            i10 = 1526726655;
        }
        this.P = i0.a.d(f7, i11, i10);
    }

    public void o() {
    }
}
