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
import org.telegram.messenger.c20;
import org.telegram.messenger.d20;
import org.telegram.messenger.g0;
import org.telegram.messenger.g6;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.k10;
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
        private final ArrayList<d20> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<d20> arrayList = new ArrayList<>();
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
                d20 d20Var = this.mediaEntities.get(i11);
                byte b10 = d20Var.f23478a;
                if (b10 != 0 && b10 != 2 && b10 != 5) {
                    if (b10 == 1) {
                        initTextEntity(d20Var);
                    }
                } else {
                    initStickerEntity(d20Var);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(d20 d20Var, Bitmap bitmap, int i7) {
            if (bitmap != null && d20Var != null) {
                if (d20Var.f23494s != 0.0f || i7 != 0) {
                    if (d20Var.L == null) {
                        d20Var.L = new Canvas(bitmap);
                    }
                    if (d20Var.f23494s != 0.0f) {
                        if (this.path == null) {
                            this.path = new Path();
                        }
                        if (this.xRefPaint == null) {
                            Paint paint = new Paint(1);
                            this.xRefPaint = paint;
                            paint.setColor(-16777216);
                            this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * d20Var.f23494s;
                        this.path.rewind();
                        this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                        this.path.toggleInverseFillType();
                        d20Var.L.drawPath(this.path, this.xRefPaint);
                    }
                    if (i7 != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i7);
                        d20Var.L.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, d20 d20Var, int i7, long j3) {
            d20 d20Var2;
            Canvas canvas2;
            long j10;
            Bitmap bitmap;
            RLottieNative rLottieNative = d20Var.D;
            int i10 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = d20Var.G;
                if (bitmap2 != null && d20Var.U > 0 && d20Var.V > 0) {
                    rLottieNative.c((int) d20Var.E, bitmap2, true);
                    Bitmap bitmap3 = d20Var.G;
                    if ((d20Var.f23479b & 8) == 0) {
                        i7 = 0;
                    }
                    applyRoundRadius(d20Var, bitmap3, i7);
                    canvas.drawBitmap(d20Var.G, d20Var.H, this.bitmapPaint);
                    float f10 = d20Var.E + d20Var.F;
                    d20Var.E = f10;
                    if (f10 >= d20Var.D.f33085a[0]) {
                        d20Var.E = 0.0f;
                    }
                }
            } else if (d20Var.J != null) {
                float f11 = d20Var.E;
                int i11 = (int) f11;
                float f12 = f11 + d20Var.F;
                d20Var.E = f12;
                for (int i12 = (int) f12; i11 != i12; i12--) {
                    d20Var.J.r(true);
                }
                z5 z5Var = d20Var.J.f34096w;
                if (z5Var != null) {
                    bitmap = z5Var.f42682b;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, d20Var.H, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(d20Var.G, d20Var.H, this.bitmapPaint);
                ArrayList arrayList = d20Var.f23486k;
                if (arrayList != null && !arrayList.isEmpty()) {
                    while (i10 < d20Var.f23486k.size()) {
                        c20 c20Var = (c20) d20Var.f23486k.get(i10);
                        if (c20Var == null || (d20Var2 = c20Var.f23220b) == null) {
                            canvas2 = canvas;
                            j10 = j3;
                        } else {
                            canvas2 = canvas;
                            j10 = j3;
                            drawEntity(canvas2, d20Var2, d20Var.f23487l, j10);
                        }
                        i10++;
                        canvas = canvas2;
                        j3 = j10;
                    }
                }
            }
        }

        public void initStickerEntity(d20 d20Var) {
            int i7;
            float f10;
            int i10 = (int) (d20Var.f23482f * this.W);
            d20Var.U = i10;
            int i11 = (int) (d20Var.f23483g * this.H);
            d20Var.V = i11;
            if (i10 > 512) {
                d20Var.V = (int) ((i11 / i10) * 512.0f);
                d20Var.U = 512;
            }
            int i12 = d20Var.V;
            if (i12 > 512) {
                d20Var.U = (int) ((d20Var.U / i12) * 512.0f);
                d20Var.V = 512;
            }
            byte b10 = d20Var.f23479b;
            if ((b10 & 1) != 0) {
                int i13 = d20Var.U;
                if (i13 > 0 && (i7 = d20Var.V) > 0) {
                    d20Var.G = Bitmap.createBitmap(i13, i7, Bitmap.Config.ARGB_8888);
                    RLottieNative a10 = RLottieNative.a(d20Var.f23485j, null, null, null, 0, null);
                    d20Var.D = a10;
                    if (a10 != null) {
                        f10 = a10.f33085a[1] / this.fps;
                    } else {
                        f10 = 0.0f;
                    }
                    d20Var.F = f10;
                } else {
                    return;
                }
            } else if ((b10 & 4) != 0) {
                d20Var.K = false;
                c6 c6Var = new c6(new File(d20Var.f23485j), true, 0L, 0, null, null, null, 0L, k10.f24968t0, true, 512, 512, null, 0, true);
                d20Var.J = c6Var;
                d20Var.F = c6Var.d[5] / this.fps;
                d20Var.E = 1.0f;
                c6Var.r(true);
            } else {
                String str = d20Var.f23485j;
                if (!TextUtils.isEmpty(d20Var.f23495t) && (d20Var.f23479b & 16) != 0) {
                    str = d20Var.f23495t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (d20Var.f23478a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                d20Var.G = decodeFile;
                if (d20Var.f23478a == 2 && decodeFile != null) {
                    d20Var.f23494s = g0.L(12.0f) / Math.min(d20Var.f23492q, d20Var.f23493r);
                    Pair N0 = g0.N0(d20Var.f23485j);
                    d20Var.f23481e = (float) (d20Var.f23481e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f11 = d20Var.f23480c;
                        float f12 = d20Var.f23482f;
                        float f13 = (f12 / 2.0f) + f11;
                        float f14 = d20Var.d;
                        float f15 = d20Var.f23483g;
                        float f16 = (f15 / 2.0f) + f14;
                        float f17 = this.W;
                        float f18 = this.H;
                        float f19 = (f12 * f17) / f18;
                        float f20 = (f15 * f18) / f17;
                        d20Var.f23482f = f20;
                        d20Var.f23483g = f19;
                        d20Var.f23480c = f13 - (f20 / 2.0f);
                        d20Var.d = f16 - (f19 / 2.0f);
                    }
                    applyRoundRadius(d20Var, d20Var.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / d20Var.G.getHeight();
                    if (width > 1.0f) {
                        float f21 = d20Var.f23483g;
                        float f22 = f21 / width;
                        d20Var.d = e2.A(f21, f22, 2.0f, d20Var.d);
                        d20Var.f23483g = f22;
                    } else if (width < 1.0f) {
                        float f23 = d20Var.f23482f;
                        float f24 = width * f23;
                        d20Var.f23480c = e2.A(f23, f24, 2.0f, d20Var.f23480c);
                        d20Var.f23482f = f24;
                    }
                }
            }
            setupMatrix(d20Var);
        }

        private void initTextEntity(final d20 d20Var) {
            int i7;
            int i10;
            int i11;
            g6[] g6VarArr;
            Typeface d;
            final tg.b bVar = new tg.b(t0.f26931b);
            bVar.getPaint().setAntiAlias(true);
            bVar.H = false;
            bVar.setBackgroundColor(0);
            bVar.setPadding(g0.L(7.0f), g0.L(7.0f), g0.L(7.0f), g0.L(7.0f));
            a0 a0Var = d20Var.f23489n;
            if (a0Var != null && (d = a0Var.d()) != null) {
                bVar.setTypeface(d);
            }
            bVar.setTextSize(0, d20Var.f23488m);
            SpannableString spannableString = new SpannableString(d20Var.f23485j);
            ArrayList arrayList = d20Var.f23486k;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                int i13 = i12 + 1;
                final c20 c20Var = (c20) arrayList.get(i12);
                if (c20Var.f23219a != null) {
                    d20 d20Var2 = new d20();
                    c20Var.f23220b = d20Var2;
                    d20Var2.f23485j = c20Var.f23219a;
                    d20Var2.f23479b = c20Var.f23221c;
                    y5 y5Var = new y5(0L, 1.0f, bVar.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i14, int i15, float f10, int i16, int i17, int i18, Paint paint) {
                            super.draw(canvas, charSequence, i14, i15, f10, i16, i17, i18, paint);
                            d20 d20Var3 = d20Var;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (bVar.getPaddingLeft() + f10)) / d20Var3.f23492q) * d20Var3.f23482f) + d20Var.f23480c;
                            float f11 = d20Var3.d;
                            d20 d20Var4 = d20Var;
                            float f12 = d20Var4.f23483g;
                            float paddingTop = (((((i18 - i16) / 2.0f) + (bVar.getPaddingTop() + i16)) / d20Var4.f23493r) * f12) + f11;
                            if (d20Var4.f23481e != 0.0f) {
                                float f13 = (d20Var4.f23482f / 2.0f) + d20Var4.f23480c;
                                float f14 = (f12 / 2.0f) + d20Var4.d;
                                float f15 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d2 = paddingLeft - f13;
                                double d10 = (paddingTop - f14) / f15;
                                paddingLeft = ((float) ((Math.cos(-d20Var.f23481e) * d2) - (Math.sin(-d20Var.f23481e) * d10))) + f13;
                                paddingTop = (((float) i5.c.c(-d20Var.f23481e, d10, Math.sin(-d20Var.f23481e) * d2)) * f15) + f14;
                            }
                            d20 d20Var5 = c20Var.f23220b;
                            int i19 = this.measuredSize;
                            d20 d20Var6 = d20Var;
                            float f16 = (i19 / d20Var6.f23492q) * d20Var6.f23482f;
                            d20Var5.f23482f = f16;
                            float f17 = (i19 / d20Var6.f23493r) * d20Var6.f23483g;
                            d20Var5.f23483g = f17;
                            d20Var5.f23480c = paddingLeft - (f16 / 2.0f);
                            d20Var5.d = paddingTop - (f17 / 2.0f);
                            d20Var5.f23481e = d20Var6.f23481e;
                            if (d20Var5.G == null) {
                                FrameDrawer.this.initStickerEntity(d20Var5);
                            }
                        }
                    };
                    int i14 = c20Var.offset;
                    spannableString.setSpan(y5Var, i14, c20Var.length + i14, 33);
                }
                i12 = i13;
            }
            CharSequence m10 = j6.m(spannableString, bVar.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m10 instanceof Spanned) && (g6VarArr = (g6[]) ((Spanned) m10).getSpans(0, m10.length(), g6.class)) != null) {
                for (g6 g6Var : g6VarArr) {
                    g6Var.f24095b = 0.85f;
                }
            }
            bVar.setText(m10);
            bVar.setTextColor(d20Var.f23487l);
            int i15 = d20Var.f23491p;
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
            int i16 = d20Var.f23491p;
            if (i16 != 1) {
                if (i16 == 2 ? !hd.f24444a0 : hd.f24444a0) {
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
            byte b10 = d20Var.f23479b;
            int i17 = -1;
            if (b10 == 0) {
                bVar.setFrameColor(d20Var.f23487l);
                if (g0.B(d20Var.f23487l) >= 0.721f) {
                    i17 = -16777216;
                }
                bVar.setTextColor(i17);
            } else if (b10 == 1) {
                if (g0.B(d20Var.f23487l) >= 0.25f) {
                    i11 = -1728053248;
                } else {
                    i11 = -1711276033;
                }
                bVar.setFrameColor(i11);
                bVar.setTextColor(d20Var.f23487l);
            } else if (b10 == 2) {
                if (g0.B(d20Var.f23487l) >= 0.25f) {
                    i17 = -16777216;
                }
                bVar.setFrameColor(i17);
                bVar.setTextColor(d20Var.f23487l);
            } else if (b10 == 3) {
                bVar.setFrameColor(0);
                bVar.setTextColor(d20Var.f23487l);
            }
            bVar.measure(View.MeasureSpec.makeMeasureSpec(d20Var.f23492q, 1073741824), View.MeasureSpec.makeMeasureSpec(d20Var.f23493r, 1073741824));
            bVar.layout(0, 0, d20Var.f23492q, d20Var.f23493r);
            d20Var.G = Bitmap.createBitmap(d20Var.f23492q, d20Var.f23493r, Bitmap.Config.ARGB_8888);
            bVar.draw(new Canvas(d20Var.G));
            setupMatrix(d20Var);
        }

        private void setupMatrix(d20 d20Var) {
            c6 c6Var;
            Matrix matrix = new Matrix();
            d20Var.H = matrix;
            Bitmap bitmap = d20Var.G;
            if (bitmap == null && (c6Var = d20Var.J) != null) {
                z5 z5Var = c6Var.f34096w;
                bitmap = z5Var != null ? z5Var.f42682b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (d20Var.f23478a != 1 && (d20Var.f23479b & 2) != 0) {
                d20Var.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            d20Var.H.postScale(d20Var.f23482f * this.W, d20Var.f23483g * this.H);
            d20Var.H.postTranslate(d20Var.f23480c * this.W, d20Var.d * this.H);
            d20Var.H.postRotate((float) (((-d20Var.f23481e) / 3.141592653589793d) * 180.0d), ((d20Var.f23482f / 2.0f) + d20Var.f23480c) * this.W, ((d20Var.f23483g / 2.0f) + d20Var.d) * this.H);
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
                d20 d20Var = this.mediaEntities.get(i10);
                drawEntity(canvas, d20Var, d20Var.f23487l, j3);
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
