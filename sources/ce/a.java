package ce;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;
public final class a implements InvocationHandler {
    public final FeatureFlagHolderBoundaryInterface f3037a;

    public a(FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface) {
        this.f3037a = featureFlagHolderBoundaryInterface;
    }

    @Override
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface = this.f3037a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, featureFlagHolderBoundaryInterface.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(featureFlagHolderBoundaryInterface, objArr);
        } catch (InvocationTargetException e10) {
            throw e10.getTargetException();
        } catch (ReflectiveOperationException e11) {
            throw new RuntimeException("Reflection failed for method " + method, e11);
        }
    }
}
