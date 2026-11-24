package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
public final class dy3 extends efe {
    public final TextView a;
    public final sw3 b;
    public boolean c = true;

    public dy3(TextView textView) {
        this.a = textView;
        this.b = new sw3(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        if (!this.c) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof sw3) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            sw3 sw3Var = this.b;
            if (i4 < length2) {
                if (inputFilterArr[i4] == sw3Var) {
                    return inputFilterArr;
                }
                i4++;
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = sw3Var;
                return inputFilterArr3;
            }
        }
    }

    @Override
    public final void b(boolean z) {
        if (z) {
            d();
        }
    }

    @Override
    public final void c(boolean z) {
        this.c = z;
        d();
        TextView textView = this.a;
        textView.setFilters(a(textView.getFilters()));
    }

    public final void d() {
        TextView textView = this.a;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.c) {
            if (!(transformationMethod instanceof ky3) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new ky3(transformationMethod);
            }
        } else if (transformationMethod instanceof ky3) {
            transformationMethod = ((ky3) transformationMethod).a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
