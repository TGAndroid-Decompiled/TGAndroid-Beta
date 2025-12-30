package kotlinx.coroutines.selects;

import kotlinx.coroutines.DisposableHandle;

public interface SelectInstance {
    void disposeOnCompletion(DisposableHandle disposableHandle);

    void selectInRegistrationPhase(Object obj);
}
