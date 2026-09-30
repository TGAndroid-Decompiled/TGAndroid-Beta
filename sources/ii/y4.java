package ii;

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
public final class y4 {
    public static ColorMatrixColorFilter f11790f;
    public final ImageReceiver f11791a;
    public final ImageReceiver f11792b;
    public Bitmap f11793c;
    public final RadialProgress2 d;
    public u e;

    public y4(v4 v4Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f11791a = new ImageReceiver(v4Var);
        this.f11792b = new ImageReceiver(v4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(v4Var, d6Var);
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
        u uVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f11791a;
        if (uVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String l4 = a4.a.l(i10, i10, "_");
        StringBuilder sb3 = new StringBuilder();
        u uVar2 = this.e;
        if (uVar2 == null) {
            sb2 = "null";
        } else {
            if (uVar2.f11648b) {
                str = "v";
            } else if (uVar2.f11649c) {
                str = "a";
            } else {
                str = "p";
            }
            if (uVar2.e != null) {
                StringBuilder h = v7.j.h(str, ":local:");
                h.append(this.e.e);
                sb2 = h.toString();
            } else {
                long j3 = 0;
                if (uVar2.b()) {
                    u uVar3 = this.e;
                    TLRPC.Document document2 = uVar3.h;
                    if (document2 != null) {
                        j3 = document2.f18358id;
                    } else {
                        TLRPC.Photo photo2 = uVar3.f11651g;
                        if (photo2 != null) {
                            j3 = photo2.f18376id;
                        }
                    }
                }
                StringBuilder h10 = v7.j.h(str, ":");
                h10.append(this.e.f11647a);
                h10.append(":");
                h10.append(j3);
                sb2 = h10.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(l4);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        u uVar4 = this.e;
        if (uVar4.f11648b) {
            if (uVar4.e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.e.e), "g", null, l4, null, l4, null, 0L, null, null, 0);
            } else if (uVar4.b() && (document = this.e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i11 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f18377w, photoSize4.h) - photoSize3)) < i11) {
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
                imageReceiver.setImage(ImageLocation.getForDocument(this.e.h), "g", ImageLocation.getForDocument(photoSize, this.e.h), l4, ImageLocation.getForDocument(photoSize2, this.e.h), l4, null, 0L, null, this.e.h, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        } else if (uVar4.e != null) {
            imageReceiver.setOrientation(uVar4.f11655l, uVar4.f11656m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.e.e), l4, null, null, null, 0);
        } else if (uVar4.b() && (photo = this.e.f11651g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.e.f11651g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.e.f11651g), l4, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.e.f11651g), l4, null, 0L, null, this.e.f11651g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f11791a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f11792b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f11793c || imageReceiver2.getBitmap() == null)) {
                this.f11793c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f11790f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f11790f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f11790f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        u uVar = this.e;
        if (uVar != null) {
            if (uVar.e != null || uVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        u uVar = this.e;
        if (uVar != null && !uVar.f11648b && !uVar.b()) {
            int i10 = this.e.f11655l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
