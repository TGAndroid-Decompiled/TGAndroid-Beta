package li;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.b10;
public final class x4 {
    public static ColorMatrixColorFilter f17622f;
    public final ImageReceiver f17623a;
    public final ImageReceiver f17624b;
    public Bitmap f17625c;
    public final RadialProgress2 d;
    public t e;

    public x4(u4 u4Var, u6 u6Var) {
        this.f17623a = new ImageReceiver(u4Var);
        this.f17624b = new ImageReceiver(u4Var);
        RadialProgress2 radialProgress2 = new RadialProgress2(u4Var, u6Var);
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
        t tVar = this.e;
        TLRPC.PhotoSize photoSize2 = null;
        ImageReceiver imageReceiver = this.f17623a;
        if (tVar == null) {
            imageReceiver.setImageBitmap((Drawable) null);
            return;
        }
        int i10 = AndroidUtilities.displaySize.x;
        String k10 = a1.g.k(i10, i10, "_");
        StringBuilder sb3 = new StringBuilder();
        t tVar2 = this.e;
        if (tVar2 == null) {
            sb2 = "null";
        } else {
            if (tVar2.f17477b) {
                str = "v";
            } else if (tVar2.f17478c) {
                str = "a";
            } else {
                str = "p";
            }
            if (tVar2.e != null) {
                StringBuilder l4 = b10.l(str, ":local:");
                l4.append(this.e.e);
                sb2 = l4.toString();
            } else {
                long j10 = 0;
                if (tVar2.b()) {
                    t tVar3 = this.e;
                    TLRPC.Document document2 = tVar3.h;
                    if (document2 != null) {
                        j10 = document2.f22034id;
                    } else {
                        TLRPC.Photo photo2 = tVar3.f17480g;
                        if (photo2 != null) {
                            j10 = photo2.f22052id;
                        }
                    }
                }
                StringBuilder l10 = b10.l(str, ":");
                l10.append(this.e.f17476a);
                l10.append(":");
                l10.append(j10);
                sb2 = l10.toString();
            }
        }
        sb3.append(sb2);
        sb3.append("@");
        sb3.append(k10);
        if (sb3.toString().equals(null)) {
            return;
        }
        this.e.getClass();
        t tVar4 = this.e;
        if (tVar4.f17477b) {
            if (tVar4.e != null) {
                imageReceiver.setOrientation(0, 0, false);
                imageReceiver.setImage(ImageLocation.getForVideoPath(this.e.e), "g", null, k10, null, k10, null, 0L, null, null, 0);
            } else if (tVar4.b() && (document = this.e.h) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = document.thumbs;
                int photoSize3 = AndroidUtilities.getPhotoSize();
                if (arrayList == null) {
                    photoSize = null;
                } else {
                    int i11 = Integer.MAX_VALUE;
                    photoSize = null;
                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                        TLRPC.PhotoSize photoSize4 = arrayList.get(i12);
                        if (!(photoSize4 instanceof TLRPC.TL_photoStrippedSize) && !(photoSize4 instanceof TLRPC.TL_photoPathSize) && (abs = Math.abs(Math.max(photoSize4.f22053w, photoSize4.h) - photoSize3)) < i11) {
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
        } else if (tVar4.e != null) {
            imageReceiver.setOrientation(tVar4.f17484l, tVar4.f17485m, true);
            imageReceiver.setImage(ImageLocation.getForPath(this.e.e), k10, null, null, null, 0);
        } else if (tVar4.b() && (photo = this.e.f17480g) != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(this.e.f17480g.sizes, 100);
            imageReceiver.setOrientation(0, 0, false);
            imageReceiver.setImage(ImageLocation.getForPhoto(closestPhotoSizeWithSize, this.e.f17480g), k10, ImageLocation.getForPhoto(closestPhotoSizeWithSize2, this.e.f17480g), k10, null, 0L, null, this.e.f17480g, 0);
        } else {
            imageReceiver.setImageBitmap((Drawable) null);
        }
    }

    public final boolean b() {
        ImageReceiver imageReceiver;
        Bitmap bitmap;
        if (c() && (bitmap = (imageReceiver = this.f17623a).getBitmap()) != null && !bitmap.isRecycled()) {
            ImageReceiver imageReceiver2 = this.f17624b;
            if ((imageReceiver2.getBitmap() == null || imageReceiver.getAnimation() == null) && (bitmap != this.f17625c || imageReceiver2.getBitmap() == null)) {
                this.f17625c = bitmap;
                imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(bitmap, false));
                if (f17622f == null) {
                    ColorMatrix colorMatrix = new ColorMatrix();
                    AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                    AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                    f17622f = new ColorMatrixColorFilter(colorMatrix);
                }
                imageReceiver2.setColorFilter(f17622f);
            }
            if (imageReceiver2.getBitmap() != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        t tVar = this.e;
        if (tVar != null) {
            if (tVar.e != null || tVar.b()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean d() {
        t tVar = this.e;
        if (tVar != null && !tVar.f17477b && !tVar.b()) {
            int i10 = this.e.f17484l;
            if (i10 == 90 || i10 == 270) {
                return true;
            }
            return false;
        }
        return false;
    }
}
