package o8;

import h7.wa;
public abstract class k {
    public transient c f19053a;
    public transient h7.m f19054b;
    public transient wa f19055c;

    public abstract wa a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k) {
            return ((h0) this).a().equals(((h0) ((k) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().f10166b.hashCode();
    }

    public final String toString() {
        return a().f10166b.toString();
    }
}
