package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
public final class q31 implements ggd {
    public static final v11 f = new Object();
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public q31(defpackage.wn7 r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q31.<init>(wn7):void");
    }

    public static void b(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -4;
    }

    @Override
    public final ArrayList a(jq5 jq5Var) {
        Bitmap createBitmap;
        if (((trd) this.e) == null) {
            zzb();
        }
        if (((trd) this.e) != null) {
            Bitmap bitmap = jq5Var.a;
            xve.h(bitmap);
            int i = jq5Var.d;
            int i2 = jq5Var.b;
            int i3 = jq5Var.c;
            if (i == 0) {
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
            } else {
                Matrix matrix = new Matrix();
                matrix.postRotate(i);
                createBitmap = Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
            }
            try {
                trd trdVar = (trd) this.e;
                xve.h(trdVar);
                br7 br7Var = new br7(createBitmap);
                Parcel R = trdVar.R();
                int i4 = mld.a;
                R.writeStrongBinder(br7Var);
                R.writeInt(1);
                int r = bye.r(R, 20293);
                bye.q(R, 2, 4);
                R.writeInt(-1);
                bye.s(R, r);
                Parcel T = trdVar.T(R, 1);
                tge[] tgeVarArr = (tge[]) T.createTypedArray(tge.CREATOR);
                T.recycle();
                ArrayList arrayList = new ArrayList();
                for (tge tgeVar : tgeVarArr) {
                    arrayList.add(new im5(tgeVar.c, tgeVar.d, tgeVar.b, tgeVar.a));
                }
                return arrayList;
            } catch (RemoteException e) {
                throw new lg7("Failed to run legacy image labeler.", e);
            }
        }
        throw new lg7("Waiting for the image labeling module to be downloaded. Please wait.", 14);
    }

    @Override
    public final void zzb() {
        IInterface v3dVar;
        String str = (String) this.d;
        Context context = (Context) this.b;
        Log.d("LegacyLabelDelegate", "Try to load legacy label module.");
        if (((trd) this.e) == null) {
            try {
                IBinder b = vs3.c(context, vs3.b, str).b("com.google.android.gms.vision.label.ChimeraNativeImageLabelerCreator");
                int i = e3e.b;
                if (b == null) {
                    v3dVar = null;
                } else {
                    IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator");
                    if (queryLocalInterface instanceof oae) {
                        v3dVar = (oae) queryLocalInterface;
                    } else {
                        v3dVar = new v3d(b, "com.google.android.gms.vision.label.internal.client.INativeImageLabelerCreator", (byte) 7);
                    }
                }
                trd Z = ((wxd) v3dVar).Z(new br7(context), (hre) this.c);
                this.e = Z;
                if (Z == null && !this.a) {
                    Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                    zt7.a(context);
                    this.a = true;
                }
            } catch (RemoteException e) {
                throw new lg7("Failed to create legacy image labeler.", e);
            } catch (ss3 e2) {
                if (!str.equals("com.google.android.gms.vision.dynamite")) {
                    if (!this.a) {
                        Log.d("LegacyLabelDelegate", "Request ICA optional module download.");
                        zt7.a(context);
                        this.a = true;
                        return;
                    }
                    return;
                }
                throw new lg7("Failed to load deprecated vision dynamite module.", e2);
            }
        }
    }

    @Override
    public final void zzc() {
        trd trdVar = (trd) this.e;
        if (trdVar != null) {
            try {
                trdVar.V(trdVar.R(), 2);
            } catch (RemoteException e) {
                Log.e("LegacyLabelDelegate", "Failed to release legacy image labeler.", e);
            }
            this.e = null;
        }
    }

    public q31(Context context, lm5 lm5Var) {
        this.b = context;
        Locale.getDefault().getLanguage().equals(Locale.ENGLISH.getLanguage());
        this.c = new hre(1, -1, lm5Var.a, 1);
        j05.b.getClass();
        this.d = c15.a(context) >= 200400000 ? "com.google.android.gms.vision.ica" : "com.google.android.gms.vision.dynamite";
    }

    public q31(e84 e84Var, ko4 ko4Var, usb usbVar, uif uifVar, boolean z) {
        this.b = e84Var;
        this.c = ko4Var;
        this.d = usbVar;
        this.e = uifVar;
        this.a = z;
    }
}
