package ah;

import ai.ce;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.yc;
public abstract class g1 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final r5 D;
    public int E;
    public final fr F;
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
    public j9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final d6 X;
    public final yc Y;
    public final ce Z;
    public final TLRPC.ReactionCount f742a;
    public final uj0 f743a0;
    public final boolean f744b;
    public int f746c;
    public int d;
    public int e;
    public boolean f749e0;
    public int f750f;
    public ImageReceiver f751f0;
    public int f752g;
    public r5 f753g0;
    public int h;
    public int f754i;
    public int f755j;
    public final int f756k;
    public final boolean f758m;
    public boolean f759n;
    public String f760o;
    public boolean f761p;
    public boolean f762q;
    public final TLRPC.Reaction f763r;
    public final i1 f764s;
    public boolean f766u;
    public final String v;
    public int f767w;
    public int f768x;
    public int f769y;
    public int f770z;
    public boolean f757l = true;
    public final Rect f765t = new Rect();
    public final RectF f745b0 = new RectF();
    public final RectF f747c0 = new RectF();
    public final Path f748d0 = new Path();

    public g1(g1 g1Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, d6 d6Var) {
        ce ceVar;
        int i11;
        uj0 uj0Var;
        f1 f1Var = new f1(this, 0);
        this.V = i10;
        this.W = view;
        this.Y = new yc(view);
        this.X = d6Var;
        this.S = z11;
        if (g1Var != null) {
            this.F = g1Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new fr(view, false, null);
        }
        if (this.G == null) {
            p6 p6Var = new p6(true, true, true);
            this.G = p6Var;
            p6Var.K = true;
            p6Var.n(0.4f, 320L, bs.h);
            p6Var.w(AndroidUtilities.dp(13.0f));
            p6Var.setCallback(f1Var);
            p6Var.x(AndroidUtilities.bold());
            p6Var.M = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            p6 p6Var2 = new p6(false, false, false, true, false);
            this.H = p6Var2;
            p6Var2.w(AndroidUtilities.dp(12.0f));
            p6Var2.setCallback(f1Var);
            p6Var2.x(AndroidUtilities.bold());
            p6Var2.M = AndroidUtilities.displaySize.x;
            p6Var2.A = 0.35f;
        }
        this.f742a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f763r = reaction;
        i1 d = i1.d(reaction);
        this.f764s = d;
        int i12 = reactionCount.count;
        this.f767w = i12;
        this.f761p = reactionCount.chosen;
        this.f755j = i12;
        this.f756k = reactionCount.chosen_order;
        this.f744b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f760o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f760o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f760o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        fr frVar = this.F;
        frVar.G = false;
        frVar.f26354a = true;
        if (reaction != null) {
            if (d.f782a) {
                this.f758m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (g1Var != null && (uj0Var = g1Var.f743a0) != null) {
                        this.f743a0 = uj0Var;
                    } else {
                        this.f743a0 = new uj0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f743a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (g1Var == null || (ceVar = g1Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    ceVar = new ce(1, i11);
                }
                this.Z = ceVar;
            } else if (d.f785f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f785f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, h6.f20928a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f786g != 0) {
                this.D = new r5(j(), i10, d.f786g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.e = j1.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f766u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f766u) {
            p6 p6Var3 = this.G;
            p6Var3.t(Emoji.replaceEmoji(this.v, p6Var3.f29190a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof do0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f767w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            p6 p6Var4 = this.G;
            if (p6Var4 != null) {
                p6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f767w, false);
        }
        fr frVar2 = this.F;
        frVar2.I = 2;
        frVar2.f26375z = 3;
    }

    public final void a() {
        this.f749e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        j9 j9Var = this.T;
        if (j9Var != null) {
            j9Var.g();
        }
        r5 r5Var = this.D;
        if (r5Var != null) {
            r5Var.a(this.W);
        }
    }

    public final void b() {
        this.f749e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        j9 j9Var = this.T;
        if (j9Var != null) {
            j9Var.h();
        }
        r5 r5Var = this.D;
        if (r5Var != null) {
            r5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f751f0;
        if (imageReceiver != null || this.f753g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f751f0 = null;
            } else if (this.f753g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f753g0.o(view);
                this.f753g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r31, float r32, float r33, float r34, float r35, boolean r36, boolean r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: ah.g1.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i10 = this.f767w;
        if ((i10 != 0 && (!this.S || this.f766u || i10 != 1)) || this.F.f26362l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        r5 r5Var = this.D;
        if (r5Var == null || (imageReceiver = r5Var.f29841k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        r5 r5Var2 = this.D;
        if (r5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            r5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        boolean z10 = false;
        if (this.f757l && (this.f758m || this.f755j > 1 || !n() || !this.Q)) {
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
                } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().f31014k0) {
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
            this.f759n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f759n = false;
    }

    public final boolean g(Canvas canvas, float f7, float f10) {
        ce ceVar = this.Z;
        if (ceVar != null) {
            RectF rectF = ceVar.f1114c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f7, f10, this.A + f7, this.B + f10);
                float f11 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                ceVar.g(rectF);
                boolean d = ceVar.d();
                ceVar.a(canvas, i0.b.f(k(), i0.b.o(this.J, 255), i0.b.f(0.4f, this.M, i0.b.o(this.J, 255))));
                if (this.Q) {
                    Path path = this.f748d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    ceVar.a(canvas, this.K);
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
            RectF rectF2 = this.f745b0;
            int i10 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f748d0;
            if (i10 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                j1.h(rectF2, this.f747c0, path);
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
            Collections.sort(arrayList, j1.f792c0);
            if (this.T == null) {
                j9 j9Var = new j9(this.W, false);
                this.T = j9Var;
                j9Var.v = 250L;
                bs bsVar = li.m.V;
                j9Var.f27464s = AndroidUtilities.dp(20.0f);
                this.T.f27461p = AndroidUtilities.dp(100.0f);
                j9 j9Var2 = this.T;
                j9Var2.f27460o = this.B;
                j9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f749e0) {
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
        r5 r5Var = this.D;
        if (r5Var == null || (imageReceiver = r5Var.f29841k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            uj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.H(true);
                return;
            }
            e6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        r5 r5Var = this.D;
        if (r5Var == null || (imageReceiver = r5Var.f29841k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            uj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            e6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f7) {
        int i10;
        this.N = i0.b.f(f7, this.f754i, i0.b.f(k(), this.K, this.M));
        int f10 = i0.b.f(f7, this.f752g, i0.b.f(k(), this.J, this.L));
        this.O = f10;
        int i11 = this.h;
        if (AndroidUtilities.computePerceivedBrightness(f10) > 0.8f) {
            i10 = 0;
        } else {
            i10 = 1526726655;
        }
        this.P = i0.b.f(f7, i11, i10);
    }

    public void o() {
    }
}
