package bi;

import android.view.View;
import android.widget.TextView;
public final class y4 implements View.OnLayoutChangeListener {
    public final int f3966a;
    public final Object f3967b;

    public y4(Object obj, int i10) {
        this.f3966a = i10;
        this.f3967b = obj;
    }

    @Override
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        switch (this.f3966a) {
            case 0:
                ((b5) this.f3967b).d();
                return;
            default:
                jg.c cVar = (jg.c) this.f3967b;
                TextView textView = cVar.f11895c;
                textView.setPivotX(textView.getMeasuredWidth() * 0.7f);
                TextView textView2 = cVar.f11894b;
                textView2.setPivotX(textView2.getMeasuredWidth() * 0.7f);
                return;
        }
    }
}
