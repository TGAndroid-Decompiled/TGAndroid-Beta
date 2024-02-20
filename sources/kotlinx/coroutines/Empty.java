package kotlinx.coroutines;
public final class Empty implements Incomplete {
    private final boolean isActive;

    @Override
    public NodeList getList() {
        return null;
    }

    public Empty(boolean z) {
        this.isActive = z;
    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
