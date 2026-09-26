package oh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import le.e;
import le.f;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.w9;
import org.telegram.ui.zg0;
import rg.a1;
import w7.q;
import w7.y5;
public final class b extends FrameLayout implements zg0, e {
    public static final RectF V = new RectF();
    public TLRPC.TL_attachMenuBot E;
    public final TextPaint F;
    public boolean G;
    public float H;
    public boolean I;
    public float J;
    public boolean K;
    public Drawable L;
    public boolean M;
    public boolean N;
    public int O;
    public long P;
    public boolean Q;
    public int R;
    public float S;
    public TextPaint T;
    public h9 U;
    public final TextView f15728a;
    public final lj0 f15729b;
    public w9 f15730c;
    public d6 d;
    public final Paint e;
    public final o6 f15731f;
    public final le.c h;
    public final le.c f15732n;
    public final le.c f15733r;
    public int f15734s;
    public int v;
    public int f15735w;
    public boolean f15736x;
    public a f15737y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new le.c(0, this, ke.a.f13575a, 320L, false);
        rr rrVar = rr.h;
        this.f15732n = new le.c(1, this, rrVar, 380L, false);
        this.f15733r = new le.c(2, this, rrVar, 380L, false);
        this.S = 1.0f;
        ?? imageView = new ImageView(context);
        this.f15729b = imageView;
        addView((View) imageView, y5.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f15728a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, y5.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        o6 o6Var = new o6(false, false, false, false);
        this.f15731f = o6Var;
        o6Var.u(AndroidUtilities.bold());
        o6Var.setCallback(this);
        o6Var.f26929b = 17;
        o6Var.r(-1);
        o6Var.t(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, d6 d6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = d6Var;
        bVar.f15737y = aVar;
        bVar.f15728a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.f15729b.setLayoutParams(y5.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f15735w = h6.v0(h6.cl, d6Var);
        bVar.f15734s = h6.v0(h6.al, d6Var);
        bVar.v = h6.v0(h6.bl, d6Var);
        bVar.f();
        return bVar;
    }

    @Override
    public final void D(int i10, float f7, float f10, f fVar) {
        if (i10 == 0) {
            f();
        }
        invalidate();
    }

    public final void a(boolean z10) {
        int i10;
        boolean z11;
        TLRPC.Document document;
        boolean z12 = this.h.f14201f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.E;
        SvgHelper.SvgDrawable svgDrawable = null;
        boolean z13 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tL_attachMenuBot, z12);
            if (animatedAttachMenuBotIcon == null) {
                animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(this.E);
                z13 = false;
            }
            if (animatedAttachMenuBotIcon != null && (document = animatedAttachMenuBotIcon.icon) != null) {
                if (this.P != document.f18341id) {
                    w9 w9Var = this.f15730c;
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                    if (!z13) {
                        svgDrawable = DocumentObject.getSvgThumb(document, h6.f19003a7, 1.0f);
                    }
                    w9Var.l(forDocument, "24_24_lastframe", forDocument2, "24_24_lastframe", svgDrawable, this.E);
                    this.P = document.f18341id;
                }
            } else {
                this.f15730c.b();
            }
            f();
            return;
        }
        a aVar = this.f15737y;
        if (aVar != null) {
            int i11 = aVar.f15726b;
            int i12 = aVar.f15725a;
            int i13 = aVar.f15727c;
            lj0 lj0Var = this.f15729b;
            if (i13 != -1) {
                lj0Var.setImageResource(i13);
                f();
                return;
            }
            if (z12) {
                i10 = i12;
            } else {
                i10 = i11;
            }
            if (aVar.d != -1) {
                if (this.N != z12) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (this.O != i10) {
                    this.O = i10;
                    lj0Var.f(i10, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    ij0 animatedDrawable = lj0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.P(this.f15737y.d);
                            if (animatedDrawable.f25068a0 >= this.f15737y.e - 2) {
                                animatedDrawable.N(0, false, false);
                            }
                            int i14 = animatedDrawable.f25068a0;
                            int i15 = this.f15737y.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.M(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.f25068a0;
                            a aVar2 = this.f15737y;
                            if (i16 >= aVar2.d - 1) {
                                animatedDrawable.P(aVar2.e - 1);
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.P(0);
                                animatedDrawable.M(0);
                            }
                        }
                    } else {
                        return;
                    }
                }
                this.N = z12;
            } else if (i12 != i11) {
                if (this.O != i10) {
                    this.O = i10;
                    lj0Var.f(i10, 24, 24, null);
                    lj0Var.getAnimatedDrawable().h = false;
                    if (z10) {
                        lj0Var.getAnimatedDrawable().M(0);
                        lj0Var.d();
                        return;
                    }
                    lj0Var.getAnimatedDrawable().T(0.99f, true);
                }
            } else {
                if (lj0Var.getAnimatedDrawable() == null) {
                    lj0Var.f(this.f15737y.f15725a, 24, 24, null);
                }
                ij0 animatedDrawable2 = lj0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.e;
                    if (this.N != z12) {
                        this.N = z12;
                        if (z12) {
                            animatedDrawable2.h = false;
                            animatedDrawable2.M(0);
                            animatedDrawable2.P(iArr[0]);
                        } else {
                            animatedDrawable2.h = true;
                            animatedDrawable2.M(iArr[0]);
                            animatedDrawable2.P(0);
                        }
                        lj0Var.d();
                    }
                }
            }
        }
    }

    public final float c() {
        float measureText = this.F.measureText(this.f15728a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), q.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f15731f.q(str, z11, true);
        this.f15732n.a(!TextUtils.isEmpty(str), z11);
        this.f15733r.a(z10, z11);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width;
        float f7;
        boolean z10;
        if (this.G) {
            width = this.H;
        } else {
            width = getWidth();
        }
        float f10 = width;
        if (this.I) {
            f7 = this.J;
        } else {
            f7 = this.h.e;
        }
        RectF rectF = V;
        float f11 = 1.0f;
        Paint paint = this.e;
        if (f7 > 0.0f && !this.K) {
            paint.setColor(h6.l1(ke.a.f13575a.getInterpolation(f7) * 0.09f, this.f15734s));
            rectF.set(0.0f, 0.0f, f10, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = q.a(this.S, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f7);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f15736x) {
            f11 = this.f15732n.e;
        }
        float f12 = f11 * this.S;
        int i10 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, f10, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (i10 > 0) {
            canvas.save();
            float dpf2 = AndroidUtilities.dpf2(1.33f);
            float dpf22 = AndroidUtilities.dpf2(11.0f) + (f10 / 2.0f);
            float dpf23 = AndroidUtilities.dpf2(10.0f);
            float dpf24 = AndroidUtilities.dpf2(16.0f);
            o6 o6Var = this.f15731f;
            float max = Math.max(dpf24, o6Var.d() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f13 = max / 2.0f;
            float f14 = dpf24 / 2.0f;
            rectF.set((dpf22 - f13) - dpf2, (dpf23 - f14) - dpf2, f13 + dpf22 + dpf2, f14 + dpf23 + dpf2);
            canvas.scale(f12, f12, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, h6.Il);
            rectF.inset(dpf2, dpf2);
            if (this.f15736x) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                a1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, a1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.L.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.L.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.f15733r.e, h6.w0(null, h6.hl, false), h6.w0(null, h6.f19317r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
                o6Var.m(rectF);
                o6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z10) {
            canvas.restore();
        }
    }

    public final void e(boolean z10, boolean z11) {
        Typeface bold;
        this.h.a(z10, z11);
        a(z11);
        if (z10) {
            bold = AndroidUtilities.getTypeface("fonts/rextrabold.ttf");
        } else {
            bold = AndroidUtilities.bold();
        }
        this.f15728a.setTypeface(bold);
    }

    public final void f() {
        int i10 = this.f15735w;
        int i11 = this.f15734s;
        le.c cVar = this.h;
        int d = i0.a.d(cVar.e, i10, i11);
        int d10 = i0.a.d(cVar.e, this.f15735w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        w9 w9Var = this.f15730c;
        if (w9Var != null && this.M) {
            w9Var.setColorFilter(porterDuffColorFilter);
            this.f15730c.invalidate();
        }
        this.f15729b.setColorFilter(porterDuffColorFilter);
        this.f15728a.setTextColor(d10);
    }

    public w9 getBackupImageView() {
        return this.f15730c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.Q) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) c()) + this.R, 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.G) {
            float measuredWidth = (this.H - getMeasuredWidth()) / 2.0f;
            this.f15729b.setTranslationX(measuredWidth);
            this.f15728a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setAttachScale(float f7) {
        TextView textView = this.f15728a;
        textView.setScaleX(f7);
        textView.setScaleY(f7);
        lj0 lj0Var = this.f15729b;
        lj0Var.setScaleX(f7);
        lj0Var.setScaleY(f7);
        w9 w9Var = this.f15730c;
        if (w9Var != null) {
            w9Var.setScaleX(f7);
            this.f15730c.setScaleY(f7);
        }
        this.S = f7;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f15736x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.f15737y = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
        this.f15729b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.f15728a.setText(charSequence);
    }

    public void setTextSizeDp(float f7) {
        float dp = AndroidUtilities.dp(f7);
        TextView textView = this.f15728a;
        if (textView.getTextSize() != dp) {
            textView.setTextSize(1, f7);
            this.F.setTextSize(dp);
        }
    }

    public void setVisualWidth(float f7) {
        this.G = true;
        if (this.H != f7) {
            this.H = f7;
            float measuredWidth = (f7 - getMeasuredWidth()) / 2.0f;
            this.f15729b.setTranslationX(measuredWidth);
            this.f15728a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void C(float f7, int i10) {
    }
}
