package org.telegram.messenger.video;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import ig.h0;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.h6;
import org.telegram.messenger.i0;
import org.telegram.messenger.k6;
import org.telegram.messenger.v20;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.w0;
import org.telegram.messenger.w20;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.s5;
public class WebmEncoder {

    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<w20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<w20> arrayList = new ArrayList<>();
            this.mediaEntities = arrayList;
            this.clearPaint = new Paint(1);
            this.bitmapPaint = new Paint(5);
            int i10 = convertVideoParams.resultWidth;
            this.W = i10;
            int i11 = convertVideoParams.resultHeight;
            this.H = i11;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i10, i11), i10 * 0.125f, i11 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                w20 w20Var = this.mediaEntities.get(i12);
                byte b10 = w20Var.f18970a;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(w20Var);
                    }
                } else {
                    initStickerEntity(w20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(w20 w20Var, Bitmap bitmap, int i10) {
            if (bitmap != null && w20Var != null) {
                if (w20Var.f18985s != 0.0f || i10 != 0) {
                    if (w20Var.L == null) {
                        w20Var.L = new Canvas(bitmap);
                    }
                    if (w20Var.f18985s != 0.0f) {
                        if (this.path == null) {
                            this.path = new Path();
                        }
                        if (this.xRefPaint == null) {
                            Paint paint = new Paint(1);
                            this.xRefPaint = paint;
                            paint.setColor(-16777216);
                            this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * w20Var.f18985s;
                        this.path.rewind();
                        this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                        this.path.toggleInverseFillType();
                        w20Var.L.drawPath(this.path, this.xRefPaint);
                    }
                    if (i10 != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i10);
                        w20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, w20 w20Var, int i10, long j10) {
            w20 w20Var2;
            Canvas canvas2;
            long j11;
            Bitmap bitmap;
            RLottieNative rLottieNative = w20Var.D;
            int i11 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = w20Var.G;
                if (bitmap2 != null && w20Var.U > 0 && w20Var.V > 0) {
                    rLottieNative.c((int) w20Var.E, bitmap2, true);
                    Bitmap bitmap3 = w20Var.G;
                    if ((w20Var.f18971b & 8) == 0) {
                        i10 = 0;
                    }
                    applyRoundRadius(w20Var, bitmap3, i10);
                    canvas.drawBitmap(w20Var.G, w20Var.H, this.bitmapPaint);
                    float f7 = w20Var.E + w20Var.F;
                    w20Var.E = f7;
                    if (f7 >= w20Var.D.f24121a[0]) {
                        w20Var.E = 0.0f;
                    }
                }
            } else if (w20Var.J != null) {
                float f10 = w20Var.E;
                int i12 = (int) f10;
                float f11 = f10 + w20Var.F;
                w20Var.E = f11;
                for (int i13 = (int) f11; i12 != i13; i13--) {
                    w20Var.J.r(true);
                }
                p5 p5Var = w20Var.J.f30206w;
                if (p5Var != null) {
                    bitmap = p5Var.f29357b;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, w20Var.H, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(w20Var.G, w20Var.H, this.bitmapPaint);
                ArrayList arrayList = w20Var.f18977k;
                if (arrayList != null && !arrayList.isEmpty()) {
                    while (i11 < w20Var.f18977k.size()) {
                        v20 v20Var = (v20) w20Var.f18977k.get(i11);
                        if (v20Var == null || (w20Var2 = v20Var.f18586b) == null) {
                            canvas2 = canvas;
                            j11 = j10;
                        } else {
                            canvas2 = canvas;
                            j11 = j10;
                            drawEntity(canvas2, w20Var2, w20Var.f18978l, j11);
                        }
                        i11++;
                        canvas = canvas2;
                        j10 = j11;
                    }
                }
            }
        }

        public void initStickerEntity(w20 w20Var) {
            int i10;
            float f7;
            int i11 = (int) (w20Var.f18973f * this.W);
            w20Var.U = i11;
            int i12 = (int) (w20Var.f18974g * this.H);
            w20Var.V = i12;
            if (i11 > 512) {
                w20Var.V = (int) ((i12 / i11) * 512.0f);
                w20Var.U = 512;
            }
            int i13 = w20Var.V;
            if (i13 > 512) {
                w20Var.U = (int) ((w20Var.U / i13) * 512.0f);
                w20Var.V = 512;
            }
            byte b10 = w20Var.f18971b;
            if ((b10 & 1) != 0) {
                int i14 = w20Var.U;
                if (i14 > 0 && (i10 = w20Var.V) > 0) {
                    w20Var.G = Bitmap.createBitmap(i14, i10, Bitmap.Config.ARGB_8888);
                    RLottieNative a2 = RLottieNative.a(w20Var.f18976j, null, null, null, 0, null);
                    w20Var.D = a2;
                    if (a2 != null) {
                        f7 = a2.f24121a[1] / this.fps;
                    } else {
                        f7 = 0.0f;
                    }
                    w20Var.F = f7;
                } else {
                    return;
                }
            } else if ((b10 & 4) != 0) {
                w20Var.K = false;
                s5 s5Var = new s5(new File(w20Var.f18976j), true, 0L, 0, null, null, null, 0L, e20.f15506s0, true, 512, 512, null, 0, true);
                w20Var.J = s5Var;
                w20Var.F = s5Var.d[5] / this.fps;
                w20Var.E = 1.0f;
                s5Var.r(true);
            } else {
                String str = w20Var.f18976j;
                if (!TextUtils.isEmpty(w20Var.f18986t) && (w20Var.f18971b & 16) != 0) {
                    str = w20Var.f18986t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (w20Var.f18970a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                w20Var.G = decodeFile;
                if (w20Var.f18970a == 2 && decodeFile != null) {
                    w20Var.f18985s = i0.L(12.0f) / Math.min(w20Var.f18983q, w20Var.f18984r);
                    Pair N0 = i0.N0(w20Var.f18976j);
                    w20Var.e = (float) (w20Var.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f10 = w20Var.f18972c;
                        float f11 = w20Var.f18973f;
                        float f12 = (f11 / 2.0f) + f10;
                        float f13 = w20Var.d;
                        float f14 = w20Var.f18974g;
                        float f15 = (f14 / 2.0f) + f13;
                        float f16 = this.W;
                        float f17 = this.H;
                        float f18 = (f11 * f16) / f17;
                        float f19 = (f14 * f17) / f16;
                        w20Var.f18973f = f19;
                        w20Var.f18974g = f18;
                        w20Var.f18972c = f12 - (f19 / 2.0f);
                        w20Var.d = f15 - (f18 / 2.0f);
                    }
                    applyRoundRadius(w20Var, w20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / w20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f20 = w20Var.f18974g;
                        float f21 = f20 / width;
                        w20Var.d = c3.i0.B(f20, f21, 2.0f, w20Var.d);
                        w20Var.f18974g = f21;
                    } else if (width < 1.0f) {
                        float f22 = w20Var.f18973f;
                        float f23 = width * f22;
                        w20Var.f18972c = c3.i0.B(f22, f23, 2.0f, w20Var.f18972c);
                        w20Var.f18973f = f23;
                    }
                }
            }
            setupMatrix(w20Var);
        }

        private void initTextEntity(final w20 w20Var) {
            int i10;
            int i11;
            int i12;
            h6[] h6VarArr;
            Typeface d;
            final jg.b bVar = new jg.b(w0.f18945b);
            bVar.getPaint().setAntiAlias(true);
            bVar.G = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(i0.L(7.0f), i0.L(7.0f), i0.L(7.0f), i0.L(7.0f));
            h0 h0Var = w20Var.f18980n;
            if (h0Var != null && (d = h0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, w20Var.f18979m);
            SpannableString spannableString = new SpannableString(w20Var.f18976j);
            ArrayList arrayList = w20Var.f18977k;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                int i14 = i13 + 1;
                final v20 v20Var = (v20) arrayList.get(i13);
                if (v20Var.f18585a != null) {
                    w20 w20Var2 = new w20();
                    v20Var.f18586b = w20Var2;
                    w20Var2.f18976j = v20Var.f18585a;
                    w20Var2.f18971b = v20Var.f18587c;
                    o5 o5Var = new o5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i15, int i16, float f7, int i17, int i18, int i19, Paint paint) {
                            super.draw(canvas, charSequence, i15, i16, f7, i17, i18, i19, paint);
                            w20 w20Var3 = w20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f7)) / w20Var3.f18983q) * w20Var3.f18973f) + w20Var.f18972c;
                            float f10 = w20Var3.d;
                            w20 w20Var4 = w20Var;
                            float f11 = w20Var4.f18974g;
                            float paddingTop = (((((i19 - i17) / 2.0f) + (bVar.getPaddingTop() + i17)) / w20Var4.f18984r) * f11) + f10;
                            if (w20Var4.e != 0.0f) {
                                float f12 = (w20Var4.f18973f / 2.0f) + w20Var4.f18972c;
                                float f13 = (f11 / 2.0f) + w20Var4.d;
                                float f14 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d10 = paddingLeft - f12;
                                double d11 = (paddingTop - f13) / f14;
                                paddingLeft = ((float) ((Math.cos(-w20Var.e) * d10) - (Math.sin(-w20Var.e) * d11))) + f12;
                                paddingTop = (((float) i0.a.c(-w20Var.e, d11, Math.sin(-w20Var.e) * d10)) * f14) + f13;
                            }
                            w20 w20Var5 = v20Var.f18586b;
                            int i20 = this.measuredSize;
                            w20 w20Var6 = w20Var;
                            float f15 = (i20 / w20Var6.f18983q) * w20Var6.f18973f;
                            w20Var5.f18973f = f15;
                            float f16 = (i20 / w20Var6.f18984r) * w20Var6.f18974g;
                            w20Var5.f18974g = f16;
                            w20Var5.f18972c = paddingLeft - (f15 / 2.0f);
                            w20Var5.d = paddingTop - (f16 / 2.0f);
                            w20Var5.e = w20Var6.e;
                            if (w20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(w20Var5);
                            }
                        }
                    };
                    int i15 = v20Var.offset;
                    spannableString.setSpan(o5Var, i15, v20Var.length + i15, 33);
                }
                i13 = i14;
            }
            CharSequence m10 = k6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (h6VarArr = (h6[]) ((Spanned) m10).getSpans(0, m10.length(), h6.class)) != null) {
                for (h6 h6Var : h6VarArr) {
                    h6Var.f16025b = 0.85f;
                }
            }
            bVar.setText(m10);
            bVar.setTextColor(w20Var.f18978l);
            int i16 = w20Var.f18982p;
            if (i16 != 1) {
                if (i16 != 2) {
                    i10 = 19;
                } else {
                    i10 = 21;
                }
            } else {
                i10 = 17;
            }
            bVar.setGravity(i10);
            int i17 = w20Var.f18982p;
            if (i17 != 1) {
                if (i17 == 2 ? !dd.X : dd.X) {
                    i11 = 3;
                } else {
                    i11 = 2;
                }
            } else {
                i11 = 4;
            }
            bVar.setTextAlignment(i11);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(268435456);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | 16384);
            setBreakStrategy(bVar);
            byte b10 = w20Var.f18971b;
            int i18 = -1;
            if (b10 == 0) {
                bVar.setFrameColor(w20Var.f18978l);
                if (i0.B(w20Var.f18978l) >= 0.721f) {
                    i18 = -16777216;
                }
                bVar.setTextColor(i18);
            } else if (b10 == 1) {
                if (i0.B(w20Var.f18978l) >= 0.25f) {
                    i12 = -1728053248;
                } else {
                    i12 = -1711276033;
                }
                bVar.setFrameColor(i12);
                bVar.setTextColor(w20Var.f18978l);
            } else if (b10 == 2) {
                if (i0.B(w20Var.f18978l) >= 0.25f) {
                    i18 = -16777216;
                }
                bVar.setFrameColor(i18);
                bVar.setTextColor(w20Var.f18978l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(w20Var.f18978l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(w20Var.f18983q, 1073741824), View.MeasureSpec.makeMeasureSpec(w20Var.f18984r, 1073741824));
            bVar.layout(0, 0, w20Var.f18983q, w20Var.f18984r);
            w20Var.G = Bitmap.createBitmap(w20Var.f18983q, w20Var.f18984r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(w20Var.G));
            setupMatrix(w20Var);
        }

        private void setupMatrix(w20 w20Var) {
            s5 s5Var;
            Matrix matrix = new Matrix();
            w20Var.H = matrix;
            Bitmap bitmap = w20Var.G;
            if (bitmap == null && (s5Var = w20Var.J) != null) {
                p5 p5Var = s5Var.f30206w;
                bitmap = p5Var != null ? p5Var.f29357b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (w20Var.f18970a != 1 && (w20Var.f18971b & 2) != 0) {
                w20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            w20Var.H.postScale(w20Var.f18973f * this.W, w20Var.f18974g * this.H);
            w20Var.H.postTranslate(w20Var.f18972c * this.W, w20Var.d * this.H);
            w20Var.H.postRotate((float) (((-w20Var.e) / 3.141592653589793d) * 180.0d), ((w20Var.f18973f / 2.0f) + w20Var.f18972c) * this.W, ((w20Var.f18974g / 2.0f) + w20Var.d) * this.H);
        }

        public void draw(Canvas canvas, int i10) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j10 = (1000000000 / this.fps) * i10;
            int size = this.mediaEntities.size();
            for (int i11 = 0; i11 < size; i11++) {
                w20 w20Var = this.mediaEntities.get(i11);
                drawEntity(canvas, w20Var, w20Var.f18978l, j10);
            }
            canvas.restore();
        }

        public void setBreakStrategy(jg.b bVar) {
            bVar.setBreakStrategy(0);
        }
    }

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    private static native long createEncoder(String str, int i10, int i11, int i12, long j10);

    public static native void stop(long j10);

    private static native boolean writeFrame(long j10, ByteBuffer byteBuffer, int i10, int i11);
}
