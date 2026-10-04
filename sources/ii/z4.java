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
public final class z4 {
    public static ColorMatrixColorFilter f12830f;
    public final ImageReceiver f12831a;
    public final ImageReceiver f12832b;
    public Bitmap f12833c;
    public final RadialProgress2 d;
    public u f12834e;

    public z4(w4 w4Var, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f12831a = new ImageReceiver(w4Var);
        this.f12832b = new ImageReceiver(w4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(w4Var, d6Var);
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
        u uVar = this.f12834e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f12831a;
        if (uVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String k10 = a4.a.k(i10, i10, "_");
        StringBuilder sb3 = new StringBuilder();
        u uVar2 = this.f12834e;
        if (uVar2 == null) {
            sb2 = "null";
        } else {
            if (uVar2.f12663b) {
                str = "v";
            } else if (uVar2.f12664c) {
                str = "a";
            } else {
                str = "p";
            }
            if (uVar2.f12665e != null) {
                StringBuilder j3 = t8.b.j(str, ":local:");
                j3.append(this.f12834e.f12665e);
                sb2 = j3.toString();
            } else {
                long j10 = 0;
                if (uVar2.b()) {
                    u uVar3 = this.f12834e;
                    TLRPC.Document document2 = uVar3.h;
                    if (document2 != null) {
                        j10 = document2.f20044id;
                    } else {
                        TLRPC.Photo photo2 = uVar3.f12667g;
                        if (photo2 != null) {
                            j10 = photo2.f20062id;
                        }
                    }
                }
                StringBuilder j11 = t8.b.j(str, ":");
                j11.append(this.f12834e.f12662a);
                j11.append(":");
                j11.append(j10);
                sb2 = j11.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(k10);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.f12834e.getClass();
        u uVar4 = this.f12834e;
        if (uVar4.f12663b) {
            if (uVar4.f12665e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.f12834e.f12665e), "g", null, k10, null, k10, null, 0L, null, null, 0);
            } else if (uVar4.b() && (document = this.f12834e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i11 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f20063w, photoSize4.h) - photoSize3)) < i11) {
                            photoSize = photoSize4;
                            i11 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f12834e.h.thumbs;
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
                imageReceiver.setImage(ImageLocation.getForDocument(this.f12834e.h), "g", ImageLocation.getForDocument(photoSize, this.f12834e.h), k10, ImageLocation.getForDocument(photoSize2, this.f12834e.h), k10, null, 0L, null, this.f12834e.h, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        } else if (uVar4.f12665e != null) {
            imageReceiver.setOrientation(uVar4.f12671l, uVar4.f12672m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.f12834e.f12665e), k10, null, null, null, 0);
        } else if (uVar4.b() && (photo = this.f12834e.f12667g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.f12834e.f12667g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.f12834e.f12667g), k10, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.f12834e.f12667g), k10, null, 0L, null, this.f12834e.f12667g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f12831a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f12832b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f12833c || imageReceiver2.getBitmap() == null)) {
                this.f12833c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f12830f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f12830f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f12830f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        u uVar = this.f12834e;
        if (uVar != null) {
            if (uVar.f12665e != null || uVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        u uVar = this.f12834e;
        if (uVar != null && !uVar.f12663b && !uVar.b()) {
            int i10 = this.f12834e.f12671l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
