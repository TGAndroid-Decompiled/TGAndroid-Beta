package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
public final class af0 extends e23 {
    public final cgd b;

    public af0(cgd cgdVar) {
        super((byte) 2);
        this.b = cgdVar;
    }

    @Override
    public final void d() {
        super.d();
        this.b.l();
    }

    public final SparseArray h(pm3 pm3Var) {
        ze0[] ze0VarArr;
        if (pm3Var != null) {
            lhf b = lhf.b(pm3Var);
            Bitmap bitmap = (Bitmap) pm3Var.d;
            cgd cgdVar = this.b;
            if (bitmap != null) {
                if (!cgdVar.k()) {
                    ze0VarArr = new ze0[0];
                } else {
                    try {
                        br7 br7Var = new br7(bitmap);
                        q9f q9fVar = (q9f) cgdVar.m();
                        xve.h(q9fVar);
                        Parcel a = q9fVar.a();
                        int i = urd.a;
                        a.writeStrongBinder(br7Var);
                        urd.a(a, b);
                        Parcel S = q9fVar.S(a, 2);
                        ze0[] ze0VarArr2 = (ze0[]) S.createTypedArray(ze0.CREATOR);
                        S.recycle();
                        ze0VarArr = ze0VarArr2;
                    } catch (RemoteException e) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                        ze0VarArr = new ze0[0];
                    }
                }
                if (ze0VarArr == null) {
                    lq5.j("Internal barcode detector error; check logcat output.");
                    return null;
                }
            } else {
                ByteBuffer v = pm3Var.v();
                xve.h(v);
                if (!cgdVar.k()) {
                    ze0VarArr = new ze0[0];
                } else {
                    try {
                        br7 br7Var2 = new br7(v);
                        q9f q9fVar2 = (q9f) cgdVar.m();
                        xve.h(q9fVar2);
                        Parcel a2 = q9fVar2.a();
                        int i2 = urd.a;
                        a2.writeStrongBinder(br7Var2);
                        urd.a(a2, b);
                        Parcel S2 = q9fVar2.S(a2, 1);
                        ze0[] ze0VarArr3 = (ze0[]) S2.createTypedArray(ze0.CREATOR);
                        S2.recycle();
                        ze0VarArr = ze0VarArr3;
                    } catch (RemoteException e2) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e2);
                        ze0VarArr = new ze0[0];
                    }
                }
            }
            SparseArray sparseArray = new SparseArray(ze0VarArr.length);
            for (ze0 ze0Var : ze0VarArr) {
                sparseArray.append(ze0Var.b.hashCode(), ze0Var);
            }
            return sparseArray;
        }
        lq5.j("No frame supplied.");
        return null;
    }
}
