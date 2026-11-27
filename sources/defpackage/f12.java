package defpackage;

import android.content.Context;
import android.text.Editable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import java.util.ArrayList;
public abstract class f12 extends FrameLayout {
    public final vnb a;
    public final n12 b;
    public d79 c;
    public d79 d;
    public int e;
    public boolean f;
    public boolean h;

    public f12(n12 n12Var, vnb vnbVar, Context context) {
        super(context);
        this.a = vnbVar;
        this.b = n12Var;
    }

    public abstract void C(int i, int i2);

    public boolean G(int i) {
        return false;
    }

    public boolean K(boolean z, int i, int i2, long j, boolean z2) {
        return false;
    }

    public boolean M() {
        return !(this instanceof s42);
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
        return this instanceof h42;
    }

    public boolean f() {
        return this instanceof h42;
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
        return hl.L(f);
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

    public ArrayList<apb> getThemeDescriptions() {
        return null;
    }

    public boolean h() {
        return this instanceof h42;
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

    public void setBlur3Capture(d79 d79Var) {
        int i = n12.G4;
        this.b.X0.b(d79Var);
        this.c = d79Var;
    }

    public void B() {
    }

    public void D() {
    }

    public void I() {
    }

    public void J() {
    }

    public void d() {
    }

    public void l() {
    }

    public void p() {
    }

    public void u() {
    }

    public void v() {
    }

    public void y() {
    }

    public void z() {
    }

    public void E(int i) {
    }

    public void H(f12 f12Var) {
    }

    public void a(Editable editable) {
    }

    public void m(float f) {
    }

    public void r(int i) {
    }

    public void w(float f) {
    }

    public void x(int i) {
    }

    public void A(int i, boolean z) {
    }

    public void F(float f, float f2) {
    }
}
