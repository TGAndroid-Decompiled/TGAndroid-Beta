package di;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class z6 {
    public TextureView f8182a;
    public ji.p1 f8183b;
    public ii.a f8184c;
    public boolean d;
    public int e;
    public int f8185f;
    public boolean f8186g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f8182a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f8182a);
                }
                this.f8182a = null;
            }
            this.d = false;
            this.f8182a = textureView;
            ji.p1 p1Var = this.f8183b;
            if (p1Var != null) {
                p1Var.run(textureView);
            }
        }
    }
}
