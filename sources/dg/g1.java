package dg;

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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.z5;
import org.telegram.ui.ai;
public class g1 extends View {
    public final Paint B;
    public boolean C;
    public k01 D;
    public final Paint E;
    public boolean F;
    public k01 G;
    public boolean H;
    public k01 I;
    public boolean J;
    public final TextPaint K;
    public StaticLayout L;
    public float M;
    public float N;
    public boolean O;
    public boolean P;
    public final ImageReceiver Q;
    public boolean R;
    public int S;
    public f1 T;
    public float U;
    public float V;
    public float W;
    public int f4527a;
    public float f4528a0;
    public int f4529b;
    public int f4530b0;
    public boolean f4531c;
    public final RectF f4532c0;
    public boolean d;
    public final RectF f4533d0;
    public final float e;
    public final Path f4534e0;
    public final int f4535f;
    public final Path f4536f0;
    public final RectF f4537g0;
    public final int h;
    public final RectF f4538h0;
    public final z5 f4539i0;
    public final z5 f4540j0;
    public final z5 f4541k0;
    public final z5 f4542l0;
    public final z5 m0;
    public float f4543n;
    public final z5 f4544n0;
    public final z5 f4545o0;
    public final z5 f4546p0;
    public final TextPaint f4547r;
    public StaticLayout f4548s;
    public float v;
    public float f4549w;
    public final RectF f4550x;
    public final Drawable f4551y;

    public g1(Context context, float f10) {
        super(context);
        this.f4531c = true;
        this.f4543n = 1.0f;
        TextPaint textPaint = new TextPaint(1);
        this.f4547r = textPaint;
        this.f4550x = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        this.B = new Paint(1);
        this.E = new Paint(1);
        this.K = new TextPaint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.Q = imageReceiver;
        this.f4532c0 = new RectF();
        this.f4533d0 = new RectF();
        this.f4534e0 = new Path();
        this.f4536f0 = new Path();
        this.f4537g0 = new RectF();
        this.f4538h0 = new RectF();
        mr mrVar = mr.h;
        this.f4539i0 = new z5(this, 0L, 350L, mrVar);
        this.f4540j0 = new z5(this, 0L, 350L, mrVar);
        this.f4541k0 = new z5(this, 0L, 350L, mrVar);
        this.f4542l0 = new z5(this, 0L, 350L, mrVar);
        this.m0 = new z5(this, 0L, 350L, mrVar);
        this.f4544n0 = new z5(this, 0L, 350L, mrVar);
        this.f4545o0 = new z5(this, 0L, 350L, mrVar);
        this.f4546p0 = new z5(this, 0L, 350L, mrVar);
        this.e = f10;
        imageReceiver.setInvalidateAll(true);
        this.f4535f = (int) (f10 * 3.0f);
        this.h = (int) (f10 * 1.0f);
        this.f4551y = context.getResources().getDrawable(R.drawable.story_link).mutate();
        textPaint.setTextSize(24.0f * f10);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
    }

