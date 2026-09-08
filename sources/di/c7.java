package di;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class c7 {
    public TextureView f7017a;
    public org.telegram.ui.web.b1 f7018b;
    public ii.a f7019c;
    public boolean d;
    public int f7020e;
    public int f7021f;
    public boolean f7022g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f7017a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f7017a);
                }
                this.f7017a = null;
            }
            this.d = false;
            this.f7017a = textureView;
            org.telegram.ui.web.b1 b1Var = this.f7018b;
            if (b1Var != null) {
                b1Var.run(textureView);
            }
        }
    }
}
