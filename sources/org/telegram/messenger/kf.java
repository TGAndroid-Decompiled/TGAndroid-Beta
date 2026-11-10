package org.telegram.messenger;

import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class kf extends ze {
    public String B;
    public String C;
    public String D;
    public int E;
    public int F;
    public int G;
    public int H;
    public CharSequence I;
    public TLRPC.Document J;
    public TLRPC.Photo K;
    public TLRPC.PhotoSize L;
    public TLRPC.PhotoSize M;
    public TLRPC.BotInlineResult N;
    public HashMap O;

    @Override
    public final String a() {
        if (this.L != null) {
            w7.G(p10.f24474s0);
            return w7.J(this.L, null, true, true).getAbsolutePath();
        } else if (this.J != null) {
            w7.G(p10.f24474s0);
            return w7.J(this.J, null, true, true).getAbsolutePath();
        } else {
            return gc.A(this.C).getAbsolutePath();
        }
    }

    public final kf clone() {
        ?? obj = new Object();
        obj.B = this.B;
        obj.C = this.C;
        obj.D = this.D;
        obj.E = this.E;
        obj.F = this.F;
        obj.G = this.G;
        obj.H = this.H;
        obj.I = this.I;
        obj.J = this.J;
        obj.K = this.K;
        obj.L = this.L;
        obj.M = this.M;
        obj.N = this.N;
        obj.O = this.O;
        return obj;
    }

    public final String g() {
        if (this.L != null) {
            w7.G(p10.f24474s0);
            return w7.J(this.L, null, true, true).getAbsolutePath();
        } else if (this.J != null) {
            w7.G(p10.f24474s0);
            return w7.J(this.J, null, true, true).getAbsolutePath();
        } else {
            return this.C;
        }
    }
}
