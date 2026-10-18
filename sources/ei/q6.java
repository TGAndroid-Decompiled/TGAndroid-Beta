package ei;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class q6 {
    public TextureView f9644a;
    public ig.l0 f9645b;
    public hg.o f9646c;
    public boolean d;
    public int e;
    public int f9647f;
    public boolean f9648g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f9644a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f9644a);
                }
                this.f9644a = null;
            }
            this.d = false;
            this.f9644a = textureView;
            ig.l0 l0Var = this.f9645b;
            if (l0Var != null) {
                l0Var.run(textureView);
            }
        }
    }
}
