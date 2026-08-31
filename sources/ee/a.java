package ee;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface;
public final class a implements InvocationHandler {
    public final FeatureFlagHolderBoundaryInterface f5029a;

    public a(FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface) {
        this.f5029a = featureFlagHolderBoundaryInterface;
    }

    @Override
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        FeatureFlagHolderBoundaryInterface featureFlagHolderBoundaryInterface = this.f5029a;
        try {
            return Class.forName(method.getDeclaringClass().getName(), true, featureFlagHolderBoundaryInterface.getClass().getClassLoader()).getDeclaredMethod(method.getName(), method.getParameterTypes()).invoke(featureFlagHolderBoundaryInterface, objArr);
        } catch (InvocationTargetException e6) {
            throw e6.getTargetException();
        } catch (ReflectiveOperationException e10) {
            throw new RuntimeException("Reflection failed for method " + method, e10);
        }
    }
}
