package kotlinx.coroutines;

public final class InactiveNodeList implements Incomplete {
    public final NodeList list;

    public InactiveNodeList(NodeList nodeList) {
        this.list = nodeList;
    }

    @Override
    public final NodeList getList() {
        return this.list;
    }

    @Override
    public final boolean isActive() {
        return false;
    }
}
