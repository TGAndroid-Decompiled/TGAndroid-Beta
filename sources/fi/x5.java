package fi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class x5 {
    public TextureView f13080a;
    public ii.c f13081b;
    public hi.u1 f13082c;
    public boolean d;
    public int f13083e;
    public int f13084f;
    public boolean f13085g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f13080a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f13080a);
                }
                this.f13080a = null;
            }
            this.d = false;
            this.f13080a = textureView;
            ii.c cVar = this.f13081b;
            if (cVar != null) {
                cVar.a(textureView);
            }
        }
    }
}
