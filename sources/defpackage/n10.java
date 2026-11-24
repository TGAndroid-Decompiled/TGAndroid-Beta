package defpackage;

import android.view.TextureView;
import android.view.ViewGroup;
import android.view.ViewParent;
public final class n10 {
    public Object a;
    public Object b;
    public Object c;
    public boolean d;
    public int e;
    public int f;
    public boolean g;

    public final void a(TextureView textureView) {
        TextureView textureView2 = (TextureView) this.a;
        if (textureView2 != textureView) {
            if (textureView2 != null) {
                ViewParent parent = textureView2.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView((TextureView) this.a);
                }
                this.a = null;
            }
            this.d = false;
            this.a = textureView;
            sk3 sk3Var = (sk3) this.b;
            if (sk3Var != null) {
                sk3Var.a(textureView);
            }
        }
    }
}
