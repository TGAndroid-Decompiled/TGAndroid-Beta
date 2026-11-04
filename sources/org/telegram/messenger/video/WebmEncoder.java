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
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.f6;
import org.telegram.messenger.g0;
import org.telegram.messenger.h10;
import org.telegram.messenger.i6;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.y10;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.t5;
import tg.b0;
public class WebmEncoder {

    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<z10> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<z10> arrayList = new ArrayList<>();
            this.mediaEntities = arrayList;
            this.clearPaint = new Paint(1);
            this.bitmapPaint = new Paint(5);
            int i3 = convertVideoParams.resultWidth;
            this.W = i3;
            int i10 = convertVideoParams.resultHeight;
            this.H = i10;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i3, i10), i3 * 0.125f, i10 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                z10 z10Var = this.mediaEntities.get(i11);
                byte b10 = z10Var.f26703a;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(z10Var);
                    }
                } else {
                    initStickerEntity(z10Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(z10 z10Var, Bitmap bitmap, int i3) {
            if (bitmap != null && z10Var != null) {
                if (z10Var.f26719s != 0.0f || i3 != 0) {
                    if (z10Var.L == null) {
                        z10Var.L = new Canvas(bitmap);
                    }
                    if (z10Var.f26719s != 0.0f) {
                        if (this.path == null) {
                            this.path = new Path();
                        }
                        if (this.xRefPaint == null) {
                            Paint paint = new Paint(1);
                            this.xRefPaint = paint;
                            paint.setColor(-16777216);
                            this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * z10Var.f26719s;
                        this.path.rewind();
                        this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                        this.path.toggleInverseFillType();
                        z10Var.L.drawPath(this.path, this.xRefPaint);
                    }
                    if (i3 != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i3);
                        z10Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, z10 z10Var, int i3, long j10) {
            z10 z10Var2;
            Canvas canvas2;
            long j11;
            Bitmap bitmap;
            RLottieNative rLottieNative = z10Var.D;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = z10Var.G;
                if (bitmap2 != null && z10Var.U > 0 && z10Var.V > 0) {
                    rLottieNative.c((int) z10Var.E, bitmap2, true);
                    Bitmap bitmap3 = z10Var.G;
                    if ((z10Var.f26704b & 8) == 0) {
                        i3 = 0;
                    }
                    applyRoundRadius(z10Var, bitmap3, i3);
                    canvas.drawBitmap(z10Var.G, z10Var.H, this.bitmapPaint);
                    float f10 = z10Var.E + z10Var.F;
                    z10Var.E = f10;
                    if (f10 >= z10Var.D.f31545a[0]) {
                        z10Var.E = 0.0f;
                    }
                }
            } else if (z10Var.J != null) {
                float f11 = z10Var.E;
                int i11 = (int) f11;
                float f12 = f11 + z10Var.F;
                z10Var.E = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    z10Var.J.r(true);
                }
                q5 q5Var = z10Var.J.f38281w;
                if (q5Var != null) {
                    bitmap = q5Var.f37346b;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, z10Var.H, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(z10Var.G, z10Var.H, this.bitmapPaint);
                ArrayList arrayList = z10Var.f26711k;
                if (arrayList != null && !arrayList.isEmpty()) {
                    while (i10 < z10Var.f26711k.size()) {
                        y10 y10Var = (y10) z10Var.f26711k.get(i10);
                        if (y10Var == null || (z10Var2 = y10Var.f26510b) == null) {
                            canvas2 = canvas;
                            j11 = j10;
                        } else {
                            canvas2 = canvas;
                            j11 = j10;
                            drawEntity(canvas2, z10Var2, z10Var.f26712l, j11);
                        }
                        i10++;
                        canvas = canvas2;
                        j10 = j11;
                    }
                }
            }
        }

        public void initStickerEntity(z10 z10Var) {
            int i3;
            float f10;
            int i10 = (int) (z10Var.f26707f * this.W);
            z10Var.U = i10;
            int i11 = (int) (z10Var.f26708g * this.H);
            z10Var.V = i11;
            if (i10 > 512) {
                z10Var.V = (int) ((i11 / i10) * 512.0f);
                z10Var.U = 512;
            }
            int i12 = z10Var.V;
            if (i12 > 512) {
                z10Var.U = (int) ((z10Var.U / i12) * 512.0f);
                z10Var.V = 512;
            }
            byte b10 = z10Var.f26704b;
            if ((b10 & 1) != 0) {
                int i13 = z10Var.U;
                if (i13 > 0 && (i3 = z10Var.V) > 0) {
                    z10Var.G = Bitmap.createBitmap(i13, i3, Bitmap.Config.ARGB_8888);
                    RLottieNative a10 = RLottieNative.a(z10Var.f26710j, null, null, null, 0, null);
                    z10Var.D = a10;
                    if (a10 != null) {
                        f10 = a10.f31545a[1] / this.fps;
                    } else {
                        f10 = 0.0f;
                    }
                    z10Var.F = f10;
                } else {
                    return;
                }
            } else if ((b10 & 4) != 0) {
                z10Var.K = false;
                t5 t5Var = new t5(new File(z10Var.f26710j), true, 0L, 0, null, null, null, 0L, h10.f22829t0, true, 512, 512, null, 0, true);
                z10Var.J = t5Var;
                z10Var.F = t5Var.d[5] / this.fps;
                z10Var.E = 1.0f;
                t5Var.r(true);
            } else {
                String str = z10Var.f26710j;
                if (!TextUtils.isEmpty(z10Var.f26720t) && (z10Var.f26704b & 16) != 0) {
                    str = z10Var.f26720t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (z10Var.f26703a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                z10Var.G = decodeFile;
                if (z10Var.f26703a == 2 && decodeFile != null) {
                    z10Var.f26719s = g0.L(12.0f) / Math.min(z10Var.f26717q, z10Var.f26718r);
                    Pair N0 = g0.N0(z10Var.f26710j);
                    z10Var.f26706e = (float) (z10Var.f26706e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f11 = z10Var.f26705c;
                        float f12 = z10Var.f26707f;
                        float f13 = (f12 / 2.0f) + f11;
                        float f14 = z10Var.d;
                        float f15 = z10Var.f26708g;
                        float f16 = (f15 / 2.0f) + f14;
                        float f17 = this.W;
                        float f18 = this.H;
                        float f19 = (f12 * f17) / f18;
                        float f20 = (f15 * f18) / f17;
                        z10Var.f26707f = f20;
                        z10Var.f26708g = f19;
                        z10Var.f26705c = f13 - (f20 / 2.0f);
                        z10Var.d = f16 - (f19 / 2.0f);
                    }
                    applyRoundRadius(z10Var, z10Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / z10Var.G.getHeight();
                    if (width > 1.0f) {
                        float f21 = z10Var.f26708g;
                        float f22 = f21 / width;
                        z10Var.d = com.google.android.recaptcha.internal.a.z(f21, f22, 2.0f, z10Var.d);
                        z10Var.f26708g = f22;
                    } else if (width < 1.0f) {
                        float f23 = z10Var.f26707f;
                        float f24 = width * f23;
                        z10Var.f26705c = com.google.android.recaptcha.internal.a.z(f23, f24, 2.0f, z10Var.f26705c);
                        z10Var.f26707f = f24;
                    }
                }
            }
            setupMatrix(z10Var);
        }

        private void initTextEntity(final z10 z10Var) {
            int i3;
            int i10;
            int i11;
            f6[] f6VarArr;
            Typeface d;
            final ug.b bVar = new ug.b(t0.f25457b);
            bVar.getPaint().setAntiAlias(true);
            bVar.H = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
            b0 b0Var = z10Var.f26714n;
            if (b0Var != null && (d = b0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, z10Var.f26713m);
            SpannableString spannableString = new SpannableString(z10Var.f26710j);
            ArrayList arrayList = z10Var.f26711k;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                final y10 y10Var = (y10) arrayList.get(i12);
                if (y10Var.f26509a != null) {
                    z10 z10Var2 = new z10();
                    y10Var.f26510b = z10Var2;
                    z10Var2.f26710j = y10Var.f26509a;
                    z10Var2.f26704b = y10Var.f26511c;
                    p5 p5Var = new p5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                            super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                            z10 z10Var3 = z10Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / z10Var3.f26717q) * z10Var3.f26707f) + z10Var.f26705c;
                            float f11 = z10Var3.d;
                            z10 z10Var4 = z10Var;
                            float f12 = z10Var4.f26708g;
                            float paddingTop = (((((i18 - i16) / 2.0f) + (bVar.getPaddingTop() + i16)) / z10Var4.f26718r) * f12) + f11;
                            if (z10Var4.f26706e != 0.0f) {
                                float f13 = (z10Var4.f26707f / 2.0f) + z10Var4.f26705c;
                                float f14 = (f12 / 2.0f) + z10Var4.d;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d10 = paddingLeft - f13;
                                double d11 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-z10Var.f26706e) * d10) - (Math.sin(-z10Var.f26706e) * d11))) + f13;
                                paddingTop = (((float) p1.c(-z10Var.f26706e, d11, Math.sin(-z10Var.f26706e) * d10)) * f15) + f14;
                            }
                            z10 z10Var5 = y10Var.f26510b;
                            int i19 = this.measuredSize;
                            z10 z10Var6 = z10Var;
                            float f16 = (i19 / z10Var6.f26717q) * z10Var6.f26707f;
                            z10Var5.f26707f = f16;
                            float f17 = (i19 / z10Var6.f26718r) * z10Var6.f26708g;
                            z10Var5.f26708g = f17;
                            z10Var5.f26705c = paddingLeft - (f16 / 2.0f);
                            z10Var5.d = paddingTop - (f17 / 2.0f);
                            z10Var5.f26706e = z10Var6.f26706e;
                            if (z10Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(z10Var5);
                            }
                        }
                    };
                    int i14 = y10Var.offset;
                    spannableString.setSpan(p5Var, i14, y10Var.length + i14, 33);
                }
                i12 = i13;
            }
            CharSequence m10 = i6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (f6VarArr = (f6[]) ((Spanned) m10).getSpans(0, m10.length(), f6.class)) != null) {
                for (f6 f6Var : f6VarArr) {
                    f6Var.f22453b = 0.85f;
                }
            }
            bVar.setText(m10);
            bVar.setTextColor(z10Var.f26712l);
            int i15 = z10Var.f26716p;
            if (i15 != 1) {
                if (i15 != 2) {
                    i3 = 19;
                } else {
                    i3 = 21;
                }
            } else {
                i3 = 17;
            }
            bVar.setGravity(i3);
            int i16 = z10Var.f26716p;
            if (i16 != 1) {
                if (i16 == 2 ? !bd.f21784a0 : bd.f21784a0) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
            } else {
                i10 = 4;
            }
            bVar.setTextAlignment(i10);
            bVar.setHorizontallyScrolling(false);
            bVar.setImeOptions(268435456);
            bVar.setFocusableInTouchMode(true);
            bVar.setInputType(bVar.getInputType() | 16384);
            setBreakStrategy(bVar);
            byte b10 = z10Var.f26704b;
            int i17 = -1;
            if (b10 == 0) {
                bVar.setFrameColor(z10Var.f26712l);
                if (g0.B(z10Var.f26712l) >= 0.721f) {
                    i17 = -16777216;
                }
                bVar.setTextColor(i17);
            } else if (b10 == 1) {
                if (g0.B(z10Var.f26712l) >= 0.25f) {
                    i11 = -1728053248;
                } else {
                    i11 = -1711276033;
                }
                bVar.setFrameColor(i11);
                bVar.setTextColor(z10Var.f26712l);
            } else if (b10 == 2) {
                if (g0.B(z10Var.f26712l) >= 0.25f) {
                    i17 = -16777216;
                }
                bVar.setFrameColor(i17);
                bVar.setTextColor(z10Var.f26712l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(z10Var.f26712l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(z10Var.f26717q, 1073741824), View.MeasureSpec.makeMeasureSpec(z10Var.f26718r, 1073741824));
            bVar.layout(0, 0, z10Var.f26717q, z10Var.f26718r);
            z10Var.G = Bitmap.createBitmap(z10Var.f26717q, z10Var.f26718r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(z10Var.G));
            setupMatrix(z10Var);
        }

        private void setupMatrix(z10 z10Var) {
            t5 t5Var;
            Matrix matrix = new Matrix();
            z10Var.H = matrix;
            Bitmap bitmap = z10Var.G;
            if (bitmap == null && (t5Var = z10Var.J) != null) {
                q5 q5Var = t5Var.f38281w;
                bitmap = q5Var != null ? q5Var.f37346b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (z10Var.f26703a != 1 && (z10Var.f26704b & 2) != 0) {
                z10Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            z10Var.H.postScale(z10Var.f26707f * this.W, z10Var.f26708g * this.H);
            z10Var.H.postTranslate(z10Var.f26705c * this.W, z10Var.d * this.H);
            z10Var.H.postRotate((float) (((-z10Var.f26706e) / 3.141592653589793d) * 180.0d), ((z10Var.f26707f / 2.0f) + z10Var.f26705c) * this.W, ((z10Var.f26708g / 2.0f) + z10Var.d) * this.H);
        }

        public void draw(Canvas canvas, int i3) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j10 = (1000000000 / this.fps) * i3;
            int size = this.mediaEntities.size();
            for (int i10 = 0; i10 < size; i10++) {
                z10 z10Var = this.mediaEntities.get(i10);
                drawEntity(canvas, z10Var, z10Var.f26712l, j10);
            }
            canvas.restore();
        }

        public void setBreakStrategy(ug.b bVar) {
            bVar.setBreakStrategy(0);
        }
    }

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    private static native long createEncoder(String str, int i3, int i10, int i11, long j10);

    public static native void stop(long j10);

    private static native boolean writeFrame(long j10, ByteBuffer byteBuffer, int i3, int i10);
}
