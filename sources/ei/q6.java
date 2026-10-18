package ei;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class q6 {
    public TextureView f9646a;
    public ig.l0 f9647b;
    public hg.o f9648c;
    public boolean d;
    public int e;
    public int f9649f;
    public boolean f9650g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f9646a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f9646a);
                }
                this.f9646a = null;
            }
            this.d = false;
            this.f9646a = textureView;
            ig.l0 l0Var = this.f9647b;
            if (l0Var != null) {
                l0Var.run(textureView);
            }
        }
    }
}
