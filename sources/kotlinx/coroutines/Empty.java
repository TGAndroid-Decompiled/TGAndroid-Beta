package kotlinx.coroutines;

public final class Empty implements Incomplete {
    public final boolean isActive;

    public Empty(boolean z) {
        this.isActive = z;
    }

    @Override
    public final NodeList getList() {
        return null;
    }

    @Override
    public final boolean isActive() {
        return this.isActive;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.isActive ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
