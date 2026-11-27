package defpackage;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class t26 extends FrameLayout {
    public TextView a;

    public void setCellHeight(int i) {
        setLayoutParams(new ViewGroup.LayoutParams(hl.L(54.0f), i));
    }

    public void setLetter(String str) {
        this.a.setText(str.toUpperCase());
    }

    public void setLetterProgress(float f) {
        TextView textView = this.a;
        textView.setAlpha(f);
        float f2 = (0.4f * f) + 0.6f;
        textView.setScaleX(f2);
        textView.setScaleY(f2);
        textView.setTranslationX((1.0f - f) * (-hl.L(10.0f)));
    }

    public void setLetterTextSize(float f) {
        this.a.setTextSize(1, f);
    }
}
