package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qh6 extends zde {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final SparseIntArray h = new SparseIntArray();
    public final SparseIntArray i = new SparseIntArray();
    public final ArrayList j = new ArrayList();
    public final ArrayList k = new ArrayList();
    public final yh6 l;

    public qh6(yh6 yh6Var) {
        this.l = yh6Var;
    }

    public static void f(int i, int i2, SparseIntArray sparseIntArray) {
        if (i2 >= 0) {
            sparseIntArray.put(i2, i);
        }
    }

    @Override
    public final boolean a(int i, int i2) {
        return b(i, i2);
    }

    @Override
    public final boolean b(int i, int i2) {
        int i3;
        int i4;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2;
        int i5 = this.b;
        yh6 yh6Var = this.l;
        if (((i >= i5 && i < this.c) || (i >= this.d && i < this.e)) && ((i2 >= (i4 = yh6Var.E) && i2 < yh6Var.F) || (i2 >= yh6Var.I && i2 < yh6Var.J))) {
            if (i2 >= i4 && i2 < yh6Var.F) {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) yh6Var.j0.get(i2 - i4);
            } else {
                tL_chatInviteExported = (TLRPC.TL_chatInviteExported) yh6Var.k0.get(i2 - yh6Var.I);
            }
            int i6 = this.b;
            if (i >= i6 && i < this.c) {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.j.get(i - i6);
            } else {
                tL_chatInviteExported2 = (TLRPC.TL_chatInviteExported) this.k.get(i - this.d);
            }
            return tL_chatInviteExported2.link.equals(tL_chatInviteExported.link);
        }
        int i7 = this.f;
        if (i >= i7 && i < this.g && i2 >= (i3 = yh6Var.V) && i2 < yh6Var.W) {
            if (i - i7 == i2 - i3) {
                return true;
            }
            return false;
        }
        int i8 = this.h.get(i, -1);
        int i9 = this.i.get(i2, -1);
        if (i8 >= 0 && i8 == i9) {
            return true;
        }
        return false;
    }

    @Override
    public final int c() {
        return this.l.Y;
    }

    @Override
    public final int d() {
        return this.a;
    }

    public final void e(SparseIntArray sparseIntArray) {
        sparseIntArray.clear();
        yh6 yh6Var = this.l;
        f(1, yh6Var.r, sparseIntArray);
        f(2, yh6Var.s, sparseIntArray);
        f(3, yh6Var.w, sparseIntArray);
        f(4, yh6Var.x, sparseIntArray);
        f(5, yh6Var.y, sparseIntArray);
        f(6, yh6Var.M, sparseIntArray);
        f(7, yh6Var.O, sparseIntArray);
        f(8, yh6Var.P, sparseIntArray);
        f(9, yh6Var.R, sparseIntArray);
        f(10, yh6Var.S, sparseIntArray);
        f(11, yh6Var.T, sparseIntArray);
        f(12, yh6Var.Q, sparseIntArray);
        f(13, yh6Var.G, sparseIntArray);
    }
}
