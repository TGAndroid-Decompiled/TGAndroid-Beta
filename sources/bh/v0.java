package bh;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.view.View;
import bi.td;
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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l9;
import org.telegram.ui.Components.mo0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.t5;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xj0;
public abstract class v0 {
    public int A;
    public int B;
    public final ImageReceiver C;
    public final t5 D;
    public int E;
    public final gr F;
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
    public l9 T;
    public ArrayList U;
    public final int V;
    public final View W;
    public final u6 X;
    public final xc Y;
    public final td Z;
    public final TLRPC.ReactionCount f4163a;
    public final xj0 f4164a0;
    public final boolean f4165b;
    public int f4167c;
    public int d;
    public int e;
    public boolean f4170e0;
    public int f4171f;
    public ImageReceiver f4172f0;
    public int f4173g;
    public t5 f4174g0;
    public int h;
    public int f4175i;
    public int f4176j;
    public final int f4177k;
    public final boolean f4179m;
    public boolean f4180n;
    public String f4181o;
    public boolean f4182p;
    public boolean f4183q;
    public final TLRPC.Reaction f4184r;
    public final x0 f4185s;
    public boolean f4187u;
    public final String v;
    public int f4188w;
    public int f4189x;
    public int f4190y;
    public int f4191z;
    public boolean f4178l = true;
    public final Rect f4186t = new Rect();
    public final RectF f4166b0 = new RectF();
    public final RectF f4168c0 = new RectF();
    public final Path f4169d0 = new Path();

