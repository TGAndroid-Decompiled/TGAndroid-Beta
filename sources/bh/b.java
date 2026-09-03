package bh;

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
import eg.r1;
import k7.b6;
import k7.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.yg0;
public final class b extends FrameLayout implements yg0, xd.b {
    public static final RectF S = new RectF();
    public TLRPC.TL_attachMenuBot B;
    public final TextPaint C;
    public boolean D;
    public float E;
    public boolean F;
    public float G;
    public boolean H;
    public Drawable I;
    public boolean J;
    public boolean K;
    public int L;
    public long M;
    public boolean N;
    public int O;
    public float P;
    public TextPaint Q;
    public z8 R;
    public final TextView f1843a;
    public final jj0 f1844b;
    public p9 f1845c;
    public f6 d;
    public final Paint e;
    public final j6 f1846f;
    public final xd.a h;
    public final xd.a f1847n;
    public final xd.a f1848r;
    public int f1849s;
    public int v;
    public int f1850w;
    public boolean f1851x;
    public a f1852y;

    public b(Context context) {
        super(context);
        this.e = new Paint(1);
        this.h = new xd.a(0, this, wd.a.f46596a, 320L, false);
        mr mrVar = mr.h;
        this.f1847n = new xd.a(1, this, mrVar, 380L, false);
        this.f1848r = new xd.a(2, this, mrVar, 380L, false);
        this.P = 1.0f;
        ?? imageView = new ImageView(context);
        this.f1844b = imageView;
        addView((View) imageView, b6.d(44, 44.0f, 49, 0.0f, -6.0f, 0.0f, 0.0f));
        imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
        TextView textView = new TextView(context);
        this.f1843a = textView;
        textView.setTextSize(1, 12.0f);
        textView.setSingleLine();
        textView.setLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        this.C = new TextPaint(textView.getPaint());
        addView(textView, b6.d(-1, -2.0f, 49, 0.0f, 28.33f, 0.0f, 0.0f));
        j6 j6Var = new j6(false, false, false, false);
        this.f1846f = j6Var;
        j6Var.u(AndroidUtilities.bold());
        j6Var.setCallback(this);
        j6Var.f25847b = 17;
        j6Var.r(-1);
        j6Var.t(AndroidUtilities.dp(10.0f));
    }

