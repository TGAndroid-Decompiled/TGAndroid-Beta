package defpackage;

import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import org.telegram.messenger.a;
import org.telegram.ui.j;
import org.telegram.ui.o;
public final class ru implements eyc {
    public final j a;

    public ru(j jVar) {
        this.a = jVar;
    }

    @Override
    public final TextureView b(View view, boolean z, float f, int i, boolean z2) {
        j jVar = this.a;
        o oVar = jVar.y;
        if (z) {
            oVar.S.addView(oVar.R, tre.c(-1.0f, -1));
            oVar.S.setVisibility(0);
            oVar.S.a(f, i);
            oVar.G0 = jVar.b;
            oVar.Q.addView(view, tre.c(-1.0f, -1));
            oVar.Q.setVisibility(0);
        } else {
            oVar.S.removeView(oVar.R);
            oVar.G0 = null;
            oVar.S.setVisibility(8);
            oVar.Q.setVisibility(4);
        }
        return oVar.R;
    }

    @Override
    public final void d(float f) {
        this.a.y.S.a(f, 0);
    }

    @Override
    public final void e() {
        this.a.a.setVisibility(0);
        this.a.b.setVisibility(4);
        this.a.b.g(null, null, null, null, false);
        HashMap hashMap = new HashMap();
        hashMap.put("Referer", a.b.getPackageName());
        j jVar = this.a;
        jVar.a.loadUrl(jVar.w.url, hashMap);
    }

    @Override
    public final TextureView f(View view, boolean z, int i, int i2, boolean z2) {
        return null;
    }

    @Override
    public final void g(hyc hycVar, boolean z) {
        o oVar = this.a.y;
        if (z) {
            hyc hycVar2 = oVar.F0;
            if (hycVar2 != null && hycVar2 != hycVar) {
                hycVar2.a.f0();
                hycVar2.n();
                hycVar2.g0.d(true, true);
            }
            oVar.F0 = hycVar;
            try {
                oVar.M.getWindow().addFlags(128);
                return;
            } catch (Exception e) {
                cc4.g(e, true);
                return;
            }
        }
        if (oVar.F0 == hycVar) {
            oVar.F0 = null;
        }
        try {
            oVar.M.getWindow().clearFlags(128);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final ViewGroup h() {
        return null;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final void c() {
    }

    @Override
    public final void a(boolean z, ayc aycVar, float f, boolean z2) {
    }
}
