package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class kg4 extends yc8 {
    public final yg4 a;

    public kg4(yg4 yg4Var) {
        this.a = yg4Var;
    }

    @Override
    public final CharSequence B(int i) {
        return ob6.s(((r47) this.a.f.get(i)).k.date, false);
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i2;
        r47 r47Var2;
        de0 de0Var;
        if (r47Var != null) {
            gu guVar = this.a.b;
            int childCount = guVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = guVar.getChildAt(i3);
                int[] iArr = new int[2];
                if (childAt instanceof kja) {
                    kja kjaVar = (kja) childAt;
                    photoImage = null;
                    for (int i4 = 0; i4 < 6; i4++) {
                        if (i4 >= kjaVar.e) {
                            r47Var2 = null;
                        } else {
                            r47Var2 = kjaVar.b[i4];
                        }
                        if (r47Var2 == null) {
                            break;
                        }
                        if (r47Var2.e1() == r47Var.e1()) {
                            if (i4 >= kjaVar.e) {
                                de0Var = null;
                            } else {
                                de0Var = kjaVar.a[i4].a;
                            }
                            ImageReceiver imageReceiver = de0Var.getImageReceiver();
                            de0Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof zea) {
                    zea zeaVar = (zea) childAt;
                    if (zeaVar.getMessage().e1() == r47Var.e1()) {
                        de0 imageView = zeaVar.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof vw2) {
                        vw2 vw2Var = (vw2) childAt;
                        r47 r47Var3 = (r47) vw2Var.getParentObject();
                        if (r47Var3 != null && r47Var3.e1() == r47Var.e1()) {
                            photoImage = vw2Var.getPhotoImage();
                            vw2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    fd8 fd8Var = new fd8();
                    fd8Var.b = iArr[0];
                    fd8Var.c = iArr[1];
                    fd8Var.d = guVar;
                    guVar.getLocationInWindow(iArr);
                    fd8Var.n = -iArr[1];
                    fd8Var.a = photoImage;
                    fd8Var.o = false;
                    fd8Var.h = photoImage.z();
                    fd8Var.e = fd8Var.a.p();
                    fd8Var.d.getLocationInWindow(iArr);
                    fd8Var.j = 0;
                    if (PhotoViewer.P0(r47Var) && (pinnedHeader = guVar.getPinnedHeader()) != null) {
                        if (childAt instanceof zea) {
                            i2 = hl.L(8.0f);
                        } else {
                            i2 = 0;
                        }
                        int i5 = i2 - fd8Var.c;
                        if (i5 > childAt.getHeight()) {
                            guVar.scrollBy(0, -(pinnedHeader.getHeight() + i5));
                            return fd8Var;
                        }
                        int height = fd8Var.c - guVar.getHeight();
                        if (childAt instanceof zea) {
                            height -= hl.L(8.0f);
                        }
                        if (height >= 0) {
                            guVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return fd8Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean a0() {
        yg4 yg4Var = this.a;
        if (!yg4Var.O) {
            yg4Var.h(yg4Var.F, yg4Var.G, yg4Var.I, yg4Var.H, yg4Var.E, yg4Var.K, yg4Var.x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence d0(int i) {
        return yg4.c((r47) this.a.f.get(i), true, 0, null);
    }

    @Override
    public final int x() {
        return this.a.P;
    }
}
