package kotlin.coroutines;

import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import com.google.android.gms.internal.mlkit_language_id_common.zzgu;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class CombinedContext$$ExternalSyntheticLambda0 implements Function2 {
    public final int $r8$classId;

    public CombinedContext$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        CombinedContext combinedContext;
        Unit unit = Unit.INSTANCE;
        switch (this.$r8$classId) {
            case 0:
                String acc = (String) obj;
                CoroutineContext.Element element = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc, "acc");
                Intrinsics.checkNotNullParameter(element, "element");
                if (acc.length() == 0) {
                    return element.toString();
                }
                return acc + ", " + element;
            case 1:
                Function0 f = (Function0) obj2;
                Intrinsics.checkNotNullParameter(f, "f");
                int i = CredentialProviderController.$r8$clinit;
                zzgu.cancelOrCallbackExceptionOrResult$credentials_play_services_auth_release((CancellationSignal) obj, f);
                return unit;
            case 2:
                Function0 f2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(f2, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release((CancellationSignal) obj)) {
                    f2.invoke();
                }
                return unit;
            case 3:
                Function0 f3 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(f3, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release((CancellationSignal) obj)) {
                    f3.invoke();
                }
                return unit;
            case 4:
                Function0 f4 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(f4, "f");
                CredentialProviderPlayServicesImpl.Companion.getClass();
                if (!CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth_release((CancellationSignal) obj)) {
                    f4.invoke();
                }
                return unit;
            default:
                CoroutineContext acc2 = (CoroutineContext) obj;
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj2;
                Intrinsics.checkNotNullParameter(acc2, "acc");
                Intrinsics.checkNotNullParameter(element2, "element");
                CoroutineContext coroutineContextMinusKey = acc2.minusKey(element2.getKey());
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                if (coroutineContextMinusKey == emptyCoroutineContext) {
                    return element2;
                }
                ContinuationInterceptor.Key key = ContinuationInterceptor.Key.$$INSTANCE;
                ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) coroutineContextMinusKey.get(key);
                if (continuationInterceptor == null) {
                    combinedContext = new CombinedContext(element2, coroutineContextMinusKey);
                } else {
                    CoroutineContext coroutineContextMinusKey2 = coroutineContextMinusKey.minusKey(key);
                    if (coroutineContextMinusKey2 == emptyCoroutineContext) {
                        return new CombinedContext(continuationInterceptor, element2);
                    }
                    combinedContext = new CombinedContext(continuationInterceptor, new CombinedContext(element2, coroutineContextMinusKey2));
                }
                return combinedContext;
        }
    }
}
