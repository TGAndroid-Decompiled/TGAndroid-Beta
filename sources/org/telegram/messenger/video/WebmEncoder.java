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
        private final ArrayList<pcc> mediaEntities;
        Path path;
        private final Bitmap photo;
        Paint textColorPaint;
        Paint xRefPaint;

        public FrameDrawer(MediaCodecVideoConvertor.ConvertVideoParams convertVideoParams) {
            ArrayList<pcc> arrayList = new ArrayList<>();
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
                pcc pccVar = this.mediaEntities.get(i3);
                byte b = pccVar.a;
                if (b != 0 && b != 2 && b != 5) {
                    if (b == 1) {
                        initTextEntity(pccVar);
                    }
                } else {
                    initStickerEntity(pccVar);
                }
            }
            this.clearPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }

        private void applyRoundRadius(pcc pccVar, Bitmap bitmap, int i) {
            if (bitmap != null && pccVar != null) {
                if (pccVar.s != 0.0f || i != 0) {
                    if (pccVar.M == null) {
                        pccVar.M = new Canvas(bitmap);
                    }
                    if (pccVar.s != 0.0f) {
                        if (this.path == null) {
                            this.path = new Path();
                        }
                        if (this.xRefPaint == null) {
                            Paint paint = new Paint(1);
                            this.xRefPaint = paint;
                            paint.setColor(-16777216);
                            this.xRefPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                        }
                        float min = Math.min(bitmap.getWidth(), bitmap.getHeight()) * pccVar.s;
                        this.path.rewind();
                        this.path.addRoundRect(new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight()), min, min, Path.Direction.CCW);
                        this.path.toggleInverseFillType();
                        pccVar.M.drawPath(this.path, this.xRefPaint);
                    }
                    if (i != 0) {
                        if (this.textColorPaint == null) {
                            Paint paint2 = new Paint(1);
                            this.textColorPaint = paint2;
                            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        }
                        this.textColorPaint.setColor(i);
                        pccVar.M.drawRect(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight(), this.textColorPaint);
                    }
                }
            }
        }

        private void drawEntity(Canvas canvas, pcc pccVar, int i, long j) {
            FrameDrawer frameDrawer;
            Canvas canvas2;
            long j2;
            pcc pccVar2;
            kn knVar;
            Bitmap bitmap;
            RLottieNative rLottieNative = pccVar.D;
            int i2 = 0;
            if (rLottieNative != null) {
                Bitmap bitmap2 = pccVar.G;
                if (bitmap2 != null && pccVar.Y > 0 && pccVar.Z > 0) {
                    rLottieNative.c((int) pccVar.E, bitmap2, true);
                    Bitmap bitmap3 = pccVar.G;
                    if ((pccVar.b & 8) == 0) {
                        i = 0;
                    }
                    applyRoundRadius(pccVar, bitmap3, i);
                    canvas.drawBitmap(pccVar.G, pccVar.H, this.bitmapPaint);
                    float f = pccVar.E + pccVar.F;
                    pccVar.E = f;
                    if (f >= pccVar.D.a[0]) {
                        pccVar.E = 0.0f;
                    }
                }
            } else if (pccVar.K != null) {
                float f2 = pccVar.E;
                int i3 = (int) f2;
                float f3 = f2 + pccVar.F;
                pccVar.E = f3;
                int i4 = (int) f3;
                while (true) {
                    knVar = pccVar.K;
                    if (i3 == i4) {
                        break;
                    }
                    knVar.r(true);
                    i4--;
                }
                hn hnVar = knVar.w;
                if (hnVar != null) {
                    bitmap = hnVar.b;
                } else {
                    bitmap = null;
                }
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, pccVar.H, this.bitmapPaint);
                }
            } else {
                canvas.drawBitmap(pccVar.G, pccVar.H, this.bitmapPaint);
                ArrayList arrayList = pccVar.k;
                if (arrayList != null && !arrayList.isEmpty()) {
                    while (i2 < pccVar.k.size()) {
                        occ occVar = (occ) pccVar.k.get(i2);
                        if (occVar == null || (pccVar2 = occVar.b) == null) {
                            frameDrawer = this;
                            canvas2 = canvas;
                            j2 = j;
                        } else {
                            frameDrawer = this;
                            canvas2 = canvas;
                            j2 = j;
                            frameDrawer.drawEntity(canvas2, pccVar2, pccVar.l, j2);
                        }
                        i2++;
                        this = frameDrawer;
                        canvas = canvas2;
                        j = j2;
                    }
                }
            }
        }

        public void initStickerEntity(pcc pccVar) {
            float f;
            int i = (int) (pccVar.f * this.W);
            pccVar.Y = i;
            int i2 = (int) (pccVar.g * this.H);
            pccVar.Z = i2;
            int i3 = 512;
            if (i > 512) {
                i2 = (int) ((i2 / i) * 512.0f);
                pccVar.Z = i2;
                pccVar.Y = 512;
                i = 512;
            }
            if (i2 > 512) {
                i = (int) ((i / i2) * 512.0f);
                pccVar.Y = i;
                pccVar.Z = 512;
            } else {
                i3 = i2;
            }
            byte b = pccVar.b;
            if ((b & 1) != 0) {
                if (i > 0 && i3 > 0) {
                    pccVar.G = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                    RLottieNative a = RLottieNative.a(pccVar.j, null, null, null, 0, null);
                    pccVar.D = a;
                    if (a != null) {
                        f = a.a[1] / this.fps;
                    } else {
                        f = 0.0f;
                    }
                    pccVar.F = f;
                } else {
                    return;
                }
            } else if ((b & 4) != 0) {
                pccVar.L = false;
                kn knVar = new kn(new File(pccVar.j), true, 0L, 0, null, null, null, 0L, z8c.t0, true, 512, 512, null, 0, true);
                pccVar.K = knVar;
                pccVar.F = knVar.d[5] / this.fps;
                pccVar.E = 1.0f;
                knVar.r(true);
            } else {
                String str = pccVar.j;
                if (!TextUtils.isEmpty(pccVar.t) && (pccVar.b & 16) != 0) {
                    str = pccVar.t;
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (pccVar.a == 2) {
                    options.inMutable = true;
                }
                Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
                pccVar.G = decodeFile;
                if (pccVar.a == 2 && decodeFile != null) {
                    pccVar.s = gm.L(12.0f) / Math.min(pccVar.q, pccVar.r);
                    Pair N0 = gm.N0(pccVar.j);
                    pccVar.e = (float) (pccVar.e - Math.toRadians(((Integer) N0.first).intValue()));
                    if ((((Integer) N0.first).intValue() / 90) % 2 == 1) {
                        float f2 = pccVar.c;
                        float f3 = pccVar.f;
                        float f4 = (f3 / 2.0f) + f2;
                        float f5 = pccVar.d;
                        float f6 = pccVar.g;
                        float f7 = (f6 / 2.0f) + f5;
                        float f8 = this.W;
                        float f9 = this.H;
                        float f10 = (f3 * f8) / f9;
                        float f11 = (f6 * f9) / f8;
                        pccVar.f = f11;
                        pccVar.g = f10;
                        pccVar.c = f4 - (f11 / 2.0f);
                        pccVar.d = f7 - (f10 / 2.0f);
                    }
                    applyRoundRadius(pccVar, pccVar.G, 0);
                } else if (decodeFile != null) {
                    float width = decodeFile.getWidth() / pccVar.G.getHeight();
                    if (width > 1.0f) {
                        float f12 = pccVar.g;
                        float f13 = f12 / width;
                        pccVar.d = aq1.z(f12, f13, 2.0f, pccVar.d);
                        pccVar.g = f13;
                    } else if (width < 1.0f) {
                        float f14 = pccVar.f;
                        float f15 = width * f14;
                        pccVar.c = aq1.z(f14, f15, 2.0f, pccVar.c);
                        pccVar.f = f15;
                    }
                }
            }
            setupMatrix(pccVar);
        }

        private void initTextEntity(final pcc pccVar) {
            int i;
            int i2;
            int i3;
            dw3[] dw3VarArr;
            Typeface b;
            final dv3 dv3Var = new dv3(org.telegram.messenger.a.b);
            dv3Var.getPaint().setAntiAlias(true);
            dv3Var.H = false;
            dv3Var.setBackgroundColor(0);
            dv3Var.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
            ru7 ru7Var = pccVar.n;
            if (ru7Var != null && (b = ru7Var.b()) != null) {
                dv3Var.setTypeface(b);
            }
            dv3Var.setTextSize(0, pccVar.m);
            SpannableString spannableString = new SpannableString(pccVar.j);
            ArrayList arrayList = pccVar.k;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                int i5 = i4 + 1;
                final occ occVar = (occ) arrayList.get(i4);
                if (occVar.a != null) {
                    pcc pccVar2 = new pcc();
                    occVar.b = pccVar2;
                    pccVar2.j = occVar.a;
                    pccVar2.b = occVar.c;
                    gn gnVar = new gn(0L, 1.0f, dv3Var.getPaint().getFontMetricsInt()) {
                        @Override
                        public void draw(Canvas canvas, CharSequence charSequence, int i6, int i7, float f, int i8, int i9, int i10, Paint paint) {
                            super.draw(canvas, charSequence, i6, i7, f, i8, i9, i10, paint);
                            pcc pccVar3 = pccVar;
                            float paddingLeft = ((((this.measuredSize / 2.0f) + (dv3Var.getPaddingLeft() + f)) / pccVar3.q) * pccVar3.f) + pccVar.c;
                            float f2 = pccVar3.d;
                            pcc pccVar4 = pccVar;
                            float f3 = pccVar4.g;
                            float paddingTop = (((((i10 - i8) / 2.0f) + (dv3Var.getPaddingTop() + i8)) / pccVar4.r) * f3) + f2;
                            if (pccVar4.e != 0.0f) {
                                float f4 = (pccVar4.f / 2.0f) + pccVar4.c;
                                float f5 = (f3 / 2.0f) + pccVar4.d;
                                float f6 = FrameDrawer.this.W / FrameDrawer.this.H;
                                double d = paddingLeft - f4;
                                double d2 = (paddingTop - f5) / f6;
                                paddingLeft = ((float) ((Math.cos(-pccVar.e) * d) - (Math.sin(-pccVar.e) * d2))) + f4;
                                paddingTop = (((float) wi8.d(-pccVar.e, d2, Math.sin(-pccVar.e) * d)) * f6) + f5;
                            }
                            pcc pccVar5 = occVar.b;
                            int i11 = this.measuredSize;
                            pcc pccVar6 = pccVar;
                            float f7 = (i11 / pccVar6.q) * pccVar6.f;
                            pccVar5.f = f7;
                            float f8 = (i11 / pccVar6.r) * pccVar6.g;
                            pccVar5.g = f8;
                            pccVar5.c = paddingLeft - (f7 / 2.0f);
                            pccVar5.d = paddingTop - (f8 / 2.0f);
                            pccVar5.e = pccVar6.e;
                            if (pccVar5.G == null) {
                                FrameDrawer.this.initStickerEntity(pccVar5);
                            }
                        }
                    };
                    int i6 = occVar.offset;
                    spannableString.setSpan(gnVar, i6, occVar.length + i6, 33);
                }
                i4 = i5;
            }
            CharSequence m = gw3.m(spannableString, dv3Var.getPaint().getFontMetricsInt(), false, null, 0);
            if ((m instanceof Spanned) && (dw3VarArr = (dw3[]) ((Spanned) m).getSpans(0, m.length(), dw3.class)) != null) {
                for (dw3 dw3Var : dw3VarArr) {
                    dw3Var.b = 0.85f;
                }
            }
            dv3Var.setText(m);
            dv3Var.setTextColor(pccVar.l);
            int i7 = pccVar.p;
            if (i7 != 1) {
                if (i7 != 2) {
                    i = 19;
                } else {
                    i = 21;
                }
            } else {
                i = 17;
            }
            dv3Var.setGravity(i);
            int i8 = pccVar.p;
            if (i8 != 1) {
                boolean z = jb6.a0;
                if (i8 == 2 ? z : !z) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 4;
            }
            dv3Var.setTextAlignment(i2);
            dv3Var.setHorizontallyScrolling(false);
            dv3Var.setImeOptions(268435456);
            dv3Var.setFocusableInTouchMode(true);
            dv3Var.setInputType(dv3Var.getInputType() | 16384);
            setBreakStrategy(dv3Var);
            byte b2 = pccVar.b;
            int i9 = -1;
            if (b2 == 0) {
                dv3Var.setFrameColor(pccVar.l);
                if (gm.B(pccVar.l) >= 0.721f) {
                    i9 = -16777216;
                }
                dv3Var.setTextColor(i9);
            } else if (b2 == 1) {
                if (gm.B(pccVar.l) >= 0.25f) {
                    i3 = -1728053248;
                } else {
                    i3 = -1711276033;
                }
                dv3Var.setFrameColor(i3);
                dv3Var.setTextColor(pccVar.l);
            } else if (b2 == 2) {
                if (gm.B(pccVar.l) >= 0.25f) {
                    i9 = -16777216;
                }
                dv3Var.setFrameColor(i9);
                dv3Var.setTextColor(pccVar.l);
            } else if (b2 == 3) {
                dv3Var.setFrameColor(0);
                dv3Var.setTextColor(pccVar.l);
            }
            dv3Var.measure(View.MeasureSpec.makeMeasureSpec(pccVar.q, 1073741824), View.MeasureSpec.makeMeasureSpec(pccVar.r, 1073741824));
            dv3Var.layout(0, 0, pccVar.q, pccVar.r);
            pccVar.G = Bitmap.createBitmap(pccVar.q, pccVar.r, Bitmap.Config.ARGB_8888);
            dv3Var.draw(new Canvas(pccVar.G));
            setupMatrix(pccVar);
        }

        private void setupMatrix(pcc pccVar) {
            kn knVar;
            Matrix matrix = new Matrix();
            pccVar.H = matrix;
            Bitmap bitmap = pccVar.G;
            if (bitmap == null && (knVar = pccVar.K) != null) {
                hn hnVar = knVar.w;
                bitmap = hnVar != null ? hnVar.b : null;
            }
            if (bitmap != null) {
                matrix.postScale(1.0f / bitmap.getWidth(), 1.0f / bitmap.getHeight());
            }
            if (pccVar.a != 1 && (pccVar.b & 2) != 0) {
                pccVar.H.postScale(-1.0f, 1.0f, 0.5f, 0.5f);
            }
            pccVar.H.postScale(pccVar.f * this.W, pccVar.g * this.H);
            pccVar.H.postTranslate(pccVar.c * this.W, pccVar.d * this.H);
            pccVar.H.postRotate((float) (((-pccVar.e) / 3.141592653589793d) * 180.0d), ((pccVar.f / 2.0f) + pccVar.c) * this.W, ((pccVar.g / 2.0f) + pccVar.d) * this.H);
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
                pcc pccVar = this.mediaEntities.get(i2);
                drawEntity(canvas, pccVar, pccVar.l, j);
            }
            canvas.restore();
        }

        public void setBreakStrategy(dv3 dv3Var) {
            dv3Var.setBreakStrategy(0);
        }
    }

    public static boolean convert(org.telegram.messenger.video.MediaCodecVideoConvertor.ConvertVideoParams r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.WebmEncoder.convert(org.telegram.messenger.video.MediaCodecVideoConvertor$ConvertVideoParams, int):boolean");
    }

    private static native long createEncoder(String str, int i, int i2, int i3, long j);

    public static native void stop(long j);

    private static native boolean writeFrame(long j, ByteBuffer byteBuffer, int i, int i2);
}
