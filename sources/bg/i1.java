package bg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.th;
public class i1 extends View {
    public final Paint A;
    public boolean B;
    public zz0 C;
    public final Paint D;
    public boolean E;
    public zz0 F;
    public boolean G;
    public zz0 H;
    public boolean I;
    public final TextPaint J;
    public StaticLayout K;
    public float L;
    public float M;
    public boolean N;
    public boolean O;
    public final ImageReceiver P;
    public boolean Q;
    public int R;
    public h1 S;
    public float T;
    public float U;
    public float V;
    public float W;
    public int f2295a;
    public int f2296a0;
    public int f2297b;
    public final RectF f2298b0;
    public boolean f2299c;
    public final RectF f2300c0;
    public boolean d;
    public final Path f2301d0;
    public final float f2302e;
    public final Path f2303e0;
    public final int f2304f;
    public final RectF f2305f0;
    public final RectF f2306g0;
    public final int h;
    public final d6 f2307h0;
    public final d6 f2308i0;
    public final d6 f2309j0;
    public final d6 f2310k0;
    public final d6 f2311l0;
    public final d6 m0;
    public float f2312n;
    public final d6 f2313n0;
    public final d6 f2314o0;
    public final TextPaint f2315r;
    public StaticLayout f2316s;
    public float v;
    public float f2317w;
    public final RectF f2318x;
    public final Drawable f2319y;

