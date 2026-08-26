package kotlin.collections;

import androidx.credentials.exceptions.CreateCredentialException;
import androidx.credentials.exceptions.GetCredentialException;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$$ExternalSyntheticLambda6;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda9;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$$ExternalSyntheticLambda5;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AbstractCollection$$ExternalSyntheticLambda0 implements Function1 {
    public final int $r8$classId;
    public final Object f$0;

    public AbstractCollection$$ExternalSyntheticLambda0(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return obj == ((AbstractList) this.f$0) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                GetCredentialException e = (GetCredentialException) obj;
                Intrinsics.checkNotNullParameter(e, "e");
                CredentialProviderBeginSignInController credentialProviderBeginSignInController = (CredentialProviderBeginSignInController) this.f$0;
                credentialProviderBeginSignInController.getExecutor().execute(new CredentialProviderBeginSignInController$$ExternalSyntheticLambda6(credentialProviderBeginSignInController, e, 2));
                return Unit.INSTANCE;
            case 2:
                CreateCredentialException e2 = (CreateCredentialException) obj;
                Intrinsics.checkNotNullParameter(e2, "e");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = (CredentialProviderCreatePublicKeyCredentialController) this.f$0;
                Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
                if (executor != null) {
                    executor.execute(new CredentialProviderCreatePublicKeyCredentialController$$ExternalSyntheticLambda9(credentialProviderCreatePublicKeyCredentialController, e2, 1));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                throw null;
            default:
                CreateCredentialException e3 = (CreateCredentialException) obj;
                Intrinsics.checkNotNullParameter(e3, "e");
                CreatePublicKeyCredentialController createPublicKeyCredentialController = (CreatePublicKeyCredentialController) this.f$0;
                Executor executor2 = createPublicKeyCredentialController.executor;
                if (executor2 != null) {
                    executor2.execute(new CreatePublicKeyCredentialController$$ExternalSyntheticLambda5(createPublicKeyCredentialController, e3, 0));
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("executor");
                throw null;
        }
    }
}
