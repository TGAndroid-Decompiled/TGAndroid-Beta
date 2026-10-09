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
import me.d;
import me.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.y9;
import org.telegram.ui.gh0;
import rg.b1;
import w7.o;
import w7.x5;
public final class b extends FrameLayout implements gh0, d {
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
    public j9 U;
    public final TextView f17139a;
    public final fk0 f17140b;
    public y9 f17141c;
    public e6 d;
    public final Paint f17142e;
    public final q6 f17143f;
    public final me.b h;
    public final me.b f17144n;
    public final me.b f17145r;
    public int f17146s;
    public int v;
    public int f17147w;
    public boolean f17148x;
    public a f17149y;

    public b(Context context) {
        super(context);
        this.f17142e = new Paint(1);
        this.h = new me.b(0, this, le.a.f15501a, 320L, false);
        hs hsVar = hs.h;
        this.f17144n = new me.b(1, this, hsVar, 380L, false);
        this.f17145r = new me.b(2, this, hsVar, 380L, false);
        this.S = 1.0f;
        ?? imageView = new ImageView(context);
        this.f17140b = imageView;
        addView((View) imageView, x5.a(44.0f, 0.0f, -6.0f, 0.0f, 0.0f, 44, 49));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f17139a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, x5.a(-2.0f, 0.0f, 28.33f, 0.0f, 0.0f, -1, 49));
        q6 q6Var = new q6(false, false, false);
        this.f17143f = q6Var;
        q6Var.x(AndroidUtilities.bold());
        q6Var.setCallback(this);
        q6Var.f30065b = 17;
        q6Var.u(-1);
        q6Var.w(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, e6 e6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = e6Var;
        bVar.f17149y = aVar;
        bVar.f17139a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.f17140b.setLayoutParams(x5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.f17147w = i6.w0(i6.cl, e6Var);
        bVar.f17146s = i6.w0(i6.al, e6Var);
        bVar.v = i6.w0(i6.bl, e6Var);
        bVar.f();
        return bVar;
    }

    public final void a(boolean z10) {
        int i10;
        boolean z11;
        TLRPC.Document document;
        boolean z12 = this.h.f16338f;
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
                if (this.P != document.f20044id) {
                    y9 y9Var = this.f17141c;
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                    if (!z13) {
                        svgDrawable = DocumentObject.getSvgThumb(document, i6.f20741a7, 1.0f);
                    }
                    y9Var.l(forDocument, "24_24_lastframe", forDocument2, "24_24_lastframe", svgDrawable, this.E);
                    this.P = document.f20044id;
                }
            } else {
                this.f17141c.b();
            }
            f();
            return;
        }
        a aVar = this.f17149y;
        if (aVar != null) {
            int i11 = aVar.f17136b;
            int i12 = aVar.f17135a;
            int i13 = aVar.f17137c;
            fk0 fk0Var = this.f17140b;
            if (i13 != -1) {
                fk0Var.setImageResource(i13);
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
                    fk0Var.f(i10, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    ck0 animatedDrawable = fk0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.P(this.f17149y.d);
                            if (animatedDrawable.f25395a0 >= this.f17149y.f17138e - 2) {
                                animatedDrawable.N(0, false, false);
                            }
                            int i14 = animatedDrawable.f25395a0;
                            int i15 = this.f17149y.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.M(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.f25395a0;
                            a aVar2 = this.f17149y;
                            if (i16 >= aVar2.d - 1) {
                                animatedDrawable.P(aVar2.f17138e - 1);
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
                    fk0Var.f(i10, 24, 24, null);
                    fk0Var.getAnimatedDrawable().h = false;
                    if (z10) {
                        fk0Var.getAnimatedDrawable().M(0);
                        fk0Var.d();
                        return;
                    }
                    fk0Var.getAnimatedDrawable().T(0.99f, true);
                }
            } else {
                if (fk0Var.getAnimatedDrawable() == null) {
                    fk0Var.f(this.f17149y.f17135a, 24, 24, null);
                }
                ck0 animatedDrawable2 = fk0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.f25401e;
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
                        fk0Var.d();
                    }
                }
            }
        }
    }

    public final float c() {
        float measureText = this.F.measureText(this.f17139a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), o.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f17143f.t(str, z11, true);
        this.f17144n.a(!TextUtils.isEmpty(str), z11);
        this.f17145r.a(z10, z11);
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
            f7 = this.h.f16337e;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        RectF rectF = V;
        float f11 = 1.0f;
        Paint paint = this.f17142e;
        if (i10 > 0 && !this.K) {
            paint.setColor(i6.m1(le.a.f15501a.getInterpolation(f7) * 0.09f, this.f17146s));
            rectF.set(0.0f, 0.0f, f10, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = o.a(this.S, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f7);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f17148x) {
            f11 = this.f17144n.f16337e;
        }
        float f12 = f11 * this.S;
        int i11 = (f12 > 0.0f ? 1 : (f12 == 0.0f ? 0 : -1));
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            canvas.saveLayer(0.0f, 0.0f, f10, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (i11 > 0) {
            canvas.save();
            float dpf2 = AndroidUtilities.dpf2(1.33f);
            float dpf22 = AndroidUtilities.dpf2(11.0f) + (f10 / 2.0f);
            float dpf23 = AndroidUtilities.dpf2(10.0f);
            float dpf24 = AndroidUtilities.dpf2(16.0f);
            q6 q6Var = this.f17143f;
            float max = Math.max(dpf24, q6Var.c() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f13 = max / 2.0f;
            float f14 = dpf24 / 2.0f;
            rectF.set((dpf22 - f13) - dpf2, (dpf23 - f14) - dpf2, f13 + dpf22 + dpf2, f14 + dpf23 + dpf2);
            canvas.scale(f12, f12, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, i6.Ll);
            rectF.inset(dpf2, dpf2);
            if (this.f17148x) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                b1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, b1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.L.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.L.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.f17145r.f16337e, i6.x0(null, i6.hl, false), i6.x0(null, i6.f21056r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
                q6Var.p(rectF);
                q6Var.draw(canvas);
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
        this.f17139a.setTypeface(bold);
    }

    public final void f() {
        int i10 = this.f17147w;
        int i11 = this.f17146s;
        me.b bVar = this.h;
        int d = i0.a.d(bVar.f16337e, i10, i11);
        int d10 = i0.a.d(bVar.f16337e, this.f17147w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        y9 y9Var = this.f17141c;
        if (y9Var != null && this.M) {
            y9Var.setColorFilter(porterDuffColorFilter);
            this.f17141c.invalidate();
        }
        this.f17140b.setColorFilter(porterDuffColorFilter);
        this.f17139a.setTextColor(d10);
    }

    public y9 getBackupImageView() {
        return this.f17141c;
    }

    @Override
    public final void n(int i10, float f7, float f10, e eVar) {
        if (i10 == 0) {
            f();
        }
        invalidate();
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
            this.f17140b.setTranslationX(measuredWidth);
            this.f17139a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setAttachScale(float f7) {
        TextView textView = this.f17139a;
        textView.setScaleX(f7);
        textView.setScaleY(f7);
        fk0 fk0Var = this.f17140b;
        fk0Var.setScaleX(f7);
        fk0Var.setScaleY(f7);
        y9 y9Var = this.f17141c;
        if (y9Var != null) {
            y9Var.setScaleX(f7);
            this.f17141c.setScaleY(f7);
        }
        this.S = f7;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f17148x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.f17149y = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
        this.f17140b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.f17139a.setText(charSequence);
    }

    public void setTextSizeDp(float f7) {
        float dp = AndroidUtilities.dp(f7);
        TextView textView = this.f17139a;
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
            this.f17140b.setTranslationX(measuredWidth);
            this.f17139a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
