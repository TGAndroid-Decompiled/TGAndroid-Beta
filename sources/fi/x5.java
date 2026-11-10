package fi;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class x5 {
    public TextureView f13082a;
    public ii.c f13083b;
    public hi.u1 f13084c;
    public boolean d;
    public int f13085e;
    public int f13086f;
    public boolean f13087g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = this.f13082a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.f13082a);
                }
                this.f13082a = null;
            }
            this.d = false;
            this.f13082a = textureView;
            ii.c cVar = this.f13083b;
            if (cVar != null) {
                cVar.a(textureView);
            }
        }
    }
}
