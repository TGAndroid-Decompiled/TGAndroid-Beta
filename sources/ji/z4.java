package ji;

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
public final class z4 {
    public static ColorMatrixColorFilter f14403f;
    public final ImageReceiver f14404a;
    public final ImageReceiver f14405b;
    public Bitmap f14406c;
    public final RadialProgress2 d;
    public u f14407e;

    public z4(w4 w4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f14404a = new ImageReceiver(w4Var);
        this.f14405b = new ImageReceiver(w4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(w4Var, f6Var);
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
        u uVar = this.f14407e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f14404a;
        if (uVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String k10 = a4.a.k(i10, i10, "_");
        StringBuilder sb3 = new StringBuilder();
        u uVar2 = this.f14407e;
        if (uVar2 == null) {
            sb2 = "null";
        } else {
            if (uVar2.f14222b) {
                str = "v";
            } else if (uVar2.f14223c) {
                str = "a";
            } else {
                str = "p";
            }
            if (uVar2.f14224e != null) {
                StringBuilder g10 = w.f.g(str, ":local:");
                g10.append(this.f14407e.f14224e);
                sb2 = g10.toString();
            } else {
                long j3 = 0;
                if (uVar2.b()) {
                    u uVar3 = this.f14407e;
                    TLRPC.Document document2 = uVar3.h;
                    if (document2 != null) {
                        j3 = document2.f19902id;
                    } else {
                        TLRPC.Photo photo2 = uVar3.f14226g;
                        if (photo2 != null) {
                            j3 = photo2.f19920id;
                        }
                    }
                }
                StringBuilder g11 = w.f.g(str, ":");
                g11.append(this.f14407e.f14221a);
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
        this.f14407e.getClass();
        u uVar4 = this.f14407e;
        if (uVar4.f14222b) {
            if (uVar4.f14224e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.f14407e.f14224e), "g", null, k10, null, k10, null, 0L, null, null, 0);
            } else if (uVar4.b() && (document = this.f14407e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i11 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f19921w, photoSize4.h) - photoSize3)) < i11) {
                            photoSize = photoSize4;
                            i11 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f14407e.h.thumbs;
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
                imageReceiver.setImage(ImageLocation.getForDocument(this.f14407e.h), "g", ImageLocation.getForDocument(photoSize, this.f14407e.h), k10, ImageLocation.getForDocument(photoSize2, this.f14407e.h), k10, null, 0L, null, this.f14407e.h, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        } else if (uVar4.f14224e != null) {
            imageReceiver.setOrientation(uVar4.f14230l, uVar4.f14231m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.f14407e.f14224e), k10, null, null, null, 0);
        } else if (uVar4.b() && (photo = this.f14407e.f14226g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.f14407e.f14226g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.f14407e.f14226g), k10, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.f14407e.f14226g), k10, null, 0L, null, this.f14407e.f14226g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f14404a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f14405b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f14406c || imageReceiver2.getBitmap() == null)) {
                this.f14406c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f14403f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f14403f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f14403f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        u uVar = this.f14407e;
        if (uVar != null) {
            if (uVar.f14224e != null || uVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        u uVar = this.f14407e;
        if (uVar != null && !uVar.f14222b && !uVar.b()) {
            int i10 = this.f14407e.f14230l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
