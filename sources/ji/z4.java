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
    public static ColorMatrixColorFilter f14377f;
    public final ImageReceiver f14378a;
    public final ImageReceiver f14379b;
    public Bitmap f14380c;
    public final RadialProgress2 d;
    public u f14381e;

    public z4(w4 w4Var, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f14378a = new ImageReceiver(w4Var);
        this.f14379b = new ImageReceiver(w4Var);
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
        u uVar = this.f14381e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f14378a;
        if (uVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String k10 = a4.a.k(i10, i10, "_");
        StringBuilder sb3 = new StringBuilder();
        u uVar2 = this.f14381e;
        if (uVar2 == null) {
            sb2 = "null";
        } else {
            if (uVar2.f14196b) {
                str = "v";
            } else if (uVar2.f14197c) {
                str = "a";
            } else {
                str = "p";
            }
            if (uVar2.f14198e != null) {
                StringBuilder g10 = w.f.g(str, ":local:");
                g10.append(this.f14381e.f14198e);
                sb2 = g10.toString();
            } else {
                long j3 = 0;
                if (uVar2.b()) {
                    u uVar3 = this.f14381e;
                    TLRPC.Document document2 = uVar3.h;
                    if (document2 != null) {
                        j3 = document2.f19875id;
                    } else {
                        TLRPC.Photo photo2 = uVar3.f14200g;
                        if (photo2 != null) {
                            j3 = photo2.f19893id;
                        }
                    }
                }
                StringBuilder g11 = w.f.g(str, ":");
                g11.append(this.f14381e.f14195a);
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
        this.f14381e.getClass();
        u uVar4 = this.f14381e;
        if (uVar4.f14196b) {
            if (uVar4.f14198e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.f14381e.f14198e), "g", null, k10, null, k10, null, 0L, null, null, 0);
            } else if (uVar4.b() && (document = this.f14381e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i11 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f19894w, photoSize4.h) - photoSize3)) < i11) {
                            photoSize = photoSize4;
                            i11 = abs;
                        }
                    }
                }
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f14381e.h.thumbs;
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
                imageReceiver.setImage(ImageLocation.getForDocument(this.f14381e.h), "g", ImageLocation.getForDocument(photoSize, this.f14381e.h), k10, ImageLocation.getForDocument(photoSize2, this.f14381e.h), k10, null, 0L, null, this.f14381e.h, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        } else if (uVar4.f14198e != null) {
            imageReceiver.setOrientation(uVar4.f14204l, uVar4.f14205m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.f14381e.f14198e), k10, null, null, null, 0);
        } else if (uVar4.b() && (photo = this.f14381e.f14200g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.f14381e.f14200g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.f14381e.f14200g), k10, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.f14381e.f14200g), k10, null, 0L, null, this.f14381e.f14200g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f14378a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f14379b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f14380c || imageReceiver2.getBitmap() == null)) {
                this.f14380c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f14377f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f14377f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f14377f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        u uVar = this.f14381e;
        if (uVar != null) {
            if (uVar.f14198e != null || uVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        u uVar = this.f14381e;
        if (uVar != null && !uVar.f14196b && !uVar.b()) {
            int i10 = this.f14381e.f14204l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
