package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PhotoViewer;
public final class mbc {
    public final d78 a;
    public u3b b;
    public String c;
    public boolean d;
    public jb4 e;
    public hu7 f;
    public ArrayList g;
    public r3b h;
    public boolean i;
    public final xia j = new xia(this, (byte) 11);

    public mbc(d78 d78Var) {
        this.a = d78Var;
    }

    public final void a(int i, s3b s3bVar) {
        s3b s3bVar2;
        String g;
        u3b u3bVar;
        xl3 xl3Var;
        if (s3bVar != null && !DictationAsr.C(i)) {
            s3bVar2 = null;
        } else {
            s3bVar2 = s3bVar;
        }
        if (s3bVar2 == null) {
            g = null;
        } else {
            g = s3bVar2.g();
        }
        if (TextUtils.equals(g, this.c)) {
            return;
        }
        c();
        u3b u3bVar2 = this.b;
        if (u3bVar2 != null) {
            u3bVar2.c();
            this.b = null;
        }
        this.c = g;
        if (s3bVar2 != null) {
            u3b u3bVar3 = new u3b(s3bVar2, 0L, 0L, new l3c(this, r9, (byte) 18));
            this.b = u3bVar3;
            u3b[] u3bVarArr = {u3bVar3};
            if (u3bVar3.f != null && na7.c1().getBoolean("asr_video_captions", false) && (xl3Var = (u3bVar = this.b).f) != null && (DictationAsr.A((vl3) xl3Var.b) || DictationAsr.y((vl3) u3bVar.f.b))) {
                b();
            }
        }
        this.a.a();
    }

    public final void b() {
        u3b u3bVar;
        int i;
        String r;
        d78 d78Var = this.a;
        PhotoViewer photoViewer = d78Var.a;
        if (!this.d && (u3bVar = this.b) != null && u3bVar.f != null) {
            this.d = true;
            hu7 hu7Var = this.f;
            int i2 = -1;
            if (hu7Var != null) {
                if (hu7Var.getParent() == null) {
                    k98 k98Var = photoViewer.f0;
                    hu7 hu7Var2 = this.f;
                    u98 u98Var = photoViewer.i3;
                    if (u98Var != null) {
                        i2 = k98Var.indexOfChild(u98Var);
                    }
                    k98Var.addView(hu7Var2, i2, nme.d(-2, -2.0f, 49, 16.0f, 0.0f, 16.0f, 0.0f));
                }
            } else {
                hu7 hu7Var3 = new hu7(photoViewer.f0.getContext(), (byte) 1);
                this.f = hu7Var3;
                hu7Var3.setEnabled(false);
                this.f.setFocusable(false);
                this.f.setClickable(false);
                this.f.setBackgroundColor(0);
                this.f.setTextSize(1, 16.0f);
                this.f.setTypeface(gl.o());
                this.f.setGravity(17);
                this.f.setTextAlignment(4);
                this.f.setHorizontallyScrolling(false);
                this.f.setMaxLines(3);
                this.f.setBreakStrategy(0);
                this.f.setPadding(gl.L(7.0f), gl.L(7.0f), gl.L(7.0f), gl.L(7.0f));
                this.f.setFrameColor(2130706432);
                this.f.setTextColor(-1);
                this.f.setTallFrame(true);
                this.f.setAlpha(0.0f);
                this.f.setImportantForAccessibility(2);
                k98 k98Var2 = photoViewer.f0;
                hu7 hu7Var4 = this.f;
                u98 u98Var2 = photoViewer.i3;
                if (u98Var2 != null) {
                    i2 = k98Var2.indexOfChild(u98Var2);
                }
                k98Var2.addView(hu7Var4, i2, nme.d(-2, -2.0f, 49, 16.0f, 0.0f, 16.0f, 0.0f));
            }
            u3b u3bVar2 = this.b;
            u3bVar2.n = new hza(d78Var, (byte) 27);
            u3bVar2.d = 1;
            TextPaint textPaint = new TextPaint(this.f.getPaint());
            if (photoViewer.f0.getWidth() > 0) {
                i = photoViewer.f0.getWidth();
            } else {
                i = gl.q.x;
            }
            u3bVar2.u = new wb1(textPaint, (byte) 1);
            u3bVar2.v = (((i - gl.L(32.0f)) - this.f.getPaddingLeft()) - this.f.getPaddingRight()) * 0.96f;
            Context context = this.f.getContext();
            k98 k98Var3 = photoViewer.f0;
            wjb wjbVar = photoViewer.w2;
            xl3 xl3Var = u3bVar2.f;
            if (xl3Var == null) {
                r = "";
            } else {
                r = jm3.r(xl3Var.u());
            }
            jb4 jb4Var = new jb4(context, k98Var3, wjbVar, r, new l3c(this, u3bVar2, (byte) 19));
            this.e = jb4Var;
            u3bVar2.h(0L, 0L, new vk9(this, jb4Var, u3bVar2));
            hu7 hu7Var5 = this.f;
            xia xiaVar = this.j;
            hu7Var5.removeCallbacks(xiaVar);
            this.f.postOnAnimation(xiaVar);
        }
    }

    public final void c() {
        u3b u3bVar = this.b;
        if (u3bVar != null) {
            u3bVar.i();
        }
        jb4 jb4Var = this.e;
        if (jb4Var != null) {
            jb4Var.f = null;
            m21 m21Var = (m21) jb4Var.g;
            if (m21Var != null) {
                m21Var.b();
                jb4Var.g = null;
            }
            this.e = null;
        }
        this.d = false;
        this.g = null;
        this.h = null;
        hu7 hu7Var = this.f;
        if (hu7Var != null) {
            hu7Var.removeCallbacks(this.j);
            this.f.animate().cancel();
            this.f.setAlpha(0.0f);
            this.i = false;
        }
    }

    public final void d() {
        u3b u3bVar = this.b;
        if (u3bVar != null && u3bVar.f != null) {
            if (this.d) {
                na7.c1().edit().putBoolean("asr_video_captions", false).apply();
                c();
            } else {
                na7.c1().edit().putBoolean("asr_video_captions", true).apply();
                b();
            }
            this.a.a();
        }
    }
}
