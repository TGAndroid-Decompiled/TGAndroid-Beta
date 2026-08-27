package lh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class v9 implements Runnable {

    public final int f16946a;

    public final sb f16947b;

    public final f6 f16948c;
    public final int d;

    public final int f16949e;

    public final z7 f16950f;
    public final boolean h;

    public final boolean f16951n;

    public final Runnable f16952r;

    public v9(sb sbVar, va vaVar, int i10, int i11, z7 z7Var, boolean z10, boolean z11, Runnable runnable, int i12) {
        this.f16946a = i12;
        this.f16947b = sbVar;
        this.f16948c = vaVar;
        this.d = i10;
        this.f16949e = i11;
        this.f16950f = z7Var;
        this.h = z10;
        this.f16951n = z11;
        this.f16952r = runnable;
    }

    @Override
    public final void run() {
        File fileW;
        final File file;
        z7 z7Var;
        File fileW2;
        final File fileW3;
        final File file2;
        int size;
        int i10;
        f6 f6Var;
        ImageReceiver photoImage;
        f6 f6Var2;
        File fileW4;
        boolean z10;
        final File file3;
        f6 f6Var3;
        z7 z7Var2;
        File pathToAttach;
        final File pathToAttach2;
        ImageReceiver photoImage2;
        File file4;
        switch (this.f16946a) {
            case 0:
                final cg.w1 w1Var = (cg.w1) this.f16952r;
                sb sbVar = this.f16947b;
                int i11 = sbVar.f16749c;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                f6 f6Var4 = this.f16948c;
                z7 z7Var3 = this.f16950f;
                f6Var4.t0(arrayList2, false, false, false, false, z7Var3);
                if (!z7Var3.K) {
                    z7Var3.S0 = Utilities.clamp(f6Var4.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks = f6Var4.getMasks();
                ArrayList arrayList3 = masks != null ? new ArrayList(masks) : null;
                boolean z11 = z7Var3.K;
                boolean zE = z7Var3.E();
                arrayList2.clear();
                Bitmap bitmapT0 = f6Var4.t0(arrayList2, true, false, false, !z11, z7Var3);
                if (arrayList2.isEmpty()) {
                    arrayList2 = null;
                }
                final File fileW5 = z7.w(i11, "png");
                arrayList.add(new x9(bitmapT0, fileW5, 0));
                final ArrayList arrayList4 = arrayList3;
                if (z7Var3.f17235u) {
                    long j10 = z7Var3.f17245z0;
                    if (j10 == Long.MIN_VALUE) {
                        fileW = null;
                    } else {
                        Drawable drawableE = z7Var3.f17241x0;
                        if (drawableE == null) {
                            drawableE = q6.e(null, i11, j10, sbVar.Y1);
                        }
                        if (drawableE != null) {
                            fileW = z7.w(i11, "webp");
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.d, this.f16949e, Bitmap.Config.ARGB_8888);
                            z7.j(new Canvas(bitmapCreateBitmap), drawableE, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                            arrayList.add(new x9(bitmapCreateBitmap, fileW, 1));
                        } else {
                            fileW = null;
                        }
                    }
                } else {
                    fileW = null;
                }
                if (z7Var3.f17235u && z7Var3.K) {
                    int i12 = z7Var3.f17217k0;
                    int i13 = z7Var3.f17219l0;
                    zf.e1 e1VarS0 = f6Var4.s0();
                    if (e1VarS0 != null) {
                        zf.x0 x0Var = e1VarS0.f50388n0;
                        if (x0Var.getChildCount() == 1 && i12 > 0 && i13 > 0) {
                            photoImage = x0Var.getChildAt(0) instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) x0Var.getChildAt(0)).getPhotoImage() : null;
                        }
                    }
                    if (photoImage == null || ((int) photoImage.getImageWidth()) <= 0 || ((int) photoImage.getImageHeight()) <= 0) {
                        file = null;
                    } else {
                        float f10 = i12;
                        float f11 = i13;
                        float fMax = Math.max(photoImage.getImageWidth() / f10, photoImage.getImageHeight() / f11);
                        int i14 = (int) ((f10 * fMax) / 2.0f);
                        int i15 = (int) ((f11 * fMax) / 2.0f);
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i14, i15, Bitmap.Config.ARGB_8888);
                        float[] fArr = new float[8];
                        int i16 = 0;
                        while (i16 < photoImage.getRoundRadius().length) {
                            int i17 = i16 * 2;
                            int i18 = i16;
                            fArr[i17] = photoImage.getRoundRadius()[i18];
                            fArr[i17 + 1] = photoImage.getRoundRadius()[i18];
                            i16 = i18 + 1;
                        }
                        Canvas canvas = new Canvas(bitmapCreateBitmap2);
                        Path path = new Path();
                        canvas.scale(0.5f, 0.5f);
                        RectF rectF = AndroidUtilities.rectTmp;
                        float f12 = (i14 * 2.0f) / 2.0f;
                        float f13 = (i15 * 2.0f) / 2.0f;
                        rectF.set(f12 - (photoImage.getImageWidth() / 2.0f), f13 - (photoImage.getImageHeight() / 2.0f), (photoImage.getImageWidth() / 2.0f) + f12, (photoImage.getImageHeight() / 2.0f) + f13);
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        Paint paint = new Paint(1);
                        paint.setColor(-1);
                        canvas.drawPath(path, paint);
                        File fileW6 = z7.w(i11, "webp");
                        arrayList.add(new x9(bitmapCreateBitmap2, fileW6, 2));
                        file = fileW6;
                    }
                } else {
                    file = null;
                }
                if (f6Var4.u0()) {
                    if (zE) {
                        f6Var = f6Var4;
                        z7Var = z7Var3;
                        fileW2 = null;
                    } else {
                        f6Var = f6Var4;
                        Bitmap bitmapT1 = f6Var.t0(new ArrayList(), false, true, false, false, z7Var3);
                        z7Var = z7Var3;
                        fileW2 = z7.w(i11, "png");
                        arrayList.add(new x9(bitmapT1, fileW2, 3));
                    }
                    if (this.h) {
                        Bitmap blurBitmap = f6Var.getBlurBitmap();
                        fileW3 = z7.w(i11, "png");
                        arrayList.add(new x9(blurBitmap, fileW3, 4));
                    } else {
                        file2 = fileW2;
                        fileW3 = null;
                    }
                    final int i19 = 1;
                    final z7 z7Var4 = z7Var;
                    final boolean z12 = this.f16951n;
                    final File file5 = fileW;
                    final ArrayList arrayList5 = arrayList2;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            switch (i19) {
                                case 0:
                                    z7 z7Var5 = z7Var4;
                                    s9 s9Var = (s9) w1Var;
                                    try {
                                        File file6 = z7Var5.P0;
                                        if (file6 != null) {
                                            file6.delete();
                                        }
                                        break;
                                    } catch (Exception unused) {
                                    }
                                    try {
                                        File file7 = z7Var5.R0;
                                        if (file7 != null) {
                                            file7.delete();
                                        }
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                    try {
                                        File file8 = z7Var5.Q0;
                                        if (file8 != null) {
                                            file8.delete();
                                        }
                                        break;
                                    } catch (Exception unused3) {
                                    }
                                    z7Var5.P0 = null;
                                    z7Var5.R0 = null;
                                    z7Var5.Q0 = null;
                                    File file9 = z7Var5.Y0;
                                    if (file9 != null) {
                                        try {
                                            file9.delete();
                                        } catch (Exception e9) {
                                            FileLog.e(e9);
                                        }
                                        z7Var5.Y0 = null;
                                    }
                                    File file10 = z7Var5.X0;
                                    if (file10 != null) {
                                        try {
                                            file10.delete();
                                        } catch (Exception e10) {
                                            FileLog.e(e10);
                                        }
                                        z7Var5.X0 = null;
                                    }
                                    z7Var5.f17214j |= z12;
                                    z7Var5.T0 = arrayList5;
                                    z7Var5.P0 = fileW5;
                                    z7Var5.Y0 = file5;
                                    z7Var5.R0 = file2;
                                    z7Var5.X0 = file;
                                    z7Var5.Q0 = fileW3;
                                    z7Var5.U0 = arrayList4;
                                    s9Var.run();
                                    break;
                                default:
                                    z7 z7Var6 = z7Var4;
                                    cg.w1 w1Var2 = (cg.w1) w1Var;
                                    try {
                                        File file11 = z7Var6.P0;
                                        if (file11 != null) {
                                            file11.delete();
                                        }
                                        break;
                                    } catch (Exception unused4) {
                                    }
                                    try {
                                        File file12 = z7Var6.R0;
                                        if (file12 != null) {
                                            file12.delete();
                                        }
                                        break;
                                    } catch (Exception unused5) {
                                    }
                                    try {
                                        File file13 = z7Var6.Q0;
                                        if (file13 != null) {
                                            file13.delete();
                                        }
                                        break;
                                    } catch (Exception unused6) {
                                    }
                                    z7Var6.P0 = null;
                                    z7Var6.R0 = null;
                                    z7Var6.Q0 = null;
                                    File file14 = z7Var6.Y0;
                                    if (file14 != null) {
                                        try {
                                            file14.delete();
                                        } catch (Exception e11) {
                                            FileLog.e(e11);
                                        }
                                        z7Var6.Y0 = null;
                                    }
                                    File file15 = z7Var6.X0;
                                    if (file15 != null) {
                                        try {
                                            file15.delete();
                                        } catch (Exception e12) {
                                            FileLog.e(e12);
                                        }
                                        z7Var6.X0 = null;
                                    }
                                    z7Var6.f17214j |= z12;
                                    z7Var6.T0 = arrayList5;
                                    z7Var6.P0 = fileW5;
                                    z7Var6.Y0 = file5;
                                    z7Var6.R0 = file2;
                                    z7Var6.X0 = file;
                                    z7Var6.Q0 = fileW3;
                                    z7Var6.U0 = arrayList4;
                                    w1Var2.run();
                                    break;
                            }
                        }
                    });
                    size = arrayList.size();
                    i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        ((Runnable) obj).run();
                    }
                    return;
                }
                z7Var = z7Var3;
                fileW2 = z7Var.R0;
                fileW3 = z7Var.Q0;
                file2 = fileW2;
                final int i110 = 1;
                final z7 z7Var5 = z7Var;
                final boolean z13 = this.f16951n;
                final File file6 = fileW;
                final ArrayList arrayList6 = arrayList2;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i110) {
                            case 0:
                                z7 z7Var6 = z7Var5;
                                s9 s9Var = (s9) w1Var;
                                try {
                                    File file7 = z7Var6.P0;
                                    if (file7 != null) {
                                        file7.delete();
                                    }
                                    break;
                                } catch (Exception unused) {
                                }
                                try {
                                    File file8 = z7Var6.R0;
                                    if (file8 != null) {
                                        file8.delete();
                                    }
                                    break;
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file9 = z7Var6.Q0;
                                    if (file9 != null) {
                                        file9.delete();
                                    }
                                    break;
                                } catch (Exception unused3) {
                                }
                                z7Var6.P0 = null;
                                z7Var6.R0 = null;
                                z7Var6.Q0 = null;
                                File file10 = z7Var6.Y0;
                                if (file10 != null) {
                                    try {
                                        file10.delete();
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                    z7Var6.Y0 = null;
                                }
                                File file11 = z7Var6.X0;
                                if (file11 != null) {
                                    try {
                                        file11.delete();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                    z7Var6.X0 = null;
                                }
                                z7Var6.f17214j |= z13;
                                z7Var6.T0 = arrayList6;
                                z7Var6.P0 = fileW5;
                                z7Var6.Y0 = file6;
                                z7Var6.R0 = file2;
                                z7Var6.X0 = file;
                                z7Var6.Q0 = fileW3;
                                z7Var6.U0 = arrayList4;
                                s9Var.run();
                                break;
                            default:
                                z7 z7Var7 = z7Var5;
                                cg.w1 w1Var2 = (cg.w1) w1Var;
                                try {
                                    File file12 = z7Var7.P0;
                                    if (file12 != null) {
                                        file12.delete();
                                    }
                                    break;
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file13 = z7Var7.R0;
                                    if (file13 != null) {
                                        file13.delete();
                                    }
                                    break;
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file14 = z7Var7.Q0;
                                    if (file14 != null) {
                                        file14.delete();
                                    }
                                    break;
                                } catch (Exception unused6) {
                                }
                                z7Var7.P0 = null;
                                z7Var7.R0 = null;
                                z7Var7.Q0 = null;
                                File file15 = z7Var7.Y0;
                                if (file15 != null) {
                                    try {
                                        file15.delete();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    z7Var7.Y0 = null;
                                }
                                File file16 = z7Var7.X0;
                                if (file16 != null) {
                                    try {
                                        file16.delete();
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    z7Var7.X0 = null;
                                }
                                z7Var7.f17214j |= z13;
                                z7Var7.T0 = arrayList6;
                                z7Var7.P0 = fileW5;
                                z7Var7.Y0 = file6;
                                z7Var7.R0 = file2;
                                z7Var7.X0 = file;
                                z7Var7.Q0 = fileW3;
                                z7Var7.U0 = arrayList4;
                                w1Var2.run();
                                break;
                        }
                    }
                });
                size = arrayList.size();
                i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    ((Runnable) obj2).run();
                }
                return;
            default:
                final s9 s9Var = (s9) this.f16952r;
                sb sbVar2 = this.f16947b;
                int i20 = sbVar2.f16749c;
                ArrayList arrayList7 = new ArrayList();
                f6 f6Var5 = this.f16948c;
                z7 z7Var6 = this.f16950f;
                f6Var5.t0(arrayList7, false, false, false, false, z7Var6);
                if (!z7Var6.K) {
                    z7Var6.S0 = Utilities.clamp(f6Var5.getLcm(), 7500L, 5000L);
                }
                List<TLRPC.InputDocument> masks2 = f6Var5.getMasks();
                ArrayList arrayList8 = masks2 != null ? new ArrayList(masks2) : null;
                boolean z14 = z7Var6.K;
                boolean zE2 = z7Var6.E();
                arrayList7.clear();
                Bitmap bitmapT2 = f6Var5.t0(arrayList7, true, false, false, !z14, z7Var6);
                ArrayList arrayList9 = arrayList7.isEmpty() ? null : arrayList7;
                final File pathToAttach3 = FileLoader.getInstance(i20).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmapT2, Bitmap.CompressFormat.PNG, z7Var6.f17213i0, z7Var6.f17215j0, 87, false, 101, 101), true);
                if (bitmapT2 != null && !bitmapT2.isRecycled()) {
                    bitmapT2.recycle();
                }
                boolean z15 = z7Var6.f17235u;
                int i21 = this.d;
                int i22 = this.f16949e;
                final ArrayList arrayList10 = arrayList8;
                if (z15) {
                    long j11 = z7Var6.f17245z0;
                    if (j11 == Long.MIN_VALUE) {
                        f6Var2 = f6Var5;
                        fileW4 = null;
                    } else {
                        Drawable drawableE2 = z7Var6.f17241x0;
                        if (drawableE2 == null) {
                            drawableE2 = q6.e(null, i20, j11, sbVar2.Y1);
                        }
                        if (drawableE2 != null) {
                            fileW4 = z7.w(i20, "webp");
                            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(i21, i22, Bitmap.Config.ARGB_8888);
                            f6Var2 = f6Var5;
                            z7.j(new Canvas(bitmapCreateBitmap3), drawableE2, bitmapCreateBitmap3.getWidth(), bitmapCreateBitmap3.getHeight());
                            try {
                                try {
                                    bitmapCreateBitmap3.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileW4));
                                    if (!bitmapCreateBitmap3.isRecycled()) {
                                        bitmapCreateBitmap3.recycle();
                                    }
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                    if (!bitmapCreateBitmap3.isRecycled()) {
                                    }
                                }
                            } catch (Throwable th) {
                                if (!bitmapCreateBitmap3.isRecycled()) {
                                    bitmapCreateBitmap3.recycle();
                                }
                                throw th;
                            }
                        } else {
                            f6Var2 = f6Var5;
                            fileW4 = null;
                        }
                    }
                } else {
                    f6Var2 = f6Var5;
                    fileW4 = null;
                }
                if (z7Var6.f17235u && z7Var6.K) {
                    int i23 = z7Var6.f17217k0;
                    int i24 = z7Var6.f17219l0;
                    zf.e1 e1VarS1 = f6Var2.s0();
                    if (e1VarS1 != null) {
                        zf.x0 x0Var2 = e1VarS1.f50388n0;
                        if (x0Var2.getChildCount() == 1 && i23 > 0 && i24 > 0) {
                            photoImage2 = x0Var2.getChildAt(0) instanceof org.telegram.ui.Cells.s1 ? ((org.telegram.ui.Cells.s1) x0Var2.getChildAt(0)).getPhotoImage() : null;
                        }
                    }
                    if (photoImage2 == null || ((int) photoImage2.getImageWidth()) <= 0 || ((int) photoImage2.getImageHeight()) <= 0) {
                        z10 = true;
                        file3 = null;
                    } else {
                        float f14 = i23;
                        float f15 = i24;
                        float fMax2 = Math.max(photoImage2.getImageWidth() / f14, photoImage2.getImageHeight() / f15);
                        int i25 = (int) ((f14 * fMax2) / 2.0f);
                        int i26 = (int) ((f15 * fMax2) / 2.0f);
                        Bitmap bitmapCreateBitmap4 = Bitmap.createBitmap(i25, i26, Bitmap.Config.ARGB_8888);
                        float[] fArr2 = new float[8];
                        ImageReceiver imageReceiver = photoImage2;
                        int i27 = 0;
                        while (i27 < imageReceiver.getRoundRadius().length) {
                            int i28 = i27 * 2;
                            int i29 = i27;
                            fArr2[i28] = imageReceiver.getRoundRadius()[i29];
                            fArr2[i28 + 1] = imageReceiver.getRoundRadius()[i29];
                            i27 = i29 + 1;
                        }
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap4);
                        Path path2 = new Path();
                        canvas2.scale(0.5f, 0.5f);
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        float f16 = (i25 * 2.0f) / 2.0f;
                        float f17 = (i26 * 2.0f) / 2.0f;
                        rectF2.set(f16 - (imageReceiver.getImageWidth() / 2.0f), f17 - (imageReceiver.getImageHeight() / 2.0f), (imageReceiver.getImageWidth() / 2.0f) + f16, (imageReceiver.getImageHeight() / 2.0f) + f17);
                        path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                        z10 = true;
                        Paint paint2 = new Paint(1);
                        paint2.setColor(-1);
                        canvas2.drawPath(path2, paint2);
                        try {
                            File fileW7 = z7.w(i20, "webp");
                            bitmapCreateBitmap4.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(fileW7));
                            file4 = fileW7;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            file4 = null;
                        }
                        bitmapCreateBitmap4.recycle();
                        file3 = file4;
                    }
                } else {
                    z10 = true;
                    file3 = null;
                }
                if (zE2) {
                    f6Var3 = f6Var2;
                    z7Var2 = z7Var6;
                    pathToAttach = null;
                } else {
                    f6Var3 = f6Var2;
                    z7Var2 = z7Var6;
                    Bitmap bitmapT3 = f6Var3.t0(new ArrayList(), false, true, false, false, z7Var2);
                    pathToAttach = FileLoader.getInstance(i20).getPathToAttach(ImageLoader.scaleAndSaveImage(bitmapT3, Bitmap.CompressFormat.PNG, i21, i22, 87, false, 101, 101), z10);
                    if (bitmapT3 != null && !bitmapT3.isRecycled()) {
                        bitmapT3.recycle();
                    }
                }
                if (this.h) {
                    Bitmap blurBitmap2 = f6Var3.getBlurBitmap();
                    pathToAttach2 = FileLoader.getInstance(i20).getPathToAttach(ImageLoader.scaleAndSaveImage(blurBitmap2, Bitmap.CompressFormat.PNG, i21, i22, 87, false, 101, 101), z10);
                    if (blurBitmap2 != null && !blurBitmap2.isRecycled()) {
                        blurBitmap2.recycle();
                    }
                } else {
                    pathToAttach2 = null;
                }
                final int i30 = 0;
                final boolean z16 = this.f16951n;
                final File file7 = pathToAttach;
                final z7 z7Var7 = z7Var2;
                final ArrayList arrayList11 = arrayList9;
                final File file8 = fileW4;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i30) {
                            case 0:
                                z7 z7Var8 = z7Var7;
                                s9 s9Var2 = (s9) s9Var;
                                try {
                                    File file9 = z7Var8.P0;
                                    if (file9 != null) {
                                        file9.delete();
                                    }
                                    break;
                                } catch (Exception unused) {
                                }
                                try {
                                    File file10 = z7Var8.R0;
                                    if (file10 != null) {
                                        file10.delete();
                                    }
                                    break;
                                } catch (Exception unused2) {
                                }
                                try {
                                    File file11 = z7Var8.Q0;
                                    if (file11 != null) {
                                        file11.delete();
                                    }
                                    break;
                                } catch (Exception unused3) {
                                }
                                z7Var8.P0 = null;
                                z7Var8.R0 = null;
                                z7Var8.Q0 = null;
                                File file12 = z7Var8.Y0;
                                if (file12 != null) {
                                    try {
                                        file12.delete();
                                    } catch (Exception e11) {
                                        FileLog.e(e11);
                                    }
                                    z7Var8.Y0 = null;
                                }
                                File file13 = z7Var8.X0;
                                if (file13 != null) {
                                    try {
                                        file13.delete();
                                    } catch (Exception e12) {
                                        FileLog.e(e12);
                                    }
                                    z7Var8.X0 = null;
                                }
                                z7Var8.f17214j |= z16;
                                z7Var8.T0 = arrayList11;
                                z7Var8.P0 = pathToAttach3;
                                z7Var8.Y0 = file8;
                                z7Var8.R0 = file7;
                                z7Var8.X0 = file3;
                                z7Var8.Q0 = pathToAttach2;
                                z7Var8.U0 = arrayList10;
                                s9Var2.run();
                                break;
                            default:
                                z7 z7Var9 = z7Var7;
                                cg.w1 w1Var2 = (cg.w1) s9Var;
                                try {
                                    File file14 = z7Var9.P0;
                                    if (file14 != null) {
                                        file14.delete();
                                    }
                                    break;
                                } catch (Exception unused4) {
                                }
                                try {
                                    File file15 = z7Var9.R0;
                                    if (file15 != null) {
                                        file15.delete();
                                    }
                                    break;
                                } catch (Exception unused5) {
                                }
                                try {
                                    File file16 = z7Var9.Q0;
                                    if (file16 != null) {
                                        file16.delete();
                                    }
                                    break;
                                } catch (Exception unused6) {
                                }
                                z7Var9.P0 = null;
                                z7Var9.R0 = null;
                                z7Var9.Q0 = null;
                                File file17 = z7Var9.Y0;
                                if (file17 != null) {
                                    try {
                                        file17.delete();
                                    } catch (Exception e13) {
                                        FileLog.e(e13);
                                    }
                                    z7Var9.Y0 = null;
                                }
                                File file18 = z7Var9.X0;
                                if (file18 != null) {
                                    try {
                                        file18.delete();
                                    } catch (Exception e14) {
                                        FileLog.e(e14);
                                    }
                                    z7Var9.X0 = null;
                                }
                                z7Var9.f17214j |= z16;
                                z7Var9.T0 = arrayList11;
                                z7Var9.P0 = pathToAttach3;
                                z7Var9.Y0 = file8;
                                z7Var9.R0 = file7;
                                z7Var9.X0 = file3;
                                z7Var9.Q0 = pathToAttach2;
                                z7Var9.U0 = arrayList10;
                                w1Var2.run();
                                break;
                        }
                    }
                });
                return;
        }
    }
}