    public i1(Context context, float f9) {
        super(context);
        this.f2299c = true;
        this.f2312n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f2315r = textPaint;
        this.f2318x = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.A = new Paint(1);
        this.D = new Paint(1);
        this.J = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.P = imageReceiver;
        this.f2298b0 = new RectF();
        this.f2300c0 = new RectF();
        this.f2301d0 = new Path();
        this.f2303e0 = new Path();
        this.f2305f0 = new RectF();
        this.f2306g0 = new RectF();
        jr jrVar = jr.h;
        this.f2307h0 = new d6(this, 0L, 350L, jrVar);
        this.f2308i0 = new d6(this, 0L, 350L, jrVar);
        this.f2309j0 = new d6(this, 0L, 350L, jrVar);
        this.f2310k0 = new d6(this, 0L, 350L, jrVar);
        this.f2311l0 = new d6(this, 0L, 350L, jrVar);
        this.m0 = new d6(this, 0L, 350L, jrVar);
        this.f2313n0 = new d6(this, 0L, 350L, jrVar);
        this.f2314o0 = new d6(this, 0L, 350L, jrVar);
        this.f2302e = f9;
        imageReceiver.setInvalidateAll(true);
        this.f2304f = (int) (f9 * 3.0f);
        this.h = (int) (f9 * 1.0f);
        this.f2319y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f9);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public final void a(Canvas canvas) {
        boolean z10;
        float f9;
        float f10;
        float f11;
        Path.Direction direction;
        float f12;
        float f13;
        zz0 zz0Var;
        zz0 zz0Var2;
        Canvas canvas2 = canvas;
        d();
        float d = this.f2313n0.d(this.T, false);
        float d10 = this.f2314o0.d(this.U, false);
        if (this.R == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        float e10 = this.f2311l0.e(z10);
        float e11 = this.f2310k0.e(e());
        float f14 = this.f2302e;
        float lerp = AndroidUtilities.lerp(0.2f * d10, 16.66f * f14, e11);
        int i10 = this.f2304f;
        int i11 = this.h;
        RectF rectF = this.f2298b0;
        rectF.set(i10, i11, i10 + d, i11 + d10);
        int d11 = i0.a.d(e11, this.f2296a0, i0.a.d(e10, -1, -14670807));
        Paint paint = this.A;
        paint.setColor(d11);
        Path path = this.f2303e0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, lerp, lerp, direction2);
        canvas2.drawPath(path, paint);
        if (e11 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i10, i11);
            float e12 = this.f2307h0.e(this.B);
            float f15 = (7.33f * f14) + 0.0f;
            zz0 zz0Var3 = this.C;
            if (zz0Var3 != null && e12 > 0.0f) {
                direction = direction2;
                f10 = e12;
                f9 = 1.0f;
                zz0Var3.c(f14 * 10.0f, th.b(1.0f, e12, (15.0f * f14) + this.C.j(), (zz0Var3.j() / 2.0f) + f15), e11, -15033089, canvas2);
                f11 = e11;
                f15 = (((7.0f * f14) + this.C.j()) * f10) + f15;
            } else {
                f10 = e12;
                f11 = e11;
                direction = direction2;
                f9 = 1.0f;
            }
            float f16 = f15;
            float d12 = this.m0.d(this.V, false);
            Paint paint2 = this.D;
            paint2.setAlpha(25);
            float f17 = d12 + f16;
            RectF rectF2 = this.f2300c0;
            rectF2.set(f14 * 10.0f, f16, d - (f14 * 10.0f), f17);
            Path path2 = this.f2301d0;
            path2.rewind();
            path2.addRoundRect(rectF2, f14 * 5.0f, f14 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(255);
            canvas2.drawRect(f14 * 10.0f, f16, 13.0f * f14, f17, paint2);
            canvas.restore();
            float f18 = (5.66f * f14) + f16;
            if (this.G && (zz0Var2 = this.H) != null) {
                float j10 = (zz0Var2.j() / 2.0f) + f18;
                int color = paint2.getColor();
                f12 = d;
                e11 = f11;
                f13 = 2.66f;
                zz0Var2.c(f14 * 20.0f, j10, e11, color, canvas);
                f18 = com.google.android.recaptcha.internal.a.d(f14, 2.66f, this.H.j(), f18);
            } else {
                f12 = d;
                e11 = f11;
                f13 = 2.66f;
            }
            if (this.E && (zz0Var = this.F) != null) {
                canvas2 = canvas;
                zz0Var.c(f14 * 20.0f, (zz0Var.j() / 2.0f) + f18, e11, i0.a.d(e10, -13421773, -1), canvas2);
                f18 = com.google.android.recaptcha.internal.a.d(f14, f13, this.F.j(), f18);
            } else {
                canvas2 = canvas;
            }
            if (this.I && this.K != null) {
                canvas2.save();
                canvas2.translate((f14 * 20.0f) - this.M, f18);
                this.J.setColor(i0.a.d(e10, -13421773, -1));
                this.J.setAlpha((int) (255.0f * e11));
                this.K.draw(canvas2);
                canvas2.restore();
                f18 = com.google.android.recaptcha.internal.a.d(f14, f13, this.K.getHeight(), f18);
            }
            float e13 = this.f2308i0.e(this.N);
            if (e13 > 0.0f) {
                float e14 = this.f2309j0.e(this.O);
                this.f2305f0.set(f14 * 20.0f, (f14 * f13) + f18, f12 - (20.0f * f14), (f14 * f13) + f18 + this.W);
                this.f2306g0.set(((f12 - (f14 * 10.0f)) - (f14 * 6.0f)) - (48.0f * f14), (f14 * 6.0f) + f16, (f12 - (f14 * 10.0f)) - (f14 * 6.0f), (48.0f * f14) + (6.0f * f14) + f16);
                AndroidUtilities.lerp(this.f2305f0, this.f2306g0, e14, rectF2);
                float f19 = rectF2.left;
                float f20 = rectF2.top;
                float width = rectF2.width();
                float height = rectF2.height();
                ImageReceiver imageReceiver = this.P;
                imageReceiver.setImageCoords(f19, f20, width, height);
                imageReceiver.setAlpha(e13 * e11);
                imageReceiver.draw(canvas2);
                f18 += ((f14 * 2.66f) + this.W) * (f9 - e14);
            }
            float f21 = (5.0f * f14) + (7.0f * f14) + f18;
            zz0 zz0Var4 = this.C;
            if (zz0Var4 != null && f9 - f10 > 0.0f) {
                zz0Var4.c(f14 * 10.0f, (zz0Var4.j() / 2.0f) + f21 + (((15.0f * f14) + this.C.j()) * f10), e11, -15033089, canvas2);
                this.C.j();
            }
            canvas2.restore();
        } else {
            f9 = 1.0f;
        }
        if (e11 < f9) {
            float f22 = this.f2318x.left;
            Drawable drawable = this.f2319y;
            drawable.setBounds(((int) (f22 * f14)) + i10, ((int) com.google.android.recaptcha.internal.a.w(f14, 30.0f, d10, 2.0f)) + i11, ((int) ((f22 + 30.0f) * f14)) + i10, ((int) com.google.android.recaptcha.internal.a.y(f14, 30.0f, d10, 2.0f)) + i11);
            int i12 = (int) ((f9 - e11) * 255.0f);
            drawable.setAlpha(i12);
            drawable.draw(canvas2);
            if (this.f2316s != null) {
                canvas2.save();
                canvas2.translate(((this.f2318x.left + 30.0f + 3.25f) * f14) + i10, (d10 / 2.0f) + i11);
                float f23 = this.f2312n;
                canvas2.scale(f23, f23);
                canvas2.translate(-this.f2317w, (-this.f2316s.getHeight()) / 2.0f);
                this.f2315r.setAlpha(i12);
                this.f2316s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i10, h1 h1Var, boolean z10) {
        this.f2295a = i10;
        if (this.S == h1Var && !z10) {
            return;
        }
        this.S = h1Var;
        this.f2299c = true;
        this.d = z10;
        requestLayout();
    }

    public final void c(int i10, int i11) {
        int i12 = -16777216;
        Drawable drawable = this.f2319y;
        TextPaint textPaint = this.f2315r;
        if (i10 == 0) {
            this.f2296a0 = i11;
            if (AndroidUtilities.computePerceivedBrightness(i11) < 0.721f) {
                i12 = -1;
            }
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.f2296a0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
            this.f2296a0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f2296a0 = -1;
            textPaint.setColor(-13397548);
            drawable.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void d() {
        String str;
        double d;
        String str2;
        MessagesController.PeerColor peerColor;
        int color1;
        boolean z10;
        float f9;
        int i10;
        float f10;
        int i11;
        int i12;
        ImageLocation forDocument;
        int i13;
        float f11;
        float f12;
        int i14;
        boolean z11;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        ImageLocation forPhoto;
        if (this.f2299c && this.S != null) {
            boolean e10 = e();
            int i15 = this.f2304f;
            float f18 = this.f2302e;
            if (e10) {
                if (TextUtils.isEmpty(this.S.f2283b)) {
                    str2 = this.S.f2284c;
                } else {
                    str2 = this.S.f2283b;
                }
                TLRPC.WebPage webPage = this.S.d;
                float f19 = (this.f2297b - i15) - i15;
                this.U = 0.0f;
                this.T = 0.0f;
                this.V = 0.0f;
                int colorId = UserObject.getColorId(UserConfig.getInstance(this.f2295a).getCurrentUser());
                MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f2295a).peerColors;
                String str3 = null;
                if (peerColors != null && colorId >= 7) {
                    peerColor = peerColors.getColor(colorId);
                } else {
                    peerColor = null;
                }
                if (peerColor == null) {
                    int[] iArr = g6.f23312r8;
                    color1 = g6.w0(null, iArr[colorId % iArr.length], false);
                } else {
                    color1 = peerColor.getColor1();
                }
                this.D.setColor(color1);
                this.U = (7.33f * f18) + this.U;
                this.B = this.S.f2286f;
                zz0 zz0Var = new zz0(str2, 16.0f, null);
                zz0Var.f35460a.setTextSize(16.0f * f18);
                float f20 = 20.0f * f18;
                zz0Var.q(f19 - f20);
                this.C = zz0Var;
                this.T = Math.max(this.T, Math.min(f20 + zz0Var.f35462c, f19));
                float f21 = 7.0f * f18;
                this.U = this.C.j() + this.U + f21;
                if (webPage.photo == null && !MessageObject.isVideoDocument(webPage.document)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                this.N = z10;
                h1 h1Var = this.S;
                boolean z12 = h1Var.f2285e;
                this.O = !z12;
                if (this.Q && (h1Var.f2282a & 4) != 0) {
                    i10 = h1Var.f2287i;
                } else {
                    if (!z12) {
                        f9 = 48.0f;
                    } else {
                        f9 = (f19 / f18) - 40.0f;
                    }
                    i10 = ((int) f9) * 2;
                }
                ImageReceiver imageReceiver = this.P;
                imageReceiver.setRoundRadius((int) (4.0f * f18));
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                    f10 = 48.0f;
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i10 * f18), false, closestPhotoSizeWithSize, false);
                    if (closestPhotoSizeWithSize2 != null) {
                        i12 = closestPhotoSizeWithSize2.f22417w;
                        i11 = closestPhotoSizeWithSize2.h;
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    ImageLocation forPhoto2 = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo);
                    String k9 = com.google.android.recaptcha.internal.a.k(i10, "_", i10);
                    if (this.Q) {
                        forPhoto = null;
                    } else {
                        forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo);
                    }
                    if (!this.Q) {
                        str3 = com.google.android.recaptcha.internal.a.k(i10, "_", i10);
                    }
                    imageReceiver.setImage(forPhoto2, k9, forPhoto, str3, 0L, null, null, 0);
                } else {
                    f10 = 48.0f;
                    TLRPC.Document document = webPage.document;
                    if (document != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i10 * f18), false, closestPhotoSizeWithSize3, false);
                        if (closestPhotoSizeWithSize4 != null) {
                            i12 = closestPhotoSizeWithSize4.f22417w;
                            i11 = closestPhotoSizeWithSize4.h;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document);
                        String k10 = com.google.android.recaptcha.internal.a.k(i10, "_", i10);
                        if (this.Q) {
                            forDocument = null;
                        } else {
                            forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document);
                        }
                        if (!this.Q) {
                            str3 = com.google.android.recaptcha.internal.a.k(i10, "_", i10);
                        }
                        imageReceiver.setImage(forDocument2, k10, forDocument, str3, 0L, null, null, 0);
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                }
                this.V = (5.66f * f18) + this.V;
                boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
                this.G = !isEmpty;
                if (!isEmpty) {
                    zz0 zz0Var2 = new zz0(webPage.site_name, 14.0f, AndroidUtilities.bold());
                    zz0Var2.f35460a.setTextSize(f18 * 14.0f);
                    float f22 = f18 * 40.0f;
                    float f23 = f19 - f22;
                    if (this.N && this.O) {
                        f16 = f18 * 60.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    zz0Var2.q((int) Math.ceil(f23 - f16));
                    this.H = zz0Var2;
                    float f24 = this.T;
                    float f25 = f22 + zz0Var2.f35462c;
                    if (this.N && this.O) {
                        f17 = f18 * 60.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    this.T = Math.max(f24, Math.min(f25 + f17, f19));
                    this.V = (f18 * 2.66f) + this.H.j() + this.V;
                    i13 = this.H.f35461b.getLineCount();
                } else {
                    i13 = 0;
                }
                boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
                this.E = !isEmpty2;
                if (!isEmpty2) {
                    zz0 zz0Var3 = new zz0(webPage.title, 14.0f, AndroidUtilities.bold());
                    zz0Var3.f35460a.setTextSize(f18 * 14.0f);
                    float f26 = f18 * 40.0f;
                    float f27 = f19 - f26;
                    f12 = 2.66f;
                    if (this.N && this.O) {
                        f14 = f18 * 60.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    f11 = f18;
                    zz0Var3.q((int) Math.ceil(f27 - f14));
                    this.F = zz0Var3;
                    float f28 = this.T;
                    float f29 = f26 + zz0Var3.f35462c;
                    if (this.N && this.O) {
                        f15 = 60.0f * f11;
                    } else {
                        f15 = 0.0f;
                    }
                    this.T = Math.max(f28, Math.min(f29 + f15, f19));
                    this.V = (f11 * 2.66f) + this.F.j() + this.V;
                    i13 += this.F.f35461b.getLineCount();
                } else {
                    f11 = f18;
                    f12 = 2.66f;
                }
                boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
                this.I = !isEmpty3;
                if (!isEmpty3) {
                    TextPaint textPaint = this.J;
                    textPaint.setTextSize(f11 * 14.0f);
                    String str4 = webPage.description;
                    float f30 = f11 * 40.0f;
                    int ceil = (int) Math.ceil(Math.max(1.0f, f19 - f30));
                    if (this.N && this.O) {
                        i14 = 60;
                    } else {
                        i14 = 0;
                    }
                    int i16 = 3 - i13;
                    this.K = org.telegram.ui.Cells.s1.u2(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f19 - ((40 + i14) * f11))), i16, 4);
                    this.L = 0.0f;
                    this.M = Float.MAX_VALUE;
                    for (int i17 = 0; i17 < this.K.getLineCount(); i17++) {
                        if (this.N && this.O && i17 < i16) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        float f31 = this.L;
                        float lineWidth = this.K.getLineWidth(i17);
                        if (z11) {
                            f13 = f11 * f10;
                        } else {
                            f13 = 0.0f;
                        }
                        this.L = Math.max(f31, lineWidth + f13);
                        this.M = Math.min(this.M, this.K.getLineLeft(i17));
                    }
                    this.T = Math.max(this.T, Math.min(f30 + this.L, f19));
                    this.V = (f11 * f12) + this.V + this.K.getHeight();
                }
                if (this.N && !this.O) {
                    if (i12 > 0 && i11 > 0) {
                        this.W = Math.min((Math.max(0.0f, this.T - (f11 * 40.0f)) / i12) * i11, f11 * 200.0f);
                    } else {
                        this.W = f11 * 120.0f;
                    }
                    this.V = (f11 * f12) + this.V + this.W;
                }
                float f32 = f21 + this.V;
                this.V = f32;
                this.U = (f11 * 11.0f) + this.U + f32;
            } else {
                if (TextUtils.isEmpty(this.S.f2283b)) {
                    String str5 = this.S.f2284c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = this.S.f2283b;
                }
                RectF rectF = this.f2318x;
                float f33 = ((this.f2297b - i15) - i15) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f18);
                this.f2312n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f2315r;
                this.f2316s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f33), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.v = 0.0f;
                this.f2317w = Float.MAX_VALUE;
                for (int i18 = 0; i18 < this.f2316s.getLineCount(); i18++) {
                    this.v = Math.max(this.v, this.f2316s.getLineWidth(i18));
                    this.f2317w = Math.min(this.f2317w, this.f2316s.getLineLeft(i18));
                }
                if (this.f2316s.getLineCount() > 2) {
                    this.f2312n = 0.3f;
                } else {
                    this.f2312n = Math.min(1.0f, f33 / this.v);
                }
                this.T = (this.v * this.f2312n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f18);
                this.U = Math.max(f18 * 30.0f, this.f2316s.getHeight() * this.f2312n) + ((rectF.top + rectF.bottom) * f18);
            }
            if (!this.d) {
                this.f2307h0.f(this.B, true);
                this.f2309j0.f(this.O, true);
                this.f2308i0.f(this.N, true);
                this.m0.d(this.V, true);
            } else {
                invalidate();
            }
            this.f2299c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        h1 h1Var = this.S;
        if (h1Var != null && h1Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f9;
        if (this.O) {
            f9 = 48.0f;
        } else {
            int i10 = this.f2297b;
            int i11 = this.f2304f;
            f9 = (((i10 - i11) - i11) / this.f2302e) - 40.0f;
        }
        return ((int) f9) * 2;
    }

    public int getPreviewType() {
        return this.R;
    }

    public float getRadius() {
        float f9;
        float f10;
        if (e()) {
            f9 = 16.66f;
            f10 = this.f2302e;
        } else {
            f9 = 0.2f;
            f10 = this.U;
        }
        return f10 * f9;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.P.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.P.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d();
        int i12 = this.f2304f;
        int ceil = ((int) Math.ceil(this.T)) + i12 + i12;
        int ceil2 = (int) Math.ceil(this.U);
        int i13 = this.h;
        setMeasuredDimension(ceil, ceil2 + i13 + i13);
    }

    public void setMaxWidth(int i10) {
        this.f2297b = i10;
        this.f2299c = true;
    }

    public void setPreviewType(int i10) {
        this.R = i10;
        invalidate();
    }
}
