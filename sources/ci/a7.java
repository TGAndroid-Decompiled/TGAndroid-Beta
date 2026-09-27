package ci;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class a7 {
    public TextureView f4347a;
    public ii.q1 f4348b;
    public hi.a f4349c;
    public boolean d;
    public int e;
    public int f4350f;
    public boolean f4351g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f4347a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f4347a);
                }
                this.f4347a = null;
            }
            this.d = false;
            this.f4347a = textureView;
            ii.q1 q1Var = this.f4348b;
            if (q1Var != null) {
                q1Var.run(textureView);
            }
        }
    }
}
