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
    public static ColorMatrixColorFilter f12877f;
    public final ImageReceiver f12878a;
    public final ImageReceiver f12879b;
    public Bitmap f12880c;
    public final RadialProgress2 d;
    public u f12881e;

    public z4(w4 w4Var, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f12878a = new ImageReceiver(w4Var);
        this.f12879b = new ImageReceiver(w4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(w4Var, e6Var);
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
        u uVar = this.f12881e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f12878a;
        if (uVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String l4 = a1.g.l(i10, i10, "_");
        StringBuilder sb3 = new StringBuilder();
        u uVar2 = this.f12881e;
        if (uVar2 == null) {
            sb2 = "null";
        } else {
            if (uVar2.f12711b) {
                str = "v";
            } else if (uVar2.f12712c) {
                str = "a";
            } else {
                str = "p";
            }
            if (uVar2.f12713e != null) {
                StringBuilder j3 = sc.v.j(str, ":local:");
                j3.append(this.f12881e.f12713e);
                sb2 = j3.toString();
            } else {
                long j10 = 0;
                if (uVar2.b()) {
                    u uVar3 = this.f12881e;
                    TLRPC.Document document2 = uVar3.h;
                    if (document2 != null) {
                        j10 = document2.f20044id;
                    } else {
                        TLRPC.Photo photo2 = uVar3.f12715g;
                        if (photo2 != null) {
                            j10 = photo2.f20062id;
                        }
                    }
                }
                StringBuilder j11 = sc.v.j(str, ":");
                j11.append(this.f12881e.f12710a);
                j11.append(":");
                j11.append(j10);
                sb2 = j11.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(l4);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.f12881e.getClass();
        u uVar4 = this.f12881e;
        if (uVar4.f12711b) {
            if (uVar4.f12713e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.f12881e.f12713e), "g", null, l4, null, l4, null, 0L, null, null, 0);
            } else if (uVar4.b() && (document = this.f12881e.h) != null) {
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
                ArrayList<TLRPC.PhotoSize> arrayList2 = this.f12881e.h.thumbs;
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
                imageReceiver.setImage(ImageLocation.getForDocument(this.f12881e.h), "g", ImageLocation.getForDocument(photoSize, this.f12881e.h), l4, ImageLocation.getForDocument(photoSize2, this.f12881e.h), l4, null, 0L, null, this.f12881e.h, 0);
            } else {
                imageReceiver.setImageBitmap((Drawable) null);
            }
        } else if (uVar4.f12713e != null) {
            imageReceiver.setOrientation(uVar4.f12719l, uVar4.f12720m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.f12881e.f12713e), l4, null, null, null, 0);
        } else if (uVar4.b() && (photo = this.f12881e.f12715g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.f12881e.f12715g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.f12881e.f12715g), l4, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.f12881e.f12715g), l4, null, 0L, null, this.f12881e.f12715g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f12878a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f12879b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f12880c || imageReceiver2.getBitmap() == null)) {
                this.f12880c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f12877f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f12877f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f12877f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        u uVar = this.f12881e;
        if (uVar != null) {
            if (uVar.f12713e != null || uVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        u uVar = this.f12881e;
        if (uVar != null && !uVar.f12711b && !uVar.b()) {
            int i10 = this.f12881e.f12719l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
