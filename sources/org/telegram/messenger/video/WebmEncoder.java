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
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.ui.Components.RLottieNative;
public class WebmEncoder {

    public static class FrameDrawer {
        private final int H;
        private final int W;
        private final Paint bitmapPaint;
        private final Paint clearPaint;
        private final Path clipPath;
        private final int fps;
        private final ArrayList<mec> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<mec> arrayList = new ArrayList<>();
            this.mediaEntities = arrayList;
            this.clearPaint = new Paint(1);
            this.bitmapPaint = new Paint(5);
            int i = convertVideoParams.resultWidth;
            this.W = i;
            int i2 = convertVideoParams.resultHeight;
            this.H = i2;
            this.fps = convertVideoParams.framerate;
            Path path = new Path();
            this.clipPath = path;
            path.addRoundRect(new RectF(0.0f, 0.0f, i, i2), i * 0.125f, i2 * 0.125f, Path.Direction.CW);
            this.photo = BitmapFactory.decodeFile(convertVideoParams.videoPath);
            arrayList.addAll(convertVideoParams.mediaEntities);
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                mec mecVar = this.mediaEntities.get(i3);
                byte b = mecVar.a;
                if (b != 0 && b != 2 && b != 5) {
                    if (b == 1) {
                        initTextEntity(mecVar);
                    }
                } else {
                    initStickerEntity(mecVar);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(mec mecVar, Bitmap bitmap, int i) {
            if (bitmap != null && mecVar != null) {
                if (mecVar.s != 0.0f || i != 0) {
                    if (mecVar.M == null) {
                        mecVar.M = new Canvas(bitmap);
                    }
                    if (mecVar.s != 0.0f) {
                        if (this.path == null) {
                            this.path = new Path();
                        }
                        if (this.xRefPaint == null) {
                            Paint paint = new Paint(1);
                            this.xRefPaint = paint;
                            paint.setColor(-16777216);
                            this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * mecVar.s;
                        this.path.rewind();
                        this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                        this.path.toggleInverseFillType();
                        mecVar.M.drawPath(this.path, this.xRefPaint);
                    }
                    if (i != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i);
                        mecVar.M.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, mec mecVar, int i, long j) {
            FrameDrawer frameDrawer;
            Canvas canvas2;
            long j2;
            mec mecVar2;
            lm lmVar;
            Bitmap bitmap;
            RLottieNative rLottieNative = mecVar.D;
            int i2 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = mecVar.G;
                if (bitmap2 != null && mecVar.Y > 0 && mecVar.Z > 0) {
                    rLottieNative.c((int) mecVar.E, bitmap2, true);
                    Bitmap bitmap3 = mecVar.G;
                    if ((mecVar.b & 8) == 0) {
                        i = 0;
                    }
                    applyRoundRadius(mecVar, bitmap3, i);
                    canvas.drawBitmap(mecVar.G, mecVar.H, this.bitmapPaint);
                    float f = mecVar.E + mecVar.F;
                    mecVar.E = f;
                    if (f >= mecVar.D.a[0]) {
                        mecVar.E = 0.0f;
                    }
                }
            } else if (mecVar.K != null) {
                float f2 = mecVar.E;
                int i3 = (int) f2;
                float f3 = f2 + mecVar.F;
                mecVar.E = f3;
                int i4 = (int) f3;
                while (true) {
                    lmVar = mecVar.K;
                    if (i3 == i4) {
                        break;
                    }
                    lmVar.r(true);
                    i4--;
                }
                im imVar = lmVar.w;
                if (imVar != null) {
                    bitmap = imVar.b;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, mecVar.H, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(mecVar.G, mecVar.H, this.bitmapPaint);
                ArrayList arrayList = mecVar.k;
                if (arrayList != null && !arrayList.isEmpty()) {
                    while (i2 < mecVar.k.size()) {
                        lec lecVar = (lec) mecVar.k.get(i2);
                        if (lecVar == null || (mecVar2 = lecVar.b) == null) {
                            frameDrawer = this;
                            canvas2 = canvas;
                            j2 = j;
                        } else {
                            frameDrawer = this;
                            canvas2 = canvas;
                            j2 = j;
                            frameDrawer.drawEntity(canvas2, mecVar2, mecVar.l, j2);
                        }
                        i2++;
                        this = frameDrawer;
                        canvas = canvas2;
                        j = j2;
                    }
                }
            }
        }

        public void initStickerEntity(mec mecVar) {
            float f;
            int i = (int) (mecVar.f * this.W);
            mecVar.Y = i;
            int i2 = (int) (mecVar.g * this.H);
            mecVar.Z = i2;
            int i3 = 512;
            if (i > 512) {
                i2 = (int) ((i2 / i) * 512.0f);
                mecVar.Z = i2;
                mecVar.Y = 512;
                i = 512;
            }
            if (i2 > 512) {
                i = (int) ((i / i2) * 512.0f);
                mecVar.Y = i;
                mecVar.Z = 512;
            } else {
                i3 = i2;
            }
            byte b = mecVar.b;
            if ((b & 1) != 0) {
                if (i > 0 && i3 > 0) {
                    mecVar.G = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                    RLottieNative a = RLottieNative.a(mecVar.j, null, null, null, 0, null);
                    mecVar.D = a;
                    if (a != null) {
                        f = a.a[1] / this.fps;
                    } else {
                        f = 0.0f;
                    }
                    mecVar.F = f;
                } else {
                    return;
                }
            } else if ((b & 4) != 0) {
                mecVar.L = false;
                lm lmVar = new lm(new File(mecVar.j), true, 0L, 0, null, null, null, 0L, yac.t0, true, 512, 512, null, 0, true);
                mecVar.K = lmVar;
                mecVar.F = lmVar.d[5] / this.fps;
                mecVar.E = 1.0f;
                lmVar.r(true);
            } else {
                String str = mecVar.j;
                if (!TextUtils.isEmpty(mecVar.t) && (mecVar.b & 16) != 0) {
                    str = mecVar.t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (mecVar.a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                mecVar.G = decodeFile;
                if (mecVar.a == 2 && decodeFile != null) {
                    mecVar.s = hl.L(12.0f) / Math.min(mecVar.q, mecVar.r);
                    Pair N0 = hl.N0(mecVar.j);
                    mecVar.e = (float) (mecVar.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f2 = mecVar.c;
                        float f3 = mecVar.f;
                        float f4 = (f3 / 2.0f) + f2;
                        float f5 = mecVar.d;
                        float f6 = mecVar.g;
                        float f7 = (f6 / 2.0f) + f5;
                        float f8 = this.W;
                        float f9 = this.H;
                        float f10 = (f3 * f8) / f9;
                        float f11 = (f6 * f9) / f8;
                        mecVar.f = f11;
                        mecVar.g = f10;
                        mecVar.c = f4 - (f11 / 2.0f);
                        mecVar.d = f7 - (f10 / 2.0f);
                    }
                    applyRoundRadius(mecVar, mecVar.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / mecVar.G.getHeight();
                    if (width > 1.0f) {
                        float f12 = mecVar.g;
                        float f13 = f12 / width;
                        mecVar.d = bp1.z(f12, f13, 2.0f, mecVar.d);
                        mecVar.g = f13;
                    } else if (width < 1.0f) {
                        float f14 = mecVar.f;
                        float f15 = width * f14;
                        mecVar.c = bp1.z(f14, f15, 2.0f, mecVar.c);
                        mecVar.f = f15;
                    }
                }
            }
            setupMatrix(mecVar);
        }

        private void initTextEntity(final mec mecVar) {
            int i;
            int i2;
            int i3;
            mv3[] mv3VarArr;
            Typeface b;
            final ju3 ju3Var = new ju3(org.telegram.messenger.a.b);
            ju3Var.getPaint().setAntiAlias(true);
            ju3Var.H = false;
            ju3Var.setBackgroundColor(0);
            ju3Var.setPadding(hl.L(7.0f), hl.L(7.0f), hl.L(7.0f), hl.L(7.0f));
            xv7 xv7Var = mecVar.n;
            if (xv7Var != null && (b = xv7Var.b()) != null) {
                ju3Var.setTypeface(b);
            }
            ju3Var.setTextSize(0, mecVar.m);
            SpannableString spannableString = new SpannableString(mecVar.j);
            ArrayList arrayList = mecVar.k;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                final lec lecVar = (lec) arrayList.get(i4);
                if (lecVar.a != null) {
                    mec mecVar2 = new mec();
                    lecVar.b = mecVar2;
                    mecVar2.j = lecVar.a;
                    mecVar2.b = lecVar.c;
                    hm hmVar = new hm(0L, 1.0f, ju3Var.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i6, int i7, float f, int i8, int i9, int i10, Paint paint) {
                            super.draw(canvas, charSequence, i6, i7, f, i8, i9, i10, paint);
                            mec mecVar3 = mecVar;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (ju3Var.getPaddingLeft() + f)) / mecVar3.q) * mecVar3.f) + mecVar.c;
                            float f2 = mecVar3.d;
                            mec mecVar4 = mecVar;
                            float f3 = mecVar4.g;
                            float paddingTop = (((((i10 - i8) / 2.0f) + (ju3Var.getPaddingTop() + i8)) / mecVar4.r) * f3) + f2;
                            if (mecVar4.e != 0.0f) {
                                float f4 = (mecVar4.f / 2.0f) + mecVar4.c;
                                float f5 = (f3 / 2.0f) + mecVar4.d;
                                float f6 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d = paddingLeft - f4;
                                double d2 = (paddingTop - f5) / f6;
                                paddingLeft = ((float) ((Math.cos(-mecVar.e) * d) - (Math.sin(-mecVar.e) * d2))) + f4;
                                paddingTop = (((float) ik8.d(-mecVar.e, d2, Math.sin(-mecVar.e) * d)) * f6) + f5;
                            }
                            mec mecVar5 = lecVar.b;
                            float f7 = this.measuredSize;
                            mec mecVar6 = mecVar;
                            float f8 = (f7 / mecVar6.q) * mecVar6.f;
                            mecVar5.f = f8;
                            float f9 = (f7 / mecVar6.r) * mecVar6.g;
                            mecVar5.g = f9;
                            mecVar5.c = paddingLeft - (f8 / 2.0f);
                            mecVar5.d = paddingTop - (f9 / 2.0f);
                            mecVar5.e = mecVar6.e;
                            if (mecVar5.G == null) {
                                FrameDrawer.this.initStickerEntity(mecVar5);
                            }
                        }
                    };
                    int i6 = lecVar.offset;
                    spannableString.setSpan(hmVar, i6, lecVar.length + i6, 33);
                }
                i4 = i5;
            }
            CharSequence m = pv3.m(spannableString, ju3Var.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m instanceof Spanned) && (mv3VarArr = (mv3[]) ((Spanned) m).getSpans(0, m.length(), mv3.class)) != null) {
                for (mv3 mv3Var : mv3VarArr) {
                    mv3Var.b = 0.85f;
                }
            }
            ju3Var.setText(m);
            ju3Var.setTextColor(mecVar.l);
            int i7 = mecVar.p;
            if (i7 != 1) {
                if (i7 != 2) {
                    i = 19;
                } else {
                    i = 21;
                }
            } else {
                i = 17;
            }
            ju3Var.setGravity(i);
            int i8 = mecVar.p;
            if (i8 != 1) {
                boolean z = ob6.a0;
                if (i8 == 2 ? z : !z) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 4;
            }
            ju3Var.setTextAlignment(i2);
            ju3Var.setHorizontallyScrolling(false);
            ju3Var.setImeOptions(268435456);
            ju3Var.setFocusableInTouchMode(true);
            ju3Var.setInputType(ju3Var.getInputType() | 16384);
            setBreakStrategy(ju3Var);
            byte b2 = mecVar.b;
            int i9 = -1;
            if (b2 == 0) {
                ju3Var.setFrameColor(mecVar.l);
                if (hl.B(mecVar.l) >= 0.721f) {
                    i9 = -16777216;
                }
                ju3Var.setTextColor(i9);
            } else if (b2 == 1) {
                if (hl.B(mecVar.l) >= 0.25f) {
                    i3 = -1728053248;
                } else {
                    i3 = -1711276033;
                }
                ju3Var.setFrameColor(i3);
                ju3Var.setTextColor(mecVar.l);
            } else if (b2 == 2) {
                if (hl.B(mecVar.l) >= 0.25f) {
                    i9 = -16777216;
                }
                ju3Var.setFrameColor(i9);
                ju3Var.setTextColor(mecVar.l);
            } else if (b2 == 3) {
                ju3Var.setFrameColor(0);
                ju3Var.setTextColor(mecVar.l);
            }
            ju3Var.measure(View.MeasureSpec.makeMeasureSpec(mecVar.q, 1073741824), View.MeasureSpec.makeMeasureSpec(mecVar.r, 1073741824));
            ju3Var.layout(0, 0, mecVar.q, mecVar.r);
            mecVar.G = Bitmap.createBitmap(mecVar.q, mecVar.r, Bitmap.Config.ARGB_8888);
            ju3Var.draw(new Canvas(mecVar.G));
            setupMatrix(mecVar);
        }

        private void setupMatrix(mec mecVar) {
            lm lmVar;
            Matrix matrix = new Matrix();
            mecVar.H = matrix;
            Bitmap bitmap = mecVar.G;
            if (bitmap == null && (lmVar = mecVar.K) != null) {
                im imVar = lmVar.w;
                bitmap = imVar != null ? imVar.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (mecVar.a != 1 && (mecVar.b & 2) != 0) {
                mecVar.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            mecVar.H.postScale(mecVar.f * this.W, mecVar.g * this.H);
            mecVar.H.postTranslate(mecVar.c * this.W, mecVar.d * this.H);
            mecVar.H.postRotate((float) (((-mecVar.e) / 3.141592653589793d) * 180.0d), ((mecVar.f / 2.0f) + mecVar.c) * this.W, ((mecVar.g / 2.0f) + mecVar.d) * this.H);
        }

        public void draw(Canvas canvas, int i) {
            canvas.drawPaint(this.clearPaint);
            canvas.save();
            canvas.clipPath(this.clipPath);
            Bitmap bitmap = this.photo;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
            long j = (1000000000 / this.fps) * i;
            int size = this.mediaEntities.size();
            for (int i2 = 0; i2 < size; i2++) {
                mec mecVar = this.mediaEntities.get(i2);
                drawEntity(canvas, mecVar, mecVar.l, j);
            }
            canvas.restore();
        }

        public void setBreakStrategy(ju3 ju3Var) {
            ju3Var.setBreakStrategy(0);
        }
    }

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    private static native long createEncoder(String str, int i, int i2, int i3, long j);

    public static native void stop(long j);

    private static native boolean writeFrame(long j, ByteBuffer byteBuffer, int i, int i2);
}