    public v0(v0 v0Var, int i10, View view, TLRPC.ReactionCount reactionCount, boolean z10, boolean z11, u6 u6Var) {
        td tdVar;
        int i11;
        xj0 xj0Var;
        u0 u0Var = new u0(this, 0);
        this.V = i10;
        this.W = view;
        this.Y = new xc(view);
        this.X = u6Var;
        this.S = z11;
        if (v0Var != null) {
            this.F = v0Var.F;
        }
        if (this.C == null) {
            this.C = new ImageReceiver();
        }
        if (this.F == null) {
            this.F = new gr(view, false, null);
        }
        if (this.G == null) {
            r6 r6Var = new r6(true, true, true);
            this.G = r6Var;
            r6Var.K = true;
            r6Var.n(0.4f, 320L, ds.h);
            r6Var.w(AndroidUtilities.dp(13.0f));
            r6Var.setCallback(u0Var);
            r6Var.x(AndroidUtilities.bold());
            r6Var.M = AndroidUtilities.displaySize.x;
        }
        if (this.H == null) {
            r6 r6Var2 = new r6(false, false, false, true, false);
            this.H = r6Var2;
            r6Var2.w(AndroidUtilities.dp(12.0f));
            r6Var2.setCallback(u0Var);
            r6Var2.x(AndroidUtilities.bold());
            r6Var2.M = AndroidUtilities.displaySize.x;
            r6Var2.A = 0.35f;
        }
        this.f4163a = reactionCount;
        TLRPC.Reaction reaction = reactionCount.reaction;
        this.f4184r = reaction;
        x0 d = x0.d(reaction);
        this.f4185s = d;
        int i12 = reactionCount.count;
        this.f4188w = i12;
        this.f4182p = reactionCount.chosen;
        this.f4176j = i12;
        this.f4177k = reactionCount.chosen_order;
        this.f4165b = z10;
        if (reaction instanceof TLRPC.TL_reactionPaid) {
            this.f4181o = "stars";
        } else if (reaction instanceof TLRPC.TL_reactionEmoji) {
            this.f4181o = ((TLRPC.TL_reactionEmoji) reaction).emoticon;
        } else if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            this.f4181o = Long.toString(((TLRPC.TL_reactionCustomEmoji) reaction).document_id);
        } else {
            throw new RuntimeException("unsupported");
        }
        this.C.setParentView(view);
        this.Q = reactionCount.chosen;
        gr grVar = this.F;
        grVar.G = false;
        grVar.f28681a = true;
        if (reaction != null) {
            if (d.f4205a) {
                this.f4179m = true;
                if (LiteMode.isEnabled(8200)) {
                    if (v0Var != null && (xj0Var = v0Var.f4164a0) != null) {
                        this.f4164a0 = xj0Var;
                    } else {
                        this.f4164a0 = new xj0(R.raw.star_reaction_click, AndroidUtilities.dp(40.0f), AndroidUtilities.dp(40.0f));
                    }
                    this.C.setImageBitmap(this.f4164a0);
                } else {
                    this.C.setImageBitmap(ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.star_reaction).mutate());
                }
                if (v0Var == null || (tdVar = v0Var.Z) == null) {
                    if (SharedConfig.getDevicePerformanceClass() == 2) {
                        i11 = 18;
                    } else {
                        i11 = 8;
                    }
                    tdVar = new td(1, i11);
                }
                this.Z = tdVar;
            } else if (d.f4208f != null) {
                TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(i10).getReactionsMap().get(d.f4208f);
                if (tL_availableReaction != null) {
                    this.C.setImage(ImageLocation.getForDocument(tL_availableReaction.center_icon), "40_40_lastreactframe", DocumentObject.getSvgThumb(tL_availableReaction.static_icon, y6.f23297a7, 1.0f), "webp", tL_availableReaction, 1);
                }
            } else if (d.f4209g != 0) {
                this.D = new t5(j(), i10, d.f4209g);
            }
        }
        this.F.d(AndroidUtilities.dp(26.0f), AndroidUtilities.dp(100.0f));
        this.F.e = y0.Y;
        if (z11) {
            String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
            this.v = savedTagName;
            this.f4187u = !TextUtils.isEmpty(savedTagName);
        }
        if (this.f4187u) {
            r6 r6Var3 = this.G;
            r6Var3.t(Emoji.replaceEmoji(this.v, r6Var3.f32117a.getFontMetricsInt(), false), !LocaleController.isRTL, true);
            if (this instanceof mo0) {
                Integer.toString(reactionCount.count);
                this.F.c(this.f4188w, false);
            } else {
                this.F.c(0, false);
            }
        } else {
            r6 r6Var4 = this.G;
            if (r6Var4 != null) {
                r6Var4.t("", false, true);
            }
            Integer.toString(reactionCount.count);
            this.F.c(this.f4188w, false);
        }
        gr grVar2 = this.F;
        grVar2.I = 2;
        grVar2.f28702z = 3;
    }

    public final void a() {
        this.f4170e0 = true;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onAttachedToWindow();
        }
        l9 l9Var = this.T;
        if (l9Var != null) {
            l9Var.g();
        }
        t5 t5Var = this.D;
        if (t5Var != null) {
            t5Var.a(this.W);
        }
    }

    public final void b() {
        this.f4170e0 = false;
        ImageReceiver imageReceiver = this.C;
        if (imageReceiver != null) {
            imageReceiver.onDetachedFromWindow();
        }
        l9 l9Var = this.T;
        if (l9Var != null) {
            l9Var.h();
        }
        t5 t5Var = this.D;
        if (t5Var != null) {
            t5Var.o(this.W);
        }
        c();
    }

    public final void c() {
        ImageReceiver imageReceiver = this.f4172f0;
        if (imageReceiver != null || this.f4174g0 != null) {
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                this.f4172f0 = null;
            } else if (this.f4174g0 != null) {
                View view = this.W;
                if (view != null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                this.f4174g0.o(view);
                this.f4174g0 = null;
            }
        }
    }

    public final void d(android.graphics.Canvas r31, float r32, float r33, float r34, float r35, boolean r36, boolean r37, float r38) {
        throw new UnsupportedOperationException("Method not decompiled: bh.v0.d(android.graphics.Canvas, float, float, float, float, boolean, boolean, float):void");
    }

    public boolean e() {
        int i10 = this.f4188w;
        if ((i10 != 0 && (!this.S || this.f4187u || i10 != 1)) || this.F.f28689l != 1.0f) {
            return true;
        }
        return false;
    }

    public final void f(Canvas canvas, Rect rect, float f7) {
        ImageReceiver imageReceiver;
        t5 t5Var = this.D;
        if (t5Var == null || (imageReceiver = t5Var.f32849k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null && rect != null) {
            imageReceiver.setImageCoords(rect);
        }
        t5 t5Var2 = this.D;
        if (t5Var2 != null && this.E != this.N) {
            int i10 = this.N;
            this.E = i10;
            t5Var2.setColorFilter(new PorterDuffColorFilter(i10, PorterDuff.Mode.SRC_IN));
        }
        boolean z10 = false;
        if (this.f4178l && (this.f4179m || this.f4176j > 1 || !n() || !this.Q)) {
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
                } else if (l4.getLottieAnimation() != null && !l4.getLottieAnimation().f34746k0) {
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
            this.f4180n = true;
            return;
        }
        imageReceiver.setAlpha(0.0f);
        imageReceiver.draw(canvas);
        this.f4180n = false;
    }

    public final boolean g(Canvas canvas, float f7, float f10) {
        td tdVar = this.Z;
        if (tdVar != null) {
            RectF rectF = tdVar.f5491c;
            if (LiteMode.isEnabled(8200) && LiteMode.isEnabled(131072)) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(f7, f10, this.A + f7, this.B + f10);
                float f11 = this.B / 2.0f;
                rectF.set(rectF2);
                rectF.inset(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
                tdVar.g(rectF);
                boolean d = tdVar.d();
                tdVar.a(canvas, i0.a.f(k(), i0.a.o(this.J, 255), i0.a.f(0.4f, this.M, i0.a.o(this.J, 255))));
                if (this.Q) {
                    Path path = this.f4169d0;
                    path.rewind();
                    path.addRoundRect(rectF2, f11, f11, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(path);
                    tdVar.a(canvas, this.K);
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
            RectF rectF2 = this.f4166b0;
            int i10 = (rectF2.left > rectF.left ? 1 : (rectF2.left == rectF.left ? 0 : -1));
            Path path = this.f4169d0;
            if (i10 != 0 || rectF2.top != rectF.top || rectF2.right != rectF.right || rectF2.bottom != rectF.bottom) {
                rectF2.set(rectF);
                y0.h(rectF2, this.f4168c0, path);
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
            Collections.sort(arrayList, y0.f4214c0);
            if (this.T == null) {
                l9 l9Var = new l9(this.W, false);
                this.T = l9Var;
                l9Var.v = 250L;
                ds dsVar = mi.m.V;
                l9Var.f30122s = AndroidUtilities.dp(20.0f);
                this.T.f30119p = AndroidUtilities.dp(100.0f);
                l9 l9Var2 = this.T;
                l9Var2.f30118o = this.B;
                l9Var2.j(AndroidUtilities.dp(22.0f));
            }
            if (this.f4170e0) {
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
        t5 t5Var = this.D;
        if (t5Var == null || (imageReceiver = t5Var.f32849k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            xj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.H(true);
                return;
            }
            g6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.start();
            }
        }
    }

    public final void r() {
        ImageReceiver imageReceiver;
        t5 t5Var = this.D;
        if (t5Var == null || (imageReceiver = t5Var.f32849k) == null) {
            imageReceiver = this.C;
        }
        if (imageReceiver != null) {
            xj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation != null) {
                lottieAnimation.stop();
                return;
            }
            g6 animation = imageReceiver.getAnimation();
            if (animation != null) {
                animation.stop();
            }
        }
    }

    public void s(float f7) {
        int i10;
        this.N = i0.a.f(f7, this.f4175i, i0.a.f(k(), this.K, this.M));
        int f10 = i0.a.f(f7, this.f4173g, i0.a.f(k(), this.J, this.L));
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
