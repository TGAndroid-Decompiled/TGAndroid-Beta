package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class og4 extends jb8 {
    public final ch4 a;

    public og4(ch4 ch4Var) {
        this.a = ch4Var;
    }

    @Override
    public final CharSequence C(int i) {
        return jb6.s(((k47) this.a.f.get(i)).k.date, false);
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i2;
        k47 k47Var2;
        bf0 bf0Var;
        if (k47Var != null) {
            fv fvVar = this.a.b;
            int childCount = fvVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = fvVar.getChildAt(i3);
                int[] iArr = new int[2];
                if (childAt instanceof tha) {
                    tha thaVar = (tha) childAt;
                    photoImage = null;
                    for (int i4 = 0; i4 < 6; i4++) {
                        if (i4 >= thaVar.e) {
                            k47Var2 = null;
                        } else {
                            k47Var2 = thaVar.b[i4];
                        }
                        if (k47Var2 == null) {
                            break;
                        }
                        if (k47Var2.e1() == k47Var.e1()) {
                            if (i4 >= thaVar.e) {
                                bf0Var = null;
                            } else {
                                bf0Var = thaVar.a[i4].a;
                            }
                            ImageReceiver imageReceiver = bf0Var.getImageReceiver();
                            bf0Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof ida) {
                    ida idaVar = (ida) childAt;
                    if (idaVar.getMessage().e1() == k47Var.e1()) {
                        bf0 imageView = idaVar.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof lx2) {
                        lx2 lx2Var = (lx2) childAt;
                        k47 k47Var3 = (k47) lx2Var.getParentObject();
                        if (k47Var3 != null && k47Var3.e1() == k47Var.e1()) {
                            photoImage = lx2Var.getPhotoImage();
                            lx2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    qb8 qb8Var = new qb8();
                    qb8Var.b = iArr[0];
                    qb8Var.c = iArr[1];
                    qb8Var.d = fvVar;
                    fvVar.getLocationInWindow(iArr);
                    qb8Var.n = -iArr[1];
                    qb8Var.a = photoImage;
                    qb8Var.o = false;
                    qb8Var.h = photoImage.z();
                    qb8Var.e = qb8Var.a.p();
                    qb8Var.d.getLocationInWindow(iArr);
                    qb8Var.j = 0;
                    if (PhotoViewer.P0(k47Var) && (pinnedHeader = fvVar.getPinnedHeader()) != null) {
                        if (childAt instanceof ida) {
                            i2 = gm.L(8.0f);
                        } else {
                            i2 = 0;
                        }
                        int i5 = i2 - qb8Var.c;
                        if (i5 > childAt.getHeight()) {
                            fvVar.scrollBy(0, -(pinnedHeader.getHeight() + i5));
                            return qb8Var;
                        }
                        int height = qb8Var.c - fvVar.getHeight();
                        if (childAt instanceof ida) {
                            height -= gm.L(8.0f);
                        }
                        if (height >= 0) {
                            fvVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return qb8Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean a0() {
        ch4 ch4Var = this.a;
        if (!ch4Var.O) {
            ch4Var.h(ch4Var.F, ch4Var.G, ch4Var.I, ch4Var.H, ch4Var.E, ch4Var.K, ch4Var.x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence d0(int i) {
        return ch4.c((k47) this.a.f.get(i), true, 0, null);
    }

    @Override
    public final int x() {
        return this.a.P;
    }
}
