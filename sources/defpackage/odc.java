package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.PhotoViewer;
public final class odc {
    public final e98 a;
    public v5b b;
    public String c;
    public boolean d;
    public jd4 e;
    public iw7 f;
    public ArrayList g;
    public s5b h;
    public boolean i;
    public final zka j = new zka(this, (byte) 11);

    public odc(e98 e98Var) {
        this.a = e98Var;
    }

    public final void a(int i, t5b t5bVar) {
        t5b t5bVar2;
        String f;
        v5b v5bVar;
        in3 in3Var;
        if (t5bVar != null && !DictationAsr.C(i)) {
            t5bVar2 = null;
        } else {
            t5bVar2 = t5bVar;
        }
        if (t5bVar2 == null) {
            f = null;
        } else {
            f = t5bVar2.f();
        }
        if (TextUtils.equals(f, this.c)) {
            return;
        }
        c();
        v5b v5bVar2 = this.b;
        if (v5bVar2 != null) {
            v5bVar2.c();
            this.b = null;
        }
        this.c = f;
        if (t5bVar2 != null) {
            v5b v5bVar3 = new v5b(t5bVar2, 0L, 0L, new x4c(this, r9, (byte) 20));
            this.b = v5bVar3;
            v5b[] v5bVarArr = {v5bVar3};
            if (v5bVar3.f != null && oc7.d1().getBoolean("asr_video_captions", false) && (in3Var = (v5bVar = this.b).f) != null && (DictationAsr.A((gn3) in3Var.b) || DictationAsr.y((gn3) v5bVar.f.b))) {
                b();
            }
        }
        this.a.a();
    }

    public final void b() {
        v5b v5bVar;
        int i;
        String r;
        e98 e98Var = this.a;
        PhotoViewer photoViewer = e98Var.a;
        if (!this.d && (v5bVar = this.b) != null && v5bVar.f != null) {
            this.d = true;
            iw7 iw7Var = this.f;
            int i2 = -1;
            if (iw7Var != null) {
                if (iw7Var.getParent() == null) {
                    lb8 lb8Var = photoViewer.f0;
                    iw7 iw7Var2 = this.f;
                    vb8 vb8Var = photoViewer.i3;
                    if (vb8Var != null) {
                        i2 = lb8Var.indexOfChild(vb8Var);
                    }
                    lb8Var.addView(iw7Var2, i2, qoe.d(-2, -2.0f, 49, 16.0f, 0.0f, 16.0f, 0.0f));
                }
            } else {
                iw7 iw7Var3 = new iw7(photoViewer.f0.getContext(), (byte) 1);
                this.f = iw7Var3;
                iw7Var3.setEnabled(false);
                this.f.setFocusable(false);
                this.f.setClickable(false);
                this.f.setBackgroundColor(0);
                this.f.setTextSize(1, 16.0f);
                this.f.setTypeface(gm.o());
                this.f.setGravity(17);
                this.f.setTextAlignment(4);
                this.f.setHorizontallyScrolling(false);
                this.f.setMaxLines(3);
                this.f.setBreakStrategy(0);
                this.f.setPadding(gm.L(7.0f), gm.L(7.0f), gm.L(7.0f), gm.L(7.0f));
                this.f.setFrameColor(2130706432);
                this.f.setTextColor(-1);
                this.f.setTallFrame(true);
                this.f.setAlpha(0.0f);
                this.f.setImportantForAccessibility(2);
                lb8 lb8Var2 = photoViewer.f0;
                iw7 iw7Var4 = this.f;
                vb8 vb8Var2 = photoViewer.i3;
                if (vb8Var2 != null) {
                    i2 = lb8Var2.indexOfChild(vb8Var2);
                }
                lb8Var2.addView(iw7Var4, i2, qoe.d(-2, -2.0f, 49, 16.0f, 0.0f, 16.0f, 0.0f));
            }
            v5b v5bVar2 = this.b;
            v5bVar2.n = new lcc(e98Var, (byte) 1);
            v5bVar2.d = 1;
            TextPaint textPaint = new TextPaint(this.f.getPaint());
            if (photoViewer.f0.getWidth() > 0) {
                i = photoViewer.f0.getWidth();
            } else {
                i = gm.q.x;
            }
            v5bVar2.u = new ed1(textPaint, (byte) 1);
            v5bVar2.v = (((i - gm.L(32.0f)) - this.f.getPaddingLeft()) - this.f.getPaddingRight()) * 0.96f;
            Context context = this.f.getContext();
            lb8 lb8Var3 = photoViewer.f0;
            ylb ylbVar = photoViewer.w2;
            in3 in3Var = v5bVar2.f;
            if (in3Var == null) {
                r = "";
            } else {
                r = un3.r(in3Var.t());
            }
            jd4 jd4Var = new jd4(context, lb8Var3, ylbVar, r, new x4c(this, v5bVar2, (byte) 21));
            this.e = jd4Var;
            v5bVar2.h(0L, 0L, new wm9(this, jd4Var, v5bVar2));
            iw7 iw7Var5 = this.f;
            zka zkaVar = this.j;
            iw7Var5.removeCallbacks(zkaVar);
            this.f.postOnAnimation(zkaVar);
        }
    }

    public final void c() {
        v5b v5bVar = this.b;
        if (v5bVar != null) {
            v5bVar.i();
        }
        jd4 jd4Var = this.e;
        if (jd4Var != null) {
            jd4Var.f = null;
            u31 u31Var = (u31) jd4Var.g;
            if (u31Var != null) {
                u31Var.b();
                jd4Var.g = null;
            }
            this.e = null;
        }
        this.d = false;
        this.g = null;
        this.h = null;
        iw7 iw7Var = this.f;
        if (iw7Var != null) {
            iw7Var.removeCallbacks(this.j);
            this.f.animate().cancel();
            this.f.setAlpha(0.0f);
            this.i = false;
        }
    }

    public final void d() {
        v5b v5bVar = this.b;
        if (v5bVar != null && v5bVar.f != null) {
            if (this.d) {
                oc7.d1().edit().putBoolean("asr_video_captions", false).apply();
                c();
            } else {
                oc7.d1().edit().putBoolean("asr_video_captions", true).apply();
                b();
            }
            this.a.a();
        }
    }
}
