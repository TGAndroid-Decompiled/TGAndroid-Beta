package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;
public final class cv3 extends OrientationEventListener {
    public final byte a;
    public final Object b;

    public cv3(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onOrientationChanged(int i) {
        Activity activity;
        dc8 dc8Var;
        Activity activity2;
        byte b;
        byte b2 = this.a;
        Object obj = this.b;
        switch (b2) {
            case 0:
                iv3 iv3Var = (iv3) obj;
                hyc hycVar = iv3Var.m1;
                if (iv3Var.z1 != null && hycVar.getVisibility() == 0 && (activity = iv3Var.s1) != null && hycVar.U && iv3Var.G1) {
                    if (i >= 240 && i <= 300) {
                        iv3Var.H1 = true;
                        return;
                    } else if (iv3Var.H1 && i > 0) {
                        if (i >= 330 || i <= 30) {
                            activity.setRequestedOrientation(iv3Var.F1);
                            iv3Var.G1 = false;
                            iv3Var.H1 = false;
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                if (photoViewer.W3 != null && (dc8Var = photoViewer.z2) != null && dc8Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (b = photoViewer.Y3) != 0) {
                    if (b == 1) {
                        if (i >= 240 && i <= 300) {
                            photoViewer.Z3 = true;
                            return;
                        } else if (photoViewer.Z3 && i > 0) {
                            if (i >= 330 || i <= 30) {
                                activity2.setRequestedOrientation(photoViewer.X3);
                                photoViewer.Y3 = (byte) 0;
                                photoViewer.Z3 = false;
                                return;
                            }
                            return;
                        } else {
                            return;
                        }
                    } else if (i > 0 && (i >= 330 || i <= 30)) {
                        photoViewer.Z3 = true;
                        return;
                    } else if (photoViewer.Z3 && i >= 240 && i <= 300) {
                        activity2.setRequestedOrientation(photoViewer.X3);
                        photoViewer.Y3 = (byte) 0;
                        photoViewer.Z3 = false;
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