    public final void a(Canvas canvas) {
        boolean z4;
        float f10;
        float f11;
        float f12;
        Path.Direction direction;
        float f13;
        float f14;
        k01 k01Var;
        k01 k01Var2;
        Canvas canvas2 = canvas;
        d();
        float d = this.f4545o0.d(this.U, false);
        float d10 = this.f4546p0.d(this.V, false);
        if (this.S == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        float e = this.m0.e(z4);
        float e6 = this.f4542l0.e(e());
        float f15 = this.e;
        float lerp = AndroidUtilities.lerp(0.2f * d10, 16.66f * f15, e6);
        int i10 = this.f4535f;
        int i11 = this.h;
        RectF rectF = this.f4532c0;
        rectF.set(i10, i11, i10 + d, i11 + d10);
        int d11 = i0.a.d(e6, this.f4530b0, i0.a.d(e, -1, -14670807));
        Paint paint = this.B;
        paint.setColor(d11);
        Path path = this.f4536f0;
        path.rewind();
        Path.Direction direction2 = Path.Direction.CW;
        path.addRoundRect(rectF, lerp, lerp, direction2);
        canvas2.drawPath(path, paint);
        if (e6 > 0.0f) {
            canvas2.save();
            canvas2.clipPath(path);
            canvas2.translate(i10, i11);
            float e10 = this.f4539i0.e(this.C);
            float f16 = (7.33f * f15) + 0.0f;
            k01 k01Var3 = this.D;
            if (k01Var3 != null && e10 > 0.0f) {
                direction = direction2;
                f11 = e10;
                f10 = 1.0f;
                k01Var3.c(f15 * 10.0f, ai.c(1.0f, e10, (15.0f * f15) + this.D.j(), (k01Var3.j() / 2.0f) + f16), e6, -15033089, canvas2);
                f12 = e6;
                f16 = (((7.0f * f15) + this.D.j()) * f11) + f16;
            } else {
                f11 = e10;
                f12 = e6;
                direction = direction2;
                f10 = 1.0f;
            }
            float f17 = f16;
            float d12 = this.f4544n0.d(this.W, false);
            Paint paint2 = this.E;
            paint2.setAlpha(25);
            float f18 = d12 + f17;
            RectF rectF2 = this.f4533d0;
            rectF2.set(f15 * 10.0f, f17, d - (f15 * 10.0f), f18);
            Path path2 = this.f4534e0;
            path2.rewind();
            path2.addRoundRect(rectF2, f15 * 5.0f, f15 * 5.0f, direction);
            canvas2.drawPath(path2, paint2);
            canvas2.save();
            canvas2.clipPath(path2);
            paint2.setAlpha(255);
            canvas2.drawRect(f15 * 10.0f, f17, 13.0f * f15, f18, paint2);
            canvas.restore();
            float f19 = (5.66f * f15) + f17;
            if (this.H && (k01Var2 = this.I) != null) {
                float j10 = (k01Var2.j() / 2.0f) + f19;
                int color = paint2.getColor();
                f13 = d;
                e6 = f12;
                f14 = 2.66f;
                k01Var2.c(f15 * 20.0f, j10, e6, color, canvas);
                f19 = e2.c.A(f15, 2.66f, this.I.j(), f19);
            } else {
                f13 = d;
                e6 = f12;
                f14 = 2.66f;
            }
            if (this.F && (k01Var = this.G) != null) {
                canvas2 = canvas;
                k01Var.c(f15 * 20.0f, (k01Var.j() / 2.0f) + f19, e6, i0.a.d(e, -13421773, -1), canvas2);
                f19 = e2.c.A(f15, f14, this.G.j(), f19);
            } else {
                canvas2 = canvas;
            }
            if (this.J && this.L != null) {
                canvas2.save();
                canvas2.translate((f15 * 20.0f) - this.N, f19);
                this.K.setColor(i0.a.d(e, -13421773, -1));
                this.K.setAlpha((int) (255.0f * e6));
                this.L.draw(canvas2);
                canvas2.restore();
                f19 = e2.c.A(f15, f14, this.L.getHeight(), f19);
            }
            float e11 = this.f4540j0.e(this.O);
            if (e11 > 0.0f) {
                float e12 = this.f4541k0.e(this.P);
                this.f4537g0.set(f15 * 20.0f, (f15 * f14) + f19, f13 - (20.0f * f15), (f15 * f14) + f19 + this.f4528a0);
                this.f4538h0.set(((f13 - (f15 * 10.0f)) - (f15 * 6.0f)) - (48.0f * f15), (f15 * 6.0f) + f17, (f13 - (f15 * 10.0f)) - (f15 * 6.0f), (48.0f * f15) + (6.0f * f15) + f17);
                AndroidUtilities.lerp(this.f4537g0, this.f4538h0, e12, rectF2);
                float f20 = rectF2.left;
                float f21 = rectF2.top;
                float width = rectF2.width();
                float height = rectF2.height();
                ImageReceiver imageReceiver = this.Q;
                imageReceiver.setImageCoords(f20, f21, width, height);
                imageReceiver.setAlpha(e11 * e6);
                imageReceiver.draw(canvas2);
                f19 += ((f15 * 2.66f) + this.f4528a0) * (f10 - e12);
            }
            float f22 = (5.0f * f15) + (7.0f * f15) + f19;
            k01 k01Var4 = this.D;
            if (k01Var4 != null && f10 - f11 > 0.0f) {
                k01Var4.c(f15 * 10.0f, (k01Var4.j() / 2.0f) + f22 + (((15.0f * f15) + this.D.j()) * f11), e6, -15033089, canvas2);
                this.D.j();
            }
            canvas2.restore();
        } else {
            f10 = 1.0f;
        }
        if (e6 < f10) {
            float f23 = this.f4550x.left;
            Drawable drawable = this.f4551y;
            drawable.setBounds(((int) (f23 * f15)) + i10, ((int) e2.c.d(f15, 30.0f, d10, 2.0f)) + i11, ((int) ((f23 + 30.0f) * f15)) + i10, ((int) e2.c.v(f15, 30.0f, d10, 2.0f)) + i11);
            int i12 = (int) ((f10 - e6) * 255.0f);
            drawable.setAlpha(i12);
            drawable.draw(canvas2);
            if (this.f4548s != null) {
                canvas2.save();
                canvas2.translate(((this.f4550x.left + 30.0f + 3.25f) * f15) + i10, (d10 / 2.0f) + i11);
                float f24 = this.f4543n;
                canvas2.scale(f24, f24);
                canvas2.translate(-this.f4549w, (-this.f4548s.getHeight()) / 2.0f);
                this.f4547r.setAlpha(i12);
                this.f4548s.draw(canvas2);
                canvas2.restore();
            }
        }
    }

    public final void b(int i10, f1 f1Var, boolean z4) {
        this.f4527a = i10;
        if (this.T == f1Var && !z4) {
            return;
        }
        this.T = f1Var;
        this.f4531c = true;
        this.d = z4;
        requestLayout();
    }

    public final void c(int i10, int i11) {
        int i12 = -16777216;
        Drawable drawable = this.f4551y;
        TextPaint textPaint = this.f4547r;
        if (i10 == 0) {
            this.f4530b0 = i11;
            if (AndroidUtilities.computePerceivedBrightness(i11) < 0.721f) {
                i12 = -1;
            }
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            this.f4530b0 = -16777216;
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 2) {
            this.f4530b0 = 1275068416;
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else {
            this.f4530b0 = -1;
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
        boolean z4;
        float f10;
        int i10;
        float f11;
        int i11;
        int i12;
        ImageLocation forDocument;
        int i13;
        float f12;
        float f13;
        int i14;
        boolean z10;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        ImageLocation forPhoto;
        if (this.f4531c && this.T != null) {
            boolean e = e();
            int i15 = this.f4535f;
            float f19 = this.e;
            if (e) {
                if (TextUtils.isEmpty(this.T.f4512b)) {
                    str2 = this.T.f4513c;
                } else {
                    str2 = this.T.f4512b;
                }
                TLRPC.WebPage webPage = this.T.d;
                float f20 = (this.f4529b - i15) - i15;
                this.V = 0.0f;
                this.U = 0.0f;
                this.W = 0.0f;
                int colorId = UserObject.getColorId(UserConfig.getInstance(this.f4527a).getCurrentUser());
                MessagesController.PeerColors peerColors = MessagesController.getInstance(this.f4527a).peerColors;
                String str3 = null;
                if (peerColors != null && colorId >= 7) {
                    peerColor = peerColors.getColor(colorId);
                } else {
                    peerColor = null;
                }
                if (peerColor == null) {
                    int[] iArr = j6.f20134r8;
                    color1 = j6.w0(null, iArr[colorId % iArr.length], false);
                } else {
                    color1 = peerColor.getColor1();
                }
                this.E.setColor(color1);
                this.V = (7.33f * f19) + this.V;
                this.C = this.T.f4514f;
                k01 k01Var = new k01(str2, 16.0f, null);
                k01Var.f26122a.setTextSize(16.0f * f19);
                float f21 = 20.0f * f19;
                k01Var.q(f20 - f21);
                this.D = k01Var;
                this.U = Math.max(this.U, Math.min(f21 + k01Var.f26124c, f20));
                float f22 = 7.0f * f19;
                this.V = this.D.j() + this.V + f22;
                if (webPage.photo == null && !MessageObject.isVideoDocument(webPage.document)) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                this.O = z4;
                f1 f1Var = this.T;
                boolean z11 = f1Var.e;
                this.P = !z11;
                if (this.R && (f1Var.f4511a & 4) != 0) {
                    i10 = f1Var.f4515i;
                } else {
                    if (!z11) {
                        f10 = 48.0f;
                    } else {
                        f10 = (f20 / f19) - 40.0f;
                    }
                    i10 = ((int) f10) * 2;
                }
                ImageReceiver imageReceiver = this.Q;
                imageReceiver.setRoundRadius((int) (4.0f * f19));
                TLRPC.Photo photo = webPage.photo;
                if (photo != null) {
                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 1, false, null, false);
                    f11 = 48.0f;
                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(webPage.photo.sizes, (int) (i10 * f19), false, closestPhotoSizeWithSize, false);
                    if (closestPhotoSizeWithSize2 != null) {
                        i12 = closestPhotoSizeWithSize2.f19184w;
                        i11 = closestPhotoSizeWithSize2.h;
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                    ImageLocation forPhoto2 = ImageLocation.getForPhoto(closestPhotoSizeWithSize2, webPage.photo);
                    String h = e2.c.h(i10, "_", i10);
                    if (this.R) {
                        forPhoto = null;
                    } else {
                        forPhoto = ImageLocation.getForPhoto(closestPhotoSizeWithSize, webPage.photo);
                    }
                    if (!this.R) {
                        str3 = e2.c.h(i10, "_", i10);
                    }
                    imageReceiver.setImage(forPhoto2, h, forPhoto, str3, 0L, null, null, 0);
                } else {
                    f11 = 48.0f;
                    TLRPC.Document document = webPage.document;
                    if (document != null) {
                        TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 1, false, null, false);
                        TLRPC.PhotoSize closestPhotoSizeWithSize4 = FileLoader.getClosestPhotoSizeWithSize(webPage.document.thumbs, (int) (i10 * f19), false, closestPhotoSizeWithSize3, false);
                        if (closestPhotoSizeWithSize4 != null) {
                            i12 = closestPhotoSizeWithSize4.f19184w;
                            i11 = closestPhotoSizeWithSize4.h;
                        } else {
                            i11 = 0;
                            i12 = 0;
                        }
                        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize4, webPage.document);
                        String h9 = e2.c.h(i10, "_", i10);
                        if (this.R) {
                            forDocument = null;
                        } else {
                            forDocument = ImageLocation.getForDocument(closestPhotoSizeWithSize3, webPage.document);
                        }
                        if (!this.R) {
                            str3 = e2.c.h(i10, "_", i10);
                        }
                        imageReceiver.setImage(forDocument2, h9, forDocument, str3, 0L, null, null, 0);
                    } else {
                        i11 = 0;
                        i12 = 0;
                    }
                }
                this.W = (5.66f * f19) + this.W;
                boolean isEmpty = TextUtils.isEmpty(webPage.site_name);
                this.H = !isEmpty;
                if (!isEmpty) {
                    k01 k01Var2 = new k01(webPage.site_name, 14.0f, AndroidUtilities.bold());
                    k01Var2.f26122a.setTextSize(f19 * 14.0f);
                    float f23 = f19 * 40.0f;
                    float f24 = f20 - f23;
                    if (this.O && this.P) {
                        f17 = f19 * 60.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    k01Var2.q((int) Math.ceil(f24 - f17));
                    this.I = k01Var2;
                    float f25 = this.U;
                    float f26 = f23 + k01Var2.f26124c;
                    if (this.O && this.P) {
                        f18 = f19 * 60.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    this.U = Math.max(f25, Math.min(f26 + f18, f20));
                    this.W = (f19 * 2.66f) + this.I.j() + this.W;
                    i13 = this.I.f26123b.getLineCount();
                } else {
                    i13 = 0;
                }
                boolean isEmpty2 = TextUtils.isEmpty(webPage.title);
                this.F = !isEmpty2;
                if (!isEmpty2) {
                    k01 k01Var3 = new k01(webPage.title, 14.0f, AndroidUtilities.bold());
                    k01Var3.f26122a.setTextSize(f19 * 14.0f);
                    float f27 = f19 * 40.0f;
                    float f28 = f20 - f27;
                    f13 = 2.66f;
                    if (this.O && this.P) {
                        f15 = f19 * 60.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    f12 = f19;
                    k01Var3.q((int) Math.ceil(f28 - f15));
                    this.G = k01Var3;
                    float f29 = this.U;
                    float f30 = f27 + k01Var3.f26124c;
                    if (this.O && this.P) {
                        f16 = 60.0f * f12;
                    } else {
                        f16 = 0.0f;
                    }
                    this.U = Math.max(f29, Math.min(f30 + f16, f20));
                    this.W = (f12 * 2.66f) + this.G.j() + this.W;
                    i13 += this.G.f26123b.getLineCount();
                } else {
                    f12 = f19;
                    f13 = 2.66f;
                }
                boolean isEmpty3 = TextUtils.isEmpty(webPage.description);
                this.J = !isEmpty3;
                if (!isEmpty3) {
                    TextPaint textPaint = this.K;
                    textPaint.setTextSize(f12 * 14.0f);
                    String str4 = webPage.description;
                    float f31 = f12 * 40.0f;
                    int ceil = (int) Math.ceil(Math.max(1.0f, f20 - f31));
                    if (this.O && this.P) {
                        i14 = 60;
                    } else {
                        i14 = 0;
                    }
                    int i16 = 3 - i13;
                    this.L = org.telegram.ui.Cells.s1.u2(str4, textPaint, ceil, (int) Math.ceil(Math.max(1.0f, f20 - ((40 + i14) * f12))), i16, 4);
                    this.M = 0.0f;
                    this.N = Float.MAX_VALUE;
                    for (int i17 = 0; i17 < this.L.getLineCount(); i17++) {
                        if (this.O && this.P && i17 < i16) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f32 = this.M;
                        float lineWidth = this.L.getLineWidth(i17);
                        if (z10) {
                            f14 = f12 * f11;
                        } else {
                            f14 = 0.0f;
                        }
                        this.M = Math.max(f32, lineWidth + f14);
                        this.N = Math.min(this.N, this.L.getLineLeft(i17));
                    }
                    this.U = Math.max(this.U, Math.min(f31 + this.M, f20));
                    this.W = (f12 * f13) + this.W + this.L.getHeight();
                }
                if (this.O && !this.P) {
                    if (i12 > 0 && i11 > 0) {
                        this.f4528a0 = Math.min((Math.max(0.0f, this.U - (f12 * 40.0f)) / i12) * i11, f12 * 200.0f);
                    } else {
                        this.f4528a0 = f12 * 120.0f;
                    }
                    this.W = (f12 * f13) + this.W + this.f4528a0;
                }
                float f33 = f22 + this.W;
                this.W = f33;
                this.V = (f12 * 11.0f) + this.V + f33;
            } else {
                if (TextUtils.isEmpty(this.T.f4512b)) {
                    String str5 = this.T.f4513c;
                    if (str5.startsWith("https://")) {
                        str5 = str5.substring(8);
                    }
                    str = str5.toUpperCase();
                } else {
                    str = this.T.f4512b;
                }
                RectF rectF = this.f4550x;
                float f34 = ((this.f4529b - i15) - i15) - ((((rectF.left + 30.0f) + 3.25f) + rectF.right) * f19);
                this.f4543n = 1.0f;
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                TextPaint textPaint2 = this.f4547r;
                this.f4548s = new StaticLayout(TextUtils.ellipsize(str, textPaint2, (int) Math.ceil(d), truncateAt), textPaint2, (int) Math.ceil(f34), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.v = 0.0f;
                this.f4549w = Float.MAX_VALUE;
                for (int i18 = 0; i18 < this.f4548s.getLineCount(); i18++) {
                    this.v = Math.max(this.v, this.f4548s.getLineWidth(i18));
                    this.f4549w = Math.min(this.f4549w, this.f4548s.getLineLeft(i18));
                }
                if (this.f4548s.getLineCount() > 2) {
                    this.f4543n = 0.3f;
                } else {
                    this.f4543n = Math.min(1.0f, f34 / this.v);
                }
                this.U = (this.v * this.f4543n) + ((rectF.left + 30.0f + 3.25f + rectF.right) * f19);
                this.V = Math.max(f19 * 30.0f, this.f4548s.getHeight() * this.f4543n) + ((rectF.top + rectF.bottom) * f19);
            }
            if (!this.d) {
                this.f4539i0.f(this.C, true);
                this.f4541k0.f(this.P, true);
                this.f4540j0.f(this.O, true);
                this.f4544n0.d(this.W, true);
            } else {
                invalidate();
            }
            this.f4531c = false;
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final boolean e() {
        f1 f1Var = this.T;
        if (f1Var != null && f1Var.d != null) {
            return true;
        }
        return false;
    }

    public int getPhotoSide() {
        float f10;
        if (this.P) {
            f10 = 48.0f;
        } else {
            int i10 = this.f4529b;
            int i11 = this.f4535f;
            f10 = (((i10 - i11) - i11) / this.e) - 40.0f;
        }
        return ((int) f10) * 2;
    }

    public int getPreviewType() {
        return this.S;
    }

    public float getRadius() {
        float f10;
        float f11;
        if (e()) {
            f10 = 16.66f;
            f11 = this.e;
        } else {
            f10 = 0.2f;
            f11 = this.V;
        }
        return f11 * f10;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        d();
        int i12 = this.f4535f;
        int ceil = ((int) Math.ceil(this.U)) + i12 + i12;
        int ceil2 = (int) Math.ceil(this.V);
        int i13 = this.h;
        setMeasuredDimension(ceil, ceil2 + i13 + i13);
    }

    public void setMaxWidth(int i10) {
        this.f4529b = i10;
        this.f4531c = true;
    }

    public void setPreviewType(int i10) {
        this.S = i10;
        invalidate();
    }
}
