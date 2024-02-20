package kotlinx.coroutines;
public final class InactiveNodeList implements Incomplete {
    private final NodeList list;

    @Override
    public boolean isActive() {
        return false;
    }

    public InactiveNodeList(NodeList nodeList) {
        this.list = nodeList;
    }

    @Override
    public NodeList getList() {
        return this.list;
    }

    public String toString() {
        return DebugKt.getDEBUG() ? getList().getString("New") : super.toString();
    }
}
