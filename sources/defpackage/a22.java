package defpackage;

import android.content.Context;
import android.text.Editable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class a22 extends FrameLayout {
    public final ylb a;
    public final i22 b;
    public r59 c;
    public r59 d;
    public int e;
    public boolean f;
    public boolean h;

    public a22(i22 i22Var, ylb ylbVar, Context context) {
        super(context);
        this.a = ylbVar;
        this.b = i22Var;
    }

    public abstract void B(int i, int i2);

    public boolean G(int i) {
        return false;
    }

    public boolean K(boolean z, int i, int i2, long j, boolean z2) {
        return false;
    }

    public boolean M() {
        return !(this instanceof n52);
    }

    public boolean N() {
        return true;
    }

    public boolean b() {
        return true;
    }

    public boolean c() {
        return true;
    }

    public boolean e() {
        return this instanceof c52;
    }

    public boolean f() {
        return this instanceof c52;
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
        return gm.L(f);
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

    public ArrayList<cnb> getThemeDescriptions() {
        return null;
    }

    public boolean h() {
        return this instanceof c52;
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

    public boolean q() {
        return false;
    }

    public boolean s() {
        return true;
    }

    public void setBlur3Capture(r59 r59Var) {
        int i = i22.G4;
        this.b.X0.b(r59Var);
        this.c = r59Var;
    }

    public void A() {
    }

    public void C() {
    }

    public void E(int i) {
    }

    public void H(a22 a22Var) {
    }

    public void I() {
    }

    public void J() {
    }

    public void a(Editable editable) {
    }

    public void d() {
    }

    public void l() {
    }

    public void m(float f) {
    }

    public void p() {
    }

    public void r(int i) {
    }

    public void t() {
    }

    public void u() {
    }

    public void v(float f) {
    }

    public void w(int i) {
    }

    public void x() {
    }

    public void y() {
    }

    public void F(float f, float f2) {
    }

    public void z(int i, boolean z) {
    }
}
