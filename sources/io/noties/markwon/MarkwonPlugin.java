package io.noties.markwon;

public interface MarkwonPlugin {

    public interface Registry {
        MarkwonPlugin require(Class cls);
    }
}
