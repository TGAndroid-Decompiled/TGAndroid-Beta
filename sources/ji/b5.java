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
public final class b5 {
    public static ColorMatrixColorFilter f13154f;
    public final ImageReceiver f13155a;
    public final ImageReceiver f13156b;
    public Bitmap f13157c;
    public final RadialProgress2 d;
    public u e;

    public b5(y4 y4Var, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f13155a = new ImageReceiver(y4Var);
        this.f13156b = new ImageReceiver(y4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(y4Var, c6Var);
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
        ImageReceiver imageReceiver = this.f13155a;
        if (uVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String k10 = a1.g.k(i10, i10, "_");
        StringBuilder sb3 = new StringBuilder();
        u uVar2 = this.e;
        if (uVar2 == null) {
            sb2 = "null";
        } else {
            if (uVar2.f13536b) {
                str = "v";
            } else if (uVar2.f13537c) {
                str = "a";
            } else {
                str = "p";
            }
            if (uVar2.e != null) {
                StringBuilder i11 = t8.b.i(str, ":local:");
                i11.append(this.e.e);
                sb2 = i11.toString();
            } else {
                long j10 = 0;
                if (uVar2.b()) {
                    u uVar3 = this.e;
                    TLRPC.Document document2 = uVar3.h;
                    if (document2 != null) {
                        j10 = document2.f19222id;
                    } else {
                        TLRPC.Photo photo2 = uVar3.f13539g;
                        if (photo2 != null) {
                            j10 = photo2.f19240id;
                        }
                    }
                }
                StringBuilder i12 = t8.b.i(str, ":");
                i12.append(this.e.f13535a);
                i12.append(":");
                i12.append(j10);
                sb2 = i12.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(k10);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        u uVar4 = this.e;
        if (uVar4.f13536b) {
            if (uVar4.e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.e.e), "g", null, k10, null, k10, null, 0L, null, null, 0);
            } else if (uVar4.b() && (document = this.e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i13 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i14);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f19241w, photoSize4.h) - photoSize3)) < i13) {
                            photoSize = photoSize4;
                            i13 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.e.h.thumbs;
                if (arrayList2 != null) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= arrayList2.size()) {
                            break;
                        } else if (arrayList2.get(i15) instanceof TLRPC.TL_photoStrippedSize) {
                            photoSize2 = arrayList2.get(i15);
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForDocument(this.e.h), "g", ImageLocation.getForDocument(photoSize, this.e.h), k10, ImageLocation.getForDocument(photoSize2, this.e.h), k10, null, 0L, null, this.e.h, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        } else if (uVar4.e != null) {
            imageReceiver.setOrientation(uVar4.f13543l, uVar4.f13544m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.e.e), k10, null, null, null, 0);
        } else if (uVar4.b() && (photo = this.e.f13539g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.e.f13539g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.e.f13539g), k10, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.e.f13539g), k10, null, 0L, null, this.e.f13539g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f13155a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f13156b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f13157c || imageReceiver2.getBitmap() == null)) {
                this.f13157c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f13154f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f13154f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f13154f);
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
        if (uVar != null && !uVar.f13536b && !uVar.b()) {
            int i10 = this.e.f13543l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
