package ib;

import p6.m;
public final class a extends Exception {
    public final int f14716a;

    public a(String str, int i3) {
        super(str);
        m.f(str, "Provided message must not be empty.");
        this.f14716a = i3;
    }

    public a(String str, Throwable th2) {
        super(str, th2);
        m.f(str, "Provided message must not be empty.");
        this.f14716a = 13;
    }
}
