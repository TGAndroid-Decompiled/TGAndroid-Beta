package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c20;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.nc;
import org.telegram.ui.Components.si0;
import org.telegram.ui.yw;

public final class o extends FrameLayout {
    public long A;
    public boolean B;
    public boolean C;
    public boolean D;
    public long E;
    public float F;
    public float G;
    public float H;
    public float I;
    public boolean J;
    public final h7 K;
    public float L;
    public float M;
    public si0 N;
    public f O;
    public final float P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final org.telegram.ui.Components.y5 T;
    public final yw U;

    public boolean f13720a;

    public int f13721b;

    public boolean f13722c;
    public boolean d;

    public i7 f13723e;

    public TLRPC.User f13724f;
    public TLRPC.Chat h;

    public final org.telegram.ui.Components.y8 f13725n;

    public final ImageReceiver f13726r;

    public final ImageReceiver f13727s;
    public final org.telegram.ui.Components.y8 v;

    public boolean f13728w;

    public final FrameLayout f13729x;

    public org.telegram.ui.ActionBar.h5 f13730y;

    public o(yw ywVar, Context context) {
        super(context);
        this.U = ywVar;
        this.f13725n = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.f13726r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.f13727s = imageReceiver2;
        this.v = new org.telegram.ui.Components.y8((org.telegram.ui.ActionBar.c6) null);
        this.f13728w = true;
        h7 h7Var = new h7(null, true);
        this.K = h7Var;
        this.L = 1.0f;
        this.M = 1.0f;
        this.P = 1.0f;
        this.T = new org.telegram.ui.Components.y5(this, 0L, 350L, er.h);
        h7Var.f13403o = ywVar.f13773b == 1;
        h7Var.D = true;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setAllowLoadingOnAttachedOnly(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f13729x = frameLayout;
        frameLayout.setClipChildren(false);
        if (!this.J) {
            setClipChildren(false);
        }
        b();
        addView(frameLayout, h7.z5.c(-2.0f, -1));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        imageReceiver2.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public void setClipInParent(boolean z10) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).setClipChildren(z10);
        }
        if (getParent() == null || getParent().getParent() == null || getParent().getParent().getParent() == null) {
            return;
        }
        ((ViewGroup) getParent().getParent().getParent()).setClipChildren(z10);
    }

    public final void b() {
        org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(getContext());
        this.f13730y = h5Var;
        h5Var.setTypeface(AndroidUtilities.bold());
        this.f13730y.setGravity(17);
        this.f13730y.setTextSize(11);
        this.f13730y.setTextColor(this.U.getTextColor());
        NotificationCenter.listenEmojiLoading(this.f13730y);
        this.f13730y.setMaxLines(1);
        this.f13729x.addView(this.f13730y, h7.z5.d(-1, -2.0f, 0, 1.0f, 0.0f, 1.0f, 0.0f));
        this.f13726r.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
        this.f13727s.setRoundRadius(AndroidUtilities.dp(48.0f) / 2);
    }

    public final void c(Canvas canvas, float f10, float f11, float f12) {
        yw ywVar = this.U;
        int i10 = ywVar.f13773b;
        Paint paint = ywVar.C;
        s6 s6Var = ywVar.f13795s;
        Paint paint2 = ywVar.D;
        Drawable drawable = ywVar.f13775c;
        if (this.B && !s6Var.I(this.A) && Utilities.isNullOrEmpty(s6Var.E(this.A))) {
            float fDp = f10 + AndroidUtilities.dp(16.0f);
            float fDp2 = f11 + AndroidUtilities.dp(16.0f);
            paint.setColor(org.telegram.ui.ActionBar.g6.l1(f12, ywVar.f(org.telegram.ui.ActionBar.g6.hl)));
            if (i10 == 0) {
                paint2.setColor(org.telegram.ui.ActionBar.g6.l1(f12, ywVar.f(org.telegram.ui.ActionBar.g6.f23322s8)));
            } else {
                paint2.setColor(org.telegram.ui.ActionBar.g6.l1(f12, ywVar.f(org.telegram.ui.ActionBar.g6.M8)));
            }
            canvas.drawCircle(fDp, fDp2, AndroidUtilities.dp(11.0f), paint2);
            canvas.drawCircle(fDp, fDp2, AndroidUtilities.dp(9.0f), paint);
            int iF = ywVar.f(i10 == 0 ? org.telegram.ui.ActionBar.g6.f23322s8 : org.telegram.ui.ActionBar.g6.M8);
            if (iF != ywVar.f13778e) {
                ywVar.f13778e = iF;
                drawable.setColorFilter(new PorterDuffColorFilter(iF, PorterDuff.Mode.MULTIPLY));
            }
            drawable.setAlpha((int) (f12 * 255.0f));
            drawable.setBounds((int) (fDp - (drawable.getIntrinsicWidth() / 2.0f)), (int) (fDp2 - (drawable.getIntrinsicHeight() / 2.0f)), (int) ((drawable.getIntrinsicWidth() / 2.0f) + fDp), (int) ((drawable.getIntrinsicHeight() / 2.0f) + fDp2));
            drawable.draw(canvas);
        }
    }

    public final void d(float f10, float f11, float f12, boolean z10) {
        float f13 = this.F;
        yw ywVar = this.U;
        if (f13 != f10 || this.G != f11 || 0.0f != f12 || this.R != z10) {
            this.R = z10;
            this.F = f10;
            this.G = f11;
            invalidate();
            ywVar.h.invalidate();
        }
        float fClamp = this.J ? 0.0f : 1.0f - Utilities.clamp(ywVar.J / ywVar.f13803x0, 1.0f, 0.0f);
        this.M = fClamp;
        float f14 = fClamp * this.L;
        FrameLayout frameLayout = this.f13729x;
        frameLayout.setAlpha(f14);
        frameLayout.setVisibility(f14 > 0.0f ? 0 : 4);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        h7 h7Var;
        float size;
        boolean z10;
        float f10;
        yw ywVar;
        boolean z11;
        float degrees;
        ImageReceiver imageReceiver;
        boolean[] zArr;
        si0 si0Var;
        float fDp = AndroidUtilities.dp(48.0f);
        float fDp2 = AndroidUtilities.dp(26.33f);
        float fDp3 = AndroidUtilities.dp(8.0f);
        yw ywVar2 = this.U;
        int i10 = ywVar2.f13773b;
        s6 s6Var = ywVar2.f13795s;
        Paint paint = ywVar2.D;
        float fClamp = Utilities.clamp(ywVar2.f13785j0 / 0.5f, 1.0f, 0.0f) * fDp3;
        if (this.R) {
            fClamp += Utilities.clamp((ywVar2.f13785j0 - 0.5f) / 0.5f, 1.0f, 0.0f) * AndroidUtilities.dp(16.0f);
        }
        float fLerp = AndroidUtilities.lerp(fDp + fClamp, fDp2, this.F);
        float f11 = fLerp / 2.0f;
        float measuredWidth = (getMeasuredWidth() / 2.0f) - f11;
        float fLerp2 = AndroidUtilities.lerp(measuredWidth, 0.0f, this.F);
        float fLerp3 = AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - fDp2) / 2.0f, this.F);
        float fClamp2 = Utilities.clamp(this.F / 0.5f, 1.0f, 0.0f);
        h7 h7Var2 = this.K;
        h7Var2.f13391a = true;
        RectF rectF = h7Var2.F;
        if (!h7Var2.f13404p) {
            h7Var2.f13394e = 1.0f - ywVar2.W;
        }
        float f12 = fLerp3 + fLerp;
        rectF.set(fLerp2, fLerp3, fLerp2 + fLerp, f12);
        h7Var2.G = AndroidUtilities.dpf2(1.33f) * this.F;
        ImageReceiver imageReceiver2 = this.f13726r;
        imageReceiver2.setAlpha(1.0f);
        imageReceiver2.setRoundRadius((int) f11);
        float f13 = fLerp2 + f11;
        this.H = f13;
        float f14 = fLerp3 + f11;
        this.I = f14;
        if (i10 == 0) {
            paint.setColor(ywVar2.f(org.telegram.ui.ActionBar.g6.f23322s8));
        } else {
            paint.setColor(ywVar2.f(org.telegram.ui.ActionBar.g6.M8));
        }
        if (this.F != 0.0f) {
            canvas.drawCircle(this.H, this.I, AndroidUtilities.dpf2(1.5f) + f11, paint);
        }
        canvas.save();
        float f15 = this.H;
        float f16 = this.I;
        float f17 = this.P;
        canvas.scale(f17, f17, f15, f16);
        if (this.N == null) {
            this.N = ywVar2.f13788n;
        }
        ArrayList arrayList = (ArrayList) s6Var.f13957c.f(this.A);
        boolean z12 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        if (z12 || (this.S && (si0Var = this.N) != null && si0Var.f32457f < 0.98f)) {
            canvas2 = canvas;
            h7Var = h7Var2;
            fLerp2 = fLerp2;
            f12 = f12;
            if (z12) {
                float f18 = 0.0f;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    f18 += ((r6) arrayList.get(i11)).h;
                }
                int i12 = s6Var.d;
                size = (i12 + f18) / (arrayList.size() + i12);
                z10 = ((r6) i0.a.i(1, arrayList)).C;
                ywVar2.f13784i0 = z10;
            } else {
                z10 = ywVar2.f13784i0;
                size = 1.0f;
            }
            invalidate();
            if (this.N == null) {
                si0 si0Var2 = ywVar2.f13788n;
                if (si0Var2 != null) {
                    this.N = si0Var2;
                } else {
                    si0 si0Var3 = new si0(this);
                    this.N = si0Var3;
                    ywVar2.f13788n = si0Var3;
                    si0Var3.d(null, true, false);
                }
            }
            if (this.f13728w) {
                canvas2.save();
                canvas2.scale(h7Var.b(), h7Var.b(), rectF.centerX(), rectF.centerY());
                imageReceiver2.setImageCoords(rectF);
                imageReceiver2.draw(canvas2);
                canvas2.restore();
            }
            this.N.f32467q = 0;
            Paint paintO = z10 ? l7.o(imageReceiver2) : l7.t(imageReceiver2, true);
            paintO.setAlpha(255);
            si0 si0Var4 = this.N;
            si0Var4.f32470t = paintO;
            si0Var4.f((int) (imageReceiver2.getImageX() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver2.getImageY() - AndroidUtilities.dp(3.0f)), (int) (imageReceiver2.getImageX2() + AndroidUtilities.dp(3.0f)), (int) (imageReceiver2.getImageY2() + AndroidUtilities.dp(3.0f)));
            this.N.e(Utilities.clamp(size, 1.0f, 0.0f), this.S);
            if (imageReceiver2.getVisible()) {
                this.N.a(canvas2);
            }
            this.S = true;
            invalidate();
        } else {
            float fE = this.T.e(this.C);
            if (this.f13728w) {
                if (this.S) {
                    h7Var2.f13404p = true;
                    h7Var2.f13394e = 0.0f;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 14));
                    valueAnimatorOfFloat.addListener(new ag.r1(this, 12));
                    valueAnimatorOfFloat.setDuration(100L);
                    valueAnimatorOfFloat.start();
                }
                float f19 = fE * h7Var2.f13394e;
                h7Var2.f13392b = !this.S;
                ywVar = ywVar2;
                if (this.f13722c || ywVar.f13785j0 > 0.0f) {
                    degrees = 0.0f;
                } else {
                    float fLerp4 = AndroidUtilities.lerp(getMeasuredWidth(), AndroidUtilities.dp(16.0f), er.f28123g.getInterpolation(this.F));
                    float fDpf2 = AndroidUtilities.dpf2(3.5f) + f11;
                    if (fLerp4 < fDpf2 * 2.0f) {
                        degrees = ((float) Math.toDegrees(Math.acos((fLerp4 / 2.0f) / fDpf2))) * 2.0f;
                    } else {
                        degrees = 0.0f;
                    }
                }
                h7Var2.f13395f = degrees;
                h7Var2.f13400l = this.f13722c;
                h7Var2.f13401m = this.d;
                h7Var2.f13409u = 1.0f - f19;
                boolean z13 = this.B;
                if (z13 || !this.D) {
                    h7Var2.f13407s = 0L;
                } else {
                    h7Var2.f13407s = this.E;
                }
                if (z13) {
                    h7Var = h7Var2;
                    imageReceiver = imageReceiver2;
                    z11 = false;
                    zArr = null;
                    canvas2 = canvas;
                    l7.i(this.A, canvas2, imageReceiver, s6Var.H(), h7Var);
                } else {
                    h7Var = h7Var2;
                    imageReceiver = imageReceiver2;
                    z11 = false;
                    zArr = null;
                    long j10 = this.A;
                    canvas2 = canvas;
                    l7.i(j10, canvas2, imageReceiver, s6Var.I(j10), h7Var);
                }
                ImageReceiver imageReceiver3 = imageReceiver;
                if (f19 > 0.0f) {
                    if (l7.d == null) {
                        c20 c20Var = new c20();
                        l7.d = c20Var;
                        c20Var.f27290a = true;
                        c20Var.f27291b = true;
                        int iW0 = org.telegram.ui.ActionBar.g6.w0(zArr, org.telegram.ui.ActionBar.g6.xj, z11);
                        int iW1 = org.telegram.ui.ActionBar.g6.w0(zArr, org.telegram.ui.ActionBar.g6.f23284q7, z11);
                        l7.d.d(i0.b.d(0.25f, iW0, iW1), iW1, z11 ? 1 : 0, z11 ? 1 : 0);
                        l7.d.f27292c.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
                        l7.d.f27292c.setStyle(Paint.Style.STROKE);
                        l7.d.f27292c.setStrokeCap(Paint.Cap.ROUND);
                    }
                    l7.d.b(imageReceiver3.getImageX(), imageReceiver3.getImageY(), imageReceiver3.getImageX2(), imageReceiver3.getImageY2());
                    Paint paint2 = l7.d.f27292c;
                    paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
                    paint2.setAlpha((int) (255.0f * f19));
                    canvas2.drawCircle(f13, f14, h7Var.b() * (f11 + AndroidUtilities.dp(4.0f)), paint2);
                }
                fE = f19;
            } else {
                canvas2 = canvas;
                h7Var = h7Var2;
                ywVar = ywVar2;
                f12 = f12;
                fLerp2 = fLerp2;
                z11 = false;
            }
            this.S = z11;
            if (this.f13728w) {
                canvas2.save();
                float f20 = 1.0f - fClamp2;
                canvas2.scale(f20, f20, this.H + AndroidUtilities.dp(16.0f), this.I + AndroidUtilities.dp(16.0f));
                c(canvas2, this.H, this.I, 1.0f);
                float f21 = this.H;
                float f22 = this.I;
                if (fE > 0.0f) {
                    float fDp4 = f21 + AndroidUtilities.dp(17.0f);
                    float fDp5 = f22 + AndroidUtilities.dp(17.0f);
                    Paint paint3 = ywVar.C;
                    paint3.setColor(org.telegram.ui.ActionBar.g6.l1(fE, ywVar.f(org.telegram.ui.ActionBar.g6.f23284q7)));
                    if (i10 == 0) {
                        paint.setColor(org.telegram.ui.ActionBar.g6.l1(fE, ywVar.f(org.telegram.ui.ActionBar.g6.f23322s8)));
                    } else {
                        paint.setColor(org.telegram.ui.ActionBar.g6.l1(fE, ywVar.f(org.telegram.ui.ActionBar.g6.M8)));
                    }
                    float interpolation = er.f28126k.getInterpolation(fE) * AndroidUtilities.dp(9.0f);
                    canvas2.drawCircle(fDp4, fDp5, AndroidUtilities.dp(2.0f) + interpolation, paint);
                    canvas2.drawCircle(fDp4, fDp5, interpolation, paint3);
                    paint3.setColor(org.telegram.ui.ActionBar.g6.l1(fE, ywVar.getTextColor()));
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    rectF2.set(fDp4 - AndroidUtilities.dp(1.0f), fDp5 - AndroidUtilities.dpf2(4.6f), AndroidUtilities.dp(1.0f) + fDp4, AndroidUtilities.dpf2(1.6f) + fDp5);
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
                    rectF2.set(fDp4 - AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(2.6f) + fDp5, fDp4 + AndroidUtilities.dp(1.0f), AndroidUtilities.dpf2(4.6f) + fDp5);
                    canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
                }
                canvas2.restore();
            }
        }
        canvas2.restore();
        if (!this.D || this.G <= 0.0f) {
            f10 = fLerp2;
        } else {
            ImageReceiver imageReceiver4 = this.f13727s;
            f10 = fLerp2;
            imageReceiver4.setImageCoords(f10, fLerp3, fLerp, fLerp);
            imageReceiver4.setAlpha(this.G);
            imageReceiver4.draw(canvas2);
        }
        float fDp6 = ((1.0f - this.F) * AndroidUtilities.dp(7.0f)) + f12;
        FrameLayout frameLayout = this.f13729x;
        frameLayout.setTranslationY(fDp6);
        frameLayout.setTranslationX(f10 - measuredWidth);
        if (!this.J) {
            if (this.B) {
                this.L = 1.0f;
            } else {
                this.L = h7Var.f13402n == 2 ? 0.7f : 1.0f;
            }
            float f23 = this.M * this.L;
            frameLayout.setAlpha(f23);
            frameLayout.setVisibility(f23 > 0.0f ? 0 : 4);
        }
        super.dispatchDraw(canvas);
    }

    public float getCy() {
        float fDp = AndroidUtilities.dp(48.0f);
        float fDp2 = AndroidUtilities.dp(26.33f);
        return AndroidUtilities.lerp(AndroidUtilities.dp(5.0f), (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - fDp2) / 2.0f, this.U.V) + (AndroidUtilities.lerp(fDp, fDp2, this.F) / 2.0f);
    }

    @Override
    public final void invalidate() {
        if (this.J || (this.f13720a && getParent() != null)) {
            ViewParent parent = getParent();
            yw ywVar = this.U;
            h hVar = ywVar.f13793r;
            if (parent == hVar) {
                hVar.invalidate();
            } else {
                ywVar.invalidate();
            }
        }
        super.invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f13726r.onAttachedToWindow();
        this.f13727s.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f13726r.onDetachedFromWindow();
        this.f13727s.onDetachedFromWindow();
        this.K.g();
        i7 i7Var = this.f13723e;
        if (i7Var != null) {
            i7Var.a();
            this.f13723e = null;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.J ? AndroidUtilities.dp(70.0f) : this.U.I, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
    }

    public void setCrossfadeTo(long j10) {
        TLRPC.Chat chat;
        TLObject tLObject;
        TLRPC.User user;
        int i10 = this.U.f13780f;
        if (this.E != j10) {
            this.E = j10;
            boolean z10 = j10 != -1;
            this.D = z10;
            ImageReceiver imageReceiver = this.f13727s;
            if (!z10) {
                imageReceiver.clearImage();
                return;
            }
            if (j10 > 0) {
                user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
                this.f13724f = user;
                this.h = null;
            } else {
                chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
                this.h = chat;
                this.f13724f = null;
            }
            if (tLObject == null) {
                tLObject = chat;
                tLObject = user;
                return;
            }
            tLObject = chat;
            tLObject = user;
            org.telegram.ui.Components.y8 y8Var = this.v;
            y8Var.j(i10, tLObject);
            imageReceiver.setForUserOrChat(tLObject, y8Var);
        }
    }

    public void setDialogId(long j10) {
        TLObject tLObject;
        r6 r6Var;
        yw ywVar = this.U;
        int i10 = ywVar.f13780f;
        s6 s6Var = ywVar.f13795s;
        long j11 = this.A;
        int i11 = 0;
        boolean z10 = j11 == j10;
        if (!z10 && this.f13723e != null) {
            s6Var.e0(j11, false);
            this.f13723e.a();
            this.f13723e = null;
        }
        this.A = j10;
        this.B = j10 == UserConfig.getInstance(i10).getClientUserId();
        this.C = s6Var.N(j10);
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f13724f = user;
            this.h = null;
            tLObject = user;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.h = chat;
            this.f13724f = null;
            tLObject = chat;
        }
        ImageReceiver imageReceiver = this.f13726r;
        if (tLObject == null) {
            this.f13730y.l("", false);
            imageReceiver.clearImage();
            return;
        }
        org.telegram.ui.Components.y8 y8Var = this.f13725n;
        y8Var.j(i10, tLObject);
        imageReceiver.setForUserOrChat(tLObject, y8Var);
        if (this.J) {
            return;
        }
        this.f13730y.i(null);
        if (s6Var.N(j10)) {
            this.f13730y.setTextSize(10);
            this.f13730y.l(LocaleController.getString(R.string.FailedStory), false);
            this.Q = false;
            return;
        }
        if (!Utilities.isNullOrEmpty(s6Var.E(j10))) {
            this.f13730y.setTextSize(10);
            l7.a(this.f13730y);
            this.Q = true;
            return;
        }
        HashMap map = (HashMap) s6Var.f13958e.f(j10);
        if (map == null || map.isEmpty()) {
            r6Var = null;
        } else {
            Collection collectionValues = map.values();
            if (collectionValues.isEmpty()) {
                r6Var = null;
            } else {
                r6Var = (r6) collectionValues.iterator().next();
            }
        }
        if (r6Var != null) {
            this.f13730y.setTextSize(10);
            l7.a(this.f13730y);
            this.Q = true;
            return;
        }
        if (this.B) {
            if (z10 && this.Q && !this.J) {
                org.telegram.ui.ActionBar.h5 h5Var = this.f13730y;
                b();
                ValueAnimator valueAnimator = ywVar.f13781f0;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    ywVar.f13781f0 = null;
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ywVar.f13781f0 = valueAnimatorOfFloat;
                int i12 = 4;
                valueAnimatorOfFloat.addUpdateListener(new ag.t2(i12, this, h5Var));
                ywVar.f13781f0.addListener(new ag.x1(i12, this, h5Var));
                ywVar.f13781f0.setDuration(150L);
                this.f13730y.setAlpha(0.0f);
                this.f13730y.setTranslationY(AndroidUtilities.dp(5.0f));
                ywVar.f13782g0 = new n(this, i11);
            }
            AndroidUtilities.runOnUIThread(ywVar.f13782g0, 500L);
            this.Q = false;
            this.f13730y.setTextSize(10);
            this.f13730y.l(LocaleController.getString(R.string.MyStory), false);
            return;
        }
        if (this.f13724f == null) {
            this.f13730y.setTextSize(11);
            this.f13730y.l(Emoji.replaceEmoji(this.h.title, this.f13730y.getPaint().getFontMetricsInt(), false), false);
            this.f13730y.i(null);
            return;
        }
        this.f13730y.setTextSize(11);
        String str = this.f13724f.first_name;
        String strTrim = str != null ? str.trim() : "";
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf > 0) {
            strTrim = strTrim.substring(0, iIndexOf);
        }
        if (!this.f13724f.verified) {
            this.f13730y.l(Emoji.replaceEmoji(strTrim, this.f13730y.getPaint().getFontMetricsInt(), false), false);
            this.f13730y.i(null);
            return;
        }
        if (this.O == null) {
            Drawable drawableMutate = ywVar.getContext().getDrawable(R.drawable.verified_area).mutate();
            Drawable drawableMutate2 = ywVar.getContext().getDrawable(R.drawable.verified_check).mutate();
            f fVar = new f(ywVar, drawableMutate, drawableMutate2, drawableMutate, drawableMutate2);
            fVar.f27828w = true;
            this.O = fVar;
        }
        this.f13730y.l(Emoji.replaceEmoji(strTrim, this.f13730y.getPaint().getFontMetricsInt(), false), false);
        this.f13730y.i(this.O);
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        h7 h7Var = this.K;
        if (z10 && h7Var.H == null) {
            h7Var.H = new nc(this, 1.5f, 5.0f);
        }
        nc ncVar = h7Var.H;
        if (ncVar != null) {
            ncVar.c(z10);
        }
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        if (this.J || (this.f13720a && getParent() != null)) {
            ViewParent parent = getParent();
            yw ywVar = this.U;
            h hVar = ywVar.f13793r;
            if (parent == hVar) {
                hVar.invalidate();
            }
            ywVar.invalidate();
        }
        super.invalidate(i10, i11, i12, i13);
    }
}
