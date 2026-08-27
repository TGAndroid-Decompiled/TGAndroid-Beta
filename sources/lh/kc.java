package lh;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.view.Choreographer;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.e01;
import org.telegram.ui.Components.el;
import org.telegram.ui.Components.f01;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.ty;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bf0;
import org.telegram.ui.hq0;
import org.telegram.ui.k41;
import org.telegram.ui.sq0;
import org.telegram.ui.tq0;

public final class kc implements Utilities.Callback {

    public final int f16264a;

    public final boolean f16265b;

    public final Object f16266c;
    public final Object d;

    public kc(Object obj, boolean z10, Object obj2, int i10) {
        this.f16264a = i10;
        this.f16266c = obj;
        this.f16265b = z10;
        this.d = obj2;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        int i11;
        zf.k2[] k2VarArr;
        float f10;
        Bitmap bitmapI0;
        float fSqrt;
        float f11;
        float f12;
        switch (this.f16264a) {
            case 0:
                boolean z10 = this.f16265b;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.f16266c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                pc pcVar = (pc) obj;
                if (z10) {
                    b2Var.c(350L);
                }
                callback.run(pcVar);
                break;
            case 1:
                el elVar = (el) this.f16266c;
                File file = (File) this.d;
                boolean z11 = this.f16265b;
                Integer num = (Integer) obj;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = elVar.f28078e;
                chatAttachAlertPhotoLayout.f26267o0 = false;
                if (file != null && !chatAttachAlertPhotoLayout.f34900b.R) {
                    ChatAttachAlertPhotoLayout.f26237m1 = false;
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(new File(file.getAbsolutePath()).getAbsolutePath(), options);
                        i10 = options.outWidth;
                        try {
                            i11 = options.outHeight;
                        } catch (Exception unused) {
                            i11 = 0;
                        }
                    } catch (Exception unused2) {
                        i10 = 0;
                    }
                    int i12 = i10;
                    int i13 = ChatAttachAlertPhotoLayout.f26241q1;
                    ChatAttachAlertPhotoLayout.f26241q1 = i13 - 1;
                    MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, i13, 0L, file.getAbsolutePath(), num.intValue() == -1 ? 0 : num.intValue(), false, i12, i11, 0L);
                    photoEntry.canDeleteAfter = true;
                    chatAttachAlertPhotoLayout.j0(photoEntry, z11, false);
                    break;
                }
                break;
            case 2:
                ry ryVar = (ry) this.f16266c;
                boolean z12 = this.f16265b;
                Runnable runnable = (Runnable) this.d;
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = ryVar.f32275r;
                ty tyVar = ryVar.f32277w;
                if (tyVar.I == ryVar.f32270b) {
                    int i14 = 0;
                    if (z12) {
                        int size = arrayList2.size();
                        arrayList2.clear();
                        tyVar.f32914y = size == arrayList.size();
                    }
                    arrayList2.addAll(arrayList);
                    int size2 = arrayList.size();
                    while (i14 < size2) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        TLRPC.Document document = (TLRPC.Document) obj2;
                        ryVar.v.put(document.f22386id, document);
                    }
                    ryVar.f32273f.put(arrayList2, tyVar.J);
                    runnable.run();
                    break;
                }
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.f16266c;
                boolean z13 = this.f16265b;
                MediaController.MediaEditState mediaEditState = (MediaController.MediaEditState) this.d;
                zf.k2 k2Var = (zf.k2) obj;
                zf.n2 n2Var = photoViewer.f35688l5;
                if (!n2Var.f50630y || (k2VarArr = n2Var.D) == null || k2VarArr.length <= 0) {
                    photoViewer.f35724p5.setCutOutState(true);
                    photoViewer.X2(false, true);
                } else {
                    f01 thanosEffect = photoViewer.f35688l5.getThanosEffect();
                    zf.n2 n2Var2 = photoViewer.f35688l5;
                    n2Var2.H = true;
                    n2Var2.A = k2Var;
                    Bitmap bitmap = photoViewer.f35805y4.getBitmap();
                    photoViewer.f35805y4.getOrientation();
                    zf.k2 k2Var2 = n2Var2.A;
                    Bitmap bitmapB = k2Var2 == null ? n2Var2.E : (!z13 || bitmap == null) ? k2Var2.b() : n2Var2.e(bitmap);
                    MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) photoViewer.f35608c7.get(photoViewer.L4);
                    if (thanosEffect == null) {
                        Utilities.themeQueue.postRunnable(new sq0(photoViewer, bitmapB, 0));
                        photoViewer.f35688l5.f();
                        photoViewer.f35583a0.invalidate();
                    } else {
                        zf.n2 n2Var3 = photoViewer.f35688l5;
                        photoViewer.f35805y4.getOrientation();
                        n2Var3.getClass();
                        String str = photoEntry2.filterPath;
                        Bitmap bitmapDecodeFile = str != null ? BitmapFactory.decodeFile(str) : n2Var3.getSourceBitmap();
                        Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(photoEntry2.paintPath);
                        int width = bitmapDecodeFile.getWidth();
                        int height = bitmapDecodeFile.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        Paint paint = new Paint(3);
                        Paint paint2 = new Paint(3);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
                        canvas.drawBitmap(bitmapDecodeFile, 0.0f, 0.0f, paint2);
                        Rect rect = new Rect();
                        float f13 = 0.0f;
                        Bitmap bitmap2 = bitmapDecodeFile;
                        rect.set(0, 0, bitmapDecodeFile.getWidth(), bitmapDecodeFile.getHeight());
                        zf.k2 k2Var3 = n2Var3.A;
                        if (k2Var3 == null) {
                            zf.k2[] k2VarArr2 = n2Var3.D;
                            if (k2VarArr2.length > 0) {
                                k2Var3 = k2VarArr2[0];
                            }
                        }
                        if (k2Var3 == null) {
                            bitmapI0 = null;
                            f10 = 2.0f;
                        } else {
                            if (k2Var3.f50487c == 0 || !photoEntry2.isFiltered) {
                                f10 = 2.0f;
                                canvas.drawBitmap(k2Var3.a(), (Rect) null, rect, paint);
                            } else {
                                Matrix matrix = new Matrix();
                                f10 = 2.0f;
                                matrix.postRotate(k2Var3.f50487c, k2Var3.a().getWidth() / 2.0f, k2Var3.a().getHeight() / 2.0f);
                                if ((k2Var3.f50487c / 90) % 2 != 0) {
                                    float height2 = (k2Var3.a().getHeight() - k2Var3.a().getWidth()) / 2.0f;
                                    matrix.postTranslate(height2, -height2);
                                }
                                matrix.postScale(bitmap2.getWidth() / k2Var3.a().getHeight(), bitmap2.getHeight() / k2Var3.a().getWidth());
                                canvas.drawBitmap(k2Var3.a(), matrix, paint);
                            }
                            if (bitmapDecodeFile2 != null) {
                                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                                if (k2Var3.f50487c == 0 || photoEntry2.isFiltered) {
                                    canvas.drawBitmap(bitmapDecodeFile2, (Rect) null, rect, paint);
                                } else {
                                    Matrix matrix2 = new Matrix();
                                    matrix2.postRotate(-k2Var3.f50487c, bitmapDecodeFile2.getWidth() / f10, bitmapDecodeFile2.getHeight() / f10);
                                    if ((k2Var3.f50487c / 90) % 2 != 0) {
                                        float height3 = (bitmapDecodeFile2.getHeight() - bitmapDecodeFile2.getWidth()) / f10;
                                        matrix2.postTranslate(height3, -height3);
                                    }
                                    matrix2.postScale(bitmap2.getWidth() / bitmapDecodeFile2.getHeight(), bitmap2.getHeight() / bitmapDecodeFile2.getWidth());
                                    canvas.drawBitmap(bitmapDecodeFile2, matrix2, paint);
                                }
                            }
                            bitmapI0 = bitmapCreateBitmap;
                        }
                        if (bitmapI0 == null) {
                            Utilities.themeQueue.postRunnable(new sq0(photoViewer, bitmapB, 1));
                            photoViewer.f35688l5.f();
                            photoViewer.f35583a0.invalidate();
                        } else {
                            MediaController.CropState cropState = mediaEditState.cropState;
                            if (cropState != null) {
                                bitmapI0 = PhotoViewer.I0(bitmapI0, cropState, new int[]{photoViewer.f35805y4.getOrientation(), photoViewer.f35805y4.getInvert()}, true);
                            }
                            if (bitmapI0 == null) {
                                Utilities.themeQueue.postRunnable(new sq0(photoViewer, bitmapB, 2));
                                photoViewer.f35688l5.f();
                                photoViewer.f35583a0.invalidate();
                            } else {
                                Matrix matrix3 = new Matrix();
                                int width2 = bitmapI0.getWidth();
                                int height4 = bitmapI0.getHeight();
                                if (!photoEntry2.isCropped && (photoViewer.f35805y4.getOrientation() / 90) % 2 != 0) {
                                    width2 = bitmapI0.getHeight();
                                    height4 = bitmapI0.getWidth();
                                }
                                float f14 = width2;
                                float f15 = height4;
                                float fMin = Math.min(photoViewer.k1(photoViewer.f35731q4) / f14, photoViewer.i1() / f15);
                                float f16 = f14 * fMin;
                                float f17 = f15 * fMin;
                                if ((photoViewer.f35805y4.getOrientation() == 0 || photoEntry2.isCropped) && photoViewer.X5 == 0.0f) {
                                    fSqrt = f16;
                                    f11 = f17;
                                    f12 = 0.0f;
                                } else {
                                    float width3 = bitmapI0.getWidth();
                                    float height5 = bitmapI0.getHeight();
                                    float f18 = width3 / f10;
                                    float f19 = height5 / f10;
                                    float fSqrt2 = (float) Math.sqrt((f19 * f19) + (f18 * f18));
                                    float f20 = fSqrt2 * f10;
                                    int i15 = (int) f20;
                                    Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(i15, i15, config);
                                    Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                                    canvas2.save();
                                    canvas2.rotate((photoEntry2.isCropped ? 0 : photoViewer.f35805y4.getOrientation()) + photoViewer.X5, fSqrt2, fSqrt2);
                                    canvas2.drawBitmap(bitmapI0, (f20 - width3) / f10, (f20 - height5) / f10, (Paint) null);
                                    bitmapI0.recycle();
                                    float f21 = f16 / f10;
                                    float f22 = f17 / f10;
                                    fSqrt = ((float) Math.sqrt((f22 * f22) + (f21 * f21))) * f10;
                                    f12 = (-(fSqrt - f17)) / f10;
                                    f13 = (-(fSqrt - f16)) / f10;
                                    bitmapI0 = bitmapCreateBitmap2;
                                    f11 = fSqrt;
                                }
                                matrix3.postScale(fSqrt, f11);
                                float f23 = photoViewer.W5;
                                matrix3.postScale(f23, f23, fSqrt / f10, f11 / f10);
                                matrix3.postTranslate(photoViewer.T5 + f13 + Math.max(0, (int) ((photoViewer.k1(photoViewer.f35731q4) - f16) / f10)), photoViewer.U5 + f12 + Math.max(0, (int) ((photoViewer.i1() - f17) / f10)));
                                photoViewer.f35688l5.R = true;
                                Utilities.themeQueue.postRunnable(new sq0(photoViewer, bitmapB, 3));
                                hq0 hq0Var = new hq0(photoViewer, 13);
                                bf0 bf0Var = new bf0(photoViewer, bitmapB, hq0Var, 18);
                                tq0 tq0Var = new tq0(0);
                                d01 d01Var = thanosEffect.f28221a;
                                if (d01Var != null) {
                                    d01Var.c(matrix3, bitmapI0, bf0Var, tq0Var);
                                    Choreographer.getInstance().postFrameCallback(thanosEffect.f28222b);
                                } else {
                                    thanosEffect.f28223c.add(new e01(matrix3, bitmapI0, bf0Var, tq0Var));
                                }
                                AndroidUtilities.runOnUIThread(hq0Var, 1200L);
                            }
                        }
                    }
                }
                photoViewer.f35688l5.f();
                photoViewer.f35583a0.invalidate();
                break;
            default:
                boolean z14 = this.f16265b;
                String str2 = (String) this.f16266c;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.d;
                Runnable runnable2 = (Runnable) obj;
                if (!z14) {
                    runnable2.run();
                } else {
                    gw0.f28836u3.fetch(UserConfig.selectedAccount, str2, new k41(linkedHashSet, runnable2, 1));
                }
                break;
        }
    }

    public kc(el elVar, File file, boolean z10) {
        this.f16264a = 1;
        this.f16266c = elVar;
        this.d = file;
        this.f16265b = z10;
    }

    public kc(boolean z10, Object obj, Object obj2, int i10) {
        this.f16264a = i10;
        this.f16265b = z10;
        this.f16266c = obj;
        this.d = obj2;
    }
}
