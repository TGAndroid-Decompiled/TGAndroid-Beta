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
import org.telegram.messenger.b20;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.j6;
import org.telegram.messenger.t0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.z5;
import sg.a0;
public class WebmEncoder {

    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<c20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<c20> arrayList = new ArrayList<>();
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
                c20 c20Var = this.mediaEntities.get(i11);
                byte b10 = c20Var.f23257a;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(c20Var);
                    }
                } else {
                    initStickerEntity(c20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(c20 c20Var, Bitmap bitmap, int i7) {
            if (bitmap != null && c20Var != null) {
                if (c20Var.f23273s != 0.0f || i7 != 0) {
                    if (c20Var.L == null) {
                        c20Var.L = new Canvas(bitmap);
                    }
                    if (c20Var.f23273s != 0.0f) {
                        if (this.path == null) {
                            this.path = new Path();
                        }
                        if (this.xRefPaint == null) {
                            Paint paint = new Paint(1);
                            this.xRefPaint = paint;
                            paint.setColor(-16777216);
                            this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * c20Var.f23273s;
                        this.path.rewind();
                        this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                        this.path.toggleInverseFillType();
                        c20Var.L.drawPath(this.path, this.xRefPaint);
                    }
                    if (i7 != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i7);
                        c20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, c20 c20Var, int i7, long j3) {
            c20 c20Var2;
            Canvas canvas2;
            long j10;
            Bitmap bitmap;
            RLottieNative rLottieNative = c20Var.D;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = c20Var.G;
                if (bitmap2 != null && c20Var.U > 0 && c20Var.V > 0) {
                    rLottieNative.c((int) c20Var.E, bitmap2, true);
                    Bitmap bitmap3 = c20Var.G;
                    if ((c20Var.f23258b & 8) == 0) {
                        i7 = 0;
                    }
                    applyRoundRadius(c20Var, bitmap3, i7);
                    canvas.drawBitmap(c20Var.G, c20Var.H, this.bitmapPaint);
                    float f10 = c20Var.E + c20Var.F;
                    c20Var.E = f10;
                    if (f10 >= c20Var.D.f33082a[0]) {
                        c20Var.E = 0.0f;
                    }
                }
            } else if (c20Var.J != null) {
                float f11 = c20Var.E;
                int i11 = (int) f11;
                float f12 = f11 + c20Var.F;
                c20Var.E = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    c20Var.J.r(true);
                }
                z5 z5Var = c20Var.J.f34102w;
                if (z5Var != null) {
                    bitmap = z5Var.f42679b;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, c20Var.H, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(c20Var.G, c20Var.H, this.bitmapPaint);
                ArrayList arrayList = c20Var.f23265k;
                if (arrayList != null && !arrayList.isEmpty()) {
                    while (i10 < c20Var.f23265k.size()) {
                        b20 b20Var = (b20) c20Var.f23265k.get(i10);
                        if (b20Var == null || (c20Var2 = b20Var.f23048b) == null) {
                            canvas2 = canvas;
                            j10 = j3;
                        } else {
                            canvas2 = canvas;
                            j10 = j3;
                            drawEntity(canvas2, c20Var2, c20Var.f23266l, j10);
                        }
                        i10++;
                        canvas = canvas2;
                        j3 = j10;
                    }
                }
            }
        }

        public void initStickerEntity(c20 c20Var) {
            int i7;
            float f10;
            int i10 = (int) (c20Var.f23261f * this.W);
            c20Var.U = i10;
            int i11 = (int) (c20Var.f23262g * this.H);
            c20Var.V = i11;
            if (i10 > 512) {
                c20Var.V = (int) ((i11 / i10) * 512.0f);
                c20Var.U = 512;
            }
            int i12 = c20Var.V;
            if (i12 > 512) {
                c20Var.U = (int) ((c20Var.U / i12) * 512.0f);
                c20Var.V = 512;
            }
            byte b10 = c20Var.f23258b;
            if ((b10 & 1) != 0) {
                int i13 = c20Var.U;
                if (i13 > 0 && (i7 = c20Var.V) > 0) {
                    c20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                    RLottieNative a10 = RLottieNative.a(c20Var.f23264j, null, null, null, 0, null);
                    c20Var.D = a10;
                    if (a10 != null) {
                        f10 = a10.f33082a[1] / this.fps;
                    } else {
                        f10 = 0.0f;
                    }
                    c20Var.F = f10;
                } else {
                    return;
                }
            } else if ((b10 & 4) != 0) {
                c20Var.K = false;
                c6 c6Var = new c6(new File(c20Var.f23264j), true, 0L, 0, null, null, null, 0L, j10.f24798t0, true, 512, 512, null, 0, true);
                c20Var.J = c6Var;
                c20Var.F = c6Var.d[5] / this.fps;
                c20Var.E = 1.0f;
                c6Var.r(true);
            } else {
                String str = c20Var.f23264j;
                if (!TextUtils.isEmpty(c20Var.f23274t) && (c20Var.f23258b & 16) != 0) {
                    str = c20Var.f23274t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (c20Var.f23257a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                c20Var.G = decodeFile;
                if (c20Var.f23257a == 2 && decodeFile != null) {
                    c20Var.f23273s = g0.L(12.0f) / Math.min(c20Var.f23271q, c20Var.f23272r);
                    Pair N0 = g0.N0(c20Var.f23264j);
                    c20Var.f23260e = (float) (c20Var.f23260e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f11 = c20Var.f23259c;
                        float f12 = c20Var.f23261f;
                        float f13 = (f12 / 2.0f) + f11;
                        float f14 = c20Var.d;
                        float f15 = c20Var.f23262g;
                        float f16 = (f15 / 2.0f) + f14;
                        float f17 = this.W;
                        float f18 = this.H;
                        float f19 = (f12 * f17) / f18;
                        float f20 = (f15 * f18) / f17;
                        c20Var.f23261f = f20;
                        c20Var.f23262g = f19;
                        c20Var.f23259c = f13 - (f20 / 2.0f);
                        c20Var.d = f16 - (f19 / 2.0f);
                    }
                    applyRoundRadius(c20Var, c20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / c20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f21 = c20Var.f23262g;
                        float f22 = f21 / width;
                        c20Var.d = e2.A(f21, f22, 2.0f, c20Var.d);
                        c20Var.f23262g = f22;
                    } else if (width < 1.0f) {
                        float f23 = c20Var.f23261f;
                        float f24 = width * f23;
                        c20Var.f23259c = e2.A(f23, f24, 2.0f, c20Var.f23259c);
                        c20Var.f23261f = f24;
                    }
                }
            }
            setupMatrix(c20Var);
        }

        private void initTextEntity(final c20 c20Var) {
            int i7;
            int i10;
            int i11;
            g6[] g6VarArr;
            Typeface d;
            final tg.b bVar = new tg.b(t0.f26941b);
            bVar.getPaint().setAntiAlias(true);
            bVar.H = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
            a0 a0Var = c20Var.f23268n;
            if (a0Var != null && (d = a0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, c20Var.f23267m);
            SpannableString spannableString = new SpannableString(c20Var.f23264j);
            ArrayList arrayList = c20Var.f23265k;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                final b20 b20Var = (b20) arrayList.get(i12);
                if (b20Var.f23047a != null) {
                    c20 c20Var2 = new c20();
                    b20Var.f23048b = c20Var2;
                    c20Var2.f23264j = b20Var.f23047a;
                    c20Var2.f23258b = b20Var.f23049c;
                    y5 y5Var = new y5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                            super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                            c20 c20Var3 = c20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / c20Var3.f23271q) * c20Var3.f23261f) + c20Var.f23259c;
                            float f11 = c20Var3.d;
                            c20 c20Var4 = c20Var;
                            float f12 = c20Var4.f23262g;
                            float paddingTop = (((((i18 - i16) / 2.0f) + (bVar.getPaddingTop() + i16)) / c20Var4.f23272r) * f12) + f11;
                            if (c20Var4.f23260e != 0.0f) {
                                float f13 = (c20Var4.f23261f / 2.0f) + c20Var4.f23259c;
                                float f14 = (f12 / 2.0f) + c20Var4.d;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d2 = paddingLeft - f13;
                                double d10 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-c20Var.f23260e) * d2) - (Math.sin(-c20Var.f23260e) * d10))) + f13;
                                paddingTop = (((float) i5.c.c(-c20Var.f23260e, d10, Math.sin(-c20Var.f23260e) * d2)) * f15) + f14;
                            }
                            c20 c20Var5 = b20Var.f23048b;
                            int i19 = this.measuredSize;
                            c20 c20Var6 = c20Var;
                            float f16 = (i19 / c20Var6.f23271q) * c20Var6.f23261f;
                            c20Var5.f23261f = f16;
                            float f17 = (i19 / c20Var6.f23272r) * c20Var6.f23262g;
                            c20Var5.f23262g = f17;
                            c20Var5.f23259c = paddingLeft - (f16 / 2.0f);
                            c20Var5.d = paddingTop - (f17 / 2.0f);
                            c20Var5.f23260e = c20Var6.f23260e;
                            if (c20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(c20Var5);
                            }
                        }
                    };
                    int i14 = b20Var.offset;
                    spannableString.setSpan(y5Var, i14, b20Var.length + i14, 33);
                }
                i12 = i13;
            }
            CharSequence m10 = j6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                for (g6 g6Var : g6VarArr) {
                    g6Var.f24201b = 0.85f;
                }
            }
            bVar.setText(m10);
            bVar.setTextColor(c20Var.f23266l);
            int i15 = c20Var.f23270p;
            if (i15 != 1) {
                if (i15 != 2) {
                    i7 = 19;
                } else {
                    i7 = 21;
                }
            } else {
                i7 = 17;
            }
            bVar.setGravity(i7);
            int i16 = c20Var.f23270p;
            if (i16 != 1) {
                if (i16 == 2 ? !gd.f24241a0 : gd.f24241a0) {
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
            byte b10 = c20Var.f23258b;
            int i17 = -1;
            if (b10 == 0) {
                bVar.setFrameColor(c20Var.f23266l);
                if (g0.B(c20Var.f23266l) >= 0.721f) {
                    i17 = -16777216;
                }
                bVar.setTextColor(i17);
            } else if (b10 == 1) {
                if (g0.B(c20Var.f23266l) >= 0.25f) {
                    i11 = -1728053248;
                } else {
                    i11 = -1711276033;
                }
                bVar.setFrameColor(i11);
                bVar.setTextColor(c20Var.f23266l);
            } else if (b10 == 2) {
                if (g0.B(c20Var.f23266l) >= 0.25f) {
                    i17 = -16777216;
                }
                bVar.setFrameColor(i17);
                bVar.setTextColor(c20Var.f23266l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(c20Var.f23266l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(c20Var.f23271q, 1073741824), View.MeasureSpec.makeMeasureSpec(c20Var.f23272r, 1073741824));
            bVar.layout(0, 0, c20Var.f23271q, c20Var.f23272r);
            c20Var.G = Bitmap.createBitmap(c20Var.f23271q, c20Var.f23272r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(c20Var.G));
            setupMatrix(c20Var);
        }

        private void setupMatrix(c20 c20Var) {
            c6 c6Var;
            Matrix matrix = new Matrix();
            c20Var.H = matrix;
            Bitmap bitmap = c20Var.G;
            if (bitmap == null && (c6Var = c20Var.J) != null) {
                z5 z5Var = c6Var.f34102w;
                bitmap = z5Var != null ? z5Var.f42679b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (c20Var.f23257a != 1 && (c20Var.f23258b & 2) != 0) {
                c20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            c20Var.H.postScale(c20Var.f23261f * this.W, c20Var.f23262g * this.H);
            c20Var.H.postTranslate(c20Var.f23259c * this.W, c20Var.d * this.H);
            c20Var.H.postRotate((float) (((-c20Var.f23260e) / 3.141592653589793d) * 180.0d), ((c20Var.f23261f / 2.0f) + c20Var.f23259c) * this.W, ((c20Var.f23262g / 2.0f) + c20Var.d) * this.H);
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
                c20 c20Var = this.mediaEntities.get(i10);
                drawEntity(canvas, c20Var, c20Var.f23266l, j3);
            }
            canvas.restore();
        }

        public void setBreakStrategy(tg.b bVar) {
            bVar.setBreakStrategy(0);
        }
    }

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    private static native long createEncoder(String str, int i7, int i10, int i11, long j3);

    public static native void stop(long j3);

    private static native boolean writeFrame(long j3, ByteBuffer byteBuffer, int i7, int i10);
}
