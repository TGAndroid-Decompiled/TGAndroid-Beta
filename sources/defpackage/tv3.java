package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;
public final class tv3 extends OrientationEventListener {
    public final byte a;
    public final Object b;

    public tv3(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onOrientationChanged(int i) {
        Activity activity;
        oa8 oa8Var;
        Activity activity2;
        byte b;
        byte b2 = this.a;
        Object obj = this.b;
        switch (b2) {
            case 0:
                zv3 zv3Var = (zv3) obj;
                tvc tvcVar = zv3Var.m1;
                if (zv3Var.z1 != null && tvcVar.getVisibility() == 0 && (activity = zv3Var.s1) != null && tvcVar.U && zv3Var.G1) {
                    if (i >= 240 && i <= 300) {
                        zv3Var.H1 = true;
                        return;
                    } else if (zv3Var.H1 && i > 0) {
                        if (i >= 330 || i <= 30) {
                            activity.setRequestedOrientation(zv3Var.F1);
                            zv3Var.G1 = false;
                            zv3Var.H1 = false;
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
                if (photoViewer.W3 != null && (oa8Var = photoViewer.z2) != null && oa8Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (b = photoViewer.Y3) != 0) {
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
