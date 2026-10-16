package di;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class z6 {
    public TextureView f8185a;
    public ji.p1 f8186b;
    public ii.a f8187c;
    public boolean d;
    public int e;
    public int f8188f;
    public boolean f8189g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f8185a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f8185a);
                }
                this.f8185a = null;
            }
            this.d = false;
            this.f8185a = textureView;
            ji.p1 p1Var = this.f8186b;
            if (p1Var != null) {
                p1Var.run(textureView);
            }
        }
    }
}
