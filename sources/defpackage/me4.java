package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class me4 extends i98 {
    public final af4 a;

    public me4(af4 af4Var) {
        this.a = af4Var;
    }

    @Override
    public final CharSequence B(int i) {
        return k96.s(((k27) this.a.f.get(i)).k.date, false);
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver photoImage;
        View pinnedHeader;
        int i2;
        k27 k27Var2;
        be0 be0Var;
        if (k27Var != null) {
            fu fuVar = this.a.b;
            int childCount = fuVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = fuVar.getChildAt(i3);
                int[] iArr = new int[2];
                if (childAt instanceof rfa) {
                    rfa rfaVar = (rfa) childAt;
                    photoImage = null;
                    for (int i4 = 0; i4 < 6; i4++) {
                        if (i4 >= rfaVar.e) {
                            k27Var2 = null;
                        } else {
                            k27Var2 = rfaVar.b[i4];
                        }
                        if (k27Var2 == null) {
                            break;
                        }
                        if (k27Var2.e1() == k27Var.e1()) {
                            if (i4 >= rfaVar.e) {
                                be0Var = null;
                            } else {
                                be0Var = rfaVar.a[i4].a;
                            }
                            ImageReceiver imageReceiver = be0Var.getImageReceiver();
                            be0Var.getLocationInWindow(iArr);
                            photoImage = imageReceiver;
                        }
                    }
                } else if (childAt instanceof iba) {
                    iba ibaVar = (iba) childAt;
                    if (ibaVar.getMessage().e1() == k27Var.e1()) {
                        be0 imageView = ibaVar.getImageView();
                        ImageReceiver imageReceiver2 = imageView.getImageReceiver();
                        imageView.getLocationInWindow(iArr);
                        photoImage = imageReceiver2;
                    }
                    photoImage = null;
                } else {
                    if (childAt instanceof bw2) {
                        bw2 bw2Var = (bw2) childAt;
                        k27 k27Var3 = (k27) bw2Var.getParentObject();
                        if (k27Var3 != null && k27Var3.e1() == k27Var.e1()) {
                            photoImage = bw2Var.getPhotoImage();
                            bw2Var.getLocationInWindow(iArr);
                        }
                    }
                    photoImage = null;
                }
                if (photoImage != null) {
                    p98 p98Var = new p98();
                    p98Var.b = iArr[0];
                    p98Var.c = iArr[1];
                    p98Var.d = fuVar;
                    fuVar.getLocationInWindow(iArr);
                    p98Var.n = -iArr[1];
                    p98Var.a = photoImage;
                    p98Var.o = false;
                    p98Var.h = photoImage.z();
                    p98Var.e = p98Var.a.p();
                    p98Var.d.getLocationInWindow(iArr);
                    p98Var.j = 0;
                    if (PhotoViewer.P0(k27Var) && (pinnedHeader = fuVar.getPinnedHeader()) != null) {
                        if (childAt instanceof iba) {
                            i2 = gl.L(8.0f);
                        } else {
                            i2 = 0;
                        }
                        int i5 = i2 - p98Var.c;
                        if (i5 > childAt.getHeight()) {
                            fuVar.scrollBy(0, -(pinnedHeader.getHeight() + i5));
                            return p98Var;
                        }
                        int height = p98Var.c - fuVar.getHeight();
                        if (childAt instanceof iba) {
                            height -= gl.L(8.0f);
                        }
                        if (height >= 0) {
                            fuVar.scrollBy(0, childAt.getHeight() + height);
                        }
                    }
                    return p98Var;
                }
            }
        }
        return null;
    }

    @Override
    public final boolean Z() {
        af4 af4Var = this.a;
        if (!af4Var.O) {
            af4Var.h(af4Var.F, af4Var.G, af4Var.I, af4Var.H, af4Var.E, af4Var.K, af4Var.x, false);
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence c0(int i) {
        return af4.c((k27) this.a.f.get(i), true, 0, null);
    }

    @Override
    public final int x() {
        return this.a.P;
    }
}
