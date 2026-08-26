package io.noties.markwon;

public interface MarkwonPlugin {

    public interface Action {
        void apply();
    }

    public interface Registry {
        MarkwonPlugin require(Class cls);
    }
}
