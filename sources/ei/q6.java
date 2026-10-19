package ei;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class q6 {
    public TextureView f9645a;
    public ig.l0 f9646b;
    public hg.o f9647c;
    public boolean d;
    public int e;
    public int f9648f;
    public boolean f9649g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f9645a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f9645a);
                }
                this.f9645a = null;
            }
            this.d = false;
            this.f9645a = textureView;
            ig.l0 l0Var = this.f9646b;
            if (l0Var != null) {
                l0Var.run(textureView);
            }
        }
    }
}
