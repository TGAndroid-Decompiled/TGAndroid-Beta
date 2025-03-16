package kotlinx.coroutines.flow;

public interface MutableStateFlow extends Flow, FlowCollector {
    Object getValue();

    void setValue(Object obj);
}
