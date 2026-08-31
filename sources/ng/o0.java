package ng;

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
import mh.wa;
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
import org.telegram.ui.Components.c9;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.nn0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.y5;
public abstract class o0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final l5 D;
    public int E;
    public final vq F;
    public final j6 G;
    public final j6 H;
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
    public c9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final g6 X;
    public final rc Y;
    public final wa Z;
    public final TLRPC.ReactionCount f16142a;
    public final ij0 f16143a0;
    public final boolean f16144b;
    public int f16146c;
    public int d;
    public int f16149e;
    public boolean f16150e0;
    public int f16151f;
    public ImageReceiver f16152f0;
    public int f16153g;
    public l5 f16154g0;
    public int h;
    public int f16155i;
    public int f16156j;
    public final int f16157k;
    public final boolean f16159m;
    public boolean f16160n;
    public String f16161o;
    public boolean f16162p;
    public boolean f16163q;
    public final TLRPC.Reaction f16164r;
    public final q0 f16165s;
    public boolean f16167u;
    public final String v;
    public int f16168w;
    public int f16169x;
    public int f16170y;
    public int f16171z;
    public boolean f16158l = true;
    public final Rect f16166t = new Rect();
    public final RectF f16145b0 = new RectF();
    public final RectF f16147c0 = new RectF();
    public final Path f16148d0 = new Path();

    public o0(o0 o0Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z4, boolean z10, g6 g6Var) {
        wa waVar;
        int i11;
        ij0 ij0Var;
        i.f fVar = new i.f(this, 5);
        this.V = i10;
        this.W = view;
        this.Y = new rc(view);
        this.X = g6Var;
        this.S = z10;
        if (o0Var != null) {
            this.F = o0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new vq(view, false, null);
        }
        if (this.G == null) {
            j6 j6Var = new j6(true, true, true, false);
            this.G = j6Var;
            j6Var.E = true;
            j6Var.k(0.4f, 320L, pr.h);
            j6Var.t(AndroidUtilities.dp(13.0f));
            j6Var.setCallback(fVar);
            j6Var.u(AndroidUtilities.bold());
            j6Var.G = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            j6 j6Var2 = new j6(false, false, false, true);
            this.H = j6Var2;
            j6Var2.t(AndroidUtilities.dp(12.0f));
            j6Var2.setCallback(fVar);
            j6Var2.u(AndroidUtilities.bold());
            j6Var2.G = AndroidUtilities.displaySize.x;
            j6Var2.v = 0.35f;
        }
        this.f16142a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f16164r = reaction;
        q0 d = q0.d(reaction);
        this.f16165s = d;
        int i12 = reactionCount.count;
        this.f16168w = i12;
        this.f16162p = reactionCount.chosen;
        this.f16156j = i12;
        this.f16157k = reactionCount.chosen_order;
        this.f16144b = z4;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f16161o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f16161o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f16161o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        vq vqVar = this.F;
        vqVar.G = false;
        vqVar.f32504a = true;
        if (reaction != null) {
            if (d.f16174a) {
                this.f16159m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (o0Var != null && (ij0Var = o0Var.f16143a0) != null) {
                        this.f16143a0 = ij0Var;
                    } else {
                        this.f16143a0 = new ij0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), "star_reaction_click", AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f16143a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (o0Var == null || (waVar = o0Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    waVar = new wa(1, i11);
                }
                this.Z = waVar;
            } else if (d.f16178f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f16178f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, k6.f21605a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f16179g != 0) {
                this.D = new l5(j(), i10, d.f16179g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.f32507e = r0.Y;
        if (z10) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f16167u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f16167u) {
            j6 j6Var3 = this.G;
            j6Var3.q(Emoji.replaceEmoji(this.v, j6Var3.f28028a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof nn0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f16168w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            j6 j6Var4 = this.G;
            if (j6Var4 != null) {
                j6Var4.q("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f16168w, false);
        }
        vq vqVar2 = this.F;
        vqVar2.I = 2;
        vqVar2.f32526z = 3;
    }

    public final void a() {
        this.f16150e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        c9 c9Var = this.T;
        if (c9Var != null) {
            c9Var.g();
        }
        l5 l5Var = this.D;
        if (l5Var != null) {
            l5Var.a(this.W);
        }
    }

    public final void b() {
        this.f16150e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        c9 c9Var = this.T;
        if (c9Var != null) {
            c9Var.h();
        }
        l5 l5Var = this.D;
        if (l5Var != null) {
            l5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f16152f0;
        if (imageReceiver != null || this.f16154g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f16152f0 = null;
            } else if (this.f16154g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f16154g0.o(view);
                this.f16154g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r32, float r33, float r34, float r35, float r36, boolean r37, boolean r38, float r39) {
        throw new UnsupportedOperationException("Method not decompiled: ng.o0.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i10 = this.f16168w;
        if ((i10 != 0 && (!this.S || this.f16167u || i10 != 1)) || this.F.f32513l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f10) {
        ImageReceiver imageReceiver;
        l5 l5Var = this.D;
        if (l5Var == null || (imageReceiver = l5Var.f28604k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        l5 l5Var2 = this.D;
        if (l5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            l5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        boolean z4 = false;
        if (this.f16158l && (this.f16159m || this.f16156j > 1 || !n() || !this.Q)) {
            ImageReceiver l10 = l();
            if (l10 != null) {
                z4 = (l10.getLottieAnimation() == null || !l10.getLottieAnimation().s()) ? true : true;
                if (f10 != 1.0f) {
                    l10.setAlpha(f10);
                    if (f10 <= 0.0f) {
                        l10.onDetachedFromWindow();
                        o();
                    }
                } else if (l10.getLottieAnimation() != null && !l10.getLottieAnimation().f27823i0) {
                    float alpha = l10.getAlpha() - 0.08f;
                    if (alpha <= 0.0f) {
                        l10.onDetachedFromWindow();
                        o();
                    } else {
                        l10.setAlpha(alpha);
                    }
                    this.W.invalidate();
                    z4 = true;
                }
                l10.setImageCoords(imageReceiver.getImageX() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageY() - (imageReceiver.getImageWidth() / 2.0f), imageReceiver.getImageWidth() * 2.0f, imageReceiver.getImageHeight() * 2.0f);
                l10.draw(canvas);
            } else {
                z4 = true;
            }
            if (z4) {
                imageReceiver.draw(canvas);
            }
            this.f16160n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f16160n = false;
    }

    public final boolean g(Canvas canvas, float f10, float f11) {
        wa waVar = this.Z;
        if (waVar != null) {
            RectF rectF = waVar.f15007c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f10, f11, this.A + f10, this.B + f11);
                float f12 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                waVar.g(rectF);
                boolean d = waVar.d();
                waVar.a(canvas, i0.a.d(k(), i0.a.k(this.J, 255), i0.a.d(0.4f, this.M, i0.a.k(this.J, 255))));
                if (this.Q) {
                    Path path = this.f16148d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f12, f12, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    waVar.a(canvas, this.K);
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
            RectF rectF2 = this.f16145b0;
            float f11 = rectF2.left;
            float f12 = rectF.left;
            Path path = this.f16148d0;
            if (f11 != f12 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                r0.h(rectF2, this.f16147c0, path);
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
            Collections.sort(arrayList, r0.f16183c0);
            if (this.T == null) {
                c9 c9Var = new c9(this.W, false);
                this.T = c9Var;
                c9Var.v = 250L;
                pr prVar = xh.n.V;
                c9Var.f25880s = AndroidUtilities.dp(20.0f);
                this.T.f25877p = AndroidUtilities.dp(100.0f);
                c9 c9Var2 = this.T;
                c9Var2.f25876o = this.B;
                c9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f16150e0) {
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
        l5 l5Var = this.D;
        if (l5Var == null || (imageReceiver = l5Var.f28604k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            ij0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.F(true);
                return;
            }
            y5 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        l5 l5Var = this.D;
        if (l5Var == null || (imageReceiver = l5Var.f28604k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            ij0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            y5 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f10) {
        int i10;
        this.N = i0.a.d(f10, this.f16155i, i0.a.d(k(), this.K, this.M));
        int d = i0.a.d(f10, this.f16153g, i0.a.d(k(), this.J, this.L));
        this.O = d;
        int i11 = this.h;
        if (AndroidUtilities.computePerceivedBrightness(d) > 0.8f) {
            i10 = 0;
        } else {
            i10 = 1526726655;
        }
        this.P = i0.a.d(f10, i11, i10);
    }

    public void o() {
    }
}
