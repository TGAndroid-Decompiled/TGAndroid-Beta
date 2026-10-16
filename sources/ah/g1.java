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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.m9;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.s5;
import org.telegram.ui.Components.yj0;
import zh.b8;
public abstract class g1 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final s5 D;
    public int E;
    public final ir F;
    public final r6 G;
    public final r6 H;
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
    public m9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final c6 X;
    public final ad Y;
    public final b8 Z;
    public final TLRPC.ReactionCount f740a;
    public final yj0 f741a0;
    public final boolean f742b;
    public int f744c;
    public int d;
    public int e;
    public boolean f747e0;
    public int f748f;
    public ImageReceiver f749f0;
    public int f750g;
    public s5 f751g0;
    public int h;
    public int f752i;
    public int f753j;
    public final int f754k;
    public final boolean f756m;
    public boolean f757n;
    public String f758o;
    public boolean f759p;
    public boolean f760q;
    public final TLRPC.Reaction f761r;
    public final i1 f762s;
    public boolean f764u;
    public final String v;
    public int f765w;
    public int f766x;
    public int f767y;
    public int f768z;
    public boolean f755l = true;
    public final Rect f763t = new Rect();
    public final RectF f743b0 = new RectF();
    public final RectF f745c0 = new RectF();
    public final Path f746d0 = new Path();

    public g1(g1 g1Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, c6 c6Var) {
        b8 b8Var;
        int i11;
        yj0 yj0Var;
        f1 f1Var = new f1(this, 0);
        this.V = i10;
        this.W = view;
        this.Y = new ad(view);
        this.X = c6Var;
        this.S = z11;
        if (g1Var != null) {
            this.F = g1Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new ir(view, false, null);
        }
        if (this.G == null) {
            r6 r6Var = new r6(true, true, true);
            this.G = r6Var;
            r6Var.K = true;
            r6Var.n(0.4f, 320L, es.h);
            r6Var.w(AndroidUtilities.dp(13.0f));
            r6Var.setCallback(f1Var);
            r6Var.x(AndroidUtilities.bold());
            r6Var.M = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            r6 r6Var2 = new r6(false, false, false, true, false);
            this.H = r6Var2;
            r6Var2.w(AndroidUtilities.dp(12.0f));
            r6Var2.setCallback(f1Var);
            r6Var2.x(AndroidUtilities.bold());
            r6Var2.M = AndroidUtilities.displaySize.x;
            r6Var2.A = 0.35f;
        }
        this.f740a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f761r = reaction;
        i1 d = i1.d(reaction);
        this.f762s = d;
        int i12 = reactionCount.count;
        this.f765w = i12;
        this.f759p = reactionCount.chosen;
        this.f753j = i12;
        this.f754k = reactionCount.chosen_order;
        this.f742b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f758o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f758o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f758o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        ir irVar = this.F;
        irVar.G = false;
        irVar.f25717a = true;
        if (reaction != null) {
            if (d.f780a) {
                this.f756m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (g1Var != null && (yj0Var = g1Var.f741a0) != null) {
                        this.f741a0 = yj0Var;
                    } else {
                        this.f741a0 = new yj0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f741a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (g1Var == null || (b8Var = g1Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    b8Var = new b8(1, i11);
                }
                this.Z = b8Var;
            } else if (d.f783f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f783f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, g6.f19543a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f784g != 0) {
                this.D = new s5(j(), i10, d.f784g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.e = j1.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f764u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f764u) {
            r6 r6Var3 = this.G;
            r6Var3.t(Emoji.replaceEmoji(this.v, r6Var3.f28433a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof io0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f765w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            r6 r6Var4 = this.G;
            if (r6Var4 != null) {
                r6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f765w, false);
        }
        ir irVar2 = this.F;
        irVar2.I = 2;
        irVar2.f25738z = 3;
    }

    public final void a() {
        this.f747e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        m9 m9Var = this.T;
        if (m9Var != null) {
            m9Var.g();
        }
        s5 s5Var = this.D;
        if (s5Var != null) {
            s5Var.a(this.W);
        }
    }

    public final void b() {
        this.f747e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        m9 m9Var = this.T;
        if (m9Var != null) {
            m9Var.h();
        }
        s5 s5Var = this.D;
        if (s5Var != null) {
            s5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f749f0;
        if (imageReceiver != null || this.f751g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f749f0 = null;
            } else if (this.f751g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f751g0.o(view);
                this.f751g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r31, float r32, float r33, float r34, float r35, boolean r36, boolean r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: ah.g1.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i10 = this.f765w;
        if ((i10 != 0 && (!this.S || this.f764u || i10 != 1)) || this.F.f25725l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        s5 s5Var = this.D;
        if (s5Var == null || (imageReceiver = s5Var.f28739k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        s5 s5Var2 = this.D;
        if (s5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            s5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        boolean z10 = false;
        if (this.f755l && (this.f756m || this.f753j > 1 || !n() || !this.Q)) {
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
                } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().f31298k0) {
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
            this.f757n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f757n = false;
    }

    public final boolean g(Canvas canvas, float f7, float f10) {
        b8 b8Var = this.Z;
        if (b8Var != null) {
            RectF rectF = b8Var.f50325c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f7, f10, this.A + f7, this.B + f10);
                float f11 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                b8Var.g(rectF);
                boolean d = b8Var.d();
                b8Var.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
                if (this.Q) {
                    Path path = this.f746d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    b8Var.a(canvas, this.K);
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
            RectF rectF2 = this.f743b0;
            int i10 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f746d0;
            if (i10 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                j1.h(rectF2, this.f745c0, path);
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
            Collections.sort(arrayList, j1.f790c0);
            if (this.T == null) {
                m9 m9Var = new m9(this.W, false);
                this.T = m9Var;
                m9Var.v = 250L;
                es esVar = ki.n.V;
                m9Var.f27023s = AndroidUtilities.dp(20.0f);
                this.T.f27020p = AndroidUtilities.dp(100.0f);
                m9 m9Var2 = this.T;
                m9Var2.f27019o = this.B;
                m9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f747e0) {
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
        s5 s5Var = this.D;
        if (s5Var == null || (imageReceiver = s5Var.f28739k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            yj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.H(true);
                return;
            }
            f6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        s5 s5Var = this.D;
        if (s5Var == null || (imageReceiver = s5Var.f28739k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            yj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            f6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f7) {
        int i10;
        this.N = i0.a.d(f7, this.f752i, i0.a.d(k(), this.K, this.M));
        int d = i0.a.d(f7, this.f750g, i0.a.d(k(), this.J, this.L));
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
