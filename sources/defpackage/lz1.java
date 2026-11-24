package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class lz1 implements pb8 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final jo6 d;
    public final nz1 e;

    public lz1(nz1 nz1Var, Object obj, Object obj2, jo6 jo6Var) {
        this.e = nz1Var;
        this.b = obj;
        this.c = obj2;
        this.d = jo6Var;
    }

    @Override
    public final CharSequence C(int i) {
        return null;
    }

    @Override
    public final int E(int i, rcc rccVar) {
        return 0;
    }

    @Override
    public final void F(boolean z) {
        this.a = z;
    }

    @Override
    public final int H() {
        return 0;
    }

    @Override
    public final boolean I() {
        return true;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean L() {
        return false;
    }

    @Override
    public final void M(int i, rcc rccVar, boolean z, int i2, int i3, boolean z2) {
        this.e.B(null, this.b, null, this.c, z, i2, i3, this.d, this.a);
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        return null;
    }

    @Override
    public final boolean O() {
        return true;
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final boolean R() {
        return false;
    }

    @Override
    public final int S(Object obj) {
        return 0;
    }

    @Override
    public final int T(int i) {
        return 0;
    }

    @Override
    public final boolean U() {
        return false;
    }

    @Override
    public final boolean V() {
        return true;
    }

    @Override
    public final k47 W() {
        return null;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean a0() {
        return false;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final String c0() {
        return "";
    }

    @Override
    public final ArrayList d() {
        return null;
    }

    @Override
    public final CharSequence d0(int i) {
        return null;
    }

    @Override
    public final void e() {
        jc1 jc1Var;
        tc1 d0 = PhotoViewer.r0().d0();
        if (d0 != null && (jc1Var = d0.f) != null) {
            wu3 wu3Var = jc1Var.a;
            wu3Var.requestFocus();
            gm.E3(wu3Var);
        }
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final jn5 k(int i) {
        return null;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final boolean o() {
        return false;
    }

    @Override
    public final boolean p() {
        return false;
    }

    @Override
    public final boolean q() {
        return false;
    }

    @Override
    public final boolean s() {
        return true;
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final HashMap u() {
        return null;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final boolean w(int i) {
        return false;
    }

    @Override
    public final int x() {
        return 0;
    }

    @Override
    public final boolean y() {
        return true;
    }

    @Override
    public final boolean z() {
        return this.a;
    }

    @Override
    public final void A() {
    }

    @Override
    public final void B(int i) {
    }

    @Override
    public final void D() {
    }

    @Override
    public final void G() {
    }

    @Override
    public final void J() {
    }

    @Override
    public final void X() {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Z(int i) {
    }

    @Override
    public final void b0(int i) {
    }

    @Override
    public final void c(rcc rccVar) {
    }

    @Override
    public final void f(CharSequence charSequence) {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void m() {
    }

    @Override
    public final void n() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void g(String str, String str2, boolean z) {
    }
}
