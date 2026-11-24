package defpackage;

import android.graphics.drawable.Drawable;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;
public final class q88 implements Runnable {
    public final byte a;
    public final PhotoViewer b;
    public final qb8 c;

    public q88(PhotoViewer photoViewer, qb8 qb8Var, byte b) {
        this.a = b;
        this.b = photoViewer;
        this.c = qb8Var;
    }

    @Override
    public final void run() {
        bfa bfaVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        byte b = this.a;
        int i = 0;
        qb8 qb8Var = this.c;
        PhotoViewer photoViewer = this.b;
        switch (b) {
            case 0:
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.i0.setImageBitmap(null);
                if (qb8Var != null && !gm.O1() && (bfaVar = qb8Var.m) != null) {
                    bfaVar.setImageBitmap(null);
                }
                try {
                    if (photoViewer.h0.getParent() != null) {
                        ((WindowManager) photoViewer.E.getSystemService("window")).removeView(photoViewer.h0);
                        photoViewer.a1();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                Drawable[] drawableArr2 = PhotoViewer.d9;
                photoViewer.o4 = null;
                photoViewer.f0.setLayerType(0, null);
                photoViewer.m4 = (byte) 0;
                photoViewer.H0();
                photoViewer.c1(qb8Var);
                MediaController.w().E0();
                if (photoViewer.A7 && !photoViewer.B7 && (arrayList = photoViewer.f7) != null) {
                    int size = arrayList.size();
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        if (obj instanceof jo6) {
                            ((jo6) obj).h();
                        }
                    }
                    return;
                }
                return;
            default:
                Drawable[] drawableArr3 = PhotoViewer.d9;
                photoViewer.o4 = null;
                lb8 lb8Var = photoViewer.f0;
                if (lb8Var != null) {
                    lb8Var.setLayerType(0, null);
                    photoViewer.m4 = (byte) 0;
                    photoViewer.c1(qb8Var);
                    photoViewer.f0.setScaleX(1.0f);
                    photoViewer.f0.setScaleY(1.0f);
                    MediaController.w().E0();
                    if (photoViewer.A7 && !photoViewer.B7 && (arrayList2 = photoViewer.f7) != null) {
                        int size2 = arrayList2.size();
                        while (i < size2) {
                            Object obj2 = arrayList2.get(i);
                            i++;
                            if (obj2 instanceof jo6) {
                                ((jo6) obj2).h();
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
