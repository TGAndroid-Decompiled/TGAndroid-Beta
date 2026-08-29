package jh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.LinearGradient;
import android.graphics.Shader;
public final class ya extends AnimatorListenerAdapter {
    public final int f13139a;
    public final int f13140b;
    public final int f13141c;
    public final int d;
    public final ab f13142e;

    public ya(ab abVar, int i10, int i11, int i12, int i13) {
        this.f13142e = abVar;
        this.f13139a = i10;
        this.f13140b = i11;
        this.f13141c = i12;
        this.d = i13;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int d = i0.a.d(1.0f, this.f13139a, this.f13140b);
        ab abVar = this.f13142e;
        abVar.f11762r = d;
        abVar.f11763s = i0.a.d(1.0f, this.f13141c, this.d);
        abVar.f11766y = new LinearGradient(0.0f, 0.0f, 255.0f, 0.0f, new int[]{abVar.f11762r, abVar.f11763s}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        abVar.invalidate();
    }
}
