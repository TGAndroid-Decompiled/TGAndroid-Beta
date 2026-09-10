package hi;

import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
public final class a5 {
    public static ColorMatrixColorFilter f9457f;
    public final ImageReceiver f9458a;
    public final ImageReceiver f9459b;
    public Bitmap f9460c;
    public final RadialProgress2 d;
    public v e;

    public a5(x4 x4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f9458a = new ImageReceiver(x4Var);
        this.f9459b = new ImageReceiver(x4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(x4Var, f6Var);
        this.d = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        radialProgress2.setIcon(3, false, false);
    }

    public final void a() {
        String str;
        String sb2;
        TLRPC.Photo photo;
        TLRPC.Document document;
        TLRPC.PhotoSize photoSize;
        int abs;
        v vVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f9458a;
        if (vVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String k10 = a4.a.k(i10, i10, "_");
        StringBuilder sb3 = new StringBuilder();
        v vVar2 = this.e;
        if (vVar2 == null) {
            sb2 = "null";
        } else {
            if (vVar2.f9895b) {
                str = "v";
            } else if (vVar2.f9896c) {
                str = "a";
            } else {
                str = "p";
            }
            if (vVar2.e != null) {
                StringBuilder g10 = w.f.g(str, ":local:");
                g10.append(this.e.e);
                sb2 = g10.toString();
            } else {
                long j3 = 0;
                if (vVar2.b()) {
                    v vVar3 = this.e;
                    TLRPC.Document document2 = vVar3.h;
                    if (document2 != null) {
                        j3 = document2.f17201id;
                    } else {
                        TLRPC.Photo photo2 = vVar3.f9898g;
                        if (photo2 != null) {
                            j3 = photo2.f17219id;
                        }
                    }
                }
                StringBuilder g11 = w.f.g(str, ":");
                g11.append(this.e.f9894a);
                g11.append(":");
                g11.append(j3);
                sb2 = g11.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(k10);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        v vVar4 = this.e;
        if (vVar4.f9895b) {
            if (vVar4.e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.e.e), "g", null, k10, null, k10, null, 0L, null, null, 0);
            } else if (vVar4.b() && (document = this.e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i11 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f17220w, photoSize4.h) - photoSize3)) < i11) {
                            photoSize = photoSize4;
                            i11 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.e.h.thumbs;
                if (arrayList2 != null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i13) instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize2 = arrayList2.get(i13);
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForDocument(this.e.h), "g", ImageLocation.getForDocument(photoSize, this.e.h), k10, ImageLocation.getForDocument(photoSize2, this.e.h), k10, null, 0L, null, this.e.h, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        } else if (vVar4.e != null) {
            imageReceiver.setOrientation(vVar4.f9902l, vVar4.f9903m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.e.e), k10, null, null, null, 0);
        } else if (vVar4.b() && (photo = this.e.f9898g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.e.f9898g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.e.f9898g), k10, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.e.f9898g), k10, null, 0L, null, this.e.f9898g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f9458a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f9459b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f9460c || imageReceiver2.getBitmap() == null)) {
                this.f9460c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f9457f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f9457f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f9457f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        v vVar = this.e;
        if (vVar != null) {
            if (vVar.e != null || vVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        v vVar = this.e;
        if (vVar != null && !vVar.f9895b && !vVar.b()) {
            int i10 = this.e.f9902l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
