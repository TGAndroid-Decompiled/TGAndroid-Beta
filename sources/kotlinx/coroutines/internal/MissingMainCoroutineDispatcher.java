package kotlinx.coroutines.internal;

import kotlinx.coroutines.Delay;
import kotlinx.coroutines.MainCoroutineDispatcher;

abstract class MissingMainCoroutineDispatcher extends MainCoroutineDispatcher implements Delay {
}
