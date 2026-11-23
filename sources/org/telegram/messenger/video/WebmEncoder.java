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
import com.google.android.gms.internal.vision.e2;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.j6;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.b6;
import org.telegram.ui.Components.x5;
import org.telegram.ui.Components.y5;
import sg.a0;
public class WebmEncoder {

    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<b20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<b20> arrayList = new ArrayList<>();
            this.mediaEntities = arrayList;
            this.clearPaint = new Paint(1);
            this.bitmapPaint = new Paint(5);
            int i7 = convertVideoParams.resultWidth;
            this.W = i7;
            int i10 = convertVideoParams.resultHeight;
            this.H = i10;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i7, i10), i7 * 0.125f, i10 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                b20 b20Var = this.mediaEntities.get(i11);
                byte b10 = b20Var.f23124a;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(b20Var);
                    }
                } else {
                    initStickerEntity(b20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(b20 b20Var, Bitmap bitmap, int i7) {
            if (bitmap != null && b20Var != null) {
                if (b20Var.f23141s != 0.0f || i7 != 0) {
                    if (b20Var.M == null) {
                        b20Var.M = new Canvas(bitmap);
                    }
                    if (b20Var.f23141s != 0.0f) {
                        if (this.path == null) {
                            this.path = new Path();
                        }
                        if (this.xRefPaint == null) {
                            Paint paint = new Paint(1);
                            this.xRefPaint = paint;
                            paint.setColor(-16777216);
                            this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * b20Var.f23141s;
                        this.path.rewind();
                        this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                        this.path.toggleInverseFillType();
                        b20Var.M.drawPath(this.path, this.xRefPaint);
                    }
                    if (i7 != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i7);
                        b20Var.M.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, b20 b20Var, int i7, long j3) {
            b20 b20Var2;
            Canvas canvas2;
            long j10;
            Bitmap bitmap;
            RLottieNative rLottieNative = b20Var.D;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = b20Var.G;
                if (bitmap2 != null && b20Var.Y > 0 && b20Var.Z > 0) {
                    rLottieNative.c((int) b20Var.E, bitmap2, true);
                    Bitmap bitmap3 = b20Var.G;
                    if ((b20Var.f23126b & 8) == 0) {
                        i7 = 0;
                    }
                    applyRoundRadius(b20Var, bitmap3, i7);
                    canvas.drawBitmap(b20Var.G, b20Var.H, this.bitmapPaint);
                    float f10 = b20Var.E + b20Var.F;
                    b20Var.E = f10;
                    if (f10 >= b20Var.D.f33149a[0]) {
                        b20Var.E = 0.0f;
                    }
                }
            } else if (b20Var.K != null) {
                float f11 = b20Var.E;
                int i11 = (int) f11;
                float f12 = f11 + b20Var.F;
                b20Var.E = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    b20Var.K.r(true);
                }
                y5 y5Var = b20Var.K.f33665w;
                if (y5Var != null) {
                    bitmap = y5Var.f42358b;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, b20Var.H, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(b20Var.G, b20Var.H, this.bitmapPaint);
                ArrayList arrayList = b20Var.f23133k;
                if (arrayList != null && !arrayList.isEmpty()) {
                    while (i10 < b20Var.f23133k.size()) {
                        a20 a20Var = (a20) b20Var.f23133k.get(i10);
                        if (a20Var == null || (b20Var2 = a20Var.f22924b) == null) {
                            canvas2 = canvas;
                            j10 = j3;
                        } else {
                            canvas2 = canvas;
                            j10 = j3;
                            drawEntity(canvas2, b20Var2, b20Var.f23134l, j10);
                        }
                        i10++;
                        canvas = canvas2;
                        j3 = j10;
                    }
                }
            }
        }

        public void initStickerEntity(b20 b20Var) {
            int i7;
            float f10;
            int i10 = (int) (b20Var.f23129f * this.W);
            b20Var.Y = i10;
            int i11 = (int) (b20Var.f23130g * this.H);
            b20Var.Z = i11;
            if (i10 > 512) {
                b20Var.Z = (int) ((i11 / i10) * 512.0f);
                b20Var.Y = 512;
            }
            int i12 = b20Var.Z;
            if (i12 > 512) {
                b20Var.Y = (int) ((b20Var.Y / i12) * 512.0f);
                b20Var.Z = 512;
            }
            byte b10 = b20Var.f23126b;
            if ((b10 & 1) != 0) {
                int i13 = b20Var.Y;
                if (i13 > 0 && (i7 = b20Var.Z) > 0) {
                    b20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                    RLottieNative a10 = RLottieNative.a(b20Var.f23132j, null, null, null, 0, null);
                    b20Var.D = a10;
                    if (a10 != null) {
                        f10 = a10.f33149a[1] / this.fps;
                    } else {
                        f10 = 0.0f;
                    }
                    b20Var.F = f10;
                } else {
                    return;
                }
            } else if ((b10 & 4) != 0) {
                b20Var.L = false;
                b6 b6Var = new b6(new File(b20Var.f23132j), true, 0L, 0, null, null, null, 0L, i10.f24637t0, true, 512, 512, null, 0, true);
                b20Var.K = b6Var;
                b20Var.F = b6Var.d[5] / this.fps;
                b20Var.E = 1.0f;
                b6Var.r(true);
            } else {
                String str = b20Var.f23132j;
                if (!TextUtils.isEmpty(b20Var.f23142t) && (b20Var.f23126b & 16) != 0) {
                    str = b20Var.f23142t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (b20Var.f23124a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                b20Var.G = decodeFile;
                if (b20Var.f23124a == 2 && decodeFile != null) {
                    b20Var.f23141s = g0.L(12.0f) / Math.min(b20Var.f23139q, b20Var.f23140r);
                    Pair N0 = g0.N0(b20Var.f23132j);
                    b20Var.f23128e = (float) (b20Var.f23128e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f11 = b20Var.f23127c;
                        float f12 = b20Var.f23129f;
                        float f13 = (f12 / 2.0f) + f11;
                        float f14 = b20Var.d;
                        float f15 = b20Var.f23130g;
                        float f16 = (f15 / 2.0f) + f14;
                        float f17 = this.W;
                        float f18 = this.H;
                        float f19 = (f12 * f17) / f18;
                        float f20 = (f15 * f18) / f17;
                        b20Var.f23129f = f20;
                        b20Var.f23130g = f19;
                        b20Var.f23127c = f13 - (f20 / 2.0f);
                        b20Var.d = f16 - (f19 / 2.0f);
                    }
                    applyRoundRadius(b20Var, b20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / b20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f21 = b20Var.f23130g;
                        float f22 = f21 / width;
                        b20Var.d = e2.A(f21, f22, 2.0f, b20Var.d);
                        b20Var.f23130g = f22;
                    } else if (width < 1.0f) {
                        float f23 = b20Var.f23129f;
                        float f24 = width * f23;
                        b20Var.f23127c = e2.A(f23, f24, 2.0f, b20Var.f23127c);
                        b20Var.f23129f = f24;
                    }
                }
            }
            setupMatrix(b20Var);
        }

        private void initTextEntity(final b20 b20Var) {
            int i7;
            int i10;
            int i11;
            g6[] g6VarArr;
            Typeface d;
            final tg.f fVar = new tg.f(t0.f27013b);
            fVar.getPaint().setAntiAlias(true);
            fVar.H = false;
            fVar.setBackgroundColor(0);
            fVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
            a0 a0Var = b20Var.f23136n;
            if (a0Var != null && (d = a0Var.d()) != null) {
                fVar.setTypeface(d);
            }
            fVar.setTextSize(0, b20Var.f23135m);
            SpannableString spannableString = new SpannableString(b20Var.f23132j);
            ArrayList arrayList = b20Var.f23133k;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                final a20 a20Var = (a20) arrayList.get(i12);
                if (a20Var.f22923a != null) {
                    b20 b20Var2 = new b20();
                    a20Var.f22924b = b20Var2;
                    b20Var2.f23132j = a20Var.f22923a;
                    b20Var2.f23126b = a20Var.f22925c;
                    x5 x5Var = new x5(0L, 1.0f, fVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                            super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                            b20 b20Var3 = b20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (fVar.getPaddingLeft() + f10)) / b20Var3.f23139q) * b20Var3.f23129f) + b20Var.f23127c;
                            float f11 = b20Var3.d;
                            b20 b20Var4 = b20Var;
                            float f12 = b20Var4.f23130g;
                            float paddingTop = (((((i18 - i16) / 2.0f) + (fVar.getPaddingTop() + i16)) / b20Var4.f23140r) * f12) + f11;
                            if (b20Var4.f23128e != 0.0f) {
                                float f13 = (b20Var4.f23129f / 2.0f) + b20Var4.f23127c;
                                float f14 = (f12 / 2.0f) + b20Var4.d;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d2 = paddingLeft - f13;
                                double d10 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-b20Var.f23128e) * d2) - (Math.sin(-b20Var.f23128e) * d10))) + f13;
                                paddingTop = (((float) i5.c.c(-b20Var.f23128e, d10, Math.sin(-b20Var.f23128e) * d2)) * f15) + f14;
                            }
                            b20 b20Var5 = a20Var.f22924b;
                            int i19 = this.measuredSize;
                            b20 b20Var6 = b20Var;
                            float f16 = (i19 / b20Var6.f23139q) * b20Var6.f23129f;
                            b20Var5.f23129f = f16;
                            float f17 = (i19 / b20Var6.f23140r) * b20Var6.f23130g;
                            b20Var5.f23130g = f17;
                            b20Var5.f23127c = paddingLeft - (f16 / 2.0f);
                            b20Var5.d = paddingTop - (f17 / 2.0f);
                            b20Var5.f23128e = b20Var6.f23128e;
                            if (b20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(b20Var5);
                            }
                        }
                    };
                    int i14 = a20Var.offset;
                    spannableString.setSpan(x5Var, i14, a20Var.length + i14, 33);
                }
                i12 = i13;
            }
            CharSequence m10 = j6.m(spannableString, fVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                for (g6 g6Var : g6VarArr) {
                    g6Var.f24275b = 0.85f;
                }
            }
            fVar.setText(m10);
            fVar.setTextColor(b20Var.f23134l);
            int i15 = b20Var.f23138p;
            if (i15 != 1) {
                if (i15 != 2) {
                    i7 = 19;
                } else {
                    i7 = 21;
                }
            } else {
                i7 = 17;
            }
            fVar.setGravity(i7);
            int i16 = b20Var.f23138p;
            if (i16 != 1) {
                if (i16 == 2 ? !gd.f24314a0 : gd.f24314a0) {
                    i10 = 3;
                } else {
                    i10 = 2;
                }
            } else {
                i10 = 4;
            }
            fVar.setTextAlignment(i10);
            fVar.setHorizontallyScrolling(false);
            fVar.setImeOptions(268435456);
            fVar.setFocusableInTouchMode(true);
            fVar.setInputType(fVar.getInputType() | 16384);
            setBreakStrategy(fVar);
            byte b10 = b20Var.f23126b;
            int i17 = -1;
            if (b10 == 0) {
                fVar.setFrameColor(b20Var.f23134l);
                if (g0.B(b20Var.f23134l) >= 0.721f) {
                    i17 = -16777216;
                }
                fVar.setTextColor(i17);
            } else if (b10 == 1) {
                if (g0.B(b20Var.f23134l) >= 0.25f) {
                    i11 = -1728053248;
                } else {
                    i11 = -1711276033;
                }
                fVar.setFrameColor(i11);
                fVar.setTextColor(b20Var.f23134l);
            } else if (b10 == 2) {
                if (g0.B(b20Var.f23134l) >= 0.25f) {
                    i17 = -16777216;
                }
                fVar.setFrameColor(i17);
                fVar.setTextColor(b20Var.f23134l);
            } else if (b10 == 3) {
                fVar.setFrameColor(0);
                fVar.setTextColor(b20Var.f23134l);
            }
            fVar.measure(View.MeasureSpec.makeMeasureSpec(b20Var.f23139q, 1073741824), View.MeasureSpec.makeMeasureSpec(b20Var.f23140r, 1073741824));
            fVar.layout(0, 0, b20Var.f23139q, b20Var.f23140r);
            b20Var.G = Bitmap.createBitmap(b20Var.f23139q, b20Var.f23140r, Bitmap.Config.ARGB_8888);
            fVar.draw(new Canvas(b20Var.G));
            setupMatrix(b20Var);
        }

        private void setupMatrix(b20 b20Var) {
            b6 b6Var;
            Matrix matrix = new Matrix();
            b20Var.H = matrix;
            Bitmap bitmap = b20Var.G;
            if (bitmap == null && (b6Var = b20Var.K) != null) {
                y5 y5Var = b6Var.f33665w;
                bitmap = y5Var != null ? y5Var.f42358b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (b20Var.f23124a != 1 && (b20Var.f23126b & 2) != 0) {
                b20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            b20Var.H.postScale(b20Var.f23129f * this.W, b20Var.f23130g * this.H);
            b20Var.H.postTranslate(b20Var.f23127c * this.W, b20Var.d * this.H);
            b20Var.H.postRotate((float) (((-b20Var.f23128e) / 3.141592653589793d) * 180.0d), ((b20Var.f23129f / 2.0f) + b20Var.f23127c) * this.W, ((b20Var.f23130g / 2.0f) + b20Var.d) * this.H);
        }

        public void draw(Canvas canvas, int i7) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j3 = (1000000000 / this.fps) * i7;
            int size = this.mediaEntities.size();
            for (int i10 = 0; i10 < size; i10++) {
                b20 b20Var = this.mediaEntities.get(i10);
                drawEntity(canvas, b20Var, b20Var.f23134l, j3);
            }
            canvas.restore();
        }

        public void setBreakStrategy(tg.f fVar) {
            fVar.setBreakStrategy(0);
        }
    }

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    private static native long createEncoder(String str, int i7, int i10, int i11, long j3);

    public static native void stop(long j3);

    private static native boolean writeFrame(long j3, ByteBuffer byteBuffer, int i7, int i10);
}