    public static b b(Context context, f6 f6Var, a aVar, int i10) {
        b bVar = new b(context);
        bVar.d = f6Var;
        bVar.f1852y = aVar;
        bVar.f1843a.setText(LocaleController.getString(i10));
        bVar.a(false);
        bVar.f1844b.setLayoutParams(b6.d(24, 24.0f, 49, 0.0f, 4.0f, 0.0f, 0.0f));
        bVar.f1850w = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.cl, f6Var);
        bVar.f1849s = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.al, f6Var);
        bVar.v = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.bl, f6Var);
        bVar.f();
        return bVar;
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        if (i10 == 0) {
            f();
        }
        invalidate();
    }

    public final void a(boolean z4) {
        int i10;
        boolean z10;
        TLRPC.Document document;
        boolean z11 = this.h.f46961f;
        TLRPC.TL_attachMenuBot tL_attachMenuBot = this.B;
        SvgHelper.SvgDrawable svgDrawable = null;
        boolean z12 = true;
        if (tL_attachMenuBot != null) {
            TLRPC.TL_attachMenuBotIcon animatedAttachMenuBotIcon = MediaDataController.getAnimatedAttachMenuBotIcon(tL_attachMenuBot, z11);
            if (animatedAttachMenuBotIcon == null) {
                animatedAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(this.B);
                z12 = false;
            }
            if (animatedAttachMenuBotIcon != null && (document = animatedAttachMenuBotIcon.icon) != null) {
                if (this.M != document.f19165id) {
                    p9 p9Var = this.f1845c;
                    ImageLocation forDocument = ImageLocation.getForDocument(document);
                    ImageLocation forDocument2 = ImageLocation.getForDocument(document);
                    if (!z12) {
                        svgDrawable = DocumentObject.getSvgThumb(document, org.telegram.ui.ActionBar.j6.f19827a7, 1.0f);
                    }
                    p9Var.l(forDocument, "24_24_lastframe", forDocument2, "24_24_lastframe", svgDrawable, this.B);
                    this.M = document.f19165id;
                }
            } else {
                this.f1845c.b();
            }
            f();
            return;
        }
        a aVar = this.f1852y;
        if (aVar != null) {
            int i11 = aVar.f1841b;
            int i12 = aVar.f1840a;
            int i13 = aVar.f1842c;
            jj0 jj0Var = this.f1844b;
            if (i13 != -1) {
                jj0Var.setImageResource(i13);
                f();
                return;
            }
            if (z11) {
                i10 = i12;
            } else {
                i10 = i11;
            }
            if (aVar.d != -1) {
                if (this.K != z11) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (this.L != i10) {
                    this.L = i10;
                    jj0Var.f(i10, 24, 24, null);
                    z10 = true;
                }
                if (z10) {
                    gj0 animatedDrawable = jj0Var.getAnimatedDrawable();
                    if (animatedDrawable != null) {
                        if (z11) {
                            animatedDrawable.N(this.f1852y.d);
                            if (animatedDrawable.Y >= this.f1852y.e - 2) {
                                animatedDrawable.L(0, false, false);
                            }
                            int i14 = animatedDrawable.Y;
                            int i15 = this.f1852y.d;
                            if (i14 <= i15) {
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.K(i15);
                            }
                        } else {
                            int i16 = animatedDrawable.Y;
                            a aVar2 = this.f1852y;
                            if (i16 >= aVar2.d - 1) {
                                animatedDrawable.N(aVar2.e - 1);
                                animatedDrawable.start();
                            } else {
                                animatedDrawable.N(0);
                                animatedDrawable.K(0);
                            }
                        }
                    } else {
                        return;
                    }
                }
                this.K = z11;
            } else if (i12 != i11) {
                if (this.L != i10) {
                    this.L = i10;
                    jj0Var.f(i10, 24, 24, null);
                    jj0Var.getAnimatedDrawable().h = false;
                    if (z4) {
                        jj0Var.getAnimatedDrawable().K(0);
                        jj0Var.d();
                        return;
                    }
                    jj0Var.getAnimatedDrawable().Q(0.99f, true);
                }
            } else {
                if (jj0Var.getAnimatedDrawable() == null) {
                    jj0Var.f(this.f1852y.f1840a, 24, 24, null);
                }
                gj0 animatedDrawable2 = jj0Var.getAnimatedDrawable();
                if (animatedDrawable2 != null) {
                    int[] iArr = animatedDrawable2.e;
                    if (this.K != z11) {
                        this.K = z11;
                        if (z11) {
                            animatedDrawable2.h = false;
                            animatedDrawable2.K(0);
                            animatedDrawable2.N(iArr[0]);
                        } else {
                            animatedDrawable2.h = true;
                            animatedDrawable2.K(iArr[0]);
                            animatedDrawable2.N(0);
                        }
                        jj0Var.d();
                    }
                }
            }
        }
    }

    public final float c() {
        float measureText = this.C.measureText(this.f1843a.getText().toString());
        return Math.min(AndroidUtilities.dp(84.0f), (int) ((AndroidUtilities.lerp(AndroidUtilities.dpf2(16.0f), AndroidUtilities.dp(8.0f), n.a((measureText - AndroidUtilities.dp(40.0f)) / AndroidUtilities.dp(16.0f), 0.0f, 1.0f)) * 2.0f) + measureText));
    }

    public final void d(String str, boolean z4, boolean z10) {
        this.f1846f.q(str, z10, true);
        this.f1847n.a(!TextUtils.isEmpty(str), z10);
        this.f1848r.a(z4, z10);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float width;
        float f10;
        boolean z4;
        if (this.D) {
            width = this.E;
        } else {
            width = getWidth();
        }
        float f11 = width;
        if (this.F) {
            f10 = this.G;
        } else {
            f10 = this.h.e;
        }
        RectF rectF = S;
        float f12 = 1.0f;
        Paint paint = this.e;
        if (f10 > 0.0f && !this.H) {
            paint.setColor(org.telegram.ui.ActionBar.j6.l1(wd.a.f46596a.getInterpolation(f10) * 0.09f, this.f1849s));
            rectF.set(0.0f, 0.0f, f11, getHeight());
            float min = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float a2 = n.a(this.P, 0.0f, 1.0f) * AndroidUtilities.lerp(0.6f, 1.0f, f10);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            canvas.drawRoundRect(rectF, min, min, paint);
            canvas.restore();
        }
        if (!this.f1851x) {
            f12 = this.f1847n.e;
        }
        float f13 = f12 * this.P;
        int i10 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
        if (i10 > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            canvas.saveLayer(0.0f, 0.0f, f11, getHeight(), null);
        }
        super.dispatchDraw(canvas);
        if (i10 > 0) {
            canvas.save();
            float dpf2 = AndroidUtilities.dpf2(1.33f);
            float dpf22 = AndroidUtilities.dpf2(11.0f) + (f11 / 2.0f);
            float dpf23 = AndroidUtilities.dpf2(10.0f);
            float dpf24 = AndroidUtilities.dpf2(16.0f);
            j6 j6Var = this.f1846f;
            float max = Math.max(dpf24, j6Var.d() + AndroidUtilities.dp(8.0f));
            float dpf25 = AndroidUtilities.dpf2(9.333f);
            float dpf26 = AndroidUtilities.dpf2(8.0f);
            float f14 = max / 2.0f;
            float f15 = dpf24 / 2.0f;
            rectF.set((dpf22 - f14) - dpf2, (dpf23 - f15) - dpf2, f14 + dpf22 + dpf2, f15 + dpf23 + dpf2);
            canvas.scale(f13, f13, dpf22, dpf23);
            canvas.drawRoundRect(rectF, dpf25, dpf25, org.telegram.ui.ActionBar.j6.Il);
            rectF.inset(dpf2, dpf2);
            if (this.f1851x) {
                if (this.I == null) {
                    this.I = getContext().getResources().getDrawable(R.drawable.star).mutate();
                }
                r1.d().f(0.0f, 0.0f, AndroidUtilities.dp(96.0f), AndroidUtilities.dp(16.0f));
                canvas.drawRoundRect(rectF, dpf26, dpf26, r1.d().e());
                int dpf27 = (int) (dpf22 - AndroidUtilities.dpf2(7.0f));
                int dpf28 = (int) (dpf23 - AndroidUtilities.dpf2(7.0f));
                this.I.setBounds(dpf27, dpf28, AndroidUtilities.dp(14.0f) + dpf27, AndroidUtilities.dp(14.0f) + dpf28);
                this.I.draw(canvas);
            } else {
                paint.setColor(i0.a.d(this.f1848r.e, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.hl, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20133r7, false)));
                canvas.drawRoundRect(rectF, dpf26, dpf26, paint);
                j6Var.m(rectF);
                j6Var.draw(canvas);
            }
            canvas.restore();
        }
        if (z4) {
            canvas.restore();
        }
    }

    public final void e(boolean z4, boolean z10) {
        Typeface bold;
        this.h.a(z4, z10);
        a(z10);
        if (z4) {
            bold = AndroidUtilities.getTypeface("fonts/rextrabold.ttf");
        } else {
            bold = AndroidUtilities.bold();
        }
        this.f1843a.setTypeface(bold);
    }

    public final void f() {
        int i10 = this.f1850w;
        int i11 = this.f1849s;
        xd.a aVar = this.h;
        int d = i0.a.d(aVar.e, i10, i11);
        int d10 = i0.a.d(aVar.e, this.f1850w, this.v);
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        p9 p9Var = this.f1845c;
        if (p9Var != null && this.J) {
            p9Var.setColorFilter(porterDuffColorFilter);
            this.f1845c.invalidate();
        }
        this.f1844b.setColorFilter(porterDuffColorFilter);
        this.f1843a.setTextColor(d10);
    }

    public p9 getBackupImageView() {
        return this.f1845c;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        if (this.N) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) c()) + this.O, 1073741824), i11);
        } else {
            super.onMeasure(i10, i11);
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (this.D) {
            float measuredWidth = (this.E - getMeasuredWidth()) / 2.0f;
            this.f1844b.setTranslationX(measuredWidth);
            this.f1843a.setTranslationX(measuredWidth);
        }
    }

    public void setAdditionalWidth(int i10) {
        this.O = i10;
        this.N = true;
    }

    public void setAttachScale(float f10) {
        TextView textView = this.f1843a;
        textView.setScaleX(f10);
        textView.setScaleY(f10);
        jj0 jj0Var = this.f1844b;
        jj0Var.setScaleX(f10);
        jj0Var.setScaleY(f10);
        p9 p9Var = this.f1845c;
        if (p9Var != null) {
            p9Var.setScaleX(f10);
            this.f1845c.setScaleY(f10);
        }
        this.P = f10;
        invalidate();
    }

    public void setPremiumBadge(boolean z4) {
        this.f1851x = z4;
    }

    public void setSkipDrawSelector(boolean z4) {
        if (this.H != z4) {
            this.H = z4;
            invalidate();
        }
    }

    public void setTabAnimation(a aVar) {
        this.f1852y = aVar;
        this.B = null;
        this.L = 0;
        this.M = 0L;
        this.f1844b.a();
        a(false);
    }

    public void setText(CharSequence charSequence) {
        this.f1843a.setText(charSequence);
    }

    public void setTextSizeDp(float f10) {
        float dp = AndroidUtilities.dp(f10);
        TextView textView = this.f1843a;
        if (textView.getTextSize() != dp) {
            textView.setTextSize(1, f10);
            this.C.setTextSize(dp);
        }
    }

    public void setVisualWidth(float f10) {
        this.D = true;
        if (this.E != f10) {
            this.E = f10;
            float measuredWidth = (f10 - getMeasuredWidth()) / 2.0f;
            this.f1844b.setTranslationX(measuredWidth);
            this.f1843a.setTranslationX(measuredWidth);
            invalidate();
        }
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
