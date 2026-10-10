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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.gk0;
import org.telegram.ui.Components.is;
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
    public final TextView f17143a;
    public final gk0 f17144b;
    public y9 f17145c;
    public e6 d;
    public final Paint f17146e;
    public final q6 f17147f;
    public final me.b h;
    public final me.b f17148n;
    public final me.b f17149r;
    public int f17150s;
    public int v;
    public int f17151w;
    public boolean f17152x;
    public a f17153y;

    public b(Context context) {
        super(context);
        this.f17146e = new Paint(1);
        this.h = new me.b(0, this, le.a.f15505a, 320L, false);
        is isVar = is.h;
        this.f17148n = new me.b(1, this, isVar, 380L, false);
        this.f17149r = new me.b(2, this, isVar, 380L, false);
        this.S = 1.0f;
        ?? imageView = new ImageView(context);
        this.f17144b = imageView;
        addView((View) imageView, x5.a(44.0f, 0.0f, -6.0f, 0.0f, 0.0f, 44, 49));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f17143a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, x5.a(-2.0f, 0.0f, 28.33f, 0.0f, 0.0f, -1, 49));
        q6 q6Var = new q6(false, false, false);
        this.f17147f = q6Var;
        q6Var.x(AndroidUtilities.bold());
        q6Var.setCallback(this);
        q6Var.f30031b = 17;
        q6Var.u(-1);
        q6Var.w(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, e6 e6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = e6Var;
        bVar.f17153y = aVar;
        bVar.f17143a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.f17144b.setLayoutParams(x5.a(24.0f, 0.0f, 4.0f, 0.0f, 0.0f, 24, 49));
        bVar.f17151w = i6.w0(i6.cl, e6Var);
        bVar.f17150s = i6.w0(i6.al, e6Var);
        bVar.v = i6.w0(i6.bl, e6Var);
        bVar.f();
        return bVar;
    }

    public final void a(boolean z10) {
        int i10;
        boolean z11;
        TLRPC.Document document;
        boolean z12 = this.h.f16342f;
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
                if (this.P != document.f20048id) {
                    y9 y9Var = this.f17145c;
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                    if (!z13) {
                        svgDrawable = DocumentObject.getSvgThumb(document, i6.f20745a7, 1.0f);
                    }
                    y9Var.l(forDocument, "24_24_lastframe", forDocument2, "24_24_lastframe", svgDrawable, this.E);
                    this.P = document.f20048id;
                }
            } else {
                this.f17145c.b();
            }
            f();
            return;
        }
        a aVar = this.f17153y;
        if (aVar != null) {
            int i11 = aVar.f17140b;
            int i12 = aVar.f17139a;
            int i13 = aVar.f17141c;
            gk0 gk0Var = this.f17144b;
            if (i13 != -1) {
                gk0Var.setImageResource(i13);
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
                    gk0Var.f(i10, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    dk0 animatedDrawable = gk0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.P(this.f17153y.d);
                            if (animatedDrawable.f25726a0 >= this.f17153y.f17142e - 2) {
                                animatedDrawable.N(0, false, false);
                            }
                            int i14 = animatedDrawable.f25726a0;
                            int i15 = this.f17153y.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.M(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.f25726a0;
                            a aVar2 = this.f17153y;
                            if (i16 >= aVar2.d - 1) {
                                animatedDrawable.P(aVar2.f17142e - 1);
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
                    gk0Var.f(i10, 24, 24, null);
                    gk0Var.getAnimatedDrawable().h = false;
                    if (z10) {
                        gk0Var.getAnimatedDrawable().M(0);
                        gk0Var.d();
                        return;
                    }
                    gk0Var.getAnimatedDrawable().T(0.99f, true);
                }
            } else {
                if (gk0Var.getAnimatedDrawable() == null) {
                    gk0Var.f(this.f17153y.f17139a, 24, 24, null);
                }
                dk0 animatedDrawable2 = gk0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.f25732e;
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
                        gk0Var.d();
                    }
                }
            }
        }
    }

    public final float c() {
        float measureText = this.F.measureText(this.f17143a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), o.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f17147f.t(str, z11, true);
        this.f17148n.a(!TextUtils.isEmpty(str), z11);
        this.f17149r.a(z10, z11);
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
            f7 = this.h.f16341e;
        }
        int i10 = (f7 > 0.0f ? 1 : (f7 == 0.0f ? 0 : -1));
        RectF rectF = V;
        float f11 = 1.0f;
        Paint paint = this.f17146e;
        if (i10 > 0 && !this.K) {
            paint.setColor(i6.m1(le.a.f15505a.getInterpolation(f7) * 0.09f, this.f17150s));
            rectF.set(0.0f, 0.0f, f10, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = o.a(this.S, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f7);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f17152x) {
            f11 = this.f17148n.f16341e;
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
            q6 q6Var = this.f17147f;
            float max = Math.max(dpf24, q6Var.c() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f13 = max / 2.0f;
            float f14 = dpf24 / 2.0f;
            rectF.set((dpf22 - f13) - dpf2, (dpf23 - f14) - dpf2, f13 + dpf22 + dpf2, f14 + dpf23 + dpf2);
            canvas.scale(f12, f12, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, i6.Ll);
            rectF.inset(dpf2, dpf2);
            if (this.f17152x) {
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
                paint.setColor(i0.a.d(this.f17149r.f16341e, i6.x0(null, i6.hl, false), i6.x0(null, i6.f21060r7, false)));
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
        this.f17143a.setTypeface(bold);
    }

    public final void f() {
        int i10 = this.f17151w;
        int i11 = this.f17150s;
        me.b bVar = this.h;
        int d = i0.a.d(bVar.f16341e, i10, i11);
        int d10 = i0.a.d(bVar.f16341e, this.f17151w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        y9 y9Var = this.f17145c;
        if (y9Var != null && this.M) {
            y9Var.setColorFilter(porterDuffColorFilter);
            this.f17145c.invalidate();
        }
        this.f17144b.setColorFilter(porterDuffColorFilter);
        this.f17143a.setTextColor(d10);
    }

    public y9 getBackupImageView() {
        return this.f17145c;
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
            this.f17144b.setTranslationX(measuredWidth);
            this.f17143a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setAttachScale(float f7) {
        TextView textView = this.f17143a;
        textView.setScaleX(f7);
        textView.setScaleY(f7);
        gk0 gk0Var = this.f17144b;
        gk0Var.setScaleX(f7);
        gk0Var.setScaleY(f7);
        y9 y9Var = this.f17145c;
        if (y9Var != null) {
            y9Var.setScaleX(f7);
            this.f17145c.setScaleY(f7);
        }
        this.S = f7;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f17152x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.f17153y = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
        this.f17144b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.f17143a.setText(charSequence);
    }

    public void setTextSizeDp(float f7) {
        float dp = AndroidUtilities.dp(f7);
        TextView textView = this.f17143a;
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
            this.f17144b.setTranslationX(measuredWidth);
            this.f17143a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void A(float f7, int i10) {
    }
}
