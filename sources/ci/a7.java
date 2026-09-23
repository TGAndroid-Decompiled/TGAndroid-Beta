package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class a7 {
    public TextureView f4345a;
    public ii.q1 f4346b;
    public hi.a f4347c;
    public boolean d;
    public int e;
    public int f4348f;
    public boolean f4349g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4345a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4345a);
                }
                this.f4345a = null;
            }
            this.d = false;
            this.f4345a = textureView;
            ii.q1 q1Var = this.f4346b;
            if (q1Var != null) {
                q1Var.run(textureView);
            }
        }
    }
}
