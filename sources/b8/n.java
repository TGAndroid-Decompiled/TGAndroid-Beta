package b8;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.vision.d3;
import com.google.android.gms.internal.vision.f3;
import com.google.android.gms.internal.vision.t2;
import java.nio.ByteBuffer;
public final class n extends a8.a {
    public final t2 f1654b;

    public n(t2 t2Var) {
        super(0);
        this.f1654b = t2Var;
    }

    @Override
    public final void N() {
        super.N();
        this.f1654b.l();
    }

    public final SparseArray Q(a5.m mVar) {
        m[] mVarArr;
        if (mVar != null) {
            f3 b10 = f3.b(mVar);
            Bitmap bitmap = (Bitmap) mVar.d;
            t2 t2Var = this.f1654b;
            if (bitmap != null) {
                if (!t2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        h6.b bVar = new h6.b(bitmap);
                        d3 d3Var = (d3) t2Var.m();
                        x5.l.h(d3Var);
                        Parcel E0 = d3Var.E0();
                        int i9 = com.google.android.gms.internal.vision.a.f3714a;
                        E0.writeStrongBinder(bVar);
                        com.google.android.gms.internal.vision.a.a(E0, b10);
                        Parcel N0 = d3Var.N0(E0, 2);
                        m[] mVarArr2 = (m[]) N0.createTypedArray(m.CREATOR);
                        N0.recycle();
                        mVarArr = mVarArr2;
                    } catch (RemoteException e10) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e10);
                        mVarArr = new m[0];
                    }
                }
                if (mVarArr == null) {
                    throw new IllegalArgumentException("Internal barcode detector error; check logcat output.");
                }
            } else {
                ByteBuffer s10 = mVar.s();
                x5.l.h(s10);
                if (!t2Var.k()) {
                    mVarArr = new m[0];
                } else {
                    try {
                        h6.b bVar2 = new h6.b(s10);
                        d3 d3Var2 = (d3) t2Var.m();
                        x5.l.h(d3Var2);
                        Parcel E02 = d3Var2.E0();
                        int i10 = com.google.android.gms.internal.vision.a.f3714a;
                        E02.writeStrongBinder(bVar2);
                        com.google.android.gms.internal.vision.a.a(E02, b10);
                        Parcel N02 = d3Var2.N0(E02, 1);
                        m[] mVarArr3 = (m[]) N02.createTypedArray(m.CREATOR);
                        N02.recycle();
                        mVarArr = mVarArr3;
                    } catch (RemoteException e11) {
                        Log.e("BarcodeNativeHandle", "Error calling native barcode detector", e11);
                        mVarArr = new m[0];
                    }
                }
            }
            SparseArray sparseArray = new SparseArray(mVarArr.length);
            for (m mVar2 : mVarArr) {
                sparseArray.append(mVar2.f1644b.hashCode(), mVar2);
            }
            return sparseArray;
        }
        throw new IllegalArgumentException("No frame supplied.");
    }
}
