package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.nio.ByteBuffer;
public final class ye0 extends l13 {
    public final jbd b;

    public ye0(jbd jbdVar) {
        super((byte) 2);
        this.b = jbdVar;
    }

    @Override
    public final void d() {
        super.d();
        this.b.l();
    }

    public final SparseArray h(xl3 xl3Var) {
        xe0[] xe0VarArr;
        if (xl3Var != null) {
            vcf b = vcf.b(xl3Var);
            Bitmap bitmap = (Bitmap) xl3Var.d;
            jbd jbdVar = this.b;
            if (bitmap != null) {
                if (!jbdVar.k()) {
                    xe0VarArr = new xe0[0];
                } else {
                    try {
                        bo7 bo7Var = new bo7(bitmap);
                        z4f z4fVar = (z4f) jbdVar.m();
                        fre.h(z4fVar);
                        Parcel a = z4fVar.a();
                        int i = dnd.a;
                        a.writeStrongBinder(bo7Var);
                        dnd.a(a, b);
                        Parcel S = z4fVar.S(a, 2);
                        xe0[] xe0VarArr2 = (xe0[]) S.createTypedArray(xe0.CREATOR);
                        S.recycle();
                        xe0VarArr = xe0VarArr2;
                    } catch (RemoteException e) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e);
                        xe0VarArr = new xe0[0];
                    }
                }
                if (xe0VarArr == null) {
                    w26.j("Internal barcode detector error; check logcat output.");
                    return null;
                }
            } else {
                ByteBuffer w = xl3Var.w();
                fre.h(w);
                if (!jbdVar.k()) {
                    xe0VarArr = new xe0[0];
                } else {
                    try {
                        bo7 bo7Var2 = new bo7(w);
                        z4f z4fVar2 = (z4f) jbdVar.m();
                        fre.h(z4fVar2);
                        Parcel a2 = z4fVar2.a();
                        int i2 = dnd.a;
                        a2.writeStrongBinder(bo7Var2);
                        dnd.a(a2, b);
                        Parcel S2 = z4fVar2.S(a2, 1);
                        xe0[] xe0VarArr3 = (xe0[]) S2.createTypedArray(xe0.CREATOR);
                        S2.recycle();
                        xe0VarArr = xe0VarArr3;
                    } catch (RemoteException e2) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e2);
                        xe0VarArr = new xe0[0];
                    }
                }
            }
            SparseArray sparseArray = new SparseArray(xe0VarArr.length);
            for (xe0 xe0Var : xe0VarArr) {
                sparseArray.append(xe0Var.b.hashCode(), xe0Var);
            }
            return sparseArray;
        }
        w26.j("No frame supplied.");
        return null;
    }
}
