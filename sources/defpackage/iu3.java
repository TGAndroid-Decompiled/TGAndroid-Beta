package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.OrientationEventListener;
import org.telegram.ui.PhotoViewer;
public final class iu3 extends OrientationEventListener {
    public final byte a;
    public final Object b;

    public iu3(byte b, Context context, Object obj) {
        super(context);
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onOrientationChanged(int i) {
        Activity activity;
        m88 m88Var;
        Activity activity2;
        byte b;
        byte b2 = this.a;
        Object obj = this.b;
        switch (b2) {
            case 0:
                ou3 ou3Var = (ou3) obj;
                stc stcVar = ou3Var.m1;
                if (ou3Var.z1 != null && stcVar.getVisibility() == 0 && (activity = ou3Var.s1) != null && stcVar.U && ou3Var.G1) {
                    if (i >= 240 && i <= 300) {
                        ou3Var.H1 = true;
                        return;
                    } else if (ou3Var.H1 && i > 0) {
                        if (i >= 330 || i <= 30) {
                            activity.setRequestedOrientation(ou3Var.F1);
                            ou3Var.G1 = false;
                            ou3Var.H1 = false;
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
                if (photoViewer.W3 != null && (m88Var = photoViewer.z2) != null && m88Var.getVisibility() == 0 && (activity2 = photoViewer.E) != null && (b = photoViewer.Y3) != 0) {
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
