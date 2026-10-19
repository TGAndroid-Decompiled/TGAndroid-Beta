package ei;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class q6 {
    public TextureView f9643a;
    public ig.l0 f9644b;
    public hg.o f9645c;
    public boolean d;
    public int e;
    public int f9646f;
    public boolean f9647g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f9643a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f9643a);
                }
                this.f9643a = null;
            }
            this.d = false;
            this.f9643a = textureView;
            ig.l0 l0Var = this.f9644b;
            if (l0Var != null) {
                l0Var.run(textureView);
            }
        }
    }
}
