package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
public final class yf0 extends x23 {
    public final ldd b;

    public yf0(ldd lddVar) {
        super((byte) 2);
        this.b = lddVar;
    }

    @Override
    public final void d() {
        super.d();
        this.b.l();
    }

    public final SparseArray h(in3 in3Var) {
        xf0[] xf0VarArr;
        if (in3Var != null) {
            wef b = wef.b(in3Var);
            Bitmap bitmap = (Bitmap) in3Var.d;
            ldd lddVar = this.b;
            if (bitmap != null) {
                if (!lddVar.k()) {
                    xf0VarArr = new xf0[0];
                } else {
                    try {
                        eq7 eq7Var = new eq7(bitmap);
                        b7f b7fVar = (b7f) lddVar.m();
                        ite.h(b7fVar);
                        Parcel a = b7fVar.a();
                        int i = gpd.a;
                        a.writeStrongBinder(eq7Var);
                        gpd.a(a, b);
                        Parcel S = b7fVar.S(a, 2);
                        xf0[] xf0VarArr2 = (xf0[]) S.createTypedArray(xf0.CREATOR);
                        S.recycle();
                        xf0VarArr = xf0VarArr2;
                    } catch (RemoteException e) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                        xf0VarArr = new xf0[0];
                    }
                }
                if (xf0VarArr == null) {
                    u36.j("Internal barcode detector error; check logcat output.");
                    return null;
                }
            } else {
                ByteBuffer v = in3Var.v();
                ite.h(v);
                if (!lddVar.k()) {
                    xf0VarArr = new xf0[0];
                } else {
                    try {
                        eq7 eq7Var2 = new eq7(v);
                        b7f b7fVar2 = (b7f) lddVar.m();
                        ite.h(b7fVar2);
                        Parcel a2 = b7fVar2.a();
                        int i2 = gpd.a;
                        a2.writeStrongBinder(eq7Var2);
                        gpd.a(a2, b);
                        Parcel S2 = b7fVar2.S(a2, 1);
                        xf0[] xf0VarArr3 = (xf0[]) S2.createTypedArray(xf0.CREATOR);
                        S2.recycle();
                        xf0VarArr = xf0VarArr3;
                    } catch (RemoteException e2) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e2);
                        xf0VarArr = new xf0[0];
                    }
                }
            }
            SparseArray sparseArray = new SparseArray(xf0VarArr.length);
            for (xf0 xf0Var : xf0VarArr) {
                sparseArray.append(xf0Var.b.hashCode(), xf0Var);
            }
            return sparseArray;
        }
        u36.j("No frame supplied.");
        return null;
    }
}
