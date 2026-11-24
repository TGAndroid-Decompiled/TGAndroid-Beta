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
public final class jbd extends wt6 {
    public final byte r = 0;
    public final b4 s;

    public jbd(Context context, syd sydVar) {
        super(context, "FaceNativeHandle", "face");
        this.s = sydVar;
        m();
    }

    @Override
    public final Object i(ds3 ds3Var, Context context) {
        IInterface ezcVar;
        ezc ezcVar2;
        byte b = this.r;
        b4 b4Var = this.s;
        Object obj = null;
        switch (b) {
            case 0:
                if (ds3.a(context, "com.google.android.gms.vision.dynamite.face") > ds3.d(context, "com.google.android.gms.vision.dynamite", false)) {
                    IBinder b2 = ds3Var.b("com.google.android.gms.vision.face.NativeFaceDetectorV2Creator");
                    int i = lwe.a;
                    if (b2 != null) {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        if (queryLocalInterface instanceof she) {
                            ezcVar = (she) queryLocalInterface;
                        } else {
                            ezcVar = new ezc(b2, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", (byte) 11);
                        }
                    }
                    ezcVar = null;
                } else {
                    IBinder b3 = ds3Var.b("com.google.android.gms.vision.face.ChimeraNativeFaceDetectorCreator");
                    int i2 = lwe.a;
                    if (b3 != null) {
                        IInterface queryLocalInterface2 = b3.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
                        if (queryLocalInterface2 instanceof she) {
                            ezcVar = (she) queryLocalInterface2;
                        } else {
                            ezcVar = new ezc(b3, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator", (byte) 11);
                        }
                    }
                    ezcVar = null;
                }
                if (ezcVar != null) {
                    bo7 bo7Var = new bo7(context);
                    syd sydVar = (syd) b4Var;
                    fre.h(sydVar);
                    bse bseVar = (bse) ezcVar;
                    Parcel a = bseVar.a();
                    int i3 = dnd.a;
                    a.writeStrongBinder(bo7Var);
                    dnd.a(a, sydVar);
                    Parcel S = bseVar.S(a, 1);
                    IBinder readStrongBinder = S.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface3 = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
                        if (queryLocalInterface3 instanceof ume) {
                            obj = (ume) queryLocalInterface3;
                        } else {
                            obj = new ezc(readStrongBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector", (byte) 11);
                        }
                    }
                    S.recycle();
                }
                return obj;
            default:
                IBinder b4 = ds3Var.b("com.google.android.gms.vision.barcode.ChimeraNativeBarcodeDetectorCreator");
                if (b4 == null) {
                    ezcVar2 = null;
                } else {
                    IInterface queryLocalInterface4 = b4.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
                    if (queryLocalInterface4 instanceof j7f) {
                        ezcVar2 = (j7f) queryLocalInterface4;
                    } else {
                        ezcVar2 = new ezc(b4, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator", (byte) 11);
                    }
                }
                if (ezcVar2 != null) {
                    bo7 bo7Var2 = new bo7(context);
                    zre zreVar = (zre) b4Var;
                    fre.h(zreVar);
                    Parcel a2 = ezcVar2.a();
                    int i4 = dnd.a;
                    a2.writeStrongBinder(bo7Var2);
                    dnd.a(a2, zreVar);
                    Parcel S2 = ezcVar2.S(a2, 1);
                    IBinder readStrongBinder2 = S2.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder2.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
                        if (queryLocalInterface5 instanceof z4f) {
                            obj = (z4f) queryLocalInterface5;
                        } else {
                            obj = new ezc(readStrongBinder2, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector", (byte) 11);
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
                ume umeVar = (ume) m();
                fre.h(umeVar);
                umeVar.U(umeVar.a());
                return;
            default:
                if (k()) {
                    z4f z4fVar = (z4f) m();
                    fre.h(z4fVar);
                    z4fVar.U(z4fVar.a());
                    return;
                }
                return;
        }
    }

    public final n74[] n(ByteBuffer byteBuffer, vcf vcfVar) {
        ww5[] ww5VarArr;
        eef[] eefVarArr;
        if (!k()) {
            return new n74[0];
        }
        try {
            bo7 bo7Var = new bo7(byteBuffer);
            ume umeVar = (ume) m();
            fre.h(umeVar);
            Parcel a = umeVar.a();
            int i = dnd.a;
            a.writeStrongBinder(bo7Var);
            dnd.a(a, vcfVar);
            Parcel S = umeVar.S(a, 1);
            FaceParcel[] faceParcelArr = (FaceParcel[]) S.createTypedArray(FaceParcel.CREATOR);
            S.recycle();
            n74[] n74VarArr = new n74[faceParcelArr.length];
            for (int i2 = 0; i2 < faceParcelArr.length; i2++) {
                FaceParcel faceParcel = faceParcelArr[i2];
                int i3 = faceParcel.b;
                new PointF(faceParcel.c, faceParcel.d);
                LandmarkParcel[] landmarkParcelArr = faceParcel.s;
                if (landmarkParcelArr == null) {
                    ww5VarArr = new ww5[0];
                } else {
                    ww5[] ww5VarArr2 = new ww5[landmarkParcelArr.length];
                    for (int i4 = 0; i4 < landmarkParcelArr.length; i4++) {
                        LandmarkParcel landmarkParcel = landmarkParcelArr[i4];
                        ww5VarArr2[i4] = new ww5(new PointF(landmarkParcel.b, landmarkParcel.c), landmarkParcel.d);
                    }
                    ww5VarArr = ww5VarArr2;
                }
                u4d[] u4dVarArr = faceParcel.E;
                if (u4dVarArr == null) {
                    eefVarArr = new eef[0];
                } else {
                    eef[] eefVarArr2 = new eef[u4dVarArr.length];
                    for (int i5 = 0; i5 < u4dVarArr.length; i5++) {
                        PointF[] pointFArr = u4dVarArr[i5].a;
                        eefVarArr2[i5] = new eef((byte) 15);
                    }
                    eefVarArr = eefVarArr2;
                }
                n74VarArr[i2] = new n74(i3, ww5VarArr, eefVarArr);
            }
            return n74VarArr;
        } catch (RemoteException e) {
            Log.e("FaceNativeHandle", "Could not call native face detector", e);
            return new n74[0];
        }
    }

    public jbd(Context context, zre zreVar) {
        super(context, "BarcodeNativeHandle", "barcode");
        this.s = zreVar;
        m();
    }
}
