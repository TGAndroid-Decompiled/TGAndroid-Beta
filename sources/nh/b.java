package nh;

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
import le.d;
import le.e;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.wr;
import org.telegram.ui.gh0;
import qg.d1;
import w7.a6;
import w7.q;
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
    public g9 U;
    public final TextView f14059a;
    public final kj0 f14060b;
    public w9 f14061c;
    public f6 d;
    public final Paint e;
    public final n6 f14062f;
    public final le.b h;
    public final le.b f14063n;
    public final le.b f14064r;
    public int f14065s;
    public int v;
    public int f14066w;
    public boolean f14067x;
    public a f14068y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new le.b(0, this, ke.a.f12431a, 320L, false);
        wr wrVar = wr.h;
        this.f14063n = new le.b(1, this, wrVar, 380L, false);
        this.f14064r = new le.b(2, this, wrVar, 380L, false);
        this.S = 1.0f;
        ?? imageView = new ImageView(context);
        this.f14060b = imageView;
        addView((View) imageView, a6.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f14059a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.F = new TextPaint(textView.getPaint());
        addView(textView, a6.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        n6 n6Var = new n6(false, false, false, false);
        this.f14062f = n6Var;
        n6Var.u(AndroidUtilities.bold());
        n6Var.setCallback(this);
        n6Var.f25425b = 17;
        n6Var.r(-1);
        n6Var.t(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, f6 f6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = f6Var;
        bVar.f14068y = aVar;
        bVar.f14059a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.f14060b.setLayoutParams(a6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f14066w = j6.v0(j6.cl, f6Var);
        bVar.f14065s = j6.v0(j6.al, f6Var);
        bVar.v = j6.v0(j6.bl, f6Var);
        bVar.f();
        return bVar;
    }

    @Override
    public final void G(int i10, float f7, float f10, e eVar) {
        if (i10 == 0) {
            f();
        }
        invalidate();
    }

    public final void a(boolean z10) {
        int i10;
        boolean z11;
        TLRPC.Document document;
        boolean z12 = this.h.f12870f;
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
                if (this.P != document.f17201id) {
                    w9 w9Var = this.f14061c;
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                    if (!z13) {
                        svgDrawable = DocumentObject.getSvgThumb(document, j6.f17872a7, 1.0f);
                    }
                    w9Var.l(forDocument, "24_24_lastframe", forDocument2, "24_24_lastframe", svgDrawable, this.E);
                    this.P = document.f17201id;
                }
            } else {
                this.f14061c.b();
            }
            f();
            return;
        }
        a aVar = this.f14068y;
        if (aVar != null) {
            int i11 = aVar.f14057b;
            int i12 = aVar.f14056a;
            int i13 = aVar.f14058c;
            kj0 kj0Var = this.f14060b;
            if (i13 != -1) {
                kj0Var.setImageResource(i13);
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
                    kj0Var.f(i10, 24, 24, null);
                    z11 = true;
                }
                if (z11) {
                    hj0 animatedDrawable = kj0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z12) {
                            animatedDrawable.P(this.f14068y.d);
                            if (animatedDrawable.f23648b0 >= this.f14068y.e - 2) {
                                animatedDrawable.N(0, false, false);
                            }
                            int i14 = animatedDrawable.f23648b0;
                            int i15 = this.f14068y.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.M(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.f23648b0;
                            a aVar2 = this.f14068y;
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
                    kj0Var.f(i10, 24, 24, null);
                    kj0Var.getAnimatedDrawable().h = false;
                    if (z10) {
                        kj0Var.getAnimatedDrawable().M(0);
                        kj0Var.d();
                        return;
                    }
                    kj0Var.getAnimatedDrawable().S(0.99f, true);
                }
            } else {
                if (kj0Var.getAnimatedDrawable() == null) {
                    kj0Var.f(this.f14068y.f14056a, 24, 24, null);
                }
                hj0 animatedDrawable2 = kj0Var.getAnimatedDrawable();
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
                        kj0Var.d();
                    }
                }
            }
        }
    }

    public final float c() {
        float measureText = this.F.measureText(this.f14059a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), q.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z10, boolean z11) {
        this.f14062f.q(str, z11, true);
        this.f14063n.a(!TextUtils.isEmpty(str), z11);
        this.f14064r.a(z10, z11);
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
            paint.setColor(j6.l1(ke.a.f12431a.getInterpolation(f7) * 0.09f, this.f14065s));
            rectF.set(0.0f, 0.0f, f10, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = q.a(this.S, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f7);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f14067x) {
            f11 = this.f14063n.e;
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
            n6 n6Var = this.f14062f;
            float max = Math.max(dpf24, n6Var.d() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f13 = max / 2.0f;
            float f14 = dpf24 / 2.0f;
            rectF.set((dpf22 - f13) - dpf2, (dpf23 - f14) - dpf2, f13 + dpf22 + dpf2, f14 + dpf23 + dpf2);
            canvas.scale(f12, f12, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, j6.Il);
            rectF.inset(dpf2, dpf2);
            if (this.f14067x) {
                if (this.L == null) {
                    this.L = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                d1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, d1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.L.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.L.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.f14064r.e, j6.w0(null, j6.hl, false), j6.w0(null, j6.f18181r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
                n6Var.m(rectF);
                n6Var.draw(canvas);
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
        this.f14059a.setTypeface(bold);
    }

    public final void f() {
        int i10 = this.f14066w;
        int i11 = this.f14065s;
        le.b bVar = this.h;
        int d = i0.a.d(bVar.e, i10, i11);
        int d10 = i0.a.d(bVar.e, this.f14066w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        w9 w9Var = this.f14061c;
        if (w9Var != null && this.M) {
            w9Var.setColorFilter(porterDuffColorFilter);
            this.f14061c.invalidate();
        }
        this.f14060b.setColorFilter(porterDuffColorFilter);
        this.f14059a.setTextColor(d10);
    }

    public w9 getBackupImageView() {
        return this.f14061c;
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
            this.f14060b.setTranslationX(measuredWidth);
            this.f14059a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.R = i10;
        this.Q = true;
    }

    public void setAttachScale(float f7) {
        TextView textView = this.f14059a;
        textView.setScaleX(f7);
        textView.setScaleY(f7);
        kj0 kj0Var = this.f14060b;
        kj0Var.setScaleX(f7);
        kj0Var.setScaleY(f7);
        w9 w9Var = this.f14061c;
        if (w9Var != null) {
            w9Var.setScaleX(f7);
            this.f14061c.setScaleY(f7);
        }
        this.S = f7;
        invalidate();
    }

    public void setPremiumBadge(boolean z10) {
        this.f14067x = z10;
    }

    public void setSkipDrawSelector(boolean z10) {
        if (this.K != z10) {
            this.K = z10;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.f14068y = aVar;
        this.E = null;
        this.O = 0;
        this.P = 0L;
        this.f14060b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.f14059a.setText(charSequence);
    }

    public void setTextSizeDp(float f7) {
        float dp = AndroidUtilities.dp(f7);
        TextView textView = this.f14059a;
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
            this.f14060b.setTranslationX(measuredWidth);
            this.f14059a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void B(float f7, int i10) {
    }
}
