package defpackage;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
public final class uz3 implements TransformationMethod {
    public final TransformationMethod a;

    public uz3(TransformationMethod transformationMethod) {
        this.a = transformationMethod;
    }

    @Override
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence != null && wx3.a().b() == 1) {
            wx3 a = wx3.a();
            a.getClass();
            return a.e(0, charSequence.length(), charSequence);
        }
        return charSequence;
    }

    @Override
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }
}
