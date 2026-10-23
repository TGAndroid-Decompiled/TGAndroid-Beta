package ei;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class q6 {
    public TextureView f9659a;
    public ig.k0 f9660b;
    public hg.o f9661c;
    public boolean d;
    public int e;
    public int f9662f;
    public boolean f9663g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f9659a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f9659a);
                }
                this.f9659a = null;
            }
            this.d = false;
            this.f9659a = textureView;
            ig.k0 k0Var = this.f9660b;
            if (k0Var != null) {
                k0Var.run(textureView);
            }
        }
    }
}
