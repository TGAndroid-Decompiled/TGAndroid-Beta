package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.vision.face.internal.client.FaceParcel;
import com.google.android.gms.vision.face.internal.client.LandmarkParcel;
import java.nio.ByteBuffer;
public final class cgd extends bw6 {
    public final byte r = 0;
    public final c4 s;

    public cgd(Context context, i3e i3eVar) {
        super(context, "FaceNativeHandle", "face");
        this.s = i3eVar;
        m();
    }

    @Override
    public final Object i(vs3 vs3Var, Context context) {
        IInterface v3dVar;
        v3d v3dVar2;
        byte b = this.r;
        c4 c4Var = this.s;
        Object obj = null;
        switch (b) {
            case 0:
                if (vs3.a(context, "com.google.android.gms.vision.dynamite.face") > vs3.d(context, "com.google.android.gms.vision.dynamite", false)) {
                    IBinder b2 = vs3Var.b("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
                    int i = c1f.a;
                    if (b2 != null) {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        if (queryLocalInterface instanceof jme) {
                            v3dVar = (jme) queryLocalInterface;
                        } else {
                            v3dVar = new v3d(b2, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", (byte) 11);
                        }
                    }
                    v3dVar = null;
                } else {
                    IBinder b3 = vs3Var.b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
                    int i2 = c1f.a;
                    if (b3 != null) {
                        IInterface queryLocalInterface2 = b3.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        if (queryLocalInterface2 instanceof jme) {
                            v3dVar = (jme) queryLocalInterface2;
                        } else {
                            v3dVar = new v3d(b3, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", (byte) 11);
                        }
                    }
                    v3dVar = null;
                }
                if (v3dVar != null) {
                    br7 br7Var = new br7(context);
                    i3e i3eVar = (i3e) c4Var;
                    xve.h(i3eVar);
                    swe sweVar = (swe) v3dVar;
                    Parcel a = sweVar.a();
                    int i3 = urd.a;
                    a.writeStrongBinder(br7Var);
                    urd.a(a, i3eVar);
                    Parcel S = sweVar.S(a, 1);
                    IBinder readStrongBinder = S.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface3 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                        if (queryLocalInterface3 instanceof lre) {
                            obj = (lre) queryLocalInterface3;
                        } else {
                            obj = new v3d(readStrongBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", (byte) 11);
                        }
                    }
                    S.recycle();
                }
                return obj;
            default:
                IBinder b4 = vs3Var.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                if (b4 == null) {
                    v3dVar2 = null;
                } else {
                    IInterface queryLocalInterface4 = b4.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    if (queryLocalInterface4 instanceof acf) {
                        v3dVar2 = (acf) queryLocalInterface4;
                    } else {
                        v3dVar2 = new v3d(b4, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", (byte) 11);
                    }
                }
                if (v3dVar2 != null) {
                    br7 br7Var2 = new br7(context);
                    qwe qweVar = (qwe) c4Var;
                    xve.h(qweVar);
                    Parcel a2 = v3dVar2.a();
                    int i4 = urd.a;
                    a2.writeStrongBinder(br7Var2);
                    urd.a(a2, qweVar);
                    Parcel S2 = v3dVar2.S(a2, 1);
                    IBinder readStrongBinder2 = S2.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder2.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                        if (queryLocalInterface5 instanceof q9f) {
                            obj = (q9f) queryLocalInterface5;
                        } else {
                            obj = new v3d(readStrongBinder2, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", (byte) 11);
                        }
                    }
                    S2.recycle();
                }
                return obj;
        }
    }

    @Override
    public final void j() {
        switch (this.r) {
            case 0:
                lre lreVar = (lre) m();
                xve.h(lreVar);
                lreVar.U(lreVar.a());
                return;
            default:
                if (k()) {
                    q9f q9fVar = (q9f) m();
                    xve.h(q9fVar);
                    q9fVar.U(q9fVar.a());
                    return;
                }
                return;
        }
    }

    public final i84[] n(ByteBuffer byteBuffer, lhf lhfVar) {
        bz5[] bz5VarArr;
        uif[] uifVarArr;
        if (!k()) {
            return new i84[0];
        }
        try {
            br7 br7Var = new br7(byteBuffer);
            lre lreVar = (lre) m();
            xve.h(lreVar);
            Parcel a = lreVar.a();
            int i = urd.a;
            a.writeStrongBinder(br7Var);
            urd.a(a, lhfVar);
            Parcel S = lreVar.S(a, 1);
            FaceParcel[] faceParcelArr = (FaceParcel[]) S.createTypedArray(FaceParcel.CREATOR);
            S.recycle();
            i84[] i84VarArr = new i84[faceParcelArr.length];
            for (int i2 = 0; i2 < faceParcelArr.length; i2++) {
                FaceParcel faceParcel = faceParcelArr[i2];
                int i3 = faceParcel.b;
                new PointF(faceParcel.c, faceParcel.d);
                LandmarkParcel[] landmarkParcelArr = faceParcel.s;
                if (landmarkParcelArr == null) {
                    bz5VarArr = new bz5[0];
                } else {
                    bz5[] bz5VarArr2 = new bz5[landmarkParcelArr.length];
                    for (int i4 = 0; i4 < landmarkParcelArr.length; i4++) {
                        LandmarkParcel landmarkParcel = landmarkParcelArr[i4];
                        bz5VarArr2[i4] = new bz5(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
                    }
                    bz5VarArr = bz5VarArr2;
                }
                n9d[] n9dVarArr = faceParcel.E;
                if (n9dVarArr == null) {
                    uifVarArr = new uif[0];
                } else {
                    uif[] uifVarArr2 = new uif[n9dVarArr.length];
                    for (int i5 = 0; i5 < n9dVarArr.length; i5++) {
                        PointF[] pointFArr = n9dVarArr[i5].a;
                        uifVarArr2[i5] = new uif((byte) 15);
                    }
                    uifVarArr = uifVarArr2;
                }
                i84VarArr[i2] = new i84(i3, bz5VarArr, uifVarArr);
            }
            return i84VarArr;
        } catch (RemoteException e) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return new i84[0];
        }
    }

    public cgd(Context context, qwe qweVar) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.s = qweVar;
        m();
    }
}
