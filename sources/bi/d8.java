package bi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class d8 {
    public TextureView f2551a;
    public org.telegram.ui.web.y1 f2552b;
    public gi.a f2553c;
    public boolean d;
    public int e;
    public int f2554f;
    public boolean f2555g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f2551a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f2551a);
                }
                this.f2551a = null;
            }
            this.d = false;
            this.f2551a = textureView;
            org.telegram.ui.web.y1 y1Var = this.f2552b;
            if (y1Var != null) {
                y1Var.run(textureView);
            }
        }
    }
}
