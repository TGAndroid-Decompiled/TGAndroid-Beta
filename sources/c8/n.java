package c8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.d3;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;

public final class n extends b8.a {

    public final t2 f2560b;

    public n(t2 t2Var) {
        super(0);
        this.f2560b = t2Var;
    }

    @Override
    public final void N() {
        super.N();
        this.f2560b.l();
    }

    public final SparseArray Q(a5.n nVar) {
        m[] mVarArr;
        if (nVar == null) {
            throw new IllegalArgumentException("No frame supplied.");
        }
        f3 f3VarB = f3.b(nVar);
        Bitmap bitmap = (Bitmap) nVar.d;
        t2 t2Var = this.f2560b;
        if (bitmap != null) {
            if (t2Var.k()) {
                try {
                    i6.b bVar = new i6.b(bitmap);
                    d3 d3Var = (d3) t2Var.m();
                    y5.l.h(d3Var);
                    Parcel parcelE0 = d3Var.E0();
                    int i10 = com.google.android.gms.internal.vision.a.f4156a;
                    parcelE0.writeStrongBinder(bVar);
                    com.google.android.gms.internal.vision.a.a(parcelE0, f3VarB);
                    Parcel parcelN0 = d3Var.N0(parcelE0, 2);
                    m[] mVarArr2 = (m[]) parcelN0.createTypedArray(m.CREATOR);
                    parcelN0.recycle();
                    mVarArr = mVarArr2;
                } catch (RemoteException e9) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e9);
                    mVarArr = new m[0];
                }
            } else {
                mVarArr = new m[0];
            }
            if (mVarArr == null) {
                throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
            }
        } else {
            ByteBuffer byteBufferQ = nVar.q();
            y5.l.h(byteBufferQ);
            if (t2Var.k()) {
                try {
                    i6.b bVar2 = new i6.b(byteBufferQ);
                    d3 d3Var2 = (d3) t2Var.m();
                    y5.l.h(d3Var2);
                    Parcel parcelE1 = d3Var2.E0();
                    int i11 = com.google.android.gms.internal.vision.a.f4156a;
                    parcelE1.writeStrongBinder(bVar2);
                    com.google.android.gms.internal.vision.a.a(parcelE1, f3VarB);
                    Parcel parcelN1 = d3Var2.N0(parcelE1, 1);
                    m[] mVarArr3 = (m[]) parcelN1.createTypedArray(m.CREATOR);
                    parcelN1.recycle();
                    mVarArr = mVarArr3;
                } catch (RemoteException e10) {
                    Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
                    mVarArr = new m[0];
                }
            } else {
                mVarArr = new m[0];
            }
        }
        SparseArray sparseArray = new SparseArray(mVarArr.length);
        for (m mVar : mVarArr) {
            sparseArray.append(mVar.f2550b.hashCode(), mVar);
        }
        return sparseArray;
    }
}
