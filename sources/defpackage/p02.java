package defpackage;

import android.content.Context;
import android.text.Editable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class p02 extends FrameLayout {
    public final wjb a;
    public final x02 b;
    public o39 c;
    public o39 d;
    public int e;
    public boolean f;
    public boolean h;

    public p02(x02 x02Var, wjb wjbVar, Context context) {
        super(context);
        this.a = wjbVar;
        this.b = x02Var;
    }

    public abstract void C(int i, int i2);

    public boolean H(int i) {
        return false;
    }

    public boolean M(boolean z, int i, int i2, long j, boolean z2) {
        return false;
    }

    public boolean N() {
        return !(this instanceof c42);
    }

    public boolean O() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean e() {
        return this instanceof r32;
    }

    public boolean f() {
        return this instanceof r32;
    }

    public boolean g() {
        return false;
    }

    public int getButtonsHideOffset() {
        float f;
        if (j() != 0) {
            f = 12.0f;
        } else {
            f = 17.0f;
        }
        return gl.L(f);
    }

    public int getCurrentItemTop() {
        return 0;
    }

    public int getCustomActionBarBackground() {
        return 0;
    }

    public int getCustomBackground() {
        return 0;
    }

    public int getFirstOffset() {
        return 0;
    }

    public int getListTopPadding() {
        return 0;
    }

    public int getSelectedItemsCount() {
        return 0;
    }

    public ArrayList<blb> getThemeDescriptions() {
        return null;
    }

    public boolean h() {
        return this instanceof r32;
    }

    public boolean i() {
        return false;
    }

    public int j() {
        return 0;
    }

    public boolean k() {
        return false;
    }

    public void n(float f, float f2) {
        m(f);
    }

    public boolean o(MotionEvent motionEvent) {
        return false;
    }

    public boolean r() {
        return false;
    }

    public void setBlur3Capture(o39 o39Var) {
        int i = x02.G4;
        this.b.X0.b(o39Var);
        this.c = o39Var;
    }

    public boolean t() {
        return true;
    }

    public void B() {
    }

    public void E() {
    }

    public void J() {
    }

    public void K() {
    }

    public void d() {
    }

    public void l() {
    }

    public void q() {
    }

    public void u() {
    }

    public void v() {
    }

    public void y() {
    }

    public void z() {
    }

    public void F(int i) {
    }

    public void I(p02 p02Var) {
    }

    public void a(Editable editable) {
    }

    public void m(float f) {
    }

    public void s(int i) {
    }

    public void w(float f) {
    }

    public void x(int i) {
    }

    public void A(int i, boolean z) {
    }

    public void G(float f, float f2) {
    }
}
