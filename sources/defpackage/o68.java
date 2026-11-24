package defpackage;

import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;
public final class o68 implements Runnable {
    public final byte a;
    public final PhotoViewer b;
    public final p98 c;

    public o68(PhotoViewer photoViewer, p98 p98Var, byte b) {
        this.a = b;
        this.b = photoViewer;
        this.c = p98Var;
    }

    @Override
    public final void run() {
        bda bdaVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte b = this.a;
        int i = 0;
        p98 p98Var = this.c;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.i0.setImageBitmap(null);
                if (p98Var != null && !gl.O1() && (bdaVar = p98Var.m) != null) {
                    bdaVar.setImageBitmap(null);
                }
                try {
                    if (photoViewer.h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.h0);
                        photoViewer.a1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer.o4 = null;
                photoViewer.f0.setLayerType(0, null);
                photoViewer.m4 = (byte) 0;
                photoViewer.H0();
                photoViewer.c1(p98Var);
                MediaController.w().E0();
                if (photoViewer.A7 && !photoViewer.B7 && (arrayList = photoViewer.f7) != null) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (obj instanceof jm6) {
                            ((jm6) obj).h();
                        }
                    }
                    return;
                }
                return;
            default:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                photoViewer.o4 = null;
                k98 k98Var = photoViewer.f0;
                if (k98Var != null) {
                    k98Var.setLayerType(0, null);
                    photoViewer.m4 = (byte) 0;
                    photoViewer.c1(p98Var);
                    photoViewer.f0.setScaleX(1.0f);
                    photoViewer.f0.setScaleY(1.0f);
                    MediaController.w().E0();
                    if (photoViewer.A7 && !photoViewer.B7 && (arrayList2 = photoViewer.f7) != null) {
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            if (obj2 instanceof jm6) {
                                ((jm6) obj2).h();
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
